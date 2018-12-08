package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CustomerType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="PhoneLocationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PhoneLocationTypeSpecified" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PhoneTechType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PhoneTechTypeSpecified" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FormattedInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="DefaultIndSpecified" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *                 &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>EmailType">
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *                 &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                   &lt;element name="AddresseeName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ValidationStatus">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="SystemValidated"/>
 *                       &lt;enumeration value="UserValidated"/>
 *                       &lt;enumeration value="NotChecked"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *                 &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="URL" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>URL_Type">
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CitizenCountryName" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PhysChallName" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="PhysChallInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PetInfo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentForm" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
 *                 &lt;sequence>
 *                   &lt;element name="AssociatedSupplier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
 *                 &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelatedTraveler" type="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPerson" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Document" type="{http://www.opentravel.org/OTA/2003/05}DocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MemberPreferences" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AdditionalReward" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                                       &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="MemberID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Type">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="Partner"/>
 *                                           &lt;enumeration value="Loyalty"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Awareness" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PromotionVendorCode">
 *                             &lt;simpleType>
 *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="AwardsPreference">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Points"/>
 *                                 &lt;enumeration value="Miles"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SecurityInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PasswordHint" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="Hint">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="Question"/>
 *                                           &lt;enumeration value="Answer"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SubAccountBalance" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Balance" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VendorCode">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmployeeInfo" type="{http://www.opentravel.org/OTA/2003/05}EmployeeInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmployerInfo" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="AdditionalLanguage" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}language" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
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
 *       &lt;attribute name="Deceased" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LockoutType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="VIP_Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaritalStatus">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Annulled"/>
 *             &lt;enumeration value="Co-habitating"/>
 *             &lt;enumeration value="Divorced"/>
 *             &lt;enumeration value="Engaged"/>
 *             &lt;enumeration value="Married"/>
 *             &lt;enumeration value="Separated"/>
 *             &lt;enumeration value="Single"/>
 *             &lt;enumeration value="Widowed"/>
 *             &lt;enumeration value="Unknown"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PreviouslyMarriedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ChildQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", propOrder = {
        "personName",
        "telephone",
        "email",
        "address",
        "url",
        "citizenCountryName",
        "physChallName",
        "petInfo",
        "paymentForm",
        "relatedTraveler",
        "contactPerson",
        "document",
        "custLoyalty",
        "employeeInfo",
        "employerInfo",
        "additionalLanguage",
        "tpaExtensions"
})
@XmlSeeAlso({
        pms.PMSGateway.CustomerPrimaryAdditionalType.Primary.class,
        pms.PMSGateway.CustomerPrimaryAdditionalType.Additional.class
})
public class CustomerType {

    @XmlElement(name = "PersonName")
    protected List<PersonNameType> personName;
    @XmlElement(name = "Telephone")
    protected List<CustomerType.Telephone> telephone;
    @XmlElement(name = "Email")
    protected List<CustomerType.Email> email;
    @XmlElement(name = "Address")
    protected List<CustomerType.Address> address;
    @XmlElement(name = "URL")
    protected List<CustomerType.URL> url;
    @XmlElement(name = "CitizenCountryName")
    protected List<CustomerType.CitizenCountryName> citizenCountryName;
    @XmlElement(name = "PhysChallName")
    protected List<CustomerType.PhysChallName> physChallName;
    @XmlElement(name = "PetInfo")
    protected List<String> petInfo;
    @XmlElement(name = "PaymentForm")
    protected List<CustomerType.PaymentForm> paymentForm;
    @XmlElement(name = "RelatedTraveler")
    protected List<RelatedTravelerType> relatedTraveler;
    @XmlElement(name = "ContactPerson")
    protected List<ContactPersonType> contactPerson;
    @XmlElement(name = "Document")
    protected List<DocumentType> document;
    @XmlElement(name = "CustLoyalty")
    protected List<CustomerType.CustLoyalty> custLoyalty;
    @XmlElement(name = "EmployeeInfo")
    protected List<EmployeeInfoType> employeeInfo;
    @XmlElement(name = "EmployerInfo")
    protected CompanyNameType employerInfo;
    @XmlElement(name = "AdditionalLanguage")
    protected List<CustomerType.AdditionalLanguage> additionalLanguage;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "Gender")
    protected String gender;
    @XmlAttribute(name = "Deceased")
    protected Boolean deceased;
    @XmlAttribute(name = "LockoutType")
    protected String lockoutType;
    @XmlAttribute(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "VIP_Indicator")
    protected Boolean vipIndicator;
    @XmlAttribute(name = "Text")
    protected String text;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "CustomerValue")
    protected String customerValue;
    @XmlAttribute(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlAttribute(name = "PreviouslyMarriedIndicator")
    protected Boolean previouslyMarriedIndicator;
    @XmlAttribute(name = "ChildQuantity")
    protected BigInteger childQuantity;

    /**
     * Gets the value of the personName property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personName property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonName().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameType }
     */
    public List<PersonNameType> getPersonName() {
        if (personName == null) {
            personName = new ArrayList<PersonNameType>();
        }
        return this.personName;
    }

    /**
     * Gets the value of the telephone property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.Telephone }
     */
    public List<CustomerType.Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<CustomerType.Telephone>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the email property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.Email }
     */
    public List<CustomerType.Email> getEmail() {
        if (email == null) {
            email = new ArrayList<CustomerType.Email>();
        }
        return this.email;
    }

    /**
     * Gets the value of the address property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.Address }
     */
    public List<CustomerType.Address> getAddress() {
        if (address == null) {
            address = new ArrayList<CustomerType.Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the url property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURL().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.URL }
     */
    public List<CustomerType.URL> getURL() {
        if (url == null) {
            url = new ArrayList<CustomerType.URL>();
        }
        return this.url;
    }

    /**
     * Gets the value of the citizenCountryName property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenCountryName property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenCountryName().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.CitizenCountryName }
     */
    public List<CustomerType.CitizenCountryName> getCitizenCountryName() {
        if (citizenCountryName == null) {
            citizenCountryName = new ArrayList<CustomerType.CitizenCountryName>();
        }
        return this.citizenCountryName;
    }

    /**
     * Gets the value of the physChallName property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physChallName property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysChallName().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.PhysChallName }
     */
    public List<CustomerType.PhysChallName> getPhysChallName() {
        if (physChallName == null) {
            physChallName = new ArrayList<CustomerType.PhysChallName>();
        }
        return this.physChallName;
    }

    /**
     * Gets the value of the petInfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petInfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetInfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getPetInfo() {
        if (petInfo == null) {
            petInfo = new ArrayList<String>();
        }
        return this.petInfo;
    }

    /**
     * Gets the value of the paymentForm property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentForm property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentForm().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.PaymentForm }
     */
    public List<CustomerType.PaymentForm> getPaymentForm() {
        if (paymentForm == null) {
            paymentForm = new ArrayList<CustomerType.PaymentForm>();
        }
        return this.paymentForm;
    }

    /**
     * Gets the value of the relatedTraveler property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTraveler property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTraveler().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedTravelerType }
     */
    public List<RelatedTravelerType> getRelatedTraveler() {
        if (relatedTraveler == null) {
            relatedTraveler = new ArrayList<RelatedTravelerType>();
        }
        return this.relatedTraveler;
    }

    /**
     * Gets the value of the contactPerson property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPerson().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonType }
     */
    public List<ContactPersonType> getContactPerson() {
        if (contactPerson == null) {
            contactPerson = new ArrayList<ContactPersonType>();
        }
        return this.contactPerson;
    }

    /**
     * Gets the value of the document property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     */
    public List<DocumentType> getDocument() {
        if (document == null) {
            document = new ArrayList<DocumentType>();
        }
        return this.document;
    }

    /**
     * Gets the value of the custLoyalty property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.CustLoyalty }
     */
    public List<CustomerType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<CustomerType.CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * Gets the value of the employeeInfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeInfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeInfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeInfoType }
     */
    public List<EmployeeInfoType> getEmployeeInfo() {
        if (employeeInfo == null) {
            employeeInfo = new ArrayList<EmployeeInfoType>();
        }
        return this.employeeInfo;
    }

    /**
     * ��ȡemployerInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link CompanyNameType }
     */
    public CompanyNameType getEmployerInfo() {
        return employerInfo;
    }

    /**
     * ����employerInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CompanyNameType }
     */
    public void setEmployerInfo(CompanyNameType value) {
        this.employerInfo = value;
    }

    /**
     * Gets the value of the additionalLanguage property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalLanguage property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalLanguage().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.AdditionalLanguage }
     */
    public List<CustomerType.AdditionalLanguage> getAdditionalLanguage() {
        if (additionalLanguage == null) {
            additionalLanguage = new ArrayList<CustomerType.AdditionalLanguage>();
        }
        return this.additionalLanguage;
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
     * ��ȡdeceased���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDeceased() {
        return deceased;
    }

    /**
     * ����deceased���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDeceased(Boolean value) {
        this.deceased = value;
    }

    /**
     * ��ȡlockoutType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLockoutType() {
        return lockoutType;
    }

    /**
     * ����lockoutType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLockoutType(String value) {
        this.lockoutType = value;
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
     * ��ȡcurrencyCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * ����currencyCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * ��ȡdecimalPlaces���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * ����decimalPlaces���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * ��ȡvipIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVIPIndicator() {
        return vipIndicator;
    }

    /**
     * ����vipIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setVIPIndicator(Boolean value) {
        this.vipIndicator = value;
    }

    /**
     * ��ȡtext���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getText() {
        return text;
    }

    /**
     * ����text���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * ��ȡlanguage���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * ��ȡcustomerValue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCustomerValue() {
        return customerValue;
    }

    /**
     * ����customerValue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCustomerValue(String value) {
        this.customerValue = value;
    }

    /**
     * ��ȡmaritalStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * ����maritalStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * ��ȡpreviouslyMarriedIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPreviouslyMarriedIndicator() {
        return previouslyMarriedIndicator;
    }

    /**
     * ����previouslyMarriedIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPreviouslyMarriedIndicator(Boolean value) {
        this.previouslyMarriedIndicator = value;
    }

    /**
     * ��ȡchildQuantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getChildQuantity() {
        return childQuantity;
    }

    /**
     * ����childQuantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setChildQuantity(BigInteger value) {
        this.childQuantity = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}language" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalLanguage {

        @XmlAttribute(name = "Code")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String code;

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
     *       &lt;sequence>
     *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *         &lt;element name="AddresseeName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ValidationStatus">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="SystemValidated"/>
     *             &lt;enumeration value="UserValidated"/>
     *             &lt;enumeration value="NotChecked"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *       &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "companyName",
            "addresseeName"
    })
    public static class Address
            extends AddressInfoType {

        @XmlElement(name = "CompanyName")
        protected CompanyNameType companyName;
        @XmlElement(name = "AddresseeName")
        protected PersonNameType addresseeName;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;
        @XmlAttribute(name = "ValidationStatus")
        protected String validationStatus;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;
        @XmlAttribute(name = "ParentCompanyRef")
        protected String parentCompanyRef;

        /**
         * ��ȡcompanyName���Ե�ֵ��
         *
         * @return possible object is
         * {@link CompanyNameType }
         */
        public CompanyNameType getCompanyName() {
            return companyName;
        }

        /**
         * ����companyName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CompanyNameType }
         */
        public void setCompanyName(CompanyNameType value) {
            this.companyName = value;
        }

        /**
         * ��ȡaddresseeName���Ե�ֵ��
         *
         * @return possible object is
         * {@link PersonNameType }
         */
        public PersonNameType getAddresseeName() {
            return addresseeName;
        }

        /**
         * ����addresseeName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PersonNameType }
         */
        public void setAddresseeName(PersonNameType value) {
            this.addresseeName = value;
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
         * ��ȡvalidationStatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValidationStatus() {
            return validationStatus;
        }

        /**
         * ����validationStatus���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValidationStatus(String value) {
            this.validationStatus = value;
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

        /**
         * ��ȡparentCompanyRef���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getParentCompanyRef() {
            return parentCompanyRef;
        }

        /**
         * ����parentCompanyRef���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setParentCompanyRef(String value) {
            this.parentCompanyRef = value;
        }

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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CitizenCountryName {

        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
        }

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
     *       &lt;sequence>
     *         &lt;element name="MemberPreferences" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AdditionalReward" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *                             &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="MemberID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Type">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="Partner"/>
     *                                 &lt;enumeration value="Loyalty"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Awareness" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PromotionVendorCode">
     *                   &lt;simpleType>
     *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="AwardsPreference">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Points"/>
     *                       &lt;enumeration value="Miles"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SecurityInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PasswordHint" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="Hint">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="Question"/>
     *                                 &lt;enumeration value="Answer"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SubAccountBalance" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Balance" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VendorCode">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "memberPreferences",
            "securityInfo",
            "subAccountBalance"
    })
    public static class CustLoyalty {

        @XmlElement(name = "MemberPreferences")
        protected CustomerType.CustLoyalty.MemberPreferences memberPreferences;
        @XmlElement(name = "SecurityInfo")
        protected CustomerType.CustLoyalty.SecurityInfo securityInfo;
        @XmlElement(name = "SubAccountBalance")
        protected List<CustomerType.CustLoyalty.SubAccountBalance> subAccountBalance;
        @XmlAttribute(name = "ProgramID")
        protected String programID;
        @XmlAttribute(name = "MembershipID")
        protected String membershipID;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "VendorCode")
        protected List<String> vendorCode;
        @XmlAttribute(name = "PrimaryLoyaltyIndicator")
        protected Boolean primaryLoyaltyIndicator;
        @XmlAttribute(name = "AllianceLoyaltyLevelName")
        protected String allianceLoyaltyLevelName;
        @XmlAttribute(name = "CustomerType")
        protected String customerType;
        @XmlAttribute(name = "CustomerValue")
        protected String customerValue;
        @XmlAttribute(name = "Password")
        protected String password;
        @XmlAttribute(name = "Remark")
        protected String remark;

        /**
         * ��ȡmemberPreferences���Ե�ֵ��
         *
         * @return possible object is
         * {@link CustomerType.CustLoyalty.MemberPreferences }
         */
        public CustomerType.CustLoyalty.MemberPreferences getMemberPreferences() {
            return memberPreferences;
        }

        /**
         * ����memberPreferences���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CustomerType.CustLoyalty.MemberPreferences }
         */
        public void setMemberPreferences(CustomerType.CustLoyalty.MemberPreferences value) {
            this.memberPreferences = value;
        }

        /**
         * ��ȡsecurityInfo���Ե�ֵ��
         *
         * @return possible object is
         * {@link CustomerType.CustLoyalty.SecurityInfo }
         */
        public CustomerType.CustLoyalty.SecurityInfo getSecurityInfo() {
            return securityInfo;
        }

        /**
         * ����securityInfo���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CustomerType.CustLoyalty.SecurityInfo }
         */
        public void setSecurityInfo(CustomerType.CustLoyalty.SecurityInfo value) {
            this.securityInfo = value;
        }

        /**
         * Gets the value of the subAccountBalance property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subAccountBalance property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubAccountBalance().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerType.CustLoyalty.SubAccountBalance }
         */
        public List<CustomerType.CustLoyalty.SubAccountBalance> getSubAccountBalance() {
            if (subAccountBalance == null) {
                subAccountBalance = new ArrayList<CustomerType.CustLoyalty.SubAccountBalance>();
            }
            return this.subAccountBalance;
        }

        /**
         * ��ȡprogramID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getProgramID() {
            return programID;
        }

        /**
         * ����programID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProgramID(String value) {
            this.programID = value;
        }

        /**
         * ��ȡmembershipID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMembershipID() {
            return membershipID;
        }

        /**
         * ����membershipID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMembershipID(String value) {
            this.membershipID = value;
        }

        /**
         * ��ȡtravelSector���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * ����travelSector���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
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
         * Gets the value of the vendorCode property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorCode().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getVendorCode() {
            if (vendorCode == null) {
                vendorCode = new ArrayList<String>();
            }
            return this.vendorCode;
        }

        /**
         * ��ȡprimaryLoyaltyIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isPrimaryLoyaltyIndicator() {
            return primaryLoyaltyIndicator;
        }

        /**
         * ����primaryLoyaltyIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setPrimaryLoyaltyIndicator(Boolean value) {
            this.primaryLoyaltyIndicator = value;
        }

        /**
         * ��ȡallianceLoyaltyLevelName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAllianceLoyaltyLevelName() {
            return allianceLoyaltyLevelName;
        }

        /**
         * ����allianceLoyaltyLevelName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAllianceLoyaltyLevelName(String value) {
            this.allianceLoyaltyLevelName = value;
        }

        /**
         * ��ȡcustomerType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCustomerType() {
            return customerType;
        }

        /**
         * ����customerType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCustomerType(String value) {
            this.customerType = value;
        }

        /**
         * ��ȡcustomerValue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCustomerValue() {
            return customerValue;
        }

        /**
         * ����customerValue���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCustomerValue(String value) {
            this.customerValue = value;
        }

        /**
         * ��ȡpassword���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPassword() {
            return password;
        }

        /**
         * ����password���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPassword(String value) {
            this.password = value;
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
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AdditionalReward" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
         *                   &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="MemberID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Type">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="Partner"/>
         *                       &lt;enumeration value="Loyalty"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Awareness" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PromotionVendorCode">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="AwardsPreference">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Points"/>
         *             &lt;enumeration value="Miles"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "additionalReward",
                "offer"
        })
        public static class MemberPreferences {

            @XmlElement(name = "AdditionalReward")
            protected List<CustomerType.CustLoyalty.MemberPreferences.AdditionalReward> additionalReward;
            @XmlElement(name = "Offer")
            protected List<CustomerType.CustLoyalty.MemberPreferences.Offer> offer;
            @XmlAttribute(name = "Awareness")
            protected String awareness;
            @XmlAttribute(name = "PromotionCode")
            protected String promotionCode;
            @XmlAttribute(name = "PromotionVendorCode")
            protected List<String> promotionVendorCode;
            @XmlAttribute(name = "AwardsPreference")
            protected String awardsPreference;

            /**
             * Gets the value of the additionalReward property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalReward property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdditionalReward().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link CustomerType.CustLoyalty.MemberPreferences.AdditionalReward }
             */
            public List<CustomerType.CustLoyalty.MemberPreferences.AdditionalReward> getAdditionalReward() {
                if (additionalReward == null) {
                    additionalReward = new ArrayList<CustomerType.CustLoyalty.MemberPreferences.AdditionalReward>();
                }
                return this.additionalReward;
            }

            /**
             * Gets the value of the offer property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the offer property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOffer().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link CustomerType.CustLoyalty.MemberPreferences.Offer }
             */
            public List<CustomerType.CustLoyalty.MemberPreferences.Offer> getOffer() {
                if (offer == null) {
                    offer = new ArrayList<CustomerType.CustLoyalty.MemberPreferences.Offer>();
                }
                return this.offer;
            }

            /**
             * ��ȡawareness���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAwareness() {
                return awareness;
            }

            /**
             * ����awareness���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAwareness(String value) {
                this.awareness = value;
            }

            /**
             * ��ȡpromotionCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getPromotionCode() {
                return promotionCode;
            }

            /**
             * ����promotionCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPromotionCode(String value) {
                this.promotionCode = value;
            }

            /**
             * Gets the value of the promotionVendorCode property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPromotionVendorCode().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getPromotionVendorCode() {
                if (promotionVendorCode == null) {
                    promotionVendorCode = new ArrayList<String>();
                }
                return this.promotionVendorCode;
            }

            /**
             * ��ȡawardsPreference���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAwardsPreference() {
                return awardsPreference;
            }

            /**
             * ����awardsPreference���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAwardsPreference(String value) {
                this.awardsPreference = value;
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
             *       &lt;sequence>
             *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
             *         &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="MemberID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "companyName",
                    "name"
            })
            public static class AdditionalReward {

                @XmlElement(name = "CompanyName")
                protected CompanyNameType companyName;
                @XmlElement(name = "Name")
                protected PersonNameType name;
                @XmlAttribute(name = "MemberID")
                protected String memberID;

                /**
                 * ��ȡcompanyName���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link CompanyNameType }
                 */
                public CompanyNameType getCompanyName() {
                    return companyName;
                }

                /**
                 * ����companyName���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link CompanyNameType }
                 */
                public void setCompanyName(CompanyNameType value) {
                    this.companyName = value;
                }

                /**
                 * ��ȡname���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link PersonNameType }
                 */
                public PersonNameType getName() {
                    return name;
                }

                /**
                 * ����name���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link PersonNameType }
                 */
                public void setName(PersonNameType value) {
                    this.name = value;
                }

                /**
                 * ��ȡmemberID���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getMemberID() {
                    return memberID;
                }

                /**
                 * ����memberID���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setMemberID(String value) {
                    this.memberID = value;
                }

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
             *       &lt;sequence>
             *         &lt;element name="Communication" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Type">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="Partner"/>
             *             &lt;enumeration value="Loyalty"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "communication"
            })
            public static class Offer {

                @XmlElement(name = "Communication")
                protected List<CustomerType.CustLoyalty.MemberPreferences.Offer.Communication> communication;
                @XmlAttribute(name = "Type")
                protected String type;

                /**
                 * Gets the value of the communication property.
                 * <p/>
                 * <p/>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the communication property.
                 * <p/>
                 * <p/>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCommunication().add(newItem);
                 * </pre>
                 * <p/>
                 * <p/>
                 * <p/>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CustomerType.CustLoyalty.MemberPreferences.Offer.Communication }
                 */
                public List<CustomerType.CustLoyalty.MemberPreferences.Offer.Communication> getCommunication() {
                    if (communication == null) {
                        communication = new ArrayList<CustomerType.CustLoyalty.MemberPreferences.Offer.Communication>();
                    }
                    return this.communication;
                }

                /**
                 * ��ȡtype���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getType() {
                    return type;
                }

                /**
                 * ����type���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setType(String value) {
                    this.type = value;
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
                 *       &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Communication {

                    @XmlAttribute(name = "DistribType")
                    protected String distribType;

                    /**
                     * ��ȡdistribType���Ե�ֵ��
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getDistribType() {
                        return distribType;
                    }

                    /**
                     * ����distribType���Ե�ֵ��
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setDistribType(String value) {
                        this.distribType = value;
                    }

                }

            }

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
         *       &lt;sequence>
         *         &lt;element name="PasswordHint" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="Hint">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="Question"/>
         *                       &lt;enumeration value="Answer"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "passwordHint"
        })
        public static class SecurityInfo {

            @XmlElement(name = "PasswordHint")
            protected List<CustomerType.CustLoyalty.SecurityInfo.PasswordHint> passwordHint;
            @XmlAttribute(name = "Username")
            protected String username;
            @XmlAttribute(name = "Password")
            protected String password;

            /**
             * Gets the value of the passwordHint property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passwordHint property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPasswordHint().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link CustomerType.CustLoyalty.SecurityInfo.PasswordHint }
             */
            public List<CustomerType.CustLoyalty.SecurityInfo.PasswordHint> getPasswordHint() {
                if (passwordHint == null) {
                    passwordHint = new ArrayList<CustomerType.CustLoyalty.SecurityInfo.PasswordHint>();
                }
                return this.passwordHint;
            }

            /**
             * ��ȡusername���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getUsername() {
                return username;
            }

            /**
             * ����username���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setUsername(String value) {
                this.username = value;
            }

            /**
             * ��ȡpassword���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getPassword() {
                return password;
            }

            /**
             * ����password���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPassword(String value) {
                this.password = value;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * <p/>
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * <p/>
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="Hint">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="Question"/>
             *             &lt;enumeration value="Answer"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "value"
            })
            public static class PasswordHint {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Hint")
                protected String hint;

                /**
                 * ��ȡvalue���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * ����value���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * ��ȡhint���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHint() {
                    return hint;
                }

                /**
                 * ����hint���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHint(String value) {
                    this.hint = value;
                }

            }

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
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Balance" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SubAccountBalance {

            @XmlAttribute(name = "Type")
            protected String type;
            @XmlAttribute(name = "Balance")
            protected BigInteger balance;

            /**
             * ��ȡtype���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getType() {
                return type;
            }

            /**
             * ����type���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * ��ȡbalance���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getBalance() {
                return balance;
            }

            /**
             * ����balance���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setBalance(BigInteger value) {
                this.balance = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>EmailType">
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *       &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Email
            extends EmailType {

        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;
        @XmlAttribute(name = "ParentCompanyRef")
        protected String parentCompanyRef;

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

        /**
         * ��ȡparentCompanyRef���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getParentCompanyRef() {
            return parentCompanyRef;
        }

        /**
         * ����parentCompanyRef���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setParentCompanyRef(String value) {
            this.parentCompanyRef = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
     *       &lt;sequence>
     *         &lt;element name="AssociatedSupplier" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *       &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "associatedSupplier"
    })
    public static class PaymentForm
            extends PaymentFormType {

        @XmlElement(name = "AssociatedSupplier")
        protected CustomerType.PaymentForm.AssociatedSupplier associatedSupplier;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;
        @XmlAttribute(name = "DefaultInd")
        protected Boolean defaultInd;
        @XmlAttribute(name = "ParentCompanyRef")
        protected String parentCompanyRef;

        /**
         * ��ȡassociatedSupplier���Ե�ֵ��
         *
         * @return possible object is
         * {@link CustomerType.PaymentForm.AssociatedSupplier }
         */
        public CustomerType.PaymentForm.AssociatedSupplier getAssociatedSupplier() {
            return associatedSupplier;
        }

        /**
         * ����associatedSupplier���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CustomerType.PaymentForm.AssociatedSupplier }
         */
        public void setAssociatedSupplier(CustomerType.PaymentForm.AssociatedSupplier value) {
            this.associatedSupplier = value;
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

        /**
         * ��ȡdefaultInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isDefaultInd() {
            return defaultInd;
        }

        /**
         * ����defaultInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setDefaultInd(Boolean value) {
            this.defaultInd = value;
        }

        /**
         * ��ȡparentCompanyRef���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getParentCompanyRef() {
            return parentCompanyRef;
        }

        /**
         * ����parentCompanyRef���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setParentCompanyRef(String value) {
            this.parentCompanyRef = value;
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
         *       &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AssociatedSupplier {

            @XmlAttribute(name = "CompanyShortName")
            protected String companyShortName;
            @XmlAttribute(name = "TravelSector")
            protected String travelSector;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * ��ȡcompanyShortName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getCompanyShortName() {
                return companyShortName;
            }

            /**
             * ����companyShortName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCompanyShortName(String value) {
                this.companyShortName = value;
            }

            /**
             * ��ȡtravelSector���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getTravelSector() {
                return travelSector;
            }

            /**
             * ����travelSector���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTravelSector(String value) {
                this.travelSector = value;
            }

            /**
             * ��ȡcode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getCode() {
                return code;
            }

            /**
             * ����code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * ��ȡcodeContext���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getCodeContext() {
                return codeContext;
            }

            /**
             * ����codeContext���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="PhysChallInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    public static class PhysChallName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "PhysChallInd")
        protected Boolean physChallInd;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * ��ȡphysChallInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isPhysChallInd() {
            return physChallInd;
        }

        /**
         * ����physChallInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setPhysChallInd(Boolean value) {
            this.physChallInd = value;
        }

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
     *       &lt;attribute name="PhoneLocationType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PhoneLocationTypeSpecified" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PhoneTechType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PhoneTechTypeSpecified" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FormattedInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="DefaultIndSpecified" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *       &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {

        @XmlAttribute(name = "PhoneLocationType")
        protected String phoneLocationType;
        @XmlAttribute(name = "PhoneLocationTypeSpecified", required = true)
        protected boolean phoneLocationTypeSpecified;
        @XmlAttribute(name = "PhoneTechType")
        protected String phoneTechType;
        @XmlAttribute(name = "PhoneTechTypeSpecified", required = true)
        protected boolean phoneTechTypeSpecified;
        @XmlAttribute(name = "PhoneNumber")
        protected String phoneNumber;
        @XmlAttribute(name = "FormattedInd")
        protected String formattedInd;
        @XmlAttribute(name = "DefaultInd")
        protected Boolean defaultInd;
        @XmlAttribute(name = "DefaultIndSpecified", required = true)
        protected boolean defaultIndSpecified;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;
        @XmlAttribute(name = "ParentCompanyRef")
        protected String parentCompanyRef;

        /**
         * ��ȡphoneLocationType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPhoneLocationType() {
            return phoneLocationType;
        }

        /**
         * ����phoneLocationType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPhoneLocationType(String value) {
            this.phoneLocationType = value;
        }

        /**
         * ��ȡphoneLocationTypeSpecified���Ե�ֵ��
         */
        public boolean isPhoneLocationTypeSpecified() {
            return phoneLocationTypeSpecified;
        }

        /**
         * ����phoneLocationTypeSpecified���Ե�ֵ��
         */
        public void setPhoneLocationTypeSpecified(boolean value) {
            this.phoneLocationTypeSpecified = value;
        }

        /**
         * ��ȡphoneTechType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPhoneTechType() {
            return phoneTechType;
        }

        /**
         * ����phoneTechType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPhoneTechType(String value) {
            this.phoneTechType = value;
        }

        /**
         * ��ȡphoneTechTypeSpecified���Ե�ֵ��
         */
        public boolean isPhoneTechTypeSpecified() {
            return phoneTechTypeSpecified;
        }

        /**
         * ����phoneTechTypeSpecified���Ե�ֵ��
         */
        public void setPhoneTechTypeSpecified(boolean value) {
            this.phoneTechTypeSpecified = value;
        }

        /**
         * ��ȡphoneNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * ����phoneNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * ��ȡformattedInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getFormattedInd() {
            return formattedInd;
        }

        /**
         * ����formattedInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setFormattedInd(String value) {
            this.formattedInd = value;
        }

        /**
         * ��ȡdefaultInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isDefaultInd() {
            return defaultInd;
        }

        /**
         * ����defaultInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setDefaultInd(Boolean value) {
            this.defaultInd = value;
        }

        /**
         * ��ȡdefaultIndSpecified���Ե�ֵ��
         */
        public boolean isDefaultIndSpecified() {
            return defaultIndSpecified;
        }

        /**
         * ����defaultIndSpecified���Ե�ֵ��
         */
        public void setDefaultIndSpecified(boolean value) {
            this.defaultIndSpecified = value;
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

        /**
         * ��ȡparentCompanyRef���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getParentCompanyRef() {
            return parentCompanyRef;
        }

        /**
         * ����parentCompanyRef���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setParentCompanyRef(String value) {
            this.parentCompanyRef = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>URL_Type">
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class URL
            extends URLType {

        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

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
