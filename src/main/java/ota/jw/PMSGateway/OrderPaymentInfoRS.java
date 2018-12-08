
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderPaymentInfoRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderPaymentInfoRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderPaymentInfoList" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOrderPaymentInfo" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/&gt;
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPaymentInfoRS", propOrder = {
    "orderPaymentInfoList",
    "warningsOrSuccessOrErrors"
})
public class OrderPaymentInfoRS {

    @XmlElement(name = "OrderPaymentInfoList")
    protected ArrayOfOrderPaymentInfo orderPaymentInfoList;
    @XmlElements({
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class)
    })
    protected List<Object> warningsOrSuccessOrErrors;

    /**
     * 获取orderPaymentInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderPaymentInfo }
     *     
     */
    public ArrayOfOrderPaymentInfo getOrderPaymentInfoList() {
        return orderPaymentInfoList;
    }

    /**
     * 设置orderPaymentInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderPaymentInfo }
     *     
     */
    public void setOrderPaymentInfoList(ArrayOfOrderPaymentInfo value) {
        this.orderPaymentInfoList = value;
    }

    /**
     * Gets the value of the warningsOrSuccessOrErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningsOrSuccessOrErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningsOrSuccessOrErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningsType }
     * {@link SuccessType }
     * {@link ErrorsType }
     * 
     * 
     */
    public List<Object> getWarningsOrSuccessOrErrors() {
        if (warningsOrSuccessOrErrors == null) {
            warningsOrSuccessOrErrors = new ArrayList<Object>();
        }
        return this.warningsOrSuccessOrErrors;
    }

}
