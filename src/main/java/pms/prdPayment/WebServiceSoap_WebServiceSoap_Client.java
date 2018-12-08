package pms.prdPayment;

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public final class WebServiceSoap_WebServiceSoap_Client {
    private static final QName SERVICE_NAME = new QName("http://www.opentravel.org/OTA/2003/05", "WebService1");

    private WebServiceSoap_WebServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = WebService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        WebService ss = new WebService(wsdlURL, SERVICE_NAME);
        WebServiceSoap port = ss.getWebService1Soap();
        {
            System.out.println("Invoking preAuthorizationBooking...");
            pms.prdPayment.OTAHotelResPrdPaymentNotifRQ _preAuthorizationBooking_otaHotelResPrdPaymentNotifRQ = null;
            pms.prdPayment.OTAHotelResPrdPaymentNotifRS _preAuthorizationBooking__return = port.preAuthorizationBooking(_preAuthorizationBooking_otaHotelResPrdPaymentNotifRQ);
            System.out.println("preAuthorizationBooking.result=" + _preAuthorizationBooking__return);
        }
        System.exit(0);
    }
}