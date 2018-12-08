
package ota.jw.AvailRes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DescriptionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType"&gt;
 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionType")
public class DescriptionType
    extends ParagraphType
{

    @XmlAttribute(name = "Location")
    protected Boolean location;
    @XmlAttribute(name = "RefDirectionTo")
    protected Boolean refDirectionTo;

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocation(Boolean value) {
        this.location = value;
    }

    /**
     * 获取refDirectionTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefDirectionTo() {
        return refDirectionTo;
    }

    /**
     * 设置refDirectionTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefDirectionTo(Boolean value) {
        this.refDirectionTo = value;
    }

}
