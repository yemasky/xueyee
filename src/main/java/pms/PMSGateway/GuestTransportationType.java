package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>GuestTransportationType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="GuestTransportationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestCity" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="GatewayCity" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * ��ȡguestCity���Ե�ֵ��
     *
     * @return possible object is
     * {@link LocationType }
     */
    public LocationType getGuestCity() {
        return guestCity;
    }

    /**
     * ����guestCity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link LocationType }
     */
    public void setGuestCity(LocationType value) {
        this.guestCity = value;
    }

    /**
     * ��ȡgatewayCity���Ե�ֵ��
     *
     * @return possible object is
     * {@link LocationType }
     */
    public LocationType getGatewayCity() {
        return gatewayCity;
    }

    /**
     * ����gatewayCity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link LocationType }
     */
    public void setGatewayCity(LocationType value) {
        this.gatewayCity = value;
    }

    /**
     * ��ȡmode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMode() {
        return mode;
    }

    /**
     * ����mode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
