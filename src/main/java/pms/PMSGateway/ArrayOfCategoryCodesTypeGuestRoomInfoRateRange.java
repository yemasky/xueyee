package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfCategoryCodesTypeGuestRoomInfoRateRange complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfCategoryCodesTypeGuestRoomInfoRateRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateRange" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *               &lt;/restriction>
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
@XmlType(name = "ArrayOfCategoryCodesTypeGuestRoomInfoRateRange", propOrder = {
        "rateRange"
})
public class ArrayOfCategoryCodesTypeGuestRoomInfoRateRange {

    @XmlElement(name = "RateRange")
    protected List<ArrayOfCategoryCodesTypeGuestRoomInfoRateRange.RateRange> rateRange;

    /**
     * Gets the value of the rateRange property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateRange property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateRange().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCategoryCodesTypeGuestRoomInfoRateRange.RateRange }
     */
    public List<ArrayOfCategoryCodesTypeGuestRoomInfoRateRange.RateRange> getRateRange() {
        if (rateRange == null) {
            rateRange = new ArrayList<ArrayOfCategoryCodesTypeGuestRoomInfoRateRange.RateRange>();
        }
        return this.rateRange;
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
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateRange {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "MinRate")
        protected BigDecimal minRate;
        @XmlAttribute(name = "MaxRate")
        protected BigDecimal maxRate;
        @XmlAttribute(name = "FixedRate")
        protected BigDecimal fixedRate;
        @XmlAttribute(name = "RateTimeUnit")
        protected TimeUnitType rateTimeUnit;

        /**
         * ��ȡstart���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStart() {
            return start;
        }

        /**
         * ����start���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * ��ȡduration���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDuration() {
            return duration;
        }

        /**
         * ����duration���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * ��ȡend���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEnd() {
            return end;
        }

        /**
         * ����end���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * ��ȡminRate���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getMinRate() {
            return minRate;
        }

        /**
         * ����minRate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setMinRate(BigDecimal value) {
            this.minRate = value;
        }

        /**
         * ��ȡmaxRate���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getMaxRate() {
            return maxRate;
        }

        /**
         * ����maxRate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setMaxRate(BigDecimal value) {
            this.maxRate = value;
        }

        /**
         * ��ȡfixedRate���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getFixedRate() {
            return fixedRate;
        }

        /**
         * ����fixedRate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setFixedRate(BigDecimal value) {
            this.fixedRate = value;
        }

        /**
         * ��ȡrateTimeUnit���Ե�ֵ��
         *
         * @return possible object is
         * {@link TimeUnitType }
         */
        public TimeUnitType getRateTimeUnit() {
            return rateTimeUnit;
        }

        /**
         * ����rateTimeUnit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TimeUnitType }
         */
        public void setRateTimeUnit(TimeUnitType value) {
            this.rateTimeUnit = value;
        }

    }

}
