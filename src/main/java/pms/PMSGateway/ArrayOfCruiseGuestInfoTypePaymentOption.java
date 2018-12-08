package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfCruiseGuestInfoTypePaymentOption complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfCruiseGuestInfoTypePaymentOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentOption" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
 *                 &lt;attribute name="ExtendedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PaymentPurpose">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="GiftOrder"/>
 *                       &lt;enumeration value="Reservation"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ExtendedDepositDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
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
@XmlType(name = "ArrayOfCruiseGuestInfoTypePaymentOption", propOrder = {
        "paymentOption"
})
public class ArrayOfCruiseGuestInfoTypePaymentOption {

    @XmlElement(name = "PaymentOption")
    protected List<ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption> paymentOption;

    /**
     * Gets the value of the paymentOption property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentOption property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentOption().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption }
     */
    public List<ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption> getPaymentOption() {
        if (paymentOption == null) {
            paymentOption = new ArrayList<ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption>();
        }
        return this.paymentOption;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType">
     *       &lt;attribute name="ExtendedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PaymentPurpose">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="GiftOrder"/>
     *             &lt;enumeration value="Reservation"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ExtendedDepositDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PaymentOption
            extends PaymentDetailType {

        @XmlAttribute(name = "ExtendedIndicator")
        protected Boolean extendedIndicator;
        @XmlAttribute(name = "PaymentPurpose")
        protected String paymentPurpose;
        @XmlAttribute(name = "ExtendedDepositDate")
        protected String extendedDepositDate;
        @XmlAttribute(name = "ReferenceNumber")
        protected String referenceNumber;

        /**
         * ��ȡextendedIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isExtendedIndicator() {
            return extendedIndicator;
        }

        /**
         * ����extendedIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setExtendedIndicator(Boolean value) {
            this.extendedIndicator = value;
        }

        /**
         * ��ȡpaymentPurpose���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPaymentPurpose() {
            return paymentPurpose;
        }

        /**
         * ����paymentPurpose���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPaymentPurpose(String value) {
            this.paymentPurpose = value;
        }

        /**
         * ��ȡextendedDepositDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getExtendedDepositDate() {
            return extendedDepositDate;
        }

        /**
         * ����extendedDepositDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setExtendedDepositDate(String value) {
            this.extendedDepositDate = value;
        }

        /**
         * ��ȡreferenceNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getReferenceNumber() {
            return referenceNumber;
        }

        /**
         * ����referenceNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setReferenceNumber(String value) {
            this.referenceNumber = value;
        }

    }

}
