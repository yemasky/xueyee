
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ota.jw.GenericSeamlessGateway;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-07-25T15:29:21.882+08:00
 * Generated source version: 3.2.4
 *
 */

@javax.jws.WebService(
                      serviceName = "BookingReservation",
                      portName = "BookingReservationSoap12",
                      targetNamespace = "http://www.opentravel.org/OTA/2003/05",
                      wsdlLocation = "http://124.127.242.67:38196/GenericSeamlessGateway/CreateBookingReservation.asmx?WSDL",
                      endpointInterface = "ota.jw.GenericSeamlessGateway.BookingReservationSoap")

public class BookingReservationSoap12Impl implements BookingReservationSoap {

    private static final Logger LOG = Logger.getLogger(BookingReservationSoap12Impl.class.getName());

    /* (non-Javadoc)
     * @see ota.jw.GenericSeamlessGateway.BookingReservationSoap#processReservationRequest(ota.jw.GenericSeamlessGateway.OTAHotelResRQ otaHotelResRQ)*
     */
    public ota.jw.GenericSeamlessGateway.OTAHotelResRS processReservationRequest(OTAHotelResRQ otaHotelResRQ) {
        LOG.info("Executing operation processReservationRequest");
        System.out.println(otaHotelResRQ);
        try {
            ota.jw.GenericSeamlessGateway.OTAHotelResRS _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
