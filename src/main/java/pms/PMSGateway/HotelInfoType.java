package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>HotelInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HotelInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="HotelShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClosedSeasons" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="BlackoutDates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeBlackoutDate" minOccurs="0"/>
 *         &lt;element name="RelativePositions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRelativePositionType" minOccurs="0"/>
 *         &lt;element name="CategoryCodes" type="{http://www.opentravel.org/OTA/2003/05}CategoryCodesType" minOccurs="0"/>
 *         &lt;element name="Descriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Renovation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AreaText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RenovationCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MultimediaDescriptions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
 *                           &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeHotelInfoCode" minOccurs="0"/>
 *         &lt;element name="Position" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PositionAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeService" minOccurs="0"/>
 *         &lt;element name="WeatherInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfWeatherInfoType" minOccurs="0"/>
 *         &lt;element name="OwnershipManagementInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeOwnershipManagementInfo" minOccurs="0"/>
 *         &lt;element name="Languages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelInfoTypeLanguage" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WhenBuilt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="AreaWeather" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InterfaceCompliance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PMSSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DaylightSavingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ISO9000CertifiedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * ��ȡhotelName���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelInfoType.HotelName }
     */
    public HotelInfoType.HotelName getHotelName() {
        return hotelName;
    }

    /**
     * ����hotelName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelInfoType.HotelName }
     */
    public void setHotelName(HotelInfoType.HotelName value) {
        this.hotelName = value;
    }

    /**
     * ��ȡclosedSeasons���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfDateTimeSpanType }
     */
    public ArrayOfDateTimeSpanType getClosedSeasons() {
        return closedSeasons;
    }

    /**
     * ����closedSeasons���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfDateTimeSpanType }
     */
    public void setClosedSeasons(ArrayOfDateTimeSpanType value) {
        this.closedSeasons = value;
    }

    /**
     * ��ȡblackoutDates���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelInfoTypeBlackoutDate }
     */
    public ArrayOfHotelInfoTypeBlackoutDate getBlackoutDates() {
        return blackoutDates;
    }

    /**
     * ����blackoutDates���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelInfoTypeBlackoutDate }
     */
    public void setBlackoutDates(ArrayOfHotelInfoTypeBlackoutDate value) {
        this.blackoutDates = value;
    }

    /**
     * ��ȡrelativePositions���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRelativePositionType }
     */
    public ArrayOfRelativePositionType getRelativePositions() {
        return relativePositions;
    }

    /**
     * ����relativePositions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRelativePositionType }
     */
    public void setRelativePositions(ArrayOfRelativePositionType value) {
        this.relativePositions = value;
    }

    /**
     * ��ȡcategoryCodes���Ե�ֵ��
     *
     * @return possible object is
     * {@link CategoryCodesType }
     */
    public CategoryCodesType getCategoryCodes() {
        return categoryCodes;
    }

    /**
     * ����categoryCodes���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CategoryCodesType }
     */
    public void setCategoryCodes(CategoryCodesType value) {
        this.categoryCodes = value;
    }

    /**
     * ��ȡdescriptions���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelInfoType.Descriptions }
     */
    public HotelInfoType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * ����descriptions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelInfoType.Descriptions }
     */
    public void setDescriptions(HotelInfoType.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * ��ȡhotelInfoCodes���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelInfoTypeHotelInfoCode }
     */
    public ArrayOfHotelInfoTypeHotelInfoCode getHotelInfoCodes() {
        return hotelInfoCodes;
    }

    /**
     * ����hotelInfoCodes���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelInfoTypeHotelInfoCode }
     */
    public void setHotelInfoCodes(ArrayOfHotelInfoTypeHotelInfoCode value) {
        this.hotelInfoCodes = value;
    }

    /**
     * ��ȡposition���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelInfoType.Position }
     */
    public HotelInfoType.Position getPosition() {
        return position;
    }

    /**
     * ����position���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelInfoType.Position }
     */
    public void setPosition(HotelInfoType.Position value) {
        this.position = value;
    }

    /**
     * ��ȡservices���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelInfoTypeService }
     */
    public ArrayOfHotelInfoTypeService getServices() {
        return services;
    }

    /**
     * ����services���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelInfoTypeService }
     */
    public void setServices(ArrayOfHotelInfoTypeService value) {
        this.services = value;
    }

    /**
     * ��ȡweatherInfos���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfWeatherInfoType }
     */
    public ArrayOfWeatherInfoType getWeatherInfos() {
        return weatherInfos;
    }

    /**
     * ����weatherInfos���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfWeatherInfoType }
     */
    public void setWeatherInfos(ArrayOfWeatherInfoType value) {
        this.weatherInfos = value;
    }

    /**
     * ��ȡownershipManagementInfos���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelInfoTypeOwnershipManagementInfo }
     */
    public ArrayOfHotelInfoTypeOwnershipManagementInfo getOwnershipManagementInfos() {
        return ownershipManagementInfos;
    }

    /**
     * ����ownershipManagementInfos���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelInfoTypeOwnershipManagementInfo }
     */
    public void setOwnershipManagementInfos(ArrayOfHotelInfoTypeOwnershipManagementInfo value) {
        this.ownershipManagementInfos = value;
    }

    /**
     * ��ȡlanguages���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelInfoTypeLanguage }
     */
    public ArrayOfHotelInfoTypeLanguage getLanguages() {
        return languages;
    }

    /**
     * ����languages���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelInfoTypeLanguage }
     */
    public void setLanguages(ArrayOfHotelInfoTypeLanguage value) {
        this.languages = value;
    }

    /**
     * ��ȡwhenBuilt���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getWhenBuilt() {
        return whenBuilt;
    }

    /**
     * ����whenBuilt���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWhenBuilt(String value) {
        this.whenBuilt = value;
    }

    /**
     * ��ȡlastUpdated���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * ����lastUpdated���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

    /**
     * ��ȡareaWeather���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAreaWeather() {
        return areaWeather;
    }

    /**
     * ����areaWeather���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAreaWeather(String value) {
        this.areaWeather = value;
    }

    /**
     * ��ȡinterfaceCompliance���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInterfaceCompliance() {
        return interfaceCompliance;
    }

    /**
     * ����interfaceCompliance���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInterfaceCompliance(String value) {
        this.interfaceCompliance = value;
    }

    /**
     * ��ȡpmsSystem���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPMSSystem() {
        return pmsSystem;
    }

    /**
     * ����pmsSystem���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPMSSystem(String value) {
        this.pmsSystem = value;
    }

    /**
     * ��ȡstart���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStart() {
        return start;
    }

    /**
     * ����start���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * ��ȡduration���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDuration() {
        return duration;
    }

    /**
     * ����duration���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * ��ȡend���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEnd() {
        return end;
    }

    /**
     * ����end���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * ��ȡhotelStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelStatus() {
        return hotelStatus;
    }

    /**
     * ����hotelStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelStatus(String value) {
        this.hotelStatus = value;
    }

    /**
     * ��ȡhotelStatusCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHotelStatusCode() {
        return hotelStatusCode;
    }

    /**
     * ����hotelStatusCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHotelStatusCode(String value) {
        this.hotelStatusCode = value;
    }

    /**
     * ��ȡtaxID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * ����taxID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTaxID(String value) {
        this.taxID = value;
    }

    /**
     * ��ȡdaylightSavingIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDaylightSavingIndicator() {
        return daylightSavingIndicator;
    }

    /**
     * ����daylightSavingIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDaylightSavingIndicator(Boolean value) {
        this.daylightSavingIndicator = value;
    }

    /**
     * ��ȡiso9000CertifiedInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isISO9000CertifiedInd() {
        return iso9000CertifiedInd;
    }

    /**
     * ����iso9000CertifiedInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setISO9000CertifiedInd(Boolean value) {
        this.iso9000CertifiedInd = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Renovation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AreaText" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RenovationCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MultimediaDescriptions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
     *                 &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the renovation property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRenovation().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelInfoType.Descriptions.Renovation }
         */
        public List<HotelInfoType.Descriptions.Renovation> getRenovation() {
            if (renovation == null) {
                renovation = new ArrayList<HotelInfoType.Descriptions.Renovation>();
            }
            return this.renovation;
        }

        /**
         * ��ȡmultimediaDescriptions���Ե�ֵ��
         *
         * @return possible object is
         * {@link HotelInfoType.Descriptions.MultimediaDescriptions }
         */
        public HotelInfoType.Descriptions.MultimediaDescriptions getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * ����multimediaDescriptions���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link HotelInfoType.Descriptions.MultimediaDescriptions }
         */
        public void setMultimediaDescriptions(HotelInfoType.Descriptions.MultimediaDescriptions value) {
            this.multimediaDescriptions = value;
        }

        /**
         * ��ȡdescriptiveText���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * ����descriptiveText���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
         *       &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MultimediaDescriptions
                extends MultimediaDescriptionsType {

            @XmlAttribute(name = "InfoCode")
            protected String infoCode;
            @XmlAttribute(name = "AdditionalDetailCode")
            protected String additionalDetailCode;

            /**
             * ��ȡinfoCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInfoCode() {
                return infoCode;
            }

            /**
             * ����infoCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInfoCode(String value) {
                this.infoCode = value;
            }

            /**
             * ��ȡadditionalDetailCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAdditionalDetailCode() {
                return additionalDetailCode;
            }

            /**
             * ����additionalDetailCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAdditionalDetailCode(String value) {
                this.additionalDetailCode = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ImmediatePlans" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="PercentOfRenovationCompleted" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AreaText" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RenovationCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡmultimediaDescriptions���Ե�ֵ��
             *
             * @return possible object is
             * {@link MultimediaDescriptionsType }
             */
            public MultimediaDescriptionsType getMultimediaDescriptions() {
                return multimediaDescriptions;
            }

            /**
             * ����multimediaDescriptions���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link MultimediaDescriptionsType }
             */
            public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
                this.multimediaDescriptions = value;
            }

            /**
             * ��ȡdescriptiveText���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * ����descriptiveText���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * ��ȡimmediatePlans���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isImmediatePlans() {
                return immediatePlans;
            }

            /**
             * ����immediatePlans���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setImmediatePlans(Boolean value) {
                this.immediatePlans = value;
            }

            /**
             * ��ȡpercentOfRenovationCompleted���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getPercentOfRenovationCompleted() {
                return percentOfRenovationCompleted;
            }

            /**
             * ����percentOfRenovationCompleted���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setPercentOfRenovationCompleted(BigDecimal value) {
                this.percentOfRenovationCompleted = value;
            }

            /**
             * ��ȡstart���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getStart() {
                return start;
            }

            /**
             * ����start���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * ��ȡduration���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getDuration() {
                return duration;
            }

            /**
             * ����duration���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * ��ȡend���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getEnd() {
                return end;
            }

            /**
             * ����end���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setEnd(String value) {
                this.end = value;
            }

            /**
             * ��ȡareaText���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAreaText() {
                return areaText;
            }

            /**
             * ����areaText���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAreaText(String value) {
                this.areaText = value;
            }

            /**
             * ��ȡrenovationCompletionDate���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getRenovationCompletionDate() {
                return renovationCompletionDate;
            }

            /**
             * ����renovationCompletionDate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRenovationCompletionDate(String value) {
                this.renovationCompletionDate = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="HotelShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * ��ȡhotelShortName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getHotelShortName() {
            return hotelShortName;
        }

        /**
         * ����hotelShortName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setHotelShortName(String value) {
            this.hotelShortName = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PositionAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡlatitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * ����latitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * ��ȡlongitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * ����longitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * ��ȡaltitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * ����altitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * ��ȡaltitudeUnitOfMeasureCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * ����altitudeUnitOfMeasureCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
        }

        /**
         * ��ȡpositionAccuracy���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPositionAccuracy() {
            return positionAccuracy;
        }

        /**
         * ����positionAccuracy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPositionAccuracy(String value) {
            this.positionAccuracy = value;
        }

    }

}
