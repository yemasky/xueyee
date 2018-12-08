
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleLocationAdditionalDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationAdditionalDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehRentLocInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationInformationType" minOccurs="0"/&gt;
 *         &lt;element name="ParkLocation" type="{http://www.opentravel.org/OTA/2003/05}VehicleWhereAtFacilityType" minOccurs="0"/&gt;
 *         &lt;element name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}VehicleWhereAtFacilityType" minOccurs="0"/&gt;
 *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/&gt;
 *         &lt;element name="Shuttle" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ShuttleInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo" minOccurs="0"/&gt;
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OneWayDropLocations" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationAdditionalDetailsType", propOrder = {
    "vehRentLocInfos",
    "parkLocation",
    "counterLocation",
    "operationSchedules",
    "shuttle",
    "oneWayDropLocations",
    "tpaExtensions"
})
public class VehicleLocationAdditionalDetailsType {

    @XmlElement(name = "VehRentLocInfos")
    protected ArrayOfVehicleLocationInformationType vehRentLocInfos;
    @XmlElement(name = "ParkLocation")
    protected VehicleWhereAtFacilityType parkLocation;
    @XmlElement(name = "CounterLocation")
    protected VehicleWhereAtFacilityType counterLocation;
    @XmlElement(name = "OperationSchedules")
    protected OperationSchedulesType operationSchedules;
    @XmlElement(name = "Shuttle")
    protected VehicleLocationAdditionalDetailsType.Shuttle shuttle;
    @XmlElement(name = "OneWayDropLocations")
    protected ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation oneWayDropLocations;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * 获取vehRentLocInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationInformationType }
     *     
     */
    public ArrayOfVehicleLocationInformationType getVehRentLocInfos() {
        return vehRentLocInfos;
    }

    /**
     * 设置vehRentLocInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationInformationType }
     *     
     */
    public void setVehRentLocInfos(ArrayOfVehicleLocationInformationType value) {
        this.vehRentLocInfos = value;
    }

    /**
     * 获取parkLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public VehicleWhereAtFacilityType getParkLocation() {
        return parkLocation;
    }

    /**
     * 设置parkLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public void setParkLocation(VehicleWhereAtFacilityType value) {
        this.parkLocation = value;
    }

    /**
     * 获取counterLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public VehicleWhereAtFacilityType getCounterLocation() {
        return counterLocation;
    }

    /**
     * 设置counterLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public void setCounterLocation(VehicleWhereAtFacilityType value) {
        this.counterLocation = value;
    }

    /**
     * 获取operationSchedules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperationSchedulesType }
     *     
     */
    public OperationSchedulesType getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * 设置operationSchedules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSchedulesType }
     *     
     */
    public void setOperationSchedules(OperationSchedulesType value) {
        this.operationSchedules = value;
    }

    /**
     * 获取shuttle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalDetailsType.Shuttle }
     *     
     */
    public VehicleLocationAdditionalDetailsType.Shuttle getShuttle() {
        return shuttle;
    }

    /**
     * 设置shuttle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalDetailsType.Shuttle }
     *     
     */
    public void setShuttle(VehicleLocationAdditionalDetailsType.Shuttle value) {
        this.shuttle = value;
    }

    /**
     * 获取oneWayDropLocations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation }
     *     
     */
    public ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation getOneWayDropLocations() {
        return oneWayDropLocations;
    }

    /**
     * 设置oneWayDropLocations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation }
     *     
     */
    public void setOneWayDropLocations(ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation value) {
        this.oneWayDropLocations = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ShuttleInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo" minOccurs="0"/&gt;
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "shuttleInfos",
        "operationSchedules"
    })
    public static class Shuttle {

        @XmlElement(name = "ShuttleInfos")
        protected ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo shuttleInfos;
        @XmlElement(name = "OperationSchedules")
        protected OperationSchedulesType operationSchedules;

        /**
         * 获取shuttleInfos属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
         *     
         */
        public ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo getShuttleInfos() {
            return shuttleInfos;
        }

        /**
         * 设置shuttleInfos属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
         *     
         */
        public void setShuttleInfos(ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo value) {
            this.shuttleInfos = value;
        }

        /**
         * 获取operationSchedules属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OperationSchedulesType }
         *     
         */
        public OperationSchedulesType getOperationSchedules() {
            return operationSchedules;
        }

        /**
         * 设置operationSchedules属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OperationSchedulesType }
         *     
         */
        public void setOperationSchedules(OperationSchedulesType value) {
            this.operationSchedules = value;
        }

    }

}
