package pms.autoMapping;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "GetPmsInfo", wsdlLocation = "http://124.127.242.67/AutoMappingWS/GetPmsInfo.asmx?WSDL", targetNamespace = "http://tempuri.org/")
public class GetPmsInfo extends Service {
    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.opentravel.org/OTA/2003/05", "GetPmsInfo");
    public final static QName GetPmsInfoSoap12 = new QName("http://www.opentravel.org/OTA/2003/05", "GetPmsInfoSoap12");
    public final static QName GetPmsInfoSoap = new QName("http://www.opentravel.org/OTA/2003/05", "GetPmsInfoSoap");
    public final static QName GetPmsInfoHttpPost = new QName("http://www.opentravel.org/OTA/2003/05", "GetPmsInfoHttpPost");

    static {
        URL url = null;
        try {
            url = new URL("http://124.127.242.67/AutoMappingWS/GetPmsInfo.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetPmsInfo.class.getName()).log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}", "http://124.127.242.67/AutoMappingWS/GetPmsInfo.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public GetPmsInfo(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetPmsInfo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetPmsInfo() {
        super(WSDL_LOCATION, SERVICE);
    }

    @WebEndpoint(name = "GetPmsInfoSoap12")
    public GetPmsInfoSoap getGetPmsInfoSoap12() {
        return super.getPort(GetPmsInfoSoap12, GetPmsInfoSoap.class);
    }

    @WebEndpoint(name = "GetPmsInfoSoap12")
    public GetPmsInfoSoap getGetPmsInfoSoap12(WebServiceFeature... features) {
        return super.getPort(GetPmsInfoSoap12, GetPmsInfoSoap.class, features);
    }

    @WebEndpoint(name = "GetPmsInfoSoap")
    public GetPmsInfoSoap getGetPmsInfoSoap() {
        return super.getPort(GetPmsInfoSoap, GetPmsInfoSoap.class);
    }

    @WebEndpoint(name = "GetPmsInfoSoap")
    public GetPmsInfoSoap getGetPmsInfoSoap(WebServiceFeature... features) {
        return super.getPort(GetPmsInfoSoap, GetPmsInfoSoap.class, features);
    }

    @WebEndpoint(name = "GetPmsInfoHttpPost")
    public GetPmsInfoHttpPost getGetPmsInfoHttpPost() {
        return super.getPort(GetPmsInfoHttpPost, GetPmsInfoHttpPost.class);
    }

    @WebEndpoint(name = "GetPmsInfoHttpPost")
    public GetPmsInfoHttpPost getGetPmsInfoHttpPost(WebServiceFeature... features) {
        return super.getPort(GetPmsInfoHttpPost, GetPmsInfoHttpPost.class, features);
    }
}