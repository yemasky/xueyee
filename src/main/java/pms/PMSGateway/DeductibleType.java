package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>DeductibleType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="DeductibleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="LiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ExcessAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeductibleType")
public class DeductibleType {

    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "LiabilityAmount")
    protected BigDecimal liabilityAmount;
    @XmlAttribute(name = "ExcessAmount")
    protected BigDecimal excessAmount;

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
     * ��ȡliabilityAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getLiabilityAmount() {
        return liabilityAmount;
    }

    /**
     * ����liabilityAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setLiabilityAmount(BigDecimal value) {
        this.liabilityAmount = value;
    }

    /**
     * ��ȡexcessAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getExcessAmount() {
        return excessAmount;
    }

    /**
     * ����excessAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setExcessAmount(BigDecimal value) {
        this.excessAmount = value;
    }

}
