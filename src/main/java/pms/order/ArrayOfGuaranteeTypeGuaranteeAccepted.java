package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfGuaranteeTypeGuaranteeAccepted complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfGuaranteeTypeGuaranteeAccepted">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuaranteeAccepted" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
 *                 &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NameReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AddressReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PhoneReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="InterbankNbrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="BookingSourceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CorpDiscountNbrAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfGuaranteeTypeGuaranteeAccepted", propOrder = {
        "guaranteeAccepted"
})
public class ArrayOfGuaranteeTypeGuaranteeAccepted {

    @XmlElement(name = "GuaranteeAccepted")
    protected List<ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted> guaranteeAccepted;

    /**
     * Gets the value of the guaranteeAccepted property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteeAccepted property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteeAccepted().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted }
     */
    public List<ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted> getGuaranteeAccepted() {
        if (guaranteeAccepted == null) {
            guaranteeAccepted = new ArrayList<ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted>();
        }
        return this.guaranteeAccepted;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
     *       &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NameReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AddressReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PhoneReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="InterbankNbrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="BookingSourceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CorpDiscountNbrAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GuaranteeAccepted
            extends PaymentFormType {

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
         * ��ȡdefault���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isDefault() {
            return _default;
        }

        /**
         * ����default���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setDefault(Boolean value) {
            this._default = value;
        }

        /**
         * ��ȡnoCardHolderInfoReqInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isNoCardHolderInfoReqInd() {
            return noCardHolderInfoReqInd;
        }

        /**
         * ����noCardHolderInfoReqInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setNoCardHolderInfoReqInd(Boolean value) {
            this.noCardHolderInfoReqInd = value;
        }

        /**
         * ��ȡnameReqInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isNameReqInd() {
            return nameReqInd;
        }

        /**
         * ����nameReqInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setNameReqInd(Boolean value) {
            this.nameReqInd = value;
        }

        /**
         * ��ȡaddressReqInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isAddressReqInd() {
            return addressReqInd;
        }

        /**
         * ����addressReqInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setAddressReqInd(Boolean value) {
            this.addressReqInd = value;
        }

        /**
         * ��ȡphoneReqInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isPhoneReqInd() {
            return phoneReqInd;
        }

        /**
         * ����phoneReqInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setPhoneReqInd(Boolean value) {
            this.phoneReqInd = value;
        }

        /**
         * ��ȡinterbankNbrReqInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isInterbankNbrReqInd() {
            return interbankNbrReqInd;
        }

        /**
         * ����interbankNbrReqInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setInterbankNbrReqInd(Boolean value) {
            this.interbankNbrReqInd = value;
        }

        /**
         * ��ȡbookingSourceAllowedInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isBookingSourceAllowedInd() {
            return bookingSourceAllowedInd;
        }

        /**
         * ����bookingSourceAllowedInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setBookingSourceAllowedInd(Boolean value) {
            this.bookingSourceAllowedInd = value;
        }

        /**
         * ��ȡcorpDiscountNbrAllowedInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isCorpDiscountNbrAllowedInd() {
            return corpDiscountNbrAllowedInd;
        }

        /**
         * ����corpDiscountNbrAllowedInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setCorpDiscountNbrAllowedInd(Boolean value) {
            this.corpDiscountNbrAllowedInd = value;
        }

    }

}
