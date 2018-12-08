
package ota.jw.AvailRes;

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
 * <p>AmountPercentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AmountPercentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FeesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="BasisType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="FullStay"/&gt;
 *             &lt;enumeration value="Nights"/&gt;
 *             &lt;enumeration value="FirstLast"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="ApplyAs"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="FirstNightDeposit"/&gt;
 *             &lt;enumeration value="LastNightDepost"/&gt;
 *             &lt;enumeration value="FirstAndLastNightDeposit"/&gt;
 *             &lt;enumeration value="FirstNightPayment"/&gt;
 *             &lt;enumeration value="LastNightPayment"/&gt;
 *             &lt;enumeration value="FirstAndLastNightPayment"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPercentType", propOrder = {
    "taxes"
})
@XmlSeeAlso({
    ota.jw.AvailRes.ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.AmountPercent.class
})
public class AmountPercentType {

    @XmlElement(name = "Taxes")
    protected TaxesType taxes;
    @XmlAttribute(name = "TaxInclusive")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "FeesInclusive")
    protected Boolean feesInclusive;
    @XmlAttribute(name = "NmbrOfNights")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nmbrOfNights;
    @XmlAttribute(name = "BasisType")
    protected String basisType;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "ApplyAs")
    protected String applyAs;

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
     * 获取taxInclusive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInclusive() {
        return taxInclusive;
    }

    /**
     * 设置taxInclusive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInclusive(Boolean value) {
        this.taxInclusive = value;
    }

    /**
     * 获取feesInclusive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeesInclusive() {
        return feesInclusive;
    }

    /**
     * 设置feesInclusive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeesInclusive(Boolean value) {
        this.feesInclusive = value;
    }

    /**
     * 获取nmbrOfNights属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNmbrOfNights() {
        return nmbrOfNights;
    }

    /**
     * 设置nmbrOfNights属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNmbrOfNights(BigInteger value) {
        this.nmbrOfNights = value;
    }

    /**
     * 获取basisType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasisType() {
        return basisType;
    }

    /**
     * 设置basisType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasisType(String value) {
        this.basisType = value;
    }

    /**
     * 获取percent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * 设置percent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * 获取applyAs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyAs() {
        return applyAs;
    }

    /**
     * 设置applyAs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyAs(String value) {
        this.applyAs = value;
    }

}
