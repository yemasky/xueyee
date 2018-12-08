
package ota.jw.AvailRes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResGlobalInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResGlobalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ResCommonDetailType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelReservationIDsTypeHotelReservationID" minOccurs="0"/&gt;
 *         &lt;element name="InterFaceSendID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsFlashLive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoutingHops" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoutingHopTypeRoutingHop" minOccurs="0"/&gt;
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/&gt;
 *         &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRule" minOccurs="0"/&gt;
 *         &lt;element name="DepositAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MemberType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MemberCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGlobalInfoType", propOrder = {
    "hotelReservationIDs",
    "interFaceSendID",
    "orderType",
    "isFlashLive",
    "orderStatus",
    "routingHops",
    "profiles",
    "bookingRules",
    "depositAmount",
    "memberType",
    "memberCard"
})
public class ResGlobalInfoType
    extends ResCommonDetailType
{

    @XmlElement(name = "HotelReservationIDs")
    protected ArrayOfHotelReservationIDsTypeHotelReservationID hotelReservationIDs;
    @XmlElement(name = "InterFaceSendID")
    protected String interFaceSendID;
    @XmlElement(name = "OrderType")
    protected String orderType;
    @XmlElement(name = "IsFlashLive")
    protected String isFlashLive;
    @XmlElement(name = "OrderStatus")
    protected String orderStatus;
    @XmlElement(name = "RoutingHops")
    protected ArrayOfRoutingHopTypeRoutingHop routingHops;
    @XmlElement(name = "Profiles")
    protected ArrayOfProfilesTypeProfileInfo profiles;
    @XmlElement(name = "BookingRules")
    protected ArrayOfBookingRulesTypeBookingRule bookingRules;
    @XmlElement(name = "DepositAmount")
    protected BigDecimal depositAmount;
    @XmlElement(name = "MemberType")
    protected Integer memberType;
    @XmlElement(name = "MemberCard")
    protected String memberCard;

    /**
     * 获取hotelReservationIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelReservationIDsTypeHotelReservationID }
     *     
     */
    public ArrayOfHotelReservationIDsTypeHotelReservationID getHotelReservationIDs() {
        return hotelReservationIDs;
    }

    /**
     * 设置hotelReservationIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelReservationIDsTypeHotelReservationID }
     *     
     */
    public void setHotelReservationIDs(ArrayOfHotelReservationIDsTypeHotelReservationID value) {
        this.hotelReservationIDs = value;
    }

    /**
     * 获取interFaceSendID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterFaceSendID() {
        return interFaceSendID;
    }

    /**
     * 设置interFaceSendID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterFaceSendID(String value) {
        this.interFaceSendID = value;
    }

    /**
     * 获取orderType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 设置orderType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * 获取isFlashLive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFlashLive() {
        return isFlashLive;
    }

    /**
     * 设置isFlashLive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFlashLive(String value) {
        this.isFlashLive = value;
    }

    /**
     * 获取orderStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置orderStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * 获取routingHops属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoutingHopTypeRoutingHop }
     *     
     */
    public ArrayOfRoutingHopTypeRoutingHop getRoutingHops() {
        return routingHops;
    }

    /**
     * 设置routingHops属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoutingHopTypeRoutingHop }
     *     
     */
    public void setRoutingHops(ArrayOfRoutingHopTypeRoutingHop value) {
        this.routingHops = value;
    }

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
     * 获取bookingRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBookingRulesTypeBookingRule }
     *     
     */
    public ArrayOfBookingRulesTypeBookingRule getBookingRules() {
        return bookingRules;
    }

    /**
     * 设置bookingRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBookingRulesTypeBookingRule }
     *     
     */
    public void setBookingRules(ArrayOfBookingRulesTypeBookingRule value) {
        this.bookingRules = value;
    }

    /**
     * 获取depositAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    /**
     * 设置depositAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositAmount(BigDecimal value) {
        this.depositAmount = value;
    }

    /**
     * 获取memberType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemberType() {
        return memberType;
    }

    /**
     * 设置memberType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemberType(Integer value) {
        this.memberType = value;
    }

    /**
     * 获取memberCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberCard() {
        return memberCard;
    }

    /**
     * 设置memberCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberCard(String value) {
        this.memberCard = value;
    }

}
