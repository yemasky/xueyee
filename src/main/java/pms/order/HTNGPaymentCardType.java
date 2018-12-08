package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>HTNG_PaymentCardType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HTNG_PaymentCardType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentCardType">
 *       &lt;sequence>
 *         &lt;element name="EMVData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CardNumberIsProxy" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsEMV" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IssueNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTNG_PaymentCardType", namespace = "http://htng.org/2014B", propOrder = {
        "emvData"
})
public class HTNGPaymentCardType
        extends PaymentCardType {

    @XmlElement(name = "EMVData")
    protected String emvData;
    @XmlAttribute(name = "CardNumberIsProxy")
    protected Boolean cardNumberIsProxy;
    @XmlAttribute(name = "IsEMV")
    protected Boolean isEMV;
    @XmlAttribute(name = "IssueNumber")
    protected BigInteger issueNumber;

    /**
     * ��ȡemvData���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEMVData() {
        return emvData;
    }

    /**
     * ����emvData���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEMVData(String value) {
        this.emvData = value;
    }

    /**
     * ��ȡcardNumberIsProxy���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isCardNumberIsProxy() {
        return cardNumberIsProxy;
    }

    /**
     * ����cardNumberIsProxy���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCardNumberIsProxy(Boolean value) {
        this.cardNumberIsProxy = value;
    }

    /**
     * ��ȡisEMV���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsEMV() {
        return isEMV;
    }

    /**
     * ����isEMV���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsEMV(Boolean value) {
        this.isEMV = value;
    }

    /**
     * ��ȡissueNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getIssueNumber() {
        return issueNumber;
    }

    /**
     * ����issueNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setIssueNumber(BigInteger value) {
        this.issueNumber = value;
    }

}
