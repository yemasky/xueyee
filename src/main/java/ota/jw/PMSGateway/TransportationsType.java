
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransportationsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TransportationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Transportations" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfTransportationTypeTransportation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationsType", propOrder = {
    "transportations"
})
@XmlSeeAlso({
    RelativePositionType.class
})
public class TransportationsType {

    @XmlElement(name = "Transportations")
    protected ArrayOfTransportationTypeTransportation transportations;

    /**
     * 获取transportations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransportationTypeTransportation }
     *     
     */
    public ArrayOfTransportationTypeTransportation getTransportations() {
        return transportations;
    }

    /**
     * 设置transportations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransportationTypeTransportation }
     *     
     */
    public void setTransportations(ArrayOfTransportationTypeTransportation value) {
        this.transportations = value;
    }

}
