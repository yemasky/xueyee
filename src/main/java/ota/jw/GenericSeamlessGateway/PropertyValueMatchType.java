
package ota.jw.GenericSeamlessGateway;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>PropertyValueMatchType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PropertyValueMatchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchValueMatch" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="Match" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Relevance" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amenities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPropertyValueMatchTypeAmenity" minOccurs="0"/&gt;
 *         &lt;element name="RateRange" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="RateInfoNotAvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyValueMatchType", propOrder = {
    "searchValueMatch",
    "amenities",
    "rateRange"
})
public class PropertyValueMatchType
    extends BasicPropertyInfoType
{

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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchValueMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchValueMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyValueMatchType.SearchValueMatch }
     * 
     * 
     */
    public List<PropertyValueMatchType.SearchValueMatch> getSearchValueMatch() {
        if (searchValueMatch == null) {
            searchValueMatch = new ArrayList<PropertyValueMatchType.SearchValueMatch>();
        }
        return this.searchValueMatch;
    }

    /**
     * 获取amenities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPropertyValueMatchTypeAmenity }
     *     
     */
    public ArrayOfPropertyValueMatchTypeAmenity getAmenities() {
        return amenities;
    }

    /**
     * 设置amenities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPropertyValueMatchTypeAmenity }
     *     
     */
    public void setAmenities(ArrayOfPropertyValueMatchTypeAmenity value) {
        this.amenities = value;
    }

    /**
     * 获取rateRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyValueMatchType.RateRange }
     *     
     */
    public PropertyValueMatchType.RateRange getRateRange() {
        return rateRange;
    }

    /**
     * 设置rateRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyValueMatchType.RateRange }
     *     
     */
    public void setRateRange(PropertyValueMatchType.RateRange value) {
        this.rateRange = value;
    }

    /**
     * 获取moreDataEchoToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreDataEchoToken() {
        return moreDataEchoToken;
    }

    /**
     * 设置moreDataEchoToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreDataEchoToken(String value) {
        this.moreDataEchoToken = value;
    }

    /**
     * 获取sameCountryInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSameCountryInd() {
        return sameCountryInd;
    }

    /**
     * 设置sameCountryInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSameCountryInd(Boolean value) {
        this.sameCountryInd = value;
    }

    /**
     * 获取availabilityStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateIndicatorType }
     *     
     */
    public RateIndicatorType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * 设置availabilityStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateIndicatorType }
     *     
     */
    public void setAvailabilityStatus(RateIndicatorType value) {
        this.availabilityStatus = value;
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
     *       &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="RateInfoNotAvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取minRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinRate() {
            return minRate;
        }

        /**
         * 设置minRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinRate(BigDecimal value) {
            this.minRate = value;
        }

        /**
         * 获取maxRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxRate() {
            return maxRate;
        }

        /**
         * 设置maxRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxRate(BigDecimal value) {
            this.maxRate = value;
        }

        /**
         * 获取fixedRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFixedRate() {
            return fixedRate;
        }

        /**
         * 设置fixedRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFixedRate(BigDecimal value) {
            this.fixedRate = value;
        }

        /**
         * 获取rateTimeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getRateTimeUnit() {
            return rateTimeUnit;
        }

        /**
         * 设置rateTimeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setRateTimeUnit(TimeUnitType value) {
            this.rateTimeUnit = value;
        }

        /**
         * 获取infoSource属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * 设置infoSource属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * 获取taxRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTaxRate() {
            return taxRate;
        }

        /**
         * 设置taxRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTaxRate(BigDecimal value) {
            this.taxRate = value;
        }

        /**
         * 获取rateInfoNotAvailableInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRateInfoNotAvailableInd() {
            return rateInfoNotAvailableInd;
        }

        /**
         * 设置rateInfoNotAvailableInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRateInfoNotAvailableInd(Boolean value) {
            this.rateInfoNotAvailableInd = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="Match" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Relevance" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取match属性的值。
         * 
         */
        public boolean isMatch() {
            return match;
        }

        /**
         * 设置match属性的值。
         * 
         */
        public void setMatch(boolean value) {
            this.match = value;
        }

        /**
         * 获取relevance属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRelevance() {
            return relevance;
        }

        /**
         * 设置relevance属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRelevance(BigDecimal value) {
            this.relevance = value;
        }

    }

}
