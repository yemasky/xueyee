
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCruiseGuestDetailTypeAirAccommodation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCruiseGuestDetailTypeAirAccommodation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirAccommodation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirInfoType"&gt;
 *                 &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AirAccommodationType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfCruiseGuestDetailTypeAirAccommodation", propOrder = {
    "airAccommodation"
})
public class ArrayOfCruiseGuestDetailTypeAirAccommodation {

    @XmlElement(name = "AirAccommodation")
    protected List<ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation> airAccommodation;

    /**
     * Gets the value of the airAccommodation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airAccommodation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirAccommodation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation }
     * 
     * 
     */
    public List<ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation> getAirAccommodation() {
        if (airAccommodation == null) {
            airAccommodation = new ArrayList<ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation>();
        }
        return this.airAccommodation;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirInfoType"&gt;
     *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AirAccommodationType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirAccommodation
        extends AirInfoType
    {

        @XmlAttribute(name = "Comment")
        protected String comment;
        @XmlAttribute(name = "AirAccommodationType")
        protected String airAccommodationType;

        /**
         * 获取comment属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * 设置comment属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * 获取airAccommodationType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirAccommodationType() {
            return airAccommodationType;
        }

        /**
         * 设置airAccommodationType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirAccommodationType(String value) {
            this.airAccommodationType = value;
        }

    }

}
