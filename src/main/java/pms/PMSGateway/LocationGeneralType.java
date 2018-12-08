package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>LocationGeneralType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="LocationGeneralType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateProv" type="{http://www.opentravel.org/OTA/2003/05}StateProvType" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.opentravel.org/OTA/2003/05}CountryNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationGeneralType", propOrder = {
        "cityName",
        "stateProv",
        "countryName"
})
@XmlSeeAlso({
        pms.PMSGateway.CruisePackageType.Location.class
})
public class LocationGeneralType {

    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "StateProv")
    protected StateProvType stateProv;
    @XmlElement(name = "CountryName")
    protected CountryNameType countryName;

    /**
     * ��ȡcityName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * ����cityName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * ��ȡstateProv���Ե�ֵ��
     *
     * @return possible object is
     * {@link StateProvType }
     */
    public StateProvType getStateProv() {
        return stateProv;
    }

    /**
     * ����stateProv���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link StateProvType }
     */
    public void setStateProv(StateProvType value) {
        this.stateProv = value;
    }

    /**
     * ��ȡcountryName���Ե�ֵ��
     *
     * @return possible object is
     * {@link CountryNameType }
     */
    public CountryNameType getCountryName() {
        return countryName;
    }

    /**
     * ����countryName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CountryNameType }
     */
    public void setCountryName(CountryNameType value) {
        this.countryName = value;
    }

}
