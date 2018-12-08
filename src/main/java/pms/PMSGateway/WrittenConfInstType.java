package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>WrittenConfInstType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="WrittenConfInstType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplementalData" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LanguageID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ConfirmInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrittenConfInstType", propOrder = {
        "supplementalData",
        "email"
})
public class WrittenConfInstType {

    @XmlElement(name = "SupplementalData")
    protected ParagraphType supplementalData;
    @XmlElement(name = "Email")
    protected EmailType email;
    @XmlAttribute(name = "LanguageID")
    protected String languageID;
    @XmlAttribute(name = "AddresseeName")
    protected String addresseeName;
    @XmlAttribute(name = "Address")
    protected String address;
    @XmlAttribute(name = "Telephone")
    protected String telephone;
    @XmlAttribute(name = "ConfirmInd")
    protected Boolean confirmInd;

    /**
     * ��ȡsupplementalData���Ե�ֵ��
     *
     * @return possible object is
     * {@link ParagraphType }
     */
    public ParagraphType getSupplementalData() {
        return supplementalData;
    }

    /**
     * ����supplementalData���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ParagraphType }
     */
    public void setSupplementalData(ParagraphType value) {
        this.supplementalData = value;
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
     * ��ȡlanguageID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * ����languageID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * ��ȡaddresseeName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddresseeName() {
        return addresseeName;
    }

    /**
     * ����addresseeName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddresseeName(String value) {
        this.addresseeName = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * ��ȡtelephone���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * ����telephone���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * ��ȡconfirmInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isConfirmInd() {
        return confirmInd;
    }

    /**
     * ����confirmInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setConfirmInd(Boolean value) {
        this.confirmInd = value;
    }

}
