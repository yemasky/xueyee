package ota.jw.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import core.util.Serialize;
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
import ota.jw.PMSGateway.MessageAcknowledgementType;
import ota.jw.PMSGateway.OTAHotelAvailNotifRQ;
import ota.jw.PMSGateway.OTAHotelAvailNotifRS;
import ota.jw.PMSGateway.OTAHotelInvCountNotifRQ;
import ota.jw.PMSGateway.OTAHotelInvCountNotifRS;
import ota.jw.PMSGateway.OTAHotelRatePlanNotifRQ;
import ota.jw.PMSGateway.OTAHotelRatePlanNotifRS;
import ota.jw.PMSGateway.OTAHotelStayInfoNotifRQ;
import ota.jw.PMSGateway.OTAHotelStayInfoNotifRS;
import ota.jw.PMSGateway.OTANotifReportRQ;
import ota.jw.PMSGateway.OTANotifReportRQ.NotifDetails;
import ota.jw.PMSGateway.OTANotifReportRQ.NotifDetails.HotelNotifReport;
import ota.jw.PMSGateway.OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages;
import ota.jw.PMSGateway.OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations;
import ota.jw.PMSGateway.OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation;
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
import ota.jw.PMSGateway.TimeUnitType;

public class TestEBKGetPmsInfo {
	protected static XmlMapper xml = new XmlMapper();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// createHotel(); //ok
		// OTA_HotelAvailNotifRQ(); //房态推送[ok
		// OTA_HotelRatePlanNotifRQ(); //ok
		// OTA_HotelInvCountNotifRQ();
		// OrderCheckInNoticeRQ();//6.1. 闪住入住/NoShow 通知
		// OrderApplyPaymentRQ();//6.2. 闪住离店扣款

		// OTA_HotelStayInfoNotifRQ();//订单确认

		OrderCheckInNoticeRQ();// 闪住
		// OrderApplyPaymentRQ();//闪住离店扣款

	}

//======================================================//	
	// 5.交易直连接口
	// 5.1. 房态推送[EBK 规则] OTA_HotelAvailNotifRQ
	//
	public static void OTA_HotelAvailNotifRQ() {
		PMSGatewayService service = new PMSGatewayService();
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();

		OTAHotelAvailNotifRQ hotelAvailNotifRQ = new OTAHotelAvailNotifRQ();// 构建RQ ?

		OTAHotelAvailNotifRQ.AvailStatusMessages availStatusMessages = new OTAHotelAvailNotifRQ.AvailStatusMessages();
		// 1
		availStatusMessages.setHotelCode("XHKJ-PMS-2");// PMS 酒店代码

		List<AvailStatusMessageType> statusMessage = availStatusMessages.getAvailStatusMessage();// 构造AvailStatusMessageType

		// 构造applicationControlType
		StatusApplicationControlType applicationControlType = new StatusApplicationControlType();
		// 2 3
		applicationControlType.setStart("2018-08-22");// 房态生效开始时间
		applicationControlType.setEnd("2018-12-22");// 房态生效结束时间
		// InvTypeCode String Y PMS 房型代码
		List<String> invTypeCode = applicationControlType.getInvTypeCode();
		invTypeCode.add("2-10-35");// 房型代码
		applicationControlType.setRatePlanCode("1");// 价格代码，参考附件 1：《价格代码套系》
		applicationControlType.setMon(false);
		applicationControlType.setTue(false);
		applicationControlType.setWeds(false);
		applicationControlType.setThur(false);
		applicationControlType.setFri(false);
		applicationControlType.setSat(false);
		applicationControlType.setSun(true);
		// DestinationSystemCode
		/*
		 * 渠道代码（携程：CTRIP,艺龙：ELONG,去哪儿：QUNAR） 该节点支持 1 个或多个，表示分别控制已上线的不同渠道房态
		 */
		ArrayOfDestinationSystemCodesTypeDestinationSystemCode dCode = new ArrayOfDestinationSystemCodesTypeDestinationSystemCode();
		List<DestinationSystemCode> destinationSystemCodes = dCode.getDestinationSystemCode();
		DestinationSystemCode destinationSystemCode = new DestinationSystemCode();
		destinationSystemCode.setValue("CTRIP");
		destinationSystemCodes.add(destinationSystemCode);
		applicationControlType.setDestinationSystemCodes(dCode);
		// Restriction String Y 默认填 Master
		RestrictionStatus restrictionStatus = new RestrictionStatus();
		restrictionStatus.setRestriction("Master");
		// Statu
		restrictionStatus.setStatus(AvailabilityStatusType.OPEN);

		AvailStatusMessageType messageType = new AvailStatusMessageType();
		messageType.setStatusApplicationControl(applicationControlType);// 设置applicationControlType
		messageType.setRestrictionStatus(restrictionStatus);
		statusMessage.add(messageType);// 设置messageType

		hotelAvailNotifRQ.setAvailStatusMessages(availStatusMessages);

		OTAHotelAvailNotifRS otaHotelAvailNotifRS = serviceSoap.otaHotelAvailNotifRQ(hotelAvailNotifRQ);
		List<Object> result = otaHotelAvailNotifRS.getErrorsOrWarningsOrSuccess();
		System.out.println(result);
		System.out.println(Serialize.objectToXml(otaHotelAvailNotifRS, OTAHotelAvailNotifRS.class));
	}

	// 5.3. 房价推送[EBK 规则] OTA_HotelRatePlanNotifRQ

	public static void OTA_HotelRatePlanNotifRQ() {
		PMSGatewayService service = new PMSGatewayService();
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();

		OTAHotelRatePlanNotifRQ ratePlanNotifRQ = new OTAHotelRatePlanNotifRQ();
		OTAHotelRatePlanNotifRQ.RatePlans ratePlans = new OTAHotelRatePlanNotifRQ.RatePlans();

		ratePlans.setHotelCode("XHKJ-PMS-2");// PMS 酒店代码
		List<HotelRatePlanType> ratePlanTypes = ratePlans.getRatePlan();// 价格代码，参考入住通提供的标准价格代码套系，见附件 2《价格代码套系》

		HotelRatePlanType ratePlanType = new HotelRatePlanType();
		ratePlanType.setRatePlanCode("1");// XCBAR 携程标准价
		ratePlanType.setStart("2018-07-01");
		ratePlanType.setEnd("2018-12-31");
		ratePlanType.setCurrencyCode("RMB");
		//
		// ArrayOfHotelRatePlanTypeRate rates = ratePlanType.getRates();
		ArrayOfHotelRatePlanTypeRate rates = new ArrayOfHotelRatePlanTypeRate();
		List<Rate> rateList = rates.getRate();
		Rate rate = new Rate();
		rate.setStart("2018-07-01");
		rate.setEnd("2018-12-31");
		rate.setSat(true);
		rate.setSun(true);
		rate.setMon(true);
		rate.setTue(true);
		rate.setWeds(true);
		rate.setThur(true);
		rate.setFri(true);
		rate.setRateTimeUnit(TimeUnitType.DAY);
		rate.setInvTypeCode("2-10-35");// PMS 房型代码
		rate.setCurrencyCode("RMB");
		rateList.add(rate);

		//
		// ArrayOfRateUploadTypeBaseByGuestAmt baseByGuestAmt =
		// rate.getBaseByGuestAmts();
		ArrayOfRateUploadTypeBaseByGuestAmt baseByGuestAmt = new ArrayOfRateUploadTypeBaseByGuestAmt();
		List<BaseByGuestAmt> guestAmtList = baseByGuestAmt.getBaseByGuestAmt();
		BaseByGuestAmt guestAmt = new BaseByGuestAmt();
		BigInteger numOfGuests = new BigInteger("2");
		guestAmt.setNumberOfGuests(numOfGuests);
		guestAmt.setAgeQualifyingCode("10");
		BigDecimal amount = new BigDecimal("96");
		guestAmt.setAmountBeforeTax(amount);
		amount = new BigDecimal("10");
		guestAmt.setAmountAfterTax(amount);
		guestAmtList.add(guestAmt);
		//
		rate.setBaseByGuestAmts(baseByGuestAmt);
		//
		MealsIncluded mealsIncluded = new MealsIncluded();
		mealsIncluded.setBreakfast(true);
		mealsIncluded.setNumberOfBreakfast("2");
		rate.setMealsIncluded(mealsIncluded);
		//
		rateList.add(rate);
		//
		ratePlanType.setRates(rates);
		//
		ratePlanTypes.add(ratePlanType);
		//
		ratePlanNotifRQ.setRatePlans(ratePlans);

		OTAHotelRatePlanNotifRS ratePlanNotifRS = serviceSoap.otaHotelRatePlanNotifRQ(ratePlanNotifRQ);
		List<Object> result = ratePlanNotifRS.getSuccessOrWarningsOrErrors();
		System.out.println(Serialize.objectToXml(ratePlanNotifRS, OTAHotelRatePlanNotifRS.class));
		System.out.println(result.get(0));
	}

	// 5.5. 房量 推送K [EBK 规则] ]
	public static void OTA_HotelInvCountNotifRQ() {
		PMSGatewayService service = new PMSGatewayService();
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();

		OTAHotelInvCountNotifRQ invCountNotifRQ = new OTAHotelInvCountNotifRQ();
		//
		InvCountType invCountType = new InvCountType();// invCountNotifRQ.getInventories();
		invCountType.setHotelCode("XHKJ-PMS-2");// PMS 酒店代码
		//
		List<BaseInvCountType> baseInvCountTypes = invCountType.getInventory();
		BaseInvCountType baseInvCountType = new BaseInvCountType();
		//
		StatusApplicationControlType applicationControlType = new StatusApplicationControlType();
		applicationControlType.setStart("2018-07-25");// 房量生效开始时间
		applicationControlType.setEnd("2018-09-25");// 房量生效结束时间
		List<String> invTypeCode = applicationControlType.getInvTypeCode();// PMS 房型代码
		invTypeCode.add("2-10-35");// PMS 房型代码

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
		BigInteger count = new BigInteger("17");
		invCount.setCount(count);// 房量值
		invCounts.add(invCount);
		//
		baseInvCountType.setInvCounts(arrayOfBaseInvCountTypeInvCount);
		//
		baseInvCountTypes.add(baseInvCountType);
		//
		invCountNotifRQ.setInventories(invCountType);
		//
		OTAHotelInvCountNotifRS invCountNotifRS = serviceSoap.otaHotelInvCountNotifRQ(invCountNotifRQ);

		System.out.println(Serialize.objectToXml(invCountNotifRS, OTAHotelInvCountNotifRS.class));
	}

	// ***************************************//
	// ***************************************//
	// 5.7
	/*
	 * CheckAvailability() { 由入住通向 PMS 发起请求，检查是否有可预订房间。该请求由渠道实时发起，请求量较 大。 接口调用方：入住通
	 * 接口返回方：合作方
	 */
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
	public static void OTA_HotelStayInfoNotifRQ() {
		URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService();
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();
		// A. 入住审核
		OTAHotelStayInfoNotifRQ hotelStayInfoNotifRQ = new OTAHotelStayInfoNotifRQ();

		StayInfosType stayInfosType = new StayInfosType();
		List<StayInfoType> stayInfoTypes = stayInfosType.getStayInfo();

		StayInfoType stayInfoType = new StayInfoType();
		HotelReservationType reservationType = new HotelReservationType();

		// 订单审核状态， PMS 取消:Cancelled ；已入住：InHouse ；已离店：CheckedOut ；未入住：NoShow；
		// 注：若 OTA 发起取消的订单，仍然需要返回审核状
		reservationType.setResStatus("InHouse");

		// RoomStays
		ArrayOfRoomStaysTypeRoomStay allOfRoomStaysTypeRoomStay = new ArrayOfRoomStaysTypeRoomStay();

		List<RoomStay> roomStays = allOfRoomStaysTypeRoomStay.getRoomStay();

		RoomStay roomStay = new RoomStay();
		BasicPropertyInfoType basicPropertyInfoType = new BasicPropertyInfoType();
		basicPropertyInfoType.setHotelCode("XHKJ-PMS-3");// PMS 酒店代码
		basicPropertyInfoType.setHotelName("欣得酒店");// PMS 酒店名称
		roomStay.setBasicPropertyInfo(basicPropertyInfoType);

		DateTimeSpanType dateTimeSpanType = new DateTimeSpanType();
		dateTimeSpanType.setStart("2018-08-13");// 实际入住时间（ResStatus=InHouse/CheckedOut时必填）
		// dateTimeSpanType.setEnd("2018-08-09");//实际离店时间（ResStatus=CheckedOut 时必填）
		roomStay.setTimeSpan(dateTimeSpanType);

		ArrayOfRoomTypeType arrayOfRoomTypeType = new ArrayOfRoomTypeType();
		List<RoomTypeType> roomTypeTypes = arrayOfRoomTypeType.getRoomType();
		RoomTypeType roomTypeType = new RoomTypeType();
		roomTypeType.setRoomTypeCode("3-13-14");// PMS 房型代码
		// 入住房间号（ResStatus=InHouse/CheckedOut/Cancelled/NoShow 时必填，NoShow 的值默认为0）
		roomTypeType.setRoomNo("2103");
		roomTypeType.setRoomID("2102");//
		roomTypeType.setRoomTab("2101");// 订单内每间房的唯一标识号或每间房的 PMS 订单确认号（不允许更改）
		roomTypeTypes.add(roomTypeType);
		roomStay.setRoomTypes(arrayOfRoomTypeType);

		roomStays.add(roomStay);
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
		giveName.add("三丰");// 名
		personNameType.setSurname("张");// 姓
		personNameTypes.add(personNameType);
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
		hotelReservationID.setResIDValue("XYKJ00033");// OTA 订单号值/PMS 确认号值，对应 ResID_Type
		hotelReservationIDs.add(hotelReservationID);
		resGlobalInfoType.setHotelReservationIDs(arrayHotelReservationID);

		reservationType.setResGlobalInfo(resGlobalInfoType);
		// end ResGlobalInf

		stayInfoType.setHotelReservation(reservationType);
		stayInfoTypes.add(stayInfoType);

		hotelStayInfoNotifRQ.setStayInfos(stayInfosType);

		OTAHotelStayInfoNotifRS hotelStayInfoNotifRS = serviceSoap.otaHotelStayInfoNotifRQ(hotelStayInfoNotifRQ);

		// System.out.println(Serialize.objectToXml(hotelStayInfoNotifRS,
		// OTAHotelStayInfoNotifRS.class));
		try {
			System.out.println(xml.writeValueAsString(hotelStayInfoNotifRS));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 5.12. 订单确认通知
	/*
	 * PMS/CRS 将待确认的订单酒店确认后的结果推送给入住通。 接口调用方：合作方 接口返回方：入住通
	 */
	public static void UpdatePulledReservations() {
		URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService();
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
	public static void OrderCheckInNoticeRQ() {
		// URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService();
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();
		// ota.jw.PMSGateway.
		OrderCheckInNoticeRQ orderCheckInNoticeRQ = new OrderCheckInNoticeRQ();
		orderCheckInNoticeRQ.setOrderId("XYKJ00033");// OTA 订单号
		orderCheckInNoticeRQ.setHotelID("XHKJ-PMS-3");// PMS 酒店代码
		orderCheckInNoticeRQ.setHtlConfirmNo("1808070028");// PMS 确认号

		ArrayOfOrderCheckIn allOrderCheckIn = new ArrayOfOrderCheckIn();
		List<OrderCheckIn> orderCheckIns = allOrderCheckIn.getOrderCheckIn();

		for (int i = 0; i < 1; i++) {
			OrderCheckIn orderCheckIn = new OrderCheckIn();
			// 房间号（CheckInStatus=“InHouse，NoShow”时必填，NoShow 时房间号默认传 0）规
			String  roomNo = (4003 + i) + "";
			orderCheckIn.setRoomNo(roomNo);
			// 入住状态（InHouse：入住, NoShow：NoShow
			if(i == 0) orderCheckIn.setCheckInStatus("InHouse");
			if(i == 1) orderCheckIn.setCheckInStatus("NoShow");
			orderCheckIn.setHtlConfirmNo("1808070028");
			orderCheckIns.add(orderCheckIn);
		}

		orderCheckInNoticeRQ.setOrderCheckInInfoList(allOrderCheckIn);

		OrderCheckInNoticeRS orderCheckInNoticeRS = serviceSoap.pmsInHouseNotice(orderCheckInNoticeRQ);
		List<Object> result = orderCheckInNoticeRS.getSuccessOrWarningsOrErrors();
		try {
			System.out.println(xml.writeValueAsString(orderCheckInNoticeRS));
			System.out.println(xml.writeValueAsString(result));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 6.2. 闪住离店扣款
	/*
	 * 闪住订单的客人在酒店离店时，PMS 将状态信息及结算信息传给入住通，以供携程结算 组扣款参考。 接口调用方：合作方 接口返回方：入住通
	 */
	public static void OrderApplyPaymentRQ() {
		// URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
		PMSGatewayService service = new PMSGatewayService();
		PMSGatewayServiceSoap serviceSoap = service.getPMSGatewayServiceSoap();
		OrderApplyPaymentRQ orderApplyPaymentRQ = new OrderApplyPaymentRQ();
		//
		OrderApplyPaymentRequestList orderApplyPaymentList = new OrderApplyPaymentRequestList();
		orderApplyPaymentList.setOrderId("XYKJ00027");// OTA 订单号
		orderApplyPaymentList.setHotelId("XHKJ-PMS-3");// PMS 酒店代码 XHKJ-PMS-3
		//
		ArrayOfOrderApplyPaymentRequest allOrderApplyPaymentRequest = new ArrayOfOrderApplyPaymentRequest();
		List<OrderApplyPaymentRequest> orderApplyPaymentRequestList = allOrderApplyPaymentRequest.getOrderApplyPaymentRequest();
		//
		for (int i = 0; i < 2; i++) {
			OrderApplyPaymentRequest orderApplyPaymentRequest = new OrderApplyPaymentRequest();
			orderApplyPaymentRequest.setHtlConfirmNo("1808070022");// PMS 确认号
			BigDecimal otherCost = new BigDecimal(0);
			if (i == 0) {
				otherCost = new BigDecimal(50);
			}
			orderApplyPaymentRequest.setOtherCost(otherCost);// 杂费金额
			orderApplyPaymentRequest.setArriveTime("2018-08-10 14:00:00");// 实际入店时间（时间到 时分秒
			orderApplyPaymentRequest.setDepartureTime("2018-08-11 12:00:00");// 实际离店时间（时间到 时分秒

			if (i == 0)
				orderApplyPaymentRequest.setRoomNo("1703");// 入住房间号
			if (i == 1)
				orderApplyPaymentRequest.setRoomNo("1803");// 入住房间号
			if (i == 2)
				orderApplyPaymentRequest.setRoomNo("1804");// 入住房间号
			if (i == 3)
				orderApplyPaymentRequest.setRoomNo("1805");// 入住房间号
			orderApplyPaymentRequest.setClientName("某某");// 真实入住的客人姓名，可以为多个用逗号连
			orderApplyPaymentRequest.setCheckedOutStatus("CheckedOut");// 离店状态，CheckedOut 代表离店
			//
			orderApplyPaymentRequestList.add(orderApplyPaymentRequest);
		}

		//
		orderApplyPaymentList.setOrderApplyPaymentRequests(allOrderApplyPaymentRequest);
		//
		orderApplyPaymentRQ.setOrderApplyPaymentRequestList(orderApplyPaymentList);

		OrderApplyPaymentRS orderApplyPaymentRS = serviceSoap.pmsCheckedOutNotice(orderApplyPaymentRQ);
		List<Object> result = orderApplyPaymentRS.getErrorsOrSuccessOrWarnings();
		try {
			System.out.println(xml.writeValueAsString(orderApplyPaymentRS));
			System.out.println(xml.writeValueAsString(result));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
