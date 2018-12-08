
package ota.jw.ARIAdapterGateWay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>hotelProductAvail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="hotelProductAvail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productAvailInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProductAvailInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelProductAvail", propOrder = {
    "hotelCode",
    "productAvailInfos"
})
public class HotelProductAvail {

    protected String hotelCode;
    protected ArrayOfProductAvailInfo productAvailInfos;

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
     * 获取productAvailInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductAvailInfo }
     *     
     */
    public ArrayOfProductAvailInfo getProductAvailInfos() {
        return productAvailInfos;
    }

    /**
     * 设置productAvailInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductAvailInfo }
     *     
     */
    public void setProductAvailInfos(ArrayOfProductAvailInfo value) {
        this.productAvailInfos = value;
    }

}
