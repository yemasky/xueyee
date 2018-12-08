
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FlightSegmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FlightSegmentBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MarketingAirline" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNameType"&gt;
 *                 &lt;attribute name="SingleVendorInd"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="SingleVndr"/&gt;
 *                       &lt;enumeration value="Alliance"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TourOperatorFlightID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GovernmentApprovalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GovernmentApprovalText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentType", propOrder = {
    "marketingAirline"
})
@XmlSeeAlso({
    BookFlightSegmentType.class
})
public class FlightSegmentType
    extends FlightSegmentBaseType
{

    @XmlElement(name = "MarketingAirline")
    protected FlightSegmentType.MarketingAirline marketingAirline;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "TourOperatorFlightID")
    protected String tourOperatorFlightID;
    @XmlAttribute(name = "GovernmentApprovalInd")
    protected Boolean governmentApprovalInd;
    @XmlAttribute(name = "GovernmentApprovalText")
    protected String governmentApprovalText;

    /**
     * 获取marketingAirline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentType.MarketingAirline }
     *     
     */
    public FlightSegmentType.MarketingAirline getMarketingAirline() {
        return marketingAirline;
    }

    /**
     * 设置marketingAirline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentType.MarketingAirline }
     *     
     */
    public void setMarketingAirline(FlightSegmentType.MarketingAirline value) {
        this.marketingAirline = value;
    }

    /**
     * 获取flightNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * 设置flightNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * 获取tourOperatorFlightID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }

    /**
     * 设置tourOperatorFlightID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorFlightID(String value) {
        this.tourOperatorFlightID = value;
    }

    /**
     * 获取governmentApprovalInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGovernmentApprovalInd() {
        return governmentApprovalInd;
    }

    /**
     * 设置governmentApprovalInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGovernmentApprovalInd(Boolean value) {
        this.governmentApprovalInd = value;
    }

    /**
     * 获取governmentApprovalText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentApprovalText() {
        return governmentApprovalText;
    }

    /**
     * 设置governmentApprovalText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentApprovalText(String value) {
        this.governmentApprovalText = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNameType"&gt;
     *       &lt;attribute name="SingleVendorInd"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="SingleVndr"/&gt;
     *             &lt;enumeration value="Alliance"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MarketingAirline
        extends CompanyNameType
    {

        @XmlAttribute(name = "SingleVendorInd")
        protected String singleVendorInd;

        /**
         * 获取singleVendorInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleVendorInd() {
            return singleVendorInd;
        }

        /**
         * 设置singleVendorInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleVendorInd(String value) {
            this.singleVendorInd = value;
        }

    }

}
