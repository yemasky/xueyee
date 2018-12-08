package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfVehicleEquipmentPricedType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfVehicleEquipmentPricedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricedEquip" type="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentPricedType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVehicleEquipmentPricedType", propOrder = {
        "pricedEquip"
})
public class ArrayOfVehicleEquipmentPricedType {

    @XmlElement(name = "PricedEquip")
    protected List<VehicleEquipmentPricedType> pricedEquip;

    /**
     * Gets the value of the pricedEquip property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedEquip property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedEquip().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleEquipmentPricedType }
     */
    public List<VehicleEquipmentPricedType> getPricedEquip() {
        if (pricedEquip == null) {
            pricedEquip = new ArrayList<VehicleEquipmentPricedType>();
        }
        return this.pricedEquip;
    }

}
