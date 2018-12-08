package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderApplyPaymentRequestList complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OrderApplyPaymentRequestList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderApplyPaymentRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOrderApplyPaymentRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderApplyPaymentRequestList", propOrder = {
        "orderId",
        "hotelId",
        "orderApplyPaymentRequests"
})
public class OrderApplyPaymentRequestList {

    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "HotelId")
    protected String hotelId;
    @XmlElement(name = "OrderApplyPaymentRequests")
    protected ArrayOfOrderApplyPaymentRequest orderApplyPaymentRequests;

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
     * ��ȡorderApplyPaymentRequests���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfOrderApplyPaymentRequest }
     */
    public ArrayOfOrderApplyPaymentRequest getOrderApplyPaymentRequests() {
        return orderApplyPaymentRequests;
    }

    /**
     * ����orderApplyPaymentRequests���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfOrderApplyPaymentRequest }
     */
    public void setOrderApplyPaymentRequests(ArrayOfOrderApplyPaymentRequest value) {
        this.orderApplyPaymentRequests = value;
    }

}
