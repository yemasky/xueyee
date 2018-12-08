package ota.jw.test;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import core.util.Serialize;
import ota.jw.ARIPmsGateway.ARIGateWayService;
import ota.jw.ARIPmsGateway.ARIGateWayServiceSoap;
import ota.jw.ARIPmsGateway.ArrayOfDestinationSystemCodesTypeDestinationSystemCode;
import ota.jw.ARIPmsGateway.ArrayOfDestinationSystemCodesTypeDestinationSystemCode.DestinationSystemCode;
import ota.jw.ARIPmsGateway.AvailStatusMessageType;
import ota.jw.ARIPmsGateway.AvailStatusMessageType.RestrictionStatus;
import ota.jw.ARIPmsGateway.AvailabilityStatusType;
import ota.jw.ARIPmsGateway.OTAHotelAvailNotifRQ;
import ota.jw.ARIPmsGateway.OTAHotelAvailNotifRS;
import ota.jw.ARIPmsGateway.OTAHotelRatePlanNotifRQ;
import ota.jw.ARIPmsGateway.StatusApplicationControlType;



public class TestARIGetPmsInfo {

	private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "ARIGateWayService");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OTA_HotelAvailNotifRQ(); //ok
		
		
	}
	
	//5.2. 房态推送[ARI 规则] OTA_HotelAvailNotifRQ 
	public static void OTA_HotelAvailNotifRQ () {
		URL wsdlURL = ARIGateWayService.WSDL_LOCATION;

        ARIGateWayService service = new ARIGateWayService(wsdlURL, SERVICE_NAME);//
        ARIGateWayServiceSoap serviceSoap = service.getARIGateWayServiceSoap();	//soap service

        OTAHotelAvailNotifRQ availNotifRQ = new  OTAHotelAvailNotifRQ();
        
        OTAHotelAvailNotifRQ.AvailStatusMessages availStatusMessages = new OTAHotelAvailNotifRQ.AvailStatusMessages();
        availStatusMessages.setHotelCode("XY-PMS_12122");//PMS 酒店代码 
        List<AvailStatusMessageType> statusMessage = availStatusMessages.getAvailStatusMessage();//构造AvailStatusMessageType
        
        //构造applicationControlType
  		StatusApplicationControlType applicationControlType = new StatusApplicationControlType();
  		//2 3
  		applicationControlType.setStart("2018-08-22");//房态生效开始时间 
  		applicationControlType.setEnd("2018-12-22");//房态生效结束时间 
  		//InvTypeCode String Y PMS 房型代码 
  		List<String> invTypeCode = applicationControlType.getInvTypeCode();
  		invTypeCode.add("111");// 房型代码 
  		applicationControlType.setRatePlanCode("12");//价格代码，参考附件 1：《价格代码套系》 
  		applicationControlType.setMon(false);
  		applicationControlType.setTue(false);
  		applicationControlType.setWeds(false);
  		applicationControlType.setThur(false);
  		applicationControlType.setFri(false);
  		applicationControlType.setSat(false);
  		applicationControlType.setSun(true);
  		//DestinationSystemCode
  		/*
  		 * 渠道代码（携程：CTRIP,艺龙：ELONG,去哪儿：QUNAR） 该节点支持 1 个或多个，表示分别控制已上线的不同渠道房态 
  		 */
  		ArrayOfDestinationSystemCodesTypeDestinationSystemCode destinationCode = new ArrayOfDestinationSystemCodesTypeDestinationSystemCode() ;
  		List<DestinationSystemCode> destinationSystemCodes = destinationCode.getDestinationSystemCode();
  		DestinationSystemCode destinationSystemCode =new DestinationSystemCode();
  		destinationSystemCode.setValue("CTRIP");
  		destinationSystemCodes.add(destinationSystemCode);
  		applicationControlType.setDestinationSystemCodes(destinationCode);
  		//Restriction String Y 默认填 Master 
  		RestrictionStatus restrictionStatus = new RestrictionStatus();
  		restrictionStatus.setRestriction("Master");
  		//Statu
  		restrictionStatus.setStatus(AvailabilityStatusType.OPEN);
  		//
  		AvailStatusMessageType messageType = new AvailStatusMessageType();
  		messageType.setStatusApplicationControl(applicationControlType);//设置applicationControlType
  		messageType.setRestrictionStatus(restrictionStatus);
  		Integer holdDeadline = new Integer(100);
		messageType.setHoldDeadline(holdDeadline);//保留时间 ，【现付产品使用】9999 无规定，1000-10:00,...,2330-23:30
		Integer num = new Integer(10);
		messageType.setUserLimited(num);//担保类型：【现付产品使用】2-超时担保,3-一律担保,9999-无限制
		messageType.setReserveTime(num);//保留房最晚预订时间， 小时数，例如 1 为一小时 ；计算公式：订单入住日 24 点向后推算，如果设置为 6，则当天保留房最晚预订时间为 24 点向后倒推 6 小时，为 18 点。如果设置为 36，则保留房最晚 
		//预订时间为 24 点向后倒推 36 小时，表示入住日前一天的中午 12 
		messageType.setRoomsInv(num);//临时保留房总数 
		messageType.setGuarantee("");//担保，默认：空字符
		messageType.setGuaranteeLCT(num);//担保最晚取消时间，【现付产品使用】小时数，计算公式同 ReserveTime，不可取消设置为23988 PrepayLCT 
		messageType.setAllNeedGuarantee("F");//Y 【现付产品使用】 需要担保的类型：【现付产品使用】全额/峰时担保(F-否,T-全额担保,B-峰时担保) 
		messageType.setLateReserveTime(num);//订单最晚预订时间，订单最晚预订时间 
		messageType.setDeductType("C");//预付房型扣款类型。【预付产品使用】(C-全部扣款,F-首日扣款) 
		messageType.setBlanceType("PP");//支付类型：PP 预付， FG 现付，PKG 包价 
		messageType.setMaxRoomQuantity(num);//最大预订间数 
		messageType.setEarliestArriveTime(num);//【小时房】最早预订时间,例如 08:00 earliestArriveTime=8*60+0=480 
		messageType.setLatestArriveTime(num);//【小时房】最晚预订时间,例如 08:00 earliestArriveTime=8*60+0=480 
		messageType.setDuringTime(num);//【小时房】连住小时数 
		
  		statusMessage.add(messageType);//设置messageType
        
  		availNotifRQ.setAvailStatusMessages(availStatusMessages);
  		  		
        OTAHotelAvailNotifRS availNotifRS = serviceSoap.otaHotelAvailNotifRQ(availNotifRQ);
        List<Object> result = availNotifRS.getErrorsOrWarningsOrSuccess();
        System.out.println(result);
        System.out.println(Serialize.objectToXml(availNotifRS, OTAHotelAvailNotifRS.class));
		
	}

	public static void OTA_HotelRatePlanNotifRQ() {
		URL wsdlURL = ARIGateWayService.WSDL_LOCATION;

        ARIGateWayService service = new ARIGateWayService(wsdlURL, SERVICE_NAME);
        ARIGateWayServiceSoap serviceSoap = service.getARIGateWayServiceSoap();	

        OTAHotelRatePlanNotifRQ ratePlanNotifRQ = new  OTAHotelRatePlanNotifRQ();
        
        
        
	}
}









