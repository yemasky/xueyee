package ota.jw.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.OTA.config.Config;
import com.OTA.model.BookAudit;
import com.OTA.model.ForwardRoomState_result;
import com.OTA.model.Room_layout_price;
import com.OTA.model.Room_layout_price_result;
import com.OTA.model.Entity.Book;
import com.OTA.model.Entity.Hotel;
import com.OTA.model.Entity.Room_layout;
import com.OTA.model.Entity.Room_layout_price_system_direct;
import com.OTA.model.Entity.Room_sell_layout;
import com.OTA.model.Entity.Room_sell_layout_ota_close;
import com.OTA.service.impl.HotelServiceImpl;
import com.OTA.service.impl.OtaServiceImpl;
import com.OTA.service.impl.PmsServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import ota.jw.PMSGateway.ArrayOfBaseInvCountTypeInvCount;
import ota.jw.PMSGateway.ArrayOfBaseInvCountTypeInvCount.InvCount;
import ota.jw.PMSGateway.ArrayOfDestinationSystemCodesTypeDestinationSystemCode;
import ota.jw.PMSGateway.ArrayOfDestinationSystemCodesTypeDestinationSystemCode.DestinationSystemCode;
import ota.jw.PMSGateway.ArrayOfHotelRatePlanTypeRate;
import ota.jw.PMSGateway.ArrayOfHotelRatePlanTypeRate.Rate;
import ota.jw.PMSGateway.ArrayOfHotelReservationIDsTypeHotelReservationID;
import ota.jw.PMSGateway.ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID;
import ota.jw.PMSGateway.ArrayOfOrderApplyPaymentRequest;
import ota.jw.PMSGateway.ArrayOfOrderCheckIn;
import ota.jw.PMSGateway.ArrayOfOrderEntity;
import ota.jw.PMSGateway.ArrayOfProfilesTypeProfileInfo;
import ota.jw.PMSGateway.ArrayOfProfilesTypeProfileInfo.ProfileInfo;
import ota.jw.PMSGateway.ArrayOfRateUploadTypeBaseByGuestAmt;
import ota.jw.PMSGateway.ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt;
import ota.jw.PMSGateway.ArrayOfResGuestType;
import ota.jw.PMSGateway.ArrayOfRoomStaysTypeRoomStay;
import ota.jw.PMSGateway.ArrayOfRoomStaysTypeRoomStay.RoomStay;
import ota.jw.PMSGateway.ArrayOfRoomTypeType;
import ota.jw.PMSGateway.AvailStatusMessageType;
import ota.jw.PMSGateway.AvailStatusMessageType.RestrictionStatus;
import ota.jw.PMSGateway.AvailabilityStatusType;
import ota.jw.PMSGateway.BaseInvCountType;
import ota.jw.PMSGateway.BasicPropertyInfoType;
import ota.jw.PMSGateway.CustomerType;
import ota.jw.PMSGateway.DateTimeSpanType;
import ota.jw.PMSGateway.HotelRatePlanType;
import ota.jw.PMSGateway.HotelReservationType;
import ota.jw.PMSGateway.InvCountType;
import ota.jw.PMSGateway.OTAHotelAvailNotifRQ;
import ota.jw.PMSGateway.OTAHotelAvailNotifRS;
import ota.jw.PMSGateway.OTAHotelInvCountNotifRQ;
import ota.jw.PMSGateway.OTAHotelInvCountNotifRS;
import ota.jw.PMSGateway.OTAHotelRatePlanNotifRQ;
import ota.jw.PMSGateway.OTAHotelRatePlanNotifRS;
import ota.jw.PMSGateway.OTAHotelStayInfoNotifRQ;
import ota.jw.PMSGateway.OTAHotelStayInfoNotifRS;
import ota.jw.PMSGateway.OTAPushOrderStatusRQ;
import ota.jw.PMSGateway.OTAPushOrderStatusRS;
import ota.jw.PMSGateway.OrderApplyPaymentRQ;
import ota.jw.PMSGateway.OrderApplyPaymentRS;
import ota.jw.PMSGateway.OrderApplyPaymentRequest;
import ota.jw.PMSGateway.OrderApplyPaymentRequestList;
import ota.jw.PMSGateway.OrderCheckIn;
import ota.jw.PMSGateway.OrderCheckInNoticeRQ;
import ota.jw.PMSGateway.OrderCheckInNoticeRS;
import ota.jw.PMSGateway.OrderEntity;
import ota.jw.PMSGateway.PMSGatewayService;
import ota.jw.PMSGateway.PMSGatewayServiceSoap;
import ota.jw.PMSGateway.PersonNameType;
import ota.jw.PMSGateway.ProfileType;
import ota.jw.PMSGateway.RateUploadType.MealsIncluded;
import ota.jw.PMSGateway.RefuseMessage;
import ota.jw.PMSGateway.ResGlobalInfoType;
import ota.jw.PMSGateway.ResGuestType;
import ota.jw.PMSGateway.RoomTypeType;
import ota.jw.PMSGateway.StatusApplicationControlType;
import ota.jw.PMSGateway.StayInfoType;
import ota.jw.PMSGateway.StayInfosType;
//import ota.jw.PMSGateway.SuccessType;
import ota.jw.PMSGateway.TimeUnitType;

public class JwPMSGatewayImpl {
	protected static Logger logger = LoggerFactory.getLogger(JwPMSGatewayImpl.class);
	protected static XmlMapper xml = new XmlMapper();
	protected static ObjectMapper mapper = new ObjectMapper();

	public static final QName SERVICE = new QName("http://tempuri.org/", "PMSGatewayService");

	/*
	 * 5.交易直连接口 5.1. 房态推送[EBK 规则] OTA_HotelAvailNotifRQ 由 PMS 向入住通推送酒店房态信息。首次上线推 90
	 * 天全量房态，之后每天推第 90 天的 全量房态。酒店房态变化实时推送变量房态给入住通。 （注：此套接口预订规则担保/取消/最晚设置等规则由 E
	 * booking设置并维护） 接口调用方：合作方 接口返回方：入住通
	 */
	public static OTAHotelAvailNotifRS OTA_HotelAvailNotifRQ(int hotel_id, int system_id, int sell_id, String startDate, String endDate,
			String open) throws Exception {
		String hotelCode = Config.hotelCodePrefix + hotel_id;
		// 构建RQ
		OTAHotelAvailNotifRQ hotelAvailNotifRQ = new OTAHotelAvailNotifRQ();

		OTAHotelAvailNotifRQ.AvailStatusMessages availStatusMessages = new OTAHotelAvailNotifRQ.AvailStatusMessages();
		// PMS 酒店代码
		availStatusMessages.setHotelCode(hotelCode);
		//
		HotelServiceImpl hotelImpl = new HotelServiceImpl();
		int[] hotel_ids = { hotel_id };
		List<Room_sell_layout> roomSellLayoutList = hotelImpl.getRoomSellLayout(hotel_ids);
		// roomSellLayoutHash
		HashMap<Integer, Room_sell_layout> roomSellLayoutHash = new HashMap<Integer, Room_sell_layout>();
		int sellListSize = 0;
		if (roomSellLayoutList != null)
			sellListSize = roomSellLayoutList.size();
		for (int i = 0; i < sellListSize; i++) {
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
		// 构造AvailStatusMessageType
		List<AvailStatusMessageType> statusMessage = availStatusMessages.getAvailStatusMessage();
		int directSize = system_direct.size();
		for (int i = 0; i < directSize; i++) {
			Room_layout_price_system_direct direct = system_direct.get(i);
			int direct_sell_id = direct.getRoom_sell_layout_id();

			Room_sell_layout sellLayout = roomSellLayoutHash.get(direct_sell_id);
			int thisHotelId = sellLayout.getHotel_id();
			int thisSellId = sellLayout.getRoom_sell_layout_id();
			int thisLayoutId = sellLayout.getRoom_layout_id();
			String roomTypeCode = thisHotelId + "-" + thisLayoutId + "-" + thisSellId;// RoomTypeCode String Y 厂商房型代码
			// 构造applicationControlType
			StatusApplicationControlType applicationControlType = new StatusApplicationControlType();
			// 2 3
			applicationControlType.setStart(startDate);// "2018-08-06"房态生效开始时间
			applicationControlType.setEnd(endDate);// "2018-08-06"房态生效结束时间
			// InvTypeCode String Y PMS 房型代码
			List<String> invTypeCode = applicationControlType.getInvTypeCode();
			// "3-13-14" 房型代码
			invTypeCode.add(roomTypeCode);
			// "1" 价格代码，参考附件 1：《价格代码套系》
			// 厂商价格代码"-" + price_system.getBook_type_id() +
			String ratePlanCode = direct.getRoom_layout_price_system_id() + "-" + thisSellId;
			applicationControlType.setRatePlanCode(ratePlanCode);
			applicationControlType.setMon(true);
			applicationControlType.setTue(true);
			applicationControlType.setWeds(true);
			applicationControlType.setThur(true);
			applicationControlType.setFri(true);
			applicationControlType.setSat(true);
			applicationControlType.setSun(true);
			// DestinationSystemCode
			/*
			 * 渠道代码（携程：CTRIP,艺龙：ELONG,去哪儿：QUNAR） 该节点支持 1 个或多个，表示分别控制已上线的不同渠道房态
			 */
			ArrayOfDestinationSystemCodesTypeDestinationSystemCode dCode = new ArrayOfDestinationSystemCodesTypeDestinationSystemCode();
			List<DestinationSystemCode> destinationSystemCodes = dCode.getDestinationSystemCode();
			//
			String channel = direct.getOta_code();
			if (channel.equals("0"))
				continue;
			// 0不直连 1直连 2直连已mapping
			if (direct.getMapping_status() != 2)
				continue;// 好像无关重要的
			DestinationSystemCode destinationSystemCode = new DestinationSystemCode();
			destinationSystemCode.setValue(channel);
			destinationSystemCodes.add(destinationSystemCode);

			applicationControlType.setDestinationSystemCodes(dCode);

			// Restriction String Y 默认填 Master
			RestrictionStatus restrictionStatus = new RestrictionStatus();
			restrictionStatus.setRestriction("Master");
			// Statu
			restrictionStatus.setStatus(AvailabilityStatusType.OPEN);
			if (open.equals("0"))
				restrictionStatus.setStatus(AvailabilityStatusType.CLOSE);

			AvailStatusMessageType messageType = new AvailStatusMessageType();
			messageType.setStatusApplicationControl(applicationControlType);// 设置applicationControlType
			messageType.setRestrictionStatus(restrictionStatus);
			statusMessage.add(messageType);// 设置messageType
		}

		hotelAvailNotifRQ.setAvailStatusMessages(availStatusMessages);
		//
		URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService(wsdlURL, SERVICE);
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();

		OTAHotelAvailNotifRS availNotifRS = serviceSoap.otaHotelAvailNotifRQ(hotelAvailNotifRQ);
		//
		String requestString = xml.writeValueAsString(hotelAvailNotifRQ);
		//
		String ota_result = xml.writeValueAsString(availNotifRS);

		logger.debug(requestString);
		logger.debug(ota_result);
		// 保存返回结果
		OtaServiceImpl.instent().saveDirectLog(hotel_id, "OTA_HotelAvailNotifRQ", "5.交易直连接口 5.1. 房态推送[EBK 规则]", requestString, ota_result);

		return availNotifRS;
	}
	
	public static OTAHotelAvailNotifRS OTA_HotelAvailNotifRQ(int hotel_id) throws Exception {
		String hotelCode = Config.hotelCodePrefix + hotel_id;
		// 构建RQ
		OTAHotelAvailNotifRQ hotelAvailNotifRQ = new OTAHotelAvailNotifRQ();

		OTAHotelAvailNotifRQ.AvailStatusMessages availStatusMessages = new OTAHotelAvailNotifRQ.AvailStatusMessages();
		// PMS 酒店代码
		availStatusMessages.setHotelCode(hotelCode);
		//
		HotelServiceImpl hotelImpl = new HotelServiceImpl();
		int[] hotel_ids = { hotel_id };
		List<Room_sell_layout> roomSellLayoutList = hotelImpl.getRoomSellLayout(hotel_ids);
		// roomSellLayoutHash
		HashMap<Integer, Room_sell_layout> roomSellLayoutHash = new HashMap<Integer, Room_sell_layout>();
		int sellListSize = 0;
		if (roomSellLayoutList != null)
			sellListSize = roomSellLayoutList.size();
		for (int i = 0; i < sellListSize; i++) {
			roomSellLayoutHash.put(roomSellLayoutList.get(i).getRoom_sell_layout_id(), roomSellLayoutList.get(i));
		}
		// 获取所有直连的价格体系
		List<Room_sell_layout_ota_close> ota_close = hotelImpl.getOtaClose(hotel_id);
		
		if (ota_close == null) {
			return null;
		}
		// 构造AvailStatusMessageType
		List<AvailStatusMessageType> statusMessage = availStatusMessages.getAvailStatusMessage();
		int closeSize = ota_close.size();
		for (int i = 0; i < closeSize; i++) {
			Room_sell_layout_ota_close otaClose = ota_close.get(i);
			int direct_sell_id = otaClose.getRoom_sell_layout_id();

			Room_sell_layout sellLayout = roomSellLayoutHash.get(direct_sell_id);
			int thisHotelId = sellLayout.getHotel_id();
			int thisSellId = sellLayout.getRoom_sell_layout_id();
			int thisLayoutId = sellLayout.getRoom_layout_id();
			String roomTypeCode = thisHotelId + "-" + thisLayoutId + "-" + thisSellId;// RoomTypeCode String Y 厂商房型代码
			// 构造applicationControlType
			StatusApplicationControlType applicationControlType = new StatusApplicationControlType();
			// 2 3
			applicationControlType.setStart(otaClose.getClose_date()+"");// "2018-08-06"房态生效开始时间
			applicationControlType.setEnd(otaClose.getClose_date()+"");// "2018-08-06"房态生效结束时间
			// InvTypeCode String Y PMS 房型代码
			List<String> invTypeCode = applicationControlType.getInvTypeCode();
			// "3-13-14" 房型代码
			invTypeCode.add(roomTypeCode);
			// "1" 价格代码，参考附件 1：《价格代码套系》
			// 厂商价格代码"-" + price_system.getBook_type_id() +
			String ratePlanCode = otaClose.getRoom_layout_price_system_id() + "-" + thisSellId;
			applicationControlType.setRatePlanCode(ratePlanCode);
			applicationControlType.setMon(true);
			applicationControlType.setTue(true);
			applicationControlType.setWeds(true);
			applicationControlType.setThur(true);
			applicationControlType.setFri(true);
			applicationControlType.setSat(true);
			applicationControlType.setSun(true);
			// DestinationSystemCode
			/*
			 * 渠道代码（携程：CTRIP,艺龙：ELONG,去哪儿：QUNAR） 该节点支持 1 个或多个，表示分别控制已上线的不同渠道房态
			 */
			ArrayOfDestinationSystemCodesTypeDestinationSystemCode dCode = new ArrayOfDestinationSystemCodesTypeDestinationSystemCode();
			List<DestinationSystemCode> destinationSystemCodes = dCode.getDestinationSystemCode();
			//
			String channel = otaClose.getOta_code();
			if (channel.equals("0"))
				continue;
			// 0不直连 1直连 2直连已mapping
			DestinationSystemCode destinationSystemCode = new DestinationSystemCode();
			destinationSystemCode.setValue(channel);
			destinationSystemCodes.add(destinationSystemCode);

			applicationControlType.setDestinationSystemCodes(dCode);

			// Restriction String Y 默认填 Master
			RestrictionStatus restrictionStatus = new RestrictionStatus();
			restrictionStatus.setRestriction("Master");
			// Statu
			restrictionStatus.setStatus(AvailabilityStatusType.OPEN);
			if (otaClose.getOta_close().equals("0"))
				restrictionStatus.setStatus(AvailabilityStatusType.CLOSE);

			AvailStatusMessageType messageType = new AvailStatusMessageType();
			messageType.setStatusApplicationControl(applicationControlType);// 设置applicationControlType
			messageType.setRestrictionStatus(restrictionStatus);
			statusMessage.add(messageType);// 设置messageType
		}

		hotelAvailNotifRQ.setAvailStatusMessages(availStatusMessages);
		//
		URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService(wsdlURL, SERVICE);
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();

		OTAHotelAvailNotifRS availNotifRS = serviceSoap.otaHotelAvailNotifRQ(hotelAvailNotifRQ);
		//
		String requestString = xml.writeValueAsString(hotelAvailNotifRQ);
		//
		String ota_result = xml.writeValueAsString(availNotifRS);

		logger.debug(requestString);
		logger.debug(ota_result);
		// 保存返回结果
		OtaServiceImpl.instent().saveDirectLog(hotel_id, "OTA_HotelAvailNotifRQ", "5.交易直连接口 5.1. 房态推送[EBK 规则]", requestString, ota_result);

		return availNotifRS;
	}

	// 5.3. 房价推送[EBK 规则] OTA_HotelRatePlanNotifRQ
	/*
	 * 由 PMS 向入住通推送酒店房价信息。首次上线推 90 天全量房价，之后每天推第 90 天的 全量房价。酒店房价变化时实时推送变量房价给入住通。
	 * 接口调用方：合作方 接口返回方：入住通
	 */
	public static Map<String, String> OTA_HotelRatePlanNotifRQ(int hotel_id, int system_id, int sell_id, String startDate, String endDate)
			throws Exception {
		String hotelCode = Config.hotelCodePrefix + hotel_id;
		PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
		HotelServiceImpl hotelImpl = new HotelServiceImpl();
		Hotel hotel = hotelImpl.getHotel(hotel_id);
		int[] hotel_ids = { hotel.getHotel_id() };

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
		//
		OTAHotelRatePlanNotifRQ ratePlanNotifRQ = new OTAHotelRatePlanNotifRQ();
		OTAHotelRatePlanNotifRQ.RatePlans ratePlans = new OTAHotelRatePlanNotifRQ.RatePlans();

		ratePlans.setHotelCode(hotelCode);// PMS 酒店代码
		List<HotelRatePlanType> ratePlanList = ratePlans.getRatePlan();// 价格代码，参考入住通提供的标准价格代码套系，见附件2《价格代码套系》
		//

		List<Room_layout> roomLayoutList = hotelImpl.getRoomLayout(hotel_ids);
		// roomLayoutHash
		HashMap<Integer, Room_layout> roomLayoutHash = new HashMap<Integer, Room_layout>();
		int layoutListSize = roomLayoutList.size();
		for (int i = 0; i < layoutListSize; i++) {
			roomLayoutHash.put(roomLayoutList.get(i).getRoom_layout_id(), roomLayoutList.get(i));
		}
		List<Room_sell_layout> roomSellLayoutList = hotelImpl.getRoomSellLayout(hotel_ids);
		// roomSellLayoutHash
		HashMap<Integer, Room_sell_layout> roomSellLayoutHash = new HashMap<Integer, Room_sell_layout>();
		int sellListSize = roomSellLayoutList.size();
		for (int i = 0; i < sellListSize; i++) {
			roomSellLayoutHash.put(roomSellLayoutList.get(i).getRoom_sell_layout_id(), roomSellLayoutList.get(i));
		}

		//
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		long begin = dateFormat.parse(startDate).getTime();
		long end = dateFormat.parse(endDate).getTime();
		GregorianCalendar startCalendar = new GregorianCalendar();
		int directSize = system_direct.size();
		for (int i = 0; i < directSize; i++) {
			HotelRatePlanType ratePlanType = new HotelRatePlanType();
			Room_layout_price_system_direct direct = system_direct.get(i);
			// 0不直连 1直连 2直连已mapping
			if (direct.getMapping_status() != 2)
				continue;// 好像无关重要的
			int this_system_id = direct.getRoom_layout_price_system_id();
			int direct_sell_id = direct.getRoom_sell_layout_id();

			Room_sell_layout sellLayout = roomSellLayoutHash.get(direct_sell_id);
			int thisHotelId = sellLayout.getHotel_id();
			int thisSellId = sellLayout.getRoom_sell_layout_id();
			int thisLayoutId = sellLayout.getRoom_layout_id();
			// 酒店数据厂商房型代码
			String roomTypeCode = thisHotelId + "-" + thisLayoutId + "-" + thisSellId;//
			// 每个房间入住人数
			int room_live_number = roomLayoutHash.get(thisLayoutId).getRoom_layout_max_people();
			// 厂商价格代码 + price_system.getBook_type_id() + "-"
			String ratePlanCode = this_system_id + "-" + thisSellId;
			ratePlanType.setRatePlanCode(ratePlanCode);// XCBAR 携程标准价 价格代码，参考入住通提供的标准价格代码套系，见附件 2《价格代码套系》
			ratePlanType.setStart(startDate);// 房价生效开始时间，注：Start<=Rate 节点中Start 的最小值
			ratePlanType.setEnd(endDate);// 房价生效结束时间，注：End>=Rate 节点中
			ratePlanType.setCurrencyCode("RMB");
			//
			// ArrayOfHotelRatePlanTypeRate rates = ratePlanType.getRates();
			ArrayOfHotelRatePlanTypeRate allRates = new ArrayOfHotelRatePlanTypeRate();
			List<Rate> rateList = allRates.getRate();
			// 获取pms价格
			String systemPrice = pmsServiceImpl.hotelRatePlan(hotel_id, this_system_id, thisSellId, startDate, endDate);

			if (systemPrice.equals(""))
				continue;// 获取数据为空
			Room_layout_price_result priceMap = mapper.readValue(systemPrice, Room_layout_price_result.class);
			Room_layout_price room_layout_price_list = priceMap.getItemData();
			HashMap<String, HashMap<String, String>> room_layout_price = room_layout_price_list.getDay_price();
			//
			// String bDate = "2018-08-01";
			// String eDate = "2018-12-20";

			Date b_Date = null;
			// Date thisDate = null;

			// pms 获取价格
			for (long k = begin; k <= end; k += 86400000) {
				b_Date = new Date(k);
				String thisDate = dateFormat.format(b_Date);
				// String nextDate = dateFormat.format(new Date(k + 86400000));
				startCalendar.setTime(b_Date);
				int year = startCalendar.get(Calendar.YEAR);
				int month = startCalendar.get(Calendar.MONTH) + 1;
				int day = startCalendar.get(Calendar.DAY_OF_MONTH);
				String sMonth = month < 10 ? "0" + month : month + "";
				String sDay = day < 10 ? "0" + day : day + "";
				logger.info("year-sMonth-Day:" + year + "-" + sMonth + "-01" + ";sDay:" + sDay);
				String price = room_layout_price.get(year + "-" + sMonth + "-01").get(sDay + "_day");
				if (price == null || price.equals(""))
					price = "0";
				// begin 1
				Rate rate = new Rate();
				rate.setStart(thisDate);// 房价明细生效开始时间
				rate.setEnd(thisDate);// 房价明细生效结束时间
				rate.setSat(true);
				rate.setSun(true);
				rate.setMon(true);
				rate.setTue(true);
				rate.setWeds(true);
				rate.setThur(true);
				rate.setFri(true);
				rate.setRateTimeUnit(TimeUnitType.DAY);
				rate.setInvTypeCode(roomTypeCode);// PMS 房型代码"3-13-14"
				rate.setCurrencyCode("RMB");

				ArrayOfRateUploadTypeBaseByGuestAmt baseByGuestAmt = new ArrayOfRateUploadTypeBaseByGuestAmt();
				List<BaseByGuestAmt> guestAmtList = baseByGuestAmt.getBaseByGuestAmt();
				BaseByGuestAmt guestAmt = new BaseByGuestAmt();
				BigInteger numOfGuests = new BigInteger(room_live_number + "");
				guestAmt.setNumberOfGuests(numOfGuests);// 默认值 2（2 人价）
				guestAmt.setAgeQualifyingCode("10");// 客人类别，默认 10（成人）
				BigDecimal amount = new BigDecimal(price);
				guestAmt.setAmountBeforeTax(amount);// 税 前 价 格 ， AmountBeforeTax 和AmountAfterTax 传相同值
				amount = new BigDecimal(price);
				guestAmt.setAmountAfterTax(amount);// 税 后 价 格 ， AmountBeforeTax 和AmountAfterTax 传相同值
				guestAmtList.add(guestAmt);
				//
				rate.setBaseByGuestAmts(baseByGuestAmt);
				//
				MealsIncluded mealsIncluded = new MealsIncluded();
				mealsIncluded.setBreakfast(true);// 默认为 true，表示处理早餐
				mealsIncluded.setNumberOfBreakfast(direct.getOta_breakfast() + "");// 早餐份数：（0：无早餐；1：单份早餐；2：双份早餐；）
				rate.setMealsIncluded(mealsIncluded);
				//
				rateList.add(rate);
			}
			ratePlanType.setRates(allRates);
			//
			ratePlanList.add(ratePlanType);
		}
		//
		ratePlanNotifRQ.setRatePlans(ratePlans);
		String requestString = xml.writeValueAsString(ratePlanNotifRQ);
		URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService(wsdlURL);
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();

		OTAHotelRatePlanNotifRS ratePlanNotifRS = serviceSoap.otaHotelRatePlanNotifRQ(ratePlanNotifRQ);

		List<Object> resultList = ratePlanNotifRS.getSuccessOrWarningsOrErrors();
		Object result = resultList.get(0);
		String className = result.getClass().getSimpleName();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String date = df.format(new Date());
		HashMap<String, Object> updateData = new HashMap<>();
		updateData.put("ota_sync_datetime", date);// ota_sync_success
		updateData.put("ota_sync_success", "0");// ota_sync_success
		if (className.equals("SuccessType")) {
			updateData.put("ota_sync_success", "1");// ota_sync_success
		}
		for (int i = 0; i < directSize; i++) {
			Room_layout_price_system_direct direct = system_direct.get(i);
			int this_system_id = direct.getRoom_layout_price_system_id();
			int direct_sell_id = direct.getRoom_sell_layout_id();
			hotelImpl.updateRoomSystemDirect(hotel_id, this_system_id, direct_sell_id, updateData);
		}

		String ota_result = xml.writeValueAsString(ratePlanNotifRS);

		OtaServiceImpl.instent().saveDirectLog(hotel_id, "OTA_HotelRatePlanNotifRQ", "5.3. 房价推送[EBK 规则]", requestString, ota_result);

		return null;
	}

	// 5.5. 房量 推送K [EBK 规则] ]
	public static OTAHotelInvCountNotifRS OTA_HotelInvCountNotifRQ(int hotel_id, int sell_id, String startDate, String endDate)
			throws Exception {
		String hotelCode = Config.hotelCodePrefix + hotel_id;
		PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
		HotelServiceImpl hotelServiceImpl = new HotelServiceImpl();

		List<Room_sell_layout> sell_layouts = null;
		if (sell_id > 0) {
			sell_layouts = hotelServiceImpl.getRoomSellLayout(hotel_id, sell_id);
		} else {
			int[] hotel_ids = {hotel_id};
			sell_layouts = hotelServiceImpl.getRoomSellLayout(hotel_ids);
		}
		if (sell_layouts == null) {
			return null;
		}
		if (sell_layouts.size() == 0) {
			return null;
		}

		// 遠期房態
		String jsonResult = pmsServiceImpl.forwardRoomState(hotel_id, sell_id, startDate, endDate, 0);
		ForwardRoomState_result forwardRoomStateResult = mapper.readValue(jsonResult, ForwardRoomState_result.class);
		HashMap<String, HashMap<String, String>> forwardRoomState = forwardRoomStateResult.getItemData();
		OTAHotelInvCountNotifRQ invCountNotifRQ = new OTAHotelInvCountNotifRQ();
		//
		InvCountType invCountType = new InvCountType();// invCountNotifRQ.getInventories();
		invCountType.setHotelCode(hotelCode);// PMS 酒店代码
		//
		List<BaseInvCountType> baseInvCountTypes = invCountType.getInventory();
		//
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		long begin = dateFormat.parse(startDate).getTime();
		long end = dateFormat.parse(endDate).getTime();
		Date b_Date = null;
		GregorianCalendar startCalendar = new GregorianCalendar();
		for (long k = begin; k <= end; k += 86400000) {
			b_Date = new Date(k);
			String thisDate = dateFormat.format(b_Date);
			// String nextDate = dateFormat.format(new Date(k + 86400000));
			String nextDate = dateFormat.format(b_Date);
			startCalendar.setTime(b_Date);
			// int year = startCalendar.get(Calendar.YEAR);
			// int month = startCalendar.get(Calendar.MONTH) + 1;
			// int day = startCalendar.get(Calendar.DAY_OF_MONTH);
			HashMap<String, String> layoutRoom = forwardRoomState.get(thisDate);
			for (String layout_key : layoutRoom.keySet()) {
				BaseInvCountType baseInvCountType = new BaseInvCountType();
				//
				StatusApplicationControlType applicationControlType = new StatusApplicationControlType();
				applicationControlType.setStart(thisDate);// 房量生效开始时间
				applicationControlType.setEnd(nextDate);// 房量生效结束时间
				List<String> invTypeCode = applicationControlType.getInvTypeCode();// PMS
				// 房型代码
				String roomTypeCode = hotel_id + "-" + layout_key;//
				invTypeCode.add(roomTypeCode);// PMS 房型代码 2-10-35

				applicationControlType.setMon(true);
				applicationControlType.setTue(true);
				applicationControlType.setWeds(true);
				applicationControlType.setThur(true);
				applicationControlType.setFri(true);
				applicationControlType.setSat(true);
				applicationControlType.setSun(true);
				//
				baseInvCountType.setStatusApplicationControl(applicationControlType);
				//
				ArrayOfBaseInvCountTypeInvCount arrayOfBaseInvCountTypeInvCount = new ArrayOfBaseInvCountTypeInvCount();
				List<InvCount> invCounts = arrayOfBaseInvCountTypeInvCount.getInvCount();
				InvCount invCount = new InvCount();
				invCount.setCountType("2");// 房量类型，默认填 2（2：实时房量）
				String roomCount = layoutRoom.get(layout_key);
				BigInteger count = new BigInteger(roomCount);
				invCount.setCount(count);// 房量值
				invCounts.add(invCount);
				//
				baseInvCountType.setInvCounts(arrayOfBaseInvCountTypeInvCount);
				//
				baseInvCountTypes.add(baseInvCountType);
			}
		}
		//
		invCountNotifRQ.setInventories(invCountType);
		String requestString = xml.writeValueAsString(invCountNotifRQ);
		logger.info(requestString);
		URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService(wsdlURL);
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();
		OTAHotelInvCountNotifRS invCountNotifRS = serviceSoap.otaHotelInvCountNotifRQ(invCountNotifRQ);

		String ota_result = xml.writeValueAsString(invCountNotifRS);
		logger.info(ota_result);
		OtaServiceImpl.instent().saveDirectLog(hotel_id, "OTA_HotelInvCountNotifRQ", "5.5. 房量 推送K [EBK 规则]", requestString, ota_result);

		return null;
	}

	// ***************************************//
	// 5.7
	/*
	 * 由入住通向 PMS 发起请求，检查是否有可预订房间。该请求由渠道实时发起，请求量较 大。 接口调用方：入住通 接口返回方：合作方
	 */
	public static void CheckAvailability() {

	}
	// 5.8. 创建订单 *
	/*
	 * 由入住通向 PMS 发起请求，将客人订单信息传给酒店。该请求由渠道实时发起。PMS 厂 商需
	 * 30S内将结果响应给入住通。否则视为超时，以失败处理，该订单将通过 Ebooking 或传 真发给酒店线下确认。 接口调用方：入住通 接口返回方：合作方
	 */
	// 5.9. 修改订单 *
	/*
	 * 由入住通向 PMS 发起请求，将客人修改后订单信息传给酒店。该请求由渠道实时发起。 PMS 厂商需 30S
	 * 内将结果响应给入住通处理结果。否则视为超时，以失败处理，该订单将通 过 Ebooking 或传真发给酒店线下确认。 接口调用方：入住通 接口返回方：合作方
	 */
	// 5.10. 取消订单 *
	/*
	 * 由入住通向 PMS 发起取消请求。该请求由渠道实时发起。PMS 厂商需 30S 内将结果响应 给入住通处理结果。否则视为超时，以失败处理，该订单将通过
	 * Ebooking或传真发给酒店线 下确认。 接口调用方：入住通 接口返回方：合作方
	 */

	// 5.11. 订单审核
	/*
	 * 订单入住、离店、NoShow、取消时，PMS 及时将订单状态信息发送给入住通。审核状态 共四种，分别为：入住、离店、NoShow、取消（PMS 取消）。
	 * 此处，PMS 取消仅是酒店端和 客人协商后客人不来而做的释放房量动作，该订单入住通以 NoShow 形式给 OTA，若想 OTA 端的订单取消只能让客人在
	 * OTA 上发起取消动作， PMS/CRS 无法通过接口取消 OTA 订单。 接口调用方：合作方 接口返回方：入住通
	 */
	public static Map<String, String> OTA_HotelStayInfoNotifRQ(int hotel_id, int book_id, String order_number_ourter) throws Exception {
		HotelServiceImpl hotelServiceImpl = new HotelServiceImpl();
		Hotel hotel = hotelServiceImpl.getHotel(hotel_id);
		List<Book> bookList;
		if (!order_number_ourter.equals("0")) {
			bookList = hotelServiceImpl.getBook(hotel_id, order_number_ourter);
		} else {
			bookList = hotelServiceImpl.getBook(hotel_id, book_id);
		}

		List<BookAudit> bookAuditList = new ArrayList<>();
		if (bookList == null)
			return null;
		int bookListSize = bookList.size();
		if (bookListSize == 0)
			return null;
		for (int i = 0; i < bookListSize; i++) {
			Book book = bookList.get(i);
			BookAudit bookAudit = new BookAudit();

			bookAudit.setHotel_id(hotel_id);
			bookAudit.setInDate(book.getBook_check_in_actual() + "");
			bookAudit.setOutDate(book.getBook_check_out_actual() + "");
			bookAudit.setOtaResIDValue(book.getBook_order_number_ourter());

			int book_status = book.getBook_order_number_status();
			logger.debug("book_status:" + book_status);
			String resStatus = "NoShow";
			if (book_status == 4)
				resStatus = "NoShow";
			if (book_status == 1)
				resStatus = "InHouse";
			if (book_status == -99)
				resStatus = "Cancelled";
			if (book_status == -4)
				resStatus = "Cancelled";
			if (book_status == -1)
				resStatus = "CheckedOut";
			if (book_status == 0)
				continue;// 没处理订单跳过
			bookAudit.setResStatus(resStatus);

			bookAudit.setRoomID(book.getRoom_id() + "-" + book.getBook_id());
			bookAudit.setRoomNo(book.getRoom_id() + "");
			String roomTab = book.getBook_id() + "";
			if (!book.getBook_ota_code().equals(""))
				roomTab = book.getBook_ota_code();
			bookAudit.setRoomTab(roomTab);
			String roomTypeCode = hotel_id + "-" + book.getRoom_layout_id() + "-" + book.getRoom_sell_layout_id();
			bookAudit.setRoomTypeCode(roomTypeCode);

			bookAudit.setGiveName("");
			bookAudit.setSetSurname("");
			bookAuditList.add(bookAudit);
		}
		URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService(wsdlURL);
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();
		// A. 入住审核
		OTAHotelStayInfoNotifRQ hotelStayInfoNotifRQ = new OTAHotelStayInfoNotifRQ();

		StayInfosType stayInfosType = new StayInfosType();
		List<StayInfoType> stayInfoTypes = stayInfosType.getStayInfo();

		StayInfoType stayInfoType = new StayInfoType();
		HotelReservationType reservationType = new HotelReservationType();

		// 订单审核状态， PMS 取消:Cancelled ；已入住：InHouse ；已离店：CheckedOut ；未入住：NoShow；
		// 注：若 OTA 发起取消的订单，仍然需要返回审核状
		reservationType.setResStatus(bookAuditList.get(0).getResStatus());

		// RoomStays
		ArrayOfRoomStaysTypeRoomStay allOfRoomStaysTypeRoomStay = new ArrayOfRoomStaysTypeRoomStay();

		List<RoomStay> roomStays = allOfRoomStaysTypeRoomStay.getRoomStay();

		RoomStay roomStay = new RoomStay();
		BasicPropertyInfoType basicPropertyInfoType = new BasicPropertyInfoType();
		String hotelCode = Config.hotelCodePrefix + hotel_id;
		basicPropertyInfoType.setHotelCode(hotelCode);// PMS 酒店代码
		basicPropertyInfoType.setHotelName(hotel.getHotel_name());// PMS 酒店名称
		roomStay.setBasicPropertyInfo(basicPropertyInfoType);

		DateTimeSpanType dateTimeSpanType = new DateTimeSpanType();
		String sDate = bookAuditList.get(0).getInDate();
		sDate = sDate.equals("null") ? "" : sDate.substring(0, 19);
		dateTimeSpanType.setStart(sDate);// 实际入住时间（ResStatus=InHouse/CheckedOut时必填）
		String eDate = bookAuditList.get(0).getOutDate();
		eDate = eDate.equals("null") ? "" : eDate.substring(0, 19);
		dateTimeSpanType.setEnd(eDate);// 实际离店时间（ResStatus=CheckedOut 时必填）
		roomStay.setTimeSpan(dateTimeSpanType);

		ArrayOfRoomTypeType arrayOfRoomTypeType = new ArrayOfRoomTypeType();
		List<RoomTypeType> roomTypeTypes = arrayOfRoomTypeType.getRoomType();
		int bookAuditListSize = bookAuditList.size();
		for (int i = 0; i < bookAuditListSize; i++) {
			BookAudit bookAudit = bookAuditList.get(i);
			RoomTypeType roomTypeType = new RoomTypeType();
			roomTypeType.setRoomTypeCode(bookAudit.getRoomTypeCode());// PMS 房型代码
			// 入住房间号（ResStatus=InHouse/CheckedOut/Cancelled/NoShow 时必填，NoShow 的值默认为0）
			roomTypeType.setRoomNo(bookAudit.getRoomNo());
			roomTypeType.setRoomID(bookAudit.getRoomID());//
			roomTypeType.setRoomTab(bookAudit.getRoomTab());// 订单内每间房的唯一标识号或每间房的 PMS 订单确认号（不允许更改）
			roomTypeTypes.add(roomTypeType);
			roomStay.setRoomTypes(arrayOfRoomTypeType);

			roomStays.add(roomStay);
		}
		reservationType.setRoomStays(allOfRoomStaysTypeRoomStay);
		// end RoomStays

		// ResGuests
		ArrayOfResGuestType arrayOfResGuestType = new ArrayOfResGuestType();
		List<ResGuestType> resGuestTypes = arrayOfResGuestType.getResGuest();
		ResGuestType resGuestType = new ResGuestType();
		ArrayOfProfilesTypeProfileInfo arrayOfProfilesTypeProfileInfo = new ArrayOfProfilesTypeProfileInfo();
		List<ProfileInfo> profileInfos = arrayOfProfilesTypeProfileInfo.getProfileInfo();
		ProfileInfo profileInfo = new ProfileInfo();
		ProfileType profileType = new ProfileType();

		// <!--多个客人用多个PersonName节点表示-->
		CustomerType customerType = new CustomerType();
		List<PersonNameType> personNameTypes = customerType.getPersonName();
		PersonNameType personNameType = new PersonNameType();
		List<String> giveName = personNameType.getGivenName();
		for (int i = 0; i < bookAuditListSize; i++) {
			BookAudit bookAudit = bookAuditList.get(i);
			giveName.add(bookAudit.getGiveName());// 名
			personNameType.setSurname(bookAudit.getSetSurname());// 姓
			personNameTypes.add(personNameType);
		}

		//
		profileType.setCustomer(customerType);
		//
		profileInfo.setProfile(profileType);
		profileInfos.add(profileInfo);
		//
		resGuestType.setProfiles(arrayOfProfilesTypeProfileInfo);
		//
		resGuestTypes.add(resGuestType);

		reservationType.setResGuests(arrayOfResGuestType);
		// end ResGuests

		// ResGlobalInf
		ResGlobalInfoType resGlobalInfoType = new ResGlobalInfoType();
		ArrayOfHotelReservationIDsTypeHotelReservationID arrayHotelReservationID = new ArrayOfHotelReservationIDsTypeHotelReservationID();
		List<HotelReservationID> hotelReservationIDs = arrayHotelReservationID.getHotelReservationID();
		HotelReservationID hotelReservationID = new HotelReservationID();
		hotelReservationID.setResIDType("24");// 24 表示 OTA 订单号 10 表示 PMS 确认号，改单、取消单操作时会传递这个号码
		hotelReservationID.setResIDValue(bookAuditList.get(0).getOtaResIDValue());// OTA 订单号值/PMS 确认号值，对应 ResID_Type
		hotelReservationIDs.add(hotelReservationID);
		HotelReservationID pmsHotelReservationID = new HotelReservationID();
		pmsHotelReservationID.setResIDType("10");// 24 表示 OTA 订单号 10 表示 PMS 确认号，改单、取消单操作时会传递这个号码
		pmsHotelReservationID.setResIDValue(bookAuditList.get(0).getPmsResIDValue());// OTA 订单号值/PMS 确认号值，对应 ResID_Type
		hotelReservationIDs.add(hotelReservationID);
		resGlobalInfoType.setHotelReservationIDs(arrayHotelReservationID);

		reservationType.setResGlobalInfo(resGlobalInfoType);
		// end ResGlobalInf

		stayInfoType.setHotelReservation(reservationType);
		stayInfoTypes.add(stayInfoType);

		hotelStayInfoNotifRQ.setStayInfos(stayInfosType);

		OTAHotelStayInfoNotifRS hotelStayInfoNotifRS = serviceSoap.otaHotelStayInfoNotifRQ(hotelStayInfoNotifRQ);

		// System.out.println(Serialize.objectToXml(hotelStayInfoNotifRS,OTAHotelStayInfoNotifRS.class));
		String ota_result = xml.writeValueAsString(hotelStayInfoNotifRS);
		String request = xml.writeValueAsString(hotelStayInfoNotifRQ);
		logger.debug(request);
		logger.debug(ota_result);
		OtaServiceImpl.instent().saveDirectLog(hotel_id, "OTA_HotelStayInfoNotifRQ", "5.11. 订单审核 [EBK 规则]", request, ota_result);

		return null;
	}

	// 5.12. 订单确认通知
	/*
	 * PMS/CRS 将待确认的订单酒店确认后的结果推送给入住通。 接口调用方：合作方 接口返回方：入住通
	 */
	public static void updatePulledReservations() {
		URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService(wsdlURL);
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();

		OTAPushOrderStatusRQ pushOrderStatusRQ = new OTAPushOrderStatusRQ();

		ArrayOfOrderEntity arrayOfOrderEntity = new ArrayOfOrderEntity();
		List<OrderEntity> orderEntities = arrayOfOrderEntity.getOrderEntity();

		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setOtaOrderNo("");// OTA 订单号
		orderEntity.setPmsConfirmNo("");// PMS 确认号
		orderEntity.setInterFaceSendID("");// 订单接口发送号。该号码为创建单/修改单/取消单 Request 中传过来的值
		orderEntity.setOrderStatus("");// 订单处理状态。（1：待确认,2：失败，3：确认，4：拒绝）
		RefuseMessage refuseMessage = new RefuseMessage();
		refuseMessage.setCode("");// 拒单代码（参考附件 2：拒单代码套系）
		refuseMessage.setMsg("");// 拒单描述 <RefuseMsg Code="123" Msg="全部满房"/>
		orderEntity.setRefuseMsg(refuseMessage);

		orderEntities.add(orderEntity);

		pushOrderStatusRQ.setOrders(arrayOfOrderEntity);

		OTAPushOrderStatusRS pushOrderStatusRS = serviceSoap.pmsOrderStatusPush(pushOrderStatusRQ);

		try {
			System.out.println(xml.writeValueAsString(pushOrderStatusRS));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 5.13. 获取厂商实时房量 *
	/*
	 * PMS/CRS 厂商通过该接口提供可售卖的真实房量。主要用于在可定检查接口中做房量校 验。 （注：入住通发起请求。返回参数与请求参数必须一致）
	 * 接口调用方：入住通 接口返回方：合作方
	 */

	// 6.1. 闪住入住/NoShow 通知
	/*
	 * 闪住订单的客人在酒店入住或订单 NoShow 时，PMS 将状态信息传给入住通，以供携程 结算组扣款参考。 接口调用方：合作方 接口返回方：入住通
	 */
	public static OrderCheckInNoticeRS OrderCheckInNoticeRQ(int hotel_id, int book_id, String order_number_ourter) throws Exception {
		HotelServiceImpl hotelServiceImpl = new HotelServiceImpl();
		// Hotel hotel = hotelServiceImpl.getHotel(hotel_id);
		List<Book> bookList;
		if (!order_number_ourter.equals("0")) {
			bookList = hotelServiceImpl.getBook(hotel_id, order_number_ourter);
		} else {
			bookList = hotelServiceImpl.getBook(hotel_id, book_id);
		}
		if (bookList == null)
			return null;
		int bookListSize = bookList.size();
		if (bookListSize == 0)
			return null;

		URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService(wsdlURL);
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();
		// ota.jw.PMSGateway.
		OrderCheckInNoticeRQ orderCheckInNoticeRQ = new OrderCheckInNoticeRQ();
		orderCheckInNoticeRQ.setOrderId(bookList.get(0).getBook_order_number_ourter());// OTA 订单号
		orderCheckInNoticeRQ.setHotelID(Config.hotelCodePrefix + hotel_id);// PMS 酒店代码
		orderCheckInNoticeRQ.setHtlConfirmNo(bookList.get(0).getBook_order_number() + "");// PMS 确认号

		ArrayOfOrderCheckIn allOrderCheckIn = new ArrayOfOrderCheckIn();
		List<OrderCheckIn> orderCheckIns = allOrderCheckIn.getOrderCheckIn();

		for (int i = 0; i < bookListSize; i++) {
			Book book = bookList.get(i);
			OrderCheckIn orderCheckIn = new OrderCheckIn();
			// 房间号（CheckInStatus=“InHouse，NoShow”时必填，NoShow 时房间号默认传 0）规
			String roomNo = book.getRoom_id() + "";
			orderCheckIn.setRoomNo(roomNo);
			// 入住状态（InHouse：入住, NoShow：NoShow
			if (book.getBook_order_number_status() == 1)
				orderCheckIn.setCheckInStatus("InHouse");
			if (book.getBook_order_number_status() == 4)
				orderCheckIn.setCheckInStatus("NoShow");
			orderCheckIn.setHtlConfirmNo(bookList.get(i).getBook_order_number() + "");
			orderCheckIns.add(orderCheckIn);
		}

		orderCheckInNoticeRQ.setOrderCheckInInfoList(allOrderCheckIn);

		OrderCheckInNoticeRS orderCheckInNoticeRS = serviceSoap.pmsInHouseNotice(orderCheckInNoticeRQ);
		// List<Object> result = orderCheckInNoticeRS.getSuccessOrWarningsOrErrors();

		String ota_result = xml.writeValueAsString(orderCheckInNoticeRS);
		logger.debug(ota_result);
		String request = xml.writeValueAsString(orderCheckInNoticeRQ);
		logger.debug(request);

		OtaServiceImpl.instent().saveDirectLog(hotel_id, "OrderCheckInNoticeRQ", "6.1. 闪住入住/NoShow 通知", request, ota_result);
		return orderCheckInNoticeRS;
	}

	// 6.2. 闪住离店扣款
	/*
	 * 闪住订单的客人在酒店离店时，PMS 将状态信息及结算信息传给入住通，以供携程结算 组扣款参考。 接口调用方：合作方 接口返回方：入住通
	 */
	public static OrderApplyPaymentRS OrderApplyPaymentRQ(int hotel_id, int book_id, String order_number_ourter) throws Exception {
		HotelServiceImpl hotelServiceImpl = new HotelServiceImpl();
		// Hotel hotel = hotelServiceImpl.getHotel(hotel_id);
		List<Book> bookList;
		if (!order_number_ourter.equals("0")) {
			bookList = hotelServiceImpl.getBook(hotel_id, order_number_ourter);
		} else {
			bookList = hotelServiceImpl.getBook(hotel_id, book_id);
		}
		if (bookList == null)
			return null;
		int bookListSize = bookList.size();
		if (bookListSize == 0)
			return null;

		URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService(wsdlURL);
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();
		OrderApplyPaymentRQ orderApplyPaymentRQ = new OrderApplyPaymentRQ();
		//
		OrderApplyPaymentRequestList orderApplyPaymentList = new OrderApplyPaymentRequestList();
		orderApplyPaymentList.setOrderId(bookList.get(0).getBook_order_number_ourter());// OTA 订单号
		orderApplyPaymentList.setHotelId(Config.hotelCodePrefix + hotel_id);// PMS 酒店代码 XHKJ-PMS-3
		//
		ArrayOfOrderApplyPaymentRequest allOrderApplyPaymentRequest = new ArrayOfOrderApplyPaymentRequest();
		List<OrderApplyPaymentRequest> orderApplyPaymentRequestList = allOrderApplyPaymentRequest.getOrderApplyPaymentRequest();
		//
		for (int i = 0; i < bookListSize; i++) {
			Book book = bookList.get(i);
			OrderApplyPaymentRequest orderApplyPaymentRequest = new OrderApplyPaymentRequest();
			orderApplyPaymentRequest.setHtlConfirmNo(bookList.get(0).getBook_order_number() + "");// PMS 确认号
			BigDecimal otherCost = new BigDecimal(book.getBook_cash_pledge_returns());
			orderApplyPaymentRequest.setOtherCost(otherCost);// 杂费金额
			orderApplyPaymentRequest.setArriveTime(book.getBook_check_in_actual() + "");// 实际入店时间（时间到 时分秒
			orderApplyPaymentRequest.setDepartureTime(book.getBook_check_out_actual() + "");// 实际离店时间（时间到 时分秒

			orderApplyPaymentRequest.setRoomNo(book.getRoom_id() + "");// 入住房间号

			orderApplyPaymentRequest.setClientName("");// 真实入住的客人姓名，可以为多个用逗号连
			orderApplyPaymentRequest.setCheckedOutStatus("CheckedOut");// 离店状态，CheckedOut 代表离店
			//
			orderApplyPaymentRequestList.add(orderApplyPaymentRequest);
			// 更新pms状态
			hotelServiceImpl.updateBook(hotel_id, book.getBook_id(), "CheckedOut");
		}

		//
		orderApplyPaymentList.setOrderApplyPaymentRequests(allOrderApplyPaymentRequest);
		//
		orderApplyPaymentRQ.setOrderApplyPaymentRequestList(orderApplyPaymentList);

		OrderApplyPaymentRS orderApplyPaymentRS = serviceSoap.pmsCheckedOutNotice(orderApplyPaymentRQ);
		// List<Object> result = orderApplyPaymentRS.getErrorsOrSuccessOrWarnings();

		String ota_result = xml.writeValueAsString(orderApplyPaymentRS);
		logger.debug(ota_result);
		String request = xml.writeValueAsString(orderApplyPaymentRQ);
		logger.debug(request);
		OtaServiceImpl.instent().saveDirectLog(hotel_id, "OrderApplyPaymentRQ", "6.2. 闪住离店扣款", request, ota_result);
		return orderApplyPaymentRS;

	}

}
