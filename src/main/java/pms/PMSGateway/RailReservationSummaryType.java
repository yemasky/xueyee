package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RailReservationSummaryType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RailReservationSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ODInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *                   &lt;element name="DestinationLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *                   &lt;element name="TrainSegment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DepartureStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *                             &lt;element name="ArrivalStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *                             &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="TrainIdentification" type="{http://www.opentravel.org/OTA/2003/05}TrainIdentificationType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerInfo" type="{http://www.opentravel.org/OTA/2003/05}RailPassengerCategoryDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateBooked" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}TransactionStatusType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailReservationSummaryType", propOrder = {
        "odInfo",
        "passengerInfo",
        "tpaExtensions"
})
public class RailReservationSummaryType {

    @XmlElement(name = "ODInfo")
    protected List<RailReservationSummaryType.ODInfo> odInfo;
    @XmlElement(name = "PassengerInfo")
    protected List<RailPassengerCategoryDetailType> passengerInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "BookingReferenceID")
    protected String bookingReferenceID;
    @XmlAttribute(name = "DateBooked")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBooked;
    @XmlAttribute(name = "Status")
    protected TransactionStatusType status;

    /**
     * Gets the value of the odInfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the odInfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getODInfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RailReservationSummaryType.ODInfo }
     */
    public List<RailReservationSummaryType.ODInfo> getODInfo() {
        if (odInfo == null) {
            odInfo = new ArrayList<RailReservationSummaryType.ODInfo>();
        }
        return this.odInfo;
    }

    /**
     * Gets the value of the passengerInfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPassengerCategoryDetailType }
     */
    public List<RailPassengerCategoryDetailType> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<RailPassengerCategoryDetailType>();
        }
        return this.passengerInfo;
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
     * ��ȡbookingReferenceID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBookingReferenceID() {
        return bookingReferenceID;
    }

    /**
     * ����bookingReferenceID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBookingReferenceID(String value) {
        this.bookingReferenceID = value;
    }

    /**
     * ��ȡdateBooked���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDateBooked() {
        return dateBooked;
    }

    /**
     * ����dateBooked���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDateBooked(XMLGregorianCalendar value) {
        this.dateBooked = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link TransactionStatusType }
     */
    public TransactionStatusType getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TransactionStatusType }
     */
    public void setStatus(TransactionStatusType value) {
        this.status = value;
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
     *         &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
     *         &lt;element name="DestinationLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
     *         &lt;element name="TrainSegment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DepartureStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
     *                   &lt;element name="ArrivalStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
     *                   &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="TrainIdentification" type="{http://www.opentravel.org/OTA/2003/05}TrainIdentificationType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "originLocation",
            "destinationLocation",
            "trainSegment"
    })
    public static class ODInfo {

        @XmlElement(name = "OriginLocation")
        protected LocationType originLocation;
        @XmlElement(name = "DestinationLocation")
        protected LocationType destinationLocation;
        @XmlElement(name = "TrainSegment")
        protected List<RailReservationSummaryType.ODInfo.TrainSegment> trainSegment;

        /**
         * ��ȡoriginLocation���Ե�ֵ��
         *
         * @return possible object is
         * {@link LocationType }
         */
        public LocationType getOriginLocation() {
            return originLocation;
        }

        /**
         * ����originLocation���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link LocationType }
         */
        public void setOriginLocation(LocationType value) {
            this.originLocation = value;
        }

        /**
         * ��ȡdestinationLocation���Ե�ֵ��
         *
         * @return possible object is
         * {@link LocationType }
         */
        public LocationType getDestinationLocation() {
            return destinationLocation;
        }

        /**
         * ����destinationLocation���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link LocationType }
         */
        public void setDestinationLocation(LocationType value) {
            this.destinationLocation = value;
        }

        /**
         * Gets the value of the trainSegment property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trainSegment property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrainSegment().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link RailReservationSummaryType.ODInfo.TrainSegment }
         */
        public List<RailReservationSummaryType.ODInfo.TrainSegment> getTrainSegment() {
            if (trainSegment == null) {
                trainSegment = new ArrayList<RailReservationSummaryType.ODInfo.TrainSegment>();
            }
            return this.trainSegment;
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
         *         &lt;element name="DepartureStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
         *         &lt;element name="ArrivalStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
         *         &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="TrainIdentification" type="{http://www.opentravel.org/OTA/2003/05}TrainIdentificationType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "departureStation",
                "arrivalStation",
                "departureDateTime",
                "arrivalDateTime",
                "trainIdentification"
        })
        public static class TrainSegment {

            @XmlElement(name = "DepartureStation")
            protected LocationType departureStation;
            @XmlElement(name = "ArrivalStation")
            protected LocationType arrivalStation;
            @XmlElement(name = "DepartureDateTime", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar departureDateTime;
            @XmlElement(name = "ArrivalDateTime", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar arrivalDateTime;
            @XmlElement(name = "TrainIdentification")
            protected TrainIdentificationType trainIdentification;

            /**
             * ��ȡdepartureStation���Ե�ֵ��
             *
             * @return possible object is
             * {@link LocationType }
             */
            public LocationType getDepartureStation() {
                return departureStation;
            }

            /**
             * ����departureStation���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link LocationType }
             */
            public void setDepartureStation(LocationType value) {
                this.departureStation = value;
            }

            /**
             * ��ȡarrivalStation���Ե�ֵ��
             *
             * @return possible object is
             * {@link LocationType }
             */
            public LocationType getArrivalStation() {
                return arrivalStation;
            }

            /**
             * ����arrivalStation���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link LocationType }
             */
            public void setArrivalStation(LocationType value) {
                this.arrivalStation = value;
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
             * ��ȡtrainIdentification���Ե�ֵ��
             *
             * @return possible object is
             * {@link TrainIdentificationType }
             */
            public TrainIdentificationType getTrainIdentification() {
                return trainIdentification;
            }

            /**
             * ����trainIdentification���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link TrainIdentificationType }
             */
            public void setTrainIdentification(TrainIdentificationType value) {
                this.trainIdentification = value;
            }

        }

    }

}
