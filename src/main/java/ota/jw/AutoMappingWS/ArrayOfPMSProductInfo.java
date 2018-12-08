
package ota.jw.AutoMappingWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfPMS_Product_Info complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPMS_Product_Info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PMS_Product_Info" type="{http://www.opentravel.org/OTA/2003/05}PMS_Product_Info" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPMS_Product_Info", propOrder = {
    "pmsProductInfo"
})
public class ArrayOfPMSProductInfo {

    @XmlElement(name = "PMS_Product_Info", nillable = true)
    protected List<PMSProductInfo> pmsProductInfo;

    /**
     * Gets the value of the pmsProductInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmsProductInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPMSProductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PMSProductInfo }
     * 
     * 
     */
    public List<PMSProductInfo> getPMSProductInfo() {
        if (pmsProductInfo == null) {
            pmsProductInfo = new ArrayList<PMSProductInfo>();
        }
        return this.pmsProductInfo;
    }

}
