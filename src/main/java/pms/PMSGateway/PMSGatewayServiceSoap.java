package pms.PMSGateway;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "PMSGatewayServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PMSGatewayServiceSoap {

    /**
     * 确认订单
     */
    @WebResult(name = "OTA_NotifReportRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "UpdatePulledReservationsResult")
    @WebMethod(operationName = "UpdatePulledReservations", action = "http://htng.org/2014B/HTNG_ARIAndReservationPullService#UpdatePulledReservations")
    public MessageAcknowledgementType updatePulledReservations(@WebParam(partName = "OTA_NotifReportRQ", name = "OTA_NotifReportRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTANotifReportRQ otaNotifReportRQ
    );

    /**
     * 确认预授权
     */
    @WebResult(name = "MessageAcknowledgementType", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "UpdateRetrievedPrdStatusResult")
    @WebMethod(operationName = "UpdateRetrievedPrdStatus", action = "http://htng.org/2014B/HTNG_ARIAndReservationPullService#OTA_PrdNotifReportRQ")
    public MessageAcknowledgementType updateRetrievedPrdStatus(
            @WebParam(partName = "OTA_NotifReportRQ", name = "OTA_PrdNotifReportRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
            OTAPrdNotifReportRQ otaNotifReportRQ
    );

    /**
     * 推送房价
     */
    @WebResult(name = "OTA_HotelRatePlanNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelRatePlanNotifRQResult")
    @WebMethod(operationName = "OTA_HotelRatePlanNotifRQ", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#OTA_HotelRatePlanNotifRQ")
    public OTAHotelRatePlanNotifRS otaHotelRatePlanNotifRQ(@WebParam(partName = "OTA_HotelRatePlanNotifRQ1", name = "OTA_HotelRatePlanNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAHotelRatePlanNotifRQ otaHotelRatePlanNotifRQ1
    );

    /**
     * 订单审核(入住，离店，NoShow)
     */
    @WebResult(name = "OTA_HotelStayInfoNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelStayInfoNotifRQResult")
    @WebMethod(operationName = "OTA_HotelStayInfoNotifRQ", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#OTA_HotelStayInfoNotifRQ")
    public OTAHotelStayInfoNotifRS otaHotelStayInfoNotifRQ(
            @WebParam(partName = "OTA_HotelRatePlanNotifRQ1", name = "OTA_HotelStayInfoNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
            OTAHotelStayInfoNotifRQ otaHotelRatePlanNotifRQ1
    );

    /**
     * 订单状态推送
     */
    @WebResult(name = "OTA_PushOrderStatusRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "PmsOrderStatusPushResult")
    @WebMethod(operationName = "PmsOrderStatusPush", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#OrderStatusPush")
    public OTAPushOrderStatusRS pmsOrderStatusPush(@WebParam(partName = "OTA_PushOrderStatusRQ", name = "OTA_PushOrderStatusRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAPushOrderStatusRQ otaPushOrderStatusRQ
    );

    /**
     * 拉取预授权
     */
    @WebResult(name = "OrderPaymentInfoRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "PmsRetrivePrdInfoResult")
    @WebMethod(operationName = "PmsRetrivePrdInfo", action = "http://htng.org/2014B/HTNG_ARIAndReservationPullService#RetrievepPrdInfo")
    public OrderPaymentInfoRS pmsRetrivePrdInfo(@WebParam(partName = "OTA_ReadRQ", name = "OTA_PrdReadRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAPrdReadRQ otaReadRQ
    );

    /**
     * 预授权---离店
     */
    @WebResult(name = "OrderApplyPaymentRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "PmsCheckedOutNoticeResult")
    @WebMethod(operationName = "PmsCheckedOutNotice", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#OrderApplyPaymentRQ")
    public OrderApplyPaymentRS pmsCheckedOutNotice(@WebParam(partName = "OrderApplyPaymentRQ", name = "OrderApplyPaymentRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OrderApplyPaymentRQ orderApplyPaymentRQ
    );

    /**
     * 拉取订单
     */
    @WebResult(name = "OTA_ResRetrieveRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "RetrieveReservationsResult")
    @WebMethod(operationName = "RetrieveReservations", action = "http://htng.org/2014B/HTNG_ARIAndReservationPullService#RetrieveReservations")
    public OTAResRetrieveRS retrieveReservations(@WebParam(partName = "OTA_ReadRQ", name = "OTA_ReadRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAReadRQ otaReadRQ
    );

    /**
     * 库存(实时房量)
     */
    @WebResult(name = "OTA_HotelInvCountNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelInvCountNotifRQResult")
    @WebMethod(operationName = "OTA_HotelInvCountNotifRQ", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#OTA_HotelInvCountNotifRQ")
    public OTAHotelInvCountNotifRS otaHotelInvCountNotifRQ(@WebParam(partName = "OTA_HotelInvCountNotifRQ1", name = "OTA_HotelInvCountNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAHotelInvCountNotifRQ otaHotelInvCountNotifRQ1
    );

    /**
     * 可用房态，最大可卖数(保留房)
     */
    @WebResult(name = "OTA_HotelAvailNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelAvailNotifRQResult")
    @WebMethod(operationName = "OTA_HotelAvailNotifRQ", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#OTA_HotelAvailNotifRQ")
    public OTAHotelAvailNotifRS otaHotelAvailNotifRQ(@WebParam(partName = "OTA_HotelAvailNotifRQ1", name = "OTA_HotelAvailNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAHotelAvailNotifRQ otaHotelAvailNotifRQ1
    );

    /**
     * 预授权---入住
     */
    @WebResult(name = "OrderCheckInNoticeRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "PmsInHouseNoticeResult")
    @WebMethod(operationName = "PmsInHouseNotice", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#OrderCheckInNoticeRQ")
    public OrderCheckInNoticeRS pmsInHouseNotice(@WebParam(partName = "OrderCheckInNoticeRQ", name = "OrderCheckInNoticeRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OrderCheckInNoticeRQ orderCheckInNoticeRQ
    );
}
