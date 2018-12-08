package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderApplyPaymentRQ complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OrderApplyPaymentRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderApplyPaymentRequestList" type="{http://www.opentravel.org/OTA/2003/05}OrderApplyPaymentRequestList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderApplyPaymentRQ", propOrder = {
        "orderApplyPaymentRequestList"
})
public class OrderApplyPaymentRQ {

    @XmlElement(name = "OrderApplyPaymentRequestList")
    protected OrderApplyPaymentRequestList orderApplyPaymentRequestList;

    /**
     * ��ȡorderApplyPaymentRequestList���Ե�ֵ��
     *
     * @return possible object is
     * {@link OrderApplyPaymentRequestList }
     */
    public OrderApplyPaymentRequestList getOrderApplyPaymentRequestList() {
        return orderApplyPaymentRequestList;
    }

    /**
     * ����orderApplyPaymentRequestList���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OrderApplyPaymentRequestList }
     */
    public void setOrderApplyPaymentRequestList(OrderApplyPaymentRequestList value) {
        this.orderApplyPaymentRequestList = value;
    }

}
