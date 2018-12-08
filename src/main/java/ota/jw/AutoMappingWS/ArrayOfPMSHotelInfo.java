
package ota.jw.AutoMappingWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfPMS_Hotel_Info complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPMS_Hotel_Info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PMS_Hotel_Info" type="{http://www.opentravel.org/OTA/2003/05}PMS_Hotel_Info" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPMS_Hotel_Info", propOrder = {
    "pmsHotelInfo"
})
public class ArrayOfPMSHotelInfo {

    @XmlElement(name = "PMS_Hotel_Info", nillable = true)
    protected List<PMSHotelInfo> pmsHotelInfo;

    /**
     * Gets the value of the pmsHotelInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmsHotelInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPMSHotelInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PMSHotelInfo }
     * 
     * 
     */
    public List<PMSHotelInfo> getPMSHotelInfo() {
        if (pmsHotelInfo == null) {
            pmsHotelInfo = new ArrayList<PMSHotelInfo>();
        }
        return this.pmsHotelInfo;
    }

}
