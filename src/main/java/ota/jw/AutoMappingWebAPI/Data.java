
package ota.jw.AutoMappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>data complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="data"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="masterHotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subHotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hotelStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="reMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productSearchResults" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProductSearchResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data", propOrder = {
    "hotelCode",
    "masterHotelId",
    "subHotelId",
    "hotelStatus",
    "reMark",
    "productSearchResults"
})
public class Data {

    protected String hotelCode;
    protected String masterHotelId;
    protected String subHotelId;
    protected int hotelStatus;
    protected String reMark;
    protected ArrayOfProductSearchResult productSearchResults;

    /**
     * 获取hotelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * 设置hotelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * 获取masterHotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterHotelId() {
        return masterHotelId;
    }

    /**
     * 设置masterHotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterHotelId(String value) {
        this.masterHotelId = value;
    }

    /**
     * 获取subHotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubHotelId() {
        return subHotelId;
    }

    /**
     * 设置subHotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubHotelId(String value) {
        this.subHotelId = value;
    }

    /**
     * 获取hotelStatus属性的值。
     * 
     */
    public int getHotelStatus() {
        return hotelStatus;
    }

    /**
     * 设置hotelStatus属性的值。
     * 
     */
    public void setHotelStatus(int value) {
        this.hotelStatus = value;
    }

    /**
     * 获取reMark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReMark() {
        return reMark;
    }

    /**
     * 设置reMark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReMark(String value) {
        this.reMark = value;
    }

    /**
     * 获取productSearchResults属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductSearchResult }
     *     
     */
    public ArrayOfProductSearchResult getProductSearchResults() {
        return productSearchResults;
    }

    /**
     * 设置productSearchResults属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductSearchResult }
     *     
     */
    public void setProductSearchResults(ArrayOfProductSearchResult value) {
        this.productSearchResults = value;
    }

}
