
package ota.jw.AvailRes;

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
 *         &lt;element name="AvailRequestSegments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailRequestSegmentsType"&gt;
 *                 &lt;attribute name="MaximumWaitTime" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelReservationIDsTypeHotelReservationID" minOccurs="0"/&gt;
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
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
 *       &lt;attribute name="SummaryOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SortOrder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="A"/&gt;
 *             &lt;enumeration value="D"/&gt;
 *             &lt;enumeration value="N"/&gt;
 *             &lt;enumeration value="C"/&gt;
 *             &lt;enumeration value="P"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="AvailRatesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OnRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BestOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateRangeOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ExactMatchOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllowPartialAvail" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RequestedCurrencyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsModify" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="SearchCacheLevel"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Live"/&gt;
 *             &lt;enumeration value="VeryRecent"/&gt;
 *             &lt;enumeration value="LessRecent"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="HotelStayOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateDetailsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MapRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MapHeight" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="MapWidth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="DuplicateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PricingMethod"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Average"/&gt;
 *             &lt;enumeration value="Lowest"/&gt;
 *             &lt;enumeration value="Highest"/&gt;
 *           &lt;/restriction&gt;
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
    "pos",
    "availRequestSegments",
    "hotelReservationIDs"
})
@XmlRootElement(name = "OTA_HotelAvailRQ")
public class OTAHotelAvailRQ {

    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElement(name = "AvailRequestSegments")
    protected OTAHotelAvailRQ.AvailRequestSegments availRequestSegments;
    @XmlElement(name = "HotelReservationIDs")
    protected ArrayOfHotelReservationIDsTypeHotelReservationID hotelReservationIDs;
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
    protected String sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected String transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "CorrelationID")
    protected String correlationID;
    @XmlAttribute(name = "SummaryOnly")
    protected Boolean summaryOnly;
    @XmlAttribute(name = "SortOrder")
    protected String sortOrder;
    @XmlAttribute(name = "AvailRatesOnly")
    protected Boolean availRatesOnly;
    @XmlAttribute(name = "OnRequestInd")
    protected Boolean onRequestInd;
    @XmlAttribute(name = "BestOnly")
    protected Boolean bestOnly;
    @XmlAttribute(name = "RateRangeOnly")
    protected Boolean rateRangeOnly;
    @XmlAttribute(name = "ExactMatchOnly")
    protected Boolean exactMatchOnly;
    @XmlAttribute(name = "AllowPartialAvail")
    protected Boolean allowPartialAvail;
    @XmlAttribute(name = "RequestedCurrency")
    protected String requestedCurrency;
    @XmlAttribute(name = "RequestedCurrencyIndicator")
    protected Boolean requestedCurrencyIndicator;
    @XmlAttribute(name = "IsModify")
    protected Boolean isModify;
    @XmlAttribute(name = "MaxResponses")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxResponses;
    @XmlAttribute(name = "SearchCacheLevel")
    protected String searchCacheLevel;
    @XmlAttribute(name = "HotelStayOnly")
    protected Boolean hotelStayOnly;
    @XmlAttribute(name = "RateDetailsInd")
    protected Boolean rateDetailsInd;
    @XmlAttribute(name = "MapRequired")
    protected Boolean mapRequired;
    @XmlAttribute(name = "MapHeight")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger mapHeight;
    @XmlAttribute(name = "MapWidth")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger mapWidth;
    @XmlAttribute(name = "DuplicateInd")
    protected Boolean duplicateInd;
    @XmlAttribute(name = "PricingMethod")
    protected String pricingMethod;

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
     * 获取availRequestSegments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRQ.AvailRequestSegments }
     *     
     */
    public OTAHotelAvailRQ.AvailRequestSegments getAvailRequestSegments() {
        return availRequestSegments;
    }

    /**
     * 设置availRequestSegments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRQ.AvailRequestSegments }
     *     
     */
    public void setAvailRequestSegments(OTAHotelAvailRQ.AvailRequestSegments value) {
        this.availRequestSegments = value;
    }

    /**
     * 获取hotelReservationIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelReservationIDsTypeHotelReservationID }
     *     
     */
    public ArrayOfHotelReservationIDsTypeHotelReservationID getHotelReservationIDs() {
        return hotelReservationIDs;
    }

    /**
     * 设置hotelReservationIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelReservationIDsTypeHotelReservationID }
     *     
     */
    public void setHotelReservationIDs(ArrayOfHotelReservationIDsTypeHotelReservationID value) {
        this.hotelReservationIDs = value;
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
     *     {@link String }
     *     
     */
    public String getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * 设置sequenceNmbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNmbr(String value) {
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
     * 获取summaryOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSummaryOnly() {
        return summaryOnly;
    }

    /**
     * 设置summaryOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSummaryOnly(Boolean value) {
        this.summaryOnly = value;
    }

    /**
     * 获取sortOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置sortOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

    /**
     * 获取availRatesOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailRatesOnly() {
        return availRatesOnly;
    }

    /**
     * 设置availRatesOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailRatesOnly(Boolean value) {
        this.availRatesOnly = value;
    }

    /**
     * 获取onRequestInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnRequestInd() {
        return onRequestInd;
    }

    /**
     * 设置onRequestInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnRequestInd(Boolean value) {
        this.onRequestInd = value;
    }

    /**
     * 获取bestOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOnly() {
        return bestOnly;
    }

    /**
     * 设置bestOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOnly(Boolean value) {
        this.bestOnly = value;
    }

    /**
     * 获取rateRangeOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateRangeOnly() {
        return rateRangeOnly;
    }

    /**
     * 设置rateRangeOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateRangeOnly(Boolean value) {
        this.rateRangeOnly = value;
    }

    /**
     * 获取exactMatchOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExactMatchOnly() {
        return exactMatchOnly;
    }

    /**
     * 设置exactMatchOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExactMatchOnly(Boolean value) {
        this.exactMatchOnly = value;
    }

    /**
     * 获取allowPartialAvail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPartialAvail() {
        return allowPartialAvail;
    }

    /**
     * 设置allowPartialAvail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPartialAvail(Boolean value) {
        this.allowPartialAvail = value;
    }

    /**
     * 获取requestedCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedCurrency() {
        return requestedCurrency;
    }

    /**
     * 设置requestedCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedCurrency(String value) {
        this.requestedCurrency = value;
    }

    /**
     * 获取requestedCurrencyIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestedCurrencyIndicator() {
        return requestedCurrencyIndicator;
    }

    /**
     * 设置requestedCurrencyIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestedCurrencyIndicator(Boolean value) {
        this.requestedCurrencyIndicator = value;
    }

    /**
     * 获取isModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsModify() {
        return isModify;
    }

    /**
     * 设置isModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsModify(Boolean value) {
        this.isModify = value;
    }

    /**
     * 获取maxResponses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxResponses() {
        return maxResponses;
    }

    /**
     * 设置maxResponses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxResponses(BigInteger value) {
        this.maxResponses = value;
    }

    /**
     * 获取searchCacheLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCacheLevel() {
        return searchCacheLevel;
    }

    /**
     * 设置searchCacheLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCacheLevel(String value) {
        this.searchCacheLevel = value;
    }

    /**
     * 获取hotelStayOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHotelStayOnly() {
        return hotelStayOnly;
    }

    /**
     * 设置hotelStayOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHotelStayOnly(Boolean value) {
        this.hotelStayOnly = value;
    }

    /**
     * 获取rateDetailsInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateDetailsInd() {
        return rateDetailsInd;
    }

    /**
     * 设置rateDetailsInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateDetailsInd(Boolean value) {
        this.rateDetailsInd = value;
    }

    /**
     * 获取mapRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMapRequired() {
        return mapRequired;
    }

    /**
     * 设置mapRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMapRequired(Boolean value) {
        this.mapRequired = value;
    }

    /**
     * 获取mapHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMapHeight() {
        return mapHeight;
    }

    /**
     * 设置mapHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMapHeight(BigInteger value) {
        this.mapHeight = value;
    }

    /**
     * 获取mapWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMapWidth() {
        return mapWidth;
    }

    /**
     * 设置mapWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMapWidth(BigInteger value) {
        this.mapWidth = value;
    }

    /**
     * 获取duplicateInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicateInd() {
        return duplicateInd;
    }

    /**
     * 设置duplicateInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicateInd(Boolean value) {
        this.duplicateInd = value;
    }

    /**
     * 获取pricingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingMethod() {
        return pricingMethod;
    }

    /**
     * 设置pricingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingMethod(String value) {
        this.pricingMethod = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailRequestSegmentsType"&gt;
     *       &lt;attribute name="MaximumWaitTime" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AvailRequestSegments
        extends AvailRequestSegmentsType
    {

        @XmlAttribute(name = "MaximumWaitTime")
        protected BigDecimal maximumWaitTime;

        /**
         * 获取maximumWaitTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaximumWaitTime() {
            return maximumWaitTime;
        }

        /**
         * 设置maximumWaitTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaximumWaitTime(BigDecimal value) {
            this.maximumWaitTime = value;
        }

    }

}
