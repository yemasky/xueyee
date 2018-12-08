
package ota.jw.ARIPmsGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GuestRoomType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GuestRoomType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Quantities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="MaximumAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="MinBillableGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Occupancy" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Room" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Floor" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="InvBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RoomLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RoomViewCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="BedTypeCode"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="NonSmoking" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Configuration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SizeMeasurement" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RoomClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RoomArchitectureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RoomGender"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Male"/&gt;
 *                       &lt;enumeration value="Female"/&gt;
 *                       &lt;enumeration value="MaleAndFemale"/&gt;
 *                       &lt;enumeration value="Unknown"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="SharedRoomInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amenities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGuestRoomTypeAmenity" minOccurs="0"/&gt;
 *         &lt;element name="RoomLevelFees" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeesType"&gt;
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalGuestAmount" type="{http://www.opentravel.org/OTA/2003/05}AdditionalGuestAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRoomType", propOrder = {
    "quantities",
    "occupancy",
    "room",
    "amenities",
    "roomLevelFees",
    "additionalGuestAmount",
    "description"
})
public class GuestRoomType {

    @XmlElement(name = "Quantities")
    protected GuestRoomType.Quantities quantities;
    @XmlElement(name = "Occupancy")
    protected List<GuestRoomType.Occupancy> occupancy;
    @XmlElement(name = "Room")
    protected GuestRoomType.Room room;
    @XmlElement(name = "Amenities")
    protected ArrayOfGuestRoomTypeAmenity amenities;
    @XmlElement(name = "RoomLevelFees")
    protected GuestRoomType.RoomLevelFees roomLevelFees;
    @XmlElement(name = "AdditionalGuestAmount")
    protected List<AdditionalGuestAmountType> additionalGuestAmount;
    @XmlElement(name = "Description")
    protected ParagraphType description;

    /**
     * 获取quantities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestRoomType.Quantities }
     *     
     */
    public GuestRoomType.Quantities getQuantities() {
        return quantities;
    }

    /**
     * 设置quantities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRoomType.Quantities }
     *     
     */
    public void setQuantities(GuestRoomType.Quantities value) {
        this.quantities = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestRoomType.Occupancy }
     * 
     * 
     */
    public List<GuestRoomType.Occupancy> getOccupancy() {
        if (occupancy == null) {
            occupancy = new ArrayList<GuestRoomType.Occupancy>();
        }
        return this.occupancy;
    }

    /**
     * 获取room属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestRoomType.Room }
     *     
     */
    public GuestRoomType.Room getRoom() {
        return room;
    }

    /**
     * 设置room属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRoomType.Room }
     *     
     */
    public void setRoom(GuestRoomType.Room value) {
        this.room = value;
    }

    /**
     * 获取amenities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuestRoomTypeAmenity }
     *     
     */
    public ArrayOfGuestRoomTypeAmenity getAmenities() {
        return amenities;
    }

    /**
     * 设置amenities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuestRoomTypeAmenity }
     *     
     */
    public void setAmenities(ArrayOfGuestRoomTypeAmenity value) {
        this.amenities = value;
    }

    /**
     * 获取roomLevelFees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestRoomType.RoomLevelFees }
     *     
     */
    public GuestRoomType.RoomLevelFees getRoomLevelFees() {
        return roomLevelFees;
    }

    /**
     * 设置roomLevelFees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRoomType.RoomLevelFees }
     *     
     */
    public void setRoomLevelFees(GuestRoomType.RoomLevelFees value) {
        this.roomLevelFees = value;
    }

    /**
     * Gets the value of the additionalGuestAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalGuestAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalGuestAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalGuestAmountType }
     * 
     * 
     */
    public List<AdditionalGuestAmountType> getAdditionalGuestAmount() {
        if (additionalGuestAmount == null) {
            additionalGuestAmount = new ArrayList<AdditionalGuestAmountType>();
        }
        return this.additionalGuestAmount;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setDescription(ParagraphType value) {
        this.description = value;
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
     *       &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Occupancy {

        @XmlAttribute(name = "MinOccupancy")
        protected BigInteger minOccupancy;
        @XmlAttribute(name = "MaxOccupancy")
        protected BigInteger maxOccupancy;
        @XmlAttribute(name = "AgeQualifyingCode")
        protected String ageQualifyingCode;
        @XmlAttribute(name = "MinAge")
        protected BigInteger minAge;
        @XmlAttribute(name = "MaxAge")
        protected BigInteger maxAge;
        @XmlAttribute(name = "AgeTimeUnit")
        protected TimeUnitType ageTimeUnit;
        @XmlAttribute(name = "AgeBucket")
        protected String ageBucket;

        /**
         * 获取minOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinOccupancy() {
            return minOccupancy;
        }

        /**
         * 设置minOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinOccupancy(BigInteger value) {
            this.minOccupancy = value;
        }

        /**
         * 获取maxOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxOccupancy() {
            return maxOccupancy;
        }

        /**
         * 设置maxOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxOccupancy(BigInteger value) {
            this.maxOccupancy = value;
        }

        /**
         * 获取ageQualifyingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeQualifyingCode() {
            return ageQualifyingCode;
        }

        /**
         * 设置ageQualifyingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeQualifyingCode(String value) {
            this.ageQualifyingCode = value;
        }

        /**
         * 获取minAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinAge() {
            return minAge;
        }

        /**
         * 设置minAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinAge(BigInteger value) {
            this.minAge = value;
        }

        /**
         * 获取maxAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxAge() {
            return maxAge;
        }

        /**
         * 设置maxAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxAge(BigInteger value) {
            this.maxAge = value;
        }

        /**
         * 获取ageTimeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getAgeTimeUnit() {
            return ageTimeUnit;
        }

        /**
         * 设置ageTimeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setAgeTimeUnit(TimeUnitType value) {
            this.ageTimeUnit = value;
        }

        /**
         * 获取ageBucket属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeBucket() {
            return ageBucket;
        }

        /**
         * 设置ageBucket属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeBucket(String value) {
            this.ageBucket = value;
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
     *       &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="MaximumAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="MinBillableGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Quantities {

        @XmlAttribute(name = "MaxRollaways")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxRollaways;
        @XmlAttribute(name = "StandardNumBeds")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger standardNumBeds;
        @XmlAttribute(name = "MaximumAdditionalGuests")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maximumAdditionalGuests;
        @XmlAttribute(name = "MinBillableGuests")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minBillableGuests;

        /**
         * 获取maxRollaways属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxRollaways() {
            return maxRollaways;
        }

        /**
         * 设置maxRollaways属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxRollaways(BigInteger value) {
            this.maxRollaways = value;
        }

        /**
         * 获取standardNumBeds属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStandardNumBeds() {
            return standardNumBeds;
        }

        /**
         * 设置standardNumBeds属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStandardNumBeds(BigInteger value) {
            this.standardNumBeds = value;
        }

        /**
         * 获取maximumAdditionalGuests属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumAdditionalGuests() {
            return maximumAdditionalGuests;
        }

        /**
         * 设置maximumAdditionalGuests属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumAdditionalGuests(BigInteger value) {
            this.maximumAdditionalGuests = value;
        }

        /**
         * 获取minBillableGuests属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinBillableGuests() {
            return minBillableGuests;
        }

        /**
         * 设置minBillableGuests属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinBillableGuests(BigInteger value) {
            this.minBillableGuests = value;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Room {

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

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeesType"&gt;
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoomLevelFees
        extends FeesType
    {

        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;

        /**
         * 获取uri属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * 设置uri属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

    }

}
