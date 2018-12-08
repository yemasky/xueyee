package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>PkgPriceType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="PkgPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="PriceBasis" type="{http://www.opentravel.org/OTA/2003/05}PricingType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgPriceType")
public class PkgPriceType {

    @XmlAttribute(name = "Age")
    protected BigInteger age;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "PriceBasis")
    protected PricingType priceBasis;

    /**
     * ��ȡage���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * ����age���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setAge(BigInteger value) {
        this.age = value;
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
     * ��ȡcodeContext���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * ����codeContext���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * ��ȡuri���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getURI() {
        return uri;
    }

    /**
     * ����uri���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setURI(String value) {
        this.uri = value;
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
     * ��ȡpriceBasis���Ե�ֵ��
     *
     * @return possible object is
     * {@link PricingType }
     */
    public PricingType getPriceBasis() {
        return priceBasis;
    }

    /**
     * ����priceBasis���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PricingType }
     */
    public void setPriceBasis(PricingType value) {
        this.priceBasis = value;
    }

}
