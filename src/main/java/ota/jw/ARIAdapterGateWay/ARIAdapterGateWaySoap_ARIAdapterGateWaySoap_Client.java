
package ota.jw.ARIAdapterGateWay;

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
 * 2018-07-26T15:51:49.932+08:00
 * Generated source version: 3.2.4
 *
 */
public final class ARIAdapterGateWaySoap_ARIAdapterGateWaySoap_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "ARIAdapterGateWay");

    private ARIAdapterGateWaySoap_ARIAdapterGateWaySoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ARIAdapterGateWay.WSDL_LOCATION;
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

        ARIAdapterGateWay ss = new ARIAdapterGateWay(wsdlURL, SERVICE_NAME);
        ARIAdapterGateWaySoap port = ss.getARIAdapterGateWaySoap();

        {
        System.out.println("Invoking queryHotelRoomRate...");
        ota.jw.ARIAdapterGateWay.QueryHotelRoomRateRQ _queryHotelRoomRate_queryHotelRoomRateRQ = null;
        ota.jw.ARIAdapterGateWay.QueryHotelRoomRateRS _queryHotelRoomRate__return = port.queryHotelRoomRate(_queryHotelRoomRate_queryHotelRoomRateRQ);
        System.out.println("queryHotelRoomRate.result=" + _queryHotelRoomRate__return);


        }
        {
        System.out.println("Invoking queryHotelRoomCount...");
        ota.jw.ARIAdapterGateWay.QueryHotelRoomCountRQ _queryHotelRoomCount_queryHotelRoomCountRQ = null;
        ota.jw.ARIAdapterGateWay.QueryHotelRoomCountRS _queryHotelRoomCount__return = port.queryHotelRoomCount(_queryHotelRoomCount_queryHotelRoomCountRQ);
        System.out.println("queryHotelRoomCount.result=" + _queryHotelRoomCount__return);


        }
        {
        System.out.println("Invoking queryHotelAvailStatus...");
        ota.jw.ARIAdapterGateWay.QueryHotelAvailStatusRQ _queryHotelAvailStatus_queryHotelAvailStatusRQ = null;
        ota.jw.ARIAdapterGateWay.QueryHotelAvailStatusRS _queryHotelAvailStatus__return = port.queryHotelAvailStatus(_queryHotelAvailStatus_queryHotelAvailStatusRQ);
        System.out.println("queryHotelAvailStatus.result=" + _queryHotelAvailStatus__return);


        }

        System.exit(0);
    }

}
