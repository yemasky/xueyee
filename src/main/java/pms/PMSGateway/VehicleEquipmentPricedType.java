package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>VehicleEquipmentPricedType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleEquipmentPricedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentType" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * ��ȡequipment���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleEquipmentType }
     */
    public VehicleEquipmentType getEquipment() {
        return equipment;
    }

    /**
     * ����equipment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleEquipmentType }
     */
    public void setEquipment(VehicleEquipmentType value) {
        this.equipment = value;
    }

    /**
     * ��ȡcharge���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleChargeType }
     */
    public VehicleChargeType getCharge() {
        return charge;
    }

    /**
     * ����charge���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleChargeType }
     */
    public void setCharge(VehicleChargeType value) {
        this.charge = value;
    }

    /**
     * ��ȡrequired���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * ����required���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

}
