package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfViewershipsTypeViewership", propOrder = {"viewership"})
public class ArrayOfViewershipsTypeViewership {
    @XmlElement(name = "Viewership")
    protected List<ArrayOfViewershipsTypeViewership.Viewership> viewership;

    public List<ArrayOfViewershipsTypeViewership.Viewership> getViewership() {
        if (viewership == null) {
            viewership = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership>();
        }
        return this.viewership;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"viewershipCodes", "systemCodes", "profileTypes", "profileRefs", "profiles", "locationCodes", "bookingChannelCodes", "distributorTypes"})
    public static class Viewership {
        @XmlElement(name = "ViewershipCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes viewershipCodes;
        @XmlElement(name = "SystemCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.SystemCodes systemCodes;
        @XmlElement(name = "ProfileTypes")
        protected ArrayOfViewershipsTypeViewershipProfileType profileTypes;
        @XmlElement(name = "ProfileRefs")
        protected ArrayOfUniqueIDType profileRefs;
        @XmlElement(name = "Profiles")
        protected ArrayOfProfileType profiles;
        @XmlElement(name = "LocationCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.LocationCodes locationCodes;
        @XmlElement(name = "BookingChannelCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes bookingChannelCodes;
        @XmlElement(name = "DistributorTypes")
        protected ArrayOfViewershipsTypeViewershipDistributorType distributorTypes;
        @XmlAttribute(name = "ViewershipRPH")
        protected String viewershipRPH;
        @XmlAttribute(name = "ViewOnly")
        protected Boolean viewOnly;

        public ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes getViewershipCodes() {
            return viewershipCodes;
        }

        public void setViewershipCodes(ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes value) {
            this.viewershipCodes = value;
        }

        public ArrayOfViewershipsTypeViewership.Viewership.SystemCodes getSystemCodes() {
            return systemCodes;
        }

        public void setSystemCodes(ArrayOfViewershipsTypeViewership.Viewership.SystemCodes value) {
            this.systemCodes = value;
        }

        public ArrayOfViewershipsTypeViewershipProfileType getProfileTypes() {
            return profileTypes;
        }

        public void setProfileTypes(ArrayOfViewershipsTypeViewershipProfileType value) {
            this.profileTypes = value;
        }

        public ArrayOfUniqueIDType getProfileRefs() {
            return profileRefs;
        }

        public void setProfileRefs(ArrayOfUniqueIDType value) {
            this.profileRefs = value;
        }

        public ArrayOfProfileType getProfiles() {
            return profiles;
        }

        public void setProfiles(ArrayOfProfileType value) {
            this.profiles = value;
        }

        public ArrayOfViewershipsTypeViewership.Viewership.LocationCodes getLocationCodes() {
            return locationCodes;
        }

        public void setLocationCodes(ArrayOfViewershipsTypeViewership.Viewership.LocationCodes value) {
            this.locationCodes = value;
        }

        public ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes getBookingChannelCodes() {
            return bookingChannelCodes;
        }

        public void setBookingChannelCodes(ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes value) {
            this.bookingChannelCodes = value;
        }

        public ArrayOfViewershipsTypeViewershipDistributorType getDistributorTypes() {
            return distributorTypes;
        }

        public void setDistributorTypes(ArrayOfViewershipsTypeViewershipDistributorType value) {
            this.distributorTypes = value;
        }

        public String getViewershipRPH() {
            return viewershipRPH;
        }

        public void setViewershipRPH(String value) {
            this.viewershipRPH = value;
        }

        public Boolean isViewOnly() {
            return viewOnly;
        }

        public void setViewOnly(Boolean value) {
            this.viewOnly = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"bookingChannelCode"})
        public static class BookingChannelCodes {
            @XmlElement(name = "BookingChannelCode")
            protected List<ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode> bookingChannelCode;
            @XmlAttribute(name = "ChannelCodesInclusive")
            protected Boolean channelCodesInclusive;

            public List<ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode> getBookingChannelCode() {
                if (bookingChannelCode == null) {
                    bookingChannelCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode>();
                }
                return this.bookingChannelCode;
            }

            public Boolean isChannelCodesInclusive() {
                return channelCodesInclusive;
            }

            public void setChannelCodesInclusive(Boolean value) {
                this.channelCodesInclusive = value;
            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"value"})
            public static class BookingChannelCode {
                @XmlValue
                protected String value;
                @XmlAttribute(name = "RestrictedDisplayIndicator")
                protected Boolean restrictedDisplayIndicator;
                @XmlAttribute(name = "Sort")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger sort;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public Boolean isRestrictedDisplayIndicator() {
                    return restrictedDisplayIndicator;
                }

                public void setRestrictedDisplayIndicator(Boolean value) {
                    this.restrictedDisplayIndicator = value;
                }

                public BigInteger getSort() {
                    return sort;
                }

                public void setSort(BigInteger value) {
                    this.sort = value;
                }
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"locationCode"})
        public static class LocationCodes {
            @XmlElement(name = "LocationCode")
            protected List<ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode> locationCode;
            @XmlAttribute(name = "LocationCodesInclusive")
            protected Boolean locationCodesInclusive;

            public List<ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode> getLocationCode() {
                if (locationCode == null) {
                    locationCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode>();
                }
                return this.locationCode;
            }

            public Boolean isLocationCodesInclusive() {
                return locationCodesInclusive;
            }

            public void setLocationCodesInclusive(Boolean value) {
                this.locationCodesInclusive = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LocationCode {
                @XmlAttribute(name = "CityCode")
                protected String cityCode;
                @XmlAttribute(name = "StateProvinceCode")
                protected String stateProvinceCode;
                @XmlAttribute(name = "CountryCode")
                protected String countryCode;

                public String getCityCode() {
                    return cityCode;
                }

                public void setCityCode(String value) {
                    this.cityCode = value;
                }

                public String getStateProvinceCode() {
                    return stateProvinceCode;
                }

                public void setStateProvinceCode(String value) {
                    this.stateProvinceCode = value;
                }

                public String getCountryCode() {
                    return countryCode;
                }

                public void setCountryCode(String value) {
                    this.countryCode = value;
                }
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"systemCode"})
        public static class SystemCodes {
            @XmlElement(name = "SystemCode")
            protected List<ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode> systemCode;
            @XmlAttribute(name = "SystemCodesInclusive")
            protected Boolean systemCodesInclusive;

            public List<ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode> getSystemCode() {
                if (systemCode == null) {
                    systemCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode>();
                }
                return this.systemCode;
            }

            public Boolean isSystemCodesInclusive() {
                return systemCodesInclusive;
            }

            public void setSystemCodesInclusive(Boolean value) {
                this.systemCodesInclusive = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"value"})
            public static class SystemCode {
                @XmlValue
                protected String value;
                @XmlAttribute(name = "RestrictedDisplayIndicator")
                protected Boolean restrictedDisplayIndicator;
                @XmlAttribute(name = "Sort")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger sort;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public Boolean isRestrictedDisplayIndicator() {
                    return restrictedDisplayIndicator;
                }

                public void setRestrictedDisplayIndicator(Boolean value) {
                    this.restrictedDisplayIndicator = value;
                }

                public BigInteger getSort() {
                    return sort;
                }

                public void setSort(BigInteger value) {
                    this.sort = value;
                }
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"viewershipCode"})
        public static class ViewershipCodes {
            @XmlElement(name = "ViewershipCode")
            protected String viewershipCode;

            public String getViewershipCode() {
                return viewershipCode;
            }

            public void setViewershipCode(String value) {
                this.viewershipCode = value;
            }
        }
    }
}