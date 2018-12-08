package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>VehicleType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType">
 *       &lt;sequence>
 *         &lt;element name="VehMakeModel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}gYear" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="VehIdentity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="VehicleAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LicensePlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VehicleID_Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VehicleColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PassengerQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BaggageQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="VendorCarType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OdometerUnitOfMeasure" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleType", propOrder = {
        "vehMakeModel",
        "pictureURL",
        "vehIdentity"
})
public class VehicleType
        extends VehicleCoreType {

    @XmlElement(name = "VehMakeModel")
    protected VehicleType.VehMakeModel vehMakeModel;
    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected String pictureURL;
    @XmlElement(name = "VehIdentity")
    protected VehicleType.VehIdentity vehIdentity;
    @XmlAttribute(name = "PassengerQuantity")
    protected String passengerQuantity;
    @XmlAttribute(name = "BaggageQuantity")
    protected BigInteger baggageQuantity;
    @XmlAttribute(name = "VendorCarType")
    protected String vendorCarType;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "UnitOfMeasureQuantity")
    protected BigDecimal unitOfMeasureQuantity;
    @XmlAttribute(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "OdometerUnitOfMeasure")
    protected DistanceUnitNameType odometerUnitOfMeasure;
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * ��ȡvehMakeModel���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleType.VehMakeModel }
     */
    public VehicleType.VehMakeModel getVehMakeModel() {
        return vehMakeModel;
    }

    /**
     * ����vehMakeModel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleType.VehMakeModel }
     */
    public void setVehMakeModel(VehicleType.VehMakeModel value) {
        this.vehMakeModel = value;
    }

    /**
     * ��ȡpictureURL���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPictureURL() {
        return pictureURL;
    }

    /**
     * ����pictureURL���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPictureURL(String value) {
        this.pictureURL = value;
    }

    /**
     * ��ȡvehIdentity���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleType.VehIdentity }
     */
    public VehicleType.VehIdentity getVehIdentity() {
        return vehIdentity;
    }

    /**
     * ����vehIdentity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleType.VehIdentity }
     */
    public void setVehIdentity(VehicleType.VehIdentity value) {
        this.vehIdentity = value;
    }

    /**
     * ��ȡpassengerQuantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     * ����passengerQuantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPassengerQuantity(String value) {
        this.passengerQuantity = value;
    }

    /**
     * ��ȡbaggageQuantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getBaggageQuantity() {
        return baggageQuantity;
    }

    /**
     * ����baggageQuantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setBaggageQuantity(BigInteger value) {
        this.baggageQuantity = value;
    }

    /**
     * ��ȡvendorCarType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getVendorCarType() {
        return vendorCarType;
    }

    /**
     * ����vendorCarType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVendorCarType(String value) {
        this.vendorCarType = value;
    }

    /**
     * ��ȡcode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCode() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * ��ȡcodeContext���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * ����codeContext���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * ��ȡunitOfMeasureQuantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getUnitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /**
     * ����unitOfMeasureQuantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setUnitOfMeasureQuantity(BigDecimal value) {
        this.unitOfMeasureQuantity = value;
    }

    /**
     * ��ȡunitOfMeasure���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * ����unitOfMeasure���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * ��ȡunitOfMeasureCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * ����unitOfMeasureCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * ��ȡstart���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStart() {
        return start;
    }

    /**
     * ����start���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * ��ȡduration���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDuration() {
        return duration;
    }

    /**
     * ����duration���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * ��ȡend���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEnd() {
        return end;
    }

    /**
     * ����end���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * ��ȡodometerUnitOfMeasure���Ե�ֵ��
     *
     * @return possible object is
     * {@link DistanceUnitNameType }
     */
    public DistanceUnitNameType getOdometerUnitOfMeasure() {
        return odometerUnitOfMeasure;
    }

    /**
     * ����odometerUnitOfMeasure���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DistanceUnitNameType }
     */
    public void setOdometerUnitOfMeasure(DistanceUnitNameType value) {
        this.odometerUnitOfMeasure = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
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
     *       &lt;attribute name="VehicleAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LicensePlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VehicleID_Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VehicleColor" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehIdentity {

        @XmlAttribute(name = "VehicleAssetNumber")
        protected String vehicleAssetNumber;
        @XmlAttribute(name = "LicensePlateNumber")
        protected String licensePlateNumber;
        @XmlAttribute(name = "StateProvCode")
        protected String stateProvCode;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "VehicleID_Number")
        protected String vehicleIDNumber;
        @XmlAttribute(name = "VehicleColor")
        protected String vehicleColor;

        /**
         * ��ȡvehicleAssetNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVehicleAssetNumber() {
            return vehicleAssetNumber;
        }

        /**
         * ����vehicleAssetNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVehicleAssetNumber(String value) {
            this.vehicleAssetNumber = value;
        }

        /**
         * ��ȡlicensePlateNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLicensePlateNumber() {
            return licensePlateNumber;
        }

        /**
         * ����licensePlateNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLicensePlateNumber(String value) {
            this.licensePlateNumber = value;
        }

        /**
         * ��ȡstateProvCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStateProvCode() {
            return stateProvCode;
        }

        /**
         * ����stateProvCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStateProvCode(String value) {
            this.stateProvCode = value;
        }

        /**
         * ��ȡcountryCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * ����countryCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * ��ȡvehicleIDNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVehicleIDNumber() {
            return vehicleIDNumber;
        }

        /**
         * ����vehicleIDNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVehicleIDNumber(String value) {
            this.vehicleIDNumber = value;
        }

        /**
         * ��ȡvehicleColor���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVehicleColor() {
            return vehicleColor;
        }

        /**
         * ����vehicleColor���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVehicleColor(String value) {
            this.vehicleColor = value;
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
     *       &lt;attribute name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}gYear" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehMakeModel {

        @XmlAttribute(name = "ModelYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar modelYear;

        /**
         * ��ȡmodelYear���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getModelYear() {
            return modelYear;
        }

        /**
         * ����modelYear���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setModelYear(XMLGregorianCalendar value) {
            this.modelYear = value;
        }

    }

}
