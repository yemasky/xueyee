package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>PersonNameType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SurnamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NameTitle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Document" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="DocID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *       &lt;attribute name="NameType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
        "namePrefix",
        "givenName",
        "middleName",
        "surnamePrefix",
        "surname",
        "nameSuffix",
        "nameTitle",
        "document"
})
@XmlSeeAlso({
        pms.PMSGateway.OrganizationType.OrgMemberName.class,
        pms.PMSGateway.TravelClubType.ClubMemberName.class,
        pms.PMSGateway.VerificationType.PersonName.class,
        pms.PMSGateway.ArrayOfContactsTypeName.Name.class
})
public class PersonNameType {

    @XmlElement(name = "NamePrefix")
    protected List<String> namePrefix;
    @XmlElement(name = "GivenName")
    protected List<String> givenName;
    @XmlElement(name = "MiddleName")
    protected List<String> middleName;
    @XmlElement(name = "SurnamePrefix")
    protected String surnamePrefix;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "NameSuffix")
    protected List<String> nameSuffix;
    @XmlElement(name = "NameTitle")
    protected List<String> nameTitle;
    @XmlElement(name = "Document")
    protected PersonNameType.Document document;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "NameType")
    protected String nameType;

    /**
     * Gets the value of the namePrefix property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namePrefix property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamePrefix().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getNamePrefix() {
        if (namePrefix == null) {
            namePrefix = new ArrayList<String>();
        }
        return this.namePrefix;
    }

    /**
     * Gets the value of the givenName property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenName().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<String>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the middleName property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<String>();
        }
        return this.middleName;
    }

    /**
     * ��ȡsurnamePrefix���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * ����surnamePrefix���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSurnamePrefix(String value) {
        this.surnamePrefix = value;
    }

    /**
     * ��ȡsurname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSurname() {
        return surname;
    }

    /**
     * ����surname���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameSuffix property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameSuffix().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getNameSuffix() {
        if (nameSuffix == null) {
            nameSuffix = new ArrayList<String>();
        }
        return this.nameSuffix;
    }

    /**
     * Gets the value of the nameTitle property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameTitle property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameTitle().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getNameTitle() {
        if (nameTitle == null) {
            nameTitle = new ArrayList<String>();
        }
        return this.nameTitle;
    }

    /**
     * ��ȡdocument���Ե�ֵ��
     *
     * @return possible object is
     * {@link PersonNameType.Document }
     */
    public PersonNameType.Document getDocument() {
        return document;
    }

    /**
     * ����document���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PersonNameType.Document }
     */
    public void setDocument(PersonNameType.Document value) {
        this.document = value;
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
     * ��ȡnameType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * ����nameType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameType(String value) {
        this.nameType = value;
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
     *       &lt;attribute name="DocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Document {

        @XmlAttribute(name = "DocID")
        protected String docID;
        @XmlAttribute(name = "DocType")
        protected String docType;

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

    }

}
