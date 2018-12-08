
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelRatePlanTypeSupplement complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelRatePlanTypeSupplement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Supplement" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RoomCompanions" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                           &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                           &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                           &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="MinCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="MaxCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PrerequisiteInventory" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SupplementType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="AdditionalGuest"/&gt;
 *                       &lt;enumeration value="Board"/&gt;
 *                       &lt;enumeration value="Extra"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ChargeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AdditionalGuestNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="AddToBasicRateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="SingleUseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MandatoryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelRatePlanTypeSupplement", propOrder = {
    "supplement"
})
public class ArrayOfHotelRatePlanTypeSupplement {

    @XmlElement(name = "Supplement")
    protected List<ArrayOfHotelRatePlanTypeSupplement.Supplement> supplement;

    /**
     * Gets the value of the supplement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelRatePlanTypeSupplement.Supplement }
     * 
     * 
     */
    public List<ArrayOfHotelRatePlanTypeSupplement.Supplement> getSupplement() {
        if (supplement == null) {
            supplement = new ArrayList<ArrayOfHotelRatePlanTypeSupplement.Supplement>();
        }
        return this.supplement;
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
     *       &lt;sequence&gt;
     *         &lt;element name="RoomCompanions" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="MinCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="MaxCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PrerequisiteInventory" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SupplementType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="AdditionalGuest"/&gt;
     *             &lt;enumeration value="Board"/&gt;
     *             &lt;enumeration value="Extra"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ChargeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AdditionalGuestNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="AddToBasicRateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="SingleUseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MandatoryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomCompanions",
        "prerequisiteInventory",
        "description"
    })
    public static class Supplement {

        @XmlElement(name = "RoomCompanions")
        protected List<ArrayOfHotelRatePlanTypeSupplement.Supplement.RoomCompanions> roomCompanions;
        @XmlElement(name = "PrerequisiteInventory")
        protected List<ArrayOfHotelRatePlanTypeSupplement.Supplement.PrerequisiteInventory> prerequisiteInventory;
        @XmlElement(name = "Description")
        protected List<ParagraphType> description;
        @XmlAttribute(name = "AgeQualifyingCode")
        protected String ageQualifyingCode;
        @XmlAttribute(name = "MinAge")
        protected BigInteger minAge;
        @XmlAttribute(name = "MaxAge")
        protected BigInteger maxAge;
        @XmlAttribute(name = "AgeTimeUnit")
        protected TimeUnitType ageTimeUnit;
        @XmlAttribute(name = "AgeBucket")
        protected String ageBucket;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "SupplementType")
        protected String supplementType;
        @XmlAttribute(name = "ChargeTypeCode")
        protected String chargeTypeCode;
        @XmlAttribute(name = "InvCode")
        protected String invCode;
        @XmlAttribute(name = "InvType")
        protected String invType;
        @XmlAttribute(name = "AdditionalGuestNumber")
        protected BigInteger additionalGuestNumber;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "AddToBasicRateIndicator")
        protected Boolean addToBasicRateIndicator;
        @XmlAttribute(name = "SingleUseIndicator")
        protected Boolean singleUseIndicator;
        @XmlAttribute(name = "MandatoryIndicator")
        protected Boolean mandatoryIndicator;

        /**
         * Gets the value of the roomCompanions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomCompanions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomCompanions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfHotelRatePlanTypeSupplement.Supplement.RoomCompanions }
         * 
         * 
         */
        public List<ArrayOfHotelRatePlanTypeSupplement.Supplement.RoomCompanions> getRoomCompanions() {
            if (roomCompanions == null) {
                roomCompanions = new ArrayList<ArrayOfHotelRatePlanTypeSupplement.Supplement.RoomCompanions>();
            }
            return this.roomCompanions;
        }

        /**
         * Gets the value of the prerequisiteInventory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prerequisiteInventory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrerequisiteInventory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfHotelRatePlanTypeSupplement.Supplement.PrerequisiteInventory }
         * 
         * 
         */
        public List<ArrayOfHotelRatePlanTypeSupplement.Supplement.PrerequisiteInventory> getPrerequisiteInventory() {
            if (prerequisiteInventory == null) {
                prerequisiteInventory = new ArrayList<ArrayOfHotelRatePlanTypeSupplement.Supplement.PrerequisiteInventory>();
            }
            return this.prerequisiteInventory;
        }

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getDescription() {
            if (description == null) {
                description = new ArrayList<ParagraphType>();
            }
            return this.description;
        }

        /**
         * 获取ageQualifyingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeQualifyingCode() {
            return ageQualifyingCode;
        }

        /**
         * 设置ageQualifyingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeQualifyingCode(String value) {
            this.ageQualifyingCode = value;
        }

        /**
         * 获取minAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinAge() {
            return minAge;
        }

        /**
         * 设置minAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinAge(BigInteger value) {
            this.minAge = value;
        }

        /**
         * 获取maxAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxAge() {
            return maxAge;
        }

        /**
         * 设置maxAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxAge(BigInteger value) {
            this.maxAge = value;
        }

        /**
         * 获取ageTimeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getAgeTimeUnit() {
            return ageTimeUnit;
        }

        /**
         * 设置ageTimeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setAgeTimeUnit(TimeUnitType value) {
            this.ageTimeUnit = value;
        }

        /**
         * 获取ageBucket属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeBucket() {
            return ageBucket;
        }

        /**
         * 设置ageBucket属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeBucket(String value) {
            this.ageBucket = value;
        }

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * 获取start属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * 设置start属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * 获取end属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * 设置end属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * 获取supplementType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplementType() {
            return supplementType;
        }

        /**
         * 设置supplementType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplementType(String value) {
            this.supplementType = value;
        }

        /**
         * 获取chargeTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargeTypeCode() {
            return chargeTypeCode;
        }

        /**
         * 设置chargeTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargeTypeCode(String value) {
            this.chargeTypeCode = value;
        }

        /**
         * 获取invCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvCode() {
            return invCode;
        }

        /**
         * 设置invCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvCode(String value) {
            this.invCode = value;
        }

        /**
         * 获取invType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvType() {
            return invType;
        }

        /**
         * 设置invType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvType(String value) {
            this.invType = value;
        }

        /**
         * 获取additionalGuestNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAdditionalGuestNumber() {
            return additionalGuestNumber;
        }

        /**
         * 设置additionalGuestNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAdditionalGuestNumber(BigInteger value) {
            this.additionalGuestNumber = value;
        }

        /**
         * 获取rph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * 设置rph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * 获取percent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * 设置percent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
        }

        /**
         * 获取addToBasicRateIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAddToBasicRateIndicator() {
            return addToBasicRateIndicator;
        }

        /**
         * 设置addToBasicRateIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAddToBasicRateIndicator(Boolean value) {
            this.addToBasicRateIndicator = value;
        }

        /**
         * 获取singleUseIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSingleUseIndicator() {
            return singleUseIndicator;
        }

        /**
         * 设置singleUseIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSingleUseIndicator(Boolean value) {
            this.singleUseIndicator = value;
        }

        /**
         * 获取mandatoryIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMandatoryIndicator() {
            return mandatoryIndicator;
        }

        /**
         * 设置mandatoryIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMandatoryIndicator(Boolean value) {
            this.mandatoryIndicator = value;
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
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PrerequisiteInventory {

            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;

            /**
             * 获取invCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * 设置invCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * 获取invType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvType() {
                return invType;
            }

            /**
             * 设置invType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvType(String value) {
                this.invType = value;
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
         *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
         *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="MinCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="MaxCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RoomCompanions {

            @XmlAttribute(name = "AgeQualifyingCode")
            protected String ageQualifyingCode;
            @XmlAttribute(name = "MinAge")
            protected BigInteger minAge;
            @XmlAttribute(name = "MaxAge")
            protected BigInteger maxAge;
            @XmlAttribute(name = "AgeTimeUnit")
            protected TimeUnitType ageTimeUnit;
            @XmlAttribute(name = "AgeBucket")
            protected String ageBucket;
            @XmlAttribute(name = "MinCompanions")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger minCompanions;
            @XmlAttribute(name = "MaxCompanions")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger maxCompanions;

            /**
             * 获取ageQualifyingCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeQualifyingCode() {
                return ageQualifyingCode;
            }

            /**
             * 设置ageQualifyingCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeQualifyingCode(String value) {
                this.ageQualifyingCode = value;
            }

            /**
             * 获取minAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinAge() {
                return minAge;
            }

            /**
             * 设置minAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinAge(BigInteger value) {
                this.minAge = value;
            }

            /**
             * 获取maxAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxAge() {
                return maxAge;
            }

            /**
             * 设置maxAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxAge(BigInteger value) {
                this.maxAge = value;
            }

            /**
             * 获取ageTimeUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TimeUnitType }
             *     
             */
            public TimeUnitType getAgeTimeUnit() {
                return ageTimeUnit;
            }

            /**
             * 设置ageTimeUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TimeUnitType }
             *     
             */
            public void setAgeTimeUnit(TimeUnitType value) {
                this.ageTimeUnit = value;
            }

            /**
             * 获取ageBucket属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeBucket() {
                return ageBucket;
            }

            /**
             * 设置ageBucket属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeBucket(String value) {
                this.ageBucket = value;
            }

            /**
             * 获取minCompanions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinCompanions() {
                return minCompanions;
            }

            /**
             * 设置minCompanions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinCompanions(BigInteger value) {
                this.minCompanions = value;
            }

            /**
             * 获取maxCompanions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxCompanions() {
                return maxCompanions;
            }

            /**
             * 设置maxCompanions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxCompanions(BigInteger value) {
                this.maxCompanions = value;
            }

        }

    }

}
