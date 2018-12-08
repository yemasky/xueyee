
package ota.jw.ARIPmsGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleCoreType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="VehicleCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DoorCount" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VehClass" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AirConditionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TransmissionType" type="{http://www.opentravel.org/OTA/2003/05}VehicleTransmissionType" /&gt;
 *       &lt;attribute name="FuelType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Unspecified"/&gt;
 *             &lt;enumeration value="Diesel"/&gt;
 *             &lt;enumeration value="Hybrid"/&gt;
 *             &lt;enumeration value="Electric"/&gt;
 *             &lt;enumeration value="LPG_CompressedGas"/&gt;
 *             &lt;enumeration value="Hydrogen"/&gt;
 *             &lt;enumeration value="MultiFuel"/&gt;
 *             &lt;enumeration value="Petrol"/&gt;
 *             &lt;enumeration value="Ethanol"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DriveType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="AWD"/&gt;
 *             &lt;enumeration value="4WD"/&gt;
 *             &lt;enumeration value="Unspecified"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 获取vehType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleCoreType.VehType }
     *     
     */
    public VehicleCoreType.VehType getVehType() {
        return vehType;
    }

    /**
     * 设置vehType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCoreType.VehType }
     *     
     */
    public void setVehType(VehicleCoreType.VehType value) {
        this.vehType = value;
    }

    /**
     * 获取vehClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleCoreType.VehClass }
     *     
     */
    public VehicleCoreType.VehClass getVehClass() {
        return vehClass;
    }

    /**
     * 设置vehClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCoreType.VehClass }
     *     
     */
    public void setVehClass(VehicleCoreType.VehClass value) {
        this.vehClass = value;
    }

    /**
     * 获取airConditionInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirConditionInd() {
        return airConditionInd;
    }

    /**
     * 设置airConditionInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirConditionInd(Boolean value) {
        this.airConditionInd = value;
    }

    /**
     * 获取transmissionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleTransmissionType }
     *     
     */
    public VehicleTransmissionType getTransmissionType() {
        return transmissionType;
    }

    /**
     * 设置transmissionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTransmissionType }
     *     
     */
    public void setTransmissionType(VehicleTransmissionType value) {
        this.transmissionType = value;
    }

    /**
     * 获取fuelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * 设置fuelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelType(String value) {
        this.fuelType = value;
    }

    /**
     * 获取driveType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveType() {
        return driveType;
    }

    /**
     * 设置driveType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveType(String value) {
        this.driveType = value;
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
     *       &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehClass {

        @XmlAttribute(name = "Size")
        protected String size;

        /**
         * 获取size属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSize() {
            return size;
        }

        /**
         * 设置size属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSize(String value) {
            this.size = value;
        }

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
     *       &lt;attribute name="VehicleCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DoorCount" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehType {

        @XmlAttribute(name = "VehicleCategory")
        protected String vehicleCategory;
        @XmlAttribute(name = "DoorCount")
        protected String doorCount;

        /**
         * 获取vehicleCategory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleCategory() {
            return vehicleCategory;
        }

        /**
         * 设置vehicleCategory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleCategory(String value) {
            this.vehicleCategory = value;
        }

        /**
         * 获取doorCount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDoorCount() {
            return doorCount;
        }

        /**
         * 设置doorCount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDoorCount(String value) {
            this.doorCount = value;
        }

    }

}
