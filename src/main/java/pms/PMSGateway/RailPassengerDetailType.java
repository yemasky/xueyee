package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RailPassengerDetailType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RailPassengerDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identification" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *         &lt;element name="ProfileRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>EmailType">
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailPassengerDetailType", propOrder = {
        "identification",
        "profileRef",
        "telephone",
        "email",
        "address",
        "custLoyalty"
})
public class RailPassengerDetailType {

    @XmlElement(name = "Identification")
    protected PersonNameType identification;
    @XmlElement(name = "ProfileRef")
    protected RailPassengerDetailType.ProfileRef profileRef;
    @XmlElement(name = "Telephone")
    protected List<RailPassengerDetailType.Telephone> telephone;
    @XmlElement(name = "Email")
    protected List<RailPassengerDetailType.Email> email;
    @XmlElement(name = "Address")
    protected List<RailPassengerDetailType.Address> address;
    @XmlElement(name = "CustLoyalty")
    protected List<RailPassengerDetailType.CustLoyalty> custLoyalty;
    @XmlAttribute(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;

    /**
     * ��ȡidentification���Ե�ֵ��
     *
     * @return possible object is
     * {@link PersonNameType }
     */
    public PersonNameType getIdentification() {
        return identification;
    }

    /**
     * ����identification���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PersonNameType }
     */
    public void setIdentification(PersonNameType value) {
        this.identification = value;
    }

    /**
     * ��ȡprofileRef���Ե�ֵ��
     *
     * @return possible object is
     * {@link RailPassengerDetailType.ProfileRef }
     */
    public RailPassengerDetailType.ProfileRef getProfileRef() {
        return profileRef;
    }

    /**
     * ����profileRef���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RailPassengerDetailType.ProfileRef }
     */
    public void setProfileRef(RailPassengerDetailType.ProfileRef value) {
        this.profileRef = value;
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
     * {@link RailPassengerDetailType.Telephone }
     */
    public List<RailPassengerDetailType.Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<RailPassengerDetailType.Telephone>();
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
     * {@link RailPassengerDetailType.Email }
     */
    public List<RailPassengerDetailType.Email> getEmail() {
        if (email == null) {
            email = new ArrayList<RailPassengerDetailType.Email>();
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
     * {@link RailPassengerDetailType.Address }
     */
    public List<RailPassengerDetailType.Address> getAddress() {
        if (address == null) {
            address = new ArrayList<RailPassengerDetailType.Address>();
        }
        return this.address;
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
     * {@link RailPassengerDetailType.CustLoyalty }
     */
    public List<RailPassengerDetailType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<RailPassengerDetailType.CustLoyalty>();
        }
        return this.custLoyalty;
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
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
     *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
            extends AddressType {

        @XmlAttribute(name = "Operation")
        protected ActionType operation;

        /**
         * ��ȡoperation���Ե�ֵ��
         *
         * @return possible object is
         * {@link ActionType }
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * ����operation���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ActionType }
         */
        public void setOperation(ActionType value) {
            this.operation = value;
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
     *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
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
        @XmlAttribute(name = "Operation")
        protected ActionType operation;

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
         * ��ȡoperation���Ե�ֵ��
         *
         * @return possible object is
         * {@link ActionType }
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * ����operation���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ActionType }
         */
        public void setOperation(ActionType value) {
            this.operation = value;
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
     *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Email
            extends EmailType {

        @XmlAttribute(name = "Operation")
        protected ActionType operation;

        /**
         * ��ȡoperation���Ե�ֵ��
         *
         * @return possible object is
         * {@link ActionType }
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * ����operation���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ActionType }
         */
        public void setOperation(ActionType value) {
            this.operation = value;
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
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "uniqueID"
    })
    public static class ProfileRef {

        @XmlElement(name = "UniqueID")
        protected UniqueIDType uniqueID;

        /**
         * ��ȡuniqueID���Ե�ֵ��
         *
         * @return possible object is
         * {@link UniqueIDType }
         */
        public UniqueIDType getUniqueID() {
            return uniqueID;
        }

        /**
         * ����uniqueID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link UniqueIDType }
         */
        public void setUniqueID(UniqueIDType value) {
            this.uniqueID = value;
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
     *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Operation")
        protected ActionType operation;
        @XmlAttribute(name = "LocationCode")
        protected String locationCode;

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
         * ��ȡoperation���Ե�ֵ��
         *
         * @return possible object is
         * {@link ActionType }
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * ����operation���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ActionType }
         */
        public void setOperation(ActionType value) {
            this.operation = value;
        }

        /**
         * ��ȡlocationCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * ����locationCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
        }

    }

}
