
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAvailStatusMessageTypeBestAvailableRate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAvailStatusMessageTypeBestAvailableRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BestAvailableRate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="LengthOfStayTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="LengthOfStayTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "ArrayOfAvailStatusMessageTypeBestAvailableRate", propOrder = {
    "bestAvailableRate"
})
public class ArrayOfAvailStatusMessageTypeBestAvailableRate {

    @XmlElement(name = "BestAvailableRate")
    protected List<ArrayOfAvailStatusMessageTypeBestAvailableRate.BestAvailableRate> bestAvailableRate;

    /**
     * Gets the value of the bestAvailableRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestAvailableRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestAvailableRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAvailStatusMessageTypeBestAvailableRate.BestAvailableRate }
     * 
     * 
     */
    public List<ArrayOfAvailStatusMessageTypeBestAvailableRate.BestAvailableRate> getBestAvailableRate() {
        if (bestAvailableRate == null) {
            bestAvailableRate = new ArrayList<ArrayOfAvailStatusMessageTypeBestAvailableRate.BestAvailableRate>();
        }
        return this.bestAvailableRate;
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
     *       &lt;attribute name="LengthOfStayTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="LengthOfStayTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BestAvailableRate {

        @XmlAttribute(name = "LengthOfStayTime")
        protected BigInteger lengthOfStayTime;
        @XmlAttribute(name = "LengthOfStayTimeUnit")
        protected TimeUnitType lengthOfStayTimeUnit;
        @XmlAttribute(name = "RatePlanCode")
        protected String ratePlanCode;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "TaxInclusive")
        protected Boolean taxInclusive;

        /**
         * 获取lengthOfStayTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLengthOfStayTime() {
            return lengthOfStayTime;
        }

        /**
         * 设置lengthOfStayTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLengthOfStayTime(BigInteger value) {
            this.lengthOfStayTime = value;
        }

        /**
         * 获取lengthOfStayTimeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getLengthOfStayTimeUnit() {
            return lengthOfStayTimeUnit;
        }

        /**
         * 设置lengthOfStayTimeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setLengthOfStayTimeUnit(TimeUnitType value) {
            this.lengthOfStayTimeUnit = value;
        }

        /**
         * 获取ratePlanCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanCode() {
            return ratePlanCode;
        }

        /**
         * 设置ratePlanCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanCode(String value) {
            this.ratePlanCode = value;
        }

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * 获取taxInclusive属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTaxInclusive() {
            return taxInclusive;
        }

        /**
         * 设置taxInclusive属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTaxInclusive(Boolean value) {
            this.taxInclusive = value;
        }

    }

}
