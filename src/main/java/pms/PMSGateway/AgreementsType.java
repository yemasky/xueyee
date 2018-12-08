package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementsType", propOrder = {        "certification",        "allianceConsortium",        "commissionInfo",        "profileSecurity",        "contractInformation",        "tpaExtensions"})
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
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="AccessingOrganizationType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="ProfileOwner"/>
     *             &lt;enumeration value="IATA"/>
     *             &lt;enumeration value="Other"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="AccessingOrganizationID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AccessType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="ReadOnly"/>
     *             &lt;enumeration value="ReadWrite"/>
     *             &lt;enumeration value="NoAccess"/>
     *           &lt;/restriction>
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
    public static class ProfileSecurity {

        @XmlAttribute(name = "AccessingOrganizationType")
        protected String accessingOrganizationType;
        @XmlAttribute(name = "AccessingOrganizationID")
        protected String accessingOrganizationID;
        @XmlAttribute(name = "AccessType")
        protected String accessType;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

        /**
         * ��ȡaccessingOrganizationType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAccessingOrganizationType() {
            return accessingOrganizationType;
        }

        /**
         * ����accessingOrganizationType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAccessingOrganizationType(String value) {
            this.accessingOrganizationType = value;
        }

        /**
         * ��ȡaccessingOrganizationID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAccessingOrganizationID() {
            return accessingOrganizationID;
        }

        /**
         * ����accessingOrganizationID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAccessingOrganizationID(String value) {
            this.accessingOrganizationID = value;
        }

        /**
         * ��ȡaccessType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAccessType() {
            return accessType;
        }

        /**
         * ����accessType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAccessType(String value) {
            this.accessType = value;
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

}
