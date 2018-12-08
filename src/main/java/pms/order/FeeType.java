package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>FeeType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="FeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}AmountDeterminationType" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MandatoryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChargeFrequency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChargeUnitExempt" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="ChargeFrequencyExempt" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MaxChargeUnitApplies" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MaxChargeFrequencyApplies" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="TaxableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeType", propOrder = {
        "taxes",
        "description"
})
public class FeeType {

    @XmlElement(name = "Taxes")
    protected TaxesType taxes;
    @XmlElement(name = "Description")
    protected List<ParagraphType> description;
    @XmlAttribute(name = "TaxInclusive")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "Type")
    protected AmountDeterminationType type;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "ExpireDateExclusiveIndicator")
    protected Boolean expireDateExclusiveIndicator;
    @XmlAttribute(name = "MandatoryIndicator")
    protected Boolean mandatoryIndicator;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ChargeUnit")
    protected String chargeUnit;
    @XmlAttribute(name = "ChargeFrequency")
    protected String chargeFrequency;
    @XmlAttribute(name = "ChargeUnitExempt")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger chargeUnitExempt;
    @XmlAttribute(name = "ChargeFrequencyExempt")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger chargeFrequencyExempt;
    @XmlAttribute(name = "MaxChargeUnitApplies")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxChargeUnitApplies;
    @XmlAttribute(name = "MaxChargeFrequencyApplies")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxChargeFrequencyApplies;
    @XmlAttribute(name = "TaxableIndicator")
    protected Boolean taxableIndicator;

    /**
     * ��ȡtaxes���Ե�ֵ��
     *
     * @return possible object is
     * {@link TaxesType }
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /**
     * ����taxes���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TaxesType }
     */
    public void setTaxes(TaxesType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the description property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     */
    public List<ParagraphType> getDescription() {
        if (description == null) {
            description = new ArrayList<ParagraphType>();
        }
        return this.description;
    }

    /**
     * ��ȡtaxInclusive���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTaxInclusive() {
        return taxInclusive;
    }

    /**
     * ����taxInclusive���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTaxInclusive(Boolean value) {
        this.taxInclusive = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     *
     * @return possible object is
     * {@link AmountDeterminationType }
     */
    public AmountDeterminationType getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AmountDeterminationType }
     */
    public void setType(AmountDeterminationType value) {
        this.type = value;
    }

    /**
     * ��ȡcode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCode() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * ��ȡpercent���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * ����percent���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
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
     * ��ȡmandatoryIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMandatoryIndicator() {
        return mandatoryIndicator;
    }

    /**
     * ����mandatoryIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMandatoryIndicator(Boolean value) {
        this.mandatoryIndicator = value;
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
     * ��ȡchargeUnit���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getChargeUnit() {
        return chargeUnit;
    }

    /**
     * ����chargeUnit���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChargeUnit(String value) {
        this.chargeUnit = value;
    }

    /**
     * ��ȡchargeFrequency���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getChargeFrequency() {
        return chargeFrequency;
    }

    /**
     * ����chargeFrequency���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChargeFrequency(String value) {
        this.chargeFrequency = value;
    }

    /**
     * ��ȡchargeUnitExempt���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getChargeUnitExempt() {
        return chargeUnitExempt;
    }

    /**
     * ����chargeUnitExempt���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setChargeUnitExempt(BigInteger value) {
        this.chargeUnitExempt = value;
    }

    /**
     * ��ȡchargeFrequencyExempt���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getChargeFrequencyExempt() {
        return chargeFrequencyExempt;
    }

    /**
     * ����chargeFrequencyExempt���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setChargeFrequencyExempt(BigInteger value) {
        this.chargeFrequencyExempt = value;
    }

    /**
     * ��ȡmaxChargeUnitApplies���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxChargeUnitApplies() {
        return maxChargeUnitApplies;
    }

    /**
     * ����maxChargeUnitApplies���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxChargeUnitApplies(BigInteger value) {
        this.maxChargeUnitApplies = value;
    }

    /**
     * ��ȡmaxChargeFrequencyApplies���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxChargeFrequencyApplies() {
        return maxChargeFrequencyApplies;
    }

    /**
     * ����maxChargeFrequencyApplies���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxChargeFrequencyApplies(BigInteger value) {
        this.maxChargeFrequencyApplies = value;
    }

    /**
     * ��ȡtaxableIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTaxableIndicator() {
        return taxableIndicator;
    }

    /**
     * ����taxableIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTaxableIndicator(Boolean value) {
        this.taxableIndicator = value;
    }

}
