
package ota.jw.AvailRes;

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
 * <p>HotelSearchCriterionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelSearchCriterionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ItemSearchCriterionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelAmenity" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ComplimentaryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RoomAmenity" type="{http://www.opentravel.org/OTA/2003/05}RoomAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HotelFeature" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="SecurityFeatureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AccessibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Award" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Recreation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ServiceInventoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Transportation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StayDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/&gt;
 *         &lt;element name="RateRange" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="RateMode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RatePlanCandidates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RatePlanCandidatesType"&gt;
 *                 &lt;attribute name="TaxesIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/&gt;
 *         &lt;element name="RoomStayCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStayCandidateType" minOccurs="0"/&gt;
 *         &lt;element name="AcceptedPayments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPaymentFormType" minOccurs="0"/&gt;
 *         &lt;element name="Media" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ContentCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HotelMeetingFacility" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MeetingRoomCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="LargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="LargestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MeetingRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MealPlan" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RebatePrograms" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRebateType" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *         &lt;element name="RoomPrices" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomPrice" minOccurs="0"/&gt;
 *         &lt;element name="MemberType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MemberCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelSearchCriterionType", propOrder = {
    "hotelAmenity",
    "roomAmenity",
    "hotelFeature",
    "award",
    "recreation",
    "service",
    "transportation",
    "stayDateRange",
    "rateRange",
    "ratePlanCandidates",
    "profiles",
    "roomStayCandidates",
    "acceptedPayments",
    "media",
    "hotelMeetingFacility",
    "mealPlan",
    "rebatePrograms",
    "tpaExtensions",
    "roomPrices",
    "memberType",
    "memberCard"
})
@XmlSeeAlso({
    ota.jw.AvailRes.HotelSearchCriteriaType.Criterion.class
})
public class HotelSearchCriterionType
    extends ItemSearchCriterionType
{

    @XmlElement(name = "HotelAmenity")
    protected List<HotelSearchCriterionType.HotelAmenity> hotelAmenity;
    @XmlElement(name = "RoomAmenity")
    protected List<RoomAmenityPrefType> roomAmenity;
    @XmlElement(name = "HotelFeature")
    protected List<HotelSearchCriterionType.HotelFeature> hotelFeature;
    @XmlElement(name = "Award")
    protected List<HotelSearchCriterionType.Award> award;
    @XmlElement(name = "Recreation")
    protected List<HotelSearchCriterionType.Recreation> recreation;
    @XmlElement(name = "Service")
    protected List<HotelSearchCriterionType.Service> service;
    @XmlElement(name = "Transportation")
    protected List<HotelSearchCriterionType.Transportation> transportation;
    @XmlElement(name = "StayDateRange")
    protected DateTimeSpanType stayDateRange;
    @XmlElement(name = "RateRange")
    protected List<HotelSearchCriterionType.RateRange> rateRange;
    @XmlElement(name = "RatePlanCandidates")
    protected HotelSearchCriterionType.RatePlanCandidates ratePlanCandidates;
    @XmlElement(name = "Profiles")
    protected ArrayOfProfilesTypeProfileInfo profiles;
    @XmlElement(name = "RoomStayCandidates")
    protected ArrayOfRoomStayCandidateType roomStayCandidates;
    @XmlElement(name = "AcceptedPayments")
    protected ArrayOfPaymentFormType acceptedPayments;
    @XmlElement(name = "Media")
    protected List<HotelSearchCriterionType.Media> media;
    @XmlElement(name = "HotelMeetingFacility")
    protected HotelSearchCriterionType.HotelMeetingFacility hotelMeetingFacility;
    @XmlElement(name = "MealPlan")
    protected HotelSearchCriterionType.MealPlan mealPlan;
    @XmlElement(name = "RebatePrograms")
    protected ArrayOfRebateType rebatePrograms;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "RoomPrices")
    protected ArrayOfRoomPrice roomPrices;
    @XmlElement(name = "MemberType")
    protected Integer memberType;
    @XmlElement(name = "MemberCard")
    protected String memberCard;

    /**
     * Gets the value of the hotelAmenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelAmenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.HotelAmenity }
     * 
     * 
     */
    public List<HotelSearchCriterionType.HotelAmenity> getHotelAmenity() {
        if (hotelAmenity == null) {
            hotelAmenity = new ArrayList<HotelSearchCriterionType.HotelAmenity>();
        }
        return this.hotelAmenity;
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
     * Gets the value of the hotelFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.HotelFeature }
     * 
     * 
     */
    public List<HotelSearchCriterionType.HotelFeature> getHotelFeature() {
        if (hotelFeature == null) {
            hotelFeature = new ArrayList<HotelSearchCriterionType.HotelFeature>();
        }
        return this.hotelFeature;
    }

    /**
     * Gets the value of the award property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Award }
     * 
     * 
     */
    public List<HotelSearchCriterionType.Award> getAward() {
        if (award == null) {
            award = new ArrayList<HotelSearchCriterionType.Award>();
        }
        return this.award;
    }

    /**
     * Gets the value of the recreation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recreation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecreation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Recreation }
     * 
     * 
     */
    public List<HotelSearchCriterionType.Recreation> getRecreation() {
        if (recreation == null) {
            recreation = new ArrayList<HotelSearchCriterionType.Recreation>();
        }
        return this.recreation;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Service }
     * 
     * 
     */
    public List<HotelSearchCriterionType.Service> getService() {
        if (service == null) {
            service = new ArrayList<HotelSearchCriterionType.Service>();
        }
        return this.service;
    }

    /**
     * Gets the value of the transportation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Transportation }
     * 
     * 
     */
    public List<HotelSearchCriterionType.Transportation> getTransportation() {
        if (transportation == null) {
            transportation = new ArrayList<HotelSearchCriterionType.Transportation>();
        }
        return this.transportation;
    }

    /**
     * 获取stayDateRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getStayDateRange() {
        return stayDateRange;
    }

    /**
     * 设置stayDateRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setStayDateRange(DateTimeSpanType value) {
        this.stayDateRange = value;
    }

    /**
     * Gets the value of the rateRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.RateRange }
     * 
     * 
     */
    public List<HotelSearchCriterionType.RateRange> getRateRange() {
        if (rateRange == null) {
            rateRange = new ArrayList<HotelSearchCriterionType.RateRange>();
        }
        return this.rateRange;
    }

    /**
     * 获取ratePlanCandidates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchCriterionType.RatePlanCandidates }
     *     
     */
    public HotelSearchCriterionType.RatePlanCandidates getRatePlanCandidates() {
        return ratePlanCandidates;
    }

    /**
     * 设置ratePlanCandidates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchCriterionType.RatePlanCandidates }
     *     
     */
    public void setRatePlanCandidates(HotelSearchCriterionType.RatePlanCandidates value) {
        this.ratePlanCandidates = value;
    }

    /**
     * 获取profiles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfilesTypeProfileInfo }
     *     
     */
    public ArrayOfProfilesTypeProfileInfo getProfiles() {
        return profiles;
    }

    /**
     * 设置profiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfilesTypeProfileInfo }
     *     
     */
    public void setProfiles(ArrayOfProfilesTypeProfileInfo value) {
        this.profiles = value;
    }

    /**
     * 获取roomStayCandidates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomStayCandidateType }
     *     
     */
    public ArrayOfRoomStayCandidateType getRoomStayCandidates() {
        return roomStayCandidates;
    }

    /**
     * 设置roomStayCandidates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomStayCandidateType }
     *     
     */
    public void setRoomStayCandidates(ArrayOfRoomStayCandidateType value) {
        this.roomStayCandidates = value;
    }

    /**
     * 获取acceptedPayments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentFormType }
     *     
     */
    public ArrayOfPaymentFormType getAcceptedPayments() {
        return acceptedPayments;
    }

    /**
     * 设置acceptedPayments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentFormType }
     *     
     */
    public void setAcceptedPayments(ArrayOfPaymentFormType value) {
        this.acceptedPayments = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Media }
     * 
     * 
     */
    public List<HotelSearchCriterionType.Media> getMedia() {
        if (media == null) {
            media = new ArrayList<HotelSearchCriterionType.Media>();
        }
        return this.media;
    }

    /**
     * 获取hotelMeetingFacility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchCriterionType.HotelMeetingFacility }
     *     
     */
    public HotelSearchCriterionType.HotelMeetingFacility getHotelMeetingFacility() {
        return hotelMeetingFacility;
    }

    /**
     * 设置hotelMeetingFacility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchCriterionType.HotelMeetingFacility }
     *     
     */
    public void setHotelMeetingFacility(HotelSearchCriterionType.HotelMeetingFacility value) {
        this.hotelMeetingFacility = value;
    }

    /**
     * 获取mealPlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchCriterionType.MealPlan }
     *     
     */
    public HotelSearchCriterionType.MealPlan getMealPlan() {
        return mealPlan;
    }

    /**
     * 设置mealPlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchCriterionType.MealPlan }
     *     
     */
    public void setMealPlan(HotelSearchCriterionType.MealPlan value) {
        this.mealPlan = value;
    }

    /**
     * 获取rebatePrograms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRebateType }
     *     
     */
    public ArrayOfRebateType getRebatePrograms() {
        return rebatePrograms;
    }

    /**
     * 设置rebatePrograms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRebateType }
     *     
     */
    public void setRebatePrograms(ArrayOfRebateType value) {
        this.rebatePrograms = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * 获取roomPrices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomPrice }
     *     
     */
    public ArrayOfRoomPrice getRoomPrices() {
        return roomPrices;
    }

    /**
     * 设置roomPrices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomPrice }
     *     
     */
    public void setRoomPrices(ArrayOfRoomPrice value) {
        this.roomPrices = value;
    }

    /**
     * 获取memberType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemberType() {
        return memberType;
    }

    /**
     * 设置memberType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemberType(Integer value) {
        this.memberType = value;
    }

    /**
     * 获取memberCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberCard() {
        return memberCard;
    }

    /**
     * 设置memberCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberCard(String value) {
        this.memberCard = value;
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
     *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Award {

        @XmlAttribute(name = "Provider")
        protected String provider;
        @XmlAttribute(name = "Rating")
        protected String rating;

        /**
         * 获取provider属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvider() {
            return provider;
        }

        /**
         * 设置provider属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * 获取rating属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRating() {
            return rating;
        }

        /**
         * 设置rating属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRating(String value) {
            this.rating = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ComplimentaryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelAmenity {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "ComplimentaryInd")
        protected Boolean complimentaryInd;

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * 获取complimentaryInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isComplimentaryInd() {
            return complimentaryInd;
        }

        /**
         * 设置complimentaryInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setComplimentaryInd(Boolean value) {
            this.complimentaryInd = value;
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
     *       &lt;attribute name="SecurityFeatureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AccessibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelFeature {

        @XmlAttribute(name = "SecurityFeatureCode")
        protected String securityFeatureCode;
        @XmlAttribute(name = "AccessibilityCode")
        protected String accessibilityCode;

        /**
         * 获取securityFeatureCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecurityFeatureCode() {
            return securityFeatureCode;
        }

        /**
         * 设置securityFeatureCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecurityFeatureCode(String value) {
            this.securityFeatureCode = value;
        }

        /**
         * 获取accessibilityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccessibilityCode() {
            return accessibilityCode;
        }

        /**
         * 设置accessibilityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccessibilityCode(String value) {
            this.accessibilityCode = value;
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
     *       &lt;attribute name="MeetingRoomCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="LargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="LargestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MeetingRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelMeetingFacility {

        @XmlAttribute(name = "MeetingRoomCount")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger meetingRoomCount;
        @XmlAttribute(name = "LargestSeatingCapacity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger largestSeatingCapacity;
        @XmlAttribute(name = "LargestRoomSpace")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger largestRoomSpace;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;
        @XmlAttribute(name = "MeetingRoomCode")
        protected String meetingRoomCode;

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
         * 获取meetingRoomCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeetingRoomCode() {
            return meetingRoomCode;
        }

        /**
         * 设置meetingRoomCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeetingRoomCode(String value) {
            this.meetingRoomCode = value;
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
     *       &lt;attribute name="Code"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MealPlan {

        @XmlAttribute(name = "Code")
        protected List<String> code;

        /**
         * Gets the value of the code property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the code property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCode() {
            if (code == null) {
                code = new ArrayList<String>();
            }
            return this.code;
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
     *       &lt;attribute name="ContentCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Media {

        @XmlAttribute(name = "ContentCode")
        protected String contentCode;

        /**
         * 获取contentCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContentCode() {
            return contentCode;
        }

        /**
         * 设置contentCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContentCode(String value) {
            this.contentCode = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RatePlanCandidatesType"&gt;
     *       &lt;attribute name="TaxesIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RatePlanCandidates
        extends RatePlanCandidatesType
    {

        @XmlAttribute(name = "TaxesIncludedInd")
        protected Boolean taxesIncludedInd;

        /**
         * 获取taxesIncludedInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTaxesIncludedInd() {
            return taxesIncludedInd;
        }

        /**
         * 设置taxesIncludedInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTaxesIncludedInd(Boolean value) {
            this.taxesIncludedInd = value;
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
     *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="RateMode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateRange {

        @XmlAttribute(name = "RoomStayCandidateRPH")
        protected String roomStayCandidateRPH;
        @XmlAttribute(name = "MinRate")
        protected BigDecimal minRate;
        @XmlAttribute(name = "MaxRate")
        protected BigDecimal maxRate;
        @XmlAttribute(name = "FixedRate")
        protected BigDecimal fixedRate;
        @XmlAttribute(name = "RateTimeUnit")
        protected TimeUnitType rateTimeUnit;
        @XmlAttribute(name = "RateMode")
        protected String rateMode;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;

        /**
         * 获取roomStayCandidateRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomStayCandidateRPH() {
            return roomStayCandidateRPH;
        }

        /**
         * 设置roomStayCandidateRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomStayCandidateRPH(String value) {
            this.roomStayCandidateRPH = value;
        }

        /**
         * 获取minRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinRate() {
            return minRate;
        }

        /**
         * 设置minRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinRate(BigDecimal value) {
            this.minRate = value;
        }

        /**
         * 获取maxRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxRate() {
            return maxRate;
        }

        /**
         * 设置maxRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxRate(BigDecimal value) {
            this.maxRate = value;
        }

        /**
         * 获取fixedRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFixedRate() {
            return fixedRate;
        }

        /**
         * 设置fixedRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFixedRate(BigDecimal value) {
            this.fixedRate = value;
        }

        /**
         * 获取rateTimeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getRateTimeUnit() {
            return rateTimeUnit;
        }

        /**
         * 设置rateTimeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setRateTimeUnit(TimeUnitType value) {
            this.rateTimeUnit = value;
        }

        /**
         * 获取rateMode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateMode() {
            return rateMode;
        }

        /**
         * 设置rateMode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateMode(String value) {
            this.rateMode = value;
        }

        /**
         * 获取currencyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * 设置currencyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Recreation {

        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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
     *       &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ServiceInventoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Service {

        @XmlAttribute(name = "BusinessServiceCode")
        protected String businessServiceCode;
        @XmlAttribute(name = "ServiceInventoryCode")
        protected String serviceInventoryCode;
        @XmlAttribute(name = "Quantity")
        protected BigInteger quantity;

        /**
         * 获取businessServiceCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessServiceCode() {
            return businessServiceCode;
        }

        /**
         * 设置businessServiceCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessServiceCode(String value) {
            this.businessServiceCode = value;
        }

        /**
         * 获取serviceInventoryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceInventoryCode() {
            return serviceInventoryCode;
        }

        /**
         * 设置serviceInventoryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceInventoryCode(String value) {
            this.serviceInventoryCode = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Transportation {

        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }

}
