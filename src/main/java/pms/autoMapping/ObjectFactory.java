package pms.autoMapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private final static QName _PMSNotifyOnOffInfoRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PMSNotifyOnOffInfoRS");
    private final static QName _PmsHotelInfoRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PmsHotelInfoRS");
    private final static QName _PMSNotifyOnOffInfoRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PMSNotifyOnOffInfoRQ");

    public ObjectFactory() {
    }

    public NotifyOnOffInfoRS createNotifyOnOffInfoRS() {
        return new NotifyOnOffInfoRS();
    }

    public PMSHotelMapingRS createPMSHotelMapingRS() {
        return new PMSHotelMapingRS();
    }

    public PMSNotifyOTAModelRQ createPMSNotifyOTAModelRQ() {
        return new PMSNotifyOTAModelRQ();
    }

    public PmsHotelInfoRQ createPmsHotelInfoRQ() {
        return new PmsHotelInfoRQ();
    }

    public ArrayOfPMSHotelInfo createArrayOfPMSHotelInfo() {
        return new ArrayOfPMSHotelInfo();
    }

    public ErrorType createErrorType() {
        return new ErrorType();
    }

    public OnOffHotelInfo createOnOffHotelInfo() {
        return new OnOffHotelInfo();
    }

    public ArrayOfPMSProductInfo createArrayOfPMSProductInfo() {
        return new ArrayOfPMSProductInfo();
    }

    public OnOffProductInfo createOnOffProductInfo() {
        return new OnOffProductInfo();
    }

    public ArrayOfOnOffHotelInfo createArrayOfOnOffHotelInfo() {
        return new ArrayOfOnOffHotelInfo();
    }

    public ArrayOfOnOffProductInfo createArrayOfOnOffProductInfo() {
        return new ArrayOfOnOffProductInfo();
    }

    public PMSHotelInfo createPMSHotelInfo() {
        return new PMSHotelInfo();
    }

    public NotifyOnOffInfo createNotifyOnOffInfo() {
        return new NotifyOnOffInfo();
    }

    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    public PMSProductInfo createPMSProductInfo() {
        return new PMSProductInfo();
    }

    public ArrayOfPMSHotelMappingResult createArrayOfPMSHotelMappingResult() {
        return new ArrayOfPMSHotelMappingResult();
    }

    public PMSHotelMappingResult createPMSHotelMappingResult() {
        return new PMSHotelMappingResult();
    }

    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PMSNotifyOnOffInfoRS")
    public JAXBElement<NotifyOnOffInfoRS> createPMSNotifyOnOffInfoRS(NotifyOnOffInfoRS value) {
        return new JAXBElement<NotifyOnOffInfoRS>(_PMSNotifyOnOffInfoRS_QNAME, NotifyOnOffInfoRS.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PmsHotelInfoRS")
    public JAXBElement<PMSHotelMapingRS> createPmsHotelInfoRS(PMSHotelMapingRS value) {
        return new JAXBElement<PMSHotelMapingRS>(_PmsHotelInfoRS_QNAME, PMSHotelMapingRS.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PMSNotifyOnOffInfoRQ")
    public JAXBElement<PMSNotifyOTAModelRQ> createPMSNotifyOnOffInfoRQ(PMSNotifyOTAModelRQ value) {
        return new JAXBElement<PMSNotifyOTAModelRQ>(_PMSNotifyOnOffInfoRQ_QNAME, PMSNotifyOTAModelRQ.class, null, value);
    }
}