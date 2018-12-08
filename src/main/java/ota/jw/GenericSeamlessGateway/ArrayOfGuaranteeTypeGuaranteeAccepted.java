
package ota.jw.GenericSeamlessGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfGuaranteeTypeGuaranteeAccepted complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGuaranteeTypeGuaranteeAccepted"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuaranteeAccepted" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
 *                 &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="NameReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AddressReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="PhoneReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="InterbankNbrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="BookingSourceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="CorpDiscountNbrAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "ArrayOfGuaranteeTypeGuaranteeAccepted", propOrder = {
    "guaranteeAccepted"
})
public class ArrayOfGuaranteeTypeGuaranteeAccepted {

    @XmlElement(name = "GuaranteeAccepted")
    protected List<ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted> guaranteeAccepted;

    /**
     * Gets the value of the guaranteeAccepted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteeAccepted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteeAccepted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted }
     * 
     * 
     */
    public List<ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted> getGuaranteeAccepted() {
        if (guaranteeAccepted == null) {
            guaranteeAccepted = new ArrayList<ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted>();
        }
        return this.guaranteeAccepted;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
     *       &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="NameReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AddressReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="PhoneReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="InterbankNbrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="BookingSourceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="CorpDiscountNbrAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GuaranteeAccepted
        extends PaymentFormType
    {

        @XmlAttribute(name = "Default")
        protected Boolean _default;
        @XmlAttribute(name = "NoCardHolderInfoReqInd")
        protected Boolean noCardHolderInfoReqInd;
        @XmlAttribute(name = "NameReqInd")
        protected Boolean nameReqInd;
        @XmlAttribute(name = "AddressReqInd")
        protected Boolean addressReqInd;
        @XmlAttribute(name = "PhoneReqInd")
        protected Boolean phoneReqInd;
        @XmlAttribute(name = "InterbankNbrReqInd")
        protected Boolean interbankNbrReqInd;
        @XmlAttribute(name = "BookingSourceAllowedInd")
        protected Boolean bookingSourceAllowedInd;
        @XmlAttribute(name = "CorpDiscountNbrAllowedInd")
        protected Boolean corpDiscountNbrAllowedInd;

        /**
         * 获取default属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefault() {
            return _default;
        }

        /**
         * 设置default属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefault(Boolean value) {
            this._default = value;
        }

        /**
         * 获取noCardHolderInfoReqInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoCardHolderInfoReqInd() {
            return noCardHolderInfoReqInd;
        }

        /**
         * 设置noCardHolderInfoReqInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoCardHolderInfoReqInd(Boolean value) {
            this.noCardHolderInfoReqInd = value;
        }

        /**
         * 获取nameReqInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNameReqInd() {
            return nameReqInd;
        }

        /**
         * 设置nameReqInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNameReqInd(Boolean value) {
            this.nameReqInd = value;
        }

        /**
         * 获取addressReqInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAddressReqInd() {
            return addressReqInd;
        }

        /**
         * 设置addressReqInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAddressReqInd(Boolean value) {
            this.addressReqInd = value;
        }

        /**
         * 获取phoneReqInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPhoneReqInd() {
            return phoneReqInd;
        }

        /**
         * 设置phoneReqInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPhoneReqInd(Boolean value) {
            this.phoneReqInd = value;
        }

        /**
         * 获取interbankNbrReqInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInterbankNbrReqInd() {
            return interbankNbrReqInd;
        }

        /**
         * 设置interbankNbrReqInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInterbankNbrReqInd(Boolean value) {
            this.interbankNbrReqInd = value;
        }

        /**
         * 获取bookingSourceAllowedInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBookingSourceAllowedInd() {
            return bookingSourceAllowedInd;
        }

        /**
         * 设置bookingSourceAllowedInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBookingSourceAllowedInd(Boolean value) {
            this.bookingSourceAllowedInd = value;
        }

        /**
         * 获取corpDiscountNbrAllowedInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCorpDiscountNbrAllowedInd() {
            return corpDiscountNbrAllowedInd;
        }

        /**
         * 设置corpDiscountNbrAllowedInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorpDiscountNbrAllowedInd(Boolean value) {
            this.corpDiscountNbrAllowedInd = value;
        }

    }

}
