
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderApplyPaymentRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderApplyPaymentRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderApplyPaymentRequestList" type="{http://www.opentravel.org/OTA/2003/05}OrderApplyPaymentRequestList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderApplyPaymentRQ", propOrder = {
    "orderApplyPaymentRequestList"
})
public class OrderApplyPaymentRQ {

    @XmlElement(name = "OrderApplyPaymentRequestList")
    protected OrderApplyPaymentRequestList orderApplyPaymentRequestList;

    /**
     * 获取orderApplyPaymentRequestList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderApplyPaymentRequestList }
     *     
     */
    public OrderApplyPaymentRequestList getOrderApplyPaymentRequestList() {
        return orderApplyPaymentRequestList;
    }

    /**
     * 设置orderApplyPaymentRequestList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderApplyPaymentRequestList }
     *     
     */
    public void setOrderApplyPaymentRequestList(OrderApplyPaymentRequestList value) {
        this.orderApplyPaymentRequestList = value;
    }

}
