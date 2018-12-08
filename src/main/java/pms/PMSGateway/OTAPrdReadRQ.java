package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;


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
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="ReadRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Airport" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UserID" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                           &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Verification" type="{http://www.opentravel.org/OTA/2003/05}VerificationType" minOccurs="0"/>
 *                   &lt;element name="SelectionCriteria" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DateType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="ArrivalDate"/>
 *                                 &lt;enumeration value="DepartureDate"/>
 *                                 &lt;enumeration value="CreateDate"/>
 *                                 &lt;enumeration value="LastUpdateDate"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="SelectionType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="All"/>
 *                                 &lt;enumeration value="PreviouslyDelivered"/>
 *                                 &lt;enumeration value="Undelivered"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="OriginalDeliveryMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *       &lt;attribute name="ReqRespVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReservationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReturnListIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pos",
        "uniqueID",
        "readRequests"
})
@XmlRootElement(name = "OTA_PrdReadRQ")
public class OTAPrdReadRQ {

    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "ReadRequests")
    protected OTAPrdReadRQ.ReadRequests readRequests;
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
     * ��ȡpos���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfSourceType }
     */
    public ArrayOfSourceType getPOS() {
        return pos;
    }

    /**
     * ����pos���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfSourceType }
     */
    public void setPOS(ArrayOfSourceType value) {
        this.pos = value;
    }

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
     * ��ȡreadRequests���Ե�ֵ��
     *
     * @return possible object is
     * {@link OTAPrdReadRQ.ReadRequests }
     */
    public OTAPrdReadRQ.ReadRequests getReadRequests() {
        return readRequests;
    }

    /**
     * ����readRequests���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OTAPrdReadRQ.ReadRequests }
     */
    public void setReadRequests(OTAPrdReadRQ.ReadRequests value) {
        this.readRequests = value;
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
     * ��ȡreqRespVersion���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getReqRespVersion() {
        return reqRespVersion;
    }

    /**
     * ����reqRespVersion���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReqRespVersion(String value) {
        this.reqRespVersion = value;
    }

    /**
     * ��ȡreservationType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getReservationType() {
        return reservationType;
    }

    /**
     * ����reservationType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReservationType(String value) {
        this.reservationType = value;
    }

    /**
     * ��ȡreturnListIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReturnListIndicator() {
        return returnListIndicator;
    }

    /**
     * ����returnListIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReturnListIndicator(Boolean value) {
        this.returnListIndicator = value;
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
     *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Airport" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UserID" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *                 &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Verification" type="{http://www.opentravel.org/OTA/2003/05}VerificationType" minOccurs="0"/>
     *         &lt;element name="SelectionCriteria" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DateType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="ArrivalDate"/>
     *                       &lt;enumeration value="DepartureDate"/>
     *                       &lt;enumeration value="CreateDate"/>
     *                       &lt;enumeration value="LastUpdateDate"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="SelectionType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="All"/>
     *                       &lt;enumeration value="PreviouslyDelivered"/>
     *                       &lt;enumeration value="Undelivered"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="OriginalDeliveryMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
        protected OTAPrdReadRQ.ReadRequests.Airport airport;
        @XmlElement(name = "UserID")
        protected OTAPrdReadRQ.ReadRequests.UserID userID;
        @XmlElement(name = "Verification")
        protected VerificationType verification;
        @XmlElement(name = "SelectionCriteria")
        protected OTAPrdReadRQ.ReadRequests.SelectionCriteria selectionCriteria;
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
         * ��ȡcityName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCityName() {
            return cityName;
        }

        /**
         * ����cityName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCityName(String value) {
            this.cityName = value;
        }

        /**
         * ��ȡairport���Ե�ֵ��
         *
         * @return possible object is
         * {@link OTAPrdReadRQ.ReadRequests.Airport }
         */
        public OTAPrdReadRQ.ReadRequests.Airport getAirport() {
            return airport;
        }

        /**
         * ����airport���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OTAPrdReadRQ.ReadRequests.Airport }
         */
        public void setAirport(OTAPrdReadRQ.ReadRequests.Airport value) {
            this.airport = value;
        }

        /**
         * ��ȡuserID���Ե�ֵ��
         *
         * @return possible object is
         * {@link OTAPrdReadRQ.ReadRequests.UserID }
         */
        public OTAPrdReadRQ.ReadRequests.UserID getUserID() {
            return userID;
        }

        /**
         * ����userID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OTAPrdReadRQ.ReadRequests.UserID }
         */
        public void setUserID(OTAPrdReadRQ.ReadRequests.UserID value) {
            this.userID = value;
        }

        /**
         * ��ȡverification���Ե�ֵ��
         *
         * @return possible object is
         * {@link VerificationType }
         */
        public VerificationType getVerification() {
            return verification;
        }

        /**
         * ����verification���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link VerificationType }
         */
        public void setVerification(VerificationType value) {
            this.verification = value;
        }

        /**
         * ��ȡselectionCriteria���Ե�ֵ��
         *
         * @return possible object is
         * {@link OTAPrdReadRQ.ReadRequests.SelectionCriteria }
         */
        public OTAPrdReadRQ.ReadRequests.SelectionCriteria getSelectionCriteria() {
            return selectionCriteria;
        }

        /**
         * ����selectionCriteria���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OTAPrdReadRQ.ReadRequests.SelectionCriteria }
         */
        public void setSelectionCriteria(OTAPrdReadRQ.ReadRequests.SelectionCriteria value) {
            this.selectionCriteria = value;
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
         * ��ȡchainCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getChainCode() {
            return chainCode;
        }

        /**
         * ����chainCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setChainCode(String value) {
            this.chainCode = value;
        }

        /**
         * ��ȡbrandCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBrandCode() {
            return brandCode;
        }

        /**
         * ����brandCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBrandCode(String value) {
            this.brandCode = value;
        }

        /**
         * ��ȡhotelCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getHotelCode() {
            return hotelCode;
        }

        /**
         * ����hotelCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setHotelCode(String value) {
            this.hotelCode = value;
        }

        /**
         * ��ȡhotelCityCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getHotelCityCode() {
            return hotelCityCode;
        }

        /**
         * ����hotelCityCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setHotelCityCode(String value) {
            this.hotelCityCode = value;
        }

        /**
         * ��ȡhotelName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getHotelName() {
            return hotelName;
        }

        /**
         * ����hotelName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setHotelName(String value) {
            this.hotelName = value;
        }

        /**
         * ��ȡhotelCodeContext���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getHotelCodeContext() {
            return hotelCodeContext;
        }

        /**
         * ����hotelCodeContext���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setHotelCodeContext(String value) {
            this.hotelCodeContext = value;
        }

        /**
         * ��ȡchainName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getChainName() {
            return chainName;
        }

        /**
         * ����chainName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setChainName(String value) {
            this.chainName = value;
        }

        /**
         * ��ȡbrandName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBrandName() {
            return brandName;
        }

        /**
         * ����brandName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBrandName(String value) {
            this.brandName = value;
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
         *       &lt;attribute name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡairportName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAirportName() {
                return airportName;
            }

            /**
             * ����airportName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAirportName(String value) {
                this.airportName = value;
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
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DateType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="ArrivalDate"/>
         *             &lt;enumeration value="DepartureDate"/>
         *             &lt;enumeration value="CreateDate"/>
         *             &lt;enumeration value="LastUpdateDate"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="SelectionType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="All"/>
         *             &lt;enumeration value="PreviouslyDelivered"/>
         *             &lt;enumeration value="Undelivered"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="OriginalDeliveryMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡdateType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getDateType() {
                return dateType;
            }

            /**
             * ����dateType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDateType(String value) {
                this.dateType = value;
            }

            /**
             * ��ȡselectionType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getSelectionType() {
                return selectionType;
            }

            /**
             * ����selectionType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSelectionType(String value) {
                this.selectionType = value;
            }

            /**
             * ��ȡgroupCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getGroupCode() {
                return groupCode;
            }

            /**
             * ����groupCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setGroupCode(String value) {
                this.groupCode = value;
            }

            /**
             * ��ȡresStatus���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getResStatus() {
                return resStatus;
            }

            /**
             * ����resStatus���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setResStatus(String value) {
                this.resStatus = value;
            }

            /**
             * ��ȡoriginalDeliveryMethodCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getOriginalDeliveryMethodCode() {
                return originalDeliveryMethodCode;
            }

            /**
             * ����originalDeliveryMethodCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOriginalDeliveryMethodCode(String value) {
                this.originalDeliveryMethodCode = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
         *       &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UserID
                extends UniqueIDType {

            @XmlAttribute(name = "PinNumber")
            protected String pinNumber;

            /**
             * ��ȡpinNumber���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getPinNumber() {
                return pinNumber;
            }

            /**
             * ����pinNumber���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPinNumber(String value) {
                this.pinNumber = value;
            }

        }

    }

}
