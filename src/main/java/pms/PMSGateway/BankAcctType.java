package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>BankAcctType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="BankAcctType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankAcctName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *       &lt;attribute name="BankID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChecksAcceptedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAcctType", propOrder = {
        "bankAcctName"
})
public class BankAcctType {

    @XmlElement(name = "BankAcctName")
    protected String bankAcctName;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "BankID")
    protected String bankID;
    @XmlAttribute(name = "AcctType")
    protected String acctType;
    @XmlAttribute(name = "BankAcctNumber")
    protected String bankAcctNumber;
    @XmlAttribute(name = "ChecksAcceptedInd")
    protected Boolean checksAcceptedInd;
    @XmlAttribute(name = "CheckNumber")
    protected String checkNumber;

    /**
     * ��ȡbankAcctName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBankAcctName() {
        return bankAcctName;
    }

    /**
     * ����bankAcctName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBankAcctName(String value) {
        this.bankAcctName = value;
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

    /**
     * ��ȡacctType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * ����acctType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * ��ȡbankAcctNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBankAcctNumber() {
        return bankAcctNumber;
    }

    /**
     * ����bankAcctNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBankAcctNumber(String value) {
        this.bankAcctNumber = value;
    }

    /**
     * ��ȡchecksAcceptedInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isChecksAcceptedInd() {
        return checksAcceptedInd;
    }

    /**
     * ����checksAcceptedInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setChecksAcceptedInd(Boolean value) {
        this.checksAcceptedInd = value;
    }

    /**
     * ��ȡcheckNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * ����checkNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

}
