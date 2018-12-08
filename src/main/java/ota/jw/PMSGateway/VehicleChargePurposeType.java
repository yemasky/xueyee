
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleChargePurposeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleChargePurposeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
 *       &lt;attribute name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleChargePurposeType")
public class VehicleChargePurposeType
    extends VehicleChargeType
{

    @XmlAttribute(name = "Purpose")
    protected String purpose;
    @XmlAttribute(name = "RequiredInd")
    protected Boolean requiredInd;

    /**
     * 获取purpose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * 设置purpose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * 获取requiredInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredInd() {
        return requiredInd;
    }

    /**
     * 设置requiredInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredInd(Boolean value) {
        this.requiredInd = value;
    }

}
