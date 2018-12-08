package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>VehicleChargeType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleChargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxAmounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleChargeTypeTaxAmount" minOccurs="0"/>
 *         &lt;element name="MinMax" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MaxCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MinCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MaxChargeDays" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Calculation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UnitCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Applicability">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="FromPickupLocation"/>
 *                       &lt;enumeration value="FromDropoffLocation"/>
 *                       &lt;enumeration value="BeforePickup"/>
 *                       &lt;enumeration value="AfterDropoff"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IncludedInRate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IncludedInEstTotalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateConvertInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * ��ȡtaxAmounts���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfVehicleChargeTypeTaxAmount }
     */
    public ArrayOfVehicleChargeTypeTaxAmount getTaxAmounts() {
        return taxAmounts;
    }

    /**
     * ����taxAmounts���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfVehicleChargeTypeTaxAmount }
     */
    public void setTaxAmounts(ArrayOfVehicleChargeTypeTaxAmount value) {
        this.taxAmounts = value;
    }

    /**
     * ��ȡminMax���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleChargeType.MinMax }
     */
    public VehicleChargeType.MinMax getMinMax() {
        return minMax;
    }

    /**
     * ����minMax���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleChargeType.MinMax }
     */
    public void setMinMax(VehicleChargeType.MinMax value) {
        this.minMax = value;
    }

    /**
     * Gets the value of the calculation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleChargeType.Calculation }
     */
    public List<VehicleChargeType.Calculation> getCalculation() {
        if (calculation == null) {
            calculation = new ArrayList<VehicleChargeType.Calculation>();
        }
        return this.calculation;
    }

    /**
     * ��ȡamount���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * ����amount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
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
     * ��ȡdescription���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡguaranteedInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * ����guaranteedInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGuaranteedInd(Boolean value) {
        this.guaranteedInd = value;
    }

    /**
     * ��ȡincludedInRate���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIncludedInRate() {
        return includedInRate;
    }

    /**
     * ����includedInRate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIncludedInRate(Boolean value) {
        this.includedInRate = value;
    }

    /**
     * ��ȡincludedInEstTotalInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIncludedInEstTotalInd() {
        return includedInEstTotalInd;
    }

    /**
     * ����includedInEstTotalInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIncludedInEstTotalInd(Boolean value) {
        this.includedInEstTotalInd = value;
    }

    /**
     * ��ȡrateConvertInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRateConvertInd() {
        return rateConvertInd;
    }

    /**
     * ����rateConvertInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRateConvertInd(Boolean value) {
        this.rateConvertInd = value;
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
     *       &lt;attribute name="UnitCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Applicability">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="FromPickupLocation"/>
     *             &lt;enumeration value="FromDropoffLocation"/>
     *             &lt;enumeration value="BeforePickup"/>
     *             &lt;enumeration value="AfterDropoff"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡunitCharge���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getUnitCharge() {
            return unitCharge;
        }

        /**
         * ����unitCharge���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setUnitCharge(BigDecimal value) {
            this.unitCharge = value;
        }

        /**
         * ��ȡunitName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getUnitName() {
            return unitName;
        }

        /**
         * ����unitName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUnitName(String value) {
            this.unitName = value;
        }

        /**
         * ��ȡquantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * ����quantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * ��ȡpercentage���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getPercentage() {
            return percentage;
        }

        /**
         * ����percentage���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setPercentage(BigDecimal value) {
            this.percentage = value;
        }

        /**
         * ��ȡapplicability���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getApplicability() {
            return applicability;
        }

        /**
         * ����applicability���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setApplicability(String value) {
            this.applicability = value;
        }

        /**
         * ��ȡmaxQuantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxQuantity() {
            return maxQuantity;
        }

        /**
         * ����maxQuantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxQuantity(BigInteger value) {
            this.maxQuantity = value;
        }

        /**
         * ��ȡtotal���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotal() {
            return total;
        }

        /**
         * ����total���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotal(BigDecimal value) {
            this.total = value;
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
     *       &lt;attribute name="MaxCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="MinCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="MaxChargeDays" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡmaxCharge���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getMaxCharge() {
            return maxCharge;
        }

        /**
         * ����maxCharge���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setMaxCharge(BigDecimal value) {
            this.maxCharge = value;
        }

        /**
         * ��ȡminCharge���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getMinCharge() {
            return minCharge;
        }

        /**
         * ����minCharge���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setMinCharge(BigDecimal value) {
            this.minCharge = value;
        }

        /**
         * ��ȡmaxChargeDays���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxChargeDays() {
            return maxChargeDays;
        }

        /**
         * ����maxChargeDays���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxChargeDays(BigInteger value) {
            this.maxChargeDays = value;
        }

    }

}
