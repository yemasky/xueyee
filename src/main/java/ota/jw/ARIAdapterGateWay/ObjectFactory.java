
package ota.jw.ARIAdapterGateWay;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ota.jw.ARIAdapterGateWay package. 
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

    private final static QName _QueryHotelRoomCountRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "QueryHotelRoomCountRQ");
    private final static QName _QueryHotelRoomCountRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "QueryHotelRoomCountRS");
    private final static QName _QueryHotelRoomRateRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "QueryHotelRoomRateRQ");
    private final static QName _QueryHotelRoomRateRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "QueryHotelRoomRateRS");
    private final static QName _QueryHotelAvailStatusRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "QueryHotelAvailStatusRQ");
    private final static QName _QueryHotelAvailStatusRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "QueryHotelAvailStatusRS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ota.jw.ARIAdapterGateWay
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryHotelRoomCountRQ }
     * 
     */
    public QueryHotelRoomCountRQ createQueryHotelRoomCountRQ() {
        return new QueryHotelRoomCountRQ();
    }

    /**
     * Create an instance of {@link QueryHotelRoomCountRS }
     * 
     */
    public QueryHotelRoomCountRS createQueryHotelRoomCountRS() {
        return new QueryHotelRoomCountRS();
    }

    /**
     * Create an instance of {@link QueryHotelRoomRateRQ }
     * 
     */
    public QueryHotelRoomRateRQ createQueryHotelRoomRateRQ() {
        return new QueryHotelRoomRateRQ();
    }

    /**
     * Create an instance of {@link QueryHotelRoomRateRS }
     * 
     */
    public QueryHotelRoomRateRS createQueryHotelRoomRateRS() {
        return new QueryHotelRoomRateRS();
    }

    /**
     * Create an instance of {@link QueryHotelAvailStatusRQ }
     * 
     */
    public QueryHotelAvailStatusRQ createQueryHotelAvailStatusRQ() {
        return new QueryHotelAvailStatusRQ();
    }

    /**
     * Create an instance of {@link QueryHotelAvailStatusRS }
     * 
     */
    public QueryHotelAvailStatusRS createQueryHotelAvailStatusRS() {
        return new QueryHotelAvailStatusRS();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfo }
     * 
     */
    public ArrayOfHotelInfo createArrayOfHotelInfo() {
        return new ArrayOfHotelInfo();
    }

    /**
     * Create an instance of {@link HotelInfo }
     * 
     */
    public HotelInfo createHotelInfo() {
        return new HotelInfo();
    }

    /**
     * Create an instance of {@link ArrayOfHotelproductCount }
     * 
     */
    public ArrayOfHotelproductCount createArrayOfHotelproductCount() {
        return new ArrayOfHotelproductCount();
    }

    /**
     * Create an instance of {@link HotelproductCount }
     * 
     */
    public HotelproductCount createHotelproductCount() {
        return new HotelproductCount();
    }

    /**
     * Create an instance of {@link ArrayOfProductCountInfo }
     * 
     */
    public ArrayOfProductCountInfo createArrayOfProductCountInfo() {
        return new ArrayOfProductCountInfo();
    }

    /**
     * Create an instance of {@link ProductCountInfo }
     * 
     */
    public ProductCountInfo createProductCountInfo() {
        return new ProductCountInfo();
    }

    /**
     * Create an instance of {@link ArrayOfHotelProductRate }
     * 
     */
    public ArrayOfHotelProductRate createArrayOfHotelProductRate() {
        return new ArrayOfHotelProductRate();
    }

    /**
     * Create an instance of {@link HotelProductRate }
     * 
     */
    public HotelProductRate createHotelProductRate() {
        return new HotelProductRate();
    }

    /**
     * Create an instance of {@link ArrayOfProductRateInfo }
     * 
     */
    public ArrayOfProductRateInfo createArrayOfProductRateInfo() {
        return new ArrayOfProductRateInfo();
    }

    /**
     * Create an instance of {@link ProductRateInfo }
     * 
     */
    public ProductRateInfo createProductRateInfo() {
        return new ProductRateInfo();
    }

    /**
     * Create an instance of {@link ArrayOfHotelProductAvail }
     * 
     */
    public ArrayOfHotelProductAvail createArrayOfHotelProductAvail() {
        return new ArrayOfHotelProductAvail();
    }

    /**
     * Create an instance of {@link HotelProductAvail }
     * 
     */
    public HotelProductAvail createHotelProductAvail() {
        return new HotelProductAvail();
    }

    /**
     * Create an instance of {@link ArrayOfProductAvailInfo }
     * 
     */
    public ArrayOfProductAvailInfo createArrayOfProductAvailInfo() {
        return new ArrayOfProductAvailInfo();
    }

    /**
     * Create an instance of {@link ProductAvailInfo }
     * 
     */
    public ProductAvailInfo createProductAvailInfo() {
        return new ProductAvailInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHotelRoomCountRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "QueryHotelRoomCountRQ")
    public JAXBElement<QueryHotelRoomCountRQ> createQueryHotelRoomCountRQ(QueryHotelRoomCountRQ value) {
        return new JAXBElement<QueryHotelRoomCountRQ>(_QueryHotelRoomCountRQ_QNAME, QueryHotelRoomCountRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHotelRoomCountRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "QueryHotelRoomCountRS")
    public JAXBElement<QueryHotelRoomCountRS> createQueryHotelRoomCountRS(QueryHotelRoomCountRS value) {
        return new JAXBElement<QueryHotelRoomCountRS>(_QueryHotelRoomCountRS_QNAME, QueryHotelRoomCountRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHotelRoomRateRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "QueryHotelRoomRateRQ")
    public JAXBElement<QueryHotelRoomRateRQ> createQueryHotelRoomRateRQ(QueryHotelRoomRateRQ value) {
        return new JAXBElement<QueryHotelRoomRateRQ>(_QueryHotelRoomRateRQ_QNAME, QueryHotelRoomRateRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHotelRoomRateRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "QueryHotelRoomRateRS")
    public JAXBElement<QueryHotelRoomRateRS> createQueryHotelRoomRateRS(QueryHotelRoomRateRS value) {
        return new JAXBElement<QueryHotelRoomRateRS>(_QueryHotelRoomRateRS_QNAME, QueryHotelRoomRateRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHotelAvailStatusRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "QueryHotelAvailStatusRQ")
    public JAXBElement<QueryHotelAvailStatusRQ> createQueryHotelAvailStatusRQ(QueryHotelAvailStatusRQ value) {
        return new JAXBElement<QueryHotelAvailStatusRQ>(_QueryHotelAvailStatusRQ_QNAME, QueryHotelAvailStatusRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHotelAvailStatusRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "QueryHotelAvailStatusRS")
    public JAXBElement<QueryHotelAvailStatusRS> createQueryHotelAvailStatusRS(QueryHotelAvailStatusRS value) {
        return new JAXBElement<QueryHotelAvailStatusRS>(_QueryHotelAvailStatusRS_QNAME, QueryHotelAvailStatusRS.class, null, value);
    }

}
