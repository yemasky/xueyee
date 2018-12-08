
package ota.jw.GenericSeamlessGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HTNG_ComponentRoomType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HTNG_ComponentRoomType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomTypeType"&gt;
 *                 &lt;attribute name="Building" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Wing" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Devices" type="{http://htng.org/2014B}ArrayOfHTNG_DeviceHealthType" minOccurs="0"/&gt;
 *         &lt;element name="TelephoneExtensions" type="{http://htng.org/2014B}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="HKStatus" type="{http://htng.org/2014B}HTNG_HousekeepingStatusType" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTNG_ComponentRoomType", namespace = "http://htng.org/2014B", propOrder = {
    "roomType",
    "devices",
    "telephoneExtensions",
    "hkStatus",
    "tpaExtensions"
})
@XmlSeeAlso({
    HTNGRoomElementType.class
})
public class HTNGComponentRoomType {

    @XmlElement(name = "RoomType")
    protected HTNGComponentRoomType.RoomType roomType;
    @XmlElement(name = "Devices")
    protected ArrayOfHTNGDeviceHealthType devices;
    @XmlElement(name = "TelephoneExtensions")
    protected ArrayOfString2 telephoneExtensions;
    @XmlElement(name = "HKStatus")
    @XmlSchemaType(name = "string")
    protected HTNGHousekeepingStatusType hkStatus;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "RoomID")
    protected String roomID;

    /**
     * 获取roomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HTNGComponentRoomType.RoomType }
     *     
     */
    public HTNGComponentRoomType.RoomType getRoomType() {
        return roomType;
    }

    /**
     * 设置roomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HTNGComponentRoomType.RoomType }
     *     
     */
    public void setRoomType(HTNGComponentRoomType.RoomType value) {
        this.roomType = value;
    }

    /**
     * 获取devices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHTNGDeviceHealthType }
     *     
     */
    public ArrayOfHTNGDeviceHealthType getDevices() {
        return devices;
    }

    /**
     * 设置devices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHTNGDeviceHealthType }
     *     
     */
    public void setDevices(ArrayOfHTNGDeviceHealthType value) {
        this.devices = value;
    }

    /**
     * 获取telephoneExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getTelephoneExtensions() {
        return telephoneExtensions;
    }

    /**
     * 设置telephoneExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setTelephoneExtensions(ArrayOfString2 value) {
        this.telephoneExtensions = value;
    }

    /**
     * 获取hkStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HTNGHousekeepingStatusType }
     *     
     */
    public HTNGHousekeepingStatusType getHKStatus() {
        return hkStatus;
    }

    /**
     * 设置hkStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HTNGHousekeepingStatusType }
     *     
     */
    public void setHKStatus(HTNGHousekeepingStatusType value) {
        this.hkStatus = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * 获取roomID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * 设置roomID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomID(String value) {
        this.roomID = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomTypeType"&gt;
     *       &lt;attribute name="Building" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Wing" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoomType
        extends RoomTypeType
    {

        @XmlAttribute(name = "Building")
        protected String building;
        @XmlAttribute(name = "Wing")
        protected String wing;

        /**
         * 获取building属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuilding() {
            return building;
        }

        /**
         * 设置building属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuilding(String value) {
            this.building = value;
        }

        /**
         * 获取wing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWing() {
            return wing;
        }

        /**
         * 设置wing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWing(String value) {
            this.wing = value;
        }

    }

}
