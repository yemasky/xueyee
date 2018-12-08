package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ItemSearchCriterionType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ItemSearchCriterionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PositionAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
 *                 &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AddressSearchScope">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Primary"/>
 *                       &lt;enumeration value="Alternate"/>
 *                       &lt;enumeration value="PrimaryAndAlternate"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Telephone" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RefPoint" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="RefPointType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodeRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="VicinityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PropertyClassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ArchitecturalStyleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="LocationCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ExtendedCitySearchIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Radius" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DistanceMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DistanceMax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MapArea" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="NorthLatitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SouthLatitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EastLongitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="WestLongitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalContents" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfItemSearchCriterionTypeAdditionalContent" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ExactMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ImportanceType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Mandatory"/>
 *             &lt;enumeration value="High"/>
 *             &lt;enumeration value="Medium"/>
 *             &lt;enumeration value="Low"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Ranking" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSearchCriterionType", propOrder = {
        "position",
        "address",
        "telephone",
        "refPoint",
        "codeRef",
        "hotelRef",
        "radius",
        "mapArea",
        "additionalContents"
})
@XmlSeeAlso({
        HotelSearchCriterionType.class
})
public class ItemSearchCriterionType {

    @XmlElement(name = "Position")
    protected ItemSearchCriterionType.Position position;
    @XmlElement(name = "Address")
    protected ItemSearchCriterionType.Address address;
    @XmlElement(name = "Telephone")
    protected ItemSearchCriterionType.Telephone telephone;
    @XmlElement(name = "RefPoint")
    protected List<ItemSearchCriterionType.RefPoint> refPoint;
    @XmlElement(name = "CodeRef")
    protected ItemSearchCriterionType.CodeRef codeRef;
    @XmlElement(name = "HotelRef")
    protected List<ItemSearchCriterionType.HotelRef> hotelRef;
    @XmlElement(name = "Radius")
    protected ItemSearchCriterionType.Radius radius;
    @XmlElement(name = "MapArea")
    protected ItemSearchCriterionType.MapArea mapArea;
    @XmlElement(name = "AdditionalContents")
    protected ArrayOfItemSearchCriterionTypeAdditionalContent additionalContents;
    @XmlAttribute(name = "ExactMatch")
    protected Boolean exactMatch;
    @XmlAttribute(name = "ImportanceType")
    protected String importanceType;
    @XmlAttribute(name = "Ranking")
    protected BigInteger ranking;

    /**
     * ��ȡposition���Ե�ֵ��
     *
     * @return possible object is
     * {@link ItemSearchCriterionType.Position }
     */
    public ItemSearchCriterionType.Position getPosition() {
        return position;
    }

    /**
     * ����position���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ItemSearchCriterionType.Position }
     */
    public void setPosition(ItemSearchCriterionType.Position value) {
        this.position = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
     *
     * @return possible object is
     * {@link ItemSearchCriterionType.Address }
     */
    public ItemSearchCriterionType.Address getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ItemSearchCriterionType.Address }
     */
    public void setAddress(ItemSearchCriterionType.Address value) {
        this.address = value;
    }

    /**
     * ��ȡtelephone���Ե�ֵ��
     *
     * @return possible object is
     * {@link ItemSearchCriterionType.Telephone }
     */
    public ItemSearchCriterionType.Telephone getTelephone() {
        return telephone;
    }

    /**
     * ����telephone���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ItemSearchCriterionType.Telephone }
     */
    public void setTelephone(ItemSearchCriterionType.Telephone value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the refPoint property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refPoint property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefPoint().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSearchCriterionType.RefPoint }
     */
    public List<ItemSearchCriterionType.RefPoint> getRefPoint() {
        if (refPoint == null) {
            refPoint = new ArrayList<ItemSearchCriterionType.RefPoint>();
        }
        return this.refPoint;
    }

    /**
     * ��ȡcodeRef���Ե�ֵ��
     *
     * @return possible object is
     * {@link ItemSearchCriterionType.CodeRef }
     */
    public ItemSearchCriterionType.CodeRef getCodeRef() {
        return codeRef;
    }

    /**
     * ����codeRef���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ItemSearchCriterionType.CodeRef }
     */
    public void setCodeRef(ItemSearchCriterionType.CodeRef value) {
        this.codeRef = value;
    }

    /**
     * Gets the value of the hotelRef property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRef property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRef().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSearchCriterionType.HotelRef }
     */
    public List<ItemSearchCriterionType.HotelRef> getHotelRef() {
        if (hotelRef == null) {
            hotelRef = new ArrayList<ItemSearchCriterionType.HotelRef>();
        }
        return this.hotelRef;
    }

    /**
     * ��ȡradius���Ե�ֵ��
     *
     * @return possible object is
     * {@link ItemSearchCriterionType.Radius }
     */
    public ItemSearchCriterionType.Radius getRadius() {
        return radius;
    }

    /**
     * ����radius���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ItemSearchCriterionType.Radius }
     */
    public void setRadius(ItemSearchCriterionType.Radius value) {
        this.radius = value;
    }

    /**
     * ��ȡmapArea���Ե�ֵ��
     *
     * @return possible object is
     * {@link ItemSearchCriterionType.MapArea }
     */
    public ItemSearchCriterionType.MapArea getMapArea() {
        return mapArea;
    }

    /**
     * ����mapArea���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ItemSearchCriterionType.MapArea }
     */
    public void setMapArea(ItemSearchCriterionType.MapArea value) {
        this.mapArea = value;
    }

    /**
     * ��ȡadditionalContents���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfItemSearchCriterionTypeAdditionalContent }
     */
    public ArrayOfItemSearchCriterionTypeAdditionalContent getAdditionalContents() {
        return additionalContents;
    }

    /**
     * ����additionalContents���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfItemSearchCriterionTypeAdditionalContent }
     */
    public void setAdditionalContents(ArrayOfItemSearchCriterionTypeAdditionalContent value) {
        this.additionalContents = value;
    }

    /**
     * ��ȡexactMatch���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isExactMatch() {
        return exactMatch;
    }

    /**
     * ����exactMatch���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setExactMatch(Boolean value) {
        this.exactMatch = value;
    }

    /**
     * ��ȡimportanceType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getImportanceType() {
        return importanceType;
    }

    /**
     * ����importanceType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImportanceType(String value) {
        this.importanceType = value;
    }

    /**
     * ��ȡranking���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getRanking() {
        return ranking;
    }

    /**
     * ����ranking���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setRanking(BigInteger value) {
        this.ranking = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
     *       &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AddressSearchScope">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Primary"/>
     *             &lt;enumeration value="Alternate"/>
     *             &lt;enumeration value="PrimaryAndAlternate"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
            extends AddressType {

        @XmlAttribute(name = "SameCountryInd")
        protected Boolean sameCountryInd;
        @XmlAttribute(name = "AddressSearchScope")
        protected String addressSearchScope;

        /**
         * ��ȡsameCountryInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isSameCountryInd() {
            return sameCountryInd;
        }

        /**
         * ����sameCountryInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setSameCountryInd(Boolean value) {
            this.sameCountryInd = value;
        }

        /**
         * ��ȡaddressSearchScope���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAddressSearchScope() {
            return addressSearchScope;
        }

        /**
         * ����addressSearchScope���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAddressSearchScope(String value) {
            this.addressSearchScope = value;
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
     *       &lt;attribute name="VicinityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CodeRef
            extends LocationType {

        @XmlAttribute(name = "VicinityCode")
        protected String vicinityCode;

        /**
         * ��ȡvicinityCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVicinityCode() {
            return vicinityCode;
        }

        /**
         * ����vicinityCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVicinityCode(String value) {
            this.vicinityCode = value;
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
     *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PropertyClassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ArchitecturalStyleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="LocationCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ExtendedCitySearchIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelRef {

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
        @XmlAttribute(name = "SegmentCategoryCode")
        protected String segmentCategoryCode;
        @XmlAttribute(name = "PropertyClassCode")
        protected String propertyClassCode;
        @XmlAttribute(name = "ArchitecturalStyleCode")
        protected String architecturalStyleCode;
        @XmlAttribute(name = "SupplierIntegrationLevel")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger supplierIntegrationLevel;
        @XmlAttribute(name = "LocationCategoryCode")
        protected String locationCategoryCode;
        @XmlAttribute(name = "ExtendedCitySearchIndicator")
        protected Boolean extendedCitySearchIndicator;

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
         * ��ȡsegmentCategoryCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSegmentCategoryCode() {
            return segmentCategoryCode;
        }

        /**
         * ����segmentCategoryCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSegmentCategoryCode(String value) {
            this.segmentCategoryCode = value;
        }

        /**
         * ��ȡpropertyClassCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPropertyClassCode() {
            return propertyClassCode;
        }

        /**
         * ����propertyClassCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPropertyClassCode(String value) {
            this.propertyClassCode = value;
        }

        /**
         * ��ȡarchitecturalStyleCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getArchitecturalStyleCode() {
            return architecturalStyleCode;
        }

        /**
         * ����architecturalStyleCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setArchitecturalStyleCode(String value) {
            this.architecturalStyleCode = value;
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
         * ��ȡlocationCategoryCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLocationCategoryCode() {
            return locationCategoryCode;
        }

        /**
         * ����locationCategoryCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLocationCategoryCode(String value) {
            this.locationCategoryCode = value;
        }

        /**
         * ��ȡextendedCitySearchIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isExtendedCitySearchIndicator() {
            return extendedCitySearchIndicator;
        }

        /**
         * ����extendedCitySearchIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setExtendedCitySearchIndicator(Boolean value) {
            this.extendedCitySearchIndicator = value;
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
     *       &lt;attribute name="NorthLatitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SouthLatitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EastLongitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="WestLongitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MapArea {

        @XmlAttribute(name = "NorthLatitude")
        protected String northLatitude;
        @XmlAttribute(name = "SouthLatitude")
        protected String southLatitude;
        @XmlAttribute(name = "EastLongitude")
        protected String eastLongitude;
        @XmlAttribute(name = "WestLongitude")
        protected String westLongitude;

        /**
         * ��ȡnorthLatitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getNorthLatitude() {
            return northLatitude;
        }

        /**
         * ����northLatitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNorthLatitude(String value) {
            this.northLatitude = value;
        }

        /**
         * ��ȡsouthLatitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSouthLatitude() {
            return southLatitude;
        }

        /**
         * ����southLatitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSouthLatitude(String value) {
            this.southLatitude = value;
        }

        /**
         * ��ȡeastLongitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEastLongitude() {
            return eastLongitude;
        }

        /**
         * ����eastLongitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEastLongitude(String value) {
            this.eastLongitude = value;
        }

        /**
         * ��ȡwestLongitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getWestLongitude() {
            return westLongitude;
        }

        /**
         * ����westLongitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setWestLongitude(String value) {
            this.westLongitude = value;
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
     *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DistanceMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DistanceMax" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Radius {

        @XmlAttribute(name = "Distance")
        protected String distance;
        @XmlAttribute(name = "DistanceMeasure")
        protected String distanceMeasure;
        @XmlAttribute(name = "Direction")
        protected String direction;
        @XmlAttribute(name = "DistanceMax")
        protected String distanceMax;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * ��ȡdistance���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDistance() {
            return distance;
        }

        /**
         * ����distance���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDistance(String value) {
            this.distance = value;
        }

        /**
         * ��ȡdistanceMeasure���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDistanceMeasure() {
            return distanceMeasure;
        }

        /**
         * ����distanceMeasure���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDistanceMeasure(String value) {
            this.distanceMeasure = value;
        }

        /**
         * ��ȡdirection���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDirection() {
            return direction;
        }

        /**
         * ����direction���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDirection(String value) {
            this.direction = value;
        }

        /**
         * ��ȡdistanceMax���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDistanceMax() {
            return distanceMax;
        }

        /**
         * ����distanceMax���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDistanceMax(String value) {
            this.distanceMax = value;
        }

        /**
         * ��ȡunitOfMeasureCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * ����unitOfMeasureCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="RefPointType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    public static class RefPoint {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "StateProv")
        protected String stateProv;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "RefPointType")
        protected String refPointType;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "CityName")
        protected String cityName;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * ��ȡstateProv���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStateProv() {
            return stateProv;
        }

        /**
         * ����stateProv���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStateProv(String value) {
            this.stateProv = value;
        }

        /**
         * ��ȡcountryCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * ����countryCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * ��ȡuri���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getURI() {
            return uri;
        }

        /**
         * ����uri���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * ��ȡrefPointType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRefPointType() {
            return refPointType;
        }

        /**
         * ����refPointType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRefPointType(String value) {
            this.refPointType = value;
        }

        /**
         * ��ȡname���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getName() {
            return name;
        }

        /**
         * ����name���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * ��ȡcityName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCityName() {
            return cityName;
        }

        /**
         * ����cityName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCityName(String value) {
            this.cityName = value;
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {


    }

}
