package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RatePlanType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RatePlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="RatePlanDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="RatePlanInclusions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RatePlanInclusionDesciption" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/>
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
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RestrictionStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Restriction">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Master"/>
 *                       &lt;enumeration value="Arrival"/>
 *                       &lt;enumeration value="Departure"/>
 *                       &lt;enumeration value="NonGuarantee"/>
 *                       &lt;enumeration value="TravelAgent"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
 *                 &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAdditionalDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateIndicator" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
 *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MarketCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
 *       &lt;attribute name="ID_RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PriceViewableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="QualificationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantee property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantee().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeType }
     */
    public List<GuaranteeType> getGuarantee() {
        if (guarantee == null) {
            guarantee = new ArrayList<GuaranteeType>();
        }
        return this.guarantee;
    }

    /**
     * ��ȡcancelPenalties���Ե�ֵ��
     *
     * @return possible object is
     * {@link CancelPenaltiesType }
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * ����cancelPenalties���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CancelPenaltiesType }
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * ��ȡratePlanDescription���Ե�ֵ��
     *
     * @return possible object is
     * {@link ParagraphType }
     */
    public ParagraphType getRatePlanDescription() {
        return ratePlanDescription;
    }

    /**
     * ����ratePlanDescription���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ParagraphType }
     */
    public void setRatePlanDescription(ParagraphType value) {
        this.ratePlanDescription = value;
    }

    /**
     * ��ȡratePlanInclusions���Ե�ֵ��
     *
     * @return possible object is
     * {@link RatePlanType.RatePlanInclusions }
     */
    public RatePlanType.RatePlanInclusions getRatePlanInclusions() {
        return ratePlanInclusions;
    }

    /**
     * ����ratePlanInclusions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RatePlanType.RatePlanInclusions }
     */
    public void setRatePlanInclusions(RatePlanType.RatePlanInclusions value) {
        this.ratePlanInclusions = value;
    }

    /**
     * ��ȡcommission���Ե�ֵ��
     *
     * @return possible object is
     * {@link CommissionType }
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * ����commission���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CommissionType }
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * ��ȡmealsIncluded���Ե�ֵ��
     *
     * @return possible object is
     * {@link RatePlanType.MealsIncluded }
     */
    public RatePlanType.MealsIncluded getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * ����mealsIncluded���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RatePlanType.MealsIncluded }
     */
    public void setMealsIncluded(RatePlanType.MealsIncluded value) {
        this.mealsIncluded = value;
    }

    /**
     * ��ȡrestrictionStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link RatePlanType.RestrictionStatus }
     */
    public RatePlanType.RestrictionStatus getRestrictionStatus() {
        return restrictionStatus;
    }

    /**
     * ����restrictionStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RatePlanType.RestrictionStatus }
     */
    public void setRestrictionStatus(RatePlanType.RestrictionStatus value) {
        this.restrictionStatus = value;
    }

    /**
     * ��ȡadditionalDetails���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfAdditionalDetailType }
     */
    public ArrayOfAdditionalDetailType getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * ����additionalDetails���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfAdditionalDetailType }
     */
    public void setAdditionalDetails(ArrayOfAdditionalDetailType value) {
        this.additionalDetails = value;
    }

    /**
     * ��ȡbookingCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * ����bookingCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * ��ȡratePlanCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * ����ratePlanCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * ��ȡeffectiveDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * ����effectiveDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * ��ȡexpireDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * ����expireDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * ��ȡexpireDateExclusiveIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isExpireDateExclusiveIndicator() {
        return expireDateExclusiveIndicator;
    }

    /**
     * ����expireDateExclusiveIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setExpireDateExclusiveIndicator(Boolean value) {
        this.expireDateExclusiveIndicator = value;
    }

    /**
     * ��ȡrateIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link RateIndicatorType }
     */
    public RateIndicatorType getRateIndicator() {
        return rateIndicator;
    }

    /**
     * ����rateIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RateIndicatorType }
     */
    public void setRateIndicator(RateIndicatorType value) {
        this.rateIndicator = value;
    }

    /**
     * ��ȡratePlanType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * ����ratePlanType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * ��ȡratePlanID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanID() {
        return ratePlanID;
    }

    /**
     * ����ratePlanID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanID(String value) {
        this.ratePlanID = value;
    }

    /**
     * ��ȡratePlanName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanName() {
        return ratePlanName;
    }

    /**
     * ����ratePlanName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanName(String value) {
        this.ratePlanName = value;
    }

    /**
     * ��ȡmarketCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * ����marketCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * ��ȡavailabilityStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link RateIndicatorType }
     */
    public RateIndicatorType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * ����availabilityStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RateIndicatorType }
     */
    public void setAvailabilityStatus(RateIndicatorType value) {
        this.availabilityStatus = value;
    }

    /**
     * ��ȡidRequiredInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIDRequiredInd() {
        return idRequiredInd;
    }

    /**
     * ����idRequiredInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIDRequiredInd(Boolean value) {
        this.idRequiredInd = value;
    }

    /**
     * ��ȡpriceViewableInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPriceViewableInd() {
        return priceViewableInd;
    }

    /**
     * ����priceViewableInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPriceViewableInd(Boolean value) {
        this.priceViewableInd = value;
    }

    /**
     * ��ȡqualificationType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getQualificationType() {
        return qualificationType;
    }

    /**
     * ����qualificationType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQualificationType(String value) {
        this.qualificationType = value;
    }

    /**
     * ��ȡavailableQuantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * ����availableQuantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setAvailableQuantity(BigInteger value) {
        this.availableQuantity = value;
    }

    /**
     * ��ȡprepaidIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * ����prepaidIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPrepaidIndicator(Boolean value) {
        this.prepaidIndicator = value;
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
     *       &lt;sequence>
     *         &lt;element name="RatePlanInclusionDesciption" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡratePlanInclusionDesciption���Ե�ֵ��
         *
         * @return possible object is
         * {@link ParagraphType }
         */
        public ParagraphType getRatePlanInclusionDesciption() {
            return ratePlanInclusionDesciption;
        }

        /**
         * ����ratePlanInclusionDesciption���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ParagraphType }
         */
        public void setRatePlanInclusionDesciption(ParagraphType value) {
            this.ratePlanInclusionDesciption = value;
        }

        /**
         * ��ȡtaxInclusive���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isTaxInclusive() {
            return taxInclusive;
        }

        /**
         * ����taxInclusive���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setTaxInclusive(Boolean value) {
            this.taxInclusive = value;
        }

        /**
         * ��ȡserviceFeeInclusive���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isServiceFeeInclusive() {
            return serviceFeeInclusive;
        }

        /**
         * ����serviceFeeInclusive���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setServiceFeeInclusive(Boolean value) {
            this.serviceFeeInclusive = value;
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
     *       &lt;attribute name="Restriction">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Master"/>
     *             &lt;enumeration value="Arrival"/>
     *             &lt;enumeration value="Departure"/>
     *             &lt;enumeration value="NonGuarantee"/>
     *             &lt;enumeration value="TravelAgent"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
     *       &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡrestriction���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRestriction() {
            return restriction;
        }

        /**
         * ����restriction���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRestriction(String value) {
            this.restriction = value;
        }

        /**
         * ��ȡstatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link AvailabilityStatusType }
         */
        public AvailabilityStatusType getStatus() {
            return status;
        }

        /**
         * ����status���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AvailabilityStatusType }
         */
        public void setStatus(AvailabilityStatusType value) {
            this.status = value;
        }

        /**
         * ��ȡsellThroughOpenIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isSellThroughOpenIndicator() {
            return sellThroughOpenIndicator;
        }

        /**
         * ����sellThroughOpenIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setSellThroughOpenIndicator(Boolean value) {
            this.sellThroughOpenIndicator = value;
        }

    }

}
