package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * <p>VehiclePrefType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehiclePrefType">
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
 *       &lt;/sequence>
 *       &lt;attribute name="TypePref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *       &lt;attribute name="ClassPref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *       &lt;attribute name="AirConditionPref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *       &lt;attribute name="TransmissionPref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *       &lt;attribute name="VendorCarType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VehicleQty" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePrefType", propOrder = {
        "vehMakeModel"
})
public class VehiclePrefType
        extends VehicleCoreType {

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
     * ��ȡvehMakeModel���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehiclePrefType.VehMakeModel }
     */
    public VehiclePrefType.VehMakeModel getVehMakeModel() {
        return vehMakeModel;
    }

    /**
     * ����vehMakeModel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehiclePrefType.VehMakeModel }
     */
    public void setVehMakeModel(VehiclePrefType.VehMakeModel value) {
        this.vehMakeModel = value;
    }

    /**
     * ��ȡtypePref���Ե�ֵ��
     *
     * @return possible object is
     * {@link PreferLevelType }
     */
    public PreferLevelType getTypePref() {
        return typePref;
    }

    /**
     * ����typePref���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PreferLevelType }
     */
    public void setTypePref(PreferLevelType value) {
        this.typePref = value;
    }

    /**
     * ��ȡclassPref���Ե�ֵ��
     *
     * @return possible object is
     * {@link PreferLevelType }
     */
    public PreferLevelType getClassPref() {
        return classPref;
    }

    /**
     * ����classPref���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PreferLevelType }
     */
    public void setClassPref(PreferLevelType value) {
        this.classPref = value;
    }

    /**
     * ��ȡairConditionPref���Ե�ֵ��
     *
     * @return possible object is
     * {@link PreferLevelType }
     */
    public PreferLevelType getAirConditionPref() {
        return airConditionPref;
    }

    /**
     * ����airConditionPref���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PreferLevelType }
     */
    public void setAirConditionPref(PreferLevelType value) {
        this.airConditionPref = value;
    }

    /**
     * ��ȡtransmissionPref���Ե�ֵ��
     *
     * @return possible object is
     * {@link PreferLevelType }
     */
    public PreferLevelType getTransmissionPref() {
        return transmissionPref;
    }

    /**
     * ����transmissionPref���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PreferLevelType }
     */
    public void setTransmissionPref(PreferLevelType value) {
        this.transmissionPref = value;
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
     * ��ȡvehicleQty���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getVehicleQty() {
        return vehicleQty;
    }

    /**
     * ����vehicleQty���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setVehicleQty(BigInteger value) {
        this.vehicleQty = value;
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
