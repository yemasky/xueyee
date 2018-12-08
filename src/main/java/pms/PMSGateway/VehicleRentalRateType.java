package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>VehicleRentalRateType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleRentalRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateDistance" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Unlimited" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="DistUnitName" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
 *                 &lt;attribute name="VehiclePeriodUnitName" type="{http://www.opentravel.org/OTA/2003/05}VehiclePeriodUnitNameType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleChargePurposeType" minOccurs="0"/>
 *         &lt;element name="RateQualifier" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateQualifierType">
 *                 &lt;attribute name="TourInfoRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CustLoyaltyRPH">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RateRestrictions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ArriveByFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MinimumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MaximumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AdvancedBookingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RestrictedMileageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CorporateRateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GuaranteeReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MaximumVehiclesAllowed" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="OvernightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="OneWayPolicy">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="OneWayAllowed"/>
 *                       &lt;enumeration value="OneWayNotAllowed"/>
 *                       &lt;enumeration value="RestrictedOneWay"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="CancellationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ModificationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="NoShowFeeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RateGuarantee" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="OffsetDropTime">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="BeforeArrival"/>
 *                       &lt;enumeration value="AfterBooking"/>
 *                       &lt;enumeration value="AfterConfirmation"/>
 *                       &lt;enumeration value="AfterArrival"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PickupReturnRule" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RuleType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="EarliestPickup"/>
 *                       &lt;enumeration value="LatestPickup"/>
 *                       &lt;enumeration value="LatestReturn"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NoShowFeeInfo" type="{http://www.opentravel.org/OTA/2003/05}NoShowFeeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalRateType", propOrder = {
        "rateDistance",
        "vehicleCharges",
        "rateQualifier",
        "rateRestrictions",
        "rateGuarantee",
        "pickupReturnRule",
        "noShowFeeInfo"
})
public class VehicleRentalRateType {

    @XmlElement(name = "RateDistance")
    protected List<VehicleRentalRateType.RateDistance> rateDistance;
    @XmlElement(name = "VehicleCharges")
    protected ArrayOfVehicleChargePurposeType vehicleCharges;
    @XmlElement(name = "RateQualifier")
    protected VehicleRentalRateType.RateQualifier rateQualifier;
    @XmlElement(name = "RateRestrictions")
    protected VehicleRentalRateType.RateRestrictions rateRestrictions;
    @XmlElement(name = "RateGuarantee")
    protected VehicleRentalRateType.RateGuarantee rateGuarantee;
    @XmlElement(name = "PickupReturnRule")
    protected List<VehicleRentalRateType.PickupReturnRule> pickupReturnRule;
    @XmlElement(name = "NoShowFeeInfo")
    protected NoShowFeeType noShowFeeInfo;
    @XmlAttribute(name = "QuoteID")
    protected String quoteID;

    /**
     * Gets the value of the rateDistance property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateDistance property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateDistance().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalRateType.RateDistance }
     */
    public List<VehicleRentalRateType.RateDistance> getRateDistance() {
        if (rateDistance == null) {
            rateDistance = new ArrayList<VehicleRentalRateType.RateDistance>();
        }
        return this.rateDistance;
    }

    /**
     * ��ȡvehicleCharges���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfVehicleChargePurposeType }
     */
    public ArrayOfVehicleChargePurposeType getVehicleCharges() {
        return vehicleCharges;
    }

    /**
     * ����vehicleCharges���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfVehicleChargePurposeType }
     */
    public void setVehicleCharges(ArrayOfVehicleChargePurposeType value) {
        this.vehicleCharges = value;
    }

    /**
     * ��ȡrateQualifier���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleRentalRateType.RateQualifier }
     */
    public VehicleRentalRateType.RateQualifier getRateQualifier() {
        return rateQualifier;
    }

    /**
     * ����rateQualifier���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleRentalRateType.RateQualifier }
     */
    public void setRateQualifier(VehicleRentalRateType.RateQualifier value) {
        this.rateQualifier = value;
    }

    /**
     * ��ȡrateRestrictions���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleRentalRateType.RateRestrictions }
     */
    public VehicleRentalRateType.RateRestrictions getRateRestrictions() {
        return rateRestrictions;
    }

    /**
     * ����rateRestrictions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleRentalRateType.RateRestrictions }
     */
    public void setRateRestrictions(VehicleRentalRateType.RateRestrictions value) {
        this.rateRestrictions = value;
    }

    /**
     * ��ȡrateGuarantee���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleRentalRateType.RateGuarantee }
     */
    public VehicleRentalRateType.RateGuarantee getRateGuarantee() {
        return rateGuarantee;
    }

    /**
     * ����rateGuarantee���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleRentalRateType.RateGuarantee }
     */
    public void setRateGuarantee(VehicleRentalRateType.RateGuarantee value) {
        this.rateGuarantee = value;
    }

    /**
     * Gets the value of the pickupReturnRule property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickupReturnRule property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickupReturnRule().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalRateType.PickupReturnRule }
     */
    public List<VehicleRentalRateType.PickupReturnRule> getPickupReturnRule() {
        if (pickupReturnRule == null) {
            pickupReturnRule = new ArrayList<VehicleRentalRateType.PickupReturnRule>();
        }
        return this.pickupReturnRule;
    }

    /**
     * ��ȡnoShowFeeInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link NoShowFeeType }
     */
    public NoShowFeeType getNoShowFeeInfo() {
        return noShowFeeInfo;
    }

    /**
     * ����noShowFeeInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link NoShowFeeType }
     */
    public void setNoShowFeeInfo(NoShowFeeType value) {
        this.noShowFeeInfo = value;
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
     *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RuleType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="EarliestPickup"/>
     *             &lt;enumeration value="LatestPickup"/>
     *             &lt;enumeration value="LatestReturn"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PickupReturnRule {

        @XmlAttribute(name = "DayOfWeek")
        protected DayOfWeekType dayOfWeek;
        @XmlAttribute(name = "Time")
        protected String time;
        @XmlAttribute(name = "RuleType")
        protected String ruleType;

        /**
         * ��ȡdayOfWeek���Ե�ֵ��
         *
         * @return possible object is
         * {@link DayOfWeekType }
         */
        public DayOfWeekType getDayOfWeek() {
            return dayOfWeek;
        }

        /**
         * ����dayOfWeek���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DayOfWeekType }
         */
        public void setDayOfWeek(DayOfWeekType value) {
            this.dayOfWeek = value;
        }

        /**
         * ��ȡtime���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTime() {
            return time;
        }

        /**
         * ����time���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTime(String value) {
            this.time = value;
        }

        /**
         * ��ȡruleType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRuleType() {
            return ruleType;
        }

        /**
         * ����ruleType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRuleType(String value) {
            this.ruleType = value;
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
     *       &lt;attribute name="Unlimited" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="DistUnitName" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
     *       &lt;attribute name="VehiclePeriodUnitName" type="{http://www.opentravel.org/OTA/2003/05}VehiclePeriodUnitNameType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateDistance {

        @XmlAttribute(name = "Unlimited", required = true)
        protected boolean unlimited;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "DistUnitName")
        protected DistanceUnitNameType distUnitName;
        @XmlAttribute(name = "VehiclePeriodUnitName")
        protected VehiclePeriodUnitNameType vehiclePeriodUnitName;

        /**
         * ��ȡunlimited���Ե�ֵ��
         */
        public boolean isUnlimited() {
            return unlimited;
        }

        /**
         * ����unlimited���Ե�ֵ��
         */
        public void setUnlimited(boolean value) {
            this.unlimited = value;
        }

        /**
         * ��ȡquantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * ����quantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * ��ȡdistUnitName���Ե�ֵ��
         *
         * @return possible object is
         * {@link DistanceUnitNameType }
         */
        public DistanceUnitNameType getDistUnitName() {
            return distUnitName;
        }

        /**
         * ����distUnitName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DistanceUnitNameType }
         */
        public void setDistUnitName(DistanceUnitNameType value) {
            this.distUnitName = value;
        }

        /**
         * ��ȡvehiclePeriodUnitName���Ե�ֵ��
         *
         * @return possible object is
         * {@link VehiclePeriodUnitNameType }
         */
        public VehiclePeriodUnitNameType getVehiclePeriodUnitName() {
            return vehiclePeriodUnitName;
        }

        /**
         * ����vehiclePeriodUnitName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link VehiclePeriodUnitNameType }
         */
        public void setVehiclePeriodUnitName(VehiclePeriodUnitNameType value) {
            this.vehiclePeriodUnitName = value;
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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="OffsetDropTime">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="BeforeArrival"/>
     *             &lt;enumeration value="AfterBooking"/>
     *             &lt;enumeration value="AfterConfirmation"/>
     *             &lt;enumeration value="AfterArrival"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "description"
    })
    public static class RateGuarantee {

        @XmlElement(name = "Description")
        protected FormattedTextTextType description;
        @XmlAttribute(name = "AbsoluteDeadline")
        protected String absoluteDeadline;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected TimeUnitType offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected BigInteger offsetUnitMultiplier;
        @XmlAttribute(name = "OffsetDropTime")
        protected String offsetDropTime;

        /**
         * ��ȡdescription���Ե�ֵ��
         *
         * @return possible object is
         * {@link FormattedTextTextType }
         */
        public FormattedTextTextType getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link FormattedTextTextType }
         */
        public void setDescription(FormattedTextTextType value) {
            this.description = value;
        }

        /**
         * ��ȡabsoluteDeadline���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * ����absoluteDeadline���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * ��ȡoffsetTimeUnit���Ե�ֵ��
         *
         * @return possible object is
         * {@link TimeUnitType }
         */
        public TimeUnitType getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * ����offsetTimeUnit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TimeUnitType }
         */
        public void setOffsetTimeUnit(TimeUnitType value) {
            this.offsetTimeUnit = value;
        }

        /**
         * ��ȡoffsetUnitMultiplier���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * ����offsetUnitMultiplier���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setOffsetUnitMultiplier(BigInteger value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * ��ȡoffsetDropTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * ����offsetDropTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateQualifierType">
     *       &lt;attribute name="TourInfoRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CustLoyaltyRPH">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateQualifier
            extends RateQualifierType {

        @XmlAttribute(name = "TourInfoRPH")
        protected String tourInfoRPH;
        @XmlAttribute(name = "CustLoyaltyRPH")
        protected List<String> custLoyaltyRPH;
        @XmlAttribute(name = "QuoteID")
        protected String quoteID;

        /**
         * ��ȡtourInfoRPH���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTourInfoRPH() {
            return tourInfoRPH;
        }

        /**
         * ����tourInfoRPH���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTourInfoRPH(String value) {
            this.tourInfoRPH = value;
        }

        /**
         * Gets the value of the custLoyaltyRPH property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the custLoyaltyRPH property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustLoyaltyRPH().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getCustLoyaltyRPH() {
            if (custLoyaltyRPH == null) {
                custLoyaltyRPH = new ArrayList<String>();
            }
            return this.custLoyaltyRPH;
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
     *       &lt;attribute name="ArriveByFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MinimumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MaximumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AdvancedBookingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RestrictedMileageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CorporateRateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GuaranteeReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MaximumVehiclesAllowed" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="OvernightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="OneWayPolicy">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="OneWayAllowed"/>
     *             &lt;enumeration value="OneWayNotAllowed"/>
     *             &lt;enumeration value="RestrictedOneWay"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="CancellationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ModificationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="NoShowFeeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateRestrictions {

        @XmlAttribute(name = "ArriveByFlight")
        protected Boolean arriveByFlight;
        @XmlAttribute(name = "MinimumDayInd")
        protected Boolean minimumDayInd;
        @XmlAttribute(name = "MaximumDayInd")
        protected Boolean maximumDayInd;
        @XmlAttribute(name = "AdvancedBookingInd")
        protected Boolean advancedBookingInd;
        @XmlAttribute(name = "RestrictedMileageInd")
        protected Boolean restrictedMileageInd;
        @XmlAttribute(name = "CorporateRateInd")
        protected Boolean corporateRateInd;
        @XmlAttribute(name = "GuaranteeReqInd")
        protected Boolean guaranteeReqInd;
        @XmlAttribute(name = "MaximumVehiclesAllowed")
        protected BigInteger maximumVehiclesAllowed;
        @XmlAttribute(name = "OvernightInd")
        protected Boolean overnightInd;
        @XmlAttribute(name = "OneWayPolicy")
        protected String oneWayPolicy;
        @XmlAttribute(name = "CancellationPenaltyInd")
        protected Boolean cancellationPenaltyInd;
        @XmlAttribute(name = "ModificationPenaltyInd")
        protected Boolean modificationPenaltyInd;
        @XmlAttribute(name = "MinimumAge")
        protected BigInteger minimumAge;
        @XmlAttribute(name = "MaximumAge")
        protected BigInteger maximumAge;
        @XmlAttribute(name = "NoShowFeeInd")
        protected Boolean noShowFeeInd;

        /**
         * ��ȡarriveByFlight���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isArriveByFlight() {
            return arriveByFlight;
        }

        /**
         * ����arriveByFlight���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setArriveByFlight(Boolean value) {
            this.arriveByFlight = value;
        }

        /**
         * ��ȡminimumDayInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isMinimumDayInd() {
            return minimumDayInd;
        }

        /**
         * ����minimumDayInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setMinimumDayInd(Boolean value) {
            this.minimumDayInd = value;
        }

        /**
         * ��ȡmaximumDayInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isMaximumDayInd() {
            return maximumDayInd;
        }

        /**
         * ����maximumDayInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setMaximumDayInd(Boolean value) {
            this.maximumDayInd = value;
        }

        /**
         * ��ȡadvancedBookingInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isAdvancedBookingInd() {
            return advancedBookingInd;
        }

        /**
         * ����advancedBookingInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setAdvancedBookingInd(Boolean value) {
            this.advancedBookingInd = value;
        }

        /**
         * ��ȡrestrictedMileageInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isRestrictedMileageInd() {
            return restrictedMileageInd;
        }

        /**
         * ����restrictedMileageInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setRestrictedMileageInd(Boolean value) {
            this.restrictedMileageInd = value;
        }

        /**
         * ��ȡcorporateRateInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isCorporateRateInd() {
            return corporateRateInd;
        }

        /**
         * ����corporateRateInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setCorporateRateInd(Boolean value) {
            this.corporateRateInd = value;
        }

        /**
         * ��ȡguaranteeReqInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isGuaranteeReqInd() {
            return guaranteeReqInd;
        }

        /**
         * ����guaranteeReqInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setGuaranteeReqInd(Boolean value) {
            this.guaranteeReqInd = value;
        }

        /**
         * ��ȡmaximumVehiclesAllowed���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaximumVehiclesAllowed() {
            return maximumVehiclesAllowed;
        }

        /**
         * ����maximumVehiclesAllowed���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaximumVehiclesAllowed(BigInteger value) {
            this.maximumVehiclesAllowed = value;
        }

        /**
         * ��ȡovernightInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isOvernightInd() {
            return overnightInd;
        }

        /**
         * ����overnightInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setOvernightInd(Boolean value) {
            this.overnightInd = value;
        }

        /**
         * ��ȡoneWayPolicy���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOneWayPolicy() {
            return oneWayPolicy;
        }

        /**
         * ����oneWayPolicy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOneWayPolicy(String value) {
            this.oneWayPolicy = value;
        }

        /**
         * ��ȡcancellationPenaltyInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isCancellationPenaltyInd() {
            return cancellationPenaltyInd;
        }

        /**
         * ����cancellationPenaltyInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setCancellationPenaltyInd(Boolean value) {
            this.cancellationPenaltyInd = value;
        }

        /**
         * ��ȡmodificationPenaltyInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isModificationPenaltyInd() {
            return modificationPenaltyInd;
        }

        /**
         * ����modificationPenaltyInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setModificationPenaltyInd(Boolean value) {
            this.modificationPenaltyInd = value;
        }

        /**
         * ��ȡminimumAge���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMinimumAge() {
            return minimumAge;
        }

        /**
         * ����minimumAge���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMinimumAge(BigInteger value) {
            this.minimumAge = value;
        }

        /**
         * ��ȡmaximumAge���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaximumAge() {
            return maximumAge;
        }

        /**
         * ����maximumAge���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaximumAge(BigInteger value) {
            this.maximumAge = value;
        }

        /**
         * ��ȡnoShowFeeInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isNoShowFeeInd() {
            return noShowFeeInd;
        }

        /**
         * ����noShowFeeInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setNoShowFeeInd(Boolean value) {
            this.noShowFeeInd = value;
        }

    }

}
