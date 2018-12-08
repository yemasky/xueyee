package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>HotelSearchCriterionType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HotelSearchCriterionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ItemSearchCriterionType">
 *       &lt;sequence>
 *         &lt;element name="HotelAmenity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ComplimentaryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoomAmenity" type="{http://www.opentravel.org/OTA/2003/05}RoomAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelFeature" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SecurityFeatureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AccessibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Award" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Recreation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ServiceInventoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Transportation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StayDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="RateRange" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="RateMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RatePlanCandidates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RatePlanCandidatesType">
 *                 &lt;attribute name="TaxesIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/>
 *         &lt;element name="RoomStayCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStayCandidateType" minOccurs="0"/>
 *         &lt;element name="AcceptedPayments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPaymentFormType" minOccurs="0"/>
 *         &lt;element name="Media" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ContentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelMeetingFacility" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MeetingRoomCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="LargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="LargestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MeetingRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MealPlan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RebatePrograms" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRebateType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
        "tpaExtensions"
})
@XmlSeeAlso({
        pms.order.HotelSearchCriteriaType.Criterion.class
})
public class HotelSearchCriterionType
        extends ItemSearchCriterionType {

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

    /**
     * Gets the value of the hotelAmenity property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelAmenity property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelAmenity().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.HotelAmenity }
     */
    public List<HotelSearchCriterionType.HotelAmenity> getHotelAmenity() {
        if (hotelAmenity == null) {
            hotelAmenity = new ArrayList<HotelSearchCriterionType.HotelAmenity>();
        }
        return this.hotelAmenity;
    }

    /**
     * Gets the value of the roomAmenity property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomAmenity property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomAmenity().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomAmenityPrefType }
     */
    public List<RoomAmenityPrefType> getRoomAmenity() {
        if (roomAmenity == null) {
            roomAmenity = new ArrayList<RoomAmenityPrefType>();
        }
        return this.roomAmenity;
    }

    /**
     * Gets the value of the hotelFeature property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelFeature property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelFeature().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.HotelFeature }
     */
    public List<HotelSearchCriterionType.HotelFeature> getHotelFeature() {
        if (hotelFeature == null) {
            hotelFeature = new ArrayList<HotelSearchCriterionType.HotelFeature>();
        }
        return this.hotelFeature;
    }

    /**
     * Gets the value of the award property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Award }
     */
    public List<HotelSearchCriterionType.Award> getAward() {
        if (award == null) {
            award = new ArrayList<HotelSearchCriterionType.Award>();
        }
        return this.award;
    }

    /**
     * Gets the value of the recreation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recreation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecreation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Recreation }
     */
    public List<HotelSearchCriterionType.Recreation> getRecreation() {
        if (recreation == null) {
            recreation = new ArrayList<HotelSearchCriterionType.Recreation>();
        }
        return this.recreation;
    }

    /**
     * Gets the value of the service property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Service }
     */
    public List<HotelSearchCriterionType.Service> getService() {
        if (service == null) {
            service = new ArrayList<HotelSearchCriterionType.Service>();
        }
        return this.service;
    }

    /**
     * Gets the value of the transportation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Transportation }
     */
    public List<HotelSearchCriterionType.Transportation> getTransportation() {
        if (transportation == null) {
            transportation = new ArrayList<HotelSearchCriterionType.Transportation>();
        }
        return this.transportation;
    }

    /**
     * ��ȡstayDateRange���Ե�ֵ��
     *
     * @return possible object is
     * {@link DateTimeSpanType }
     */
    public DateTimeSpanType getStayDateRange() {
        return stayDateRange;
    }

    /**
     * ����stayDateRange���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DateTimeSpanType }
     */
    public void setStayDateRange(DateTimeSpanType value) {
        this.stayDateRange = value;
    }

    /**
     * Gets the value of the rateRange property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateRange property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateRange().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.RateRange }
     */
    public List<HotelSearchCriterionType.RateRange> getRateRange() {
        if (rateRange == null) {
            rateRange = new ArrayList<HotelSearchCriterionType.RateRange>();
        }
        return this.rateRange;
    }

    /**
     * ��ȡratePlanCandidates���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelSearchCriterionType.RatePlanCandidates }
     */
    public HotelSearchCriterionType.RatePlanCandidates getRatePlanCandidates() {
        return ratePlanCandidates;
    }

    /**
     * ����ratePlanCandidates���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelSearchCriterionType.RatePlanCandidates }
     */
    public void setRatePlanCandidates(HotelSearchCriterionType.RatePlanCandidates value) {
        this.ratePlanCandidates = value;
    }

    /**
     * ��ȡprofiles���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfProfilesTypeProfileInfo }
     */
    public ArrayOfProfilesTypeProfileInfo getProfiles() {
        return profiles;
    }

    /**
     * ����profiles���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfProfilesTypeProfileInfo }
     */
    public void setProfiles(ArrayOfProfilesTypeProfileInfo value) {
        this.profiles = value;
    }

    /**
     * ��ȡroomStayCandidates���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRoomStayCandidateType }
     */
    public ArrayOfRoomStayCandidateType getRoomStayCandidates() {
        return roomStayCandidates;
    }

    /**
     * ����roomStayCandidates���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRoomStayCandidateType }
     */
    public void setRoomStayCandidates(ArrayOfRoomStayCandidateType value) {
        this.roomStayCandidates = value;
    }

    /**
     * ��ȡacceptedPayments���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfPaymentFormType }
     */
    public ArrayOfPaymentFormType getAcceptedPayments() {
        return acceptedPayments;
    }

    /**
     * ����acceptedPayments���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfPaymentFormType }
     */
    public void setAcceptedPayments(ArrayOfPaymentFormType value) {
        this.acceptedPayments = value;
    }

    /**
     * Gets the value of the media property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Media }
     */
    public List<HotelSearchCriterionType.Media> getMedia() {
        if (media == null) {
            media = new ArrayList<HotelSearchCriterionType.Media>();
        }
        return this.media;
    }

    /**
     * ��ȡhotelMeetingFacility���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelSearchCriterionType.HotelMeetingFacility }
     */
    public HotelSearchCriterionType.HotelMeetingFacility getHotelMeetingFacility() {
        return hotelMeetingFacility;
    }

    /**
     * ����hotelMeetingFacility���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelSearchCriterionType.HotelMeetingFacility }
     */
    public void setHotelMeetingFacility(HotelSearchCriterionType.HotelMeetingFacility value) {
        this.hotelMeetingFacility = value;
    }

    /**
     * ��ȡmealPlan���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelSearchCriterionType.MealPlan }
     */
    public HotelSearchCriterionType.MealPlan getMealPlan() {
        return mealPlan;
    }

    /**
     * ����mealPlan���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelSearchCriterionType.MealPlan }
     */
    public void setMealPlan(HotelSearchCriterionType.MealPlan value) {
        this.mealPlan = value;
    }

    /**
     * ��ȡrebatePrograms���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRebateType }
     */
    public ArrayOfRebateType getRebatePrograms() {
        return rebatePrograms;
    }

    /**
     * ����rebatePrograms���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRebateType }
     */
    public void setRebatePrograms(ArrayOfRebateType value) {
        this.rebatePrograms = value;
    }

    /**
     * ��ȡtpaExtensions���Ե�ֵ��
     *
     * @return possible object is
     * {@link TPAExtensionsType }
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * ����tpaExtensions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TPAExtensionsType }
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Award {

        @XmlAttribute(name = "Provider")
        protected String provider;
        @XmlAttribute(name = "Rating")
        protected String rating;

        /**
         * ��ȡprovider���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getProvider() {
            return provider;
        }

        /**
         * ����provider���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * ��ȡrating���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRating() {
            return rating;
        }

        /**
         * ����rating���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRating(String value) {
            this.rating = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ComplimentaryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelAmenity {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "ComplimentaryInd")
        protected Boolean complimentaryInd;

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * ��ȡcomplimentaryInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isComplimentaryInd() {
            return complimentaryInd;
        }

        /**
         * ����complimentaryInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setComplimentaryInd(Boolean value) {
            this.complimentaryInd = value;
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
     *       &lt;attribute name="SecurityFeatureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AccessibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelFeature {

        @XmlAttribute(name = "SecurityFeatureCode")
        protected String securityFeatureCode;
        @XmlAttribute(name = "AccessibilityCode")
        protected String accessibilityCode;

        /**
         * ��ȡsecurityFeatureCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSecurityFeatureCode() {
            return securityFeatureCode;
        }

        /**
         * ����securityFeatureCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSecurityFeatureCode(String value) {
            this.securityFeatureCode = value;
        }

        /**
         * ��ȡaccessibilityCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAccessibilityCode() {
            return accessibilityCode;
        }

        /**
         * ����accessibilityCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAccessibilityCode(String value) {
            this.accessibilityCode = value;
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
     *       &lt;attribute name="MeetingRoomCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="LargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="LargestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MeetingRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡmeetingRoomCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMeetingRoomCode() {
            return meetingRoomCode;
        }

        /**
         * ����meetingRoomCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMeetingRoomCode(String value) {
            this.meetingRoomCode = value;
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
     *       &lt;attribute name="Code">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MealPlan {

        @XmlAttribute(name = "Code")
        protected List<String> code;

        /**
         * Gets the value of the code property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the code property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCode().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getCode() {
            if (code == null) {
                code = new ArrayList<String>();
            }
            return this.code;
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
     *       &lt;attribute name="ContentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Media {

        @XmlAttribute(name = "ContentCode")
        protected String contentCode;

        /**
         * ��ȡcontentCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getContentCode() {
            return contentCode;
        }

        /**
         * ����contentCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setContentCode(String value) {
            this.contentCode = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RatePlanCandidatesType">
     *       &lt;attribute name="TaxesIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RatePlanCandidates
            extends RatePlanCandidatesType {

        @XmlAttribute(name = "TaxesIncludedInd")
        protected Boolean taxesIncludedInd;

        /**
         * ��ȡtaxesIncludedInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isTaxesIncludedInd() {
            return taxesIncludedInd;
        }

        /**
         * ����taxesIncludedInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setTaxesIncludedInd(Boolean value) {
            this.taxesIncludedInd = value;
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
     *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="RateMode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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

        /**
         * ��ȡroomStayCandidateRPH���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRoomStayCandidateRPH() {
            return roomStayCandidateRPH;
        }

        /**
         * ����roomStayCandidateRPH���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRoomStayCandidateRPH(String value) {
            this.roomStayCandidateRPH = value;
        }

        /**
         * ��ȡminRate���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getMinRate() {
            return minRate;
        }

        /**
         * ����minRate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setMinRate(BigDecimal value) {
            this.minRate = value;
        }

        /**
         * ��ȡmaxRate���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getMaxRate() {
            return maxRate;
        }

        /**
         * ����maxRate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setMaxRate(BigDecimal value) {
            this.maxRate = value;
        }

        /**
         * ��ȡfixedRate���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getFixedRate() {
            return fixedRate;
        }

        /**
         * ����fixedRate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setFixedRate(BigDecimal value) {
            this.fixedRate = value;
        }

        /**
         * ��ȡrateTimeUnit���Ե�ֵ��
         *
         * @return possible object is
         * {@link TimeUnitType }
         */
        public TimeUnitType getRateTimeUnit() {
            return rateTimeUnit;
        }

        /**
         * ����rateTimeUnit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TimeUnitType }
         */
        public void setRateTimeUnit(TimeUnitType value) {
            this.rateTimeUnit = value;
        }

        /**
         * ��ȡrateMode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRateMode() {
            return rateMode;
        }

        /**
         * ����rateMode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRateMode(String value) {
            this.rateMode = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Recreation {

        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
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
     *       &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ServiceInventoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡbusinessServiceCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBusinessServiceCode() {
            return businessServiceCode;
        }

        /**
         * ����businessServiceCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBusinessServiceCode(String value) {
            this.businessServiceCode = value;
        }

        /**
         * ��ȡserviceInventoryCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getServiceInventoryCode() {
            return serviceInventoryCode;
        }

        /**
         * ����serviceInventoryCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setServiceInventoryCode(String value) {
            this.serviceInventoryCode = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Transportation {

        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
        }

    }

}
