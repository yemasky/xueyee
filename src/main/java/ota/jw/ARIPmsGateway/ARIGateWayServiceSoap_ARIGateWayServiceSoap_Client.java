
package ota.jw.ARIPmsGateway;

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
 * 2018-07-04T16:34:03.303+08:00
 * Generated source version: 3.2.4
 *
 */
public final class ARIGateWayServiceSoap_ARIGateWayServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "ARIGateWayService");

    private ARIGateWayServiceSoap_ARIGateWayServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ARIGateWayService.WSDL_LOCATION;
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

        ARIGateWayService ss = new ARIGateWayService(wsdlURL, SERVICE_NAME);
        ARIGateWayServiceSoap port = ss.getARIGateWayServiceSoap();

        {
        System.out.println("Invoking otaHotelAvailNotifRQ...");
        ota.jw.ARIPmsGateway.OTAHotelAvailNotifRQ _otaHotelAvailNotifRQ_otaHotelAvailNotifRQ1 = null;
        ota.jw.ARIPmsGateway.OTAHotelAvailNotifRS _otaHotelAvailNotifRQ__return = port.otaHotelAvailNotifRQ(_otaHotelAvailNotifRQ_otaHotelAvailNotifRQ1);
        System.out.println("otaHotelAvailNotifRQ.result=" + _otaHotelAvailNotifRQ__return);


        }
        {
        System.out.println("Invoking otaHotelRatePlanNotifRQ...");
        ota.jw.ARIPmsGateway.OTAHotelRatePlanNotifRQ _otaHotelRatePlanNotifRQ_otaHotelRatePlanNotifRQ1 = null;
        ota.jw.ARIPmsGateway.OTAHotelRatePlanNotifRS _otaHotelRatePlanNotifRQ__return = port.otaHotelRatePlanNotifRQ(_otaHotelRatePlanNotifRQ_otaHotelRatePlanNotifRQ1);
        System.out.println("otaHotelRatePlanNotifRQ.result=" + _otaHotelRatePlanNotifRQ__return);


        }
        {
        System.out.println("Invoking otaHotelInvCountNotifRQ...");
        ota.jw.ARIPmsGateway.OTAHotelInvCountNotifRQ _otaHotelInvCountNotifRQ_otaHotelInvCountNotifRQ1 = null;
        ota.jw.ARIPmsGateway.OTAHotelInvCountNotifRS _otaHotelInvCountNotifRQ__return = port.otaHotelInvCountNotifRQ(_otaHotelInvCountNotifRQ_otaHotelInvCountNotifRQ1);
        System.out.println("otaHotelInvCountNotifRQ.result=" + _otaHotelInvCountNotifRQ__return);


        }

        System.exit(0);
    }

}