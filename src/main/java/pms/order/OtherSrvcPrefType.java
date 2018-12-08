package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherSrvcPrefType", propOrder = {"otherSrvcName", "vendorPref", "loyaltyPref", "paymentFormPref", "specRequestPref", "tpaExtensions"})
public class OtherSrvcPrefType {
    @XmlElement(name = "OtherSrvcName")
    protected String otherSrvcName;
    @XmlElement(name = "VendorPref")
    protected List<CompanyNamePrefType> vendorPref;
    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPrefType> loyaltyPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPrefType> paymentFormPref;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPrefType> specRequestPref;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "TravelPurpose")
    protected String travelPurpose;

    public String getOtherSrvcName() {
        return otherSrvcName;
    }

    public void setOtherSrvcName(String value) {
        this.otherSrvcName = value;
    }

    public List<CompanyNamePrefType> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<CompanyNamePrefType>();
        }
        return this.vendorPref;
    }

    public List<LoyaltyPrefType> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPrefType>();
        }
        return this.loyaltyPref;
    }

    public List<PaymentFormPrefType> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPrefType>();
        }
        return this.paymentFormPref;
    }

    public List<SpecRequestPrefType> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPrefType>();
        }
        return this.specRequestPref;
    }

    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
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

    public String getTravelPurpose() {
        return travelPurpose;
    }

    public void setTravelPurpose(String value) {
        this.travelPurpose = value;
    }
}
