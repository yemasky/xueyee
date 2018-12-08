package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;


/**
 * <p>DonationType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="DonationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrontOfficeInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OfficeID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CreditCardInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentCardType">
 *                 &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DonationAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DonorInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ContactInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
 *                           &lt;attribute name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="GDS_ID">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="1A"/>
 *             &lt;enumeration value="1G"/>
 *             &lt;enumeration value="1P"/>
 *             &lt;enumeration value="1V"/>
 *             &lt;enumeration value="1W"/>
 *             &lt;enumeration value="WE"/>
 *             &lt;enumeration value="WS"/>
 *             &lt;enumeration value="MF"/>
 *             &lt;enumeration value="ZZ"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AskForReceiptInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DonationType", propOrder = {
        "frontOfficeInfo",
        "creditCardInfo",
        "donorInfo"
})
public class DonationType {

    @XmlElement(name = "FrontOfficeInfo")
    protected DonationType.FrontOfficeInfo frontOfficeInfo;
    @XmlElement(name = "CreditCardInfo")
    protected DonationType.CreditCardInfo creditCardInfo;
    @XmlElement(name = "DonorInfo")
    protected DonationType.DonorInfo donorInfo;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "GDS_ID")
    protected String gdsid;
    @XmlAttribute(name = "AskForReceiptInd", required = true)
    protected boolean askForReceiptInd;
    @XmlAttribute(name = "CountryCode")
    protected String countryCode;
    @XmlAttribute(name = "StateCode")
    protected String stateCode;

    /**
     * ��ȡfrontOfficeInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link DonationType.FrontOfficeInfo }
     */
    public DonationType.FrontOfficeInfo getFrontOfficeInfo() {
        return frontOfficeInfo;
    }

    /**
     * ����frontOfficeInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DonationType.FrontOfficeInfo }
     */
    public void setFrontOfficeInfo(DonationType.FrontOfficeInfo value) {
        this.frontOfficeInfo = value;
    }

    /**
     * ��ȡcreditCardInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link DonationType.CreditCardInfo }
     */
    public DonationType.CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * ����creditCardInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DonationType.CreditCardInfo }
     */
    public void setCreditCardInfo(DonationType.CreditCardInfo value) {
        this.creditCardInfo = value;
    }

    /**
     * ��ȡdonorInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link DonationType.DonorInfo }
     */
    public DonationType.DonorInfo getDonorInfo() {
        return donorInfo;
    }

    /**
     * ����donorInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DonationType.DonorInfo }
     */
    public void setDonorInfo(DonationType.DonorInfo value) {
        this.donorInfo = value;
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
     * ��ȡgdsid���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGDSID() {
        return gdsid;
    }

    /**
     * ����gdsid���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGDSID(String value) {
        this.gdsid = value;
    }

    /**
     * ��ȡaskForReceiptInd���Ե�ֵ��
     */
    public boolean isAskForReceiptInd() {
        return askForReceiptInd;
    }

    /**
     * ����askForReceiptInd���Ե�ֵ��
     */
    public void setAskForReceiptInd(boolean value) {
        this.askForReceiptInd = value;
    }

    /**
     * ��ȡcountryCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * ����countryCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * ��ȡstateCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * ����stateCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentCardType">
     *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DonationAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CreditCardInfo
            extends PaymentCardType {

        @XmlAttribute(name = "Currency")
        protected String currency;
        @XmlAttribute(name = "DonationAmount", required = true)
        protected BigDecimal donationAmount;

        /**
         * ��ȡcurrency���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * ����currency���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * ��ȡdonationAmount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getDonationAmount() {
            return donationAmount;
        }

        /**
         * ����donationAmount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setDonationAmount(BigDecimal value) {
            this.donationAmount = value;
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
     *         &lt;element name="Name" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ContactInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
     *                 &lt;attribute name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "name",
            "contactInfo"
    })
    public static class DonorInfo {

        @XmlElement(name = "Name")
        protected DonationType.DonorInfo.Name name;
        @XmlElement(name = "ContactInfo")
        protected DonationType.DonorInfo.ContactInfo contactInfo;

        /**
         * ��ȡname���Ե�ֵ��
         *
         * @return possible object is
         * {@link DonationType.DonorInfo.Name }
         */
        public DonationType.DonorInfo.Name getName() {
            return name;
        }

        /**
         * ����name���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DonationType.DonorInfo.Name }
         */
        public void setName(DonationType.DonorInfo.Name value) {
            this.name = value;
        }

        /**
         * ��ȡcontactInfo���Ե�ֵ��
         *
         * @return possible object is
         * {@link DonationType.DonorInfo.ContactInfo }
         */
        public DonationType.DonorInfo.ContactInfo getContactInfo() {
            return contactInfo;
        }

        /**
         * ����contactInfo���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DonationType.DonorInfo.ContactInfo }
         */
        public void setContactInfo(DonationType.DonorInfo.ContactInfo value) {
            this.contactInfo = value;
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
         *       &lt;attribute name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ContactInfo
                extends AddressType {

            @XmlAttribute(name = "EmailAddress")
            protected String emailAddress;

            /**
             * ��ȡemailAddress���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getEmailAddress() {
                return emailAddress;
            }

            /**
             * ����emailAddress���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setEmailAddress(String value) {
                this.emailAddress = value;
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
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Name
                extends PersonNameType {


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
     *       &lt;attribute name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OfficeID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FrontOfficeInfo {

        @XmlAttribute(name = "ProductName")
        protected String productName;
        @XmlAttribute(name = "ProductVersion")
        protected String productVersion;
        @XmlAttribute(name = "OfficeID")
        protected String officeID;
        @XmlAttribute(name = "CorporateID")
        protected String corporateID;

        /**
         * ��ȡproductName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getProductName() {
            return productName;
        }

        /**
         * ����productName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProductName(String value) {
            this.productName = value;
        }

        /**
         * ��ȡproductVersion���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getProductVersion() {
            return productVersion;
        }

        /**
         * ����productVersion���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProductVersion(String value) {
            this.productVersion = value;
        }

        /**
         * ��ȡofficeID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOfficeID() {
            return officeID;
        }

        /**
         * ����officeID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOfficeID(String value) {
            this.officeID = value;
        }

        /**
         * ��ȡcorporateID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCorporateID() {
            return corporateID;
        }

        /**
         * ����corporateID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCorporateID(String value) {
            this.corporateID = value;
        }

    }

}
