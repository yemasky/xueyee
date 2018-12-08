
package ota.jw.PMSGateway;

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
 *         &lt;element name="RoutingHops" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoutingHopTypeRoutingHop" minOccurs="0"/&gt;
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/&gt;
 *         &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRule" minOccurs="0"/&gt;
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
    "routingHops",
    "profiles",
    "bookingRules"
})
public class ResGlobalInfoType
    extends ResCommonDetailType
{

    @XmlElement(name = "HotelReservationIDs")
    protected ArrayOfHotelReservationIDsTypeHotelReservationID hotelReservationIDs;
    @XmlElement(name = "RoutingHops")
    protected ArrayOfRoutingHopTypeRoutingHop routingHops;
    @XmlElement(name = "Profiles")
    protected ArrayOfProfilesTypeProfileInfo profiles;
    @XmlElement(name = "BookingRules")
    protected ArrayOfBookingRulesTypeBookingRule bookingRules;

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

}
