
package ota.jw.AutoMappingWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfPMSHotelMappingResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPMSHotelMappingResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PMSHotelMappingResult" type="{http://www.opentravel.org/OTA/2003/05}PMSHotelMappingResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPMSHotelMappingResult", propOrder = {
    "pmsHotelMappingResult"
})
public class ArrayOfPMSHotelMappingResult {

    @XmlElement(name = "PMSHotelMappingResult", nillable = true)
    protected List<PMSHotelMappingResult> pmsHotelMappingResult;

    /**
     * Gets the value of the pmsHotelMappingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmsHotelMappingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPMSHotelMappingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PMSHotelMappingResult }
     * 
     * 
     */
    public List<PMSHotelMappingResult> getPMSHotelMappingResult() {
        if (pmsHotelMappingResult == null) {
            pmsHotelMappingResult = new ArrayList<PMSHotelMappingResult>();
        }
        return this.pmsHotelMappingResult;
    }

}
