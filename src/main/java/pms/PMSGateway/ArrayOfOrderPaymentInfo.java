package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfOrderPaymentInfo complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfOrderPaymentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderPaymentInfo" type="{http://www.opentravel.org/OTA/2003/05}OrderPaymentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderPaymentInfo", propOrder = {
        "orderPaymentInfo"
})
public class ArrayOfOrderPaymentInfo {

    @XmlElement(name = "OrderPaymentInfo", nillable = true)
    protected List<OrderPaymentInfo> orderPaymentInfo;

    /**
     * Gets the value of the orderPaymentInfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderPaymentInfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderPaymentInfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderPaymentInfo }
     */
    public List<OrderPaymentInfo> getOrderPaymentInfo() {
        if (orderPaymentInfo == null) {
            orderPaymentInfo = new ArrayList<OrderPaymentInfo>();
        }
        return this.orderPaymentInfo;
    }

}
