package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>CommissionType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CommissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="CommissionableAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="TaxInclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrepaidAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlatCommission" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CommissionPayableAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StatusType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Full"/>
 *             &lt;enumeration value="Partial"/>
 *             &lt;enumeration value="Non-paying"/>
 *             &lt;enumeration value="No-show"/>
 *             &lt;enumeration value="Adjustment"/>
 *             &lt;enumeration value="Commissionable"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxCommissionUnitApplies" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="CapAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionType", propOrder = {
        "uniqueID",
        "commissionableAmount",
        "prepaidAmount",
        "flatCommission",
        "commissionPayableAmount",
        "comment"
})
public class CommissionType {

    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "CommissionableAmount")
    protected CommissionType.CommissionableAmount commissionableAmount;
    @XmlElement(name = "PrepaidAmount")
    protected CommissionType.PrepaidAmount prepaidAmount;
    @XmlElement(name = "FlatCommission")
    protected CommissionType.FlatCommission flatCommission;
    @XmlElement(name = "CommissionPayableAmount")
    protected CommissionType.CommissionPayableAmount commissionPayableAmount;
    @XmlElement(name = "Comment")
    protected ParagraphType comment;
    @XmlAttribute(name = "StatusType")
    protected String statusType;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "ReasonCode")
    protected String reasonCode;
    @XmlAttribute(name = "BillToID")
    protected String billToID;
    @XmlAttribute(name = "Frequency")
    protected String frequency;
    @XmlAttribute(name = "MaxCommissionUnitApplies")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxCommissionUnitApplies;
    @XmlAttribute(name = "CapAmount")
    protected BigDecimal capAmount;

    /**
     * ��ȡuniqueID���Ե�ֵ��
     *
     * @return possible object is
     * {@link UniqueIDType }
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * ����uniqueID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link UniqueIDType }
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * ��ȡcommissionableAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link CommissionType.CommissionableAmount }
     */
    public CommissionType.CommissionableAmount getCommissionableAmount() {
        return commissionableAmount;
    }

    /**
     * ����commissionableAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CommissionType.CommissionableAmount }
     */
    public void setCommissionableAmount(CommissionType.CommissionableAmount value) {
        this.commissionableAmount = value;
    }

    /**
     * ��ȡprepaidAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link CommissionType.PrepaidAmount }
     */
    public CommissionType.PrepaidAmount getPrepaidAmount() {
        return prepaidAmount;
    }

    /**
     * ����prepaidAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CommissionType.PrepaidAmount }
     */
    public void setPrepaidAmount(CommissionType.PrepaidAmount value) {
        this.prepaidAmount = value;
    }

    /**
     * ��ȡflatCommission���Ե�ֵ��
     *
     * @return possible object is
     * {@link CommissionType.FlatCommission }
     */
    public CommissionType.FlatCommission getFlatCommission() {
        return flatCommission;
    }

    /**
     * ����flatCommission���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CommissionType.FlatCommission }
     */
    public void setFlatCommission(CommissionType.FlatCommission value) {
        this.flatCommission = value;
    }

    /**
     * ��ȡcommissionPayableAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link CommissionType.CommissionPayableAmount }
     */
    public CommissionType.CommissionPayableAmount getCommissionPayableAmount() {
        return commissionPayableAmount;
    }

    /**
     * ����commissionPayableAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CommissionType.CommissionPayableAmount }
     */
    public void setCommissionPayableAmount(CommissionType.CommissionPayableAmount value) {
        this.commissionPayableAmount = value;
    }

    /**
     * ��ȡcomment���Ե�ֵ��
     *
     * @return possible object is
     * {@link ParagraphType }
     */
    public ParagraphType getComment() {
        return comment;
    }

    /**
     * ����comment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ParagraphType }
     */
    public void setComment(ParagraphType value) {
        this.comment = value;
    }

    /**
     * ��ȡstatusType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatusType() {
        return statusType;
    }

    /**
     * ����statusType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatusType(String value) {
        this.statusType = value;
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
     * ��ȡreasonCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * ����reasonCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * ��ȡbillToID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBillToID() {
        return billToID;
    }

    /**
     * ����billToID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBillToID(String value) {
        this.billToID = value;
    }

    /**
     * ��ȡfrequency���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * ����frequency���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * ��ȡmaxCommissionUnitApplies���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxCommissionUnitApplies() {
        return maxCommissionUnitApplies;
    }

    /**
     * ����maxCommissionUnitApplies���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxCommissionUnitApplies(BigInteger value) {
        this.maxCommissionUnitApplies = value;
    }

    /**
     * ��ȡcapAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getCapAmount() {
        return capAmount;
    }

    /**
     * ����capAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setCapAmount(BigDecimal value) {
        this.capAmount = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CommissionPayableAmount {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="TaxInclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CommissionableAmount {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "TaxInclusiveIndicator")
        protected Boolean taxInclusiveIndicator;

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
         * ��ȡtaxInclusiveIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isTaxInclusiveIndicator() {
            return taxInclusiveIndicator;
        }

        /**
         * ����taxInclusiveIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setTaxInclusiveIndicator(Boolean value) {
            this.taxInclusiveIndicator = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlatCommission {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PrepaidAmount {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

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

    }

}
