
package ota.jw.AvailRes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfPropertyValueMatchTypeAmenity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPropertyValueMatchTypeAmenity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amenity" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;RoomAmenityPrefType"&gt;
 *                 &lt;attribute name="PropertyAmenityType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
@XmlType(name = "ArrayOfPropertyValueMatchTypeAmenity", propOrder = {
    "amenity"
})
public class ArrayOfPropertyValueMatchTypeAmenity {

    @XmlElement(name = "Amenity")
    protected List<ArrayOfPropertyValueMatchTypeAmenity.Amenity> amenity;

    /**
     * Gets the value of the amenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfPropertyValueMatchTypeAmenity.Amenity }
     * 
     * 
     */
    public List<ArrayOfPropertyValueMatchTypeAmenity.Amenity> getAmenity() {
        if (amenity == null) {
            amenity = new ArrayList<ArrayOfPropertyValueMatchTypeAmenity.Amenity>();
        }
        return this.amenity;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;RoomAmenityPrefType"&gt;
     *       &lt;attribute name="PropertyAmenityType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Amenity
        extends RoomAmenityPrefType
    {

        @XmlAttribute(name = "PropertyAmenityType")
        protected String propertyAmenityType;

        /**
         * 获取propertyAmenityType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyAmenityType() {
            return propertyAmenityType;
        }

        /**
         * 设置propertyAmenityType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyAmenityType(String value) {
            this.propertyAmenityType = value;
        }

    }

}
