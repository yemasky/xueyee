
package ota.jw.AutoMappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MappingStatusSearchRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MappingStatusSearchRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subHotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="searchProductInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSearchProductInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingStatusSearchRQ", propOrder = {
    "hotelCode",
    "subHotelId",
    "searchProductInfos"
})
public class MappingStatusSearchRQ {

    protected String hotelCode;
    protected String subHotelId;
    protected ArrayOfSearchProductInfo searchProductInfos;

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
     * 获取searchProductInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchProductInfo }
     *     
     */
    public ArrayOfSearchProductInfo getSearchProductInfos() {
        return searchProductInfos;
    }

    /**
     * 设置searchProductInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchProductInfo }
     *     
     */
    public void setSearchProductInfos(ArrayOfSearchProductInfo value) {
        this.searchProductInfos = value;
    }

}
