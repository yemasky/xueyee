
package ota.jw.GenericSeamlessGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GuestCountType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GuestCountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestCount" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ResGuestRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsPerRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestCountType", propOrder = {
    "guestCount"
})
public class GuestCountType {

    @XmlElement(name = "GuestCount")
    protected List<GuestCountType.GuestCount> guestCount;
    @XmlAttribute(name = "IsPerRoom")
    protected Boolean isPerRoom;

    /**
     * Gets the value of the guestCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestCountType.GuestCount }
     * 
     * 
     */
    public List<GuestCountType.GuestCount> getGuestCount() {
        if (guestCount == null) {
            guestCount = new ArrayList<GuestCountType.GuestCount>();
        }
        return this.guestCount;
    }

    /**
     * 获取isPerRoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPerRoom() {
        return isPerRoom;
    }

    /**
     * 设置isPerRoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPerRoom(Boolean value) {
        this.isPerRoom = value;
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
     *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ResGuestRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GuestCount {

        @XmlAttribute(name = "AgeQualifyingCode")
        protected String ageQualifyingCode;
        @XmlAttribute(name = "Age")
        protected BigInteger age;
        @XmlAttribute(name = "Count")
        protected BigInteger count;
        @XmlAttribute(name = "AgeBucket")
        protected String ageBucket;
        @XmlAttribute(name = "ResGuestRPH")
        protected String resGuestRPH;

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
         * 获取age属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAge() {
            return age;
        }

        /**
         * 设置age属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAge(BigInteger value) {
            this.age = value;
        }

        /**
         * 获取count属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * 设置count属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCount(BigInteger value) {
            this.count = value;
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
         * 获取resGuestRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResGuestRPH() {
            return resGuestRPH;
        }

        /**
         * 设置resGuestRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResGuestRPH(String value) {
            this.resGuestRPH = value;
        }

    }

}
