
package ota.jw.GenericSeamlessGateway;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-07-25T15:29:59.787+08:00
 * Generated source version: 3.2.4
 *
 */
public final class CancelBookingReservationHttpPost_CancelBookingReservationHttpPost_Client {

    private static final QName SERVICE_NAME = new QName("http://Booking.hw/", "CancelBookingReservation");

    private CancelBookingReservationHttpPost_CancelBookingReservationHttpPost_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CancelBookingReservation.WSDL_LOCATION;
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

        CancelBookingReservation ss = new CancelBookingReservation(wsdlURL, SERVICE_NAME);
        CancelBookingReservationHttpPost port = ss.getCancelBookingReservationHttpPost();


        System.exit(0);
    }

}
