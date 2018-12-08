package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>AirInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="AirInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureCity" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="ArrivalCity" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="Airline" type="{http://www.opentravel.org/OTA/2003/05}OperatingAirlineType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AirlineCabinClass" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirInfoType", propOrder = {
        "departureCity",
        "arrivalCity",
        "airline"
})
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation.class
})
public class AirInfoType {

    @XmlElement(name = "DepartureCity")
    protected LocationType departureCity;
    @XmlElement(name = "ArrivalCity")
    protected LocationType arrivalCity;
    @XmlElement(name = "Airline")
    protected OperatingAirlineType airline;
    @XmlAttribute(name = "DepartureDateTime")
    protected String departureDateTime;
    @XmlAttribute(name = "ArrivalDateTime")
    protected String arrivalDateTime;
    @XmlAttribute(name = "AirlineCabinClass")
    protected CabinType airlineCabinClass;

    /**
     * ��ȡdepartureCity���Ե�ֵ��
     *
     * @return possible object is
     * {@link LocationType }
     */
    public LocationType getDepartureCity() {
        return departureCity;
    }

    /**
     * ����departureCity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link LocationType }
     */
    public void setDepartureCity(LocationType value) {
        this.departureCity = value;
    }

    /**
     * ��ȡarrivalCity���Ե�ֵ��
     *
     * @return possible object is
     * {@link LocationType }
     */
    public LocationType getArrivalCity() {
        return arrivalCity;
    }

    /**
     * ����arrivalCity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link LocationType }
     */
    public void setArrivalCity(LocationType value) {
        this.arrivalCity = value;
    }

    /**
     * ��ȡairline���Ե�ֵ��
     *
     * @return possible object is
     * {@link OperatingAirlineType }
     */
    public OperatingAirlineType getAirline() {
        return airline;
    }

    /**
     * ����airline���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OperatingAirlineType }
     */
    public void setAirline(OperatingAirlineType value) {
        this.airline = value;
    }

    /**
     * ��ȡdepartureDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * ����departureDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepartureDateTime(String value) {
        this.departureDateTime = value;
    }

    /**
     * ��ȡarrivalDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * ����arrivalDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArrivalDateTime(String value) {
        this.arrivalDateTime = value;
    }

    /**
     * ��ȡairlineCabinClass���Ե�ֵ��
     *
     * @return possible object is
     * {@link CabinType }
     */
    public CabinType getAirlineCabinClass() {
        return airlineCabinClass;
    }

    /**
     * ����airlineCabinClass���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CabinType }
     */
    public void setAirlineCabinClass(CabinType value) {
        this.airlineCabinClass = value;
    }

}
