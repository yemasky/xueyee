package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>DocumentType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DocHolderFormattedName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *           &lt;element name="DocHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="DocLimitations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalPersonNames" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DocIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DocIssueLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DocID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Gender">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Male"/>
 *             &lt;enumeration value="Female"/>
 *             &lt;enumeration value="Unknown"/>
 *             &lt;enumeration value="Male_NoShare"/>
 *             &lt;enumeration value="Female_NoShare"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DocIssueStateProv" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DocIssueCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DocHolderNationality" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HolderType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Infant"/>
 *             &lt;enumeration value="HeadOfHousehold"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
        "docHolderFormattedName",
        "docHolderName",
        "docLimitations",
        "additionalPersonNames"
})
public class DocumentType {

    @XmlElement(name = "DocHolderFormattedName")
    protected PersonNameType docHolderFormattedName;
    @XmlElement(name = "DocHolderName")
    protected String docHolderName;
    @XmlElement(name = "DocLimitations")
    protected List<String> docLimitations;
    @XmlElement(name = "AdditionalPersonNames")
    protected ArrayOfString additionalPersonNames;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "DocIssueAuthority")
    protected String docIssueAuthority;
    @XmlAttribute(name = "DocIssueLocation")
    protected String docIssueLocation;
    @XmlAttribute(name = "DocID")
    protected String docID;
    @XmlAttribute(name = "DocType")
    protected String docType;
    @XmlAttribute(name = "Gender")
    protected String gender;
    @XmlAttribute(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "ExpireDateExclusiveIndicator")
    protected Boolean expireDateExclusiveIndicator;
    @XmlAttribute(name = "DocIssueStateProv")
    protected String docIssueStateProv;
    @XmlAttribute(name = "DocIssueCountry")
    protected String docIssueCountry;
    @XmlAttribute(name = "BirthCountry")
    protected String birthCountry;
    @XmlAttribute(name = "BirthPlace")
    protected String birthPlace;
    @XmlAttribute(name = "DocHolderNationality")
    protected String docHolderNationality;
    @XmlAttribute(name = "ContactName")
    protected String contactName;
    @XmlAttribute(name = "HolderType")
    protected String holderType;
    @XmlAttribute(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "PostalCode")
    protected String postalCode;

    /**
     * ��ȡdocHolderFormattedName���Ե�ֵ��
     *
     * @return possible object is
     * {@link PersonNameType }
     */
    public PersonNameType getDocHolderFormattedName() {
        return docHolderFormattedName;
    }

    /**
     * ����docHolderFormattedName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PersonNameType }
     */
    public void setDocHolderFormattedName(PersonNameType value) {
        this.docHolderFormattedName = value;
    }

    /**
     * ��ȡdocHolderName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocHolderName() {
        return docHolderName;
    }

    /**
     * ����docHolderName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocHolderName(String value) {
        this.docHolderName = value;
    }

    /**
     * Gets the value of the docLimitations property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docLimitations property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocLimitations().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getDocLimitations() {
        if (docLimitations == null) {
            docLimitations = new ArrayList<String>();
        }
        return this.docLimitations;
    }

    /**
     * ��ȡadditionalPersonNames���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfString }
     */
    public ArrayOfString getAdditionalPersonNames() {
        return additionalPersonNames;
    }

    /**
     * ����additionalPersonNames���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfString }
     */
    public void setAdditionalPersonNames(ArrayOfString value) {
        this.additionalPersonNames = value;
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
     * ��ȡdocIssueAuthority���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocIssueAuthority() {
        return docIssueAuthority;
    }

    /**
     * ����docIssueAuthority���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocIssueAuthority(String value) {
        this.docIssueAuthority = value;
    }

    /**
     * ��ȡdocIssueLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocIssueLocation() {
        return docIssueLocation;
    }

    /**
     * ����docIssueLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocIssueLocation(String value) {
        this.docIssueLocation = value;
    }

    /**
     * ��ȡdocID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocID() {
        return docID;
    }

    /**
     * ����docID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocID(String value) {
        this.docID = value;
    }

    /**
     * ��ȡdocType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocType() {
        return docType;
    }

    /**
     * ����docType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * ��ȡgender���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGender() {
        return gender;
    }

    /**
     * ����gender���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * ��ȡbirthDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * ����birthDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * ��ȡeffectiveDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * ����effectiveDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * ��ȡexpireDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * ����expireDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * ��ȡexpireDateExclusiveIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isExpireDateExclusiveIndicator() {
        return expireDateExclusiveIndicator;
    }

    /**
     * ����expireDateExclusiveIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setExpireDateExclusiveIndicator(Boolean value) {
        this.expireDateExclusiveIndicator = value;
    }

    /**
     * ��ȡdocIssueStateProv���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocIssueStateProv() {
        return docIssueStateProv;
    }

    /**
     * ����docIssueStateProv���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocIssueStateProv(String value) {
        this.docIssueStateProv = value;
    }

    /**
     * ��ȡdocIssueCountry���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocIssueCountry() {
        return docIssueCountry;
    }

    /**
     * ����docIssueCountry���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocIssueCountry(String value) {
        this.docIssueCountry = value;
    }

    /**
     * ��ȡbirthCountry���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBirthCountry() {
        return birthCountry;
    }

    /**
     * ����birthCountry���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBirthCountry(String value) {
        this.birthCountry = value;
    }

    /**
     * ��ȡbirthPlace���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * ����birthPlace���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * ��ȡdocHolderNationality���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocHolderNationality() {
        return docHolderNationality;
    }

    /**
     * ����docHolderNationality���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocHolderNationality(String value) {
        this.docHolderNationality = value;
    }

    /**
     * ��ȡcontactName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * ����contactName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * ��ȡholderType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHolderType() {
        return holderType;
    }

    /**
     * ����holderType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHolderType(String value) {
        this.holderType = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * ��ȡpostalCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * ����postalCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

}
