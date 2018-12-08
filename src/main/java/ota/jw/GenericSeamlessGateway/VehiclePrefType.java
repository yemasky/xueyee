
package ota.jw.GenericSeamlessGateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>VehiclePrefType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehiclePrefType"&gt;
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
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TypePref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *       &lt;attribute name="ClassPref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *       &lt;attribute name="AirConditionPref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *       &lt;attribute name="TransmissionPref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *       &lt;attribute name="VendorCarType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VehicleQty" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePrefType", propOrder = {
    "vehMakeModel"
})
public class VehiclePrefType
    extends VehicleCoreType
{

    @XmlElement(name = "VehMakeModel")
    protected VehiclePrefType.VehMakeModel vehMakeModel;
    @XmlAttribute(name = "TypePref")
    protected PreferLevelType typePref;
    @XmlAttribute(name = "ClassPref")
    protected PreferLevelType classPref;
    @XmlAttribute(name = "AirConditionPref")
    protected PreferLevelType airConditionPref;
    @XmlAttribute(name = "TransmissionPref")
    protected PreferLevelType transmissionPref;
    @XmlAttribute(name = "VendorCarType")
    protected String vendorCarType;
    @XmlAttribute(name = "VehicleQty")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger vehicleQty;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;

    /**
     * 获取vehMakeModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehiclePrefType.VehMakeModel }
     *     
     */
    public VehiclePrefType.VehMakeModel getVehMakeModel() {
        return vehMakeModel;
    }

    /**
     * 设置vehMakeModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePrefType.VehMakeModel }
     *     
     */
    public void setVehMakeModel(VehiclePrefType.VehMakeModel value) {
        this.vehMakeModel = value;
    }

    /**
     * 获取typePref属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getTypePref() {
        return typePref;
    }

    /**
     * 设置typePref属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setTypePref(PreferLevelType value) {
        this.typePref = value;
    }

    /**
     * 获取classPref属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getClassPref() {
        return classPref;
    }

    /**
     * 设置classPref属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setClassPref(PreferLevelType value) {
        this.classPref = value;
    }

    /**
     * 获取airConditionPref属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getAirConditionPref() {
        return airConditionPref;
    }

    /**
     * 设置airConditionPref属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setAirConditionPref(PreferLevelType value) {
        this.airConditionPref = value;
    }

    /**
     * 获取transmissionPref属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getTransmissionPref() {
        return transmissionPref;
    }

    /**
     * 设置transmissionPref属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setTransmissionPref(PreferLevelType value) {
        this.transmissionPref = value;
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
     * 获取vehicleQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleQty() {
        return vehicleQty;
    }

    /**
     * 设置vehicleQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleQty(BigInteger value) {
        this.vehicleQty = value;
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
