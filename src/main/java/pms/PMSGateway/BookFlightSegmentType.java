package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>BookFlightSegmentType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="BookFlightSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FlightSegmentType">
 *       &lt;sequence>
 *         &lt;element name="MarriageGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingClassAvails" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BookingClassAvail" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ResBookDesigQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ResBookDesigStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="CabinType" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StopLocation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="E_TicketEligibility">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Eligible"/>
 *             &lt;enumeration value="Not Eligible"/>
 *             &lt;enumeration value="Required"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DepartureDay" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *       &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ConnectionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParticipationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="DateChangeNbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ValidConnectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookFlightSegmentType", propOrder = {
        "marriageGrp",
        "bookingClassAvails",
        "comment",
        "stopLocation"
})
public class BookFlightSegmentType
        extends FlightSegmentType {

    @XmlElement(name = "MarriageGrp")
    protected String marriageGrp;
    @XmlElement(name = "BookingClassAvails")
    protected List<BookFlightSegmentType.BookingClassAvails> bookingClassAvails;
    @XmlElement(name = "Comment")
    protected List<FreeTextType> comment;
    @XmlElement(name = "StopLocation")
    protected List<BookFlightSegmentType.StopLocation> stopLocation;
    @XmlAttribute(name = "ResBookDesigCode")
    protected String resBookDesigCode;
    @XmlAttribute(name = "NumberInParty")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberInParty;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "E_TicketEligibility")
    protected String eTicketEligibility;
    @XmlAttribute(name = "MealCode")
    protected String mealCode;
    @XmlAttribute(name = "DepartureDay")
    protected DayOfWeekType departureDay;
    @XmlAttribute(name = "StopoverInd")
    protected Boolean stopoverInd;
    @XmlAttribute(name = "LineNumber")
    protected BigInteger lineNumber;
    @XmlAttribute(name = "ConnectionType")
    protected String connectionType;
    @XmlAttribute(name = "ParticipationLevelCode")
    protected String participationLevelCode;
    @XmlAttribute(name = "Distance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distance;
    @XmlAttribute(name = "DateChangeNbr")
    protected String dateChangeNbr;
    @XmlAttribute(name = "ValidConnectionInd")
    protected Boolean validConnectionInd;

    /**
     * ��ȡmarriageGrp���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMarriageGrp() {
        return marriageGrp;
    }

    /**
     * ����marriageGrp���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMarriageGrp(String value) {
        this.marriageGrp = value;
    }

    /**
     * Gets the value of the bookingClassAvails property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassAvails property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassAvails().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link BookFlightSegmentType.BookingClassAvails }
     */
    public List<BookFlightSegmentType.BookingClassAvails> getBookingClassAvails() {
        if (bookingClassAvails == null) {
            bookingClassAvails = new ArrayList<BookFlightSegmentType.BookingClassAvails>();
        }
        return this.bookingClassAvails;
    }

    /**
     * Gets the value of the comment property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     */
    public List<FreeTextType> getComment() {
        if (comment == null) {
            comment = new ArrayList<FreeTextType>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the stopLocation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopLocation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopLocation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link BookFlightSegmentType.StopLocation }
     */
    public List<BookFlightSegmentType.StopLocation> getStopLocation() {
        if (stopLocation == null) {
            stopLocation = new ArrayList<BookFlightSegmentType.StopLocation>();
        }
        return this.stopLocation;
    }

    /**
     * ��ȡresBookDesigCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     * ����resBookDesigCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResBookDesigCode(String value) {
        this.resBookDesigCode = value;
    }

    /**
     * ��ȡnumberInParty���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getNumberInParty() {
        return numberInParty;
    }

    /**
     * ����numberInParty���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setNumberInParty(BigInteger value) {
        this.numberInParty = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * ��ȡeTicketEligibility���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getETicketEligibility() {
        return eTicketEligibility;
    }

    /**
     * ����eTicketEligibility���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setETicketEligibility(String value) {
        this.eTicketEligibility = value;
    }

    /**
     * ��ȡmealCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMealCode() {
        return mealCode;
    }

    /**
     * ����mealCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMealCode(String value) {
        this.mealCode = value;
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
     * ��ȡstopoverInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isStopoverInd() {
        return stopoverInd;
    }

    /**
     * ����stopoverInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setStopoverInd(Boolean value) {
        this.stopoverInd = value;
    }

    /**
     * ��ȡlineNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * ����lineNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * ��ȡconnectionType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * ����connectionType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConnectionType(String value) {
        this.connectionType = value;
    }

    /**
     * ��ȡparticipationLevelCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getParticipationLevelCode() {
        return participationLevelCode;
    }

    /**
     * ����participationLevelCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setParticipationLevelCode(String value) {
        this.participationLevelCode = value;
    }

    /**
     * ��ȡdistance���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * ����distance���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
    }

    /**
     * ��ȡdateChangeNbr���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateChangeNbr() {
        return dateChangeNbr;
    }

    /**
     * ����dateChangeNbr���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateChangeNbr(String value) {
        this.dateChangeNbr = value;
    }

    /**
     * ��ȡvalidConnectionInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isValidConnectionInd() {
        return validConnectionInd;
    }

    /**
     * ����validConnectionInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setValidConnectionInd(Boolean value) {
        this.validConnectionInd = value;
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
     *         &lt;element name="BookingClassAvail" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ResBookDesigQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ResBookDesigStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="CabinType" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "bookingClassAvail"
    })
    public static class BookingClassAvails {

        @XmlElement(name = "BookingClassAvail")
        protected List<BookFlightSegmentType.BookingClassAvails.BookingClassAvail> bookingClassAvail;
        @XmlAttribute(name = "CabinType")
        protected CabinType cabinType;

        /**
         * Gets the value of the bookingClassAvail property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingClassAvail property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingClassAvail().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link BookFlightSegmentType.BookingClassAvails.BookingClassAvail }
         */
        public List<BookFlightSegmentType.BookingClassAvails.BookingClassAvail> getBookingClassAvail() {
            if (bookingClassAvail == null) {
                bookingClassAvail = new ArrayList<BookFlightSegmentType.BookingClassAvails.BookingClassAvail>();
            }
            return this.bookingClassAvail;
        }

        /**
         * ��ȡcabinType���Ե�ֵ��
         *
         * @return possible object is
         * {@link CabinType }
         */
        public CabinType getCabinType() {
            return cabinType;
        }

        /**
         * ����cabinType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CabinType }
         */
        public void setCabinType(CabinType value) {
            this.cabinType = value;
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
         *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResBookDesigQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResBookDesigStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BookingClassAvail {

            @XmlAttribute(name = "ResBookDesigCode")
            protected String resBookDesigCode;
            @XmlAttribute(name = "ResBookDesigQuantity")
            protected String resBookDesigQuantity;
            @XmlAttribute(name = "ResBookDesigStatusCode")
            protected String resBookDesigStatusCode;
            @XmlAttribute(name = "RPH")
            protected String rph;

            /**
             * ��ȡresBookDesigCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getResBookDesigCode() {
                return resBookDesigCode;
            }

            /**
             * ����resBookDesigCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setResBookDesigCode(String value) {
                this.resBookDesigCode = value;
            }

            /**
             * ��ȡresBookDesigQuantity���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getResBookDesigQuantity() {
                return resBookDesigQuantity;
            }

            /**
             * ����resBookDesigQuantity���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setResBookDesigQuantity(String value) {
                this.resBookDesigQuantity = value;
            }

            /**
             * ��ȡresBookDesigStatusCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getResBookDesigStatusCode() {
                return resBookDesigStatusCode;
            }

            /**
             * ����resBookDesigStatusCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setResBookDesigStatusCode(String value) {
                this.resBookDesigStatusCode = value;
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StopLocation {

        @XmlAttribute(name = "LocationCode")
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

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

    }

}
