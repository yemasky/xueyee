
package ota.jw.GenericSeamlessGateway;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-07-25T15:29:59.745+08:00
 * Generated source version: 3.2.4
 *
 */
public final class CancelBookingReservationSoap_CancelBookingReservationSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://Booking.hw/", "CancelBookingReservation");

    private CancelBookingReservationSoap_CancelBookingReservationSoap12_Client() {
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
        CancelBookingReservationSoap port = ss.getCancelBookingReservationSoap12();

        {
        System.out.println("Invoking processReservationRequest...");
        ota.jw.GenericSeamlessGateway.OTAHotelResRQ _processReservationRequest_otaHotelResRQ = null;
        ota.jw.GenericSeamlessGateway.OTAHotelResRS _processReservationRequest__return = port.processReservationRequest(_processReservationRequest_otaHotelResRQ);
        System.out.println("processReservationRequest.result=" + _processReservationRequest__return);


        }

        System.exit(0);
    }

}
