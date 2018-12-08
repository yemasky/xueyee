
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>VehicleReservationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleReservationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Customer" type="{http://www.opentravel.org/OTA/2003/05}CustomerPrimaryAdditionalType" minOccurs="0"/&gt;
 *         &lt;element name="VehSegmentCore" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentCoreType"&gt;
 *                 &lt;attribute name="OptionChangeAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VehSegmentInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentAdditionalInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 获取customer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerPrimaryAdditionalType }
     *     
     */
    public CustomerPrimaryAdditionalType getCustomer() {
        return customer;
    }

    /**
     * 设置customer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPrimaryAdditionalType }
     *     
     */
    public void setCustomer(CustomerPrimaryAdditionalType value) {
        this.customer = value;
    }

    /**
     * 获取vehSegmentCore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationType.VehSegmentCore }
     *     
     */
    public VehicleReservationType.VehSegmentCore getVehSegmentCore() {
        return vehSegmentCore;
    }

    /**
     * 设置vehSegmentCore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationType.VehSegmentCore }
     *     
     */
    public void setVehSegmentCore(VehicleReservationType.VehSegmentCore value) {
        this.vehSegmentCore = value;
    }

    /**
     * 获取vehSegmentInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleSegmentAdditionalInfoType }
     *     
     */
    public VehicleSegmentAdditionalInfoType getVehSegmentInfo() {
        return vehSegmentInfo;
    }

    /**
     * 设置vehSegmentInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSegmentAdditionalInfoType }
     *     
     */
    public void setVehSegmentInfo(VehicleSegmentAdditionalInfoType value) {
        this.vehSegmentInfo = value;
    }

    /**
     * 获取createDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * 设置createDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * 获取creatorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * 设置creatorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * 获取lastModifyDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * 设置lastModifyDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * 获取lastModifierID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * 设置lastModifierID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * 获取purgeDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * 设置purgeDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
    }

    /**
     * 获取reservationStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationStatus() {
        return reservationStatus;
    }

    /**
     * 设置reservationStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationStatus(String value) {
        this.reservationStatus = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentCoreType"&gt;
     *       &lt;attribute name="OptionChangeAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehSegmentCore
        extends VehicleSegmentCoreType
    {

        @XmlAttribute(name = "OptionChangeAllowedIndicator")
        protected Boolean optionChangeAllowedIndicator;

        /**
         * 获取optionChangeAllowedIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOptionChangeAllowedIndicator() {
            return optionChangeAllowedIndicator;
        }

        /**
         * 设置optionChangeAllowedIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOptionChangeAllowedIndicator(Boolean value) {
            this.optionChangeAllowedIndicator = value;
        }

    }

}
