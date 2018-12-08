package ota.jw.test;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import ota.jw.AutoMappingWS.ArrayOfOnOffHotelInfo;
import ota.jw.AutoMappingWS.ArrayOfPMSHotelInfo;
import ota.jw.AutoMappingWS.ArrayOfPMSHotelMappingResult;
import ota.jw.AutoMappingWS.ArrayOfPMSProductInfo;
import ota.jw.AutoMappingWS.GetPmsInfo;
import ota.jw.AutoMappingWS.GetPmsInfoSoap;
import ota.jw.AutoMappingWS.NotifyOnOffInfoRS;
import ota.jw.AutoMappingWS.OnOffHotelInfo;
import ota.jw.AutoMappingWS.PMSHotelInfo;
import ota.jw.AutoMappingWS.PMSHotelMapingRS;
import ota.jw.AutoMappingWS.PMSHotelMappingResult;
import ota.jw.AutoMappingWS.PMSNotifyOTAModelRQ;
import ota.jw.AutoMappingWS.PMSProductInfo;
import ota.jw.AutoMappingWS.PmsHotelInfoRQ;
import ota.jw.AutoMappingWebAPI.ArrayOfHotelInfo;
import ota.jw.AutoMappingWebAPI.ArrayOfSearchProductInfo;
import ota.jw.AutoMappingWebAPI.AutoMappingServices;
import ota.jw.AutoMappingWebAPI.AutoMappingServicesSoap;
import ota.jw.AutoMappingWebAPI.CtripSubHotelInfoByEBKRQ;
import ota.jw.AutoMappingWebAPI.CtripSubHotelInfoByEBKRS;
import ota.jw.AutoMappingWebAPI.CtripSubHotelInfoRS;
import ota.jw.AutoMappingWebAPI.GetHotelInfoRQ;
import ota.jw.AutoMappingWebAPI.GetHotelInfoRS;
import ota.jw.AutoMappingWebAPI.MappingStatusSearchRQ;
import ota.jw.AutoMappingWebAPI.MappingStatusSearchRS;
import ota.jw.AutoMappingWebAPI.ProductMappingInfoRS;
import ota.jw.AutoMappingWebAPI.SearchProductInfo;
import ota.jw.AutoMappingWebAPI.SetMappingRQ;
import ota.jw.AutoMappingWebAPI.SetMappingRS;


public class TestGetPmsInfo {
	private static final QName SERVICE_NAME = new QName("http://www.opentravel.org/OTA/2003/05", "AutoMappingServices");
	protected static Logger logger = LoggerFactory.getLogger(TestGetPmsInfo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createHotel(); //ok
		GetCtripSubHotelInfoByEBK(); //ok
		//GetCtripSubHotelInfo(); //ok
		//GetRoomProductInfoRS();//ok
		//SetMappingInfo(); //ok
		//MappingStatusSearch();
		//GetHotelInfo();//異常  对方说不用
		
	}
	
	//创建酒店与产品
	public static void createHotel() {
		GetPmsInfo getPmsInfo = new GetPmsInfo();
		GetPmsInfoSoap getPmsInfoSoap = getPmsInfo.getGetPmsInfoSoap();
		PmsHotelInfoRQ pmsHotelInfoRQ = new PmsHotelInfoRQ();
		//hotel
		PMSHotelInfo hotel = new PMSHotelInfo();
		hotel.setHotelCode("XY-PMS_12122");//厂商酒店代码 
		hotel.setHotelGroupCode("XiaoYingKeJiTwoZero");//厂商路由组代码，由入住通提供固定值，1.0模式和 2.0 模式该值不同，需厂商区分 
		hotel.setHotelName("欣得酒店上地店");//厂商酒店酒店名称 
		hotel.setAddress("北京市海淀区上地-地铁站");
		hotel.setEmail("xinde@email.com");
		hotel.setHotelCityName("北京");
		hotel.setIsNewHotel("1");
		hotel.setProvinceCode("北京");
		hotel.setTelephone("1111");
		//hotel product
		PMSProductInfo product = new PMSProductInfo();
		product.setRoomTypeCode("2-10-35");//RoomTypeCode String Y 厂商房型代码 
		product.setRoomTypeName("1112");//厂商房型名称 
		//---
		product.setRatePlanCode("1");//厂商价格代码 
		product.setRatePlanName("标准");//厂商价格名称，例：携程标准价 
		//---
		product.setBalanceType("501");// 现预付类型： 501 预付、 16 -现付
		product.setChannel("CTRIP");//渠道，例：携程：CTRIP,艺龙：ELONG,去哪儿：QUNAR，赫程：EASYTRIP，同程：LY
		product.setPoductType("0");//0-正价，1-活动（不传默认正价） 
		product.setBookingAdvance("1");//提前预订天数		
		product.setNumberOfBreakfast("1");//早餐数：PoductType=0 时，此字段参数<0>无早餐；<1>单份早餐；<2>双份早餐；<3>三份早餐； <4> 四 份 早 餐 ； <5> 五 份 早 餐 。
		//PoductType=1 时，此字段参数<0>931910；<1>931775 ； <2>931779 ； <3>931781 ； <4>931783 ； <5>931784 ； <6>931785 ； <7>931788；<8>931791；<9>931792
		//----
		
		//CreatePromotionType  生成促销活动方式：Y-通过价格属性生成， F通过携程 RatePlanCode 生成。不填写默认=Y通过价格属性生成，PoductType=1 时此字段必填
		
		//HotelGroupRatePlanCode 促 销 活 动 Code ，PoductType=1,CreatePromotionType=F 时，此项必填 
		
		//PromotionID  活动 ID ， PoductType=1,CreatePromotionType=F 时，此项必填 
		
		ArrayOfPMSProductInfo pmsProductList = new ArrayOfPMSProductInfo();
		List<PMSProductInfo> productList = pmsProductList.getPMSProductInfo();
		productList.add(product);
		hotel.setPmsHotelProductInfos(pmsProductList);
		//add hotel
		ArrayOfPMSHotelInfo arrayOfPMSHotelInfo = new ArrayOfPMSHotelInfo();
		List<PMSHotelInfo> hotelList = arrayOfPMSHotelInfo.getPMSHotelInfo();
		hotelList.add(hotel);
		
		pmsHotelInfoRQ.setPMSBaseHotelInfos(arrayOfPMSHotelInfo);
		PMSHotelMapingRS pmsHotelMapingRS = getPmsInfoSoap.getAllPmsHotelInfo(pmsHotelInfoRQ);
		
		ArrayOfPMSHotelMappingResult mappingResult = pmsHotelMapingRS.getPMSHotelMappingResults();
		//System.out.println(pmsHotelMapingRS.getPMSHotelMappingResults());
		List<PMSHotelMappingResult> sfd = mappingResult.getPMSHotelMappingResult();
		System.out.println(sfd.get(0).isIsSuccess()+"---"+sfd.get(0).getMessage());
	}
	///////
	public static void NotifyOnOffInfoRS() {
		GetPmsInfo getPmsInfo = new GetPmsInfo();
		GetPmsInfoSoap getPmsInfoSoap = getPmsInfo.getGetPmsInfoSoap();
		PMSNotifyOTAModelRQ pmsNotifyOnOffInfoRQ = new PMSNotifyOTAModelRQ();
		ArrayOfOnOffHotelInfo arrayOfOnOffHotelInfo = new ArrayOfOnOffHotelInfo();
		List<OnOffHotelInfo> offHotelInfos = arrayOfOnOffHotelInfo.getOnOffHotelInfo();
		OnOffHotelInfo offHotelInfo = new OnOffHotelInfo();
		offHotelInfo.setHotelCode("");
		offHotelInfo.setHotelOnlineStatus("");
		//..........
		//..........
		offHotelInfos.add(offHotelInfo);
		
		pmsNotifyOnOffInfoRQ.setNotityOnoffInfos(arrayOfOnOffHotelInfo);
		NotifyOnOffInfoRS notifyOnOffInfoRS = getPmsInfoSoap.pmsNotifyOnOffline(pmsNotifyOnOffInfoRQ);
		
	}
	
	
	/****************************/
	//4.2. 通过 EBKEBKEBK账号获取携程子酒店信息 账号获取携程子酒店信息 账号获取携程子酒店信息 (单体 )
	public static void GetCtripSubHotelInfoByEBK() {
		XmlMapper xml = new XmlMapper();
		ObjectMapper mapper = new ObjectMapper();
		
		URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
        AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
        AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();
        
        CtripSubHotelInfoByEBKRQ ctripSubHotelInfoByEBKRQ = new CtripSubHotelInfoByEBKRQ();
        ctripSubHotelInfoByEBKRQ.setName("11785453");
        ctripSubHotelInfoByEBKRQ.setPassword("Jbst601-08");
                
		CtripSubHotelInfoByEBKRS subHotelInfoByEBKRS = servicesSoap.getCtripSubHotelInfoByEBK(ctripSubHotelInfoByEBKRQ);
		ArrayOfHotelInfo result = subHotelInfoByEBKRS.getHotelInfos();
		
		try {
			System.out.println(xml.writeValueAsString(ctripSubHotelInfoByEBKRQ));
			System.out.println(xml.writeValueAsString(result));
			System.out.println(mapper.writeValueAsString(result));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(result.getHotelInfo().get(0).getHotelName());
		//System.out.println(Serialize.objectToXml(result.getHotelInfo().get(0), HotelInfo.class));
		int s = subHotelInfoByEBKRS.getRetCode();
		System.out.println(s);
		//System.out.println(Serialize.objectToXml(subHotelInfoByEBKRS, CtripSubHotelInfoByEBKRS.class));
	}
	
	
	//4.3. 通过母酒店 通过母酒店 ID 获取携程子酒店信息 获取携程子酒店信息 (单体 )
	public static void GetCtripSubHotelInfo() {
		XmlMapper xml = new XmlMapper();
		ObjectMapper mapper = new ObjectMapper();
		URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
        AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
        AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();
        
        //masterHotelId  携程母酒店 ID，可支持多个，请用”,”分割 
		CtripSubHotelInfoRS ctripSubHotelInfoRS = servicesSoap.getCtripSubHotelInfo("444194");//masterHotelId 2205020
		try {
			System.out.println(xml.writeValueAsString(ctripSubHotelInfoRS));
			//System.out.println(mapper.writeValueAsString(ctripSubHotelInfoRS));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(Serialize.objectToXml(ctripSubHotelInfoRS, CtripSubHotelInfoRS.class));
	}
	
	//4.4. 通过 Brand/SupplierId 值获取携程子酒店信息(集团/代理商) /***異常***/ 【对方说可以不做】
	public static void GetHotelInfo() {
		XmlMapper xml = new XmlMapper();
		ObjectMapper mapper = new ObjectMapper();
		URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
        AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
        AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();
        
        GetHotelInfoRQ getHotelInfoRQ = new GetHotelInfoRQ();
        getHotelInfoRQ.setHotelGroupCode("XiaoYingKeJiTwoZero");//酒店组代码 
        getHotelInfoRQ.setCurrentPage(1);//当前页，默认为 1 
        getHotelInfoRQ.setBrand("");//集团 id，Brand, SupplierId 二选一
        getHotelInfoRQ.setSupplierId("");//代理商 id，Brand, SupplierId 二选一
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

	//4.5. 获取携程产品信息 
	public static void GetRoomProductInfoRS() {
		XmlMapper xml = new XmlMapper();
		ObjectMapper mapper = new ObjectMapper();
		URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
        AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
        AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();
		//{"501":"1479971","16":"132920"}
        String subHotelId = "132920";//携程子 酒店 ID 1479971 132920 。 不 超 过 5 个(001,002,003,004,005),英文逗号分隔  
		String type = "Unmapping";//请求类型。Mapping-匹配， Unmapping-未匹配
		ProductMappingInfoRS mappingInfoRS = servicesSoap.getRoomProductInfo(subHotelId, type);
		try {
			System.out.println(xml.writeValueAsString(mappingInfoRS));
			//System.out.println(mapper.writeValueAsString(mappingInfoRS));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//4.6. 设置 Mapping 关系 
	//设置与携程的 mapping.不支持直接修改产品匹配关系；若想修改匹配，请先删除再新增 的方式。 
	public static void SetMappingInfo() {
		XmlMapper xml = new XmlMapper();
		ObjectMapper mapper = new ObjectMapper();
		URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
        AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
        AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();
        
        SetMappingRQ setMappingRQ = new SetMappingRQ();
        setMappingRQ.setHotelCode("XY-PMS_12122");//厂商酒店代码 
        setMappingRQ.setRoomTypeCode("111");//厂商房型代码 
        setMappingRQ.setRatePlanCode("12");//厂商价格代码 
        //厂商路由组代码 
        setMappingRQ.setMasterHotelId("65678");//携程母酒店 ID 
        setMappingRQ.setSubHotelId("2205020");//携程子酒店代码 
        setMappingRQ.setSubRoomId("78118431");//携程子房型代码 
		//设置类型：1-新增,0-删除 
        setMappingRQ.setSetType(1);
        
		SetMappingRS mappingRS = servicesSoap.setMappingInfo(setMappingRQ);
		//返回代码。0 表示返回成功，其余均返回失败
		try {
			System.out.println(xml.writeValueAsString(mappingRS));
			System.out.println(mapper.writeValueAsString(mappingRS));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//4.7. 通知厂商绑定结果 PMSNotifyOnOffline //webService實現
	public static void NotifyOnOffInfo() {
	}
	
	//4.8  产品审核结果查询 
	public static void MappingStatusSearch() {
		XmlMapper xml = new XmlMapper();
		URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
        AutoMappingServices services = new AutoMappingServices(wsdlURL, SERVICE_NAME);
        AutoMappingServicesSoap servicesSoap = services.getAutoMappingServicesSoap();
        
        MappingStatusSearchRQ searchRQ = new MappingStatusSearchRQ();
        searchRQ.setHotelCode("XHKJ-PMS-2");//厂商酒店代码，支持多个，英文逗号分隔”,” 
        searchRQ.setSubHotelId("425162");//携程子酒店 ID，支持多个，英文逗号分隔”,” 
        
		ArrayOfSearchProductInfo arrayOfSearchProductInfo = new ArrayOfSearchProductInfo();//厂商产品信息，
		//传值即可查询指定产品的匹配状态(如果酒店审核成功，productInfo=null默认返回全部产品匹配结果) 
		List<SearchProductInfo> searchProductInfo = arrayOfSearchProductInfo.getSearchProductInfo();
		SearchProductInfo productInfo = new SearchProductInfo();
		productInfo.setRatePlanCode("1");//厂商价格代码 
		productInfo.setRoomTypeCode("2-10-35");//厂商房型代码 
		searchProductInfo.add(productInfo);
		
		searchRQ.setSearchProductInfos(arrayOfSearchProductInfo);
		
		MappingStatusSearchRS mappingRS = servicesSoap.mappingStatusSearch(searchRQ);
		try {
			System.out.println(xml.writeValueAsString(mappingRS));
			//System.out.println(mapper.writeValueAsString(mappingRS));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}









