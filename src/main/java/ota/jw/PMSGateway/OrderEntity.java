
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderEntity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtaOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PmsConfirmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefuseMsg" type="{http://www.opentravel.org/OTA/2003/05}RefuseMessage" minOccurs="0"/&gt;
 *         &lt;element name="InterFaceSendID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/&gt;
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/&gt;
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
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
@XmlType(name = "OrderEntity", propOrder = {
    "otaOrderNo",
    "pmsConfirmNo",
    "orderStatus",
    "refuseMsg",
    "interFaceSendID",
    "successOrErrorsOrWarnings"
})
public class OrderEntity {

    @XmlElement(name = "OtaOrderNo")
    protected String otaOrderNo;
    @XmlElement(name = "PmsConfirmNo")
    protected String pmsConfirmNo;
    @XmlElement(name = "OrderStatus")
    protected String orderStatus;
    @XmlElement(name = "RefuseMsg")
    protected RefuseMessage refuseMsg;
    @XmlElement(name = "InterFaceSendID")
    protected String interFaceSendID;
    @XmlElements({
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "Warnings", type = WarningsType.class)
    })
    protected List<Object> successOrErrorsOrWarnings;

    /**
     * 获取otaOrderNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtaOrderNo() {
        return otaOrderNo;
    }

    /**
     * 设置otaOrderNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtaOrderNo(String value) {
        this.otaOrderNo = value;
    }

    /**
     * 获取pmsConfirmNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsConfirmNo() {
        return pmsConfirmNo;
    }

    /**
     * 设置pmsConfirmNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsConfirmNo(String value) {
        this.pmsConfirmNo = value;
    }

    /**
     * 获取orderStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置orderStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * 获取refuseMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RefuseMessage }
     *     
     */
    public RefuseMessage getRefuseMsg() {
        return refuseMsg;
    }

    /**
     * 设置refuseMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RefuseMessage }
     *     
     */
    public void setRefuseMsg(RefuseMessage value) {
        this.refuseMsg = value;
    }

    /**
     * 获取interFaceSendID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterFaceSendID() {
        return interFaceSendID;
    }

    /**
     * 设置interFaceSendID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterFaceSendID(String value) {
        this.interFaceSendID = value;
    }

    /**
     * Gets the value of the successOrErrorsOrWarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successOrErrorsOrWarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessOrErrorsOrWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessType }
     * {@link ErrorsType }
     * {@link WarningsType }
     * 
     * 
     */
    public List<Object> getSuccessOrErrorsOrWarnings() {
        if (successOrErrorsOrWarnings == null) {
            successOrErrorsOrWarnings = new ArrayList<Object>();
        }
        return this.successOrErrorsOrWarnings;
    }

}
