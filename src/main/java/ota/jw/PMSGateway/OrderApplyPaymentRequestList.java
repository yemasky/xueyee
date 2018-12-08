
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderApplyPaymentRequestList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderApplyPaymentRequestList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderApplyPaymentRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOrderApplyPaymentRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderApplyPaymentRequestList", propOrder = {
    "orderId",
    "hotelId",
    "channelCode",
    "orderApplyPaymentRequests"
})
public class OrderApplyPaymentRequestList {

    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "HotelId")
    protected String hotelId;
    @XmlElement(name = "ChannelCode")
    protected String channelCode;
    @XmlElement(name = "OrderApplyPaymentRequests")
    protected ArrayOfOrderApplyPaymentRequest orderApplyPaymentRequests;

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
     * 获取hotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * 设置hotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelId(String value) {
        this.hotelId = value;
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
     * 获取orderApplyPaymentRequests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderApplyPaymentRequest }
     *     
     */
    public ArrayOfOrderApplyPaymentRequest getOrderApplyPaymentRequests() {
        return orderApplyPaymentRequests;
    }

    /**
     * 设置orderApplyPaymentRequests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderApplyPaymentRequest }
     *     
     */
    public void setOrderApplyPaymentRequests(ArrayOfOrderApplyPaymentRequest value) {
        this.orderApplyPaymentRequests = value;
    }

}
