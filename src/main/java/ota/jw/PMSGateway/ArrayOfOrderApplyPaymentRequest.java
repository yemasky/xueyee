
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfOrderApplyPaymentRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderApplyPaymentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderApplyPaymentRequest" type="{http://www.opentravel.org/OTA/2003/05}OrderApplyPaymentRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderApplyPaymentRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderApplyPaymentRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderApplyPaymentRequest }
     * 
     * 
     */
    public List<OrderApplyPaymentRequest> getOrderApplyPaymentRequest() {
        if (orderApplyPaymentRequest == null) {
            orderApplyPaymentRequest = new ArrayList<OrderApplyPaymentRequest>();
        }
        return this.orderApplyPaymentRequest;
    }

}
