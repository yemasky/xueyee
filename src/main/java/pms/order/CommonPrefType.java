package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CommonPrefType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CommonPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamePref" type="{http://www.opentravel.org/OTA/2003/05}NamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhonePref" type="{http://www.opentravel.org/OTA/2003/05}PhonePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressPref" type="{http://www.opentravel.org/OTA/2003/05}AddressPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" type="{http://www.opentravel.org/OTA/2003/05}PaymentFormPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InterestPref" type="{http://www.opentravel.org/OTA/2003/05}InterestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InsurancePref" type="{http://www.opentravel.org/OTA/2003/05}InsurancePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatingPref" type="{http://www.opentravel.org/OTA/2003/05}SeatingPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TicketDistribPref" type="{http://www.opentravel.org/OTA/2003/05}TicketDistribPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MediaEntertainPref" type="{http://www.opentravel.org/OTA/2003/05}MediaEntertainPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PetInfoPref" type="{http://www.opentravel.org/OTA/2003/05}PetInfoPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://www.opentravel.org/OTA/2003/05}MealPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyPref" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://www.opentravel.org/OTA/2003/05}SpecRequestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedTravelerPref" type="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *                 &lt;attribute name="ContactMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmployeeLevelInfo" type="{http://www.opentravel.org/OTA/2003/05}EmployeeInfoType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
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
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonPrefType", propOrder = {
        "namePref",
        "phonePref",
        "addressPref",
        "paymentFormPref",
        "interestPref",
        "insurancePref",
        "seatingPref",
        "ticketDistribPref",
        "mediaEntertainPref",
        "petInfoPref",
        "mealPref",
        "loyaltyPref",
        "specRequestPref",
        "relatedTravelerPref",
        "contactPref",
        "employeeLevelInfo",
        "tpaExtensions"
})
public class CommonPrefType {

    @XmlElement(name = "NamePref")
    protected List<NamePrefType> namePref;
    @XmlElement(name = "PhonePref")
    protected List<PhonePrefType> phonePref;
    @XmlElement(name = "AddressPref")
    protected List<AddressPrefType> addressPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPrefType> paymentFormPref;
    @XmlElement(name = "InterestPref")
    protected List<InterestPrefType> interestPref;
    @XmlElement(name = "InsurancePref")
    protected List<InsurancePrefType> insurancePref;
    @XmlElement(name = "SeatingPref")
    protected List<SeatingPrefType> seatingPref;
    @XmlElement(name = "TicketDistribPref")
    protected List<TicketDistribPrefType> ticketDistribPref;
    @XmlElement(name = "MediaEntertainPref")
    protected List<MediaEntertainPrefType> mediaEntertainPref;
    @XmlElement(name = "PetInfoPref")
    protected List<PetInfoPrefType> petInfoPref;
    @XmlElement(name = "MealPref")
    protected List<MealPrefType> mealPref;
    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPrefType> loyaltyPref;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPrefType> specRequestPref;
    @XmlElement(name = "RelatedTravelerPref")
    protected List<RelatedTravelerPrefType> relatedTravelerPref;
    @XmlElement(name = "ContactPref")
    protected List<CommonPrefType.ContactPref> contactPref;
    @XmlElement(name = "EmployeeLevelInfo")
    protected EmployeeInfoType employeeLevelInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;

    /**
     * Gets the value of the namePref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namePref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamePref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link NamePrefType }
     */
    public List<NamePrefType> getNamePref() {
        if (namePref == null) {
            namePref = new ArrayList<NamePrefType>();
        }
        return this.namePref;
    }

    /**
     * Gets the value of the phonePref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phonePref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhonePref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PhonePrefType }
     */
    public List<PhonePrefType> getPhonePref() {
        if (phonePref == null) {
            phonePref = new ArrayList<PhonePrefType>();
        }
        return this.phonePref;
    }

    /**
     * Gets the value of the addressPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressPrefType }
     */
    public List<AddressPrefType> getAddressPref() {
        if (addressPref == null) {
            addressPref = new ArrayList<AddressPrefType>();
        }
        return this.addressPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormPrefType }
     */
    public List<PaymentFormPrefType> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPrefType>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the interestPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestPrefType }
     */
    public List<InterestPrefType> getInterestPref() {
        if (interestPref == null) {
            interestPref = new ArrayList<InterestPrefType>();
        }
        return this.interestPref;
    }

    /**
     * Gets the value of the insurancePref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurancePref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurancePref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link InsurancePrefType }
     */
    public List<InsurancePrefType> getInsurancePref() {
        if (insurancePref == null) {
            insurancePref = new ArrayList<InsurancePrefType>();
        }
        return this.insurancePref;
    }

    /**
     * Gets the value of the seatingPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatingPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatingPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatingPrefType }
     */
    public List<SeatingPrefType> getSeatingPref() {
        if (seatingPref == null) {
            seatingPref = new ArrayList<SeatingPrefType>();
        }
        return this.seatingPref;
    }

    /**
     * Gets the value of the ticketDistribPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDistribPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDistribPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDistribPrefType }
     */
    public List<TicketDistribPrefType> getTicketDistribPref() {
        if (ticketDistribPref == null) {
            ticketDistribPref = new ArrayList<TicketDistribPrefType>();
        }
        return this.ticketDistribPref;
    }

    /**
     * Gets the value of the mediaEntertainPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaEntertainPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaEntertainPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaEntertainPrefType }
     */
    public List<MediaEntertainPrefType> getMediaEntertainPref() {
        if (mediaEntertainPref == null) {
            mediaEntertainPref = new ArrayList<MediaEntertainPrefType>();
        }
        return this.mediaEntertainPref;
    }

    /**
     * Gets the value of the petInfoPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petInfoPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetInfoPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PetInfoPrefType }
     */
    public List<PetInfoPrefType> getPetInfoPref() {
        if (petInfoPref == null) {
            petInfoPref = new ArrayList<PetInfoPrefType>();
        }
        return this.petInfoPref;
    }

    /**
     * Gets the value of the mealPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link MealPrefType }
     */
    public List<MealPrefType> getMealPref() {
        if (mealPref == null) {
            mealPref = new ArrayList<MealPrefType>();
        }
        return this.mealPref;
    }

    /**
     * Gets the value of the loyaltyPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPrefType }
     */
    public List<LoyaltyPrefType> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPrefType>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the specRequestPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specRequestPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecRequestPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecRequestPrefType }
     */
    public List<SpecRequestPrefType> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPrefType>();
        }
        return this.specRequestPref;
    }

    /**
     * Gets the value of the relatedTravelerPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTravelerPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTravelerPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedTravelerPrefType }
     */
    public List<RelatedTravelerPrefType> getRelatedTravelerPref() {
        if (relatedTravelerPref == null) {
            relatedTravelerPref = new ArrayList<RelatedTravelerPrefType>();
        }
        return this.relatedTravelerPref;
    }

    /**
     * Gets the value of the contactPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonPrefType.ContactPref }
     */
    public List<CommonPrefType.ContactPref> getContactPref() {
        if (contactPref == null) {
            contactPref = new ArrayList<CommonPrefType.ContactPref>();
        }
        return this.contactPref;
    }

    /**
     * ��ȡemployeeLevelInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link EmployeeInfoType }
     */
    public EmployeeInfoType getEmployeeLevelInfo() {
        return employeeLevelInfo;
    }

    /**
     * ����employeeLevelInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link EmployeeInfoType }
     */
    public void setEmployeeLevelInfo(EmployeeInfoType value) {
        this.employeeLevelInfo = value;
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
     * ��ȡsmokingAllowed���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * ����smokingAllowed���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * ��ȡprimaryLangID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * ����primaryLangID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * ��ȡaltLangID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * ����altLangID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
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
     *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
     *       &lt;attribute name="ContactMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContactPref {

        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "ContactMethodCode")
        protected String contactMethodCode;

        /**
         * ��ȡpreferLevel���Ե�ֵ��
         *
         * @return possible object is
         * {@link PreferLevelType }
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * ����preferLevel���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link PreferLevelType }
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
        }

        /**
         * ��ȡcontactMethodCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getContactMethodCode() {
            return contactMethodCode;
        }

        /**
         * ����contactMethodCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setContactMethodCode(String value) {
            this.contactMethodCode = value;
        }

    }

}
