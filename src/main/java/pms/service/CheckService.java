package pms.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

//import cn.other.serialize;
import core.util.Serialize;
import pms.order.ArrayOfHotelReservationIDsTypeHotelReservationID;
import pms.order.ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID;
import pms.order.ArrayOfRatePlanType;
import pms.order.ArrayOfRateTypeRate;
import pms.order.ArrayOfRateTypeRate.Rate;
import pms.order.ArrayOfRoomStayCandidateType;
import pms.order.ArrayOfRoomTypeType;
import pms.order.ArrayOfSourceType;
import pms.order.AvailRequestSegmentsType.AvailRequestSegment;
import pms.order.AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria;
import pms.order.BasicPropertyInfoType;
import pms.order.DateTimeSpanType;
import pms.order.GuestCountType;
import pms.order.GuestCountType.GuestCount;
import pms.order.HotelResResponseType;
import pms.order.HotelReservationsType;
import pms.order.HotelReservationsType.HotelReservation;
import pms.order.HotelSearchCriteriaType.Criterion;
import pms.order.HotelSearchCriterionType.RatePlanCandidates;
import pms.order.HotelSearchCriterionType.RateRange;
import pms.order.ItemSearchCriterionType.HotelRef;
import pms.order.OTAHotelAvailRQ;
import pms.order.OTAHotelAvailRQ.AvailRequestSegments;
import pms.order.OTAHotelAvailRS;
import pms.order.OTAHotelAvailRS.RoomStays;
import pms.order.OTAHotelAvailRS.RoomStays.RoomStay;
import pms.order.OTAHotelResRQ;
import pms.order.ParagraphType;
import pms.order.RatePlanCandidatesType.RatePlanCandidate;
import pms.order.RatePlanType;
import pms.order.ResGlobalInfoType;
import pms.order.RoomStayCandidateType;
import pms.order.RoomStayType.RoomRates;
import pms.order.RoomStayType.RoomRates.RoomRate;
import pms.order.RoomTypeType;
import pms.order.SourceType;
import pms.order.SourceType.RequestorID;
import pms.order.SuccessType;
import pms.order.TotalType;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "ServiceSoap")
@XmlSeeAlso({ pms.order.ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class CheckService {
	protected static Logger logger = LoggerFactory.getLogger(CheckService.class);
	protected static XmlMapper xml = new XmlMapper();
	private static Endpoint checkEndpoint = null;

	public static void main(String[] args) {
		startOtaServer();
	}

	public static void startOtaServer() {
		if (checkEndpoint == null) {
			CheckService order = new CheckService();
			checkEndpoint = Endpoint.publish("http://localhost:8888/check", order);
			logger.info("Starting checkEndpoint");
		} else {
			logger.debug("checkEndpoint 已经发布成功！！！！");
		}
	}

	/**
	 * 可定检查
	 *
	 * @param otaHoelResRQ
	 * @return
	 */
	@WebResult(name = "OTA_HotelAvailRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "CheckHotelAvailabilityResult")
	@WebMethod(operationName = "OTA_HotelAvailRQ", action = "http://htng.org/2014B/HTNG_SeamlessShopAndBookService#CheckAvailability")
	public OTAHotelAvailRS checkAvailability(
			@WebParam(partName = "otaHoelResRQ", name = "OTA_HotelAvailRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAHotelAvailRQ otaHoelResRQ) {

		logger.info(Serialize.objectToXml(otaHoelResRQ, OTAHotelAvailRQ.class));
		ArrayOfSourceType allSourceType = otaHoelResRQ.getPOS();
		List<SourceType> sourceTypes = allSourceType.getSource();
		SourceType sourceType = sourceTypes.get(0);
		// 渠道代码（携程：CTRIP,艺龙：ELONG,去哪儿：QUNAR）
		RequestorID requestorID = sourceType.getRequestorID();//

		AvailRequestSegments allRequestSegments = otaHoelResRQ.getAvailRequestSegments();
		List<AvailRequestSegment> availRequestSegments = allRequestSegments.getAvailRequestSegment();
		AvailRequestSegment requestSegment = availRequestSegments.get(0);
		HotelSearchCriteria hotelSearchCriteria = requestSegment.getHotelSearchCriteria();
		List<Criterion> criterions = hotelSearchCriteria.getCriterion();
		Criterion criterion = criterions.get(0);

		List<HotelRef> hotelRefs = criterion.getHotelRef();
		HotelRef hotelRef = hotelRefs.get(0);
		String hotelCode = hotelRef.getHotelCode();

		DateTimeSpanType dateTimeSpanType = criterion.getStayDateRange();
		String startDate = dateTimeSpanType.getStart();
		String endDate = dateTimeSpanType.getEnd();

		List<RateRange> rateRanges = criterion.getRateRange();
		RateRange rateRange = rateRanges.get(0);

		ArrayOfRoomStayCandidateType allRoomStayCandidateType = criterion.getRoomStayCandidates();
		List<RoomStayCandidateType> roomStayCandidateTypes = allRoomStayCandidateType.getRoomStayCandidate();
		RoomStayCandidateType roomStayCandidateType = roomStayCandidateTypes.get(0);
		// 预订房间数量
		BigInteger quantit = roomStayCandidateType.getQuantity();
		// 预订 PMS房型代码
		String roomTypeCode = roomStayCandidateType.getRoomTypeCode();
																		
		GuestCountType guestCountType = roomStayCandidateType.getGuestCounts();
		List<GuestCount> guestCounts = guestCountType.getGuestCount();
		GuestCount guestCount = guestCounts.get(0);
		String ageQualifyingCode = guestCount.getAgeQualifyingCode();
		BigInteger count = guestCount.getCount();

		RatePlanCandidates allRatePlanCandidates = criterion.getRatePlanCandidates();
		List<RatePlanCandidate> ratePlanCandidates = allRatePlanCandidates.getRatePlanCandidate();
		RatePlanCandidate ratePlanCandidate = ratePlanCandidates.get(0);
		String ratePlanCode = ratePlanCandidate.getRatePlanCode();// 价格代码

		// 会员类型（等级）,按等级分（支持 1 到 100 分级）1 代表最低等级，从低到高
		
		// 会员卡号
		
		//************************************************************//
		OTAHotelAvailRS availRS = new OTAHotelAvailRS();

		List<Object> staysList = availRS.getHotelStaysOrSuccessOrRoomStays();
		SuccessType successType = new SuccessType();
		staysList.add(successType);
		//
		RoomStays roomStays = new OTAHotelAvailRS.RoomStays();
		List<RoomStay> roomStayList = roomStays.getRoomStay();
		RoomStay roomStay = new RoomStay();
		//
		ArrayOfRoomTypeType allRoomTypeType = new ArrayOfRoomTypeType();
		//
		List<RoomTypeType> roomTypeTypeList = allRoomTypeType.getRoomType();
		// <!-- 根据请求条件，RoomTypes下有1或多个RoomType节点--> begin
		RoomTypeType roomTypeType = new RoomTypeType();
		roomTypeType.setRoomTypeCode("3-13-14");
		//
		ParagraphType paragraphType = new ParagraphType();
		paragraphType.setName("特价精致单人间");
		roomTypeType.setRoomDescription(paragraphType);
		//
		roomTypeTypeList.add(roomTypeType);
		// <!-- 根据请求条件，RoomTypes下有1或多个RoomType节点--> end
		roomStay.setRoomTypes(allRoomTypeType);
		//
		// <!--RatePlans下有1或多个RatePlan节点--> begin
		ArrayOfRatePlanType allRatePlanType = new ArrayOfRatePlanType();
		List<RatePlanType> ratePlanTypeList = allRatePlanType.getRatePlan();
		//
		RatePlanType ratePlanType = new RatePlanType();
		ratePlanType.setRatePlanCode("1");//
		ratePlanType.setRatePlanCategory("16");
		ParagraphType paragraphTypeRate = new ParagraphType();
		paragraphTypeRate.setName("携程标准价（双早）");
		ratePlanType.setRatePlanDescription(paragraphTypeRate);
		//
		ratePlanTypeList.add(ratePlanType);
		// <!--RatePlans下有1或多个RatePlan节点--> end
		roomStay.setRatePlans(allRatePlanType);
		//
		RoomRates roomRates = new RoomRates();
		List<RoomRate> roomRateList = roomRates.getRoomRate();
		RoomRate roomRate = new RoomRate();
		roomRate.setRoomTypeCode("3-13-14");
		roomRate.setRatePlanCode("1");
		//
		ArrayOfRateTypeRate allRateTypeRate = new ArrayOfRateTypeRate();
		List<Rate> rateList = allRateTypeRate.getRate();
		Rate rate = new Rate();
		XMLGregorianCalendar effectiveDate = null;
		XMLGregorianCalendar expireDate = null;
		try {
			effectiveDate = DatatypeFactory.newInstance().newXMLGregorianCalendar();
			effectiveDate.setDay(20);
			effectiveDate.setMonth(8);
			effectiveDate.setYear(2018);
			//
			expireDate = DatatypeFactory.newInstance().newXMLGregorianCalendar();
			expireDate.setDay(20);
			expireDate.setMonth(8);
			expireDate.setYear(2018);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rate.setEffectiveDate(effectiveDate);
		rate.setExpireDate(expireDate);
		BigInteger num = new BigInteger(new byte[16]);
		rate.setNumberOfUnits(num);
		//
		TotalType totalType = new TotalType();
		BigDecimal amountAfterTax = new BigDecimal(16);
		totalType.setAmountAfterTax(amountAfterTax);
		BigDecimal amountBeforeTax = new BigDecimal(16);
		totalType.setAmountBeforeTax(amountBeforeTax);
		totalType.setCurrencyCode("RMB");

		rate.setBase(totalType);
		//
		rateList.add(rate);
		//
		TotalType totalTypeRoomRate = new TotalType();
		BigDecimal amountAfterTaxRoomRate = new BigDecimal(16);
		totalTypeRoomRate.setAmountAfterTax(amountAfterTaxRoomRate);
		BigDecimal amountBeforeTaxRoomRate = new BigDecimal(16);
		totalTypeRoomRate.setAmountBeforeTax(amountBeforeTaxRoomRate);
		totalTypeRoomRate.setCurrencyCode("RMB");
		roomRate.setTotal(totalTypeRoomRate);
		//
		roomRate.setRates(allRateTypeRate);
		//
		roomRateList.add(roomRate);
		//
		roomStay.setRoomRates(roomRates);
		BasicPropertyInfoType basicPropertyInfoType = new BasicPropertyInfoType();
		basicPropertyInfoType.setHotelCode("XHKJ-PMS-3");
		basicPropertyInfoType.setHotelName("精品酒店");
		roomStay.setBasicPropertyInfo(basicPropertyInfoType);
		//
		roomStayList.add(roomStay);
		staysList.add(roomStays);
		try {
			String result = xml.writeValueAsString(availRS);
			logger.info(result);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// logger.info(Serialize.objectToXml(availRS, OTAHotelAvailRS.class));

		return availRS;
	}

	/**
	 * 预定、修改、取消
	 *
	 * @param otaHotelResRQ
	 * @return
	 */
	@WebResult(name = "OTA_HotelResRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "BookingActionResult")
	@WebMethod(operationName = "OTA_HotelResRQ", action = "http://htng.org/2014B/HTNG_SeamlessShopAndBookService#ProcessReservationRequest")
	public HotelResResponseType orderBooking(
			@WebParam(partName = "otaHoelResRQ", name = "OTA_HotelResRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAHotelResRQ otaHotelResRQ) {
		System.out.println(Serialize.objectToXml(otaHotelResRQ, OTAHotelResRQ.class));

		HotelResResponseType hotelResResponseType = new HotelResResponseType();

		List<Object> errorList = hotelResResponseType.getErrorsOrWarningsOrHotelReservations();
		errorList.add(new SuccessType());

		HotelReservationsType hotelReservationsType = new HotelReservationsType();
		List<HotelReservation> hotelReservationList = hotelReservationsType.getHotelReservation();
		HotelReservation hotelReservation = new HotelReservation();
		ResGlobalInfoType resGlobalInfoType = new ResGlobalInfoType();
		ArrayOfHotelReservationIDsTypeHotelReservationID allHotelReservationID = new ArrayOfHotelReservationIDsTypeHotelReservationID();
		List<HotelReservationID> hotelReservationIDList = allHotelReservationID.getHotelReservationID();
		HotelReservationID hotelReservationID = new HotelReservationID();
		hotelReservationID.setResIDType("24");
		hotelReservationID.setResIDValue("2692355");
		//
		hotelReservationIDList.add(hotelReservationID);
		//
		resGlobalInfoType.setHotelReservationIDs(allHotelReservationID);
		//
		hotelReservation.setResGlobalInfo(resGlobalInfoType);
		hotelReservationList.set(0, hotelReservation);
		//
		errorList.add(hotelReservationsType);

		System.out.println(Serialize.objectToXml(hotelResResponseType, HotelResResponseType.class));

		return hotelResResponseType;
	}
}
