package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfRateTypeRate complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfRateTypeRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountType">
 *                 &lt;sequence>
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="RateMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CachedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RateSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomPricingType" type="{http://www.opentravel.org/OTA/2003/05}PricingType" />
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
@XmlType(name = "ArrayOfRateTypeRate", propOrder = {
        "rate"
})
public class ArrayOfRateTypeRate {

    @XmlElement(name = "Rate")
    protected List<ArrayOfRateTypeRate.Rate> rate;

    /**
     * Gets the value of the rate property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRateTypeRate.Rate }
     */
    public List<ArrayOfRateTypeRate.Rate> getRate() {
        if (rate == null) {
            rate = new ArrayList<ArrayOfRateTypeRate.Rate>();
        }
        return this.rate;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountType">
     *       &lt;sequence>
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="RateMode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CachedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RateSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RoomPricingType" type="{http://www.opentravel.org/OTA/2003/05}PricingType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "tpaExtensions"
    })
    public static class Rate
            extends AmountType {

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
         * ��ȡtpaExtensions���Ե�ֵ��
         *
         * @return possible object is
         * {@link TPAExtensionsType }
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * ����tpaExtensions���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TPAExtensionsType }
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

        /**
         * ��ȡduration���Ե�ֵ��
         *
         * @return possible object is
         * {@link Duration }
         */
        public Duration getDuration() {
            return duration;
        }

        /**
         * ����duration���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Duration }
         */
        public void setDuration(Duration value) {
            this.duration = value;
        }

        /**
         * ��ȡrateMode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRateMode() {
            return rateMode;
        }

        /**
         * ����rateMode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRateMode(String value) {
            this.rateMode = value;
        }

        /**
         * ��ȡcachedIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isCachedIndicator() {
            return cachedIndicator;
        }

        /**
         * ����cachedIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setCachedIndicator(Boolean value) {
            this.cachedIndicator = value;
        }

        /**
         * ��ȡrateSource���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRateSource() {
            return rateSource;
        }

        /**
         * ����rateSource���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRateSource(String value) {
            this.rateSource = value;
        }

        /**
         * ��ȡrateTypeCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRateTypeCode() {
            return rateTypeCode;
        }

        /**
         * ����rateTypeCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRateTypeCode(String value) {
            this.rateTypeCode = value;
        }

        /**
         * ��ȡroomPricingType���Ե�ֵ��
         *
         * @return possible object is
         * {@link PricingType }
         */
        public PricingType getRoomPricingType() {
            return roomPricingType;
        }

        /**
         * ����roomPricingType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PricingType }
         */
        public void setRoomPricingType(PricingType value) {
            this.roomPricingType = value;
        }

    }

}
