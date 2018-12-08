
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LocationGeneralType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LocationGeneralType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateProv" type="{http://www.opentravel.org/OTA/2003/05}StateProvType" minOccurs="0"/&gt;
 *         &lt;element name="CountryName" type="{http://www.opentravel.org/OTA/2003/05}CountryNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationGeneralType", propOrder = {
    "cityName",
    "stateProv",
    "countryName"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.CruisePackageType.Location.class
})
public class LocationGeneralType {

    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "StateProv")
    protected StateProvType stateProv;
    @XmlElement(name = "CountryName")
    protected CountryNameType countryName;

    /**
     * 获取cityName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置cityName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * 获取stateProv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StateProvType }
     *     
     */
    public StateProvType getStateProv() {
        return stateProv;
    }

    /**
     * 设置stateProv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvType }
     *     
     */
    public void setStateProv(StateProvType value) {
        this.stateProv = value;
    }

    /**
     * 获取countryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CountryNameType }
     *     
     */
    public CountryNameType getCountryName() {
        return countryName;
    }

    /**
     * 设置countryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryNameType }
     *     
     */
    public void setCountryName(CountryNameType value) {
        this.countryName = value;
    }

}
