
package ota.jw.AvailRes;

import java.math.BigInteger;
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
 * <p>RoomStayCandidateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomStayCandidateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/&gt;
 *         &lt;element name="RoomAmenity" type="{http://www.opentravel.org/OTA/2003/05}RoomAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Floor" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="InvBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoomLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoomViewCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BedTypeCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NonSmoking" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Configuration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SizeMeasurement" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RoomClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoomArchitectureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoomGender"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Male"/&gt;
 *             &lt;enumeration value="Female"/&gt;
 *             &lt;enumeration value="MaleAndFemale"/&gt;
 *             &lt;enumeration value="Unknown"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SharedRoomInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomStayCandidateType", propOrder = {
    "guestCounts",
    "roomAmenity"
})
@XmlSeeAlso({
    ota.jw.AvailRes.ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate.RoomStayCandidate.class,
    RoomProfileType.class,
    PkgRoomInventoryType.class
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
     * 获取guestCounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * 设置guestCounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the roomAmenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomAmenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomAmenityPrefType }
     * 
     * 
     */
    public List<RoomAmenityPrefType> getRoomAmenity() {
        if (roomAmenity == null) {
            roomAmenity = new ArrayList<RoomAmenityPrefType>();
        }
        return this.roomAmenity;
    }

    /**
     * 获取roomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * 设置roomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * 获取roomTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * 设置roomTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    /**
     * 获取roomCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomCategory() {
        return roomCategory;
    }

    /**
     * 设置roomCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomCategory(String value) {
        this.roomCategory = value;
    }

    /**
     * 获取roomID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * 设置roomID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomID(String value) {
        this.roomID = value;
    }

    /**
     * 获取floor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFloor() {
        return floor;
    }

    /**
     * 设置floor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFloor(BigInteger value) {
        this.floor = value;
    }

    /**
     * 获取invBlockCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockCode() {
        return invBlockCode;
    }

    /**
     * 设置invBlockCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockCode(String value) {
        this.invBlockCode = value;
    }

    /**
     * 获取roomLocationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomLocationCode() {
        return roomLocationCode;
    }

    /**
     * 设置roomLocationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomLocationCode(String value) {
        this.roomLocationCode = value;
    }

    /**
     * 获取roomViewCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomViewCode() {
        return roomViewCode;
    }

    /**
     * 设置roomViewCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomViewCode(String value) {
        this.roomViewCode = value;
    }

    /**
     * Gets the value of the bedTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bedTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBedTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBedTypeCode() {
        if (bedTypeCode == null) {
            bedTypeCode = new ArrayList<String>();
        }
        return this.bedTypeCode;
    }

    /**
     * 获取nonSmoking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonSmoking() {
        return nonSmoking;
    }

    /**
     * 设置nonSmoking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonSmoking(Boolean value) {
        this.nonSmoking = value;
    }

    /**
     * 获取configuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * 设置configuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguration(String value) {
        this.configuration = value;
    }

    /**
     * 获取sizeMeasurement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeMeasurement() {
        return sizeMeasurement;
    }

    /**
     * 设置sizeMeasurement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeMeasurement(String value) {
        this.sizeMeasurement = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * 获取composite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComposite() {
        return composite;
    }

    /**
     * 设置composite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComposite(Boolean value) {
        this.composite = value;
    }

    /**
     * 获取roomClassificationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomClassificationCode() {
        return roomClassificationCode;
    }

    /**
     * 设置roomClassificationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomClassificationCode(String value) {
        this.roomClassificationCode = value;
    }

    /**
     * 获取roomArchitectureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomArchitectureCode() {
        return roomArchitectureCode;
    }

    /**
     * 设置roomArchitectureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomArchitectureCode(String value) {
        this.roomArchitectureCode = value;
    }

    /**
     * 获取roomGender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomGender() {
        return roomGender;
    }

    /**
     * 设置roomGender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomGender(String value) {
        this.roomGender = value;
    }

    /**
     * 获取sharedRoomInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharedRoomInd() {
        return sharedRoomInd;
    }

    /**
     * 设置sharedRoomInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharedRoomInd(Boolean value) {
        this.sharedRoomInd = value;
    }

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

    /**
     * 获取ratePlanCandidateRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCandidateRPH() {
        return ratePlanCandidateRPH;
    }

    /**
     * 设置ratePlanCandidateRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCandidateRPH(String value) {
        this.ratePlanCandidateRPH = value;
    }

    /**
     * 获取bookingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * 设置bookingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * 获取expireDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * 设置expireDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * 获取expireDateExclusiveIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpireDateExclusiveIndicator() {
        return expireDateExclusiveIndicator;
    }

    /**
     * 设置expireDateExclusiveIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpireDateExclusiveIndicator(Boolean value) {
        this.expireDateExclusiveIndicator = value;
    }

}
