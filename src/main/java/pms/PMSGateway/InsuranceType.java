package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>InsuranceType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="InsuranceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuredName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *         &lt;element name="InsuranceCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="Underwriter" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
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
 *       &lt;attribute name="InsuranceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceType", propOrder = {
        "insuredName",
        "insuranceCompany",
        "underwriter"
})
public class InsuranceType {

    @XmlElement(name = "InsuredName")
    protected PersonNameType insuredName;
    @XmlElement(name = "InsuranceCompany")
    protected CompanyNameType insuranceCompany;
    @XmlElement(name = "Underwriter")
    protected CompanyNameType underwriter;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "InsuranceType")
    protected String insuranceType;
    @XmlAttribute(name = "PolicyNumber")
    protected String policyNumber;
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

    /**
     * ��ȡinsuredName���Ե�ֵ��
     *
     * @return possible object is
     * {@link PersonNameType }
     */
    public PersonNameType getInsuredName() {
        return insuredName;
    }

    /**
     * ����insuredName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PersonNameType }
     */
    public void setInsuredName(PersonNameType value) {
        this.insuredName = value;
    }

    /**
     * ��ȡinsuranceCompany���Ե�ֵ��
     *
     * @return possible object is
     * {@link CompanyNameType }
     */
    public CompanyNameType getInsuranceCompany() {
        return insuranceCompany;
    }

    /**
     * ����insuranceCompany���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CompanyNameType }
     */
    public void setInsuranceCompany(CompanyNameType value) {
        this.insuranceCompany = value;
    }

    /**
     * ��ȡunderwriter���Ե�ֵ��
     *
     * @return possible object is
     * {@link CompanyNameType }
     */
    public CompanyNameType getUnderwriter() {
        return underwriter;
    }

    /**
     * ����underwriter���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CompanyNameType }
     */
    public void setUnderwriter(CompanyNameType value) {
        this.underwriter = value;
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
     * ��ȡinsuranceType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInsuranceType() {
        return insuranceType;
    }

    /**
     * ����insuranceType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInsuranceType(String value) {
        this.insuranceType = value;
    }

    /**
     * ��ȡpolicyNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * ����policyNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
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

}
