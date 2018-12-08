
package ota.jw.ARIPmsGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddressInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddressInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType"&gt;
 *       &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UseType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfoType")
@XmlSeeAlso({
    ota.jw.ARIPmsGateway.ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address.class,
    ota.jw.ARIPmsGateway.CustomerType.Address.class,
    ota.jw.ARIPmsGateway.CompanyInfoType.AddressInfo.class
})
public class AddressInfoType
    extends AddressType
{

    @XmlAttribute(name = "DefaultInd")
    protected Boolean defaultInd;
    @XmlAttribute(name = "UseType")
    protected String useType;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * 获取defaultInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultInd() {
        return defaultInd;
    }

    /**
     * 设置defaultInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultInd(Boolean value) {
        this.defaultInd = value;
    }

    /**
     * 获取useType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseType() {
        return useType;
    }

    /**
     * 设置useType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseType(String value) {
        this.useType = value;
    }

    /**
     * 获取rph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * 设置rph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

}
