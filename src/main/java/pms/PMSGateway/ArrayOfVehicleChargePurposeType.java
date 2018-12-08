package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfVehicleChargePurposeType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfVehicleChargePurposeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehicleCharge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargePurposeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVehicleChargePurposeType", propOrder = {
        "vehicleCharge"
})
public class ArrayOfVehicleChargePurposeType {

    @XmlElement(name = "VehicleCharge")
    protected List<VehicleChargePurposeType> vehicleCharge;

    /**
     * Gets the value of the vehicleCharge property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleCharge property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleCharge().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleChargePurposeType }
     */
    public List<VehicleChargePurposeType> getVehicleCharge() {
        if (vehicleCharge == null) {
            vehicleCharge = new ArrayList<VehicleChargePurposeType>();
        }
        return this.vehicleCharge;
    }

}
