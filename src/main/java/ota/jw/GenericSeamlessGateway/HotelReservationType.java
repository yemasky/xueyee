
package ota.jw.GenericSeamlessGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>HotelReservationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelReservationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RoomStays" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStaysTypeRoomStay" minOccurs="0"/&gt;
 *         &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceType" minOccurs="0"/&gt;
 *         &lt;element name="BillingInstructionCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ResGuestRPH" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="BillingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="BillingType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResGuests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfResGuestType" minOccurs="0"/&gt;
 *         &lt;element name="ResGlobalInfo" type="{http://www.opentravel.org/OTA/2003/05}ResGlobalInfoType" minOccurs="0"/&gt;
 *         &lt;element name="WrittenConfInst" type="{http://www.opentravel.org/OTA/2003/05}WrittenConfInstType" minOccurs="0"/&gt;
 *         &lt;element name="Queue" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RoomStayReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ForcedSellIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ServiceOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WalkInIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RoomNumberLockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OriginalDeliveryMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PassiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationType", propOrder = {
    "pos",
    "uniqueID",
    "roomStays",
    "services",
    "billingInstructionCode",
    "resGuests",
    "resGlobalInfo",
    "writtenConfInst",
    "queue",
    "tpaExtensions"
})
@XmlSeeAlso({
    ota.jw.GenericSeamlessGateway.HotelReservationsType.HotelReservation.class
})
public class HotelReservationType {

    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElement(name = "UniqueID")
    protected List<UniqueIDType> uniqueID;
    @XmlElement(name = "RoomStays")
    protected ArrayOfRoomStaysTypeRoomStay roomStays;
    @XmlElement(name = "Services")
    protected ArrayOfServiceType services;
    @XmlElement(name = "BillingInstructionCode")
    protected List<HotelReservationType.BillingInstructionCode> billingInstructionCode;
    @XmlElement(name = "ResGuests")
    protected ArrayOfResGuestType resGuests;
    @XmlElement(name = "ResGlobalInfo")
    protected ResGlobalInfoType resGlobalInfo;
    @XmlElement(name = "WrittenConfInst")
    protected WrittenConfInstType writtenConfInst;
    @XmlElement(name = "Queue")
    protected HotelReservationType.Queue queue;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "RoomStayReservation")
    protected Boolean roomStayReservation;
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
    @XmlAttribute(name = "ResStatus")
    protected String resStatus;
    @XmlAttribute(name = "ForcedSellIndicator")
    protected Boolean forcedSellIndicator;
    @XmlAttribute(name = "ServiceOverrideIndicator")
    protected Boolean serviceOverrideIndicator;
    @XmlAttribute(name = "RateOverrideIndicator")
    protected Boolean rateOverrideIndicator;
    @XmlAttribute(name = "WalkInIndicator")
    protected Boolean walkInIndicator;
    @XmlAttribute(name = "RoomNumberLockedIndicator")
    protected Boolean roomNumberLockedIndicator;
    @XmlAttribute(name = "OriginalDeliveryMethodCode")
    protected String originalDeliveryMethodCode;
    @XmlAttribute(name = "PassiveIndicator")
    protected Boolean passiveIndicator;

    /**
     * 获取pos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public ArrayOfSourceType getPOS() {
        return pos;
    }

    /**
     * 设置pos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public void setPOS(ArrayOfSourceType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getUniqueID() {
        if (uniqueID == null) {
            uniqueID = new ArrayList<UniqueIDType>();
        }
        return this.uniqueID;
    }

    /**
     * 获取roomStays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomStaysTypeRoomStay }
     *     
     */
    public ArrayOfRoomStaysTypeRoomStay getRoomStays() {
        return roomStays;
    }

    /**
     * 设置roomStays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomStaysTypeRoomStay }
     *     
     */
    public void setRoomStays(ArrayOfRoomStaysTypeRoomStay value) {
        this.roomStays = value;
    }

    /**
     * 获取services属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceType }
     *     
     */
    public ArrayOfServiceType getServices() {
        return services;
    }

    /**
     * 设置services属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceType }
     *     
     */
    public void setServices(ArrayOfServiceType value) {
        this.services = value;
    }

    /**
     * Gets the value of the billingInstructionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingInstructionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingInstructionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReservationType.BillingInstructionCode }
     * 
     * 
     */
    public List<HotelReservationType.BillingInstructionCode> getBillingInstructionCode() {
        if (billingInstructionCode == null) {
            billingInstructionCode = new ArrayList<HotelReservationType.BillingInstructionCode>();
        }
        return this.billingInstructionCode;
    }

    /**
     * 获取resGuests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResGuestType }
     *     
     */
    public ArrayOfResGuestType getResGuests() {
        return resGuests;
    }

    /**
     * 设置resGuests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResGuestType }
     *     
     */
    public void setResGuests(ArrayOfResGuestType value) {
        this.resGuests = value;
    }

    /**
     * 获取resGlobalInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResGlobalInfoType }
     *     
     */
    public ResGlobalInfoType getResGlobalInfo() {
        return resGlobalInfo;
    }

    /**
     * 设置resGlobalInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResGlobalInfoType }
     *     
     */
    public void setResGlobalInfo(ResGlobalInfoType value) {
        this.resGlobalInfo = value;
    }

    /**
     * 获取writtenConfInst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WrittenConfInstType }
     *     
     */
    public WrittenConfInstType getWrittenConfInst() {
        return writtenConfInst;
    }

    /**
     * 设置writtenConfInst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WrittenConfInstType }
     *     
     */
    public void setWrittenConfInst(WrittenConfInstType value) {
        this.writtenConfInst = value;
    }

    /**
     * 获取queue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationType.Queue }
     *     
     */
    public HotelReservationType.Queue getQueue() {
        return queue;
    }

    /**
     * 设置queue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationType.Queue }
     *     
     */
    public void setQueue(HotelReservationType.Queue value) {
        this.queue = value;
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
     * 获取roomStayReservation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoomStayReservation() {
        return roomStayReservation;
    }

    /**
     * 设置roomStayReservation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoomStayReservation(Boolean value) {
        this.roomStayReservation = value;
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
     * 获取resStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResStatus() {
        return resStatus;
    }

    /**
     * 设置resStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResStatus(String value) {
        this.resStatus = value;
    }

    /**
     * 获取forcedSellIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcedSellIndicator() {
        return forcedSellIndicator;
    }

    /**
     * 设置forcedSellIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcedSellIndicator(Boolean value) {
        this.forcedSellIndicator = value;
    }

    /**
     * 获取serviceOverrideIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceOverrideIndicator() {
        return serviceOverrideIndicator;
    }

    /**
     * 设置serviceOverrideIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceOverrideIndicator(Boolean value) {
        this.serviceOverrideIndicator = value;
    }

    /**
     * 获取rateOverrideIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateOverrideIndicator() {
        return rateOverrideIndicator;
    }

    /**
     * 设置rateOverrideIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateOverrideIndicator(Boolean value) {
        this.rateOverrideIndicator = value;
    }

    /**
     * 获取walkInIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWalkInIndicator() {
        return walkInIndicator;
    }

    /**
     * 设置walkInIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWalkInIndicator(Boolean value) {
        this.walkInIndicator = value;
    }

    /**
     * 获取roomNumberLockedIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoomNumberLockedIndicator() {
        return roomNumberLockedIndicator;
    }

    /**
     * 设置roomNumberLockedIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoomNumberLockedIndicator(Boolean value) {
        this.roomNumberLockedIndicator = value;
    }

    /**
     * 获取originalDeliveryMethodCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDeliveryMethodCode() {
        return originalDeliveryMethodCode;
    }

    /**
     * 设置originalDeliveryMethodCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDeliveryMethodCode(String value) {
        this.originalDeliveryMethodCode = value;
    }

    /**
     * 获取passiveIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassiveIndicator() {
        return passiveIndicator;
    }

    /**
     * 设置passiveIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassiveIndicator(Boolean value) {
        this.passiveIndicator = value;
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
     *         &lt;element name="ResGuestRPH" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="BillingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BillingType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resGuestRPH"
    })
    public static class BillingInstructionCode {

        @XmlElement(name = "ResGuestRPH")
        protected List<HotelReservationType.BillingInstructionCode.ResGuestRPH> resGuestRPH;
        @XmlAttribute(name = "BillingCode")
        protected String billingCode;
        @XmlAttribute(name = "BillingType")
        protected String billingType;
        @XmlAttribute(name = "AuthorizationCode")
        protected String authorizationCode;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "AccountNumber")
        protected String accountNumber;

        /**
         * Gets the value of the resGuestRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resGuestRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResGuestRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelReservationType.BillingInstructionCode.ResGuestRPH }
         * 
         * 
         */
        public List<HotelReservationType.BillingInstructionCode.ResGuestRPH> getResGuestRPH() {
            if (resGuestRPH == null) {
                resGuestRPH = new ArrayList<HotelReservationType.BillingInstructionCode.ResGuestRPH>();
            }
            return this.resGuestRPH;
        }

        /**
         * 获取billingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingCode() {
            return billingCode;
        }

        /**
         * 设置billingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingCode(String value) {
            this.billingCode = value;
        }

        /**
         * 获取billingType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingType() {
            return billingType;
        }

        /**
         * 设置billingType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingType(String value) {
            this.billingType = value;
        }

        /**
         * 获取authorizationCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthorizationCode() {
            return authorizationCode;
        }

        /**
         * 设置authorizationCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthorizationCode(String value) {
            this.authorizationCode = value;
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
         * 获取accountNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * 设置accountNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountNumber(String value) {
            this.accountNumber = value;
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
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ResGuestRPH {

            @XmlAttribute(name = "RPH")
            protected String rph;

            /**
             * 获取rph属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * 设置rph属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

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
     *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Queue {

        @XmlAttribute(name = "PseudoCityCode")
        protected String pseudoCityCode;
        @XmlAttribute(name = "QueueNumber")
        protected String queueNumber;
        @XmlAttribute(name = "QueueCategory")
        protected String queueCategory;
        @XmlAttribute(name = "SystemCode")
        protected String systemCode;
        @XmlAttribute(name = "QueueID")
        protected String queueID;

        /**
         * 获取pseudoCityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPseudoCityCode() {
            return pseudoCityCode;
        }

        /**
         * 设置pseudoCityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPseudoCityCode(String value) {
            this.pseudoCityCode = value;
        }

        /**
         * 获取queueNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueNumber() {
            return queueNumber;
        }

        /**
         * 设置queueNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueNumber(String value) {
            this.queueNumber = value;
        }

        /**
         * 获取queueCategory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueCategory() {
            return queueCategory;
        }

        /**
         * 设置queueCategory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueCategory(String value) {
            this.queueCategory = value;
        }

        /**
         * 获取systemCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSystemCode() {
            return systemCode;
        }

        /**
         * 设置systemCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSystemCode(String value) {
            this.systemCode = value;
        }

        /**
         * 获取queueID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueID() {
            return queueID;
        }

        /**
         * 设置queueID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueID(String value) {
            this.queueID = value;
        }

    }

}
