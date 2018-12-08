package pms.MappingWebAPI;

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

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
            System.out.println("Invoking intelligentMapping...");
            pms.MappingWebAPI.RoomMatchRQ _intelligentMapping_roomMatchRQ = null;
            pms.MappingWebAPI.RoomMatchRS _intelligentMapping__return = port.intelligentMapping(_intelligentMapping_roomMatchRQ);
            System.out.println("intelligentMapping.result=" + _intelligentMapping__return);
        }
        {
            System.out.println("Invoking getCtripSubHotelInfoByEBK...");
            pms.MappingWebAPI.CtripSubHotelInfoByEBKRQ _getCtripSubHotelInfoByEBK_ctripSubHotelInfoByEBKRQ = null;
            pms.MappingWebAPI.CtripSubHotelInfoByEBKRS _getCtripSubHotelInfoByEBK__return = port.getCtripSubHotelInfoByEBK(_getCtripSubHotelInfoByEBK_ctripSubHotelInfoByEBKRQ);
            System.out.println("getCtripSubHotelInfoByEBK.result=" + _getCtripSubHotelInfoByEBK__return);
        }
        {
            System.out.println("Invoking mappingStatusSearch...");
            pms.MappingWebAPI.MappingStatusSearchRQ _mappingStatusSearch_mappingStatusSearchRQ = null;
            pms.MappingWebAPI.MappingStatusSearchRS _mappingStatusSearch__return = port.mappingStatusSearch(_mappingStatusSearch_mappingStatusSearchRQ);
            System.out.println("mappingStatusSearch.result=" + _mappingStatusSearch__return);
        }
        {
            System.out.println("Invoking getRoomProductInfo...");
            java.lang.String _getRoomProductInfo_subHotelId = "";
            java.lang.String _getRoomProductInfo_type = "";
            pms.MappingWebAPI.ProductMappingInfoRS _getRoomProductInfo__return = port.getRoomProductInfo(_getRoomProductInfo_subHotelId, _getRoomProductInfo_type);
            System.out.println("getRoomProductInfo.result=" + _getRoomProductInfo__return);
        }
        {
            System.out.println("Invoking setMappingInfo...");
            pms.MappingWebAPI.SetMappingRQ _setMappingInfo_setMappingRQ = null;
            pms.MappingWebAPI.SetMappingRS _setMappingInfo__return = port.setMappingInfo(_setMappingInfo_setMappingRQ);
            System.out.println("setMappingInfo.result=" + _setMappingInfo__return);
        }
        {
            System.out.println("Invoking getCtripSubHotelInfo...");
            java.lang.String _getCtripSubHotelInfo_masterHotelId = "";
            pms.MappingWebAPI.CtripSubHotelInfoRS _getCtripSubHotelInfo__return = port.getCtripSubHotelInfo(_getCtripSubHotelInfo_masterHotelId);
            System.out.println("getCtripSubHotelInfo.result=" + _getCtripSubHotelInfo__return);
        }
        System.exit(0);
    }
}
