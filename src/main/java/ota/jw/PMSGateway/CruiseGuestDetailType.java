
package ota.jw.PMSGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CruiseGuestDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CruiseGuestDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectedFareCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="FareCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContactInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"&gt;
 *                 &lt;attribute name="GuestRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="GuestOccupation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GuestTransportation" type="{http://www.opentravel.org/OTA/2003/05}GuestTransportationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="VendorCode"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LinkedTraveler" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType"&gt;
 *                 &lt;attribute name="LinkTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TravelDocument" type="{http://www.opentravel.org/OTA/2003/05}DocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectedDining" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="SmokingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DiningRoom" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TableSize" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AgeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *                 &lt;attribute name="Sitting" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Preference" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SelectedInsurance" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="InsuranceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SelectedOptionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="DefaultIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SelectedOptions" type="{http://www.opentravel.org/OTA/2003/05}AmenityOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectedPackages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCruiseGuestDetailTypeSelectedPackage" minOccurs="0"/&gt;
 *         &lt;element name="SelectedSpecialServices" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialServiceType" minOccurs="0"/&gt;
 *         &lt;element name="AirAccommodations" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCruiseGuestDetailTypeAirAccommodation" minOccurs="0"/&gt;
 *         &lt;element name="CruiseDocument" type="{http://www.opentravel.org/OTA/2003/05}DocumentHandlingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}CruiseProfileType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="GuestExistsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RepeatGuestIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseGuestDetailType", propOrder = {
    "selectedFareCode",
    "contactInfo",
    "guestTransportation",
    "loyaltyInfo",
    "linkedTraveler",
    "travelDocument",
    "selectedDining",
    "selectedInsurance",
    "selectedOptions",
    "selectedPackages",
    "selectedSpecialServices",
    "airAccommodations",
    "cruiseDocument",
    "profiles"
})
public class CruiseGuestDetailType {

    @XmlElement(name = "SelectedFareCode")
    protected List<CruiseGuestDetailType.SelectedFareCode> selectedFareCode;
    @XmlElement(name = "ContactInfo")
    protected List<CruiseGuestDetailType.ContactInfo> contactInfo;
    @XmlElement(name = "GuestTransportation")
    protected List<GuestTransportationType> guestTransportation;
    @XmlElement(name = "LoyaltyInfo")
    protected List<CruiseGuestDetailType.LoyaltyInfo> loyaltyInfo;
    @XmlElement(name = "LinkedTraveler")
    protected List<CruiseGuestDetailType.LinkedTraveler> linkedTraveler;
    @XmlElement(name = "TravelDocument")
    protected List<DocumentType> travelDocument;
    @XmlElement(name = "SelectedDining")
    protected List<CruiseGuestDetailType.SelectedDining> selectedDining;
    @XmlElement(name = "SelectedInsurance")
    protected List<CruiseGuestDetailType.SelectedInsurance> selectedInsurance;
    @XmlElement(name = "SelectedOptions")
    protected List<AmenityOptionType> selectedOptions;
    @XmlElement(name = "SelectedPackages")
    protected ArrayOfCruiseGuestDetailTypeSelectedPackage selectedPackages;
    @XmlElement(name = "SelectedSpecialServices")
    protected ArrayOfSpecialServiceType selectedSpecialServices;
    @XmlElement(name = "AirAccommodations")
    protected ArrayOfCruiseGuestDetailTypeAirAccommodation airAccommodations;
    @XmlElement(name = "CruiseDocument")
    protected List<DocumentHandlingType> cruiseDocument;
    @XmlElement(name = "Profiles")
    protected List<CruiseProfileType> profiles;
    @XmlAttribute(name = "GuestExistsIndicator")
    protected Boolean guestExistsIndicator;
    @XmlAttribute(name = "RepeatGuestIndicator")
    protected Boolean repeatGuestIndicator;

    /**
     * Gets the value of the selectedFareCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedFareCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedFareCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.SelectedFareCode }
     * 
     * 
     */
    public List<CruiseGuestDetailType.SelectedFareCode> getSelectedFareCode() {
        if (selectedFareCode == null) {
            selectedFareCode = new ArrayList<CruiseGuestDetailType.SelectedFareCode>();
        }
        return this.selectedFareCode;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.ContactInfo }
     * 
     * 
     */
    public List<CruiseGuestDetailType.ContactInfo> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<CruiseGuestDetailType.ContactInfo>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the guestTransportation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestTransportation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestTransportation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestTransportationType }
     * 
     * 
     */
    public List<GuestTransportationType> getGuestTransportation() {
        if (guestTransportation == null) {
            guestTransportation = new ArrayList<GuestTransportationType>();
        }
        return this.guestTransportation;
    }

    /**
     * Gets the value of the loyaltyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.LoyaltyInfo }
     * 
     * 
     */
    public List<CruiseGuestDetailType.LoyaltyInfo> getLoyaltyInfo() {
        if (loyaltyInfo == null) {
            loyaltyInfo = new ArrayList<CruiseGuestDetailType.LoyaltyInfo>();
        }
        return this.loyaltyInfo;
    }

    /**
     * Gets the value of the linkedTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.LinkedTraveler }
     * 
     * 
     */
    public List<CruiseGuestDetailType.LinkedTraveler> getLinkedTraveler() {
        if (linkedTraveler == null) {
            linkedTraveler = new ArrayList<CruiseGuestDetailType.LinkedTraveler>();
        }
        return this.linkedTraveler;
    }

    /**
     * Gets the value of the travelDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getTravelDocument() {
        if (travelDocument == null) {
            travelDocument = new ArrayList<DocumentType>();
        }
        return this.travelDocument;
    }

    /**
     * Gets the value of the selectedDining property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedDining property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedDining().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.SelectedDining }
     * 
     * 
     */
    public List<CruiseGuestDetailType.SelectedDining> getSelectedDining() {
        if (selectedDining == null) {
            selectedDining = new ArrayList<CruiseGuestDetailType.SelectedDining>();
        }
        return this.selectedDining;
    }

    /**
     * Gets the value of the selectedInsurance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedInsurance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedInsurance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.SelectedInsurance }
     * 
     * 
     */
    public List<CruiseGuestDetailType.SelectedInsurance> getSelectedInsurance() {
        if (selectedInsurance == null) {
            selectedInsurance = new ArrayList<CruiseGuestDetailType.SelectedInsurance>();
        }
        return this.selectedInsurance;
    }

    /**
     * Gets the value of the selectedOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmenityOptionType }
     * 
     * 
     */
    public List<AmenityOptionType> getSelectedOptions() {
        if (selectedOptions == null) {
            selectedOptions = new ArrayList<AmenityOptionType>();
        }
        return this.selectedOptions;
    }

    /**
     * 获取selectedPackages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCruiseGuestDetailTypeSelectedPackage }
     *     
     */
    public ArrayOfCruiseGuestDetailTypeSelectedPackage getSelectedPackages() {
        return selectedPackages;
    }

    /**
     * 设置selectedPackages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCruiseGuestDetailTypeSelectedPackage }
     *     
     */
    public void setSelectedPackages(ArrayOfCruiseGuestDetailTypeSelectedPackage value) {
        this.selectedPackages = value;
    }

    /**
     * 获取selectedSpecialServices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialServiceType }
     *     
     */
    public ArrayOfSpecialServiceType getSelectedSpecialServices() {
        return selectedSpecialServices;
    }

    /**
     * 设置selectedSpecialServices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialServiceType }
     *     
     */
    public void setSelectedSpecialServices(ArrayOfSpecialServiceType value) {
        this.selectedSpecialServices = value;
    }

    /**
     * 获取airAccommodations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCruiseGuestDetailTypeAirAccommodation }
     *     
     */
    public ArrayOfCruiseGuestDetailTypeAirAccommodation getAirAccommodations() {
        return airAccommodations;
    }

    /**
     * 设置airAccommodations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCruiseGuestDetailTypeAirAccommodation }
     *     
     */
    public void setAirAccommodations(ArrayOfCruiseGuestDetailTypeAirAccommodation value) {
        this.airAccommodations = value;
    }

    /**
     * Gets the value of the cruiseDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cruiseDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCruiseDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentHandlingType }
     * 
     * 
     */
    public List<DocumentHandlingType> getCruiseDocument() {
        if (cruiseDocument == null) {
            cruiseDocument = new ArrayList<DocumentHandlingType>();
        }
        return this.cruiseDocument;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseProfileType }
     * 
     * 
     */
    public List<CruiseProfileType> getProfiles() {
        if (profiles == null) {
            profiles = new ArrayList<CruiseProfileType>();
        }
        return this.profiles;
    }

    /**
     * 获取guestExistsIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestExistsIndicator() {
        return guestExistsIndicator;
    }

    /**
     * 设置guestExistsIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestExistsIndicator(Boolean value) {
        this.guestExistsIndicator = value;
    }

    /**
     * 获取repeatGuestIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepeatGuestIndicator() {
        return repeatGuestIndicator;
    }

    /**
     * 设置repeatGuestIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatGuestIndicator(Boolean value) {
        this.repeatGuestIndicator = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"&gt;
     *       &lt;attribute name="GuestRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="GuestOccupation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContactInfo
        extends ContactPersonType
    {

        @XmlAttribute(name = "GuestRefNumber")
        protected String guestRefNumber;
        @XmlAttribute(name = "Age")
        protected BigInteger age;
        @XmlAttribute(name = "Nationality")
        protected String nationality;
        @XmlAttribute(name = "GuestOccupation")
        protected String guestOccupation;
        @XmlAttribute(name = "BirthDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;

        /**
         * 获取guestRefNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuestRefNumber() {
            return guestRefNumber;
        }

        /**
         * 设置guestRefNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuestRefNumber(String value) {
            this.guestRefNumber = value;
        }

        /**
         * 获取age属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAge() {
            return age;
        }

        /**
         * 设置age属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAge(BigInteger value) {
            this.age = value;
        }

        /**
         * 获取nationality属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationality() {
            return nationality;
        }

        /**
         * 设置nationality属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationality(String value) {
            this.nationality = value;
        }

        /**
         * 获取guestOccupation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuestOccupation() {
            return guestOccupation;
        }

        /**
         * 设置guestOccupation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuestOccupation(String value) {
            this.guestOccupation = value;
        }

        /**
         * 获取birthDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * 设置birthDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType"&gt;
     *       &lt;attribute name="LinkTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LinkedTraveler
        extends RelatedTravelerType
    {

        @XmlAttribute(name = "LinkTypeCode")
        protected String linkTypeCode;

        /**
         * 获取linkTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLinkTypeCode() {
            return linkTypeCode;
        }

        /**
         * 设置linkTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLinkTypeCode(String value) {
            this.linkTypeCode = value;
        }

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
     *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="VendorCode"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LoyaltyInfo {

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

        /**
         * 获取programID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramID() {
            return programID;
        }

        /**
         * 设置programID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramID(String value) {
            this.programID = value;
        }

        /**
         * 获取membershipID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipID() {
            return membershipID;
        }

        /**
         * 设置membershipID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipID(String value) {
            this.membershipID = value;
        }

        /**
         * 获取travelSector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * 设置travelSector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

        /**
         * 获取rph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * 设置rph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the vendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVendorCode() {
            if (vendorCode == null) {
                vendorCode = new ArrayList<String>();
            }
            return this.vendorCode;
        }

        /**
         * 获取primaryLoyaltyIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryLoyaltyIndicator() {
            return primaryLoyaltyIndicator;
        }

        /**
         * 设置primaryLoyaltyIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryLoyaltyIndicator(Boolean value) {
            this.primaryLoyaltyIndicator = value;
        }

        /**
         * 获取allianceLoyaltyLevelName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllianceLoyaltyLevelName() {
            return allianceLoyaltyLevelName;
        }

        /**
         * 设置allianceLoyaltyLevelName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllianceLoyaltyLevelName(String value) {
            this.allianceLoyaltyLevelName = value;
        }

        /**
         * 获取customerType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerType() {
            return customerType;
        }

        /**
         * 设置customerType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerType(String value) {
            this.customerType = value;
        }

        /**
         * 获取customerValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerValue() {
            return customerValue;
        }

        /**
         * 设置customerValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerValue(String value) {
            this.customerValue = value;
        }

        /**
         * 获取password属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * 设置password属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

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
     *       &lt;attribute name="SmokingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DiningRoom" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TableSize" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AgeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
     *       &lt;attribute name="Sitting" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Preference" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedDining {

        @XmlAttribute(name = "SmokingCode")
        protected String smokingCode;
        @XmlAttribute(name = "DiningRoom")
        protected String diningRoom;
        @XmlAttribute(name = "TableSize")
        protected String tableSize;
        @XmlAttribute(name = "AgeCode")
        protected String ageCode;
        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "Sitting")
        protected String sitting;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "Preference")
        protected PreferLevelType preference;

        /**
         * 获取smokingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmokingCode() {
            return smokingCode;
        }

        /**
         * 设置smokingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmokingCode(String value) {
            this.smokingCode = value;
        }

        /**
         * 获取diningRoom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiningRoom() {
            return diningRoom;
        }

        /**
         * 设置diningRoom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiningRoom(String value) {
            this.diningRoom = value;
        }

        /**
         * 获取tableSize属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableSize() {
            return tableSize;
        }

        /**
         * 设置tableSize属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableSize(String value) {
            this.tableSize = value;
        }

        /**
         * 获取ageCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeCode() {
            return ageCode;
        }

        /**
         * 设置ageCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeCode(String value) {
            this.ageCode = value;
        }

        /**
         * 获取language属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * 设置language属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * 获取sitting属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSitting() {
            return sitting;
        }

        /**
         * 设置sitting属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSitting(String value) {
            this.sitting = value;
        }

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * 获取preference属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreference() {
            return preference;
        }

        /**
         * 设置preference属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreference(PreferLevelType value) {
            this.preference = value;
        }

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
     *       &lt;attribute name="FareCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedFareCode {

        @XmlAttribute(name = "FareCode")
        protected String fareCode;
        @XmlAttribute(name = "GroupCode")
        protected String groupCode;

        /**
         * 获取fareCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCode() {
            return fareCode;
        }

        /**
         * 设置fareCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCode(String value) {
            this.fareCode = value;
        }

        /**
         * 获取groupCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupCode() {
            return groupCode;
        }

        /**
         * 设置groupCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupCode(String value) {
            this.groupCode = value;
        }

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
     *       &lt;attribute name="InsuranceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SelectedOptionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="DefaultIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedInsurance {

        @XmlAttribute(name = "InsuranceCode")
        protected String insuranceCode;
        @XmlAttribute(name = "SelectedOptionIndicator")
        protected Boolean selectedOptionIndicator;
        @XmlAttribute(name = "DefaultIndicator")
        protected Boolean defaultIndicator;
        @XmlAttribute(name = "Status")
        protected String status;

        /**
         * 获取insuranceCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsuranceCode() {
            return insuranceCode;
        }

        /**
         * 设置insuranceCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsuranceCode(String value) {
            this.insuranceCode = value;
        }

        /**
         * 获取selectedOptionIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSelectedOptionIndicator() {
            return selectedOptionIndicator;
        }

        /**
         * 设置selectedOptionIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSelectedOptionIndicator(Boolean value) {
            this.selectedOptionIndicator = value;
        }

        /**
         * 获取defaultIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefaultIndicator() {
            return defaultIndicator;
        }

        /**
         * 设置defaultIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefaultIndicator(Boolean value) {
            this.defaultIndicator = value;
        }

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

    }

}
