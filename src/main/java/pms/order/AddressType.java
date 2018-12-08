package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {"streetNmbr", "bldgRoom", "addressLine", "cityName", "postalCode", "county", "stateProv", "countryName"})
@XmlSeeAlso({pms.order.DonationType.DonorInfo.ContactInfo.class, AddressInfoType.class, pms.order.ItemSearchCriterionType.Address.class})
public class AddressType {
    @XmlElement(name = "StreetNmbr")
    protected AddressType.StreetNmbr streetNmbr;
    @XmlElement(name = "BldgRoom")
    protected List<AddressType.BldgRoom> bldgRoom;
    @XmlElement(name = "AddressLine")
    protected List<String> addressLine;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "StateProv")
    protected StateProvType stateProv;
    @XmlElement(name = "CountryName")
    protected CountryNameType countryName;
    @XmlAttribute(name = "FormattedInd")
    protected Boolean formattedInd;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Remark")
    protected String remark;

    public AddressType.StreetNmbr getStreetNmbr() {
        return streetNmbr;
    }

    public void setStreetNmbr(AddressType.StreetNmbr value) {
        this.streetNmbr = value;
    }

    public List<AddressType.BldgRoom> getBldgRoom() {
        if (bldgRoom == null) {
            bldgRoom = new ArrayList<AddressType.BldgRoom>();
        }
        return this.bldgRoom;
    }

    public List<String> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<String>();
        }
        return this.addressLine;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String value) {
        this.cityName = value;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String value) {
        this.county = value;
    }

    public StateProvType getStateProv() {
        return stateProv;
    }

    public void setStateProv(StateProvType value) {
        this.stateProv = value;
    }

    public CountryNameType getCountryName() {
        return countryName;
    }

    public void setCountryName(CountryNameType value) {
        this.countryName = value;
    }

    public Boolean isFormattedInd() {
        return formattedInd;
    }

    public void setFormattedInd(Boolean value) {
        this.formattedInd = value;
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

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String value) {
        this.remark = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"value"})
    public static class BldgRoom {
        @XmlValue
        protected String value;
        @XmlAttribute(name = "BldgNameIndicator")
        protected Boolean bldgNameIndicator;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Boolean isBldgNameIndicator() {
            return bldgNameIndicator;
        }

        public void setBldgNameIndicator(Boolean value) {
            this.bldgNameIndicator = value;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StreetNmbr extends StreetNmbrType {
        @XmlAttribute(name = "StreetNmbrSuffix")
        protected String streetNmbrSuffix;
        @XmlAttribute(name = "StreetDirection")
        protected String streetDirection;
        @XmlAttribute(name = "RuralRouteNmbr")
        protected String ruralRouteNmbr;


        public String getStreetNmbrSuffix() {
            return streetNmbrSuffix;
        }

        public void setStreetNmbrSuffix(String value) {
            this.streetNmbrSuffix = value;
        }

        public String getStreetDirection() {
            return streetDirection;
        }

        public void setStreetDirection(String value) {
            this.streetDirection = value;
        }

        public String getRuralRouteNmbr() {
            return ruralRouteNmbr;
        }

        public void setRuralRouteNmbr(String value) {
            this.ruralRouteNmbr = value;
        }
    }
}