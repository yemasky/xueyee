package ota.jw.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.OTA.config.Config;
import com.OTA.model.Entity.Hotel;
import com.OTA.model.Entity.Locations;
import com.OTA.model.Entity.Room_layout_price_system_direct;
import com.OTA.model.Entity.Room_sell_layout;
import com.OTA.service.impl.HotelServiceImpl;
import com.OTA.service.impl.OtaServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import ota.jw.AutoMappingWS.ArrayOfPMSHotelInfo;
import ota.jw.AutoMappingWS.ArrayOfPMSHotelMappingResult;
import ota.jw.AutoMappingWS.ArrayOfPMSProductInfo;
import ota.jw.AutoMappingWS.GetPmsInfo;
import ota.jw.AutoMappingWS.GetPmsInfoSoap;
import ota.jw.AutoMappingWS.PMSHotelInfo;
import ota.jw.AutoMappingWS.PMSHotelMapingRS;
import ota.jw.AutoMappingWS.PMSHotelMappingResult;
import ota.jw.AutoMappingWS.PMSProductInfo;
import ota.jw.AutoMappingWS.PmsHotelInfoRQ;
import ota.jw.AutoMappingWebAPI.ArrayOfData;
import ota.jw.AutoMappingWebAPI.ArrayOfHotelInfo;
import ota.jw.AutoMappingWebAPI.ArrayOfProductSearchResult;
import ota.jw.AutoMappingWebAPI.ArrayOfSearchProductInfo;
import ota.jw.AutoMappingWebAPI.AutoMappingServices;
import ota.jw.AutoMappingWebAPI.AutoMappingServicesSoap;
import ota.jw.AutoMappingWebAPI.CtripSubHotelInfoByEBKRQ;
import ota.jw.AutoMappingWebAPI.CtripSubHotelInfoByEBKRS;
import ota.jw.AutoMappingWebAPI.CtripSubHotelInfoRS;
import ota.jw.AutoMappingWebAPI.Data;
import ota.jw.AutoMappingWebAPI.GetHotelInfoRQ;
import ota.jw.AutoMappingWebAPI.GetHotelInfoRS;
import ota.jw.AutoMappingWebAPI.HotelInfo;
import ota.jw.AutoMappingWebAPI.MappingStatusSearchRQ;
import ota.jw.AutoMappingWebAPI.MappingStatusSearchRS;
import ota.jw.AutoMappingWebAPI.ProductMappingInfoRS;
import ota.jw.AutoMappingWebAPI.ProductSearchResult;
import ota.jw.AutoMappingWebAPI.SearchProductInfo;
import ota.jw.AutoMappingWebAPI.SetMappingRQ;
import ota.jw.AutoMappingWebAPI.SetMappingRS;

public class JwAutoMappingImpl {
	protected static Logger logger = LoggerFactory.getLogger(JwAutoMappingImpl.class);
	protected static XmlMapper xml = new XmlMapper();
	protected static ObjectMapper mapper = new ObjectMapper();
	private static final QName SERVICE_NAME = new QName("http://www.opentravel.org/OTA/2003/05", "AutoMappingServices");

	/*
	 * 4.1. 创建酒店与产品 厂商推送酒店与产品信息给入住通，包含正价/促销产品上线，促销产品会 由入住通定时异步创建，厂商正常推送房价/房态/房量信息即可。
	 * 2.（注：促销产品异步创建频率：一天八次，每 3 小时创建一次。） 接口调用方：合作方 接口返回方：入住通 首次同步 system_id = 0
	 */
	public static Map<String, String> createHotel(int hotel_id, int system_id, int sell_id) throws Exception {
		HotelServiceImpl hotelImpl = new HotelServiceImpl();
		Hotel hotel = hotelImpl.getHotel(hotel_id);
		int version = hotel.getDirect_version();
		if (hotel != null) {
			// get Location
			int[] locations_id = new int[3];
			locations_id[0] = hotel.getHotel_province();
			locations_id[1] = hotel.getHotel_city();
			locations_id[2] = hotel.getHotel_town();
			List<Locations> Locations = hotelImpl.getLocation(locations_id);
			// get RoomSellLayout
			int[] hotel_ids = { hotel.getHotel_id() };
			List<Room_sell_layout> roomSellLayoutList = hotelImpl.getRoomSellLayout(hotel_ids);
			// roomSellLayoutHash
			HashMap<Integer, Room_sell_layout> roomSellLayoutHash = new HashMap<Integer, Room_sell_layout>();
			int sellListSize = roomSellLayoutList.size();
			for (int i = 0; i < sellListSize; i++) {
				// 判断是否直连 
				roomSellLayoutHash.put(roomSellLayoutList.get(i).getRoom_sell_layout_id(), roomSellLayoutList.get(i));
			}

			// 获取所有直连的价格体系
			List<Room_layout_price_system_direct> system_direct = null;
			if (sell_id > 0) {
				system_direct = hotelImpl.getRoomSystemDirect(hotel_id, system_id, sell_id);
			} else if (system_id > 0) {
				system_direct = hotelImpl.getRoomSystemDirect(hotel_id, system_id);
			} else {
				system_direct = hotelImpl.getRoomSystemDirect(hotel_id);
			}
			if (system_direct == null) {
				return null;
			}
			// 酒店数据
			PMSHotelInfo pmsHotel = new PMSHotelInfo();
			if(version == 1) {
				// 厂商酒店代码
				pmsHotel.setHotelCode(Config.hotelCodePrefix1 + hotel.getHotel_id());
				// 厂商路由组代码，由入住通提供固定值，1.0模式和2.0模式该值不同，需厂商区分
				pmsHotel.setHotelGroupCode(Config.hotelGroupCode1);
			} else {
				// 厂商酒店代码
				pmsHotel.setHotelCode(Config.hotelCodePrefix + hotel.getHotel_id());
				// 厂商路由组代码，由入住通提供固定值，1.0模式和2.0模式该值不同，需厂商区分
				pmsHotel.setHotelGroupCode(Config.hotelGroupCode);
			}
			// 厂商酒店酒店名称
			pmsHotel.setHotelName(hotel.getHotel_name());
			pmsHotel.setAddress(hotel.getHotel_address());
			pmsHotel.setEmail(hotel.getHotel_email());
			pmsHotel.setHotelCityName(Locations.get(2).getLocation_name());
			// pmsHotel.setIsNewHotel("1");
			pmsHotel.setProvinceCode(Locations.get(0).getLocation_name());
			pmsHotel.setTelephone(hotel.getHotel_phone());
			//
			ArrayOfPMSProductInfo pmsHotelAllProductList = new ArrayOfPMSProductInfo();
			List<PMSProductInfo> pmsHotelProductList = pmsHotelAllProductList.getPMSProductInfo();
			// 产品数据
			// hotel product
			Map<String, Room_layout_price_system_direct> excuteDirectSystem = new HashMap<>();
			int directSize = system_direct.size();
			for (int i = 0; i < directSize; i++) {
				Room_layout_price_system_direct direct = system_direct.get(i);
				if (direct.getIs_create().equals("1"))//已创建的产品跳过
					continue;
				int direct_sell_id = direct.getRoom_sell_layout_id();
				Room_sell_layout sellLayout = roomSellLayoutHash.get(direct_sell_id);
				int thisHotelId = sellLayout.getHotel_id();
				int thisSellId = sellLayout.getRoom_sell_layout_id();
				int thisLayoutId = sellLayout.getRoom_layout_id();
				// RoomTypeCode String Y 厂商房型代码
				String roomTypeCode = thisHotelId + "-" + thisLayoutId + "-" + thisSellId;
				//
				String ratePlanCode = direct.getRoom_layout_price_system_id() + "-" + thisSellId;
				// + "-"+ direct.getBook_type_id();
				String balanceType = direct.getOta_price_system_type().equals("spot_payment") ? "16" : "501";

				// channel = ota_code
				String ota_code = direct.getOta_code().toUpperCase();
				//构造产品
				PMSProductInfo pmsHotelProduct = new PMSProductInfo();
				//RoomTypeCode String Y 厂商房型代码 
				pmsHotelProduct.setRoomTypeCode(roomTypeCode);
				// 厂商房型名称
				pmsHotelProduct.setRoomTypeName(sellLayout.getRoom_sell_layout_name());
				// 厂商价格代码
				pmsHotelProduct.setRatePlanCode(ratePlanCode);
				// 厂商价格名称，例：携程标准价
				pmsHotelProduct.setRatePlanName(direct.getRoom_layout_price_system_name());
				// "501" 现预付类型： 501 预付、 16 -现付
				pmsHotelProduct.setBalanceType(balanceType);
				// "CTRIP" 渠道，例：携程：CTRIP,艺龙：ELONG,去哪儿：QUNAR，赫程：EASYTRIP，同程：LY
				pmsHotelProduct.setChannel(ota_code);
				// "0" 0-正价，1-活动（不传默认正价）
				pmsHotelProduct.setPoductType(direct.getPoduct_type());
				// "1" 提前预订天数
				pmsHotelProduct.setBookingAdvance(direct.getBooking_advance() + "");
				// "1"早餐数：PoductType=0时，此字段参数<0>无早餐；<1>单份早餐；<2>双份早餐；<3>三份早餐；<4>四份早餐；<5>五份早餐
				// PoductType=1 时，此字段参数<0>931910；<1>931775 ； <2>931779 ；
				// <3>931781 ；<4>931783 ； <5>931784 ； <6>931785 ；
				// <7>931788；<8>931791；<9>931792
				pmsHotelProduct.setNumberOfBreakfast(direct.getOta_breakfast() + "");
				excuteDirectSystem.put(ratePlanCode, direct);
				//
				pmsHotelProductList.add(pmsHotelProduct);

			}
			pmsHotel.setPmsHotelProductInfos(pmsHotelAllProductList);
			// add hotel
			ArrayOfPMSHotelInfo arrayOfPMSHotelInfo = new ArrayOfPMSHotelInfo();
			List<PMSHotelInfo> hotelList = arrayOfPMSHotelInfo.getPMSHotelInfo();
			hotelList.add(pmsHotel);

			GetPmsInfo getPmsInfo = new GetPmsInfo();
			GetPmsInfoSoap getPmsInfoSoap = getPmsInfo.getGetPmsInfoSoap();
			PmsHotelInfoRQ pmsHotelInfoRQ = new PmsHotelInfoRQ();
			//
			pmsHotelInfoRQ.setPMSBaseHotelInfos(arrayOfPMSHotelInfo);
			PMSHotelMapingRS pmsHotelMapingRS = getPmsInfoSoap.getAllPmsHotelInfo(pmsHotelInfoRQ);
			
			String requestString = xml.writeValueAsString(pmsHotelInfoRQ);
			logger.debug(requestString);

			ArrayOfPMSHotelMappingResult pmsAllHotelMappingResult = pmsHotelMapingRS.getPMSHotelMappingResults();

			String ota_result = "";
			ota_result = xml.writeValueAsString(pmsAllHotelMappingResult);
			logger.info(ota_result);
			//
			List<PMSHotelMappingResult> mappingResults = pmsAllHotelMappingResult.getPMSHotelMappingResult();
			if (mappingResults != null) {
				sellListSize = mappingResults.size();
				for (int i = 0; i < sellListSize; i++) {
					PMSHotelMappingResult mappingResult = mappingResults.get(i);
					if(mappingResult == null) continue;
					String ratePlanCodeRS = mappingResult.getRatePlanCode();
					if(ratePlanCodeRS == null) continue;
					String[] ratePlanCodeRSkey = ratePlanCodeRS.split("-");
					String unpdate_system_id = ratePlanCodeRSkey[0];
					String unpdate_sell_id = ratePlanCodeRSkey[1];
					boolean success = mappingResult.isIsSuccess();
					if (success) {
						hotelImpl.updateSystemDirectCreate(hotel_id, Integer.parseInt(unpdate_system_id), 
								Integer.parseInt(unpdate_sell_id));
					} else {
						String errorCode = mappingResult.getErrorCode();
						//Room_layout_price_system_direct directRS = excuteDirectSystem.get(ratePlanCodeRS);
						if(errorCode.equals("101")) {//产品已存在
							hotelImpl.updateSystemDirectCreate(hotel_id, Integer.parseInt(unpdate_system_id), 
									Integer.parseInt(unpdate_sell_id));
						}
					}

				}
			}
			// 保存返回结果
			OtaServiceImpl.instent().saveDirectLog(hotel_id, "createHotelSell", "创建酒店产品", requestString, ota_result);
		}

		return null;
	}

	//
	/*
	 * 4.2. 通过 EBK 账号获取携程子酒店信息(单体) 根据携程 EBK 账号，获取酒店信息（酒店名称、携程子酒店 ID、支付类型：现预付、城 市、地址）
	 */
	public static Map<String, String> GetCtripSubHotelInfoByEBK(int hotel_id, String name, String password) {
		URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
		AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
		AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();

		CtripSubHotelInfoByEBKRQ ctripSubHotelInfoByEBKRQ = new CtripSubHotelInfoByEBKRQ();
		ctripSubHotelInfoByEBKRQ.setName(name);// "2205020"
		ctripSubHotelInfoByEBKRQ.setPassword(password);// "123qaz"

		CtripSubHotelInfoByEBKRS ctripSubHotelInfoByEBKRS = servicesSoap.getCtripSubHotelInfoByEBK(ctripSubHotelInfoByEBKRQ);
		ArrayOfHotelInfo allHotelInfo = ctripSubHotelInfoByEBKRS.getHotelInfos();
		List<HotelInfo> hotelInfos = allHotelInfo.getHotelInfo();
		String otaSubHotel = "";
		String otaHotelId = "";
		for (int i = 0; i < hotelInfos.size(); i++) {
			HotelInfo hotel = hotelInfos.get(i);
			otaHotelId = hotel.getMasterHotelId();
			String belongto = hotel.getHotelBelongto();
			String subhotelId = hotel.getSubHotelId();
			if(otaSubHotel.equals("")) {
				otaSubHotel += "\""+belongto+"\":\"" + subhotelId +"\"";
			} else {
				otaSubHotel += ",\""+belongto+"\":\"" + subhotelId +"\"";
			}
		}
		otaSubHotel = "{"+otaSubHotel+"}";
		HotelServiceImpl hotelServiceImpl = new HotelServiceImpl();
		try {
			hotelServiceImpl.updateHotel(hotel_id, otaHotelId, otaSubHotel);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			logger.debug(xml.writeValueAsString(ctripSubHotelInfoByEBKRQ));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	// 4.3. 通过母酒店 通过母酒店 ID 获取携程子酒店信息 获取携程子酒店信息 (单体 )
	/*
	 * 根据携程母酒店 ID，获取酒店信息（酒店名称、携程子酒店 ID、支付类型：现预付、城 市、地址）。 接口调用方：合作方 接口返回方：入住通
	 */
	public static CtripSubHotelInfoRS GetCtripSubHotelInfo(String masterHotelId) {
		URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
		AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
		AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();
		// masterHotelId 携程母酒店 ID，可支持多个，请用”,”分割 // "2205020"
		CtripSubHotelInfoRS ctripSubHotelInfoRS = servicesSoap.getCtripSubHotelInfo(masterHotelId);// masterHotelId
		return ctripSubHotelInfoRS;
	}

	// 4.4. 通过 Brand/SupplierId 值获取携程子酒店信息(集团/代理商) /***異常***/ 【对方说可以不做,因为没有集团】
	public static void GetHotelInfo() {
		XmlMapper xml = new XmlMapper();
		ObjectMapper mapper = new ObjectMapper();
		URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
		AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
		AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();

		GetHotelInfoRQ getHotelInfoRQ = new GetHotelInfoRQ();
		getHotelInfoRQ.setHotelGroupCode("XiaoYingKeJiTwoZero");// 酒店组代码
		getHotelInfoRQ.setCurrentPage(1);// 当前页，默认为 1
		getHotelInfoRQ.setBrand("");// 集团 id，Brand, SupplierId 二选一
		getHotelInfoRQ.setSupplierId("");// 代理商 id，Brand, SupplierId 二选一
		GetHotelInfoRS hotelInfoRS = servicesSoap.getHotelInfo(getHotelInfoRQ);
		try {
			System.out.println(xml.writeValueAsString(getHotelInfoRQ));
			System.out.println(xml.writeValueAsString(hotelInfoRS));
			System.out.println(mapper.writeValueAsString(hotelInfoRS));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 4.5. 获取携程产品信息
	/*
	 * 根据携程子酒店 ID，获取产品信息（携程子房型 ID、携程产品名称、早餐数、支付类型： 现预付） 接口调用方：合作方 接口返回方：入住通
	 */
	public static ProductMappingInfoRS GetRoomProductInfoRS(String subHotelId, String type) {
		URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
		AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
		AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();
		// String subHotelId = "2205020";// 携程子 酒店 ID 。 不 超 过
		// 5个(001,002,003,004,005),英文逗号分隔
		// String type = "Unmapping";// 请求类型。Mapping-匹配， Unmapping-未匹配
		ProductMappingInfoRS productMappingInfoRS = servicesSoap.getRoomProductInfo(subHotelId, type);
		return productMappingInfoRS;
	}

	// 4.6. 设置 Mapping 关系
	/*
	 * 设置与携程的 mapping.不支持直接修改产品匹配关系；若想修改匹配，请先删除再新增 的方式。 接口调用方：合作方 接口返回方：入住通
	 */
	public static Map<String, String> mappingHotelProduct(int hotel_id, int system_id, int sell_id) throws Exception {
		HotelServiceImpl hotelImpl = new HotelServiceImpl();
		Hotel hotel = hotelImpl.getHotel(hotel_id);
		List<SetMappingRS> mappingRSList = new ArrayList<SetMappingRS>();

		if (hotel != null) {
			URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
			AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
			AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();

			// String hotelCode, String roomTypeCode, String ratePlanCode,
			// String masterHotelId, String subHotelId, String subRoomId, int type get
			// RoomSellLayout
			int[] hotel_ids = { hotel.getHotel_id() };
			List<Room_sell_layout> roomSellLayoutList = hotelImpl.getRoomSellLayout(hotel_ids);
			// roomSellLayoutHash
			HashMap<Integer, Room_sell_layout> roomSellLayoutHash = new HashMap<Integer, Room_sell_layout>();
			int sellListSize = roomSellLayoutList.size();
			for (int i = 0; i < sellListSize; i++) {
				roomSellLayoutHash.put(roomSellLayoutList.get(i).getRoom_sell_layout_id(), roomSellLayoutList.get(i));
			}
			// 酒店数据
			String masterHotelId = hotel.getOta_ctrip_hotel_id();// 65678
			String subHotel = hotel.getOta_ctrip_sub_hotel_id();// 2205020
			JsonNode subHoteJson = mapper.readTree(subHotel);
			//16  spot payment 现付,  501 advance_price 预付
			String subHotel501 = subHoteJson.get("501").asText();
			String subHotel16 = subHoteJson.get("16").asText();
			logger.info("subHotel16:" + subHotel16 +" ; subHotel501:" + subHotel501);
			//
			// 获取所有直连的价格体系
			List<Room_layout_price_system_direct> system_direct = null;
			if (sell_id > 0) {
				system_direct = hotelImpl.getRoomSystemDirect(hotel_id, system_id, sell_id);
			} else if (system_id > 0) {
				system_direct = hotelImpl.getRoomSystemDirect(hotel_id, system_id);
			} else {
				system_direct = hotelImpl.getRoomSystemDirect(hotel_id);
			}
			if (system_direct == null) {
				return null;
			}
			
			int directSize = system_direct.size();
			logger.info("取得mapping 价格体系数量：" + directSize);
			for (int i = 0; i < directSize; i++) {
				Room_layout_price_system_direct direct = system_direct.get(i);
				// 	取得操作代码
				String excute_code = direct.getExcute_code();
				if(excute_code.equals("0")) continue;//无操作
				
				//16  spot payment 现付,  501 advance_price 预付
				//找出预付现付
				String balanceType = direct.getOta_price_system_type().equals("spot_payment") ? "16" : "501";
				String subHotelId = balanceType.equals("16") ? subHotel16 : subHotel501;
				logger.info("subHotelId:"+subHotelId);
				int direct_sell_id = direct.getRoom_sell_layout_id();
				
				Room_sell_layout sellLayout = roomSellLayoutHash.get(direct_sell_id);
				int thisHotelId = sellLayout.getHotel_id();
				int thisSellId = sellLayout.getRoom_sell_layout_id();
				int thisLayoutId = sellLayout.getRoom_layout_id();
				// 酒店数据厂商房型代码
				String roomTypeCode = thisHotelId + "-" + thisLayoutId + "-" + thisSellId;//
				// 厂商价格代码"-" + price_system.getBook_type_id() +
				String ratePlanCode = direct.getRoom_layout_price_system_id() + "-" + thisSellId;
				// "180283";// roomTypeCode 一一对应
				//String subRoom = sellLayout.getOta_ctrip_layout_id();
				//if (subRoom.equals("")) continue;
				//JsonNode subRoomJson = mapper.readTree(subRoom);
				//501-预付、16-现付 
				//String[] otaSubRoom = {"501", "16"};
				//List<String> subRoom501 = subRoomJson.findValuesAsText("501");
				//List<String> subRoom16 = subRoomJson.findValuesAsText("16");
				//int subRoom501Size = subRoom501.size();
				// 设置类型：1-新增,0-删除
				//int valid = Integer.parseInt(sellLayout.getRoom_sell_layout_valid());// 1;
				int active_type = excute_code.equals("-99") ? 0 : 1;//-99 表示删除绑定
				String subRoomId = direct.getOta_ctrip_layout_id();
					
				SetMappingRS mappingRS = SetMappingInfo(hotel_id, roomTypeCode, ratePlanCode, masterHotelId, subHotelId, subRoomId,
							active_type, servicesSoap);
					// 返回代码。0 表示返回成功，其余均返回失败。
				int retCode = mappingRS.getRetCode();
				if (retCode == 0) {
					// 更新数据库匹配中 已递交审核
					int mapping_status = excute_code.equals("-99") ? -99 : 1;//-99删除
					hotelImpl.updateSystemDirectMapping(hotel_id, system_id, direct_sell_id, mapping_status);
				} else {
					logger.error(mappingRS.getMsg());
				}
				mappingRSList.add(mappingRS);
			}
		}

		return null;
	}

	private static SetMappingRS SetMappingInfo(int hotel_id, String roomTypeCode, String ratePlanCode, String masterHotelId,
			String subHotelId, String subRoomId, int active_type, AutoMappingServicesSoap servicesSoap) throws Exception {
		String hotelCode = Config.hotelCodePrefix + hotel_id;
		SetMappingRQ setMappingRQ = new SetMappingRQ();
		setMappingRQ.setHotelCode(hotelCode);// 厂商酒店代码 "XY-PMS_12122"
		setMappingRQ.setRoomTypeCode(roomTypeCode);// 厂商房型代码 "111"
		setMappingRQ.setRatePlanCode(ratePlanCode);// 厂商价格代码"12"
		// 厂商路由组代码
		setMappingRQ.setMasterHotelId(masterHotelId);// 携程母酒店 ID"65678"
		setMappingRQ.setSubHotelId(subHotelId);// 携程子酒店代码"2205020"
		setMappingRQ.setSubRoomId(subRoomId);// 携程子房型代码"78118431"
		// 设置类型：1-新增,0-删除
		setMappingRQ.setSetType(active_type);// 1
		String requestString = xml.writeValueAsString(setMappingRQ);
		logger.debug(requestString);
		SetMappingRS mappingRS = servicesSoap.setMappingInfo(setMappingRQ);
		// 返回代码。0 表示返回成功，其余均返回失败
		String ota_result = xml.writeValueAsString(mappingRS);
		logger.debug(ota_result);
		OtaServiceImpl.instent().saveDirectLog(hotel_id, "SetMappingInfo", "设置 Mapping 关系", requestString, ota_result);
		return mappingRS;
	}

	// 4.7. 通知厂商绑定结果 PMSNotifyOnOffline //webService實現
	/*
	 * 酒店操作了产品绑定后，入住通会通过此接口通知厂商绑定的结果，入住通只通知成功 的结果，不会通知失败的。厂商收到通知后把 ARI 数据推送给入住通。
	 * 接口调用方：入住通 接口返回方：合作方 public static void NotifyOnOffInfo() {}
	 */

	// 4.8 产品审核结果查询
	/*
	 * 根据厂商酒店代码，获取酒店审核状态（待审核、入住通审核通过、审核成功、入住通 审核拒绝、携程审核拒绝）或查询已匹配的产品结果。 接口调用方：合作方
	 * 接口返回方：入住通
	 */
	public static MappingStatusSearchRS mappingStatusSearch(int hotel_id, int system_id, int sell_id) throws Exception {
		URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
		AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
		AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();

		HotelServiceImpl hotelImpl = new HotelServiceImpl();
		Hotel hotel = hotelImpl.getHotel(hotel_id);

		String hotelCode = Config.hotelCodePrefix + hotel.getHotel_id();
		//
		MappingStatusSearchRQ searchRQ16 = new MappingStatusSearchRQ();
		searchRQ16.setHotelCode(hotelCode);// 厂商酒店代码，支持多个，英文逗号分隔”,”"XY-PMS_12122"
		MappingStatusSearchRQ searchRQ501 = new MappingStatusSearchRQ();
		searchRQ501.setHotelCode(hotelCode);// 厂商酒店代码，支持多个，英文逗号分隔”,”"XY-PMS_12122"
		//
		String subHotel = hotel.getOta_ctrip_sub_hotel_id();
		JsonNode subHoteJson = mapper.readTree(subHotel);
		String subHotel501 = subHoteJson.get("501").asText();
		String subHotel16 = subHoteJson.get("16").asText();;
		searchRQ16.setSubHotelId(subHotel16);// 携程子酒店 ID，支持多个，英文逗号分隔”,”"2205020"
		searchRQ501.setSubHotelId(subHotel501);
		// get RoomSellLayout
		int[] hotel_ids = { hotel.getHotel_id() };
		List<Room_sell_layout> roomSellLayoutList = hotelImpl.getRoomSellLayout(hotel_ids);
		// roomSellLayoutHash
		HashMap<Integer, Room_sell_layout> roomSellLayoutHash = new HashMap<Integer, Room_sell_layout>();
		int sellListSize = roomSellLayoutList.size();
		for (int i = 0; i < sellListSize; i++) {
			// 判断是否直连 
			roomSellLayoutHash.put(roomSellLayoutList.get(i).getRoom_sell_layout_id(), roomSellLayoutList.get(i));
		}
		// 获取所有直连的价格体系
		List<Room_layout_price_system_direct> system_direct = null;
		if (sell_id > 0) {
			system_direct = hotelImpl.getRoomSystemDirect(hotel_id, system_id, sell_id);
		} else if (system_id > 0) {
			system_direct = hotelImpl.getRoomSystemDirect(hotel_id, system_id);
		} else {
			system_direct = hotelImpl.getRoomSystemDirect(hotel_id);
		}
		if (system_direct == null) {
			return null;
		}
		ArrayOfSearchProductInfo arrayOfSearchProductInfo16 = new ArrayOfSearchProductInfo();// 厂商产品信息，
		ArrayOfSearchProductInfo arrayOfSearchProductInfo501 = new ArrayOfSearchProductInfo();// 厂商产品信息，
		List<SearchProductInfo> searchProductInfo16 = arrayOfSearchProductInfo16.getSearchProductInfo();
		List<SearchProductInfo> searchProductInfo501 = arrayOfSearchProductInfo501.getSearchProductInfo();
		int directSize = system_direct.size();
		boolean have16 = false;
		boolean have501 = false;
		for (int i = 0; i < directSize; i++) {
			Room_layout_price_system_direct direct = system_direct.get(i);
			int direct_sell_id = direct.getRoom_sell_layout_id();
			int direct_system_id = direct.getRoom_layout_price_system_id();
			Room_sell_layout sell_layout = roomSellLayoutHash.get(direct_sell_id);
			// 酒店数据厂商房型代码
			String roomTypeCode = hotel_id + "-" + sell_layout.getRoom_layout_id() + "-" + direct_sell_id;//
			// 厂商价格代码"-" + price_system.getBook_type_id() +
			//501-预付、16-现付 
			String direct_type = direct.getOta_direct_type();
			
			// 传值即可查询指定产品的匹配状态(如果酒店审核成功，productInfo=null默认返回全部产品匹配结果)
			if(direct_type.equals("spot_payment")) {//现付
				have16 = true;
				SearchProductInfo productInfo = new SearchProductInfo();
				// 厂商价格代码"12"
				String ratePlanCode = direct_system_id + "-" + direct_sell_id;
				productInfo.setRatePlanCode(ratePlanCode);
				// 厂商房型代码"111"
				productInfo.setRoomTypeCode(roomTypeCode);
				searchProductInfo16.add(productInfo);
			} else {
				have501 = true;
				SearchProductInfo productInfo = new SearchProductInfo();
				// 厂商价格代码"12"
				String ratePlanCode = direct_system_id + "-" + direct_sell_id;
				productInfo.setRatePlanCode(ratePlanCode);
				// 厂商房型代码"111"
				productInfo.setRoomTypeCode(roomTypeCode);
				searchProductInfo501.add(productInfo);
			}
		}
		
		searchRQ16.setSearchProductInfos(arrayOfSearchProductInfo16);//现付
		searchRQ501.setSearchProductInfos(arrayOfSearchProductInfo501);
	
		
		if(have16) mappingResult(searchRQ16, servicesSoap, hotel_id, hotelImpl);
		if(have501) mappingResult(searchRQ501, servicesSoap, hotel_id, hotelImpl);

		return null;
	}
	
	public static void mappingResult(MappingStatusSearchRQ searchRQ, AutoMappingServicesSoap servicesSoap,int hotel_id,HotelServiceImpl hotelImpl) throws Exception {
		String requestString = xml.writeValueAsString(searchRQ);
		logger.debug(requestString);
		// 查找匹配结果
		MappingStatusSearchRS mappingRS = servicesSoap.mappingStatusSearch(searchRQ);
		//
		int retcode = mappingRS.getRetCode();
		String ota_result = xml.writeValueAsString(mappingRS);
		logger.debug(ota_result);
		OtaServiceImpl.instent().saveDirectLog(hotel_id, "mappingStatusSearch", "4.8 产品审核结果查询", requestString, ota_result);
		if (retcode != 0) {
			logger.error(mappingRS.getMsg());
			return;
		}
			
		ArrayOfData allData = mappingRS.getList();
		List<Data> datas = allData.getData();
		int dataSize = datas.size();
		for (int i = 0; i < dataSize; i++) {
			Data data = datas.get(i);
			ArrayOfProductSearchResult allSearchResult = data.getProductSearchResults();
			List<ProductSearchResult> productSearchResults = allSearchResult.getProductSearchResult();
			int productSearchResultsSize = productSearchResults.size();
			for (int j = 0; j < productSearchResultsSize; j++) {
				ProductSearchResult productSearchResult = productSearchResults.get(j);
				String ratePlanCodeRS = productSearchResult.getRatePlanCode();
				String[] sell = ratePlanCodeRS.split("-");
				int result_system_id = Integer.parseInt(sell[0]);
				int result_sell_id = Integer.parseInt(sell[1]);
				
				int resultCode = productSearchResult.getResultCode();
				if (resultCode == 0) {
					hotelImpl.updateSystemDirectMapping(hotel_id, result_system_id, result_sell_id, 2);
				} else {
					logger.error(productSearchResult.getResultMsg());
				}
			}
		}
	}

}
