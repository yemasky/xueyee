package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfBookingRulesTypeBookingRule complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfBookingRulesTypeBookingRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingRule" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcceptableGuarantees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee" minOccurs="0"/>
 *                   &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="RequiredPaymts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
 *                   &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/>
 *                   &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/>
 *                   &lt;element name="RestrictionStatus" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Restriction">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Master"/>
 *                                 &lt;enumeration value="Arrival"/>
 *                                 &lt;enumeration value="Departure"/>
 *                                 &lt;enumeration value="NonGuarantee"/>
 *                                 &lt;enumeration value="TravelAgent"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
 *                           &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Viewerships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewership" minOccurs="0"/>
 *                   &lt;element name="AddtionalRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAdditionalRule" minOccurs="0"/>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="CheckoutCharge" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Early"/>
 *                                 &lt;enumeration value="Late"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="ForceGuaranteeOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="DepositWaiverOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="MinTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="AbsoluteDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GenerallyBookable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PriceViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="QualifiedRateYN" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="OffsetCalculationMode">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="BeforeBlockStartDate"/>
 *                       &lt;enumeration value="AfterBlockCreation"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="MaxContiguousBookings" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRule property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingRule().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfBookingRulesTypeBookingRule.BookingRule }
     */
    public List<ArrayOfBookingRulesTypeBookingRule.BookingRule> getBookingRule() {
        if (bookingRule == null) {
            bookingRule = new ArrayList<ArrayOfBookingRulesTypeBookingRule.BookingRule>();
        }
        return this.bookingRule;
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
     *         &lt;element name="AcceptableGuarantees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee" minOccurs="0"/>
     *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
     *         &lt;element name="RequiredPaymts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
     *         &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/>
     *         &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/>
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
     *         &lt;element name="Viewerships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewership" minOccurs="0"/>
     *         &lt;element name="AddtionalRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRuleAdditionalRule" minOccurs="0"/>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *         &lt;element name="CheckoutCharge" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Early"/>
     *                       &lt;enumeration value="Late"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="ForceGuaranteeOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="DepositWaiverOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="MinTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="AbsoluteDropTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GenerallyBookable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PriceViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="QualifiedRateYN" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="OffsetCalculationMode">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="BeforeBlockStartDate"/>
     *             &lt;enumeration value="AfterBlockCreation"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="MaxContiguousBookings" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡacceptableGuarantees���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee }
         */
        public ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee getAcceptableGuarantees() {
            return acceptableGuarantees;
        }

        /**
         * ����acceptableGuarantees���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee }
         */
        public void setAcceptableGuarantees(ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee value) {
            this.acceptableGuarantees = value;
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
         * ��ȡrequiredPaymts���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
         */
        public ArrayOfRequiredPaymentsTypeGuaranteePayment getRequiredPaymts() {
            return requiredPaymts;
        }

        /**
         * ����requiredPaymts���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
         */
        public void setRequiredPaymts(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
            this.requiredPaymts = value;
        }

        /**
         * ��ȡlengthsOfStay���Ե�ֵ��
         *
         * @return possible object is
         * {@link LengthsOfStayType }
         */
        public LengthsOfStayType getLengthsOfStay() {
            return lengthsOfStay;
        }

        /**
         * ����lengthsOfStay���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link LengthsOfStayType }
         */
        public void setLengthsOfStay(LengthsOfStayType value) {
            this.lengthsOfStay = value;
        }

        /**
         * ��ȡdowRestrictions���Ե�ֵ��
         *
         * @return possible object is
         * {@link DOWRestrictionsType }
         */
        public DOWRestrictionsType getDOWRestrictions() {
            return dowRestrictions;
        }

        /**
         * ����dowRestrictions���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DOWRestrictionsType }
         */
        public void setDOWRestrictions(DOWRestrictionsType value) {
            this.dowRestrictions = value;
        }

        /**
         * ��ȡrestrictionStatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus }
         */
        public ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus getRestrictionStatus() {
            return restrictionStatus;
        }

        /**
         * ����restrictionStatus���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus }
         */
        public void setRestrictionStatus(ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus value) {
            this.restrictionStatus = value;
        }

        /**
         * ��ȡviewerships���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfViewershipsTypeViewership }
         */
        public ArrayOfViewershipsTypeViewership getViewerships() {
            return viewerships;
        }

        /**
         * ����viewerships���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfViewershipsTypeViewership }
         */
        public void setViewerships(ArrayOfViewershipsTypeViewership value) {
            this.viewerships = value;
        }

        /**
         * ��ȡaddtionalRules���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule }
         */
        public ArrayOfBookingRulesTypeBookingRuleAdditionalRule getAddtionalRules() {
            return addtionalRules;
        }

        /**
         * ����addtionalRules���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule }
         */
        public void setAddtionalRules(ArrayOfBookingRulesTypeBookingRuleAdditionalRule value) {
            this.addtionalRules = value;
        }

        /**
         * Gets the value of the description property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         */
        public List<ParagraphType> getDescription() {
            if (description == null) {
                description = new ArrayList<ParagraphType>();
            }
            return this.description;
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
         * Gets the value of the checkoutCharge property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkoutCharge property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckoutCharge().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge }
         */
        public List<ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge> getCheckoutCharge() {
            if (checkoutCharge == null) {
                checkoutCharge = new ArrayList<ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge>();
            }
            return this.checkoutCharge;
        }

        /**
         * ��ȡuri���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getURI() {
            return uri;
        }

        /**
         * ����uri���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setURI(String value) {
            this.uri = value;
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
         * ��ȡmaxAdvancedBookingOffset���Ե�ֵ��
         *
         * @return possible object is
         * {@link Duration }
         */
        public Duration getMaxAdvancedBookingOffset() {
            return maxAdvancedBookingOffset;
        }

        /**
         * ����maxAdvancedBookingOffset���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Duration }
         */
        public void setMaxAdvancedBookingOffset(Duration value) {
            this.maxAdvancedBookingOffset = value;
        }

        /**
         * ��ȡminAdvancedBookingOffset���Ե�ֵ��
         *
         * @return possible object is
         * {@link Duration }
         */
        public Duration getMinAdvancedBookingOffset() {
            return minAdvancedBookingOffset;
        }

        /**
         * ����minAdvancedBookingOffset���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Duration }
         */
        public void setMinAdvancedBookingOffset(Duration value) {
            this.minAdvancedBookingOffset = value;
        }

        /**
         * ��ȡforceGuaranteeOffset���Ե�ֵ��
         *
         * @return possible object is
         * {@link Duration }
         */
        public Duration getForceGuaranteeOffset() {
            return forceGuaranteeOffset;
        }

        /**
         * ����forceGuaranteeOffset���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Duration }
         */
        public void setForceGuaranteeOffset(Duration value) {
            this.forceGuaranteeOffset = value;
        }

        /**
         * ��ȡdepositWaiverOffset���Ե�ֵ��
         *
         * @return possible object is
         * {@link Duration }
         */
        public Duration getDepositWaiverOffset() {
            return depositWaiverOffset;
        }

        /**
         * ����depositWaiverOffset���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Duration }
         */
        public void setDepositWaiverOffset(Duration value) {
            this.depositWaiverOffset = value;
        }

        /**
         * ��ȡminTotalOccupancy���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMinTotalOccupancy() {
            return minTotalOccupancy;
        }

        /**
         * ����minTotalOccupancy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMinTotalOccupancy(BigInteger value) {
            this.minTotalOccupancy = value;
        }

        /**
         * ��ȡmaxTotalOccupancy���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxTotalOccupancy() {
            return maxTotalOccupancy;
        }

        /**
         * ����maxTotalOccupancy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxTotalOccupancy(BigInteger value) {
            this.maxTotalOccupancy = value;
        }

        /**
         * ��ȡabsoluteDropTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAbsoluteDropTime() {
            return absoluteDropTime;
        }

        /**
         * ����absoluteDropTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAbsoluteDropTime(String value) {
            this.absoluteDropTime = value;
        }

        /**
         * ��ȡgenerallyBookable���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isGenerallyBookable() {
            return generallyBookable;
        }

        /**
         * ����generallyBookable���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setGenerallyBookable(Boolean value) {
            this.generallyBookable = value;
        }

        /**
         * ��ȡpriceViewable���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isPriceViewable() {
            return priceViewable;
        }

        /**
         * ����priceViewable���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setPriceViewable(Boolean value) {
            this.priceViewable = value;
        }

        /**
         * ��ȡqualifiedRateYN���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isQualifiedRateYN() {
            return qualifiedRateYN;
        }

        /**
         * ����qualifiedRateYN���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setQualifiedRateYN(Boolean value) {
            this.qualifiedRateYN = value;
        }

        /**
         * ��ȡaddressRequired���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isAddressRequired() {
            return addressRequired;
        }

        /**
         * ����addressRequired���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setAddressRequired(Boolean value) {
            this.addressRequired = value;
        }

        /**
         * ��ȡabsoluteCutoff���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAbsoluteCutoff() {
            return absoluteCutoff;
        }

        /**
         * ����absoluteCutoff���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAbsoluteCutoff(String value) {
            this.absoluteCutoff = value;
        }

        /**
         * ��ȡoffsetDuration���Ե�ֵ��
         *
         * @return possible object is
         * {@link Duration }
         */
        public Duration getOffsetDuration() {
            return offsetDuration;
        }

        /**
         * ����offsetDuration���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Duration }
         */
        public void setOffsetDuration(Duration value) {
            this.offsetDuration = value;
        }

        /**
         * ��ȡoffsetCalculationMode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOffsetCalculationMode() {
            return offsetCalculationMode;
        }

        /**
         * ����offsetCalculationMode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOffsetCalculationMode(String value) {
            this.offsetCalculationMode = value;
        }

        /**
         * ��ȡmaxContiguousBookings���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxContiguousBookings() {
            return maxContiguousBookings;
        }

        /**
         * ����maxContiguousBookings���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxContiguousBookings(BigInteger value) {
            this.maxContiguousBookings = value;
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
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Early"/>
         *             &lt;enumeration value="Late"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡamount���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * ����amount���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * ��ȡpercent���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getPercent() {
                return percent;
            }

            /**
             * ����percent���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setPercent(BigDecimal value) {
                this.percent = value;
            }

            /**
             * ��ȡtype���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getType() {
                return type;
            }

            /**
             * ����type���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * ��ȡcodeDetail���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * ����codeDetail���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * ��ȡnmbrOfNights���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getNmbrOfNights() {
                return nmbrOfNights;
            }

            /**
             * ����nmbrOfNights���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setNmbrOfNights(BigInteger value) {
                this.nmbrOfNights = value;
            }

            /**
             * ��ȡexistsCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getExistsCode() {
                return existsCode;
            }

            /**
             * ����existsCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setExistsCode(String value) {
                this.existsCode = value;
            }

            /**
             * ��ȡbalanceOfStayInd���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isBalanceOfStayInd() {
                return balanceOfStayInd;
            }

            /**
             * ����balanceOfStayInd���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setBalanceOfStayInd(Boolean value) {
                this.balanceOfStayInd = value;
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

}
