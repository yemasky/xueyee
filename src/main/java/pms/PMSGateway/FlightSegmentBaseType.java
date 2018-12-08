package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>FlightSegmentBaseType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="FlightSegmentBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureAirport" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArrivalAirport" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OperatingAirline" type="{http://www.opentravel.org/OTA/2003/05}OperatingAirlineType" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentBaseType", propOrder = {
        "departureAirport",
        "arrivalAirport",
        "operatingAirline",
        "equipment"
})
@XmlSeeAlso({
        FlightSegmentType.class,
        PkgAirSegmentType.class
})
public class FlightSegmentBaseType {

    @XmlElement(name = "DepartureAirport")
    protected FlightSegmentBaseType.DepartureAirport departureAirport;
    @XmlElement(name = "ArrivalAirport")
    protected FlightSegmentBaseType.ArrivalAirport arrivalAirport;
    @XmlElement(name = "OperatingAirline")
    protected OperatingAirlineType operatingAirline;
    @XmlElement(name = "Equipment")
    protected List<EquipmentType> equipment;
    @XmlAttribute(name = "DepartureDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlAttribute(name = "ArrivalDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlAttribute(name = "StopQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger stopQuantity;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "InfoSource")
    protected String infoSource;

    /**
     * ��ȡdepartureAirport���Ե�ֵ��
     *
     * @return possible object is
     * {@link FlightSegmentBaseType.DepartureAirport }
     */
    public FlightSegmentBaseType.DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    /**
     * ����departureAirport���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link FlightSegmentBaseType.DepartureAirport }
     */
    public void setDepartureAirport(FlightSegmentBaseType.DepartureAirport value) {
        this.departureAirport = value;
    }

    /**
     * ��ȡarrivalAirport���Ե�ֵ��
     *
     * @return possible object is
     * {@link FlightSegmentBaseType.ArrivalAirport }
     */
    public FlightSegmentBaseType.ArrivalAirport getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * ����arrivalAirport���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link FlightSegmentBaseType.ArrivalAirport }
     */
    public void setArrivalAirport(FlightSegmentBaseType.ArrivalAirport value) {
        this.arrivalAirport = value;
    }

    /**
     * ��ȡoperatingAirline���Ե�ֵ��
     *
     * @return possible object is
     * {@link OperatingAirlineType }
     */
    public OperatingAirlineType getOperatingAirline() {
        return operatingAirline;
    }

    /**
     * ����operatingAirline���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OperatingAirlineType }
     */
    public void setOperatingAirline(OperatingAirlineType value) {
        this.operatingAirline = value;
    }

    /**
     * Gets the value of the equipment property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentType }
     */
    public List<EquipmentType> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<EquipmentType>();
        }
        return this.equipment;
    }

    /**
     * ��ȡdepartureDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * ����departureDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDepartureDateTime(XMLGregorianCalendar value) {
        this.departureDateTime = value;
    }

    /**
     * ��ȡarrivalDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * ����arrivalDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

    /**
     * ��ȡstopQuantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getStopQuantity() {
        return stopQuantity;
    }

    /**
     * ����stopQuantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setStopQuantity(BigInteger value) {
        this.stopQuantity = value;
    }

    /**
     * ��ȡrph���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRPH() {
        return rph;
    }

    /**
     * ����rph���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * ��ȡinfoSource���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * ����infoSource���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInfoSource(String value) {
        this.infoSource = value;
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
     *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ArrivalAirport {

        @XmlAttribute(name = "LocationCode")
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Terminal")
        protected String terminal;
        @XmlAttribute(name = "Gate")
        protected String gate;

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
         * ��ȡterminal���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTerminal() {
            return terminal;
        }

        /**
         * ����terminal���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTerminal(String value) {
            this.terminal = value;
        }

        /**
         * ��ȡgate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getGate() {
            return gate;
        }

        /**
         * ����gate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGate(String value) {
            this.gate = value;
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
     *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DepartureAirport {

        @XmlAttribute(name = "LocationCode")
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Terminal")
        protected String terminal;
        @XmlAttribute(name = "Gate")
        protected String gate;

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
         * ��ȡterminal���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTerminal() {
            return terminal;
        }

        /**
         * ����terminal���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTerminal(String value) {
            this.terminal = value;
        }

        /**
         * ��ȡgate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getGate() {
            return gate;
        }

        /**
         * ����gate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGate(String value) {
            this.gate = value;
        }

    }

}
