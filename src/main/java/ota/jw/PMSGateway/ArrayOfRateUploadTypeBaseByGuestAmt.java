
package ota.jw.PMSGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfRateUploadTypeBaseByGuestAmt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRateUploadTypeBaseByGuestAmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseByGuestAmt" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NumberOfGuestsDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="NumberOfGuests" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfRateUploadTypeBaseByGuestAmt", propOrder = {
    "baseByGuestAmt"
})
public class ArrayOfRateUploadTypeBaseByGuestAmt {

    @XmlElement(name = "BaseByGuestAmt")
    protected List<ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt> baseByGuestAmt;

    /**
     * Gets the value of the baseByGuestAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseByGuestAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseByGuestAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt }
     * 
     * 
     */
    public List<ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt> getBaseByGuestAmt() {
        if (baseByGuestAmt == null) {
            baseByGuestAmt = new ArrayList<ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt>();
        }
        return this.baseByGuestAmt;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NumberOfGuestsDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="NumberOfGuests" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "numberOfGuestsDescription"
    })
    public static class BaseByGuestAmt
        extends TotalType
    {

        @XmlElement(name = "NumberOfGuestsDescription")
        protected List<ParagraphType> numberOfGuestsDescription;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "NumberOfGuests")
        protected BigInteger numberOfGuests;
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

        /**
         * Gets the value of the numberOfGuestsDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numberOfGuestsDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNumberOfGuestsDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getNumberOfGuestsDescription() {
            if (numberOfGuestsDescription == null) {
                numberOfGuestsDescription = new ArrayList<ParagraphType>();
            }
            return this.numberOfGuestsDescription;
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
         * 获取numberOfGuests属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumberOfGuests() {
            return numberOfGuests;
        }

        /**
         * 设置numberOfGuests属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumberOfGuests(BigInteger value) {
            this.numberOfGuests = value;
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

    }

}
