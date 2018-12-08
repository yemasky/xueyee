
package ota.jw.AutoMappingWS;

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
 *         &lt;element name="PMSBaseHotelInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPMS_Hotel_Info" minOccurs="0"/&gt;
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
    "pmsBaseHotelInfos"
})
@XmlRootElement(name = "PmsHotelInfoRQ")
public class PmsHotelInfoRQ {

    @XmlElement(name = "PMSBaseHotelInfos")
    protected ArrayOfPMSHotelInfo pmsBaseHotelInfos;

    /**
     * 获取pmsBaseHotelInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPMSHotelInfo }
     *     
     */
    public ArrayOfPMSHotelInfo getPMSBaseHotelInfos() {
        return pmsBaseHotelInfos;
    }

    /**
     * 设置pmsBaseHotelInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPMSHotelInfo }
     *     
     */
    public void setPMSBaseHotelInfos(ArrayOfPMSHotelInfo value) {
        this.pmsBaseHotelInfos = value;
    }

}
