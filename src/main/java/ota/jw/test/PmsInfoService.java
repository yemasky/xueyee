package ota.jw.test;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Endpoint;

import core.util.Serialize;

//import cn.other.serialize;
/*import pms.autoMapping.NotifyOnOffInfo;
import pms.autoMapping.NotifyOnOffInfoRS;
import pms.autoMapping.PMSHotelMapingRS;
import pms.autoMapping.PMSNotifyOTAModelRQ;
import pms.autoMapping.PmsHotelInfoRQ;
import pms.autoMapping.SuccessType;*/

import ota.jw.AutoMappingWS.NotifyOnOffInfo; 
import ota.jw.AutoMappingWS.NotifyOnOffInfoRS;
import ota.jw.AutoMappingWS.ObjectFactory;
import ota.jw.AutoMappingWS.PMSHotelMapingRS;
import ota.jw.AutoMappingWS.PMSNotifyOTAModelRQ;
import ota.jw.AutoMappingWS.PmsHotelInfoRQ;
import ota.jw.AutoMappingWS.SuccessType;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "GetPmsInfoSoap")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class PmsInfoService {

    public static void main(String[] args) {
        PmsInfoService pmsInfo = new PmsInfoService();
        Endpoint endPoint = Endpoint.publish("http://127.0.0.1:8888/pmsInfo", pmsInfo);
        System.out.println("发布成功！！！！");
    }


    /**
     * PMS通知OTA下线服务
     */
    @WebResult(name = "NotifyOnOffInfoRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "PMSNotifyOnOfflineResult")
    @WebMethod(operationName = "NotifyOnOffInfoRQ", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#PMSNotifyOnOffInfo")
    public NotifyOnOffInfoRS pmsNotifyOnOffline(@WebParam(partName = "NotifyOnOffInfoRQ", name = "NotifyOnOffInfoRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") PMSNotifyOTAModelRQ pmsNotifyOnOffInfoRQ){
        System.out.println(Serialize.objectToXml(pmsNotifyOnOffInfoRQ,PMSNotifyOTAModelRQ.class));
        NotifyOnOffInfoRS NotifyOnOffInfoRs=new NotifyOnOffInfoRS();
        NotifyOnOffInfo notifyOnOffInfo=new NotifyOnOffInfo();
        List<Object> objList=new ArrayList<Object>();
        objList.add(new SuccessType());
        notifyOnOffInfo.setErrorOrSuccess(objList);
        NotifyOnOffInfoRs.setNotifyOnOffInfo(notifyOnOffInfo);
        System.out.println(Serialize.objectToXml(NotifyOnOffInfoRs, NotifyOnOffInfoRS.class));
        return NotifyOnOffInfoRs;
    }

    /**
     * 获取PMS酒店信息
     */
    @WebResult(name = "PmsHotelInfoRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "GetAllPmsHotelInfoResult")
    @WebMethod(operationName = "GetAllPmsHotelInfo", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#GetPMSHotelInfo")
    public PMSHotelMapingRS getAllPmsHotelInfo(@WebParam(partName = "PmsHotelInfoRQ", name = "PmsHotelInfoRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") PmsHotelInfoRQ pmsHotelInfoRQ){
        System.out.println(Serialize.objectToXml(pmsHotelInfoRQ, PmsHotelInfoRQ.class));
        return null;
    }

}
