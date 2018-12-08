package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRateTypeRate", propOrder = {"rate"})
public class ArrayOfRateTypeRate {
    @XmlElement(name = "Rate")
    protected List<ArrayOfRateTypeRate.Rate> rate;

    public List<ArrayOfRateTypeRate.Rate> getRate() {
        if (rate == null) {
            rate = new ArrayList<ArrayOfRateTypeRate.Rate>();
        }
        return this.rate;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"tpaExtensions"})
    public static class Rate extends AmountType {
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
