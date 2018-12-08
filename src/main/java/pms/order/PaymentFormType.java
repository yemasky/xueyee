package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>PaymentFormType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="PaymentFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Cash" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="CashIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="LoyaltyRedemption" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="LoyaltyCertificate" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                             &lt;attribute name="Format">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Paper"/>
 *                                   &lt;enumeration value="Electronic"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="PromotionVendorCode">
 *                     &lt;simpleType>
 *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="RedemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="MiscChargeOrder" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                   &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="CheckInhibitorType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="CheckDigit"/>
 *                         &lt;enumeration value="InterlineAgreement"/>
 *                         &lt;enumeration value="Both"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="CouponRPHs">
 *                     &lt;simpleType>
 *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="PaperMCO_ExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="BankAcct" type="{http://www.opentravel.org/OTA/2003/05}BankAcctType" minOccurs="0"/>
 *           &lt;element name="Ticket" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="ConjunctionTicketNbr" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                             &lt;attribute name="Coupons">
 *                               &lt;simpleType>
 *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                   &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="CheckInhibitorType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="CheckDigit"/>
 *                         &lt;enumeration value="InterlineAgreement"/>
 *                         &lt;enumeration value="Both"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="CouponRPHs">
 *                     &lt;simpleType>
 *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="ReroutingType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="voluntary"/>
 *                         &lt;enumeration value="involuntary"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="ReasonForReroute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Voucher" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="BillingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="SupplierIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="ValueType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="ElectronicIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="PaymentCard" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType" minOccurs="0"/>
 *           &lt;element name="DirectBill" type="{http://www.opentravel.org/OTA/2003/05}DirectBillType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CostCenterID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PaymentTransactionTypeCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="charge"/>
 *             &lt;enumeration value="reserve"/>
 *             &lt;enumeration value="refund"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="GuaranteeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GuaranteeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GuaranteeID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFormType", propOrder = {
        "cash",
        "loyaltyRedemption",
        "miscChargeOrder",
        "bankAcct",
        "ticket",
        "voucher",
        "paymentCard",
        "directBill"
})
@XmlSeeAlso({
        pms.order.CompanyInfoType.PaymentForm.class,
        pms.order.CustomerType.PaymentForm.class,
        PaymentDetailType.class,
        pms.order.ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted.class,
        HotelPaymentFormType.class,
        PaymentResponseType.class
})
public class PaymentFormType {

    @XmlElement(name = "Cash")
    protected PaymentFormType.Cash cash;
    @XmlElement(name = "LoyaltyRedemption")
    protected PaymentFormType.LoyaltyRedemption loyaltyRedemption;
    @XmlElement(name = "MiscChargeOrder")
    protected PaymentFormType.MiscChargeOrder miscChargeOrder;
    @XmlElement(name = "BankAcct")
    protected BankAcctType bankAcct;
    @XmlElement(name = "Ticket")
    protected PaymentFormType.Ticket ticket;
    @XmlElement(name = "Voucher")
    protected PaymentFormType.Voucher voucher;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "DirectBill")
    protected DirectBillType directBill;
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
     * ��ȡcash���Ե�ֵ��
     *
     * @return possible object is
     * {@link PaymentFormType.Cash }
     */
    public PaymentFormType.Cash getCash() {
        return cash;
    }

    /**
     * ����cash���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PaymentFormType.Cash }
     */
    public void setCash(PaymentFormType.Cash value) {
        this.cash = value;
    }

    /**
     * ��ȡloyaltyRedemption���Ե�ֵ��
     *
     * @return possible object is
     * {@link PaymentFormType.LoyaltyRedemption }
     */
    public PaymentFormType.LoyaltyRedemption getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * ����loyaltyRedemption���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PaymentFormType.LoyaltyRedemption }
     */
    public void setLoyaltyRedemption(PaymentFormType.LoyaltyRedemption value) {
        this.loyaltyRedemption = value;
    }

    /**
     * ��ȡmiscChargeOrder���Ե�ֵ��
     *
     * @return possible object is
     * {@link PaymentFormType.MiscChargeOrder }
     */
    public PaymentFormType.MiscChargeOrder getMiscChargeOrder() {
        return miscChargeOrder;
    }

    /**
     * ����miscChargeOrder���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PaymentFormType.MiscChargeOrder }
     */
    public void setMiscChargeOrder(PaymentFormType.MiscChargeOrder value) {
        this.miscChargeOrder = value;
    }

    /**
     * ��ȡbankAcct���Ե�ֵ��
     *
     * @return possible object is
     * {@link BankAcctType }
     */
    public BankAcctType getBankAcct() {
        return bankAcct;
    }

    /**
     * ����bankAcct���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BankAcctType }
     */
    public void setBankAcct(BankAcctType value) {
        this.bankAcct = value;
    }

    /**
     * ��ȡticket���Ե�ֵ��
     *
     * @return possible object is
     * {@link PaymentFormType.Ticket }
     */
    public PaymentFormType.Ticket getTicket() {
        return ticket;
    }

    /**
     * ����ticket���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PaymentFormType.Ticket }
     */
    public void setTicket(PaymentFormType.Ticket value) {
        this.ticket = value;
    }

    /**
     * ��ȡvoucher���Ե�ֵ��
     *
     * @return possible object is
     * {@link PaymentFormType.Voucher }
     */
    public PaymentFormType.Voucher getVoucher() {
        return voucher;
    }

    /**
     * ����voucher���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PaymentFormType.Voucher }
     */
    public void setVoucher(PaymentFormType.Voucher value) {
        this.voucher = value;
    }

    /**
     * ��ȡpaymentCard���Ե�ֵ��
     *
     * @return possible object is
     * {@link PaymentCardType }
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * ����paymentCard���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PaymentCardType }
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * ��ȡdirectBill���Ե�ֵ��
     *
     * @return possible object is
     * {@link DirectBillType }
     */
    public DirectBillType getDirectBill() {
        return directBill;
    }

    /**
     * ����directBill���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DirectBillType }
     */
    public void setDirectBill(DirectBillType value) {
        this.directBill = value;
    }

    /**
     * ��ȡshareSynchInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * ����shareSynchInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * ��ȡshareMarketInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * ����shareMarketInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * ��ȡcostCenterID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCostCenterID() {
        return costCenterID;
    }

    /**
     * ����costCenterID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCostCenterID(String value) {
        this.costCenterID = value;
    }

    /**
     * ��ȡrph���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRPH() {
        return rph;
    }

    /**
     * ����rph���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * ��ȡpaymentTransactionTypeCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPaymentTransactionTypeCode() {
        return paymentTransactionTypeCode;
    }

    /**
     * ����paymentTransactionTypeCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPaymentTransactionTypeCode(String value) {
        this.paymentTransactionTypeCode = value;
    }

    /**
     * ��ȡguaranteeIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGuaranteeIndicator() {
        return guaranteeIndicator;
    }

    /**
     * ����guaranteeIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGuaranteeIndicator(Boolean value) {
        this.guaranteeIndicator = value;
    }

    /**
     * ��ȡguaranteeTypeCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGuaranteeTypeCode() {
        return guaranteeTypeCode;
    }

    /**
     * ����guaranteeTypeCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGuaranteeTypeCode(String value) {
        this.guaranteeTypeCode = value;
    }

    /**
     * ��ȡguaranteeID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGuaranteeID() {
        return guaranteeID;
    }

    /**
     * ����guaranteeID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGuaranteeID(String value) {
        this.guaranteeID = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRemark(String value) {
        this.remark = value;
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
     *       &lt;attribute name="CashIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cash {

        @XmlAttribute(name = "CashIndicator")
        protected Boolean cashIndicator;

        /**
         * ��ȡcashIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isCashIndicator() {
            return cashIndicator;
        }

        /**
         * ����cashIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setCashIndicator(Boolean value) {
            this.cashIndicator = value;
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
     *         &lt;element name="LoyaltyCertificate" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="Format">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Paper"/>
     *                       &lt;enumeration value="Electronic"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PromotionVendorCode">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="RedemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loyaltyCertificate property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoyaltyCertificate().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentFormType.LoyaltyRedemption.LoyaltyCertificate }
         */
        public List<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate> getLoyaltyCertificate() {
            if (loyaltyCertificate == null) {
                loyaltyCertificate = new ArrayList<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate>();
            }
            return this.loyaltyCertificate;
        }

        /**
         * ��ȡcertificateNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCertificateNumber() {
            return certificateNumber;
        }

        /**
         * ����certificateNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCertificateNumber(String value) {
            this.certificateNumber = value;
        }

        /**
         * ��ȡmemberNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMemberNumber() {
            return memberNumber;
        }

        /**
         * ����memberNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMemberNumber(String value) {
            this.memberNumber = value;
        }

        /**
         * ��ȡprogramName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getProgramName() {
            return programName;
        }

        /**
         * ����programName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProgramName(String value) {
            this.programName = value;
        }

        /**
         * ��ȡpromotionCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPromotionCode() {
            return promotionCode;
        }

        /**
         * ����promotionCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPromotionCode(String value) {
            this.promotionCode = value;
        }

        /**
         * Gets the value of the promotionVendorCode property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionVendorCode().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPromotionVendorCode() {
            if (promotionVendorCode == null) {
                promotionVendorCode = new ArrayList<String>();
            }
            return this.promotionVendorCode;
        }

        /**
         * ��ȡredemptionQuantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getRedemptionQuantity() {
            return redemptionQuantity;
        }

        /**
         * ����redemptionQuantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setRedemptionQuantity(BigInteger value) {
            this.redemptionQuantity = value;
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
         *       &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="Format">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Paper"/>
         *             &lt;enumeration value="Electronic"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡidContext���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getIDContext() {
                return idContext;
            }

            /**
             * ����idContext���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIDContext(String value) {
                this.idContext = value;
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
             * ��ȡformat���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getFormat() {
                return format;
            }

            /**
             * ����format���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * ��ȡstatus���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getStatus() {
                return status;
            }

            /**
             * ����status���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setStatus(String value) {
                this.status = value;
            }

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
     *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CheckInhibitorType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="CheckDigit"/>
     *             &lt;enumeration value="InterlineAgreement"/>
     *             &lt;enumeration value="Both"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="CouponRPHs">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PaperMCO_ExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡticketNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTicketNumber() {
            return ticketNumber;
        }

        /**
         * ����ticketNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTicketNumber(String value) {
            this.ticketNumber = value;
        }

        /**
         * ��ȡoriginalTicketNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOriginalTicketNumber() {
            return originalTicketNumber;
        }

        /**
         * ����originalTicketNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOriginalTicketNumber(String value) {
            this.originalTicketNumber = value;
        }

        /**
         * ��ȡoriginalIssuePlace���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOriginalIssuePlace() {
            return originalIssuePlace;
        }

        /**
         * ����originalIssuePlace���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOriginalIssuePlace(String value) {
            this.originalIssuePlace = value;
        }

        /**
         * ��ȡoriginalIssueDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getOriginalIssueDate() {
            return originalIssueDate;
        }

        /**
         * ����originalIssueDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setOriginalIssueDate(XMLGregorianCalendar value) {
            this.originalIssueDate = value;
        }

        /**
         * ��ȡoriginalIssueIATA���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOriginalIssueIATA() {
            return originalIssueIATA;
        }

        /**
         * ����originalIssueIATA���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOriginalIssueIATA(String value) {
            this.originalIssueIATA = value;
        }

        /**
         * ��ȡoriginalPaymentForm���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOriginalPaymentForm() {
            return originalPaymentForm;
        }

        /**
         * ����originalPaymentForm���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOriginalPaymentForm(String value) {
            this.originalPaymentForm = value;
        }

        /**
         * ��ȡcheckInhibitorType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCheckInhibitorType() {
            return checkInhibitorType;
        }

        /**
         * ����checkInhibitorType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCheckInhibitorType(String value) {
            this.checkInhibitorType = value;
        }

        /**
         * Gets the value of the couponRPHs property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponRPHs property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponRPHs().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getCouponRPHs() {
            if (couponRPHs == null) {
                couponRPHs = new ArrayList<String>();
            }
            return this.couponRPHs;
        }

        /**
         * ��ȡpaperMCOExistInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isPaperMCOExistInd() {
            return paperMCOExistInd;
        }

        /**
         * ����paperMCOExistInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setPaperMCOExistInd(Boolean value) {
            this.paperMCOExistInd = value;
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
     *         &lt;element name="ConjunctionTicketNbr" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Coupons">
     *                   &lt;simpleType>
     *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CheckInhibitorType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="CheckDigit"/>
     *             &lt;enumeration value="InterlineAgreement"/>
     *             &lt;enumeration value="Both"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="CouponRPHs">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ReroutingType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="voluntary"/>
     *             &lt;enumeration value="involuntary"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ReasonForReroute" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conjunctionTicketNbr property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConjunctionTicketNbr().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentFormType.Ticket.ConjunctionTicketNbr }
         */
        public List<PaymentFormType.Ticket.ConjunctionTicketNbr> getConjunctionTicketNbr() {
            if (conjunctionTicketNbr == null) {
                conjunctionTicketNbr = new ArrayList<PaymentFormType.Ticket.ConjunctionTicketNbr>();
            }
            return this.conjunctionTicketNbr;
        }

        /**
         * ��ȡticketNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTicketNumber() {
            return ticketNumber;
        }

        /**
         * ����ticketNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTicketNumber(String value) {
            this.ticketNumber = value;
        }

        /**
         * ��ȡoriginalTicketNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOriginalTicketNumber() {
            return originalTicketNumber;
        }

        /**
         * ����originalTicketNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOriginalTicketNumber(String value) {
            this.originalTicketNumber = value;
        }

        /**
         * ��ȡoriginalIssuePlace���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOriginalIssuePlace() {
            return originalIssuePlace;
        }

        /**
         * ����originalIssuePlace���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOriginalIssuePlace(String value) {
            this.originalIssuePlace = value;
        }

        /**
         * ��ȡoriginalIssueDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getOriginalIssueDate() {
            return originalIssueDate;
        }

        /**
         * ����originalIssueDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setOriginalIssueDate(XMLGregorianCalendar value) {
            this.originalIssueDate = value;
        }

        /**
         * ��ȡoriginalIssueIATA���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOriginalIssueIATA() {
            return originalIssueIATA;
        }

        /**
         * ����originalIssueIATA���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOriginalIssueIATA(String value) {
            this.originalIssueIATA = value;
        }

        /**
         * ��ȡoriginalPaymentForm���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOriginalPaymentForm() {
            return originalPaymentForm;
        }

        /**
         * ����originalPaymentForm���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOriginalPaymentForm(String value) {
            this.originalPaymentForm = value;
        }

        /**
         * ��ȡcheckInhibitorType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCheckInhibitorType() {
            return checkInhibitorType;
        }

        /**
         * ����checkInhibitorType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCheckInhibitorType(String value) {
            this.checkInhibitorType = value;
        }

        /**
         * Gets the value of the couponRPHs property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponRPHs property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponRPHs().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getCouponRPHs() {
            if (couponRPHs == null) {
                couponRPHs = new ArrayList<String>();
            }
            return this.couponRPHs;
        }

        /**
         * ��ȡreroutingType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getReroutingType() {
            return reroutingType;
        }

        /**
         * ����reroutingType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setReroutingType(String value) {
            this.reroutingType = value;
        }

        /**
         * ��ȡreasonForReroute���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getReasonForReroute() {
            return reasonForReroute;
        }

        /**
         * ����reasonForReroute���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setReasonForReroute(String value) {
            this.reasonForReroute = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Coupons">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡvalue���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getValue() {
                return value;
            }

            /**
             * ����value���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the coupons property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the coupons property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCoupons().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
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
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BillingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SupplierIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ValueType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ElectronicIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡseriesCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSeriesCode() {
            return seriesCode;
        }

        /**
         * ����seriesCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSeriesCode(String value) {
            this.seriesCode = value;
        }

        /**
         * ��ȡbillingNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBillingNumber() {
            return billingNumber;
        }

        /**
         * ����billingNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBillingNumber(String value) {
            this.billingNumber = value;
        }

        /**
         * ��ȡsupplierIdentifier���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSupplierIdentifier() {
            return supplierIdentifier;
        }

        /**
         * ����supplierIdentifier���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSupplierIdentifier(String value) {
            this.supplierIdentifier = value;
        }

        /**
         * ��ȡidentifier���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getIdentifier() {
            return identifier;
        }

        /**
         * ����identifier���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIdentifier(String value) {
            this.identifier = value;
        }

        /**
         * ��ȡvalueType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValueType() {
            return valueType;
        }

        /**
         * ����valueType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValueType(String value) {
            this.valueType = value;
        }

        /**
         * ��ȡelectronicIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isElectronicIndicator() {
            return electronicIndicator;
        }

        /**
         * ����electronicIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setElectronicIndicator(Boolean value) {
            this.electronicIndicator = value;
        }

    }

}
