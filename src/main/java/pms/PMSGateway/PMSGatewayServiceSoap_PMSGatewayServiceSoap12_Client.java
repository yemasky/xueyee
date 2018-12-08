package pms.PMSGateway;

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public final class PMSGatewayServiceSoap_PMSGatewayServiceSoap12_Client {
    private static final QName SERVICE_NAME = new QName("http://www.opentravel.org/OTA/2003/05", "PMSGatewayService");

    private PMSGatewayServiceSoap_PMSGatewayServiceSoap12_Client() {
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
        PMSGatewayServiceSoap port = ss.getPMSGatewayServiceSoap12();
        {
            System.out.println("Invoking updatePulledReservations...");
            pms.PMSGateway.OTANotifReportRQ _updatePulledReservations_otaNotifReportRQ = null;
            pms.PMSGateway.MessageAcknowledgementType _updatePulledReservations__return = port.updatePulledReservations(_updatePulledReservations_otaNotifReportRQ);
            System.out.println("updatePulledReservations.result=" + _updatePulledReservations__return);
        }
        {
            System.out.println("Invoking updateRetrievedPrdStatus...");
            pms.PMSGateway.OTAPrdNotifReportRQ _updateRetrievedPrdStatus_otaNotifReportRQ = null;
            pms.PMSGateway.MessageAcknowledgementType _updateRetrievedPrdStatus__return = port.updateRetrievedPrdStatus(_updateRetrievedPrdStatus_otaNotifReportRQ);
            System.out.println("updateRetrievedPrdStatus.result=" + _updateRetrievedPrdStatus__return);
        }
        {
            System.out.println("Invoking otaHotelRatePlanNotifRQ...");
            pms.PMSGateway.OTAHotelRatePlanNotifRQ _otaHotelRatePlanNotifRQ_otaHotelRatePlanNotifRQ1 = null;
            pms.PMSGateway.OTAHotelRatePlanNotifRS _otaHotelRatePlanNotifRQ__return = port.otaHotelRatePlanNotifRQ(_otaHotelRatePlanNotifRQ_otaHotelRatePlanNotifRQ1);
            System.out.println("otaHotelRatePlanNotifRQ.result=" + _otaHotelRatePlanNotifRQ__return);
        }
        {
            System.out.println("Invoking otaHotelStayInfoNotifRQ...");
            pms.PMSGateway.OTAHotelStayInfoNotifRQ _otaHotelStayInfoNotifRQ_otaHotelRatePlanNotifRQ1 = null;
            pms.PMSGateway.OTAHotelStayInfoNotifRS _otaHotelStayInfoNotifRQ__return = port.otaHotelStayInfoNotifRQ(_otaHotelStayInfoNotifRQ_otaHotelRatePlanNotifRQ1);
            System.out.println("otaHotelStayInfoNotifRQ.result=" + _otaHotelStayInfoNotifRQ__return);
        }
        {
            System.out.println("Invoking pmsOrderStatusPush...");
            pms.PMSGateway.OTAPushOrderStatusRQ _pmsOrderStatusPush_otaPushOrderStatusRQ = null;
            pms.PMSGateway.OTAPushOrderStatusRS _pmsOrderStatusPush__return = port.pmsOrderStatusPush(_pmsOrderStatusPush_otaPushOrderStatusRQ);
            System.out.println("pmsOrderStatusPush.result=" + _pmsOrderStatusPush__return);
        }
        {
            System.out.println("Invoking pmsRetrivePrdInfo...");
            pms.PMSGateway.OTAPrdReadRQ _pmsRetrivePrdInfo_otaReadRQ = null;
            pms.PMSGateway.OrderPaymentInfoRS _pmsRetrivePrdInfo__return = port.pmsRetrivePrdInfo(_pmsRetrivePrdInfo_otaReadRQ);
            System.out.println("pmsRetrivePrdInfo.result=" + _pmsRetrivePrdInfo__return);
        }
        {
            System.out.println("Invoking pmsCheckedOutNotice...");
            pms.PMSGateway.OrderApplyPaymentRQ _pmsCheckedOutNotice_orderApplyPaymentRQ = null;
            pms.PMSGateway.OrderApplyPaymentRS _pmsCheckedOutNotice__return = port.pmsCheckedOutNotice(_pmsCheckedOutNotice_orderApplyPaymentRQ);
            System.out.println("pmsCheckedOutNotice.result=" + _pmsCheckedOutNotice__return);
        }
        {
            System.out.println("Invoking retrieveReservations...");
            pms.PMSGateway.OTAReadRQ _retrieveReservations_otaReadRQ = null;
            pms.PMSGateway.OTAResRetrieveRS _retrieveReservations__return = port.retrieveReservations(_retrieveReservations_otaReadRQ);
            System.out.println("retrieveReservations.result=" + _retrieveReservations__return);
        }
        {
            System.out.println("Invoking otaHotelInvCountNotifRQ...");
            pms.PMSGateway.OTAHotelInvCountNotifRQ _otaHotelInvCountNotifRQ_otaHotelInvCountNotifRQ1 = null;
            pms.PMSGateway.OTAHotelInvCountNotifRS _otaHotelInvCountNotifRQ__return = port.otaHotelInvCountNotifRQ(_otaHotelInvCountNotifRQ_otaHotelInvCountNotifRQ1);
            System.out.println("otaHotelInvCountNotifRQ.result=" + _otaHotelInvCountNotifRQ__return);
        }
        {
            System.out.println("Invoking otaHotelAvailNotifRQ...");
            pms.PMSGateway.OTAHotelAvailNotifRQ _otaHotelAvailNotifRQ_otaHotelAvailNotifRQ1 = null;
            pms.PMSGateway.OTAHotelAvailNotifRS _otaHotelAvailNotifRQ__return = port.otaHotelAvailNotifRQ(_otaHotelAvailNotifRQ_otaHotelAvailNotifRQ1);
            System.out.println("otaHotelAvailNotifRQ.result=" + _otaHotelAvailNotifRQ__return);
        }
        {
            System.out.println("Invoking pmsInHouseNotice...");
            pms.PMSGateway.OrderCheckInNoticeRQ _pmsInHouseNotice_orderCheckInNoticeRQ = null;
            pms.PMSGateway.OrderCheckInNoticeRS _pmsInHouseNotice__return = port.pmsInHouseNotice(_pmsInHouseNotice_orderCheckInNoticeRQ);
            System.out.println("pmsInHouseNotice.result=" + _pmsInHouseNotice__return);
        }
        System.exit(0);
    }
}