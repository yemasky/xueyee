
package ota.jw.AutoMappingWebAPI;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSubHotelInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSubHotelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubHotelInfo" type="{http://www.opentravel.org/OTA/2003/05}SubHotelInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSubHotelInfo", propOrder = {
    "subHotelInfo"
})
public class ArrayOfSubHotelInfo {

    @XmlElement(name = "SubHotelInfo", nillable = true)
    protected List<SubHotelInfo> subHotelInfo;

    /**
     * Gets the value of the subHotelInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subHotelInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubHotelInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubHotelInfo }
     * 
     * 
     */
    public List<SubHotelInfo> getSubHotelInfo() {
        if (subHotelInfo == null) {
            subHotelInfo = new ArrayList<SubHotelInfo>();
        }
        return this.subHotelInfo;
    }

}
