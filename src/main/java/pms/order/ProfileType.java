package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ProfileType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accesses" type="{http://www.opentravel.org/OTA/2003/05}AccessesType" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://www.opentravel.org/OTA/2003/05}CustomerType" minOccurs="0"/>
 *         &lt;element name="UserID" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                 &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrefCollections" type="{http://www.opentravel.org/OTA/2003/05}PreferencesType" minOccurs="0"/>
 *         &lt;element name="CompanyInfo" type="{http://www.opentravel.org/OTA/2003/05}CompanyInfoType" minOccurs="0"/>
 *         &lt;element name="Affiliations" type="{http://www.opentravel.org/OTA/2003/05}AffiliationsType" minOccurs="0"/>
 *         &lt;element name="Agreements" type="{http://www.opentravel.org/OTA/2003/05}AgreementsType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfileTypeComment" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareAllSynchInd" type="{http://www.opentravel.org/OTA/2003/05}YesNoType" />
 *       &lt;attribute name="ShareAllMarketInd" type="{http://www.opentravel.org/OTA/2003/05}YesNoType" />
 *       &lt;attribute name="ShareAllOptOutInd" type="{http://www.opentravel.org/OTA/2003/05}YesNoType" />
 *       &lt;attribute name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StatusCode">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileType", propOrder = {
        "accesses",
        "customer",
        "userID",
        "prefCollections",
        "companyInfo",
        "affiliations",
        "agreements",
        "comments",
        "tpaExtensions"
})
public class ProfileType {

    @XmlElement(name = "Accesses")
    protected AccessesType accesses;
    @XmlElement(name = "Customer")
    protected CustomerType customer;
    @XmlElement(name = "UserID")
    protected List<ProfileType.UserID> userID;
    @XmlElement(name = "PrefCollections")
    protected PreferencesType prefCollections;
    @XmlElement(name = "CompanyInfo")
    protected CompanyInfoType companyInfo;
    @XmlElement(name = "Affiliations")
    protected AffiliationsType affiliations;
    @XmlElement(name = "Agreements")
    protected AgreementsType agreements;
    @XmlElement(name = "Comments")
    protected ArrayOfProfileTypeComment comments;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ShareAllSynchInd")
    protected YesNoType shareAllSynchInd;
    @XmlAttribute(name = "ShareAllMarketInd")
    protected YesNoType shareAllMarketInd;
    @XmlAttribute(name = "ShareAllOptOutInd")
    protected YesNoType shareAllOptOutInd;
    @XmlAttribute(name = "ProfileType")
    protected String profileType;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "PurgeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purgeDate;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "StatusCode")
    protected List<String> statusCode;

    /**
     * ��ȡaccesses���Ե�ֵ��
     *
     * @return possible object is
     * {@link AccessesType }
     */
    public AccessesType getAccesses() {
        return accesses;
    }

    /**
     * ����accesses���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AccessesType }
     */
    public void setAccesses(AccessesType value) {
        this.accesses = value;
    }

    /**
     * ��ȡcustomer���Ե�ֵ��
     *
     * @return possible object is
     * {@link CustomerType }
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * ����customer���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CustomerType }
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the userID property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userID property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserID().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileType.UserID }
     */
    public List<ProfileType.UserID> getUserID() {
        if (userID == null) {
            userID = new ArrayList<ProfileType.UserID>();
        }
        return this.userID;
    }

    /**
     * ��ȡprefCollections���Ե�ֵ��
     *
     * @return possible object is
     * {@link PreferencesType }
     */
    public PreferencesType getPrefCollections() {
        return prefCollections;
    }

    /**
     * ����prefCollections���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PreferencesType }
     */
    public void setPrefCollections(PreferencesType value) {
        this.prefCollections = value;
    }

    /**
     * ��ȡcompanyInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link CompanyInfoType }
     */
    public CompanyInfoType getCompanyInfo() {
        return companyInfo;
    }

    /**
     * ����companyInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CompanyInfoType }
     */
    public void setCompanyInfo(CompanyInfoType value) {
        this.companyInfo = value;
    }

    /**
     * ��ȡaffiliations���Ե�ֵ��
     *
     * @return possible object is
     * {@link AffiliationsType }
     */
    public AffiliationsType getAffiliations() {
        return affiliations;
    }

    /**
     * ����affiliations���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AffiliationsType }
     */
    public void setAffiliations(AffiliationsType value) {
        this.affiliations = value;
    }

    /**
     * ��ȡagreements���Ե�ֵ��
     *
     * @return possible object is
     * {@link AgreementsType }
     */
    public AgreementsType getAgreements() {
        return agreements;
    }

    /**
     * ����agreements���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AgreementsType }
     */
    public void setAgreements(AgreementsType value) {
        this.agreements = value;
    }

    /**
     * ��ȡcomments���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfProfileTypeComment }
     */
    public ArrayOfProfileTypeComment getComments() {
        return comments;
    }

    /**
     * ����comments���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfProfileTypeComment }
     */
    public void setComments(ArrayOfProfileTypeComment value) {
        this.comments = value;
    }

    /**
     * ��ȡtpaExtensions���Ե�ֵ��
     *
     * @return possible object is
     * {@link TPAExtensionsType }
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * ����tpaExtensions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TPAExtensionsType }
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * ��ȡshareAllSynchInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link YesNoType }
     */
    public YesNoType getShareAllSynchInd() {
        return shareAllSynchInd;
    }

    /**
     * ����shareAllSynchInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link YesNoType }
     */
    public void setShareAllSynchInd(YesNoType value) {
        this.shareAllSynchInd = value;
    }

    /**
     * ��ȡshareAllMarketInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link YesNoType }
     */
    public YesNoType getShareAllMarketInd() {
        return shareAllMarketInd;
    }

    /**
     * ����shareAllMarketInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link YesNoType }
     */
    public void setShareAllMarketInd(YesNoType value) {
        this.shareAllMarketInd = value;
    }

    /**
     * ��ȡshareAllOptOutInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link YesNoType }
     */
    public YesNoType getShareAllOptOutInd() {
        return shareAllOptOutInd;
    }

    /**
     * ����shareAllOptOutInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link YesNoType }
     */
    public void setShareAllOptOutInd(YesNoType value) {
        this.shareAllOptOutInd = value;
    }

    /**
     * ��ȡprofileType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * ����profileType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileType(String value) {
        this.profileType = value;
    }

    /**
     * ��ȡcreateDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * ����createDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * ��ȡcreatorID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * ����creatorID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * ��ȡlastModifyDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * ����lastModifyDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * ��ȡlastModifierID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * ����lastModifierID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * ��ȡpurgeDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * ����purgeDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
    }

    /**
     * ��ȡrph���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRPH() {
        return rph;
    }

    /**
     * ����rph���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the statusCode property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusCode property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusCode().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getStatusCode() {
        if (statusCode == null) {
            statusCode = new ArrayList<String>();
        }
        return this.statusCode;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *       &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UserID
            extends UniqueIDType {

        @XmlAttribute(name = "PinNumber")
        protected String pinNumber;

        /**
         * ��ȡpinNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPinNumber() {
            return pinNumber;
        }

        /**
         * ����pinNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPinNumber(String value) {
            this.pinNumber = value;
        }

    }

}
