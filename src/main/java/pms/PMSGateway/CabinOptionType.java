package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CabinOptionType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CabinOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinConfiguration" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BedConfigurationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MeasurementInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DimensionInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CategoryLocation" type="{http://www.opentravel.org/OTA/2003/05}CategoryLocationType" />
 *       &lt;attribute name="ShipSide">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Starboard"/>
 *             &lt;enumeration value="Port"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PositionInShip">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Aft"/>
 *             &lt;enumeration value="Forward"/>
 *             &lt;enumeration value="Midship"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BedType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="DeclineIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HeldIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ReleaseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="DeckNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DeckName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CabinCategoryStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CabinCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CabinRanking" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ConnectingCabinIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ConnectingCabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinOptionType", propOrder = {
        "cabinConfiguration",
        "measurementInfo",
        "remark"
})
@XmlSeeAlso({
        pms.PMSGateway.SailingCategoryInfoType.SelectedCategory.SelectedCabin.class
})
public class CabinOptionType {

    @XmlElement(name = "CabinConfiguration")
    protected List<CabinOptionType.CabinConfiguration> cabinConfiguration;
    @XmlElement(name = "MeasurementInfo")
    protected List<CabinOptionType.MeasurementInfo> measurementInfo;
    @XmlElement(name = "Remark")
    protected FreeTextType remark;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "CategoryLocation")
    protected CategoryLocationType categoryLocation;
    @XmlAttribute(name = "ShipSide")
    protected String shipSide;
    @XmlAttribute(name = "PositionInShip")
    protected String positionInShip;
    @XmlAttribute(name = "BedType")
    protected String bedType;
    @XmlAttribute(name = "CabinNumber")
    protected String cabinNumber;
    @XmlAttribute(name = "MaxOccupancy")
    protected BigInteger maxOccupancy;
    @XmlAttribute(name = "DeclineIndicator")
    protected Boolean declineIndicator;
    @XmlAttribute(name = "HeldIndicator")
    protected Boolean heldIndicator;
    @XmlAttribute(name = "ReleaseDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseDateTime;
    @XmlAttribute(name = "DeckNumber")
    protected String deckNumber;
    @XmlAttribute(name = "DeckName")
    protected String deckName;
    @XmlAttribute(name = "CabinCategoryStatusCode")
    protected String cabinCategoryStatusCode;
    @XmlAttribute(name = "CabinCategoryCode")
    protected String cabinCategoryCode;
    @XmlAttribute(name = "CabinRanking")
    protected BigInteger cabinRanking;
    @XmlAttribute(name = "ConnectingCabinIndicator")
    protected Boolean connectingCabinIndicator;
    @XmlAttribute(name = "ConnectingCabinNumber")
    protected String connectingCabinNumber;

    /**
     * Gets the value of the cabinConfiguration property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinConfiguration property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinConfiguration().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinOptionType.CabinConfiguration }
     */
    public List<CabinOptionType.CabinConfiguration> getCabinConfiguration() {
        if (cabinConfiguration == null) {
            cabinConfiguration = new ArrayList<CabinOptionType.CabinConfiguration>();
        }
        return this.cabinConfiguration;
    }

    /**
     * Gets the value of the measurementInfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementInfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementInfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinOptionType.MeasurementInfo }
     */
    public List<CabinOptionType.MeasurementInfo> getMeasurementInfo() {
        if (measurementInfo == null) {
            measurementInfo = new ArrayList<CabinOptionType.MeasurementInfo>();
        }
        return this.measurementInfo;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     *
     * @return possible object is
     * {@link FreeTextType }
     */
    public FreeTextType getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link FreeTextType }
     */
    public void setRemark(FreeTextType value) {
        this.remark = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * ��ȡcategoryLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link CategoryLocationType }
     */
    public CategoryLocationType getCategoryLocation() {
        return categoryLocation;
    }

    /**
     * ����categoryLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CategoryLocationType }
     */
    public void setCategoryLocation(CategoryLocationType value) {
        this.categoryLocation = value;
    }

    /**
     * ��ȡshipSide���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShipSide() {
        return shipSide;
    }

    /**
     * ����shipSide���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShipSide(String value) {
        this.shipSide = value;
    }

    /**
     * ��ȡpositionInShip���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPositionInShip() {
        return positionInShip;
    }

    /**
     * ����positionInShip���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPositionInShip(String value) {
        this.positionInShip = value;
    }

    /**
     * ��ȡbedType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * ����bedType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBedType(String value) {
        this.bedType = value;
    }

    /**
     * ��ȡcabinNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCabinNumber() {
        return cabinNumber;
    }

    /**
     * ����cabinNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCabinNumber(String value) {
        this.cabinNumber = value;
    }

    /**
     * ��ȡmaxOccupancy���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * ����maxOccupancy���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxOccupancy(BigInteger value) {
        this.maxOccupancy = value;
    }

    /**
     * ��ȡdeclineIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDeclineIndicator() {
        return declineIndicator;
    }

    /**
     * ����declineIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDeclineIndicator(Boolean value) {
        this.declineIndicator = value;
    }

    /**
     * ��ȡheldIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isHeldIndicator() {
        return heldIndicator;
    }

    /**
     * ����heldIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setHeldIndicator(Boolean value) {
        this.heldIndicator = value;
    }

    /**
     * ��ȡreleaseDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getReleaseDateTime() {
        return releaseDateTime;
    }

    /**
     * ����releaseDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setReleaseDateTime(XMLGregorianCalendar value) {
        this.releaseDateTime = value;
    }

    /**
     * ��ȡdeckNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeckNumber() {
        return deckNumber;
    }

    /**
     * ����deckNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeckNumber(String value) {
        this.deckNumber = value;
    }

    /**
     * ��ȡdeckName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeckName() {
        return deckName;
    }

    /**
     * ����deckName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeckName(String value) {
        this.deckName = value;
    }

    /**
     * ��ȡcabinCategoryStatusCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCabinCategoryStatusCode() {
        return cabinCategoryStatusCode;
    }

    /**
     * ����cabinCategoryStatusCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCabinCategoryStatusCode(String value) {
        this.cabinCategoryStatusCode = value;
    }

    /**
     * ��ȡcabinCategoryCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCabinCategoryCode() {
        return cabinCategoryCode;
    }

    /**
     * ����cabinCategoryCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCabinCategoryCode(String value) {
        this.cabinCategoryCode = value;
    }

    /**
     * ��ȡcabinRanking���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getCabinRanking() {
        return cabinRanking;
    }

    /**
     * ����cabinRanking���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setCabinRanking(BigInteger value) {
        this.cabinRanking = value;
    }

    /**
     * ��ȡconnectingCabinIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isConnectingCabinIndicator() {
        return connectingCabinIndicator;
    }

    /**
     * ����connectingCabinIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setConnectingCabinIndicator(Boolean value) {
        this.connectingCabinIndicator = value;
    }

    /**
     * ��ȡconnectingCabinNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getConnectingCabinNumber() {
        return connectingCabinNumber;
    }

    /**
     * ����connectingCabinNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConnectingCabinNumber(String value) {
        this.connectingCabinNumber = value;
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
     *       &lt;attribute name="BedConfigurationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinConfiguration {

        @XmlAttribute(name = "BedConfigurationCode")
        protected String bedConfigurationCode;

        /**
         * ��ȡbedConfigurationCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBedConfigurationCode() {
            return bedConfigurationCode;
        }

        /**
         * ����bedConfigurationCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBedConfigurationCode(String value) {
            this.bedConfigurationCode = value;
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
     *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DimensionInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MeasurementInfo {

        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "DimensionInfo")
        protected String dimensionInfo;

        /**
         * ��ȡunitOfMeasureQuantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * ����unitOfMeasureQuantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * ��ȡunitOfMeasure���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * ����unitOfMeasure���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
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
         * ��ȡdimensionInfo���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDimensionInfo() {
            return dimensionInfo;
        }

        /**
         * ����dimensionInfo���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDimensionInfo(String value) {
            this.dimensionInfo = value;
        }

    }

}
