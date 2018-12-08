package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * <p>ResGuestType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ResGuestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/>
 *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCommentTypeComment" minOccurs="0"/>
 *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
 *         &lt;element name="ProfileRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfResGuestTypeProfileRPH" minOccurs="0"/>
 *         &lt;element name="ArrivalTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/>
 *         &lt;element name="DepartureTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/>
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/>
 *         &lt;element name="InHouseTimeSpan" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ResGuestRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="GroupEventCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VIP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PrimaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * ��ȡprofiles���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfProfilesTypeProfileInfo }
     */
    public ArrayOfProfilesTypeProfileInfo getProfiles() {
        return profiles;
    }

    /**
     * ����profiles���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfProfilesTypeProfileInfo }
     */
    public void setProfiles(ArrayOfProfilesTypeProfileInfo value) {
        this.profiles = value;
    }

    /**
     * ��ȡspecialRequests���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfSpecialRequestTypeSpecialRequest }
     */
    public ArrayOfSpecialRequestTypeSpecialRequest getSpecialRequests() {
        return specialRequests;
    }

    /**
     * ����specialRequests���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfSpecialRequestTypeSpecialRequest }
     */
    public void setSpecialRequests(ArrayOfSpecialRequestTypeSpecialRequest value) {
        this.specialRequests = value;
    }

    /**
     * ��ȡcomments���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfCommentTypeComment }
     */
    public ArrayOfCommentTypeComment getComments() {
        return comments;
    }

    /**
     * ����comments���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfCommentTypeComment }
     */
    public void setComments(ArrayOfCommentTypeComment value) {
        this.comments = value;
    }

    /**
     * ��ȡserviceRPHs���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfServiceRPHsTypeServiceRPH }
     */
    public ArrayOfServiceRPHsTypeServiceRPH getServiceRPHs() {
        return serviceRPHs;
    }

    /**
     * ����serviceRPHs���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfServiceRPHsTypeServiceRPH }
     */
    public void setServiceRPHs(ArrayOfServiceRPHsTypeServiceRPH value) {
        this.serviceRPHs = value;
    }

    /**
     * ��ȡprofileRPHs���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfResGuestTypeProfileRPH }
     */
    public ArrayOfResGuestTypeProfileRPH getProfileRPHs() {
        return profileRPHs;
    }

    /**
     * ����profileRPHs���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfResGuestTypeProfileRPH }
     */
    public void setProfileRPHs(ArrayOfResGuestTypeProfileRPH value) {
        this.profileRPHs = value;
    }

    /**
     * ��ȡarrivalTransport���Ե�ֵ��
     *
     * @return possible object is
     * {@link TransportInfoType }
     */
    public TransportInfoType getArrivalTransport() {
        return arrivalTransport;
    }

    /**
     * ����arrivalTransport���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TransportInfoType }
     */
    public void setArrivalTransport(TransportInfoType value) {
        this.arrivalTransport = value;
    }

    /**
     * ��ȡdepartureTransport���Ե�ֵ��
     *
     * @return possible object is
     * {@link TransportInfoType }
     */
    public TransportInfoType getDepartureTransport() {
        return departureTransport;
    }

    /**
     * ����departureTransport���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TransportInfoType }
     */
    public void setDepartureTransport(TransportInfoType value) {
        this.departureTransport = value;
    }

    /**
     * ��ȡguestCounts���Ե�ֵ��
     *
     * @return possible object is
     * {@link GuestCountType }
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * ����guestCounts���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link GuestCountType }
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * ��ȡinHouseTimeSpan���Ե�ֵ��
     *
     * @return possible object is
     * {@link DateTimeSpanType }
     */
    public DateTimeSpanType getInHouseTimeSpan() {
        return inHouseTimeSpan;
    }

    /**
     * ����inHouseTimeSpan���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DateTimeSpanType }
     */
    public void setInHouseTimeSpan(DateTimeSpanType value) {
        this.inHouseTimeSpan = value;
    }

    /**
     * ��ȡtpaExtensions���Ե�ֵ��
     *
     * @return possible object is
     * {@link TPAExtensionsType }
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * ����tpaExtensions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TPAExtensionsType }
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * ��ȡresGuestRPH���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getResGuestRPH() {
        return resGuestRPH;
    }

    /**
     * ����resGuestRPH���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResGuestRPH(String value) {
        this.resGuestRPH = value;
    }

    /**
     * ��ȡageQualifyingCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * ����ageQualifyingCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAgeQualifyingCode(String value) {
        this.ageQualifyingCode = value;
    }

    /**
     * ��ȡarrivalTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * ����arrivalTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * ��ȡdepartureTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * ����departureTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * ��ȡgroupEventCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGroupEventCode() {
        return groupEventCode;
    }

    /**
     * ����groupEventCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGroupEventCode(String value) {
        this.groupEventCode = value;
    }

    /**
     * ��ȡvip���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVIP() {
        return vip;
    }

    /**
     * ����vip���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setVIP(Boolean value) {
        this.vip = value;
    }

    /**
     * ��ȡprimaryIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * ����primaryIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPrimaryIndicator(Boolean value) {
        this.primaryIndicator = value;
    }

    /**
     * ��ȡage���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * ����age���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * ��ȡlocationCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * ����locationCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * ��ȡcodeContext���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * ����codeContext���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * ��ȡaction���Ե�ֵ��
     *
     * @return possible object is
     * {@link ActionType }
     */
    public ActionType getAction() {
        return action;
    }

    /**
     * ����action���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ActionType }
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

}
