package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfOrderApplyPaymentRequest complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfOrderApplyPaymentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderApplyPaymentRequest" type="{http://www.opentravel.org/OTA/2003/05}OrderApplyPaymentRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderApplyPaymentRequest", propOrder = {
        "orderApplyPaymentRequest"
})
public class ArrayOfOrderApplyPaymentRequest {

    @XmlElement(name = "OrderApplyPaymentRequest", nillable = true)
    protected List<OrderApplyPaymentRequest> orderApplyPaymentRequest;

    /**
     * Gets the value of the orderApplyPaymentRequest property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderApplyPaymentRequest property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderApplyPaymentRequest().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderApplyPaymentRequest }
     */
    public List<OrderApplyPaymentRequest> getOrderApplyPaymentRequest() {
        if (orderApplyPaymentRequest == null) {
            orderApplyPaymentRequest = new ArrayList<OrderApplyPaymentRequest>();
        }
        return this.orderApplyPaymentRequest;
    }

}
