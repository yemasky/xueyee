
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ota.jw.ARIAdapterGateWay;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-07-26T15:51:49.950+08:00
 * Generated source version: 3.2.4
 *
 */

@javax.jws.WebService(
                      serviceName = "ARIAdapterGateWay",
                      portName = "ARIAdapterGateWaySoap12",
                      targetNamespace = "http://tempuri.org/",
                      wsdlLocation = "http://124.127.242.67:38196/HW.ARIAdapterGateWay/ARIAdapterGateWay.asmx?WSDL",
                      endpointInterface = "ota.jw.ARIAdapterGateWay.ARIAdapterGateWaySoap")

public class ARIAdapterGateWaySoap12Impl implements ARIAdapterGateWaySoap {

    private static final Logger LOG = Logger.getLogger(ARIAdapterGateWaySoap12Impl.class.getName());

    /* (non-Javadoc)
     * @see ota.jw.ARIAdapterGateWay.ARIAdapterGateWaySoap#queryHotelRoomRate(ota.jw.ARIAdapterGateWay.QueryHotelRoomRateRQ queryHotelRoomRateRQ)*
     */
    public ota.jw.ARIAdapterGateWay.QueryHotelRoomRateRS queryHotelRoomRate(QueryHotelRoomRateRQ queryHotelRoomRateRQ) {
        LOG.info("Executing operation queryHotelRoomRate");
        System.out.println(queryHotelRoomRateRQ);
        try {
            ota.jw.ARIAdapterGateWay.QueryHotelRoomRateRS _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ota.jw.ARIAdapterGateWay.ARIAdapterGateWaySoap#queryHotelRoomCount(ota.jw.ARIAdapterGateWay.QueryHotelRoomCountRQ queryHotelRoomCountRQ)*
     */
    public ota.jw.ARIAdapterGateWay.QueryHotelRoomCountRS queryHotelRoomCount(QueryHotelRoomCountRQ queryHotelRoomCountRQ) {
        LOG.info("Executing operation queryHotelRoomCount");
        System.out.println(queryHotelRoomCountRQ);
        try {
            ota.jw.ARIAdapterGateWay.QueryHotelRoomCountRS _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ota.jw.ARIAdapterGateWay.ARIAdapterGateWaySoap#queryHotelAvailStatus(ota.jw.ARIAdapterGateWay.QueryHotelAvailStatusRQ queryHotelAvailStatusRQ)*
     */
    public ota.jw.ARIAdapterGateWay.QueryHotelAvailStatusRS queryHotelAvailStatus(QueryHotelAvailStatusRQ queryHotelAvailStatusRQ) {
        LOG.info("Executing operation queryHotelAvailStatus");
        System.out.println(queryHotelAvailStatusRQ);
        try {
            ota.jw.ARIAdapterGateWay.QueryHotelAvailStatusRS _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
