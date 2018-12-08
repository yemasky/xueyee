
package ota.jw.ARIPmsGateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HTNG_PaymentCardType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HTNG_PaymentCardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentCardType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EMVData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CardNumberIsProxy" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsEMV" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IssueNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTNG_PaymentCardType", namespace = "http://htng.org/2014B", propOrder = {
    "emvData"
})
public class HTNGPaymentCardType
    extends PaymentCardType
{

    @XmlElement(name = "EMVData")
    protected String emvData;
    @XmlAttribute(name = "CardNumberIsProxy")
    protected Boolean cardNumberIsProxy;
    @XmlAttribute(name = "IsEMV")
    protected Boolean isEMV;
    @XmlAttribute(name = "IssueNumber")
    protected BigInteger issueNumber;

    /**
     * 获取emvData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMVData() {
        return emvData;
    }

    /**
     * 设置emvData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMVData(String value) {
        this.emvData = value;
    }

    /**
     * 获取cardNumberIsProxy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardNumberIsProxy() {
        return cardNumberIsProxy;
    }

    /**
     * 设置cardNumberIsProxy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardNumberIsProxy(Boolean value) {
        this.cardNumberIsProxy = value;
    }

    /**
     * 获取isEMV属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEMV() {
        return isEMV;
    }

    /**
     * 设置isEMV属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEMV(Boolean value) {
        this.isEMV = value;
    }

    /**
     * 获取issueNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIssueNumber() {
        return issueNumber;
    }

    /**
     * 设置issueNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIssueNumber(BigInteger value) {
        this.issueNumber = value;
    }

}
