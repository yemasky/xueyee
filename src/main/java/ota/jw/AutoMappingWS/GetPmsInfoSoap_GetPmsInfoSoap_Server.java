
package ota.jw.AutoMappingWS;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-07-02T17:28:15.670+08:00
 * Generated source version: 3.2.4
 *
 */

public class GetPmsInfoSoap_GetPmsInfoSoap_Server{

    protected GetPmsInfoSoap_GetPmsInfoSoap_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new GetPmsInfoSoapImpl();
        String address = "http://124.127.242.67:38196/AutoMappingWS/GetPmsInfo.asmx";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new GetPmsInfoSoap_GetPmsInfoSoap_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
