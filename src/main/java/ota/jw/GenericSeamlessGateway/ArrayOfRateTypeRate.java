
package ota.jw.GenericSeamlessGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>ArrayOfRateTypeRate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRateTypeRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                 &lt;attribute name="RateMode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CachedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RateSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RoomPricingType" type="{http://www.opentravel.org/OTA/2003/05}PricingType" /&gt;
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
@XmlType(name = "ArrayOfRateTypeRate", propOrder = {
    "rate"
})
public class ArrayOfRateTypeRate {

    @XmlElement(name = "Rate")
    protected List<ArrayOfRateTypeRate.Rate> rate;

    /**
     * Gets the value of the rate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRateTypeRate.Rate }
     * 
     * 
     */
    public List<ArrayOfRateTypeRate.Rate> getRate() {
        if (rate == null) {
            rate = new ArrayList<ArrayOfRateTypeRate.Rate>();
        }
        return this.rate;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *       &lt;attribute name="RateMode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CachedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RateSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RoomPricingType" type="{http://www.opentravel.org/OTA/2003/05}PricingType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpaExtensions"
    })
    public static class Rate
        extends AmountType
    {

        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "Duration")
        protected Duration duration;
        @XmlAttribute(name = "RateMode")
        protected String rateMode;
        @XmlAttribute(name = "CachedIndicator")
        protected Boolean cachedIndicator;
        @XmlAttribute(name = "RateSource")
        protected String rateSource;
        @XmlAttribute(name = "RateTypeCode")
        protected String rateTypeCode;
        @XmlAttribute(name = "RoomPricingType")
        protected PricingType roomPricingType;

        /**
         * 获取tpaExtensions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensionsType }
         *     
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * 设置tpaExtensions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensionsType }
         *     
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDuration(Duration value) {
            this.duration = value;
        }

        /**
         * 获取rateMode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateMode() {
            return rateMode;
        }

        /**
         * 设置rateMode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateMode(String value) {
            this.rateMode = value;
        }

        /**
         * 获取cachedIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCachedIndicator() {
            return cachedIndicator;
        }

        /**
         * 设置cachedIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCachedIndicator(Boolean value) {
            this.cachedIndicator = value;
        }

        /**
         * 获取rateSource属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateSource() {
            return rateSource;
        }

        /**
         * 设置rateSource属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateSource(String value) {
            this.rateSource = value;
        }

        /**
         * 获取rateTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateTypeCode() {
            return rateTypeCode;
        }

        /**
         * 设置rateTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateTypeCode(String value) {
            this.rateTypeCode = value;
        }

        /**
         * 获取roomPricingType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PricingType }
         *     
         */
        public PricingType getRoomPricingType() {
            return roomPricingType;
        }

        /**
         * 设置roomPricingType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PricingType }
         *     
         */
        public void setRoomPricingType(PricingType value) {
            this.roomPricingType = value;
        }

    }

}
