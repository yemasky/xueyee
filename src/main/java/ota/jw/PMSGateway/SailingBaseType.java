
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SailingBaseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SailingBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CruiseLine" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ShipCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ShipName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="VendorCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Region" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RegionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SubRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SubRegionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeparturePort" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="EmbarkationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ArrivalPort" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="DebarkationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ListOfSailingDescriptionCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailingBaseType", propOrder = {
    "cruiseLine",
    "region",
    "departurePort",
    "arrivalPort"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.SailingInfoType.SelectedSailing.class
})
public class SailingBaseType {

    @XmlElement(name = "CruiseLine")
    protected SailingBaseType.CruiseLine cruiseLine;
    @XmlElement(name = "Region")
    protected SailingBaseType.Region region;
    @XmlElement(name = "DeparturePort")
    protected SailingBaseType.DeparturePort departurePort;
    @XmlElement(name = "ArrivalPort")
    protected SailingBaseType.ArrivalPort arrivalPort;
    @XmlAttribute(name = "ListOfSailingDescriptionCode")
    protected List<String> listOfSailingDescriptionCode;

    /**
     * 获取cruiseLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.CruiseLine }
     *     
     */
    public SailingBaseType.CruiseLine getCruiseLine() {
        return cruiseLine;
    }

    /**
     * 设置cruiseLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.CruiseLine }
     *     
     */
    public void setCruiseLine(SailingBaseType.CruiseLine value) {
        this.cruiseLine = value;
    }

    /**
     * 获取region属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.Region }
     *     
     */
    public SailingBaseType.Region getRegion() {
        return region;
    }

    /**
     * 设置region属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.Region }
     *     
     */
    public void setRegion(SailingBaseType.Region value) {
        this.region = value;
    }

    /**
     * 获取departurePort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.DeparturePort }
     *     
     */
    public SailingBaseType.DeparturePort getDeparturePort() {
        return departurePort;
    }

    /**
     * 设置departurePort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.DeparturePort }
     *     
     */
    public void setDeparturePort(SailingBaseType.DeparturePort value) {
        this.departurePort = value;
    }

    /**
     * 获取arrivalPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.ArrivalPort }
     *     
     */
    public SailingBaseType.ArrivalPort getArrivalPort() {
        return arrivalPort;
    }

    /**
     * 设置arrivalPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.ArrivalPort }
     *     
     */
    public void setArrivalPort(SailingBaseType.ArrivalPort value) {
        this.arrivalPort = value;
    }

    /**
     * Gets the value of the listOfSailingDescriptionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfSailingDescriptionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfSailingDescriptionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOfSailingDescriptionCode() {
        if (listOfSailingDescriptionCode == null) {
            listOfSailingDescriptionCode = new ArrayList<String>();
        }
        return this.listOfSailingDescriptionCode;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
     *       &lt;attribute name="DebarkationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ArrivalPort
        extends LocationType
    {

        @XmlAttribute(name = "DebarkationDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar debarkationDateTime;

        /**
         * 获取debarkationDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDebarkationDateTime() {
            return debarkationDateTime;
        }

        /**
         * 设置debarkationDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDebarkationDateTime(XMLGregorianCalendar value) {
            this.debarkationDateTime = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ShipCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ShipName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="VendorCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CruiseLine {

        @XmlAttribute(name = "VendorCode")
        protected String vendorCode;
        @XmlAttribute(name = "VendorName")
        protected String vendorName;
        @XmlAttribute(name = "ShipCode")
        protected String shipCode;
        @XmlAttribute(name = "ShipName")
        protected String shipName;
        @XmlAttribute(name = "VendorCodeContext")
        protected String vendorCodeContext;

        /**
         * 获取vendorCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorCode() {
            return vendorCode;
        }

        /**
         * 设置vendorCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        /**
         * 获取vendorName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorName() {
            return vendorName;
        }

        /**
         * 设置vendorName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorName(String value) {
            this.vendorName = value;
        }

        /**
         * 获取shipCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipCode() {
            return shipCode;
        }

        /**
         * 设置shipCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipCode(String value) {
            this.shipCode = value;
        }

        /**
         * 获取shipName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipName() {
            return shipName;
        }

        /**
         * 设置shipName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipName(String value) {
            this.shipName = value;
        }

        /**
         * 获取vendorCodeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorCodeContext() {
            return vendorCodeContext;
        }

        /**
         * 设置vendorCodeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorCodeContext(String value) {
            this.vendorCodeContext = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
     *       &lt;attribute name="EmbarkationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DeparturePort
        extends LocationType
    {

        @XmlAttribute(name = "EmbarkationTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar embarkationTime;

        /**
         * 获取embarkationTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEmbarkationTime() {
            return embarkationTime;
        }

        /**
         * 设置embarkationTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEmbarkationTime(XMLGregorianCalendar value) {
            this.embarkationTime = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RegionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SubRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SubRegionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Region {

        @XmlAttribute(name = "RegionCode")
        protected String regionCode;
        @XmlAttribute(name = "RegionName")
        protected String regionName;
        @XmlAttribute(name = "SubRegionCode")
        protected String subRegionCode;
        @XmlAttribute(name = "SubRegionName")
        protected String subRegionName;

        /**
         * 获取regionCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegionCode() {
            return regionCode;
        }

        /**
         * 设置regionCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegionCode(String value) {
            this.regionCode = value;
        }

        /**
         * 获取regionName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegionName() {
            return regionName;
        }

        /**
         * 设置regionName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegionName(String value) {
            this.regionName = value;
        }

        /**
         * 获取subRegionCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubRegionCode() {
            return subRegionCode;
        }

        /**
         * 设置subRegionCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubRegionCode(String value) {
            this.subRegionCode = value;
        }

        /**
         * 获取subRegionName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubRegionName() {
            return subRegionName;
        }

        /**
         * 设置subRegionName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubRegionName(String value) {
            this.subRegionName = value;
        }

    }

}
