package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>HotelPaymentFormType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HotelPaymentFormType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
 *       &lt;sequence>
 *         &lt;element name="MasterAccountUsage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BillingType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="EachPaysOwn"/>
 *                       &lt;enumeration value="SignRoomAndTax"/>
 *                       &lt;enumeration value="SignAllCharges"/>
 *                       &lt;enumeration value="SignRoomOnly"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="SignFoodAndBev" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPaymentFormType", propOrder = {
        "masterAccountUsage"
})
public class HotelPaymentFormType
        extends PaymentFormType {

    @XmlElement(name = "MasterAccountUsage")
    protected HotelPaymentFormType.MasterAccountUsage masterAccountUsage;

    /**
     * ��ȡmasterAccountUsage���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelPaymentFormType.MasterAccountUsage }
     */
    public HotelPaymentFormType.MasterAccountUsage getMasterAccountUsage() {
        return masterAccountUsage;
    }

    /**
     * ����masterAccountUsage���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelPaymentFormType.MasterAccountUsage }
     */
    public void setMasterAccountUsage(HotelPaymentFormType.MasterAccountUsage value) {
        this.masterAccountUsage = value;
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
     *       &lt;attribute name="BillingType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="EachPaysOwn"/>
     *             &lt;enumeration value="SignRoomAndTax"/>
     *             &lt;enumeration value="SignAllCharges"/>
     *             &lt;enumeration value="SignRoomOnly"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="SignFoodAndBev" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MasterAccountUsage {

        @XmlAttribute(name = "BillingType")
        protected String billingType;
        @XmlAttribute(name = "SignFoodAndBev")
        protected Boolean signFoodAndBev;

        /**
         * ��ȡbillingType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBillingType() {
            return billingType;
        }

        /**
         * ����billingType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBillingType(String value) {
            this.billingType = value;
        }

        /**
         * ��ȡsignFoodAndBev���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isSignFoodAndBev() {
            return signFoodAndBev;
        }

        /**
         * ����signFoodAndBev���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setSignFoodAndBev(Boolean value) {
            this.signFoodAndBev = value;
        }

    }

}
