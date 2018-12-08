
package ota.jw.AutoMappingWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PMSNotifyOTAModelRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PMSNotifyOTAModelRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotityOnoffInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOnOffHotelInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMSNotifyOTAModelRQ", propOrder = {
    "notityOnoffInfos"
})
public class PMSNotifyOTAModelRQ {

    @XmlElement(name = "NotityOnoffInfos")
    protected ArrayOfOnOffHotelInfo notityOnoffInfos;

    /**
     * 获取notityOnoffInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOnOffHotelInfo }
     *     
     */
    public ArrayOfOnOffHotelInfo getNotityOnoffInfos() {
        return notityOnoffInfos;
    }

    /**
     * 设置notityOnoffInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOnOffHotelInfo }
     *     
     */
    public void setNotityOnoffInfos(ArrayOfOnOffHotelInfo value) {
        this.notityOnoffInfos = value;
    }

}
