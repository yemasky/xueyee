
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCruiseGuestInfoTypePaymentOption complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCruiseGuestInfoTypePaymentOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentOption" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType"&gt;
 *                 &lt;attribute name="ExtendedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="PaymentPurpose"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="GiftOrder"/&gt;
 *                       &lt;enumeration value="Reservation"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ExtendedDepositDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfCruiseGuestInfoTypePaymentOption", propOrder = {
    "paymentOption"
})
public class ArrayOfCruiseGuestInfoTypePaymentOption {

    @XmlElement(name = "PaymentOption")
    protected List<ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption> paymentOption;

    /**
     * Gets the value of the paymentOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption }
     * 
     * 
     */
    public List<ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption> getPaymentOption() {
        if (paymentOption == null) {
            paymentOption = new ArrayList<ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption>();
        }
        return this.paymentOption;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType"&gt;
     *       &lt;attribute name="ExtendedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="PaymentPurpose"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="GiftOrder"/&gt;
     *             &lt;enumeration value="Reservation"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ExtendedDepositDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PaymentOption
        extends PaymentDetailType
    {

        @XmlAttribute(name = "ExtendedIndicator")
        protected Boolean extendedIndicator;
        @XmlAttribute(name = "PaymentPurpose")
        protected String paymentPurpose;
        @XmlAttribute(name = "ExtendedDepositDate")
        protected String extendedDepositDate;
        @XmlAttribute(name = "ReferenceNumber")
        protected String referenceNumber;

        /**
         * 获取extendedIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExtendedIndicator() {
            return extendedIndicator;
        }

        /**
         * 设置extendedIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExtendedIndicator(Boolean value) {
            this.extendedIndicator = value;
        }

        /**
         * 获取paymentPurpose属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentPurpose() {
            return paymentPurpose;
        }

        /**
         * 设置paymentPurpose属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentPurpose(String value) {
            this.paymentPurpose = value;
        }

        /**
         * 获取extendedDepositDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedDepositDate() {
            return extendedDepositDate;
        }

        /**
         * 设置extendedDepositDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedDepositDate(String value) {
            this.extendedDepositDate = value;
        }

        /**
         * 获取referenceNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceNumber() {
            return referenceNumber;
        }

        /**
         * 设置referenceNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceNumber(String value) {
            this.referenceNumber = value;
        }

    }

}
