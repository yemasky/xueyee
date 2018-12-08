
package ota.jw.GenericSeamlessGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TotalType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="AdditionalFeesExcludedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ServiceOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AmountIncludingMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalType", propOrder = {
    "taxes"
})
@XmlSeeAlso({
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
    @XmlAttribute(name = "Breakfast")
    protected String breakfast;
    @XmlAttribute(name = "Price")
    protected BigDecimal price;
    @XmlAttribute(name = "Cost")
    protected BigDecimal cost;

    /**
     * 获取taxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /**
     * 设置taxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setTaxes(TaxesType value) {
        this.taxes = value;
    }

    /**
     * 获取amountBeforeTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountBeforeTax() {
        return amountBeforeTax;
    }

    /**
     * 设置amountBeforeTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountBeforeTax(BigDecimal value) {
        this.amountBeforeTax = value;
    }

    /**
     * 获取amountAfterTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountAfterTax() {
        return amountAfterTax;
    }

    /**
     * 设置amountAfterTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountAfterTax(BigDecimal value) {
        this.amountAfterTax = value;
    }

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * 获取decimalPlaces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * 设置decimalPlaces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * 获取additionalFeesExcludedIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalFeesExcludedIndicator() {
        return additionalFeesExcludedIndicator;
    }

    /**
     * 设置additionalFeesExcludedIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalFeesExcludedIndicator(Boolean value) {
        this.additionalFeesExcludedIndicator = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取serviceOverrideIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceOverrideIndicator() {
        return serviceOverrideIndicator;
    }

    /**
     * 设置serviceOverrideIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceOverrideIndicator(Boolean value) {
        this.serviceOverrideIndicator = value;
    }

    /**
     * 获取rateOverrideIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateOverrideIndicator() {
        return rateOverrideIndicator;
    }

    /**
     * 设置rateOverrideIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateOverrideIndicator(Boolean value) {
        this.rateOverrideIndicator = value;
    }

    /**
     * 获取amountIncludingMarkup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountIncludingMarkup() {
        return amountIncludingMarkup;
    }

    /**
     * 设置amountIncludingMarkup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountIncludingMarkup(BigDecimal value) {
        this.amountIncludingMarkup = value;
    }

    /**
     * 获取breakfast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakfast() {
        return breakfast;
    }

    /**
     * 设置breakfast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakfast(String value) {
        this.breakfast = value;
    }

    /**
     * 获取price属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * 获取cost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * 设置cost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCost(BigDecimal value) {
        this.cost = value;
    }

}
