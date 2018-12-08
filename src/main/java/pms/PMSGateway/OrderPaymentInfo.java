package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderPaymentInfo complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OrderPaymentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfirmationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepositAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ticket_Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPaymentInfo", propOrder = {
        "orderID",
        "confirmationID",
        "hotelId",
        "payType",
        "roomAmount",
        "depositAmount",
        "ticketAmount"
})
public class OrderPaymentInfo {

    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "ConfirmationID")
    protected String confirmationID;
    @XmlElement(name = "HotelId")
    protected String hotelId;
    @XmlElement(name = "PayType")
    protected String payType;
    @XmlElement(name = "RoomAmount")
    protected String roomAmount;
    @XmlElement(name = "DepositAmount")
    protected String depositAmount;
    @XmlElement(name = "Ticket_Amount")
    protected String ticketAmount;

    /**
     * ��ȡorderID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * ����orderID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * ��ȡconfirmationID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getConfirmationID() {
        return confirmationID;
    }

    /**
     * ����confirmationID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConfirmationID(String value) {
        this.confirmationID = value;
    }

    /**
     * ��ȡhotelId���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * ����hotelId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelId(String value) {
        this.hotelId = value;
    }

    /**
     * ��ȡpayType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPayType() {
        return payType;
    }

    /**
     * ����payType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPayType(String value) {
        this.payType = value;
    }

    /**
     * ��ȡroomAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomAmount() {
        return roomAmount;
    }

    /**
     * ����roomAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomAmount(String value) {
        this.roomAmount = value;
    }

    /**
     * ��ȡdepositAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepositAmount() {
        return depositAmount;
    }

    /**
     * ����depositAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepositAmount(String value) {
        this.depositAmount = value;
    }

    /**
     * ��ȡticketAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTicketAmount() {
        return ticketAmount;
    }

    /**
     * ����ticketAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTicketAmount(String value) {
        this.ticketAmount = value;
    }

}
