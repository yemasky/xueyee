package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>MeetingRoomsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="MeetingRoomsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeetingRoom" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Codes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCodeType" minOccurs="0"/>
 *                   &lt;element name="Dimension" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Units" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AvailableCapacities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCapacityType" minOccurs="0"/>
 *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Irregular" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PropertySystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MeetingRoomCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Access" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MeetingRoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MeetingRoomLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DedicatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MeetingRoomCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="SmallestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LargestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TotalRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="SecondLargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="SmallestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TotalRoomSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LargestRoomHeight" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRoomsType", propOrder = {
        "meetingRoom"
})
@XmlSeeAlso({
        pms.PMSGateway.FacilityInfoType.MeetingRooms.class
})
public class MeetingRoomsType {

    @XmlElement(name = "MeetingRoom")
    protected List<MeetingRoomsType.MeetingRoom> meetingRoom;
    @XmlAttribute(name = "MeetingRoomCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger meetingRoomCount;
    @XmlAttribute(name = "SmallestRoomSpace")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger smallestRoomSpace;
    @XmlAttribute(name = "LargestRoomSpace")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger largestRoomSpace;
    @XmlAttribute(name = "UnitOfMeasureQuantity")
    protected BigDecimal unitOfMeasureQuantity;
    @XmlAttribute(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "TotalRoomSpace")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalRoomSpace;
    @XmlAttribute(name = "LargestSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger largestSeatingCapacity;
    @XmlAttribute(name = "SecondLargestSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger secondLargestSeatingCapacity;
    @XmlAttribute(name = "SmallestSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger smallestSeatingCapacity;
    @XmlAttribute(name = "TotalRoomSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalRoomSeatingCapacity;
    @XmlAttribute(name = "LargestRoomHeight")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger largestRoomHeight;

    /**
     * Gets the value of the meetingRoom property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingRoom property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingRoom().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingRoomsType.MeetingRoom }
     */
    public List<MeetingRoomsType.MeetingRoom> getMeetingRoom() {
        if (meetingRoom == null) {
            meetingRoom = new ArrayList<MeetingRoomsType.MeetingRoom>();
        }
        return this.meetingRoom;
    }

    /**
     * ��ȡmeetingRoomCount���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMeetingRoomCount() {
        return meetingRoomCount;
    }

    /**
     * ����meetingRoomCount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMeetingRoomCount(BigInteger value) {
        this.meetingRoomCount = value;
    }

    /**
     * ��ȡsmallestRoomSpace���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSmallestRoomSpace() {
        return smallestRoomSpace;
    }

    /**
     * ����smallestRoomSpace���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSmallestRoomSpace(BigInteger value) {
        this.smallestRoomSpace = value;
    }

    /**
     * ��ȡlargestRoomSpace���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLargestRoomSpace() {
        return largestRoomSpace;
    }

    /**
     * ����largestRoomSpace���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLargestRoomSpace(BigInteger value) {
        this.largestRoomSpace = value;
    }

    /**
     * ��ȡunitOfMeasureQuantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getUnitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /**
     * ����unitOfMeasureQuantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setUnitOfMeasureQuantity(BigDecimal value) {
        this.unitOfMeasureQuantity = value;
    }

    /**
     * ��ȡunitOfMeasure���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * ����unitOfMeasure���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * ��ȡunitOfMeasureCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * ����unitOfMeasureCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * ��ȡtotalRoomSpace���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getTotalRoomSpace() {
        return totalRoomSpace;
    }

    /**
     * ����totalRoomSpace���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setTotalRoomSpace(BigInteger value) {
        this.totalRoomSpace = value;
    }

    /**
     * ��ȡlargestSeatingCapacity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLargestSeatingCapacity() {
        return largestSeatingCapacity;
    }

    /**
     * ����largestSeatingCapacity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLargestSeatingCapacity(BigInteger value) {
        this.largestSeatingCapacity = value;
    }

    /**
     * ��ȡsecondLargestSeatingCapacity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSecondLargestSeatingCapacity() {
        return secondLargestSeatingCapacity;
    }

    /**
     * ����secondLargestSeatingCapacity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSecondLargestSeatingCapacity(BigInteger value) {
        this.secondLargestSeatingCapacity = value;
    }

    /**
     * ��ȡsmallestSeatingCapacity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSmallestSeatingCapacity() {
        return smallestSeatingCapacity;
    }

    /**
     * ����smallestSeatingCapacity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSmallestSeatingCapacity(BigInteger value) {
        this.smallestSeatingCapacity = value;
    }

    /**
     * ��ȡtotalRoomSeatingCapacity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getTotalRoomSeatingCapacity() {
        return totalRoomSeatingCapacity;
    }

    /**
     * ����totalRoomSeatingCapacity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setTotalRoomSeatingCapacity(BigInteger value) {
        this.totalRoomSeatingCapacity = value;
    }

    /**
     * ��ȡlargestRoomHeight���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLargestRoomHeight() {
        return largestRoomHeight;
    }

    /**
     * ����largestRoomHeight���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLargestRoomHeight(BigInteger value) {
        this.largestRoomHeight = value;
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
     *         &lt;element name="Codes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCodeType" minOccurs="0"/>
     *         &lt;element name="Dimension" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Units" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AvailableCapacities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCapacityType" minOccurs="0"/>
     *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
     *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Irregular" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PropertySystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RoomName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MeetingRoomCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Access" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MeetingRoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MeetingRoomLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DedicatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "codes",
            "dimension",
            "availableCapacities",
            "features",
            "multimediaDescriptions"
    })
    public static class MeetingRoom {

        @XmlElement(name = "Codes")
        protected ArrayOfMeetingRoomCodeType codes;
        @XmlElement(name = "Dimension")
        protected MeetingRoomsType.MeetingRoom.Dimension dimension;
        @XmlElement(name = "AvailableCapacities")
        protected ArrayOfMeetingRoomCapacityType availableCapacities;
        @XmlElement(name = "Features")
        protected ArrayOfFeaturesTypeFeature features;
        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlAttribute(name = "Irregular")
        protected Boolean irregular;
        @XmlAttribute(name = "PropertySystemName")
        protected String propertySystemName;
        @XmlAttribute(name = "RoomName")
        protected String roomName;
        @XmlAttribute(name = "Sort")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger sort;
        @XmlAttribute(name = "MeetingRoomCapacity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger meetingRoomCapacity;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "ID")
        protected String id;
        @XmlAttribute(name = "Access")
        protected String access;
        @XmlAttribute(name = "MeetingRoomTypeCode")
        protected String meetingRoomTypeCode;
        @XmlAttribute(name = "MeetingRoomLevel")
        protected String meetingRoomLevel;
        @XmlAttribute(name = "DedicatedIndicator")
        protected Boolean dedicatedIndicator;

        /**
         * ��ȡcodes���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfMeetingRoomCodeType }
         */
        public ArrayOfMeetingRoomCodeType getCodes() {
            return codes;
        }

        /**
         * ����codes���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfMeetingRoomCodeType }
         */
        public void setCodes(ArrayOfMeetingRoomCodeType value) {
            this.codes = value;
        }

        /**
         * ��ȡdimension���Ե�ֵ��
         *
         * @return possible object is
         * {@link MeetingRoomsType.MeetingRoom.Dimension }
         */
        public MeetingRoomsType.MeetingRoom.Dimension getDimension() {
            return dimension;
        }

        /**
         * ����dimension���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link MeetingRoomsType.MeetingRoom.Dimension }
         */
        public void setDimension(MeetingRoomsType.MeetingRoom.Dimension value) {
            this.dimension = value;
        }

        /**
         * ��ȡavailableCapacities���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfMeetingRoomCapacityType }
         */
        public ArrayOfMeetingRoomCapacityType getAvailableCapacities() {
            return availableCapacities;
        }

        /**
         * ����availableCapacities���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfMeetingRoomCapacityType }
         */
        public void setAvailableCapacities(ArrayOfMeetingRoomCapacityType value) {
            this.availableCapacities = value;
        }

        /**
         * ��ȡfeatures���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfFeaturesTypeFeature }
         */
        public ArrayOfFeaturesTypeFeature getFeatures() {
            return features;
        }

        /**
         * ����features���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfFeaturesTypeFeature }
         */
        public void setFeatures(ArrayOfFeaturesTypeFeature value) {
            this.features = value;
        }

        /**
         * ��ȡmultimediaDescriptions���Ե�ֵ��
         *
         * @return possible object is
         * {@link MultimediaDescriptionsType }
         */
        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * ����multimediaDescriptions���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link MultimediaDescriptionsType }
         */
        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        /**
         * ��ȡirregular���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isIrregular() {
            return irregular;
        }

        /**
         * ����irregular���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setIrregular(Boolean value) {
            this.irregular = value;
        }

        /**
         * ��ȡpropertySystemName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPropertySystemName() {
            return propertySystemName;
        }

        /**
         * ����propertySystemName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPropertySystemName(String value) {
            this.propertySystemName = value;
        }

        /**
         * ��ȡroomName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRoomName() {
            return roomName;
        }

        /**
         * ����roomName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRoomName(String value) {
            this.roomName = value;
        }

        /**
         * ��ȡsort���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getSort() {
            return sort;
        }

        /**
         * ����sort���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setSort(BigInteger value) {
            this.sort = value;
        }

        /**
         * ��ȡmeetingRoomCapacity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMeetingRoomCapacity() {
            return meetingRoomCapacity;
        }

        /**
         * ����meetingRoomCapacity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMeetingRoomCapacity(BigInteger value) {
            this.meetingRoomCapacity = value;
        }

        /**
         * ��ȡremoval���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * ����removal���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * ��ȡid���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getID() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * ��ȡaccess���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAccess() {
            return access;
        }

        /**
         * ����access���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAccess(String value) {
            this.access = value;
        }

        /**
         * ��ȡmeetingRoomTypeCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMeetingRoomTypeCode() {
            return meetingRoomTypeCode;
        }

        /**
         * ����meetingRoomTypeCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMeetingRoomTypeCode(String value) {
            this.meetingRoomTypeCode = value;
        }

        /**
         * ��ȡmeetingRoomLevel���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMeetingRoomLevel() {
            return meetingRoomLevel;
        }

        /**
         * ����meetingRoomLevel���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMeetingRoomLevel(String value) {
            this.meetingRoomLevel = value;
        }

        /**
         * ��ȡdedicatedIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isDedicatedIndicator() {
            return dedicatedIndicator;
        }

        /**
         * ����dedicatedIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setDedicatedIndicator(Boolean value) {
            this.dedicatedIndicator = value;
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
         *       &lt;attribute name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Units" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Dimension {

            @XmlAttribute(name = "Area")
            protected BigDecimal area;
            @XmlAttribute(name = "Height")
            protected BigDecimal height;
            @XmlAttribute(name = "Length")
            protected BigDecimal length;
            @XmlAttribute(name = "Width")
            protected BigDecimal width;
            @XmlAttribute(name = "Units")
            protected String units;
            @XmlAttribute(name = "UnitOfMeasureCode")
            protected String unitOfMeasureCode;

            /**
             * ��ȡarea���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getArea() {
                return area;
            }

            /**
             * ����area���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setArea(BigDecimal value) {
                this.area = value;
            }

            /**
             * ��ȡheight���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * ����height���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * ��ȡlength���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getLength() {
                return length;
            }

            /**
             * ����length���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setLength(BigDecimal value) {
                this.length = value;
            }

            /**
             * ��ȡwidth���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * ����width���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * ��ȡunits���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getUnits() {
                return units;
            }

            /**
             * ����units���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setUnits(String value) {
                this.units = value;
            }

            /**
             * ��ȡunitOfMeasureCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getUnitOfMeasureCode() {
                return unitOfMeasureCode;
            }

            /**
             * ����unitOfMeasureCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setUnitOfMeasureCode(String value) {
                this.unitOfMeasureCode = value;
            }

        }

    }

}
