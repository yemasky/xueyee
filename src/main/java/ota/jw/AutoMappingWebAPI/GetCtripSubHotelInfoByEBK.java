
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
 *         &lt;element name="CtripSubHotelInfoByEBKRQ" type="{http://www.opentravel.org/OTA/2003/05}CtripSubHotelInfoByEBKRQ" minOccurs="0"/&gt;
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
    "ctripSubHotelInfoByEBKRQ"
})
@XmlRootElement(name = "GetCtripSubHotelInfoByEBK")
public class GetCtripSubHotelInfoByEBK {

    @XmlElement(name = "CtripSubHotelInfoByEBKRQ")
    protected CtripSubHotelInfoByEBKRQ ctripSubHotelInfoByEBKRQ;

    /**
     * 获取ctripSubHotelInfoByEBKRQ属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CtripSubHotelInfoByEBKRQ }
     *     
     */
    public CtripSubHotelInfoByEBKRQ getCtripSubHotelInfoByEBKRQ() {
        return ctripSubHotelInfoByEBKRQ;
    }

    /**
     * 设置ctripSubHotelInfoByEBKRQ属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CtripSubHotelInfoByEBKRQ }
     *     
     */
    public void setCtripSubHotelInfoByEBKRQ(CtripSubHotelInfoByEBKRQ value) {
        this.ctripSubHotelInfoByEBKRQ = value;
    }

}
