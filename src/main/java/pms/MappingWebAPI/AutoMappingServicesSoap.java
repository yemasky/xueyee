package pms.MappingWebAPI;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://www.opentravel.org/OTA/2003/05", name = "AutoMappingServicesSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface AutoMappingServicesSoap {

    /**
     * 产品智能匹配
     */
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "IntelligentMappingRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "IntelligentMappingResult")
    @WebMethod(operationName = "IntelligentMapping", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#IntelligentMapping")
    public RoomMatchRS intelligentMapping(@WebParam(partName = "RoomMatchRQ", name = "IntelligentMappingRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") RoomMatchRQ roomMatchRQ);

    /**
     * 通过EBK账号获取携程子酒店信息
     */
    @WebResult(name = "CtripSubHotelInfoByEBKRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
    @RequestWrapper(localName = "GetCtripSubHotelInfoByEBK", targetNamespace = "http://www.opentravel.org/OTA/2003/05", className = "pms.MappingWebAPI.GetCtripSubHotelInfoByEBK")
    @WebMethod(operationName = "GetCtripSubHotelInfoByEBK", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#GetCtripSubHotelInfoByEBK")
    @ResponseWrapper(localName = "GetCtripSubHotelInfoByEBKResponse", targetNamespace = "http://www.opentravel.org/OTA/2003/05", className = "pms.MappingWebAPI.GetCtripSubHotelInfoByEBKResponse")
    public pms.MappingWebAPI.CtripSubHotelInfoByEBKRS getCtripSubHotelInfoByEBK(@WebParam(name = "CtripSubHotelInfoByEBKRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") pms.MappingWebAPI.CtripSubHotelInfoByEBKRQ ctripSubHotelInfoByEBKRQ);

    /**
     * 酒店产品结果查询
     */
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "MappingStatusSearchRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "MappingStatusSearchResult")
    @WebMethod(operationName = "MappingStatusSearch", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#MappingStatusSearch")
    public MappingStatusSearchRS mappingStatusSearch(@WebParam(partName = "MappingStatusSearchRQ", name = "MappingStatusSearchRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") MappingStatusSearchRQ mappingStatusSearchRQ);

    /**
     * 获取产品信息
     */
    @WebResult(name = "RoomProductInfoRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
    @RequestWrapper(localName = "GetRoomProductInfo", targetNamespace = "http://www.opentravel.org/OTA/2003/05", className = "pms.MappingWebAPI.GetRoomProductInfo")
    @WebMethod(operationName = "GetRoomProductInfo", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#GetRoomProductInfoRS")
    @ResponseWrapper(localName = "GetRoomProductInfoResponse", targetNamespace = "http://www.opentravel.org/OTA/2003/05", className = "pms.MappingWebAPI.GetRoomProductInfoResponse")
    public pms.MappingWebAPI.ProductMappingInfoRS getRoomProductInfo(@WebParam(name = "subHotelId", targetNamespace = "http://www.opentravel.org/OTA/2003/05") java.lang.String subHotelId, @WebParam(name = "type", targetNamespace = "http://www.opentravel.org/OTA/2003/05") java.lang.String type);

    /**
     * 设置匹配
     */
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "SetMappingRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "SetMappingInfoResult")
    @WebMethod(operationName = "SetMappingInfo", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#SetMappingInfo")
    public SetMappingRS setMappingInfo(@WebParam(partName = "SetMappingRQ", name = "SetMappingRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05") SetMappingRQ setMappingRQ);

    /**
     * 获取携程子酒店信息
     */
    @WebResult(name = "CtripSubHotelInfoRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
    @RequestWrapper(localName = "GetCtripSubHotelInfo", targetNamespace = "http://www.opentravel.org/OTA/2003/05", className = "pms.MappingWebAPI.GetCtripSubHotelInfo")
    @WebMethod(operationName = "GetCtripSubHotelInfo", action = "http://htng.org/2014B/HTNG_ARIAndReservationPushService#GetCtripSubHotelInfo")
    @ResponseWrapper(localName = "GetCtripSubHotelInfoResponse", targetNamespace = "http://www.opentravel.org/OTA/2003/05", className = "pms.MappingWebAPI.GetCtripSubHotelInfoResponse")
    public pms.MappingWebAPI.CtripSubHotelInfoRS getCtripSubHotelInfo(@WebParam(name = "masterHotelId", targetNamespace = "http://www.opentravel.org/OTA/2003/05") java.lang.String masterHotelId);
}