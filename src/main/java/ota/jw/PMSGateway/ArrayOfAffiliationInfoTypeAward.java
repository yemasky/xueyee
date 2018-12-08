
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ArrayOfAffiliationInfoTypeAward complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAffiliationInfoTypeAward"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Award" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OfficialAppointmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RatingSymbol"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Diamond"/&gt;
 *                       &lt;enumeration value="Star"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfAffiliationInfoTypeAward", propOrder = {
    "award"
})
public class ArrayOfAffiliationInfoTypeAward {

    @XmlElement(name = "Award")
    protected List<ArrayOfAffiliationInfoTypeAward.Award> award;

    /**
     * Gets the value of the award property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAffiliationInfoTypeAward.Award }
     * 
     * 
     */
    public List<ArrayOfAffiliationInfoTypeAward.Award> getAward() {
        if (award == null) {
            award = new ArrayList<ArrayOfAffiliationInfoTypeAward.Award>();
        }
        return this.award;
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
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OfficialAppointmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RatingSymbol"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Diamond"/&gt;
     *             &lt;enumeration value="Star"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Award {

        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "Date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "Provider")
        protected String provider;
        @XmlAttribute(name = "Rating")
        protected String rating;
        @XmlAttribute(name = "OfficialAppointmentInd")
        protected Boolean officialAppointmentInd;
        @XmlAttribute(name = "RatingSymbol")
        protected String ratingSymbol;
        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * 获取removal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * 设置removal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * 获取date属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * 设置date属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * 获取provider属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvider() {
            return provider;
        }

        /**
         * 设置provider属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * 获取rating属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRating() {
            return rating;
        }

        /**
         * 设置rating属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRating(String value) {
            this.rating = value;
        }

        /**
         * 获取officialAppointmentInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOfficialAppointmentInd() {
            return officialAppointmentInd;
        }

        /**
         * 设置officialAppointmentInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOfficialAppointmentInd(Boolean value) {
            this.officialAppointmentInd = value;
        }

        /**
         * 获取ratingSymbol属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatingSymbol() {
            return ratingSymbol;
        }

        /**
         * 设置ratingSymbol属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatingSymbol(String value) {
            this.ratingSymbol = value;
        }

        /**
         * 获取rph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * 设置rph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

    }

}
