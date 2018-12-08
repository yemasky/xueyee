
package ota.jw.ARIPmsGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentAmount" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="ApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RefundCalcMethod"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="System"/&gt;
 *                       &lt;enumeration value="Manual"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SplitPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AuthorizedDays" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="PrimaryPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailType", propOrder = {
    "paymentAmount",
    "commission"
})
public class PaymentDetailType
    extends PaymentFormType
{

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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailType.PaymentAmount }
     * 
     * 
     */
    public List<PaymentDetailType.PaymentAmount> getPaymentAmount() {
        if (paymentAmount == null) {
            paymentAmount = new ArrayList<PaymentDetailType.PaymentAmount>();
        }
        return this.paymentAmount;
    }

    /**
     * 获取commission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * 设置commission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * 获取paymentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 设置paymentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * 获取splitPaymentInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitPaymentInd() {
        return splitPaymentInd;
    }

    /**
     * 设置splitPaymentInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitPaymentInd(Boolean value) {
        this.splitPaymentInd = value;
    }

    /**
     * 获取authorizedDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthorizedDays() {
        return authorizedDays;
    }

    /**
     * 设置authorizedDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthorizedDays(BigInteger value) {
        this.authorizedDays = value;
    }

    /**
     * 获取primaryPaymentInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryPaymentInd() {
        return primaryPaymentInd;
    }

    /**
     * 设置primaryPaymentInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryPaymentInd(Boolean value) {
        this.primaryPaymentInd = value;
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
     *       &lt;attribute name="ApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RefundCalcMethod"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="System"/&gt;
     *             &lt;enumeration value="Manual"/&gt;
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
    public static class PaymentAmount {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "ApprovalCode")
        protected String approvalCode;
        @XmlAttribute(name = "RefundCalcMethod")
        protected String refundCalcMethod;

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
         * 获取approvalCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApprovalCode() {
            return approvalCode;
        }

        /**
         * 设置approvalCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApprovalCode(String value) {
            this.approvalCode = value;
        }

        /**
         * 获取refundCalcMethod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefundCalcMethod() {
            return refundCalcMethod;
        }

        /**
         * 设置refundCalcMethod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefundCalcMethod(String value) {
            this.refundCalcMethod = value;
        }

    }

}
