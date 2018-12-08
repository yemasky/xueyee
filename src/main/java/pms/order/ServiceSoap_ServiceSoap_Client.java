package pms.order;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2017-01-10T11:18:00.003+08:00
 * Generated source version: 2.7.10
 */
public final class ServiceSoap_ServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "Service");

    private ServiceSoap_ServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Service.WSDL_LOCATION;
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

        Service ss = new Service(wsdlURL, SERVICE_NAME);
        ServiceSoap port = ss.getServiceSoap();

        {
            System.out.println("Invoking checkHotelAvailability...");
            pms.order.OTAHotelAvailRQ _checkHotelAvailability_otaHoelResRQ = null;
            pms.order.OTAHotelAvailRS _checkHotelAvailability__return = port.checkHotelAvailability(_checkHotelAvailability_otaHoelResRQ);
            System.out.println("checkHotelAvailability.result=" + _checkHotelAvailability__return);


        }
        {
            System.out.println("Invoking bookingAction...");
            pms.order.OTAHotelResRQ _bookingAction_otaHoelResRQ = null;
            pms.order.HotelResResponseType _bookingAction__return = port.bookingAction(_bookingAction_otaHoelResRQ);
            System.out.println("bookingAction.result=" + _bookingAction__return);


        }

        System.exit(0);
    }

}
