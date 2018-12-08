
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinAttribute" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CabinAttributeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute", propOrder = {
    "cabinAttribute"
})
public class ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute {

    @XmlElement(name = "CabinAttribute")
    protected List<ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute.CabinAttribute> cabinAttribute;

    /**
     * Gets the value of the cabinAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute.CabinAttribute }
     * 
     * 
     */
    public List<ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute.CabinAttribute> getCabinAttribute() {
        if (cabinAttribute == null) {
            cabinAttribute = new ArrayList<ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute.CabinAttribute>();
        }
        return this.cabinAttribute;
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
     *       &lt;attribute name="CabinAttributeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinAttribute {

        @XmlAttribute(name = "CabinAttributeCode")
        protected String cabinAttributeCode;

        /**
         * 获取cabinAttributeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCabinAttributeCode() {
            return cabinAttributeCode;
        }

        /**
         * 设置cabinAttributeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCabinAttributeCode(String value) {
            this.cabinAttributeCode = value;
        }

    }

}
