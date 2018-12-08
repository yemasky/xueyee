package pms.autoMapping;

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public final class GetPmsInfoSoap_GetPmsInfoSoap12_Client {
    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "GetPmsInfo");

    private GetPmsInfoSoap_GetPmsInfoSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GetPmsInfo.WSDL_LOCATION;
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
        GetPmsInfo ss = new GetPmsInfo(wsdlURL, SERVICE_NAME);
        GetPmsInfoSoap port = ss.getGetPmsInfoSoap12();
        {
            System.out.println("Invoking pmsNotifyOnOffline...");
            pms.autoMapping.PMSNotifyOTAModelRQ _pmsNotifyOnOffline_pmsNotifyOnOffInfoRQ = null;
            pms.autoMapping.NotifyOnOffInfoRS _pmsNotifyOnOffline__return = port.pmsNotifyOnOffline(_pmsNotifyOnOffline_pmsNotifyOnOffInfoRQ);
            System.out.println("pmsNotifyOnOffline.result=" + _pmsNotifyOnOffline__return);
        }
        {
            System.out.println("Invoking getAllPmsHotelInfo...");
            pms.autoMapping.PmsHotelInfoRQ _getAllPmsHotelInfo_pmsHotelInfoRQ = null;
            pms.autoMapping.PMSHotelMapingRS _getAllPmsHotelInfo__return = port.getAllPmsHotelInfo(_getAllPmsHotelInfo_pmsHotelInfoRQ);
            System.out.println("getAllPmsHotelInfo.result=" + _getAllPmsHotelInfo__return);
        }
        System.exit(0);
    }
}