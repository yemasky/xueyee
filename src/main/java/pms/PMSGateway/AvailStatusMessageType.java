package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>AvailStatusMessageType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="AvailStatusMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusApplicationControl" type="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType" minOccurs="0"/>
 *         &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/>
 *         &lt;element name="BestAvailableRates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAvailStatusMessageTypeBestAvailableRate" minOccurs="0"/>
 *         &lt;element name="HurdleRate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Delta" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Ceiling" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="MaxSold" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="RestrictionStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Restriction">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Master"/>
 *                       &lt;enumeration value="Arrival"/>
 *                       &lt;enumeration value="Departure"/>
 *                       &lt;enumeration value="NonGuarantee"/>
 *                       &lt;enumeration value="TravelAgent"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
 *                 &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BookingLimitMessageType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="RemoveLimit"/>
 *             &lt;enumeration value="SetLimit"/>
 *             &lt;enumeration value="AdjustLimit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BookingLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LocatorID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="BookingThreshold" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailStatusMessageType", propOrder = {
        "statusApplicationControl",
        "lengthsOfStay",
        "bestAvailableRates",
        "hurdleRate",
        "delta",
        "uniqueID",
        "restrictionStatus"
})
@XmlSeeAlso({
        pms.PMSGateway.OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage.class,
        pms.PMSGateway.OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage.class
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
     * ��ȡstatusApplicationControl���Ե�ֵ��
     *
     * @return possible object is
     * {@link StatusApplicationControlType }
     */
    public StatusApplicationControlType getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * ����statusApplicationControl���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link StatusApplicationControlType }
     */
    public void setStatusApplicationControl(StatusApplicationControlType value) {
        this.statusApplicationControl = value;
    }

    /**
     * ��ȡlengthsOfStay���Ե�ֵ��
     *
     * @return possible object is
     * {@link LengthsOfStayType }
     */
    public LengthsOfStayType getLengthsOfStay() {
        return lengthsOfStay;
    }

    /**
     * ����lengthsOfStay���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link LengthsOfStayType }
     */
    public void setLengthsOfStay(LengthsOfStayType value) {
        this.lengthsOfStay = value;
    }

    /**
     * ��ȡbestAvailableRates���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfAvailStatusMessageTypeBestAvailableRate }
     */
    public ArrayOfAvailStatusMessageTypeBestAvailableRate getBestAvailableRates() {
        return bestAvailableRates;
    }

    /**
     * ����bestAvailableRates���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfAvailStatusMessageTypeBestAvailableRate }
     */
    public void setBestAvailableRates(ArrayOfAvailStatusMessageTypeBestAvailableRate value) {
        this.bestAvailableRates = value;
    }

    /**
     * ��ȡhurdleRate���Ե�ֵ��
     *
     * @return possible object is
     * {@link AvailStatusMessageType.HurdleRate }
     */
    public AvailStatusMessageType.HurdleRate getHurdleRate() {
        return hurdleRate;
    }

    /**
     * ����hurdleRate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AvailStatusMessageType.HurdleRate }
     */
    public void setHurdleRate(AvailStatusMessageType.HurdleRate value) {
        this.hurdleRate = value;
    }

    /**
     * ��ȡdelta���Ե�ֵ��
     *
     * @return possible object is
     * {@link AvailStatusMessageType.Delta }
     */
    public AvailStatusMessageType.Delta getDelta() {
        return delta;
    }

    /**
     * ����delta���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AvailStatusMessageType.Delta }
     */
    public void setDelta(AvailStatusMessageType.Delta value) {
        this.delta = value;
    }

    /**
     * ��ȡuniqueID���Ե�ֵ��
     *
     * @return possible object is
     * {@link UniqueIDType }
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * ����uniqueID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link UniqueIDType }
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * ��ȡrestrictionStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link AvailStatusMessageType.RestrictionStatus }
     */
    public AvailStatusMessageType.RestrictionStatus getRestrictionStatus() {
        return restrictionStatus;
    }

    /**
     * ����restrictionStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AvailStatusMessageType.RestrictionStatus }
     */
    public void setRestrictionStatus(AvailStatusMessageType.RestrictionStatus value) {
        this.restrictionStatus = value;
    }

    /**
     * ��ȡoverride���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isOverride() {
        return override;
    }

    /**
     * ����override���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setOverride(Boolean value) {
        this.override = value;
    }

    /**
     * ��ȡbookingLimitMessageType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBookingLimitMessageType() {
        return bookingLimitMessageType;
    }

    /**
     * ����bookingLimitMessageType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBookingLimitMessageType(String value) {
        this.bookingLimitMessageType = value;
    }

    /**
     * ��ȡbookingLimit���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getBookingLimit() {
        return bookingLimit;
    }

    /**
     * ����bookingLimit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setBookingLimit(BigInteger value) {
        this.bookingLimit = value;
    }

    /**
     * ��ȡlocatorID���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLocatorID() {
        return locatorID;
    }

    /**
     * ����locatorID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLocatorID(BigInteger value) {
        this.locatorID = value;
    }

    /**
     * ��ȡbookingThreshold���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getBookingThreshold() {
        return bookingThreshold;
    }

    /**
     * ����bookingThreshold���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setBookingThreshold(BigInteger value) {
        this.bookingThreshold = value;
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
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Ceiling" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="MaxSold" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡamount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * ����amount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * ��ȡceiling���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getCeiling() {
            return ceiling;
        }

        /**
         * ����ceiling���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setCeiling(BigInteger value) {
            this.ceiling = value;
        }

        /**
         * ��ȡmaxSold���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxSold() {
            return maxSold;
        }

        /**
         * ����maxSold���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxSold(BigInteger value) {
            this.maxSold = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HurdleRate {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

        /**
         * ��ȡamount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * ����amount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
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
     *       &lt;attribute name="Restriction">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Master"/>
     *             &lt;enumeration value="Arrival"/>
     *             &lt;enumeration value="Departure"/>
     *             &lt;enumeration value="NonGuarantee"/>
     *             &lt;enumeration value="TravelAgent"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
     *       &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡrestriction���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRestriction() {
            return restriction;
        }

        /**
         * ����restriction���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRestriction(String value) {
            this.restriction = value;
        }

        /**
         * ��ȡstatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link AvailabilityStatusType }
         */
        public AvailabilityStatusType getStatus() {
            return status;
        }

        /**
         * ����status���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AvailabilityStatusType }
         */
        public void setStatus(AvailabilityStatusType value) {
            this.status = value;
        }

        /**
         * ��ȡsellThroughOpenIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isSellThroughOpenIndicator() {
            return sellThroughOpenIndicator;
        }

        /**
         * ����sellThroughOpenIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setSellThroughOpenIndicator(Boolean value) {
            this.sellThroughOpenIndicator = value;
        }

        /**
         * ��ȡmaxAdvancedBookingOffset���Ե�ֵ��
         *
         * @return possible object is
         * {@link Duration }
         */
        public Duration getMaxAdvancedBookingOffset() {
            return maxAdvancedBookingOffset;
        }

        /**
         * ����maxAdvancedBookingOffset���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Duration }
         */
        public void setMaxAdvancedBookingOffset(Duration value) {
            this.maxAdvancedBookingOffset = value;
        }

        /**
         * ��ȡminAdvancedBookingOffset���Ե�ֵ��
         *
         * @return possible object is
         * {@link Duration }
         */
        public Duration getMinAdvancedBookingOffset() {
            return minAdvancedBookingOffset;
        }

        /**
         * ����minAdvancedBookingOffset���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Duration }
         */
        public void setMinAdvancedBookingOffset(Duration value) {
            this.minAdvancedBookingOffset = value;
        }

    }

}
