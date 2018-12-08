package pms.autoMapping;

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public final class GetPmsInfoHttpPost_GetPmsInfoHttpPost_Client {

    private static final QName SERVICE_NAME = new QName("http://www.opentravel.org/OTA/2003/05", "GetPmsInfo");

    private GetPmsInfoHttpPost_GetPmsInfoHttpPost_Client() {
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
        GetPmsInfoHttpPost port = ss.getGetPmsInfoHttpPost();

        System.exit(0);
    }
}