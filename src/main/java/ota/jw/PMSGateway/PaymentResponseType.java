
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentAmount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="ApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentReferenceID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://www.opentravel.org/OTA/2003/05}ErrorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentResponseType", propOrder = {
    "paymentAmount",
    "paymentReferenceID",
    "error"
})
public class PaymentResponseType
    extends PaymentFormType
{

    @XmlElement(name = "PaymentAmount")
    protected PaymentResponseType.PaymentAmount paymentAmount;
    @XmlElement(name = "PaymentReferenceID")
    protected UniqueIDType paymentReferenceID;
    @XmlElement(name = "Error")
    protected ErrorType error;

    /**
     * 获取paymentAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponseType.PaymentAmount }
     *     
     */
    public PaymentResponseType.PaymentAmount getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * 设置paymentAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponseType.PaymentAmount }
     *     
     */
    public void setPaymentAmount(PaymentResponseType.PaymentAmount value) {
        this.paymentAmount = value;
    }

    /**
     * 获取paymentReferenceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getPaymentReferenceID() {
        return paymentReferenceID;
    }

    /**
     * 设置paymentReferenceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setPaymentReferenceID(UniqueIDType value) {
        this.paymentReferenceID = value;
    }

    /**
     * 获取error属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * 设置error属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setError(ErrorType value) {
        this.error = value;
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

    }

}
