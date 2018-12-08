
package ota.jw.PMSGateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ResGuestType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResGuestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/&gt;
 *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCommentTypeComment" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/&gt;
 *         &lt;element name="ProfileRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfResGuestTypeProfileRPH" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/&gt;
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/&gt;
 *         &lt;element name="InHouseTimeSpan" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResGuestRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="GroupEventCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VIP" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PrimaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGuestType", propOrder = {
    "profiles",
    "specialRequests",
    "comments",
    "serviceRPHs",
    "profileRPHs",
    "arrivalTransport",
    "departureTransport",
    "guestCounts",
    "inHouseTimeSpan",
    "tpaExtensions"
})
public class ResGuestType {

    @XmlElement(name = "Profiles")
    protected ArrayOfProfilesTypeProfileInfo profiles;
    @XmlElement(name = "SpecialRequests")
    protected ArrayOfSpecialRequestTypeSpecialRequest specialRequests;
    @XmlElement(name = "Comments")
    protected ArrayOfCommentTypeComment comments;
    @XmlElement(name = "ServiceRPHs")
    protected ArrayOfServiceRPHsTypeServiceRPH serviceRPHs;
    @XmlElement(name = "ProfileRPHs")
    protected ArrayOfResGuestTypeProfileRPH profileRPHs;
    @XmlElement(name = "ArrivalTransport")
    protected TransportInfoType arrivalTransport;
    @XmlElement(name = "DepartureTransport")
    protected TransportInfoType departureTransport;
    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "InHouseTimeSpan")
    protected DateTimeSpanType inHouseTimeSpan;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ResGuestRPH")
    protected String resGuestRPH;
    @XmlAttribute(name = "AgeQualifyingCode")
    protected String ageQualifyingCode;
    @XmlAttribute(name = "ArrivalTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar arrivalTime;
    @XmlAttribute(name = "DepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlAttribute(name = "GroupEventCode")
    protected String groupEventCode;
    @XmlAttribute(name = "VIP")
    protected Boolean vip;
    @XmlAttribute(name = "PrimaryIndicator")
    protected Boolean primaryIndicator;
    @XmlAttribute(name = "Age")
    protected BigInteger age;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "Action")
    protected ActionType action;

    /**
     * 获取profiles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfilesTypeProfileInfo }
     *     
     */
    public ArrayOfProfilesTypeProfileInfo getProfiles() {
        return profiles;
    }

    /**
     * 设置profiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfilesTypeProfileInfo }
     *     
     */
    public void setProfiles(ArrayOfProfilesTypeProfileInfo value) {
        this.profiles = value;
    }

    /**
     * 获取specialRequests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialRequestTypeSpecialRequest }
     *     
     */
    public ArrayOfSpecialRequestTypeSpecialRequest getSpecialRequests() {
        return specialRequests;
    }

    /**
     * 设置specialRequests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialRequestTypeSpecialRequest }
     *     
     */
    public void setSpecialRequests(ArrayOfSpecialRequestTypeSpecialRequest value) {
        this.specialRequests = value;
    }

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommentTypeComment }
     *     
     */
    public ArrayOfCommentTypeComment getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommentTypeComment }
     *     
     */
    public void setComments(ArrayOfCommentTypeComment value) {
        this.comments = value;
    }

    /**
     * 获取serviceRPHs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceRPHsTypeServiceRPH }
     *     
     */
    public ArrayOfServiceRPHsTypeServiceRPH getServiceRPHs() {
        return serviceRPHs;
    }

    /**
     * 设置serviceRPHs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceRPHsTypeServiceRPH }
     *     
     */
    public void setServiceRPHs(ArrayOfServiceRPHsTypeServiceRPH value) {
        this.serviceRPHs = value;
    }

    /**
     * 获取profileRPHs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResGuestTypeProfileRPH }
     *     
     */
    public ArrayOfResGuestTypeProfileRPH getProfileRPHs() {
        return profileRPHs;
    }

    /**
     * 设置profileRPHs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResGuestTypeProfileRPH }
     *     
     */
    public void setProfileRPHs(ArrayOfResGuestTypeProfileRPH value) {
        this.profileRPHs = value;
    }

    /**
     * 获取arrivalTransport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransportInfoType }
     *     
     */
    public TransportInfoType getArrivalTransport() {
        return arrivalTransport;
    }

    /**
     * 设置arrivalTransport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransportInfoType }
     *     
     */
    public void setArrivalTransport(TransportInfoType value) {
        this.arrivalTransport = value;
    }

    /**
     * 获取departureTransport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransportInfoType }
     *     
     */
    public TransportInfoType getDepartureTransport() {
        return departureTransport;
    }

    /**
     * 设置departureTransport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransportInfoType }
     *     
     */
    public void setDepartureTransport(TransportInfoType value) {
        this.departureTransport = value;
    }

    /**
     * 获取guestCounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * 设置guestCounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * 获取inHouseTimeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getInHouseTimeSpan() {
        return inHouseTimeSpan;
    }

    /**
     * 设置inHouseTimeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setInHouseTimeSpan(DateTimeSpanType value) {
        this.inHouseTimeSpan = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * 获取resGuestRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResGuestRPH() {
        return resGuestRPH;
    }

    /**
     * 设置resGuestRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResGuestRPH(String value) {
        this.resGuestRPH = value;
    }

    /**
     * 获取ageQualifyingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * 设置ageQualifyingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeQualifyingCode(String value) {
        this.ageQualifyingCode = value;
    }

    /**
     * 获取arrivalTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 设置arrivalTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * 获取departureTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * 设置departureTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * 获取groupEventCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupEventCode() {
        return groupEventCode;
    }

    /**
     * 设置groupEventCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupEventCode(String value) {
        this.groupEventCode = value;
    }

    /**
     * 获取vip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVIP() {
        return vip;
    }

    /**
     * 设置vip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVIP(Boolean value) {
        this.vip = value;
    }

    /**
     * 获取primaryIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * 设置primaryIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryIndicator(Boolean value) {
        this.primaryIndicator = value;
    }

    /**
     * 获取age属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * 设置age属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * 获取locationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * 设置locationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * 获取codeContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * 设置codeContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

}
