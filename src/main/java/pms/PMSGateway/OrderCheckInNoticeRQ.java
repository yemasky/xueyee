package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderCheckInNoticeRQ complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OrderCheckInNoticeRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HtlConfirmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckInStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderCheckInInfoList" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOrderCheckIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCheckInNoticeRQ", propOrder = {
        "orderId",
        "htlConfirmNo",
        "checkInStatus",
        "hotelID",
        "roomNo",
        "orderCheckInInfoList"
})
public class OrderCheckInNoticeRQ {

    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "HtlConfirmNo")
    protected String htlConfirmNo;
    @XmlElement(name = "CheckInStatus")
    protected String checkInStatus;
    @XmlElement(name = "HotelID")
    protected String hotelID;
    @XmlElement(name = "RoomNo")
    protected String roomNo;
    @XmlElement(name = "OrderCheckInInfoList")
    protected ArrayOfOrderCheckIn orderCheckInInfoList;

    /**
     * ��ȡorderId���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * ����orderId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

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
     * ��ȡhotelID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelID() {
        return hotelID;
    }

    /**
     * ����hotelID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelID(String value) {
        this.hotelID = value;
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

    /**
     * ��ȡorderCheckInInfoList���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfOrderCheckIn }
     */
    public ArrayOfOrderCheckIn getOrderCheckInInfoList() {
        return orderCheckInInfoList;
    }

    /**
     * ����orderCheckInInfoList���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfOrderCheckIn }
     */
    public void setOrderCheckInInfoList(ArrayOfOrderCheckIn value) {
        this.orderCheckInInfoList = value;
    }

}
