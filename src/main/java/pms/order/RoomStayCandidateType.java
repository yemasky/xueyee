package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RoomStayCandidateType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RoomStayCandidateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/>
 *         &lt;element name="RoomAmenity" type="{http://www.opentravel.org/OTA/2003/05}RoomAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Floor" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="InvBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomViewCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BedTypeCode">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NonSmoking" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Configuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SizeMeasurement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RoomClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomArchitectureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomGender">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Male"/>
 *             &lt;enumeration value="Female"/>
 *             &lt;enumeration value="MaleAndFemale"/>
 *             &lt;enumeration value="Unknown"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SharedRoomInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomStayCandidateType", propOrder = {
        "guestCounts",
        "roomAmenity"
})
@XmlSeeAlso({
        PkgRoomInventoryType.class,
        RoomProfileType.class,
        pms.order.ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate.RoomStayCandidate.class
})
public class RoomStayCandidateType {

    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "RoomAmenity")
    protected List<RoomAmenityPrefType> roomAmenity;
    @XmlAttribute(name = "RoomType")
    protected String roomType;
    @XmlAttribute(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlAttribute(name = "RoomCategory")
    protected String roomCategory;
    @XmlAttribute(name = "RoomID")
    protected String roomID;
    @XmlAttribute(name = "Floor")
    protected BigInteger floor;
    @XmlAttribute(name = "InvBlockCode")
    protected String invBlockCode;
    @XmlAttribute(name = "RoomLocationCode")
    protected String roomLocationCode;
    @XmlAttribute(name = "RoomViewCode")
    protected String roomViewCode;
    @XmlAttribute(name = "BedTypeCode")
    protected List<String> bedTypeCode;
    @XmlAttribute(name = "NonSmoking")
    protected Boolean nonSmoking;
    @XmlAttribute(name = "Configuration")
    protected String configuration;
    @XmlAttribute(name = "SizeMeasurement")
    protected String sizeMeasurement;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "Composite")
    protected Boolean composite;
    @XmlAttribute(name = "RoomClassificationCode")
    protected String roomClassificationCode;
    @XmlAttribute(name = "RoomArchitectureCode")
    protected String roomArchitectureCode;
    @XmlAttribute(name = "RoomGender")
    protected String roomGender;
    @XmlAttribute(name = "SharedRoomInd")
    protected Boolean sharedRoomInd;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "RatePlanCandidateRPH")
    protected String ratePlanCandidateRPH;
    @XmlAttribute(name = "BookingCode")
    protected String bookingCode;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "ExpireDateExclusiveIndicator")
    protected Boolean expireDateExclusiveIndicator;

    /**
     * ��ȡguestCounts���Ե�ֵ��
     *
     * @return possible object is
     * {@link GuestCountType }
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * ����guestCounts���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link GuestCountType }
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the roomAmenity property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomAmenity property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomAmenity().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomAmenityPrefType }
     */
    public List<RoomAmenityPrefType> getRoomAmenity() {
        if (roomAmenity == null) {
            roomAmenity = new ArrayList<RoomAmenityPrefType>();
        }
        return this.roomAmenity;
    }

    /**
     * ��ȡroomType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * ����roomType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * ��ȡroomTypeCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * ����roomTypeCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    /**
     * ��ȡroomCategory���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomCategory() {
        return roomCategory;
    }

    /**
     * ����roomCategory���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomCategory(String value) {
        this.roomCategory = value;
    }

    /**
     * ��ȡroomID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * ����roomID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomID(String value) {
        this.roomID = value;
    }

    /**
     * ��ȡfloor���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getFloor() {
        return floor;
    }

    /**
     * ����floor���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setFloor(BigInteger value) {
        this.floor = value;
    }

    /**
     * ��ȡinvBlockCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInvBlockCode() {
        return invBlockCode;
    }

    /**
     * ����invBlockCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInvBlockCode(String value) {
        this.invBlockCode = value;
    }

    /**
     * ��ȡroomLocationCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomLocationCode() {
        return roomLocationCode;
    }

    /**
     * ����roomLocationCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomLocationCode(String value) {
        this.roomLocationCode = value;
    }

    /**
     * ��ȡroomViewCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomViewCode() {
        return roomViewCode;
    }

    /**
     * ����roomViewCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomViewCode(String value) {
        this.roomViewCode = value;
    }

    /**
     * Gets the value of the bedTypeCode property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bedTypeCode property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBedTypeCode().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getBedTypeCode() {
        if (bedTypeCode == null) {
            bedTypeCode = new ArrayList<String>();
        }
        return this.bedTypeCode;
    }

    /**
     * ��ȡnonSmoking���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isNonSmoking() {
        return nonSmoking;
    }

    /**
     * ����nonSmoking���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setNonSmoking(Boolean value) {
        this.nonSmoking = value;
    }

    /**
     * ��ȡconfiguration���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * ����configuration���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConfiguration(String value) {
        this.configuration = value;
    }

    /**
     * ��ȡsizeMeasurement���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSizeMeasurement() {
        return sizeMeasurement;
    }

    /**
     * ����sizeMeasurement���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSizeMeasurement(String value) {
        this.sizeMeasurement = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * ��ȡcomposite���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isComposite() {
        return composite;
    }

    /**
     * ����composite���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setComposite(Boolean value) {
        this.composite = value;
    }

    /**
     * ��ȡroomClassificationCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomClassificationCode() {
        return roomClassificationCode;
    }

    /**
     * ����roomClassificationCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomClassificationCode(String value) {
        this.roomClassificationCode = value;
    }

    /**
     * ��ȡroomArchitectureCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomArchitectureCode() {
        return roomArchitectureCode;
    }

    /**
     * ����roomArchitectureCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomArchitectureCode(String value) {
        this.roomArchitectureCode = value;
    }

    /**
     * ��ȡroomGender���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomGender() {
        return roomGender;
    }

    /**
     * ����roomGender���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomGender(String value) {
        this.roomGender = value;
    }

    /**
     * ��ȡsharedRoomInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSharedRoomInd() {
        return sharedRoomInd;
    }

    /**
     * ����sharedRoomInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSharedRoomInd(Boolean value) {
        this.sharedRoomInd = value;
    }

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

    /**
     * ��ȡratePlanCandidateRPH���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanCandidateRPH() {
        return ratePlanCandidateRPH;
    }

    /**
     * ����ratePlanCandidateRPH���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanCandidateRPH(String value) {
        this.ratePlanCandidateRPH = value;
    }

    /**
     * ��ȡbookingCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * ����bookingCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * ��ȡeffectiveDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * ����effectiveDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * ��ȡexpireDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * ����expireDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * ��ȡexpireDateExclusiveIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isExpireDateExclusiveIndicator() {
        return expireDateExclusiveIndicator;
    }

    /**
     * ����expireDateExclusiveIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setExpireDateExclusiveIndicator(Boolean value) {
        this.expireDateExclusiveIndicator = value;
    }

}
