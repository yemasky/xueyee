package pms.MappingWebAPI;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "AutoMappingServices", wsdlLocation = "http://124.127.242.67/AutoMappingWebAPI/AutoMappingServices.asmx?WSDL", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
public class AutoMappingServices extends Service {
    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://www.opentravel.org/OTA/2003/05", "AutoMappingServices");
    public final static QName AutoMappingServicesSoap = new QName("http://www.opentravel.org/OTA/2003/05", "AutoMappingServicesSoap");
    public final static QName AutoMappingServicesSoap12 = new QName("http://www.opentravel.org/OTA/2003/05", "AutoMappingServicesSoap12");

    static {
        URL url = null;
        try {
            url = new URL("http://124.127.242.67/AutoMappingWebAPI/AutoMappingServices.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AutoMappingServices.class.getName()).log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}", "http://124.127.242.67/AutoMappingWebAPI/AutoMappingServices.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public AutoMappingServices(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AutoMappingServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AutoMappingServices() {
        super(WSDL_LOCATION, SERVICE);
    }

    @WebEndpoint(name = "AutoMappingServicesSoap")
    public AutoMappingServicesSoap getAutoMappingServicesSoap() {
        return super.getPort(AutoMappingServicesSoap, AutoMappingServicesSoap.class);
    }

    @WebEndpoint(name = "AutoMappingServicesSoap")
    public AutoMappingServicesSoap getAutoMappingServicesSoap(WebServiceFeature... features) {
        return super.getPort(AutoMappingServicesSoap, AutoMappingServicesSoap.class, features);
    }

    @WebEndpoint(name = "AutoMappingServicesSoap12")
    public AutoMappingServicesSoap getAutoMappingServicesSoap12() {
        return super.getPort(AutoMappingServicesSoap12, AutoMappingServicesSoap.class);
    }

    @WebEndpoint(name = "AutoMappingServicesSoap12")
    public AutoMappingServicesSoap getAutoMappingServicesSoap12(WebServiceFeature... features) {
        return super.getPort(AutoMappingServicesSoap12, AutoMappingServicesSoap.class, features);
    }
}