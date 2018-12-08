package pms.order;

import javax.xml.bind.annotation.*;


/**
 * <p>HTNG_ComponentRoomType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HTNG_ComponentRoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomTypeType">
 *                 &lt;attribute name="Building" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Wing" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Devices" type="{http://htng.org/2014B}ArrayOfHTNG_DeviceHealthType" minOccurs="0"/>
 *         &lt;element name="TelephoneExtensions" type="{http://htng.org/2014B}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="HKStatus" type="{http://htng.org/2014B}HTNG_HousekeepingStatusType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
    protected HTNGHousekeepingStatusType hkStatus;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "RoomID")
    protected String roomID;

    /**
     * ��ȡroomType���Ե�ֵ��
     *
     * @return possible object is
     * {@link HTNGComponentRoomType.RoomType }
     */
    public HTNGComponentRoomType.RoomType getRoomType() {
        return roomType;
    }

    /**
     * ����roomType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HTNGComponentRoomType.RoomType }
     */
    public void setRoomType(HTNGComponentRoomType.RoomType value) {
        this.roomType = value;
    }

    /**
     * ��ȡdevices���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHTNGDeviceHealthType }
     */
    public ArrayOfHTNGDeviceHealthType getDevices() {
        return devices;
    }

    /**
     * ����devices���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHTNGDeviceHealthType }
     */
    public void setDevices(ArrayOfHTNGDeviceHealthType value) {
        this.devices = value;
    }

    /**
     * ��ȡtelephoneExtensions���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfString2 }
     */
    public ArrayOfString2 getTelephoneExtensions() {
        return telephoneExtensions;
    }

    /**
     * ����telephoneExtensions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfString2 }
     */
    public void setTelephoneExtensions(ArrayOfString2 value) {
        this.telephoneExtensions = value;
    }

    /**
     * ��ȡhkStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link HTNGHousekeepingStatusType }
     */
    public HTNGHousekeepingStatusType getHKStatus() {
        return hkStatus;
    }

    /**
     * ����hkStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HTNGHousekeepingStatusType }
     */
    public void setHKStatus(HTNGHousekeepingStatusType value) {
        this.hkStatus = value;
    }

    /**
     * ��ȡtpaExtensions���Ե�ֵ��
     *
     * @return possible object is
     * {@link TPAExtensionsType }
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * ����tpaExtensions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TPAExtensionsType }
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * ��ȡroomID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * ����roomID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomID(String value) {
        this.roomID = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomTypeType">
     *       &lt;attribute name="Building" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Wing" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoomType
            extends RoomTypeType {

        @XmlAttribute(name = "Building")
        protected String building;
        @XmlAttribute(name = "Wing")
        protected String wing;

        /**
         * ��ȡbuilding���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBuilding() {
            return building;
        }

        /**
         * ����building���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBuilding(String value) {
            this.building = value;
        }

        /**
         * ��ȡwing���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getWing() {
            return wing;
        }

        /**
         * ����wing���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setWing(String value) {
            this.wing = value;
        }

    }

}
