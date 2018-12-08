package pms.PMSGateway;

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public final class PMSGatewayServiceHttpGet_PMSGatewayServiceHttpGet_Client {
    private static final QName SERVICE_NAME = new QName("http://www.opentravel.org/OTA/2003/05", "PMSGatewayService");

    private PMSGatewayServiceHttpGet_PMSGatewayServiceHttpGet_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = PMSGatewayService.WSDL_LOCATION;
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
        PMSGatewayService ss = new PMSGatewayService(wsdlURL, SERVICE_NAME);
        PMSGatewayServiceHttpGet port = ss.getPMSGatewayServiceHttpGet();
        System.exit(0);
    }
}