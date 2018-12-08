package pms.order;

import javax.xml.bind.annotation.*;


/**
 * <p>DirectBillType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="DirectBillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
 *                 &lt;attribute name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressInfoType" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" minOccurs="0"/>
 *         &lt;element name="Telephone" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attribute name="DirectBill_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectBillType", propOrder = {
        "companyName",
        "address",
        "email",
        "telephone"
})
public class DirectBillType {

    @XmlElement(name = "CompanyName")
    protected DirectBillType.CompanyName companyName;
    @XmlElement(name = "Address")
    protected AddressInfoType address;
    @XmlElement(name = "Email")
    protected EmailType email;
    @XmlElement(name = "Telephone")
    protected DirectBillType.Telephone telephone;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "DirectBill_ID")
    protected String directBillID;
    @XmlAttribute(name = "BillingNumber")
    protected String billingNumber;

    /**
     * ��ȡcompanyName���Ե�ֵ��
     *
     * @return possible object is
     * {@link DirectBillType.CompanyName }
     */
    public DirectBillType.CompanyName getCompanyName() {
        return companyName;
    }

    /**
     * ����companyName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DirectBillType.CompanyName }
     */
    public void setCompanyName(DirectBillType.CompanyName value) {
        this.companyName = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
     *
     * @return possible object is
     * {@link AddressInfoType }
     */
    public AddressInfoType getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AddressInfoType }
     */
    public void setAddress(AddressInfoType value) {
        this.address = value;
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
     * ��ȡtelephone���Ե�ֵ��
     *
     * @return possible object is
     * {@link DirectBillType.Telephone }
     */
    public DirectBillType.Telephone getTelephone() {
        return telephone;
    }

    /**
     * ����telephone���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DirectBillType.Telephone }
     */
    public void setTelephone(DirectBillType.Telephone value) {
        this.telephone = value;
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
     * ��ȡdirectBillID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDirectBillID() {
        return directBillID;
    }

    /**
     * ����directBillID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDirectBillID(String value) {
        this.directBillID = value;
    }

    /**
     * ��ȡbillingNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBillingNumber() {
        return billingNumber;
    }

    /**
     * ����billingNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBillingNumber(String value) {
        this.billingNumber = value;
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
     *       &lt;attribute name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CompanyName
            extends CompanyNameType {

        @XmlAttribute(name = "ContactName")
        protected String contactName;

        /**
         * ��ȡcontactName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getContactName() {
            return contactName;
        }

        /**
         * ����contactName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setContactName(String value) {
            this.contactName = value;
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
