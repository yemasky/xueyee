package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>VehicleEquipmentType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleEquipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Restriction" type="{http://www.opentravel.org/OTA/2003/05}EquipmentRestrictionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleEquipmentType", propOrder = {
        "description"
})
public class VehicleEquipmentType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlAttribute(name = "EquipType")
    protected String equipType;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "Restriction")
    protected EquipmentRestrictionType restriction;

    /**
     * ��ȡdescription���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡequipType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEquipType() {
        return equipType;
    }

    /**
     * ����equipType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEquipType(String value) {
        this.equipType = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * ��ȡrestriction���Ե�ֵ��
     *
     * @return possible object is
     * {@link EquipmentRestrictionType }
     */
    public EquipmentRestrictionType getRestriction() {
        return restriction;
    }

    /**
     * ����restriction���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link EquipmentRestrictionType }
     */
    public void setRestriction(EquipmentRestrictionType value) {
        this.restriction = value;
    }

}
