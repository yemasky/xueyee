
package ota.jw.AutoMappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CtripSubHotelInfoRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CtripSubHotelInfoRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="retCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CtripSubHotelInfoRS", propOrder = {
    "retCode",
    "errorMsg",
    "hotelInfos"
})
public class CtripSubHotelInfoRS {

    protected int retCode;
    protected String errorMsg;
    @XmlElement(name = "HotelInfos")
    protected ArrayOfHotelInfo hotelInfos;

    /**
     * 获取retCode属性的值。
     * 
     */
    public int getRetCode() {
        return retCode;
    }

    /**
     * 设置retCode属性的值。
     * 
     */
    public void setRetCode(int value) {
        this.retCode = value;
    }

    /**
     * 获取errorMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置errorMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * 获取hotelInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfo }
     *     
     */
    public ArrayOfHotelInfo getHotelInfos() {
        return hotelInfos;
    }

    /**
     * 设置hotelInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfo }
     *     
     */
    public void setHotelInfos(ArrayOfHotelInfo value) {
        this.hotelInfos = value;
    }

}
