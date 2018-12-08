
package ota.jw.AutoMappingWebAPI;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfProductSearchResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productSearchResult" type="{http://www.opentravel.org/OTA/2003/05}productSearchResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductSearchResult", propOrder = {
    "productSearchResult"
})
public class ArrayOfProductSearchResult {

    @XmlElement(nillable = true)
    protected List<ProductSearchResult> productSearchResult;

    /**
     * Gets the value of the productSearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSearchResult }
     * 
     * 
     */
    public List<ProductSearchResult> getProductSearchResult() {
        if (productSearchResult == null) {
            productSearchResult = new ArrayList<ProductSearchResult>();
        }
        return this.productSearchResult;
    }

}
