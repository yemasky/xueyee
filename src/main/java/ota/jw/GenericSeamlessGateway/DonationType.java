
package ota.jw.GenericSeamlessGateway;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>DonationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DonationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FrontOfficeInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OfficeID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreditCardInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentCardType"&gt;
 *                 &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DonationAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DonorInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ContactInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType"&gt;
 *                           &lt;attribute name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *       &lt;attribute name="GDS_ID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="1A"/&gt;
 *             &lt;enumeration value="1G"/&gt;
 *             &lt;enumeration value="1P"/&gt;
 *             &lt;enumeration value="1V"/&gt;
 *             &lt;enumeration value="1W"/&gt;
 *             &lt;enumeration value="WE"/&gt;
 *             &lt;enumeration value="WS"/&gt;
 *             &lt;enumeration value="MF"/&gt;
 *             &lt;enumeration value="ZZ"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="AskForReceiptInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 获取frontOfficeInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DonationType.FrontOfficeInfo }
     *     
     */
    public DonationType.FrontOfficeInfo getFrontOfficeInfo() {
        return frontOfficeInfo;
    }

    /**
     * 设置frontOfficeInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DonationType.FrontOfficeInfo }
     *     
     */
    public void setFrontOfficeInfo(DonationType.FrontOfficeInfo value) {
        this.frontOfficeInfo = value;
    }

    /**
     * 获取creditCardInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DonationType.CreditCardInfo }
     *     
     */
    public DonationType.CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * 设置creditCardInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DonationType.CreditCardInfo }
     *     
     */
    public void setCreditCardInfo(DonationType.CreditCardInfo value) {
        this.creditCardInfo = value;
    }

    /**
     * 获取donorInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DonationType.DonorInfo }
     *     
     */
    public DonationType.DonorInfo getDonorInfo() {
        return donorInfo;
    }

    /**
     * 设置donorInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DonationType.DonorInfo }
     *     
     */
    public void setDonorInfo(DonationType.DonorInfo value) {
        this.donorInfo = value;
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
     * 获取gdsid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSID() {
        return gdsid;
    }

    /**
     * 设置gdsid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSID(String value) {
        this.gdsid = value;
    }

    /**
     * 获取askForReceiptInd属性的值。
     * 
     */
    public boolean isAskForReceiptInd() {
        return askForReceiptInd;
    }

    /**
     * 设置askForReceiptInd属性的值。
     * 
     */
    public void setAskForReceiptInd(boolean value) {
        this.askForReceiptInd = value;
    }

    /**
     * 获取countryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置countryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * 获取stateCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * 设置stateCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentCardType"&gt;
     *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DonationAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CreditCardInfo
        extends PaymentCardType
    {

        @XmlAttribute(name = "Currency")
        protected String currency;
        @XmlAttribute(name = "DonationAmount", required = true)
        protected BigDecimal donationAmount;

        /**
         * 获取currency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * 设置currency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * 获取donationAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDonationAmount() {
            return donationAmount;
        }

        /**
         * 设置donationAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDonationAmount(BigDecimal value) {
            this.donationAmount = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Name" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ContactInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType"&gt;
     *                 &lt;attribute name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DonationType.DonorInfo.Name }
         *     
         */
        public DonationType.DonorInfo.Name getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DonationType.DonorInfo.Name }
         *     
         */
        public void setName(DonationType.DonorInfo.Name value) {
            this.name = value;
        }

        /**
         * 获取contactInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DonationType.DonorInfo.ContactInfo }
         *     
         */
        public DonationType.DonorInfo.ContactInfo getContactInfo() {
            return contactInfo;
        }

        /**
         * 设置contactInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DonationType.DonorInfo.ContactInfo }
         *     
         */
        public void setContactInfo(DonationType.DonorInfo.ContactInfo value) {
            this.contactInfo = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType"&gt;
         *       &lt;attribute name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            extends AddressType
        {

            @XmlAttribute(name = "EmailAddress")
            protected String emailAddress;

            /**
             * 获取emailAddress属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmailAddress() {
                return emailAddress;
            }

            /**
             * 设置emailAddress属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmailAddress(String value) {
                this.emailAddress = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Name
            extends PersonNameType
        {


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
     *       &lt;attribute name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OfficeID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取productName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductName() {
            return productName;
        }

        /**
         * 设置productName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductName(String value) {
            this.productName = value;
        }

        /**
         * 获取productVersion属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductVersion() {
            return productVersion;
        }

        /**
         * 设置productVersion属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductVersion(String value) {
            this.productVersion = value;
        }

        /**
         * 获取officeID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfficeID() {
            return officeID;
        }

        /**
         * 设置officeID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfficeID(String value) {
            this.officeID = value;
        }

        /**
         * 获取corporateID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorporateID() {
            return corporateID;
        }

        /**
         * 设置corporateID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorporateID(String value) {
            this.corporateID = value;
        }

    }

}
