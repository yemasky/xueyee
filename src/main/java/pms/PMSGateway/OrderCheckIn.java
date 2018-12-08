package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderCheckIn complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OrderCheckIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HtlConfirmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckInStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCheckIn", propOrder = {
        "htlConfirmNo",
        "checkInStatus",
        "roomNo"
})
public class OrderCheckIn {

    @XmlElement(name = "HtlConfirmNo")
    protected String htlConfirmNo;
    @XmlElement(name = "CheckInStatus")
    protected String checkInStatus;
    @XmlElement(name = "RoomNo")
    protected String roomNo;

    /**
     * ��ȡhtlConfirmNo���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHtlConfirmNo() {
        return htlConfirmNo;
    }

    /**
     * ����htlConfirmNo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHtlConfirmNo(String value) {
        this.htlConfirmNo = value;
    }

    /**
     * ��ȡcheckInStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCheckInStatus() {
        return checkInStatus;
    }

    /**
     * ����checkInStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCheckInStatus(String value) {
        this.checkInStatus = value;
    }

    /**
     * ��ȡroomNo���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * ����roomNo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomNo(String value) {
        this.roomNo = value;
    }

}
