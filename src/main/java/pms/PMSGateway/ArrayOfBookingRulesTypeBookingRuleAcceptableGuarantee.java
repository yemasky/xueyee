package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptableGuarantee" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GuaranteeType">
 *                 &lt;attribute name="GuaranteePolicyType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="NoGuaranteesAccepted"/>
 *                       &lt;enumeration value="GuaranteesAccepted"/>
 *                       &lt;enumeration value="GuaranteesRequired"/>
 *                       &lt;enumeration value="DepositRequired"/>
 *                       &lt;enumeration value="GuaranteesNotRequired"/>
 *                       &lt;enumeration value="DepositNotRequired"/>
 *                       &lt;enumeration value="PrepayRequired"/>
 *                       &lt;enumeration value="PrepayNotRequired"/>
 *                       &lt;enumeration value="NoDepositsAccepted"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="UnacceptablePaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee", propOrder = {
        "acceptableGuarantee"
})
public class ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee {

    @XmlElement(name = "AcceptableGuarantee")
    protected List<ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee> acceptableGuarantee;

    /**
     * Gets the value of the acceptableGuarantee property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptableGuarantee property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptableGuarantee().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee }
     */
    public List<ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee> getAcceptableGuarantee() {
        if (acceptableGuarantee == null) {
            acceptableGuarantee = new ArrayList<ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee>();
        }
        return this.acceptableGuarantee;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GuaranteeType">
     *       &lt;attribute name="GuaranteePolicyType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="NoGuaranteesAccepted"/>
     *             &lt;enumeration value="GuaranteesAccepted"/>
     *             &lt;enumeration value="GuaranteesRequired"/>
     *             &lt;enumeration value="DepositRequired"/>
     *             &lt;enumeration value="GuaranteesNotRequired"/>
     *             &lt;enumeration value="DepositNotRequired"/>
     *             &lt;enumeration value="PrepayRequired"/>
     *             &lt;enumeration value="PrepayNotRequired"/>
     *             &lt;enumeration value="NoDepositsAccepted"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="UnacceptablePaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AcceptableGuarantee
            extends GuaranteeType {

        @XmlAttribute(name = "GuaranteePolicyType")
        protected String guaranteePolicyType;
        @XmlAttribute(name = "PaymentType")
        protected String paymentType;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "UnacceptablePaymentType")
        protected String unacceptablePaymentType;

        /**
         * ��ȡguaranteePolicyType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getGuaranteePolicyType() {
            return guaranteePolicyType;
        }

        /**
         * ����guaranteePolicyType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGuaranteePolicyType(String value) {
            this.guaranteePolicyType = value;
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
         * ��ȡcurrencyCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * ����currencyCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * ��ȡdecimalPlaces���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * ����decimalPlaces���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

        /**
         * ��ȡunacceptablePaymentType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnacceptablePaymentType() {
            return unacceptablePaymentType;
        }

        /**
         * ����unacceptablePaymentType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnacceptablePaymentType(String value) {
            this.unacceptablePaymentType = value;
        }

    }

}
