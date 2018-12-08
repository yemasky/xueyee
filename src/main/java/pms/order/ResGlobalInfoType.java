package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResGlobalInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ResGlobalInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ResCommonDetailType">
 *       &lt;sequence>
 *         &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelReservationIDsTypeHotelReservationID" minOccurs="0"/>
 *         &lt;element name="RoutingHops" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoutingHopTypeRoutingHop" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/>
 *         &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGlobalInfoType", propOrder = {
        "hotelReservationIDs",
        "routingHops",
        "profiles",
        "bookingRules"
})
public class ResGlobalInfoType
        extends ResCommonDetailType {

    @XmlElement(name = "HotelReservationIDs")
    protected ArrayOfHotelReservationIDsTypeHotelReservationID hotelReservationIDs;
    @XmlElement(name = "RoutingHops")
    protected ArrayOfRoutingHopTypeRoutingHop routingHops;
    @XmlElement(name = "Profiles")
    protected ArrayOfProfilesTypeProfileInfo profiles;
    @XmlElement(name = "BookingRules")
    protected ArrayOfBookingRulesTypeBookingRule bookingRules;

    /**
     * ��ȡhotelReservationIDs���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelReservationIDsTypeHotelReservationID }
     */
    public ArrayOfHotelReservationIDsTypeHotelReservationID getHotelReservationIDs() {
        return hotelReservationIDs;
    }

    /**
     * ����hotelReservationIDs���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelReservationIDsTypeHotelReservationID }
     */
    public void setHotelReservationIDs(ArrayOfHotelReservationIDsTypeHotelReservationID value) {
        this.hotelReservationIDs = value;
    }

    /**
     * ��ȡroutingHops���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRoutingHopTypeRoutingHop }
     */
    public ArrayOfRoutingHopTypeRoutingHop getRoutingHops() {
        return routingHops;
    }

    /**
     * ����routingHops���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRoutingHopTypeRoutingHop }
     */
    public void setRoutingHops(ArrayOfRoutingHopTypeRoutingHop value) {
        this.routingHops = value;
    }

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
     * ��ȡbookingRules���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfBookingRulesTypeBookingRule }
     */
    public ArrayOfBookingRulesTypeBookingRule getBookingRules() {
        return bookingRules;
    }

    /**
     * ����bookingRules���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfBookingRulesTypeBookingRule }
     */
    public void setBookingRules(ArrayOfBookingRulesTypeBookingRule value) {
        this.bookingRules = value;
    }

}
