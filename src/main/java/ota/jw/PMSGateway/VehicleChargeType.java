
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleChargeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxAmounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleChargeTypeTaxAmount" minOccurs="0"/&gt;
 *         &lt;element name="MinMax" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MaxCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="MinCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="MaxChargeDays" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Calculation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="UnitCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="Applicability"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="FromPickupLocation"/&gt;
 *                       &lt;enumeration value="FromDropoffLocation"/&gt;
 *                       &lt;enumeration value="BeforePickup"/&gt;
 *                       &lt;enumeration value="AfterDropoff"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IncludedInRate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IncludedInEstTotalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateConvertInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleChargeType", propOrder = {
    "taxAmounts",
    "minMax",
    "calculation"
})
@XmlSeeAlso({
    VehicleChargePurposeType.class
})
public class VehicleChargeType {

    @XmlElement(name = "TaxAmounts")
    protected ArrayOfVehicleChargeTypeTaxAmount taxAmounts;
    @XmlElement(name = "MinMax")
    protected VehicleChargeType.MinMax minMax;
    @XmlElement(name = "Calculation")
    protected List<VehicleChargeType.Calculation> calculation;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "TaxInclusive")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "GuaranteedInd")
    protected Boolean guaranteedInd;
    @XmlAttribute(name = "IncludedInRate")
    protected Boolean includedInRate;
    @XmlAttribute(name = "IncludedInEstTotalInd")
    protected Boolean includedInEstTotalInd;
    @XmlAttribute(name = "RateConvertInd")
    protected Boolean rateConvertInd;

    /**
     * 获取taxAmounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleChargeTypeTaxAmount }
     *     
     */
    public ArrayOfVehicleChargeTypeTaxAmount getTaxAmounts() {
        return taxAmounts;
    }

    /**
     * 设置taxAmounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleChargeTypeTaxAmount }
     *     
     */
    public void setTaxAmounts(ArrayOfVehicleChargeTypeTaxAmount value) {
        this.taxAmounts = value;
    }

    /**
     * 获取minMax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargeType.MinMax }
     *     
     */
    public VehicleChargeType.MinMax getMinMax() {
        return minMax;
    }

    /**
     * 设置minMax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargeType.MinMax }
     *     
     */
    public void setMinMax(VehicleChargeType.MinMax value) {
        this.minMax = value;
    }

    /**
     * Gets the value of the calculation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleChargeType.Calculation }
     * 
     * 
     */
    public List<VehicleChargeType.Calculation> getCalculation() {
        if (calculation == null) {
            calculation = new ArrayList<VehicleChargeType.Calculation>();
        }
        return this.calculation;
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
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取guaranteedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * 设置guaranteedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedInd(Boolean value) {
        this.guaranteedInd = value;
    }

    /**
     * 获取includedInRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludedInRate() {
        return includedInRate;
    }

    /**
     * 设置includedInRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludedInRate(Boolean value) {
        this.includedInRate = value;
    }

    /**
     * 获取includedInEstTotalInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludedInEstTotalInd() {
        return includedInEstTotalInd;
    }

    /**
     * 设置includedInEstTotalInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludedInEstTotalInd(Boolean value) {
        this.includedInEstTotalInd = value;
    }

    /**
     * 获取rateConvertInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateConvertInd() {
        return rateConvertInd;
    }

    /**
     * 设置rateConvertInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateConvertInd(Boolean value) {
        this.rateConvertInd = value;
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
     *       &lt;attribute name="UnitCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="Applicability"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="FromPickupLocation"/&gt;
     *             &lt;enumeration value="FromDropoffLocation"/&gt;
     *             &lt;enumeration value="BeforePickup"/&gt;
     *             &lt;enumeration value="AfterDropoff"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Calculation {

        @XmlAttribute(name = "UnitCharge")
        protected BigDecimal unitCharge;
        @XmlAttribute(name = "UnitName")
        protected String unitName;
        @XmlAttribute(name = "Quantity")
        protected BigInteger quantity;
        @XmlAttribute(name = "Percentage")
        protected BigDecimal percentage;
        @XmlAttribute(name = "Applicability")
        protected String applicability;
        @XmlAttribute(name = "MaxQuantity")
        protected BigInteger maxQuantity;
        @XmlAttribute(name = "Total")
        protected BigDecimal total;

        /**
         * 获取unitCharge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitCharge() {
            return unitCharge;
        }

        /**
         * 设置unitCharge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitCharge(BigDecimal value) {
            this.unitCharge = value;
        }

        /**
         * 获取unitName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitName() {
            return unitName;
        }

        /**
         * 设置unitName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitName(String value) {
            this.unitName = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * 获取percentage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercentage() {
            return percentage;
        }

        /**
         * 设置percentage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercentage(BigDecimal value) {
            this.percentage = value;
        }

        /**
         * 获取applicability属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicability() {
            return applicability;
        }

        /**
         * 设置applicability属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicability(String value) {
            this.applicability = value;
        }

        /**
         * 获取maxQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxQuantity() {
            return maxQuantity;
        }

        /**
         * 设置maxQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxQuantity(BigInteger value) {
            this.maxQuantity = value;
        }

        /**
         * 获取total属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotal() {
            return total;
        }

        /**
         * 设置total属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotal(BigDecimal value) {
            this.total = value;
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
     *       &lt;attribute name="MaxCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="MinCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="MaxChargeDays" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MinMax {

        @XmlAttribute(name = "MaxCharge")
        protected BigDecimal maxCharge;
        @XmlAttribute(name = "MinCharge")
        protected BigDecimal minCharge;
        @XmlAttribute(name = "MaxChargeDays")
        protected BigInteger maxChargeDays;

        /**
         * 获取maxCharge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxCharge() {
            return maxCharge;
        }

        /**
         * 设置maxCharge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxCharge(BigDecimal value) {
            this.maxCharge = value;
        }

        /**
         * 获取minCharge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinCharge() {
            return minCharge;
        }

        /**
         * 设置minCharge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinCharge(BigDecimal value) {
            this.minCharge = value;
        }

        /**
         * 获取maxChargeDays属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxChargeDays() {
            return maxChargeDays;
        }

        /**
         * 设置maxChargeDays属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxChargeDays(BigInteger value) {
            this.maxChargeDays = value;
        }

    }

}
