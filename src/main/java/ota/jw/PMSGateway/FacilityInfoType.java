
package ota.jw.PMSGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FacilityInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FacilityInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeetingRooms" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Codes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCodeType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GuestRooms" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GuestRoom" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TypeRoom" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                     &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                     &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                     &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                     &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="RoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Floor" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                     &lt;attribute name="InvBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="RoomLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="RoomViewCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="BedTypeCode"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="NonSmoking" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="Configuration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="SizeMeasurement" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                     &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="RoomClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="RoomArchitectureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="RoomGender"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;enumeration value="Male"/&gt;
 *                                           &lt;enumeration value="Female"/&gt;
 *                                           &lt;enumeration value="MaleAndFemale"/&gt;
 *                                           &lt;enumeration value="Unknown"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="SharedRoomInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Amenities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity" minOccurs="0"/&gt;
 *                             &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/&gt;
 *                             &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                           &lt;attribute name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                           &lt;attribute name="MaxAdultOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="NonsmokingQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="MaxChildOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Restaurants" type="{http://www.opentravel.org/OTA/2003/05}RestaurantsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityInfoType", propOrder = {
    "meetingRooms",
    "guestRooms",
    "restaurants"
})
public class FacilityInfoType {

    @XmlElement(name = "MeetingRooms")
    protected FacilityInfoType.MeetingRooms meetingRooms;
    @XmlElement(name = "GuestRooms")
    protected FacilityInfoType.GuestRooms guestRooms;
    @XmlElement(name = "Restaurants")
    protected RestaurantsType restaurants;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * 获取meetingRooms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FacilityInfoType.MeetingRooms }
     *     
     */
    public FacilityInfoType.MeetingRooms getMeetingRooms() {
        return meetingRooms;
    }

    /**
     * 设置meetingRooms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityInfoType.MeetingRooms }
     *     
     */
    public void setMeetingRooms(FacilityInfoType.MeetingRooms value) {
        this.meetingRooms = value;
    }

    /**
     * 获取guestRooms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FacilityInfoType.GuestRooms }
     *     
     */
    public FacilityInfoType.GuestRooms getGuestRooms() {
        return guestRooms;
    }

    /**
     * 设置guestRooms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityInfoType.GuestRooms }
     *     
     */
    public void setGuestRooms(FacilityInfoType.GuestRooms value) {
        this.guestRooms = value;
    }

    /**
     * 获取restaurants属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RestaurantsType }
     *     
     */
    public RestaurantsType getRestaurants() {
        return restaurants;
    }

    /**
     * 设置restaurants属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantsType }
     *     
     */
    public void setRestaurants(RestaurantsType value) {
        this.restaurants = value;
    }

    /**
     * 获取lastUpdated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置lastUpdated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
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
     *         &lt;element name="GuestRoom" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TypeRoom" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                           &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                           &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                           &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                           &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="RoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Floor" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                           &lt;attribute name="InvBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="RoomLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="RoomViewCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="BedTypeCode"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="NonSmoking" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="Configuration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="SizeMeasurement" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                           &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="RoomClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="RoomArchitectureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="RoomGender"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;enumeration value="Male"/&gt;
     *                                 &lt;enumeration value="Female"/&gt;
     *                                 &lt;enumeration value="MaleAndFemale"/&gt;
     *                                 &lt;enumeration value="Unknown"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="SharedRoomInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Amenities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity" minOccurs="0"/&gt;
     *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/&gt;
     *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *                 &lt;attribute name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *                 &lt;attribute name="MaxAdultOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="NonsmokingQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="MaxChildOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guestRoom"
    })
    public static class GuestRooms {

        @XmlElement(name = "GuestRoom")
        protected List<FacilityInfoType.GuestRooms.GuestRoom> guestRoom;
        @XmlAttribute(name = "MaxOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxOccupancy;

        /**
         * Gets the value of the guestRoom property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guestRoom property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuestRoom().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FacilityInfoType.GuestRooms.GuestRoom }
         * 
         * 
         */
        public List<FacilityInfoType.GuestRooms.GuestRoom> getGuestRoom() {
            if (guestRoom == null) {
                guestRoom = new ArrayList<FacilityInfoType.GuestRooms.GuestRoom>();
            }
            return this.guestRoom;
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="TypeRoom" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *                 &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *                 &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *                 &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *                 &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
         *                 &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Amenities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity" minOccurs="0"/&gt;
         *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/&gt;
         *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
         *       &lt;attribute name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *       &lt;attribute name="MaxAdultOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="NonsmokingQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="MaxChildOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "typeRoom",
            "amenities",
            "features",
            "multimediaDescriptions",
            "descriptiveText"
        })
        public static class GuestRoom {

            @XmlElement(name = "TypeRoom")
            protected List<FacilityInfoType.GuestRooms.GuestRoom.TypeRoom> typeRoom;
            @XmlElement(name = "Amenities")
            protected ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity amenities;
            @XmlElement(name = "Features")
            protected ArrayOfFeaturesTypeFeature features;
            @XmlElement(name = "MultimediaDescriptions")
            protected MultimediaDescriptionsType multimediaDescriptions;
            @XmlElement(name = "DescriptiveText")
            protected String descriptiveText;
            @XmlAttribute(name = "URI")
            @XmlSchemaType(name = "anyURI")
            protected String uri;
            @XmlAttribute(name = "RoomTypeName")
            protected String roomTypeName;
            @XmlAttribute(name = "Composite")
            protected Boolean composite;
            @XmlAttribute(name = "Quality")
            protected String quality;
            @XmlAttribute(name = "MaxOccupancy")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger maxOccupancy;
            @XmlAttribute(name = "MaxAdultOccupancy")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger maxAdultOccupancy;
            @XmlAttribute(name = "NonsmokingQuantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger nonsmokingQuantity;
            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "MaxChildOccupancy")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger maxChildOccupancy;
            @XmlAttribute(name = "Sort")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger sort;

            /**
             * Gets the value of the typeRoom property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the typeRoom property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTypeRoom().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FacilityInfoType.GuestRooms.GuestRoom.TypeRoom }
             * 
             * 
             */
            public List<FacilityInfoType.GuestRooms.GuestRoom.TypeRoom> getTypeRoom() {
                if (typeRoom == null) {
                    typeRoom = new ArrayList<FacilityInfoType.GuestRooms.GuestRoom.TypeRoom>();
                }
                return this.typeRoom;
            }

            /**
             * 获取amenities属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity }
             *     
             */
            public ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity getAmenities() {
                return amenities;
            }

            /**
             * 设置amenities属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity }
             *     
             */
            public void setAmenities(ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity value) {
                this.amenities = value;
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
             * 获取descriptiveText属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * 设置descriptiveText属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

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

            /**
             * 获取roomTypeName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomTypeName() {
                return roomTypeName;
            }

            /**
             * 设置roomTypeName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomTypeName(String value) {
                this.roomTypeName = value;
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
             * 获取quality属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuality() {
                return quality;
            }

            /**
             * 设置quality属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuality(String value) {
                this.quality = value;
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
             * 获取maxAdultOccupancy属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxAdultOccupancy() {
                return maxAdultOccupancy;
            }

            /**
             * 设置maxAdultOccupancy属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxAdultOccupancy(BigInteger value) {
                this.maxAdultOccupancy = value;
            }

            /**
             * 获取nonsmokingQuantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNonsmokingQuantity() {
                return nonsmokingQuantity;
            }

            /**
             * 设置nonsmokingQuantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNonsmokingQuantity(BigInteger value) {
                this.nonsmokingQuantity = value;
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
             * 获取maxChildOccupancy属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxChildOccupancy() {
                return maxChildOccupancy;
            }

            /**
             * 设置maxChildOccupancy属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxChildOccupancy(BigInteger value) {
                this.maxChildOccupancy = value;
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *       &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *       &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *       &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *       &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
             *       &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TypeRoom {

                @XmlAttribute(name = "StandardNumBeds")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger standardNumBeds;
                @XmlAttribute(name = "StandardOccupancy")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger standardOccupancy;
                @XmlAttribute(name = "MaxRollaways")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger maxRollaways;
                @XmlAttribute(name = "Size")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger size;
                @XmlAttribute(name = "TypeImplied")
                protected String typeImplied;
                @XmlAttribute(name = "Count")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger count;
                @XmlAttribute(name = "Name")
                protected String name;
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
                @XmlAttribute(name = "MaxCribs")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger maxCribs;

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
                 * 获取standardOccupancy属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getStandardOccupancy() {
                    return standardOccupancy;
                }

                /**
                 * 设置standardOccupancy属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setStandardOccupancy(BigInteger value) {
                    this.standardOccupancy = value;
                }

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
                 * 获取size属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSize() {
                    return size;
                }

                /**
                 * 设置size属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSize(BigInteger value) {
                    this.size = value;
                }

                /**
                 * 获取typeImplied属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeImplied() {
                    return typeImplied;
                }

                /**
                 * 设置typeImplied属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeImplied(String value) {
                    this.typeImplied = value;
                }

                /**
                 * 获取count属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCount() {
                    return count;
                }

                /**
                 * 设置count属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCount(BigInteger value) {
                    this.count = value;
                }

                /**
                 * 获取name属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * 设置name属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
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
                 * 获取maxCribs属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMaxCribs() {
                    return maxCribs;
                }

                /**
                 * 设置maxCribs属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMaxCribs(BigInteger value) {
                    this.maxCribs = value;
                }

            }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Codes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCodeType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codes"
    })
    public static class MeetingRooms
        extends MeetingRoomsType
    {

        @XmlElement(name = "Codes")
        protected ArrayOfMeetingRoomCodeType codes;

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

    }

}
