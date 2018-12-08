package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfRequiredPaymentsTypeGuaranteePayment complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfRequiredPaymentsTypeGuaranteePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuaranteePayment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcceptedPayments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPaymentFormType" minOccurs="0"/>
 *                   &lt;element name="AmountPercent" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType">
 *                           &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Deadline" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                           &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="OffsetDropTime">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="BeforeArrival"/>
 *                                 &lt;enumeration value="AfterBooking"/>
 *                                 &lt;enumeration value="AfterConfirmation"/>
 *                                 &lt;enumeration value="AfterArrival"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
 *                           &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RetributionType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="ResAutoCancelled"/>
 *                       &lt;enumeration value="ResNotGuaranteed"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="RequiredPayment"/>
 *                       &lt;enumeration value="GuaranteePolicy"/>
 *                       &lt;enumeration value="AcceptedPaymentForms"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GuaranteeType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="GuaranteeRequired"/>
 *                       &lt;enumeration value="None"/>
 *                       &lt;enumeration value="CC/DC/Voucher"/>
 *                       &lt;enumeration value="Profile"/>
 *                       &lt;enumeration value="Deposit"/>
 *                       &lt;enumeration value="PrePay"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NameInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AddressInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PhoneInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="InterbankNbrInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AgencyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CompanyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfRequiredPaymentsTypeGuaranteePayment", propOrder = {
        "guaranteePayment"
})
public class ArrayOfRequiredPaymentsTypeGuaranteePayment {

    @XmlElement(name = "GuaranteePayment")
    protected List<ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment> guaranteePayment;

    /**
     * Gets the value of the guaranteePayment property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteePayment property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteePayment().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment }
     */
    public List<ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment> getGuaranteePayment() {
        if (guaranteePayment == null) {
            guaranteePayment = new ArrayList<ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment>();
        }
        return this.guaranteePayment;
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
     *         &lt;element name="AcceptedPayments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPaymentFormType" minOccurs="0"/>
     *         &lt;element name="AmountPercent" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType">
     *                 &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Deadline" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
     *                 &lt;attribute name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
     *                 &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="RetributionType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="ResAutoCancelled"/>
     *             &lt;enumeration value="ResNotGuaranteed"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="RequiredPayment"/>
     *             &lt;enumeration value="GuaranteePolicy"/>
     *             &lt;enumeration value="AcceptedPaymentForms"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GuaranteeType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="GuaranteeRequired"/>
     *             &lt;enumeration value="None"/>
     *             &lt;enumeration value="CC/DC/Voucher"/>
     *             &lt;enumeration value="Profile"/>
     *             &lt;enumeration value="Deposit"/>
     *             &lt;enumeration value="PrePay"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NameInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AddressInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PhoneInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="InterbankNbrInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AgencyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CompanyNameAddrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
        protected ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.AmountPercent amountPercent;
        @XmlElement(name = "Deadline")
        protected List<ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Deadline> deadline;
        @XmlElement(name = "Description")
        protected List<ParagraphType> description;
        @XmlElement(name = "Address")
        protected List<ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address> address;
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
         * ��ȡacceptedPayments���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfPaymentFormType }
         */
        public ArrayOfPaymentFormType getAcceptedPayments() {
            return acceptedPayments;
        }

        /**
         * ����acceptedPayments���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfPaymentFormType }
         */
        public void setAcceptedPayments(ArrayOfPaymentFormType value) {
            this.acceptedPayments = value;
        }

        /**
         * ��ȡamountPercent���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.AmountPercent }
         */
        public ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.AmountPercent getAmountPercent() {
            return amountPercent;
        }

        /**
         * ����amountPercent���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.AmountPercent }
         */
        public void setAmountPercent(ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.AmountPercent value) {
            this.amountPercent = value;
        }

        /**
         * Gets the value of the deadline property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deadline property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeadline().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Deadline }
         */
        public List<ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Deadline> getDeadline() {
            if (deadline == null) {
                deadline = new ArrayList<ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Deadline>();
            }
            return this.deadline;
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
         * Gets the value of the address property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address }
         */
        public List<ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address>();
            }
            return this.address;
        }

        /**
         * ��ȡtpaExtensions���Ե�ֵ��
         *
         * @return possible object is
         * {@link TPAExtensionsType }
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * ����tpaExtensions���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TPAExtensionsType }
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

        /**
         * ��ȡretributionType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRetributionType() {
            return retributionType;
        }

        /**
         * ����retributionType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRetributionType(String value) {
            this.retributionType = value;
        }

        /**
         * ��ȡpaymentCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPaymentCode() {
            return paymentCode;
        }

        /**
         * ����paymentCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPaymentCode(String value) {
            this.paymentCode = value;
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
         * ��ȡguaranteeCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getGuaranteeCode() {
            return guaranteeCode;
        }

        /**
         * ����guaranteeCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGuaranteeCode(String value) {
            this.guaranteeCode = value;
        }

        /**
         * ��ȡguaranteeType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getGuaranteeType() {
            return guaranteeType;
        }

        /**
         * ����guaranteeType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGuaranteeType(String value) {
            this.guaranteeType = value;
        }

        /**
         * ��ȡholdTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getHoldTime() {
            return holdTime;
        }

        /**
         * ����holdTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setHoldTime(XMLGregorianCalendar value) {
            this.holdTime = value;
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
         * ��ȡnoCardHolderInfoReqInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isNoCardHolderInfoReqInd() {
            return noCardHolderInfoReqInd;
        }

        /**
         * ����noCardHolderInfoReqInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setNoCardHolderInfoReqInd(Boolean value) {
            this.noCardHolderInfoReqInd = value;
        }

        /**
         * ��ȡnameInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isNameInd() {
            return nameInd;
        }

        /**
         * ����nameInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setNameInd(Boolean value) {
            this.nameInd = value;
        }

        /**
         * ��ȡaddressInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isAddressInd() {
            return addressInd;
        }

        /**
         * ����addressInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setAddressInd(Boolean value) {
            this.addressInd = value;
        }

        /**
         * ��ȡphoneInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isPhoneInd() {
            return phoneInd;
        }

        /**
         * ����phoneInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setPhoneInd(Boolean value) {
            this.phoneInd = value;
        }

        /**
         * ��ȡinterbankNbrInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isInterbankNbrInd() {
            return interbankNbrInd;
        }

        /**
         * ����interbankNbrInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setInterbankNbrInd(Boolean value) {
            this.interbankNbrInd = value;
        }

        /**
         * ��ȡroomTypeCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRoomTypeCode() {
            return roomTypeCode;
        }

        /**
         * ����roomTypeCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRoomTypeCode(String value) {
            this.roomTypeCode = value;
        }

        /**
         * ��ȡinfoSource���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * ����infoSource���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * ��ȡnonRefundableIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isNonRefundableIndicator() {
            return nonRefundableIndicator;
        }

        /**
         * ����nonRefundableIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setNonRefundableIndicator(Boolean value) {
            this.nonRefundableIndicator = value;
        }

        /**
         * ��ȡpolicyCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPolicyCode() {
            return policyCode;
        }

        /**
         * ����policyCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPolicyCode(String value) {
            this.policyCode = value;
        }

        /**
         * ��ȡagencyNameAddrReqInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isAgencyNameAddrReqInd() {
            return agencyNameAddrReqInd;
        }

        /**
         * ����agencyNameAddrReqInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setAgencyNameAddrReqInd(Boolean value) {
            this.agencyNameAddrReqInd = value;
        }

        /**
         * ��ȡcompanyNameAddrReqInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isCompanyNameAddrReqInd() {
            return companyNameAddrReqInd;
        }

        /**
         * ����companyNameAddrReqInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setCompanyNameAddrReqInd(Boolean value) {
            this.companyNameAddrReqInd = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
         *       &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Address
                extends AddressInfoType {

            @XmlAttribute(name = "AddresseeName")
            protected String addresseeName;

            /**
             * ��ȡaddresseeName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAddresseeName() {
                return addresseeName;
            }

            /**
             * ����addresseeName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAddresseeName(String value) {
                this.addresseeName = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType">
         *       &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AmountPercent
                extends AmountPercentType {

            @XmlAttribute(name = "OverriddenAmountIndicator")
            protected Boolean overriddenAmountIndicator;

            /**
             * ��ȡoverriddenAmountIndicator���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isOverriddenAmountIndicator() {
                return overriddenAmountIndicator;
            }

            /**
             * ����overriddenAmountIndicator���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setOverriddenAmountIndicator(Boolean value) {
                this.overriddenAmountIndicator = value;
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
         *       &lt;attribute name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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

            /**
             * ��ȡoverrideIndicator���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isOverrideIndicator() {
                return overrideIndicator;
            }

            /**
             * ����overrideIndicator���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setOverrideIndicator(Boolean value) {
                this.overrideIndicator = value;
            }

        }

    }

}
