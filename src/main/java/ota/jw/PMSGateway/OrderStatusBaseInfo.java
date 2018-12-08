
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderStatusBaseInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderStatusBaseInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Orders" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOrderEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusBaseInfo", propOrder = {
    "orders"
})
@XmlSeeAlso({
    OTAPushOrderStatusRQ.class,
    OTAPushOrderStatusRS.class
})
public class OrderStatusBaseInfo {

    @XmlElement(name = "Orders")
    protected ArrayOfOrderEntity orders;

    /**
     * 获取orders属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderEntity }
     *     
     */
    public ArrayOfOrderEntity getOrders() {
        return orders;
    }

    /**
     * 设置orders属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderEntity }
     *     
     */
    public void setOrders(ArrayOfOrderEntity value) {
        this.orders = value;
    }

}
