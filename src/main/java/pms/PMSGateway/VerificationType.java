package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>VerificationType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VerificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
 *                 &lt;attribute name="PartialName" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" minOccurs="0"/>
 *         &lt;element name="TelephoneInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentCard" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType" minOccurs="0"/>
 *         &lt;element name="AddressInfo" type="{http://www.opentravel.org/OTA/2003/05}AddressInfoType" minOccurs="0"/>
 *         &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReservationTimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AssociatedQuantity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StartLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="AssociatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EndLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="AssociatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationType", propOrder = {
        "personName",
        "email",
        "telephoneInfo",
        "paymentCard",
        "addressInfo",
        "custLoyalty",
        "vendor",
        "reservationTimeSpan",
        "associatedQuantity",
        "startLocation",
        "endLocation",
        "tpaExtensions"
})
public class VerificationType {

    @XmlElement(name = "PersonName")
    protected VerificationType.PersonName personName;
    @XmlElement(name = "Email")
    protected EmailType email;
    @XmlElement(name = "TelephoneInfo")
    protected VerificationType.TelephoneInfo telephoneInfo;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "AddressInfo")
    protected AddressInfoType addressInfo;
    @XmlElement(name = "CustLoyalty")
    protected List<VerificationType.CustLoyalty> custLoyalty;
    @XmlElement(name = "Vendor")
    protected List<CompanyNameType> vendor;
    @XmlElement(name = "ReservationTimeSpan")
    protected VerificationType.ReservationTimeSpan reservationTimeSpan;
    @XmlElement(name = "AssociatedQuantity")
    protected List<VerificationType.AssociatedQuantity> associatedQuantity;
    @XmlElement(name = "StartLocation")
    protected VerificationType.StartLocation startLocation;
    @XmlElement(name = "EndLocation")
    protected VerificationType.EndLocation endLocation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * ��ȡpersonName���Ե�ֵ��
     *
     * @return possible object is
     * {@link VerificationType.PersonName }
     */
    public VerificationType.PersonName getPersonName() {
        return personName;
    }

    /**
     * ����personName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VerificationType.PersonName }
     */
    public void setPersonName(VerificationType.PersonName value) {
        this.personName = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     *
     * @return possible object is
     * {@link EmailType }
     */
    public EmailType getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link EmailType }
     */
    public void setEmail(EmailType value) {
        this.email = value;
    }

    /**
     * ��ȡtelephoneInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link VerificationType.TelephoneInfo }
     */
    public VerificationType.TelephoneInfo getTelephoneInfo() {
        return telephoneInfo;
    }

    /**
     * ����telephoneInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VerificationType.TelephoneInfo }
     */
    public void setTelephoneInfo(VerificationType.TelephoneInfo value) {
        this.telephoneInfo = value;
    }

    /**
     * ��ȡpaymentCard���Ե�ֵ��
     *
     * @return possible object is
     * {@link PaymentCardType }
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * ����paymentCard���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PaymentCardType }
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * ��ȡaddressInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link AddressInfoType }
     */
    public AddressInfoType getAddressInfo() {
        return addressInfo;
    }

    /**
     * ����addressInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AddressInfoType }
     */
    public void setAddressInfo(AddressInfoType value) {
        this.addressInfo = value;
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
     * {@link VerificationType.CustLoyalty }
     */
    public List<VerificationType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<VerificationType.CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * Gets the value of the vendor property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendor property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendor().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNameType }
     */
    public List<CompanyNameType> getVendor() {
        if (vendor == null) {
            vendor = new ArrayList<CompanyNameType>();
        }
        return this.vendor;
    }

    /**
     * ��ȡreservationTimeSpan���Ե�ֵ��
     *
     * @return possible object is
     * {@link VerificationType.ReservationTimeSpan }
     */
    public VerificationType.ReservationTimeSpan getReservationTimeSpan() {
        return reservationTimeSpan;
    }

    /**
     * ����reservationTimeSpan���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VerificationType.ReservationTimeSpan }
     */
    public void setReservationTimeSpan(VerificationType.ReservationTimeSpan value) {
        this.reservationTimeSpan = value;
    }

    /**
     * Gets the value of the associatedQuantity property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedQuantity property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedQuantity().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationType.AssociatedQuantity }
     */
    public List<VerificationType.AssociatedQuantity> getAssociatedQuantity() {
        if (associatedQuantity == null) {
            associatedQuantity = new ArrayList<VerificationType.AssociatedQuantity>();
        }
        return this.associatedQuantity;
    }

    /**
     * ��ȡstartLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link VerificationType.StartLocation }
     */
    public VerificationType.StartLocation getStartLocation() {
        return startLocation;
    }

    /**
     * ����startLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VerificationType.StartLocation }
     */
    public void setStartLocation(VerificationType.StartLocation value) {
        this.startLocation = value;
    }

    /**
     * ��ȡendLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link VerificationType.EndLocation }
     */
    public VerificationType.EndLocation getEndLocation() {
        return endLocation;
    }

    /**
     * ����endLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VerificationType.EndLocation }
     */
    public void setEndLocation(VerificationType.EndLocation value) {
        this.endLocation = value;
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
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AssociatedQuantity {

        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;

        /**
         * ��ȡuri���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getURI() {
            return uri;
        }

        /**
         * ����uri���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setURI(String value) {
            this.uri = value;
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CustLoyalty {

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

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="AssociatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EndLocation
            extends LocationType {

        @XmlAttribute(name = "AssociatedDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar associatedDateTime;

        /**
         * ��ȡassociatedDateTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getAssociatedDateTime() {
            return associatedDateTime;
        }

        /**
         * ����associatedDateTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setAssociatedDateTime(XMLGregorianCalendar value) {
            this.associatedDateTime = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
     *       &lt;attribute name="PartialName" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PersonName
            extends PersonNameType {

        @XmlAttribute(name = "PartialName")
        protected Boolean partialName;

        /**
         * ��ȡpartialName���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isPartialName() {
            return partialName;
        }

        /**
         * ����partialName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setPartialName(Boolean value) {
            this.partialName = value;
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
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReservationTimeSpan {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;

        /**
         * ��ȡstart���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStart() {
            return start;
        }

        /**
         * ����start���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * ��ȡduration���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDuration() {
            return duration;
        }

        /**
         * ����duration���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * ��ȡend���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEnd() {
            return end;
        }

        /**
         * ����end���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEnd(String value) {
            this.end = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="AssociatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StartLocation
            extends LocationType {

        @XmlAttribute(name = "AssociatedDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar associatedDateTime;

        /**
         * ��ȡassociatedDateTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getAssociatedDateTime() {
            return associatedDateTime;
        }

        /**
         * ����associatedDateTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setAssociatedDateTime(XMLGregorianCalendar value) {
            this.associatedDateTime = value;
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
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TelephoneInfo {

        @XmlAttribute(name = "RPH")
        protected String rph;

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

    }

}
