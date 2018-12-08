package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfCruiseReservationTypePaymentDue complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfCruiseReservationTypePaymentDue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentDue" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="PaymentNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfCruiseReservationTypePaymentDue", propOrder = {
        "paymentDue"
})
public class ArrayOfCruiseReservationTypePaymentDue {

    @XmlElement(name = "PaymentDue")
    protected List<ArrayOfCruiseReservationTypePaymentDue.PaymentDue> paymentDue;

    /**
     * Gets the value of the paymentDue property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDue property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDue().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCruiseReservationTypePaymentDue.PaymentDue }
     */
    public List<ArrayOfCruiseReservationTypePaymentDue.PaymentDue> getPaymentDue() {
        if (paymentDue == null) {
            paymentDue = new ArrayList<ArrayOfCruiseReservationTypePaymentDue.PaymentDue>();
        }
        return this.paymentDue;
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
     *       &lt;attribute name="PaymentNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PaymentDue {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "PaymentNumber")
        protected BigInteger paymentNumber;
        @XmlAttribute(name = "DueDate")
        protected String dueDate;

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
         * ��ȡpaymentNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPaymentNumber() {
            return paymentNumber;
        }

        /**
         * ����paymentNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPaymentNumber(BigInteger value) {
            this.paymentNumber = value;
        }

        /**
         * ��ȡdueDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDueDate() {
            return dueDate;
        }

        /**
         * ����dueDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDueDate(String value) {
            this.dueDate = value;
        }

    }

}
