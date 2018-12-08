
package ota.jw.PMSGateway;

import java.math.BigInteger;
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
 * <p>ArrayOfRoutingHopTypeRoutingHop complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoutingHopTypeRoutingHop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoutingHop" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LocalRefID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Data" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfRoutingHopTypeRoutingHop", propOrder = {
    "routingHop"
})
public class ArrayOfRoutingHopTypeRoutingHop {

    @XmlElement(name = "RoutingHop")
    protected List<ArrayOfRoutingHopTypeRoutingHop.RoutingHop> routingHop;

    /**
     * Gets the value of the routingHop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingHop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingHop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRoutingHopTypeRoutingHop.RoutingHop }
     * 
     * 
     */
    public List<ArrayOfRoutingHopTypeRoutingHop.RoutingHop> getRoutingHop() {
        if (routingHop == null) {
            routingHop = new ArrayList<ArrayOfRoutingHopTypeRoutingHop.RoutingHop>();
        }
        return this.routingHop;
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
     *       &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LocalRefID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="Data" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoutingHop {

        @XmlAttribute(name = "SystemCode")
        protected String systemCode;
        @XmlAttribute(name = "LocalRefID")
        protected String localRefID;
        @XmlAttribute(name = "TimeStamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timeStamp;
        @XmlAttribute(name = "Comment")
        protected String comment;
        @XmlAttribute(name = "SequenceNmbr")
        protected BigInteger sequenceNmbr;
        @XmlAttribute(name = "Data")
        protected String data;

        /**
         * 获取systemCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSystemCode() {
            return systemCode;
        }

        /**
         * 设置systemCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSystemCode(String value) {
            this.systemCode = value;
        }

        /**
         * 获取localRefID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalRefID() {
            return localRefID;
        }

        /**
         * 设置localRefID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalRefID(String value) {
            this.localRefID = value;
        }

        /**
         * 获取timeStamp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimeStamp() {
            return timeStamp;
        }

        /**
         * 设置timeStamp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimeStamp(XMLGregorianCalendar value) {
            this.timeStamp = value;
        }

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
         * 获取sequenceNmbr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequenceNmbr() {
            return sequenceNmbr;
        }

        /**
         * 设置sequenceNmbr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequenceNmbr(BigInteger value) {
            this.sequenceNmbr = value;
        }

        /**
         * 获取data属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getData() {
            return data;
        }

        /**
         * 设置data属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setData(String value) {
            this.data = value;
        }

    }

}
