package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>AmountType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Base" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *         &lt;element name="AdditionalGuestAmounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalGuestAmount" type="{http://www.opentravel.org/OTA/2003/05}AdditionalGuestAmountType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType1" minOccurs="0"/>
 *         &lt;element name="CancelPolicies" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="PaymentPolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
 *         &lt;element name="Discount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DiscountType">
 *                 &lt;attribute name="AppliesTo">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Base"/>
 *                       &lt;enumeration value="AdditionalGuestAmount"/>
 *                       &lt;enumeration value="Fee"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ItemRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *         &lt;element name="RateDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="AdditionalCharges" type="{http://www.opentravel.org/OTA/2003/05}HotelAdditionalChargesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *       &lt;attribute name="UnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MinGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MaxGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="StayOverDate" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *       &lt;attribute name="AlternateCurrencyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
        "base",
        "additionalGuestAmounts",
        "fees",
        "cancelPolicies",
        "paymentPolicies",
        "discount",
        "total",
        "rateDescription",
        "additionalCharges"
})
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfRateTypeRate.Rate.class
})
public class AmountType {

    @XmlElement(name = "Base")
    protected TotalType base;
    @XmlElement(name = "AdditionalGuestAmounts")
    protected AmountType.AdditionalGuestAmounts additionalGuestAmounts;
    @XmlElement(name = "Fees")
    protected ArrayOfFeeType1 fees;
    @XmlElement(name = "CancelPolicies")
    protected CancelPenaltiesType cancelPolicies;
    @XmlElement(name = "PaymentPolicies")
    protected ArrayOfRequiredPaymentsTypeGuaranteePayment paymentPolicies;
    @XmlElement(name = "Discount")
    protected List<AmountType.Discount> discount;
    @XmlElement(name = "Total")
    protected TotalType total;
    @XmlElement(name = "RateDescription")
    protected ParagraphType rateDescription;
    @XmlElement(name = "AdditionalCharges")
    protected HotelAdditionalChargesType additionalCharges;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "ExpireDateExclusiveIndicator")
    protected Boolean expireDateExclusiveIndicator;
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
    @XmlAttribute(name = "GuaranteedInd")
    protected Boolean guaranteedInd;
    @XmlAttribute(name = "NumberOfUnits")
    protected BigInteger numberOfUnits;
    @XmlAttribute(name = "RateTimeUnit")
    protected TimeUnitType rateTimeUnit;
    @XmlAttribute(name = "UnitMultiplier")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger unitMultiplier;
    @XmlAttribute(name = "MinGuestApplicable")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minGuestApplicable;
    @XmlAttribute(name = "MaxGuestApplicable")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxGuestApplicable;
    @XmlAttribute(name = "MinLOS")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minLOS;
    @XmlAttribute(name = "MaxLOS")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxLOS;
    @XmlAttribute(name = "StayOverDate")
    protected DayOfWeekType stayOverDate;
    @XmlAttribute(name = "AlternateCurrencyInd")
    protected Boolean alternateCurrencyInd;
    @XmlAttribute(name = "ChargeType")
    protected String chargeType;
    @XmlAttribute(name = "QuoteID")
    protected String quoteID;

    /**
     * ��ȡbase���Ե�ֵ��
     *
     * @return possible object is
     * {@link TotalType }
     */
    public TotalType getBase() {
        return base;
    }

    /**
     * ����base���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TotalType }
     */
    public void setBase(TotalType value) {
        this.base = value;
    }

    /**
     * ��ȡadditionalGuestAmounts���Ե�ֵ��
     *
     * @return possible object is
     * {@link AmountType.AdditionalGuestAmounts }
     */
    public AmountType.AdditionalGuestAmounts getAdditionalGuestAmounts() {
        return additionalGuestAmounts;
    }

    /**
     * ����additionalGuestAmounts���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AmountType.AdditionalGuestAmounts }
     */
    public void setAdditionalGuestAmounts(AmountType.AdditionalGuestAmounts value) {
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
     * Gets the value of the discount property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscount().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType.Discount }
     */
    public List<AmountType.Discount> getDiscount() {
        if (discount == null) {
            discount = new ArrayList<AmountType.Discount>();
        }
        return this.discount;
    }

    /**
     * ��ȡtotal���Ե�ֵ��
     *
     * @return possible object is
     * {@link TotalType }
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * ����total���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TotalType }
     */
    public void setTotal(TotalType value) {
        this.total = value;
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
     * ��ȡguaranteedInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * ����guaranteedInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGuaranteedInd(Boolean value) {
        this.guaranteedInd = value;
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
     * ��ȡminLOS���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMinLOS() {
        return minLOS;
    }

    /**
     * ����minLOS���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMinLOS(BigInteger value) {
        this.minLOS = value;
    }

    /**
     * ��ȡmaxLOS���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxLOS() {
        return maxLOS;
    }

    /**
     * ����maxLOS���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxLOS(BigInteger value) {
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
     * ��ȡalternateCurrencyInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAlternateCurrencyInd() {
        return alternateCurrencyInd;
    }

    /**
     * ����alternateCurrencyInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAlternateCurrencyInd(Boolean value) {
        this.alternateCurrencyInd = value;
    }

    /**
     * ��ȡchargeType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * ����chargeType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * ��ȡquoteID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getQuoteID() {
        return quoteID;
    }

    /**
     * ����quoteID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQuoteID(String value) {
        this.quoteID = value;
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
     *         &lt;element name="AdditionalGuestAmount" type="{http://www.opentravel.org/OTA/2003/05}AdditionalGuestAmountType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "additionalGuestAmount"
    })
    public static class AdditionalGuestAmounts {

        @XmlElement(name = "AdditionalGuestAmount")
        protected List<AdditionalGuestAmountType> additionalGuestAmount;
        @XmlAttribute(name = "AmountBeforeTax")
        protected BigDecimal amountBeforeTax;
        @XmlAttribute(name = "AmountAfterTax")
        protected BigDecimal amountAfterTax;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the additionalGuestAmount property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalGuestAmount property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalGuestAmount().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link AdditionalGuestAmountType }
         */
        public List<AdditionalGuestAmountType> getAdditionalGuestAmount() {
            if (additionalGuestAmount == null) {
                additionalGuestAmount = new ArrayList<AdditionalGuestAmountType>();
            }
            return this.additionalGuestAmount;
        }

        /**
         * ��ȡamountBeforeTax���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getAmountBeforeTax() {
            return amountBeforeTax;
        }

        /**
         * ����amountBeforeTax���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setAmountBeforeTax(BigDecimal value) {
            this.amountBeforeTax = value;
        }

        /**
         * ��ȡamountAfterTax���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getAmountAfterTax() {
            return amountAfterTax;
        }

        /**
         * ����amountAfterTax���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setAmountAfterTax(BigDecimal value) {
            this.amountAfterTax = value;
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

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DiscountType">
     *       &lt;attribute name="AppliesTo">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Base"/>
     *             &lt;enumeration value="AdditionalGuestAmount"/>
     *             &lt;enumeration value="Fee"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ItemRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Discount
            extends DiscountType {

        @XmlAttribute(name = "AppliesTo")
        protected String appliesTo;
        @XmlAttribute(name = "ItemRPH")
        protected String itemRPH;

        /**
         * ��ȡappliesTo���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAppliesTo() {
            return appliesTo;
        }

        /**
         * ����appliesTo���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAppliesTo(String value) {
            this.appliesTo = value;
        }

        /**
         * ��ȡitemRPH���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getItemRPH() {
            return itemRPH;
        }

        /**
         * ����itemRPH���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setItemRPH(String value) {
            this.itemRPH = value;
        }

    }

}
