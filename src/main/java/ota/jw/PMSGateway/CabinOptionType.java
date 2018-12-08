
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * <p>CabinOptionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CabinOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinConfiguration" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="BedConfigurationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MeasurementInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DimensionInfo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CategoryLocation" type="{http://www.opentravel.org/OTA/2003/05}CategoryLocationType" /&gt;
 *       &lt;attribute name="ShipSide"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Starboard"/&gt;
 *             &lt;enumeration value="Port"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PositionInShip"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Aft"/&gt;
 *             &lt;enumeration value="Forward"/&gt;
 *             &lt;enumeration value="Midship"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="BedType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="DeclineIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HeldIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReleaseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="DeckNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DeckName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CabinCategoryStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CabinCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CabinRanking" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ConnectingCabinIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ConnectingCabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinOptionType", propOrder = {
    "cabinConfiguration",
    "measurementInfo",
    "remark"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.SailingCategoryInfoType.SelectedCategory.SelectedCabin.class
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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinOptionType.CabinConfiguration }
     * 
     * 
     */
    public List<CabinOptionType.CabinConfiguration> getCabinConfiguration() {
        if (cabinConfiguration == null) {
            cabinConfiguration = new ArrayList<CabinOptionType.CabinConfiguration>();
        }
        return this.cabinConfiguration;
    }

    /**
     * Gets the value of the measurementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinOptionType.MeasurementInfo }
     * 
     * 
     */
    public List<CabinOptionType.MeasurementInfo> getMeasurementInfo() {
        if (measurementInfo == null) {
            measurementInfo = new ArrayList<CabinOptionType.MeasurementInfo>();
        }
        return this.measurementInfo;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setRemark(FreeTextType value) {
        this.remark = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取categoryLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CategoryLocationType }
     *     
     */
    public CategoryLocationType getCategoryLocation() {
        return categoryLocation;
    }

    /**
     * 设置categoryLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryLocationType }
     *     
     */
    public void setCategoryLocation(CategoryLocationType value) {
        this.categoryLocation = value;
    }

    /**
     * 获取shipSide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipSide() {
        return shipSide;
    }

    /**
     * 设置shipSide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipSide(String value) {
        this.shipSide = value;
    }

    /**
     * 获取positionInShip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionInShip() {
        return positionInShip;
    }

    /**
     * 设置positionInShip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionInShip(String value) {
        this.positionInShip = value;
    }

    /**
     * 获取bedType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * 设置bedType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedType(String value) {
        this.bedType = value;
    }

    /**
     * 获取cabinNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinNumber() {
        return cabinNumber;
    }

    /**
     * 设置cabinNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinNumber(String value) {
        this.cabinNumber = value;
    }

    /**
     * 获取maxOccupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * 设置maxOccupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOccupancy(BigInteger value) {
        this.maxOccupancy = value;
    }

    /**
     * 获取declineIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeclineIndicator() {
        return declineIndicator;
    }

    /**
     * 设置declineIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeclineIndicator(Boolean value) {
        this.declineIndicator = value;
    }

    /**
     * 获取heldIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeldIndicator() {
        return heldIndicator;
    }

    /**
     * 设置heldIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeldIndicator(Boolean value) {
        this.heldIndicator = value;
    }

    /**
     * 获取releaseDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDateTime() {
        return releaseDateTime;
    }

    /**
     * 设置releaseDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDateTime(XMLGregorianCalendar value) {
        this.releaseDateTime = value;
    }

    /**
     * 获取deckNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckNumber() {
        return deckNumber;
    }

    /**
     * 设置deckNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckNumber(String value) {
        this.deckNumber = value;
    }

    /**
     * 获取deckName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckName() {
        return deckName;
    }

    /**
     * 设置deckName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckName(String value) {
        this.deckName = value;
    }

    /**
     * 获取cabinCategoryStatusCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCategoryStatusCode() {
        return cabinCategoryStatusCode;
    }

    /**
     * 设置cabinCategoryStatusCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCategoryStatusCode(String value) {
        this.cabinCategoryStatusCode = value;
    }

    /**
     * 获取cabinCategoryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCategoryCode() {
        return cabinCategoryCode;
    }

    /**
     * 设置cabinCategoryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCategoryCode(String value) {
        this.cabinCategoryCode = value;
    }

    /**
     * 获取cabinRanking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCabinRanking() {
        return cabinRanking;
    }

    /**
     * 设置cabinRanking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinRanking(BigInteger value) {
        this.cabinRanking = value;
    }

    /**
     * 获取connectingCabinIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectingCabinIndicator() {
        return connectingCabinIndicator;
    }

    /**
     * 设置connectingCabinIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectingCabinIndicator(Boolean value) {
        this.connectingCabinIndicator = value;
    }

    /**
     * 获取connectingCabinNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectingCabinNumber() {
        return connectingCabinNumber;
    }

    /**
     * 设置connectingCabinNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectingCabinNumber(String value) {
        this.connectingCabinNumber = value;
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
     *       &lt;attribute name="BedConfigurationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinConfiguration {

        @XmlAttribute(name = "BedConfigurationCode")
        protected String bedConfigurationCode;

        /**
         * 获取bedConfigurationCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBedConfigurationCode() {
            return bedConfigurationCode;
        }

        /**
         * 设置bedConfigurationCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBedConfigurationCode(String value) {
            this.bedConfigurationCode = value;
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
     *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DimensionInfo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取unitOfMeasureQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * 设置unitOfMeasureQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * 获取unitOfMeasure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * 设置unitOfMeasure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

        /**
         * 获取unitOfMeasureCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * 设置unitOfMeasureCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
        }

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * 获取dimensionInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDimensionInfo() {
            return dimensionInfo;
        }

        /**
         * 设置dimensionInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDimensionInfo(String value) {
            this.dimensionInfo = value;
        }

    }

}
