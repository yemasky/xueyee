
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SeatAvailabilityType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeatAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Charges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAvailabilityType", propOrder = {
    "charges"
})
public class SeatAvailabilityType {

    @XmlElement(name = "Charges")
    protected ArrayOfFeeType1 charges;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * 获取charges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeeType1 }
     *     
     */
    public ArrayOfFeeType1 getCharges() {
        return charges;
    }

    /**
     * 设置charges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeeType1 }
     *     
     */
    public void setCharges(ArrayOfFeeType1 value) {
        this.charges = value;
    }

    /**
     * 获取uri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * 设置uri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

}
