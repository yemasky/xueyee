package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementsType", propOrder = {"certification", "allianceConsortium", "commissionInfo", "profileSecurity", "contractInformation", "tpaExtensions"})
public class AgreementsType {
    @XmlElement(name = "Certification")
    protected List<CertificationType> certification;
    @XmlElement(name = "AllianceConsortium")
    protected List<AllianceConsortiumType> allianceConsortium;
    @XmlElement(name = "CommissionInfo")
    protected List<CommissionInfoType> commissionInfo;
    @XmlElement(name = "ProfileSecurity")
    protected List<AgreementsType.ProfileSecurity> profileSecurity;
    @XmlElement(name = "ContractInformation")
    protected ParagraphType contractInformation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;

    public List<CertificationType> getCertification() {
        if (certification == null) {
            certification = new ArrayList<CertificationType>();
        }
        return this.certification;
    }

    public List<AllianceConsortiumType> getAllianceConsortium() {
        if (allianceConsortium == null) {
            allianceConsortium = new ArrayList<AllianceConsortiumType>();
        }
        return this.allianceConsortium;
    }

    public List<CommissionInfoType> getCommissionInfo() {
        if (commissionInfo == null) {
            commissionInfo = new ArrayList<CommissionInfoType>();
        }
        return this.commissionInfo;
    }

    public List<AgreementsType.ProfileSecurity> getProfileSecurity() {
        if (profileSecurity == null) {
            profileSecurity = new ArrayList<AgreementsType.ProfileSecurity>();
        }
        return this.profileSecurity;
    }

    public ParagraphType getContractInformation() {
        return contractInformation;
    }

    public void setContractInformation(ParagraphType value) {
        this.contractInformation = value;
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

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProfileSecurity {
        @XmlAttribute(name = "AccessingOrganizationType")
        protected String accessingOrganizationType;
        @XmlAttribute(name = "AccessingOrganizationID")
        protected String accessingOrganizationID;
        @XmlAttribute(name = "AccessType")
        protected String accessType;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

        public String getAccessingOrganizationType() {
            return accessingOrganizationType;
        }

        public void setAccessingOrganizationType(String value) {
            this.accessingOrganizationType = value;
        }

        public String getAccessingOrganizationID() {
            return accessingOrganizationID;
        }

        public void setAccessingOrganizationID(String value) {
            this.accessingOrganizationID = value;
        }

        public String getAccessType() {
            return accessType;
        }

        public void setAccessType(String value) {
            this.accessType = value;
        }

        public TransferActionType getTransferAction() {
            return transferAction;
        }

        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }
    }
}