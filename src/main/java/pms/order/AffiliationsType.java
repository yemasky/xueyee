package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliationsType", propOrder = {"organization", "employer", "travelArranger", "travelClub", "insurance", "tpaExtensions"})
public class AffiliationsType {
    @XmlElement(name = "Organization")
    protected List<OrganizationType> organization;
    @XmlElement(name = "Employer")
    protected List<EmployerType> employer;
    @XmlElement(name = "TravelArranger")
    protected List<TravelArrangerType> travelArranger;
    @XmlElement(name = "TravelClub")
    protected List<TravelClubType> travelClub;
    @XmlElement(name = "Insurance")
    protected List<InsuranceType> insurance;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;

    public List<OrganizationType> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<OrganizationType>();
        }
        return this.organization;
    }

    public List<EmployerType> getEmployer() {
        if (employer == null) {
            employer = new ArrayList<EmployerType>();
        }
        return this.employer;
    }

    public List<TravelArrangerType> getTravelArranger() {
        if (travelArranger == null) {
            travelArranger = new ArrayList<TravelArrangerType>();
        }
        return this.travelArranger;
    }

    public List<TravelClubType> getTravelClub() {
        if (travelClub == null) {
            travelClub = new ArrayList<TravelClubType>();
        }
        return this.travelClub;
    }

    public List<InsuranceType> getInsurance() {
        if (insurance == null) {
            insurance = new ArrayList<InsuranceType>();
        }
        return this.insurance;
    }

    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
}