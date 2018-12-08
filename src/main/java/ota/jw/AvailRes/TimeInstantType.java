
package ota.jw.AvailRes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.Duration;


/**
 * <p>TimeInstantType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TimeInstantType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="WindowBefore" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="WindowAfter" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="CrossDateAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInstantType", propOrder = {
    "value"
})
public class TimeInstantType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "WindowBefore")
    protected Duration windowBefore;
    @XmlAttribute(name = "WindowAfter")
    protected Duration windowAfter;
    @XmlAttribute(name = "CrossDateAllowedIndicator")
    protected Boolean crossDateAllowedIndicator;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取windowBefore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getWindowBefore() {
        return windowBefore;
    }

    /**
     * 设置windowBefore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setWindowBefore(Duration value) {
        this.windowBefore = value;
    }

    /**
     * 获取windowAfter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getWindowAfter() {
        return windowAfter;
    }

    /**
     * 设置windowAfter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setWindowAfter(Duration value) {
        this.windowAfter = value;
    }

    /**
     * 获取crossDateAllowedIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossDateAllowedIndicator() {
        return crossDateAllowedIndicator;
    }

    /**
     * 设置crossDateAllowedIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossDateAllowedIndicator(Boolean value) {
        this.crossDateAllowedIndicator = value;
    }

}
