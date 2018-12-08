
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
import javax.xml.datatype.Duration;


/**
 * <p>ArrayOfBookingRulesTypeBookingRule complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBookingRulesTypeBookingRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingRule" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AcceptableGuarantees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee" minOccurs="0"/&gt;
 *                   &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/&gt;
 *                   &lt;element name="RequiredPaymts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/&gt;
 *                   &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/&gt;
 *                   &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/&gt;
 *                   &lt;element name="RestrictionStatus" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Restriction"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="Master"/&gt;
 *                                 &lt;enumeration value="Arrival"/&gt;
 *                                 &lt;enumeration value="Departure"/&gt;
 *                                 &lt;enumeration value="NonGuarantee"/&gt;
 *                                 &lt;enumeration value="TravelAgent"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
 *                           &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Viewerships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewership" minOccurs="0"/&gt;
 *                   &lt;element name="AddtionalRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAdditionalRule" minOccurs="0"/&gt;
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *                   &lt;element name="CheckoutCharge" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="Type"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="Early"/&gt;
 *                                 &lt;enumeration value="Late"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                 &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                 &lt;attribute name="ForceGuaranteeOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                 &lt;attribute name="DepositWaiverOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                 &lt;attribute name="MinTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="MaxTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="AbsoluteDropTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="GenerallyBookable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="PriceViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="QualifiedRateYN" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                 &lt;attribute name="OffsetCalculationMode"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="BeforeBlockStartDate"/&gt;
 *                       &lt;enumeration value="AfterBlockCreation"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="MaxContiguousBookings" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
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
@XmlType(name = "ArrayOfBookingRulesTypeBookingRule", propOrder = {
    "bookingRule"
})
public class ArrayOfBookingRulesTypeBookingRule {

    @XmlElement(name = "BookingRule")
    protected List<ArrayOfBookingRulesTypeBookingRule.BookingRule> bookingRule;

    /**
     * Gets the value of the bookingRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfBookingRulesTypeBookingRule.BookingRule }
     * 
     * 
     */
    public List<ArrayOfBookingRulesTypeBookingRule.BookingRule> getBookingRule() {
        if (bookingRule == null) {
            bookingRule = new ArrayList<ArrayOfBookingRulesTypeBookingRule.BookingRule>();
        }
        return this.bookingRule;
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
     *         &lt;element name="AcceptableGuarantees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee" minOccurs="0"/&gt;
     *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/&gt;
     *         &lt;element name="RequiredPaymts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/&gt;
     *         &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/&gt;
     *         &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/&gt;
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
     *         &lt;element name="Viewerships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewership" minOccurs="0"/&gt;
     *         &lt;element name="AddtionalRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAdditionalRule" minOccurs="0"/&gt;
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
     *         &lt;element name="CheckoutCharge" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="Type"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="Early"/&gt;
     *                       &lt;enumeration value="Late"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *       &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *       &lt;attribute name="ForceGuaranteeOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *       &lt;attribute name="DepositWaiverOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *       &lt;attribute name="MinTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="MaxTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="AbsoluteDropTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="GenerallyBookable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="PriceViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="QualifiedRateYN" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *       &lt;attribute name="OffsetCalculationMode"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="BeforeBlockStartDate"/&gt;
     *             &lt;enumeration value="AfterBlockCreation"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="MaxContiguousBookings" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acceptableGuarantees",
        "cancelPenalties",
        "requiredPaymts",
        "lengthsOfStay",
        "dowRestrictions",
        "restrictionStatus",
        "viewerships",
        "addtionalRules",
        "description",
        "uniqueID",
        "checkoutCharge"
    })
    public static class BookingRule {

        @XmlElement(name = "AcceptableGuarantees")
        protected ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee acceptableGuarantees;
        @XmlElement(name = "CancelPenalties")
        protected CancelPenaltiesType cancelPenalties;
        @XmlElement(name = "RequiredPaymts")
        protected ArrayOfRequiredPaymentsTypeGuaranteePayment requiredPaymts;
        @XmlElement(name = "LengthsOfStay")
        protected LengthsOfStayType lengthsOfStay;
        @XmlElement(name = "DOW_Restrictions")
        protected DOWRestrictionsType dowRestrictions;
        @XmlElement(name = "RestrictionStatus")
        protected ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus restrictionStatus;
        @XmlElement(name = "Viewerships")
        protected ArrayOfViewershipsTypeViewership viewerships;
        @XmlElement(name = "AddtionalRules")
        protected ArrayOfBookingRulesTypeBookingRuleAdditionalRule addtionalRules;
        @XmlElement(name = "Description")
        protected List<ParagraphType> description;
        @XmlElement(name = "UniqueID")
        protected UniqueIDType uniqueID;
        @XmlElement(name = "CheckoutCharge")
        protected List<ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge> checkoutCharge;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "MaxAdvancedBookingOffset")
        protected Duration maxAdvancedBookingOffset;
        @XmlAttribute(name = "MinAdvancedBookingOffset")
        protected Duration minAdvancedBookingOffset;
        @XmlAttribute(name = "ForceGuaranteeOffset")
        protected Duration forceGuaranteeOffset;
        @XmlAttribute(name = "DepositWaiverOffset")
        protected Duration depositWaiverOffset;
        @XmlAttribute(name = "MinTotalOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minTotalOccupancy;
        @XmlAttribute(name = "MaxTotalOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxTotalOccupancy;
        @XmlAttribute(name = "AbsoluteDropTime")
        protected String absoluteDropTime;
        @XmlAttribute(name = "GenerallyBookable")
        protected Boolean generallyBookable;
        @XmlAttribute(name = "PriceViewable")
        protected Boolean priceViewable;
        @XmlAttribute(name = "QualifiedRateYN")
        protected Boolean qualifiedRateYN;
        @XmlAttribute(name = "AddressRequired")
        protected Boolean addressRequired;
        @XmlAttribute(name = "AbsoluteCutoff")
        protected String absoluteCutoff;
        @XmlAttribute(name = "OffsetDuration")
        protected Duration offsetDuration;
        @XmlAttribute(name = "OffsetCalculationMode")
        protected String offsetCalculationMode;
        @XmlAttribute(name = "MaxContiguousBookings")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxContiguousBookings;

        /**
         * 获取acceptableGuarantees属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee }
         *     
         */
        public ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee getAcceptableGuarantees() {
            return acceptableGuarantees;
        }

        /**
         * 设置acceptableGuarantees属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee }
         *     
         */
        public void setAcceptableGuarantees(ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee value) {
            this.acceptableGuarantees = value;
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
         * 获取requiredPaymts属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
         *     
         */
        public ArrayOfRequiredPaymentsTypeGuaranteePayment getRequiredPaymts() {
            return requiredPaymts;
        }

        /**
         * 设置requiredPaymts属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
         *     
         */
        public void setRequiredPaymts(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
            this.requiredPaymts = value;
        }

        /**
         * 获取lengthsOfStay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LengthsOfStayType }
         *     
         */
        public LengthsOfStayType getLengthsOfStay() {
            return lengthsOfStay;
        }

        /**
         * 设置lengthsOfStay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LengthsOfStayType }
         *     
         */
        public void setLengthsOfStay(LengthsOfStayType value) {
            this.lengthsOfStay = value;
        }

        /**
         * 获取dowRestrictions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DOWRestrictionsType }
         *     
         */
        public DOWRestrictionsType getDOWRestrictions() {
            return dowRestrictions;
        }

        /**
         * 设置dowRestrictions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DOWRestrictionsType }
         *     
         */
        public void setDOWRestrictions(DOWRestrictionsType value) {
            this.dowRestrictions = value;
        }

        /**
         * 获取restrictionStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus }
         *     
         */
        public ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus getRestrictionStatus() {
            return restrictionStatus;
        }

        /**
         * 设置restrictionStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus }
         *     
         */
        public void setRestrictionStatus(ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus value) {
            this.restrictionStatus = value;
        }

        /**
         * 获取viewerships属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewership }
         *     
         */
        public ArrayOfViewershipsTypeViewership getViewerships() {
            return viewerships;
        }

        /**
         * 设置viewerships属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewership }
         *     
         */
        public void setViewerships(ArrayOfViewershipsTypeViewership value) {
            this.viewerships = value;
        }

        /**
         * 获取addtionalRules属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule }
         *     
         */
        public ArrayOfBookingRulesTypeBookingRuleAdditionalRule getAddtionalRules() {
            return addtionalRules;
        }

        /**
         * 设置addtionalRules属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule }
         *     
         */
        public void setAddtionalRules(ArrayOfBookingRulesTypeBookingRuleAdditionalRule value) {
            this.addtionalRules = value;
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
         * Gets the value of the checkoutCharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkoutCharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckoutCharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge }
         * 
         * 
         */
        public List<ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge> getCheckoutCharge() {
            if (checkoutCharge == null) {
                checkoutCharge = new ArrayList<ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge>();
            }
            return this.checkoutCharge;
        }

        /**
         * 获取uri属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * 设置uri属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
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
         * 获取maxAdvancedBookingOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaxAdvancedBookingOffset() {
            return maxAdvancedBookingOffset;
        }

        /**
         * 设置maxAdvancedBookingOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaxAdvancedBookingOffset(Duration value) {
            this.maxAdvancedBookingOffset = value;
        }

        /**
         * 获取minAdvancedBookingOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMinAdvancedBookingOffset() {
            return minAdvancedBookingOffset;
        }

        /**
         * 设置minAdvancedBookingOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMinAdvancedBookingOffset(Duration value) {
            this.minAdvancedBookingOffset = value;
        }

        /**
         * 获取forceGuaranteeOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getForceGuaranteeOffset() {
            return forceGuaranteeOffset;
        }

        /**
         * 设置forceGuaranteeOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setForceGuaranteeOffset(Duration value) {
            this.forceGuaranteeOffset = value;
        }

        /**
         * 获取depositWaiverOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDepositWaiverOffset() {
            return depositWaiverOffset;
        }

        /**
         * 设置depositWaiverOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDepositWaiverOffset(Duration value) {
            this.depositWaiverOffset = value;
        }

        /**
         * 获取minTotalOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinTotalOccupancy() {
            return minTotalOccupancy;
        }

        /**
         * 设置minTotalOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinTotalOccupancy(BigInteger value) {
            this.minTotalOccupancy = value;
        }

        /**
         * 获取maxTotalOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxTotalOccupancy() {
            return maxTotalOccupancy;
        }

        /**
         * 设置maxTotalOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxTotalOccupancy(BigInteger value) {
            this.maxTotalOccupancy = value;
        }

        /**
         * 获取absoluteDropTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteDropTime() {
            return absoluteDropTime;
        }

        /**
         * 设置absoluteDropTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteDropTime(String value) {
            this.absoluteDropTime = value;
        }

        /**
         * 获取generallyBookable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGenerallyBookable() {
            return generallyBookable;
        }

        /**
         * 设置generallyBookable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGenerallyBookable(Boolean value) {
            this.generallyBookable = value;
        }

        /**
         * 获取priceViewable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPriceViewable() {
            return priceViewable;
        }

        /**
         * 设置priceViewable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPriceViewable(Boolean value) {
            this.priceViewable = value;
        }

        /**
         * 获取qualifiedRateYN属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isQualifiedRateYN() {
            return qualifiedRateYN;
        }

        /**
         * 设置qualifiedRateYN属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setQualifiedRateYN(Boolean value) {
            this.qualifiedRateYN = value;
        }

        /**
         * 获取addressRequired属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAddressRequired() {
            return addressRequired;
        }

        /**
         * 设置addressRequired属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAddressRequired(Boolean value) {
            this.addressRequired = value;
        }

        /**
         * 获取absoluteCutoff属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteCutoff() {
            return absoluteCutoff;
        }

        /**
         * 设置absoluteCutoff属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteCutoff(String value) {
            this.absoluteCutoff = value;
        }

        /**
         * 获取offsetDuration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getOffsetDuration() {
            return offsetDuration;
        }

        /**
         * 设置offsetDuration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setOffsetDuration(Duration value) {
            this.offsetDuration = value;
        }

        /**
         * 获取offsetCalculationMode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetCalculationMode() {
            return offsetCalculationMode;
        }

        /**
         * 设置offsetCalculationMode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetCalculationMode(String value) {
            this.offsetCalculationMode = value;
        }

        /**
         * 获取maxContiguousBookings属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxContiguousBookings() {
            return maxContiguousBookings;
        }

        /**
         * 设置maxContiguousBookings属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxContiguousBookings(BigInteger value) {
            this.maxContiguousBookings = value;
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
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="Type"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="Early"/&gt;
         *             &lt;enumeration value="Late"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CheckoutCharge {

            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "Percent")
            protected BigDecimal percent;
            @XmlAttribute(name = "Type")
            protected String type;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "NmbrOfNights")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger nmbrOfNights;
            @XmlAttribute(name = "ExistsCode")
            protected String existsCode;
            @XmlAttribute(name = "BalanceOfStayInd")
            protected Boolean balanceOfStayInd;

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
             * 获取type属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * 设置type属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * 获取codeDetail属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * 设置codeDetail属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * 获取nmbrOfNights属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNmbrOfNights() {
                return nmbrOfNights;
            }

            /**
             * 设置nmbrOfNights属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNmbrOfNights(BigInteger value) {
                this.nmbrOfNights = value;
            }

            /**
             * 获取existsCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExistsCode() {
                return existsCode;
            }

            /**
             * 设置existsCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExistsCode(String value) {
                this.existsCode = value;
            }

            /**
             * 获取balanceOfStayInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBalanceOfStayInd() {
                return balanceOfStayInd;
            }

            /**
             * 设置balanceOfStayInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBalanceOfStayInd(Boolean value) {
                this.balanceOfStayInd = value;
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

}
