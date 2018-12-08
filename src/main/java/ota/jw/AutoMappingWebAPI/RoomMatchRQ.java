
package ota.jw.AutoMappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomMatchRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomMatchRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ratePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otaProductList" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOtaProductInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomMatchRQ", propOrder = {
    "roomTypeCode",
    "roomTypeName",
    "ratePlanName",
    "otaProductList"
})
public class RoomMatchRQ {

    protected String roomTypeCode;
    protected String roomTypeName;
    protected String ratePlanName;
    protected ArrayOfOtaProductInfo otaProductList;

    /**
     * 获取roomTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * 设置roomTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    /**
     * 获取roomTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeName() {
        return roomTypeName;
    }

    /**
     * 设置roomTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeName(String value) {
        this.roomTypeName = value;
    }

    /**
     * 获取ratePlanName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanName() {
        return ratePlanName;
    }

    /**
     * 设置ratePlanName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanName(String value) {
        this.ratePlanName = value;
    }

    /**
     * 获取otaProductList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOtaProductInfo }
     *     
     */
    public ArrayOfOtaProductInfo getOtaProductList() {
        return otaProductList;
    }

    /**
     * 设置otaProductList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOtaProductInfo }
     *     
     */
    public void setOtaProductList(ArrayOfOtaProductInfo value) {
        this.otaProductList = value;
    }

}
