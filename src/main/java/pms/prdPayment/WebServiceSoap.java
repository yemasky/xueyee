package pms.prdPayment;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "WebServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WebServiceSoap {

    /**
     * 预授权订单pms
     */
    @WebResult(name = "OTA_HotelResPrdPaymentNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "PreAuthorizationBookingResult")
    @WebMethod(operationName = "PreAuthorizationBooking", action = "http://htng.org/2014B/HTNG_SeamlessShopAndBookService#PreAuthorization")
    public OTAHotelResPrdPaymentNotifRS preAuthorizationBooking(@WebParam(partName = "OTA_HotelResPrdPaymentNotifRQ", name = "OTA_HotelResPrdPaymentNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAHotelResPrdPaymentNotifRQ otaHotelResPrdPaymentNotifRQ);
}