package pms.service;

import pms.autoMapping.ObjectFactory;
import pms.autoMapping.PMSHotelMapingRS;
import pms.autoMapping.PmsHotelInfoRQ;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "GetPmsInfoSoap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class pmsHotelInfoService {

    /**
     * 获取PMS酒店信息
     */
    @WebResult(name = "PmsHotelInfoRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "GetAllPmsHotelInfoResult")
    @WebMethod(operationName = "GetAllPmsHotelInfo", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#GetPMSHotelInfo")
    public PMSHotelMapingRS getAllPmsHotelInfo(@WebParam(partName = "PmsHotelInfoRQ", name = "PmsHotelInfoRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") PmsHotelInfoRQ pmsHotelInfoRQ) {
        return null;
    }

}
