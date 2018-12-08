
package ota.jw.AutoMappingWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NotifyOnOffInfoRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NotifyOnOffInfoRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotifyOnOffInfo" type="{http://www.opentravel.org/OTA/2003/05}NotifyOnOffInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyOnOffInfoRS", propOrder = {
    "notifyOnOffInfo"
})
public class NotifyOnOffInfoRS {

    @XmlElement(name = "NotifyOnOffInfo")
    protected NotifyOnOffInfo notifyOnOffInfo;

    /**
     * 获取notifyOnOffInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotifyOnOffInfo }
     *     
     */
    public NotifyOnOffInfo getNotifyOnOffInfo() {
        return notifyOnOffInfo;
    }

    /**
     * 设置notifyOnOffInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyOnOffInfo }
     *     
     */
    public void setNotifyOnOffInfo(NotifyOnOffInfo value) {
        this.notifyOnOffInfo = value;
    }

}
