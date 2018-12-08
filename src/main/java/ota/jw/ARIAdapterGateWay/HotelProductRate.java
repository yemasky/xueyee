
package ota.jw.ARIAdapterGateWay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>hotelProductRate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="hotelProductRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productRateInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProductRateInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelProductRate", propOrder = {
    "hotelCode",
    "productRateInfos"
})
public class HotelProductRate {

    protected String hotelCode;
    protected ArrayOfProductRateInfo productRateInfos;

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
     * 获取productRateInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductRateInfo }
     *     
     */
    public ArrayOfProductRateInfo getProductRateInfos() {
        return productRateInfos;
    }

    /**
     * 设置productRateInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductRateInfo }
     *     
     */
    public void setProductRateInfos(ArrayOfProductRateInfo value) {
        this.productRateInfos = value;
    }

}
