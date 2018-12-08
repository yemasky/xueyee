
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BaseInvCountType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaseInvCountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusApplicationControl" type="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType" minOccurs="0"/&gt;
 *         &lt;element name="InvCounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBaseInvCountTypeInvCount" minOccurs="0"/&gt;
 *         &lt;element name="OffSell" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="OffSellValueType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Total"/&gt;
 *                       &lt;enumeration value="Adjustment"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="OffSellValue" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *         &lt;element name="UpdateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomQuantityCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomQuantityUpdateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReserveTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Restorable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Editer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseInvCountType", propOrder = {
    "statusApplicationControl",
    "invCounts",
    "offSell",
    "uniqueID",
    "updateType",
    "blanceType",
    "roomQuantityCount",
    "roomQuantityUpdateType",
    "reserveTime",
    "roomStatus",
    "restorable",
    "editer"
})
public class BaseInvCountType {

    @XmlElement(name = "StatusApplicationControl")
    protected StatusApplicationControlType statusApplicationControl;
    @XmlElement(name = "InvCounts")
    protected ArrayOfBaseInvCountTypeInvCount invCounts;
    @XmlElement(name = "OffSell")
    protected BaseInvCountType.OffSell offSell;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "UpdateType")
    protected String updateType;
    @XmlElement(name = "BlanceType")
    protected String blanceType;
    @XmlElement(name = "RoomQuantityCount")
    protected int roomQuantityCount;
    @XmlElement(name = "RoomQuantityUpdateType")
    protected String roomQuantityUpdateType;
    @XmlElement(name = "ReserveTime")
    protected int reserveTime;
    @XmlElement(name = "RoomStatus")
    protected String roomStatus;
    @XmlElement(name = "Restorable")
    protected String restorable;
    @XmlElement(name = "Editer")
    protected String editer;

    /**
     * 获取statusApplicationControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public StatusApplicationControlType getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * 设置statusApplicationControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public void setStatusApplicationControl(StatusApplicationControlType value) {
        this.statusApplicationControl = value;
    }

    /**
     * 获取invCounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseInvCountTypeInvCount }
     *     
     */
    public ArrayOfBaseInvCountTypeInvCount getInvCounts() {
        return invCounts;
    }

    /**
     * 设置invCounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseInvCountTypeInvCount }
     *     
     */
    public void setInvCounts(ArrayOfBaseInvCountTypeInvCount value) {
        this.invCounts = value;
    }

    /**
     * 获取offSell属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseInvCountType.OffSell }
     *     
     */
    public BaseInvCountType.OffSell getOffSell() {
        return offSell;
    }

    /**
     * 设置offSell属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseInvCountType.OffSell }
     *     
     */
    public void setOffSell(BaseInvCountType.OffSell value) {
        this.offSell = value;
    }

    /**
     * 获取uniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * 设置uniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * 获取updateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateType() {
        return updateType;
    }

    /**
     * 设置updateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateType(String value) {
        this.updateType = value;
    }

    /**
     * 获取blanceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlanceType() {
        return blanceType;
    }

    /**
     * 设置blanceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlanceType(String value) {
        this.blanceType = value;
    }

    /**
     * 获取roomQuantityCount属性的值。
     * 
     */
    public int getRoomQuantityCount() {
        return roomQuantityCount;
    }

    /**
     * 设置roomQuantityCount属性的值。
     * 
     */
    public void setRoomQuantityCount(int value) {
        this.roomQuantityCount = value;
    }

    /**
     * 获取roomQuantityUpdateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomQuantityUpdateType() {
        return roomQuantityUpdateType;
    }

    /**
     * 设置roomQuantityUpdateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomQuantityUpdateType(String value) {
        this.roomQuantityUpdateType = value;
    }

    /**
     * 获取reserveTime属性的值。
     * 
     */
    public int getReserveTime() {
        return reserveTime;
    }

    /**
     * 设置reserveTime属性的值。
     * 
     */
    public void setReserveTime(int value) {
        this.reserveTime = value;
    }

    /**
     * 获取roomStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomStatus() {
        return roomStatus;
    }

    /**
     * 设置roomStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomStatus(String value) {
        this.roomStatus = value;
    }

    /**
     * 获取restorable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestorable() {
        return restorable;
    }

    /**
     * 设置restorable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestorable(String value) {
        this.restorable = value;
    }

    /**
     * 获取editer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditer() {
        return editer;
    }

    /**
     * 设置editer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditer(String value) {
        this.editer = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="OffSellValueType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Total"/&gt;
     *             &lt;enumeration value="Adjustment"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="OffSellValue" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OffSell {

        @XmlAttribute(name = "OffSellValueType")
        protected String offSellValueType;
        @XmlAttribute(name = "OffSellValue")
        protected BigDecimal offSellValue;

        /**
         * 获取offSellValueType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffSellValueType() {
            return offSellValueType;
        }

        /**
         * 设置offSellValueType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffSellValueType(String value) {
            this.offSellValueType = value;
        }

        /**
         * 获取offSellValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOffSellValue() {
            return offSellValue;
        }

        /**
         * 设置offSellValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOffSellValue(BigDecimal value) {
            this.offSellValue = value;
        }

    }

}
