package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>PaymentResponseType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="PaymentResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
 *       &lt;sequence>
 *         &lt;element name="PaymentAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="ApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentReferenceID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://www.opentravel.org/OTA/2003/05}ErrorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentResponseType", propOrder = {
        "paymentAmount",
        "paymentReferenceID",
        "error"
})
public class PaymentResponseType
        extends PaymentFormType {

    @XmlElement(name = "PaymentAmount")
    protected PaymentResponseType.PaymentAmount paymentAmount;
    @XmlElement(name = "PaymentReferenceID")
    protected UniqueIDType paymentReferenceID;
    @XmlElement(name = "Error")
    protected ErrorType error;

    /**
     * ��ȡpaymentAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link PaymentResponseType.PaymentAmount }
     */
    public PaymentResponseType.PaymentAmount getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * ����paymentAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PaymentResponseType.PaymentAmount }
     */
    public void setPaymentAmount(PaymentResponseType.PaymentAmount value) {
        this.paymentAmount = value;
    }

    /**
     * ��ȡpaymentReferenceID���Ե�ֵ��
     *
     * @return possible object is
     * {@link UniqueIDType }
     */
    public UniqueIDType getPaymentReferenceID() {
        return paymentReferenceID;
    }

    /**
     * ����paymentReferenceID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link UniqueIDType }
     */
    public void setPaymentReferenceID(UniqueIDType value) {
        this.paymentReferenceID = value;
    }

    /**
     * ��ȡerror���Ե�ֵ��
     *
     * @return possible object is
     * {@link ErrorType }
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * ����error���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ErrorType }
     */
    public void setError(ErrorType value) {
        this.error = value;
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

    }

}
