package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>AmountPercentType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="AmountPercentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FeesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="BasisType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="FullStay"/>
 *             &lt;enumeration value="Nights"/>
 *             &lt;enumeration value="FirstLast"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ApplyAs">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="FirstNightDeposit"/>
 *             &lt;enumeration value="LastNightDepost"/>
 *             &lt;enumeration value="FirstAndLastNightDeposit"/>
 *             &lt;enumeration value="FirstNightPayment"/>
 *             &lt;enumeration value="LastNightPayment"/>
 *             &lt;enumeration value="FirstAndLastNightPayment"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPercentType", propOrder = {
        "taxes"
})
@XmlSeeAlso({
        pms.order.ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.AmountPercent.class
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
     * ��ȡfeesInclusive���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isFeesInclusive() {
        return feesInclusive;
    }

    /**
     * ����feesInclusive���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setFeesInclusive(Boolean value) {
        this.feesInclusive = value;
    }

    /**
     * ��ȡnmbrOfNights���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getNmbrOfNights() {
        return nmbrOfNights;
    }

    /**
     * ����nmbrOfNights���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setNmbrOfNights(BigInteger value) {
        this.nmbrOfNights = value;
    }

    /**
     * ��ȡbasisType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBasisType() {
        return basisType;
    }

    /**
     * ����basisType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBasisType(String value) {
        this.basisType = value;
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
     * ��ȡapplyAs���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getApplyAs() {
        return applyAs;
    }

    /**
     * ����applyAs���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setApplyAs(String value) {
        this.applyAs = value;
    }

}
