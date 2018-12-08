
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="ReservationsList" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;element name="CruiseReservation" type="{http://www.opentravel.org/OTA/2003/05}CruiseReservationType" minOccurs="0"/&gt;
 *                       &lt;element name="GlobalReservation" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *                                 &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                               &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="HotelReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/&gt;
 *                       &lt;element name="VehicleReservation" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="VehResSummary" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="GolfReservation" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="Membership" minOccurs="0"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                         &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="VendorCode"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/attribute&gt;
 *                                         &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                         &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;/restriction&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                                 &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                               &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="RoundID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                               &lt;attribute name="PlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="RequestorResID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="ResponderResConfID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="AirReservation" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="FlightSegment" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentType" minOccurs="0"/&gt;
 *                                 &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                 &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                               &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="DateBooked" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                               &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}TransactionStatusType" /&gt;
 *                               &lt;attribute name="SupplierBookingInfoList"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/attribute&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="PackageReservation" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *                                 &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
 *                                 &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *                                 &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                               &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                               &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;attribute name="ReservationStatus" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" /&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="RailReservation" type="{http://www.opentravel.org/OTA/2003/05}RailReservationSummaryType" minOccurs="0"/&gt;
 *                     &lt;/choice&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/&gt;
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Target"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Test"/&gt;
 *             &lt;enumeration value="Production"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TargetName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="TransactionStatusCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Start"/&gt;
 *             &lt;enumeration value="End"/&gt;
 *             &lt;enumeration value="Rollback"/&gt;
 *             &lt;enumeration value="InSeries"/&gt;
 *             &lt;enumeration value="Continuation"/&gt;
 *             &lt;enumeration value="Subsequent"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservationsListOrWarningsOrSuccess"
})
@XmlRootElement(name = "OTA_ResRetrieveRS")
public class OTAResRetrieveRS {

    @XmlElements({
        @XmlElement(name = "ReservationsList", type = OTAResRetrieveRS.ReservationsList.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class)
    })
    protected List<Object> reservationsListOrWarningsOrSuccess;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected String target;
    @XmlAttribute(name = "TargetName")
    protected String targetName;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected String transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "CorrelationID")
    protected String correlationID;
    @XmlAttribute(name = "MoreIndicator")
    protected Boolean moreIndicator;
    @XmlAttribute(name = "MoreDataEchoToken")
    protected String moreDataEchoToken;

    /**
     * Gets the value of the reservationsListOrWarningsOrSuccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservationsListOrWarningsOrSuccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservationsListOrWarningsOrSuccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAResRetrieveRS.ReservationsList }
     * {@link WarningsType }
     * {@link SuccessType }
     * {@link ErrorsType }
     * 
     * 
     */
    public List<Object> getReservationsListOrWarningsOrSuccess() {
        if (reservationsListOrWarningsOrSuccess == null) {
            reservationsListOrWarningsOrSuccess = new ArrayList<Object>();
        }
        return this.reservationsListOrWarningsOrSuccess;
    }

    /**
     * 获取echoToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * 设置echoToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * 获取timeStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * 设置timeStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * 获取target属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置target属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * 获取targetName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * 设置targetName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetName(String value) {
        this.targetName = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * 获取transactionIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * 设置transactionIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * 获取sequenceNmbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * 设置sequenceNmbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * 获取transactionStatusCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * 设置transactionStatusCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * 获取retransmissionIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * 设置retransmissionIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    /**
     * 获取correlationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * 设置correlationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * 获取moreIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreIndicator() {
        return moreIndicator;
    }

    /**
     * 设置moreIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreIndicator(Boolean value) {
        this.moreIndicator = value;
    }

    /**
     * 获取moreDataEchoToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreDataEchoToken() {
        return moreDataEchoToken;
    }

    /**
     * 设置moreDataEchoToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreDataEchoToken(String value) {
        this.moreDataEchoToken = value;
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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;element name="CruiseReservation" type="{http://www.opentravel.org/OTA/2003/05}CruiseReservationType" minOccurs="0"/&gt;
     *           &lt;element name="GlobalReservation" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
     *                     &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="HotelReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/&gt;
     *           &lt;element name="VehicleReservation" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="VehResSummary" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="GolfReservation" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="Membership" minOccurs="0"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;attribute name="VendorCode"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                             &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="RoundID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *                   &lt;attribute name="PlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="RequestorResID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="ResponderResConfID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="AirReservation" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="FlightSegment" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentType" minOccurs="0"/&gt;
     *                     &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                     &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="DateBooked" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                   &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}TransactionStatusType" /&gt;
     *                   &lt;attribute name="SupplierBookingInfoList"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/attribute&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="PackageReservation" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
     *                     &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
     *                     &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
     *                     &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                   &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="ReservationStatus" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" /&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="RailReservation" type="{http://www.opentravel.org/OTA/2003/05}RailReservationSummaryType" minOccurs="0"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cruiseReservationOrGlobalReservationOrHotelReservation"
    })
    public static class ReservationsList {

        @XmlElements({
            @XmlElement(name = "CruiseReservation", type = CruiseReservationType.class),
            @XmlElement(name = "GlobalReservation", type = OTAResRetrieveRS.ReservationsList.GlobalReservation.class),
            @XmlElement(name = "HotelReservation", type = HotelReservationType.class),
            @XmlElement(name = "VehicleReservation", type = OTAResRetrieveRS.ReservationsList.VehicleReservation.class),
            @XmlElement(name = "GolfReservation", type = OTAResRetrieveRS.ReservationsList.GolfReservation.class),
            @XmlElement(name = "AirReservation", type = OTAResRetrieveRS.ReservationsList.AirReservation.class),
            @XmlElement(name = "PackageReservation", type = OTAResRetrieveRS.ReservationsList.PackageReservation.class),
            @XmlElement(name = "RailReservation", type = RailReservationSummaryType.class)
        })
        protected List<Object> cruiseReservationOrGlobalReservationOrHotelReservation;

        /**
         * Gets the value of the cruiseReservationOrGlobalReservationOrHotelReservation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cruiseReservationOrGlobalReservationOrHotelReservation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCruiseReservationOrGlobalReservationOrHotelReservation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseReservationType }
         * {@link OTAResRetrieveRS.ReservationsList.GlobalReservation }
         * {@link HotelReservationType }
         * {@link OTAResRetrieveRS.ReservationsList.VehicleReservation }
         * {@link OTAResRetrieveRS.ReservationsList.GolfReservation }
         * {@link OTAResRetrieveRS.ReservationsList.AirReservation }
         * {@link OTAResRetrieveRS.ReservationsList.PackageReservation }
         * {@link RailReservationSummaryType }
         * 
         * 
         */
        public List<Object> getCruiseReservationOrGlobalReservationOrHotelReservation() {
            if (cruiseReservationOrGlobalReservationOrHotelReservation == null) {
                cruiseReservationOrGlobalReservationOrHotelReservation = new ArrayList<Object>();
            }
            return this.cruiseReservationOrGlobalReservationOrHotelReservation;
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
         *         &lt;element name="FlightSegment" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentType" minOccurs="0"/&gt;
         *         &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="DateBooked" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *       &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}TransactionStatusType" /&gt;
         *       &lt;attribute name="SupplierBookingInfoList"&gt;
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
        @XmlType(name = "", propOrder = {
            "flightSegment",
            "travelerName",
            "tpaExtensions"
        })
        public static class AirReservation {

            @XmlElement(name = "FlightSegment")
            protected FlightSegmentType flightSegment;
            @XmlElement(name = "TravelerName")
            protected List<PersonNameType> travelerName;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "BookingReferenceID")
            protected String bookingReferenceID;
            @XmlAttribute(name = "DateBooked")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar dateBooked;
            @XmlAttribute(name = "ItineraryName")
            protected String itineraryName;
            @XmlAttribute(name = "Status")
            protected TransactionStatusType status;
            @XmlAttribute(name = "SupplierBookingInfoList")
            protected List<String> supplierBookingInfoList;

            /**
             * 获取flightSegment属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FlightSegmentType }
             *     
             */
            public FlightSegmentType getFlightSegment() {
                return flightSegment;
            }

            /**
             * 设置flightSegment属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FlightSegmentType }
             *     
             */
            public void setFlightSegment(FlightSegmentType value) {
                this.flightSegment = value;
            }

            /**
             * Gets the value of the travelerName property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the travelerName property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTravelerName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PersonNameType }
             * 
             * 
             */
            public List<PersonNameType> getTravelerName() {
                if (travelerName == null) {
                    travelerName = new ArrayList<PersonNameType>();
                }
                return this.travelerName;
            }

            /**
             * 获取tpaExtensions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TPAExtensionsType }
             *     
             */
            public TPAExtensionsType getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * 设置tpaExtensions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TPAExtensionsType }
             *     
             */
            public void setTPAExtensions(TPAExtensionsType value) {
                this.tpaExtensions = value;
            }

            /**
             * 获取bookingReferenceID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookingReferenceID() {
                return bookingReferenceID;
            }

            /**
             * 设置bookingReferenceID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookingReferenceID(String value) {
                this.bookingReferenceID = value;
            }

            /**
             * 获取dateBooked属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateBooked() {
                return dateBooked;
            }

            /**
             * 设置dateBooked属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateBooked(XMLGregorianCalendar value) {
                this.dateBooked = value;
            }

            /**
             * 获取itineraryName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItineraryName() {
                return itineraryName;
            }

            /**
             * 设置itineraryName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItineraryName(String value) {
                this.itineraryName = value;
            }

            /**
             * 获取status属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TransactionStatusType }
             *     
             */
            public TransactionStatusType getStatus() {
                return status;
            }

            /**
             * 设置status属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TransactionStatusType }
             *     
             */
            public void setStatus(TransactionStatusType value) {
                this.status = value;
            }

            /**
             * Gets the value of the supplierBookingInfoList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the supplierBookingInfoList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSupplierBookingInfoList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getSupplierBookingInfoList() {
                if (supplierBookingInfoList == null) {
                    supplierBookingInfoList = new ArrayList<String>();
                }
                return this.supplierBookingInfoList;
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
         *       &lt;sequence&gt;
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
         *         &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "uniqueID",
            "travelerName"
        })
        public static class GlobalReservation {

            @XmlElement(name = "UniqueID")
            protected UniqueIDType uniqueID;
            @XmlElement(name = "TravelerName")
            protected PersonNameType travelerName;
            @XmlAttribute(name = "ItineraryName")
            protected String itineraryName;
            @XmlAttribute(name = "Start")
            protected String start;

            /**
             * 获取uniqueID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link UniqueIDType }
             *     
             */
            public UniqueIDType getUniqueID() {
                return uniqueID;
            }

            /**
             * 设置uniqueID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link UniqueIDType }
             *     
             */
            public void setUniqueID(UniqueIDType value) {
                this.uniqueID = value;
            }

            /**
             * 获取travelerName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link PersonNameType }
             *     
             */
            public PersonNameType getTravelerName() {
                return travelerName;
            }

            /**
             * 设置travelerName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link PersonNameType }
             *     
             */
            public void setTravelerName(PersonNameType value) {
                this.travelerName = value;
            }

            /**
             * 获取itineraryName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItineraryName() {
                return itineraryName;
            }

            /**
             * 设置itineraryName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItineraryName(String value) {
                this.itineraryName = value;
            }

            /**
             * 获取start属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * 设置start属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="Membership" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="VendorCode"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RoundID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *       &lt;attribute name="PlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RequestorResID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ResponderResConfID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "membership",
            "name"
        })
        public static class GolfReservation {

            @XmlElement(name = "Membership")
            protected OTAResRetrieveRS.ReservationsList.GolfReservation.Membership membership;
            @XmlElement(name = "Name")
            protected PersonNameType name;
            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "RoundID")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger roundID;
            @XmlAttribute(name = "PlayDateTime")
            protected String playDateTime;
            @XmlAttribute(name = "PackageID")
            protected String packageID;
            @XmlAttribute(name = "RequestorResID")
            protected String requestorResID;
            @XmlAttribute(name = "ResponderResConfID")
            protected String responderResConfID;

            /**
             * 获取membership属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OTAResRetrieveRS.ReservationsList.GolfReservation.Membership }
             *     
             */
            public OTAResRetrieveRS.ReservationsList.GolfReservation.Membership getMembership() {
                return membership;
            }

            /**
             * 设置membership属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OTAResRetrieveRS.ReservationsList.GolfReservation.Membership }
             *     
             */
            public void setMembership(OTAResRetrieveRS.ReservationsList.GolfReservation.Membership value) {
                this.membership = value;
            }

            /**
             * 获取name属性的值。
             * 
             * @return
             *     possible object is
             *     {@link PersonNameType }
             *     
             */
            public PersonNameType getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link PersonNameType }
             *     
             */
            public void setName(PersonNameType value) {
                this.name = value;
            }

            /**
             * 获取id属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * 设置id属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * 获取roundID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRoundID() {
                return roundID;
            }

            /**
             * 设置roundID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRoundID(BigInteger value) {
                this.roundID = value;
            }

            /**
             * 获取playDateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlayDateTime() {
                return playDateTime;
            }

            /**
             * 设置playDateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlayDateTime(String value) {
                this.playDateTime = value;
            }

            /**
             * 获取packageID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPackageID() {
                return packageID;
            }

            /**
             * 设置packageID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPackageID(String value) {
                this.packageID = value;
            }

            /**
             * 获取requestorResID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestorResID() {
                return requestorResID;
            }

            /**
             * 设置requestorResID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestorResID(String value) {
                this.requestorResID = value;
            }

            /**
             * 获取responderResConfID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponderResConfID() {
                return responderResConfID;
            }

            /**
             * 设置responderResConfID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponderResConfID(String value) {
                this.responderResConfID = value;
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
             *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="VendorCode"&gt;
             *         &lt;simpleType&gt;
             *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Membership {

                @XmlAttribute(name = "ProgramID")
                protected String programID;
                @XmlAttribute(name = "MembershipID")
                protected String membershipID;
                @XmlAttribute(name = "TravelSector")
                protected String travelSector;
                @XmlAttribute(name = "RPH")
                protected String rph;
                @XmlAttribute(name = "VendorCode")
                protected List<String> vendorCode;
                @XmlAttribute(name = "PrimaryLoyaltyIndicator")
                protected Boolean primaryLoyaltyIndicator;
                @XmlAttribute(name = "AllianceLoyaltyLevelName")
                protected String allianceLoyaltyLevelName;
                @XmlAttribute(name = "CustomerType")
                protected String customerType;
                @XmlAttribute(name = "CustomerValue")
                protected String customerValue;
                @XmlAttribute(name = "Password")
                protected String password;

                /**
                 * 获取programID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProgramID() {
                    return programID;
                }

                /**
                 * 设置programID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProgramID(String value) {
                    this.programID = value;
                }

                /**
                 * 获取membershipID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMembershipID() {
                    return membershipID;
                }

                /**
                 * 设置membershipID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMembershipID(String value) {
                    this.membershipID = value;
                }

                /**
                 * 获取travelSector属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTravelSector() {
                    return travelSector;
                }

                /**
                 * 设置travelSector属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTravelSector(String value) {
                    this.travelSector = value;
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

                /**
                 * Gets the value of the vendorCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVendorCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getVendorCode() {
                    if (vendorCode == null) {
                        vendorCode = new ArrayList<String>();
                    }
                    return this.vendorCode;
                }

                /**
                 * 获取primaryLoyaltyIndicator属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPrimaryLoyaltyIndicator() {
                    return primaryLoyaltyIndicator;
                }

                /**
                 * 设置primaryLoyaltyIndicator属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setPrimaryLoyaltyIndicator(Boolean value) {
                    this.primaryLoyaltyIndicator = value;
                }

                /**
                 * 获取allianceLoyaltyLevelName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAllianceLoyaltyLevelName() {
                    return allianceLoyaltyLevelName;
                }

                /**
                 * 设置allianceLoyaltyLevelName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAllianceLoyaltyLevelName(String value) {
                    this.allianceLoyaltyLevelName = value;
                }

                /**
                 * 获取customerType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerType() {
                    return customerType;
                }

                /**
                 * 设置customerType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerType(String value) {
                    this.customerType = value;
                }

                /**
                 * 获取customerValue属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerValue() {
                    return customerValue;
                }

                /**
                 * 设置customerValue属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerValue(String value) {
                    this.customerValue = value;
                }

                /**
                 * 获取password属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassword() {
                    return password;
                }

                /**
                 * 设置password属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassword(String value) {
                    this.password = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
         *         &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
         *         &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
         *         &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ReservationStatus" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "uniqueID",
            "name",
            "arrivalLocation",
            "departureLocation"
        })
        public static class PackageReservation {

            @XmlElement(name = "UniqueID")
            protected UniqueIDType uniqueID;
            @XmlElement(name = "Name")
            protected PersonNameType name;
            @XmlElement(name = "ArrivalLocation")
            protected LocationType arrivalLocation;
            @XmlElement(name = "DepartureLocation")
            protected LocationType departureLocation;
            @XmlAttribute(name = "TravelCode")
            protected String travelCode;
            @XmlAttribute(name = "TourCode")
            protected String tourCode;
            @XmlAttribute(name = "PackageID")
            protected String packageID;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;
            @XmlAttribute(name = "ReservationStatusCode")
            protected String reservationStatusCode;
            @XmlAttribute(name = "ReservationStatus")
            protected InventoryStatusType reservationStatus;

            /**
             * 获取uniqueID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link UniqueIDType }
             *     
             */
            public UniqueIDType getUniqueID() {
                return uniqueID;
            }

            /**
             * 设置uniqueID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link UniqueIDType }
             *     
             */
            public void setUniqueID(UniqueIDType value) {
                this.uniqueID = value;
            }

            /**
             * 获取name属性的值。
             * 
             * @return
             *     possible object is
             *     {@link PersonNameType }
             *     
             */
            public PersonNameType getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link PersonNameType }
             *     
             */
            public void setName(PersonNameType value) {
                this.name = value;
            }

            /**
             * 获取arrivalLocation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getArrivalLocation() {
                return arrivalLocation;
            }

            /**
             * 设置arrivalLocation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setArrivalLocation(LocationType value) {
                this.arrivalLocation = value;
            }

            /**
             * 获取departureLocation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getDepartureLocation() {
                return departureLocation;
            }

            /**
             * 设置departureLocation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setDepartureLocation(LocationType value) {
                this.departureLocation = value;
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
             * 获取tourCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTourCode() {
                return tourCode;
            }

            /**
             * 设置tourCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTourCode(String value) {
                this.tourCode = value;
            }

            /**
             * 获取packageID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPackageID() {
                return packageID;
            }

            /**
             * 设置packageID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPackageID(String value) {
                this.packageID = value;
            }

            /**
             * 获取start属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * 设置start属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * 获取duration属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * 设置duration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * 获取end属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * 设置end属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
            }

            /**
             * 获取quantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * 设置quantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

            /**
             * 获取reservationStatusCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationStatusCode() {
                return reservationStatusCode;
            }

            /**
             * 设置reservationStatusCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationStatusCode(String value) {
                this.reservationStatusCode = value;
            }

            /**
             * 获取reservationStatus属性的值。
             * 
             * @return
             *     possible object is
             *     {@link InventoryStatusType }
             *     
             */
            public InventoryStatusType getReservationStatus() {
                return reservationStatus;
            }

            /**
             * 设置reservationStatus属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link InventoryStatusType }
             *     
             */
            public void setReservationStatus(InventoryStatusType value) {
                this.reservationStatus = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="VehResSummary" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vehResSummary"
        })
        public static class VehicleReservation {

            @XmlElement(name = "VehResSummary")
            protected List<VehicleReservationSummaryType> vehResSummary;

            /**
             * Gets the value of the vehResSummary property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the vehResSummary property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVehResSummary().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VehicleReservationSummaryType }
             * 
             * 
             */
            public List<VehicleReservationSummaryType> getVehResSummary() {
                if (vehResSummary == null) {
                    vehResSummary = new ArrayList<VehicleReservationSummaryType>();
                }
                return this.vehResSummary;
            }

        }

    }

}
