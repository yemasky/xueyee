
package ota.jw.GenericSeamlessGateway;

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
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *           &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/&gt;
 *           &lt;element name="RebatePrograms" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="RebateProgram" type="{http://www.opentravel.org/OTA/2003/05}RebateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Areas" type="{http://www.opentravel.org/OTA/2003/05}AreasType" minOccurs="0"/&gt;
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/&gt;
 *           &lt;element name="HotelStays" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="HotelStay" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Availability" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;attribute name="RestrictionType"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value="MinLOS"/&gt;
 *                                                       &lt;enumeration value="MaxLOS"/&gt;
 *                                                       &lt;enumeration value="FixedLOS"/&gt;
 *                                                       &lt;enumeration value="MinAdvanceBook"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                                 &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;attribute name="Status" use="required" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
 *                                       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="BasicPropertyInfo" type="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfoType" minOccurs="0"/&gt;
 *                               &lt;element name="Price" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;attribute name="Decimal" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attribute name="RoomStayRPH"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Criteria" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Criterion" type="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriterionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/&gt;
 *           &lt;element name="RoomStays" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Reference" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
 *                                       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                     &lt;/extension&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                             &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" /&gt;
 *                             &lt;attribute name="ResponseType"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="PropertyList"/&gt;
 *                                   &lt;enumeration value="AreaList"/&gt;
 *                                   &lt;enumeration value="PropertyRateList"/&gt;
 *                                   &lt;enumeration value="RateInfoDetails"/&gt;
 *                                   &lt;enumeration value="ProfilePrefs"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                             &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="AvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
 *           &lt;element name="CurrencyConversions" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="CurrencyConversion" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;attribute name="RateConversion" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                             &lt;attribute name="SourceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="RequestedCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                             &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ServicesType" minOccurs="0"/&gt;
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
 *       &lt;attribute name="SearchCacheLevel"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Live"/&gt;
 *             &lt;enumeration value="VeryRecent"/&gt;
 *             &lt;enumeration value="LessRecent"/&gt;
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
    "tpaExtensionsOrProfilesOrRebatePrograms"
})
@XmlRootElement(name = "OTA_HotelAvailRS")
public class OTAHotelAvailRS {

    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElements({
        @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class),
        @XmlElement(name = "Profiles", type = ProfilesType.class),
        @XmlElement(name = "RebatePrograms", type = OTAHotelAvailRS.RebatePrograms.class),
        @XmlElement(name = "Areas", type = AreasType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "HotelStays", type = OTAHotelAvailRS.HotelStays.class),
        @XmlElement(name = "Criteria", type = OTAHotelAvailRS.Criteria.class),
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "RoomStays", type = OTAHotelAvailRS.RoomStays.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "CurrencyConversions", type = OTAHotelAvailRS.CurrencyConversions.class),
        @XmlElement(name = "Services", type = ServicesType.class)
    })
    protected List<Object> tpaExtensionsOrProfilesOrRebatePrograms;
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
    @XmlAttribute(name = "SearchCacheLevel")
    protected String searchCacheLevel;

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
     * Gets the value of the tpaExtensionsOrProfilesOrRebatePrograms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpaExtensionsOrProfilesOrRebatePrograms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPAExtensionsOrProfilesOrRebatePrograms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPAExtensionsType }
     * {@link ProfilesType }
     * {@link OTAHotelAvailRS.RebatePrograms }
     * {@link AreasType }
     * {@link ErrorsType }
     * {@link OTAHotelAvailRS.HotelStays }
     * {@link OTAHotelAvailRS.Criteria }
     * {@link SuccessType }
     * {@link OTAHotelAvailRS.RoomStays }
     * {@link WarningsType }
     * {@link OTAHotelAvailRS.CurrencyConversions }
     * {@link ServicesType }
     * 
     * 
     */
    public List<Object> getTPAExtensionsOrProfilesOrRebatePrograms() {
        if (tpaExtensionsOrProfilesOrRebatePrograms == null) {
            tpaExtensionsOrProfilesOrRebatePrograms = new ArrayList<Object>();
        }
        return this.tpaExtensionsOrProfilesOrRebatePrograms;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Criterion" type="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriterionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "criterion"
    })
    public static class Criteria {

        @XmlElement(name = "Criterion")
        protected List<HotelSearchCriterionType> criterion;

        /**
         * Gets the value of the criterion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the criterion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCriterion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelSearchCriterionType }
         * 
         * 
         */
        public List<HotelSearchCriterionType> getCriterion() {
            if (criterion == null) {
                criterion = new ArrayList<HotelSearchCriterionType>();
            }
            return this.criterion;
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
     *         &lt;element name="CurrencyConversion" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="RateConversion" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="SourceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RequestedCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "currencyConversion"
    })
    public static class CurrencyConversions {

        @XmlElement(name = "CurrencyConversion")
        protected List<OTAHotelAvailRS.CurrencyConversions.CurrencyConversion> currencyConversion;

        /**
         * Gets the value of the currencyConversion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the currencyConversion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCurrencyConversion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelAvailRS.CurrencyConversions.CurrencyConversion }
         * 
         * 
         */
        public List<OTAHotelAvailRS.CurrencyConversions.CurrencyConversion> getCurrencyConversion() {
            if (currencyConversion == null) {
                currencyConversion = new ArrayList<OTAHotelAvailRS.CurrencyConversions.CurrencyConversion>();
            }
            return this.currencyConversion;
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
         *       &lt;attribute name="RateConversion" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="SourceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RequestedCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CurrencyConversion {

            @XmlAttribute(name = "RateConversion")
            protected BigDecimal rateConversion;
            @XmlAttribute(name = "SourceCurrencyCode")
            protected String sourceCurrencyCode;
            @XmlAttribute(name = "RequestedCurrencyCode")
            protected String requestedCurrencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;
            @XmlAttribute(name = "Source")
            protected String source;

            /**
             * 获取rateConversion属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRateConversion() {
                return rateConversion;
            }

            /**
             * 设置rateConversion属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRateConversion(BigDecimal value) {
                this.rateConversion = value;
            }

            /**
             * 获取sourceCurrencyCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceCurrencyCode() {
                return sourceCurrencyCode;
            }

            /**
             * 设置sourceCurrencyCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceCurrencyCode(String value) {
                this.sourceCurrencyCode = value;
            }

            /**
             * 获取requestedCurrencyCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestedCurrencyCode() {
                return requestedCurrencyCode;
            }

            /**
             * 设置requestedCurrencyCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestedCurrencyCode(String value) {
                this.requestedCurrencyCode = value;
            }

            /**
             * 获取decimalPlaces属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * 设置decimalPlaces属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }

            /**
             * 获取source属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * 设置source属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
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
     *         &lt;element name="HotelStay" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Availability" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="RestrictionType"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;enumeration value="MinLOS"/&gt;
     *                                           &lt;enumeration value="MaxLOS"/&gt;
     *                                           &lt;enumeration value="FixedLOS"/&gt;
     *                                           &lt;enumeration value="MinAdvanceBook"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                     &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="Status" use="required" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
     *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="BasicPropertyInfo" type="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfoType" minOccurs="0"/&gt;
     *                   &lt;element name="Price" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                           &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Decimal" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="RoomStayRPH"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "hotelStay"
    })
    public static class HotelStays {

        @XmlElement(name = "HotelStay")
        protected List<OTAHotelAvailRS.HotelStays.HotelStay> hotelStay;

        /**
         * Gets the value of the hotelStay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelStay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelStay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelAvailRS.HotelStays.HotelStay }
         * 
         * 
         */
        public List<OTAHotelAvailRS.HotelStays.HotelStay> getHotelStay() {
            if (hotelStay == null) {
                hotelStay = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay>();
            }
            return this.hotelStay;
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
         *         &lt;element name="Availability" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="RestrictionType"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;enumeration value="MinLOS"/&gt;
         *                                 &lt;enumeration value="MaxLOS"/&gt;
         *                                 &lt;enumeration value="FixedLOS"/&gt;
         *                                 &lt;enumeration value="MinAdvanceBook"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                           &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="Status" use="required" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
         *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="BasicPropertyInfo" type="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfoType" minOccurs="0"/&gt;
         *         &lt;element name="Price" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                 &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Decimal" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="RoomStayRPH"&gt;
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
            "availability",
            "basicPropertyInfo",
            "price"
        })
        public static class HotelStay {

            @XmlElement(name = "Availability")
            protected List<OTAHotelAvailRS.HotelStays.HotelStay.Availability> availability;
            @XmlElement(name = "BasicPropertyInfo")
            protected BasicPropertyInfoType basicPropertyInfo;
            @XmlElement(name = "Price")
            protected List<OTAHotelAvailRS.HotelStays.HotelStay.Price> price;
            @XmlAttribute(name = "RoomStayRPH")
            protected List<String> roomStayRPH;

            /**
             * Gets the value of the availability property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the availability property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAvailability().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAHotelAvailRS.HotelStays.HotelStay.Availability }
             * 
             * 
             */
            public List<OTAHotelAvailRS.HotelStays.HotelStay.Availability> getAvailability() {
                if (availability == null) {
                    availability = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay.Availability>();
                }
                return this.availability;
            }

            /**
             * 获取basicPropertyInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BasicPropertyInfoType }
             *     
             */
            public BasicPropertyInfoType getBasicPropertyInfo() {
                return basicPropertyInfo;
            }

            /**
             * 设置basicPropertyInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BasicPropertyInfoType }
             *     
             */
            public void setBasicPropertyInfo(BasicPropertyInfoType value) {
                this.basicPropertyInfo = value;
            }

            /**
             * Gets the value of the price property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the price property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAHotelAvailRS.HotelStays.HotelStay.Price }
             * 
             * 
             */
            public List<OTAHotelAvailRS.HotelStays.HotelStay.Price> getPrice() {
                if (price == null) {
                    price = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay.Price>();
                }
                return this.price;
            }

            /**
             * Gets the value of the roomStayRPH property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roomStayRPH property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoomStayRPH().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getRoomStayRPH() {
                if (roomStayRPH == null) {
                    roomStayRPH = new ArrayList<String>();
                }
                return this.roomStayRPH;
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
             *         &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="RestrictionType"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;enumeration value="MinLOS"/&gt;
             *                       &lt;enumeration value="MaxLOS"/&gt;
             *                       &lt;enumeration value="FixedLOS"/&gt;
             *                       &lt;enumeration value="MinAdvanceBook"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *                 &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="Status" use="required" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
             *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "restriction"
            })
            public static class Availability {

                @XmlElement(name = "Restriction")
                protected List<OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction> restriction;
                @XmlAttribute(name = "Status", required = true)
                protected AvailabilityStatusType status;
                @XmlAttribute(name = "Start")
                protected String start;
                @XmlAttribute(name = "Duration")
                protected String duration;
                @XmlAttribute(name = "End")
                protected String end;

                /**
                 * Gets the value of the restriction property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the restriction property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRestriction().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction }
                 * 
                 * 
                 */
                public List<OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction> getRestriction() {
                    if (restriction == null) {
                        restriction = new ArrayList<OTAHotelAvailRS.HotelStays.HotelStay.Availability.Restriction>();
                    }
                    return this.restriction;
                }

                /**
                 * 获取status属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link AvailabilityStatusType }
                 *     
                 */
                public AvailabilityStatusType getStatus() {
                    return status;
                }

                /**
                 * 设置status属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AvailabilityStatusType }
                 *     
                 */
                public void setStatus(AvailabilityStatusType value) {
                    this.status = value;
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
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="RestrictionType"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;enumeration value="MinLOS"/&gt;
                 *             &lt;enumeration value="MaxLOS"/&gt;
                 *             &lt;enumeration value="FixedLOS"/&gt;
                 *             &lt;enumeration value="MinAdvanceBook"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *       &lt;attribute name="TimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Restriction {

                    @XmlAttribute(name = "RestrictionType")
                    protected String restrictionType;
                    @XmlAttribute(name = "Time")
                    protected BigInteger time;
                    @XmlAttribute(name = "TimeUnit")
                    protected TimeUnitType timeUnit;

                    /**
                     * 获取restrictionType属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRestrictionType() {
                        return restrictionType;
                    }

                    /**
                     * 设置restrictionType属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRestrictionType(String value) {
                        this.restrictionType = value;
                    }

                    /**
                     * 获取time属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTime() {
                        return time;
                    }

                    /**
                     * 设置time属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTime(BigInteger value) {
                        this.time = value;
                    }

                    /**
                     * 获取timeUnit属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link TimeUnitType }
                     *     
                     */
                    public TimeUnitType getTimeUnit() {
                        return timeUnit;
                    }

                    /**
                     * 设置timeUnit属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TimeUnitType }
                     *     
                     */
                    public void setTimeUnit(TimeUnitType value) {
                        this.timeUnit = value;
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
             *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="Decimal" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Price {

                @XmlAttribute(name = "Start")
                protected String start;
                @XmlAttribute(name = "Duration")
                protected String duration;
                @XmlAttribute(name = "End")
                protected String end;
                @XmlAttribute(name = "AmountBeforeTax")
                protected BigDecimal amountBeforeTax;
                @XmlAttribute(name = "AmountAfterTax")
                protected BigDecimal amountAfterTax;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "Decimal")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimal;

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
                 * 获取amountBeforeTax属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmountBeforeTax() {
                    return amountBeforeTax;
                }

                /**
                 * 设置amountBeforeTax属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmountBeforeTax(BigDecimal value) {
                    this.amountBeforeTax = value;
                }

                /**
                 * 获取amountAfterTax属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmountAfterTax() {
                    return amountAfterTax;
                }

                /**
                 * 设置amountAfterTax属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmountAfterTax(BigDecimal value) {
                    this.amountAfterTax = value;
                }

                /**
                 * 获取currencyCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * 设置currencyCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                /**
                 * 获取decimal属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDecimal() {
                    return decimal;
                }

                /**
                 * 设置decimal属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDecimal(BigInteger value) {
                    this.decimal = value;
                }

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
     *         &lt;element name="RebateProgram" type="{http://www.opentravel.org/OTA/2003/05}RebateType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "rebateProgram"
    })
    public static class RebatePrograms {

        @XmlElement(name = "RebateProgram")
        protected List<RebateType> rebateProgram;

        /**
         * Gets the value of the rebateProgram property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rebateProgram property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRebateProgram().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RebateType }
         * 
         * 
         */
        public List<RebateType> getRebateProgram() {
            if (rebateProgram == null) {
                rebateProgram = new ArrayList<RebateType>();
            }
            return this.rebateProgram;
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
     *         &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Reference" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
     *                           &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" /&gt;
     *                 &lt;attribute name="ResponseType"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="PropertyList"/&gt;
     *                       &lt;enumeration value="AreaList"/&gt;
     *                       &lt;enumeration value="PropertyRateList"/&gt;
     *                       &lt;enumeration value="RateInfoDetails"/&gt;
     *                       &lt;enumeration value="ProfilePrefs"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="AvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomStay"
    })
    public static class RoomStays {

        @XmlElement(name = "RoomStay")
        protected List<OTAHotelAvailRS.RoomStays.RoomStay> roomStay;
        @XmlAttribute(name = "MoreIndicator")
        protected String moreIndicator;
        @XmlAttribute(name = "SortOrder")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger sortOrder;

        /**
         * Gets the value of the roomStay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomStay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomStay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAHotelAvailRS.RoomStays.RoomStay }
         * 
         * 
         */
        public List<OTAHotelAvailRS.RoomStays.RoomStay> getRoomStay() {
            if (roomStay == null) {
                roomStay = new ArrayList<OTAHotelAvailRS.RoomStays.RoomStay>();
            }
            return this.roomStay;
        }

        /**
         * 获取moreIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoreIndicator() {
            return moreIndicator;
        }

        /**
         * 设置moreIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoreIndicator(String value) {
            this.moreIndicator = value;
        }

        /**
         * 获取sortOrder属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSortOrder() {
            return sortOrder;
        }

        /**
         * 设置sortOrder属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSortOrder(BigInteger value) {
            this.sortOrder = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Reference" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
         *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" /&gt;
         *       &lt;attribute name="ResponseType"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="PropertyList"/&gt;
         *             &lt;enumeration value="AreaList"/&gt;
         *             &lt;enumeration value="PropertyRateList"/&gt;
         *             &lt;enumeration value="RateInfoDetails"/&gt;
         *             &lt;enumeration value="ProfilePrefs"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="AvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "reference",
            "serviceRPHs"
        })
        public static class RoomStay
            extends RoomStayType
        {

            @XmlElement(name = "Reference")
            protected OTAHotelAvailRS.RoomStays.RoomStay.Reference reference;
            @XmlElement(name = "ServiceRPHs")
            protected ArrayOfServiceRPHsTypeServiceRPH serviceRPHs;
            @XmlAttribute(name = "IsAlternate")
            protected Boolean isAlternate;
            @XmlAttribute(name = "AvailabilityStatus")
            protected RateIndicatorType availabilityStatus;
            @XmlAttribute(name = "ResponseType")
            protected String responseType;
            @XmlAttribute(name = "RoomStayCandidateRPH")
            protected String roomStayCandidateRPH;
            @XmlAttribute(name = "MoreDataEchoToken")
            protected String moreDataEchoToken;
            @XmlAttribute(name = "InfoSource")
            protected String infoSource;
            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "AvailableIndicator")
            protected Boolean availableIndicator;

            /**
             * 获取reference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.Reference }
             *     
             */
            public OTAHotelAvailRS.RoomStays.RoomStay.Reference getReference() {
                return reference;
            }

            /**
             * 设置reference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OTAHotelAvailRS.RoomStays.RoomStay.Reference }
             *     
             */
            public void setReference(OTAHotelAvailRS.RoomStays.RoomStay.Reference value) {
                this.reference = value;
            }

            /**
             * 获取serviceRPHs属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfServiceRPHsTypeServiceRPH }
             *     
             */
            public ArrayOfServiceRPHsTypeServiceRPH getServiceRPHs() {
                return serviceRPHs;
            }

            /**
             * 设置serviceRPHs属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfServiceRPHsTypeServiceRPH }
             *     
             */
            public void setServiceRPHs(ArrayOfServiceRPHsTypeServiceRPH value) {
                this.serviceRPHs = value;
            }

            /**
             * 获取isAlternate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsAlternate() {
                return isAlternate;
            }

            /**
             * 设置isAlternate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsAlternate(Boolean value) {
                this.isAlternate = value;
            }

            /**
             * 获取availabilityStatus属性的值。
             * 
             * @return
             *     possible object is
             *     {@link RateIndicatorType }
             *     
             */
            public RateIndicatorType getAvailabilityStatus() {
                return availabilityStatus;
            }

            /**
             * 设置availabilityStatus属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link RateIndicatorType }
             *     
             */
            public void setAvailabilityStatus(RateIndicatorType value) {
                this.availabilityStatus = value;
            }

            /**
             * 获取responseType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponseType() {
                return responseType;
            }

            /**
             * 设置responseType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponseType(String value) {
                this.responseType = value;
            }

            /**
             * 获取roomStayCandidateRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomStayCandidateRPH() {
                return roomStayCandidateRPH;
            }

            /**
             * 设置roomStayCandidateRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomStayCandidateRPH(String value) {
                this.roomStayCandidateRPH = value;
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
             * 获取infoSource属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfoSource() {
                return infoSource;
            }

            /**
             * 设置infoSource属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfoSource(String value) {
                this.infoSource = value;
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
             * 获取availableIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAvailableIndicator() {
                return availableIndicator;
            }

            /**
             * 设置availableIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAvailableIndicator(Boolean value) {
                this.availableIndicator = value;
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
             *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Reference
                extends UniqueIDType
            {

                @XmlAttribute(name = "DateTime")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar dateTime;

                /**
                 * 获取dateTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDateTime() {
                    return dateTime;
                }

                /**
                 * 设置dateTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDateTime(XMLGregorianCalendar value) {
                    this.dateTime = value;
                }

            }

        }

    }

}
