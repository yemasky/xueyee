package pms.service;

//import cn.other.serialize;
import core.util.Serialize;
import pms.prdPayment.OTAHotelResPrdPaymentNotifRQ;
import pms.prdPayment.OTAHotelResPrdPaymentNotifRS;
import pms.prdPayment.ObjectFactory;
import pms.prdPayment.SuccessType;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Endpoint;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "WebServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class payService {
    public static void main(String[] args) {
        payService payment = new payService();
        Endpoint endPoint = Endpoint.publish("http://localhost:8080/pay", payment);
        System.out.println("发布成功！！！！");
    }

    /**
     * 闪住付款
     *
     * @param otaHotelResPrdPaymentNotifRQ
     * @return
     */
    @WebResult(name = "OTA_HotelResPrdPaymentNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "PreAuthorizationBookingResult")
    @WebMethod(operationName = "OTA_HotelResPrdPaymentNotifRQ", action = "http://htng.org/2014B/HTNG_SeamlessShopAndBookService#PreAuthorization")
    public OTAHotelResPrdPaymentNotifRS preAuthorizationBooking(@WebParam(partName = "OTA_HotelResPrdPaymentNotifRQ", name = "OTA_HotelResPrdPaymentNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAHotelResPrdPaymentNotifRQ otaHotelResPrdPaymentNotifRQ) {
        System.out.println(Serialize.objectToXml(otaHotelResPrdPaymentNotifRQ, OTAHotelResPrdPaymentNotifRQ.class));
        System.out.println(otaHotelResPrdPaymentNotifRQ.getOrderPaymentInfo().getHotelId());
        OTAHotelResPrdPaymentNotifRS otaHotelResPrdPaymentNotifRS = new OTAHotelResPrdPaymentNotifRS();
        SuccessType success = new SuccessType();
        otaHotelResPrdPaymentNotifRS.setWarningsOrSuccessOrErrors(success);
        System.err.println(Serialize.objectToXml(otaHotelResPrdPaymentNotifRS,OTAHotelResPrdPaymentNotifRS.class));
        return otaHotelResPrdPaymentNotifRS;
    }
}
