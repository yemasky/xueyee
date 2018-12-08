
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AirInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepartureCity" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalCity" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="Airline" type="{http://www.opentravel.org/OTA/2003/05}OperatingAirlineType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AirlineCabinClass" type="{http://www.opentravel.org/OTA/2003/05}CabinType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirInfoType", propOrder = {
    "departureCity",
    "arrivalCity",
    "airline"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation.class
})
public class AirInfoType {

    @XmlElement(name = "DepartureCity")
    protected LocationType departureCity;
    @XmlElement(name = "ArrivalCity")
    protected LocationType arrivalCity;
    @XmlElement(name = "Airline")
    protected OperatingAirlineType airline;
    @XmlAttribute(name = "DepartureDateTime")
    protected String departureDateTime;
    @XmlAttribute(name = "ArrivalDateTime")
    protected String arrivalDateTime;
    @XmlAttribute(name = "AirlineCabinClass")
    protected CabinType airlineCabinClass;

    /**
     * 获取departureCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDepartureCity() {
        return departureCity;
    }

    /**
     * 设置departureCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDepartureCity(LocationType value) {
        this.departureCity = value;
    }

    /**
     * 获取arrivalCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalCity() {
        return arrivalCity;
    }

    /**
     * 设置arrivalCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalCity(LocationType value) {
        this.arrivalCity = value;
    }

    /**
     * 获取airline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperatingAirlineType }
     *     
     */
    public OperatingAirlineType getAirline() {
        return airline;
    }

    /**
     * 设置airline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingAirlineType }
     *     
     */
    public void setAirline(OperatingAirlineType value) {
        this.airline = value;
    }

    /**
     * 获取departureDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * 设置departureDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateTime(String value) {
        this.departureDateTime = value;
    }

    /**
     * 获取arrivalDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * 设置arrivalDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDateTime(String value) {
        this.arrivalDateTime = value;
    }

    /**
     * 获取airlineCabinClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getAirlineCabinClass() {
        return airlineCabinClass;
    }

    /**
     * 设置airlineCabinClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setAirlineCabinClass(CabinType value) {
        this.airlineCabinClass = value;
    }

}
