
package ota.jw.AutoMappingWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ota.jw.AutoMappingWS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PmsHotelInfoRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PmsHotelInfoRS");
    private final static QName _PMSNotifyOnOffInfoRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PMSNotifyOnOffInfoRQ");
    private final static QName _PMSNotifyOnOffInfoRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "PMSNotifyOnOffInfoRS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ota.jw.AutoMappingWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PmsHotelInfoRQ }
     * 
     */
    public PmsHotelInfoRQ createPmsHotelInfoRQ() {
        return new PmsHotelInfoRQ();
    }

    /**
     * Create an instance of {@link ArrayOfPMSHotelInfo }
     * 
     */
    public ArrayOfPMSHotelInfo createArrayOfPMSHotelInfo() {
        return new ArrayOfPMSHotelInfo();
    }

    /**
     * Create an instance of {@link PMSHotelMapingRS }
     * 
     */
    public PMSHotelMapingRS createPMSHotelMapingRS() {
        return new PMSHotelMapingRS();
    }

    /**
     * Create an instance of {@link PMSNotifyOTAModelRQ }
     * 
     */
    public PMSNotifyOTAModelRQ createPMSNotifyOTAModelRQ() {
        return new PMSNotifyOTAModelRQ();
    }

    /**
     * Create an instance of {@link NotifyOnOffInfoRS }
     * 
     */
    public NotifyOnOffInfoRS createNotifyOnOffInfoRS() {
        return new NotifyOnOffInfoRS();
    }

    /**
     * Create an instance of {@link PMSHotelInfo }
     * 
     */
    public PMSHotelInfo createPMSHotelInfo() {
        return new PMSHotelInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPMSProductInfo }
     * 
     */
    public ArrayOfPMSProductInfo createArrayOfPMSProductInfo() {
        return new ArrayOfPMSProductInfo();
    }

    /**
     * Create an instance of {@link PMSProductInfo }
     * 
     */
    public PMSProductInfo createPMSProductInfo() {
        return new PMSProductInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPMSHotelMappingResult }
     * 
     */
    public ArrayOfPMSHotelMappingResult createArrayOfPMSHotelMappingResult() {
        return new ArrayOfPMSHotelMappingResult();
    }

    /**
     * Create an instance of {@link PMSHotelMappingResult }
     * 
     */
    public PMSHotelMappingResult createPMSHotelMappingResult() {
        return new PMSHotelMappingResult();
    }

    /**
     * Create an instance of {@link ArrayOfOnOffHotelInfo }
     * 
     */
    public ArrayOfOnOffHotelInfo createArrayOfOnOffHotelInfo() {
        return new ArrayOfOnOffHotelInfo();
    }

    /**
     * Create an instance of {@link OnOffHotelInfo }
     * 
     */
    public OnOffHotelInfo createOnOffHotelInfo() {
        return new OnOffHotelInfo();
    }

    /**
     * Create an instance of {@link ArrayOfOnOffProductInfo }
     * 
     */
    public ArrayOfOnOffProductInfo createArrayOfOnOffProductInfo() {
        return new ArrayOfOnOffProductInfo();
    }

    /**
     * Create an instance of {@link OnOffProductInfo }
     * 
     */
    public OnOffProductInfo createOnOffProductInfo() {
        return new OnOffProductInfo();
    }

    /**
     * Create an instance of {@link NotifyOnOffInfo }
     * 
     */
    public NotifyOnOffInfo createNotifyOnOffInfo() {
        return new NotifyOnOffInfo();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PMSHotelMapingRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PmsHotelInfoRS")
    public JAXBElement<PMSHotelMapingRS> createPmsHotelInfoRS(PMSHotelMapingRS value) {
        return new JAXBElement<PMSHotelMapingRS>(_PmsHotelInfoRS_QNAME, PMSHotelMapingRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PMSNotifyOTAModelRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PMSNotifyOnOffInfoRQ")
    public JAXBElement<PMSNotifyOTAModelRQ> createPMSNotifyOnOffInfoRQ(PMSNotifyOTAModelRQ value) {
        return new JAXBElement<PMSNotifyOTAModelRQ>(_PMSNotifyOnOffInfoRQ_QNAME, PMSNotifyOTAModelRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyOnOffInfoRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "PMSNotifyOnOffInfoRS")
    public JAXBElement<NotifyOnOffInfoRS> createPMSNotifyOnOffInfoRS(NotifyOnOffInfoRS value) {
        return new JAXBElement<NotifyOnOffInfoRS>(_PMSNotifyOnOffInfoRS_QNAME, NotifyOnOffInfoRS.class, null, value);
    }

}
