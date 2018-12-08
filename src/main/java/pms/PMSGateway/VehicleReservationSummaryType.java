package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>VehicleReservationSummaryType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleReservationSummaryType">
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
 *         &lt;element name="PickUpLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="ReturnLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *         &lt;element name="Vehicle" type="{http://www.opentravel.org/OTA/2003/05}VehicleType" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReservationSummaryType", propOrder = {
        "confID",
        "pickUpLocation",
        "returnLocation",
        "personName",
        "vehicle",
        "vendor",
        "tpaExtensions"
})
public class VehicleReservationSummaryType {

    @XmlElement(name = "ConfID")
    protected List<VehicleReservationSummaryType.ConfID> confID;
    @XmlElement(name = "PickUpLocation")
    protected LocationType pickUpLocation;
    @XmlElement(name = "ReturnLocation")
    protected LocationType returnLocation;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "Vehicle")
    protected VehicleType vehicle;
    @XmlElement(name = "Vendor")
    protected CompanyNameType vendor;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "PickUpDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickUpDateTime;
    @XmlAttribute(name = "ReturnDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDateTime;
    @XmlAttribute(name = "ReservationStatus")
    protected String reservationStatus;
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
     * {@link VehicleReservationSummaryType.ConfID }
     */
    public List<VehicleReservationSummaryType.ConfID> getConfID() {
        if (confID == null) {
            confID = new ArrayList<VehicleReservationSummaryType.ConfID>();
        }
        return this.confID;
    }

    /**
     * ��ȡpickUpLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link LocationType }
     */
    public LocationType getPickUpLocation() {
        return pickUpLocation;
    }

    /**
     * ����pickUpLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link LocationType }
     */
    public void setPickUpLocation(LocationType value) {
        this.pickUpLocation = value;
    }

    /**
     * ��ȡreturnLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link LocationType }
     */
    public LocationType getReturnLocation() {
        return returnLocation;
    }

    /**
     * ����returnLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link LocationType }
     */
    public void setReturnLocation(LocationType value) {
        this.returnLocation = value;
    }

    /**
     * ��ȡpersonName���Ե�ֵ��
     *
     * @return possible object is
     * {@link PersonNameType }
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * ����personName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PersonNameType }
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
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
     * ��ȡpickUpDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPickUpDateTime() {
        return pickUpDateTime;
    }

    /**
     * ����pickUpDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setPickUpDateTime(XMLGregorianCalendar value) {
        this.pickUpDateTime = value;
    }

    /**
     * ��ȡreturnDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getReturnDateTime() {
        return returnDateTime;
    }

    /**
     * ����returnDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setReturnDateTime(XMLGregorianCalendar value) {
        this.returnDateTime = value;
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

}
