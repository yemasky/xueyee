
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderApplyPaymentRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderApplyPaymentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HtlConfirmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtherCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ArriveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckedOutStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderApplyPaymentRequest", propOrder = {
    "htlConfirmNo",
    "totalCost",
    "otherCost",
    "arriveTime",
    "departureTime",
    "roomNo",
    "clientName",
    "checkedOutStatus"
})
public class OrderApplyPaymentRequest {

    @XmlElement(name = "HtlConfirmNo")
    protected String htlConfirmNo;
    @XmlElement(name = "TotalCost")
    protected BigDecimal totalCost;
    @XmlElement(name = "OtherCost")
    protected BigDecimal otherCost;
    @XmlElement(name = "ArriveTime")
    protected String arriveTime;
    @XmlElement(name = "DepartureTime")
    protected String departureTime;
    @XmlElement(name = "RoomNo")
    protected String roomNo;
    @XmlElement(name = "ClientName")
    protected String clientName;
    @XmlElement(name = "CheckedOutStatus")
    protected String checkedOutStatus;

    /**
     * 获取htlConfirmNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtlConfirmNo() {
        return htlConfirmNo;
    }

    /**
     * 设置htlConfirmNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtlConfirmNo(String value) {
        this.htlConfirmNo = value;
    }

    /**
     * 获取totalCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * 设置totalCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCost(BigDecimal value) {
        this.totalCost = value;
    }

    /**
     * 获取otherCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherCost() {
        return otherCost;
    }

    /**
     * 设置otherCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherCost(BigDecimal value) {
        this.otherCost = value;
    }

    /**
     * 获取arriveTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveTime() {
        return arriveTime;
    }

    /**
     * 设置arriveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveTime(String value) {
        this.arriveTime = value;
    }

    /**
     * 获取departureTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * 设置departureTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * 获取roomNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * 设置roomNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNo(String value) {
        this.roomNo = value;
    }

    /**
     * 获取clientName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * 设置clientName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * 获取checkedOutStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckedOutStatus() {
        return checkedOutStatus;
    }

    /**
     * 设置checkedOutStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckedOutStatus(String value) {
        this.checkedOutStatus = value;
    }

}
