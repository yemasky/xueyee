
package ota.jw.ARIPmsGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>AvailStatusMessageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AvailStatusMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusApplicationControl" type="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType" minOccurs="0"/&gt;
 *         &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/&gt;
 *         &lt;element name="BestAvailableRates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAvailStatusMessageTypeBestAvailableRate" minOccurs="0"/&gt;
 *         &lt;element name="HurdleRate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Delta" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="Ceiling" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                 &lt;attribute name="MaxSold" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *         &lt;element name="RestrictionStatus" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Restriction"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Master"/&gt;
 *                       &lt;enumeration value="Arrival"/&gt;
 *                       &lt;enumeration value="Departure"/&gt;
 *                       &lt;enumeration value="NonGuarantee"/&gt;
 *                       &lt;enumeration value="TravelAgent"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
 *                 &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                 &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HoldDeadline" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UserLimited" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReserveTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomsInv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Guarantee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuaranteeLCT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrepayLCT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AllNeedGuarantee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LateReserveTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DeductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxRoomQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EarliestArriveTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LatestArriveTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DuringTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BookingLimitMessageType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="RemoveLimit"/&gt;
 *             &lt;enumeration value="SetLimit"/&gt;
 *             &lt;enumeration value="AdjustLimit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="BookingLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="LocatorID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="BookingThreshold" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailStatusMessageType", propOrder = {
    "statusApplicationControl",
    "lengthsOfStay",
    "bestAvailableRates",
    "hurdleRate",
    "delta",
    "uniqueID",
    "restrictionStatus",
    "holdDeadline",
    "userLimited",
    "reserveTime",
    "roomsInv",
    "guarantee",
    "guaranteeLCT",
    "prepayLCT",
    "allNeedGuarantee",
    "lateReserveTime",
    "deductType",
    "blanceType",
    "maxRoomQuantity",
    "earliestArriveTime",
    "latestArriveTime",
    "duringTime"
})
public class AvailStatusMessageType {

    @XmlElement(name = "StatusApplicationControl")
    protected StatusApplicationControlType statusApplicationControl;
    @XmlElement(name = "LengthsOfStay")
    protected LengthsOfStayType lengthsOfStay;
    @XmlElement(name = "BestAvailableRates")
    protected ArrayOfAvailStatusMessageTypeBestAvailableRate bestAvailableRates;
    @XmlElement(name = "HurdleRate")
    protected AvailStatusMessageType.HurdleRate hurdleRate;
    @XmlElement(name = "Delta")
    protected AvailStatusMessageType.Delta delta;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "RestrictionStatus")
    protected AvailStatusMessageType.RestrictionStatus restrictionStatus;
    @XmlElement(name = "HoldDeadline")
    protected Integer holdDeadline;
    @XmlElement(name = "UserLimited")
    protected Integer userLimited;
    @XmlElement(name = "ReserveTime")
    protected Integer reserveTime;
    @XmlElement(name = "RoomsInv")
    protected Integer roomsInv;
    @XmlElement(name = "Guarantee")
    protected String guarantee;
    @XmlElement(name = "GuaranteeLCT")
    protected Integer guaranteeLCT;
    @XmlElement(name = "PrepayLCT")
    protected Integer prepayLCT;
    @XmlElement(name = "AllNeedGuarantee")
    protected String allNeedGuarantee;
    @XmlElement(name = "LateReserveTime")
    protected Integer lateReserveTime;
    @XmlElement(name = "DeductType")
    protected String deductType;
    @XmlElement(name = "BlanceType")
    protected String blanceType;
    @XmlElement(name = "MaxRoomQuantity")
    protected Integer maxRoomQuantity;
    @XmlElement(name = "EarliestArriveTime")
    protected Integer earliestArriveTime;
    @XmlElement(name = "LatestArriveTime")
    protected Integer latestArriveTime;
    @XmlElement(name = "DuringTime")
    protected Integer duringTime;
    @XmlAttribute(name = "Override")
    protected Boolean override;
    @XmlAttribute(name = "BookingLimitMessageType")
    protected String bookingLimitMessageType;
    @XmlAttribute(name = "BookingLimit")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bookingLimit;
    @XmlAttribute(name = "LocatorID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger locatorID;
    @XmlAttribute(name = "BookingThreshold")
    protected BigInteger bookingThreshold;
    @XmlAttribute(name = "RoomGender")
    protected String roomGender;
    @XmlAttribute(name = "SharedRoomInd")
    protected Boolean sharedRoomInd;

    /**
     * 获取statusApplicationControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public StatusApplicationControlType getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * 设置statusApplicationControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public void setStatusApplicationControl(StatusApplicationControlType value) {
        this.statusApplicationControl = value;
    }

    /**
     * 获取lengthsOfStay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthsOfStayType }
     *     
     */
    public LengthsOfStayType getLengthsOfStay() {
        return lengthsOfStay;
    }

    /**
     * 设置lengthsOfStay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthsOfStayType }
     *     
     */
    public void setLengthsOfStay(LengthsOfStayType value) {
        this.lengthsOfStay = value;
    }

    /**
     * 获取bestAvailableRates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailStatusMessageTypeBestAvailableRate }
     *     
     */
    public ArrayOfAvailStatusMessageTypeBestAvailableRate getBestAvailableRates() {
        return bestAvailableRates;
    }

    /**
     * 设置bestAvailableRates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailStatusMessageTypeBestAvailableRate }
     *     
     */
    public void setBestAvailableRates(ArrayOfAvailStatusMessageTypeBestAvailableRate value) {
        this.bestAvailableRates = value;
    }

    /**
     * 获取hurdleRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AvailStatusMessageType.HurdleRate }
     *     
     */
    public AvailStatusMessageType.HurdleRate getHurdleRate() {
        return hurdleRate;
    }

    /**
     * 设置hurdleRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AvailStatusMessageType.HurdleRate }
     *     
     */
    public void setHurdleRate(AvailStatusMessageType.HurdleRate value) {
        this.hurdleRate = value;
    }

    /**
     * 获取delta属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AvailStatusMessageType.Delta }
     *     
     */
    public AvailStatusMessageType.Delta getDelta() {
        return delta;
    }

    /**
     * 设置delta属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AvailStatusMessageType.Delta }
     *     
     */
    public void setDelta(AvailStatusMessageType.Delta value) {
        this.delta = value;
    }

    /**
     * 获取uniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * 设置uniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * 获取restrictionStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AvailStatusMessageType.RestrictionStatus }
     *     
     */
    public AvailStatusMessageType.RestrictionStatus getRestrictionStatus() {
        return restrictionStatus;
    }

    /**
     * 设置restrictionStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AvailStatusMessageType.RestrictionStatus }
     *     
     */
    public void setRestrictionStatus(AvailStatusMessageType.RestrictionStatus value) {
        this.restrictionStatus = value;
    }

    /**
     * 获取holdDeadline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoldDeadline() {
        return holdDeadline;
    }

    /**
     * 设置holdDeadline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoldDeadline(Integer value) {
        this.holdDeadline = value;
    }

    /**
     * 获取userLimited属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserLimited() {
        return userLimited;
    }

    /**
     * 设置userLimited属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserLimited(Integer value) {
        this.userLimited = value;
    }

    /**
     * 获取reserveTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReserveTime() {
        return reserveTime;
    }

    /**
     * 设置reserveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReserveTime(Integer value) {
        this.reserveTime = value;
    }

    /**
     * 获取roomsInv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoomsInv() {
        return roomsInv;
    }

    /**
     * 设置roomsInv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoomsInv(Integer value) {
        this.roomsInv = value;
    }

    /**
     * 获取guarantee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantee() {
        return guarantee;
    }

    /**
     * 设置guarantee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantee(String value) {
        this.guarantee = value;
    }

    /**
     * 获取guaranteeLCT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuaranteeLCT() {
        return guaranteeLCT;
    }

    /**
     * 设置guaranteeLCT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuaranteeLCT(Integer value) {
        this.guaranteeLCT = value;
    }

    /**
     * 获取prepayLCT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrepayLCT() {
        return prepayLCT;
    }

    /**
     * 设置prepayLCT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrepayLCT(Integer value) {
        this.prepayLCT = value;
    }

    /**
     * 获取allNeedGuarantee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllNeedGuarantee() {
        return allNeedGuarantee;
    }

    /**
     * 设置allNeedGuarantee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllNeedGuarantee(String value) {
        this.allNeedGuarantee = value;
    }

    /**
     * 获取lateReserveTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLateReserveTime() {
        return lateReserveTime;
    }

    /**
     * 设置lateReserveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLateReserveTime(Integer value) {
        this.lateReserveTime = value;
    }

    /**
     * 获取deductType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductType() {
        return deductType;
    }

    /**
     * 设置deductType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductType(String value) {
        this.deductType = value;
    }

    /**
     * 获取blanceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlanceType() {
        return blanceType;
    }

    /**
     * 设置blanceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlanceType(String value) {
        this.blanceType = value;
    }

    /**
     * 获取maxRoomQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRoomQuantity() {
        return maxRoomQuantity;
    }

    /**
     * 设置maxRoomQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRoomQuantity(Integer value) {
        this.maxRoomQuantity = value;
    }

    /**
     * 获取earliestArriveTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEarliestArriveTime() {
        return earliestArriveTime;
    }

    /**
     * 设置earliestArriveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEarliestArriveTime(Integer value) {
        this.earliestArriveTime = value;
    }

    /**
     * 获取latestArriveTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLatestArriveTime() {
        return latestArriveTime;
    }

    /**
     * 设置latestArriveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLatestArriveTime(Integer value) {
        this.latestArriveTime = value;
    }

    /**
     * 获取duringTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuringTime() {
        return duringTime;
    }

    /**
     * 设置duringTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuringTime(Integer value) {
        this.duringTime = value;
    }

    /**
     * 获取override属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverride() {
        return override;
    }

    /**
     * 设置override属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverride(Boolean value) {
        this.override = value;
    }

    /**
     * 获取bookingLimitMessageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingLimitMessageType() {
        return bookingLimitMessageType;
    }

    /**
     * 设置bookingLimitMessageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingLimitMessageType(String value) {
        this.bookingLimitMessageType = value;
    }

    /**
     * 获取bookingLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookingLimit() {
        return bookingLimit;
    }

    /**
     * 设置bookingLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookingLimit(BigInteger value) {
        this.bookingLimit = value;
    }

    /**
     * 获取locatorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocatorID() {
        return locatorID;
    }

    /**
     * 设置locatorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocatorID(BigInteger value) {
        this.locatorID = value;
    }

    /**
     * 获取bookingThreshold属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookingThreshold() {
        return bookingThreshold;
    }

    /**
     * 设置bookingThreshold属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookingThreshold(BigInteger value) {
        this.bookingThreshold = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="Ceiling" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *       &lt;attribute name="MaxSold" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Delta {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "Ceiling")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger ceiling;
        @XmlAttribute(name = "MaxSold")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxSold;

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * 获取ceiling属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCeiling() {
            return ceiling;
        }

        /**
         * 设置ceiling属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCeiling(BigInteger value) {
            this.ceiling = value;
        }

        /**
         * 获取maxSold属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxSold() {
            return maxSold;
        }

        /**
         * 设置maxSold属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxSold(BigInteger value) {
            this.maxSold = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HurdleRate {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
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
     *       &lt;attribute name="Restriction"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Master"/&gt;
     *             &lt;enumeration value="Arrival"/&gt;
     *             &lt;enumeration value="Departure"/&gt;
     *             &lt;enumeration value="NonGuarantee"/&gt;
     *             &lt;enumeration value="TravelAgent"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
     *       &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *       &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RestrictionStatus {

        @XmlAttribute(name = "Restriction")
        protected String restriction;
        @XmlAttribute(name = "Status")
        protected AvailabilityStatusType status;
        @XmlAttribute(name = "SellThroughOpenIndicator")
        protected Boolean sellThroughOpenIndicator;
        @XmlAttribute(name = "MaxAdvancedBookingOffset")
        protected Duration maxAdvancedBookingOffset;
        @XmlAttribute(name = "MinAdvancedBookingOffset")
        protected Duration minAdvancedBookingOffset;

        /**
         * 获取restriction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestriction() {
            return restriction;
        }

        /**
         * 设置restriction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestriction(String value) {
            this.restriction = value;
        }

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailabilityStatusType }
         *     
         */
        public AvailabilityStatusType getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilityStatusType }
         *     
         */
        public void setStatus(AvailabilityStatusType value) {
            this.status = value;
        }

        /**
         * 获取sellThroughOpenIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSellThroughOpenIndicator() {
            return sellThroughOpenIndicator;
        }

        /**
         * 设置sellThroughOpenIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSellThroughOpenIndicator(Boolean value) {
            this.sellThroughOpenIndicator = value;
        }

        /**
         * 获取maxAdvancedBookingOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaxAdvancedBookingOffset() {
            return maxAdvancedBookingOffset;
        }

        /**
         * 设置maxAdvancedBookingOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaxAdvancedBookingOffset(Duration value) {
            this.maxAdvancedBookingOffset = value;
        }

        /**
         * 获取minAdvancedBookingOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMinAdvancedBookingOffset() {
            return minAdvancedBookingOffset;
        }

        /**
         * 设置minAdvancedBookingOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMinAdvancedBookingOffset(Duration value) {
            this.minAdvancedBookingOffset = value;
        }

    }

}
