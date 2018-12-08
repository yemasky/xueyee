
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>VehicleType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehMakeModel" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}gYear" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="VehIdentity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="VehicleAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LicensePlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="VehicleID_Number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="VehicleColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PassengerQuantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BaggageQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="VendorCarType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OdometerUnitOfMeasure" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" /&gt;
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleType", propOrder = {
    "vehMakeModel",
    "pictureURL",
    "vehIdentity"
})
public class VehicleType
    extends VehicleCoreType
{

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
     * 获取vehMakeModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleType.VehMakeModel }
     *     
     */
    public VehicleType.VehMakeModel getVehMakeModel() {
        return vehMakeModel;
    }

    /**
     * 设置vehMakeModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType.VehMakeModel }
     *     
     */
    public void setVehMakeModel(VehicleType.VehMakeModel value) {
        this.vehMakeModel = value;
    }

    /**
     * 获取pictureURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureURL() {
        return pictureURL;
    }

    /**
     * 设置pictureURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureURL(String value) {
        this.pictureURL = value;
    }

    /**
     * 获取vehIdentity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleType.VehIdentity }
     *     
     */
    public VehicleType.VehIdentity getVehIdentity() {
        return vehIdentity;
    }

    /**
     * 设置vehIdentity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType.VehIdentity }
     *     
     */
    public void setVehIdentity(VehicleType.VehIdentity value) {
        this.vehIdentity = value;
    }

    /**
     * 获取passengerQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     * 设置passengerQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerQuantity(String value) {
        this.passengerQuantity = value;
    }

    /**
     * 获取baggageQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaggageQuantity() {
        return baggageQuantity;
    }

    /**
     * 设置baggageQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaggageQuantity(BigInteger value) {
        this.baggageQuantity = value;
    }

    /**
     * 获取vendorCarType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCarType() {
        return vendorCarType;
    }

    /**
     * 设置vendorCarType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCarType(String value) {
        this.vendorCarType = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取codeContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * 设置codeContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * 获取unitOfMeasureQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /**
     * 设置unitOfMeasureQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitOfMeasureQuantity(BigDecimal value) {
        this.unitOfMeasureQuantity = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * 获取unitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * 设置unitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * 获取start属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置start属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * 获取end属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * 设置end属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * 获取odometerUnitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public DistanceUnitNameType getOdometerUnitOfMeasure() {
        return odometerUnitOfMeasure;
    }

    /**
     * 设置odometerUnitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public void setOdometerUnitOfMeasure(DistanceUnitNameType value) {
        this.odometerUnitOfMeasure = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     *       &lt;attribute name="VehicleAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LicensePlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="VehicleID_Number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="VehicleColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取vehicleAssetNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleAssetNumber() {
            return vehicleAssetNumber;
        }

        /**
         * 设置vehicleAssetNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleAssetNumber(String value) {
            this.vehicleAssetNumber = value;
        }

        /**
         * 获取licensePlateNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicensePlateNumber() {
            return licensePlateNumber;
        }

        /**
         * 设置licensePlateNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicensePlateNumber(String value) {
            this.licensePlateNumber = value;
        }

        /**
         * 获取stateProvCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateProvCode() {
            return stateProvCode;
        }

        /**
         * 设置stateProvCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateProvCode(String value) {
            this.stateProvCode = value;
        }

        /**
         * 获取countryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * 设置countryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * 获取vehicleIDNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleIDNumber() {
            return vehicleIDNumber;
        }

        /**
         * 设置vehicleIDNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleIDNumber(String value) {
            this.vehicleIDNumber = value;
        }

        /**
         * 获取vehicleColor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleColor() {
            return vehicleColor;
        }

        /**
         * 设置vehicleColor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleColor(String value) {
            this.vehicleColor = value;
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
     *       &lt;attribute name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}gYear" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehMakeModel {

        @XmlAttribute(name = "ModelYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar modelYear;

        /**
         * 获取modelYear属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getModelYear() {
            return modelYear;
        }

        /**
         * 设置modelYear属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setModelYear(XMLGregorianCalendar value) {
            this.modelYear = value;
        }

    }

}
