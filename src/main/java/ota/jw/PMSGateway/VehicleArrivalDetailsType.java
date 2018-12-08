
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>VehicleArrivalDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleArrivalDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="MarketingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
 *         &lt;element name="OperatingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TransportationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleArrivalDetailsType", propOrder = {
    "arrivalLocation",
    "marketingCompany",
    "operatingCompany"
})
public class VehicleArrivalDetailsType {

    @XmlElement(name = "ArrivalLocation")
    protected LocationType arrivalLocation;
    @XmlElement(name = "MarketingCompany")
    protected CompanyNameType marketingCompany;
    @XmlElement(name = "OperatingCompany")
    protected CompanyNameType operatingCompany;
    @XmlAttribute(name = "TransportationCode")
    protected String transportationCode;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "ArrivalDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;

    /**
     * 获取arrivalLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     * 设置arrivalLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalLocation(LocationType value) {
        this.arrivalLocation = value;
    }

    /**
     * 获取marketingCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getMarketingCompany() {
        return marketingCompany;
    }

    /**
     * 设置marketingCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setMarketingCompany(CompanyNameType value) {
        this.marketingCompany = value;
    }

    /**
     * 获取operatingCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * 设置operatingCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setOperatingCompany(CompanyNameType value) {
        this.operatingCompany = value;
    }

    /**
     * 获取transportationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationCode() {
        return transportationCode;
    }

    /**
     * 设置transportationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationCode(String value) {
        this.transportationCode = value;
    }

    /**
     * 获取number属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置number属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * 获取arrivalDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * 设置arrivalDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

}
