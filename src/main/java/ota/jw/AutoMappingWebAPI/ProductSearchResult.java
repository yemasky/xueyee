
package ota.jw.AutoMappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>productSearchResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="productSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SearchProductInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subRoomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="resultMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productSearchResult", propOrder = {
    "subRoomId",
    "resultCode",
    "resultMsg"
})
public class ProductSearchResult
    extends SearchProductInfo
{

    protected String subRoomId;
    protected int resultCode;
    protected String resultMsg;

    /**
     * 获取subRoomId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRoomId() {
        return subRoomId;
    }

    /**
     * 设置subRoomId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRoomId(String value) {
        this.subRoomId = value;
    }

    /**
     * 获取resultCode属性的值。
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * 设置resultCode属性的值。
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * 获取resultMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * 设置resultMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMsg(String value) {
        this.resultMsg = value;
    }

}
