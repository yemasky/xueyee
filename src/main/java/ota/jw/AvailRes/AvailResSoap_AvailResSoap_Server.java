
package ota.jw.AvailRes;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-08-02T16:14:55.313+08:00
 * Generated source version: 3.2.4
 *
 */

public class AvailResSoap_AvailResSoap_Server{

    protected AvailResSoap_AvailResSoap_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new AvailResSoapImpl();
        String address = "http://124.127.242.67:38196/GenericSeamlessGateway/AvailRes.asmx";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new AvailResSoap_AvailResSoap_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}