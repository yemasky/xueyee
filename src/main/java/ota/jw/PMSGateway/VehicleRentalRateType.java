
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


/**
 * <p>VehicleRentalRateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateDistance" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Unlimited" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="DistUnitName" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" /&gt;
 *                 &lt;attribute name="VehiclePeriodUnitName" type="{http://www.opentravel.org/OTA/2003/05}VehiclePeriodUnitNameType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VehicleCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleChargePurposeType" minOccurs="0"/&gt;
 *         &lt;element name="RateQualifier" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateQualifierType"&gt;
 *                 &lt;attribute name="TourInfoRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CustLoyaltyRPH"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RateRestrictions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ArriveByFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MinimumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MaximumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AdvancedBookingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RestrictedMileageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="CorporateRateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="GuaranteeReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MaximumVehiclesAllowed" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="OvernightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="OneWayPolicy"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="OneWayAllowed"/&gt;
 *                       &lt;enumeration value="OneWayNotAllowed"/&gt;
 *                       &lt;enumeration value="RestrictedOneWay"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CancellationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ModificationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="NoShowFeeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RateGuarantee" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="OffsetDropTime"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="BeforeArrival"/&gt;
 *                       &lt;enumeration value="AfterBooking"/&gt;
 *                       &lt;enumeration value="AfterConfirmation"/&gt;
 *                       &lt;enumeration value="AfterArrival"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PickupReturnRule" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RuleType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="EarliestPickup"/&gt;
 *                       &lt;enumeration value="LatestPickup"/&gt;
 *                       &lt;enumeration value="LatestReturn"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NoShowFeeInfo" type="{http://www.opentravel.org/OTA/2003/05}NoShowFeeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalRateType.RateDistance }
     * 
     * 
     */
    public List<VehicleRentalRateType.RateDistance> getRateDistance() {
        if (rateDistance == null) {
            rateDistance = new ArrayList<VehicleRentalRateType.RateDistance>();
        }
        return this.rateDistance;
    }

    /**
     * 获取vehicleCharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleChargePurposeType }
     *     
     */
    public ArrayOfVehicleChargePurposeType getVehicleCharges() {
        return vehicleCharges;
    }

    /**
     * 设置vehicleCharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleChargePurposeType }
     *     
     */
    public void setVehicleCharges(ArrayOfVehicleChargePurposeType value) {
        this.vehicleCharges = value;
    }

    /**
     * 获取rateQualifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateType.RateQualifier }
     *     
     */
    public VehicleRentalRateType.RateQualifier getRateQualifier() {
        return rateQualifier;
    }

    /**
     * 设置rateQualifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateType.RateQualifier }
     *     
     */
    public void setRateQualifier(VehicleRentalRateType.RateQualifier value) {
        this.rateQualifier = value;
    }

    /**
     * 获取rateRestrictions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateType.RateRestrictions }
     *     
     */
    public VehicleRentalRateType.RateRestrictions getRateRestrictions() {
        return rateRestrictions;
    }

    /**
     * 设置rateRestrictions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateType.RateRestrictions }
     *     
     */
    public void setRateRestrictions(VehicleRentalRateType.RateRestrictions value) {
        this.rateRestrictions = value;
    }

    /**
     * 获取rateGuarantee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateType.RateGuarantee }
     *     
     */
    public VehicleRentalRateType.RateGuarantee getRateGuarantee() {
        return rateGuarantee;
    }

    /**
     * 设置rateGuarantee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateType.RateGuarantee }
     *     
     */
    public void setRateGuarantee(VehicleRentalRateType.RateGuarantee value) {
        this.rateGuarantee = value;
    }

    /**
     * Gets the value of the pickupReturnRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickupReturnRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickupReturnRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalRateType.PickupReturnRule }
     * 
     * 
     */
    public List<VehicleRentalRateType.PickupReturnRule> getPickupReturnRule() {
        if (pickupReturnRule == null) {
            pickupReturnRule = new ArrayList<VehicleRentalRateType.PickupReturnRule>();
        }
        return this.pickupReturnRule;
    }

    /**
     * 获取noShowFeeInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NoShowFeeType }
     *     
     */
    public NoShowFeeType getNoShowFeeInfo() {
        return noShowFeeInfo;
    }

    /**
     * 设置noShowFeeInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NoShowFeeType }
     *     
     */
    public void setNoShowFeeInfo(NoShowFeeType value) {
        this.noShowFeeInfo = value;
    }

    /**
     * 获取quoteID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteID() {
        return quoteID;
    }

    /**
     * 设置quoteID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteID(String value) {
        this.quoteID = value;
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
     *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
     *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RuleType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="EarliestPickup"/&gt;
     *             &lt;enumeration value="LatestPickup"/&gt;
     *             &lt;enumeration value="LatestReturn"/&gt;
     *           &lt;/restriction&gt;
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
    public static class PickupReturnRule {

        @XmlAttribute(name = "DayOfWeek")
        protected DayOfWeekType dayOfWeek;
        @XmlAttribute(name = "Time")
        protected String time;
        @XmlAttribute(name = "RuleType")
        protected String ruleType;

        /**
         * 获取dayOfWeek属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDayOfWeek() {
            return dayOfWeek;
        }

        /**
         * 设置dayOfWeek属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDayOfWeek(DayOfWeekType value) {
            this.dayOfWeek = value;
        }

        /**
         * 获取time属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTime() {
            return time;
        }

        /**
         * 设置time属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTime(String value) {
            this.time = value;
        }

        /**
         * 获取ruleType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleType() {
            return ruleType;
        }

        /**
         * 设置ruleType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleType(String value) {
            this.ruleType = value;
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
     *       &lt;attribute name="Unlimited" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="DistUnitName" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" /&gt;
     *       &lt;attribute name="VehiclePeriodUnitName" type="{http://www.opentravel.org/OTA/2003/05}VehiclePeriodUnitNameType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取unlimited属性的值。
         * 
         */
        public boolean isUnlimited() {
            return unlimited;
        }

        /**
         * 设置unlimited属性的值。
         * 
         */
        public void setUnlimited(boolean value) {
            this.unlimited = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * 获取distUnitName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DistanceUnitNameType }
         *     
         */
        public DistanceUnitNameType getDistUnitName() {
            return distUnitName;
        }

        /**
         * 设置distUnitName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DistanceUnitNameType }
         *     
         */
        public void setDistUnitName(DistanceUnitNameType value) {
            this.distUnitName = value;
        }

        /**
         * 获取vehiclePeriodUnitName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VehiclePeriodUnitNameType }
         *     
         */
        public VehiclePeriodUnitNameType getVehiclePeriodUnitName() {
            return vehiclePeriodUnitName;
        }

        /**
         * 设置vehiclePeriodUnitName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VehiclePeriodUnitNameType }
         *     
         */
        public void setVehiclePeriodUnitName(VehiclePeriodUnitNameType value) {
            this.vehiclePeriodUnitName = value;
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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="OffsetDropTime"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="BeforeArrival"/&gt;
     *             &lt;enumeration value="AfterBooking"/&gt;
     *             &lt;enumeration value="AfterConfirmation"/&gt;
     *             &lt;enumeration value="AfterArrival"/&gt;
     *           &lt;/restriction&gt;
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
         * 获取description属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FormattedTextTextType }
         *     
         */
        public FormattedTextTextType getDescription() {
            return description;
        }

        /**
         * 设置description属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FormattedTextTextType }
         *     
         */
        public void setDescription(FormattedTextTextType value) {
            this.description = value;
        }

        /**
         * 获取absoluteDeadline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * 设置absoluteDeadline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * 获取offsetTimeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * 设置offsetTimeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setOffsetTimeUnit(TimeUnitType value) {
            this.offsetTimeUnit = value;
        }

        /**
         * 获取offsetUnitMultiplier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * 设置offsetUnitMultiplier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOffsetUnitMultiplier(BigInteger value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * 获取offsetDropTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * 设置offsetDropTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateQualifierType"&gt;
     *       &lt;attribute name="TourInfoRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CustLoyaltyRPH"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateQualifier
        extends RateQualifierType
    {

        @XmlAttribute(name = "TourInfoRPH")
        protected String tourInfoRPH;
        @XmlAttribute(name = "CustLoyaltyRPH")
        protected List<String> custLoyaltyRPH;
        @XmlAttribute(name = "QuoteID")
        protected String quoteID;

        /**
         * 获取tourInfoRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTourInfoRPH() {
            return tourInfoRPH;
        }

        /**
         * 设置tourInfoRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTourInfoRPH(String value) {
            this.tourInfoRPH = value;
        }

        /**
         * Gets the value of the custLoyaltyRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the custLoyaltyRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustLoyaltyRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCustLoyaltyRPH() {
            if (custLoyaltyRPH == null) {
                custLoyaltyRPH = new ArrayList<String>();
            }
            return this.custLoyaltyRPH;
        }

        /**
         * 获取quoteID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuoteID() {
            return quoteID;
        }

        /**
         * 设置quoteID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuoteID(String value) {
            this.quoteID = value;
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
     *       &lt;attribute name="ArriveByFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MinimumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MaximumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AdvancedBookingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RestrictedMileageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="CorporateRateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="GuaranteeReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MaximumVehiclesAllowed" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="OvernightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="OneWayPolicy"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="OneWayAllowed"/&gt;
     *             &lt;enumeration value="OneWayNotAllowed"/&gt;
     *             &lt;enumeration value="RestrictedOneWay"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CancellationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ModificationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="NoShowFeeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取arriveByFlight属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isArriveByFlight() {
            return arriveByFlight;
        }

        /**
         * 设置arriveByFlight属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setArriveByFlight(Boolean value) {
            this.arriveByFlight = value;
        }

        /**
         * 获取minimumDayInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMinimumDayInd() {
            return minimumDayInd;
        }

        /**
         * 设置minimumDayInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMinimumDayInd(Boolean value) {
            this.minimumDayInd = value;
        }

        /**
         * 获取maximumDayInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMaximumDayInd() {
            return maximumDayInd;
        }

        /**
         * 设置maximumDayInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMaximumDayInd(Boolean value) {
            this.maximumDayInd = value;
        }

        /**
         * 获取advancedBookingInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAdvancedBookingInd() {
            return advancedBookingInd;
        }

        /**
         * 设置advancedBookingInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAdvancedBookingInd(Boolean value) {
            this.advancedBookingInd = value;
        }

        /**
         * 获取restrictedMileageInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRestrictedMileageInd() {
            return restrictedMileageInd;
        }

        /**
         * 设置restrictedMileageInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRestrictedMileageInd(Boolean value) {
            this.restrictedMileageInd = value;
        }

        /**
         * 获取corporateRateInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCorporateRateInd() {
            return corporateRateInd;
        }

        /**
         * 设置corporateRateInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorporateRateInd(Boolean value) {
            this.corporateRateInd = value;
        }

        /**
         * 获取guaranteeReqInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeReqInd() {
            return guaranteeReqInd;
        }

        /**
         * 设置guaranteeReqInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeReqInd(Boolean value) {
            this.guaranteeReqInd = value;
        }

        /**
         * 获取maximumVehiclesAllowed属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumVehiclesAllowed() {
            return maximumVehiclesAllowed;
        }

        /**
         * 设置maximumVehiclesAllowed属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumVehiclesAllowed(BigInteger value) {
            this.maximumVehiclesAllowed = value;
        }

        /**
         * 获取overnightInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOvernightInd() {
            return overnightInd;
        }

        /**
         * 设置overnightInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOvernightInd(Boolean value) {
            this.overnightInd = value;
        }

        /**
         * 获取oneWayPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOneWayPolicy() {
            return oneWayPolicy;
        }

        /**
         * 设置oneWayPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOneWayPolicy(String value) {
            this.oneWayPolicy = value;
        }

        /**
         * 获取cancellationPenaltyInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancellationPenaltyInd() {
            return cancellationPenaltyInd;
        }

        /**
         * 设置cancellationPenaltyInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCancellationPenaltyInd(Boolean value) {
            this.cancellationPenaltyInd = value;
        }

        /**
         * 获取modificationPenaltyInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isModificationPenaltyInd() {
            return modificationPenaltyInd;
        }

        /**
         * 设置modificationPenaltyInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setModificationPenaltyInd(Boolean value) {
            this.modificationPenaltyInd = value;
        }

        /**
         * 获取minimumAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinimumAge() {
            return minimumAge;
        }

        /**
         * 设置minimumAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinimumAge(BigInteger value) {
            this.minimumAge = value;
        }

        /**
         * 获取maximumAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumAge() {
            return maximumAge;
        }

        /**
         * 设置maximumAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumAge(BigInteger value) {
            this.maximumAge = value;
        }

        /**
         * 获取noShowFeeInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoShowFeeInd() {
            return noShowFeeInd;
        }

        /**
         * 设置noShowFeeInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoShowFeeInd(Boolean value) {
            this.noShowFeeInd = value;
        }

    }

}
