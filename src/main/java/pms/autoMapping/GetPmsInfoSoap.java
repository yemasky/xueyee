package pms.autoMapping;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "GetPmsInfoSoap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GetPmsInfoSoap {

    /**
     * PMS通知OTA下线服务
     */
    @WebResult(name = "PMSNotifyOnOffInfoRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "PMSNotifyOnOfflineResult")
    @WebMethod(operationName = "PMSNotifyOnOffline", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#PMSNotifyOnOffInfo")
    public NotifyOnOffInfoRS pmsNotifyOnOffline(@WebParam(partName = "PMSNotifyOnOffInfoRQ", name = "PMSNotifyOnOffInfoRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") PMSNotifyOTAModelRQ pmsNotifyOnOffInfoRQ);

    /**
     * 获取PMS酒店信息
     */
    @WebResult(name = "PmsHotelInfoRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "GetAllPmsHotelInfoResult")
    @WebMethod(operationName = "GetAllPmsHotelInfo", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#GetPMSHotelInfo")
    public PMSHotelMapingRS getAllPmsHotelInfo(@WebParam(partName = "PmsHotelInfoRQ", name = "PmsHotelInfoRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") PmsHotelInfoRQ pmsHotelInfoRQ);
}