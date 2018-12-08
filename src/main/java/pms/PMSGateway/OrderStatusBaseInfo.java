package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>OrderStatusBaseInfo complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OrderStatusBaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Orders" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOrderEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusBaseInfo", propOrder = {
        "orders"
})
@XmlSeeAlso({
        OTAPushOrderStatusRS.class,
        OTAPushOrderStatusRQ.class
})
public class OrderStatusBaseInfo {

    @XmlElement(name = "Orders")
    protected ArrayOfOrderEntity orders;

    /**
     * ��ȡorders���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfOrderEntity }
     */
    public ArrayOfOrderEntity getOrders() {
        return orders;
    }

    /**
     * ����orders���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfOrderEntity }
     */
    public void setOrders(ArrayOfOrderEntity value) {
        this.orders = value;
    }

}
