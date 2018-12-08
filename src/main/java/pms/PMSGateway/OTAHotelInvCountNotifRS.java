package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MessageAcknowledgementType">
 *       &lt;sequence>
 *         &lt;element name="Inventories" type="{http://www.opentravel.org/OTA/2003/05}InvCountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "inventories"
})
@XmlRootElement(name = "OTA_HotelInvCountNotifRS")
public class OTAHotelInvCountNotifRS
        extends MessageAcknowledgementType {

    @XmlElement(name = "Inventories")
    protected InvCountType inventories;

    /**
     * ��ȡinventories���Ե�ֵ��
     *
     * @return possible object is
     * {@link InvCountType }
     */
    public InvCountType getInventories() {
        return inventories;
    }

    /**
     * ����inventories���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link InvCountType }
     */
    public void setInventories(InvCountType value) {
        this.inventories = value;
    }

}
