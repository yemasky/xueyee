
package ota.jw.PMSGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BookFlightSegmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BookFlightSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FlightSegmentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MarriageGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookingClassAvails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BookingClassAvail" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ResBookDesigQuantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ResBookDesigStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="CabinType" type="{http://www.opentravel.org/OTA/2003/05}CabinType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StopLocation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="E_TicketEligibility"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Eligible"/&gt;
 *             &lt;enumeration value="Not Eligible"/&gt;
 *             &lt;enumeration value="Required"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepartureDay" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *       &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ConnectionType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ParticipationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="DateChangeNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ValidConnectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookFlightSegmentType", propOrder = {
    "marriageGrp",
    "bookingClassAvails",
    "comment",
    "stopLocation"
})
public class BookFlightSegmentType
    extends FlightSegmentType
{

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
     * 获取marriageGrp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageGrp() {
        return marriageGrp;
    }

    /**
     * 设置marriageGrp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageGrp(String value) {
        this.marriageGrp = value;
    }

    /**
     * Gets the value of the bookingClassAvails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassAvails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassAvails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookFlightSegmentType.BookingClassAvails }
     * 
     * 
     */
    public List<BookFlightSegmentType.BookingClassAvails> getBookingClassAvails() {
        if (bookingClassAvails == null) {
            bookingClassAvails = new ArrayList<BookFlightSegmentType.BookingClassAvails>();
        }
        return this.bookingClassAvails;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getComment() {
        if (comment == null) {
            comment = new ArrayList<FreeTextType>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the stopLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookFlightSegmentType.StopLocation }
     * 
     * 
     */
    public List<BookFlightSegmentType.StopLocation> getStopLocation() {
        if (stopLocation == null) {
            stopLocation = new ArrayList<BookFlightSegmentType.StopLocation>();
        }
        return this.stopLocation;
    }

    /**
     * 获取resBookDesigCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     * 设置resBookDesigCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigCode(String value) {
        this.resBookDesigCode = value;
    }

    /**
     * 获取numberInParty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberInParty() {
        return numberInParty;
    }

    /**
     * 设置numberInParty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberInParty(BigInteger value) {
        this.numberInParty = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取eTicketEligibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketEligibility() {
        return eTicketEligibility;
    }

    /**
     * 设置eTicketEligibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketEligibility(String value) {
        this.eTicketEligibility = value;
    }

    /**
     * 获取mealCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealCode() {
        return mealCode;
    }

    /**
     * 设置mealCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealCode(String value) {
        this.mealCode = value;
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
     * 获取stopoverInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopoverInd() {
        return stopoverInd;
    }

    /**
     * 设置stopoverInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopoverInd(Boolean value) {
        this.stopoverInd = value;
    }

    /**
     * 获取lineNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * 设置lineNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * 获取connectionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * 设置connectionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionType(String value) {
        this.connectionType = value;
    }

    /**
     * 获取participationLevelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipationLevelCode() {
        return participationLevelCode;
    }

    /**
     * 设置participationLevelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipationLevelCode(String value) {
        this.participationLevelCode = value;
    }

    /**
     * 获取distance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * 设置distance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
    }

    /**
     * 获取dateChangeNbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateChangeNbr() {
        return dateChangeNbr;
    }

    /**
     * 设置dateChangeNbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateChangeNbr(String value) {
        this.dateChangeNbr = value;
    }

    /**
     * 获取validConnectionInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidConnectionInd() {
        return validConnectionInd;
    }

    /**
     * 设置validConnectionInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidConnectionInd(Boolean value) {
        this.validConnectionInd = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="BookingClassAvail" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ResBookDesigQuantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ResBookDesigStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="CabinType" type="{http://www.opentravel.org/OTA/2003/05}CabinType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingClassAvail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingClassAvail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookFlightSegmentType.BookingClassAvails.BookingClassAvail }
         * 
         * 
         */
        public List<BookFlightSegmentType.BookingClassAvails.BookingClassAvail> getBookingClassAvail() {
            if (bookingClassAvail == null) {
                bookingClassAvail = new ArrayList<BookFlightSegmentType.BookingClassAvails.BookingClassAvail>();
            }
            return this.bookingClassAvail;
        }

        /**
         * 获取cabinType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CabinType }
         *     
         */
        public CabinType getCabinType() {
            return cabinType;
        }

        /**
         * 设置cabinType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CabinType }
         *     
         */
        public void setCabinType(CabinType value) {
            this.cabinType = value;
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
         *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ResBookDesigQuantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ResBookDesigStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * 获取resBookDesigCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResBookDesigCode() {
                return resBookDesigCode;
            }

            /**
             * 设置resBookDesigCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResBookDesigCode(String value) {
                this.resBookDesigCode = value;
            }

            /**
             * 获取resBookDesigQuantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResBookDesigQuantity() {
                return resBookDesigQuantity;
            }

            /**
             * 设置resBookDesigQuantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResBookDesigQuantity(String value) {
                this.resBookDesigQuantity = value;
            }

            /**
             * 获取resBookDesigStatusCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResBookDesigStatusCode() {
                return resBookDesigStatusCode;
            }

            /**
             * 设置resBookDesigStatusCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResBookDesigStatusCode(String value) {
                this.resBookDesigStatusCode = value;
            }

            /**
             * 获取rph属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * 设置rph属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

        }

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
     *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StopLocation {

        @XmlAttribute(name = "LocationCode")
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * 获取locationCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * 设置locationCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
        }

        /**
         * 获取codeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * 设置codeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

    }

}
