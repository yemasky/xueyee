
package ota.jw.AvailRes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AgreementsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AgreementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Certification" type="{http://www.opentravel.org/OTA/2003/05}CertificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AllianceConsortium" type="{http://www.opentravel.org/OTA/2003/05}AllianceConsortiumType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CommissionInfo" type="{http://www.opentravel.org/OTA/2003/05}CommissionInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProfileSecurity" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AccessingOrganizationType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="ProfileOwner"/&gt;
 *                       &lt;enumeration value="IATA"/&gt;
 *                       &lt;enumeration value="Other"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="AccessingOrganizationID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AccessType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="ReadOnly"/&gt;
 *                       &lt;enumeration value="ReadWrite"/&gt;
 *                       &lt;enumeration value="NoAccess"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContractInformation" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ShareSynchInd"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *             &lt;enumeration value="Inherit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ShareMarketInd"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *             &lt;enumeration value="Inherit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementsType", propOrder = {
    "certification",
    "allianceConsortium",
    "commissionInfo",
    "profileSecurity",
    "contractInformation",
    "tpaExtensions"
})
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

    /**
     * Gets the value of the certification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificationType }
     * 
     * 
     */
    public List<CertificationType> getCertification() {
        if (certification == null) {
            certification = new ArrayList<CertificationType>();
        }
        return this.certification;
    }

    /**
     * Gets the value of the allianceConsortium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allianceConsortium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllianceConsortium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllianceConsortiumType }
     * 
     * 
     */
    public List<AllianceConsortiumType> getAllianceConsortium() {
        if (allianceConsortium == null) {
            allianceConsortium = new ArrayList<AllianceConsortiumType>();
        }
        return this.allianceConsortium;
    }

    /**
     * Gets the value of the commissionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionInfoType }
     * 
     * 
     */
    public List<CommissionInfoType> getCommissionInfo() {
        if (commissionInfo == null) {
            commissionInfo = new ArrayList<CommissionInfoType>();
        }
        return this.commissionInfo;
    }

    /**
     * Gets the value of the profileSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementsType.ProfileSecurity }
     * 
     * 
     */
    public List<AgreementsType.ProfileSecurity> getProfileSecurity() {
        if (profileSecurity == null) {
            profileSecurity = new ArrayList<AgreementsType.ProfileSecurity>();
        }
        return this.profileSecurity;
    }

    /**
     * 获取contractInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getContractInformation() {
        return contractInformation;
    }

    /**
     * 设置contractInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setContractInformation(ParagraphType value) {
        this.contractInformation = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * 获取shareSynchInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * 设置shareSynchInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * 获取shareMarketInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * 设置shareMarketInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="AccessingOrganizationType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="ProfileOwner"/&gt;
     *             &lt;enumeration value="IATA"/&gt;
     *             &lt;enumeration value="Other"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="AccessingOrganizationID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AccessType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="ReadOnly"/&gt;
     *             &lt;enumeration value="ReadWrite"/&gt;
     *             &lt;enumeration value="NoAccess"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取accessingOrganizationType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccessingOrganizationType() {
            return accessingOrganizationType;
        }

        /**
         * 设置accessingOrganizationType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccessingOrganizationType(String value) {
            this.accessingOrganizationType = value;
        }

        /**
         * 获取accessingOrganizationID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccessingOrganizationID() {
            return accessingOrganizationID;
        }

        /**
         * 设置accessingOrganizationID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccessingOrganizationID(String value) {
            this.accessingOrganizationID = value;
        }

        /**
         * 获取accessType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccessType() {
            return accessType;
        }

        /**
         * 设置accessType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccessType(String value) {
            this.accessType = value;
        }

        /**
         * 获取transferAction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * 设置transferAction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }

    }

}
