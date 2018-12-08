package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/>
 *           &lt;element name="ReservationsList" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                       &lt;element name="VehicleReservation" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="VehResSummary" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="GlobalReservation" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                                 &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *                               &lt;/sequence>
 *                               &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="AirReservation" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="FlightSegment" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentType" minOccurs="0"/>
 *                                 &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" maxOccurs="unbounded" minOccurs="0"/>
 *                                 &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                               &lt;/sequence>
 *                               &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="DateBooked" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                               &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}TransactionStatusType" />
 *                               &lt;attribute name="SupplierBookingInfoList">
 *                                 &lt;simpleType>
 *                                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="GolfReservation" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="Membership" minOccurs="0">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="VendorCode">
 *                                           &lt;simpleType>
 *                                             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                           &lt;/simpleType>
 *                                         &lt;/attribute>
 *                                         &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                         &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *                               &lt;/sequence>
 *                               &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="RoundID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                               &lt;attribute name="PlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="RequestorResID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="ResponderResConfID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="HotelReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/>
 *                       &lt;element name="PackageReservation" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                                 &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *                                 &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *                                 &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *                               &lt;/sequence>
 *                               &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                               &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                               &lt;attribute name="ReservationStatus" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" />
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="RailReservation" type="{http://www.opentravel.org/OTA/2003/05}RailReservationSummaryType" minOccurs="0"/>
 *                       &lt;element name="CruiseReservation" type="{http://www.opentravel.org/OTA/2003/05}CruiseReservationType" minOccurs="0"/>
 *                     &lt;/choice>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Test"/>
 *             &lt;enumeration value="Production"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TargetName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TransactionStatusCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Start"/>
 *             &lt;enumeration value="End"/>
 *             &lt;enumeration value="Rollback"/>
 *             &lt;enumeration value="InSeries"/>
 *             &lt;enumeration value="Continuation"/>
 *             &lt;enumeration value="Subsequent"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "successOrWarningsOrErrors"
})
@XmlRootElement(name = "OTA_ResRetrieveRS")
public class OTAResRetrieveRS {

    @XmlElements({
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "Warnings", type = WarningsType.class),
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "ReservationsList", type = OTAResRetrieveRS.ReservationsList.class)
    })
    protected List<Object> successOrWarningsOrErrors;
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
     * Gets the value of the successOrWarningsOrErrors property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successOrWarningsOrErrors property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessOrWarningsOrErrors().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessType }
     * {@link WarningsType }
     * {@link ErrorsType }
     * {@link OTAResRetrieveRS.ReservationsList }
     */
    public List<Object> getSuccessOrWarningsOrErrors() {
        if (successOrWarningsOrErrors == null) {
            successOrWarningsOrErrors = new ArrayList<Object>();
        }
        return this.successOrWarningsOrErrors;
    }

    /**
     * ��ȡechoToken���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * ����echoToken���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * ��ȡtimeStamp���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * ����timeStamp���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * ��ȡtarget���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTarget() {
        return target;
    }

    /**
     * ����target���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * ��ȡtargetName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * ����targetName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTargetName(String value) {
        this.targetName = value;
    }

    /**
     * ��ȡversion���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * ����version���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * ��ȡtransactionIdentifier���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * ����transactionIdentifier���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * ��ȡsequenceNmbr���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * ����sequenceNmbr���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * ��ȡtransactionStatusCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * ����transactionStatusCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * ��ȡretransmissionIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * ����retransmissionIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    /**
     * ��ȡcorrelationID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * ����correlationID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * ��ȡmoreIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMoreIndicator() {
        return moreIndicator;
    }

    /**
     * ����moreIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMoreIndicator(Boolean value) {
        this.moreIndicator = value;
    }

    /**
     * ��ȡmoreDataEchoToken���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMoreDataEchoToken() {
        return moreDataEchoToken;
    }

    /**
     * ����moreDataEchoToken���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMoreDataEchoToken(String value) {
        this.moreDataEchoToken = value;
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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="VehicleReservation" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="VehResSummary" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationSummaryType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="GlobalReservation" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *                     &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="AirReservation" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="FlightSegment" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentType" minOccurs="0"/>
     *                     &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" maxOccurs="unbounded" minOccurs="0"/>
     *                     &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="DateBooked" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                   &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}TransactionStatusType" />
     *                   &lt;attribute name="SupplierBookingInfoList">
     *                     &lt;simpleType>
     *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="GolfReservation" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="Membership" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="VendorCode">
     *                               &lt;simpleType>
     *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                             &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                             &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="RoundID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                   &lt;attribute name="PlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="RequestorResID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="ResponderResConfID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="HotelReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/>
     *           &lt;element name="PackageReservation" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *                     &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
     *                     &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
     *                     &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                   &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="ReservationStatus" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="RailReservation" type="{http://www.opentravel.org/OTA/2003/05}RailReservationSummaryType" minOccurs="0"/>
     *           &lt;element name="CruiseReservation" type="{http://www.opentravel.org/OTA/2003/05}CruiseReservationType" minOccurs="0"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "vehicleReservationOrGlobalReservationOrAirReservation"
    })
    public static class ReservationsList {

        @XmlElements({
                @XmlElement(name = "VehicleReservation", type = OTAResRetrieveRS.ReservationsList.VehicleReservation.class),
                @XmlElement(name = "GlobalReservation", type = OTAResRetrieveRS.ReservationsList.GlobalReservation.class),
                @XmlElement(name = "AirReservation", type = OTAResRetrieveRS.ReservationsList.AirReservation.class),
                @XmlElement(name = "GolfReservation", type = OTAResRetrieveRS.ReservationsList.GolfReservation.class),
                @XmlElement(name = "HotelReservation", type = HotelReservationType.class),
                @XmlElement(name = "PackageReservation", type = OTAResRetrieveRS.ReservationsList.PackageReservation.class),
                @XmlElement(name = "RailReservation", type = RailReservationSummaryType.class),
                @XmlElement(name = "CruiseReservation", type = CruiseReservationType.class)
        })
        protected List<Object> vehicleReservationOrGlobalReservationOrAirReservation;

        /**
         * Gets the value of the vehicleReservationOrGlobalReservationOrAirReservation property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleReservationOrGlobalReservationOrAirReservation property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleReservationOrGlobalReservationOrAirReservation().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAResRetrieveRS.ReservationsList.VehicleReservation }
         * {@link OTAResRetrieveRS.ReservationsList.GlobalReservation }
         * {@link OTAResRetrieveRS.ReservationsList.AirReservation }
         * {@link OTAResRetrieveRS.ReservationsList.GolfReservation }
         * {@link HotelReservationType }
         * {@link OTAResRetrieveRS.ReservationsList.PackageReservation }
         * {@link RailReservationSummaryType }
         * {@link CruiseReservationType }
         */
        public List<Object> getVehicleReservationOrGlobalReservationOrAirReservation() {
            if (vehicleReservationOrGlobalReservationOrAirReservation == null) {
                vehicleReservationOrGlobalReservationOrAirReservation = new ArrayList<Object>();
            }
            return this.vehicleReservationOrGlobalReservationOrAirReservation;
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
         *         &lt;element name="FlightSegment" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentType" minOccurs="0"/>
         *         &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DateBooked" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}TransactionStatusType" />
         *       &lt;attribute name="SupplierBookingInfoList">
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
             * ��ȡflightSegment���Ե�ֵ��
             *
             * @return possible object is
             * {@link FlightSegmentType }
             */
            public FlightSegmentType getFlightSegment() {
                return flightSegment;
            }

            /**
             * ����flightSegment���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link FlightSegmentType }
             */
            public void setFlightSegment(FlightSegmentType value) {
                this.flightSegment = value;
            }

            /**
             * Gets the value of the travelerName property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the travelerName property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTravelerName().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link PersonNameType }
             */
            public List<PersonNameType> getTravelerName() {
                if (travelerName == null) {
                    travelerName = new ArrayList<PersonNameType>();
                }
                return this.travelerName;
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
             * ��ȡitineraryName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getItineraryName() {
                return itineraryName;
            }

            /**
             * ����itineraryName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setItineraryName(String value) {
                this.itineraryName = value;
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
             * Gets the value of the supplierBookingInfoList property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the supplierBookingInfoList property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSupplierBookingInfoList().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getSupplierBookingInfoList() {
                if (supplierBookingInfoList == null) {
                    supplierBookingInfoList = new ArrayList<String>();
                }
                return this.supplierBookingInfoList;
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
         *       &lt;sequence>
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
         *         &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡuniqueID���Ե�ֵ��
             *
             * @return possible object is
             * {@link UniqueIDType }
             */
            public UniqueIDType getUniqueID() {
                return uniqueID;
            }

            /**
             * ����uniqueID���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link UniqueIDType }
             */
            public void setUniqueID(UniqueIDType value) {
                this.uniqueID = value;
            }

            /**
             * ��ȡtravelerName���Ե�ֵ��
             *
             * @return possible object is
             * {@link PersonNameType }
             */
            public PersonNameType getTravelerName() {
                return travelerName;
            }

            /**
             * ����travelerName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link PersonNameType }
             */
            public void setTravelerName(PersonNameType value) {
                this.travelerName = value;
            }

            /**
             * ��ȡitineraryName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getItineraryName() {
                return itineraryName;
            }

            /**
             * ����itineraryName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setItineraryName(String value) {
                this.itineraryName = value;
            }

            /**
             * ��ȡstart���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getStart() {
                return start;
            }

            /**
             * ����start���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setStart(String value) {
                this.start = value;
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
         *       &lt;sequence>
         *         &lt;element name="Membership" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="VendorCode">
         *                   &lt;simpleType>
         *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RoundID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="PlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RequestorResID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResponderResConfID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡmembership���Ե�ֵ��
             *
             * @return possible object is
             * {@link OTAResRetrieveRS.ReservationsList.GolfReservation.Membership }
             */
            public OTAResRetrieveRS.ReservationsList.GolfReservation.Membership getMembership() {
                return membership;
            }

            /**
             * ����membership���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link OTAResRetrieveRS.ReservationsList.GolfReservation.Membership }
             */
            public void setMembership(OTAResRetrieveRS.ReservationsList.GolfReservation.Membership value) {
                this.membership = value;
            }

            /**
             * ��ȡname���Ե�ֵ��
             *
             * @return possible object is
             * {@link PersonNameType }
             */
            public PersonNameType getName() {
                return name;
            }

            /**
             * ����name���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link PersonNameType }
             */
            public void setName(PersonNameType value) {
                this.name = value;
            }

            /**
             * ��ȡid���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getID() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * ��ȡroundID���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getRoundID() {
                return roundID;
            }

            /**
             * ����roundID���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setRoundID(BigInteger value) {
                this.roundID = value;
            }

            /**
             * ��ȡplayDateTime���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getPlayDateTime() {
                return playDateTime;
            }

            /**
             * ����playDateTime���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPlayDateTime(String value) {
                this.playDateTime = value;
            }

            /**
             * ��ȡpackageID���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getPackageID() {
                return packageID;
            }

            /**
             * ����packageID���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPackageID(String value) {
                this.packageID = value;
            }

            /**
             * ��ȡrequestorResID���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getRequestorResID() {
                return requestorResID;
            }

            /**
             * ����requestorResID���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRequestorResID(String value) {
                this.requestorResID = value;
            }

            /**
             * ��ȡresponderResConfID���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getResponderResConfID() {
                return responderResConfID;
            }

            /**
             * ����responderResConfID���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setResponderResConfID(String value) {
                this.responderResConfID = value;
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
             *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="VendorCode">
             *         &lt;simpleType>
             *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
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
                 * ��ȡprogramID���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getProgramID() {
                    return programID;
                }

                /**
                 * ����programID���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setProgramID(String value) {
                    this.programID = value;
                }

                /**
                 * ��ȡmembershipID���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getMembershipID() {
                    return membershipID;
                }

                /**
                 * ����membershipID���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setMembershipID(String value) {
                    this.membershipID = value;
                }

                /**
                 * ��ȡtravelSector���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getTravelSector() {
                    return travelSector;
                }

                /**
                 * ����travelSector���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setTravelSector(String value) {
                    this.travelSector = value;
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
                 * Gets the value of the vendorCode property.
                 * <p/>
                 * <p/>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
                 * <p/>
                 * <p/>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVendorCode().add(newItem);
                 * </pre>
                 * <p/>
                 * <p/>
                 * <p/>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 */
                public List<String> getVendorCode() {
                    if (vendorCode == null) {
                        vendorCode = new ArrayList<String>();
                    }
                    return this.vendorCode;
                }

                /**
                 * ��ȡprimaryLoyaltyIndicator���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isPrimaryLoyaltyIndicator() {
                    return primaryLoyaltyIndicator;
                }

                /**
                 * ����primaryLoyaltyIndicator���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setPrimaryLoyaltyIndicator(Boolean value) {
                    this.primaryLoyaltyIndicator = value;
                }

                /**
                 * ��ȡallianceLoyaltyLevelName���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getAllianceLoyaltyLevelName() {
                    return allianceLoyaltyLevelName;
                }

                /**
                 * ����allianceLoyaltyLevelName���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setAllianceLoyaltyLevelName(String value) {
                    this.allianceLoyaltyLevelName = value;
                }

                /**
                 * ��ȡcustomerType���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getCustomerType() {
                    return customerType;
                }

                /**
                 * ����customerType���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setCustomerType(String value) {
                    this.customerType = value;
                }

                /**
                 * ��ȡcustomerValue���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getCustomerValue() {
                    return customerValue;
                }

                /**
                 * ����customerValue���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setCustomerValue(String value) {
                    this.customerValue = value;
                }

                /**
                 * ��ȡpassword���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getPassword() {
                    return password;
                }

                /**
                 * ����password���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setPassword(String value) {
                    this.password = value;
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
         *       &lt;sequence>
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
         *         &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
         *         &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ReservationStatus" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡuniqueID���Ե�ֵ��
             *
             * @return possible object is
             * {@link UniqueIDType }
             */
            public UniqueIDType getUniqueID() {
                return uniqueID;
            }

            /**
             * ����uniqueID���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link UniqueIDType }
             */
            public void setUniqueID(UniqueIDType value) {
                this.uniqueID = value;
            }

            /**
             * ��ȡname���Ե�ֵ��
             *
             * @return possible object is
             * {@link PersonNameType }
             */
            public PersonNameType getName() {
                return name;
            }

            /**
             * ����name���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link PersonNameType }
             */
            public void setName(PersonNameType value) {
                this.name = value;
            }

            /**
             * ��ȡarrivalLocation���Ե�ֵ��
             *
             * @return possible object is
             * {@link LocationType }
             */
            public LocationType getArrivalLocation() {
                return arrivalLocation;
            }

            /**
             * ����arrivalLocation���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link LocationType }
             */
            public void setArrivalLocation(LocationType value) {
                this.arrivalLocation = value;
            }

            /**
             * ��ȡdepartureLocation���Ե�ֵ��
             *
             * @return possible object is
             * {@link LocationType }
             */
            public LocationType getDepartureLocation() {
                return departureLocation;
            }

            /**
             * ����departureLocation���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link LocationType }
             */
            public void setDepartureLocation(LocationType value) {
                this.departureLocation = value;
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
             * ��ȡtourCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getTourCode() {
                return tourCode;
            }

            /**
             * ����tourCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTourCode(String value) {
                this.tourCode = value;
            }

            /**
             * ��ȡpackageID���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getPackageID() {
                return packageID;
            }

            /**
             * ����packageID���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPackageID(String value) {
                this.packageID = value;
            }

            /**
             * ��ȡstart���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getStart() {
                return start;
            }

            /**
             * ����start���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * ��ȡduration���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getDuration() {
                return duration;
            }

            /**
             * ����duration���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * ��ȡend���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getEnd() {
                return end;
            }

            /**
             * ����end���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setEnd(String value) {
                this.end = value;
            }

            /**
             * ��ȡquantity���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * ����quantity���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

            /**
             * ��ȡreservationStatusCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getReservationStatusCode() {
                return reservationStatusCode;
            }

            /**
             * ����reservationStatusCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setReservationStatusCode(String value) {
                this.reservationStatusCode = value;
            }

            /**
             * ��ȡreservationStatus���Ե�ֵ��
             *
             * @return possible object is
             * {@link InventoryStatusType }
             */
            public InventoryStatusType getReservationStatus() {
                return reservationStatus;
            }

            /**
             * ����reservationStatus���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link InventoryStatusType }
             */
            public void setReservationStatus(InventoryStatusType value) {
                this.reservationStatus = value;
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
         *       &lt;sequence>
         *         &lt;element name="VehResSummary" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationSummaryType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the vehResSummary property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVehResSummary().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link VehicleReservationSummaryType }
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
