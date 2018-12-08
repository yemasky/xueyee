
package ota.jw.ARIPmsGateway;

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


/**
 * <p>RateUploadType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RateUploadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseByGuestAmts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRateUploadTypeBaseByGuestAmt" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalGuestAmounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRateUploadTypeAdditionalGuestAmount" minOccurs="0"/&gt;
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType" minOccurs="0"/&gt;
 *         &lt;element name="GuaranteePolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGuaranteeType" minOccurs="0"/&gt;
 *         &lt;element name="CancelPolicies" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentPolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/&gt;
 *         &lt;element name="RateDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
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
 *                 &lt;attribute name="NumberOfBreakfast" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalCharges" type="{http://www.opentravel.org/OTA/2003/05}HotelAdditionalChargesType" minOccurs="0"/&gt;
 *         &lt;element name="BlanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Stays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *       &lt;attribute name="UnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MinGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MaxGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StayOverDate" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="RateTier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateUploadType", propOrder = {
    "baseByGuestAmts",
    "additionalGuestAmounts",
    "fees",
    "guaranteePolicies",
    "cancelPolicies",
    "paymentPolicies",
    "rateDescription",
    "uniqueID",
    "mealsIncluded",
    "additionalCharges",
    "blanceType",
    "priceType",
    "stays"
})
@XmlSeeAlso({
    ota.jw.ARIPmsGateway.ArrayOfHotelRatePlanTypeRate.Rate.class
})
public class RateUploadType {

    @XmlElement(name = "BaseByGuestAmts")
    protected ArrayOfRateUploadTypeBaseByGuestAmt baseByGuestAmts;
    @XmlElement(name = "AdditionalGuestAmounts")
    protected ArrayOfRateUploadTypeAdditionalGuestAmount additionalGuestAmounts;
    @XmlElement(name = "Fees")
    protected ArrayOfFeeType fees;
    @XmlElement(name = "GuaranteePolicies")
    protected ArrayOfGuaranteeType guaranteePolicies;
    @XmlElement(name = "CancelPolicies")
    protected CancelPenaltiesType cancelPolicies;
    @XmlElement(name = "PaymentPolicies")
    protected ArrayOfRequiredPaymentsTypeGuaranteePayment paymentPolicies;
    @XmlElement(name = "RateDescription")
    protected ParagraphType rateDescription;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "MealsIncluded")
    protected RateUploadType.MealsIncluded mealsIncluded;
    @XmlElement(name = "AdditionalCharges")
    protected HotelAdditionalChargesType additionalCharges;
    @XmlElement(name = "BlanceType")
    protected String blanceType;
    @XmlElement(name = "PriceType")
    protected String priceType;
    @XmlElement(name = "Stays")
    protected int stays;
    @XmlAttribute(name = "NumberOfUnits")
    protected BigInteger numberOfUnits;
    @XmlAttribute(name = "RateTimeUnit")
    protected TimeUnitType rateTimeUnit;
    @XmlAttribute(name = "UnitMultiplier")
    protected BigInteger unitMultiplier;
    @XmlAttribute(name = "MinGuestApplicable")
    protected BigInteger minGuestApplicable;
    @XmlAttribute(name = "MaxGuestApplicable")
    protected BigInteger maxGuestApplicable;
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
    @XmlAttribute(name = "MinLOS")
    protected String minLOS;
    @XmlAttribute(name = "MaxLOS")
    protected String maxLOS;
    @XmlAttribute(name = "StayOverDate")
    protected DayOfWeekType stayOverDate;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "Mon")
    protected Boolean mon;
    @XmlAttribute(name = "Tue")
    protected Boolean tue;
    @XmlAttribute(name = "Weds")
    protected Boolean weds;
    @XmlAttribute(name = "Thur")
    protected Boolean thur;
    @XmlAttribute(name = "Fri")
    protected Boolean fri;
    @XmlAttribute(name = "Sat")
    protected Boolean sat;
    @XmlAttribute(name = "Sun")
    protected Boolean sun;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "RateTier")
    protected String rateTier;

    /**
     * 获取baseByGuestAmts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateUploadTypeBaseByGuestAmt }
     *     
     */
    public ArrayOfRateUploadTypeBaseByGuestAmt getBaseByGuestAmts() {
        return baseByGuestAmts;
    }

    /**
     * 设置baseByGuestAmts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateUploadTypeBaseByGuestAmt }
     *     
     */
    public void setBaseByGuestAmts(ArrayOfRateUploadTypeBaseByGuestAmt value) {
        this.baseByGuestAmts = value;
    }

    /**
     * 获取additionalGuestAmounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateUploadTypeAdditionalGuestAmount }
     *     
     */
    public ArrayOfRateUploadTypeAdditionalGuestAmount getAdditionalGuestAmounts() {
        return additionalGuestAmounts;
    }

    /**
     * 设置additionalGuestAmounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateUploadTypeAdditionalGuestAmount }
     *     
     */
    public void setAdditionalGuestAmounts(ArrayOfRateUploadTypeAdditionalGuestAmount value) {
        this.additionalGuestAmounts = value;
    }

    /**
     * 获取fees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeeType }
     *     
     */
    public ArrayOfFeeType getFees() {
        return fees;
    }

    /**
     * 设置fees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeeType }
     *     
     */
    public void setFees(ArrayOfFeeType value) {
        this.fees = value;
    }

    /**
     * 获取guaranteePolicies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuaranteeType }
     *     
     */
    public ArrayOfGuaranteeType getGuaranteePolicies() {
        return guaranteePolicies;
    }

    /**
     * 设置guaranteePolicies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuaranteeType }
     *     
     */
    public void setGuaranteePolicies(ArrayOfGuaranteeType value) {
        this.guaranteePolicies = value;
    }

    /**
     * 获取cancelPolicies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPolicies() {
        return cancelPolicies;
    }

    /**
     * 设置cancelPolicies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPolicies(CancelPenaltiesType value) {
        this.cancelPolicies = value;
    }

    /**
     * 获取paymentPolicies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment getPaymentPolicies() {
        return paymentPolicies;
    }

    /**
     * 设置paymentPolicies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public void setPaymentPolicies(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
        this.paymentPolicies = value;
    }

    /**
     * 获取rateDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getRateDescription() {
        return rateDescription;
    }

    /**
     * 设置rateDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setRateDescription(ParagraphType value) {
        this.rateDescription = value;
    }

    /**
     * 获取uniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * 设置uniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * 获取mealsIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateUploadType.MealsIncluded }
     *     
     */
    public RateUploadType.MealsIncluded getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * 设置mealsIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateUploadType.MealsIncluded }
     *     
     */
    public void setMealsIncluded(RateUploadType.MealsIncluded value) {
        this.mealsIncluded = value;
    }

    /**
     * 获取additionalCharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelAdditionalChargesType }
     *     
     */
    public HotelAdditionalChargesType getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     * 设置additionalCharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAdditionalChargesType }
     *     
     */
    public void setAdditionalCharges(HotelAdditionalChargesType value) {
        this.additionalCharges = value;
    }

    /**
     * 获取blanceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlanceType() {
        return blanceType;
    }

    /**
     * 设置blanceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlanceType(String value) {
        this.blanceType = value;
    }

    /**
     * 获取priceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * 设置priceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * 获取stays属性的值。
     * 
     */
    public int getStays() {
        return stays;
    }

    /**
     * 设置stays属性的值。
     * 
     */
    public void setStays(int value) {
        this.stays = value;
    }

    /**
     * 获取numberOfUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * 设置numberOfUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
    }

    /**
     * 获取rateTimeUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitType }
     *     
     */
    public TimeUnitType getRateTimeUnit() {
        return rateTimeUnit;
    }

    /**
     * 设置rateTimeUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitType }
     *     
     */
    public void setRateTimeUnit(TimeUnitType value) {
        this.rateTimeUnit = value;
    }

    /**
     * 获取unitMultiplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * 设置unitMultiplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitMultiplier(BigInteger value) {
        this.unitMultiplier = value;
    }

    /**
     * 获取minGuestApplicable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinGuestApplicable() {
        return minGuestApplicable;
    }

    /**
     * 设置minGuestApplicable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinGuestApplicable(BigInteger value) {
        this.minGuestApplicable = value;
    }

    /**
     * 获取maxGuestApplicable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxGuestApplicable() {
        return maxGuestApplicable;
    }

    /**
     * 设置maxGuestApplicable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxGuestApplicable(BigInteger value) {
        this.maxGuestApplicable = value;
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
     * 获取minLOS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinLOS() {
        return minLOS;
    }

    /**
     * 设置minLOS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinLOS(String value) {
        this.minLOS = value;
    }

    /**
     * 获取maxLOS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLOS() {
        return maxLOS;
    }

    /**
     * 设置maxLOS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxLOS(String value) {
        this.maxLOS = value;
    }

    /**
     * 获取stayOverDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getStayOverDate() {
        return stayOverDate;
    }

    /**
     * 设置stayOverDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setStayOverDate(DayOfWeekType value) {
        this.stayOverDate = value;
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
     * 获取mon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMon() {
        return mon;
    }

    /**
     * 设置mon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMon(Boolean value) {
        this.mon = value;
    }

    /**
     * 获取tue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTue() {
        return tue;
    }

    /**
     * 设置tue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTue(Boolean value) {
        this.tue = value;
    }

    /**
     * 获取weds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeds() {
        return weds;
    }

    /**
     * 设置weds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeds(Boolean value) {
        this.weds = value;
    }

    /**
     * 获取thur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThur() {
        return thur;
    }

    /**
     * 设置thur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThur(Boolean value) {
        this.thur = value;
    }

    /**
     * 获取fri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFri() {
        return fri;
    }

    /**
     * 设置fri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFri(Boolean value) {
        this.fri = value;
    }

    /**
     * 获取sat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSat() {
        return sat;
    }

    /**
     * 设置sat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSat(Boolean value) {
        this.sat = value;
    }

    /**
     * 获取sun属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSun() {
        return sun;
    }

    /**
     * 设置sun属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSun(Boolean value) {
        this.sun = value;
    }

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * 获取decimalPlaces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * 设置decimalPlaces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * 获取rateTier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTier() {
        return rateTier;
    }

    /**
     * 设置rateTier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTier(String value) {
        this.rateTier = value;
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
     *       &lt;attribute name="NumberOfBreakfast" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        @XmlAttribute(name = "NumberOfBreakfast")
        protected String numberOfBreakfast;

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

        /**
         * 获取numberOfBreakfast属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfBreakfast() {
            return numberOfBreakfast;
        }

        /**
         * 设置numberOfBreakfast属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfBreakfast(String value) {
            this.numberOfBreakfast = value;
        }

    }

}
