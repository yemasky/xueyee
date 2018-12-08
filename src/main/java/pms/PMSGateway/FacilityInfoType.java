package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>FacilityInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="FacilityInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeetingRooms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType">
 *                 &lt;sequence>
 *                   &lt;element name="Codes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCodeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GuestRooms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GuestRoom" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TypeRoom" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Floor" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="InvBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RoomLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RoomViewCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="BedTypeCode">
 *                                       &lt;simpleType>
 *                                         &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="NonSmoking" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Configuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="SizeMeasurement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="RoomClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RoomArchitectureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RoomGender">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="Male"/>
 *                                           &lt;enumeration value="Female"/>
 *                                           &lt;enumeration value="MaleAndFemale"/>
 *                                           &lt;enumeration value="Unknown"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="SharedRoomInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Amenities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity" minOccurs="0"/>
 *                             &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
 *                             &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;attribute name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                           &lt;attribute name="MaxAdultOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="NonsmokingQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="MaxChildOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Restaurants" type="{http://www.opentravel.org/OTA/2003/05}RestaurantsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * ��ȡmeetingRooms���Ե�ֵ��
     *
     * @return possible object is
     * {@link FacilityInfoType.MeetingRooms }
     */
    public FacilityInfoType.MeetingRooms getMeetingRooms() {
        return meetingRooms;
    }

    /**
     * ����meetingRooms���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link FacilityInfoType.MeetingRooms }
     */
    public void setMeetingRooms(FacilityInfoType.MeetingRooms value) {
        this.meetingRooms = value;
    }

    /**
     * ��ȡguestRooms���Ե�ֵ��
     *
     * @return possible object is
     * {@link FacilityInfoType.GuestRooms }
     */
    public FacilityInfoType.GuestRooms getGuestRooms() {
        return guestRooms;
    }

    /**
     * ����guestRooms���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link FacilityInfoType.GuestRooms }
     */
    public void setGuestRooms(FacilityInfoType.GuestRooms value) {
        this.guestRooms = value;
    }

    /**
     * ��ȡrestaurants���Ե�ֵ��
     *
     * @return possible object is
     * {@link RestaurantsType }
     */
    public RestaurantsType getRestaurants() {
        return restaurants;
    }

    /**
     * ����restaurants���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RestaurantsType }
     */
    public void setRestaurants(RestaurantsType value) {
        this.restaurants = value;
    }

    /**
     * ��ȡlastUpdated���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * ����lastUpdated���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
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
     *         &lt;element name="GuestRoom" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TypeRoom" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Floor" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="InvBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RoomLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RoomViewCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="BedTypeCode">
     *                             &lt;simpleType>
     *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="NonSmoking" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Configuration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="SizeMeasurement" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="RoomClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RoomArchitectureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RoomGender">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="Male"/>
     *                                 &lt;enumeration value="Female"/>
     *                                 &lt;enumeration value="MaleAndFemale"/>
     *                                 &lt;enumeration value="Unknown"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="SharedRoomInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Amenities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity" minOccurs="0"/>
     *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
     *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                 &lt;attribute name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;attribute name="MaxAdultOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="NonsmokingQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="MaxChildOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guestRoom property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuestRoom().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link FacilityInfoType.GuestRooms.GuestRoom }
         */
        public List<FacilityInfoType.GuestRooms.GuestRoom> getGuestRoom() {
            if (guestRoom == null) {
                guestRoom = new ArrayList<FacilityInfoType.GuestRooms.GuestRoom>();
            }
            return this.guestRoom;
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
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TypeRoom" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                 &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Amenities" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity" minOccurs="0"/>
         *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
         *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *       &lt;attribute name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="MaxAdultOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="NonsmokingQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="MaxChildOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the typeRoom property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTypeRoom().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link FacilityInfoType.GuestRooms.GuestRoom.TypeRoom }
             */
            public List<FacilityInfoType.GuestRooms.GuestRoom.TypeRoom> getTypeRoom() {
                if (typeRoom == null) {
                    typeRoom = new ArrayList<FacilityInfoType.GuestRooms.GuestRoom.TypeRoom>();
                }
                return this.typeRoom;
            }

            /**
             * ��ȡamenities���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity }
             */
            public ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity getAmenities() {
                return amenities;
            }

            /**
             * ����amenities���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity }
             */
            public void setAmenities(ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity value) {
                this.amenities = value;
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
             * ��ȡdescriptiveText���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * ����descriptiveText���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

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

            /**
             * ��ȡroomTypeName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getRoomTypeName() {
                return roomTypeName;
            }

            /**
             * ����roomTypeName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRoomTypeName(String value) {
                this.roomTypeName = value;
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
             * ��ȡquality���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getQuality() {
                return quality;
            }

            /**
             * ����quality���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setQuality(String value) {
                this.quality = value;
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
             * ��ȡmaxAdultOccupancy���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getMaxAdultOccupancy() {
                return maxAdultOccupancy;
            }

            /**
             * ����maxAdultOccupancy���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setMaxAdultOccupancy(BigInteger value) {
                this.maxAdultOccupancy = value;
            }

            /**
             * ��ȡnonsmokingQuantity���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getNonsmokingQuantity() {
                return nonsmokingQuantity;
            }

            /**
             * ����nonsmokingQuantity���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setNonsmokingQuantity(BigInteger value) {
                this.nonsmokingQuantity = value;
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
             * ��ȡmaxChildOccupancy���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getMaxChildOccupancy() {
                return maxChildOccupancy;
            }

            /**
             * ����maxChildOccupancy���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setMaxChildOccupancy(BigInteger value) {
                this.maxChildOccupancy = value;
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
             * <p>anonymous complex type�� Java �ࡣ
             * <p/>
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * <p/>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *       &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
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
                 * ��ȡstandardOccupancy���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link BigInteger }
                 */
                public BigInteger getStandardOccupancy() {
                    return standardOccupancy;
                }

                /**
                 * ����standardOccupancy���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link BigInteger }
                 */
                public void setStandardOccupancy(BigInteger value) {
                    this.standardOccupancy = value;
                }

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
                 * ��ȡsize���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link BigInteger }
                 */
                public BigInteger getSize() {
                    return size;
                }

                /**
                 * ����size���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link BigInteger }
                 */
                public void setSize(BigInteger value) {
                    this.size = value;
                }

                /**
                 * ��ȡtypeImplied���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getTypeImplied() {
                    return typeImplied;
                }

                /**
                 * ����typeImplied���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setTypeImplied(String value) {
                    this.typeImplied = value;
                }

                /**
                 * ��ȡcount���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link BigInteger }
                 */
                public BigInteger getCount() {
                    return count;
                }

                /**
                 * ����count���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link BigInteger }
                 */
                public void setCount(BigInteger value) {
                    this.count = value;
                }

                /**
                 * ��ȡname���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getName() {
                    return name;
                }

                /**
                 * ����name���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setName(String value) {
                    this.name = value;
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
                 * ��ȡmaxCribs���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link BigInteger }
                 */
                public BigInteger getMaxCribs() {
                    return maxCribs;
                }

                /**
                 * ����maxCribs���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link BigInteger }
                 */
                public void setMaxCribs(BigInteger value) {
                    this.maxCribs = value;
                }

            }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType">
     *       &lt;sequence>
     *         &lt;element name="Codes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMeetingRoomCodeType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "codes"
    })
    public static class MeetingRooms
            extends MeetingRoomsType {

        @XmlElement(name = "Codes")
        protected ArrayOfMeetingRoomCodeType codes;

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

    }

}
