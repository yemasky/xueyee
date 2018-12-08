
package ota.jw.AvailRes;

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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PaymentFormType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentFormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="DirectBill" type="{http://www.opentravel.org/OTA/2003/05}DirectBillType" minOccurs="0"/&gt;
 *           &lt;element name="Ticket" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="ConjunctionTicketNbr" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;simpleContent&gt;
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                             &lt;attribute name="Coupons"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/simpleContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                   &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="CheckInhibitorType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="CheckDigit"/&gt;
 *                         &lt;enumeration value="InterlineAgreement"/&gt;
 *                         &lt;enumeration value="Both"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="CouponRPHs"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="ReroutingType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="voluntary"/&gt;
 *                         &lt;enumeration value="involuntary"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="ReasonForReroute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Voucher" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="BillingNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="SupplierIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="ValueType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="ElectronicIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="PaymentCard" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType" minOccurs="0"/&gt;
 *           &lt;element name="MiscChargeOrder" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                   &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="CheckInhibitorType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="CheckDigit"/&gt;
 *                         &lt;enumeration value="InterlineAgreement"/&gt;
 *                         &lt;enumeration value="Both"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="CouponRPHs"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="PaperMCO_ExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="BankAcct" type="{http://www.opentravel.org/OTA/2003/05}BankAcctType" minOccurs="0"/&gt;
 *           &lt;element name="Cash" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="CashIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="LoyaltyRedemption" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="LoyaltyCertificate" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                             &lt;attribute name="Format"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="Paper"/&gt;
 *                                   &lt;enumeration value="Electronic"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                             &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="PromotionVendorCode"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="RedemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ShareSynchInd"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *             &lt;enumeration value="Inherit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ShareMarketInd"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *             &lt;enumeration value="Inherit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CostCenterID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PaymentTransactionTypeCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="charge"/&gt;
 *             &lt;enumeration value="reserve"/&gt;
 *             &lt;enumeration value="refund"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="GuaranteeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GuaranteeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GuaranteeID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFormType", propOrder = {
    "directBill",
    "ticket",
    "voucher",
    "paymentCard",
    "miscChargeOrder",
    "bankAcct",
    "cash",
    "loyaltyRedemption"
})
@XmlSeeAlso({
    ota.jw.AvailRes.CustomerType.PaymentForm.class,
    HotelPaymentFormType.class,
    PaymentDetailType.class,
    PaymentResponseType.class,
    ota.jw.AvailRes.CompanyInfoType.PaymentForm.class,
    ota.jw.AvailRes.ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted.class
})
public class PaymentFormType {

    @XmlElement(name = "DirectBill")
    protected DirectBillType directBill;
    @XmlElement(name = "Ticket")
    protected PaymentFormType.Ticket ticket;
    @XmlElement(name = "Voucher")
    protected PaymentFormType.Voucher voucher;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "MiscChargeOrder")
    protected PaymentFormType.MiscChargeOrder miscChargeOrder;
    @XmlElement(name = "BankAcct")
    protected BankAcctType bankAcct;
    @XmlElement(name = "Cash")
    protected PaymentFormType.Cash cash;
    @XmlElement(name = "LoyaltyRedemption")
    protected PaymentFormType.LoyaltyRedemption loyaltyRedemption;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "CostCenterID")
    protected String costCenterID;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "PaymentTransactionTypeCode")
    protected String paymentTransactionTypeCode;
    @XmlAttribute(name = "GuaranteeIndicator")
    protected Boolean guaranteeIndicator;
    @XmlAttribute(name = "GuaranteeTypeCode")
    protected String guaranteeTypeCode;
    @XmlAttribute(name = "GuaranteeID")
    protected String guaranteeID;
    @XmlAttribute(name = "Remark")
    protected String remark;

    /**
     * 获取directBill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType }
     *     
     */
    public DirectBillType getDirectBill() {
        return directBill;
    }

    /**
     * 设置directBill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType }
     *     
     */
    public void setDirectBill(DirectBillType value) {
        this.directBill = value;
    }

    /**
     * 获取ticket属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.Ticket }
     *     
     */
    public PaymentFormType.Ticket getTicket() {
        return ticket;
    }

    /**
     * 设置ticket属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.Ticket }
     *     
     */
    public void setTicket(PaymentFormType.Ticket value) {
        this.ticket = value;
    }

    /**
     * 获取voucher属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.Voucher }
     *     
     */
    public PaymentFormType.Voucher getVoucher() {
        return voucher;
    }

    /**
     * 设置voucher属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.Voucher }
     *     
     */
    public void setVoucher(PaymentFormType.Voucher value) {
        this.voucher = value;
    }

    /**
     * 获取paymentCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * 设置paymentCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * 获取miscChargeOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.MiscChargeOrder }
     *     
     */
    public PaymentFormType.MiscChargeOrder getMiscChargeOrder() {
        return miscChargeOrder;
    }

    /**
     * 设置miscChargeOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.MiscChargeOrder }
     *     
     */
    public void setMiscChargeOrder(PaymentFormType.MiscChargeOrder value) {
        this.miscChargeOrder = value;
    }

    /**
     * 获取bankAcct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BankAcctType }
     *     
     */
    public BankAcctType getBankAcct() {
        return bankAcct;
    }

    /**
     * 设置bankAcct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctType }
     *     
     */
    public void setBankAcct(BankAcctType value) {
        this.bankAcct = value;
    }

    /**
     * 获取cash属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.Cash }
     *     
     */
    public PaymentFormType.Cash getCash() {
        return cash;
    }

    /**
     * 设置cash属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.Cash }
     *     
     */
    public void setCash(PaymentFormType.Cash value) {
        this.cash = value;
    }

    /**
     * 获取loyaltyRedemption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.LoyaltyRedemption }
     *     
     */
    public PaymentFormType.LoyaltyRedemption getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * 设置loyaltyRedemption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.LoyaltyRedemption }
     *     
     */
    public void setLoyaltyRedemption(PaymentFormType.LoyaltyRedemption value) {
        this.loyaltyRedemption = value;
    }

    /**
     * 获取shareSynchInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * 设置shareSynchInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * 获取shareMarketInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * 设置shareMarketInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * 获取costCenterID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterID() {
        return costCenterID;
    }

    /**
     * 设置costCenterID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterID(String value) {
        this.costCenterID = value;
    }

    /**
     * 获取rph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * 设置rph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * 获取paymentTransactionTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTransactionTypeCode() {
        return paymentTransactionTypeCode;
    }

    /**
     * 设置paymentTransactionTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTransactionTypeCode(String value) {
        this.paymentTransactionTypeCode = value;
    }

    /**
     * 获取guaranteeIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteeIndicator() {
        return guaranteeIndicator;
    }

    /**
     * 设置guaranteeIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteeIndicator(Boolean value) {
        this.guaranteeIndicator = value;
    }

    /**
     * 获取guaranteeTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeTypeCode() {
        return guaranteeTypeCode;
    }

    /**
     * 设置guaranteeTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeTypeCode(String value) {
        this.guaranteeTypeCode = value;
    }

    /**
     * 获取guaranteeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeID() {
        return guaranteeID;
    }

    /**
     * 设置guaranteeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeID(String value) {
        this.guaranteeID = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
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
     *       &lt;attribute name="CashIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cash {

        @XmlAttribute(name = "CashIndicator")
        protected Boolean cashIndicator;

        /**
         * 获取cashIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCashIndicator() {
            return cashIndicator;
        }

        /**
         * 设置cashIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCashIndicator(Boolean value) {
            this.cashIndicator = value;
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
     *         &lt;element name="LoyaltyCertificate" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="Format"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="Paper"/&gt;
     *                       &lt;enumeration value="Electronic"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PromotionVendorCode"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="RedemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "loyaltyCertificate"
    })
    public static class LoyaltyRedemption {

        @XmlElement(name = "LoyaltyCertificate")
        protected List<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate> loyaltyCertificate;
        @XmlAttribute(name = "CertificateNumber")
        protected String certificateNumber;
        @XmlAttribute(name = "MemberNumber")
        protected String memberNumber;
        @XmlAttribute(name = "ProgramName")
        protected String programName;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "PromotionVendorCode")
        protected List<String> promotionVendorCode;
        @XmlAttribute(name = "RedemptionQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger redemptionQuantity;

        /**
         * Gets the value of the loyaltyCertificate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loyaltyCertificate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoyaltyCertificate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentFormType.LoyaltyRedemption.LoyaltyCertificate }
         * 
         * 
         */
        public List<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate> getLoyaltyCertificate() {
            if (loyaltyCertificate == null) {
                loyaltyCertificate = new ArrayList<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate>();
            }
            return this.loyaltyCertificate;
        }

        /**
         * 获取certificateNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertificateNumber() {
            return certificateNumber;
        }

        /**
         * 设置certificateNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertificateNumber(String value) {
            this.certificateNumber = value;
        }

        /**
         * 获取memberNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberNumber() {
            return memberNumber;
        }

        /**
         * 设置memberNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberNumber(String value) {
            this.memberNumber = value;
        }

        /**
         * 获取programName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramName() {
            return programName;
        }

        /**
         * 设置programName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramName(String value) {
            this.programName = value;
        }

        /**
         * 获取promotionCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionCode() {
            return promotionCode;
        }

        /**
         * 设置promotionCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionCode(String value) {
            this.promotionCode = value;
        }

        /**
         * Gets the value of the promotionVendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPromotionVendorCode() {
            if (promotionVendorCode == null) {
                promotionVendorCode = new ArrayList<String>();
            }
            return this.promotionVendorCode;
        }

        /**
         * 获取redemptionQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRedemptionQuantity() {
            return redemptionQuantity;
        }

        /**
         * 设置redemptionQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRedemptionQuantity(BigInteger value) {
            this.redemptionQuantity = value;
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
         *       &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="Format"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="Paper"/&gt;
         *             &lt;enumeration value="Electronic"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LoyaltyCertificate {

            @XmlAttribute(name = "ID_Context")
            protected String idContext;
            @XmlAttribute(name = "NmbrOfNights")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger nmbrOfNights;
            @XmlAttribute(name = "Format")
            protected String format;
            @XmlAttribute(name = "Status")
            protected String status;

            /**
             * 获取idContext属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDContext() {
                return idContext;
            }

            /**
             * 设置idContext属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDContext(String value) {
                this.idContext = value;
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
             * 获取format属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * 设置format属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * 获取status属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * 设置status属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

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
     *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CheckInhibitorType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="CheckDigit"/&gt;
     *             &lt;enumeration value="InterlineAgreement"/&gt;
     *             &lt;enumeration value="Both"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CouponRPHs"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="PaperMCO_ExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MiscChargeOrder {

        @XmlAttribute(name = "TicketNumber")
        protected String ticketNumber;
        @XmlAttribute(name = "OriginalTicketNumber")
        protected String originalTicketNumber;
        @XmlAttribute(name = "OriginalIssuePlace")
        protected String originalIssuePlace;
        @XmlAttribute(name = "OriginalIssueDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar originalIssueDate;
        @XmlAttribute(name = "OriginalIssueIATA")
        protected String originalIssueIATA;
        @XmlAttribute(name = "OriginalPaymentForm")
        protected String originalPaymentForm;
        @XmlAttribute(name = "CheckInhibitorType")
        protected String checkInhibitorType;
        @XmlAttribute(name = "CouponRPHs")
        protected List<String> couponRPHs;
        @XmlAttribute(name = "PaperMCO_ExistInd")
        protected Boolean paperMCOExistInd;

        /**
         * 获取ticketNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketNumber() {
            return ticketNumber;
        }

        /**
         * 设置ticketNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketNumber(String value) {
            this.ticketNumber = value;
        }

        /**
         * 获取originalTicketNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalTicketNumber() {
            return originalTicketNumber;
        }

        /**
         * 设置originalTicketNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalTicketNumber(String value) {
            this.originalTicketNumber = value;
        }

        /**
         * 获取originalIssuePlace属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssuePlace() {
            return originalIssuePlace;
        }

        /**
         * 设置originalIssuePlace属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssuePlace(String value) {
            this.originalIssuePlace = value;
        }

        /**
         * 获取originalIssueDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOriginalIssueDate() {
            return originalIssueDate;
        }

        /**
         * 设置originalIssueDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOriginalIssueDate(XMLGregorianCalendar value) {
            this.originalIssueDate = value;
        }

        /**
         * 获取originalIssueIATA属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssueIATA() {
            return originalIssueIATA;
        }

        /**
         * 设置originalIssueIATA属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssueIATA(String value) {
            this.originalIssueIATA = value;
        }

        /**
         * 获取originalPaymentForm属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalPaymentForm() {
            return originalPaymentForm;
        }

        /**
         * 设置originalPaymentForm属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalPaymentForm(String value) {
            this.originalPaymentForm = value;
        }

        /**
         * 获取checkInhibitorType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckInhibitorType() {
            return checkInhibitorType;
        }

        /**
         * 设置checkInhibitorType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckInhibitorType(String value) {
            this.checkInhibitorType = value;
        }

        /**
         * Gets the value of the couponRPHs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponRPHs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponRPHs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCouponRPHs() {
            if (couponRPHs == null) {
                couponRPHs = new ArrayList<String>();
            }
            return this.couponRPHs;
        }

        /**
         * 获取paperMCOExistInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPaperMCOExistInd() {
            return paperMCOExistInd;
        }

        /**
         * 设置paperMCOExistInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPaperMCOExistInd(Boolean value) {
            this.paperMCOExistInd = value;
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
     *         &lt;element name="ConjunctionTicketNbr" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="Coupons"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CheckInhibitorType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="CheckDigit"/&gt;
     *             &lt;enumeration value="InterlineAgreement"/&gt;
     *             &lt;enumeration value="Both"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CouponRPHs"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ReroutingType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="voluntary"/&gt;
     *             &lt;enumeration value="involuntary"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ReasonForReroute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conjunctionTicketNbr"
    })
    public static class Ticket {

        @XmlElement(name = "ConjunctionTicketNbr")
        protected List<PaymentFormType.Ticket.ConjunctionTicketNbr> conjunctionTicketNbr;
        @XmlAttribute(name = "TicketNumber")
        protected String ticketNumber;
        @XmlAttribute(name = "OriginalTicketNumber")
        protected String originalTicketNumber;
        @XmlAttribute(name = "OriginalIssuePlace")
        protected String originalIssuePlace;
        @XmlAttribute(name = "OriginalIssueDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar originalIssueDate;
        @XmlAttribute(name = "OriginalIssueIATA")
        protected String originalIssueIATA;
        @XmlAttribute(name = "OriginalPaymentForm")
        protected String originalPaymentForm;
        @XmlAttribute(name = "CheckInhibitorType")
        protected String checkInhibitorType;
        @XmlAttribute(name = "CouponRPHs")
        protected List<String> couponRPHs;
        @XmlAttribute(name = "ReroutingType")
        protected String reroutingType;
        @XmlAttribute(name = "ReasonForReroute")
        protected String reasonForReroute;

        /**
         * Gets the value of the conjunctionTicketNbr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conjunctionTicketNbr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConjunctionTicketNbr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentFormType.Ticket.ConjunctionTicketNbr }
         * 
         * 
         */
        public List<PaymentFormType.Ticket.ConjunctionTicketNbr> getConjunctionTicketNbr() {
            if (conjunctionTicketNbr == null) {
                conjunctionTicketNbr = new ArrayList<PaymentFormType.Ticket.ConjunctionTicketNbr>();
            }
            return this.conjunctionTicketNbr;
        }

        /**
         * 获取ticketNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketNumber() {
            return ticketNumber;
        }

        /**
         * 设置ticketNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketNumber(String value) {
            this.ticketNumber = value;
        }

        /**
         * 获取originalTicketNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalTicketNumber() {
            return originalTicketNumber;
        }

        /**
         * 设置originalTicketNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalTicketNumber(String value) {
            this.originalTicketNumber = value;
        }

        /**
         * 获取originalIssuePlace属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssuePlace() {
            return originalIssuePlace;
        }

        /**
         * 设置originalIssuePlace属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssuePlace(String value) {
            this.originalIssuePlace = value;
        }

        /**
         * 获取originalIssueDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOriginalIssueDate() {
            return originalIssueDate;
        }

        /**
         * 设置originalIssueDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOriginalIssueDate(XMLGregorianCalendar value) {
            this.originalIssueDate = value;
        }

        /**
         * 获取originalIssueIATA属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssueIATA() {
            return originalIssueIATA;
        }

        /**
         * 设置originalIssueIATA属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssueIATA(String value) {
            this.originalIssueIATA = value;
        }

        /**
         * 获取originalPaymentForm属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalPaymentForm() {
            return originalPaymentForm;
        }

        /**
         * 设置originalPaymentForm属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalPaymentForm(String value) {
            this.originalPaymentForm = value;
        }

        /**
         * 获取checkInhibitorType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckInhibitorType() {
            return checkInhibitorType;
        }

        /**
         * 设置checkInhibitorType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckInhibitorType(String value) {
            this.checkInhibitorType = value;
        }

        /**
         * Gets the value of the couponRPHs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponRPHs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponRPHs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCouponRPHs() {
            if (couponRPHs == null) {
                couponRPHs = new ArrayList<String>();
            }
            return this.couponRPHs;
        }

        /**
         * 获取reroutingType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReroutingType() {
            return reroutingType;
        }

        /**
         * 设置reroutingType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReroutingType(String value) {
            this.reroutingType = value;
        }

        /**
         * 获取reasonForReroute属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonForReroute() {
            return reasonForReroute;
        }

        /**
         * 设置reasonForReroute属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonForReroute(String value) {
            this.reasonForReroute = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="Coupons"&gt;
         *         &lt;simpleType&gt;
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ConjunctionTicketNbr {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Coupons")
            protected List<String> coupons;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the coupons property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the coupons property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCoupons().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getCoupons() {
                if (coupons == null) {
                    coupons = new ArrayList<String>();
                }
                return this.coupons;
            }

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
     *       &lt;attribute name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BillingNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SupplierIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ValueType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ElectronicIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Voucher {

        @XmlAttribute(name = "SeriesCode")
        protected String seriesCode;
        @XmlAttribute(name = "BillingNumber")
        protected String billingNumber;
        @XmlAttribute(name = "SupplierIdentifier")
        protected String supplierIdentifier;
        @XmlAttribute(name = "Identifier")
        protected String identifier;
        @XmlAttribute(name = "ValueType")
        protected String valueType;
        @XmlAttribute(name = "ElectronicIndicator")
        protected Boolean electronicIndicator;

        /**
         * 获取seriesCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeriesCode() {
            return seriesCode;
        }

        /**
         * 设置seriesCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeriesCode(String value) {
            this.seriesCode = value;
        }

        /**
         * 获取billingNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingNumber() {
            return billingNumber;
        }

        /**
         * 设置billingNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingNumber(String value) {
            this.billingNumber = value;
        }

        /**
         * 获取supplierIdentifier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierIdentifier() {
            return supplierIdentifier;
        }

        /**
         * 设置supplierIdentifier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierIdentifier(String value) {
            this.supplierIdentifier = value;
        }

        /**
         * 获取identifier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifier() {
            return identifier;
        }

        /**
         * 设置identifier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifier(String value) {
            this.identifier = value;
        }

        /**
         * 获取valueType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueType() {
            return valueType;
        }

        /**
         * 设置valueType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueType(String value) {
            this.valueType = value;
        }

        /**
         * 获取electronicIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isElectronicIndicator() {
            return electronicIndicator;
        }

        /**
         * 设置electronicIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setElectronicIndicator(Boolean value) {
            this.electronicIndicator = value;
        }

    }

}
