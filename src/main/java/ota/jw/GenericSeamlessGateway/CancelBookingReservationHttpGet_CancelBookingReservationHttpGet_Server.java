
package ota.jw.GenericSeamlessGateway;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-07-25T15:29:59.886+08:00
 * Generated source version: 3.2.4
 *
 */

public class CancelBookingReservationHttpGet_CancelBookingReservationHttpGet_Server{

    protected CancelBookingReservationHttpGet_CancelBookingReservationHttpGet_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new CancelBookingReservationHttpGetImpl();
        String address = "http://124.127.242.67:38196/GenericSeamlessGateway/CancelBookingReservation.asmx";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new CancelBookingReservationHttpGet_CancelBookingReservationHttpGet_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
