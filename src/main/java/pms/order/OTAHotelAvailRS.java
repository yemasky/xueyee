package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"pos", "hotelStaysOrSuccessOrRoomStays"})
@XmlRootElement(name = "OTA_HotelAvailRS")
public class OTAHotelAvailRS {
    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElements({
            @XmlElement(name = "HotelStays", type = OTAHotelAvailRS.HotelStays.class),
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "RoomStays", type = OTAHotelAvailRS.RoomStays.class),
            @XmlElement(name = "Areas", type = AreasType.class),
            @XmlElement(name = "Criteria", type = OTAHotelAvailRS.Criteria.class),
            @XmlElement(name = "CurrencyConversions", type = OTAHotelAvailRS.CurrencyConversions.class),
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "Warnings", type = WarningsType.class),
            @XmlElement(name = "RebatePrograms", type = OTAHotelAvailRS.RebatePrograms.class),
            @XmlElement(name = "Profiles", type = ProfilesType.class),
            @XmlElement(name = "Services", type = ServicesType.class),
            @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class)})
    protected List<Object> hotelStaysOrSuccessOrRoomStays;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected String target;
    @XmlAttribute(name = "TargetName")
    protected String targetName;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected String transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "CorrelationID")
    protected String correlationID;
    @XmlAttribute(name = "SearchCacheLevel")
    protected String searchCacheLevel;

    public ArrayOfSourceType getPOS() {
        return pos;
    }

    public void setPOS(ArrayOfSourceType value) {
        this.pos = value;
    }

    public List<Object> getHotelStaysOrSuccessOrRoomStays() {
        if (hotelStaysOrSuccessOrRoomStays == null) {
            hotelStaysOrSuccessOrRoomStays = new ArrayList<Object>();
        }
        return this.hotelStaysOrSuccessOrRoomStays;
    }

    public void setHotelStaysOrSuccessOrRoomStays(List<Object> hotelStaysOrSuccessOrRoomStays) {
        this.hotelStaysOrSuccessOrRoomStays = hotelStaysOrSuccessOrRoomStays;
    }

    public String getEchoToken() {
        return echoToken;
    }

    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String value) {
        this.target = value;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String value) {
        this.targetName = value;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }


    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    public String getCorrelationID() {
        return correlationID;
    }

    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    public String getSearchCacheLevel() {
        return searchCacheLevel;
    }

    public void setSearchCacheLevel(String value) {
        this.searchCacheLevel = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"criterion"})
    public static class Criteria {
        @XmlElement(name = "Criterion")
        protected List<HotelSearchCriterionType> criterion;

        public List<HotelSearchCriterionType> getCriterion() {
            if (criterion == null) {
                criterion = new ArrayList<HotelSearchCriterionType>();
            }
            return this.criterion;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"currencyConversion"})
    public static class CurrencyConversions {
        @XmlElement(name = "CurrencyConversion")
        protected List<OTAHotelAvailRS.CurrencyConversions.CurrencyConversion> currencyConversion;

        public List<OTAHotelAvailRS.CurrencyConversions.CurrencyConversion> getCurrencyConversion() {
            if (currencyConversion == null) {
                currencyConversion = new ArrayList<OTAHotelAvailRS.CurrencyConversions.CurrencyConversion>();
            }
            return this.currencyConversion;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CurrencyConversion {

            @XmlAttribute(name = "RateConversion")
            protected BigDecimal rateConversion;
            @XmlAttribute(name = "SourceCurrencyCode")
            protected String sourceCurrencyCode;
            @XmlAttribute(name = "RequestedCurrencyCode")
            protected String requestedCurrencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;
            @XmlAttribute(name = "Source")
            protected String source;

            public BigDecimal getRateConversion() {
                return rateConversion;
            }

            public void setRateConversion(BigDecimal value) {
                this.rateConversion = value;
            }

            public String getSourceCurrencyCode() {
                return sourceCurrencyCode;
            }

            public void setSourceCurrencyCode(String value) {
                this.sourceCurrencyCode = value;
            }

            public String getRequestedCurrencyCode() {
                return requestedCurrencyCode;
            }

            public void setRequestedCurrencyCode(String value) {
                this.requestedCurrencyCode = value;
            }

            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String value) {
                this.source = value;
            }
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"hotelStay"})
    public static class HotelStays {

        @XmlElement(name = "HotelStay")
        protected List<OTAHotelAvailRS.HotelStays.HotelStay> hotelStay;

        public List<OTAHotelAvailRS.HotelStays.HotelStay> getHotelStay() {
            if (hotelStay == null) {
                hotelStay = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay>();
            }
            return this.hotelStay;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"availability", "basicPropertyInfo", "price"})
        public static class HotelStay {
            @XmlElement(name = "Availability")
            protected List<OTAHotelAvailRS.HotelStays.HotelStay.Availability> availability;
            @XmlElement(name = "BasicPropertyInfo")
            protected BasicPropertyInfoType basicPropertyInfo;
            @XmlElement(name = "Price")
            protected List<OTAHotelAvailRS.HotelStays.HotelStay.Price> price;
            @XmlAttribute(name = "RoomStayRPH")
            protected List<String> roomStayRPH;

            public List<OTAHotelAvailRS.HotelStays.HotelStay.Availability> getAvailability() {
                if (availability == null) {
                    availability = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay.Availability>();
                }
                return this.availability;
            }

            public BasicPropertyInfoType getBasicPropertyInfo() {
                return basicPropertyInfo;
            }

            public void setBasicPropertyInfo(BasicPropertyInfoType value) {
                this.basicPropertyInfo = value;
            }

            public List<OTAHotelAvailRS.HotelStays.HotelStay.Price> getPrice() {
                if (price == null) {
                    price = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay.Price>();
                }
                return this.price;
            }

            public List<String> getRoomStayRPH() {
                if (roomStayRPH == null) {
                    roomStayRPH = new ArrayList<String>();
                }
                return this.roomStayRPH;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"restriction"})
            public static class Availability {
                @XmlElement(name = "Restriction")
                protected List<OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction> restriction;
                @XmlAttribute(name = "Status", required = true)
                protected AvailabilityStatusType status;
                @XmlAttribute(name = "Start")
                protected String start;
                @XmlAttribute(name = "Duration")
                protected String duration;
                @XmlAttribute(name = "End")
                protected String end;

                public List<OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction> getRestriction() {
                    if (restriction == null) {
                        restriction = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction>();
                    }
                    return this.restriction;
                }

                public AvailabilityStatusType getStatus() {
                    return status;
                }

                public void setStatus(AvailabilityStatusType value) {
                    this.status = value;
                }

                public String getStart() {
                    return start;
                }

                public void setStart(String value) {
                    this.start = value;
                }

                public String getDuration() {
                    return duration;
                }

                public void setDuration(String value) {
                    this.duration = value;
                }

                public String getEnd() {
                    return end;
                }

                public void setEnd(String value) {
                    this.end = value;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Restriction {
                    @XmlAttribute(name = "RestrictionType")
                    protected String restrictionType;
                    @XmlAttribute(name = "Time")
                    protected BigInteger time;
                    @XmlAttribute(name = "TimeUnit")
                    protected TimeUnitType timeUnit;

                    public String getRestrictionType() {
                        return restrictionType;
                    }

                    public void setRestrictionType(String value) {
                        this.restrictionType = value;
                    }

                    public BigInteger getTime() {
                        return time;
                    }

                    public void setTime(BigInteger value) {
                        this.time = value;
                    }

                    public TimeUnitType getTimeUnit() {
                        return timeUnit;
                    }

                    public void setTimeUnit(TimeUnitType value) {
                        this.timeUnit = value;
                    }

                }
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Price {
                @XmlAttribute(name = "Start")
                protected String start;
                @XmlAttribute(name = "Duration")
                protected String duration;
                @XmlAttribute(name = "End")
                protected String end;
                @XmlAttribute(name = "AmountBeforeTax")
                protected BigDecimal amountBeforeTax;
                @XmlAttribute(name = "AmountAfterTax")
                protected BigDecimal amountAfterTax;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "Decimal")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimal;

                public String getStart() {
                    return start;
                }

                public void setStart(String value) {
                    this.start = value;
                }

                public String getDuration() {
                    return duration;
                }

                public void setDuration(String value) {
                    this.duration = value;
                }

                public String getEnd() {
                    return end;
                }

                public void setEnd(String value) {
                    this.end = value;
                }

                public BigDecimal getAmountBeforeTax() {
                    return amountBeforeTax;
                }

                public void setAmountBeforeTax(BigDecimal value) {
                    this.amountBeforeTax = value;
                }

                public BigDecimal getAmountAfterTax() {
                    return amountAfterTax;
                }

                public void setAmountAfterTax(BigDecimal value) {
                    this.amountAfterTax = value;
                }

                public String getCurrencyCode() {
                    return currencyCode;
                }

                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                public BigInteger getDecimal() {
                    return decimal;
                }

                public void setDecimal(BigInteger value) {
                    this.decimal = value;
                }
            }
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"rebateProgram"})
    public static class RebatePrograms {
        @XmlElement(name = "RebateProgram")
        protected List<RebateType> rebateProgram;

        public List<RebateType> getRebateProgram() {
            if (rebateProgram == null) {
                rebateProgram = new ArrayList<RebateType>();
            }
            return this.rebateProgram;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"roomStay"})
    public static class RoomStays {
        @XmlElement(name = "RoomStay")
        protected List<OTAHotelAvailRS.RoomStays.RoomStay> roomStay;
        @XmlAttribute(name = "MoreIndicator")
        protected String moreIndicator;
        @XmlAttribute(name = "SortOrder")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger sortOrder;

        public List<OTAHotelAvailRS.RoomStays.RoomStay> getRoomStay() {
            if (roomStay == null) {
                roomStay = new ArrayList<OTAHotelAvailRS.RoomStays.RoomStay>();
            }
            return this.roomStay;
        }

        public String getMoreIndicator() {
            return moreIndicator;
        }

        public void setMoreIndicator(String value) {
            this.moreIndicator = value;
        }

        public BigInteger getSortOrder() {
            return sortOrder;
        }

        public void setSortOrder(BigInteger value) {
            this.sortOrder = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"reference", "serviceRPHs"})
        public static class RoomStay extends RoomStayType {
            @XmlElement(name = "Reference")
            protected OTAHotelAvailRS.RoomStays.RoomStay.Reference reference;
            @XmlElement(name = "ServiceRPHs")
            protected ArrayOfServiceRPHsTypeServiceRPH serviceRPHs;
            @XmlAttribute(name = "IsAlternate")
            protected Boolean isAlternate;
            @XmlAttribute(name = "AvailabilityStatus")
            protected RateIndicatorType availabilityStatus;
            @XmlAttribute(name = "ResponseType")
            protected String responseType;
            @XmlAttribute(name = "RoomStayCandidateRPH")
            protected String roomStayCandidateRPH;
            @XmlAttribute(name = "MoreDataEchoToken")
            protected String moreDataEchoToken;
            @XmlAttribute(name = "InfoSource")
            protected String infoSource;
            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "AvailableIndicator")
            protected Boolean availableIndicator;

            public OTAHotelAvailRS.RoomStays.RoomStay.Reference getReference() {
                return reference;
            }

            public void setReference(OTAHotelAvailRS.RoomStays.RoomStay.Reference value) {
                this.reference = value;
            }

            public ArrayOfServiceRPHsTypeServiceRPH getServiceRPHs() {
                return serviceRPHs;
            }

            public void setServiceRPHs(ArrayOfServiceRPHsTypeServiceRPH value) {
                this.serviceRPHs = value;
            }

            public Boolean isIsAlternate() {
                return isAlternate;
            }

            public void setIsAlternate(Boolean value) {
                this.isAlternate = value;
            }

            public RateIndicatorType getAvailabilityStatus() {
                return availabilityStatus;
            }

            public void setAvailabilityStatus(RateIndicatorType value) {
                this.availabilityStatus = value;
            }

            public String getResponseType() {
                return responseType;
            }

            public void setResponseType(String value) {
                this.responseType = value;
            }

            public String getRoomStayCandidateRPH() {
                return roomStayCandidateRPH;
            }

            public void setRoomStayCandidateRPH(String value) {
                this.roomStayCandidateRPH = value;
            }

            public String getMoreDataEchoToken() {
                return moreDataEchoToken;
            }

            public void setMoreDataEchoToken(String value) {
                this.moreDataEchoToken = value;
            }

            public String getInfoSource() {
                return infoSource;
            }

            public void setInfoSource(String value) {
                this.infoSource = value;
            }

            public String getRPH() {
                return rph;
            }

            public void setRPH(String value) {
                this.rph = value;
            }

            public Boolean isAvailableIndicator() {
                return availableIndicator;
            }

            public void setAvailableIndicator(Boolean value) {
                this.availableIndicator = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Reference extends UniqueIDType {
                @XmlAttribute(name = "DateTime")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar dateTime;

                public XMLGregorianCalendar getDateTime() {
                    return dateTime;
                }

                public void setDateTime(XMLGregorianCalendar value) {
                    this.dateTime = value;
                }
            }
        }
    }
}