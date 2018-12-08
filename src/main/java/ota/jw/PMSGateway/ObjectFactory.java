
package ota.jw.PMSGateway;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ota.jw.PMSGateway package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OTANotifReportRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_NotifReportRS");
    private final static QName _OTAHotelStayInfoNotifRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelStayInfoNotifRQ");
    private final static QName _OTAHotelStayInfoNotifRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_HotelStayInfoNotifRS");
    private final static QName _OrderPaymentInfoRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OrderPaymentInfoRS");
    private final static QName _MessageAcknowledgementType_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "MessageAcknowledgementType");
    private final static QName _OrderCheckInNoticeRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OrderCheckInNoticeRQ");
    private final static QName _OrderCheckInNoticeRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OrderCheckInNoticeRS");
    private final static QName _OrderApplyPaymentRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OrderApplyPaymentRQ");
    private final static QName _OrderApplyPaymentRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OrderApplyPaymentRS");
    private final static QName _OTAPushOrderStatusRQ_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_PushOrderStatusRQ");
    private final static QName _OTAPushOrderStatusRS_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OTA_PushOrderStatusRS");
    private final static QName _ParagraphTypeListItem_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ListItem");
    private final static QName _ParagraphTypeText_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Text");
    private final static QName _ParagraphTypeURL_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "URL");
    private final static QName _ParagraphTypeImage_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "Image");
    private final static QName _ResGuestRPHsTypeResGuestRPH_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ResGuestRPH");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ota.jw.PMSGateway
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OTAReadRQ }
     * 
     */
    public OTAReadRQ createOTAReadRQ() {
        return new OTAReadRQ();
    }

    /**
     * Create an instance of {@link OTAResRetrieveRS }
     * 
     */
    public OTAResRetrieveRS createOTAResRetrieveRS() {
        return new OTAResRetrieveRS();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ }
     * 
     */
    public OTANotifReportRQ createOTANotifReportRQ() {
        return new OTANotifReportRQ();
    }

    /**
     * Create an instance of {@link OTAHotelAvailNotifRQ }
     * 
     */
    public OTAHotelAvailNotifRQ createOTAHotelAvailNotifRQ() {
        return new OTAHotelAvailNotifRQ();
    }

    /**
     * Create an instance of {@link OTAHotelRatePlanNotifRQ }
     * 
     */
    public OTAHotelRatePlanNotifRQ createOTAHotelRatePlanNotifRQ() {
        return new OTAHotelRatePlanNotifRQ();
    }

    /**
     * Create an instance of {@link OTAHotelRatePlanNotifRS }
     * 
     */
    public OTAHotelRatePlanNotifRS createOTAHotelRatePlanNotifRS() {
        return new OTAHotelRatePlanNotifRS();
    }

    /**
     * Create an instance of {@link OTAPrdReadRQ }
     * 
     */
    public OTAPrdReadRQ createOTAPrdReadRQ() {
        return new OTAPrdReadRQ();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ }
     * 
     */
    public OTAPrdNotifReportRQ createOTAPrdNotifReportRQ() {
        return new OTAPrdNotifReportRQ();
    }

    /**
     * Create an instance of {@link HTNGComponentRoomType }
     * 
     */
    public HTNGComponentRoomType createHTNGComponentRoomType() {
        return new HTNGComponentRoomType();
    }

    /**
     * Create an instance of {@link RoomTypeType }
     * 
     */
    public RoomTypeType createRoomTypeType() {
        return new RoomTypeType();
    }

    /**
     * Create an instance of {@link PaymentCardType }
     * 
     */
    public PaymentCardType createPaymentCardType() {
        return new PaymentCardType();
    }

    /**
     * Create an instance of {@link ArrayOfGuestRoomTypeAmenity }
     * 
     */
    public ArrayOfGuestRoomTypeAmenity createArrayOfGuestRoomTypeAmenity() {
        return new ArrayOfGuestRoomTypeAmenity();
    }

    /**
     * Create an instance of {@link GuestRoomType }
     * 
     */
    public GuestRoomType createGuestRoomType() {
        return new GuestRoomType();
    }

    /**
     * Create an instance of {@link ArrayOfSellableProductsTypeSellableProductDestinationSystemCode }
     * 
     */
    public ArrayOfSellableProductsTypeSellableProductDestinationSystemCode createArrayOfSellableProductsTypeSellableProductDestinationSystemCode() {
        return new ArrayOfSellableProductsTypeSellableProductDestinationSystemCode();
    }

    /**
     * Create an instance of {@link ArrayOfSellableProductsTypeSellableProduct }
     * 
     */
    public ArrayOfSellableProductsTypeSellableProduct createArrayOfSellableProductsTypeSellableProduct() {
        return new ArrayOfSellableProductsTypeSellableProduct();
    }

    /**
     * Create an instance of {@link ArrayOfSellableProductsTypeSellableProduct.SellableProduct }
     * 
     */
    public ArrayOfSellableProductsTypeSellableProduct.SellableProduct createArrayOfSellableProductsTypeSellableProductSellableProduct() {
        return new ArrayOfSellableProductsTypeSellableProduct.SellableProduct();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeRatePlanShoulder }
     * 
     */
    public ArrayOfHotelRatePlanTypeRatePlanShoulder createArrayOfHotelRatePlanTypeRatePlanShoulder() {
        return new ArrayOfHotelRatePlanTypeRatePlanShoulder();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeGuest }
     * 
     */
    public ArrayOfOfferTypeGuest createArrayOfOfferTypeGuest() {
        return new ArrayOfOfferTypeGuest();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeInventory }
     * 
     */
    public ArrayOfOfferTypeInventory createArrayOfOfferTypeInventory() {
        return new ArrayOfOfferTypeInventory();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeCompatibleOffer }
     * 
     */
    public ArrayOfOfferTypeCompatibleOffer createArrayOfOfferTypeCompatibleOffer() {
        return new ArrayOfOfferTypeCompatibleOffer();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeOfferRuleInventory }
     * 
     */
    public ArrayOfOfferTypeOfferRuleInventory createArrayOfOfferTypeOfferRuleInventory() {
        return new ArrayOfOfferTypeOfferRuleInventory();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeOfferRule }
     * 
     */
    public ArrayOfOfferTypeOfferRule createArrayOfOfferTypeOfferRule() {
        return new ArrayOfOfferTypeOfferRule();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeOfferRule.OfferRule }
     * 
     */
    public ArrayOfOfferTypeOfferRule.OfferRule createArrayOfOfferTypeOfferRuleOfferRule() {
        return new ArrayOfOfferTypeOfferRule.OfferRule();
    }

    /**
     * Create an instance of {@link OfferType }
     * 
     */
    public OfferType createOfferType() {
        return new OfferType();
    }

    /**
     * Create an instance of {@link OfferType.FreeUpgrade }
     * 
     */
    public OfferType.FreeUpgrade createOfferTypeFreeUpgrade() {
        return new OfferType.FreeUpgrade();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeOffer }
     * 
     */
    public ArrayOfHotelRatePlanTypeOffer createArrayOfHotelRatePlanTypeOffer() {
        return new ArrayOfHotelRatePlanTypeOffer();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeSupplement }
     * 
     */
    public ArrayOfHotelRatePlanTypeSupplement createArrayOfHotelRatePlanTypeSupplement() {
        return new ArrayOfHotelRatePlanTypeSupplement();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeSupplement.Supplement }
     * 
     */
    public ArrayOfHotelRatePlanTypeSupplement.Supplement createArrayOfHotelRatePlanTypeSupplementSupplement() {
        return new ArrayOfHotelRatePlanTypeSupplement.Supplement();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeRate }
     * 
     */
    public ArrayOfHotelRatePlanTypeRate createArrayOfHotelRatePlanTypeRate() {
        return new ArrayOfHotelRatePlanTypeRate();
    }

    /**
     * Create an instance of {@link RateUploadType }
     * 
     */
    public RateUploadType createRateUploadType() {
        return new RateUploadType();
    }

    /**
     * Create an instance of {@link BookingRulesType }
     * 
     */
    public BookingRulesType createBookingRulesType() {
        return new BookingRulesType();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule }
     * 
     */
    public BookingRulesType.BookingRule createBookingRulesTypeBookingRule() {
        return new BookingRulesType.BookingRule();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeDestinationSystemCode }
     * 
     */
    public ArrayOfHotelRatePlanTypeDestinationSystemCode createArrayOfHotelRatePlanTypeDestinationSystemCode() {
        return new ArrayOfHotelRatePlanTypeDestinationSystemCode();
    }

    /**
     * Create an instance of {@link HotelRatePlanType }
     * 
     */
    public HotelRatePlanType createHotelRatePlanType() {
        return new HotelRatePlanType();
    }

    /**
     * Create an instance of {@link HotelRatePlanType.RatePlanLevelFee }
     * 
     */
    public HotelRatePlanType.RatePlanLevelFee createHotelRatePlanTypeRatePlanLevelFee() {
        return new HotelRatePlanType.RatePlanLevelFee();
    }

    /**
     * Create an instance of {@link HotelRatePlanType.BookingRules }
     * 
     */
    public HotelRatePlanType.BookingRules createHotelRatePlanTypeBookingRules() {
        return new HotelRatePlanType.BookingRules();
    }

    /**
     * Create an instance of {@link ArrayOfBaseInvCountTypeInvCount }
     * 
     */
    public ArrayOfBaseInvCountTypeInvCount createArrayOfBaseInvCountTypeInvCount() {
        return new ArrayOfBaseInvCountTypeInvCount();
    }

    /**
     * Create an instance of {@link ArrayOfBaseInvCountTypeInvCount.InvCount }
     * 
     */
    public ArrayOfBaseInvCountTypeInvCount.InvCount createArrayOfBaseInvCountTypeInvCountInvCount() {
        return new ArrayOfBaseInvCountTypeInvCount.InvCount();
    }

    /**
     * Create an instance of {@link BaseInvCountType }
     * 
     */
    public BaseInvCountType createBaseInvCountType() {
        return new BaseInvCountType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation }
     * 
     */
    public ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation createArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation() {
        return new ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
     * 
     */
    public ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo createArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo() {
        return new ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType }
     * 
     */
    public VehicleLocationAdditionalDetailsType createVehicleLocationAdditionalDetailsType() {
        return new VehicleLocationAdditionalDetailsType();
    }

    /**
     * Create an instance of {@link VehicleLocationDetailsType }
     * 
     */
    public VehicleLocationDetailsType createVehicleLocationDetailsType() {
        return new VehicleLocationDetailsType();
    }

    /**
     * Create an instance of {@link OffLocationServiceCoreType }
     * 
     */
    public OffLocationServiceCoreType createOffLocationServiceCoreType() {
        return new OffLocationServiceCoreType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link OffLocationServiceType }
     * 
     */
    public OffLocationServiceType createOffLocationServiceType() {
        return new OffLocationServiceType();
    }

    /**
     * Create an instance of {@link NoShowFeeType }
     * 
     */
    public NoShowFeeType createNoShowFeeType() {
        return new NoShowFeeType();
    }

    /**
     * Create an instance of {@link ArrayOfRateQualifierTypeRateComment }
     * 
     */
    public ArrayOfRateQualifierTypeRateComment createArrayOfRateQualifierTypeRateComment() {
        return new ArrayOfRateQualifierTypeRateComment();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleChargeTypeTaxAmount }
     * 
     */
    public ArrayOfVehicleChargeTypeTaxAmount createArrayOfVehicleChargeTypeTaxAmount() {
        return new ArrayOfVehicleChargeTypeTaxAmount();
    }

    /**
     * Create an instance of {@link VehicleChargeType }
     * 
     */
    public VehicleChargeType createVehicleChargeType() {
        return new VehicleChargeType();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType }
     * 
     */
    public VehicleRentalRateType createVehicleRentalRateType() {
        return new VehicleRentalRateType();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreType }
     * 
     */
    public VehicleRentalCoreType createVehicleRentalCoreType() {
        return new VehicleRentalCoreType();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType }
     * 
     */
    public VehicleSegmentCoreType createVehicleSegmentCoreType() {
        return new VehicleSegmentCoreType();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalType }
     * 
     */
    public CustomerPrimaryAdditionalType createCustomerPrimaryAdditionalType() {
        return new CustomerPrimaryAdditionalType();
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link CustomerType.CustLoyalty }
     * 
     */
    public CustomerType.CustLoyalty createCustomerTypeCustLoyalty() {
        return new CustomerType.CustLoyalty();
    }

    /**
     * Create an instance of {@link CustomerType.CustLoyalty.SecurityInfo }
     * 
     */
    public CustomerType.CustLoyalty.SecurityInfo createCustomerTypeCustLoyaltySecurityInfo() {
        return new CustomerType.CustLoyalty.SecurityInfo();
    }

    /**
     * Create an instance of {@link CustomerType.CustLoyalty.MemberPreferences }
     * 
     */
    public CustomerType.CustLoyalty.MemberPreferences createCustomerTypeCustLoyaltyMemberPreferences() {
        return new CustomerType.CustLoyalty.MemberPreferences();
    }

    /**
     * Create an instance of {@link CustomerType.CustLoyalty.MemberPreferences.Offer }
     * 
     */
    public CustomerType.CustLoyalty.MemberPreferences.Offer createCustomerTypeCustLoyaltyMemberPreferencesOffer() {
        return new CustomerType.CustLoyalty.MemberPreferences.Offer();
    }

    /**
     * Create an instance of {@link PaymentFormType }
     * 
     */
    public PaymentFormType createPaymentFormType() {
        return new PaymentFormType();
    }

    /**
     * Create an instance of {@link CustomerType.PaymentForm }
     * 
     */
    public CustomerType.PaymentForm createCustomerTypePaymentForm() {
        return new CustomerType.PaymentForm();
    }

    /**
     * Create an instance of {@link PaymentFormType.Ticket }
     * 
     */
    public PaymentFormType.Ticket createPaymentFormTypeTicket() {
        return new PaymentFormType.Ticket();
    }

    /**
     * Create an instance of {@link PaymentFormType.LoyaltyRedemption }
     * 
     */
    public PaymentFormType.LoyaltyRedemption createPaymentFormTypeLoyaltyRedemption() {
        return new PaymentFormType.LoyaltyRedemption();
    }

    /**
     * Create an instance of {@link VehicleReservationType }
     * 
     */
    public VehicleReservationType createVehicleReservationType() {
        return new VehicleReservationType();
    }

    /**
     * Create an instance of {@link ArrayOfHotelDescriptiveContentTypePromotion }
     * 
     */
    public ArrayOfHotelDescriptiveContentTypePromotion createArrayOfHotelDescriptiveContentTypePromotion() {
        return new ArrayOfHotelDescriptiveContentTypePromotion();
    }

    /**
     * Create an instance of {@link ArrayOfHotelDescriptiveContentTypeEffectivePeriod }
     * 
     */
    public ArrayOfHotelDescriptiveContentTypeEffectivePeriod createArrayOfHotelDescriptiveContentTypeEffectivePeriod() {
        return new ArrayOfHotelDescriptiveContentTypeEffectivePeriod();
    }

    /**
     * Create an instance of {@link ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail }
     * 
     */
    public ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail createArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail() {
        return new ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail();
    }

    /**
     * Create an instance of {@link GDSInfoType }
     * 
     */
    public GDSInfoType createGDSInfoType() {
        return new GDSInfoType();
    }

    /**
     * Create an instance of {@link GDSInfoType.GDSCodes }
     * 
     */
    public GDSInfoType.GDSCodes createGDSInfoTypeGDSCodes() {
        return new GDSInfoType.GDSCodes();
    }

    /**
     * Create an instance of {@link ArrayOfAffiliationInfoTypePartnerInfo }
     * 
     */
    public ArrayOfAffiliationInfoTypePartnerInfo createArrayOfAffiliationInfoTypePartnerInfo() {
        return new ArrayOfAffiliationInfoTypePartnerInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAffiliationInfoTypeAward }
     * 
     */
    public ArrayOfAffiliationInfoTypeAward createArrayOfAffiliationInfoTypeAward() {
        return new ArrayOfAffiliationInfoTypeAward();
    }

    /**
     * Create an instance of {@link ArrayOfAffiliationInfoTypeLoyalProgram }
     * 
     */
    public ArrayOfAffiliationInfoTypeLoyalProgram createArrayOfAffiliationInfoTypeLoyalProgram() {
        return new ArrayOfAffiliationInfoTypeLoyalProgram();
    }

    /**
     * Create an instance of {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram }
     * 
     */
    public ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram createArrayOfAffiliationInfoTypeLoyalProgramLoyalProgram() {
        return new ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram();
    }

    /**
     * Create an instance of {@link ParagraphType }
     * 
     */
    public ParagraphType createParagraphType() {
        return new ParagraphType();
    }

    /**
     * Create an instance of {@link ArrayOfAffiliationInfoTypeBrand }
     * 
     */
    public ArrayOfAffiliationInfoTypeBrand createArrayOfAffiliationInfoTypeBrand() {
        return new ArrayOfAffiliationInfoTypeBrand();
    }

    /**
     * Create an instance of {@link AffiliationInfoType }
     * 
     */
    public AffiliationInfoType createAffiliationInfoType() {
        return new AffiliationInfoType();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.DistribSystems }
     * 
     */
    public AffiliationInfoType.DistribSystems createAffiliationInfoTypeDistribSystems() {
        return new AffiliationInfoType.DistribSystems();
    }

    /**
     * Create an instance of {@link ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail }
     * 
     */
    public ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail createArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail() {
        return new ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail();
    }

    /**
     * Create an instance of {@link ArrayOfRefPointsTypeRefPoint }
     * 
     */
    public ArrayOfRefPointsTypeRefPoint createArrayOfRefPointsTypeRefPoint() {
        return new ArrayOfRefPointsTypeRefPoint();
    }

    /**
     * Create an instance of {@link RefPointsType }
     * 
     */
    public RefPointsType createRefPointsType() {
        return new RefPointsType();
    }

    /**
     * Create an instance of {@link AreaInfoType }
     * 
     */
    public AreaInfoType createAreaInfoType() {
        return new AreaInfoType();
    }

    /**
     * Create an instance of {@link AreaInfoType.OtherHotels }
     * 
     */
    public AreaInfoType.OtherHotels createAreaInfoTypeOtherHotels() {
        return new AreaInfoType.OtherHotels();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations }
     * 
     */
    public AreaInfoType.Recreations createAreaInfoTypeRecreations() {
        return new AreaInfoType.Recreations();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations.Recreation }
     * 
     */
    public AreaInfoType.Recreations.Recreation createAreaInfoTypeRecreationsRecreation() {
        return new AreaInfoType.Recreations.Recreation();
    }

    /**
     * Create an instance of {@link AreaInfoType.Attractions }
     * 
     */
    public AreaInfoType.Attractions createAreaInfoTypeAttractions() {
        return new AreaInfoType.Attractions();
    }

    /**
     * Create an instance of {@link AreaInfoType.Attractions.Attraction }
     * 
     */
    public AreaInfoType.Attractions.Attraction createAreaInfoTypeAttractionsAttraction() {
        return new AreaInfoType.Attractions.Attraction();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfPoliciesTypePolicyRatePolicy }
     * 
     */
    public ArrayOfPoliciesTypePolicyRatePolicy createArrayOfPoliciesTypePolicyRatePolicy() {
        return new ArrayOfPoliciesTypePolicyRatePolicy();
    }

    /**
     * Create an instance of {@link ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy }
     * 
     */
    public ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy createArrayOfPoliciesTypePolicyRatePolicyRatePolicy() {
        return new ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy();
    }

    /**
     * Create an instance of {@link ArrayOfPoliciesTypePolicyStayRequirement }
     * 
     */
    public ArrayOfPoliciesTypePolicyStayRequirement createArrayOfPoliciesTypePolicyStayRequirement() {
        return new ArrayOfPoliciesTypePolicyStayRequirement();
    }

    /**
     * Create an instance of {@link ArrayOfPoliciesTypePolicyTaxPolicy }
     * 
     */
    public ArrayOfPoliciesTypePolicyTaxPolicy createArrayOfPoliciesTypePolicyTaxPolicy() {
        return new ArrayOfPoliciesTypePolicyTaxPolicy();
    }

    /**
     * Create an instance of {@link ArrayOfPoliciesTypePolicyCheckoutCharge }
     * 
     */
    public ArrayOfPoliciesTypePolicyCheckoutCharge createArrayOfPoliciesTypePolicyCheckoutCharge() {
        return new ArrayOfPoliciesTypePolicyCheckoutCharge();
    }

    /**
     * Create an instance of {@link ArrayOfPoliciesTypePolicyPolicyInfoCode }
     * 
     */
    public ArrayOfPoliciesTypePolicyPolicyInfoCode createArrayOfPoliciesTypePolicyPolicyInfoCode() {
        return new ArrayOfPoliciesTypePolicyPolicyInfoCode();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType }
     * 
     */
    public RequiredPaymentsType createRequiredPaymentsType() {
        return new RequiredPaymentsType();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment createRequiredPaymentsTypeGuaranteePayment() {
        return new RequiredPaymentsType.GuaranteePayment();
    }

    /**
     * Create an instance of {@link PoliciesType }
     * 
     */
    public PoliciesType createPoliciesType() {
        return new PoliciesType();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy }
     * 
     */
    public PoliciesType.Policy createPoliciesTypePolicy() {
        return new PoliciesType.Policy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.CommissionPolicy }
     * 
     */
    public PoliciesType.Policy.CommissionPolicy createPoliciesTypePolicyCommissionPolicy() {
        return new PoliciesType.Policy.CommissionPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PetsPolicies }
     * 
     */
    public PoliciesType.Policy.PetsPolicies createPoliciesTypePolicyPetsPolicies() {
        return new PoliciesType.Policy.PetsPolicies();
    }

    /**
     * Create an instance of {@link ArrayOfRestaurantsTypeSrvcInfoCode }
     * 
     */
    public ArrayOfRestaurantsTypeSrvcInfoCode createArrayOfRestaurantsTypeSrvcInfoCode() {
        return new ArrayOfRestaurantsTypeSrvcInfoCode();
    }

    /**
     * Create an instance of {@link ArrayOfRestaurantsTypeRestaurantSrvcInfoCode }
     * 
     */
    public ArrayOfRestaurantsTypeRestaurantSrvcInfoCode createArrayOfRestaurantsTypeRestaurantSrvcInfoCode() {
        return new ArrayOfRestaurantsTypeRestaurantSrvcInfoCode();
    }

    /**
     * Create an instance of {@link ArrayOfRestaurantTypeCuisineCode }
     * 
     */
    public ArrayOfRestaurantTypeCuisineCode createArrayOfRestaurantTypeCuisineCode() {
        return new ArrayOfRestaurantTypeCuisineCode();
    }

    /**
     * Create an instance of {@link ArrayOfRestaurantTypeInfoCode }
     * 
     */
    public ArrayOfRestaurantTypeInfoCode createArrayOfRestaurantTypeInfoCode() {
        return new ArrayOfRestaurantTypeInfoCode();
    }

    /**
     * Create an instance of {@link RestaurantType }
     * 
     */
    public RestaurantType createRestaurantType() {
        return new RestaurantType();
    }

    /**
     * Create an instance of {@link RestaurantsType }
     * 
     */
    public RestaurantsType createRestaurantsType() {
        return new RestaurantsType();
    }

    /**
     * Create an instance of {@link ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity }
     * 
     */
    public ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity createArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity() {
        return new ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity();
    }

    /**
     * Create an instance of {@link MeetingRoomCapacityType }
     * 
     */
    public MeetingRoomCapacityType createMeetingRoomCapacityType() {
        return new MeetingRoomCapacityType();
    }

    /**
     * Create an instance of {@link MeetingRoomsType }
     * 
     */
    public MeetingRoomsType createMeetingRoomsType() {
        return new MeetingRoomsType();
    }

    /**
     * Create an instance of {@link MeetingRoomsType.MeetingRoom }
     * 
     */
    public MeetingRoomsType.MeetingRoom createMeetingRoomsTypeMeetingRoom() {
        return new MeetingRoomsType.MeetingRoom();
    }

    /**
     * Create an instance of {@link FacilityInfoType }
     * 
     */
    public FacilityInfoType createFacilityInfoType() {
        return new FacilityInfoType();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms }
     * 
     */
    public FacilityInfoType.GuestRooms createFacilityInfoTypeGuestRooms() {
        return new FacilityInfoType.GuestRooms();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms.GuestRoom }
     * 
     */
    public FacilityInfoType.GuestRooms.GuestRoom createFacilityInfoTypeGuestRoomsGuestRoom() {
        return new FacilityInfoType.GuestRooms.GuestRoom();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoTypeLanguage }
     * 
     */
    public ArrayOfHotelInfoTypeLanguage createArrayOfHotelInfoTypeLanguage() {
        return new ArrayOfHotelInfoTypeLanguage();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoTypeOwnershipManagementInfo }
     * 
     */
    public ArrayOfHotelInfoTypeOwnershipManagementInfo createArrayOfHotelInfoTypeOwnershipManagementInfo() {
        return new ArrayOfHotelInfoTypeOwnershipManagementInfo();
    }

    /**
     * Create an instance of {@link WeatherInfoType }
     * 
     */
    public WeatherInfoType createWeatherInfoType() {
        return new WeatherInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfFeaturesTypeFeature }
     * 
     */
    public ArrayOfFeaturesTypeFeature createArrayOfFeaturesTypeFeature() {
        return new ArrayOfFeaturesTypeFeature();
    }

    /**
     * Create an instance of {@link ArrayOfFeaturesTypeFeature.Feature }
     * 
     */
    public ArrayOfFeaturesTypeFeature.Feature createArrayOfFeaturesTypeFeatureFeature() {
        return new ArrayOfFeaturesTypeFeature.Feature();
    }

    /**
     * Create an instance of {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
     * 
     */
    public ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule createArrayOfOperationSchedulesPlusChargeTypeOperationSchedule() {
        return new ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule();
    }

    /**
     * Create an instance of {@link ArrayOfURLsTypeURL }
     * 
     */
    public ArrayOfURLsTypeURL createArrayOfURLsTypeURL() {
        return new ArrayOfURLsTypeURL();
    }

    /**
     * Create an instance of {@link ArrayOfEmailsTypeEmail }
     * 
     */
    public ArrayOfEmailsTypeEmail createArrayOfEmailsTypeEmail() {
        return new ArrayOfEmailsTypeEmail();
    }

    /**
     * Create an instance of {@link ArrayOfPhonesTypePhone }
     * 
     */
    public ArrayOfPhonesTypePhone createArrayOfPhonesTypePhone() {
        return new ArrayOfPhonesTypePhone();
    }

    /**
     * Create an instance of {@link ArrayOfAddressesTypeAddress }
     * 
     */
    public ArrayOfAddressesTypeAddress createArrayOfAddressesTypeAddress() {
        return new ArrayOfAddressesTypeAddress();
    }

    /**
     * Create an instance of {@link ArrayOfContactsTypeName }
     * 
     */
    public ArrayOfContactsTypeName createArrayOfContactsTypeName() {
        return new ArrayOfContactsTypeName();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link ArrayOfContactsTypeName.Name }
     * 
     */
    public ArrayOfContactsTypeName.Name createArrayOfContactsTypeNameName() {
        return new ArrayOfContactsTypeName.Name();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoTypeService }
     * 
     */
    public ArrayOfHotelInfoTypeService createArrayOfHotelInfoTypeService() {
        return new ArrayOfHotelInfoTypeService();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoTypeHotelInfoCode }
     * 
     */
    public ArrayOfHotelInfoTypeHotelInfoCode createArrayOfHotelInfoTypeHotelInfoCode() {
        return new ArrayOfHotelInfoTypeHotelInfoCode();
    }

    /**
     * Create an instance of {@link ArrayOfCategoryCodesTypeGuestRoomInfoRateRange }
     * 
     */
    public ArrayOfCategoryCodesTypeGuestRoomInfoRateRange createArrayOfCategoryCodesTypeGuestRoomInfoRateRange() {
        return new ArrayOfCategoryCodesTypeGuestRoomInfoRateRange();
    }

    /**
     * Create an instance of {@link CategoryCodesType }
     * 
     */
    public CategoryCodesType createCategoryCodesType() {
        return new CategoryCodesType();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoTypeBlackoutDate }
     * 
     */
    public ArrayOfHotelInfoTypeBlackoutDate createArrayOfHotelInfoTypeBlackoutDate() {
        return new ArrayOfHotelInfoTypeBlackoutDate();
    }

    /**
     * Create an instance of {@link DateTimeSpanType }
     * 
     */
    public DateTimeSpanType createDateTimeSpanType() {
        return new DateTimeSpanType();
    }

    /**
     * Create an instance of {@link HotelInfoType }
     * 
     */
    public HotelInfoType createHotelInfoType() {
        return new HotelInfoType();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions }
     * 
     */
    public HotelInfoType.Descriptions createHotelInfoTypeDescriptions() {
        return new HotelInfoType.Descriptions();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType }
     * 
     */
    public HotelDescriptiveContentType createHotelDescriptiveContentType() {
        return new HotelDescriptiveContentType();
    }

    /**
     * Create an instance of {@link ArrayOfAvailStatusMessageTypeBestAvailableRate }
     * 
     */
    public ArrayOfAvailStatusMessageTypeBestAvailableRate createArrayOfAvailStatusMessageTypeBestAvailableRate() {
        return new ArrayOfAvailStatusMessageTypeBestAvailableRate();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType }
     * 
     */
    public AvailStatusMessageType createAvailStatusMessageType() {
        return new AvailStatusMessageType();
    }

    /**
     * Create an instance of {@link ArrayOfRateUploadTypeAdditionalGuestAmount }
     * 
     */
    public ArrayOfRateUploadTypeAdditionalGuestAmount createArrayOfRateUploadTypeAdditionalGuestAmount() {
        return new ArrayOfRateUploadTypeAdditionalGuestAmount();
    }

    /**
     * Create an instance of {@link ArrayOfRateUploadTypeBaseByGuestAmt }
     * 
     */
    public ArrayOfRateUploadTypeBaseByGuestAmt createArrayOfRateUploadTypeBaseByGuestAmt() {
        return new ArrayOfRateUploadTypeBaseByGuestAmt();
    }

    /**
     * Create an instance of {@link ArrayOfRateAmountMessageTypeRate }
     * 
     */
    public ArrayOfRateAmountMessageTypeRate createArrayOfRateAmountMessageTypeRate() {
        return new ArrayOfRateAmountMessageTypeRate();
    }

    /**
     * Create an instance of {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode }
     * 
     */
    public ArrayOfDestinationSystemCodesTypeDestinationSystemCode createArrayOfDestinationSystemCodesTypeDestinationSystemCode() {
        return new ArrayOfDestinationSystemCodesTypeDestinationSystemCode();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType }
     * 
     */
    public RailPassengerDetailType createRailPassengerDetailType() {
        return new RailPassengerDetailType();
    }

    /**
     * Create an instance of {@link RailRateQualifyingType }
     * 
     */
    public RailRateQualifyingType createRailRateQualifyingType() {
        return new RailRateQualifyingType();
    }

    /**
     * Create an instance of {@link RailPassengerCategoryType }
     * 
     */
    public RailPassengerCategoryType createRailPassengerCategoryType() {
        return new RailPassengerCategoryType();
    }

    /**
     * Create an instance of {@link RailReservationSummaryType }
     * 
     */
    public RailReservationSummaryType createRailReservationSummaryType() {
        return new RailReservationSummaryType();
    }

    /**
     * Create an instance of {@link RailReservationSummaryType.ODInfo }
     * 
     */
    public RailReservationSummaryType.ODInfo createRailReservationSummaryTypeODInfo() {
        return new RailReservationSummaryType.ODInfo();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType }
     * 
     */
    public FlightSegmentBaseType createFlightSegmentBaseType() {
        return new FlightSegmentBaseType();
    }

    /**
     * Create an instance of {@link FlightSegmentType }
     * 
     */
    public FlightSegmentType createFlightSegmentType() {
        return new FlightSegmentType();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType }
     * 
     */
    public BookFlightSegmentType createBookFlightSegmentType() {
        return new BookFlightSegmentType();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.BookingClassAvails }
     * 
     */
    public BookFlightSegmentType.BookingClassAvails createBookFlightSegmentTypeBookingClassAvails() {
        return new BookFlightSegmentType.BookingClassAvails();
    }

    /**
     * Create an instance of {@link PkgAirSegmentType }
     * 
     */
    public PkgAirSegmentType createPkgAirSegmentType() {
        return new PkgAirSegmentType();
    }

    /**
     * Create an instance of {@link VehicleReservationSummaryType }
     * 
     */
    public VehicleReservationSummaryType createVehicleReservationSummaryType() {
        return new VehicleReservationSummaryType();
    }

    /**
     * Create an instance of {@link TransportInfoType }
     * 
     */
    public TransportInfoType createTransportInfoType() {
        return new TransportInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfResGuestTypeProfileRPH }
     * 
     */
    public ArrayOfResGuestTypeProfileRPH createArrayOfResGuestTypeProfileRPH() {
        return new ArrayOfResGuestTypeProfileRPH();
    }

    /**
     * Create an instance of {@link ArrayOfProfilesTypeProfileInfo }
     * 
     */
    public ArrayOfProfilesTypeProfileInfo createArrayOfProfilesTypeProfileInfo() {
        return new ArrayOfProfilesTypeProfileInfo();
    }

    /**
     * Create an instance of {@link ArrayOfRoutingHopTypeRoutingHop }
     * 
     */
    public ArrayOfRoutingHopTypeRoutingHop createArrayOfRoutingHopTypeRoutingHop() {
        return new ArrayOfRoutingHopTypeRoutingHop();
    }

    /**
     * Create an instance of {@link ArrayOfHotelReservationIDsTypeHotelReservationID }
     * 
     */
    public ArrayOfHotelReservationIDsTypeHotelReservationID createArrayOfHotelReservationIDsTypeHotelReservationID() {
        return new ArrayOfHotelReservationIDsTypeHotelReservationID();
    }

    /**
     * Create an instance of {@link ResCommonDetailType }
     * 
     */
    public ResCommonDetailType createResCommonDetailType() {
        return new ResCommonDetailType();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRuleAdditionalRule createArrayOfBookingRulesTypeBookingRuleAdditionalRule() {
        return new ArrayOfBookingRulesTypeBookingRuleAdditionalRule();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewershipDistributorType }
     * 
     */
    public ArrayOfViewershipsTypeViewershipDistributorType createArrayOfViewershipsTypeViewershipDistributorType() {
        return new ArrayOfViewershipsTypeViewershipDistributorType();
    }

    /**
     * Create an instance of {@link ArrayOfProfileTypeComment }
     * 
     */
    public ArrayOfProfileTypeComment createArrayOfProfileTypeComment() {
        return new ArrayOfProfileTypeComment();
    }

    /**
     * Create an instance of {@link ArrayOfProfileTypeComment.Comment }
     * 
     */
    public ArrayOfProfileTypeComment.Comment createArrayOfProfileTypeCommentComment() {
        return new ArrayOfProfileTypeComment.Comment();
    }

    /**
     * Create an instance of {@link AllianceConsortiumType }
     * 
     */
    public AllianceConsortiumType createAllianceConsortiumType() {
        return new AllianceConsortiumType();
    }

    /**
     * Create an instance of {@link AgreementsType }
     * 
     */
    public AgreementsType createAgreementsType() {
        return new AgreementsType();
    }

    /**
     * Create an instance of {@link TravelClubType }
     * 
     */
    public TravelClubType createTravelClubType() {
        return new TravelClubType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link CompanyInfoType }
     * 
     */
    public CompanyInfoType createCompanyInfoType() {
        return new CompanyInfoType();
    }

    /**
     * Create an instance of {@link OtherServiceInfoType }
     * 
     */
    public OtherServiceInfoType createOtherServiceInfoType() {
        return new OtherServiceInfoType();
    }

    /**
     * Create an instance of {@link AirlinePrefType }
     * 
     */
    public AirlinePrefType createAirlinePrefType() {
        return new AirlinePrefType();
    }

    /**
     * Create an instance of {@link AirlinePrefType.AccountInformation }
     * 
     */
    public AirlinePrefType.AccountInformation createAirlinePrefTypeAccountInformation() {
        return new AirlinePrefType.AccountInformation();
    }

    /**
     * Create an instance of {@link AirlinePrefType.TourCodePref }
     * 
     */
    public AirlinePrefType.TourCodePref createAirlinePrefTypeTourCodePref() {
        return new AirlinePrefType.TourCodePref();
    }

    /**
     * Create an instance of {@link VehicleCoreType }
     * 
     */
    public VehicleCoreType createVehicleCoreType() {
        return new VehicleCoreType();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link VehiclePrefType }
     * 
     */
    public VehiclePrefType createVehiclePrefType() {
        return new VehiclePrefType();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType }
     * 
     */
    public VehicleProfileRentalPrefType createVehicleProfileRentalPrefType() {
        return new VehicleProfileRentalPrefType();
    }

    /**
     * Create an instance of {@link PhonePrefType }
     * 
     */
    public PhonePrefType createPhonePrefType() {
        return new PhonePrefType();
    }

    /**
     * Create an instance of {@link CommonPrefType }
     * 
     */
    public CommonPrefType createCommonPrefType() {
        return new CommonPrefType();
    }

    /**
     * Create an instance of {@link PreferencesType }
     * 
     */
    public PreferencesType createPreferencesType() {
        return new PreferencesType();
    }

    /**
     * Create an instance of {@link AccessesType }
     * 
     */
    public AccessesType createAccessesType() {
        return new AccessesType();
    }

    /**
     * Create an instance of {@link ota.jw.PMSGateway.ProfileType }
     * 
     */
    public ota.jw.PMSGateway.ProfileType createProfileType() {
        return new ota.jw.PMSGateway.ProfileType();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewershipProfileType }
     * 
     */
    public ArrayOfViewershipsTypeViewershipProfileType createArrayOfViewershipsTypeViewershipProfileType() {
        return new ArrayOfViewershipsTypeViewershipProfileType();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership }
     * 
     */
    public ArrayOfViewershipsTypeViewership createArrayOfViewershipsTypeViewership() {
        return new ArrayOfViewershipsTypeViewership();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership createArrayOfViewershipsTypeViewershipViewership() {
        return new ArrayOfViewershipsTypeViewership.Viewership();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes createArrayOfViewershipsTypeViewershipViewershipBookingChannelCodes() {
        return new ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.LocationCodes createArrayOfViewershipsTypeViewershipViewershipLocationCodes() {
        return new ArrayOfViewershipsTypeViewership.Viewership.LocationCodes();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.SystemCodes createArrayOfViewershipsTypeViewershipViewershipSystemCodes() {
        return new ArrayOfViewershipsTypeViewership.Viewership.SystemCodes();
    }

    /**
     * Create an instance of {@link LengthsOfStayType }
     * 
     */
    public LengthsOfStayType createLengthsOfStayType() {
        return new LengthsOfStayType();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay }
     * 
     */
    public LengthsOfStayType.LengthOfStay createLengthsOfStayTypeLengthOfStay() {
        return new LengthsOfStayType.LengthOfStay();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee createArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee() {
        return new ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee();
    }

    /**
     * Create an instance of {@link GuaranteeType }
     * 
     */
    public GuaranteeType createGuaranteeType() {
        return new GuaranteeType();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRule }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRule createArrayOfBookingRulesTypeBookingRule() {
        return new ArrayOfBookingRulesTypeBookingRule();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRule.BookingRule }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRule.BookingRule createArrayOfBookingRulesTypeBookingRuleBookingRule() {
        return new ArrayOfBookingRulesTypeBookingRule.BookingRule();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialRequestTypeSpecialRequest }
     * 
     */
    public ArrayOfSpecialRequestTypeSpecialRequest createArrayOfSpecialRequestTypeSpecialRequest() {
        return new ArrayOfSpecialRequestTypeSpecialRequest();
    }

    /**
     * Create an instance of {@link ArrayOfMembershipTypeMembership }
     * 
     */
    public ArrayOfMembershipTypeMembership createArrayOfMembershipTypeMembership() {
        return new ArrayOfMembershipTypeMembership();
    }

    /**
     * Create an instance of {@link ArrayOfPropertyValueMatchTypeAmenity }
     * 
     */
    public ArrayOfPropertyValueMatchTypeAmenity createArrayOfPropertyValueMatchTypeAmenity() {
        return new ArrayOfPropertyValueMatchTypeAmenity();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType }
     * 
     */
    public BasicPropertyInfoType createBasicPropertyInfoType() {
        return new BasicPropertyInfoType();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType }
     * 
     */
    public PropertyValueMatchType createPropertyValueMatchType() {
        return new PropertyValueMatchType();
    }

    /**
     * Create an instance of {@link ArrayOfOperationScheduleTypeOperationTime }
     * 
     */
    public ArrayOfOperationScheduleTypeOperationTime createArrayOfOperationScheduleTypeOperationTime() {
        return new ArrayOfOperationScheduleTypeOperationTime();
    }

    /**
     * Create an instance of {@link TextDescriptionType }
     * 
     */
    public TextDescriptionType createTextDescriptionType() {
        return new TextDescriptionType();
    }

    /**
     * Create an instance of {@link TextItemsType }
     * 
     */
    public TextItemsType createTextItemsType() {
        return new TextItemsType();
    }

    /**
     * Create an instance of {@link ImageDescriptionType }
     * 
     */
    public ImageDescriptionType createImageDescriptionType() {
        return new ImageDescriptionType();
    }

    /**
     * Create an instance of {@link ImageItemsType }
     * 
     */
    public ImageItemsType createImageItemsType() {
        return new ImageItemsType();
    }

    /**
     * Create an instance of {@link VideoDescriptionType }
     * 
     */
    public VideoDescriptionType createVideoDescriptionType() {
        return new VideoDescriptionType();
    }

    /**
     * Create an instance of {@link VideoItemsType }
     * 
     */
    public VideoItemsType createVideoItemsType() {
        return new VideoItemsType();
    }

    /**
     * Create an instance of {@link ArrayOfTransportationTypeTransportation }
     * 
     */
    public ArrayOfTransportationTypeTransportation createArrayOfTransportationTypeTransportation() {
        return new ArrayOfTransportationTypeTransportation();
    }

    /**
     * Create an instance of {@link ArrayOfBasicPropertyInfoTypeContactNumber }
     * 
     */
    public ArrayOfBasicPropertyInfoTypeContactNumber createArrayOfBasicPropertyInfoTypeContactNumber() {
        return new ArrayOfBasicPropertyInfoTypeContactNumber();
    }

    /**
     * Create an instance of {@link GuestCountType }
     * 
     */
    public GuestCountType createGuestCountType() {
        return new GuestCountType();
    }

    /**
     * Create an instance of {@link ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount }
     * 
     */
    public ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount createArrayOfRoomStayTypeRoomRatesRoomRateGuestCount() {
        return new ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount();
    }

    /**
     * Create an instance of {@link ArrayOfServiceRPHsTypeServiceRPH }
     * 
     */
    public ArrayOfServiceRPHsTypeServiceRPH createArrayOfServiceRPHsTypeServiceRPH() {
        return new ArrayOfServiceRPHsTypeServiceRPH();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType }
     * 
     */
    public DOWRestrictionsType createDOWRestrictionsType() {
        return new DOWRestrictionsType();
    }

    /**
     * Create an instance of {@link ArrayOfRoomStayTypeRoomRatesRoomRateRestriction }
     * 
     */
    public ArrayOfRoomStayTypeRoomRatesRoomRateRestriction createArrayOfRoomStayTypeRoomRatesRoomRateRestriction() {
        return new ArrayOfRoomStayTypeRoomRatesRoomRateRestriction();
    }

    /**
     * Create an instance of {@link ArrayOfRoomRateTypeFeature }
     * 
     */
    public ArrayOfRoomRateTypeFeature createArrayOfRoomRateTypeFeature() {
        return new ArrayOfRoomRateTypeFeature();
    }

    /**
     * Create an instance of {@link HotelAdditionalChargesType }
     * 
     */
    public HotelAdditionalChargesType createHotelAdditionalChargesType() {
        return new HotelAdditionalChargesType();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     * 
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment createArrayOfRequiredPaymentsTypeGuaranteePayment() {
        return new ArrayOfRequiredPaymentsTypeGuaranteePayment();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment }
     * 
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment createArrayOfRequiredPaymentsTypeGuaranteePaymentGuaranteePayment() {
        return new ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link ArrayOfRateTypeRate }
     * 
     */
    public ArrayOfRateTypeRate createArrayOfRateTypeRate() {
        return new ArrayOfRateTypeRate();
    }

    /**
     * Create an instance of {@link RoomRateType }
     * 
     */
    public RoomRateType createRoomRateType() {
        return new RoomRateType();
    }

    /**
     * Create an instance of {@link CancelPenaltyType }
     * 
     */
    public CancelPenaltyType createCancelPenaltyType() {
        return new CancelPenaltyType();
    }

    /**
     * Create an instance of {@link ArrayOfCommentTypeComment }
     * 
     */
    public ArrayOfCommentTypeComment createArrayOfCommentTypeComment() {
        return new ArrayOfCommentTypeComment();
    }

    /**
     * Create an instance of {@link ArrayOfGuaranteeTypeGuaranteeAccepted }
     * 
     */
    public ArrayOfGuaranteeTypeGuaranteeAccepted createArrayOfGuaranteeTypeGuaranteeAccepted() {
        return new ArrayOfGuaranteeTypeGuaranteeAccepted();
    }

    /**
     * Create an instance of {@link RatePlanType }
     * 
     */
    public RatePlanType createRatePlanType() {
        return new RatePlanType();
    }

    /**
     * Create an instance of {@link RoomStayType }
     * 
     */
    public RoomStayType createRoomStayType() {
        return new RoomStayType();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates }
     * 
     */
    public RoomStayType.RoomRates createRoomStayTypeRoomRates() {
        return new RoomStayType.RoomRates();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate }
     * 
     */
    public RoomStayType.RoomRates.RoomRate createRoomStayTypeRoomRatesRoomRate() {
        return new RoomStayType.RoomRates.RoomRate();
    }

    /**
     * Create an instance of {@link ArrayOfRoomStaysTypeRoomStay }
     * 
     */
    public ArrayOfRoomStaysTypeRoomStay createArrayOfRoomStaysTypeRoomStay() {
        return new ArrayOfRoomStaysTypeRoomStay();
    }

    /**
     * Create an instance of {@link ArrayOfRoomStaysTypeRoomStay.RoomStay }
     * 
     */
    public ArrayOfRoomStaysTypeRoomStay.RoomStay createArrayOfRoomStaysTypeRoomStayRoomStay() {
        return new ArrayOfRoomStaysTypeRoomStay.RoomStay();
    }

    /**
     * Create an instance of {@link HotelReservationType }
     * 
     */
    public HotelReservationType createHotelReservationType() {
        return new HotelReservationType();
    }

    /**
     * Create an instance of {@link HotelReservationType.BillingInstructionCode }
     * 
     */
    public HotelReservationType.BillingInstructionCode createHotelReservationTypeBillingInstructionCode() {
        return new HotelReservationType.BillingInstructionCode();
    }

    /**
     * Create an instance of {@link ArrayOfCruiseReservationTypePaymentDue }
     * 
     */
    public ArrayOfCruiseReservationTypePaymentDue createArrayOfCruiseReservationTypePaymentDue() {
        return new ArrayOfCruiseReservationTypePaymentDue();
    }

    /**
     * Create an instance of {@link CommissionType }
     * 
     */
    public CommissionType createCommissionType() {
        return new CommissionType();
    }

    /**
     * Create an instance of {@link PaymentResponseType }
     * 
     */
    public PaymentResponseType createPaymentResponseType() {
        return new PaymentResponseType();
    }

    /**
     * Create an instance of {@link HotelPaymentFormType }
     * 
     */
    public HotelPaymentFormType createHotelPaymentFormType() {
        return new HotelPaymentFormType();
    }

    /**
     * Create an instance of {@link DirectBillType }
     * 
     */
    public DirectBillType createDirectBillType() {
        return new DirectBillType();
    }

    /**
     * Create an instance of {@link PaymentDetailType }
     * 
     */
    public PaymentDetailType createPaymentDetailType() {
        return new PaymentDetailType();
    }

    /**
     * Create an instance of {@link ArrayOfCruiseGuestInfoTypePaymentOption }
     * 
     */
    public ArrayOfCruiseGuestInfoTypePaymentOption createArrayOfCruiseGuestInfoTypePaymentOption() {
        return new ArrayOfCruiseGuestInfoTypePaymentOption();
    }

    /**
     * Create an instance of {@link ArrayOfCruiseGuestInfoTypeLinkedBooking }
     * 
     */
    public ArrayOfCruiseGuestInfoTypeLinkedBooking createArrayOfCruiseGuestInfoTypeLinkedBooking() {
        return new ArrayOfCruiseGuestInfoTypeLinkedBooking();
    }

    /**
     * Create an instance of {@link DocumentHandlingType }
     * 
     */
    public DocumentHandlingType createDocumentHandlingType() {
        return new DocumentHandlingType();
    }

    /**
     * Create an instance of {@link ArrayOfCruiseGuestDetailTypeAirAccommodation }
     * 
     */
    public ArrayOfCruiseGuestDetailTypeAirAccommodation createArrayOfCruiseGuestDetailTypeAirAccommodation() {
        return new ArrayOfCruiseGuestDetailTypeAirAccommodation();
    }

    /**
     * Create an instance of {@link CruisePackageType }
     * 
     */
    public CruisePackageType createCruisePackageType() {
        return new CruisePackageType();
    }

    /**
     * Create an instance of {@link ArrayOfCruiseGuestDetailTypeSelectedPackage }
     * 
     */
    public ArrayOfCruiseGuestDetailTypeSelectedPackage createArrayOfCruiseGuestDetailTypeSelectedPackage() {
        return new ArrayOfCruiseGuestDetailTypeSelectedPackage();
    }

    /**
     * Create an instance of {@link ContactPersonType }
     * 
     */
    public ContactPersonType createContactPersonType() {
        return new ContactPersonType();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType }
     * 
     */
    public CruiseGuestDetailType createCruiseGuestDetailType() {
        return new CruiseGuestDetailType();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType }
     * 
     */
    public CruiseGuestInfoType createCruiseGuestInfoType() {
        return new CruiseGuestInfoType();
    }

    /**
     * Create an instance of {@link CruiseProfileType }
     * 
     */
    public CruiseProfileType createCruiseProfileType() {
        return new CruiseProfileType();
    }

    /**
     * Create an instance of {@link ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute }
     * 
     */
    public ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute createArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute() {
        return new ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute();
    }

    /**
     * Create an instance of {@link CabinOptionType }
     * 
     */
    public CabinOptionType createCabinOptionType() {
        return new CabinOptionType();
    }

    /**
     * Create an instance of {@link ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute }
     * 
     */
    public ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute createArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute() {
        return new ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute();
    }

    /**
     * Create an instance of {@link SailingInfoType }
     * 
     */
    public SailingInfoType createSailingInfoType() {
        return new SailingInfoType();
    }

    /**
     * Create an instance of {@link SailingType }
     * 
     */
    public SailingType createSailingType() {
        return new SailingType();
    }

    /**
     * Create an instance of {@link SailingBaseType }
     * 
     */
    public SailingBaseType createSailingBaseType() {
        return new SailingBaseType();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType }
     * 
     */
    public SailingCategoryInfoType createSailingCategoryInfoType() {
        return new SailingCategoryInfoType();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory createSailingCategoryInfoTypeSelectedCategory() {
        return new SailingCategoryInfoType.SelectedCategory();
    }

    /**
     * Create an instance of {@link VerificationType }
     * 
     */
    public VerificationType createVerificationType() {
        return new VerificationType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails createOTAPrdNotifReportRQNotifDetails() {
        return new OTAPrdNotifReportRQ.NotifDetails();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.VehNotifReport }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.VehNotifReport createOTAPrdNotifReportRQNotifDetailsVehNotifReport() {
        return new OTAPrdNotifReportRQ.NotifDetails.VehNotifReport();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.VehNotifReport.VehRes }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.VehNotifReport.VehRes createOTAPrdNotifReportRQNotifDetailsVehNotifReportVehRes() {
        return new OTAPrdNotifReportRQ.NotifDetails.VehNotifReport.VehRes();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport createOTAPrdNotifReportRQNotifDetailsHotelNotifReport() {
        return new OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents createOTAPrdNotifReportRQNotifDetailsHotelNotifReportHotelDescriptiveContents() {
        return new OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages createOTAPrdNotifReportRQNotifDetailsHotelNotifReportAvailStatusMessages() {
        return new OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages createOTAPrdNotifReportRQNotifDetailsHotelNotifReportRateAmountMessages() {
        return new OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations createOTAPrdNotifReportRQNotifDetailsHotelNotifReportHotelReservations() {
        return new OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations();
    }

    /**
     * Create an instance of {@link OTAPrdReadRQ.ReadRequests }
     * 
     */
    public OTAPrdReadRQ.ReadRequests createOTAPrdReadRQReadRequests() {
        return new OTAPrdReadRQ.ReadRequests();
    }

    /**
     * Create an instance of {@link OTAHotelRatePlanNotifRS.RatePlanCrossRefs }
     * 
     */
    public OTAHotelRatePlanNotifRS.RatePlanCrossRefs createOTAHotelRatePlanNotifRSRatePlanCrossRefs() {
        return new OTAHotelRatePlanNotifRS.RatePlanCrossRefs();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails }
     * 
     */
    public OTANotifReportRQ.NotifDetails createOTANotifReportRQNotifDetails() {
        return new OTANotifReportRQ.NotifDetails();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.VehNotifReport }
     * 
     */
    public OTANotifReportRQ.NotifDetails.VehNotifReport createOTANotifReportRQNotifDetailsVehNotifReport() {
        return new OTANotifReportRQ.NotifDetails.VehNotifReport();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes }
     * 
     */
    public OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes createOTANotifReportRQNotifDetailsVehNotifReportVehRes() {
        return new OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.HotelNotifReport }
     * 
     */
    public OTANotifReportRQ.NotifDetails.HotelNotifReport createOTANotifReportRQNotifDetailsHotelNotifReport() {
        return new OTANotifReportRQ.NotifDetails.HotelNotifReport();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents }
     * 
     */
    public OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents createOTANotifReportRQNotifDetailsHotelNotifReportHotelDescriptiveContents() {
        return new OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages }
     * 
     */
    public OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages createOTANotifReportRQNotifDetailsHotelNotifReportAvailStatusMessages() {
        return new OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages }
     * 
     */
    public OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages createOTANotifReportRQNotifDetailsHotelNotifReportRateAmountMessages() {
        return new OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations }
     * 
     */
    public OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations createOTANotifReportRQNotifDetailsHotelNotifReportHotelReservations() {
        return new OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations();
    }

    /**
     * Create an instance of {@link OTAResRetrieveRS.ReservationsList }
     * 
     */
    public OTAResRetrieveRS.ReservationsList createOTAResRetrieveRSReservationsList() {
        return new OTAResRetrieveRS.ReservationsList();
    }

    /**
     * Create an instance of {@link OTAResRetrieveRS.ReservationsList.GolfReservation }
     * 
     */
    public OTAResRetrieveRS.ReservationsList.GolfReservation createOTAResRetrieveRSReservationsListGolfReservation() {
        return new OTAResRetrieveRS.ReservationsList.GolfReservation();
    }

    /**
     * Create an instance of {@link OTAReadRQ.ReadRequests }
     * 
     */
    public OTAReadRQ.ReadRequests createOTAReadRQReadRequests() {
        return new OTAReadRQ.ReadRequests();
    }

    /**
     * Create an instance of {@link ArrayOfSourceType }
     * 
     */
    public ArrayOfSourceType createArrayOfSourceType() {
        return new ArrayOfSourceType();
    }

    /**
     * Create an instance of {@link UniqueIDType }
     * 
     */
    public UniqueIDType createUniqueIDType() {
        return new UniqueIDType();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link MessageAcknowledgementType }
     * 
     */
    public MessageAcknowledgementType createMessageAcknowledgementType() {
        return new MessageAcknowledgementType();
    }

    /**
     * Create an instance of {@link TPAExtensionsType }
     * 
     */
    public TPAExtensionsType createTPAExtensionsType() {
        return new TPAExtensionsType();
    }

    /**
     * Create an instance of {@link OTAHotelAvailNotifRQ.AvailStatusMessages }
     * 
     */
    public OTAHotelAvailNotifRQ.AvailStatusMessages createOTAHotelAvailNotifRQAvailStatusMessages() {
        return new OTAHotelAvailNotifRQ.AvailStatusMessages();
    }

    /**
     * Create an instance of {@link OTAHotelAvailNotifRS }
     * 
     */
    public OTAHotelAvailNotifRS createOTAHotelAvailNotifRS() {
        return new OTAHotelAvailNotifRS();
    }

    /**
     * Create an instance of {@link OTAHotelInvCountNotifRQ }
     * 
     */
    public OTAHotelInvCountNotifRQ createOTAHotelInvCountNotifRQ() {
        return new OTAHotelInvCountNotifRQ();
    }

    /**
     * Create an instance of {@link InvCountType }
     * 
     */
    public InvCountType createInvCountType() {
        return new InvCountType();
    }

    /**
     * Create an instance of {@link OTAHotelInvCountNotifRS }
     * 
     */
    public OTAHotelInvCountNotifRS createOTAHotelInvCountNotifRS() {
        return new OTAHotelInvCountNotifRS();
    }

    /**
     * Create an instance of {@link OTAHotelRatePlanNotifRQ.RatePlans }
     * 
     */
    public OTAHotelRatePlanNotifRQ.RatePlans createOTAHotelRatePlanNotifRQRatePlans() {
        return new OTAHotelRatePlanNotifRQ.RatePlans();
    }

    /**
     * Create an instance of {@link ArrayOfOfferType }
     * 
     */
    public ArrayOfOfferType createArrayOfOfferType() {
        return new ArrayOfOfferType();
    }

    /**
     * Create an instance of {@link OTAHotelStayInfoNotifRQ }
     * 
     */
    public OTAHotelStayInfoNotifRQ createOTAHotelStayInfoNotifRQ() {
        return new OTAHotelStayInfoNotifRQ();
    }

    /**
     * Create an instance of {@link OTAHotelStayInfoNotifRS }
     * 
     */
    public OTAHotelStayInfoNotifRS createOTAHotelStayInfoNotifRS() {
        return new OTAHotelStayInfoNotifRS();
    }

    /**
     * Create an instance of {@link OrderPaymentInfoRS }
     * 
     */
    public OrderPaymentInfoRS createOrderPaymentInfoRS() {
        return new OrderPaymentInfoRS();
    }

    /**
     * Create an instance of {@link OrderCheckInNoticeRQ }
     * 
     */
    public OrderCheckInNoticeRQ createOrderCheckInNoticeRQ() {
        return new OrderCheckInNoticeRQ();
    }

    /**
     * Create an instance of {@link OrderCheckInNoticeRS }
     * 
     */
    public OrderCheckInNoticeRS createOrderCheckInNoticeRS() {
        return new OrderCheckInNoticeRS();
    }

    /**
     * Create an instance of {@link OrderApplyPaymentRQ }
     * 
     */
    public OrderApplyPaymentRQ createOrderApplyPaymentRQ() {
        return new OrderApplyPaymentRQ();
    }

    /**
     * Create an instance of {@link OrderApplyPaymentRS }
     * 
     */
    public OrderApplyPaymentRS createOrderApplyPaymentRS() {
        return new OrderApplyPaymentRS();
    }

    /**
     * Create an instance of {@link OTAPushOrderStatusRQ }
     * 
     */
    public OTAPushOrderStatusRQ createOTAPushOrderStatusRQ() {
        return new OTAPushOrderStatusRQ();
    }

    /**
     * Create an instance of {@link OTAPushOrderStatusRS }
     * 
     */
    public OTAPushOrderStatusRS createOTAPushOrderStatusRS() {
        return new OTAPushOrderStatusRS();
    }

    /**
     * Create an instance of {@link CompanyNameType }
     * 
     */
    public CompanyNameType createCompanyNameType() {
        return new CompanyNameType();
    }

    /**
     * Create an instance of {@link TravelArrangerType }
     * 
     */
    public TravelArrangerType createTravelArrangerType() {
        return new TravelArrangerType();
    }

    /**
     * Create an instance of {@link OperatingAirlineType }
     * 
     */
    public OperatingAirlineType createOperatingAirlineType() {
        return new OperatingAirlineType();
    }

    /**
     * Create an instance of {@link CompanyNamePrefType }
     * 
     */
    public CompanyNamePrefType createCompanyNamePrefType() {
        return new CompanyNamePrefType();
    }

    /**
     * Create an instance of {@link ReservationIDType }
     * 
     */
    public ReservationIDType createReservationIDType() {
        return new ReservationIDType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link StreetNmbrType }
     * 
     */
    public StreetNmbrType createStreetNmbrType() {
        return new StreetNmbrType();
    }

    /**
     * Create an instance of {@link StateProvType }
     * 
     */
    public StateProvType createStateProvType() {
        return new StateProvType();
    }

    /**
     * Create an instance of {@link CountryNameType }
     * 
     */
    public CountryNameType createCountryNameType() {
        return new CountryNameType();
    }

    /**
     * Create an instance of {@link AddressInfoType }
     * 
     */
    public AddressInfoType createAddressInfoType() {
        return new AddressInfoType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link StationType }
     * 
     */
    public StationType createStationType() {
        return new StationType();
    }

    /**
     * Create an instance of {@link AirportPrefType }
     * 
     */
    public AirportPrefType createAirportPrefType() {
        return new AirportPrefType();
    }

    /**
     * Create an instance of {@link CruiseReservationType }
     * 
     */
    public CruiseReservationType createCruiseReservationType() {
        return new CruiseReservationType();
    }

    /**
     * Create an instance of {@link GuestTransportationType }
     * 
     */
    public GuestTransportationType createGuestTransportationType() {
        return new GuestTransportationType();
    }

    /**
     * Create an instance of {@link FormattedTextTextType }
     * 
     */
    public FormattedTextTextType createFormattedTextTextType() {
        return new FormattedTextTextType();
    }

    /**
     * Create an instance of {@link PkgCautionType }
     * 
     */
    public PkgCautionType createPkgCautionType() {
        return new PkgCautionType();
    }

    /**
     * Create an instance of {@link CoverageDetailsType }
     * 
     */
    public CoverageDetailsType createCoverageDetailsType() {
        return new CoverageDetailsType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link CertificationType }
     * 
     */
    public CertificationType createCertificationType() {
        return new CertificationType();
    }

    /**
     * Create an instance of {@link CommissionInfoType }
     * 
     */
    public CommissionInfoType createCommissionInfoType() {
        return new CommissionInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfCruiseGuestDetailType }
     * 
     */
    public ArrayOfCruiseGuestDetailType createArrayOfCruiseGuestDetailType() {
        return new ArrayOfCruiseGuestDetailType();
    }

    /**
     * Create an instance of {@link URLType }
     * 
     */
    public URLType createURLType() {
        return new URLType();
    }

    /**
     * Create an instance of {@link EmployeeInfoType }
     * 
     */
    public EmployeeInfoType createEmployeeInfoType() {
        return new EmployeeInfoType();
    }

    /**
     * Create an instance of {@link RelatedTravelerType }
     * 
     */
    public RelatedTravelerType createRelatedTravelerType() {
        return new RelatedTravelerType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link AmenityOptionType }
     * 
     */
    public AmenityOptionType createAmenityOptionType() {
        return new AmenityOptionType();
    }

    /**
     * Create an instance of {@link LocationGeneralType }
     * 
     */
    public LocationGeneralType createLocationGeneralType() {
        return new LocationGeneralType();
    }

    /**
     * Create an instance of {@link AirInfoType }
     * 
     */
    public AirInfoType createAirInfoType() {
        return new AirInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialServiceType }
     * 
     */
    public ArrayOfSpecialServiceType createArrayOfSpecialServiceType() {
        return new ArrayOfSpecialServiceType();
    }

    /**
     * Create an instance of {@link SpecialServiceType }
     * 
     */
    public SpecialServiceType createSpecialServiceType() {
        return new SpecialServiceType();
    }

    /**
     * Create an instance of {@link BankAcctType }
     * 
     */
    public BankAcctType createBankAcctType() {
        return new BankAcctType();
    }

    /**
     * Create an instance of {@link ArrayOfRoomTypeType }
     * 
     */
    public ArrayOfRoomTypeType createArrayOfRoomTypeType() {
        return new ArrayOfRoomTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfAdditionalDetailType }
     * 
     */
    public ArrayOfAdditionalDetailType createArrayOfAdditionalDetailType() {
        return new ArrayOfAdditionalDetailType();
    }

    /**
     * Create an instance of {@link AdditionalDetailType }
     * 
     */
    public AdditionalDetailType createAdditionalDetailType() {
        return new AdditionalDetailType();
    }

    /**
     * Create an instance of {@link ArrayOfRoomAmenityPrefType }
     * 
     */
    public ArrayOfRoomAmenityPrefType createArrayOfRoomAmenityPrefType() {
        return new ArrayOfRoomAmenityPrefType();
    }

    /**
     * Create an instance of {@link RoomAmenityPrefType }
     * 
     */
    public RoomAmenityPrefType createRoomAmenityPrefType() {
        return new RoomAmenityPrefType();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlanType }
     * 
     */
    public ArrayOfRatePlanType createArrayOfRatePlanType() {
        return new ArrayOfRatePlanType();
    }

    /**
     * Create an instance of {@link CancelPenaltiesType }
     * 
     */
    public CancelPenaltiesType createCancelPenaltiesType() {
        return new CancelPenaltiesType();
    }

    /**
     * Create an instance of {@link AmountPercentType }
     * 
     */
    public AmountPercentType createAmountPercentType() {
        return new AmountPercentType();
    }

    /**
     * Create an instance of {@link TaxesType }
     * 
     */
    public TaxesType createTaxesType() {
        return new TaxesType();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link TotalType }
     * 
     */
    public TotalType createTotalType() {
        return new TotalType();
    }

    /**
     * Create an instance of {@link ota.jw.PMSGateway.DiscountType }
     * 
     */
    public ota.jw.PMSGateway.DiscountType createDiscountType() {
        return new ota.jw.PMSGateway.DiscountType();
    }

    /**
     * Create an instance of {@link AdditionalGuestAmountType }
     * 
     */
    public AdditionalGuestAmountType createAdditionalGuestAmountType() {
        return new AdditionalGuestAmountType();
    }

    /**
     * Create an instance of {@link ArrayOfFeeType }
     * 
     */
    public ArrayOfFeeType createArrayOfFeeType() {
        return new ArrayOfFeeType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentFormType }
     * 
     */
    public ArrayOfPaymentFormType createArrayOfPaymentFormType() {
        return new ArrayOfPaymentFormType();
    }

    /**
     * Create an instance of {@link TimeInstantType }
     * 
     */
    public TimeInstantType createTimeInstantType() {
        return new TimeInstantType();
    }

    /**
     * Create an instance of {@link ArrayOfVendorMessageType }
     * 
     */
    public ArrayOfVendorMessageType createArrayOfVendorMessageType() {
        return new ArrayOfVendorMessageType();
    }

    /**
     * Create an instance of {@link VendorMessageType }
     * 
     */
    public VendorMessageType createVendorMessageType() {
        return new VendorMessageType();
    }

    /**
     * Create an instance of {@link FormattedTextType }
     * 
     */
    public FormattedTextType createFormattedTextType() {
        return new FormattedTextType();
    }

    /**
     * Create an instance of {@link FormattedTextSubSectionType }
     * 
     */
    public FormattedTextSubSectionType createFormattedTextSubSectionType() {
        return new FormattedTextSubSectionType();
    }

    /**
     * Create an instance of {@link VehicleLocationInformationType }
     * 
     */
    public VehicleLocationInformationType createVehicleLocationInformationType() {
        return new VehicleLocationInformationType();
    }

    /**
     * Create an instance of {@link RelativePositionType }
     * 
     */
    public RelativePositionType createRelativePositionType() {
        return new RelativePositionType();
    }

    /**
     * Create an instance of {@link TransportationsType }
     * 
     */
    public TransportationsType createTransportationsType() {
        return new TransportationsType();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionsType }
     * 
     */
    public MultimediaDescriptionsType createMultimediaDescriptionsType() {
        return new MultimediaDescriptionsType();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionType }
     * 
     */
    public MultimediaDescriptionType createMultimediaDescriptionType() {
        return new MultimediaDescriptionType();
    }

    /**
     * Create an instance of {@link VideoItemType }
     * 
     */
    public VideoItemType createVideoItemType() {
        return new VideoItemType();
    }

    /**
     * Create an instance of {@link ImageItemType }
     * 
     */
    public ImageItemType createImageItemType() {
        return new ImageItemType();
    }

    /**
     * Create an instance of {@link OperationSchedulesType }
     * 
     */
    public OperationSchedulesType createOperationSchedulesType() {
        return new OperationSchedulesType();
    }

    /**
     * Create an instance of {@link OperationScheduleType }
     * 
     */
    public OperationScheduleType createOperationScheduleType() {
        return new OperationScheduleType();
    }

    /**
     * Create an instance of {@link OperationSchedulePlusChargeType }
     * 
     */
    public OperationSchedulePlusChargeType createOperationSchedulePlusChargeType() {
        return new OperationSchedulePlusChargeType();
    }

    /**
     * Create an instance of {@link PeriodPriceType }
     * 
     */
    public PeriodPriceType createPeriodPriceType() {
        return new PeriodPriceType();
    }

    /**
     * Create an instance of {@link PkgPriceType }
     * 
     */
    public PkgPriceType createPkgPriceType() {
        return new PkgPriceType();
    }

    /**
     * Create an instance of {@link ResGuestRPHsType }
     * 
     */
    public ResGuestRPHsType createResGuestRPHsType() {
        return new ResGuestRPHsType();
    }

    /**
     * Create an instance of {@link ResGuestRPHsTypeResGuestRPH }
     * 
     */
    public ResGuestRPHsTypeResGuestRPH createResGuestRPHsTypeResGuestRPH() {
        return new ResGuestRPHsTypeResGuestRPH();
    }

    /**
     * Create an instance of {@link ArrayOfUniqueIDType }
     * 
     */
    public ArrayOfUniqueIDType createArrayOfUniqueIDType() {
        return new ArrayOfUniqueIDType();
    }

    /**
     * Create an instance of {@link ArrayOfProfileType }
     * 
     */
    public ArrayOfProfileType createArrayOfProfileType() {
        return new ArrayOfProfileType();
    }

    /**
     * Create an instance of {@link NamePrefType }
     * 
     */
    public NamePrefType createNamePrefType() {
        return new NamePrefType();
    }

    /**
     * Create an instance of {@link AddressPrefType }
     * 
     */
    public AddressPrefType createAddressPrefType() {
        return new AddressPrefType();
    }

    /**
     * Create an instance of {@link PaymentFormPrefType }
     * 
     */
    public PaymentFormPrefType createPaymentFormPrefType() {
        return new PaymentFormPrefType();
    }

    /**
     * Create an instance of {@link InterestPrefType }
     * 
     */
    public InterestPrefType createInterestPrefType() {
        return new InterestPrefType();
    }

    /**
     * Create an instance of {@link InsurancePrefType }
     * 
     */
    public InsurancePrefType createInsurancePrefType() {
        return new InsurancePrefType();
    }

    /**
     * Create an instance of {@link SeatingPrefType }
     * 
     */
    public SeatingPrefType createSeatingPrefType() {
        return new SeatingPrefType();
    }

    /**
     * Create an instance of {@link TicketDistribPrefType }
     * 
     */
    public TicketDistribPrefType createTicketDistribPrefType() {
        return new TicketDistribPrefType();
    }

    /**
     * Create an instance of {@link MediaEntertainPrefType }
     * 
     */
    public MediaEntertainPrefType createMediaEntertainPrefType() {
        return new MediaEntertainPrefType();
    }

    /**
     * Create an instance of {@link PetInfoPrefType }
     * 
     */
    public PetInfoPrefType createPetInfoPrefType() {
        return new PetInfoPrefType();
    }

    /**
     * Create an instance of {@link MealPrefType }
     * 
     */
    public MealPrefType createMealPrefType() {
        return new MealPrefType();
    }

    /**
     * Create an instance of {@link LoyaltyPrefType }
     * 
     */
    public LoyaltyPrefType createLoyaltyPrefType() {
        return new LoyaltyPrefType();
    }

    /**
     * Create an instance of {@link SpecRequestPrefType }
     * 
     */
    public SpecRequestPrefType createSpecRequestPrefType() {
        return new SpecRequestPrefType();
    }

    /**
     * Create an instance of {@link RelatedTravelerPrefType }
     * 
     */
    public RelatedTravelerPrefType createRelatedTravelerPrefType() {
        return new RelatedTravelerPrefType();
    }

    /**
     * Create an instance of {@link VehicleSpecialReqPrefType }
     * 
     */
    public VehicleSpecialReqPrefType createVehicleSpecialReqPrefType() {
        return new VehicleSpecialReqPrefType();
    }

    /**
     * Create an instance of {@link EquipmentTypePref }
     * 
     */
    public EquipmentTypePref createEquipmentTypePref() {
        return new EquipmentTypePref();
    }

    /**
     * Create an instance of {@link EquipmentType }
     * 
     */
    public EquipmentType createEquipmentType() {
        return new EquipmentType();
    }

    /**
     * Create an instance of {@link HotelPrefType }
     * 
     */
    public HotelPrefType createHotelPrefType() {
        return new HotelPrefType();
    }

    /**
     * Create an instance of {@link PropertyNamePrefType }
     * 
     */
    public PropertyNamePrefType createPropertyNamePrefType() {
        return new PropertyNamePrefType();
    }

    /**
     * Create an instance of {@link PropertyLocationPrefType }
     * 
     */
    public PropertyLocationPrefType createPropertyLocationPrefType() {
        return new PropertyLocationPrefType();
    }

    /**
     * Create an instance of {@link PropertyTypePrefType }
     * 
     */
    public PropertyTypePrefType createPropertyTypePrefType() {
        return new PropertyTypePrefType();
    }

    /**
     * Create an instance of {@link PropertyClassPrefType }
     * 
     */
    public PropertyClassPrefType createPropertyClassPrefType() {
        return new PropertyClassPrefType();
    }

    /**
     * Create an instance of {@link PropertyAmenityPrefType }
     * 
     */
    public PropertyAmenityPrefType createPropertyAmenityPrefType() {
        return new PropertyAmenityPrefType();
    }

    /**
     * Create an instance of {@link RoomLocationPrefType }
     * 
     */
    public RoomLocationPrefType createRoomLocationPrefType() {
        return new RoomLocationPrefType();
    }

    /**
     * Create an instance of {@link BedTypePrefType }
     * 
     */
    public BedTypePrefType createBedTypePrefType() {
        return new BedTypePrefType();
    }

    /**
     * Create an instance of {@link FoodSrvcPrefType }
     * 
     */
    public FoodSrvcPrefType createFoodSrvcPrefType() {
        return new FoodSrvcPrefType();
    }

    /**
     * Create an instance of {@link RecreationSrvcPrefType }
     * 
     */
    public RecreationSrvcPrefType createRecreationSrvcPrefType() {
        return new RecreationSrvcPrefType();
    }

    /**
     * Create an instance of {@link BusinessSrvcPrefType }
     * 
     */
    public BusinessSrvcPrefType createBusinessSrvcPrefType() {
        return new BusinessSrvcPrefType();
    }

    /**
     * Create an instance of {@link PersonalSrvcPrefType }
     * 
     */
    public PersonalSrvcPrefType createPersonalSrvcPrefType() {
        return new PersonalSrvcPrefType();
    }

    /**
     * Create an instance of {@link SecurityFeaturePrefType }
     * 
     */
    public SecurityFeaturePrefType createSecurityFeaturePrefType() {
        return new SecurityFeaturePrefType();
    }

    /**
     * Create an instance of {@link PhysChallFeaturePrefType }
     * 
     */
    public PhysChallFeaturePrefType createPhysChallFeaturePrefType() {
        return new PhysChallFeaturePrefType();
    }

    /**
     * Create an instance of {@link OtherSrvcPrefType }
     * 
     */
    public OtherSrvcPrefType createOtherSrvcPrefType() {
        return new OtherSrvcPrefType();
    }

    /**
     * Create an instance of {@link LoyaltyProgramType }
     * 
     */
    public LoyaltyProgramType createLoyaltyProgramType() {
        return new LoyaltyProgramType();
    }

    /**
     * Create an instance of {@link AffiliationsType }
     * 
     */
    public AffiliationsType createAffiliationsType() {
        return new AffiliationsType();
    }

    /**
     * Create an instance of {@link EmployerType }
     * 
     */
    public EmployerType createEmployerType() {
        return new EmployerType();
    }

    /**
     * Create an instance of {@link InsuranceType }
     * 
     */
    public InsuranceType createInsuranceType() {
        return new InsuranceType();
    }

    /**
     * Create an instance of {@link ArrayOfServiceType }
     * 
     */
    public ArrayOfServiceType createArrayOfServiceType() {
        return new ArrayOfServiceType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link ResGlobalInfoType }
     * 
     */
    public ResGlobalInfoType createResGlobalInfoType() {
        return new ResGlobalInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfResGuestType }
     * 
     */
    public ArrayOfResGuestType createArrayOfResGuestType() {
        return new ArrayOfResGuestType();
    }

    /**
     * Create an instance of {@link ResGuestType }
     * 
     */
    public ResGuestType createResGuestType() {
        return new ResGuestType();
    }

    /**
     * Create an instance of {@link WrittenConfInstType }
     * 
     */
    public WrittenConfInstType createWrittenConfInstType() {
        return new WrittenConfInstType();
    }

    /**
     * Create an instance of {@link ArrayOfFeeType1 }
     * 
     */
    public ArrayOfFeeType1 createArrayOfFeeType1() {
        return new ArrayOfFeeType1();
    }

    /**
     * Create an instance of {@link ArrayOfSeatAvailabilityType }
     * 
     */
    public ArrayOfSeatAvailabilityType createArrayOfSeatAvailabilityType() {
        return new ArrayOfSeatAvailabilityType();
    }

    /**
     * Create an instance of {@link SeatAvailabilityType }
     * 
     */
    public SeatAvailabilityType createSeatAvailabilityType() {
        return new SeatAvailabilityType();
    }

    /**
     * Create an instance of {@link TrainIdentificationType }
     * 
     */
    public TrainIdentificationType createTrainIdentificationType() {
        return new TrainIdentificationType();
    }

    /**
     * Create an instance of {@link NetworkCodeType }
     * 
     */
    public NetworkCodeType createNetworkCodeType() {
        return new NetworkCodeType();
    }

    /**
     * Create an instance of {@link RailPassengerCategoryDetailType }
     * 
     */
    public RailPassengerCategoryDetailType createRailPassengerCategoryDetailType() {
        return new RailPassengerCategoryDetailType();
    }

    /**
     * Create an instance of {@link RailPassengerOccupationType }
     * 
     */
    public RailPassengerOccupationType createRailPassengerOccupationType() {
        return new RailPassengerOccupationType();
    }

    /**
     * Create an instance of {@link TravelPurposeType }
     * 
     */
    public TravelPurposeType createTravelPurposeType() {
        return new TravelPurposeType();
    }

    /**
     * Create an instance of {@link RateAmountMessageType }
     * 
     */
    public RateAmountMessageType createRateAmountMessageType() {
        return new RateAmountMessageType();
    }

    /**
     * Create an instance of {@link StatusApplicationControlType }
     * 
     */
    public StatusApplicationControlType createStatusApplicationControlType() {
        return new StatusApplicationControlType();
    }

    /**
     * Create an instance of {@link ArrayOfGuaranteeType }
     * 
     */
    public ArrayOfGuaranteeType createArrayOfGuaranteeType() {
        return new ArrayOfGuaranteeType();
    }

    /**
     * Create an instance of {@link ArrayOfDateTimeSpanType }
     * 
     */
    public ArrayOfDateTimeSpanType createArrayOfDateTimeSpanType() {
        return new ArrayOfDateTimeSpanType();
    }

    /**
     * Create an instance of {@link ArrayOfRelativePositionType }
     * 
     */
    public ArrayOfRelativePositionType createArrayOfRelativePositionType() {
        return new ArrayOfRelativePositionType();
    }

    /**
     * Create an instance of {@link ContactInfoRootType }
     * 
     */
    public ContactInfoRootType createContactInfoRootType() {
        return new ContactInfoRootType();
    }

    /**
     * Create an instance of {@link ArrayOfWeatherInfoType }
     * 
     */
    public ArrayOfWeatherInfoType createArrayOfWeatherInfoType() {
        return new ArrayOfWeatherInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfMeetingRoomCodeType }
     * 
     */
    public ArrayOfMeetingRoomCodeType createArrayOfMeetingRoomCodeType() {
        return new ArrayOfMeetingRoomCodeType();
    }

    /**
     * Create an instance of {@link MeetingRoomCodeType }
     * 
     */
    public MeetingRoomCodeType createMeetingRoomCodeType() {
        return new MeetingRoomCodeType();
    }

    /**
     * Create an instance of {@link ArrayOfMeetingRoomCapacityType }
     * 
     */
    public ArrayOfMeetingRoomCapacityType createArrayOfMeetingRoomCapacityType() {
        return new ArrayOfMeetingRoomCapacityType();
    }

    /**
     * Create an instance of {@link ArrayOfContactInfoRootType }
     * 
     */
    public ArrayOfContactInfoRootType createArrayOfContactInfoRootType() {
        return new ArrayOfContactInfoRootType();
    }

    /**
     * Create an instance of {@link ArrayOfFeeType2 }
     * 
     */
    public ArrayOfFeeType2 createArrayOfFeeType2() {
        return new ArrayOfFeeType2();
    }

    /**
     * Create an instance of {@link ArrayOfDateTimeSpanType1 }
     * 
     */
    public ArrayOfDateTimeSpanType1 createArrayOfDateTimeSpanType1() {
        return new ArrayOfDateTimeSpanType1();
    }

    /**
     * Create an instance of {@link ArrayOfParagraphType }
     * 
     */
    public ArrayOfParagraphType createArrayOfParagraphType() {
        return new ArrayOfParagraphType();
    }

    /**
     * Create an instance of {@link VehicleResRSCoreType }
     * 
     */
    public VehicleResRSCoreType createVehicleResRSCoreType() {
        return new VehicleResRSCoreType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleChargePurposeType }
     * 
     */
    public ArrayOfVehicleChargePurposeType createArrayOfVehicleChargePurposeType() {
        return new ArrayOfVehicleChargePurposeType();
    }

    /**
     * Create an instance of {@link VehicleChargePurposeType }
     * 
     */
    public VehicleChargePurposeType createVehicleChargePurposeType() {
        return new VehicleChargePurposeType();
    }

    /**
     * Create an instance of {@link RateQualifierType }
     * 
     */
    public RateQualifierType createRateQualifierType() {
        return new RateQualifierType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleEquipmentPricedType }
     * 
     */
    public ArrayOfVehicleEquipmentPricedType createArrayOfVehicleEquipmentPricedType() {
        return new ArrayOfVehicleEquipmentPricedType();
    }

    /**
     * Create an instance of {@link VehicleEquipmentPricedType }
     * 
     */
    public VehicleEquipmentPricedType createVehicleEquipmentPricedType() {
        return new VehicleEquipmentPricedType();
    }

    /**
     * Create an instance of {@link VehicleEquipmentType }
     * 
     */
    public VehicleEquipmentType createVehicleEquipmentType() {
        return new VehicleEquipmentType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleChargePurposeType1 }
     * 
     */
    public ArrayOfVehicleChargePurposeType1 createArrayOfVehicleChargePurposeType1() {
        return new ArrayOfVehicleChargePurposeType1();
    }

    /**
     * Create an instance of {@link VehicleSegmentAdditionalInfoType }
     * 
     */
    public VehicleSegmentAdditionalInfoType createVehicleSegmentAdditionalInfoType() {
        return new VehicleSegmentAdditionalInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfMonetaryRuleType }
     * 
     */
    public ArrayOfMonetaryRuleType createArrayOfMonetaryRuleType() {
        return new ArrayOfMonetaryRuleType();
    }

    /**
     * Create an instance of {@link MonetaryRuleType }
     * 
     */
    public MonetaryRuleType createMonetaryRuleType() {
        return new MonetaryRuleType();
    }

    /**
     * Create an instance of {@link ArrayOfCoveragePricedType }
     * 
     */
    public ArrayOfCoveragePricedType createArrayOfCoveragePricedType() {
        return new ArrayOfCoveragePricedType();
    }

    /**
     * Create an instance of {@link CoveragePricedType }
     * 
     */
    public CoveragePricedType createCoveragePricedType() {
        return new CoveragePricedType();
    }

    /**
     * Create an instance of {@link CoverageType }
     * 
     */
    public CoverageType createCoverageType() {
        return new CoverageType();
    }

    /**
     * Create an instance of {@link DeductibleType }
     * 
     */
    public DeductibleType createDeductibleType() {
        return new DeductibleType();
    }

    /**
     * Create an instance of {@link OffLocationServicePricedType }
     * 
     */
    public OffLocationServicePricedType createOffLocationServicePricedType() {
        return new OffLocationServicePricedType();
    }

    /**
     * Create an instance of {@link ArrayOfFormattedTextType }
     * 
     */
    public ArrayOfFormattedTextType createArrayOfFormattedTextType() {
        return new ArrayOfFormattedTextType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleLocationInformationType }
     * 
     */
    public ArrayOfVehicleLocationInformationType createArrayOfVehicleLocationInformationType() {
        return new ArrayOfVehicleLocationInformationType();
    }

    /**
     * Create an instance of {@link VehicleWhereAtFacilityType }
     * 
     */
    public VehicleWhereAtFacilityType createVehicleWhereAtFacilityType() {
        return new VehicleWhereAtFacilityType();
    }

    /**
     * Create an instance of {@link VehicleTourInfoType }
     * 
     */
    public VehicleTourInfoType createVehicleTourInfoType() {
        return new VehicleTourInfoType();
    }

    /**
     * Create an instance of {@link VehicleArrivalDetailsType }
     * 
     */
    public VehicleArrivalDetailsType createVehicleArrivalDetailsType() {
        return new VehicleArrivalDetailsType();
    }

    /**
     * Create an instance of {@link VehicleResRSAdditionalInfoType }
     * 
     */
    public VehicleResRSAdditionalInfoType createVehicleResRSAdditionalInfoType() {
        return new VehicleResRSAdditionalInfoType();
    }

    /**
     * Create an instance of {@link FeesType }
     * 
     */
    public FeesType createFeesType() {
        return new FeesType();
    }

    /**
     * Create an instance of {@link StayInfosType }
     * 
     */
    public StayInfosType createStayInfosType() {
        return new StayInfosType();
    }

    /**
     * Create an instance of {@link StayInfoType }
     * 
     */
    public StayInfoType createStayInfoType() {
        return new StayInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfOrderPaymentInfo }
     * 
     */
    public ArrayOfOrderPaymentInfo createArrayOfOrderPaymentInfo() {
        return new ArrayOfOrderPaymentInfo();
    }

    /**
     * Create an instance of {@link OrderPaymentInfo }
     * 
     */
    public OrderPaymentInfo createOrderPaymentInfo() {
        return new OrderPaymentInfo();
    }

    /**
     * Create an instance of {@link ArrayOfOrderCheckIn }
     * 
     */
    public ArrayOfOrderCheckIn createArrayOfOrderCheckIn() {
        return new ArrayOfOrderCheckIn();
    }

    /**
     * Create an instance of {@link OrderCheckIn }
     * 
     */
    public OrderCheckIn createOrderCheckIn() {
        return new OrderCheckIn();
    }

    /**
     * Create an instance of {@link OrderApplyPaymentRequestList }
     * 
     */
    public OrderApplyPaymentRequestList createOrderApplyPaymentRequestList() {
        return new OrderApplyPaymentRequestList();
    }

    /**
     * Create an instance of {@link ArrayOfOrderApplyPaymentRequest }
     * 
     */
    public ArrayOfOrderApplyPaymentRequest createArrayOfOrderApplyPaymentRequest() {
        return new ArrayOfOrderApplyPaymentRequest();
    }

    /**
     * Create an instance of {@link OrderApplyPaymentRequest }
     * 
     */
    public OrderApplyPaymentRequest createOrderApplyPaymentRequest() {
        return new OrderApplyPaymentRequest();
    }

    /**
     * Create an instance of {@link OrderStatusBaseInfo }
     * 
     */
    public OrderStatusBaseInfo createOrderStatusBaseInfo() {
        return new OrderStatusBaseInfo();
    }

    /**
     * Create an instance of {@link ArrayOfOrderEntity }
     * 
     */
    public ArrayOfOrderEntity createArrayOfOrderEntity() {
        return new ArrayOfOrderEntity();
    }

    /**
     * Create an instance of {@link OrderEntity }
     * 
     */
    public OrderEntity createOrderEntity() {
        return new OrderEntity();
    }

    /**
     * Create an instance of {@link RefuseMessage }
     * 
     */
    public RefuseMessage createRefuseMessage() {
        return new RefuseMessage();
    }

    /**
     * Create an instance of {@link HTNGPaymentCardType }
     * 
     */
    public HTNGPaymentCardType createHTNGPaymentCardType() {
        return new HTNGPaymentCardType();
    }

    /**
     * Create an instance of {@link HTNGBasicOrSuiteRoomType }
     * 
     */
    public HTNGBasicOrSuiteRoomType createHTNGBasicOrSuiteRoomType() {
        return new HTNGBasicOrSuiteRoomType();
    }

    /**
     * Create an instance of {@link ArrayOfHTNGComponentRoomType }
     * 
     */
    public ArrayOfHTNGComponentRoomType createArrayOfHTNGComponentRoomType() {
        return new ArrayOfHTNGComponentRoomType();
    }

    /**
     * Create an instance of {@link ArrayOfHTNGDeviceHealthType }
     * 
     */
    public ArrayOfHTNGDeviceHealthType createArrayOfHTNGDeviceHealthType() {
        return new ArrayOfHTNGDeviceHealthType();
    }

    /**
     * Create an instance of {@link HTNGDeviceHealthType }
     * 
     */
    public HTNGDeviceHealthType createHTNGDeviceHealthType() {
        return new HTNGDeviceHealthType();
    }

    /**
     * Create an instance of {@link HTNGHealthStatusType }
     * 
     */
    public HTNGHealthStatusType createHTNGHealthStatusType() {
        return new HTNGHealthStatusType();
    }

    /**
     * Create an instance of {@link ArrayOfString2 }
     * 
     */
    public ArrayOfString2 createArrayOfString2() {
        return new ArrayOfString2();
    }

    /**
     * Create an instance of {@link HTNGRoomElementType }
     * 
     */
    public HTNGRoomElementType createHTNGRoomElementType() {
        return new HTNGRoomElementType();
    }

    /**
     * Create an instance of {@link HTNGExtendedPrice }
     * 
     */
    public HTNGExtendedPrice createHTNGExtendedPrice() {
        return new HTNGExtendedPrice();
    }

    /**
     * Create an instance of {@link HTNGComponentRoomType.RoomType }
     * 
     */
    public HTNGComponentRoomType.RoomType createHTNGComponentRoomTypeRoomType() {
        return new HTNGComponentRoomType.RoomType();
    }

    /**
     * Create an instance of {@link RoomTypeType.Occupancy }
     * 
     */
    public RoomTypeType.Occupancy createRoomTypeTypeOccupancy() {
        return new RoomTypeType.Occupancy();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardIssuerName }
     * 
     */
    public PaymentCardType.CardIssuerName createPaymentCardTypeCardIssuerName() {
        return new PaymentCardType.CardIssuerName();
    }

    /**
     * Create an instance of {@link PaymentCardType.Telephone }
     * 
     */
    public PaymentCardType.Telephone createPaymentCardTypeTelephone() {
        return new PaymentCardType.Telephone();
    }

    /**
     * Create an instance of {@link PaymentCardType.CustLoyalty }
     * 
     */
    public PaymentCardType.CustLoyalty createPaymentCardTypeCustLoyalty() {
        return new PaymentCardType.CustLoyalty();
    }

    /**
     * Create an instance of {@link PaymentCardType.SignatureOnFile }
     * 
     */
    public PaymentCardType.SignatureOnFile createPaymentCardTypeSignatureOnFile() {
        return new PaymentCardType.SignatureOnFile();
    }

    /**
     * Create an instance of {@link PaymentCardType.MagneticStripe }
     * 
     */
    public PaymentCardType.MagneticStripe createPaymentCardTypeMagneticStripe() {
        return new PaymentCardType.MagneticStripe();
    }

    /**
     * Create an instance of {@link ArrayOfGuestRoomTypeAmenity.Amenity }
     * 
     */
    public ArrayOfGuestRoomTypeAmenity.Amenity createArrayOfGuestRoomTypeAmenityAmenity() {
        return new ArrayOfGuestRoomTypeAmenity.Amenity();
    }

    /**
     * Create an instance of {@link GuestRoomType.Quantities }
     * 
     */
    public GuestRoomType.Quantities createGuestRoomTypeQuantities() {
        return new GuestRoomType.Quantities();
    }

    /**
     * Create an instance of {@link GuestRoomType.Occupancy }
     * 
     */
    public GuestRoomType.Occupancy createGuestRoomTypeOccupancy() {
        return new GuestRoomType.Occupancy();
    }

    /**
     * Create an instance of {@link GuestRoomType.Room }
     * 
     */
    public GuestRoomType.Room createGuestRoomTypeRoom() {
        return new GuestRoomType.Room();
    }

    /**
     * Create an instance of {@link GuestRoomType.RoomLevelFees }
     * 
     */
    public GuestRoomType.RoomLevelFees createGuestRoomTypeRoomLevelFees() {
        return new GuestRoomType.RoomLevelFees();
    }

    /**
     * Create an instance of {@link ArrayOfSellableProductsTypeSellableProductDestinationSystemCode.DestinationSystemCode }
     * 
     */
    public ArrayOfSellableProductsTypeSellableProductDestinationSystemCode.DestinationSystemCode createArrayOfSellableProductsTypeSellableProductDestinationSystemCodeDestinationSystemCode() {
        return new ArrayOfSellableProductsTypeSellableProductDestinationSystemCode.DestinationSystemCode();
    }

    /**
     * Create an instance of {@link ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock }
     * 
     */
    public ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock createArrayOfSellableProductsTypeSellableProductSellableProductInventoryBlock() {
        return new ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeRatePlanShoulder.RatePlanShoulder }
     * 
     */
    public ArrayOfHotelRatePlanTypeRatePlanShoulder.RatePlanShoulder createArrayOfHotelRatePlanTypeRatePlanShoulderRatePlanShoulder() {
        return new ArrayOfHotelRatePlanTypeRatePlanShoulder.RatePlanShoulder();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeGuest.Guest }
     * 
     */
    public ArrayOfOfferTypeGuest.Guest createArrayOfOfferTypeGuestGuest() {
        return new ArrayOfOfferTypeGuest.Guest();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeInventory.Inventory }
     * 
     */
    public ArrayOfOfferTypeInventory.Inventory createArrayOfOfferTypeInventoryInventory() {
        return new ArrayOfOfferTypeInventory.Inventory();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeCompatibleOffer.CompatibleOffer }
     * 
     */
    public ArrayOfOfferTypeCompatibleOffer.CompatibleOffer createArrayOfOfferTypeCompatibleOfferCompatibleOffer() {
        return new ArrayOfOfferTypeCompatibleOffer.CompatibleOffer();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeOfferRuleInventory.Inventory }
     * 
     */
    public ArrayOfOfferTypeOfferRuleInventory.Inventory createArrayOfOfferTypeOfferRuleInventoryInventory() {
        return new ArrayOfOfferTypeOfferRuleInventory.Inventory();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeOfferRule.OfferRule.DateRestriction }
     * 
     */
    public ArrayOfOfferTypeOfferRule.OfferRule.DateRestriction createArrayOfOfferTypeOfferRuleOfferRuleDateRestriction() {
        return new ArrayOfOfferTypeOfferRule.OfferRule.DateRestriction();
    }

    /**
     * Create an instance of {@link ArrayOfOfferTypeOfferRule.OfferRule.Occupancy }
     * 
     */
    public ArrayOfOfferTypeOfferRule.OfferRule.Occupancy createArrayOfOfferTypeOfferRuleOfferRuleOccupancy() {
        return new ArrayOfOfferTypeOfferRule.OfferRule.Occupancy();
    }

    /**
     * Create an instance of {@link OfferType.Discount }
     * 
     */
    public OfferType.Discount createOfferTypeDiscount() {
        return new OfferType.Discount();
    }

    /**
     * Create an instance of {@link OfferType.FreeUpgrade.UpgradeFrom }
     * 
     */
    public OfferType.FreeUpgrade.UpgradeFrom createOfferTypeFreeUpgradeUpgradeFrom() {
        return new OfferType.FreeUpgrade.UpgradeFrom();
    }

    /**
     * Create an instance of {@link OfferType.FreeUpgrade.UpgradeTo }
     * 
     */
    public OfferType.FreeUpgrade.UpgradeTo createOfferTypeFreeUpgradeUpgradeTo() {
        return new OfferType.FreeUpgrade.UpgradeTo();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeOffer.Offer }
     * 
     */
    public ArrayOfHotelRatePlanTypeOffer.Offer createArrayOfHotelRatePlanTypeOfferOffer() {
        return new ArrayOfHotelRatePlanTypeOffer.Offer();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeSupplement.Supplement.RoomCompanions }
     * 
     */
    public ArrayOfHotelRatePlanTypeSupplement.Supplement.RoomCompanions createArrayOfHotelRatePlanTypeSupplementSupplementRoomCompanions() {
        return new ArrayOfHotelRatePlanTypeSupplement.Supplement.RoomCompanions();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeSupplement.Supplement.PrerequisiteInventory }
     * 
     */
    public ArrayOfHotelRatePlanTypeSupplement.Supplement.PrerequisiteInventory createArrayOfHotelRatePlanTypeSupplementSupplementPrerequisiteInventory() {
        return new ArrayOfHotelRatePlanTypeSupplement.Supplement.PrerequisiteInventory();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeRate.Rate }
     * 
     */
    public ArrayOfHotelRatePlanTypeRate.Rate createArrayOfHotelRatePlanTypeRateRate() {
        return new ArrayOfHotelRatePlanTypeRate.Rate();
    }

    /**
     * Create an instance of {@link RateUploadType.MealsIncluded }
     * 
     */
    public RateUploadType.MealsIncluded createRateUploadTypeMealsIncluded() {
        return new RateUploadType.MealsIncluded();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.RestrictionStatus }
     * 
     */
    public BookingRulesType.BookingRule.RestrictionStatus createBookingRulesTypeBookingRuleRestrictionStatus() {
        return new BookingRulesType.BookingRule.RestrictionStatus();
    }

    /**
     * Create an instance of {@link BookingRulesType.BookingRule.CheckoutCharge }
     * 
     */
    public BookingRulesType.BookingRule.CheckoutCharge createBookingRulesTypeBookingRuleCheckoutCharge() {
        return new BookingRulesType.BookingRule.CheckoutCharge();
    }

    /**
     * Create an instance of {@link ArrayOfHotelRatePlanTypeDestinationSystemCode.DestinationSystemCode }
     * 
     */
    public ArrayOfHotelRatePlanTypeDestinationSystemCode.DestinationSystemCode createArrayOfHotelRatePlanTypeDestinationSystemCodeDestinationSystemCode() {
        return new ArrayOfHotelRatePlanTypeDestinationSystemCode.DestinationSystemCode();
    }

    /**
     * Create an instance of {@link HotelRatePlanType.HotelRef }
     * 
     */
    public HotelRatePlanType.HotelRef createHotelRatePlanTypeHotelRef() {
        return new HotelRatePlanType.HotelRef();
    }

    /**
     * Create an instance of {@link HotelRatePlanType.RatePlanLevelFee.Fee }
     * 
     */
    public HotelRatePlanType.RatePlanLevelFee.Fee createHotelRatePlanTypeRatePlanLevelFeeFee() {
        return new HotelRatePlanType.RatePlanLevelFee.Fee();
    }

    /**
     * Create an instance of {@link HotelRatePlanType.BookingRules.InventoryInfo }
     * 
     */
    public HotelRatePlanType.BookingRules.InventoryInfo createHotelRatePlanTypeBookingRulesInventoryInfo() {
        return new HotelRatePlanType.BookingRules.InventoryInfo();
    }

    /**
     * Create an instance of {@link ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff }
     * 
     */
    public ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff createArrayOfBaseInvCountTypeInvCountInvCountInvBlockCutoff() {
        return new ArrayOfBaseInvCountTypeInvCount.InvCount.InvBlockCutoff();
    }

    /**
     * Create an instance of {@link BaseInvCountType.OffSell }
     * 
     */
    public BaseInvCountType.OffSell createBaseInvCountTypeOffSell() {
        return new BaseInvCountType.OffSell();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation.OneWayDropLocation }
     * 
     */
    public ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation.OneWayDropLocation createArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocationOneWayDropLocation() {
        return new ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation.OneWayDropLocation();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo.ShuttleInfo }
     * 
     */
    public ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo.ShuttleInfo createArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfoShuttleInfo() {
        return new ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo.ShuttleInfo();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType.Shuttle }
     * 
     */
    public VehicleLocationAdditionalDetailsType.Shuttle createVehicleLocationAdditionalDetailsTypeShuttle() {
        return new VehicleLocationAdditionalDetailsType.Shuttle();
    }

    /**
     * Create an instance of {@link VehicleLocationDetailsType.Telephone }
     * 
     */
    public VehicleLocationDetailsType.Telephone createVehicleLocationDetailsTypeTelephone() {
        return new VehicleLocationDetailsType.Telephone();
    }

    /**
     * Create an instance of {@link OffLocationServiceCoreType.Address }
     * 
     */
    public OffLocationServiceCoreType.Address createOffLocationServiceCoreTypeAddress() {
        return new OffLocationServiceCoreType.Address();
    }

    /**
     * Create an instance of {@link AddressType.StreetNmbr }
     * 
     */
    public AddressType.StreetNmbr createAddressTypeStreetNmbr() {
        return new AddressType.StreetNmbr();
    }

    /**
     * Create an instance of {@link AddressType.BldgRoom }
     * 
     */
    public AddressType.BldgRoom createAddressTypeBldgRoom() {
        return new AddressType.BldgRoom();
    }

    /**
     * Create an instance of {@link OffLocationServiceType.Telephone }
     * 
     */
    public OffLocationServiceType.Telephone createOffLocationServiceTypeTelephone() {
        return new OffLocationServiceType.Telephone();
    }

    /**
     * Create an instance of {@link NoShowFeeType.Deadline }
     * 
     */
    public NoShowFeeType.Deadline createNoShowFeeTypeDeadline() {
        return new NoShowFeeType.Deadline();
    }

    /**
     * Create an instance of {@link NoShowFeeType.GracePeriod }
     * 
     */
    public NoShowFeeType.GracePeriod createNoShowFeeTypeGracePeriod() {
        return new NoShowFeeType.GracePeriod();
    }

    /**
     * Create an instance of {@link NoShowFeeType.FeeAmount }
     * 
     */
    public NoShowFeeType.FeeAmount createNoShowFeeTypeFeeAmount() {
        return new NoShowFeeType.FeeAmount();
    }

    /**
     * Create an instance of {@link ArrayOfRateQualifierTypeRateComment.RateComment }
     * 
     */
    public ArrayOfRateQualifierTypeRateComment.RateComment createArrayOfRateQualifierTypeRateCommentRateComment() {
        return new ArrayOfRateQualifierTypeRateComment.RateComment();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleChargeTypeTaxAmount.TaxAmount }
     * 
     */
    public ArrayOfVehicleChargeTypeTaxAmount.TaxAmount createArrayOfVehicleChargeTypeTaxAmountTaxAmount() {
        return new ArrayOfVehicleChargeTypeTaxAmount.TaxAmount();
    }

    /**
     * Create an instance of {@link VehicleChargeType.MinMax }
     * 
     */
    public VehicleChargeType.MinMax createVehicleChargeTypeMinMax() {
        return new VehicleChargeType.MinMax();
    }

    /**
     * Create an instance of {@link VehicleChargeType.Calculation }
     * 
     */
    public VehicleChargeType.Calculation createVehicleChargeTypeCalculation() {
        return new VehicleChargeType.Calculation();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.RateDistance }
     * 
     */
    public VehicleRentalRateType.RateDistance createVehicleRentalRateTypeRateDistance() {
        return new VehicleRentalRateType.RateDistance();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.RateQualifier }
     * 
     */
    public VehicleRentalRateType.RateQualifier createVehicleRentalRateTypeRateQualifier() {
        return new VehicleRentalRateType.RateQualifier();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.RateRestrictions }
     * 
     */
    public VehicleRentalRateType.RateRestrictions createVehicleRentalRateTypeRateRestrictions() {
        return new VehicleRentalRateType.RateRestrictions();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.RateGuarantee }
     * 
     */
    public VehicleRentalRateType.RateGuarantee createVehicleRentalRateTypeRateGuarantee() {
        return new VehicleRentalRateType.RateGuarantee();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType.PickupReturnRule }
     * 
     */
    public VehicleRentalRateType.PickupReturnRule createVehicleRentalRateTypePickupReturnRule() {
        return new VehicleRentalRateType.PickupReturnRule();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreType.PickUpLocation }
     * 
     */
    public VehicleRentalCoreType.PickUpLocation createVehicleRentalCoreTypePickUpLocation() {
        return new VehicleRentalCoreType.PickUpLocation();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreType.ReturnLocation }
     * 
     */
    public VehicleRentalCoreType.ReturnLocation createVehicleRentalCoreTypeReturnLocation() {
        return new VehicleRentalCoreType.ReturnLocation();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.ConfID }
     * 
     */
    public VehicleSegmentCoreType.ConfID createVehicleSegmentCoreTypeConfID() {
        return new VehicleSegmentCoreType.ConfID();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType.TotalCharge }
     * 
     */
    public VehicleSegmentCoreType.TotalCharge createVehicleSegmentCoreTypeTotalCharge() {
        return new VehicleSegmentCoreType.TotalCharge();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalType.Primary }
     * 
     */
    public CustomerPrimaryAdditionalType.Primary createCustomerPrimaryAdditionalTypePrimary() {
        return new CustomerPrimaryAdditionalType.Primary();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalType.Additional }
     * 
     */
    public CustomerPrimaryAdditionalType.Additional createCustomerPrimaryAdditionalTypeAdditional() {
        return new CustomerPrimaryAdditionalType.Additional();
    }

    /**
     * Create an instance of {@link CustomerType.Telephone }
     * 
     */
    public CustomerType.Telephone createCustomerTypeTelephone() {
        return new CustomerType.Telephone();
    }

    /**
     * Create an instance of {@link CustomerType.Email }
     * 
     */
    public CustomerType.Email createCustomerTypeEmail() {
        return new CustomerType.Email();
    }

    /**
     * Create an instance of {@link CustomerType.Address }
     * 
     */
    public CustomerType.Address createCustomerTypeAddress() {
        return new CustomerType.Address();
    }

    /**
     * Create an instance of {@link CustomerType.URL }
     * 
     */
    public CustomerType.URL createCustomerTypeURL() {
        return new CustomerType.URL();
    }

    /**
     * Create an instance of {@link CustomerType.CitizenCountryName }
     * 
     */
    public CustomerType.CitizenCountryName createCustomerTypeCitizenCountryName() {
        return new CustomerType.CitizenCountryName();
    }

    /**
     * Create an instance of {@link CustomerType.PhysChallName }
     * 
     */
    public CustomerType.PhysChallName createCustomerTypePhysChallName() {
        return new CustomerType.PhysChallName();
    }

    /**
     * Create an instance of {@link CustomerType.AdditionalLanguage }
     * 
     */
    public CustomerType.AdditionalLanguage createCustomerTypeAdditionalLanguage() {
        return new CustomerType.AdditionalLanguage();
    }

    /**
     * Create an instance of {@link CustomerType.CustLoyalty.SubAccountBalance }
     * 
     */
    public CustomerType.CustLoyalty.SubAccountBalance createCustomerTypeCustLoyaltySubAccountBalance() {
        return new CustomerType.CustLoyalty.SubAccountBalance();
    }

    /**
     * Create an instance of {@link CustomerType.CustLoyalty.SecurityInfo.PasswordHint }
     * 
     */
    public CustomerType.CustLoyalty.SecurityInfo.PasswordHint createCustomerTypeCustLoyaltySecurityInfoPasswordHint() {
        return new CustomerType.CustLoyalty.SecurityInfo.PasswordHint();
    }

    /**
     * Create an instance of {@link CustomerType.CustLoyalty.MemberPreferences.AdditionalReward }
     * 
     */
    public CustomerType.CustLoyalty.MemberPreferences.AdditionalReward createCustomerTypeCustLoyaltyMemberPreferencesAdditionalReward() {
        return new CustomerType.CustLoyalty.MemberPreferences.AdditionalReward();
    }

    /**
     * Create an instance of {@link CustomerType.CustLoyalty.MemberPreferences.Offer.Communication }
     * 
     */
    public CustomerType.CustLoyalty.MemberPreferences.Offer.Communication createCustomerTypeCustLoyaltyMemberPreferencesOfferCommunication() {
        return new CustomerType.CustLoyalty.MemberPreferences.Offer.Communication();
    }

    /**
     * Create an instance of {@link PaymentFormType.Cash }
     * 
     */
    public PaymentFormType.Cash createPaymentFormTypeCash() {
        return new PaymentFormType.Cash();
    }

    /**
     * Create an instance of {@link PaymentFormType.MiscChargeOrder }
     * 
     */
    public PaymentFormType.MiscChargeOrder createPaymentFormTypeMiscChargeOrder() {
        return new PaymentFormType.MiscChargeOrder();
    }

    /**
     * Create an instance of {@link PaymentFormType.Voucher }
     * 
     */
    public PaymentFormType.Voucher createPaymentFormTypeVoucher() {
        return new PaymentFormType.Voucher();
    }

    /**
     * Create an instance of {@link CustomerType.PaymentForm.AssociatedSupplier }
     * 
     */
    public CustomerType.PaymentForm.AssociatedSupplier createCustomerTypePaymentFormAssociatedSupplier() {
        return new CustomerType.PaymentForm.AssociatedSupplier();
    }

    /**
     * Create an instance of {@link PaymentFormType.Ticket.ConjunctionTicketNbr }
     * 
     */
    public PaymentFormType.Ticket.ConjunctionTicketNbr createPaymentFormTypeTicketConjunctionTicketNbr() {
        return new PaymentFormType.Ticket.ConjunctionTicketNbr();
    }

    /**
     * Create an instance of {@link PaymentFormType.LoyaltyRedemption.LoyaltyCertificate }
     * 
     */
    public PaymentFormType.LoyaltyRedemption.LoyaltyCertificate createPaymentFormTypeLoyaltyRedemptionLoyaltyCertificate() {
        return new PaymentFormType.LoyaltyRedemption.LoyaltyCertificate();
    }

    /**
     * Create an instance of {@link VehicleReservationType.VehSegmentCore }
     * 
     */
    public VehicleReservationType.VehSegmentCore createVehicleReservationTypeVehSegmentCore() {
        return new VehicleReservationType.VehSegmentCore();
    }

    /**
     * Create an instance of {@link ArrayOfHotelDescriptiveContentTypePromotion.Promotion }
     * 
     */
    public ArrayOfHotelDescriptiveContentTypePromotion.Promotion createArrayOfHotelDescriptiveContentTypePromotionPromotion() {
        return new ArrayOfHotelDescriptiveContentTypePromotion.Promotion();
    }

    /**
     * Create an instance of {@link ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod }
     * 
     */
    public ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod createArrayOfHotelDescriptiveContentTypeEffectivePeriodEffectivePeriod() {
        return new ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod();
    }

    /**
     * Create an instance of {@link ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail.GDSCodeDetail }
     * 
     */
    public ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail.GDSCodeDetail createArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetailGDSCodeDetail() {
        return new ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail.GDSCodeDetail();
    }

    /**
     * Create an instance of {@link GDSInfoType.GDSCodes.GDSCode }
     * 
     */
    public GDSInfoType.GDSCodes.GDSCode createGDSInfoTypeGDSCodesGDSCode() {
        return new GDSInfoType.GDSCodes.GDSCode();
    }

    /**
     * Create an instance of {@link ArrayOfAffiliationInfoTypePartnerInfo.PartnerInfo }
     * 
     */
    public ArrayOfAffiliationInfoTypePartnerInfo.PartnerInfo createArrayOfAffiliationInfoTypePartnerInfoPartnerInfo() {
        return new ArrayOfAffiliationInfoTypePartnerInfo.PartnerInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAffiliationInfoTypeAward.Award }
     * 
     */
    public ArrayOfAffiliationInfoTypeAward.Award createArrayOfAffiliationInfoTypeAwardAward() {
        return new ArrayOfAffiliationInfoTypeAward.Award();
    }

    /**
     * Create an instance of {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription }
     * 
     */
    public ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription createArrayOfAffiliationInfoTypeLoyalProgramLoyalProgramProgramDescription() {
        return new ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription();
    }

    /**
     * Create an instance of {@link ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction }
     * 
     */
    public ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction createArrayOfAffiliationInfoTypeLoyalProgramLoyalProgramProgramRestriction() {
        return new ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction();
    }

    /**
     * Create an instance of {@link ParagraphType.ListItem }
     * 
     */
    public ParagraphType.ListItem createParagraphTypeListItem() {
        return new ParagraphType.ListItem();
    }

    /**
     * Create an instance of {@link ArrayOfAffiliationInfoTypeBrand.Brand }
     * 
     */
    public ArrayOfAffiliationInfoTypeBrand.Brand createArrayOfAffiliationInfoTypeBrandBrand() {
        return new ArrayOfAffiliationInfoTypeBrand.Brand();
    }

    /**
     * Create an instance of {@link AffiliationInfoType.DistribSystems.DistribSystem }
     * 
     */
    public AffiliationInfoType.DistribSystems.DistribSystem createAffiliationInfoTypeDistribSystemsDistribSystem() {
        return new AffiliationInfoType.DistribSystems.DistribSystem();
    }

    /**
     * Create an instance of {@link ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail.RecreationDetail }
     * 
     */
    public ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail.RecreationDetail createArrayOfAreaInfoTypeRecreationsRecreationRecreationDetailRecreationDetail() {
        return new ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail.RecreationDetail();
    }

    /**
     * Create an instance of {@link ArrayOfRefPointsTypeRefPoint.RefPoint }
     * 
     */
    public ArrayOfRefPointsTypeRefPoint.RefPoint createArrayOfRefPointsTypeRefPointRefPoint() {
        return new ArrayOfRefPointsTypeRefPoint.RefPoint();
    }

    /**
     * Create an instance of {@link RefPointsType.RefPoint }
     * 
     */
    public RefPointsType.RefPoint createRefPointsTypeRefPoint() {
        return new RefPointsType.RefPoint();
    }

    /**
     * Create an instance of {@link AreaInfoType.RefPoints }
     * 
     */
    public AreaInfoType.RefPoints createAreaInfoTypeRefPoints() {
        return new AreaInfoType.RefPoints();
    }

    /**
     * Create an instance of {@link AreaInfoType.OtherHotels.OtherHotel }
     * 
     */
    public AreaInfoType.OtherHotels.OtherHotel createAreaInfoTypeOtherHotelsOtherHotel() {
        return new AreaInfoType.OtherHotels.OtherHotel();
    }

    /**
     * Create an instance of {@link AreaInfoType.Recreations.Recreation.MultimediaDescriptions }
     * 
     */
    public AreaInfoType.Recreations.Recreation.MultimediaDescriptions createAreaInfoTypeRecreationsRecreationMultimediaDescriptions() {
        return new AreaInfoType.Recreations.Recreation.MultimediaDescriptions();
    }

    /**
     * Create an instance of {@link AreaInfoType.Attractions.Attraction.Contact }
     * 
     */
    public AreaInfoType.Attractions.Attraction.Contact createAreaInfoTypeAttractionsAttractionContact() {
        return new AreaInfoType.Attractions.Attraction.Contact();
    }

    /**
     * Create an instance of {@link ContactInfoType.CompanyName }
     * 
     */
    public ContactInfoType.CompanyName createContactInfoTypeCompanyName() {
        return new ContactInfoType.CompanyName();
    }

    /**
     * Create an instance of {@link ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type }
     * 
     */
    public ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type createArrayOfPoliciesTypePolicyRatePolicyRatePolicyType() {
        return new ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type();
    }

    /**
     * Create an instance of {@link ArrayOfPoliciesTypePolicyStayRequirement.StayRequirement }
     * 
     */
    public ArrayOfPoliciesTypePolicyStayRequirement.StayRequirement createArrayOfPoliciesTypePolicyStayRequirementStayRequirement() {
        return new ArrayOfPoliciesTypePolicyStayRequirement.StayRequirement();
    }

    /**
     * Create an instance of {@link ArrayOfPoliciesTypePolicyTaxPolicy.TaxPolicy }
     * 
     */
    public ArrayOfPoliciesTypePolicyTaxPolicy.TaxPolicy createArrayOfPoliciesTypePolicyTaxPolicyTaxPolicy() {
        return new ArrayOfPoliciesTypePolicyTaxPolicy.TaxPolicy();
    }

    /**
     * Create an instance of {@link ArrayOfPoliciesTypePolicyCheckoutCharge.CheckoutCharge }
     * 
     */
    public ArrayOfPoliciesTypePolicyCheckoutCharge.CheckoutCharge createArrayOfPoliciesTypePolicyCheckoutChargeCheckoutCharge() {
        return new ArrayOfPoliciesTypePolicyCheckoutCharge.CheckoutCharge();
    }

    /**
     * Create an instance of {@link ArrayOfPoliciesTypePolicyPolicyInfoCode.PolicyInfoCode }
     * 
     */
    public ArrayOfPoliciesTypePolicyPolicyInfoCode.PolicyInfoCode createArrayOfPoliciesTypePolicyPolicyInfoCodePolicyInfoCode() {
        return new ArrayOfPoliciesTypePolicyPolicyInfoCode.PolicyInfoCode();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment.AmountPercent }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment.AmountPercent createRequiredPaymentsTypeGuaranteePaymentAmountPercent() {
        return new RequiredPaymentsType.GuaranteePayment.AmountPercent();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment.Deadline }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment.Deadline createRequiredPaymentsTypeGuaranteePaymentDeadline() {
        return new RequiredPaymentsType.GuaranteePayment.Deadline();
    }

    /**
     * Create an instance of {@link RequiredPaymentsType.GuaranteePayment.Address }
     * 
     */
    public RequiredPaymentsType.GuaranteePayment.Address createRequiredPaymentsTypeGuaranteePaymentAddress() {
        return new RequiredPaymentsType.GuaranteePayment.Address();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.GuaranteePaymentPolicy }
     * 
     */
    public PoliciesType.Policy.GuaranteePaymentPolicy createPoliciesTypePolicyGuaranteePaymentPolicy() {
        return new PoliciesType.Policy.GuaranteePaymentPolicy();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PolicyInfo }
     * 
     */
    public PoliciesType.Policy.PolicyInfo createPoliciesTypePolicyPolicyInfo() {
        return new PoliciesType.Policy.PolicyInfo();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.CommissionPolicy.PaymentCompany }
     * 
     */
    public PoliciesType.Policy.CommissionPolicy.PaymentCompany createPoliciesTypePolicyCommissionPolicyPaymentCompany() {
        return new PoliciesType.Policy.CommissionPolicy.PaymentCompany();
    }

    /**
     * Create an instance of {@link PoliciesType.Policy.PetsPolicies.PetsPolicy }
     * 
     */
    public PoliciesType.Policy.PetsPolicies.PetsPolicy createPoliciesTypePolicyPetsPoliciesPetsPolicy() {
        return new PoliciesType.Policy.PetsPolicies.PetsPolicy();
    }

    /**
     * Create an instance of {@link ArrayOfRestaurantsTypeSrvcInfoCode.SrvcInfoCode }
     * 
     */
    public ArrayOfRestaurantsTypeSrvcInfoCode.SrvcInfoCode createArrayOfRestaurantsTypeSrvcInfoCodeSrvcInfoCode() {
        return new ArrayOfRestaurantsTypeSrvcInfoCode.SrvcInfoCode();
    }

    /**
     * Create an instance of {@link ArrayOfRestaurantsTypeRestaurantSrvcInfoCode.SrvcInfoCode }
     * 
     */
    public ArrayOfRestaurantsTypeRestaurantSrvcInfoCode.SrvcInfoCode createArrayOfRestaurantsTypeRestaurantSrvcInfoCodeSrvcInfoCode() {
        return new ArrayOfRestaurantsTypeRestaurantSrvcInfoCode.SrvcInfoCode();
    }

    /**
     * Create an instance of {@link ArrayOfRestaurantTypeCuisineCode.CuisineCode }
     * 
     */
    public ArrayOfRestaurantTypeCuisineCode.CuisineCode createArrayOfRestaurantTypeCuisineCodeCuisineCode() {
        return new ArrayOfRestaurantTypeCuisineCode.CuisineCode();
    }

    /**
     * Create an instance of {@link ArrayOfRestaurantTypeInfoCode.InfoCode }
     * 
     */
    public ArrayOfRestaurantTypeInfoCode.InfoCode createArrayOfRestaurantTypeInfoCodeInfoCode() {
        return new ArrayOfRestaurantTypeInfoCode.InfoCode();
    }

    /**
     * Create an instance of {@link RestaurantType.MultimediaDescriptions }
     * 
     */
    public RestaurantType.MultimediaDescriptions createRestaurantTypeMultimediaDescriptions() {
        return new RestaurantType.MultimediaDescriptions();
    }

    /**
     * Create an instance of {@link RestaurantsType.Restaurant }
     * 
     */
    public RestaurantsType.Restaurant createRestaurantsTypeRestaurant() {
        return new RestaurantsType.Restaurant();
    }

    /**
     * Create an instance of {@link ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity.Amenity }
     * 
     */
    public ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity.Amenity createArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenityAmenity() {
        return new ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity.Amenity();
    }

    /**
     * Create an instance of {@link MeetingRoomCapacityType.Occupancy }
     * 
     */
    public MeetingRoomCapacityType.Occupancy createMeetingRoomCapacityTypeOccupancy() {
        return new MeetingRoomCapacityType.Occupancy();
    }

    /**
     * Create an instance of {@link MeetingRoomsType.MeetingRoom.Dimension }
     * 
     */
    public MeetingRoomsType.MeetingRoom.Dimension createMeetingRoomsTypeMeetingRoomDimension() {
        return new MeetingRoomsType.MeetingRoom.Dimension();
    }

    /**
     * Create an instance of {@link FacilityInfoType.MeetingRooms }
     * 
     */
    public FacilityInfoType.MeetingRooms createFacilityInfoTypeMeetingRooms() {
        return new FacilityInfoType.MeetingRooms();
    }

    /**
     * Create an instance of {@link FacilityInfoType.GuestRooms.GuestRoom.TypeRoom }
     * 
     */
    public FacilityInfoType.GuestRooms.GuestRoom.TypeRoom createFacilityInfoTypeGuestRoomsGuestRoomTypeRoom() {
        return new FacilityInfoType.GuestRooms.GuestRoom.TypeRoom();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoTypeLanguage.Language }
     * 
     */
    public ArrayOfHotelInfoTypeLanguage.Language createArrayOfHotelInfoTypeLanguageLanguage() {
        return new ArrayOfHotelInfoTypeLanguage.Language();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo }
     * 
     */
    public ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo createArrayOfHotelInfoTypeOwnershipManagementInfoOwnershipManagementInfo() {
        return new ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo();
    }

    /**
     * Create an instance of {@link WeatherInfoType.Precipitation }
     * 
     */
    public WeatherInfoType.Precipitation createWeatherInfoTypePrecipitation() {
        return new WeatherInfoType.Precipitation();
    }

    /**
     * Create an instance of {@link WeatherInfoType.Temperature }
     * 
     */
    public WeatherInfoType.Temperature createWeatherInfoTypeTemperature() {
        return new WeatherInfoType.Temperature();
    }

    /**
     * Create an instance of {@link ArrayOfFeaturesTypeFeature.Feature.Charge }
     * 
     */
    public ArrayOfFeaturesTypeFeature.Feature.Charge createArrayOfFeaturesTypeFeatureFeatureCharge() {
        return new ArrayOfFeaturesTypeFeature.Feature.Charge();
    }

    /**
     * Create an instance of {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule.OperationSchedule }
     * 
     */
    public ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule.OperationSchedule createArrayOfOperationSchedulesPlusChargeTypeOperationScheduleOperationSchedule() {
        return new ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule.OperationSchedule();
    }

    /**
     * Create an instance of {@link ArrayOfURLsTypeURL.URL }
     * 
     */
    public ArrayOfURLsTypeURL.URL createArrayOfURLsTypeURLURL() {
        return new ArrayOfURLsTypeURL.URL();
    }

    /**
     * Create an instance of {@link ArrayOfEmailsTypeEmail.Email }
     * 
     */
    public ArrayOfEmailsTypeEmail.Email createArrayOfEmailsTypeEmailEmail() {
        return new ArrayOfEmailsTypeEmail.Email();
    }

    /**
     * Create an instance of {@link ArrayOfPhonesTypePhone.Phone }
     * 
     */
    public ArrayOfPhonesTypePhone.Phone createArrayOfPhonesTypePhonePhone() {
        return new ArrayOfPhonesTypePhone.Phone();
    }

    /**
     * Create an instance of {@link ArrayOfAddressesTypeAddress.Address }
     * 
     */
    public ArrayOfAddressesTypeAddress.Address createArrayOfAddressesTypeAddressAddress() {
        return new ArrayOfAddressesTypeAddress.Address();
    }

    /**
     * Create an instance of {@link PersonNameType.Document }
     * 
     */
    public PersonNameType.Document createPersonNameTypeDocument() {
        return new PersonNameType.Document();
    }

    /**
     * Create an instance of {@link ArrayOfContactsTypeName.Name.JobTitle }
     * 
     */
    public ArrayOfContactsTypeName.Name.JobTitle createArrayOfContactsTypeNameNameJobTitle() {
        return new ArrayOfContactsTypeName.Name.JobTitle();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoTypeService.Service }
     * 
     */
    public ArrayOfHotelInfoTypeService.Service createArrayOfHotelInfoTypeServiceService() {
        return new ArrayOfHotelInfoTypeService.Service();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoTypeHotelInfoCode.HotelInfoCode }
     * 
     */
    public ArrayOfHotelInfoTypeHotelInfoCode.HotelInfoCode createArrayOfHotelInfoTypeHotelInfoCodeHotelInfoCode() {
        return new ArrayOfHotelInfoTypeHotelInfoCode.HotelInfoCode();
    }

    /**
     * Create an instance of {@link ArrayOfCategoryCodesTypeGuestRoomInfoRateRange.RateRange }
     * 
     */
    public ArrayOfCategoryCodesTypeGuestRoomInfoRateRange.RateRange createArrayOfCategoryCodesTypeGuestRoomInfoRateRangeRateRange() {
        return new ArrayOfCategoryCodesTypeGuestRoomInfoRateRange.RateRange();
    }

    /**
     * Create an instance of {@link CategoryCodesType.LocationCategory }
     * 
     */
    public CategoryCodesType.LocationCategory createCategoryCodesTypeLocationCategory() {
        return new CategoryCodesType.LocationCategory();
    }

    /**
     * Create an instance of {@link CategoryCodesType.SegmentCategory }
     * 
     */
    public CategoryCodesType.SegmentCategory createCategoryCodesTypeSegmentCategory() {
        return new CategoryCodesType.SegmentCategory();
    }

    /**
     * Create an instance of {@link CategoryCodesType.HotelCategory }
     * 
     */
    public CategoryCodesType.HotelCategory createCategoryCodesTypeHotelCategory() {
        return new CategoryCodesType.HotelCategory();
    }

    /**
     * Create an instance of {@link CategoryCodesType.ArchitecturalStyle }
     * 
     */
    public CategoryCodesType.ArchitecturalStyle createCategoryCodesTypeArchitecturalStyle() {
        return new CategoryCodesType.ArchitecturalStyle();
    }

    /**
     * Create an instance of {@link CategoryCodesType.GuestRoomInfo }
     * 
     */
    public CategoryCodesType.GuestRoomInfo createCategoryCodesTypeGuestRoomInfo() {
        return new CategoryCodesType.GuestRoomInfo();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoTypeBlackoutDate.BlackoutDate }
     * 
     */
    public ArrayOfHotelInfoTypeBlackoutDate.BlackoutDate createArrayOfHotelInfoTypeBlackoutDateBlackoutDate() {
        return new ArrayOfHotelInfoTypeBlackoutDate.BlackoutDate();
    }

    /**
     * Create an instance of {@link DateTimeSpanType.StartDateWindow }
     * 
     */
    public DateTimeSpanType.StartDateWindow createDateTimeSpanTypeStartDateWindow() {
        return new DateTimeSpanType.StartDateWindow();
    }

    /**
     * Create an instance of {@link DateTimeSpanType.EndDateWindow }
     * 
     */
    public DateTimeSpanType.EndDateWindow createDateTimeSpanTypeEndDateWindow() {
        return new DateTimeSpanType.EndDateWindow();
    }

    /**
     * Create an instance of {@link HotelInfoType.HotelName }
     * 
     */
    public HotelInfoType.HotelName createHotelInfoTypeHotelName() {
        return new HotelInfoType.HotelName();
    }

    /**
     * Create an instance of {@link HotelInfoType.Position }
     * 
     */
    public HotelInfoType.Position createHotelInfoTypePosition() {
        return new HotelInfoType.Position();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions.Renovation }
     * 
     */
    public HotelInfoType.Descriptions.Renovation createHotelInfoTypeDescriptionsRenovation() {
        return new HotelInfoType.Descriptions.Renovation();
    }

    /**
     * Create an instance of {@link HotelInfoType.Descriptions.MultimediaDescriptions }
     * 
     */
    public HotelInfoType.Descriptions.MultimediaDescriptions createHotelInfoTypeDescriptionsMultimediaDescriptions() {
        return new HotelInfoType.Descriptions.MultimediaDescriptions();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType.Policies }
     * 
     */
    public HotelDescriptiveContentType.Policies createHotelDescriptiveContentTypePolicies() {
        return new HotelDescriptiveContentType.Policies();
    }

    /**
     * Create an instance of {@link HotelDescriptiveContentType.RoomBlocks }
     * 
     */
    public HotelDescriptiveContentType.RoomBlocks createHotelDescriptiveContentTypeRoomBlocks() {
        return new HotelDescriptiveContentType.RoomBlocks();
    }

    /**
     * Create an instance of {@link ArrayOfAvailStatusMessageTypeBestAvailableRate.BestAvailableRate }
     * 
     */
    public ArrayOfAvailStatusMessageTypeBestAvailableRate.BestAvailableRate createArrayOfAvailStatusMessageTypeBestAvailableRateBestAvailableRate() {
        return new ArrayOfAvailStatusMessageTypeBestAvailableRate.BestAvailableRate();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.HurdleRate }
     * 
     */
    public AvailStatusMessageType.HurdleRate createAvailStatusMessageTypeHurdleRate() {
        return new AvailStatusMessageType.HurdleRate();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.Delta }
     * 
     */
    public AvailStatusMessageType.Delta createAvailStatusMessageTypeDelta() {
        return new AvailStatusMessageType.Delta();
    }

    /**
     * Create an instance of {@link AvailStatusMessageType.RestrictionStatus }
     * 
     */
    public AvailStatusMessageType.RestrictionStatus createAvailStatusMessageTypeRestrictionStatus() {
        return new AvailStatusMessageType.RestrictionStatus();
    }

    /**
     * Create an instance of {@link ArrayOfRateUploadTypeAdditionalGuestAmount.AdditionalGuestAmount }
     * 
     */
    public ArrayOfRateUploadTypeAdditionalGuestAmount.AdditionalGuestAmount createArrayOfRateUploadTypeAdditionalGuestAmountAdditionalGuestAmount() {
        return new ArrayOfRateUploadTypeAdditionalGuestAmount.AdditionalGuestAmount();
    }

    /**
     * Create an instance of {@link ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt }
     * 
     */
    public ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt createArrayOfRateUploadTypeBaseByGuestAmtBaseByGuestAmt() {
        return new ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt();
    }

    /**
     * Create an instance of {@link ArrayOfRateAmountMessageTypeRate.Rate }
     * 
     */
    public ArrayOfRateAmountMessageTypeRate.Rate createArrayOfRateAmountMessageTypeRateRate() {
        return new ArrayOfRateAmountMessageTypeRate.Rate();
    }

    /**
     * Create an instance of {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode.DestinationSystemCode }
     * 
     */
    public ArrayOfDestinationSystemCodesTypeDestinationSystemCode.DestinationSystemCode createArrayOfDestinationSystemCodesTypeDestinationSystemCodeDestinationSystemCode() {
        return new ArrayOfDestinationSystemCodesTypeDestinationSystemCode.DestinationSystemCode();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType.ProfileRef }
     * 
     */
    public RailPassengerDetailType.ProfileRef createRailPassengerDetailTypeProfileRef() {
        return new RailPassengerDetailType.ProfileRef();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType.Telephone }
     * 
     */
    public RailPassengerDetailType.Telephone createRailPassengerDetailTypeTelephone() {
        return new RailPassengerDetailType.Telephone();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType.Email }
     * 
     */
    public RailPassengerDetailType.Email createRailPassengerDetailTypeEmail() {
        return new RailPassengerDetailType.Email();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType.Address }
     * 
     */
    public RailPassengerDetailType.Address createRailPassengerDetailTypeAddress() {
        return new RailPassengerDetailType.Address();
    }

    /**
     * Create an instance of {@link RailPassengerDetailType.CustLoyalty }
     * 
     */
    public RailPassengerDetailType.CustLoyalty createRailPassengerDetailTypeCustLoyalty() {
        return new RailPassengerDetailType.CustLoyalty();
    }

    /**
     * Create an instance of {@link RailRateQualifyingType.DiscountType }
     * 
     */
    public RailRateQualifyingType.DiscountType createRailRateQualifyingTypeDiscountType() {
        return new RailRateQualifyingType.DiscountType();
    }

    /**
     * Create an instance of {@link RailPassengerCategoryType.PassengerQualifyingInfo }
     * 
     */
    public RailPassengerCategoryType.PassengerQualifyingInfo createRailPassengerCategoryTypePassengerQualifyingInfo() {
        return new RailPassengerCategoryType.PassengerQualifyingInfo();
    }

    /**
     * Create an instance of {@link RailReservationSummaryType.ODInfo.TrainSegment }
     * 
     */
    public RailReservationSummaryType.ODInfo.TrainSegment createRailReservationSummaryTypeODInfoTrainSegment() {
        return new RailReservationSummaryType.ODInfo.TrainSegment();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType.DepartureAirport }
     * 
     */
    public FlightSegmentBaseType.DepartureAirport createFlightSegmentBaseTypeDepartureAirport() {
        return new FlightSegmentBaseType.DepartureAirport();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType.ArrivalAirport }
     * 
     */
    public FlightSegmentBaseType.ArrivalAirport createFlightSegmentBaseTypeArrivalAirport() {
        return new FlightSegmentBaseType.ArrivalAirport();
    }

    /**
     * Create an instance of {@link FlightSegmentType.MarketingAirline }
     * 
     */
    public FlightSegmentType.MarketingAirline createFlightSegmentTypeMarketingAirline() {
        return new FlightSegmentType.MarketingAirline();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.StopLocation }
     * 
     */
    public BookFlightSegmentType.StopLocation createBookFlightSegmentTypeStopLocation() {
        return new BookFlightSegmentType.StopLocation();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.BookingClassAvails.BookingClassAvail }
     * 
     */
    public BookFlightSegmentType.BookingClassAvails.BookingClassAvail createBookFlightSegmentTypeBookingClassAvailsBookingClassAvail() {
        return new BookFlightSegmentType.BookingClassAvails.BookingClassAvail();
    }

    /**
     * Create an instance of {@link PkgAirSegmentType.Passengers }
     * 
     */
    public PkgAirSegmentType.Passengers createPkgAirSegmentTypePassengers() {
        return new PkgAirSegmentType.Passengers();
    }

    /**
     * Create an instance of {@link VehicleReservationSummaryType.ConfID }
     * 
     */
    public VehicleReservationSummaryType.ConfID createVehicleReservationSummaryTypeConfID() {
        return new VehicleReservationSummaryType.ConfID();
    }

    /**
     * Create an instance of {@link TransportInfoType.TransportInfo }
     * 
     */
    public TransportInfoType.TransportInfo createTransportInfoTypeTransportInfo() {
        return new TransportInfoType.TransportInfo();
    }

    /**
     * Create an instance of {@link ArrayOfResGuestTypeProfileRPH.ProfileRPH }
     * 
     */
    public ArrayOfResGuestTypeProfileRPH.ProfileRPH createArrayOfResGuestTypeProfileRPHProfileRPH() {
        return new ArrayOfResGuestTypeProfileRPH.ProfileRPH();
    }

    /**
     * Create an instance of {@link ArrayOfProfilesTypeProfileInfo.ProfileInfo }
     * 
     */
    public ArrayOfProfilesTypeProfileInfo.ProfileInfo createArrayOfProfilesTypeProfileInfoProfileInfo() {
        return new ArrayOfProfilesTypeProfileInfo.ProfileInfo();
    }

    /**
     * Create an instance of {@link ArrayOfRoutingHopTypeRoutingHop.RoutingHop }
     * 
     */
    public ArrayOfRoutingHopTypeRoutingHop.RoutingHop createArrayOfRoutingHopTypeRoutingHopRoutingHop() {
        return new ArrayOfRoutingHopTypeRoutingHop.RoutingHop();
    }

    /**
     * Create an instance of {@link ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID }
     * 
     */
    public ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID createArrayOfHotelReservationIDsTypeHotelReservationIDHotelReservationID() {
        return new ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID();
    }

    /**
     * Create an instance of {@link ResCommonDetailType.TimeSpan }
     * 
     */
    public ResCommonDetailType.TimeSpan createResCommonDetailTypeTimeSpan() {
        return new ResCommonDetailType.TimeSpan();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule createArrayOfBookingRulesTypeBookingRuleAdditionalRuleAdditionalRule() {
        return new ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewershipDistributorType.DistributorType }
     * 
     */
    public ArrayOfViewershipsTypeViewershipDistributorType.DistributorType createArrayOfViewershipsTypeViewershipDistributorTypeDistributorType() {
        return new ArrayOfViewershipsTypeViewershipDistributorType.DistributorType();
    }

    /**
     * Create an instance of {@link ArrayOfProfileTypeComment.Comment.AuthorizedViewer }
     * 
     */
    public ArrayOfProfileTypeComment.Comment.AuthorizedViewer createArrayOfProfileTypeCommentCommentAuthorizedViewer() {
        return new ArrayOfProfileTypeComment.Comment.AuthorizedViewer();
    }

    /**
     * Create an instance of {@link AllianceConsortiumType.AllianceMember }
     * 
     */
    public AllianceConsortiumType.AllianceMember createAllianceConsortiumTypeAllianceMember() {
        return new AllianceConsortiumType.AllianceMember();
    }

    /**
     * Create an instance of {@link AgreementsType.ProfileSecurity }
     * 
     */
    public AgreementsType.ProfileSecurity createAgreementsTypeProfileSecurity() {
        return new AgreementsType.ProfileSecurity();
    }

    /**
     * Create an instance of {@link TravelClubType.ClubMemberName }
     * 
     */
    public TravelClubType.ClubMemberName createTravelClubTypeClubMemberName() {
        return new TravelClubType.ClubMemberName();
    }

    /**
     * Create an instance of {@link OrganizationType.OrgMemberName }
     * 
     */
    public OrganizationType.OrgMemberName createOrganizationTypeOrgMemberName() {
        return new OrganizationType.OrgMemberName();
    }

    /**
     * Create an instance of {@link CompanyInfoType.AddressInfo }
     * 
     */
    public CompanyInfoType.AddressInfo createCompanyInfoTypeAddressInfo() {
        return new CompanyInfoType.AddressInfo();
    }

    /**
     * Create an instance of {@link CompanyInfoType.TelephoneInfo }
     * 
     */
    public CompanyInfoType.TelephoneInfo createCompanyInfoTypeTelephoneInfo() {
        return new CompanyInfoType.TelephoneInfo();
    }

    /**
     * Create an instance of {@link CompanyInfoType.Email }
     * 
     */
    public CompanyInfoType.Email createCompanyInfoTypeEmail() {
        return new CompanyInfoType.Email();
    }

    /**
     * Create an instance of {@link CompanyInfoType.PaymentForm }
     * 
     */
    public CompanyInfoType.PaymentForm createCompanyInfoTypePaymentForm() {
        return new CompanyInfoType.PaymentForm();
    }

    /**
     * Create an instance of {@link CompanyInfoType.TripPurpose }
     * 
     */
    public CompanyInfoType.TripPurpose createCompanyInfoTypeTripPurpose() {
        return new CompanyInfoType.TripPurpose();
    }

    /**
     * Create an instance of {@link OtherServiceInfoType.TravelerRefNumber }
     * 
     */
    public OtherServiceInfoType.TravelerRefNumber createOtherServiceInfoTypeTravelerRefNumber() {
        return new OtherServiceInfoType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link AirlinePrefType.VendorPref }
     * 
     */
    public AirlinePrefType.VendorPref createAirlinePrefTypeVendorPref() {
        return new AirlinePrefType.VendorPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.FareRestrictPref }
     * 
     */
    public AirlinePrefType.FareRestrictPref createAirlinePrefTypeFareRestrictPref() {
        return new AirlinePrefType.FareRestrictPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.FarePref }
     * 
     */
    public AirlinePrefType.FarePref createAirlinePrefTypeFarePref() {
        return new AirlinePrefType.FarePref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.FlightTypePref }
     * 
     */
    public AirlinePrefType.FlightTypePref createAirlinePrefTypeFlightTypePref() {
        return new AirlinePrefType.FlightTypePref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.CabinPref }
     * 
     */
    public AirlinePrefType.CabinPref createAirlinePrefTypeCabinPref() {
        return new AirlinePrefType.CabinPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.SeatPref }
     * 
     */
    public AirlinePrefType.SeatPref createAirlinePrefTypeSeatPref() {
        return new AirlinePrefType.SeatPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.SSRPref }
     * 
     */
    public AirlinePrefType.SSRPref createAirlinePrefTypeSSRPref() {
        return new AirlinePrefType.SSRPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.KeywordPref }
     * 
     */
    public AirlinePrefType.KeywordPref createAirlinePrefTypeKeywordPref() {
        return new AirlinePrefType.KeywordPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.AccountInformation.TaxRegistrationDetails }
     * 
     */
    public AirlinePrefType.AccountInformation.TaxRegistrationDetails createAirlinePrefTypeAccountInformationTaxRegistrationDetails() {
        return new AirlinePrefType.AccountInformation.TaxRegistrationDetails();
    }

    /**
     * Create an instance of {@link AirlinePrefType.TourCodePref.StaffTourCodeInfo }
     * 
     */
    public AirlinePrefType.TourCodePref.StaffTourCodeInfo createAirlinePrefTypeTourCodePrefStaffTourCodeInfo() {
        return new AirlinePrefType.TourCodePref.StaffTourCodeInfo();
    }

    /**
     * Create an instance of {@link AirlinePrefType.TourCodePref.TourCodeInfo }
     * 
     */
    public AirlinePrefType.TourCodePref.TourCodeInfo createAirlinePrefTypeTourCodePrefTourCodeInfo() {
        return new AirlinePrefType.TourCodePref.TourCodeInfo();
    }

    /**
     * Create an instance of {@link VehicleCoreType.VehType }
     * 
     */
    public VehicleCoreType.VehType createVehicleCoreTypeVehType() {
        return new VehicleCoreType.VehType();
    }

    /**
     * Create an instance of {@link VehicleCoreType.VehClass }
     * 
     */
    public VehicleCoreType.VehClass createVehicleCoreTypeVehClass() {
        return new VehicleCoreType.VehClass();
    }

    /**
     * Create an instance of {@link VehicleType.VehMakeModel }
     * 
     */
    public VehicleType.VehMakeModel createVehicleTypeVehMakeModel() {
        return new VehicleType.VehMakeModel();
    }

    /**
     * Create an instance of {@link VehicleType.VehIdentity }
     * 
     */
    public VehicleType.VehIdentity createVehicleTypeVehIdentity() {
        return new VehicleType.VehIdentity();
    }

    /**
     * Create an instance of {@link VehiclePrefType.VehMakeModel }
     * 
     */
    public VehiclePrefType.VehMakeModel createVehiclePrefTypeVehMakeModel() {
        return new VehiclePrefType.VehMakeModel();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.LoyaltyPref }
     * 
     */
    public VehicleProfileRentalPrefType.LoyaltyPref createVehicleProfileRentalPrefTypeLoyaltyPref() {
        return new VehicleProfileRentalPrefType.LoyaltyPref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.PaymentFormPref }
     * 
     */
    public VehicleProfileRentalPrefType.PaymentFormPref createVehicleProfileRentalPrefTypePaymentFormPref() {
        return new VehicleProfileRentalPrefType.PaymentFormPref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.CoveragePref }
     * 
     */
    public VehicleProfileRentalPrefType.CoveragePref createVehicleProfileRentalPrefTypeCoveragePref() {
        return new VehicleProfileRentalPrefType.CoveragePref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.SpecialEquipPref }
     * 
     */
    public VehicleProfileRentalPrefType.SpecialEquipPref createVehicleProfileRentalPrefTypeSpecialEquipPref() {
        return new VehicleProfileRentalPrefType.SpecialEquipPref();
    }

    /**
     * Create an instance of {@link PhonePrefType.Telephone }
     * 
     */
    public PhonePrefType.Telephone createPhonePrefTypeTelephone() {
        return new PhonePrefType.Telephone();
    }

    /**
     * Create an instance of {@link CommonPrefType.ContactPref }
     * 
     */
    public CommonPrefType.ContactPref createCommonPrefTypeContactPref() {
        return new CommonPrefType.ContactPref();
    }

    /**
     * Create an instance of {@link PreferencesType.PrefCollection }
     * 
     */
    public PreferencesType.PrefCollection createPreferencesTypePrefCollection() {
        return new PreferencesType.PrefCollection();
    }

    /**
     * Create an instance of {@link AccessesType.Access }
     * 
     */
    public AccessesType.Access createAccessesTypeAccess() {
        return new AccessesType.Access();
    }

    /**
     * Create an instance of {@link ota.jw.PMSGateway.ProfileType.UserID }
     * 
     */
    public ota.jw.PMSGateway.ProfileType.UserID createProfileTypeUserID() {
        return new ota.jw.PMSGateway.ProfileType.UserID();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewershipProfileType.ProfileType }
     * 
     */
    public ArrayOfViewershipsTypeViewershipProfileType.ProfileType createArrayOfViewershipsTypeViewershipProfileTypeProfileType() {
        return new ArrayOfViewershipsTypeViewershipProfileType.ProfileType();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes createArrayOfViewershipsTypeViewershipViewershipViewershipCodes() {
        return new ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode createArrayOfViewershipsTypeViewershipViewershipBookingChannelCodesBookingChannelCode() {
        return new ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode createArrayOfViewershipsTypeViewershipViewershipLocationCodesLocationCode() {
        return new ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode createArrayOfViewershipsTypeViewershipViewershipSystemCodesSystemCode() {
        return new ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay.LOSPattern }
     * 
     */
    public LengthsOfStayType.LengthOfStay.LOSPattern createLengthsOfStayTypeLengthOfStayLOSPattern() {
        return new LengthsOfStayType.LengthOfStay.LOSPattern();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee createArrayOfBookingRulesTypeBookingRuleAcceptableGuaranteeAcceptableGuarantee() {
        return new ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee();
    }

    /**
     * Create an instance of {@link GuaranteeType.Deadline }
     * 
     */
    public GuaranteeType.Deadline createGuaranteeTypeDeadline() {
        return new GuaranteeType.Deadline();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus createArrayOfBookingRulesTypeBookingRuleBookingRuleRestrictionStatus() {
        return new ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge createArrayOfBookingRulesTypeBookingRuleBookingRuleCheckoutCharge() {
        return new ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest }
     * 
     */
    public ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest createArrayOfSpecialRequestTypeSpecialRequestSpecialRequest() {
        return new ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest();
    }

    /**
     * Create an instance of {@link ArrayOfMembershipTypeMembership.Membership }
     * 
     */
    public ArrayOfMembershipTypeMembership.Membership createArrayOfMembershipTypeMembershipMembership() {
        return new ArrayOfMembershipTypeMembership.Membership();
    }

    /**
     * Create an instance of {@link ArrayOfPropertyValueMatchTypeAmenity.Amenity }
     * 
     */
    public ArrayOfPropertyValueMatchTypeAmenity.Amenity createArrayOfPropertyValueMatchTypeAmenityAmenity() {
        return new ArrayOfPropertyValueMatchTypeAmenity.Amenity();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Position }
     * 
     */
    public BasicPropertyInfoType.Position createBasicPropertyInfoTypePosition() {
        return new BasicPropertyInfoType.Position();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Award }
     * 
     */
    public BasicPropertyInfoType.Award createBasicPropertyInfoTypeAward() {
        return new BasicPropertyInfoType.Award();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.HotelAmenity }
     * 
     */
    public BasicPropertyInfoType.HotelAmenity createBasicPropertyInfoTypeHotelAmenity() {
        return new BasicPropertyInfoType.HotelAmenity();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Recreation }
     * 
     */
    public BasicPropertyInfoType.Recreation createBasicPropertyInfoTypeRecreation() {
        return new BasicPropertyInfoType.Recreation();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Service }
     * 
     */
    public BasicPropertyInfoType.Service createBasicPropertyInfoTypeService() {
        return new BasicPropertyInfoType.Service();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Policy }
     * 
     */
    public BasicPropertyInfoType.Policy createBasicPropertyInfoTypePolicy() {
        return new BasicPropertyInfoType.Policy();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.SearchValueMatch }
     * 
     */
    public PropertyValueMatchType.SearchValueMatch createPropertyValueMatchTypeSearchValueMatch() {
        return new PropertyValueMatchType.SearchValueMatch();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.RateRange }
     * 
     */
    public PropertyValueMatchType.RateRange createPropertyValueMatchTypeRateRange() {
        return new PropertyValueMatchType.RateRange();
    }

    /**
     * Create an instance of {@link ArrayOfOperationScheduleTypeOperationTime.OperationTime }
     * 
     */
    public ArrayOfOperationScheduleTypeOperationTime.OperationTime createArrayOfOperationScheduleTypeOperationTimeOperationTime() {
        return new ArrayOfOperationScheduleTypeOperationTime.OperationTime();
    }

    /**
     * Create an instance of {@link TextDescriptionType.Description }
     * 
     */
    public TextDescriptionType.Description createTextDescriptionTypeDescription() {
        return new TextDescriptionType.Description();
    }

    /**
     * Create an instance of {@link TextItemsType.TextItem }
     * 
     */
    public TextItemsType.TextItem createTextItemsTypeTextItem() {
        return new TextItemsType.TextItem();
    }

    /**
     * Create an instance of {@link ImageDescriptionType.ImageFormat }
     * 
     */
    public ImageDescriptionType.ImageFormat createImageDescriptionTypeImageFormat() {
        return new ImageDescriptionType.ImageFormat();
    }

    /**
     * Create an instance of {@link ImageDescriptionType.Description }
     * 
     */
    public ImageDescriptionType.Description createImageDescriptionTypeDescription() {
        return new ImageDescriptionType.Description();
    }

    /**
     * Create an instance of {@link ImageItemsType.ImageItem }
     * 
     */
    public ImageItemsType.ImageItem createImageItemsTypeImageItem() {
        return new ImageItemsType.ImageItem();
    }

    /**
     * Create an instance of {@link VideoDescriptionType.VideoFormat }
     * 
     */
    public VideoDescriptionType.VideoFormat createVideoDescriptionTypeVideoFormat() {
        return new VideoDescriptionType.VideoFormat();
    }

    /**
     * Create an instance of {@link VideoItemsType.VideoItem }
     * 
     */
    public VideoItemsType.VideoItem createVideoItemsTypeVideoItem() {
        return new VideoItemsType.VideoItem();
    }

    /**
     * Create an instance of {@link ArrayOfTransportationTypeTransportation.Transportation }
     * 
     */
    public ArrayOfTransportationTypeTransportation.Transportation createArrayOfTransportationTypeTransportationTransportation() {
        return new ArrayOfTransportationTypeTransportation.Transportation();
    }

    /**
     * Create an instance of {@link ArrayOfBasicPropertyInfoTypeContactNumber.ContactNumber }
     * 
     */
    public ArrayOfBasicPropertyInfoTypeContactNumber.ContactNumber createArrayOfBasicPropertyInfoTypeContactNumberContactNumber() {
        return new ArrayOfBasicPropertyInfoTypeContactNumber.ContactNumber();
    }

    /**
     * Create an instance of {@link GuestCountType.GuestCount }
     * 
     */
    public GuestCountType.GuestCount createGuestCountTypeGuestCount() {
        return new GuestCountType.GuestCount();
    }

    /**
     * Create an instance of {@link ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount.GuestCount }
     * 
     */
    public ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount.GuestCount createArrayOfRoomStayTypeRoomRatesRoomRateGuestCountGuestCount() {
        return new ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount.GuestCount();
    }

    /**
     * Create an instance of {@link ArrayOfServiceRPHsTypeServiceRPH.ServiceRPH }
     * 
     */
    public ArrayOfServiceRPHsTypeServiceRPH.ServiceRPH createArrayOfServiceRPHsTypeServiceRPHServiceRPH() {
        return new ArrayOfServiceRPHsTypeServiceRPH.ServiceRPH();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.AvailableDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.AvailableDaysOfWeek createDOWRestrictionsTypeAvailableDaysOfWeek() {
        return new DOWRestrictionsType.AvailableDaysOfWeek();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.ArrivalDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.ArrivalDaysOfWeek createDOWRestrictionsTypeArrivalDaysOfWeek() {
        return new DOWRestrictionsType.ArrivalDaysOfWeek();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.DepartureDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.DepartureDaysOfWeek createDOWRestrictionsTypeDepartureDaysOfWeek() {
        return new DOWRestrictionsType.DepartureDaysOfWeek();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.RequiredDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.RequiredDaysOfWeek createDOWRestrictionsTypeRequiredDaysOfWeek() {
        return new DOWRestrictionsType.RequiredDaysOfWeek();
    }

    /**
     * Create an instance of {@link ArrayOfRoomStayTypeRoomRatesRoomRateRestriction.Restriction }
     * 
     */
    public ArrayOfRoomStayTypeRoomRatesRoomRateRestriction.Restriction createArrayOfRoomStayTypeRoomRatesRoomRateRestrictionRestriction() {
        return new ArrayOfRoomStayTypeRoomRatesRoomRateRestriction.Restriction();
    }

    /**
     * Create an instance of {@link ArrayOfRoomRateTypeFeature.Feature }
     * 
     */
    public ArrayOfRoomRateTypeFeature.Feature createArrayOfRoomRateTypeFeatureFeature() {
        return new ArrayOfRoomRateTypeFeature.Feature();
    }

    /**
     * Create an instance of {@link HotelAdditionalChargesType.AdditionalCharge }
     * 
     */
    public HotelAdditionalChargesType.AdditionalCharge createHotelAdditionalChargesTypeAdditionalCharge() {
        return new HotelAdditionalChargesType.AdditionalCharge();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.AmountPercent }
     * 
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.AmountPercent createArrayOfRequiredPaymentsTypeGuaranteePaymentGuaranteePaymentAmountPercent() {
        return new ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.AmountPercent();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Deadline }
     * 
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Deadline createArrayOfRequiredPaymentsTypeGuaranteePaymentGuaranteePaymentDeadline() {
        return new ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Deadline();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address }
     * 
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address createArrayOfRequiredPaymentsTypeGuaranteePaymentGuaranteePaymentAddress() {
        return new ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address();
    }

    /**
     * Create an instance of {@link AmountType.AdditionalGuestAmounts }
     * 
     */
    public AmountType.AdditionalGuestAmounts createAmountTypeAdditionalGuestAmounts() {
        return new AmountType.AdditionalGuestAmounts();
    }

    /**
     * Create an instance of {@link AmountType.Discount }
     * 
     */
    public AmountType.Discount createAmountTypeDiscount() {
        return new AmountType.Discount();
    }

    /**
     * Create an instance of {@link ArrayOfRateTypeRate.Rate }
     * 
     */
    public ArrayOfRateTypeRate.Rate createArrayOfRateTypeRateRate() {
        return new ArrayOfRateTypeRate.Rate();
    }

    /**
     * Create an instance of {@link RoomRateType.Availability }
     * 
     */
    public RoomRateType.Availability createRoomRateTypeAvailability() {
        return new RoomRateType.Availability();
    }

    /**
     * Create an instance of {@link CancelPenaltyType.Deadline }
     * 
     */
    public CancelPenaltyType.Deadline createCancelPenaltyTypeDeadline() {
        return new CancelPenaltyType.Deadline();
    }

    /**
     * Create an instance of {@link ArrayOfCommentTypeComment.Comment }
     * 
     */
    public ArrayOfCommentTypeComment.Comment createArrayOfCommentTypeCommentComment() {
        return new ArrayOfCommentTypeComment.Comment();
    }

    /**
     * Create an instance of {@link ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted }
     * 
     */
    public ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted createArrayOfGuaranteeTypeGuaranteeAcceptedGuaranteeAccepted() {
        return new ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted();
    }

    /**
     * Create an instance of {@link RatePlanType.RatePlanInclusions }
     * 
     */
    public RatePlanType.RatePlanInclusions createRatePlanTypeRatePlanInclusions() {
        return new RatePlanType.RatePlanInclusions();
    }

    /**
     * Create an instance of {@link RatePlanType.MealsIncluded }
     * 
     */
    public RatePlanType.MealsIncluded createRatePlanTypeMealsIncluded() {
        return new RatePlanType.MealsIncluded();
    }

    /**
     * Create an instance of {@link RatePlanType.RestrictionStatus }
     * 
     */
    public RatePlanType.RestrictionStatus createRatePlanTypeRestrictionStatus() {
        return new RatePlanType.RestrictionStatus();
    }

    /**
     * Create an instance of {@link RoomStayType.MapURL }
     * 
     */
    public RoomStayType.MapURL createRoomStayTypeMapURL() {
        return new RoomStayType.MapURL();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction }
     * 
     */
    public RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction createRoomStayTypeRoomRatesRoomRateAdvanceBookingRestriction() {
        return new RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction();
    }

    /**
     * Create an instance of {@link ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference }
     * 
     */
    public ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference createArrayOfRoomStaysTypeRoomStayRoomStayReference() {
        return new ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference();
    }

    /**
     * Create an instance of {@link HotelReservationType.Queue }
     * 
     */
    public HotelReservationType.Queue createHotelReservationTypeQueue() {
        return new HotelReservationType.Queue();
    }

    /**
     * Create an instance of {@link HotelReservationType.BillingInstructionCode.ResGuestRPH }
     * 
     */
    public HotelReservationType.BillingInstructionCode.ResGuestRPH createHotelReservationTypeBillingInstructionCodeResGuestRPH() {
        return new HotelReservationType.BillingInstructionCode.ResGuestRPH();
    }

    /**
     * Create an instance of {@link ArrayOfCruiseReservationTypePaymentDue.PaymentDue }
     * 
     */
    public ArrayOfCruiseReservationTypePaymentDue.PaymentDue createArrayOfCruiseReservationTypePaymentDuePaymentDue() {
        return new ArrayOfCruiseReservationTypePaymentDue.PaymentDue();
    }

    /**
     * Create an instance of {@link CommissionType.CommissionableAmount }
     * 
     */
    public CommissionType.CommissionableAmount createCommissionTypeCommissionableAmount() {
        return new CommissionType.CommissionableAmount();
    }

    /**
     * Create an instance of {@link CommissionType.PrepaidAmount }
     * 
     */
    public CommissionType.PrepaidAmount createCommissionTypePrepaidAmount() {
        return new CommissionType.PrepaidAmount();
    }

    /**
     * Create an instance of {@link CommissionType.FlatCommission }
     * 
     */
    public CommissionType.FlatCommission createCommissionTypeFlatCommission() {
        return new CommissionType.FlatCommission();
    }

    /**
     * Create an instance of {@link CommissionType.CommissionPayableAmount }
     * 
     */
    public CommissionType.CommissionPayableAmount createCommissionTypeCommissionPayableAmount() {
        return new CommissionType.CommissionPayableAmount();
    }

    /**
     * Create an instance of {@link PaymentResponseType.PaymentAmount }
     * 
     */
    public PaymentResponseType.PaymentAmount createPaymentResponseTypePaymentAmount() {
        return new PaymentResponseType.PaymentAmount();
    }

    /**
     * Create an instance of {@link HotelPaymentFormType.MasterAccountUsage }
     * 
     */
    public HotelPaymentFormType.MasterAccountUsage createHotelPaymentFormTypeMasterAccountUsage() {
        return new HotelPaymentFormType.MasterAccountUsage();
    }

    /**
     * Create an instance of {@link DirectBillType.CompanyName }
     * 
     */
    public DirectBillType.CompanyName createDirectBillTypeCompanyName() {
        return new DirectBillType.CompanyName();
    }

    /**
     * Create an instance of {@link DirectBillType.Telephone }
     * 
     */
    public DirectBillType.Telephone createDirectBillTypeTelephone() {
        return new DirectBillType.Telephone();
    }

    /**
     * Create an instance of {@link PaymentDetailType.PaymentAmount }
     * 
     */
    public PaymentDetailType.PaymentAmount createPaymentDetailTypePaymentAmount() {
        return new PaymentDetailType.PaymentAmount();
    }

    /**
     * Create an instance of {@link ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption }
     * 
     */
    public ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption createArrayOfCruiseGuestInfoTypePaymentOptionPaymentOption() {
        return new ArrayOfCruiseGuestInfoTypePaymentOption.PaymentOption();
    }

    /**
     * Create an instance of {@link ArrayOfCruiseGuestInfoTypeLinkedBooking.LinkedBooking }
     * 
     */
    public ArrayOfCruiseGuestInfoTypeLinkedBooking.LinkedBooking createArrayOfCruiseGuestInfoTypeLinkedBookingLinkedBooking() {
        return new ArrayOfCruiseGuestInfoTypeLinkedBooking.LinkedBooking();
    }

    /**
     * Create an instance of {@link DocumentHandlingType.VendorOption }
     * 
     */
    public DocumentHandlingType.VendorOption createDocumentHandlingTypeVendorOption() {
        return new DocumentHandlingType.VendorOption();
    }

    /**
     * Create an instance of {@link ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation }
     * 
     */
    public ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation createArrayOfCruiseGuestDetailTypeAirAccommodationAirAccommodation() {
        return new ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation();
    }

    /**
     * Create an instance of {@link CruisePackageType.Location }
     * 
     */
    public CruisePackageType.Location createCruisePackageTypeLocation() {
        return new CruisePackageType.Location();
    }

    /**
     * Create an instance of {@link ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage }
     * 
     */
    public ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage createArrayOfCruiseGuestDetailTypeSelectedPackageSelectedPackage() {
        return new ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage();
    }

    /**
     * Create an instance of {@link ContactPersonType.Telephone }
     * 
     */
    public ContactPersonType.Telephone createContactPersonTypeTelephone() {
        return new ContactPersonType.Telephone();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedFareCode }
     * 
     */
    public CruiseGuestDetailType.SelectedFareCode createCruiseGuestDetailTypeSelectedFareCode() {
        return new CruiseGuestDetailType.SelectedFareCode();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.ContactInfo }
     * 
     */
    public CruiseGuestDetailType.ContactInfo createCruiseGuestDetailTypeContactInfo() {
        return new CruiseGuestDetailType.ContactInfo();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.LoyaltyInfo }
     * 
     */
    public CruiseGuestDetailType.LoyaltyInfo createCruiseGuestDetailTypeLoyaltyInfo() {
        return new CruiseGuestDetailType.LoyaltyInfo();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.LinkedTraveler }
     * 
     */
    public CruiseGuestDetailType.LinkedTraveler createCruiseGuestDetailTypeLinkedTraveler() {
        return new CruiseGuestDetailType.LinkedTraveler();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedDining }
     * 
     */
    public CruiseGuestDetailType.SelectedDining createCruiseGuestDetailTypeSelectedDining() {
        return new CruiseGuestDetailType.SelectedDining();
    }

    /**
     * Create an instance of {@link CruiseGuestDetailType.SelectedInsurance }
     * 
     */
    public CruiseGuestDetailType.SelectedInsurance createCruiseGuestDetailTypeSelectedInsurance() {
        return new CruiseGuestDetailType.SelectedInsurance();
    }

    /**
     * Create an instance of {@link CruiseGuestInfoType.CancellationPenalty }
     * 
     */
    public CruiseGuestInfoType.CancellationPenalty createCruiseGuestInfoTypeCancellationPenalty() {
        return new CruiseGuestInfoType.CancellationPenalty();
    }

    /**
     * Create an instance of {@link CruiseProfileType.CruiseProfile }
     * 
     */
    public CruiseProfileType.CruiseProfile createCruiseProfileTypeCruiseProfile() {
        return new CruiseProfileType.CruiseProfile();
    }

    /**
     * Create an instance of {@link ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute.CabinAttribute }
     * 
     */
    public ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute.CabinAttribute createArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttributeCabinAttribute() {
        return new ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute.CabinAttribute();
    }

    /**
     * Create an instance of {@link CabinOptionType.CabinConfiguration }
     * 
     */
    public CabinOptionType.CabinConfiguration createCabinOptionTypeCabinConfiguration() {
        return new CabinOptionType.CabinConfiguration();
    }

    /**
     * Create an instance of {@link CabinOptionType.MeasurementInfo }
     * 
     */
    public CabinOptionType.MeasurementInfo createCabinOptionTypeMeasurementInfo() {
        return new CabinOptionType.MeasurementInfo();
    }

    /**
     * Create an instance of {@link ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute.CabinAttribute }
     * 
     */
    public ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute.CabinAttribute createArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttributeCabinAttribute() {
        return new ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute.CabinAttribute();
    }

    /**
     * Create an instance of {@link SailingInfoType.SelectedSailing }
     * 
     */
    public SailingInfoType.SelectedSailing createSailingInfoTypeSelectedSailing() {
        return new SailingInfoType.SelectedSailing();
    }

    /**
     * Create an instance of {@link SailingInfoType.InclusivePackageOption }
     * 
     */
    public SailingInfoType.InclusivePackageOption createSailingInfoTypeInclusivePackageOption() {
        return new SailingInfoType.InclusivePackageOption();
    }

    /**
     * Create an instance of {@link SailingInfoType.Currency }
     * 
     */
    public SailingInfoType.Currency createSailingInfoTypeCurrency() {
        return new SailingInfoType.Currency();
    }

    /**
     * Create an instance of {@link SailingType.Dining }
     * 
     */
    public SailingType.Dining createSailingTypeDining() {
        return new SailingType.Dining();
    }

    /**
     * Create an instance of {@link SailingBaseType.CruiseLine }
     * 
     */
    public SailingBaseType.CruiseLine createSailingBaseTypeCruiseLine() {
        return new SailingBaseType.CruiseLine();
    }

    /**
     * Create an instance of {@link SailingBaseType.Region }
     * 
     */
    public SailingBaseType.Region createSailingBaseTypeRegion() {
        return new SailingBaseType.Region();
    }

    /**
     * Create an instance of {@link SailingBaseType.DeparturePort }
     * 
     */
    public SailingBaseType.DeparturePort createSailingBaseTypeDeparturePort() {
        return new SailingBaseType.DeparturePort();
    }

    /**
     * Create an instance of {@link SailingBaseType.ArrivalPort }
     * 
     */
    public SailingBaseType.ArrivalPort createSailingBaseTypeArrivalPort() {
        return new SailingBaseType.ArrivalPort();
    }

    /**
     * Create an instance of {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin }
     * 
     */
    public SailingCategoryInfoType.SelectedCategory.SelectedCabin createSailingCategoryInfoTypeSelectedCategorySelectedCabin() {
        return new SailingCategoryInfoType.SelectedCategory.SelectedCabin();
    }

    /**
     * Create an instance of {@link VerificationType.PersonName }
     * 
     */
    public VerificationType.PersonName createVerificationTypePersonName() {
        return new VerificationType.PersonName();
    }

    /**
     * Create an instance of {@link VerificationType.TelephoneInfo }
     * 
     */
    public VerificationType.TelephoneInfo createVerificationTypeTelephoneInfo() {
        return new VerificationType.TelephoneInfo();
    }

    /**
     * Create an instance of {@link VerificationType.CustLoyalty }
     * 
     */
    public VerificationType.CustLoyalty createVerificationTypeCustLoyalty() {
        return new VerificationType.CustLoyalty();
    }

    /**
     * Create an instance of {@link VerificationType.ReservationTimeSpan }
     * 
     */
    public VerificationType.ReservationTimeSpan createVerificationTypeReservationTimeSpan() {
        return new VerificationType.ReservationTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationType.AssociatedQuantity }
     * 
     */
    public VerificationType.AssociatedQuantity createVerificationTypeAssociatedQuantity() {
        return new VerificationType.AssociatedQuantity();
    }

    /**
     * Create an instance of {@link VerificationType.StartLocation }
     * 
     */
    public VerificationType.StartLocation createVerificationTypeStartLocation() {
        return new VerificationType.StartLocation();
    }

    /**
     * Create an instance of {@link VerificationType.EndLocation }
     * 
     */
    public VerificationType.EndLocation createVerificationTypeEndLocation() {
        return new VerificationType.EndLocation();
    }

    /**
     * Create an instance of {@link SourceType.RequestorID }
     * 
     */
    public SourceType.RequestorID createSourceTypeRequestorID() {
        return new SourceType.RequestorID();
    }

    /**
     * Create an instance of {@link SourceType.Position }
     * 
     */
    public SourceType.Position createSourceTypePosition() {
        return new SourceType.Position();
    }

    /**
     * Create an instance of {@link SourceType.BookingChannel }
     * 
     */
    public SourceType.BookingChannel createSourceTypeBookingChannel() {
        return new SourceType.BookingChannel();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore createOTAPrdNotifReportRQNotifDetailsVehNotifReportVehResVehNotifReportRQCore() {
        return new OTAPrdNotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent createOTAPrdNotifReportRQNotifDetailsHotelNotifReportHotelDescriptiveContentsHotelDescriptiveContent() {
        return new OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage createOTAPrdNotifReportRQNotifDetailsHotelNotifReportAvailStatusMessagesAvailStatusMessage() {
        return new OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage createOTAPrdNotifReportRQNotifDetailsHotelNotifReportRateAmountMessagesRateAmountMessage() {
        return new OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage();
    }

    /**
     * Create an instance of {@link OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation }
     * 
     */
    public OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation createOTAPrdNotifReportRQNotifDetailsHotelNotifReportHotelReservationsHotelReservation() {
        return new OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation();
    }

    /**
     * Create an instance of {@link OTAPrdReadRQ.ReadRequests.Airport }
     * 
     */
    public OTAPrdReadRQ.ReadRequests.Airport createOTAPrdReadRQReadRequestsAirport() {
        return new OTAPrdReadRQ.ReadRequests.Airport();
    }

    /**
     * Create an instance of {@link OTAPrdReadRQ.ReadRequests.UserID }
     * 
     */
    public OTAPrdReadRQ.ReadRequests.UserID createOTAPrdReadRQReadRequestsUserID() {
        return new OTAPrdReadRQ.ReadRequests.UserID();
    }

    /**
     * Create an instance of {@link OTAPrdReadRQ.ReadRequests.SelectionCriteria }
     * 
     */
    public OTAPrdReadRQ.ReadRequests.SelectionCriteria createOTAPrdReadRQReadRequestsSelectionCriteria() {
        return new OTAPrdReadRQ.ReadRequests.SelectionCriteria();
    }

    /**
     * Create an instance of {@link OTAHotelRatePlanNotifRS.RatePlanCrossRefs.RatePlanCrossRef }
     * 
     */
    public OTAHotelRatePlanNotifRS.RatePlanCrossRefs.RatePlanCrossRef createOTAHotelRatePlanNotifRSRatePlanCrossRefsRatePlanCrossRef() {
        return new OTAHotelRatePlanNotifRS.RatePlanCrossRefs.RatePlanCrossRef();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore }
     * 
     */
    public OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore createOTANotifReportRQNotifDetailsVehNotifReportVehResVehNotifReportRQCore() {
        return new OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent }
     * 
     */
    public OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent createOTANotifReportRQNotifDetailsHotelNotifReportHotelDescriptiveContentsHotelDescriptiveContent() {
        return new OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage }
     * 
     */
    public OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage createOTANotifReportRQNotifDetailsHotelNotifReportAvailStatusMessagesAvailStatusMessage() {
        return new OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage }
     * 
     */
    public OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage createOTANotifReportRQNotifDetailsHotelNotifReportRateAmountMessagesRateAmountMessage() {
        return new OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage();
    }

    /**
     * Create an instance of {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation }
     * 
     */
    public OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation createOTANotifReportRQNotifDetailsHotelNotifReportHotelReservationsHotelReservation() {
        return new OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation();
    }

    /**
     * Create an instance of {@link OTAResRetrieveRS.ReservationsList.GlobalReservation }
     * 
     */
    public OTAResRetrieveRS.ReservationsList.GlobalReservation createOTAResRetrieveRSReservationsListGlobalReservation() {
        return new OTAResRetrieveRS.ReservationsList.GlobalReservation();
    }

    /**
     * Create an instance of {@link OTAResRetrieveRS.ReservationsList.VehicleReservation }
     * 
     */
    public OTAResRetrieveRS.ReservationsList.VehicleReservation createOTAResRetrieveRSReservationsListVehicleReservation() {
        return new OTAResRetrieveRS.ReservationsList.VehicleReservation();
    }

    /**
     * Create an instance of {@link OTAResRetrieveRS.ReservationsList.AirReservation }
     * 
     */
    public OTAResRetrieveRS.ReservationsList.AirReservation createOTAResRetrieveRSReservationsListAirReservation() {
        return new OTAResRetrieveRS.ReservationsList.AirReservation();
    }

    /**
     * Create an instance of {@link OTAResRetrieveRS.ReservationsList.PackageReservation }
     * 
     */
    public OTAResRetrieveRS.ReservationsList.PackageReservation createOTAResRetrieveRSReservationsListPackageReservation() {
        return new OTAResRetrieveRS.ReservationsList.PackageReservation();
    }

    /**
     * Create an instance of {@link OTAResRetrieveRS.ReservationsList.GolfReservation.Membership }
     * 
     */
    public OTAResRetrieveRS.ReservationsList.GolfReservation.Membership createOTAResRetrieveRSReservationsListGolfReservationMembership() {
        return new OTAResRetrieveRS.ReservationsList.GolfReservation.Membership();
    }

    /**
     * Create an instance of {@link OTAReadRQ.ReadRequests.Airport }
     * 
     */
    public OTAReadRQ.ReadRequests.Airport createOTAReadRQReadRequestsAirport() {
        return new OTAReadRQ.ReadRequests.Airport();
    }

    /**
     * Create an instance of {@link OTAReadRQ.ReadRequests.UserID }
     * 
     */
    public OTAReadRQ.ReadRequests.UserID createOTAReadRQReadRequestsUserID() {
        return new OTAReadRQ.ReadRequests.UserID();
    }

    /**
     * Create an instance of {@link OTAReadRQ.ReadRequests.SelectionCriteria }
     * 
     */
    public OTAReadRQ.ReadRequests.SelectionCriteria createOTAReadRQReadRequestsSelectionCriteria() {
        return new OTAReadRQ.ReadRequests.SelectionCriteria();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageAcknowledgementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_NotifReportRS")
    public JAXBElement<MessageAcknowledgementType> createOTANotifReportRS(MessageAcknowledgementType value) {
        return new JAXBElement<MessageAcknowledgementType>(_OTANotifReportRS_QNAME, MessageAcknowledgementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAHotelStayInfoNotifRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelStayInfoNotifRQ")
    public JAXBElement<OTAHotelStayInfoNotifRQ> createOTAHotelStayInfoNotifRQ(OTAHotelStayInfoNotifRQ value) {
        return new JAXBElement<OTAHotelStayInfoNotifRQ>(_OTAHotelStayInfoNotifRQ_QNAME, OTAHotelStayInfoNotifRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAHotelStayInfoNotifRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_HotelStayInfoNotifRS")
    public JAXBElement<OTAHotelStayInfoNotifRS> createOTAHotelStayInfoNotifRS(OTAHotelStayInfoNotifRS value) {
        return new JAXBElement<OTAHotelStayInfoNotifRS>(_OTAHotelStayInfoNotifRS_QNAME, OTAHotelStayInfoNotifRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPaymentInfoRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OrderPaymentInfoRS")
    public JAXBElement<OrderPaymentInfoRS> createOrderPaymentInfoRS(OrderPaymentInfoRS value) {
        return new JAXBElement<OrderPaymentInfoRS>(_OrderPaymentInfoRS_QNAME, OrderPaymentInfoRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageAcknowledgementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "MessageAcknowledgementType")
    public JAXBElement<MessageAcknowledgementType> createMessageAcknowledgementType(MessageAcknowledgementType value) {
        return new JAXBElement<MessageAcknowledgementType>(_MessageAcknowledgementType_QNAME, MessageAcknowledgementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCheckInNoticeRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OrderCheckInNoticeRQ")
    public JAXBElement<OrderCheckInNoticeRQ> createOrderCheckInNoticeRQ(OrderCheckInNoticeRQ value) {
        return new JAXBElement<OrderCheckInNoticeRQ>(_OrderCheckInNoticeRQ_QNAME, OrderCheckInNoticeRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCheckInNoticeRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OrderCheckInNoticeRS")
    public JAXBElement<OrderCheckInNoticeRS> createOrderCheckInNoticeRS(OrderCheckInNoticeRS value) {
        return new JAXBElement<OrderCheckInNoticeRS>(_OrderCheckInNoticeRS_QNAME, OrderCheckInNoticeRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderApplyPaymentRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OrderApplyPaymentRQ")
    public JAXBElement<OrderApplyPaymentRQ> createOrderApplyPaymentRQ(OrderApplyPaymentRQ value) {
        return new JAXBElement<OrderApplyPaymentRQ>(_OrderApplyPaymentRQ_QNAME, OrderApplyPaymentRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderApplyPaymentRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OrderApplyPaymentRS")
    public JAXBElement<OrderApplyPaymentRS> createOrderApplyPaymentRS(OrderApplyPaymentRS value) {
        return new JAXBElement<OrderApplyPaymentRS>(_OrderApplyPaymentRS_QNAME, OrderApplyPaymentRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAPushOrderStatusRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_PushOrderStatusRQ")
    public JAXBElement<OTAPushOrderStatusRQ> createOTAPushOrderStatusRQ(OTAPushOrderStatusRQ value) {
        return new JAXBElement<OTAPushOrderStatusRQ>(_OTAPushOrderStatusRQ_QNAME, OTAPushOrderStatusRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAPushOrderStatusRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OTA_PushOrderStatusRS")
    public JAXBElement<OTAPushOrderStatusRS> createOTAPushOrderStatusRS(OTAPushOrderStatusRS value) {
        return new JAXBElement<OTAPushOrderStatusRS>(_OTAPushOrderStatusRS_QNAME, OTAPushOrderStatusRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParagraphType.ListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ListItem", scope = ParagraphType.class)
    public JAXBElement<ParagraphType.ListItem> createParagraphTypeListItem(ParagraphType.ListItem value) {
        return new JAXBElement<ParagraphType.ListItem>(_ParagraphTypeListItem_QNAME, ParagraphType.ListItem.class, ParagraphType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormattedTextTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Text", scope = ParagraphType.class)
    public JAXBElement<FormattedTextTextType> createParagraphTypeText(FormattedTextTextType value) {
        return new JAXBElement<FormattedTextTextType>(_ParagraphTypeText_QNAME, FormattedTextTextType.class, ParagraphType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "URL", scope = ParagraphType.class)
    public JAXBElement<String> createParagraphTypeURL(String value) {
        return new JAXBElement<String>(_ParagraphTypeURL_QNAME, String.class, ParagraphType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "Image", scope = ParagraphType.class)
    public JAXBElement<String> createParagraphTypeImage(String value) {
        return new JAXBElement<String>(_ParagraphTypeImage_QNAME, String.class, ParagraphType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResGuestRPHsTypeResGuestRPH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ResGuestRPH", scope = ResGuestRPHsType.class)
    public JAXBElement<ResGuestRPHsTypeResGuestRPH> createResGuestRPHsTypeResGuestRPH(ResGuestRPHsTypeResGuestRPH value) {
        return new JAXBElement<ResGuestRPHsTypeResGuestRPH>(_ResGuestRPHsTypeResGuestRPH_QNAME, ResGuestRPHsTypeResGuestRPH.class, ResGuestRPHsType.class, value);
    }

}
