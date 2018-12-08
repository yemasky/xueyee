
package ota.jw.AutoMappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetHotelInfoRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetHotelInfoRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="retCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hotelInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSubHotelInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHotelInfoRS", propOrder = {
    "retCode",
    "errorMsg",
    "totalPage",
    "totalNum",
    "hotelInfos"
})
public class GetHotelInfoRS {

    protected int retCode;
    protected String errorMsg;
    protected int totalPage;
    protected int totalNum;
    protected ArrayOfSubHotelInfo hotelInfos;

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
     * 获取totalPage属性的值。
     * 
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * 设置totalPage属性的值。
     * 
     */
    public void setTotalPage(int value) {
        this.totalPage = value;
    }

    /**
     * 获取totalNum属性的值。
     * 
     */
    public int getTotalNum() {
        return totalNum;
    }

    /**
     * 设置totalNum属性的值。
     * 
     */
    public void setTotalNum(int value) {
        this.totalNum = value;
    }

    /**
     * 获取hotelInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubHotelInfo }
     *     
     */
    public ArrayOfSubHotelInfo getHotelInfos() {
        return hotelInfos;
    }

    /**
     * 设置hotelInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubHotelInfo }
     *     
     */
    public void setHotelInfos(ArrayOfSubHotelInfo value) {
        this.hotelInfos = value;
    }

}
