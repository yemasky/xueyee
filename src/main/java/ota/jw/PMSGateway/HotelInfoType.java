
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>HotelInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelName" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="HotelShortName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClosedSeasons" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDateTimeSpanType" minOccurs="0"/&gt;
 *         &lt;element name="BlackoutDates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeBlackoutDate" minOccurs="0"/&gt;
 *         &lt;element name="RelativePositions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRelativePositionType" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCodes" type="{http://www.opentravel.org/OTA/2003/05}CategoryCodesType" minOccurs="0"/&gt;
 *         &lt;element name="Descriptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Renovation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="AreaText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RenovationCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MultimediaDescriptions" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType"&gt;
 *                           &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HotelInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeHotelInfoCode" minOccurs="0"/&gt;
 *         &lt;element name="Position" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PositionAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeService" minOccurs="0"/&gt;
 *         &lt;element name="WeatherInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfWeatherInfoType" minOccurs="0"/&gt;
 *         &lt;element name="OwnershipManagementInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeOwnershipManagementInfo" minOccurs="0"/&gt;
 *         &lt;element name="Languages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeLanguage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="WhenBuilt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="AreaWeather" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InterfaceCompliance" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PMSSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HotelStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HotelStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DaylightSavingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ISO9000CertifiedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfoType", propOrder = {
    "hotelName",
    "closedSeasons",
    "blackoutDates",
    "relativePositions",
    "categoryCodes",
    "descriptions",
    "hotelInfoCodes",
    "position",
    "services",
    "weatherInfos",
    "ownershipManagementInfos",
    "languages"
})
public class HotelInfoType {

    @XmlElement(name = "HotelName")
    protected HotelInfoType.HotelName hotelName;
    @XmlElement(name = "ClosedSeasons")
    protected ArrayOfDateTimeSpanType closedSeasons;
    @XmlElement(name = "BlackoutDates")
    protected ArrayOfHotelInfoTypeBlackoutDate blackoutDates;
    @XmlElement(name = "RelativePositions")
    protected ArrayOfRelativePositionType relativePositions;
    @XmlElement(name = "CategoryCodes")
    protected CategoryCodesType categoryCodes;
    @XmlElement(name = "Descriptions")
    protected HotelInfoType.Descriptions descriptions;
    @XmlElement(name = "HotelInfoCodes")
    protected ArrayOfHotelInfoTypeHotelInfoCode hotelInfoCodes;
    @XmlElement(name = "Position")
    protected HotelInfoType.Position position;
    @XmlElement(name = "Services")
    protected ArrayOfHotelInfoTypeService services;
    @XmlElement(name = "WeatherInfos")
    protected ArrayOfWeatherInfoType weatherInfos;
    @XmlElement(name = "OwnershipManagementInfos")
    protected ArrayOfHotelInfoTypeOwnershipManagementInfo ownershipManagementInfos;
    @XmlElement(name = "Languages")
    protected ArrayOfHotelInfoTypeLanguage languages;
    @XmlAttribute(name = "WhenBuilt")
    protected String whenBuilt;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;
    @XmlAttribute(name = "AreaWeather")
    protected String areaWeather;
    @XmlAttribute(name = "InterfaceCompliance")
    protected String interfaceCompliance;
    @XmlAttribute(name = "PMSSystem")
    protected String pmsSystem;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "HotelStatus")
    protected String hotelStatus;
    @XmlAttribute(name = "HotelStatusCode")
    protected String hotelStatusCode;
    @XmlAttribute(name = "TaxID")
    protected String taxID;
    @XmlAttribute(name = "DaylightSavingIndicator")
    protected Boolean daylightSavingIndicator;
    @XmlAttribute(name = "ISO9000CertifiedInd")
    protected Boolean iso9000CertifiedInd;

    /**
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.HotelName }
     *     
     */
    public HotelInfoType.HotelName getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.HotelName }
     *     
     */
    public void setHotelName(HotelInfoType.HotelName value) {
        this.hotelName = value;
    }

    /**
     * 获取closedSeasons属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDateTimeSpanType }
     *     
     */
    public ArrayOfDateTimeSpanType getClosedSeasons() {
        return closedSeasons;
    }

    /**
     * 设置closedSeasons属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDateTimeSpanType }
     *     
     */
    public void setClosedSeasons(ArrayOfDateTimeSpanType value) {
        this.closedSeasons = value;
    }

    /**
     * 获取blackoutDates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoTypeBlackoutDate }
     *     
     */
    public ArrayOfHotelInfoTypeBlackoutDate getBlackoutDates() {
        return blackoutDates;
    }

    /**
     * 设置blackoutDates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoTypeBlackoutDate }
     *     
     */
    public void setBlackoutDates(ArrayOfHotelInfoTypeBlackoutDate value) {
        this.blackoutDates = value;
    }

    /**
     * 获取relativePositions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRelativePositionType }
     *     
     */
    public ArrayOfRelativePositionType getRelativePositions() {
        return relativePositions;
    }

    /**
     * 设置relativePositions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRelativePositionType }
     *     
     */
    public void setRelativePositions(ArrayOfRelativePositionType value) {
        this.relativePositions = value;
    }

    /**
     * 获取categoryCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CategoryCodesType }
     *     
     */
    public CategoryCodesType getCategoryCodes() {
        return categoryCodes;
    }

    /**
     * 设置categoryCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryCodesType }
     *     
     */
    public void setCategoryCodes(CategoryCodesType value) {
        this.categoryCodes = value;
    }

    /**
     * 获取descriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.Descriptions }
     *     
     */
    public HotelInfoType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * 设置descriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.Descriptions }
     *     
     */
    public void setDescriptions(HotelInfoType.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * 获取hotelInfoCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoTypeHotelInfoCode }
     *     
     */
    public ArrayOfHotelInfoTypeHotelInfoCode getHotelInfoCodes() {
        return hotelInfoCodes;
    }

    /**
     * 设置hotelInfoCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoTypeHotelInfoCode }
     *     
     */
    public void setHotelInfoCodes(ArrayOfHotelInfoTypeHotelInfoCode value) {
        this.hotelInfoCodes = value;
    }

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.Position }
     *     
     */
    public HotelInfoType.Position getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.Position }
     *     
     */
    public void setPosition(HotelInfoType.Position value) {
        this.position = value;
    }

    /**
     * 获取services属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoTypeService }
     *     
     */
    public ArrayOfHotelInfoTypeService getServices() {
        return services;
    }

    /**
     * 设置services属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoTypeService }
     *     
     */
    public void setServices(ArrayOfHotelInfoTypeService value) {
        this.services = value;
    }

    /**
     * 获取weatherInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWeatherInfoType }
     *     
     */
    public ArrayOfWeatherInfoType getWeatherInfos() {
        return weatherInfos;
    }

    /**
     * 设置weatherInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWeatherInfoType }
     *     
     */
    public void setWeatherInfos(ArrayOfWeatherInfoType value) {
        this.weatherInfos = value;
    }

    /**
     * 获取ownershipManagementInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoTypeOwnershipManagementInfo }
     *     
     */
    public ArrayOfHotelInfoTypeOwnershipManagementInfo getOwnershipManagementInfos() {
        return ownershipManagementInfos;
    }

    /**
     * 设置ownershipManagementInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoTypeOwnershipManagementInfo }
     *     
     */
    public void setOwnershipManagementInfos(ArrayOfHotelInfoTypeOwnershipManagementInfo value) {
        this.ownershipManagementInfos = value;
    }

    /**
     * 获取languages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoTypeLanguage }
     *     
     */
    public ArrayOfHotelInfoTypeLanguage getLanguages() {
        return languages;
    }

    /**
     * 设置languages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoTypeLanguage }
     *     
     */
    public void setLanguages(ArrayOfHotelInfoTypeLanguage value) {
        this.languages = value;
    }

    /**
     * 获取whenBuilt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenBuilt() {
        return whenBuilt;
    }

    /**
     * 设置whenBuilt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenBuilt(String value) {
        this.whenBuilt = value;
    }

    /**
     * 获取lastUpdated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置lastUpdated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

    /**
     * 获取areaWeather属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaWeather() {
        return areaWeather;
    }

    /**
     * 设置areaWeather属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaWeather(String value) {
        this.areaWeather = value;
    }

    /**
     * 获取interfaceCompliance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceCompliance() {
        return interfaceCompliance;
    }

    /**
     * 设置interfaceCompliance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceCompliance(String value) {
        this.interfaceCompliance = value;
    }

    /**
     * 获取pmsSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMSSystem() {
        return pmsSystem;
    }

    /**
     * 设置pmsSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMSSystem(String value) {
        this.pmsSystem = value;
    }

    /**
     * 获取start属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置start属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * 获取end属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * 设置end属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * 获取hotelStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelStatus() {
        return hotelStatus;
    }

    /**
     * 设置hotelStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelStatus(String value) {
        this.hotelStatus = value;
    }

    /**
     * 获取hotelStatusCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelStatusCode() {
        return hotelStatusCode;
    }

    /**
     * 设置hotelStatusCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelStatusCode(String value) {
        this.hotelStatusCode = value;
    }

    /**
     * 获取taxID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * 设置taxID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxID(String value) {
        this.taxID = value;
    }

    /**
     * 获取daylightSavingIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaylightSavingIndicator() {
        return daylightSavingIndicator;
    }

    /**
     * 设置daylightSavingIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaylightSavingIndicator(Boolean value) {
        this.daylightSavingIndicator = value;
    }

    /**
     * 获取iso9000CertifiedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISO9000CertifiedInd() {
        return iso9000CertifiedInd;
    }

    /**
     * 设置iso9000CertifiedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISO9000CertifiedInd(Boolean value) {
        this.iso9000CertifiedInd = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Renovation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="AreaText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RenovationCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MultimediaDescriptions" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType"&gt;
     *                 &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "renovation",
        "multimediaDescriptions",
        "descriptiveText"
    })
    public static class Descriptions {

        @XmlElement(name = "Renovation")
        protected List<HotelInfoType.Descriptions.Renovation> renovation;
        @XmlElement(name = "MultimediaDescriptions")
        protected HotelInfoType.Descriptions.MultimediaDescriptions multimediaDescriptions;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;

        /**
         * Gets the value of the renovation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the renovation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRenovation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelInfoType.Descriptions.Renovation }
         * 
         * 
         */
        public List<HotelInfoType.Descriptions.Renovation> getRenovation() {
            if (renovation == null) {
                renovation = new ArrayList<HotelInfoType.Descriptions.Renovation>();
            }
            return this.renovation;
        }

        /**
         * 获取multimediaDescriptions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HotelInfoType.Descriptions.MultimediaDescriptions }
         *     
         */
        public HotelInfoType.Descriptions.MultimediaDescriptions getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * 设置multimediaDescriptions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HotelInfoType.Descriptions.MultimediaDescriptions }
         *     
         */
        public void setMultimediaDescriptions(HotelInfoType.Descriptions.MultimediaDescriptions value) {
            this.multimediaDescriptions = value;
        }

        /**
         * 获取descriptiveText属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * 设置descriptiveText属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType"&gt;
         *       &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MultimediaDescriptions
            extends MultimediaDescriptionsType
        {

            @XmlAttribute(name = "InfoCode")
            protected String infoCode;
            @XmlAttribute(name = "AdditionalDetailCode")
            protected String additionalDetailCode;

            /**
             * 获取infoCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfoCode() {
                return infoCode;
            }

            /**
             * 设置infoCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfoCode(String value) {
                this.infoCode = value;
            }

            /**
             * 获取additionalDetailCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalDetailCode() {
                return additionalDetailCode;
            }

            /**
             * 设置additionalDetailCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalDetailCode(String value) {
                this.additionalDetailCode = value;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="AreaText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RenovationCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "multimediaDescriptions",
            "descriptiveText"
        })
        public static class Renovation {

            @XmlElement(name = "MultimediaDescriptions")
            protected MultimediaDescriptionsType multimediaDescriptions;
            @XmlElement(name = "DescriptiveText")
            protected String descriptiveText;
            @XmlAttribute(name = "ImmediatePlans")
            protected Boolean immediatePlans;
            @XmlAttribute(name = "PercentOfRenovationCompleted")
            protected BigDecimal percentOfRenovationCompleted;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "AreaText")
            protected String areaText;
            @XmlAttribute(name = "RenovationCompletionDate")
            protected String renovationCompletionDate;

            /**
             * 获取multimediaDescriptions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public MultimediaDescriptionsType getMultimediaDescriptions() {
                return multimediaDescriptions;
            }

            /**
             * 设置multimediaDescriptions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
                this.multimediaDescriptions = value;
            }

            /**
             * 获取descriptiveText属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * 设置descriptiveText属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * 获取immediatePlans属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isImmediatePlans() {
                return immediatePlans;
            }

            /**
             * 设置immediatePlans属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setImmediatePlans(Boolean value) {
                this.immediatePlans = value;
            }

            /**
             * 获取percentOfRenovationCompleted属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercentOfRenovationCompleted() {
                return percentOfRenovationCompleted;
            }

            /**
             * 设置percentOfRenovationCompleted属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercentOfRenovationCompleted(BigDecimal value) {
                this.percentOfRenovationCompleted = value;
            }

            /**
             * 获取start属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * 设置start属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * 获取duration属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * 设置duration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * 获取end属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * 设置end属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
            }

            /**
             * 获取areaText属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAreaText() {
                return areaText;
            }

            /**
             * 设置areaText属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAreaText(String value) {
                this.areaText = value;
            }

            /**
             * 获取renovationCompletionDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRenovationCompletionDate() {
                return renovationCompletionDate;
            }

            /**
             * 设置renovationCompletionDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRenovationCompletionDate(String value) {
                this.renovationCompletionDate = value;
            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="HotelShortName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class HotelName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "HotelShortName")
        protected String hotelShortName;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取hotelShortName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelShortName() {
            return hotelShortName;
        }

        /**
         * 设置hotelShortName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelShortName(String value) {
            this.hotelShortName = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PositionAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Position {

        @XmlAttribute(name = "Latitude")
        protected String latitude;
        @XmlAttribute(name = "Longitude")
        protected String longitude;
        @XmlAttribute(name = "Altitude")
        protected String altitude;
        @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
        protected String altitudeUnitOfMeasureCode;
        @XmlAttribute(name = "PositionAccuracy")
        protected String positionAccuracy;

        /**
         * 获取latitude属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * 设置latitude属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * 获取longitude属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * 设置longitude属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * 获取altitude属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * 设置altitude属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * 获取altitudeUnitOfMeasureCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * 设置altitudeUnitOfMeasureCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
        }

        /**
         * 获取positionAccuracy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionAccuracy() {
            return positionAccuracy;
        }

        /**
         * 设置positionAccuracy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPositionAccuracy(String value) {
            this.positionAccuracy = value;
        }

    }

}
