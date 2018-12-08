
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PkgAirSegmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PkgAirSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FlightSegmentBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplementCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType1" minOccurs="0"/&gt;
 *         &lt;element name="AvailableSeats" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSeatAvailabilityType" minOccurs="0"/&gt;
 *         &lt;element name="Passengers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="PassengerRPH"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Charter"/&gt;
 *             &lt;enumeration value="Scheduled"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DepartureDay" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *       &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgAirSegmentType", propOrder = {
    "supplementCharges",
    "availableSeats",
    "passengers"
})
public class PkgAirSegmentType
    extends FlightSegmentBaseType
{

    @XmlElement(name = "SupplementCharges")
    protected ArrayOfFeeType1 supplementCharges;
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
     * 获取supplementCharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeeType1 }
     *     
     */
    public ArrayOfFeeType1 getSupplementCharges() {
        return supplementCharges;
    }

    /**
     * 设置supplementCharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeeType1 }
     *     
     */
    public void setSupplementCharges(ArrayOfFeeType1 value) {
        this.supplementCharges = value;
    }

    /**
     * 获取availableSeats属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSeatAvailabilityType }
     *     
     */
    public ArrayOfSeatAvailabilityType getAvailableSeats() {
        return availableSeats;
    }

    /**
     * 设置availableSeats属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSeatAvailabilityType }
     *     
     */
    public void setAvailableSeats(ArrayOfSeatAvailabilityType value) {
        this.availableSeats = value;
    }

    /**
     * 获取passengers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PkgAirSegmentType.Passengers }
     *     
     */
    public PkgAirSegmentType.Passengers getPassengers() {
        return passengers;
    }

    /**
     * 设置passengers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PkgAirSegmentType.Passengers }
     *     
     */
    public void setPassengers(PkgAirSegmentType.Passengers value) {
        this.passengers = value;
    }

    /**
     * 获取checkInDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInDate() {
        return checkInDate;
    }

    /**
     * 设置checkInDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInDate(XMLGregorianCalendar value) {
        this.checkInDate = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取departureDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDepartureDay() {
        return departureDay;
    }

    /**
     * 设置departureDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDepartureDay(DayOfWeekType value) {
        this.departureDay = value;
    }

    /**
     * 获取travelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelCode() {
        return travelCode;
    }

    /**
     * 设置travelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelCode(String value) {
        this.travelCode = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
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
     *       &lt;attribute name="PassengerRPH"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Passengers {

        @XmlAttribute(name = "PassengerRPH")
        protected List<String> passengerRPH;

        /**
         * Gets the value of the passengerRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPassengerRPH() {
            if (passengerRPH == null) {
                passengerRPH = new ArrayList<String>();
            }
            return this.passengerRPH;
        }

    }

}
