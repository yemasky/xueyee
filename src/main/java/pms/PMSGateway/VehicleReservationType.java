package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>VehicleReservationType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" type="{http://www.opentravel.org/OTA/2003/05}CustomerPrimaryAdditionalType" minOccurs="0"/>
 *         &lt;element name="VehSegmentCore" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentCoreType">
 *                 &lt;attribute name="OptionChangeAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehSegmentInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentAdditionalInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReservationType", propOrder = {
        "customer",
        "vehSegmentCore",
        "vehSegmentInfo"
})
public class VehicleReservationType {

    @XmlElement(name = "Customer")
    protected CustomerPrimaryAdditionalType customer;
    @XmlElement(name = "VehSegmentCore")
    protected VehicleReservationType.VehSegmentCore vehSegmentCore;
    @XmlElement(name = "VehSegmentInfo")
    protected VehicleSegmentAdditionalInfoType vehSegmentInfo;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "PurgeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purgeDate;
    @XmlAttribute(name = "ReservationStatus")
    protected String reservationStatus;

    /**
     * ��ȡcustomer���Ե�ֵ��
     *
     * @return possible object is
     * {@link CustomerPrimaryAdditionalType }
     */
    public CustomerPrimaryAdditionalType getCustomer() {
        return customer;
    }

    /**
     * ����customer���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CustomerPrimaryAdditionalType }
     */
    public void setCustomer(CustomerPrimaryAdditionalType value) {
        this.customer = value;
    }

    /**
     * ��ȡvehSegmentCore���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleReservationType.VehSegmentCore }
     */
    public VehicleReservationType.VehSegmentCore getVehSegmentCore() {
        return vehSegmentCore;
    }

    /**
     * ����vehSegmentCore���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleReservationType.VehSegmentCore }
     */
    public void setVehSegmentCore(VehicleReservationType.VehSegmentCore value) {
        this.vehSegmentCore = value;
    }

    /**
     * ��ȡvehSegmentInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleSegmentAdditionalInfoType }
     */
    public VehicleSegmentAdditionalInfoType getVehSegmentInfo() {
        return vehSegmentInfo;
    }

    /**
     * ����vehSegmentInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleSegmentAdditionalInfoType }
     */
    public void setVehSegmentInfo(VehicleSegmentAdditionalInfoType value) {
        this.vehSegmentInfo = value;
    }

    /**
     * ��ȡcreateDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * ����createDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * ��ȡcreatorID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * ����creatorID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * ��ȡlastModifyDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * ����lastModifyDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * ��ȡlastModifierID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * ����lastModifierID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * ��ȡpurgeDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * ����purgeDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
    }

    /**
     * ��ȡreservationStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getReservationStatus() {
        return reservationStatus;
    }

    /**
     * ����reservationStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReservationStatus(String value) {
        this.reservationStatus = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentCoreType">
     *       &lt;attribute name="OptionChangeAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehSegmentCore
            extends VehicleSegmentCoreType {

        @XmlAttribute(name = "OptionChangeAllowedIndicator")
        protected Boolean optionChangeAllowedIndicator;

        /**
         * ��ȡoptionChangeAllowedIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isOptionChangeAllowedIndicator() {
            return optionChangeAllowedIndicator;
        }

        /**
         * ����optionChangeAllowedIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setOptionChangeAllowedIndicator(Boolean value) {
            this.optionChangeAllowedIndicator = value;
        }

    }

}
