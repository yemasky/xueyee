
package ota.jw.PMSGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RatePlanType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RatePlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanInclusions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RatePlanInclusionDesciption" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/&gt;
 *         &lt;element name="MealsIncluded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MealPlanCodes"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RestrictionStatus" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Restriction"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Master"/&gt;
 *                       &lt;enumeration value="Arrival"/&gt;
 *                       &lt;enumeration value="Departure"/&gt;
 *                       &lt;enumeration value="NonGuarantee"/&gt;
 *                       &lt;enumeration value="TravelAgent"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
 *                 &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAdditionalDetailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateIndicator" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" /&gt;
 *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MarketCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" /&gt;
 *       &lt;attribute name="ID_RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PriceViewableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="QualificationType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanType", propOrder = {
    "guarantee",
    "cancelPenalties",
    "ratePlanDescription",
    "ratePlanInclusions",
    "commission",
    "mealsIncluded",
    "restrictionStatus",
    "additionalDetails"
})
public class RatePlanType {

    @XmlElement(name = "Guarantee")
    protected List<GuaranteeType> guarantee;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "RatePlanDescription")
    protected ParagraphType ratePlanDescription;
    @XmlElement(name = "RatePlanInclusions")
    protected RatePlanType.RatePlanInclusions ratePlanInclusions;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "MealsIncluded")
    protected RatePlanType.MealsIncluded mealsIncluded;
    @XmlElement(name = "RestrictionStatus")
    protected RatePlanType.RestrictionStatus restrictionStatus;
    @XmlElement(name = "AdditionalDetails")
    protected ArrayOfAdditionalDetailType additionalDetails;
    @XmlAttribute(name = "BookingCode")
    protected String bookingCode;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "ExpireDateExclusiveIndicator")
    protected Boolean expireDateExclusiveIndicator;
    @XmlAttribute(name = "RateIndicator")
    protected RateIndicatorType rateIndicator;
    @XmlAttribute(name = "RatePlanType")
    protected String ratePlanType;
    @XmlAttribute(name = "RatePlanID")
    protected String ratePlanID;
    @XmlAttribute(name = "RatePlanName")
    protected String ratePlanName;
    @XmlAttribute(name = "MarketCode")
    protected String marketCode;
    @XmlAttribute(name = "AvailabilityStatus")
    protected RateIndicatorType availabilityStatus;
    @XmlAttribute(name = "ID_RequiredInd")
    protected Boolean idRequiredInd;
    @XmlAttribute(name = "PriceViewableInd")
    protected Boolean priceViewableInd;
    @XmlAttribute(name = "QualificationType")
    protected String qualificationType;
    @XmlAttribute(name = "AvailableQuantity")
    protected BigInteger availableQuantity;
    @XmlAttribute(name = "PrepaidIndicator")
    protected Boolean prepaidIndicator;

    /**
     * Gets the value of the guarantee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeType }
     * 
     * 
     */
    public List<GuaranteeType> getGuarantee() {
        if (guarantee == null) {
            guarantee = new ArrayList<GuaranteeType>();
        }
        return this.guarantee;
    }

    /**
     * 获取cancelPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * 设置cancelPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * 获取ratePlanDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getRatePlanDescription() {
        return ratePlanDescription;
    }

    /**
     * 设置ratePlanDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setRatePlanDescription(ParagraphType value) {
        this.ratePlanDescription = value;
    }

    /**
     * 获取ratePlanInclusions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.RatePlanInclusions }
     *     
     */
    public RatePlanType.RatePlanInclusions getRatePlanInclusions() {
        return ratePlanInclusions;
    }

    /**
     * 设置ratePlanInclusions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.RatePlanInclusions }
     *     
     */
    public void setRatePlanInclusions(RatePlanType.RatePlanInclusions value) {
        this.ratePlanInclusions = value;
    }

    /**
     * 获取commission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * 设置commission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * 获取mealsIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.MealsIncluded }
     *     
     */
    public RatePlanType.MealsIncluded getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * 设置mealsIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.MealsIncluded }
     *     
     */
    public void setMealsIncluded(RatePlanType.MealsIncluded value) {
        this.mealsIncluded = value;
    }

    /**
     * 获取restrictionStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.RestrictionStatus }
     *     
     */
    public RatePlanType.RestrictionStatus getRestrictionStatus() {
        return restrictionStatus;
    }

    /**
     * 设置restrictionStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.RestrictionStatus }
     *     
     */
    public void setRestrictionStatus(RatePlanType.RestrictionStatus value) {
        this.restrictionStatus = value;
    }

    /**
     * 获取additionalDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditionalDetailType }
     *     
     */
    public ArrayOfAdditionalDetailType getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * 设置additionalDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditionalDetailType }
     *     
     */
    public void setAdditionalDetails(ArrayOfAdditionalDetailType value) {
        this.additionalDetails = value;
    }

    /**
     * 获取bookingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * 设置bookingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * 获取ratePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 设置ratePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * 获取expireDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * 设置expireDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * 获取expireDateExclusiveIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpireDateExclusiveIndicator() {
        return expireDateExclusiveIndicator;
    }

    /**
     * 设置expireDateExclusiveIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpireDateExclusiveIndicator(Boolean value) {
        this.expireDateExclusiveIndicator = value;
    }

    /**
     * 获取rateIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateIndicatorType }
     *     
     */
    public RateIndicatorType getRateIndicator() {
        return rateIndicator;
    }

    /**
     * 设置rateIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateIndicatorType }
     *     
     */
    public void setRateIndicator(RateIndicatorType value) {
        this.rateIndicator = value;
    }

    /**
     * 获取ratePlanType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * 设置ratePlanType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * 获取ratePlanID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanID() {
        return ratePlanID;
    }

    /**
     * 设置ratePlanID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanID(String value) {
        this.ratePlanID = value;
    }

    /**
     * 获取ratePlanName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanName() {
        return ratePlanName;
    }

    /**
     * 设置ratePlanName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanName(String value) {
        this.ratePlanName = value;
    }

    /**
     * 获取marketCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * 设置marketCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * 获取availabilityStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateIndicatorType }
     *     
     */
    public RateIndicatorType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * 设置availabilityStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateIndicatorType }
     *     
     */
    public void setAvailabilityStatus(RateIndicatorType value) {
        this.availabilityStatus = value;
    }

    /**
     * 获取idRequiredInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIDRequiredInd() {
        return idRequiredInd;
    }

    /**
     * 设置idRequiredInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIDRequiredInd(Boolean value) {
        this.idRequiredInd = value;
    }

    /**
     * 获取priceViewableInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceViewableInd() {
        return priceViewableInd;
    }

    /**
     * 设置priceViewableInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceViewableInd(Boolean value) {
        this.priceViewableInd = value;
    }

    /**
     * 获取qualificationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationType() {
        return qualificationType;
    }

    /**
     * 设置qualificationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationType(String value) {
        this.qualificationType = value;
    }

    /**
     * 获取availableQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * 设置availableQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableQuantity(BigInteger value) {
        this.availableQuantity = value;
    }

    /**
     * 获取prepaidIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * 设置prepaidIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrepaidIndicator(Boolean value) {
        this.prepaidIndicator = value;
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
     *       &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MealPlanCodes"&gt;
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
    @XmlType(name = "")
    public static class MealsIncluded {

        @XmlAttribute(name = "Breakfast")
        protected Boolean breakfast;
        @XmlAttribute(name = "Lunch")
        protected Boolean lunch;
        @XmlAttribute(name = "Dinner")
        protected Boolean dinner;
        @XmlAttribute(name = "MealPlanIndicator")
        protected Boolean mealPlanIndicator;
        @XmlAttribute(name = "MealPlanCodes")
        protected List<String> mealPlanCodes;

        /**
         * 获取breakfast属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBreakfast() {
            return breakfast;
        }

        /**
         * 设置breakfast属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBreakfast(Boolean value) {
            this.breakfast = value;
        }

        /**
         * 获取lunch属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLunch() {
            return lunch;
        }

        /**
         * 设置lunch属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLunch(Boolean value) {
            this.lunch = value;
        }

        /**
         * 获取dinner属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDinner() {
            return dinner;
        }

        /**
         * 设置dinner属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDinner(Boolean value) {
            this.dinner = value;
        }

        /**
         * 获取mealPlanIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMealPlanIndicator() {
            return mealPlanIndicator;
        }

        /**
         * 设置mealPlanIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMealPlanIndicator(Boolean value) {
            this.mealPlanIndicator = value;
        }

        /**
         * Gets the value of the mealPlanCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mealPlanCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMealPlanCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMealPlanCodes() {
            if (mealPlanCodes == null) {
                mealPlanCodes = new ArrayList<String>();
            }
            return this.mealPlanCodes;
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
     *       &lt;sequence&gt;
     *         &lt;element name="RatePlanInclusionDesciption" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ratePlanInclusionDesciption"
    })
    public static class RatePlanInclusions {

        @XmlElement(name = "RatePlanInclusionDesciption")
        protected ParagraphType ratePlanInclusionDesciption;
        @XmlAttribute(name = "TaxInclusive")
        protected Boolean taxInclusive;
        @XmlAttribute(name = "ServiceFeeInclusive")
        protected Boolean serviceFeeInclusive;

        /**
         * 获取ratePlanInclusionDesciption属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ParagraphType }
         *     
         */
        public ParagraphType getRatePlanInclusionDesciption() {
            return ratePlanInclusionDesciption;
        }

        /**
         * 设置ratePlanInclusionDesciption属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ParagraphType }
         *     
         */
        public void setRatePlanInclusionDesciption(ParagraphType value) {
            this.ratePlanInclusionDesciption = value;
        }

        /**
         * 获取taxInclusive属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTaxInclusive() {
            return taxInclusive;
        }

        /**
         * 设置taxInclusive属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTaxInclusive(Boolean value) {
            this.taxInclusive = value;
        }

        /**
         * 获取serviceFeeInclusive属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isServiceFeeInclusive() {
            return serviceFeeInclusive;
        }

        /**
         * 设置serviceFeeInclusive属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setServiceFeeInclusive(Boolean value) {
            this.serviceFeeInclusive = value;
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
     *       &lt;attribute name="Restriction"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Master"/&gt;
     *             &lt;enumeration value="Arrival"/&gt;
     *             &lt;enumeration value="Departure"/&gt;
     *             &lt;enumeration value="NonGuarantee"/&gt;
     *             &lt;enumeration value="TravelAgent"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
     *       &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RestrictionStatus {

        @XmlAttribute(name = "Restriction")
        protected String restriction;
        @XmlAttribute(name = "Status")
        protected AvailabilityStatusType status;
        @XmlAttribute(name = "SellThroughOpenIndicator")
        protected Boolean sellThroughOpenIndicator;

        /**
         * 获取restriction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestriction() {
            return restriction;
        }

        /**
         * 设置restriction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestriction(String value) {
            this.restriction = value;
        }

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailabilityStatusType }
         *     
         */
        public AvailabilityStatusType getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilityStatusType }
         *     
         */
        public void setStatus(AvailabilityStatusType value) {
            this.status = value;
        }

        /**
         * 获取sellThroughOpenIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSellThroughOpenIndicator() {
            return sellThroughOpenIndicator;
        }

        /**
         * 设置sellThroughOpenIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSellThroughOpenIndicator(Boolean value) {
            this.sellThroughOpenIndicator = value;
        }

    }

}
