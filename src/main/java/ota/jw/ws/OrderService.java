package ota.jw.ws;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.OTA.config.Config;
import com.OTA.model.BookMultipleData;
import com.OTA.model.BookRoomData;
import com.OTA.model.CheckAvailability_result;
import com.OTA.model.Date_price;
import com.OTA.model.Room_layout_price;
import com.OTA.model.Service_pkg;
import com.OTA.model.Entity.Book;
import com.OTA.model.Entity.Hotel;
import com.OTA.model.Entity.Room_layout;
import com.OTA.model.Entity.Room_layout_price_system;
import com.OTA.model.Entity.Room_layout_price_system_direct;
import com.OTA.service.impl.HotelServiceImpl;
import com.OTA.service.impl.OtaServiceImpl;
import com.OTA.service.impl.PmsServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import core.util.Serialize;
import ota.jw.GenericSeamlessGateway.ArrayOfHotelReservationIDsTypeHotelReservationID;
import ota.jw.GenericSeamlessGateway.ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID;
import ota.jw.GenericSeamlessGateway.ArrayOfProfilesTypeProfileInfo;
import ota.jw.GenericSeamlessGateway.ArrayOfProfilesTypeProfileInfo.ProfileInfo;
import ota.jw.GenericSeamlessGateway.ArrayOfRatePlanType;
import ota.jw.GenericSeamlessGateway.ArrayOfRateTypeRate;
import ota.jw.GenericSeamlessGateway.ArrayOfRateTypeRate.Rate;
import ota.jw.GenericSeamlessGateway.ArrayOfResGuestType;
import ota.jw.GenericSeamlessGateway.ArrayOfRoomStayCandidateType;
import ota.jw.GenericSeamlessGateway.ArrayOfRoomStaysTypeRoomStay;
import ota.jw.GenericSeamlessGateway.ArrayOfRoomTypeType;
import ota.jw.GenericSeamlessGateway.ArrayOfSourceType;
import ota.jw.GenericSeamlessGateway.ArrayOfSpecialRequestTypeSpecialRequest;
import ota.jw.GenericSeamlessGateway.ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest;
import ota.jw.GenericSeamlessGateway.AvailRequestSegmentsType.AvailRequestSegment;
import ota.jw.GenericSeamlessGateway.AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria;
import ota.jw.GenericSeamlessGateway.BasicPropertyInfoType;
import ota.jw.GenericSeamlessGateway.CustomerType;
import ota.jw.GenericSeamlessGateway.DateTimeSpanType;
import ota.jw.GenericSeamlessGateway.ErrorType;
import ota.jw.GenericSeamlessGateway.ErrorsType;
import ota.jw.GenericSeamlessGateway.FormattedTextTextType;
import ota.jw.GenericSeamlessGateway.GuaranteeType;
import ota.jw.GenericSeamlessGateway.GuestCountType;
import ota.jw.GenericSeamlessGateway.GuestCountType.GuestCount;
import ota.jw.GenericSeamlessGateway.HotelReservationsType;
import ota.jw.GenericSeamlessGateway.HotelReservationsType.HotelReservation;
import ota.jw.GenericSeamlessGateway.HotelSearchCriteriaType.Criterion;
import ota.jw.GenericSeamlessGateway.HotelSearchCriterionType.RatePlanCandidates;
import ota.jw.GenericSeamlessGateway.ItemSearchCriterionType.HotelRef;
import ota.jw.GenericSeamlessGateway.OTAHotelAvailRQ;
import ota.jw.GenericSeamlessGateway.OTAHotelAvailRQ.AvailRequestSegments;
import ota.jw.GenericSeamlessGateway.OTAHotelAvailRS;
import ota.jw.GenericSeamlessGateway.OTAHotelAvailRS.RoomStays;
import ota.jw.GenericSeamlessGateway.OTAHotelAvailRS.RoomStays.RoomStay;
import ota.jw.GenericSeamlessGateway.OTAHotelResRQ;
import ota.jw.GenericSeamlessGateway.OTAHotelResRS;
import ota.jw.GenericSeamlessGateway.ParagraphType;
import ota.jw.GenericSeamlessGateway.PersonNameType;
import ota.jw.GenericSeamlessGateway.ProfileType;
import ota.jw.GenericSeamlessGateway.RatePlanCandidatesType.RatePlanCandidate;
import ota.jw.GenericSeamlessGateway.RatePlanType;
import ota.jw.GenericSeamlessGateway.ResGlobalInfoType;
import ota.jw.GenericSeamlessGateway.ResGuestType;
import ota.jw.GenericSeamlessGateway.RoomStayCandidateType;
import ota.jw.GenericSeamlessGateway.RoomStayType.RoomRates;
import ota.jw.GenericSeamlessGateway.RoomStayType.RoomRates.RoomRate;
import ota.jw.GenericSeamlessGateway.RoomTypeType;
import ota.jw.GenericSeamlessGateway.SourceType;
import ota.jw.GenericSeamlessGateway.SourceType.RequestorID;
import ota.jw.impl.JwPMSGatewayImpl;
import ota.jw.GenericSeamlessGateway.SuccessType;
import ota.jw.GenericSeamlessGateway.TotalType;
import ota.jw.GenericSeamlessGateway.TransactionActionType;
import ota.jw.GenericSeamlessGateway.TransactionStatusType;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "ServiceSoap")
@XmlSeeAlso({ ota.jw.GenericSeamlessGateway.ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class OrderService {
	protected static Logger logger = LoggerFactory.getLogger(OrderService.class);
	protected static XmlMapper xml = new XmlMapper();
	protected static ObjectMapper mapper = new ObjectMapper();
	private static Endpoint orderEndpoint = null;

	public static void startOtaServer() {
		if (orderEndpoint == null) {
			OrderService order = new OrderService();
			orderEndpoint = Endpoint.publish("http://localhost:8888/order", order);
			logger.info("Starting orderServer");
		} else {
			logger.debug("orderEndpoint 已经发布成功！！！！");
		}
	}

	/**
	 * 可定检查 5.7. 可定检查 由入住通向 PMS 发起请求，检查是否有可预订房间。该请求由渠道实时发起，请求量较 大。 接口调用方：入住通
	 * 接口返回方：合作方
	 * 
	 * @param otaHotelResRQ
	 * @return
	 */
	@WebResult(name = "OTA_HotelAvailRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "CheckHotelAvailabilityResult")
	@WebMethod(operationName = "OTA_HotelAvailRQ", action = "http://htng.org/2014B/HTNG_SeamlessShopAndBookService#CheckAvailability")
	public OTAHotelAvailRS CheckAvailability(
			@WebParam(partName = "otaHoelResRQ", name = "OTA_HotelAvailRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAHotelAvailRQ otaHotelResRQ) {
		String otaHoelResRequest = Serialize.objectToXml(otaHotelResRQ, OTAHotelAvailRQ.class);
		logger.info(otaHoelResRequest);
		//
		HotelServiceImpl hotelImpl = new HotelServiceImpl();
		//
		BigDecimal version = otaHotelResRQ.getVersion();
		ArrayOfSourceType allSourceType = otaHotelResRQ.getPOS();
		List<SourceType> sourceTypes = allSourceType.getSource();
		SourceType sourceType = sourceTypes.get(0);
		// 渠道代码（携程：CTRIP,艺龙：ELONG,去哪儿：QUNAR）
		RequestorID requestorID = sourceType.getRequestorID();//
		requestorID.getID();

		AvailRequestSegments allRequestSegments = otaHotelResRQ.getAvailRequestSegments();
		List<AvailRequestSegment> availRequestSegments = allRequestSegments.getAvailRequestSegment();
		AvailRequestSegment requestSegment = availRequestSegments.get(0);
		HotelSearchCriteria hotelSearchCriteria = requestSegment.getHotelSearchCriteria();
		List<Criterion> criterions = hotelSearchCriteria.getCriterion();
		Criterion criterion = criterions.get(0);//每次只有1个单一酒店检查

		List<HotelRef> hotelRefs = criterion.getHotelRef();
		HotelRef hotelRef = hotelRefs.get(0);
		String hotelCode = hotelRef.getHotelCode();
		String sHotel_id = hotelCode.replace(Config.hotelCodePrefix, "");
		//String otaHotelId = hotelRef.getOtaHotelId();
		//保存请求数据*****
		OtaServiceImpl.instent().saveDirectLog(Integer.parseInt(sHotel_id), "CheckAvailability", "可定检查 5.7. 可定检查", otaHoelResRequest, "");
		

		DateTimeSpanType dateTimeSpanType = criterion.getStayDateRange();
		//开始时间
		String startDate = dateTimeSpanType.getStart();
		//结束时间
		String endDate = dateTimeSpanType.getEnd();
		//List<RateRange> rateRanges = criterion.getRateRange();
		//RateRange rateRange = rateRanges.get(0);
		//String currencyCode = rateRange.getCurrencyCode();

		ArrayOfRoomStayCandidateType allRoomStayCandidateType = criterion.getRoomStayCandidates();
		List<RoomStayCandidateType> roomStayCandidateTypes = allRoomStayCandidateType.getRoomStayCandidate();
		RoomStayCandidateType roomStayCandidateType = roomStayCandidateTypes.get(0);
		// 预订房间数量
		BigInteger roomQuantit = roomStayCandidateType.getQuantity();
		// 预订 PMS房型代码//目前入住通不可以跨房型预订
		//hotel_id + "-" + layout_id + "-" + sell_id;
		String roomTypeCode = roomStayCandidateType.getRoomTypeCode();
		String[] roomTypeKey = roomTypeCode.split("-");//
		int hotel_id = Integer.parseInt(roomTypeKey[0]);
		int layout_id = Integer.parseInt(roomTypeKey[1]);
		int sell_id = Integer.parseInt(roomTypeKey[2]);
		String forwardKey = layout_id + "-" + sell_id;
		//
		int roomManNum = 0;
		try {
			List<Room_layout> room_layouts = hotelImpl.getRoomLayout(hotel_id, layout_id);
			Room_layout room_layout = room_layouts.get(0);
			//最多住几人
			roomManNum = room_layout.getRoom_layout_max_people();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		GuestCountType guestCountType = roomStayCandidateType.getGuestCounts();
		List<GuestCount> guestCounts = guestCountType.getGuestCount();
		GuestCount guestCount = guestCounts.get(0);
		// 人员类型，10：成人,默认 10
		String ageQualifyingCode = guestCount.getAgeQualifyingCode();
		// 人数值
		BigInteger guestNum = guestCount.getCount();
		if(ageQualifyingCode.equals("10") && guestNum.intValue() > roomManNum) {
			//人数超多
		}

		RatePlanCandidates allRatePlanCandidates = criterion.getRatePlanCandidates();
		List<RatePlanCandidate> ratePlanCandidates = allRatePlanCandidates.getRatePlanCandidate();
		RatePlanCandidate ratePlanCandidate = ratePlanCandidates.get(0);
		// 价格代码
		String ratePlanCode = ratePlanCandidate.getRatePlanCode();
		String[] ratePlanKey = ratePlanCode.split("-");//
		int system_id = Integer.parseInt(ratePlanKey[0]);
		int rate_sell_id = Integer.parseInt(ratePlanKey[1]);
		// 会员类型（等级）,按等级分（支持 1 到 100 分级）1 代表最低等级，从低到高
		//Integer memberType = criterion.getMemberType();
		//String memberCard = criterion.getMemberCard();// 会员卡号
		//返回XML*******************************************************************返回XML//
		OTAHotelAvailRS availRS = new OTAHotelAvailRS();
		List<Object> staysList = availRS.getTPAExtensionsOrProfilesOrRebatePrograms();
		///判断有效价格体系
		if(rate_sell_id != sell_id) {
			ErrorsType errorsType = new ErrorsType();
			List<ErrorType> errorTypes = errorsType.getError();
			ErrorType errorType = new ErrorType();
			errorType.setCode("007");
			errorType.setValue("此产品不存在.");
			errorTypes.add(errorType);
			staysList.add(errorsType);

			return availRS;
		}
		//取得pms远程数据
		PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
		String result = pmsServiceImpl.checkAvailability(hotel_id, system_id, sell_id, startDate, endDate, 1);
		
		HashMap<String, HashMap<String, String>> forwardRoomState = null;
		Room_layout_price hotelRatePlan = null;
		CheckAvailability_result checkAvailability = null;
		try {
			//JsonNode nodeResult = mapper.readTree(result);
			//if(nodeResult.get("forwardRoomState").asText().equals("-99")) {
			if(result.contains(":-99") || result.contains(":-1")) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("003");
				errorType.setValue("此房型已关.");
				errorTypes.add(errorType);
				staysList.add(errorsType);

				return availRS;
			}
			//if (!nodeResult.get("forwardRoomState").asText().equals("-1")  && !nodeResult.get("resetSystemPrice").asText().equals("-1")) {
				checkAvailability = mapper.readValue(result, CheckAvailability_result.class);
				forwardRoomState = checkAvailability.getForwardRoomState();
				hotelRatePlan = checkAvailability.getResetSystemPrice();
			//}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date(System.currentTimeMillis()));
		XMLGregorianCalendar thisTime = null;
		try {
			thisTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (Exception e) {

			e.printStackTrace();
		}
		availRS.setTimeStamp(thisTime);
		availRS.setVersion(new BigDecimal("2.0"));
		// ArrayOfSourceType allSourceTypeRs = new ArrayOfSourceType();
		// List<SourceType> sourceTypesRs = allSourceTypeRs.getSource();
		if(checkAvailability == null || hotelRatePlan == null || forwardRoomState == null) {
			ErrorsType errorsType = new ErrorsType();
			List<ErrorType> errorTypes = errorsType.getError();
			ErrorType errorType = new ErrorType();
			errorType.setCode("002");
			errorType.setValue("此房型可用房间数不足.");
			errorTypes.add(errorType);
			staysList.add(errorsType);

			return availRS;
		}
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date sDate = null;
		Date eDate = null;
		try {
			sDate = dateFormat.parse(startDate);
			eDate = dateFormat.parse(endDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		};
		Date minBookDate = new Date();
		if(sDate.getTime() < (minBookDate.getTime() - 172800000)) {
			ErrorsType errorsType = new ErrorsType();
			List<ErrorType> errorTypes = errorsType.getError();
			ErrorType errorType = new ErrorType();
			errorType.setCode("001");
			errorType.setValue("入住时间不能早于当天时间 .");
			errorTypes.add(errorType);
			staysList.add(errorsType);

			return availRS;
		}
		//总共天数
		BigInteger totalDay = new BigInteger(((eDate.getTime() - sDate.getTime()) / 86400000) + "");
		//
		RoomStays roomStays = new OTAHotelAvailRS.RoomStays();
		List<RoomStay> roomStayList = roomStays.getRoomStay();
		RoomStay roomStay = new RoomStay();
		//roomStay.setPromotionCode("");
		//
		ArrayOfRoomTypeType allRoomTypeType = new ArrayOfRoomTypeType();
		//
		List<RoomTypeType> roomTypeTypeList = allRoomTypeType.getRoomType();
		// <!--根据请求条件，RoomTypes下有1或多个RoomType节点--> begin
		RoomTypeType roomTypeType = new RoomTypeType();
		roomTypeType.setRoomTypeCode(roomTypeCode);// 房型代码
		//
		ParagraphType paragraphType = new ParagraphType();
		paragraphType.setName(checkAvailability.getSell_name());// 房型名称
		roomTypeType.setRoomDescription(paragraphType);//
		//
		roomTypeTypeList.add(roomTypeType);
		// <!--根据请求条件，RoomTypes下有1或多个RoomType节点--> end
		roomStay.setRoomTypes(allRoomTypeType);
		//
		// <!--RatePlans下有1或多个RatePlan节点--> begin
		ArrayOfRatePlanType allRatePlanType = new ArrayOfRatePlanType();
		List<RatePlanType> ratePlanTypeList = allRatePlanType.getRatePlan();
		//
		RatePlanType ratePlanType = new RatePlanType();
		// 价格代码
		ratePlanType.setRatePlanCode(ratePlanCode);
		String ctrip_price_type = hotelRatePlan.getOta_price_system_type();
		String ratePlanCategory = ctrip_price_type == "spot_payment" ? "16" : "501";
		// 价格代码类型（16：现付，501：预付）
		ratePlanType.setRatePlanCategory(ratePlanCategory);
		ParagraphType paragraphTypeRate = new ParagraphType();
		// 价格代码名称
		paragraphTypeRate.setName(hotelRatePlan.getSystem_name());
		ratePlanType.setRatePlanDescription(paragraphTypeRate);
		//
		ratePlanTypeList.add(ratePlanType);
		// <!--RatePlans下有1或多个RatePlan节点--> end
		roomStay.setRatePlans(allRatePlanType);
		//
		RoomRates roomRates = new RoomRates();
		List<RoomRate> roomRateList = roomRates.getRoomRate();
		RoomRate roomRate = new RoomRate();
		// 房型代码
		roomRate.setRoomTypeCode(roomTypeCode);
		// 价格代码
		roomRate.setRatePlanCode(ratePlanCode);
		//
		ArrayOfRateTypeRate allRateTypeRate = new ArrayOfRateTypeRate();
		List<Rate> rateList = allRateTypeRate.getRate();
		// begin 按天计算价格
		Date thisDate = null;
		Date nextDate = null;
		long bSdate = sDate.getTime();
		long bEdate = eDate.getTime();
		HashMap<String, HashMap<String, String>> dayPrice = hotelRatePlan.getDay_price();
		float dayRoomPrice = 0;
		for (long i = bSdate; i < bEdate; i += 86400000) {
			thisDate = new Date(i);
			nextDate = new Date(i + 86400000);
			//
			// Date s = dateFormat.parse(date);

			String ndate = dateFormat.format(nextDate);
			Rate rate = new Rate();
			XMLGregorianCalendar effectiveDate = null;// 价格开始时间
			XMLGregorianCalendar expireDate = null;// 价格结束时间
			//
			String date = dateFormat.format(thisDate);
			String numberOfUnits = forwardRoomState.get(date).get(forwardKey);// 房量
			if(Integer.parseInt(numberOfUnits) < roomQuantit.intValue()) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("002");
				errorType.setValue("此房型可用房间数不足.");
				errorTypes.add(errorType);
				staysList.add(errorsType);

				return availRS;
			}
			

			GregorianCalendar startCalendar = new GregorianCalendar();
			startCalendar.setTime(thisDate);
			GregorianCalendar endCalendar = new GregorianCalendar();
			endCalendar.setTime(nextDate);// eDate
			int year = startCalendar.get(Calendar.YEAR);
			int month = startCalendar.get(Calendar.MONTH) + 1;
			int day = startCalendar.get(Calendar.DAY_OF_MONTH);
			try {
				effectiveDate = DatatypeFactory.newInstance().newXMLGregorianCalendar();
				effectiveDate.setYear(year);
				effectiveDate.setMonth(month);
				effectiveDate.setDay(day);
				expireDate = DatatypeFactory.newInstance().newXMLGregorianCalendar();// endCalendar
				expireDate.setYear(endCalendar.get(Calendar.YEAR));
				expireDate.setMonth(endCalendar.get(Calendar.MONTH) + 1);
				expireDate.setDay(endCalendar.get(Calendar.DAY_OF_MONTH));
			} catch (DatatypeConfigurationException e) {
				e.printStackTrace();
			}
			System.out.println("effectiveDate:"+effectiveDate);
			System.out.println("expireDate:"+expireDate);

			rate.setEffectiveDate(effectiveDate);
			rate.setExpireDate(expireDate);
			rate.setNumberOfUnits(numberOfUnits);// 当天房量数
			//
			
			TotalType totalType = new TotalType();
			String getMonth = month < 10 ? "0"+month : month+"";
			String getDay = day < 10 ? "0"+day+"_day" : day+"_day";
			logger.info("getDay:"+year+"-"+getMonth+"-01");
			logger.info("getDay:"+getDay);
			String price = dayPrice.get(year+"-"+getMonth+"-01").get(getDay);
			dayRoomPrice += Float.parseFloat(price);
			// 税 前 价 格 ， AmountAfterTax和AmountBeforeTax 默认相同
			BigDecimal amountAfterTax = new BigDecimal(price);
			totalType.setAmountAfterTax(amountAfterTax);
			// 税 后 价 格 ，AmountAfterTax和AmountBeforeTax默认相同。
			BigDecimal amountBeforeTax = new BigDecimal(price);
			totalType.setAmountBeforeTax(amountBeforeTax);
			totalType.setBreakfast(hotelRatePlan.getOta_breakfast()+"");// 当天早餐数,若通过接口维护早餐数则填0或正整数，若不通过接口维护早餐则无该节点
			totalType.setCurrencyCode("RMB");// 货币代码,默认 RMB，表示人民币

			rate.setBase(totalType);
			//
			rateList.add(rate);
		}
		// end 按天计算价格
		//
		//BigInteger totalPrice = roomQuantit.multiply(new BigInteger(dayRoomPrice+"")).multiply(totalDay);
		DecimalFormat form = new DecimalFormat("#.00");
		BigDecimal bRoomQuantit = new BigDecimal(roomQuantit);//房量
		BigDecimal bDayRoomPrice = new BigDecimal(dayRoomPrice);//价格
		BigDecimal bTotalDay = new BigDecimal(totalDay);//预订天使
		String totalPrice = form.format(bRoomQuantit.multiply(bDayRoomPrice));//.multiply(bTotalDay);
		TotalType totalTypeRoomRate = new TotalType();
		BigDecimal amountAfterTaxRoomRate = new BigDecimal(totalPrice);
		totalTypeRoomRate.setAmountAfterTax(amountAfterTaxRoomRate);
		BigDecimal amountBeforeTaxRoomRate = new BigDecimal(totalPrice);
		totalTypeRoomRate.setAmountBeforeTax(amountBeforeTaxRoomRate);
		totalTypeRoomRate.setCurrencyCode("RMB");// 货币代码。RMB 表示人民币。
		roomRate.setTotal(totalTypeRoomRate);
		//
		roomRate.setRates(allRateTypeRate);
		//
		roomRateList.add(roomRate);
		//
		roomStay.setRoomRates(roomRates);
		//
		Hotel hotel = null;
		try {
			hotel = hotelImpl.getHotel(hotel_id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		BasicPropertyInfoType basicPropertyInfoType = new BasicPropertyInfoType();
		basicPropertyInfoType.setHotelCode(hotelCode);// PMS 酒店代码
		basicPropertyInfoType.setHotelName(hotel.getHotel_name());// PMS 酒店名称
		roomStay.setBasicPropertyInfo(basicPropertyInfoType);

		//
		roomStayList.add(roomStay);
		//
		SuccessType successType = new SuccessType();// 预订成功标识。
		// sourceTypesRs.add(sourceType);
		staysList.add(successType);
		//
		staysList.add(roomStays);

		String otaHotelResResult = "";
		try {
			otaHotelResResult = xml.writeValueAsString(availRS);
			// otaHotelResResult = Serialize.objectToXml(availRS, OTAHotelAvailRS.class);
			logger.info(otaHotelResResult);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return availRS;
	}

	/**
	 * 预定、修改、取消 5.8. 创建订单 由入住通向 PMS 发起请求，将客人订单信息传给酒店。该请求由渠道实时发起。PMS 厂 商需
	 * 30S内将结果响应给入住通。否则视为超时，以失败处理，该订单将通过 Ebooking 或传 真发给酒店线下确认。 接口调用方：入住通 接口返回方：合作方
	 * 
	 * @param otaHotelResRQ
	 * @return
	 */
	@WebResult(name = "OTA_HotelResRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "BookingActionResult")
	@WebMethod(operationName = "OTA_HotelResRQ", action = "http://htng.org/2014B/HTNG_SeamlessShopAndBookService#ProcessReservationRequest")
	public OTAHotelResRS processReservationRequest(
			@WebParam(partName = "otaHoelResRQ", name = "OTA_HotelResRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAHotelResRQ otaHotelResRQ) {
		String otaHoelResRequest = Serialize.objectToXml(otaHotelResRQ, OTAHotelResRQ.class);
		logger.info(otaHoelResRequest);

		TransactionActionType transactionActionType = otaHotelResRQ.getResStatus();
		OTAHotelResRS otaHotelResRS = null;
		switch (transactionActionType) {
		case COMMIT:
			otaHotelResRS = BookingReservation(otaHotelResRQ);
			break;
		case CANCEL:
			otaHotelResRS = CancelBookingReservation(otaHotelResRQ);
			break;
		case MODIFY:
			// otaHotelResRS.setResResponseType(TransactionStatusType.MODIFIED);
			break;

		default:
			break;
		}
		return otaHotelResRS;
	}

	protected OTAHotelResRS BookingReservation(OTAHotelResRQ otaHotelResRQ) {
		String requestString = "";
		try {
			requestString = xml.writeValueAsString(otaHotelResRQ);
		} catch (JsonProcessingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		HotelServiceImpl hotelImpl = new HotelServiceImpl();
		//
		XMLGregorianCalendar xmlGregorianCalendar = otaHotelResRQ.getTimeStamp();
		BigDecimal version = otaHotelResRQ.getVersion();
		TransactionActionType transactionActionType = otaHotelResRQ.getResStatus();
		// 订单请求类型（Commit：新建订单；Cancel：取消订单；Modify：修改订单；）

		ArrayOfSourceType allSourceType = otaHotelResRQ.getPOS();
		List<SourceType> sourceTypes = allSourceType.getSource();
		SourceType sourceType = sourceTypes.get(0);
		RequestorID requestorID = sourceType.getRequestorID();
		// 渠道代码（携程：CTRIP,艺龙：ELONG,去哪儿：QUNAR,代理通：VIPDLT）
		String ota_direct = requestorID.getID();//

		HotelReservationsType hotelReservationsTypeRQ = otaHotelResRQ.getHotelReservations();

		List<HotelReservation> hotelReservationsRQ = hotelReservationsTypeRQ.getHotelReservation();

		HotelReservation hotelReservationRQ = hotelReservationsRQ.get(0);
		///**********预订房型信息***************************************************
		ArrayOfRoomStaysTypeRoomStay allRoomStay = hotelReservationRQ.getRoomStays();
		List<ota.jw.GenericSeamlessGateway.ArrayOfRoomStaysTypeRoomStay.RoomStay> roomStays = allRoomStay.getRoomStay();
		ota.jw.GenericSeamlessGateway.ArrayOfRoomStaysTypeRoomStay.RoomStay RoomStay = roomStays.get(0);

		//一个订单中只存在一种房型和价格代码
		RoomRates roomRates = RoomStay.getRoomRates();
		List<RoomRate> roomRatesRQ = roomRates.getRoomRate();
		RoomRate roomRate = roomRatesRQ.get(0);
		String roomTypeCode = roomRate.getRoomTypeCode();
		String[] roomTypeKey = roomTypeCode.split("-");//
		int hotel_id = Integer.parseInt(roomTypeKey[0]);
		int layout_id = Integer.parseInt(roomTypeKey[1]);
		int sell_id = Integer.parseInt(roomTypeKey[2]);
		//现付订单：RatePlanCode 现付的价格代码 + RatePlanCategory="16"； 
		//预付订单: RatePlanCode 预付的价格代码 + RatePlanCategory="501"； 
		//现转预订单：RatePlanCode 现付的价格代码 + RatePlanCategory="501"； 
		//房价代码，（代理通模式默认：DLT10） 
		String ratePlanCode = roomRate.getRatePlanCode();
		String[] ratePlanKey = ratePlanCode.split("-");//
		int rate_system_id = Integer.parseInt(ratePlanKey[0]);
		int rate_sell_id = Integer.parseInt(ratePlanKey[1]);

		//价格代码种类，（16：现付；501：预付；） 
		String ratePlanCategory = roomRate.getRatePlanCategory();
		//预订房间数量 
		String numberOfUnits = roomRatesRQ.get(0).getNumberOfUnits();
		//
		ArrayOfRateTypeRate allRate = roomRatesRQ.get(0).getRates();
		List<Rate> rates = allRate.getRate();//
		
		//预抵日期
		// BigDecimal version = new BigDecimal(2);
		XMLGregorianCalendar timeStamp = null;
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(new Date());
		try {
			timeStamp = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//
		DateTimeSpanType timeSpanType = RoomStay.getTimeSpan();//
		//预抵
		String startDate = timeSpanType.getStart().substring(0, 10) + " 14:00:00";
		//预离
		String endDate = timeSpanType.getEnd().substring(0, 10) + " 12:00:00";
		
		//担保
		List<GuaranteeType> guaranteeTypes = RoomStay.getGuarantee();
		GuaranteeType guaranteeType = guaranteeTypes.get(0);
		//GuaranteeType="None" 表 示 “ 非 担 保 ”；GuaranteeType="GuaranteeRequired"表示“担保”；注：当该订单为预付订单时，则无 Guarantee 节点
		String guarantee = guaranteeType.getGuaranteeType();
		//备注
		ArrayOfSpecialRequestTypeSpecialRequest allSpecialRequest = RoomStay.getSpecialRequests();
		List<SpecialRequest> specialRequests = allSpecialRequest.getSpecialRequest();
		String note = "";
		int specialRequestsSize = specialRequests.size();
		for(int i = 0; i < specialRequestsSize; i++) {
			SpecialRequest specialRequest = specialRequests.get(i);
			List<JAXBElement<?>> element = specialRequest.getURLOrImageOrText();
			int elementSize = element.size();
			for (int j = 0; j < elementSize; j++) {
				FormattedTextTextType text = (FormattedTextTextType) element.get(j).getValue();
				note += text.getValue(); 
			}			
		}
		System.out.println("node:"+note);
		//客人数量
		GuestCountType guestCountType = RoomStay.getGuestCounts();
		List<GuestCount> guestCounts = guestCountType.getGuestCount();
		GuestCount guestCount = guestCounts.get(0);
		BigInteger guestNum = guestCount.getCount();
		///**********客人信息******************************************************
		String contact_name = "";
		ArrayOfResGuestType resGuestType = hotelReservationRQ.getResGuests();
		List<ResGuestType> resGuestTypes = resGuestType.getResGuest();
		ResGuestType guestType = resGuestTypes.get(0);
		ArrayOfProfilesTypeProfileInfo allProfileInfo = guestType.getProfiles();
		List<ProfileInfo> profileInfos = allProfileInfo.getProfileInfo();
		ProfileInfo profileInfo = profileInfos.get(0);
		ProfileType profile = profileInfo.getProfile();
		CustomerType customerType = profile.getCustomer();
		List<PersonNameType> personNameTypes = customerType.getPersonName();
		int personNameTypesSize = personNameTypes.size();
		for(int i = 0; i < personNameTypesSize; i++) {
			PersonNameType personNameType = personNameTypes.get(i);
			//名
			List<String> giveNames = personNameType.getGivenName();
			String giveName = "";
			for(int j = 0; j < giveNames.size(); j++) {
				giveName += " " + giveNames.get(j);
			}
			//姓
			String surName = personNameType.getSurname();
			contact_name += surName + " " + giveName + ";";
		}
		////**********订单信息*******************************************************
		ResGlobalInfoType resGlobalInfoTypeRQ = hotelReservationRQ.getResGlobalInfo();

		ArrayOfHotelReservationIDsTypeHotelReservationID allHotelReservationIDRQ = resGlobalInfoTypeRQ.getHotelReservationIDs();
		List<HotelReservationID> hotelReservationIDs = allHotelReservationIDRQ.getHotelReservationID();

		HotelReservationID hotelReservationIDRQ = hotelReservationIDs.get(0);
		String resIDType = hotelReservationIDRQ.getResIDType();
		String resIDValue = hotelReservationIDRQ.getResIDValue();
		
		//现转预订单*********************************************现转预订单//
		//现转预订单：RatePlanCode 现付的价格代码 + RatePlanCategory="501"； （现转预订单概念：现付的产品 OTA 采用预付的方式在外网上售卖，下单时支付方式为
		//预付，但产品属性为现付产品。而非由现付订单改为预付订单，订单价格校验时，以 AmountAfterTax 值为准。当订单为“现转预”订单时，AmountBeforeTax 为底价，AmountAfterTax 为卖价。）
		String OrderType = resGlobalInfoTypeRQ.getOrderType();//是否现转预订单。0：正常订单；1：现转预订单；
		String isFlashLive = resGlobalInfoTypeRQ.getIsFlashLive();//是否闪住订单。T：是；F：否； 
		BigDecimal depositAmount = resGlobalInfoTypeRQ.getDepositAmount();//闪住押金金额。保留小数点后 2 位。 
		//****************************************************//
		
		//返回数据
		OTAHotelResRS otaHotelResRS = new OTAHotelResRS();
		otaHotelResRS.setTimeStamp(timeStamp);
		otaHotelResRS.setVersion(version);

		List<Object> resultList = otaHotelResRS.getHotelReservationsOrWarningsOrErrors();
		//****************************************************//
		//判断房型
		if(rate_sell_id != sell_id) {
			ErrorsType errorsType = new ErrorsType();
			List<ErrorType> errorTypes = errorsType.getError();
			ErrorType errorType = new ErrorType();
			errorType.setCode("010");
			errorType.setValue("订单失败，不是有效的产品 ");
			errorTypes.add(errorType);
			resultList.add(errorsType);

			return otaHotelResRS;
		}
		//判断历史时间
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date sDate = null;
		try {
			sDate = dateFormat.parse(startDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		};
		Date minBookDate = new Date();
		if(sDate.getTime() < (minBookDate.getTime() - 172800000)) {
			ErrorsType errorsType = new ErrorsType();
			List<ErrorType> errorTypes = errorsType.getError();
			ErrorType errorType = new ErrorType();
			errorType.setCode("011");
			errorType.setValue("订单失败，不是有效的入住时间 .");
			errorTypes.add(errorType);
			resultList.add(errorsType);

			return otaHotelResRS;
		}
		//取得pms远程数据
		/*PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
		String checkResult = pmsServiceImpl.forwardRoomState(hotel_id, sell_id, startDate, endDate, 1);
		if(checkResult.contains(":-99")) {
			ErrorsType errorsType = new ErrorsType();
			List<ErrorType> errorTypes = errorsType.getError();
			ErrorType errorType = new ErrorType();
			errorType.setCode("003");
			errorType.setValue("此房型已关.");
			errorTypes.add(errorType);
			resultList.add(errorsType);

			return otaHotelResRS;
		}*/
		//取得pms远程数据 
		PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
		String checkAvailabilityResult = pmsServiceImpl.checkAvailability(hotel_id, rate_system_id, rate_sell_id, 
				startDate.substring(0, 10), endDate.substring(0, 10), 1);
		OtaServiceImpl.instent().saveDirectLog(hotel_id, "BookingReservation", "预定、修改、取消 5.8. 创建订单 由入住通向 PMS", requestString, checkAvailabilityResult);
		HashMap<String, HashMap<String, String>> forwardRoomState = null;
		Room_layout_price hotelRatePlanPrice = null;
		CheckAvailability_result checkAvailability = null;
		try {
			//JsonNode nodeResult = mapper.readTree(checkAvailabilityResult);
			if(checkAvailabilityResult.contains(":-99") || checkAvailabilityResult.contains(":-1")) {
				System.out.println(checkAvailabilityResult);
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("003");
				errorType.setValue("此房型已关.");
				errorTypes.add(errorType);
				resultList.add(errorsType);

				return otaHotelResRS;
			}
			//!nodeResult.get("forwardRoomState").asText().equals("-1")  && !nodeResult.get("resetSystemPrice").asText().equals("-1")
			//if (!checkAvailabilityResult.contains(":-1")) {
			checkAvailability = mapper.readValue(checkAvailabilityResult, CheckAvailability_result.class);
			forwardRoomState = checkAvailability.getForwardRoomState();
			hotelRatePlanPrice = checkAvailability.getResetSystemPrice();
			
			System.out.println("xml.writeValueAsString:" +xml.writeValueAsString(hotelRatePlanPrice));
			//}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//******************
		List<Room_layout_price_system_direct> SystemDirect = null;
		String ota_code = ota_direct;
		try {
			SystemDirect = hotelImpl.getRoomSystemDirect(hotel_id, rate_system_id, rate_sell_id);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		if(SystemDirect == null) {
			ErrorsType errorsType = new ErrorsType();
			List<ErrorType> errorTypes = errorsType.getError();
			ErrorType errorType = new ErrorType();
			errorType.setCode("010");
			errorType.setValue("订单失败，不是有效的产品 ");
			errorTypes.add(errorType);
			resultList.add(errorsType);

			return otaHotelResRS;
		}
		Room_layout_price_system_direct Direct = SystemDirect.get(0);
		String channel = Direct.getOta_code();
		int book_type_id = Direct.getBook_type_id();
		//BookMultipleData
		HashMap<String, HashMap<String, BookMultipleData>> bookMultipleDataHashMap = new HashMap<String, HashMap<String, BookMultipleData>>();
		HashMap<String, BookMultipleData> bookMultipleDataHash = new HashMap<String, BookMultipleData>();
		BookMultipleData bookMultipleData = new BookMultipleData();
		bookMultipleData.setLayout_id(layout_id+"");
		bookMultipleData.setSystem_id(rate_system_id+"");
		bookMultipleData.setOrder_amount(numberOfUnits);
		
		HashMap<String, Date_price> datePriceList = new HashMap<String, Date_price>();
		//
		String bookDate = startDate + "|" + endDate;
		//sell_id+'-'+system_id+'-'+layout_id;
		String sell_key = rate_sell_id+"-"+rate_system_id+"-"+layout_id;
		String layout_sell = layout_id + "-" + rate_sell_id;
		HashMap<String, HashMap<String, String>> pmsPriceMap = hotelRatePlanPrice.getDay_price();
		for (int i = 0; i < rates.size(); i++) {
			Rate rate = rates.get(i);
			XMLGregorianCalendar effectiveDate = rate.getEffectiveDate();
			XMLGregorianCalendar expireDate = rate.getExpireDate();
			int sourceMonth = effectiveDate.getMonth();
			int sourceDay = effectiveDate.getDay();
			String thisMonth = sourceMonth < 10 ? "0" + sourceMonth : sourceMonth+"";
			String thisDay = sourceDay < 10 ? "0" + sourceDay : sourceDay+"";
			String thisDate = effectiveDate.getYear() + "-" + thisMonth + "-"+ thisDay;
			String priceDate = effectiveDate.getYear() + "-" + thisMonth + "-01";
			Date_price datePrice = new Date_price();
			
			datePrice.setDiscount("100");
			datePrice.setDiscount_id("0");
			datePrice.setDiscount_type("0");
			TotalType totalType = rate.getBase();
			
			String otaPrice = totalType.getAmountAfterTax().toString();
			System.out.println(priceDate + "--" + thisDay);
			String pmsPrice = pmsPriceMap.get(priceDate).get(thisDay+"_day");
			if(!pmsPrice.equals(otaPrice)) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("009");
				errorType.setValue("预订期间价格无效.");
				errorTypes.add(errorType);
				resultList.add(errorsType);

				return otaHotelResRS;
			}
			System.out.println(thisDate + "--" + layout_sell);
			try {
				System.out.println(xml.writeValueAsString(forwardRoomState));
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String forwardRoomNum = forwardRoomState.get(thisDate).get(layout_sell);
			if(Integer.parseInt(numberOfUnits) > Integer.parseInt(forwardRoomNum)) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("016");
				errorType.setValue("此房型可用房间数不足");
				errorTypes.add(errorType);
				resultList.add(errorsType);
				return otaHotelResRS;
			}
			datePrice.setDiscount_price(otaPrice);
			datePrice.setPrice(totalType.getAmountBeforeTax().toString());
			String breakfastNum = totalType.getBreakfast();
			int breakfast = 0;
			if(!breakfastNum.equals("")) breakfast = Direct.getOta_breakfast();//Integer.parseInt(breakfastString);
			HashMap<String, HashMap<String, Service_pkg>> pkg = new HashMap<String, HashMap<String, Service_pkg>>();
			if(breakfast > 0) {
				int roomNum = Integer.parseInt(numberOfUnits);
				HashMap<String, Service_pkg> service_hashmap = new HashMap<String, Service_pkg>();
				for(int j = 0; j < roomNum; j++) {
					Service_pkg service_pkg = new Service_pkg();
					service_pkg.setPrice("0");
					service_pkg.setRoom_id((0-j) + "");
					service_pkg.setService_id("92");
					service_pkg.setService_num(breakfast+"");
					service_hashmap.put("92", service_pkg);//92 携程直连早餐
					pkg.put((0-j) + "", service_hashmap);
				}
			}
			
			datePrice.setPkg(pkg);
			datePriceList.put(thisDate, datePrice);
		}
		bookMultipleData.setDate(datePriceList);
		bookMultipleDataHash.put(sell_key, bookMultipleData);
		bookMultipleDataHashMap.put(bookDate, bookMultipleDataHash);
		//end BookMultipleData
		/// 预订 创建订单
		//**********************************************
		String ordernum = "";
		try {
			int book_id = hotelImpl.checkOtaISBook(hotel_id, resIDValue);
			if (book_id > 0) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("012");
				errorType.setValue("此订单已存在，重复下单.");
				errorTypes.add(errorType);
				resultList.add(errorsType);
				return otaHotelResRS;
			}
			
			String bookMultiple = mapper.writeValueAsString(bookMultipleDataHashMap);
			BookRoomData bookRoomData = new BookRoomData();
			//PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
			
			bookRoomData.setHotel_id(hotel_id);
			bookRoomData.setBook_type(book_type_id);
			bookRoomData.setContact_name(contact_name);
			bookRoomData.setGuarantee("0");
			if (guarantee.equals("GuaranteeRequired")) {
				bookRoomData.setGuarantee("3");//携程担保
			}
			if(isFlashLive.equals("T")) {
				bookRoomData.setGuarantee("2");//携程闪住
			}
			bookRoomData.setClient(ota_direct);
			bookRoomData.setNumber_ourter(resIDValue);
			bookRoomData.setNote(note);
			bookRoomData.setBookMultiple(bookMultiple);
			bookRoomData.setSell_key(sell_key);
			if(depositAmount == null) depositAmount = new BigDecimal("0.00");
			bookRoomData.setBook_cash_pledge(depositAmount.floatValue());
			bookRoomData.setSystem_id(rate_system_id);
			
			String result = pmsServiceImpl.bookRoom(bookRoomData);
			OtaServiceImpl.instent().saveDirectLog(hotel_id, "BookingReservation", "预定、修改、取消 5.8. 创建订单 由入住通向 PMS", "", result);
			logger.info("result:"+result);
			JsonNode nodeResult = mapper.readTree(result);
			String success = nodeResult.get("success").asText();
			if(success.equals("0")) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("002");
				errorType.setValue("此房型可用房间数不足.");
				errorTypes.add(errorType);
				resultList.add(errorsType);
				OtaServiceImpl.instent().saveDirectLog(hotel_id, "BookingReservation", "预定、修改、取消 5.8. 创建订单 由入住通向 PMS", success, "此房型可用房间数不足");
				return otaHotelResRS;
			}
			String resultBook = nodeResult.get("itemData").get(0).asText();
			if (resultBook == "0") {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("002");
				errorType.setValue("此房型可用房间数不足.");
				errorTypes.add(errorType);
				resultList.add(errorsType);
				OtaServiceImpl.instent().saveDirectLog(hotel_id, "BookingReservation", "预定、修改、取消 5.8. 创建订单 由入住通向 PMS", resultBook, "此房型可用房间数不足");
				return otaHotelResRS;
			}
			ordernum = nodeResult.get("itemData").get(1).get("order_number").asText();
			logger.info("nodeResult:"+nodeResult.toString());
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("预定失败！", e);
		}
		if(ordernum.equals("")) {
			ErrorsType errorsType = new ErrorsType();
			List<ErrorType> errorTypes = errorsType.getError();
			ErrorType errorType = new ErrorType();
			errorType.setCode("016");
			errorType.setValue("超出最大预订限额.");
			errorTypes.add(errorType);
			resultList.add(errorsType);
			logger.error("订单失败，订单号为空！");
			OtaServiceImpl.instent().saveDirectLog(hotel_id, "BookingReservation", "预定、修改、取消 5.8. 创建订单 由入住通向 PMS", ordernum, "订单失败，订单号为空！");
			return otaHotelResRS;
		}
		// ****************************************
		otaHotelResRS.setResResponseType(TransactionStatusType.COMMITTED);
		//
		HotelReservationsType hotelReservationsType = new HotelReservationsType();
		List<HotelReservation> hotelReservationList = hotelReservationsType.getHotelReservation();
		HotelReservation hotelReservation = new HotelReservation();

		ResGlobalInfoType resGlobalInfoType = new ResGlobalInfoType();

		ArrayOfHotelReservationIDsTypeHotelReservationID allHotelReservationID = new ArrayOfHotelReservationIDsTypeHotelReservationID();
		List<HotelReservationID> hotelReservationIDList = allHotelReservationID.getHotelReservationID();

		HotelReservationID hotelReservationID = new HotelReservationID();
		// 24 表示 OTA 订单号。 10 表示 PMS 确认号：改单、取消单操作时会传递这个号码
		hotelReservationID.setResIDType(resIDType);//
		// OTA 订单号/PMS 确认号，对应 ResID_Type
		hotelReservationID.setResIDValue(resIDValue);//
		
		//
		hotelReservationIDList.add(hotelReservationID);
		//
		HotelReservationID hotelReservationIDPMS = new HotelReservationID();
		hotelReservationIDPMS.setResIDType("10");//
		// OTA 订单号/PMS 确认号，对应 ResID_Type
		hotelReservationIDPMS.setResIDValue(ordernum);//

		hotelReservationIDList.add(hotelReservationIDPMS);
		//
		resGlobalInfoType.setHotelReservationIDs(allHotelReservationID);
		// 订单状态：(0:发送中;1:已发送;2:发送失败;3:酒店确认成功;4:酒店拒绝;5 其他)
		resGlobalInfoType.setOrderStatus("3");
		//
		hotelReservation.setResGlobalInfo(resGlobalInfoType);
		hotelReservationList.add(hotelReservation);
		// hotelReservationList.set(0, hotelReservation);
		//
		resultList.add(new SuccessType());
		resultList.add(hotelReservationsType);

		String otaHotelResResult;
		try {
			otaHotelResResult = xml.writeValueAsString(otaHotelResRS);
			logger.info(otaHotelResResult);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return otaHotelResRS;
	}

	protected OTAHotelResRS CancelBookingReservation(OTAHotelResRQ otaHotelResRQ) {
		HotelServiceImpl hotelImpl = new HotelServiceImpl();
		XMLGregorianCalendar xmlGregorianCalendar = otaHotelResRQ.getTimeStamp();
		BigDecimal version = otaHotelResRQ.getVersion();
		TransactionActionType transactionActionType = otaHotelResRQ.getResStatus();
		// 订单请求类型（Commit：新建订单；Cancel：取消订单；Modify：修改订单；）

		ArrayOfSourceType allSourceType = otaHotelResRQ.getPOS();
		List<SourceType> sourceTypes = allSourceType.getSource();
		SourceType sourceType = sourceTypes.get(0);
		RequestorID requestorID = sourceType.getRequestorID();
		// 渠道代码（携程：CTRIP,艺龙：ELONG,去哪儿：QUNAR,代理通：VIPDLT）
		String ota = requestorID.getID();//

		HotelReservationsType hotelReservationsTypeRQ = otaHotelResRQ.getHotelReservations();

		List<HotelReservation> hotelReservationsRQ = hotelReservationsTypeRQ.getHotelReservation();

		HotelReservation hotelReservationRQ = hotelReservationsRQ.get(0);

		// **********************************************
		// BigDecimal version = new BigDecimal(2);
		XMLGregorianCalendar timeStamp = null;
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(new Date());
		try {
			timeStamp = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (Exception e) {

			e.printStackTrace();
		}
		//hotelCode
		ArrayOfRoomStaysTypeRoomStay allRoomStay = hotelReservationRQ.getRoomStays();
		List<ota.jw.GenericSeamlessGateway.ArrayOfRoomStaysTypeRoomStay.RoomStay> roomStays = allRoomStay.getRoomStay();
		ota.jw.GenericSeamlessGateway.ArrayOfRoomStaysTypeRoomStay.RoomStay roomStay = roomStays.get(0);
		BasicPropertyInfoType basicPropertyInfoType = roomStay.getBasicPropertyInfo();
		String hotelCode = basicPropertyInfoType.getHotelCode();
		int hotel_id = Integer.parseInt(hotelCode.replace(Config.hotelCodePrefix, ""));
		////////
		ResGlobalInfoType resGlobalInfoTypeRQ = hotelReservationRQ.getResGlobalInfo();

		ArrayOfHotelReservationIDsTypeHotelReservationID allHotelReservationIDRQ = resGlobalInfoTypeRQ
				.getHotelReservationIDs();
		List<HotelReservationID> hotelReservationIDs = allHotelReservationIDRQ.getHotelReservationID();
		int hotelReservationIDsSize = hotelReservationIDs.size();
		String otaResIDValue = "";
		String pmsResIDValue = "";
		for(int i = 0; i < hotelReservationIDsSize; i++ ) {
			HotelReservationID hotelReservationIDRQ = hotelReservationIDs.get(i);
			String resIDType = hotelReservationIDRQ.getResIDType();
			if (resIDType.equals("24")) {
				otaResIDValue = hotelReservationIDRQ.getResIDValue();
			}
			if (resIDType.equals("10")) {
				pmsResIDValue = hotelReservationIDRQ.getResIDValue();
			}
		}
		System.out.println("otaResIDValue:"+otaResIDValue+";pmsResIDValue:"+pmsResIDValue);
		//返回结果**************************************************************************返回结果//
		OTAHotelResRS otaHotelResRS = new OTAHotelResRS();
		otaHotelResRS.setTimeStamp(timeStamp);
		otaHotelResRS.setVersion(version);

		List<Object> resultList = otaHotelResRS.getHotelReservationsOrWarningsOrErrors();

		otaHotelResRS.setResResponseType(TransactionStatusType.CANCELLED);
		//
		
		Book otaBookStatus;
		try {
			otaBookStatus = hotelImpl.checkOtaBookStatus(hotel_id, otaResIDValue);
			System.out.println(xml.writeValueAsString(otaBookStatus));
			if (otaBookStatus == null) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("029");
				errorType.setValue("取消失败，订单不存在");
				errorTypes.add(errorType);
				resultList.add(errorsType);

				return otaHotelResRS;
			}
			if (!pmsResIDValue.equals(otaBookStatus.getBook_order_number()+"")) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("028");
				errorType.setValue("取消失败，确认号订单不存在 ");
				errorTypes.add(errorType);
				resultList.add(errorsType);

				return otaHotelResRS;
			}
			
			if (otaBookStatus.getBook_order_number_status() == -99) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("027");
				errorType.setValue("此订单已取消，重复取消 .");
				errorTypes.add(errorType);
				resultList.add(errorsType);

				return otaHotelResRS;
			}
			
			if (otaBookStatus.getBook_order_number_status() == 1) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("030");
				errorType.setValue("此订单已入住，不能取消");
				errorTypes.add(errorType);
				resultList.add(errorsType);

				return otaHotelResRS;
			}
			
			if (otaBookStatus.getBook_order_number_status() == -1) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("031");
				errorType.setValue("此订单已离店，不能取");
				errorTypes.add(errorType);
				resultList.add(errorsType);

				return otaHotelResRS;
			}
			
			if (otaBookStatus.getBook_order_number_status() == 4) {
				ErrorsType errorsType = new ErrorsType();
				List<ErrorType> errorTypes = errorsType.getError();
				ErrorType errorType = new ErrorType();
				errorType.setCode("032");
				errorType.setValue("此订单 noshow，不能取消");
				errorTypes.add(errorType);
				resultList.add(errorsType);

				return otaHotelResRS;
			}
			
			long book_order_number = otaBookStatus.getBook_order_number();
			PmsServiceImpl pmsServiceImpl = new PmsServiceImpl();
			String result = pmsServiceImpl.cancelBookRoom(hotel_id, book_order_number);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		HotelReservationID hotelReservationIDRQPMS = hotelReservationIDs.get(1);
		String resIDTypePMS = hotelReservationIDRQPMS.getResIDType();
		String resIDValuePMS = hotelReservationIDRQPMS.getResIDValue();

		HotelReservationsType hotelReservationsType = new HotelReservationsType();
		List<HotelReservation> hotelReservationList = hotelReservationsType.getHotelReservation();
		HotelReservation hotelReservation = new HotelReservation();

		ResGlobalInfoType resGlobalInfoType = new ResGlobalInfoType();

		ArrayOfHotelReservationIDsTypeHotelReservationID allHotelReservationID = new ArrayOfHotelReservationIDsTypeHotelReservationID();
		List<HotelReservationID> hotelReservationIDList = allHotelReservationID.getHotelReservationID();
		//
		HotelReservationID hotelReservationID = new HotelReservationID();
		// 24 表示 OTA 订单号。 10 表示 PMS 确认号：改单、取消单操作时会传递这个号码
		hotelReservationID.setResIDType("24");//
		// OTA 订单号/PMS 确认号，对应 ResID_Type
		hotelReservationID.setResIDValue(otaResIDValue);//
		//
		hotelReservationIDList.add(hotelReservationID);
		//
		HotelReservationID hotelReservationIDPMS = new HotelReservationID();
		hotelReservationIDPMS.setResIDType("10");//
		// OTA 订单号/PMS 确认号，对应 ResID_Type
		hotelReservationIDPMS.setResIDValue(pmsResIDValue);//
		//
		hotelReservationIDList.add(hotelReservationIDPMS);
		//
		resGlobalInfoType.setHotelReservationIDs(allHotelReservationID);
		// 订单状态：(0:发送中;1:已发送;2:发送失败;3:酒店确认成功;4:酒店拒绝;5 其他)
		resGlobalInfoType.setOrderStatus("3");
		//
		hotelReservation.setResGlobalInfo(resGlobalInfoType);
		hotelReservationList.add(hotelReservation);
		// hotelReservationList.set(0, hotelReservation);
		//
		resultList.add(new SuccessType());
		resultList.add(hotelReservationsType);

		String otaHotelResResult;
		try {
			otaHotelResResult = xml.writeValueAsString(otaHotelResRS);
			logger.info(otaHotelResResult);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//执行取消确认
		try {
			JwPMSGatewayImpl.OTA_HotelStayInfoNotifRQ(hotel_id, 0, otaResIDValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return otaHotelResRS;
	}

}