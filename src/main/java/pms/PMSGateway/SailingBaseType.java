package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>SailingBaseType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="SailingBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CruiseLine" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ShipCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ShipName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VendorCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Region" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RegionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SubRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SubRegionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeparturePort" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="EmbarkationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArrivalPort" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="DebarkationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ListOfSailingDescriptionCode">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailingBaseType", propOrder = {
        "cruiseLine",
        "region",
        "departurePort",
        "arrivalPort"
})
@XmlSeeAlso({
        pms.PMSGateway.SailingInfoType.SelectedSailing.class
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
     * ��ȡcruiseLine���Ե�ֵ��
     *
     * @return possible object is
     * {@link SailingBaseType.CruiseLine }
     */
    public SailingBaseType.CruiseLine getCruiseLine() {
        return cruiseLine;
    }

    /**
     * ����cruiseLine���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SailingBaseType.CruiseLine }
     */
    public void setCruiseLine(SailingBaseType.CruiseLine value) {
        this.cruiseLine = value;
    }

    /**
     * ��ȡregion���Ե�ֵ��
     *
     * @return possible object is
     * {@link SailingBaseType.Region }
     */
    public SailingBaseType.Region getRegion() {
        return region;
    }

    /**
     * ����region���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SailingBaseType.Region }
     */
    public void setRegion(SailingBaseType.Region value) {
        this.region = value;
    }

    /**
     * ��ȡdeparturePort���Ե�ֵ��
     *
     * @return possible object is
     * {@link SailingBaseType.DeparturePort }
     */
    public SailingBaseType.DeparturePort getDeparturePort() {
        return departurePort;
    }

    /**
     * ����departurePort���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SailingBaseType.DeparturePort }
     */
    public void setDeparturePort(SailingBaseType.DeparturePort value) {
        this.departurePort = value;
    }

    /**
     * ��ȡarrivalPort���Ե�ֵ��
     *
     * @return possible object is
     * {@link SailingBaseType.ArrivalPort }
     */
    public SailingBaseType.ArrivalPort getArrivalPort() {
        return arrivalPort;
    }

    /**
     * ����arrivalPort���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SailingBaseType.ArrivalPort }
     */
    public void setArrivalPort(SailingBaseType.ArrivalPort value) {
        this.arrivalPort = value;
    }

    /**
     * Gets the value of the listOfSailingDescriptionCode property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfSailingDescriptionCode property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfSailingDescriptionCode().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getListOfSailingDescriptionCode() {
        if (listOfSailingDescriptionCode == null) {
            listOfSailingDescriptionCode = new ArrayList<String>();
        }
        return this.listOfSailingDescriptionCode;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="DebarkationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ArrivalPort
            extends LocationType {

        @XmlAttribute(name = "DebarkationDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar debarkationDateTime;

        /**
         * ��ȡdebarkationDateTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getDebarkationDateTime() {
            return debarkationDateTime;
        }

        /**
         * ����debarkationDateTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setDebarkationDateTime(XMLGregorianCalendar value) {
            this.debarkationDateTime = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ShipCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ShipName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VendorCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡvendorCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVendorCode() {
            return vendorCode;
        }

        /**
         * ����vendorCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        /**
         * ��ȡvendorName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVendorName() {
            return vendorName;
        }

        /**
         * ����vendorName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVendorName(String value) {
            this.vendorName = value;
        }

        /**
         * ��ȡshipCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getShipCode() {
            return shipCode;
        }

        /**
         * ����shipCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setShipCode(String value) {
            this.shipCode = value;
        }

        /**
         * ��ȡshipName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getShipName() {
            return shipName;
        }

        /**
         * ����shipName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setShipName(String value) {
            this.shipName = value;
        }

        /**
         * ��ȡvendorCodeContext���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVendorCodeContext() {
            return vendorCodeContext;
        }

        /**
         * ����vendorCodeContext���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVendorCodeContext(String value) {
            this.vendorCodeContext = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="EmbarkationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DeparturePort
            extends LocationType {

        @XmlAttribute(name = "EmbarkationTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar embarkationTime;

        /**
         * ��ȡembarkationTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getEmbarkationTime() {
            return embarkationTime;
        }

        /**
         * ����embarkationTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setEmbarkationTime(XMLGregorianCalendar value) {
            this.embarkationTime = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RegionName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SubRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SubRegionName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡregionCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRegionCode() {
            return regionCode;
        }

        /**
         * ����regionCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRegionCode(String value) {
            this.regionCode = value;
        }

        /**
         * ��ȡregionName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRegionName() {
            return regionName;
        }

        /**
         * ����regionName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRegionName(String value) {
            this.regionName = value;
        }

        /**
         * ��ȡsubRegionCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSubRegionCode() {
            return subRegionCode;
        }

        /**
         * ����subRegionCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSubRegionCode(String value) {
            this.subRegionCode = value;
        }

        /**
         * ��ȡsubRegionName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSubRegionName() {
            return subRegionName;
        }

        /**
         * ����subRegionName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSubRegionName(String value) {
            this.subRegionName = value;
        }

    }

}
