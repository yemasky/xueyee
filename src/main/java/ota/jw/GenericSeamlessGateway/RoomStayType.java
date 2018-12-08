
package ota.jw.GenericSeamlessGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * <p>RoomStayType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomStayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomTypeType" minOccurs="0"/&gt;
 *         &lt;element name="RatePlans" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanType" minOccurs="0"/&gt;
 *         &lt;element name="RoomRates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RoomRate" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomRateType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AdvanceBookingRestriction" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                                     &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                                     &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Restrictions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStayTypeRoomRatesRoomRateRestriction" minOccurs="0"/&gt;
 *                             &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/&gt;
 *                             &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="MoreRatesExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/&gt;
 *         &lt;element name="TimeSpan" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/&gt;
 *         &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DepositPayments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/&gt;
 *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.opentravel.org/OTA/2003/05}DiscountType" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/&gt;
 *         &lt;element name="BasicPropertyInfo" type="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfoType" minOccurs="0"/&gt;
 *         &lt;element name="MapURL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *                 &lt;attribute name="BottomRightLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="BottomRightLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="TopLeftLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="TopLeftLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="ZoomFactor" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MarketCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SourceOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PromotionVendorCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RoomStayStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WarningRPH"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RoomStayLanguage" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomStayType", propOrder = {
    "roomTypes",
    "ratePlans",
    "roomRates",
    "guestCounts",
    "timeSpan",
    "guarantee",
    "depositPayments",
    "cancelPenalties",
    "discount",
    "total",
    "basicPropertyInfo",
    "mapURL",
    "tpaExtensions"
})
@XmlSeeAlso({
    ota.jw.GenericSeamlessGateway.ArrayOfRoomStaysTypeRoomStay.RoomStay.class
})
public class RoomStayType {

    @XmlElement(name = "RoomTypes")
    protected ArrayOfRoomTypeType roomTypes;
    @XmlElement(name = "RatePlans")
    protected ArrayOfRatePlanType ratePlans;
    @XmlElement(name = "RoomRates")
    protected RoomStayType.RoomRates roomRates;
    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "TimeSpan")
    protected DateTimeSpanType timeSpan;
    @XmlElement(name = "Guarantee")
    protected List<GuaranteeType> guarantee;
    @XmlElement(name = "DepositPayments")
    protected ArrayOfRequiredPaymentsTypeGuaranteePayment depositPayments;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "Discount")
    protected DiscountType discount;
    @XmlElement(name = "Total")
    protected TotalType total;
    @XmlElement(name = "BasicPropertyInfo")
    protected BasicPropertyInfoType basicPropertyInfo;
    @XmlElement(name = "MapURL")
    protected RoomStayType.MapURL mapURL;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "MarketCode")
    protected String marketCode;
    @XmlAttribute(name = "SourceOfBusiness")
    protected String sourceOfBusiness;
    @XmlAttribute(name = "DiscountCode")
    protected String discountCode;
    @XmlAttribute(name = "PromotionCode")
    protected String promotionCode;
    @XmlAttribute(name = "PromotionVendorCode")
    protected List<String> promotionVendorCode;
    @XmlAttribute(name = "RoomStayStatus")
    protected String roomStayStatus;
    @XmlAttribute(name = "WarningRPH")
    protected List<String> warningRPH;
    @XmlAttribute(name = "RoomStayLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String roomStayLanguage;

    /**
     * 获取roomTypes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomTypeType }
     *     
     */
    public ArrayOfRoomTypeType getRoomTypes() {
        return roomTypes;
    }

    /**
     * 设置roomTypes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomTypeType }
     *     
     */
    public void setRoomTypes(ArrayOfRoomTypeType value) {
        this.roomTypes = value;
    }

    /**
     * 获取ratePlans属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatePlanType }
     *     
     */
    public ArrayOfRatePlanType getRatePlans() {
        return ratePlans;
    }

    /**
     * 设置ratePlans属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatePlanType }
     *     
     */
    public void setRatePlans(ArrayOfRatePlanType value) {
        this.ratePlans = value;
    }

    /**
     * 获取roomRates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomStayType.RoomRates }
     *     
     */
    public RoomStayType.RoomRates getRoomRates() {
        return roomRates;
    }

    /**
     * 设置roomRates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStayType.RoomRates }
     *     
     */
    public void setRoomRates(RoomStayType.RoomRates value) {
        this.roomRates = value;
    }

    /**
     * 获取guestCounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * 设置guestCounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * 获取timeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getTimeSpan() {
        return timeSpan;
    }

    /**
     * 设置timeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setTimeSpan(DateTimeSpanType value) {
        this.timeSpan = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeType }
     * 
     * 
     */
    public List<GuaranteeType> getGuarantee() {
        if (guarantee == null) {
            guarantee = new ArrayList<GuaranteeType>();
        }
        return this.guarantee;
    }

    /**
     * 获取depositPayments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment getDepositPayments() {
        return depositPayments;
    }

    /**
     * 设置depositPayments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public void setDepositPayments(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
        this.depositPayments = value;
    }

    /**
     * 获取cancelPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * 设置cancelPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * 获取discount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscount() {
        return discount;
    }

    /**
     * 设置discount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public void setDiscount(DiscountType value) {
        this.discount = value;
    }

    /**
     * 获取total属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setTotal(TotalType value) {
        this.total = value;
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
     * 获取mapURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomStayType.MapURL }
     *     
     */
    public RoomStayType.MapURL getMapURL() {
        return mapURL;
    }

    /**
     * 设置mapURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStayType.MapURL }
     *     
     */
    public void setMapURL(RoomStayType.MapURL value) {
        this.mapURL = value;
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
     * 获取marketCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * 设置marketCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * 获取sourceOfBusiness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfBusiness() {
        return sourceOfBusiness;
    }

    /**
     * 设置sourceOfBusiness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfBusiness(String value) {
        this.sourceOfBusiness = value;
    }

    /**
     * 获取discountCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * 设置discountCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * 获取promotionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * 设置promotionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the promotionVendorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionVendorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPromotionVendorCode() {
        if (promotionVendorCode == null) {
            promotionVendorCode = new ArrayList<String>();
        }
        return this.promotionVendorCode;
    }

    /**
     * 获取roomStayStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomStayStatus() {
        return roomStayStatus;
    }

    /**
     * 设置roomStayStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomStayStatus(String value) {
        this.roomStayStatus = value;
    }

    /**
     * Gets the value of the warningRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWarningRPH() {
        if (warningRPH == null) {
            warningRPH = new ArrayList<String>();
        }
        return this.warningRPH;
    }

    /**
     * 获取roomStayLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomStayLanguage() {
        return roomStayLanguage;
    }

    /**
     * 设置roomStayLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomStayLanguage(String value) {
        this.roomStayLanguage = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
     *       &lt;attribute name="BottomRightLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="BottomRightLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="TopLeftLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="TopLeftLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="ZoomFactor" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MapURL {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;
        @XmlAttribute(name = "BottomRightLatitude")
        protected BigDecimal bottomRightLatitude;
        @XmlAttribute(name = "BottomRightLongitude")
        protected BigDecimal bottomRightLongitude;
        @XmlAttribute(name = "TopLeftLatitude")
        protected BigDecimal topLeftLatitude;
        @XmlAttribute(name = "TopLeftLongitude")
        protected BigDecimal topLeftLongitude;
        @XmlAttribute(name = "Height")
        protected BigInteger height;
        @XmlAttribute(name = "Width")
        protected BigInteger width;
        @XmlAttribute(name = "ZoomFactor")
        protected BigInteger zoomFactor;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取bottomRightLatitude属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBottomRightLatitude() {
            return bottomRightLatitude;
        }

        /**
         * 设置bottomRightLatitude属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBottomRightLatitude(BigDecimal value) {
            this.bottomRightLatitude = value;
        }

        /**
         * 获取bottomRightLongitude属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBottomRightLongitude() {
            return bottomRightLongitude;
        }

        /**
         * 设置bottomRightLongitude属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBottomRightLongitude(BigDecimal value) {
            this.bottomRightLongitude = value;
        }

        /**
         * 获取topLeftLatitude属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTopLeftLatitude() {
            return topLeftLatitude;
        }

        /**
         * 设置topLeftLatitude属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTopLeftLatitude(BigDecimal value) {
            this.topLeftLatitude = value;
        }

        /**
         * 获取topLeftLongitude属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTopLeftLongitude() {
            return topLeftLongitude;
        }

        /**
         * 设置topLeftLongitude属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTopLeftLongitude(BigDecimal value) {
            this.topLeftLongitude = value;
        }

        /**
         * 获取height属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHeight() {
            return height;
        }

        /**
         * 设置height属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHeight(BigInteger value) {
            this.height = value;
        }

        /**
         * 获取width属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWidth() {
            return width;
        }

        /**
         * 设置width属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWidth(BigInteger value) {
            this.width = value;
        }

        /**
         * 获取zoomFactor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getZoomFactor() {
            return zoomFactor;
        }

        /**
         * 设置zoomFactor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setZoomFactor(BigInteger value) {
            this.zoomFactor = value;
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
     *         &lt;element name="RoomRate" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomRateType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AdvanceBookingRestriction" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *                           &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *                           &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Restrictions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStayTypeRoomRatesRoomRateRestriction" minOccurs="0"/&gt;
     *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/&gt;
     *                   &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="MoreRatesExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomRate",
        "tpaExtensions"
    })
    public static class RoomRates {

        @XmlElement(name = "RoomRate")
        protected List<RoomStayType.RoomRates.RoomRate> roomRate;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "MoreRatesExistInd")
        protected Boolean moreRatesExistInd;

        /**
         * Gets the value of the roomRate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomRate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomStayType.RoomRates.RoomRate }
         * 
         * 
         */
        public List<RoomStayType.RoomRates.RoomRate> getRoomRate() {
            if (roomRate == null) {
                roomRate = new ArrayList<RoomStayType.RoomRates.RoomRate>();
            }
            return this.roomRate;
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
         * 获取moreRatesExistInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMoreRatesExistInd() {
            return moreRatesExistInd;
        }

        /**
         * 设置moreRatesExistInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMoreRatesExistInd(Boolean value) {
            this.moreRatesExistInd = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomRateType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="AdvanceBookingRestriction" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
         *                 &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
         *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Restrictions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStayTypeRoomRatesRoomRateRestriction" minOccurs="0"/&gt;
         *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/&gt;
         *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "advanceBookingRestriction",
            "restrictions",
            "serviceRPHs",
            "guestCounts"
        })
        public static class RoomRate
            extends RoomRateType
        {

            @XmlElement(name = "AdvanceBookingRestriction")
            protected RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction advanceBookingRestriction;
            @XmlElement(name = "Restrictions")
            protected ArrayOfRoomStayTypeRoomRatesRoomRateRestriction restrictions;
            @XmlElement(name = "ServiceRPHs")
            protected ArrayOfServiceRPHsTypeServiceRPH serviceRPHs;
            @XmlElement(name = "GuestCounts")
            protected ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount guestCounts;

            /**
             * 获取advanceBookingRestriction属性的值。
             * 
             * @return
             *     possible object is
             *     {@link RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction }
             *     
             */
            public RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction getAdvanceBookingRestriction() {
                return advanceBookingRestriction;
            }

            /**
             * 设置advanceBookingRestriction属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction }
             *     
             */
            public void setAdvanceBookingRestriction(RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction value) {
                this.advanceBookingRestriction = value;
            }

            /**
             * 获取restrictions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfRoomStayTypeRoomRatesRoomRateRestriction }
             *     
             */
            public ArrayOfRoomStayTypeRoomRatesRoomRateRestriction getRestrictions() {
                return restrictions;
            }

            /**
             * 设置restrictions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfRoomStayTypeRoomRatesRoomRateRestriction }
             *     
             */
            public void setRestrictions(ArrayOfRoomStayTypeRoomRatesRoomRateRestriction value) {
                this.restrictions = value;
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
             * 获取guestCounts属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount }
             *     
             */
            public ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount getGuestCounts() {
                return guestCounts;
            }

            /**
             * 设置guestCounts属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount }
             *     
             */
            public void setGuestCounts(ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount value) {
                this.guestCounts = value;
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
             *       &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
             *       &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
             *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AdvanceBookingRestriction {

                @XmlAttribute(name = "Start")
                protected String start;
                @XmlAttribute(name = "Duration")
                protected String duration;
                @XmlAttribute(name = "End")
                protected String end;
                @XmlAttribute(name = "MinAdvanceBookingOffset")
                protected Duration minAdvanceBookingOffset;
                @XmlAttribute(name = "MaxAdvanceBookingOffset")
                protected Duration maxAdvanceBookingOffset;
                @XmlAttribute(name = "Mon")
                protected Boolean mon;
                @XmlAttribute(name = "Tue")
                protected Boolean tue;
                @XmlAttribute(name = "Weds")
                protected Boolean weds;
                @XmlAttribute(name = "Thur")
                protected Boolean thur;
                @XmlAttribute(name = "Fri")
                protected Boolean fri;
                @XmlAttribute(name = "Sat")
                protected Boolean sat;
                @XmlAttribute(name = "Sun")
                protected Boolean sun;

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
                 * 获取minAdvanceBookingOffset属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Duration }
                 *     
                 */
                public Duration getMinAdvanceBookingOffset() {
                    return minAdvanceBookingOffset;
                }

                /**
                 * 设置minAdvanceBookingOffset属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Duration }
                 *     
                 */
                public void setMinAdvanceBookingOffset(Duration value) {
                    this.minAdvanceBookingOffset = value;
                }

                /**
                 * 获取maxAdvanceBookingOffset属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Duration }
                 *     
                 */
                public Duration getMaxAdvanceBookingOffset() {
                    return maxAdvanceBookingOffset;
                }

                /**
                 * 设置maxAdvanceBookingOffset属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Duration }
                 *     
                 */
                public void setMaxAdvanceBookingOffset(Duration value) {
                    this.maxAdvanceBookingOffset = value;
                }

                /**
                 * 获取mon属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isMon() {
                    return mon;
                }

                /**
                 * 设置mon属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setMon(Boolean value) {
                    this.mon = value;
                }

                /**
                 * 获取tue属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isTue() {
                    return tue;
                }

                /**
                 * 设置tue属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setTue(Boolean value) {
                    this.tue = value;
                }

                /**
                 * 获取weds属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isWeds() {
                    return weds;
                }

                /**
                 * 设置weds属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setWeds(Boolean value) {
                    this.weds = value;
                }

                /**
                 * 获取thur属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isThur() {
                    return thur;
                }

                /**
                 * 设置thur属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setThur(Boolean value) {
                    this.thur = value;
                }

                /**
                 * 获取fri属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isFri() {
                    return fri;
                }

                /**
                 * 设置fri属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setFri(Boolean value) {
                    this.fri = value;
                }

                /**
                 * 获取sat属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSat() {
                    return sat;
                }

                /**
                 * 设置sat属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSat(Boolean value) {
                    this.sat = value;
                }

                /**
                 * 获取sun属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSun() {
                    return sun;
                }

                /**
                 * 设置sun属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSun(Boolean value) {
                    this.sun = value;
                }

            }

        }

    }

}
