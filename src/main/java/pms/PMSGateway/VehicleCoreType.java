package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>VehicleCoreType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="VehicleCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DoorCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehClass" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AirConditionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TransmissionType" type="{http://www.opentravel.org/OTA/2003/05}VehicleTransmissionType" />
 *       &lt;attribute name="FuelType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Unspecified"/>
 *             &lt;enumeration value="Diesel"/>
 *             &lt;enumeration value="Hybrid"/>
 *             &lt;enumeration value="Electric"/>
 *             &lt;enumeration value="LPG_CompressedGas"/>
 *             &lt;enumeration value="Hydrogen"/>
 *             &lt;enumeration value="MultiFuel"/>
 *             &lt;enumeration value="Petrol"/>
 *             &lt;enumeration value="Ethanol"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DriveType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="AWD"/>
 *             &lt;enumeration value="4WD"/>
 *             &lt;enumeration value="Unspecified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCoreType", propOrder = {
        "vehType",
        "vehClass"
})
@XmlSeeAlso({
        VehiclePrefType.class,
        VehicleType.class
})
public class VehicleCoreType {

    @XmlElement(name = "VehType")
    protected VehicleCoreType.VehType vehType;
    @XmlElement(name = "VehClass")
    protected VehicleCoreType.VehClass vehClass;
    @XmlAttribute(name = "AirConditionInd")
    protected Boolean airConditionInd;
    @XmlAttribute(name = "TransmissionType")
    protected VehicleTransmissionType transmissionType;
    @XmlAttribute(name = "FuelType")
    protected String fuelType;
    @XmlAttribute(name = "DriveType")
    protected String driveType;

    /**
     * ��ȡvehType���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleCoreType.VehType }
     */
    public VehicleCoreType.VehType getVehType() {
        return vehType;
    }

    /**
     * ����vehType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleCoreType.VehType }
     */
    public void setVehType(VehicleCoreType.VehType value) {
        this.vehType = value;
    }

    /**
     * ��ȡvehClass���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleCoreType.VehClass }
     */
    public VehicleCoreType.VehClass getVehClass() {
        return vehClass;
    }

    /**
     * ����vehClass���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleCoreType.VehClass }
     */
    public void setVehClass(VehicleCoreType.VehClass value) {
        this.vehClass = value;
    }

    /**
     * ��ȡairConditionInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAirConditionInd() {
        return airConditionInd;
    }

    /**
     * ����airConditionInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAirConditionInd(Boolean value) {
        this.airConditionInd = value;
    }

    /**
     * ��ȡtransmissionType���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleTransmissionType }
     */
    public VehicleTransmissionType getTransmissionType() {
        return transmissionType;
    }

    /**
     * ����transmissionType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleTransmissionType }
     */
    public void setTransmissionType(VehicleTransmissionType value) {
        this.transmissionType = value;
    }

    /**
     * ��ȡfuelType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * ����fuelType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFuelType(String value) {
        this.fuelType = value;
    }

    /**
     * ��ȡdriveType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDriveType() {
        return driveType;
    }

    /**
     * ����driveType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDriveType(String value) {
        this.driveType = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehClass {

        @XmlAttribute(name = "Size")
        protected String size;

        /**
         * ��ȡsize���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSize() {
            return size;
        }

        /**
         * ����size���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSize(String value) {
            this.size = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="VehicleCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DoorCount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehType {

        @XmlAttribute(name = "VehicleCategory")
        protected String vehicleCategory;
        @XmlAttribute(name = "DoorCount")
        protected String doorCount;

        /**
         * ��ȡvehicleCategory���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVehicleCategory() {
            return vehicleCategory;
        }

        /**
         * ����vehicleCategory���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVehicleCategory(String value) {
            this.vehicleCategory = value;
        }

        /**
         * ��ȡdoorCount���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDoorCount() {
            return doorCount;
        }

        /**
         * ����doorCount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDoorCount(String value) {
            this.doorCount = value;
        }

    }

}
