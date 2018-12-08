package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>PaymentCardType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="PaymentCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecureInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardIssuerName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BankID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressType" minOccurs="0"/>
 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="SignatureOnFile" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SignatureOnFileIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MagneticStripe" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Track1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *                 &lt;attribute name="Track2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *                 &lt;attribute name="Track3" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
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
 *       &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaskedCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CardHolderRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExtendPaymentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CountryOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExtendedPaymentQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SignatureOnFileIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CompanyCardReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardType", propOrder = {
        "secureInd",
        "cardHolderName",
        "cardIssuerName",
        "address",
        "telephone",
        "email",
        "custLoyalty",
        "signatureOnFile",
        "magneticStripe"
})
@XmlSeeAlso({
        HTNGPaymentCardType.class
})
public class PaymentCardType {

    @XmlElement(name = "SecureInd")
    protected boolean secureInd;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "CardIssuerName")
    protected PaymentCardType.CardIssuerName cardIssuerName;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "Telephone")
    protected List<PaymentCardType.Telephone> telephone;
    @XmlElement(name = "Email")
    protected List<EmailType> email;
    @XmlElement(name = "CustLoyalty")
    protected List<PaymentCardType.CustLoyalty> custLoyalty;
    @XmlElement(name = "SignatureOnFile")
    protected PaymentCardType.SignatureOnFile signatureOnFile;
    @XmlElement(name = "MagneticStripe")
    protected PaymentCardType.MagneticStripe magneticStripe;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "CardType")
    protected String cardType;
    @XmlAttribute(name = "CardCode")
    protected String cardCode;
    @XmlAttribute(name = "CardNumber")
    protected String cardNumber;
    @XmlAttribute(name = "SeriesCode")
    protected String seriesCode;
    @XmlAttribute(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    protected String expireDate;
    @XmlAttribute(name = "MaskedCardNumber")
    protected String maskedCardNumber;
    @XmlAttribute(name = "CardHolderRPH")
    protected String cardHolderRPH;
    @XmlAttribute(name = "ExtendPaymentIndicator")
    protected Boolean extendPaymentIndicator;
    @XmlAttribute(name = "CountryOfIssue")
    protected String countryOfIssue;
    @XmlAttribute(name = "ExtendedPaymentQuantity")
    protected BigInteger extendedPaymentQuantity;
    @XmlAttribute(name = "SignatureOnFileIndicator")
    protected Boolean signatureOnFileIndicator;
    @XmlAttribute(name = "CompanyCardReference")
    protected String companyCardReference;
    @XmlAttribute(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "EncryptionKey")
    protected String encryptionKey;

    /**
     * ��ȡsecureInd���Ե�ֵ��
     */
    public boolean isSecureInd() {
        return secureInd;
    }

    /**
     * ����secureInd���Ե�ֵ��
     */
    public void setSecureInd(boolean value) {
        this.secureInd = value;
    }

    /**
     * ��ȡcardHolderName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * ����cardHolderName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * ��ȡcardIssuerName���Ե�ֵ��
     *
     * @return possible object is
     * {@link PaymentCardType.CardIssuerName }
     */
    public PaymentCardType.CardIssuerName getCardIssuerName() {
        return cardIssuerName;
    }

    /**
     * ����cardIssuerName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PaymentCardType.CardIssuerName }
     */
    public void setCardIssuerName(PaymentCardType.CardIssuerName value) {
        this.cardIssuerName = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
     *
     * @return possible object is
     * {@link AddressType }
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AddressType }
     */
    public void setAddress(AddressType value) {
        this.address = value;
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
     * {@link PaymentCardType.Telephone }
     */
    public List<PaymentCardType.Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<PaymentCardType.Telephone>();
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
     * {@link EmailType }
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
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
     * {@link PaymentCardType.CustLoyalty }
     */
    public List<PaymentCardType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<PaymentCardType.CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * ��ȡsignatureOnFile���Ե�ֵ��
     *
     * @return possible object is
     * {@link PaymentCardType.SignatureOnFile }
     */
    public PaymentCardType.SignatureOnFile getSignatureOnFile() {
        return signatureOnFile;
    }

    /**
     * ����signatureOnFile���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PaymentCardType.SignatureOnFile }
     */
    public void setSignatureOnFile(PaymentCardType.SignatureOnFile value) {
        this.signatureOnFile = value;
    }

    /**
     * ��ȡmagneticStripe���Ե�ֵ��
     *
     * @return possible object is
     * {@link PaymentCardType.MagneticStripe }
     */
    public PaymentCardType.MagneticStripe getMagneticStripe() {
        return magneticStripe;
    }

    /**
     * ����magneticStripe���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PaymentCardType.MagneticStripe }
     */
    public void setMagneticStripe(PaymentCardType.MagneticStripe value) {
        this.magneticStripe = value;
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
     * ��ȡcardType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * ����cardType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * ��ȡcardCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * ����cardCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * ��ȡcardNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * ����cardNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * ��ȡseriesCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSeriesCode() {
        return seriesCode;
    }

    /**
     * ����seriesCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSeriesCode(String value) {
        this.seriesCode = value;
    }

    /**
     * ��ȡeffectiveDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * ����effectiveDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * ��ȡexpireDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * ����expireDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * ��ȡmaskedCardNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    /**
     * ����maskedCardNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaskedCardNumber(String value) {
        this.maskedCardNumber = value;
    }

    /**
     * ��ȡcardHolderRPH���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCardHolderRPH() {
        return cardHolderRPH;
    }

    /**
     * ����cardHolderRPH���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCardHolderRPH(String value) {
        this.cardHolderRPH = value;
    }

    /**
     * ��ȡextendPaymentIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isExtendPaymentIndicator() {
        return extendPaymentIndicator;
    }

    /**
     * ����extendPaymentIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setExtendPaymentIndicator(Boolean value) {
        this.extendPaymentIndicator = value;
    }

    /**
     * ��ȡcountryOfIssue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    /**
     * ����countryOfIssue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountryOfIssue(String value) {
        this.countryOfIssue = value;
    }

    /**
     * ��ȡextendedPaymentQuantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getExtendedPaymentQuantity() {
        return extendedPaymentQuantity;
    }

    /**
     * ����extendedPaymentQuantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setExtendedPaymentQuantity(BigInteger value) {
        this.extendedPaymentQuantity = value;
    }

    /**
     * ��ȡsignatureOnFileIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSignatureOnFileIndicator() {
        return signatureOnFileIndicator;
    }

    /**
     * ����signatureOnFileIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSignatureOnFileIndicator(Boolean value) {
        this.signatureOnFileIndicator = value;
    }

    /**
     * ��ȡcompanyCardReference���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCompanyCardReference() {
        return companyCardReference;
    }

    /**
     * ����companyCardReference���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCompanyCardReference(String value) {
        this.companyCardReference = value;
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
     * ��ȡencryptionKey���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * ����encryptionKey���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEncryptionKey(String value) {
        this.encryptionKey = value;
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
     *       &lt;attribute name="BankID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CardIssuerName {

        @XmlAttribute(name = "BankID")
        protected String bankID;

        /**
         * ��ȡbankID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBankID() {
            return bankID;
        }

        /**
         * ����bankID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBankID(String value) {
            this.bankID = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Track1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
     *       &lt;attribute name="Track2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
     *       &lt;attribute name="Track3" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MagneticStripe {

        @XmlAttribute(name = "Track1")
        protected byte[] track1;
        @XmlAttribute(name = "Track2")
        protected byte[] track2;
        @XmlAttribute(name = "Track3")
        protected byte[] track3;

        /**
         * ��ȡtrack1���Ե�ֵ��
         *
         * @return possible object is
         * byte[]
         */
        public byte[] getTrack1() {
            return track1;
        }

        /**
         * ����track1���Ե�ֵ��
         *
         * @param value allowed object is
         *              byte[]
         */
        public void setTrack1(byte[] value) {
            this.track1 = value;
        }

        /**
         * ��ȡtrack2���Ե�ֵ��
         *
         * @return possible object is
         * byte[]
         */
        public byte[] getTrack2() {
            return track2;
        }

        /**
         * ����track2���Ե�ֵ��
         *
         * @param value allowed object is
         *              byte[]
         */
        public void setTrack2(byte[] value) {
            this.track2 = value;
        }

        /**
         * ��ȡtrack3���Ե�ֵ��
         *
         * @return possible object is
         * byte[]
         */
        public byte[] getTrack3() {
            return track3;
        }

        /**
         * ����track3���Ե�ֵ��
         *
         * @param value allowed object is
         *              byte[]
         */
        public void setTrack3(byte[] value) {
            this.track3 = value;
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
     *       &lt;attribute name="SignatureOnFileIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SignatureOnFile {

        @XmlAttribute(name = "SignatureOnFileIndicator")
        protected Boolean signatureOnFileIndicator;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;

        /**
         * ��ȡsignatureOnFileIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isSignatureOnFileIndicator() {
            return signatureOnFileIndicator;
        }

        /**
         * ����signatureOnFileIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setSignatureOnFileIndicator(Boolean value) {
            this.signatureOnFileIndicator = value;
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
    public static class Telephone {

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
