
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleEquipmentPricedType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleEquipmentPricedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentType" minOccurs="0"/&gt;
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleEquipmentPricedType", propOrder = {
    "equipment",
    "charge"
})
public class VehicleEquipmentPricedType {

    @XmlElement(name = "Equipment")
    protected VehicleEquipmentType equipment;
    @XmlElement(name = "Charge")
    protected VehicleChargeType charge;
    @XmlAttribute(name = "Required")
    protected Boolean required;

    /**
     * 获取equipment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmentType }
     *     
     */
    public VehicleEquipmentType getEquipment() {
        return equipment;
    }

    /**
     * 设置equipment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmentType }
     *     
     */
    public void setEquipment(VehicleEquipmentType value) {
        this.equipment = value;
    }

    /**
     * 获取charge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargeType }
     *     
     */
    public VehicleChargeType getCharge() {
        return charge;
    }

    /**
     * 设置charge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargeType }
     *     
     */
    public void setCharge(VehicleChargeType value) {
        this.charge = value;
    }

    /**
     * 获取required属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * 设置required属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

}
