package pms.ctripinland;

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public final class BookingServiceSoap_BookingServiceSoap_Client {
    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "BookingService");

    private BookingServiceSoap_BookingServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BookingService.WSDL_LOCATION;
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

        BookingService ss = new BookingService(wsdlURL, SERVICE_NAME);
        BookingServiceSoap port = ss.getBookingServiceSoap();
        {
            System.out.println("Invoking invoke...");
            java.lang.String _invoke_requestXml = "";
            java.lang.String _invoke_invoketype = "";
            java.lang.String _invoke__return = port.invoke(_invoke_requestXml, _invoke_invoketype);
            System.out.println("invoke.result=" + _invoke__return);
        }
        System.exit(0);
    }
}