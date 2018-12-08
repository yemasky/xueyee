
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReadRequests" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Airport" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UserID" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
 *                           &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Verification" type="{http://www.opentravel.org/OTA/2003/05}VerificationType" minOccurs="0"/&gt;
 *                   &lt;element name="SelectionCriteria" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="DateType"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="ArrivalDate"/&gt;
 *                                 &lt;enumeration value="DepartureDate"/&gt;
 *                                 &lt;enumeration value="CreateDate"/&gt;
 *                                 &lt;enumeration value="LastUpdateDate"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="SelectionType"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="All"/&gt;
 *                                 &lt;enumeration value="PreviouslyDelivered"/&gt;
 *                                 &lt;enumeration value="Undelivered"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="OriginalDeliveryMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *       &lt;attribute name="ReqRespVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReservationType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReturnListIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
    "pos",
    "uniqueID",
    "readRequests"
})
@XmlRootElement(name = "OTA_ReadRQ")
public class OTAReadRQ {

    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "ReadRequests")
    protected OTAReadRQ.ReadRequests readRequests;
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
    @XmlAttribute(name = "ReqRespVersion")
    protected String reqRespVersion;
    @XmlAttribute(name = "ReservationType")
    protected String reservationType;
    @XmlAttribute(name = "ReturnListIndicator")
    protected Boolean returnListIndicator;
    @XmlAttribute(name = "MoreIndicator")
    protected Boolean moreIndicator;
    @XmlAttribute(name = "MoreDataEchoToken")
    protected String moreDataEchoToken;

    /**
     * 获取pos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public ArrayOfSourceType getPOS() {
        return pos;
    }

    /**
     * 设置pos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public void setPOS(ArrayOfSourceType value) {
        this.pos = value;
    }

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
     * 获取readRequests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OTAReadRQ.ReadRequests }
     *     
     */
    public OTAReadRQ.ReadRequests getReadRequests() {
        return readRequests;
    }

    /**
     * 设置readRequests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OTAReadRQ.ReadRequests }
     *     
     */
    public void setReadRequests(OTAReadRQ.ReadRequests value) {
        this.readRequests = value;
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
     * 获取reqRespVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRespVersion() {
        return reqRespVersion;
    }

    /**
     * 设置reqRespVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRespVersion(String value) {
        this.reqRespVersion = value;
    }

    /**
     * 获取reservationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationType() {
        return reservationType;
    }

    /**
     * 设置reservationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationType(String value) {
        this.reservationType = value;
    }

    /**
     * 获取returnListIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnListIndicator() {
        return returnListIndicator;
    }

    /**
     * 设置returnListIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnListIndicator(Boolean value) {
        this.returnListIndicator = value;
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
     *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Airport" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="UserID" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
     *                 &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Verification" type="{http://www.opentravel.org/OTA/2003/05}VerificationType" minOccurs="0"/&gt;
     *         &lt;element name="SelectionCriteria" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="DateType"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="ArrivalDate"/&gt;
     *                       &lt;enumeration value="DepartureDate"/&gt;
     *                       &lt;enumeration value="CreateDate"/&gt;
     *                       &lt;enumeration value="LastUpdateDate"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="SelectionType"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="All"/&gt;
     *                       &lt;enumeration value="PreviouslyDelivered"/&gt;
     *                       &lt;enumeration value="Undelivered"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="OriginalDeliveryMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cityName",
        "airport",
        "userID",
        "verification",
        "selectionCriteria",
        "tpaExtensions"
    })
    public static class ReadRequests {

        @XmlElement(name = "CityName")
        protected String cityName;
        @XmlElement(name = "Airport")
        protected OTAReadRQ.ReadRequests.Airport airport;
        @XmlElement(name = "UserID")
        protected OTAReadRQ.ReadRequests.UserID userID;
        @XmlElement(name = "Verification")
        protected VerificationType verification;
        @XmlElement(name = "SelectionCriteria")
        protected OTAReadRQ.ReadRequests.SelectionCriteria selectionCriteria;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "ChainCode")
        protected String chainCode;
        @XmlAttribute(name = "BrandCode")
        protected String brandCode;
        @XmlAttribute(name = "HotelCode")
        protected String hotelCode;
        @XmlAttribute(name = "HotelCityCode")
        protected String hotelCityCode;
        @XmlAttribute(name = "HotelName")
        protected String hotelName;
        @XmlAttribute(name = "HotelCodeContext")
        protected String hotelCodeContext;
        @XmlAttribute(name = "ChainName")
        protected String chainName;
        @XmlAttribute(name = "BrandName")
        protected String brandName;

        /**
         * 获取cityName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityName() {
            return cityName;
        }

        /**
         * 设置cityName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityName(String value) {
            this.cityName = value;
        }

        /**
         * 获取airport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OTAReadRQ.ReadRequests.Airport }
         *     
         */
        public OTAReadRQ.ReadRequests.Airport getAirport() {
            return airport;
        }

        /**
         * 设置airport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OTAReadRQ.ReadRequests.Airport }
         *     
         */
        public void setAirport(OTAReadRQ.ReadRequests.Airport value) {
            this.airport = value;
        }

        /**
         * 获取userID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OTAReadRQ.ReadRequests.UserID }
         *     
         */
        public OTAReadRQ.ReadRequests.UserID getUserID() {
            return userID;
        }

        /**
         * 设置userID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OTAReadRQ.ReadRequests.UserID }
         *     
         */
        public void setUserID(OTAReadRQ.ReadRequests.UserID value) {
            this.userID = value;
        }

        /**
         * 获取verification属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VerificationType }
         *     
         */
        public VerificationType getVerification() {
            return verification;
        }

        /**
         * 设置verification属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VerificationType }
         *     
         */
        public void setVerification(VerificationType value) {
            this.verification = value;
        }

        /**
         * 获取selectionCriteria属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OTAReadRQ.ReadRequests.SelectionCriteria }
         *     
         */
        public OTAReadRQ.ReadRequests.SelectionCriteria getSelectionCriteria() {
            return selectionCriteria;
        }

        /**
         * 设置selectionCriteria属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OTAReadRQ.ReadRequests.SelectionCriteria }
         *     
         */
        public void setSelectionCriteria(OTAReadRQ.ReadRequests.SelectionCriteria value) {
            this.selectionCriteria = value;
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
         * 获取chainCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainCode() {
            return chainCode;
        }

        /**
         * 设置chainCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainCode(String value) {
            this.chainCode = value;
        }

        /**
         * 获取brandCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandCode() {
            return brandCode;
        }

        /**
         * 设置brandCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandCode(String value) {
            this.brandCode = value;
        }

        /**
         * 获取hotelCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCode() {
            return hotelCode;
        }

        /**
         * 设置hotelCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCode(String value) {
            this.hotelCode = value;
        }

        /**
         * 获取hotelCityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCityCode() {
            return hotelCityCode;
        }

        /**
         * 设置hotelCityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCityCode(String value) {
            this.hotelCityCode = value;
        }

        /**
         * 获取hotelName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelName() {
            return hotelName;
        }

        /**
         * 设置hotelName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelName(String value) {
            this.hotelName = value;
        }

        /**
         * 获取hotelCodeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCodeContext() {
            return hotelCodeContext;
        }

        /**
         * 设置hotelCodeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCodeContext(String value) {
            this.hotelCodeContext = value;
        }

        /**
         * 获取chainName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainName() {
            return chainName;
        }

        /**
         * 设置chainName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainName(String value) {
            this.chainName = value;
        }

        /**
         * 获取brandName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandName() {
            return brandName;
        }

        /**
         * 设置brandName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandName(String value) {
            this.brandName = value;
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
         *       &lt;attribute name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Airport {

            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "AirportName")
            protected String airportName;

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

            /**
             * 获取airportName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirportName() {
                return airportName;
            }

            /**
             * 设置airportName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirportName(String value) {
                this.airportName = value;
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
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="DateType"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="ArrivalDate"/&gt;
         *             &lt;enumeration value="DepartureDate"/&gt;
         *             &lt;enumeration value="CreateDate"/&gt;
         *             &lt;enumeration value="LastUpdateDate"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="SelectionType"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="All"/&gt;
         *             &lt;enumeration value="PreviouslyDelivered"/&gt;
         *             &lt;enumeration value="Undelivered"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="OriginalDeliveryMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SelectionCriteria {

            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "DateType")
            protected String dateType;
            @XmlAttribute(name = "SelectionType")
            protected String selectionType;
            @XmlAttribute(name = "GroupCode")
            protected String groupCode;
            @XmlAttribute(name = "ResStatus")
            protected String resStatus;
            @XmlAttribute(name = "OriginalDeliveryMethodCode")
            protected String originalDeliveryMethodCode;

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
             * 获取dateType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateType() {
                return dateType;
            }

            /**
             * 设置dateType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateType(String value) {
                this.dateType = value;
            }

            /**
             * 获取selectionType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelectionType() {
                return selectionType;
            }

            /**
             * 设置selectionType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelectionType(String value) {
                this.selectionType = value;
            }

            /**
             * 获取groupCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupCode() {
                return groupCode;
            }

            /**
             * 设置groupCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupCode(String value) {
                this.groupCode = value;
            }

            /**
             * 获取resStatus属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResStatus() {
                return resStatus;
            }

            /**
             * 设置resStatus属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResStatus(String value) {
                this.resStatus = value;
            }

            /**
             * 获取originalDeliveryMethodCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalDeliveryMethodCode() {
                return originalDeliveryMethodCode;
            }

            /**
             * 设置originalDeliveryMethodCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalDeliveryMethodCode(String value) {
                this.originalDeliveryMethodCode = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
         *       &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UserID
            extends UniqueIDType
        {

            @XmlAttribute(name = "PinNumber")
            protected String pinNumber;

            /**
             * 获取pinNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPinNumber() {
                return pinNumber;
            }

            /**
             * 设置pinNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPinNumber(String value) {
                this.pinNumber = value;
            }

        }

    }

}
