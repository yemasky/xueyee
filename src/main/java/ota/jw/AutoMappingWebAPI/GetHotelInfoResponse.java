
package ota.jw.AutoMappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetHotelInfoRS" type="{http://www.opentravel.org/OTA/2003/05}GetHotelInfoRS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getHotelInfoRS"
})
@XmlRootElement(name = "GetHotelInfoResponse")
public class GetHotelInfoResponse {

    @XmlElement(name = "GetHotelInfoRS")
    protected GetHotelInfoRS getHotelInfoRS;

    /**
     * 获取getHotelInfoRS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetHotelInfoRS }
     *     
     */
    public GetHotelInfoRS getGetHotelInfoRS() {
        return getHotelInfoRS;
    }

    /**
     * 设置getHotelInfoRS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelInfoRS }
     *     
     */
    public void setGetHotelInfoRS(GetHotelInfoRS value) {
        this.getHotelInfoRS = value;
    }

}
