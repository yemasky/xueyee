package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>TotalType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="TotalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="AdditionalFeesExcludedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AmountIncludingMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalType", propOrder = {
        "taxes"
})
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfRateUploadTypeBaseByGuestAmt.BaseByGuestAmt.class,
        DiscountType.class,
        HTNGExtendedPrice.class
})
public class TotalType {

    @XmlElement(name = "Taxes")
    protected TaxesType taxes;
    @XmlAttribute(name = "AmountBeforeTax")
    protected BigDecimal amountBeforeTax;
    @XmlAttribute(name = "AmountAfterTax")
    protected BigDecimal amountAfterTax;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "AdditionalFeesExcludedIndicator")
    protected Boolean additionalFeesExcludedIndicator;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ServiceOverrideIndicator")
    protected Boolean serviceOverrideIndicator;
    @XmlAttribute(name = "RateOverrideIndicator")
    protected Boolean rateOverrideIndicator;
    @XmlAttribute(name = "AmountIncludingMarkup")
    protected BigDecimal amountIncludingMarkup;

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
     * ��ȡamountBeforeTax���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAmountBeforeTax() {
        return amountBeforeTax;
    }

    /**
     * ����amountBeforeTax���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAmountBeforeTax(BigDecimal value) {
        this.amountBeforeTax = value;
    }

    /**
     * ��ȡamountAfterTax���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAmountAfterTax() {
        return amountAfterTax;
    }

    /**
     * ����amountAfterTax���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAmountAfterTax(BigDecimal value) {
        this.amountAfterTax = value;
    }

    /**
     * ��ȡcurrencyCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * ����currencyCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * ��ȡdecimalPlaces���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * ����decimalPlaces���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * ��ȡadditionalFeesExcludedIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAdditionalFeesExcludedIndicator() {
        return additionalFeesExcludedIndicator;
    }

    /**
     * ����additionalFeesExcludedIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAdditionalFeesExcludedIndicator(Boolean value) {
        this.additionalFeesExcludedIndicator = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * ��ȡserviceOverrideIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isServiceOverrideIndicator() {
        return serviceOverrideIndicator;
    }

    /**
     * ����serviceOverrideIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setServiceOverrideIndicator(Boolean value) {
        this.serviceOverrideIndicator = value;
    }

    /**
     * ��ȡrateOverrideIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRateOverrideIndicator() {
        return rateOverrideIndicator;
    }

    /**
     * ����rateOverrideIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRateOverrideIndicator(Boolean value) {
        this.rateOverrideIndicator = value;
    }

    /**
     * ��ȡamountIncludingMarkup���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAmountIncludingMarkup() {
        return amountIncludingMarkup;
    }

    /**
     * ����amountIncludingMarkup���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAmountIncludingMarkup(BigDecimal value) {
        this.amountIncludingMarkup = value;
    }

}
