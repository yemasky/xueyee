package pms.ctripinland;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://tempuri.org/", name = "BookingServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface BookingServiceSoap {

    /**
     * 订单服务
     */
    @WebResult(name = "InvokeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Invoke", targetNamespace = "http://tempuri.org/", className = "pms.ctripinland.Invoke")
    @WebMethod(operationName = "Invoke", action = "http://tempuri.org/Request")
    @ResponseWrapper(localName = "InvokeResponse", targetNamespace = "http://tempuri.org/", className = "pms.ctripinland.InvokeResponse")
    public java.lang.String invoke(@WebParam(name = "requestXml", targetNamespace = "http://tempuri.org/") java.lang.String requestXml, @WebParam(name = "Invoketype", targetNamespace = "http://tempuri.org/") java.lang.String invoketype);
}