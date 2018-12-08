package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>VehicleSegmentCoreType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleSegmentCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfID" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType" minOccurs="0"/>
 *         &lt;element name="Vehicle" type="{http://www.opentravel.org/OTA/2003/05}VehicleType" minOccurs="0"/>
 *         &lt;element name="RentalRate" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalRateType" minOccurs="0"/>
 *         &lt;element name="PricedEquips" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleEquipmentPricedType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleChargePurposeType1" minOccurs="0"/>
 *         &lt;element name="TotalCharge" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RateTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="EstimatedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSegmentCoreType", propOrder = {
        "confID",
        "vendor",
        "vehRentalCore",
        "vehicle",
        "rentalRate",
        "pricedEquips",
        "fees",
        "totalCharge",
        "tpaExtensions"
})
@XmlSeeAlso({
        pms.PMSGateway.VehicleReservationType.VehSegmentCore.class
})
public class VehicleSegmentCoreType {

    @XmlElement(name = "ConfID")
    protected List<VehicleSegmentCoreType.ConfID> confID;
    @XmlElement(name = "Vendor")
    protected CompanyNameType vendor;
    @XmlElement(name = "VehRentalCore")
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "Vehicle")
    protected VehicleType vehicle;
    @XmlElement(name = "RentalRate")
    protected VehicleRentalRateType rentalRate;
    @XmlElement(name = "PricedEquips")
    protected ArrayOfVehicleEquipmentPricedType pricedEquips;
    @XmlElement(name = "Fees")
    protected ArrayOfVehicleChargePurposeType1 fees;
    @XmlElement(name = "TotalCharge")
    protected VehicleSegmentCoreType.TotalCharge totalCharge;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "IndexNumber")
    protected BigInteger indexNumber;

    /**
     * Gets the value of the confID property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confID property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfID().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleSegmentCoreType.ConfID }
     */
    public List<VehicleSegmentCoreType.ConfID> getConfID() {
        if (confID == null) {
            confID = new ArrayList<VehicleSegmentCoreType.ConfID>();
        }
        return this.confID;
    }

    /**
     * ��ȡvendor���Ե�ֵ��
     *
     * @return possible object is
     * {@link CompanyNameType }
     */
    public CompanyNameType getVendor() {
        return vendor;
    }

    /**
     * ����vendor���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CompanyNameType }
     */
    public void setVendor(CompanyNameType value) {
        this.vendor = value;
    }

    /**
     * ��ȡvehRentalCore���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleRentalCoreType }
     */
    public VehicleRentalCoreType getVehRentalCore() {
        return vehRentalCore;
    }

    /**
     * ����vehRentalCore���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleRentalCoreType }
     */
    public void setVehRentalCore(VehicleRentalCoreType value) {
        this.vehRentalCore = value;
    }

    /**
     * ��ȡvehicle���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleType }
     */
    public VehicleType getVehicle() {
        return vehicle;
    }

    /**
     * ����vehicle���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleType }
     */
    public void setVehicle(VehicleType value) {
        this.vehicle = value;
    }

    /**
     * ��ȡrentalRate���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleRentalRateType }
     */
    public VehicleRentalRateType getRentalRate() {
        return rentalRate;
    }

    /**
     * ����rentalRate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleRentalRateType }
     */
    public void setRentalRate(VehicleRentalRateType value) {
        this.rentalRate = value;
    }

    /**
     * ��ȡpricedEquips���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfVehicleEquipmentPricedType }
     */
    public ArrayOfVehicleEquipmentPricedType getPricedEquips() {
        return pricedEquips;
    }

    /**
     * ����pricedEquips���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfVehicleEquipmentPricedType }
     */
    public void setPricedEquips(ArrayOfVehicleEquipmentPricedType value) {
        this.pricedEquips = value;
    }

    /**
     * ��ȡfees���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfVehicleChargePurposeType1 }
     */
    public ArrayOfVehicleChargePurposeType1 getFees() {
        return fees;
    }

    /**
     * ����fees���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfVehicleChargePurposeType1 }
     */
    public void setFees(ArrayOfVehicleChargePurposeType1 value) {
        this.fees = value;
    }

    /**
     * ��ȡtotalCharge���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleSegmentCoreType.TotalCharge }
     */
    public VehicleSegmentCoreType.TotalCharge getTotalCharge() {
        return totalCharge;
    }

    /**
     * ����totalCharge���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleSegmentCoreType.TotalCharge }
     */
    public void setTotalCharge(VehicleSegmentCoreType.TotalCharge value) {
        this.totalCharge = value;
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
     * ��ȡindexNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getIndexNumber() {
        return indexNumber;
    }

    /**
     * ����indexNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setIndexNumber(BigInteger value) {
        this.indexNumber = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ConfID
            extends UniqueIDType {

        @XmlAttribute(name = "Status")
        protected String status;

        /**
         * ��ȡstatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStatus() {
            return status;
        }

        /**
         * ����status���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStatus(String value) {
            this.status = value;
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
     *       &lt;attribute name="RateTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="EstimatedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalCharge {

        @XmlAttribute(name = "RateTotalAmount")
        protected BigDecimal rateTotalAmount;
        @XmlAttribute(name = "EstimatedTotalAmount")
        protected BigDecimal estimatedTotalAmount;

        /**
         * ��ȡrateTotalAmount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getRateTotalAmount() {
            return rateTotalAmount;
        }

        /**
         * ����rateTotalAmount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setRateTotalAmount(BigDecimal value) {
            this.rateTotalAmount = value;
        }

        /**
         * ��ȡestimatedTotalAmount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getEstimatedTotalAmount() {
            return estimatedTotalAmount;
        }

        /**
         * ����estimatedTotalAmount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setEstimatedTotalAmount(BigDecimal value) {
            this.estimatedTotalAmount = value;
        }

    }

}
