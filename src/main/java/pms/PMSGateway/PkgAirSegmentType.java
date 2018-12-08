package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>PkgAirSegmentType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="PkgAirSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FlightSegmentBaseType">
 *       &lt;sequence>
 *         &lt;element name="SupplementCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType" minOccurs="0"/>
 *         &lt;element name="AvailableSeats" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSeatAvailabilityType" minOccurs="0"/>
 *         &lt;element name="Passengers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="PassengerRPH">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Charter"/>
 *             &lt;enumeration value="Scheduled"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DepartureDay" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *       &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgAirSegmentType", propOrder = {
        "supplementCharges",
        "availableSeats",
        "passengers"
})
public class PkgAirSegmentType
        extends FlightSegmentBaseType {

    @XmlElement(name = "SupplementCharges")
    protected ArrayOfFeeType supplementCharges;
    @XmlElement(name = "AvailableSeats")
    protected ArrayOfSeatAvailabilityType availableSeats;
    @XmlElement(name = "Passengers")
    protected PkgAirSegmentType.Passengers passengers;
    @XmlAttribute(name = "CheckInDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInDate;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "DepartureDay")
    protected DayOfWeekType departureDay;
    @XmlAttribute(name = "TravelCode")
    protected String travelCode;
    @XmlAttribute(name = "Duration")
    protected Duration duration;

    /**
     * ��ȡsupplementCharges���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfFeeType }
     */
    public ArrayOfFeeType getSupplementCharges() {
        return supplementCharges;
    }

    /**
     * ����supplementCharges���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfFeeType }
     */
    public void setSupplementCharges(ArrayOfFeeType value) {
        this.supplementCharges = value;
    }

    /**
     * ��ȡavailableSeats���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfSeatAvailabilityType }
     */
    public ArrayOfSeatAvailabilityType getAvailableSeats() {
        return availableSeats;
    }

    /**
     * ����availableSeats���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfSeatAvailabilityType }
     */
    public void setAvailableSeats(ArrayOfSeatAvailabilityType value) {
        this.availableSeats = value;
    }

    /**
     * ��ȡpassengers���Ե�ֵ��
     *
     * @return possible object is
     * {@link PkgAirSegmentType.Passengers }
     */
    public PkgAirSegmentType.Passengers getPassengers() {
        return passengers;
    }

    /**
     * ����passengers���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PkgAirSegmentType.Passengers }
     */
    public void setPassengers(PkgAirSegmentType.Passengers value) {
        this.passengers = value;
    }

    /**
     * ��ȡcheckInDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCheckInDate() {
        return checkInDate;
    }

    /**
     * ����checkInDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCheckInDate(XMLGregorianCalendar value) {
        this.checkInDate = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * ��ȡdepartureDay���Ե�ֵ��
     *
     * @return possible object is
     * {@link DayOfWeekType }
     */
    public DayOfWeekType getDepartureDay() {
        return departureDay;
    }

    /**
     * ����departureDay���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DayOfWeekType }
     */
    public void setDepartureDay(DayOfWeekType value) {
        this.departureDay = value;
    }

    /**
     * ��ȡtravelCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTravelCode() {
        return travelCode;
    }

    /**
     * ����travelCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTravelCode(String value) {
        this.travelCode = value;
    }

    /**
     * ��ȡduration���Ե�ֵ��
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * ����duration���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setDuration(Duration value) {
        this.duration = value;
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
     *       &lt;attribute name="PassengerRPH">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Passengers {

        @XmlAttribute(name = "PassengerRPH")
        protected List<String> passengerRPH;

        /**
         * Gets the value of the passengerRPH property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerRPH property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerRPH().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getPassengerRPH() {
            if (passengerRPH == null) {
                passengerRPH = new ArrayList<String>();
            }
            return this.passengerRPH;
        }

    }

}
