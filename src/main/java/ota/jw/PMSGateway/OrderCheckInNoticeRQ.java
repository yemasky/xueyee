
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderCheckInNoticeRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderCheckInNoticeRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HtlConfirmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckInStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderCheckInInfoList" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOrderCheckIn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCheckInNoticeRQ", propOrder = {
    "orderId",
    "htlConfirmNo",
    "checkInStatus",
    "hotelID",
    "roomNo",
    "channelCode",
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
    @XmlElement(name = "ChannelCode")
    protected String channelCode;
    @XmlElement(name = "OrderCheckInInfoList")
    protected ArrayOfOrderCheckIn orderCheckInInfoList;

    /**
     * 获取orderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置orderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * 获取htlConfirmNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtlConfirmNo() {
        return htlConfirmNo;
    }

    /**
     * 设置htlConfirmNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtlConfirmNo(String value) {
        this.htlConfirmNo = value;
    }

    /**
     * 获取checkInStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInStatus() {
        return checkInStatus;
    }

    /**
     * 设置checkInStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInStatus(String value) {
        this.checkInStatus = value;
    }

    /**
     * 获取hotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelID() {
        return hotelID;
    }

    /**
     * 设置hotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelID(String value) {
        this.hotelID = value;
    }

    /**
     * 获取roomNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * 设置roomNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNo(String value) {
        this.roomNo = value;
    }

    /**
     * 获取channelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * 设置channelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * 获取orderCheckInInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderCheckIn }
     *     
     */
    public ArrayOfOrderCheckIn getOrderCheckInInfoList() {
        return orderCheckInInfoList;
    }

    /**
     * 设置orderCheckInInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderCheckIn }
     *     
     */
    public void setOrderCheckInInfoList(ArrayOfOrderCheckIn value) {
        this.orderCheckInInfoList = value;
    }

}
