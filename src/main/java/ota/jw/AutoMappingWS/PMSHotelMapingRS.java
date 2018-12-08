
package ota.jw.AutoMappingWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PMSHotelMapingRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PMSHotelMapingRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PMSHotelMappingResults" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPMSHotelMappingResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMSHotelMapingRS", propOrder = {
    "pmsHotelMappingResults"
})
public class PMSHotelMapingRS {

    @XmlElement(name = "PMSHotelMappingResults")
    protected ArrayOfPMSHotelMappingResult pmsHotelMappingResults;

    /**
     * 获取pmsHotelMappingResults属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPMSHotelMappingResult }
     *     
     */
    public ArrayOfPMSHotelMappingResult getPMSHotelMappingResults() {
        return pmsHotelMappingResults;
    }

    /**
     * 设置pmsHotelMappingResults属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPMSHotelMappingResult }
     *     
     */
    public void setPMSHotelMappingResults(ArrayOfPMSHotelMappingResult value) {
        this.pmsHotelMappingResults = value;
    }

}
