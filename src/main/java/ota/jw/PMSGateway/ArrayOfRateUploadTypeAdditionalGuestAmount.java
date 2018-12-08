
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
 * <p>ArrayOfRateUploadTypeAdditionalGuestAmount complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRateUploadTypeAdditionalGuestAmount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalGuestAmount" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/&gt;
 *                   &lt;element name="AddlGuestAmtDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MaxAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}AmountDeterminationType" /&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
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
@XmlType(name = "ArrayOfRateUploadTypeAdditionalGuestAmount", propOrder = {
    "additionalGuestAmount"
})
public class ArrayOfRateUploadTypeAdditionalGuestAmount {

    @XmlElement(name = "AdditionalGuestAmount")
    protected List<ArrayOfRateUploadTypeAdditionalGuestAmount.AdditionalGuestAmount> additionalGuestAmount;

    /**
     * Gets the value of the additionalGuestAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalGuestAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalGuestAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRateUploadTypeAdditionalGuestAmount.AdditionalGuestAmount }
     * 
     * 
     */
    public List<ArrayOfRateUploadTypeAdditionalGuestAmount.AdditionalGuestAmount> getAdditionalGuestAmount() {
        if (additionalGuestAmount == null) {
            additionalGuestAmount = new ArrayList<ArrayOfRateUploadTypeAdditionalGuestAmount.AdditionalGuestAmount>();
        }
        return this.additionalGuestAmount;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/&gt;
     *         &lt;element name="AddlGuestAmtDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MaxAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}AmountDeterminationType" /&gt;
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxes",
        "addlGuestAmtDescription"
    })
    public static class AdditionalGuestAmount {

        @XmlElement(name = "Taxes")
        protected TaxesType taxes;
        @XmlElement(name = "AddlGuestAmtDescription")
        protected List<ParagraphType> addlGuestAmtDescription;
        @XmlAttribute(name = "TaxInclusive")
        protected Boolean taxInclusive;
        @XmlAttribute(name = "MaxAdditionalGuests")
        protected BigInteger maxAdditionalGuests;
        @XmlAttribute(name = "AgeQualifyingCode")
        protected String ageQualifyingCode;
        @XmlAttribute(name = "MinAge")
        protected BigInteger minAge;
        @XmlAttribute(name = "MaxAge")
        protected BigInteger maxAge;
        @XmlAttribute(name = "AgeTimeUnit")
        protected TimeUnitType ageTimeUnit;
        @XmlAttribute(name = "AgeBucket")
        protected String ageBucket;
        @XmlAttribute(name = "Type")
        protected AmountDeterminationType type;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;

        /**
         * 获取taxes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TaxesType }
         *     
         */
        public TaxesType getTaxes() {
            return taxes;
        }

        /**
         * 设置taxes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TaxesType }
         *     
         */
        public void setTaxes(TaxesType value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the addlGuestAmtDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addlGuestAmtDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddlGuestAmtDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getAddlGuestAmtDescription() {
            if (addlGuestAmtDescription == null) {
                addlGuestAmtDescription = new ArrayList<ParagraphType>();
            }
            return this.addlGuestAmtDescription;
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

        /**
         * 获取maxAdditionalGuests属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxAdditionalGuests() {
            return maxAdditionalGuests;
        }

        /**
         * 设置maxAdditionalGuests属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxAdditionalGuests(BigInteger value) {
            this.maxAdditionalGuests = value;
        }

        /**
         * 获取ageQualifyingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeQualifyingCode() {
            return ageQualifyingCode;
        }

        /**
         * 设置ageQualifyingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeQualifyingCode(String value) {
            this.ageQualifyingCode = value;
        }

        /**
         * 获取minAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinAge() {
            return minAge;
        }

        /**
         * 设置minAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinAge(BigInteger value) {
            this.minAge = value;
        }

        /**
         * 获取maxAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxAge() {
            return maxAge;
        }

        /**
         * 设置maxAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxAge(BigInteger value) {
            this.maxAge = value;
        }

        /**
         * 获取ageTimeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getAgeTimeUnit() {
            return ageTimeUnit;
        }

        /**
         * 设置ageTimeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setAgeTimeUnit(TimeUnitType value) {
            this.ageTimeUnit = value;
        }

        /**
         * 获取ageBucket属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeBucket() {
            return ageBucket;
        }

        /**
         * 设置ageBucket属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeBucket(String value) {
            this.ageBucket = value;
        }

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AmountDeterminationType }
         *     
         */
        public AmountDeterminationType getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AmountDeterminationType }
         *     
         */
        public void setType(AmountDeterminationType value) {
            this.type = value;
        }

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
         * 获取percent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * 设置percent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
        }

    }

}
