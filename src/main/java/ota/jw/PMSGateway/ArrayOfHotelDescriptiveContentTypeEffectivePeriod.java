
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelDescriptiveContentTypeEffectivePeriod complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelDescriptiveContentTypeEffectivePeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EffectivePeriod" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="StartPeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="EndPeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfHotelDescriptiveContentTypeEffectivePeriod", propOrder = {
    "effectivePeriod"
})
public class ArrayOfHotelDescriptiveContentTypeEffectivePeriod {

    @XmlElement(name = "EffectivePeriod")
    protected List<ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod> effectivePeriod;

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectivePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectivePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod }
     * 
     * 
     */
    public List<ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod> getEffectivePeriod() {
        if (effectivePeriod == null) {
            effectivePeriod = new ArrayList<ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod>();
        }
        return this.effectivePeriod;
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
     *       &lt;attribute name="StartPeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="EndPeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EffectivePeriod {

        @XmlAttribute(name = "StartPeriod")
        protected String startPeriod;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "EndPeriod")
        protected String endPeriod;

        /**
         * 获取startPeriod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartPeriod() {
            return startPeriod;
        }

        /**
         * 设置startPeriod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartPeriod(String value) {
            this.startPeriod = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * 获取endPeriod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndPeriod() {
            return endPeriod;
        }

        /**
         * 设置endPeriod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndPeriod(String value) {
            this.endPeriod = value;
        }

    }

}
