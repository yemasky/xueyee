
package ota.jw.PMSGateway;

import java.math.BigDecimal;
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


/**
 * <p>MeetingRoomsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MeetingRoomsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeetingRoom" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Codes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCodeType" minOccurs="0"/&gt;
 *                   &lt;element name="Dimension" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="Units" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AvailableCapacities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCapacityType" minOccurs="0"/&gt;
 *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/&gt;
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Irregular" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="PropertySystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RoomName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="MeetingRoomCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Access" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MeetingRoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MeetingRoomLevel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DedicatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MeetingRoomCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="SmallestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="LargestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="LargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="SecondLargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="SmallestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="TotalRoomSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="LargestRoomHeight" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRoomsType", propOrder = {
    "meetingRoom"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.FacilityInfoType.MeetingRooms.class
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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingRoom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingRoomsType.MeetingRoom }
     * 
     * 
     */
    public List<MeetingRoomsType.MeetingRoom> getMeetingRoom() {
        if (meetingRoom == null) {
            meetingRoom = new ArrayList<MeetingRoomsType.MeetingRoom>();
        }
        return this.meetingRoom;
    }

    /**
     * 获取meetingRoomCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeetingRoomCount() {
        return meetingRoomCount;
    }

    /**
     * 设置meetingRoomCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeetingRoomCount(BigInteger value) {
        this.meetingRoomCount = value;
    }

    /**
     * 获取smallestRoomSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSmallestRoomSpace() {
        return smallestRoomSpace;
    }

    /**
     * 设置smallestRoomSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSmallestRoomSpace(BigInteger value) {
        this.smallestRoomSpace = value;
    }

    /**
     * 获取largestRoomSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLargestRoomSpace() {
        return largestRoomSpace;
    }

    /**
     * 设置largestRoomSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLargestRoomSpace(BigInteger value) {
        this.largestRoomSpace = value;
    }

    /**
     * 获取unitOfMeasureQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /**
     * 设置unitOfMeasureQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitOfMeasureQuantity(BigDecimal value) {
        this.unitOfMeasureQuantity = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * 获取unitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * 设置unitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * 获取totalRoomSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRoomSpace() {
        return totalRoomSpace;
    }

    /**
     * 设置totalRoomSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRoomSpace(BigInteger value) {
        this.totalRoomSpace = value;
    }

    /**
     * 获取largestSeatingCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLargestSeatingCapacity() {
        return largestSeatingCapacity;
    }

    /**
     * 设置largestSeatingCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLargestSeatingCapacity(BigInteger value) {
        this.largestSeatingCapacity = value;
    }

    /**
     * 获取secondLargestSeatingCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecondLargestSeatingCapacity() {
        return secondLargestSeatingCapacity;
    }

    /**
     * 设置secondLargestSeatingCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecondLargestSeatingCapacity(BigInteger value) {
        this.secondLargestSeatingCapacity = value;
    }

    /**
     * 获取smallestSeatingCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSmallestSeatingCapacity() {
        return smallestSeatingCapacity;
    }

    /**
     * 设置smallestSeatingCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSmallestSeatingCapacity(BigInteger value) {
        this.smallestSeatingCapacity = value;
    }

    /**
     * 获取totalRoomSeatingCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRoomSeatingCapacity() {
        return totalRoomSeatingCapacity;
    }

    /**
     * 设置totalRoomSeatingCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRoomSeatingCapacity(BigInteger value) {
        this.totalRoomSeatingCapacity = value;
    }

    /**
     * 获取largestRoomHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLargestRoomHeight() {
        return largestRoomHeight;
    }

    /**
     * 设置largestRoomHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLargestRoomHeight(BigInteger value) {
        this.largestRoomHeight = value;
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
     *         &lt;element name="Codes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCodeType" minOccurs="0"/&gt;
     *         &lt;element name="Dimension" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="Units" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AvailableCapacities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCapacityType" minOccurs="0"/&gt;
     *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/&gt;
     *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Irregular" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="PropertySystemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RoomName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="MeetingRoomCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Access" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MeetingRoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MeetingRoomLevel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DedicatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取codes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfMeetingRoomCodeType }
         *     
         */
        public ArrayOfMeetingRoomCodeType getCodes() {
            return codes;
        }

        /**
         * 设置codes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfMeetingRoomCodeType }
         *     
         */
        public void setCodes(ArrayOfMeetingRoomCodeType value) {
            this.codes = value;
        }

        /**
         * 获取dimension属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MeetingRoomsType.MeetingRoom.Dimension }
         *     
         */
        public MeetingRoomsType.MeetingRoom.Dimension getDimension() {
            return dimension;
        }

        /**
         * 设置dimension属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MeetingRoomsType.MeetingRoom.Dimension }
         *     
         */
        public void setDimension(MeetingRoomsType.MeetingRoom.Dimension value) {
            this.dimension = value;
        }

        /**
         * 获取availableCapacities属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfMeetingRoomCapacityType }
         *     
         */
        public ArrayOfMeetingRoomCapacityType getAvailableCapacities() {
            return availableCapacities;
        }

        /**
         * 设置availableCapacities属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfMeetingRoomCapacityType }
         *     
         */
        public void setAvailableCapacities(ArrayOfMeetingRoomCapacityType value) {
            this.availableCapacities = value;
        }

        /**
         * 获取features属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfFeaturesTypeFeature }
         *     
         */
        public ArrayOfFeaturesTypeFeature getFeatures() {
            return features;
        }

        /**
         * 设置features属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfFeaturesTypeFeature }
         *     
         */
        public void setFeatures(ArrayOfFeaturesTypeFeature value) {
            this.features = value;
        }

        /**
         * 获取multimediaDescriptions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * 设置multimediaDescriptions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        /**
         * 获取irregular属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIrregular() {
            return irregular;
        }

        /**
         * 设置irregular属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIrregular(Boolean value) {
            this.irregular = value;
        }

        /**
         * 获取propertySystemName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertySystemName() {
            return propertySystemName;
        }

        /**
         * 设置propertySystemName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertySystemName(String value) {
            this.propertySystemName = value;
        }

        /**
         * 获取roomName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomName() {
            return roomName;
        }

        /**
         * 设置roomName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomName(String value) {
            this.roomName = value;
        }

        /**
         * 获取sort属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSort() {
            return sort;
        }

        /**
         * 设置sort属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSort(BigInteger value) {
            this.sort = value;
        }

        /**
         * 获取meetingRoomCapacity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMeetingRoomCapacity() {
            return meetingRoomCapacity;
        }

        /**
         * 设置meetingRoomCapacity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMeetingRoomCapacity(BigInteger value) {
            this.meetingRoomCapacity = value;
        }

        /**
         * 获取removal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * 设置removal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * 获取access属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccess() {
            return access;
        }

        /**
         * 设置access属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccess(String value) {
            this.access = value;
        }

        /**
         * 获取meetingRoomTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeetingRoomTypeCode() {
            return meetingRoomTypeCode;
        }

        /**
         * 设置meetingRoomTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeetingRoomTypeCode(String value) {
            this.meetingRoomTypeCode = value;
        }

        /**
         * 获取meetingRoomLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeetingRoomLevel() {
            return meetingRoomLevel;
        }

        /**
         * 设置meetingRoomLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeetingRoomLevel(String value) {
            this.meetingRoomLevel = value;
        }

        /**
         * 获取dedicatedIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDedicatedIndicator() {
            return dedicatedIndicator;
        }

        /**
         * 设置dedicatedIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDedicatedIndicator(Boolean value) {
            this.dedicatedIndicator = value;
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
         *       &lt;attribute name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="Units" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * 获取area属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getArea() {
                return area;
            }

            /**
             * 设置area属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setArea(BigDecimal value) {
                this.area = value;
            }

            /**
             * 获取height属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getHeight() {
                return height;
            }

            /**
             * 设置height属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setHeight(BigDecimal value) {
                this.height = value;
            }

            /**
             * 获取length属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLength() {
                return length;
            }

            /**
             * 设置length属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLength(BigDecimal value) {
                this.length = value;
            }

            /**
             * 获取width属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * 设置width属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

            /**
             * 获取units属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                return units;
            }

            /**
             * 设置units属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

            /**
             * 获取unitOfMeasureCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitOfMeasureCode() {
                return unitOfMeasureCode;
            }

            /**
             * 设置unitOfMeasureCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitOfMeasureCode(String value) {
                this.unitOfMeasureCode = value;
            }

        }

    }

}
