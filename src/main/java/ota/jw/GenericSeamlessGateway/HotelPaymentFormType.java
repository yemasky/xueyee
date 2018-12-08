
package ota.jw.GenericSeamlessGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelPaymentFormType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelPaymentFormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MasterAccountUsage" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="BillingType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="EachPaysOwn"/&gt;
 *                       &lt;enumeration value="SignRoomAndTax"/&gt;
 *                       &lt;enumeration value="SignAllCharges"/&gt;
 *                       &lt;enumeration value="SignRoomOnly"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="SignFoodAndBev" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPaymentFormType", propOrder = {
    "masterAccountUsage"
})
public class HotelPaymentFormType
    extends PaymentFormType
{

    @XmlElement(name = "MasterAccountUsage")
    protected HotelPaymentFormType.MasterAccountUsage masterAccountUsage;

    /**
     * 获取masterAccountUsage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelPaymentFormType.MasterAccountUsage }
     *     
     */
    public HotelPaymentFormType.MasterAccountUsage getMasterAccountUsage() {
        return masterAccountUsage;
    }

    /**
     * 设置masterAccountUsage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPaymentFormType.MasterAccountUsage }
     *     
     */
    public void setMasterAccountUsage(HotelPaymentFormType.MasterAccountUsage value) {
        this.masterAccountUsage = value;
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
     *       &lt;attribute name="BillingType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="EachPaysOwn"/&gt;
     *             &lt;enumeration value="SignRoomAndTax"/&gt;
     *             &lt;enumeration value="SignAllCharges"/&gt;
     *             &lt;enumeration value="SignRoomOnly"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="SignFoodAndBev" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MasterAccountUsage {

        @XmlAttribute(name = "BillingType")
        protected String billingType;
        @XmlAttribute(name = "SignFoodAndBev")
        protected Boolean signFoodAndBev;

        /**
         * 获取billingType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingType() {
            return billingType;
        }

        /**
         * 设置billingType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingType(String value) {
            this.billingType = value;
        }

        /**
         * 获取signFoodAndBev属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSignFoodAndBev() {
            return signFoodAndBev;
        }

        /**
         * 设置signFoodAndBev属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSignFoodAndBev(Boolean value) {
            this.signFoodAndBev = value;
        }

    }

}
