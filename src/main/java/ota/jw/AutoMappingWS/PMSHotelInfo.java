
package ota.jw.AutoMappingWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PMS_Hotel_Info complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PMS_Hotel_Info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsNewHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PmsHotelProductInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPMS_Product_Info" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMS_Hotel_Info", propOrder = {
    "hotelCode",
    "isNewHotel",
    "hotelName",
    "hotelGroupCode",
    "telephone",
    "address",
    "email",
    "provinceCode",
    "hotelCityName",
    "pmsHotelProductInfos"
})
public class PMSHotelInfo {

    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "IsNewHotel")
    protected String isNewHotel;
    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "HotelGroupCode")
    protected String hotelGroupCode;
    @XmlElement(name = "Telephone")
    protected String telephone;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "ProvinceCode")
    protected String provinceCode;
    @XmlElement(name = "HotelCityName")
    protected String hotelCityName;
    @XmlElement(name = "PmsHotelProductInfos")
    protected ArrayOfPMSProductInfo pmsHotelProductInfos;

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
     * 获取isNewHotel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNewHotel() {
        return isNewHotel;
    }

    /**
     * 设置isNewHotel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNewHotel(String value) {
        this.isNewHotel = value;
    }

    /**
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * 获取hotelGroupCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelGroupCode() {
        return hotelGroupCode;
    }

    /**
     * 设置hotelGroupCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelGroupCode(String value) {
        this.hotelGroupCode = value;
    }

    /**
     * 获取telephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置telephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取provinceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 设置provinceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceCode(String value) {
        this.provinceCode = value;
    }

    /**
     * 获取hotelCityName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCityName() {
        return hotelCityName;
    }

    /**
     * 设置hotelCityName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCityName(String value) {
        this.hotelCityName = value;
    }

    /**
     * 获取pmsHotelProductInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPMSProductInfo }
     *     
     */
    public ArrayOfPMSProductInfo getPmsHotelProductInfos() {
        return pmsHotelProductInfos;
    }

    /**
     * 设置pmsHotelProductInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPMSProductInfo }
     *     
     */
    public void setPmsHotelProductInfos(ArrayOfPMSProductInfo value) {
        this.pmsHotelProductInfos = value;
    }

}
