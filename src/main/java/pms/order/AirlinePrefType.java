package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlinePrefType", propOrder = {"loyaltyPref", "vendorPref", "paymentFormPref", "airportOriginPref", "airportDestinationPref", "airportRoutePref", "fareRestrictPref", "farePref", "tourCodePref", "flightTypePref", "equipPref", "cabinPref", "seatPref", "ticketDistribPref", "mealPref", "specRequestPref", "ssrPref", "tpaExtensions", "mediaEntertainPref", "petInfoPref", "accountInformation", "osiPref", "keywordPref"})
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

    public List<LoyaltyPrefType> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPrefType>();
        }
        return this.loyaltyPref;
    }

    public List<AirlinePrefType.VendorPref> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<AirlinePrefType.VendorPref>();
        }
        return this.vendorPref;
    }

    public List<PaymentFormPrefType> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPrefType>();
        }
        return this.paymentFormPref;
    }

    public List<AirportPrefType> getAirportOriginPref() {
        if (airportOriginPref == null) {
            airportOriginPref = new ArrayList<AirportPrefType>();
        }
        return this.airportOriginPref;
    }

    public AirportPrefType getAirportDestinationPref() {
        return airportDestinationPref;
    }

    public void setAirportDestinationPref(AirportPrefType value) {
        this.airportDestinationPref = value;
    }

    public List<AirportPrefType> getAirportRoutePref() {
        if (airportRoutePref == null) {
            airportRoutePref = new ArrayList<AirportPrefType>();
        }
        return this.airportRoutePref;
    }

    public List<AirlinePrefType.FareRestrictPref> getFareRestrictPref() {
        if (fareRestrictPref == null) {
            fareRestrictPref = new ArrayList<AirlinePrefType.FareRestrictPref>();
        }
        return this.fareRestrictPref;
    }

    public List<AirlinePrefType.FarePref> getFarePref() {
        if (farePref == null) {
            farePref = new ArrayList<AirlinePrefType.FarePref>();
        }
        return this.farePref;
    }

    public List<AirlinePrefType.TourCodePref> getTourCodePref() {
        if (tourCodePref == null) {
            tourCodePref = new ArrayList<AirlinePrefType.TourCodePref>();
        }
        return this.tourCodePref;
    }

    public List<AirlinePrefType.FlightTypePref> getFlightTypePref() {
        if (flightTypePref == null) {
            flightTypePref = new ArrayList<AirlinePrefType.FlightTypePref>();
        }
        return this.flightTypePref;
    }

    public List<EquipmentTypePref> getEquipPref() {
        if (equipPref == null) {
            equipPref = new ArrayList<EquipmentTypePref>();
        }
        return this.equipPref;
    }

    public List<AirlinePrefType.CabinPref> getCabinPref() {
        if (cabinPref == null) {
            cabinPref = new ArrayList<AirlinePrefType.CabinPref>();
        }
        return this.cabinPref;
    }

    public List<AirlinePrefType.SeatPref> getSeatPref() {
        if (seatPref == null) {
            seatPref = new ArrayList<AirlinePrefType.SeatPref>();
        }
        return this.seatPref;
    }

    public List<TicketDistribPrefType> getTicketDistribPref() {
        if (ticketDistribPref == null) {
            ticketDistribPref = new ArrayList<TicketDistribPrefType>();
        }
        return this.ticketDistribPref;
    }

    public List<MealPrefType> getMealPref() {
        if (mealPref == null) {
            mealPref = new ArrayList<MealPrefType>();
        }
        return this.mealPref;
    }

    public List<SpecRequestPrefType> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPrefType>();
        }
        return this.specRequestPref;
    }

    public List<AirlinePrefType.SSRPref> getSSRPref() {
        if (ssrPref == null) {
            ssrPref = new ArrayList<AirlinePrefType.SSRPref>();
        }
        return this.ssrPref;
    }

    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    public List<MediaEntertainPrefType> getMediaEntertainPref() {
        if (mediaEntertainPref == null) {
            mediaEntertainPref = new ArrayList<MediaEntertainPrefType>();
        }
        return this.mediaEntertainPref;
    }

    public List<PetInfoPrefType> getPetInfoPref() {
        if (petInfoPref == null) {
            petInfoPref = new ArrayList<PetInfoPrefType>();
        }
        return this.petInfoPref;
    }

    public AirlinePrefType.AccountInformation getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(AirlinePrefType.AccountInformation value) {
        this.accountInformation = value;
    }

    public List<OtherServiceInfoType> getOSIPref() {
        if (osiPref == null) {
            osiPref = new ArrayList<OtherServiceInfoType>();
        }
        return this.osiPref;
    }

    public List<AirlinePrefType.KeywordPref> getKeywordPref() {
        if (keywordPref == null) {
            keywordPref = new ArrayList<AirlinePrefType.KeywordPref>();
        }
        return this.keywordPref;
    }

    public String getShareSynchInd() {
        return shareSynchInd;
    }

    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    public String getShareMarketInd() {
        return shareMarketInd;
    }

    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    public TicketType getAirTicketType() {
        return airTicketType;
    }

    public void setAirTicketType(TicketType value) {
        this.airTicketType = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"taxRegistrationDetails"})
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

        public AirlinePrefType.AccountInformation.TaxRegistrationDetails getTaxRegistrationDetails() {
            return taxRegistrationDetails;
        }

        public void setTaxRegistrationDetails(AirlinePrefType.AccountInformation.TaxRegistrationDetails value) {
            this.taxRegistrationDetails = value;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String value) {
            this.number = value;
        }

        public String getCostCenter() {
            return costCenter;
        }

        public void setCostCenter(String value) {
            this.costCenter = value;
        }

        public String getCompanyNumber() {
            return companyNumber;
        }

        public void setCompanyNumber(String value) {
            this.companyNumber = value;
        }

        public String getClientReference() {
            return clientReference;
        }

        public void setClientReference(String value) {
            this.clientReference = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TaxRegistrationDetails {
            @XmlAttribute(name = "TaxID")
            protected String taxID;
            @XmlAttribute(name = "RecipientName")
            protected String recipientName;
            @XmlAttribute(name = "RecipientAddress")
            protected String recipientAddress;

            public String getTaxID() {
                return taxID;
            }

            public void setTaxID(String value) {
                this.taxID = value;
            }

            public String getRecipientName() {
                return recipientName;
            }

            public void setRecipientName(String value) {
                this.recipientName = value;
            }

            public String getRecipientAddress() {
                return recipientAddress;
            }

            public void setRecipientAddress(String value) {
                this.recipientAddress = value;
            }
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinPref {
        @XmlAttribute(name = "Cabin")
        protected CabinType cabin;

        public CabinType getCabin() {
            return cabin;
        }

        public void setCabin(CabinType value) {
            this.cabin = value;
        }
    }

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

        public String getCode() {
            return code;
        }

        public void setCode(String value) {
            this.code = value;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String value) {
            this.description = value;
        }

        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        public String getRateCategoryCode() {
            return rateCategoryCode;
        }

        public void setRateCategoryCode(String value) {
            this.rateCategoryCode = value;
        }

        public TransferActionType getTransferAction() {
            return transferAction;
        }

        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FareRestrictPref {
        @XmlAttribute(name = "FareRestriction")
        protected String fareRestriction;
        @XmlAttribute(name = "Date")
        protected String date;

        public String getFareRestriction() {
            return fareRestriction;
        }

        public void setFareRestriction(String value) {
            this.fareRestriction = value;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String value) {
            this.date = value;
        }
    }

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

        public FlightTypeType getFlightType() {
            return flightType;
        }

        public void setFlightType(FlightTypeType value) {
            this.flightType = value;
        }

        public BigInteger getMaxConnections() {
            return maxConnections;
        }

        public void setMaxConnections(BigInteger value) {
            this.maxConnections = value;
        }

        public String getNonScheduledFltInfo() {
            return nonScheduledFltInfo;
        }

        public void setNonScheduledFltInfo(String value) {
            this.nonScheduledFltInfo = value;
        }

        public Boolean isBackhaulIndicator() {
            return backhaulIndicator;
        }

        public void setBackhaulIndicator(Boolean value) {
            this.backhaulIndicator = value;
        }

        public Boolean isGroundTransportIndicator() {
            return groundTransportIndicator;
        }

        public void setGroundTransportIndicator(Boolean value) {
            this.groundTransportIndicator = value;
        }

        public Boolean isDirectAndNonStopOnlyInd() {
            return directAndNonStopOnlyInd;
        }

        public void setDirectAndNonStopOnlyInd(Boolean value) {
            this.directAndNonStopOnlyInd = value;
        }

        public Boolean isNonStopsOnlyInd() {
            return nonStopsOnlyInd;
        }

        public void setNonStopsOnlyInd(Boolean value) {
            this.nonStopsOnlyInd = value;
        }

        public Boolean isOnlineConnectionsOnlyInd() {
            return onlineConnectionsOnlyInd;
        }

        public void setOnlineConnectionsOnlyInd(Boolean value) {
            this.onlineConnectionsOnlyInd = value;
        }

        public String getRoutingType() {
            return routingType;
        }

        public void setRoutingType(String value) {
            this.routingType = value;
        }

        public Boolean isExcludeTrainInd() {
            return excludeTrainInd;
        }

        public void setExcludeTrainInd(Boolean value) {
            this.excludeTrainInd = value;
        }
    }

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

        public String getVendorCode() {
            return vendorCode;
        }

        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String value) {
            this.description = value;
        }

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String value) {
            this.keyword = value;
        }

        public String getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(String value) {
            this.statusCode = value;
        }

        public BigInteger getNumberInParty() {
            return numberInParty;
        }

        public void setNumberInParty(BigInteger value) {
            this.numberInParty = value;
        }

        public List<String> getAirlineVendorRPH() {
            if (airlineVendorRPH == null) {
                airlineVendorRPH = new ArrayList<String>();
            }
            return this.airlineVendorRPH;
        }

        public TransferActionType getTransferAction() {
            return transferAction;
        }

        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }
    }

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

        public String getSSRCode() {
            return ssrCode;
        }

        public void setSSRCode(String value) {
            this.ssrCode = value;
        }

        public String getVendorCode() {
            return vendorCode;
        }

        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        public BigInteger getNumberInParty() {
            return numberInParty;
        }

        public void setNumberInParty(BigInteger value) {
            this.numberInParty = value;
        }

        public String getDefaultStatusCode() {
            return defaultStatusCode;
        }

        public void setDefaultStatusCode(String value) {
            this.defaultStatusCode = value;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String value) {
            this.remark = value;
        }

        public String getLookupKey() {
            return lookupKey;
        }

        public void setLookupKey(String value) {
            this.lookupKey = value;
        }

        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        public TransferActionType getTransferActionType() {
            return transferActionType;
        }

        public void setTransferActionType(TransferActionType value) {
            this.transferActionType = value;
        }
    }

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

        public String getFlightDistanceQualifier() {
            return flightDistanceQualifier;
        }

        public void setFlightDistanceQualifier(String value) {
            this.flightDistanceQualifier = value;
        }

        public Boolean isInternationalIndicator() {
            return internationalIndicator;
        }

        public void setInternationalIndicator(Boolean value) {
            this.internationalIndicator = value;
        }

        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        public String getPassengerTypeCode() {
            return passengerTypeCode;
        }

        public void setPassengerTypeCode(String value) {
            this.passengerTypeCode = value;
        }

        public TransferActionType getTransferAction() {
            return transferAction;
        }

        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"tourCodeInfo", "staffTourCodeInfo"})
    public static class TourCodePref {
        @XmlElement(name = "TourCodeInfo")
        protected AirlinePrefType.TourCodePref.TourCodeInfo tourCodeInfo;
        @XmlElement(name = "StaffTourCodeInfo")
        protected AirlinePrefType.TourCodePref.StaffTourCodeInfo staffTourCodeInfo;
        @XmlAttribute(name = "PassengerTypeCode")
        protected String passengerTypeCode;
        @XmlAttribute(name = "AirlineVendorPrefRPH")
        protected List<String> airlineVendorPrefRPH;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

        public AirlinePrefType.TourCodePref.TourCodeInfo getTourCodeInfo() {
            return tourCodeInfo;
        }

        public void setTourCodeInfo(AirlinePrefType.TourCodePref.TourCodeInfo value) {
            this.tourCodeInfo = value;
        }

        public AirlinePrefType.TourCodePref.StaffTourCodeInfo getStaffTourCodeInfo() {
            return staffTourCodeInfo;
        }

        public void setStaffTourCodeInfo(AirlinePrefType.TourCodePref.StaffTourCodeInfo value) {
            this.staffTourCodeInfo = value;
        }

        public String getPassengerTypeCode() {
            return passengerTypeCode;
        }

        public void setPassengerTypeCode(String value) {
            this.passengerTypeCode = value;
        }

        public List<String> getAirlineVendorPrefRPH() {
            if (airlineVendorPrefRPH == null) {
                airlineVendorPrefRPH = new ArrayList<String>();
            }
            return this.airlineVendorPrefRPH;
        }

        public TransferActionType getTransferAction() {
            return transferAction;
        }

        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }


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

            public String getStaffType() {
                return staffType;
            }

            public void setStaffType(String value) {
                this.staffType = value;
            }

            public String getEmployeeID() {
                return employeeID;
            }

            public void setEmployeeID(String value) {
                this.employeeID = value;
            }

            public String getVendorCode() {
                return vendorCode;
            }

            public void setVendorCode(String value) {
                this.vendorCode = value;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String value) {
                this.description = value;
            }
        }

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

            public String getTourTypeCode() {
                return tourTypeCode;
            }

            public void setTourTypeCode(String value) {
                this.tourTypeCode = value;
            }

            public BigInteger getYearNum() {
                return yearNum;
            }

            public void setYearNum(BigInteger value) {
                this.yearNum = value;
            }

            public String getPromotionCode() {
                return promotionCode;
            }

            public void setPromotionCode(String value) {
                this.promotionCode = value;
            }

            public List<String> getPromotionVendorCode() {
                if (promotionVendorCode == null) {
                    promotionVendorCode = new ArrayList<String>();
                }
                return this.promotionVendorCode;
            }

            public String getPartyID() {
                return partyID;
            }

            public void setPartyID(String value) {
                this.partyID = value;
            }
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VendorPref extends CompanyNamePrefType {
        @XmlAttribute(name = "RPH")
        protected String rph;

        public String getRPH() {
            return rph;
        }

        public void setRPH(String value) {
            this.rph = value;
        }
    }
}