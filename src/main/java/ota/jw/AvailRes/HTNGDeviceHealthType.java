
package ota.jw.AvailRes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HTNG_DeviceHealthType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HTNG_DeviceHealthType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentHealthStatus" type="{http://htng.org/2014B}HTNG_HealthStatusType" minOccurs="0"/&gt;
 *         &lt;element name="PriorHealthStatus" type="{http://htng.org/2014B}HTNG_HealthStatusType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FriendlyName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTNG_DeviceHealthType", namespace = "http://htng.org/2014B", propOrder = {
    "currentHealthStatus",
    "priorHealthStatus"
})
public class HTNGDeviceHealthType {

    @XmlElement(name = "CurrentHealthStatus")
    protected HTNGHealthStatusType currentHealthStatus;
    @XmlElement(name = "PriorHealthStatus")
    protected HTNGHealthStatusType priorHealthStatus;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "FriendlyName")
    protected String friendlyName;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "Class")
    protected String clazz;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * 获取currentHealthStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HTNGHealthStatusType }
     *     
     */
    public HTNGHealthStatusType getCurrentHealthStatus() {
        return currentHealthStatus;
    }

    /**
     * 设置currentHealthStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HTNGHealthStatusType }
     *     
     */
    public void setCurrentHealthStatus(HTNGHealthStatusType value) {
        this.currentHealthStatus = value;
    }

    /**
     * 获取priorHealthStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HTNGHealthStatusType }
     *     
     */
    public HTNGHealthStatusType getPriorHealthStatus() {
        return priorHealthStatus;
    }

    /**
     * 设置priorHealthStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HTNGHealthStatusType }
     *     
     */
    public void setPriorHealthStatus(HTNGHealthStatusType value) {
        this.priorHealthStatus = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 获取friendlyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * 设置friendlyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取clazz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * 设置clazz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
