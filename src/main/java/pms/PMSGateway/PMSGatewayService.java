package pms.PMSGateway;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "PMSGatewayService", wsdlLocation = "http://124.127.242.67/PMSGateway/PMSGatewayService.asmx?WSDL", targetNamespace = "http://tempuri.org/")
public class PMSGatewayService extends Service {
    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://www.opentravel.org/OTA/2003/05", "PMSGatewayService");
    public final static QName PMSGatewayServiceSoap12 = new QName("http://www.opentravel.org/OTA/2003/05", "PMSGatewayServiceSoap12");
    public final static QName PMSGatewayServiceSoap = new QName("http://www.opentravel.org/OTA/2003/05", "PMSGatewayServiceSoap");
    public final static QName PMSGatewayServiceHttpGet = new QName("http://www.opentravel.org/OTA/2003/05", "PMSGatewayServiceHttpGet");
    public final static QName PMSGatewayServiceHttpPost = new QName("http://www.opentravel.org/OTA/2003/05", "PMSGatewayServiceHttpPost");

    static {
        URL url = null;
        try {
            url = new URL("http://124.127.242.67/PMSGateway/PMSGatewayService.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PMSGatewayService.class.getName()).log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}", "http://124.127.242.67/PMSGateway/PMSGatewayService.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public PMSGatewayService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PMSGatewayService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PMSGatewayService() {
        super(WSDL_LOCATION, SERVICE);
    }

    @WebEndpoint(name = "PMSGatewayServiceSoap12")
    public PMSGatewayServiceSoap getPMSGatewayServiceSoap12() {
        return super.getPort(PMSGatewayServiceSoap12, PMSGatewayServiceSoap.class);
    }

    @WebEndpoint(name = "PMSGatewayServiceSoap12")
    public PMSGatewayServiceSoap getPMSGatewayServiceSoap12(WebServiceFeature... features) {
        return super.getPort(PMSGatewayServiceSoap12, PMSGatewayServiceSoap.class, features);
    }

    @WebEndpoint(name = "PMSGatewayServiceSoap")
    public PMSGatewayServiceSoap getPMSGatewayServiceSoap() {
        return super.getPort(PMSGatewayServiceSoap, PMSGatewayServiceSoap.class);
    }

    @WebEndpoint(name = "PMSGatewayServiceSoap")
    public PMSGatewayServiceSoap getPMSGatewayServiceSoap(WebServiceFeature... features) {
        return super.getPort(PMSGatewayServiceSoap, PMSGatewayServiceSoap.class, features);
    }

    @WebEndpoint(name = "PMSGatewayServiceHttpGet")
    public PMSGatewayServiceHttpGet getPMSGatewayServiceHttpGet() {
        return super.getPort(PMSGatewayServiceHttpGet, PMSGatewayServiceHttpGet.class);
    }

    @WebEndpoint(name = "PMSGatewayServiceHttpGet")
    public PMSGatewayServiceHttpGet getPMSGatewayServiceHttpGet(WebServiceFeature... features) {
        return super.getPort(PMSGatewayServiceHttpGet, PMSGatewayServiceHttpGet.class, features);
    }

    @WebEndpoint(name = "PMSGatewayServiceHttpPost")
    public PMSGatewayServiceHttpPost getPMSGatewayServiceHttpPost() {
        return super.getPort(PMSGatewayServiceHttpPost, PMSGatewayServiceHttpPost.class);
    }

    @WebEndpoint(name = "PMSGatewayServiceHttpPost")
    public PMSGatewayServiceHttpPost getPMSGatewayServiceHttpPost(WebServiceFeature... features) {
        return super.getPort(PMSGatewayServiceHttpPost, PMSGatewayServiceHttpPost.class, features);
    }
}