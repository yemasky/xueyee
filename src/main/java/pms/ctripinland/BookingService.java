package pms.ctripinland;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "BookingService", wsdlLocation = "http://124.127.242.67/CtripDomesticgateway/bookingservice.asmx?WSDL", targetNamespace = "http://tempuri.org/")
public class BookingService extends Service {
    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://tempuri.org/", "BookingService");
    public final static QName BookingServiceSoap12 = new QName("http://tempuri.org/", "BookingServiceSoap12");
    public final static QName BookingServiceSoap = new QName("http://tempuri.org/", "BookingServiceSoap");

    static {
        URL url = null;
        try {
            url = new URL("http://124.127.242.67/CtripDomesticgateway/bookingservice.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BookingService.class.getName()).log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}", "http://124.127.242.67/CtripDomesticgateway/bookingservice.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public BookingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BookingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookingService() {
        super(WSDL_LOCATION, SERVICE);
    }

    @WebEndpoint(name = "BookingServiceSoap12")
    public BookingServiceSoap getBookingServiceSoap12() {
        return super.getPort(BookingServiceSoap12, BookingServiceSoap.class);
    }

    @WebEndpoint(name = "BookingServiceSoap12")
    public BookingServiceSoap getBookingServiceSoap12(WebServiceFeature... features) {
        return super.getPort(BookingServiceSoap12, BookingServiceSoap.class, features);
    }

    @WebEndpoint(name = "BookingServiceSoap")
    public BookingServiceSoap getBookingServiceSoap() {
        return super.getPort(BookingServiceSoap, BookingServiceSoap.class);
    }

    @WebEndpoint(name = "BookingServiceSoap")
    public BookingServiceSoap getBookingServiceSoap(WebServiceFeature... features) {
        return super.getPort(BookingServiceSoap, BookingServiceSoap.class, features);
    }
}