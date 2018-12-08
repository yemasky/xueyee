
package ota.jw.AutoMappingWebAPI;

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
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-07-05T16:01:31.665+08:00
 * Generated source version: 3.2.4
 *
 */
public final class AutoMappingServicesSoap_AutoMappingServicesSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://www.opentravel.org/OTA/2003/05", "AutoMappingServices");

    private AutoMappingServicesSoap_AutoMappingServicesSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AutoMappingServices.WSDL_LOCATION;
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

        AutoMappingServices ss = new AutoMappingServices(wsdlURL, SERVICE_NAME);
        AutoMappingServicesSoap port = ss.getAutoMappingServicesSoap12();

        {
        System.out.println("Invoking getCtripSubHotelInfo...");
        java.lang.String _getCtripSubHotelInfo_masterHotelId = "";
        ota.jw.AutoMappingWebAPI.CtripSubHotelInfoRS _getCtripSubHotelInfo__return = port.getCtripSubHotelInfo(_getCtripSubHotelInfo_masterHotelId);
        System.out.println("getCtripSubHotelInfo.result=" + _getCtripSubHotelInfo__return);


        }
        {
        System.out.println("Invoking getHotelInfo...");
        ota.jw.AutoMappingWebAPI.GetHotelInfoRQ _getHotelInfo_getHotelInfoRQ = null;
        ota.jw.AutoMappingWebAPI.GetHotelInfoRS _getHotelInfo__return = port.getHotelInfo(_getHotelInfo_getHotelInfoRQ);
        System.out.println("getHotelInfo.result=" + _getHotelInfo__return);


        }
        {
        System.out.println("Invoking setMappingInfo...");
        ota.jw.AutoMappingWebAPI.SetMappingRQ _setMappingInfo_setMappingRQ = null;
        ota.jw.AutoMappingWebAPI.SetMappingRS _setMappingInfo__return = port.setMappingInfo(_setMappingInfo_setMappingRQ);
        System.out.println("setMappingInfo.result=" + _setMappingInfo__return);


        }
        {
        System.out.println("Invoking intelligentMapping...");
        ota.jw.AutoMappingWebAPI.RoomMatchRQ _intelligentMapping_roomMatchRQ = null;
        ota.jw.AutoMappingWebAPI.RoomMatchRS _intelligentMapping__return = port.intelligentMapping(_intelligentMapping_roomMatchRQ);
        System.out.println("intelligentMapping.result=" + _intelligentMapping__return);


        }
        {
        System.out.println("Invoking getRoomProductInfo...");
        java.lang.String _getRoomProductInfo_subHotelId = "";
        java.lang.String _getRoomProductInfo_type = "";
        ota.jw.AutoMappingWebAPI.ProductMappingInfoRS _getRoomProductInfo__return = port.getRoomProductInfo(_getRoomProductInfo_subHotelId, _getRoomProductInfo_type);
        System.out.println("getRoomProductInfo.result=" + _getRoomProductInfo__return);


        }
        {
        System.out.println("Invoking mappingStatusSearch...");
        ota.jw.AutoMappingWebAPI.MappingStatusSearchRQ _mappingStatusSearch_mappingStatusSearchRQ = null;
        ota.jw.AutoMappingWebAPI.MappingStatusSearchRS _mappingStatusSearch__return = port.mappingStatusSearch(_mappingStatusSearch_mappingStatusSearchRQ);
        System.out.println("mappingStatusSearch.result=" + _mappingStatusSearch__return);


        }
        {
        System.out.println("Invoking getCtripSubHotelInfoByEBK...");
        ota.jw.AutoMappingWebAPI.CtripSubHotelInfoByEBKRQ _getCtripSubHotelInfoByEBK_ctripSubHotelInfoByEBKRQ = null;
        ota.jw.AutoMappingWebAPI.CtripSubHotelInfoByEBKRS _getCtripSubHotelInfoByEBK__return = port.getCtripSubHotelInfoByEBK(_getCtripSubHotelInfoByEBK_ctripSubHotelInfoByEBKRQ);
        System.out.println("getCtripSubHotelInfoByEBK.result=" + _getCtripSubHotelInfoByEBK__return);


        }

        System.exit(0);
    }

}
