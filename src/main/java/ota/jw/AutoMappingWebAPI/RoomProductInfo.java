
package ota.jw.AutoMappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomProductInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomProductInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subHotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="masterRoomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subRoomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="breakfast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subRoomName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pmsRoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pmsRoomName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pmsHotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pmsRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomProductInfo", propOrder = {
    "subHotelId",
    "masterRoomId",
    "subRoomId",
    "breakfast",
    "balanceType",
    "subRoomName",
    "pmsRoomTypeCode",
    "pmsRoomName",
    "pmsHotelCode",
    "pmsRatePlanCode"
})
public class RoomProductInfo {

    protected String subHotelId;
    protected String masterRoomId;
    protected String subRoomId;
    protected String breakfast;
    protected String balanceType;
    protected String subRoomName;
    protected String pmsRoomTypeCode;
    protected String pmsRoomName;
    protected String pmsHotelCode;
    protected String pmsRatePlanCode;

    /**
     * 获取subHotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubHotelId() {
        return subHotelId;
    }

    /**
     * 设置subHotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubHotelId(String value) {
        this.subHotelId = value;
    }

    /**
     * 获取masterRoomId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterRoomId() {
        return masterRoomId;
    }

    /**
     * 设置masterRoomId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterRoomId(String value) {
        this.masterRoomId = value;
    }

    /**
     * 获取subRoomId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRoomId() {
        return subRoomId;
    }

    /**
     * 设置subRoomId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRoomId(String value) {
        this.subRoomId = value;
    }

    /**
     * 获取breakfast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakfast() {
        return breakfast;
    }

    /**
     * 设置breakfast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakfast(String value) {
        this.breakfast = value;
    }

    /**
     * 获取balanceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * 设置balanceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    /**
     * 获取subRoomName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRoomName() {
        return subRoomName;
    }

    /**
     * 设置subRoomName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRoomName(String value) {
        this.subRoomName = value;
    }

    /**
     * 获取pmsRoomTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsRoomTypeCode() {
        return pmsRoomTypeCode;
    }

    /**
     * 设置pmsRoomTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsRoomTypeCode(String value) {
        this.pmsRoomTypeCode = value;
    }

    /**
     * 获取pmsRoomName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsRoomName() {
        return pmsRoomName;
    }

    /**
     * 设置pmsRoomName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsRoomName(String value) {
        this.pmsRoomName = value;
    }

    /**
     * 获取pmsHotelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsHotelCode() {
        return pmsHotelCode;
    }

    /**
     * 设置pmsHotelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsHotelCode(String value) {
        this.pmsHotelCode = value;
    }

    /**
     * 获取pmsRatePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmsRatePlanCode() {
        return pmsRatePlanCode;
    }

    /**
     * 设置pmsRatePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmsRatePlanCode(String value) {
        this.pmsRatePlanCode = value;
    }

}
