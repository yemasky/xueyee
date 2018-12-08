package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>GuestRoomType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="GuestRoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Quantities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaximumAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MinBillableGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Occupancy" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Room" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Floor" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="InvBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomViewCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BedTypeCode">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="NonSmoking" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Configuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SizeMeasurement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RoomClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomArchitectureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomGender">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Male"/>
 *                       &lt;enumeration value="Female"/>
 *                       &lt;enumeration value="MaleAndFemale"/>
 *                       &lt;enumeration value="Unknown"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="SharedRoomInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Amenities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGuestRoomTypeAmenity" minOccurs="0"/>
 *         &lt;element name="RoomLevelFees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeesType">
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalGuestAmount" type="{http://www.opentravel.org/OTA/2003/05}AdditionalGuestAmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * ��ȡquantities���Ե�ֵ��
     *
     * @return possible object is
     * {@link GuestRoomType.Quantities }
     */
    public GuestRoomType.Quantities getQuantities() {
        return quantities;
    }

    /**
     * ����quantities���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link GuestRoomType.Quantities }
     */
    public void setQuantities(GuestRoomType.Quantities value) {
        this.quantities = value;
    }

    /**
     * Gets the value of the occupancy property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupancy property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupancy().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestRoomType.Occupancy }
     */
    public List<GuestRoomType.Occupancy> getOccupancy() {
        if (occupancy == null) {
            occupancy = new ArrayList<GuestRoomType.Occupancy>();
        }
        return this.occupancy;
    }

    /**
     * ��ȡroom���Ե�ֵ��
     *
     * @return possible object is
     * {@link GuestRoomType.Room }
     */
    public GuestRoomType.Room getRoom() {
        return room;
    }

    /**
     * ����room���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link GuestRoomType.Room }
     */
    public void setRoom(GuestRoomType.Room value) {
        this.room = value;
    }

    /**
     * ��ȡamenities���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfGuestRoomTypeAmenity }
     */
    public ArrayOfGuestRoomTypeAmenity getAmenities() {
        return amenities;
    }

    /**
     * ����amenities���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfGuestRoomTypeAmenity }
     */
    public void setAmenities(ArrayOfGuestRoomTypeAmenity value) {
        this.amenities = value;
    }

    /**
     * ��ȡroomLevelFees���Ե�ֵ��
     *
     * @return possible object is
     * {@link GuestRoomType.RoomLevelFees }
     */
    public GuestRoomType.RoomLevelFees getRoomLevelFees() {
        return roomLevelFees;
    }

    /**
     * ����roomLevelFees���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link GuestRoomType.RoomLevelFees }
     */
    public void setRoomLevelFees(GuestRoomType.RoomLevelFees value) {
        this.roomLevelFees = value;
    }

    /**
     * Gets the value of the additionalGuestAmount property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalGuestAmount property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalGuestAmount().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalGuestAmountType }
     */
    public List<AdditionalGuestAmountType> getAdditionalGuestAmount() {
        if (additionalGuestAmount == null) {
            additionalGuestAmount = new ArrayList<AdditionalGuestAmountType>();
        }
        return this.additionalGuestAmount;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     *
     * @return possible object is
     * {@link ParagraphType }
     */
    public ParagraphType getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ParagraphType }
     */
    public void setDescription(ParagraphType value) {
        this.description = value;
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
     *       &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡminOccupancy���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMinOccupancy() {
            return minOccupancy;
        }

        /**
         * ����minOccupancy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMinOccupancy(BigInteger value) {
            this.minOccupancy = value;
        }

        /**
         * ��ȡmaxOccupancy���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxOccupancy() {
            return maxOccupancy;
        }

        /**
         * ����maxOccupancy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxOccupancy(BigInteger value) {
            this.maxOccupancy = value;
        }

        /**
         * ��ȡageQualifyingCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAgeQualifyingCode() {
            return ageQualifyingCode;
        }

        /**
         * ����ageQualifyingCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAgeQualifyingCode(String value) {
            this.ageQualifyingCode = value;
        }

        /**
         * ��ȡminAge���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMinAge() {
            return minAge;
        }

        /**
         * ����minAge���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMinAge(BigInteger value) {
            this.minAge = value;
        }

        /**
         * ��ȡmaxAge���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxAge() {
            return maxAge;
        }

        /**
         * ����maxAge���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxAge(BigInteger value) {
            this.maxAge = value;
        }

        /**
         * ��ȡageTimeUnit���Ե�ֵ��
         *
         * @return possible object is
         * {@link TimeUnitType }
         */
        public TimeUnitType getAgeTimeUnit() {
            return ageTimeUnit;
        }

        /**
         * ����ageTimeUnit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TimeUnitType }
         */
        public void setAgeTimeUnit(TimeUnitType value) {
            this.ageTimeUnit = value;
        }

        /**
         * ��ȡageBucket���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAgeBucket() {
            return ageBucket;
        }

        /**
         * ����ageBucket���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAgeBucket(String value) {
            this.ageBucket = value;
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
     *       &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaximumAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MinBillableGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡmaxRollaways���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxRollaways() {
            return maxRollaways;
        }

        /**
         * ����maxRollaways���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxRollaways(BigInteger value) {
            this.maxRollaways = value;
        }

        /**
         * ��ȡstandardNumBeds���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getStandardNumBeds() {
            return standardNumBeds;
        }

        /**
         * ����standardNumBeds���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setStandardNumBeds(BigInteger value) {
            this.standardNumBeds = value;
        }

        /**
         * ��ȡmaximumAdditionalGuests���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaximumAdditionalGuests() {
            return maximumAdditionalGuests;
        }

        /**
         * ����maximumAdditionalGuests���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaximumAdditionalGuests(BigInteger value) {
            this.maximumAdditionalGuests = value;
        }

        /**
         * ��ȡminBillableGuests���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMinBillableGuests() {
            return minBillableGuests;
        }

        /**
         * ����minBillableGuests���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMinBillableGuests(BigInteger value) {
            this.minBillableGuests = value;
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeesType">
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoomLevelFees
            extends FeesType {

        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;

        /**
         * ��ȡuri���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getURI() {
            return uri;
        }

        /**
         * ����uri���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setURI(String value) {
            this.uri = value;
        }

    }

}
