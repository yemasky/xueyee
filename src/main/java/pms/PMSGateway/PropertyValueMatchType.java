package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>PropertyValueMatchType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="PropertyValueMatchType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfoType">
 *       &lt;sequence>
 *         &lt;element name="SearchValueMatch" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Match" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Relevance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Amenities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPropertyValueMatchTypeAmenity" minOccurs="0"/>
 *         &lt;element name="RateRange" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="RateInfoNotAvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyValueMatchType", propOrder = {
        "searchValueMatch",
        "amenities",
        "rateRange"
})
public class PropertyValueMatchType
        extends BasicPropertyInfoType {

    @XmlElement(name = "SearchValueMatch")
    protected List<PropertyValueMatchType.SearchValueMatch> searchValueMatch;
    @XmlElement(name = "Amenities")
    protected ArrayOfPropertyValueMatchTypeAmenity amenities;
    @XmlElement(name = "RateRange")
    protected PropertyValueMatchType.RateRange rateRange;
    @XmlAttribute(name = "MoreDataEchoToken")
    protected String moreDataEchoToken;
    @XmlAttribute(name = "SameCountryInd")
    protected Boolean sameCountryInd;
    @XmlAttribute(name = "AvailabilityStatus")
    protected RateIndicatorType availabilityStatus;

    /**
     * Gets the value of the searchValueMatch property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchValueMatch property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchValueMatch().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyValueMatchType.SearchValueMatch }
     */
    public List<PropertyValueMatchType.SearchValueMatch> getSearchValueMatch() {
        if (searchValueMatch == null) {
            searchValueMatch = new ArrayList<PropertyValueMatchType.SearchValueMatch>();
        }
        return this.searchValueMatch;
    }

    /**
     * ��ȡamenities���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfPropertyValueMatchTypeAmenity }
     */
    public ArrayOfPropertyValueMatchTypeAmenity getAmenities() {
        return amenities;
    }

    /**
     * ����amenities���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfPropertyValueMatchTypeAmenity }
     */
    public void setAmenities(ArrayOfPropertyValueMatchTypeAmenity value) {
        this.amenities = value;
    }

    /**
     * ��ȡrateRange���Ե�ֵ��
     *
     * @return possible object is
     * {@link PropertyValueMatchType.RateRange }
     */
    public PropertyValueMatchType.RateRange getRateRange() {
        return rateRange;
    }

    /**
     * ����rateRange���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PropertyValueMatchType.RateRange }
     */
    public void setRateRange(PropertyValueMatchType.RateRange value) {
        this.rateRange = value;
    }

    /**
     * ��ȡmoreDataEchoToken���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMoreDataEchoToken() {
        return moreDataEchoToken;
    }

    /**
     * ����moreDataEchoToken���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMoreDataEchoToken(String value) {
        this.moreDataEchoToken = value;
    }

    /**
     * ��ȡsameCountryInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSameCountryInd() {
        return sameCountryInd;
    }

    /**
     * ����sameCountryInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSameCountryInd(Boolean value) {
        this.sameCountryInd = value;
    }

    /**
     * ��ȡavailabilityStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link RateIndicatorType }
     */
    public RateIndicatorType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * ����availabilityStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RateIndicatorType }
     */
    public void setAvailabilityStatus(RateIndicatorType value) {
        this.availabilityStatus = value;
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
     *       &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="RateInfoNotAvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateRange {

        @XmlAttribute(name = "MinRate")
        protected BigDecimal minRate;
        @XmlAttribute(name = "MaxRate")
        protected BigDecimal maxRate;
        @XmlAttribute(name = "FixedRate")
        protected BigDecimal fixedRate;
        @XmlAttribute(name = "RateTimeUnit")
        protected TimeUnitType rateTimeUnit;
        @XmlAttribute(name = "InfoSource")
        protected String infoSource;
        @XmlAttribute(name = "TaxRate")
        protected BigDecimal taxRate;
        @XmlAttribute(name = "RateInfoNotAvailableInd")
        protected Boolean rateInfoNotAvailableInd;

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

        /**
         * ��ȡinfoSource���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * ����infoSource���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * ��ȡtaxRate���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTaxRate() {
            return taxRate;
        }

        /**
         * ����taxRate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTaxRate(BigDecimal value) {
            this.taxRate = value;
        }

        /**
         * ��ȡrateInfoNotAvailableInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isRateInfoNotAvailableInd() {
            return rateInfoNotAvailableInd;
        }

        /**
         * ����rateInfoNotAvailableInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setRateInfoNotAvailableInd(Boolean value) {
            this.rateInfoNotAvailableInd = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Match" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Relevance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    public static class SearchValueMatch {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Match", required = true)
        protected boolean match;
        @XmlAttribute(name = "Relevance")
        protected BigDecimal relevance;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * ��ȡmatch���Ե�ֵ��
         */
        public boolean isMatch() {
            return match;
        }

        /**
         * ����match���Ե�ֵ��
         */
        public void setMatch(boolean value) {
            this.match = value;
        }

        /**
         * ��ȡrelevance���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getRelevance() {
            return relevance;
        }

        /**
         * ����relevance���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setRelevance(BigDecimal value) {
            this.relevance = value;
        }

    }

}
