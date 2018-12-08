package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RateUploadType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RateUploadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseByGuestAmts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRateUploadTypeBaseByGuestAmt" minOccurs="0"/>
 *         &lt;element name="AdditionalGuestAmounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRateUploadTypeAdditionalGuestAmount" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType1" minOccurs="0"/>
 *         &lt;element name="GuaranteePolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGuaranteeType" minOccurs="0"/>
 *         &lt;element name="CancelPolicies" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="PaymentPolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
 *         &lt;element name="RateDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="MealsIncluded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MealPlanCodes">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="NumberOfBreakfast" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalCharges" type="{http://www.opentravel.org/OTA/2003/05}HotelAdditionalChargesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *       &lt;attribute name="UnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MinGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MaxGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StayOverDate" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="RateTier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
        "additionalCharges"
})
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfHotelRatePlanTypeRate.Rate.class,
        pms.PMSGateway.ArrayOfRateAmountMessageTypeRate.Rate.class
})
public class RateUploadType {

    @XmlElement(name = "BaseByGuestAmts")
    protected ArrayOfRateUploadTypeBaseByGuestAmt baseByGuestAmts;
    @XmlElement(name = "AdditionalGuestAmounts")
    protected ArrayOfRateUploadTypeAdditionalGuestAmount additionalGuestAmounts;
    @XmlElement(name = "Fees")
    protected ArrayOfFeeType1 fees;
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
     * ��ȡbaseByGuestAmts���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRateUploadTypeBaseByGuestAmt }
     */
    public ArrayOfRateUploadTypeBaseByGuestAmt getBaseByGuestAmts() {
        return baseByGuestAmts;
    }

    /**
     * ����baseByGuestAmts���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRateUploadTypeBaseByGuestAmt }
     */
    public void setBaseByGuestAmts(ArrayOfRateUploadTypeBaseByGuestAmt value) {
        this.baseByGuestAmts = value;
    }

    /**
     * ��ȡadditionalGuestAmounts���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRateUploadTypeAdditionalGuestAmount }
     */
    public ArrayOfRateUploadTypeAdditionalGuestAmount getAdditionalGuestAmounts() {
        return additionalGuestAmounts;
    }

    /**
     * ����additionalGuestAmounts���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRateUploadTypeAdditionalGuestAmount }
     */
    public void setAdditionalGuestAmounts(ArrayOfRateUploadTypeAdditionalGuestAmount value) {
        this.additionalGuestAmounts = value;
    }

    /**
     * ��ȡfees���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfFeeType1 }
     */
    public ArrayOfFeeType1 getFees() {
        return fees;
    }

    /**
     * ����fees���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfFeeType1 }
     */
    public void setFees(ArrayOfFeeType1 value) {
        this.fees = value;
    }

    /**
     * ��ȡguaranteePolicies���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfGuaranteeType }
     */
    public ArrayOfGuaranteeType getGuaranteePolicies() {
        return guaranteePolicies;
    }

    /**
     * ����guaranteePolicies���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfGuaranteeType }
     */
    public void setGuaranteePolicies(ArrayOfGuaranteeType value) {
        this.guaranteePolicies = value;
    }

    /**
     * ��ȡcancelPolicies���Ե�ֵ��
     *
     * @return possible object is
     * {@link CancelPenaltiesType }
     */
    public CancelPenaltiesType getCancelPolicies() {
        return cancelPolicies;
    }

    /**
     * ����cancelPolicies���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CancelPenaltiesType }
     */
    public void setCancelPolicies(CancelPenaltiesType value) {
        this.cancelPolicies = value;
    }

    /**
     * ��ȡpaymentPolicies���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment getPaymentPolicies() {
        return paymentPolicies;
    }

    /**
     * ����paymentPolicies���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     */
    public void setPaymentPolicies(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
        this.paymentPolicies = value;
    }

    /**
     * ��ȡrateDescription���Ե�ֵ��
     *
     * @return possible object is
     * {@link ParagraphType }
     */
    public ParagraphType getRateDescription() {
        return rateDescription;
    }

    /**
     * ����rateDescription���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ParagraphType }
     */
    public void setRateDescription(ParagraphType value) {
        this.rateDescription = value;
    }

    /**
     * ��ȡuniqueID���Ե�ֵ��
     *
     * @return possible object is
     * {@link UniqueIDType }
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * ����uniqueID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link UniqueIDType }
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * ��ȡmealsIncluded���Ե�ֵ��
     *
     * @return possible object is
     * {@link RateUploadType.MealsIncluded }
     */
    public RateUploadType.MealsIncluded getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * ����mealsIncluded���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RateUploadType.MealsIncluded }
     */
    public void setMealsIncluded(RateUploadType.MealsIncluded value) {
        this.mealsIncluded = value;
    }

    /**
     * ��ȡadditionalCharges���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelAdditionalChargesType }
     */
    public HotelAdditionalChargesType getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     * ����additionalCharges���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelAdditionalChargesType }
     */
    public void setAdditionalCharges(HotelAdditionalChargesType value) {
        this.additionalCharges = value;
    }

    /**
     * ��ȡnumberOfUnits���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * ����numberOfUnits���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
    }

    /**
     * ��ȡrateTimeUnit���Ե�ֵ��
     *
     * @return possible object is
     * {@link TimeUnitType }
     */
    public TimeUnitType getRateTimeUnit() {
        return rateTimeUnit;
    }

    /**
     * ����rateTimeUnit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TimeUnitType }
     */
    public void setRateTimeUnit(TimeUnitType value) {
        this.rateTimeUnit = value;
    }

    /**
     * ��ȡunitMultiplier���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * ����unitMultiplier���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setUnitMultiplier(BigInteger value) {
        this.unitMultiplier = value;
    }

    /**
     * ��ȡminGuestApplicable���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMinGuestApplicable() {
        return minGuestApplicable;
    }

    /**
     * ����minGuestApplicable���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMinGuestApplicable(BigInteger value) {
        this.minGuestApplicable = value;
    }

    /**
     * ��ȡmaxGuestApplicable���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxGuestApplicable() {
        return maxGuestApplicable;
    }

    /**
     * ����maxGuestApplicable���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxGuestApplicable(BigInteger value) {
        this.maxGuestApplicable = value;
    }

    /**
     * ��ȡageQualifyingCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * ����ageQualifyingCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAgeQualifyingCode(String value) {
        this.ageQualifyingCode = value;
    }

    /**
     * ��ȡminAge���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMinAge() {
        return minAge;
    }

    /**
     * ����minAge���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMinAge(BigInteger value) {
        this.minAge = value;
    }

    /**
     * ��ȡmaxAge���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxAge() {
        return maxAge;
    }

    /**
     * ����maxAge���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxAge(BigInteger value) {
        this.maxAge = value;
    }

    /**
     * ��ȡageTimeUnit���Ե�ֵ��
     *
     * @return possible object is
     * {@link TimeUnitType }
     */
    public TimeUnitType getAgeTimeUnit() {
        return ageTimeUnit;
    }

    /**
     * ����ageTimeUnit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TimeUnitType }
     */
    public void setAgeTimeUnit(TimeUnitType value) {
        this.ageTimeUnit = value;
    }

    /**
     * ��ȡageBucket���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAgeBucket() {
        return ageBucket;
    }

    /**
     * ����ageBucket���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAgeBucket(String value) {
        this.ageBucket = value;
    }

    /**
     * ��ȡminLOS���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMinLOS() {
        return minLOS;
    }

    /**
     * ����minLOS���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMinLOS(String value) {
        this.minLOS = value;
    }

    /**
     * ��ȡmaxLOS���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaxLOS() {
        return maxLOS;
    }

    /**
     * ����maxLOS���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaxLOS(String value) {
        this.maxLOS = value;
    }

    /**
     * ��ȡstayOverDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link DayOfWeekType }
     */
    public DayOfWeekType getStayOverDate() {
        return stayOverDate;
    }

    /**
     * ����stayOverDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DayOfWeekType }
     */
    public void setStayOverDate(DayOfWeekType value) {
        this.stayOverDate = value;
    }

    /**
     * ��ȡstart���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStart() {
        return start;
    }

    /**
     * ����start���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * ��ȡduration���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDuration() {
        return duration;
    }

    /**
     * ����duration���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * ��ȡend���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEnd() {
        return end;
    }

    /**
     * ����end���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * ��ȡmon���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMon() {
        return mon;
    }

    /**
     * ����mon���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMon(Boolean value) {
        this.mon = value;
    }

    /**
     * ��ȡtue���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTue() {
        return tue;
    }

    /**
     * ����tue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTue(Boolean value) {
        this.tue = value;
    }

    /**
     * ��ȡweds���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isWeds() {
        return weds;
    }

    /**
     * ����weds���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setWeds(Boolean value) {
        this.weds = value;
    }

    /**
     * ��ȡthur���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isThur() {
        return thur;
    }

    /**
     * ����thur���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setThur(Boolean value) {
        this.thur = value;
    }

    /**
     * ��ȡfri���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isFri() {
        return fri;
    }

    /**
     * ����fri���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setFri(Boolean value) {
        this.fri = value;
    }

    /**
     * ��ȡsat���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSat() {
        return sat;
    }

    /**
     * ����sat���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSat(Boolean value) {
        this.sat = value;
    }

    /**
     * ��ȡsun���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSun() {
        return sun;
    }

    /**
     * ����sun���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSun(Boolean value) {
        this.sun = value;
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
     * ��ȡdecimalPlaces���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * ����decimalPlaces���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * ��ȡrateTier���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRateTier() {
        return rateTier;
    }

    /**
     * ����rateTier���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRateTier(String value) {
        this.rateTier = value;
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
     *       &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MealPlanCodes">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="NumberOfBreakfast" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡbreakfast���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isBreakfast() {
            return breakfast;
        }

        /**
         * ����breakfast���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setBreakfast(Boolean value) {
            this.breakfast = value;
        }

        /**
         * ��ȡlunch���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isLunch() {
            return lunch;
        }

        /**
         * ����lunch���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setLunch(Boolean value) {
            this.lunch = value;
        }

        /**
         * ��ȡdinner���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isDinner() {
            return dinner;
        }

        /**
         * ����dinner���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setDinner(Boolean value) {
            this.dinner = value;
        }

        /**
         * ��ȡmealPlanIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isMealPlanIndicator() {
            return mealPlanIndicator;
        }

        /**
         * ����mealPlanIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setMealPlanIndicator(Boolean value) {
            this.mealPlanIndicator = value;
        }

        /**
         * Gets the value of the mealPlanCodes property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mealPlanCodes property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMealPlanCodes().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getMealPlanCodes() {
            if (mealPlanCodes == null) {
                mealPlanCodes = new ArrayList<String>();
            }
            return this.mealPlanCodes;
        }

        /**
         * ��ȡnumberOfBreakfast���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getNumberOfBreakfast() {
            return numberOfBreakfast;
        }

        /**
         * ����numberOfBreakfast���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNumberOfBreakfast(String value) {
            this.numberOfBreakfast = value;
        }

    }

}
