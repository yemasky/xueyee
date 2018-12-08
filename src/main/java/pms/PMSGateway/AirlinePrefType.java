package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>AirlinePrefType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="AirlinePrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPref" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VendorPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNamePrefType">
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentFormPref" type="{http://www.opentravel.org/OTA/2003/05}PaymentFormPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirportOriginPref" type="{http://www.opentravel.org/OTA/2003/05}AirportPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirportDestinationPref" type="{http://www.opentravel.org/OTA/2003/05}AirportPrefType" minOccurs="0"/>
 *         &lt;element name="AirportRoutePref" type="{http://www.opentravel.org/OTA/2003/05}AirportPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareRestrictPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FareRestriction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FarePref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AirlineVendorPrefRPH">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="RateCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TourCodePref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="StaffTourCodeInfo" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="StaffType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Current"/>
 *                                   &lt;enumeration value="Duty"/>
 *                                   &lt;enumeration value="CabinCrew"/>
 *                                   &lt;enumeration value="Retired"/>
 *                                   &lt;enumeration value="TechCrew"/>
 *                                   &lt;enumeration value="UnaccompaniedFamilyMember"/>
 *                                   &lt;enumeration value="OtherAirlinePersonnel"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="TourCodeInfo" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="TourTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="YearNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                             &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="PromotionVendorCode">
 *                               &lt;simpleType>
 *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="PartyID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AirlineVendorPrefRPH">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightTypePref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FlightType" type="{http://www.opentravel.org/OTA/2003/05}FlightTypeType" />
 *                 &lt;attribute name="MaxConnections" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="NonScheduledFltInfo">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="ChartersOnly"/>
 *                       &lt;enumeration value="ExcludeCharters"/>
 *                       &lt;enumeration value="All"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BackhaulIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GroundTransportIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="DirectAndNonStopOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonStopsOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="OnlineConnectionsOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RoutingType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Normal"/>
 *                       &lt;enumeration value="Mirror"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ExcludeTrainInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EquipPref" type="{http://www.opentravel.org/OTA/2003/05}EquipmentTypePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CabinPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SeatPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FlightDistanceQualifier">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="LongHaul"/>
 *                       &lt;enumeration value="ShortHaul"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InternationalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AirlineVendorPrefRPH">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketDistribPref" type="{http://www.opentravel.org/OTA/2003/05}TicketDistribPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://www.opentravel.org/OTA/2003/05}MealPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://www.opentravel.org/OTA/2003/05}SpecRequestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SSR_Pref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SSR_Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="DefaultStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LookupKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AirlineVendorPrefRPH">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="TransferActionType" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *         &lt;element name="MediaEntertainPref" type="{http://www.opentravel.org/OTA/2003/05}MediaEntertainPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PetInfoPref" type="{http://www.opentravel.org/OTA/2003/05}PetInfoPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccountInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxRegistrationDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RecipientName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RecipientAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CostCenter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CompanyNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ClientReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OSI_Pref" type="{http://www.opentravel.org/OTA/2003/05}OtherServiceInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KeywordPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="AirlineVendorRPH">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AirTicketType" type="{http://www.opentravel.org/OTA/2003/05}TicketType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlinePrefType", propOrder = {
        "loyaltyPref",
        "vendorPref",
        "paymentFormPref",
        "airportOriginPref",
        "airportDestinationPref",
        "airportRoutePref",
        "fareRestrictPref",
        "farePref",
        "tourCodePref",
        "flightTypePref",
        "equipPref",
        "cabinPref",
        "seatPref",
        "ticketDistribPref",
        "mealPref",
        "specRequestPref",
        "ssrPref",
        "tpaExtensions",
        "mediaEntertainPref",
        "petInfoPref",
        "accountInformation",
        "osiPref",
        "keywordPref"
})
public class AirlinePrefType {

    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPrefType> loyaltyPref;
    @XmlElement(name = "VendorPref")
    protected List<AirlinePrefType.VendorPref> vendorPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPrefType> paymentFormPref;
    @XmlElement(name = "AirportOriginPref")
    protected List<AirportPrefType> airportOriginPref;
    @XmlElement(name = "AirportDestinationPref")
    protected AirportPrefType airportDestinationPref;
    @XmlElement(name = "AirportRoutePref")
    protected List<AirportPrefType> airportRoutePref;
    @XmlElement(name = "FareRestrictPref")
    protected List<AirlinePrefType.FareRestrictPref> fareRestrictPref;
    @XmlElement(name = "FarePref")
    protected List<AirlinePrefType.FarePref> farePref;
    @XmlElement(name = "TourCodePref")
    protected List<AirlinePrefType.TourCodePref> tourCodePref;
    @XmlElement(name = "FlightTypePref")
    protected List<AirlinePrefType.FlightTypePref> flightTypePref;
    @XmlElement(name = "EquipPref")
    protected List<EquipmentTypePref> equipPref;
    @XmlElement(name = "CabinPref")
    protected List<AirlinePrefType.CabinPref> cabinPref;
    @XmlElement(name = "SeatPref")
    protected List<AirlinePrefType.SeatPref> seatPref;
    @XmlElement(name = "TicketDistribPref")
    protected List<TicketDistribPrefType> ticketDistribPref;
    @XmlElement(name = "MealPref")
    protected List<MealPrefType> mealPref;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPrefType> specRequestPref;
    @XmlElement(name = "SSR_Pref")
    protected List<AirlinePrefType.SSRPref> ssrPref;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "MediaEntertainPref")
    protected List<MediaEntertainPrefType> mediaEntertainPref;
    @XmlElement(name = "PetInfoPref")
    protected List<PetInfoPrefType> petInfoPref;
    @XmlElement(name = "AccountInformation")
    protected AirlinePrefType.AccountInformation accountInformation;
    @XmlElement(name = "OSI_Pref")
    protected List<OtherServiceInfoType> osiPref;
    @XmlElement(name = "KeywordPref")
    protected List<AirlinePrefType.KeywordPref> keywordPref;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "AirTicketType")
    protected TicketType airTicketType;

    /**
     * Gets the value of the loyaltyPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPrefType }
     */
    public List<LoyaltyPrefType> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPrefType>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the vendorPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.VendorPref }
     */
    public List<AirlinePrefType.VendorPref> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<AirlinePrefType.VendorPref>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormPrefType }
     */
    public List<PaymentFormPrefType> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPrefType>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the airportOriginPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportOriginPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportOriginPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportPrefType }
     */
    public List<AirportPrefType> getAirportOriginPref() {
        if (airportOriginPref == null) {
            airportOriginPref = new ArrayList<AirportPrefType>();
        }
        return this.airportOriginPref;
    }

    /**
     * ��ȡairportDestinationPref���Ե�ֵ��
     *
     * @return possible object is
     * {@link AirportPrefType }
     */
    public AirportPrefType getAirportDestinationPref() {
        return airportDestinationPref;
    }

    /**
     * ����airportDestinationPref���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AirportPrefType }
     */
    public void setAirportDestinationPref(AirportPrefType value) {
        this.airportDestinationPref = value;
    }

    /**
     * Gets the value of the airportRoutePref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportRoutePref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportRoutePref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportPrefType }
     */
    public List<AirportPrefType> getAirportRoutePref() {
        if (airportRoutePref == null) {
            airportRoutePref = new ArrayList<AirportPrefType>();
        }
        return this.airportRoutePref;
    }

    /**
     * Gets the value of the fareRestrictPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestrictPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRestrictPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.FareRestrictPref }
     */
    public List<AirlinePrefType.FareRestrictPref> getFareRestrictPref() {
        if (fareRestrictPref == null) {
            fareRestrictPref = new ArrayList<AirlinePrefType.FareRestrictPref>();
        }
        return this.fareRestrictPref;
    }

    /**
     * Gets the value of the farePref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farePref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarePref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.FarePref }
     */
    public List<AirlinePrefType.FarePref> getFarePref() {
        if (farePref == null) {
            farePref = new ArrayList<AirlinePrefType.FarePref>();
        }
        return this.farePref;
    }

    /**
     * Gets the value of the tourCodePref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourCodePref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourCodePref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.TourCodePref }
     */
    public List<AirlinePrefType.TourCodePref> getTourCodePref() {
        if (tourCodePref == null) {
            tourCodePref = new ArrayList<AirlinePrefType.TourCodePref>();
        }
        return this.tourCodePref;
    }

    /**
     * Gets the value of the flightTypePref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightTypePref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightTypePref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.FlightTypePref }
     */
    public List<AirlinePrefType.FlightTypePref> getFlightTypePref() {
        if (flightTypePref == null) {
            flightTypePref = new ArrayList<AirlinePrefType.FlightTypePref>();
        }
        return this.flightTypePref;
    }

    /**
     * Gets the value of the equipPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentTypePref }
     */
    public List<EquipmentTypePref> getEquipPref() {
        if (equipPref == null) {
            equipPref = new ArrayList<EquipmentTypePref>();
        }
        return this.equipPref;
    }

    /**
     * Gets the value of the cabinPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.CabinPref }
     */
    public List<AirlinePrefType.CabinPref> getCabinPref() {
        if (cabinPref == null) {
            cabinPref = new ArrayList<AirlinePrefType.CabinPref>();
        }
        return this.cabinPref;
    }

    /**
     * Gets the value of the seatPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.SeatPref }
     */
    public List<AirlinePrefType.SeatPref> getSeatPref() {
        if (seatPref == null) {
            seatPref = new ArrayList<AirlinePrefType.SeatPref>();
        }
        return this.seatPref;
    }

    /**
     * Gets the value of the ticketDistribPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDistribPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDistribPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDistribPrefType }
     */
    public List<TicketDistribPrefType> getTicketDistribPref() {
        if (ticketDistribPref == null) {
            ticketDistribPref = new ArrayList<TicketDistribPrefType>();
        }
        return this.ticketDistribPref;
    }

    /**
     * Gets the value of the mealPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link MealPrefType }
     */
    public List<MealPrefType> getMealPref() {
        if (mealPref == null) {
            mealPref = new ArrayList<MealPrefType>();
        }
        return this.mealPref;
    }

    /**
     * Gets the value of the specRequestPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specRequestPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecRequestPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecRequestPrefType }
     */
    public List<SpecRequestPrefType> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPrefType>();
        }
        return this.specRequestPref;
    }

    /**
     * Gets the value of the ssrPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.SSRPref }
     */
    public List<AirlinePrefType.SSRPref> getSSRPref() {
        if (ssrPref == null) {
            ssrPref = new ArrayList<AirlinePrefType.SSRPref>();
        }
        return this.ssrPref;
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
     * Gets the value of the mediaEntertainPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaEntertainPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaEntertainPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaEntertainPrefType }
     */
    public List<MediaEntertainPrefType> getMediaEntertainPref() {
        if (mediaEntertainPref == null) {
            mediaEntertainPref = new ArrayList<MediaEntertainPrefType>();
        }
        return this.mediaEntertainPref;
    }

    /**
     * Gets the value of the petInfoPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petInfoPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetInfoPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PetInfoPrefType }
     */
    public List<PetInfoPrefType> getPetInfoPref() {
        if (petInfoPref == null) {
            petInfoPref = new ArrayList<PetInfoPrefType>();
        }
        return this.petInfoPref;
    }

    /**
     * ��ȡaccountInformation���Ե�ֵ��
     *
     * @return possible object is
     * {@link AirlinePrefType.AccountInformation }
     */
    public AirlinePrefType.AccountInformation getAccountInformation() {
        return accountInformation;
    }

    /**
     * ����accountInformation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AirlinePrefType.AccountInformation }
     */
    public void setAccountInformation(AirlinePrefType.AccountInformation value) {
        this.accountInformation = value;
    }

    /**
     * Gets the value of the osiPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osiPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOSIPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherServiceInfoType }
     */
    public List<OtherServiceInfoType> getOSIPref() {
        if (osiPref == null) {
            osiPref = new ArrayList<OtherServiceInfoType>();
        }
        return this.osiPref;
    }

    /**
     * Gets the value of the keywordPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePrefType.KeywordPref }
     */
    public List<AirlinePrefType.KeywordPref> getKeywordPref() {
        if (keywordPref == null) {
            keywordPref = new ArrayList<AirlinePrefType.KeywordPref>();
        }
        return this.keywordPref;
    }

    /**
     * ��ȡshareSynchInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * ����shareSynchInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * ��ȡshareMarketInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * ����shareMarketInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * ��ȡpreferLevel���Ե�ֵ��
     *
     * @return possible object is
     * {@link PreferLevelType }
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * ����preferLevel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PreferLevelType }
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    /**
     * ��ȡsmokingAllowed���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * ����smokingAllowed���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * ��ȡpassengerTypeCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * ����passengerTypeCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * ��ȡairTicketType���Ե�ֵ��
     *
     * @return possible object is
     * {@link TicketType }
     */
    public TicketType getAirTicketType() {
        return airTicketType;
    }

    /**
     * ����airTicketType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TicketType }
     */
    public void setAirTicketType(TicketType value) {
        this.airTicketType = value;
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
     *         &lt;element name="TaxRegistrationDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RecipientName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RecipientAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CostCenter" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CompanyNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ClientReference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "taxRegistrationDetails"
    })
    public static class AccountInformation {

        @XmlElement(name = "TaxRegistrationDetails")
        protected AirlinePrefType.AccountInformation.TaxRegistrationDetails taxRegistrationDetails;
        @XmlAttribute(name = "Number")
        protected String number;
        @XmlAttribute(name = "CostCenter")
        protected String costCenter;
        @XmlAttribute(name = "CompanyNumber")
        protected String companyNumber;
        @XmlAttribute(name = "ClientReference")
        protected String clientReference;

        /**
         * ��ȡtaxRegistrationDetails���Ե�ֵ��
         *
         * @return possible object is
         * {@link AirlinePrefType.AccountInformation.TaxRegistrationDetails }
         */
        public AirlinePrefType.AccountInformation.TaxRegistrationDetails getTaxRegistrationDetails() {
            return taxRegistrationDetails;
        }

        /**
         * ����taxRegistrationDetails���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AirlinePrefType.AccountInformation.TaxRegistrationDetails }
         */
        public void setTaxRegistrationDetails(AirlinePrefType.AccountInformation.TaxRegistrationDetails value) {
            this.taxRegistrationDetails = value;
        }

        /**
         * ��ȡnumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getNumber() {
            return number;
        }

        /**
         * ����number���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * ��ȡcostCenter���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCostCenter() {
            return costCenter;
        }

        /**
         * ����costCenter���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCostCenter(String value) {
            this.costCenter = value;
        }

        /**
         * ��ȡcompanyNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCompanyNumber() {
            return companyNumber;
        }

        /**
         * ����companyNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCompanyNumber(String value) {
            this.companyNumber = value;
        }

        /**
         * ��ȡclientReference���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getClientReference() {
            return clientReference;
        }

        /**
         * ����clientReference���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setClientReference(String value) {
            this.clientReference = value;
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
         *       &lt;attribute name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RecipientName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RecipientAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TaxRegistrationDetails {

            @XmlAttribute(name = "TaxID")
            protected String taxID;
            @XmlAttribute(name = "RecipientName")
            protected String recipientName;
            @XmlAttribute(name = "RecipientAddress")
            protected String recipientAddress;

            /**
             * ��ȡtaxID���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getTaxID() {
                return taxID;
            }

            /**
             * ����taxID���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTaxID(String value) {
                this.taxID = value;
            }

            /**
             * ��ȡrecipientName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getRecipientName() {
                return recipientName;
            }

            /**
             * ����recipientName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRecipientName(String value) {
                this.recipientName = value;
            }

            /**
             * ��ȡrecipientAddress���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getRecipientAddress() {
                return recipientAddress;
            }

            /**
             * ����recipientAddress���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRecipientAddress(String value) {
                this.recipientAddress = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinPref {

        @XmlAttribute(name = "Cabin")
        protected CabinType cabin;

        /**
         * ��ȡcabin���Ե�ֵ��
         *
         * @return possible object is
         * {@link CabinType }
         */
        public CabinType getCabin() {
            return cabin;
        }

        /**
         * ����cabin���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CabinType }
         */
        public void setCabin(CabinType value) {
            this.cabin = value;
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
     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AirlineVendorPrefRPH">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="RateCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FarePref {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "AirlineVendorPrefRPH")
        protected List<String> airlineVendorPrefRPH;
        @XmlAttribute(name = "RateCategoryCode")
        protected String rateCategoryCode;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

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
         * ��ȡdescription���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the airlineVendorPrefRPH property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineVendorPrefRPH property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineVendorPrefRPH().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        /**
         * ��ȡrateCategoryCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRateCategoryCode() {
            return rateCategoryCode;
        }

        /**
         * ����rateCategoryCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRateCategoryCode(String value) {
            this.rateCategoryCode = value;
        }

        /**
         * ��ȡtransferAction���Ե�ֵ��
         *
         * @return possible object is
         * {@link TransferActionType }
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * ����transferAction���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TransferActionType }
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
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
     *       &lt;attribute name="FareRestriction" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FareRestrictPref {

        @XmlAttribute(name = "FareRestriction")
        protected String fareRestriction;
        @XmlAttribute(name = "Date")
        protected String date;

        /**
         * ��ȡfareRestriction���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getFareRestriction() {
            return fareRestriction;
        }

        /**
         * ����fareRestriction���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setFareRestriction(String value) {
            this.fareRestriction = value;
        }

        /**
         * ��ȡdate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDate() {
            return date;
        }

        /**
         * ����date���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDate(String value) {
            this.date = value;
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
     *       &lt;attribute name="FlightType" type="{http://www.opentravel.org/OTA/2003/05}FlightTypeType" />
     *       &lt;attribute name="MaxConnections" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="NonScheduledFltInfo">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="ChartersOnly"/>
     *             &lt;enumeration value="ExcludeCharters"/>
     *             &lt;enumeration value="All"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="BackhaulIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GroundTransportIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="DirectAndNonStopOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonStopsOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="OnlineConnectionsOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RoutingType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Normal"/>
     *             &lt;enumeration value="Mirror"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ExcludeTrainInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightTypePref {

        @XmlAttribute(name = "FlightType")
        protected FlightTypeType flightType;
        @XmlAttribute(name = "MaxConnections")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxConnections;
        @XmlAttribute(name = "NonScheduledFltInfo")
        protected String nonScheduledFltInfo;
        @XmlAttribute(name = "BackhaulIndicator")
        protected Boolean backhaulIndicator;
        @XmlAttribute(name = "GroundTransportIndicator")
        protected Boolean groundTransportIndicator;
        @XmlAttribute(name = "DirectAndNonStopOnlyInd")
        protected Boolean directAndNonStopOnlyInd;
        @XmlAttribute(name = "NonStopsOnlyInd")
        protected Boolean nonStopsOnlyInd;
        @XmlAttribute(name = "OnlineConnectionsOnlyInd")
        protected Boolean onlineConnectionsOnlyInd;
        @XmlAttribute(name = "RoutingType")
        protected String routingType;
        @XmlAttribute(name = "ExcludeTrainInd")
        protected Boolean excludeTrainInd;

        /**
         * ��ȡflightType���Ե�ֵ��
         *
         * @return possible object is
         * {@link FlightTypeType }
         */
        public FlightTypeType getFlightType() {
            return flightType;
        }

        /**
         * ����flightType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link FlightTypeType }
         */
        public void setFlightType(FlightTypeType value) {
            this.flightType = value;
        }

        /**
         * ��ȡmaxConnections���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxConnections() {
            return maxConnections;
        }

        /**
         * ����maxConnections���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxConnections(BigInteger value) {
            this.maxConnections = value;
        }

        /**
         * ��ȡnonScheduledFltInfo���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getNonScheduledFltInfo() {
            return nonScheduledFltInfo;
        }

        /**
         * ����nonScheduledFltInfo���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNonScheduledFltInfo(String value) {
            this.nonScheduledFltInfo = value;
        }

        /**
         * ��ȡbackhaulIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isBackhaulIndicator() {
            return backhaulIndicator;
        }

        /**
         * ����backhaulIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setBackhaulIndicator(Boolean value) {
            this.backhaulIndicator = value;
        }

        /**
         * ��ȡgroundTransportIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isGroundTransportIndicator() {
            return groundTransportIndicator;
        }

        /**
         * ����groundTransportIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setGroundTransportIndicator(Boolean value) {
            this.groundTransportIndicator = value;
        }

        /**
         * ��ȡdirectAndNonStopOnlyInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isDirectAndNonStopOnlyInd() {
            return directAndNonStopOnlyInd;
        }

        /**
         * ����directAndNonStopOnlyInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setDirectAndNonStopOnlyInd(Boolean value) {
            this.directAndNonStopOnlyInd = value;
        }

        /**
         * ��ȡnonStopsOnlyInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isNonStopsOnlyInd() {
            return nonStopsOnlyInd;
        }

        /**
         * ����nonStopsOnlyInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setNonStopsOnlyInd(Boolean value) {
            this.nonStopsOnlyInd = value;
        }

        /**
         * ��ȡonlineConnectionsOnlyInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isOnlineConnectionsOnlyInd() {
            return onlineConnectionsOnlyInd;
        }

        /**
         * ����onlineConnectionsOnlyInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setOnlineConnectionsOnlyInd(Boolean value) {
            this.onlineConnectionsOnlyInd = value;
        }

        /**
         * ��ȡroutingType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRoutingType() {
            return routingType;
        }

        /**
         * ����routingType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRoutingType(String value) {
            this.routingType = value;
        }

        /**
         * ��ȡexcludeTrainInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isExcludeTrainInd() {
            return excludeTrainInd;
        }

        /**
         * ����excludeTrainInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setExcludeTrainInd(Boolean value) {
            this.excludeTrainInd = value;
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
     *       &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="AirlineVendorRPH">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class KeywordPref {

        @XmlAttribute(name = "VendorCode")
        protected String vendorCode;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "Keyword")
        protected String keyword;
        @XmlAttribute(name = "StatusCode")
        protected String statusCode;
        @XmlAttribute(name = "NumberInParty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger numberInParty;
        @XmlAttribute(name = "AirlineVendorRPH")
        protected List<String> airlineVendorRPH;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

        /**
         * ��ȡvendorCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVendorCode() {
            return vendorCode;
        }

        /**
         * ����vendorCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        /**
         * ��ȡdescription���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * ��ȡkeyword���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getKeyword() {
            return keyword;
        }

        /**
         * ����keyword���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setKeyword(String value) {
            this.keyword = value;
        }

        /**
         * ��ȡstatusCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStatusCode() {
            return statusCode;
        }

        /**
         * ����statusCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStatusCode(String value) {
            this.statusCode = value;
        }

        /**
         * ��ȡnumberInParty���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getNumberInParty() {
            return numberInParty;
        }

        /**
         * ����numberInParty���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setNumberInParty(BigInteger value) {
            this.numberInParty = value;
        }

        /**
         * Gets the value of the airlineVendorRPH property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineVendorRPH property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineVendorRPH().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getAirlineVendorRPH() {
            if (airlineVendorRPH == null) {
                airlineVendorRPH = new ArrayList<String>();
            }
            return this.airlineVendorRPH;
        }

        /**
         * ��ȡtransferAction���Ե�ֵ��
         *
         * @return possible object is
         * {@link TransferActionType }
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * ����transferAction���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TransferActionType }
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
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
     *       &lt;attribute name="SSR_Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="DefaultStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LookupKey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AirlineVendorPrefRPH">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="TransferActionType" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SSRPref {

        @XmlAttribute(name = "SSR_Code")
        protected String ssrCode;
        @XmlAttribute(name = "VendorCode")
        protected String vendorCode;
        @XmlAttribute(name = "NumberInParty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger numberInParty;
        @XmlAttribute(name = "DefaultStatusCode")
        protected String defaultStatusCode;
        @XmlAttribute(name = "Remark")
        protected String remark;
        @XmlAttribute(name = "LookupKey")
        protected String lookupKey;
        @XmlAttribute(name = "AirlineVendorPrefRPH")
        protected List<String> airlineVendorPrefRPH;
        @XmlAttribute(name = "TransferActionType")
        protected TransferActionType transferActionType;

        /**
         * ��ȡssrCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSSRCode() {
            return ssrCode;
        }

        /**
         * ����ssrCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSSRCode(String value) {
            this.ssrCode = value;
        }

        /**
         * ��ȡvendorCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVendorCode() {
            return vendorCode;
        }

        /**
         * ����vendorCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        /**
         * ��ȡnumberInParty���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getNumberInParty() {
            return numberInParty;
        }

        /**
         * ����numberInParty���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setNumberInParty(BigInteger value) {
            this.numberInParty = value;
        }

        /**
         * ��ȡdefaultStatusCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDefaultStatusCode() {
            return defaultStatusCode;
        }

        /**
         * ����defaultStatusCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDefaultStatusCode(String value) {
            this.defaultStatusCode = value;
        }

        /**
         * ��ȡremark���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRemark() {
            return remark;
        }

        /**
         * ����remark���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRemark(String value) {
            this.remark = value;
        }

        /**
         * ��ȡlookupKey���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLookupKey() {
            return lookupKey;
        }

        /**
         * ����lookupKey���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLookupKey(String value) {
            this.lookupKey = value;
        }

        /**
         * Gets the value of the airlineVendorPrefRPH property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineVendorPrefRPH property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineVendorPrefRPH().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        /**
         * ��ȡtransferActionType���Ե�ֵ��
         *
         * @return possible object is
         * {@link TransferActionType }
         */
        public TransferActionType getTransferActionType() {
            return transferActionType;
        }

        /**
         * ����transferActionType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TransferActionType }
         */
        public void setTransferActionType(TransferActionType value) {
            this.transferActionType = value;
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
     *       &lt;attribute name="FlightDistanceQualifier">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="LongHaul"/>
     *             &lt;enumeration value="ShortHaul"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InternationalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AirlineVendorPrefRPH">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SeatPref {

        @XmlAttribute(name = "FlightDistanceQualifier")
        protected String flightDistanceQualifier;
        @XmlAttribute(name = "InternationalIndicator")
        protected Boolean internationalIndicator;
        @XmlAttribute(name = "AirlineVendorPrefRPH")
        protected List<String> airlineVendorPrefRPH;
        @XmlAttribute(name = "PassengerTypeCode")
        protected String passengerTypeCode;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

        /**
         * ��ȡflightDistanceQualifier���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getFlightDistanceQualifier() {
            return flightDistanceQualifier;
        }

        /**
         * ����flightDistanceQualifier���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setFlightDistanceQualifier(String value) {
            this.flightDistanceQualifier = value;
        }

        /**
         * ��ȡinternationalIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isInternationalIndicator() {
            return internationalIndicator;
        }

        /**
         * ����internationalIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setInternationalIndicator(Boolean value) {
            this.internationalIndicator = value;
        }

        /**
         * Gets the value of the airlineVendorPrefRPH property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineVendorPrefRPH property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineVendorPrefRPH().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        /**
         * ��ȡpassengerTypeCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPassengerTypeCode() {
            return passengerTypeCode;
        }

        /**
         * ����passengerTypeCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPassengerTypeCode(String value) {
            this.passengerTypeCode = value;
        }

        /**
         * ��ȡtransferAction���Ե�ֵ��
         *
         * @return possible object is
         * {@link TransferActionType }
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * ����transferAction���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TransferActionType }
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
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
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="StaffTourCodeInfo" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="StaffType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Current"/>
     *                         &lt;enumeration value="Duty"/>
     *                         &lt;enumeration value="CabinCrew"/>
     *                         &lt;enumeration value="Retired"/>
     *                         &lt;enumeration value="TechCrew"/>
     *                         &lt;enumeration value="UnaccompaniedFamilyMember"/>
     *                         &lt;enumeration value="OtherAirlinePersonnel"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="TourCodeInfo" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="TourTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="YearNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                   &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="PromotionVendorCode">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="PartyID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AirlineVendorPrefRPH">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "staffTourCodeInfo",
            "tourCodeInfo"
    })
    public static class TourCodePref {

        @XmlElement(name = "StaffTourCodeInfo")
        protected AirlinePrefType.TourCodePref.StaffTourCodeInfo staffTourCodeInfo;
        @XmlElement(name = "TourCodeInfo")
        protected AirlinePrefType.TourCodePref.TourCodeInfo tourCodeInfo;
        @XmlAttribute(name = "PassengerTypeCode")
        protected String passengerTypeCode;
        @XmlAttribute(name = "AirlineVendorPrefRPH")
        protected List<String> airlineVendorPrefRPH;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

        /**
         * ��ȡstaffTourCodeInfo���Ե�ֵ��
         *
         * @return possible object is
         * {@link AirlinePrefType.TourCodePref.StaffTourCodeInfo }
         */
        public AirlinePrefType.TourCodePref.StaffTourCodeInfo getStaffTourCodeInfo() {
            return staffTourCodeInfo;
        }

        /**
         * ����staffTourCodeInfo���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AirlinePrefType.TourCodePref.StaffTourCodeInfo }
         */
        public void setStaffTourCodeInfo(AirlinePrefType.TourCodePref.StaffTourCodeInfo value) {
            this.staffTourCodeInfo = value;
        }

        /**
         * ��ȡtourCodeInfo���Ե�ֵ��
         *
         * @return possible object is
         * {@link AirlinePrefType.TourCodePref.TourCodeInfo }
         */
        public AirlinePrefType.TourCodePref.TourCodeInfo getTourCodeInfo() {
            return tourCodeInfo;
        }

        /**
         * ����tourCodeInfo���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AirlinePrefType.TourCodePref.TourCodeInfo }
         */
        public void setTourCodeInfo(AirlinePrefType.TourCodePref.TourCodeInfo value) {
            this.tourCodeInfo = value;
        }

        /**
         * ��ȡpassengerTypeCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPassengerTypeCode() {
            return passengerTypeCode;
        }

        /**
         * ����passengerTypeCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPassengerTypeCode(String value) {
            this.passengerTypeCode = value;
        }

        /**
         * Gets the value of the airlineVendorPrefRPH property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineVendorPrefRPH property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineVendorPrefRPH().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        /**
         * ��ȡtransferAction���Ե�ֵ��
         *
         * @return possible object is
         * {@link TransferActionType }
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * ����transferAction���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TransferActionType }
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
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
         *       &lt;attribute name="StaffType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Current"/>
         *             &lt;enumeration value="Duty"/>
         *             &lt;enumeration value="CabinCrew"/>
         *             &lt;enumeration value="Retired"/>
         *             &lt;enumeration value="TechCrew"/>
         *             &lt;enumeration value="UnaccompaniedFamilyMember"/>
         *             &lt;enumeration value="OtherAirlinePersonnel"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StaffTourCodeInfo {

            @XmlAttribute(name = "StaffType")
            protected String staffType;
            @XmlAttribute(name = "EmployeeID")
            protected String employeeID;
            @XmlAttribute(name = "VendorCode")
            protected String vendorCode;
            @XmlAttribute(name = "Description")
            protected String description;

            /**
             * ��ȡstaffType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getStaffType() {
                return staffType;
            }

            /**
             * ����staffType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setStaffType(String value) {
                this.staffType = value;
            }

            /**
             * ��ȡemployeeID���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getEmployeeID() {
                return employeeID;
            }

            /**
             * ����employeeID���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setEmployeeID(String value) {
                this.employeeID = value;
            }

            /**
             * ��ȡvendorCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getVendorCode() {
                return vendorCode;
            }

            /**
             * ����vendorCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVendorCode(String value) {
                this.vendorCode = value;
            }

            /**
             * ��ȡdescription���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getDescription() {
                return description;
            }

            /**
             * ����description���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDescription(String value) {
                this.description = value;
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
         *       &lt;attribute name="TourTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="YearNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PromotionVendorCode">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="PartyID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TourCodeInfo {

            @XmlAttribute(name = "TourTypeCode")
            protected String tourTypeCode;
            @XmlAttribute(name = "YearNum")
            protected BigInteger yearNum;
            @XmlAttribute(name = "PromotionCode")
            protected String promotionCode;
            @XmlAttribute(name = "PromotionVendorCode")
            protected List<String> promotionVendorCode;
            @XmlAttribute(name = "PartyID")
            protected String partyID;

            /**
             * ��ȡtourTypeCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getTourTypeCode() {
                return tourTypeCode;
            }

            /**
             * ����tourTypeCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTourTypeCode(String value) {
                this.tourTypeCode = value;
            }

            /**
             * ��ȡyearNum���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getYearNum() {
                return yearNum;
            }

            /**
             * ����yearNum���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setYearNum(BigInteger value) {
                this.yearNum = value;
            }

            /**
             * ��ȡpromotionCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getPromotionCode() {
                return promotionCode;
            }

            /**
             * ����promotionCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPromotionCode(String value) {
                this.promotionCode = value;
            }

            /**
             * Gets the value of the promotionVendorCode property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPromotionVendorCode().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getPromotionVendorCode() {
                if (promotionVendorCode == null) {
                    promotionVendorCode = new ArrayList<String>();
                }
                return this.promotionVendorCode;
            }

            /**
             * ��ȡpartyID���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getPartyID() {
                return partyID;
            }

            /**
             * ����partyID���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPartyID(String value) {
                this.partyID = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNamePrefType">
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VendorPref
            extends CompanyNamePrefType {

        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * ��ȡrph���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRPH() {
            return rph;
        }

        /**
         * ����rph���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRPH(String value) {
            this.rph = value;
        }

    }

}
