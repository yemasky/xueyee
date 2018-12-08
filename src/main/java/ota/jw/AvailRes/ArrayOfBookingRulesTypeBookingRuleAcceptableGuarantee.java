
package ota.jw.AvailRes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptableGuarantee" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GuaranteeType"&gt;
 *                 &lt;attribute name="GuaranteePolicyType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="NoGuaranteesAccepted"/&gt;
 *                       &lt;enumeration value="GuaranteesAccepted"/&gt;
 *                       &lt;enumeration value="GuaranteesRequired"/&gt;
 *                       &lt;enumeration value="DepositRequired"/&gt;
 *                       &lt;enumeration value="GuaranteesNotRequired"/&gt;
 *                       &lt;enumeration value="DepositNotRequired"/&gt;
 *                       &lt;enumeration value="PrepayRequired"/&gt;
 *                       &lt;enumeration value="PrepayNotRequired"/&gt;
 *                       &lt;enumeration value="NoDepositsAccepted"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="UnacceptablePaymentType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptableGuarantee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptableGuarantee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee }
     * 
     * 
     */
    public List<ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee> getAcceptableGuarantee() {
        if (acceptableGuarantee == null) {
            acceptableGuarantee = new ArrayList<ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee>();
        }
        return this.acceptableGuarantee;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GuaranteeType"&gt;
     *       &lt;attribute name="GuaranteePolicyType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="NoGuaranteesAccepted"/&gt;
     *             &lt;enumeration value="GuaranteesAccepted"/&gt;
     *             &lt;enumeration value="GuaranteesRequired"/&gt;
     *             &lt;enumeration value="DepositRequired"/&gt;
     *             &lt;enumeration value="GuaranteesNotRequired"/&gt;
     *             &lt;enumeration value="DepositNotRequired"/&gt;
     *             &lt;enumeration value="PrepayRequired"/&gt;
     *             &lt;enumeration value="PrepayNotRequired"/&gt;
     *             &lt;enumeration value="NoDepositsAccepted"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="UnacceptablePaymentType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AcceptableGuarantee
        extends GuaranteeType
    {

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
         * 获取guaranteePolicyType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteePolicyType() {
            return guaranteePolicyType;
        }

        /**
         * 设置guaranteePolicyType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteePolicyType(String value) {
            this.guaranteePolicyType = value;
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
         * 获取currencyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * 设置currencyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * 获取decimalPlaces属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * 设置decimalPlaces属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

        /**
         * 获取unacceptablePaymentType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnacceptablePaymentType() {
            return unacceptablePaymentType;
        }

        /**
         * 设置unacceptablePaymentType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnacceptablePaymentType(String value) {
            this.unacceptablePaymentType = value;
        }

    }

}
