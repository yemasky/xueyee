package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>ContactInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Names" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactsTypeName" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAddressesTypeAddress" minOccurs="0"/>
 *         &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPhonesTypePhone" minOccurs="0"/>
 *         &lt;element name="Emails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfEmailsTypeEmail" minOccurs="0"/>
 *         &lt;element name="URLs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfURLsTypeURL" minOccurs="0"/>
 *         &lt;element name="CompanyName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
        pms.PMSGateway.AreaInfoType.Attractions.Attraction.Contact.class,
        ContactInfoRootType.class,
        pms.PMSGateway.ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo.class
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
     * ��ȡnames���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfContactsTypeName }
     */
    public ArrayOfContactsTypeName getNames() {
        return names;
    }

    /**
     * ����names���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfContactsTypeName }
     */
    public void setNames(ArrayOfContactsTypeName value) {
        this.names = value;
    }

    /**
     * ��ȡaddresses���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfAddressesTypeAddress }
     */
    public ArrayOfAddressesTypeAddress getAddresses() {
        return addresses;
    }

    /**
     * ����addresses���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfAddressesTypeAddress }
     */
    public void setAddresses(ArrayOfAddressesTypeAddress value) {
        this.addresses = value;
    }

    /**
     * ��ȡphones���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfPhonesTypePhone }
     */
    public ArrayOfPhonesTypePhone getPhones() {
        return phones;
    }

    /**
     * ����phones���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfPhonesTypePhone }
     */
    public void setPhones(ArrayOfPhonesTypePhone value) {
        this.phones = value;
    }

    /**
     * ��ȡemails���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfEmailsTypeEmail }
     */
    public ArrayOfEmailsTypeEmail getEmails() {
        return emails;
    }

    /**
     * ����emails���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfEmailsTypeEmail }
     */
    public void setEmails(ArrayOfEmailsTypeEmail value) {
        this.emails = value;
    }

    /**
     * ��ȡurLs���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfURLsTypeURL }
     */
    public ArrayOfURLsTypeURL getURLs() {
        return urLs;
    }

    /**
     * ����urLs���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfURLsTypeURL }
     */
    public void setURLs(ArrayOfURLsTypeURL value) {
        this.urLs = value;
    }

    /**
     * ��ȡcompanyName���Ե�ֵ��
     *
     * @return possible object is
     * {@link ContactInfoType.CompanyName }
     */
    public ContactInfoType.CompanyName getCompanyName() {
        return companyName;
    }

    /**
     * ����companyName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ContactInfoType.CompanyName }
     */
    public void setCompanyName(ContactInfoType.CompanyName value) {
        this.companyName = value;
    }

    /**
     * ��ȡlocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocation(String value) {
        this.location = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CompanyName
            extends CompanyNameType {

        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * ��ȡid���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getID() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setID(String value) {
            this.id = value;
        }

    }

}
