
package ota.jw.ARIPmsGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PersonNameType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PersonNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SurnamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NameTitle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Document" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="DocID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *       &lt;attribute name="NameType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
    ota.jw.ARIPmsGateway.OrganizationType.OrgMemberName.class,
    ota.jw.ARIPmsGateway.TravelClubType.ClubMemberName.class
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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namePrefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamePrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNamePrefix() {
        if (namePrefix == null) {
            namePrefix = new ArrayList<String>();
        }
        return this.namePrefix;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<String>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<String>();
        }
        return this.middleName;
    }

    /**
     * 获取surnamePrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * 设置surnamePrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnamePrefix(String value) {
        this.surnamePrefix = value;
    }

    /**
     * 获取surname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * 设置surname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameSuffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameSuffix() {
        if (nameSuffix == null) {
            nameSuffix = new ArrayList<String>();
        }
        return this.nameSuffix;
    }

    /**
     * Gets the value of the nameTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameTitle() {
        if (nameTitle == null) {
            nameTitle = new ArrayList<String>();
        }
        return this.nameTitle;
    }

    /**
     * 获取document属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType.Document }
     *     
     */
    public PersonNameType.Document getDocument() {
        return document;
    }

    /**
     * 设置document属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType.Document }
     *     
     */
    public void setDocument(PersonNameType.Document value) {
        this.document = value;
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
     * 获取nameType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * 设置nameType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
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
     *       &lt;attribute name="DocID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Document {

        @XmlAttribute(name = "DocID")
        protected String docID;
        @XmlAttribute(name = "DocType")
        protected String docType;

        /**
         * 获取docID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocID() {
            return docID;
        }

        /**
         * 设置docID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocID(String value) {
            this.docID = value;
        }

        /**
         * 获取docType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocType() {
            return docType;
        }

        /**
         * 设置docType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocType(String value) {
            this.docType = value;
        }

    }

}
