
package ota.jw.AutoMappingWS;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-07-02T17:28:15.504+08:00
 * Generated source version: 3.2.4
 *
 */
public final class GetPmsInfoHttpPost_GetPmsInfoHttpPost_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "GetPmsInfo");

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