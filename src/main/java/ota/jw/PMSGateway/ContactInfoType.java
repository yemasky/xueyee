
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContactInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Names" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactsTypeName" minOccurs="0"/&gt;
 *         &lt;element name="Addresses" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAddressesTypeAddress" minOccurs="0"/&gt;
 *         &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPhonesTypePhone" minOccurs="0"/&gt;
 *         &lt;element name="Emails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfEmailsTypeEmail" minOccurs="0"/&gt;
 *         &lt;element name="URLs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfURLsTypeURL" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNameType"&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", propOrder = {
    "names",
    "addresses",
    "phones",
    "emails",
    "urLs",
    "companyName"
})
@XmlSeeAlso({
    ContactInfoRootType.class,
    ota.jw.PMSGateway.ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo.class,
    ota.jw.PMSGateway.AreaInfoType.Attractions.Attraction.Contact.class
})
public class ContactInfoType {

    @XmlElement(name = "Names")
    protected ArrayOfContactsTypeName names;
    @XmlElement(name = "Addresses")
    protected ArrayOfAddressesTypeAddress addresses;
    @XmlElement(name = "Phones")
    protected ArrayOfPhonesTypePhone phones;
    @XmlElement(name = "Emails")
    protected ArrayOfEmailsTypeEmail emails;
    @XmlElement(name = "URLs")
    protected ArrayOfURLsTypeURL urLs;
    @XmlElement(name = "CompanyName")
    protected ContactInfoType.CompanyName companyName;
    @XmlAttribute(name = "Location")
    protected String location;

    /**
     * 获取names属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactsTypeName }
     *     
     */
    public ArrayOfContactsTypeName getNames() {
        return names;
    }

    /**
     * 设置names属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactsTypeName }
     *     
     */
    public void setNames(ArrayOfContactsTypeName value) {
        this.names = value;
    }

    /**
     * 获取addresses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddressesTypeAddress }
     *     
     */
    public ArrayOfAddressesTypeAddress getAddresses() {
        return addresses;
    }

    /**
     * 设置addresses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddressesTypeAddress }
     *     
     */
    public void setAddresses(ArrayOfAddressesTypeAddress value) {
        this.addresses = value;
    }

    /**
     * 获取phones属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhonesTypePhone }
     *     
     */
    public ArrayOfPhonesTypePhone getPhones() {
        return phones;
    }

    /**
     * 设置phones属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhonesTypePhone }
     *     
     */
    public void setPhones(ArrayOfPhonesTypePhone value) {
        this.phones = value;
    }

    /**
     * 获取emails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailsTypeEmail }
     *     
     */
    public ArrayOfEmailsTypeEmail getEmails() {
        return emails;
    }

    /**
     * 设置emails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailsTypeEmail }
     *     
     */
    public void setEmails(ArrayOfEmailsTypeEmail value) {
        this.emails = value;
    }

    /**
     * 获取urLs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfURLsTypeURL }
     *     
     */
    public ArrayOfURLsTypeURL getURLs() {
        return urLs;
    }

    /**
     * 设置urLs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfURLsTypeURL }
     *     
     */
    public void setURLs(ArrayOfURLsTypeURL value) {
        this.urLs = value;
    }

    /**
     * 获取companyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType.CompanyName }
     *     
     */
    public ContactInfoType.CompanyName getCompanyName() {
        return companyName;
    }

    /**
     * 设置companyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType.CompanyName }
     *     
     */
    public void setCompanyName(ContactInfoType.CompanyName value) {
        this.companyName = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNameType"&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CompanyName
        extends CompanyNameType
    {

        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

    }

}
