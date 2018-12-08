package pms.prdPayment;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "WebService", wsdlLocation = "http://localhost:4469/prdPayment.asmx?WSDL", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
public class WebService extends Service {
    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://www.opentravel.org/OTA/2003/05", "WebService1");
    public final static QName WebServiceSoap = new QName("http://www.opentravel.org/OTA/2003/05", "WebService1Soap");
    public final static QName WebServiceSoap12 = new QName("http://www.opentravel.org/OTA/2003/05", "WebService1Soap12");

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:4469/prdPayment.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WebService.class.getName()).log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}", "http://localhost:4469/prdPayment.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public WebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebService() {
        super(WSDL_LOCATION, SERVICE);
    }

    @WebEndpoint(name = "WebServiceSoap")
    public WebServiceSoap getWebService1Soap() {
        return super.getPort(WebServiceSoap, WebServiceSoap.class);
    }

    @WebEndpoint(name = "WebServiceSoap")
    public WebServiceSoap getWebService1Soap(WebServiceFeature... features) {
        return super.getPort(WebServiceSoap, WebServiceSoap.class, features);
    }

    @WebEndpoint(name = "WebServiceSoap12")
    public WebServiceSoap getWebService1Soap12() {
        return super.getPort(WebServiceSoap12, WebServiceSoap.class);
    }

    @WebEndpoint(name = "WebServiceSoap12")
    public WebServiceSoap getWebService1Soap12(WebServiceFeature... features) {
        return super.getPort(WebServiceSoap12, WebServiceSoap.class, features);
    }
}