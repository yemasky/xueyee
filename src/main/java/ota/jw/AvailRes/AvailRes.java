package ota.jw.AvailRes;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-08-02T16:14:55.345+08:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "AvailRes",
                  wsdlLocation = "http://124.127.242.67:38196/GenericSeamlessGateway/AvailRes.asmx?wsdl",
                  targetNamespace = "http://www.opentravel.org/OTA/2003/05")
public class AvailRes extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.opentravel.org/OTA/2003/05", "AvailRes");
    public final static QName AvailResSoap = new QName("http://www.opentravel.org/OTA/2003/05", "AvailResSoap");
    public final static QName AvailResSoap12 = new QName("http://www.opentravel.org/OTA/2003/05", "AvailResSoap12");
    public final static QName AvailResHttpGet = new QName("http://www.opentravel.org/OTA/2003/05", "AvailResHttpGet");
    public final static QName AvailResHttpPost = new QName("http://www.opentravel.org/OTA/2003/05", "AvailResHttpPost");
    static {
        URL url = null;
        try {
            url = new URL("http://124.127.242.67:38196/GenericSeamlessGateway/AvailRes.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AvailRes.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://124.127.242.67:38196/GenericSeamlessGateway/AvailRes.asmx?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AvailRes(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AvailRes(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AvailRes() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AvailRes(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AvailRes(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AvailRes(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AvailResSoap
     */
    @WebEndpoint(name = "AvailResSoap")
    public AvailResSoap getAvailResSoap() {
        return super.getPort(AvailResSoap, AvailResSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AvailResSoap
     */
    @WebEndpoint(name = "AvailResSoap")
    public AvailResSoap getAvailResSoap(WebServiceFeature... features) {
        return super.getPort(AvailResSoap, AvailResSoap.class, features);
    }


    /**
     *
     * @return
     *     returns AvailResSoap
     */
    @WebEndpoint(name = "AvailResSoap12")
    public AvailResSoap getAvailResSoap12() {
        return super.getPort(AvailResSoap12, AvailResSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AvailResSoap
     */
    @WebEndpoint(name = "AvailResSoap12")
    public AvailResSoap getAvailResSoap12(WebServiceFeature... features) {
        return super.getPort(AvailResSoap12, AvailResSoap.class, features);
    }


    /**
     *
     * @return
     *     returns AvailResHttpGet
     */
    @WebEndpoint(name = "AvailResHttpGet")
    public AvailResHttpGet getAvailResHttpGet() {
        return super.getPort(AvailResHttpGet, AvailResHttpGet.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AvailResHttpGet
     */
    @WebEndpoint(name = "AvailResHttpGet")
    public AvailResHttpGet getAvailResHttpGet(WebServiceFeature... features) {
        return super.getPort(AvailResHttpGet, AvailResHttpGet.class, features);
    }


    /**
     *
     * @return
     *     returns AvailResHttpPost
     */
    @WebEndpoint(name = "AvailResHttpPost")
    public AvailResHttpPost getAvailResHttpPost() {
        return super.getPort(AvailResHttpPost, AvailResHttpPost.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AvailResHttpPost
     */
    @WebEndpoint(name = "AvailResHttpPost")
    public AvailResHttpPost getAvailResHttpPost(WebServiceFeature... features) {
        return super.getPort(AvailResHttpPost, AvailResHttpPost.class, features);
    }

}
