package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>VehicleResRSCoreType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleResRSCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehReservation" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleResRSCoreType", propOrder = {
        "vehReservation",
        "tpaExtensions"
})
@XmlSeeAlso({
        pms.PMSGateway.OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore.class,
        pms.PMSGateway.OTAPrdNotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore.class
})
public class VehicleResRSCoreType {

    @XmlElement(name = "VehReservation")
    protected VehicleReservationType vehReservation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * ��ȡvehReservation���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleReservationType }
     */
    public VehicleReservationType getVehReservation() {
        return vehReservation;
    }

    /**
     * ����vehReservation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleReservationType }
     */
    public void setVehReservation(VehicleReservationType value) {
        this.vehReservation = value;
    }

    /**
     * ��ȡtpaExtensions���Ե�ֵ��
     *
     * @return possible object is
     * {@link TPAExtensionsType }
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * ����tpaExtensions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TPAExtensionsType }
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

}
