package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleLocationAdditionalDetailsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleLocationAdditionalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehRentLocInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationInformationType" minOccurs="0"/>
 *         &lt;element name="ParkLocation" type="{http://www.opentravel.org/OTA/2003/05}VehicleWhereAtFacilityType" minOccurs="0"/>
 *         &lt;element name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}VehicleWhereAtFacilityType" minOccurs="0"/>
 *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/>
 *         &lt;element name="Shuttle" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShuttleInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo" minOccurs="0"/>
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OneWayDropLocations" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * ��ȡvehRentLocInfos���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfVehicleLocationInformationType }
     */
    public ArrayOfVehicleLocationInformationType getVehRentLocInfos() {
        return vehRentLocInfos;
    }

    /**
     * ����vehRentLocInfos���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfVehicleLocationInformationType }
     */
    public void setVehRentLocInfos(ArrayOfVehicleLocationInformationType value) {
        this.vehRentLocInfos = value;
    }

    /**
     * ��ȡparkLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleWhereAtFacilityType }
     */
    public VehicleWhereAtFacilityType getParkLocation() {
        return parkLocation;
    }

    /**
     * ����parkLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleWhereAtFacilityType }
     */
    public void setParkLocation(VehicleWhereAtFacilityType value) {
        this.parkLocation = value;
    }

    /**
     * ��ȡcounterLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleWhereAtFacilityType }
     */
    public VehicleWhereAtFacilityType getCounterLocation() {
        return counterLocation;
    }

    /**
     * ����counterLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleWhereAtFacilityType }
     */
    public void setCounterLocation(VehicleWhereAtFacilityType value) {
        this.counterLocation = value;
    }

    /**
     * ��ȡoperationSchedules���Ե�ֵ��
     *
     * @return possible object is
     * {@link OperationSchedulesType }
     */
    public OperationSchedulesType getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * ����operationSchedules���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OperationSchedulesType }
     */
    public void setOperationSchedules(OperationSchedulesType value) {
        this.operationSchedules = value;
    }

    /**
     * ��ȡshuttle���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleLocationAdditionalDetailsType.Shuttle }
     */
    public VehicleLocationAdditionalDetailsType.Shuttle getShuttle() {
        return shuttle;
    }

    /**
     * ����shuttle���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleLocationAdditionalDetailsType.Shuttle }
     */
    public void setShuttle(VehicleLocationAdditionalDetailsType.Shuttle value) {
        this.shuttle = value;
    }

    /**
     * ��ȡoneWayDropLocations���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation }
     */
    public ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation getOneWayDropLocations() {
        return oneWayDropLocations;
    }

    /**
     * ����oneWayDropLocations���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation }
     */
    public void setOneWayDropLocations(ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation value) {
        this.oneWayDropLocations = value;
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
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ShuttleInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo" minOccurs="0"/>
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡshuttleInfos���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
         */
        public ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo getShuttleInfos() {
            return shuttleInfos;
        }

        /**
         * ����shuttleInfos���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
         */
        public void setShuttleInfos(ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo value) {
            this.shuttleInfos = value;
        }

        /**
         * ��ȡoperationSchedules���Ե�ֵ��
         *
         * @return possible object is
         * {@link OperationSchedulesType }
         */
        public OperationSchedulesType getOperationSchedules() {
            return operationSchedules;
        }

        /**
         * ����operationSchedules���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OperationSchedulesType }
         */
        public void setOperationSchedules(OperationSchedulesType value) {
            this.operationSchedules = value;
        }

    }

}
