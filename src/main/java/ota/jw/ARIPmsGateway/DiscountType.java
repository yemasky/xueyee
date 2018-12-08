
package ota.jw.ARIPmsGateway;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DiscountType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DiscountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscountReason" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountType", propOrder = {
    "discountReason"
})
public class DiscountType
    extends TotalType
{

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
     * 获取discountReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getDiscountReason() {
        return discountReason;
    }

    /**
     * 设置discountReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setDiscountReason(ParagraphType value) {
        this.discountReason = value;
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
     * 获取discountCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * 设置discountCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * 获取restrictedDisplayIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedDisplayIndicator() {
        return restrictedDisplayIndicator;
    }

    /**
     * 设置restrictedDisplayIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedDisplayIndicator(Boolean value) {
        this.restrictedDisplayIndicator = value;
    }

}
