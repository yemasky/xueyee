package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>PaymentDetailType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="PaymentDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
 *       &lt;sequence>
 *         &lt;element name="PaymentAmount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="ApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RefundCalcMethod">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="System"/>
 *                       &lt;enumeration value="Manual"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SplitPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AuthorizedDays" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PrimaryPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailType", propOrder = {
        "paymentAmount",
        "commission"
})
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption.class
})
public class PaymentDetailType
        extends PaymentFormType {

    @XmlElement(name = "PaymentAmount")
    protected List<PaymentDetailType.PaymentAmount> paymentAmount;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlAttribute(name = "PaymentType")
    protected String paymentType;
    @XmlAttribute(name = "SplitPaymentInd")
    protected Boolean splitPaymentInd;
    @XmlAttribute(name = "AuthorizedDays")
    protected BigInteger authorizedDays;
    @XmlAttribute(name = "PrimaryPaymentInd")
    protected Boolean primaryPaymentInd;

    /**
     * Gets the value of the paymentAmount property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentAmount property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentAmount().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailType.PaymentAmount }
     */
    public List<PaymentDetailType.PaymentAmount> getPaymentAmount() {
        if (paymentAmount == null) {
            paymentAmount = new ArrayList<PaymentDetailType.PaymentAmount>();
        }
        return this.paymentAmount;
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
     * ��ȡpaymentType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * ����paymentType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * ��ȡsplitPaymentInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSplitPaymentInd() {
        return splitPaymentInd;
    }

    /**
     * ����splitPaymentInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSplitPaymentInd(Boolean value) {
        this.splitPaymentInd = value;
    }

    /**
     * ��ȡauthorizedDays���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getAuthorizedDays() {
        return authorizedDays;
    }

    /**
     * ����authorizedDays���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setAuthorizedDays(BigInteger value) {
        this.authorizedDays = value;
    }

    /**
     * ��ȡprimaryPaymentInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPrimaryPaymentInd() {
        return primaryPaymentInd;
    }

    /**
     * ����primaryPaymentInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPrimaryPaymentInd(Boolean value) {
        this.primaryPaymentInd = value;
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
     *       &lt;attribute name="ApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RefundCalcMethod">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="System"/>
     *             &lt;enumeration value="Manual"/>
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
    public static class PaymentAmount {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "ApprovalCode")
        protected String approvalCode;
        @XmlAttribute(name = "RefundCalcMethod")
        protected String refundCalcMethod;

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
         * ��ȡapprovalCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getApprovalCode() {
            return approvalCode;
        }

        /**
         * ����approvalCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setApprovalCode(String value) {
            this.approvalCode = value;
        }

        /**
         * ��ȡrefundCalcMethod���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRefundCalcMethod() {
            return refundCalcMethod;
        }

        /**
         * ����refundCalcMethod���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRefundCalcMethod(String value) {
            this.refundCalcMethod = value;
        }

    }

}
