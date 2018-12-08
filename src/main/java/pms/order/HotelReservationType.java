package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>HotelReservationType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HotelReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomStays" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStaysTypeRoomStay" minOccurs="0"/>
 *         &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceType" minOccurs="0"/>
 *         &lt;element name="BillingInstructionCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ResGuestRPH" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="BillingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BillingType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResGuests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfResGuestType" minOccurs="0"/>
 *         &lt;element name="ResGlobalInfo" type="{http://www.opentravel.org/OTA/2003/05}ResGlobalInfoType" minOccurs="0"/>
 *         &lt;element name="WrittenConfInst" type="{http://www.opentravel.org/OTA/2003/05}WrittenConfInstType" minOccurs="0"/>
 *         &lt;element name="Queue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RoomStayReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ForcedSellIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ServiceOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WalkInIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RoomNumberLockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OriginalDeliveryMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
        pms.order.HotelReservationsType.HotelReservation.class
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
     * ��ȡpos���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfSourceType }
     */
    public ArrayOfSourceType getPOS() {
        return pos;
    }

    /**
     * ����pos���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfSourceType }
     */
    public void setPOS(ArrayOfSourceType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueID().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     */
    public List<UniqueIDType> getUniqueID() {
        if (uniqueID == null) {
            uniqueID = new ArrayList<UniqueIDType>();
        }
        return this.uniqueID;
    }

    /**
     * ��ȡroomStays���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRoomStaysTypeRoomStay }
     */
    public ArrayOfRoomStaysTypeRoomStay getRoomStays() {
        return roomStays;
    }

    /**
     * ����roomStays���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRoomStaysTypeRoomStay }
     */
    public void setRoomStays(ArrayOfRoomStaysTypeRoomStay value) {
        this.roomStays = value;
    }

    /**
     * ��ȡservices���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfServiceType }
     */
    public ArrayOfServiceType getServices() {
        return services;
    }

    /**
     * ����services���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfServiceType }
     */
    public void setServices(ArrayOfServiceType value) {
        this.services = value;
    }

    /**
     * Gets the value of the billingInstructionCode property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingInstructionCode property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingInstructionCode().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReservationType.BillingInstructionCode }
     */
    public List<HotelReservationType.BillingInstructionCode> getBillingInstructionCode() {
        if (billingInstructionCode == null) {
            billingInstructionCode = new ArrayList<HotelReservationType.BillingInstructionCode>();
        }
        return this.billingInstructionCode;
    }

    /**
     * ��ȡresGuests���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfResGuestType }
     */
    public ArrayOfResGuestType getResGuests() {
        return resGuests;
    }

    /**
     * ����resGuests���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfResGuestType }
     */
    public void setResGuests(ArrayOfResGuestType value) {
        this.resGuests = value;
    }

    /**
     * ��ȡresGlobalInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link ResGlobalInfoType }
     */
    public ResGlobalInfoType getResGlobalInfo() {
        return resGlobalInfo;
    }

    /**
     * ����resGlobalInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ResGlobalInfoType }
     */
    public void setResGlobalInfo(ResGlobalInfoType value) {
        this.resGlobalInfo = value;
    }

    /**
     * ��ȡwrittenConfInst���Ե�ֵ��
     *
     * @return possible object is
     * {@link WrittenConfInstType }
     */
    public WrittenConfInstType getWrittenConfInst() {
        return writtenConfInst;
    }

    /**
     * ����writtenConfInst���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link WrittenConfInstType }
     */
    public void setWrittenConfInst(WrittenConfInstType value) {
        this.writtenConfInst = value;
    }

    /**
     * ��ȡqueue���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelReservationType.Queue }
     */
    public HotelReservationType.Queue getQueue() {
        return queue;
    }

    /**
     * ����queue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelReservationType.Queue }
     */
    public void setQueue(HotelReservationType.Queue value) {
        this.queue = value;
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
     * ��ȡroomStayReservation���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRoomStayReservation() {
        return roomStayReservation;
    }

    /**
     * ����roomStayReservation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRoomStayReservation(Boolean value) {
        this.roomStayReservation = value;
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
     * ��ȡresStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getResStatus() {
        return resStatus;
    }

    /**
     * ����resStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResStatus(String value) {
        this.resStatus = value;
    }

    /**
     * ��ȡforcedSellIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isForcedSellIndicator() {
        return forcedSellIndicator;
    }

    /**
     * ����forcedSellIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setForcedSellIndicator(Boolean value) {
        this.forcedSellIndicator = value;
    }

    /**
     * ��ȡserviceOverrideIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isServiceOverrideIndicator() {
        return serviceOverrideIndicator;
    }

    /**
     * ����serviceOverrideIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setServiceOverrideIndicator(Boolean value) {
        this.serviceOverrideIndicator = value;
    }

    /**
     * ��ȡrateOverrideIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRateOverrideIndicator() {
        return rateOverrideIndicator;
    }

    /**
     * ����rateOverrideIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRateOverrideIndicator(Boolean value) {
        this.rateOverrideIndicator = value;
    }

    /**
     * ��ȡwalkInIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isWalkInIndicator() {
        return walkInIndicator;
    }

    /**
     * ����walkInIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setWalkInIndicator(Boolean value) {
        this.walkInIndicator = value;
    }

    /**
     * ��ȡroomNumberLockedIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRoomNumberLockedIndicator() {
        return roomNumberLockedIndicator;
    }

    /**
     * ����roomNumberLockedIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRoomNumberLockedIndicator(Boolean value) {
        this.roomNumberLockedIndicator = value;
    }

    /**
     * ��ȡoriginalDeliveryMethodCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOriginalDeliveryMethodCode() {
        return originalDeliveryMethodCode;
    }

    /**
     * ����originalDeliveryMethodCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOriginalDeliveryMethodCode(String value) {
        this.originalDeliveryMethodCode = value;
    }

    /**
     * ��ȡpassiveIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPassiveIndicator() {
        return passiveIndicator;
    }

    /**
     * ����passiveIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPassiveIndicator(Boolean value) {
        this.passiveIndicator = value;
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
     *         &lt;element name="ResGuestRPH" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="BillingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BillingType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resGuestRPH property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResGuestRPH().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelReservationType.BillingInstructionCode.ResGuestRPH }
         */
        public List<HotelReservationType.BillingInstructionCode.ResGuestRPH> getResGuestRPH() {
            if (resGuestRPH == null) {
                resGuestRPH = new ArrayList<HotelReservationType.BillingInstructionCode.ResGuestRPH>();
            }
            return this.resGuestRPH;
        }

        /**
         * ��ȡbillingCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBillingCode() {
            return billingCode;
        }

        /**
         * ����billingCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBillingCode(String value) {
            this.billingCode = value;
        }

        /**
         * ��ȡbillingType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBillingType() {
            return billingType;
        }

        /**
         * ����billingType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBillingType(String value) {
            this.billingType = value;
        }

        /**
         * ��ȡauthorizationCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAuthorizationCode() {
            return authorizationCode;
        }

        /**
         * ����authorizationCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAuthorizationCode(String value) {
            this.authorizationCode = value;
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
         * ��ȡaccountNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * ����accountNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAccountNumber(String value) {
            this.accountNumber = value;
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
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ResGuestRPH {

            @XmlAttribute(name = "RPH")
            protected String rph;

            /**
             * ��ȡrph���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getRPH() {
                return rph;
            }

            /**
             * ����rph���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRPH(String value) {
                this.rph = value;
            }

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
     *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡpseudoCityCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPseudoCityCode() {
            return pseudoCityCode;
        }

        /**
         * ����pseudoCityCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPseudoCityCode(String value) {
            this.pseudoCityCode = value;
        }

        /**
         * ��ȡqueueNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getQueueNumber() {
            return queueNumber;
        }

        /**
         * ����queueNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setQueueNumber(String value) {
            this.queueNumber = value;
        }

        /**
         * ��ȡqueueCategory���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getQueueCategory() {
            return queueCategory;
        }

        /**
         * ����queueCategory���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setQueueCategory(String value) {
            this.queueCategory = value;
        }

        /**
         * ��ȡsystemCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSystemCode() {
            return systemCode;
        }

        /**
         * ����systemCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSystemCode(String value) {
            this.systemCode = value;
        }

        /**
         * ��ȡqueueID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getQueueID() {
            return queueID;
        }

        /**
         * ����queueID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setQueueID(String value) {
            this.queueID = value;
        }

    }

}
