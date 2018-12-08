
package ota.jw.PMSGateway;

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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RequiredPaymentsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequiredPaymentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuaranteePayment" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AcceptedPayments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPaymentFormType" minOccurs="0"/&gt;
 *                   &lt;element name="AmountPercent" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType"&gt;
 *                           &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Deadline" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                           &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                           &lt;attribute name="OffsetDropTime"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="BeforeArrival"/&gt;
 *                                 &lt;enumeration value="AfterBooking"/&gt;
 *                                 &lt;enumeration value="AfterConfirmation"/&gt;
 *                                 &lt;enumeration value="AfterArrival"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Address" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType"&gt;
 *                           &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RetributionType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="ResAutoCancelled"/&gt;
 *                       &lt;enumeration value="ResNotGuaranteed"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Type"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="RequiredPayment"/&gt;
 *                       &lt;enumeration value="GuaranteePolicy"/&gt;
 *                       &lt;enumeration value="AcceptedPaymentForms"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="GuaranteeType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="GuaranteeRequired"/&gt;
 *                       &lt;enumeration value="None"/&gt;
 *                       &lt;enumeration value="CC/DC/Voucher"/&gt;
 *                       &lt;enumeration value="Profile"/&gt;
 *                       &lt;enumeration value="Deposit"/&gt;
 *                       &lt;enumeration value="PrePay"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="NameInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AddressInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="PhoneInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="InterbankNbrInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AgencyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="CompanyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "RequiredPaymentsType", propOrder = {
    "guaranteePayment"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.PoliciesType.Policy.GuaranteePaymentPolicy.class
})
public class RequiredPaymentsType {

    @XmlElement(name = "GuaranteePayment")
    protected List<RequiredPaymentsType.GuaranteePayment> guaranteePayment;

    /**
     * Gets the value of the guaranteePayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteePayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteePayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredPaymentsType.GuaranteePayment }
     * 
     * 
     */
    public List<RequiredPaymentsType.GuaranteePayment> getGuaranteePayment() {
        if (guaranteePayment == null) {
            guaranteePayment = new ArrayList<RequiredPaymentsType.GuaranteePayment>();
        }
        return this.guaranteePayment;
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
     *         &lt;element name="AcceptedPayments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPaymentFormType" minOccurs="0"/&gt;
     *         &lt;element name="AmountPercent" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType"&gt;
     *                 &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Deadline" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
     *                 &lt;attribute name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType"&gt;
     *                 &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RetributionType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="ResAutoCancelled"/&gt;
     *             &lt;enumeration value="ResNotGuaranteed"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Type"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="RequiredPayment"/&gt;
     *             &lt;enumeration value="GuaranteePolicy"/&gt;
     *             &lt;enumeration value="AcceptedPaymentForms"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="GuaranteeType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="GuaranteeRequired"/&gt;
     *             &lt;enumeration value="None"/&gt;
     *             &lt;enumeration value="CC/DC/Voucher"/&gt;
     *             &lt;enumeration value="Profile"/&gt;
     *             &lt;enumeration value="Deposit"/&gt;
     *             &lt;enumeration value="PrePay"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
     *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="NameInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AddressInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="PhoneInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="InterbankNbrInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AgencyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="CompanyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acceptedPayments",
        "amountPercent",
        "deadline",
        "description",
        "address",
        "tpaExtensions"
    })
    public static class GuaranteePayment {

        @XmlElement(name = "AcceptedPayments")
        protected ArrayOfPaymentFormType acceptedPayments;
        @XmlElement(name = "AmountPercent")
        protected RequiredPaymentsType.GuaranteePayment.AmountPercent amountPercent;
        @XmlElement(name = "Deadline")
        protected List<RequiredPaymentsType.GuaranteePayment.Deadline> deadline;
        @XmlElement(name = "Description")
        protected List<ParagraphType> description;
        @XmlElement(name = "Address")
        protected List<RequiredPaymentsType.GuaranteePayment.Address> address;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "RetributionType")
        protected String retributionType;
        @XmlAttribute(name = "PaymentCode")
        protected String paymentCode;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "GuaranteeCode")
        protected String guaranteeCode;
        @XmlAttribute(name = "GuaranteeType")
        protected String guaranteeType;
        @XmlAttribute(name = "HoldTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar holdTime;
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
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "NoCardHolderInfoReqInd")
        protected Boolean noCardHolderInfoReqInd;
        @XmlAttribute(name = "NameInd")
        protected Boolean nameInd;
        @XmlAttribute(name = "AddressInd")
        protected Boolean addressInd;
        @XmlAttribute(name = "PhoneInd")
        protected Boolean phoneInd;
        @XmlAttribute(name = "InterbankNbrInd")
        protected Boolean interbankNbrInd;
        @XmlAttribute(name = "RoomTypeCode")
        protected String roomTypeCode;
        @XmlAttribute(name = "InfoSource")
        protected String infoSource;
        @XmlAttribute(name = "NonRefundableIndicator")
        protected Boolean nonRefundableIndicator;
        @XmlAttribute(name = "PolicyCode")
        protected String policyCode;
        @XmlAttribute(name = "AgencyNameAddrReqInd")
        protected Boolean agencyNameAddrReqInd;
        @XmlAttribute(name = "CompanyNameAddrReqInd")
        protected Boolean companyNameAddrReqInd;

        /**
         * 获取acceptedPayments属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPaymentFormType }
         *     
         */
        public ArrayOfPaymentFormType getAcceptedPayments() {
            return acceptedPayments;
        }

        /**
         * 设置acceptedPayments属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPaymentFormType }
         *     
         */
        public void setAcceptedPayments(ArrayOfPaymentFormType value) {
            this.acceptedPayments = value;
        }

        /**
         * 获取amountPercent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
         *     
         */
        public RequiredPaymentsType.GuaranteePayment.AmountPercent getAmountPercent() {
            return amountPercent;
        }

        /**
         * 设置amountPercent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
         *     
         */
        public void setAmountPercent(RequiredPaymentsType.GuaranteePayment.AmountPercent value) {
            this.amountPercent = value;
        }

        /**
         * Gets the value of the deadline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deadline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeadline().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequiredPaymentsType.GuaranteePayment.Deadline }
         * 
         * 
         */
        public List<RequiredPaymentsType.GuaranteePayment.Deadline> getDeadline() {
            if (deadline == null) {
                deadline = new ArrayList<RequiredPaymentsType.GuaranteePayment.Deadline>();
            }
            return this.deadline;
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
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequiredPaymentsType.GuaranteePayment.Address }
         * 
         * 
         */
        public List<RequiredPaymentsType.GuaranteePayment.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<RequiredPaymentsType.GuaranteePayment.Address>();
            }
            return this.address;
        }

        /**
         * 获取tpaExtensions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensionsType }
         *     
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * 设置tpaExtensions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensionsType }
         *     
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

        /**
         * 获取retributionType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRetributionType() {
            return retributionType;
        }

        /**
         * 设置retributionType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRetributionType(String value) {
            this.retributionType = value;
        }

        /**
         * 获取paymentCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentCode() {
            return paymentCode;
        }

        /**
         * 设置paymentCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentCode(String value) {
            this.paymentCode = value;
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
         * 获取guaranteeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeCode() {
            return guaranteeCode;
        }

        /**
         * 设置guaranteeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeCode(String value) {
            this.guaranteeCode = value;
        }

        /**
         * 获取guaranteeType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeType() {
            return guaranteeType;
        }

        /**
         * 设置guaranteeType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeType(String value) {
            this.guaranteeType = value;
        }

        /**
         * 获取holdTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoldTime() {
            return holdTime;
        }

        /**
         * 设置holdTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoldTime(XMLGregorianCalendar value) {
            this.holdTime = value;
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
         * 获取noCardHolderInfoReqInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoCardHolderInfoReqInd() {
            return noCardHolderInfoReqInd;
        }

        /**
         * 设置noCardHolderInfoReqInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoCardHolderInfoReqInd(Boolean value) {
            this.noCardHolderInfoReqInd = value;
        }

        /**
         * 获取nameInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNameInd() {
            return nameInd;
        }

        /**
         * 设置nameInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNameInd(Boolean value) {
            this.nameInd = value;
        }

        /**
         * 获取addressInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAddressInd() {
            return addressInd;
        }

        /**
         * 设置addressInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAddressInd(Boolean value) {
            this.addressInd = value;
        }

        /**
         * 获取phoneInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPhoneInd() {
            return phoneInd;
        }

        /**
         * 设置phoneInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPhoneInd(Boolean value) {
            this.phoneInd = value;
        }

        /**
         * 获取interbankNbrInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInterbankNbrInd() {
            return interbankNbrInd;
        }

        /**
         * 设置interbankNbrInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInterbankNbrInd(Boolean value) {
            this.interbankNbrInd = value;
        }

        /**
         * 获取roomTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomTypeCode() {
            return roomTypeCode;
        }

        /**
         * 设置roomTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomTypeCode(String value) {
            this.roomTypeCode = value;
        }

        /**
         * 获取infoSource属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * 设置infoSource属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * 获取nonRefundableIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonRefundableIndicator() {
            return nonRefundableIndicator;
        }

        /**
         * 设置nonRefundableIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonRefundableIndicator(Boolean value) {
            this.nonRefundableIndicator = value;
        }

        /**
         * 获取policyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyCode() {
            return policyCode;
        }

        /**
         * 设置policyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyCode(String value) {
            this.policyCode = value;
        }

        /**
         * 获取agencyNameAddrReqInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAgencyNameAddrReqInd() {
            return agencyNameAddrReqInd;
        }

        /**
         * 设置agencyNameAddrReqInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAgencyNameAddrReqInd(Boolean value) {
            this.agencyNameAddrReqInd = value;
        }

        /**
         * 获取companyNameAddrReqInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCompanyNameAddrReqInd() {
            return companyNameAddrReqInd;
        }

        /**
         * 设置companyNameAddrReqInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCompanyNameAddrReqInd(Boolean value) {
            this.companyNameAddrReqInd = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType"&gt;
         *       &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Address
            extends AddressInfoType
        {

            @XmlAttribute(name = "AddresseeName")
            protected String addresseeName;

            /**
             * 获取addresseeName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddresseeName() {
                return addresseeName;
            }

            /**
             * 设置addresseeName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddresseeName(String value) {
                this.addresseeName = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType"&gt;
         *       &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AmountPercent
            extends AmountPercentType
        {

            @XmlAttribute(name = "OverriddenAmountIndicator")
            protected Boolean overriddenAmountIndicator;

            /**
             * 获取overriddenAmountIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOverriddenAmountIndicator() {
                return overriddenAmountIndicator;
            }

            /**
             * 设置overriddenAmountIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOverriddenAmountIndicator(Boolean value) {
                this.overriddenAmountIndicator = value;
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
         *       &lt;attribute name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Deadline {

            @XmlAttribute(name = "AbsoluteDeadline")
            protected String absoluteDeadline;
            @XmlAttribute(name = "OffsetTimeUnit")
            protected TimeUnitType offsetTimeUnit;
            @XmlAttribute(name = "OffsetUnitMultiplier")
            protected BigInteger offsetUnitMultiplier;
            @XmlAttribute(name = "OffsetDropTime")
            protected String offsetDropTime;
            @XmlAttribute(name = "OverrideIndicator")
            protected Boolean overrideIndicator;

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

            /**
             * 获取overrideIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOverrideIndicator() {
                return overrideIndicator;
            }

            /**
             * 设置overrideIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOverrideIndicator(Boolean value) {
                this.overrideIndicator = value;
            }

        }

    }

}
