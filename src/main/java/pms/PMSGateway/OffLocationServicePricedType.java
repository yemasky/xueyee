package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OffLocationServicePricedType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OffLocationServicePricedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OffLocService" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServiceType" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffLocationServicePricedType", propOrder = {
        "offLocService",
        "charge"
})
public class OffLocationServicePricedType {

    @XmlElement(name = "OffLocService")
    protected OffLocationServiceType offLocService;
    @XmlElement(name = "Charge")
    protected VehicleChargeType charge;

    /**
     * ��ȡoffLocService���Ե�ֵ��
     *
     * @return possible object is
     * {@link OffLocationServiceType }
     */
    public OffLocationServiceType getOffLocService() {
        return offLocService;
    }

    /**
     * ����offLocService���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OffLocationServiceType }
     */
    public void setOffLocService(OffLocationServiceType value) {
        this.offLocService = value;
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

}
