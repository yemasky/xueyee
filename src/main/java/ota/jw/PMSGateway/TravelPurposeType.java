
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>TravelPurposeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TravelPurposeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;TravelPurposeEnum"&gt;
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPurposeType", propOrder = {
    "value"
})
public class TravelPurposeType {

    @XmlValue
    protected TravelPurposeEnum value;
    @XmlAttribute(name = "extension")
    protected String extension;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelPurposeEnum }
     *     
     */
    public TravelPurposeEnum getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPurposeEnum }
     *     
     */
    public void setValue(TravelPurposeEnum value) {
        this.value = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}
