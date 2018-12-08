
package ota.jw.ARIPmsGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfOfferTypeGuest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOfferTypeGuest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Guest" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MinCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="MaxCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="FirstQualifyingPosition" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="LastQualifyingPosition" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
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
@XmlType(name = "ArrayOfOfferTypeGuest", propOrder = {
    "guest"
})
public class ArrayOfOfferTypeGuest {

    @XmlElement(name = "Guest")
    protected List<ArrayOfOfferTypeGuest.Guest> guest;

    /**
     * Gets the value of the guest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOfferTypeGuest.Guest }
     * 
     * 
     */
    public List<ArrayOfOfferTypeGuest.Guest> getGuest() {
        if (guest == null) {
            guest = new ArrayList<ArrayOfOfferTypeGuest.Guest>();
        }
        return this.guest;
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
     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MinCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="MaxCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="FirstQualifyingPosition" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="LastQualifyingPosition" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Guest {

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
        @XmlAttribute(name = "MinCount")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minCount;
        @XmlAttribute(name = "MaxCount")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxCount;
        @XmlAttribute(name = "FirstQualifyingPosition")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger firstQualifyingPosition;
        @XmlAttribute(name = "LastQualifyingPosition")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger lastQualifyingPosition;

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
         * 获取minCount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinCount() {
            return minCount;
        }

        /**
         * 设置minCount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinCount(BigInteger value) {
            this.minCount = value;
        }

        /**
         * 获取maxCount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxCount() {
            return maxCount;
        }

        /**
         * 设置maxCount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxCount(BigInteger value) {
            this.maxCount = value;
        }

        /**
         * 获取firstQualifyingPosition属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFirstQualifyingPosition() {
            return firstQualifyingPosition;
        }

        /**
         * 设置firstQualifyingPosition属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFirstQualifyingPosition(BigInteger value) {
            this.firstQualifyingPosition = value;
        }

        /**
         * 获取lastQualifyingPosition属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLastQualifyingPosition() {
            return lastQualifyingPosition;
        }

        /**
         * 设置lastQualifyingPosition属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLastQualifyingPosition(BigInteger value) {
            this.lastQualifyingPosition = value;
        }

    }

}
