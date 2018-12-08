package pms.prdPayment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private final static QName _OTAHotelResPrdPaymentNotifRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelResPrdPaymentNotifRS");

    public ObjectFactory() {
    }

    public OTAHotelResPrdPaymentNotifRQ createOTAHotelResPrdPaymentNotifRQ() {
        return new OTAHotelResPrdPaymentNotifRQ();
    }

    public OTAHotelResPrdPaymentNotifRS createOTAHotelResPrdPaymentNotifRS() {
        return new OTAHotelResPrdPaymentNotifRS();
    }

    public OTAHotelResPrdPaymentNotifRQ.OrderPaymentInfo createOTAHotelResPrdPaymentNotifRQOrderPaymentInfo() {
        return new OTAHotelResPrdPaymentNotifRQ.OrderPaymentInfo();
    }

    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    public ErrorType createErrorType() {
        return new ErrorType();
    }

    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    public CertificationType createCertificationType() {
        return new CertificationType();
    }

    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    public WarningType createWarningType() {
        return new WarningType();
    }

    public CommissionInfoType createCommissionInfoType() {
        return new CommissionInfoType();
    }

    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelResPrdPaymentNotifRS")
    public JAXBElement<OTAHotelResPrdPaymentNotifRS> createOTAHotelResPrdPaymentNotifRS(OTAHotelResPrdPaymentNotifRS value) {
        return new JAXBElement<OTAHotelResPrdPaymentNotifRS>(_OTAHotelResPrdPaymentNotifRS_QNAME, OTAHotelResPrdPaymentNotifRS.class, null, value);
    }
}