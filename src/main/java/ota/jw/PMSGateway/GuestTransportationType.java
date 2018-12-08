
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GuestTransportationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GuestTransportationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestCity" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="GatewayCity" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestTransportationType", propOrder = {
    "guestCity",
    "gatewayCity"
})
public class GuestTransportationType {

    @XmlElement(name = "GuestCity")
    protected LocationType guestCity;
    @XmlElement(name = "GatewayCity")
    protected LocationType gatewayCity;
    @XmlAttribute(name = "Mode")
    protected String mode;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * 获取guestCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getGuestCity() {
        return guestCity;
    }

    /**
     * 设置guestCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setGuestCity(LocationType value) {
        this.guestCity = value;
    }

    /**
     * 获取gatewayCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getGatewayCity() {
        return gatewayCity;
    }

    /**
     * 设置gatewayCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setGatewayCity(LocationType value) {
        this.gatewayCity = value;
    }

    /**
     * 获取mode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
