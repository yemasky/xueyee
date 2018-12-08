package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>BasicPropertyInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="BasicPropertyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVendorMessageType" minOccurs="0"/>
 *         &lt;element name="Position" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PositionAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MapURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressInfoType" minOccurs="0"/>
 *         &lt;element name="ContactNumbers" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBasicPropertyInfoTypeContactNumber" minOccurs="0"/>
 *         &lt;element name="Award" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/>
 *         &lt;element name="HotelAmenity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Recreation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Policy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelSegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MaxGroupRoomQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MasterChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicPropertyInfoType", propOrder = {
        "vendorMessages",
        "position",
        "address",
        "contactNumbers",
        "award",
        "relativePosition",
        "hotelAmenity",
        "recreation",
        "service",
        "policy"
})
@XmlSeeAlso({
        PropertyValueMatchType.class
})
public class BasicPropertyInfoType {

    @XmlElement(name = "VendorMessages")
    protected ArrayOfVendorMessageType vendorMessages;
    @XmlElement(name = "Position")
    protected BasicPropertyInfoType.Position position;
    @XmlElement(name = "Address")
    protected AddressInfoType address;
    @XmlElement(name = "ContactNumbers")
    protected ArrayOfBasicPropertyInfoTypeContactNumber contactNumbers;
    @XmlElement(name = "Award")
    protected List<BasicPropertyInfoType.Award> award;
    @XmlElement(name = "RelativePosition")
    protected RelativePositionType relativePosition;
    @XmlElement(name = "HotelAmenity")
    protected List<BasicPropertyInfoType.HotelAmenity> hotelAmenity;
    @XmlElement(name = "Recreation")
    protected List<BasicPropertyInfoType.Recreation> recreation;
    @XmlElement(name = "Service")
    protected List<BasicPropertyInfoType.Service> service;
    @XmlElement(name = "Policy")
    protected BasicPropertyInfoType.Policy policy;
    @XmlAttribute(name = "ChainCode")
    protected String chainCode;
    @XmlAttribute(name = "BrandCode")
    protected String brandCode;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelCityCode")
    protected String hotelCityCode;
    @XmlAttribute(name = "HotelName")
    protected String hotelName;
    @XmlAttribute(name = "HotelCodeContext")
    protected String hotelCodeContext;
    @XmlAttribute(name = "ChainName")
    protected String chainName;
    @XmlAttribute(name = "BrandName")
    protected String brandName;
    @XmlAttribute(name = "HotelSegmentCategoryCode")
    protected String hotelSegmentCategoryCode;
    @XmlAttribute(name = "SupplierIntegrationLevel")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger supplierIntegrationLevel;
    @XmlAttribute(name = "MaxGroupRoomQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxGroupRoomQuantity;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "MasterChainCode")
    protected String masterChainCode;

    /**
     * ��ȡvendorMessages���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfVendorMessageType }
     */
    public ArrayOfVendorMessageType getVendorMessages() {
        return vendorMessages;
    }

    /**
     * ����vendorMessages���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfVendorMessageType }
     */
    public void setVendorMessages(ArrayOfVendorMessageType value) {
        this.vendorMessages = value;
    }

    /**
     * ��ȡposition���Ե�ֵ��
     *
     * @return possible object is
     * {@link BasicPropertyInfoType.Position }
     */
    public BasicPropertyInfoType.Position getPosition() {
        return position;
    }

    /**
     * ����position���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BasicPropertyInfoType.Position }
     */
    public void setPosition(BasicPropertyInfoType.Position value) {
        this.position = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
     *
     * @return possible object is
     * {@link AddressInfoType }
     */
    public AddressInfoType getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AddressInfoType }
     */
    public void setAddress(AddressInfoType value) {
        this.address = value;
    }

    /**
     * ��ȡcontactNumbers���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfBasicPropertyInfoTypeContactNumber }
     */
    public ArrayOfBasicPropertyInfoTypeContactNumber getContactNumbers() {
        return contactNumbers;
    }

    /**
     * ����contactNumbers���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfBasicPropertyInfoTypeContactNumber }
     */
    public void setContactNumbers(ArrayOfBasicPropertyInfoTypeContactNumber value) {
        this.contactNumbers = value;
    }

    /**
     * Gets the value of the award property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPropertyInfoType.Award }
     */
    public List<BasicPropertyInfoType.Award> getAward() {
        if (award == null) {
            award = new ArrayList<BasicPropertyInfoType.Award>();
        }
        return this.award;
    }

    /**
     * ��ȡrelativePosition���Ե�ֵ��
     *
     * @return possible object is
     * {@link RelativePositionType }
     */
    public RelativePositionType getRelativePosition() {
        return relativePosition;
    }

    /**
     * ����relativePosition���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RelativePositionType }
     */
    public void setRelativePosition(RelativePositionType value) {
        this.relativePosition = value;
    }

    /**
     * Gets the value of the hotelAmenity property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelAmenity property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelAmenity().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPropertyInfoType.HotelAmenity }
     */
    public List<BasicPropertyInfoType.HotelAmenity> getHotelAmenity() {
        if (hotelAmenity == null) {
            hotelAmenity = new ArrayList<BasicPropertyInfoType.HotelAmenity>();
        }
        return this.hotelAmenity;
    }

    /**
     * Gets the value of the recreation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recreation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecreation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPropertyInfoType.Recreation }
     */
    public List<BasicPropertyInfoType.Recreation> getRecreation() {
        if (recreation == null) {
            recreation = new ArrayList<BasicPropertyInfoType.Recreation>();
        }
        return this.recreation;
    }

    /**
     * Gets the value of the service property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPropertyInfoType.Service }
     */
    public List<BasicPropertyInfoType.Service> getService() {
        if (service == null) {
            service = new ArrayList<BasicPropertyInfoType.Service>();
        }
        return this.service;
    }

    /**
     * ��ȡpolicy���Ե�ֵ��
     *
     * @return possible object is
     * {@link BasicPropertyInfoType.Policy }
     */
    public BasicPropertyInfoType.Policy getPolicy() {
        return policy;
    }

    /**
     * ����policy���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BasicPropertyInfoType.Policy }
     */
    public void setPolicy(BasicPropertyInfoType.Policy value) {
        this.policy = value;
    }

    /**
     * ��ȡchainCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * ����chainCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChainCode(String value) {
        this.chainCode = value;
    }

    /**
     * ��ȡbrandCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * ����brandCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * ��ȡhotelCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * ����hotelCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * ��ȡhotelCityCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelCityCode() {
        return hotelCityCode;
    }

    /**
     * ����hotelCityCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelCityCode(String value) {
        this.hotelCityCode = value;
    }

    /**
     * ��ȡhotelName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * ����hotelName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * ��ȡhotelCodeContext���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelCodeContext() {
        return hotelCodeContext;
    }

    /**
     * ����hotelCodeContext���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelCodeContext(String value) {
        this.hotelCodeContext = value;
    }

    /**
     * ��ȡchainName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * ����chainName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChainName(String value) {
        this.chainName = value;
    }

    /**
     * ��ȡbrandName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * ����brandName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * ��ȡhotelSegmentCategoryCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelSegmentCategoryCode() {
        return hotelSegmentCategoryCode;
    }

    /**
     * ����hotelSegmentCategoryCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelSegmentCategoryCode(String value) {
        this.hotelSegmentCategoryCode = value;
    }

    /**
     * ��ȡsupplierIntegrationLevel���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSupplierIntegrationLevel() {
        return supplierIntegrationLevel;
    }

    /**
     * ����supplierIntegrationLevel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSupplierIntegrationLevel(BigInteger value) {
        this.supplierIntegrationLevel = value;
    }

    /**
     * ��ȡmaxGroupRoomQuantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxGroupRoomQuantity() {
        return maxGroupRoomQuantity;
    }

    /**
     * ����maxGroupRoomQuantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxGroupRoomQuantity(BigInteger value) {
        this.maxGroupRoomQuantity = value;
    }

    /**
     * ��ȡcurrencyCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * ����currencyCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * ��ȡmasterChainCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMasterChainCode() {
        return masterChainCode;
    }

    /**
     * ����masterChainCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMasterChainCode(String value) {
        this.masterChainCode = value;
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
     *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Award {

        @XmlAttribute(name = "Provider")
        protected String provider;
        @XmlAttribute(name = "Rating")
        protected String rating;

        /**
         * ��ȡprovider���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getProvider() {
            return provider;
        }

        /**
         * ����provider���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * ��ȡrating���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRating() {
            return rating;
        }

        /**
         * ����rating���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRating(String value) {
            this.rating = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelAmenity {

        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
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
     *       &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Policy {

        @XmlAttribute(name = "CheckInTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar checkInTime;
        @XmlAttribute(name = "CheckOutTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar checkOutTime;

        /**
         * ��ȡcheckInTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getCheckInTime() {
            return checkInTime;
        }

        /**
         * ����checkInTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setCheckInTime(XMLGregorianCalendar value) {
            this.checkInTime = value;
        }

        /**
         * ��ȡcheckOutTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getCheckOutTime() {
            return checkOutTime;
        }

        /**
         * ����checkOutTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setCheckOutTime(XMLGregorianCalendar value) {
            this.checkOutTime = value;
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
     *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PositionAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MapURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Position {

        @XmlAttribute(name = "Latitude")
        protected String latitude;
        @XmlAttribute(name = "Longitude")
        protected String longitude;
        @XmlAttribute(name = "Altitude")
        protected String altitude;
        @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
        protected String altitudeUnitOfMeasureCode;
        @XmlAttribute(name = "PositionAccuracy")
        protected String positionAccuracy;
        @XmlAttribute(name = "MapURL")
        @XmlSchemaType(name = "anyURI")
        protected String mapURL;

        /**
         * ��ȡlatitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * ����latitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * ��ȡlongitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * ����longitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * ��ȡaltitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * ����altitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * ��ȡaltitudeUnitOfMeasureCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * ����altitudeUnitOfMeasureCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
        }

        /**
         * ��ȡpositionAccuracy���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPositionAccuracy() {
            return positionAccuracy;
        }

        /**
         * ����positionAccuracy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPositionAccuracy(String value) {
            this.positionAccuracy = value;
        }

        /**
         * ��ȡmapURL���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMapURL() {
            return mapURL;
        }

        /**
         * ����mapURL���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMapURL(String value) {
            this.mapURL = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Recreation {

        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
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
     *       &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Service {

        @XmlAttribute(name = "BusinessServiceCode")
        protected String businessServiceCode;

        /**
         * ��ȡbusinessServiceCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBusinessServiceCode() {
            return businessServiceCode;
        }

        /**
         * ����businessServiceCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBusinessServiceCode(String value) {
            this.businessServiceCode = value;
        }

    }

}
