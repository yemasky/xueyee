
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
 * <p>RoomRateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRateTypeRate" minOccurs="0"/&gt;
 *         &lt;element name="RoomRateDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomRateTypeFeature" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/&gt;
 *         &lt;element name="Availability" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InvBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanQualifier" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" /&gt;
 *       &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OtaSubRoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsHoldRoom" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomRateType", propOrder = {
    "rates",
    "roomRateDescription",
    "features",
    "total",
    "availability"
})
@XmlSeeAlso({
    ota.jw.GenericSeamlessGateway.RoomStayType.RoomRates.RoomRate.class
})
public class RoomRateType {

    @XmlElement(name = "Rates")
    protected ArrayOfRateTypeRate rates;
    @XmlElement(name = "RoomRateDescription")
    protected List<ParagraphType> roomRateDescription;
    @XmlElement(name = "Features")
    protected ArrayOfRoomRateTypeFeature features;
    @XmlElement(name = "Total")
    protected TotalType total;
    @XmlElement(name = "Availability")
    protected List<RoomRateType.Availability> availability;
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
    @XmlAttribute(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlAttribute(name = "InvBlockCode")
    protected String invBlockCode;
    @XmlAttribute(name = "NumberOfUnits")
    protected String numberOfUnits;
    @XmlAttribute(name = "RatePlanType")
    protected String ratePlanType;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "RatePlanID")
    protected String ratePlanID;
    @XmlAttribute(name = "RatePlanQualifier")
    protected Boolean ratePlanQualifier;
    @XmlAttribute(name = "RatePlanCategory")
    protected String ratePlanCategory;
    @XmlAttribute(name = "AvailabilityStatus")
    protected RateIndicatorType availabilityStatus;
    @XmlAttribute(name = "RoomID")
    protected String roomID;
    @XmlAttribute(name = "OtaSubRoomTypeName")
    protected String otaSubRoomTypeName;
    @XmlAttribute(name = "IsHoldRoom", required = true)
    protected boolean isHoldRoom;

    /**
     * 获取rates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateTypeRate }
     *     
     */
    public ArrayOfRateTypeRate getRates() {
        return rates;
    }

    /**
     * 设置rates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateTypeRate }
     *     
     */
    public void setRates(ArrayOfRateTypeRate value) {
        this.rates = value;
    }

    /**
     * Gets the value of the roomRateDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomRateDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomRateDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getRoomRateDescription() {
        if (roomRateDescription == null) {
            roomRateDescription = new ArrayList<ParagraphType>();
        }
        return this.roomRateDescription;
    }

    /**
     * 获取features属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomRateTypeFeature }
     *     
     */
    public ArrayOfRoomRateTypeFeature getFeatures() {
        return features;
    }

    /**
     * 设置features属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomRateTypeFeature }
     *     
     */
    public void setFeatures(ArrayOfRoomRateTypeFeature value) {
        this.features = value;
    }

    /**
     * 获取total属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomRateType.Availability }
     * 
     * 
     */
    public List<RoomRateType.Availability> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<RoomRateType.Availability>();
        }
        return this.availability;
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
     * 获取numberOfUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * 设置numberOfUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfUnits(String value) {
        this.numberOfUnits = value;
    }

    /**
     * 获取ratePlanType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * 设置ratePlanType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * 获取ratePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 设置ratePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * 获取ratePlanID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanID() {
        return ratePlanID;
    }

    /**
     * 设置ratePlanID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanID(String value) {
        this.ratePlanID = value;
    }

    /**
     * 获取ratePlanQualifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRatePlanQualifier() {
        return ratePlanQualifier;
    }

    /**
     * 设置ratePlanQualifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRatePlanQualifier(Boolean value) {
        this.ratePlanQualifier = value;
    }

    /**
     * 获取ratePlanCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCategory() {
        return ratePlanCategory;
    }

    /**
     * 设置ratePlanCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCategory(String value) {
        this.ratePlanCategory = value;
    }

    /**
     * 获取availabilityStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateIndicatorType }
     *     
     */
    public RateIndicatorType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * 设置availabilityStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateIndicatorType }
     *     
     */
    public void setAvailabilityStatus(RateIndicatorType value) {
        this.availabilityStatus = value;
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
     * 获取otaSubRoomTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtaSubRoomTypeName() {
        return otaSubRoomTypeName;
    }

    /**
     * 设置otaSubRoomTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtaSubRoomTypeName(String value) {
        this.otaSubRoomTypeName = value;
    }

    /**
     * 获取isHoldRoom属性的值。
     * 
     */
    public boolean isIsHoldRoom() {
        return isHoldRoom;
    }

    /**
     * 设置isHoldRoom属性的值。
     * 
     */
    public void setIsHoldRoom(boolean value) {
        this.isHoldRoom = value;
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
     *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Availability {

        @XmlAttribute(name = "AvailabilityStatus")
        protected RateIndicatorType availabilityStatus;

        /**
         * 获取availabilityStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RateIndicatorType }
         *     
         */
        public RateIndicatorType getAvailabilityStatus() {
            return availabilityStatus;
        }

        /**
         * 设置availabilityStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RateIndicatorType }
         *     
         */
        public void setAvailabilityStatus(RateIndicatorType value) {
            this.availabilityStatus = value;
        }

    }

}
