
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RailRateQualifyingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RailRateQualifyingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelPurpose" type="{http://www.opentravel.org/OTA/2003/05}TravelPurposeType" minOccurs="0"/&gt;
 *         &lt;element name="DiscountType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailRateQualifyingType", propOrder = {
    "travelPurpose",
    "discountType"
})
public class RailRateQualifyingType {

    @XmlElement(name = "TravelPurpose")
    protected TravelPurposeType travelPurpose;
    @XmlElement(name = "DiscountType")
    protected RailRateQualifyingType.DiscountType discountType;
    @XmlAttribute(name = "PromotionCode")
    protected String promotionCode;

    /**
     * 获取travelPurpose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelPurposeType }
     *     
     */
    public TravelPurposeType getTravelPurpose() {
        return travelPurpose;
    }

    /**
     * 设置travelPurpose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPurposeType }
     *     
     */
    public void setTravelPurpose(TravelPurposeType value) {
        this.travelPurpose = value;
    }

    /**
     * 获取discountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailRateQualifyingType.DiscountType }
     *     
     */
    public RailRateQualifyingType.DiscountType getDiscountType() {
        return discountType;
    }

    /**
     * 设置discountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailRateQualifyingType.DiscountType }
     *     
     */
    public void setDiscountType(RailRateQualifyingType.DiscountType value) {
        this.discountType = value;
    }

    /**
     * 获取promotionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * 设置promotionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DiscountType {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * 获取codeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * 设置codeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

    }

}
