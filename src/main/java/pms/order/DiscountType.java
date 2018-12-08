package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>DiscountType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="DiscountType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
 *       &lt;sequence>
 *         &lt;element name="DiscountReason" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountType", propOrder = {
        "discountReason"
})
@XmlSeeAlso({
        pms.order.AmountType.Discount.class
})
public class DiscountType
        extends TotalType {

    @XmlElement(name = "DiscountReason")
    protected ParagraphType discountReason;
    @XmlAttribute(name = "TaxInclusive")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "DiscountCode")
    protected String discountCode;
    @XmlAttribute(name = "RestrictedDisplayIndicator")
    protected Boolean restrictedDisplayIndicator;

    /**
     * ��ȡdiscountReason���Ե�ֵ��
     *
     * @return possible object is
     * {@link ParagraphType }
     */
    public ParagraphType getDiscountReason() {
        return discountReason;
    }

    /**
     * ����discountReason���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ParagraphType }
     */
    public void setDiscountReason(ParagraphType value) {
        this.discountReason = value;
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
     * ��ȡdiscountCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * ����discountCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * ��ȡrestrictedDisplayIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRestrictedDisplayIndicator() {
        return restrictedDisplayIndicator;
    }

    /**
     * ����restrictedDisplayIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRestrictedDisplayIndicator(Boolean value) {
        this.restrictedDisplayIndicator = value;
    }

}
