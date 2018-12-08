
package ota.jw.PMSGateway;

import java.math.BigDecimal;
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
 * <p>HotelRatePlanType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelRatePlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationSystemsCode" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeDestinationSystemCode" minOccurs="0"/&gt;
 *         &lt;element name="BookingRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingRulesType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InventoryInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="InvCodeApplication"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="DoesNotApply"/&gt;
 *                                 &lt;enumeration value="InvCode"/&gt;
 *                                 &lt;enumeration value="InvGroupingCode"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeRate" minOccurs="0"/&gt;
 *         &lt;element name="Supplements" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeSupplement" minOccurs="0"/&gt;
 *         &lt;element name="Offers" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeOffer" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanShoulders" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeRatePlanShoulder" minOccurs="0"/&gt;
 *         &lt;element name="SellableProducts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProduct" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanLevelFee" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType"&gt;
 *                           &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *         &lt;element name="HotelRef" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanQualifier" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanCodeType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="DoesNotApply"/&gt;
 *             &lt;enumeration value="RatePlanCode"/&gt;
 *             &lt;enumeration value="RatePlanGroupingCode"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RatePlanNotifType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="New"/&gt;
 *             &lt;enumeration value="Delta"/&gt;
 *             &lt;enumeration value="Overlay"/&gt;
 *             &lt;enumeration value="Remove"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RatePlanStatusType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Initial"/&gt;
 *             &lt;enumeration value="Active"/&gt;
 *             &lt;enumeration value="Deactivated"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RatePlanNotifScopeType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="RatePlanOnly"/&gt;
 *             &lt;enumeration value="RateOnly"/&gt;
 *             &lt;enumeration value="RatePlanAndRate"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="IsCommissionable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="YieldableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MarketCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="YieldDeltaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="InventoryAllocatedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EarliestStartIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LatestEndIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ExtraNightRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BaseRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="AdjustedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="FloorAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="CeilingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="AdjustUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ChargeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRatePlanType", propOrder = {
    "destinationSystemsCode",
    "bookingRules",
    "rates",
    "supplements",
    "offers",
    "ratePlanShoulders",
    "sellableProducts",
    "ratePlanLevelFee",
    "commission",
    "description",
    "uniqueID",
    "hotelRef"
})
public class HotelRatePlanType {

    @XmlElement(name = "DestinationSystemsCode")
    protected ArrayOfHotelRatePlanTypeDestinationSystemCode destinationSystemsCode;
    @XmlElement(name = "BookingRules")
    protected HotelRatePlanType.BookingRules bookingRules;
    @XmlElement(name = "Rates")
    protected ArrayOfHotelRatePlanTypeRate rates;
    @XmlElement(name = "Supplements")
    protected ArrayOfHotelRatePlanTypeSupplement supplements;
    @XmlElement(name = "Offers")
    protected ArrayOfHotelRatePlanTypeOffer offers;
    @XmlElement(name = "RatePlanShoulders")
    protected ArrayOfHotelRatePlanTypeRatePlanShoulder ratePlanShoulders;
    @XmlElement(name = "SellableProducts")
    protected ArrayOfSellableProductsTypeSellableProduct sellableProducts;
    @XmlElement(name = "RatePlanLevelFee")
    protected HotelRatePlanType.RatePlanLevelFee ratePlanLevelFee;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "Description")
    protected List<ParagraphType> description;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "HotelRef")
    protected HotelRatePlanType.HotelRef hotelRef;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "RatePlanType")
    protected String ratePlanType;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "RatePlanID")
    protected String ratePlanID;
    @XmlAttribute(name = "RatePlanQualifier")
    protected Boolean ratePlanQualifier;
    @XmlAttribute(name = "RatePlanCategory")
    protected String ratePlanCategory;
    @XmlAttribute(name = "RatePlanCodeType")
    protected String ratePlanCodeType;
    @XmlAttribute(name = "RatePlanNotifType")
    protected String ratePlanNotifType;
    @XmlAttribute(name = "RatePlanStatusType")
    protected String ratePlanStatusType;
    @XmlAttribute(name = "RatePlanNotifScopeType")
    protected String ratePlanNotifScopeType;
    @XmlAttribute(name = "IsCommissionable")
    protected Boolean isCommissionable;
    @XmlAttribute(name = "RateReturn")
    protected Boolean rateReturn;
    @XmlAttribute(name = "YieldableIndicator")
    protected Boolean yieldableIndicator;
    @XmlAttribute(name = "MarketCode")
    protected String marketCode;
    @XmlAttribute(name = "YieldDeltaAmount")
    protected BigDecimal yieldDeltaAmount;
    @XmlAttribute(name = "InventoryAllocatedInd")
    protected Boolean inventoryAllocatedInd;
    @XmlAttribute(name = "RestrictedDisplayIndicator")
    protected Boolean restrictedDisplayIndicator;
    @XmlAttribute(name = "EarliestStartIndicator")
    protected Boolean earliestStartIndicator;
    @XmlAttribute(name = "LatestEndIndicator")
    protected Boolean latestEndIndicator;
    @XmlAttribute(name = "ExtraNightRatePlanCode")
    protected String extraNightRatePlanCode;
    @XmlAttribute(name = "BaseRatePlanCode")
    protected String baseRatePlanCode;
    @XmlAttribute(name = "AdjustedAmount")
    protected BigDecimal adjustedAmount;
    @XmlAttribute(name = "AdjustedPercentage")
    protected BigDecimal adjustedPercentage;
    @XmlAttribute(name = "FloorAmount")
    protected BigDecimal floorAmount;
    @XmlAttribute(name = "CeilingAmount")
    protected BigDecimal ceilingAmount;
    @XmlAttribute(name = "AdjustUpIndicator")
    protected Boolean adjustUpIndicator;
    @XmlAttribute(name = "ChargeTypeCode")
    protected String chargeTypeCode;

    /**
     * 获取destinationSystemsCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelRatePlanTypeDestinationSystemCode }
     *     
     */
    public ArrayOfHotelRatePlanTypeDestinationSystemCode getDestinationSystemsCode() {
        return destinationSystemsCode;
    }

    /**
     * 设置destinationSystemsCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelRatePlanTypeDestinationSystemCode }
     *     
     */
    public void setDestinationSystemsCode(ArrayOfHotelRatePlanTypeDestinationSystemCode value) {
        this.destinationSystemsCode = value;
    }

    /**
     * 获取bookingRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRatePlanType.BookingRules }
     *     
     */
    public HotelRatePlanType.BookingRules getBookingRules() {
        return bookingRules;
    }

    /**
     * 设置bookingRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRatePlanType.BookingRules }
     *     
     */
    public void setBookingRules(HotelRatePlanType.BookingRules value) {
        this.bookingRules = value;
    }

    /**
     * 获取rates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelRatePlanTypeRate }
     *     
     */
    public ArrayOfHotelRatePlanTypeRate getRates() {
        return rates;
    }

    /**
     * 设置rates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelRatePlanTypeRate }
     *     
     */
    public void setRates(ArrayOfHotelRatePlanTypeRate value) {
        this.rates = value;
    }

    /**
     * 获取supplements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelRatePlanTypeSupplement }
     *     
     */
    public ArrayOfHotelRatePlanTypeSupplement getSupplements() {
        return supplements;
    }

    /**
     * 设置supplements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelRatePlanTypeSupplement }
     *     
     */
    public void setSupplements(ArrayOfHotelRatePlanTypeSupplement value) {
        this.supplements = value;
    }

    /**
     * 获取offers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelRatePlanTypeOffer }
     *     
     */
    public ArrayOfHotelRatePlanTypeOffer getOffers() {
        return offers;
    }

    /**
     * 设置offers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelRatePlanTypeOffer }
     *     
     */
    public void setOffers(ArrayOfHotelRatePlanTypeOffer value) {
        this.offers = value;
    }

    /**
     * 获取ratePlanShoulders属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelRatePlanTypeRatePlanShoulder }
     *     
     */
    public ArrayOfHotelRatePlanTypeRatePlanShoulder getRatePlanShoulders() {
        return ratePlanShoulders;
    }

    /**
     * 设置ratePlanShoulders属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelRatePlanTypeRatePlanShoulder }
     *     
     */
    public void setRatePlanShoulders(ArrayOfHotelRatePlanTypeRatePlanShoulder value) {
        this.ratePlanShoulders = value;
    }

    /**
     * 获取sellableProducts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellableProductsTypeSellableProduct }
     *     
     */
    public ArrayOfSellableProductsTypeSellableProduct getSellableProducts() {
        return sellableProducts;
    }

    /**
     * 设置sellableProducts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellableProductsTypeSellableProduct }
     *     
     */
    public void setSellableProducts(ArrayOfSellableProductsTypeSellableProduct value) {
        this.sellableProducts = value;
    }

    /**
     * 获取ratePlanLevelFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRatePlanType.RatePlanLevelFee }
     *     
     */
    public HotelRatePlanType.RatePlanLevelFee getRatePlanLevelFee() {
        return ratePlanLevelFee;
    }

    /**
     * 设置ratePlanLevelFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRatePlanType.RatePlanLevelFee }
     *     
     */
    public void setRatePlanLevelFee(HotelRatePlanType.RatePlanLevelFee value) {
        this.ratePlanLevelFee = value;
    }

    /**
     * 获取commission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * 设置commission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getDescription() {
        if (description == null) {
            description = new ArrayList<ParagraphType>();
        }
        return this.description;
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
     * 获取hotelRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRatePlanType.HotelRef }
     *     
     */
    public HotelRatePlanType.HotelRef getHotelRef() {
        return hotelRef;
    }

    /**
     * 设置hotelRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRatePlanType.HotelRef }
     *     
     */
    public void setHotelRef(HotelRatePlanType.HotelRef value) {
        this.hotelRef = value;
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
     * 获取ratePlanType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * 设置ratePlanType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * 获取ratePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 设置ratePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * 获取ratePlanID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanID() {
        return ratePlanID;
    }

    /**
     * 设置ratePlanID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanID(String value) {
        this.ratePlanID = value;
    }

    /**
     * 获取ratePlanQualifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRatePlanQualifier() {
        return ratePlanQualifier;
    }

    /**
     * 设置ratePlanQualifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRatePlanQualifier(Boolean value) {
        this.ratePlanQualifier = value;
    }

    /**
     * 获取ratePlanCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCategory() {
        return ratePlanCategory;
    }

    /**
     * 设置ratePlanCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCategory(String value) {
        this.ratePlanCategory = value;
    }

    /**
     * 获取ratePlanCodeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCodeType() {
        return ratePlanCodeType;
    }

    /**
     * 设置ratePlanCodeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCodeType(String value) {
        this.ratePlanCodeType = value;
    }

    /**
     * 获取ratePlanNotifType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanNotifType() {
        return ratePlanNotifType;
    }

    /**
     * 设置ratePlanNotifType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanNotifType(String value) {
        this.ratePlanNotifType = value;
    }

    /**
     * 获取ratePlanStatusType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanStatusType() {
        return ratePlanStatusType;
    }

    /**
     * 设置ratePlanStatusType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanStatusType(String value) {
        this.ratePlanStatusType = value;
    }

    /**
     * 获取ratePlanNotifScopeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanNotifScopeType() {
        return ratePlanNotifScopeType;
    }

    /**
     * 设置ratePlanNotifScopeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanNotifScopeType(String value) {
        this.ratePlanNotifScopeType = value;
    }

    /**
     * 获取isCommissionable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommissionable() {
        return isCommissionable;
    }

    /**
     * 设置isCommissionable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommissionable(Boolean value) {
        this.isCommissionable = value;
    }

    /**
     * 获取rateReturn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateReturn() {
        return rateReturn;
    }

    /**
     * 设置rateReturn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateReturn(Boolean value) {
        this.rateReturn = value;
    }

    /**
     * 获取yieldableIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYieldableIndicator() {
        return yieldableIndicator;
    }

    /**
     * 设置yieldableIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYieldableIndicator(Boolean value) {
        this.yieldableIndicator = value;
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
     * 获取yieldDeltaAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYieldDeltaAmount() {
        return yieldDeltaAmount;
    }

    /**
     * 设置yieldDeltaAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYieldDeltaAmount(BigDecimal value) {
        this.yieldDeltaAmount = value;
    }

    /**
     * 获取inventoryAllocatedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInventoryAllocatedInd() {
        return inventoryAllocatedInd;
    }

    /**
     * 设置inventoryAllocatedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInventoryAllocatedInd(Boolean value) {
        this.inventoryAllocatedInd = value;
    }

    /**
     * 获取restrictedDisplayIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedDisplayIndicator() {
        return restrictedDisplayIndicator;
    }

    /**
     * 设置restrictedDisplayIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedDisplayIndicator(Boolean value) {
        this.restrictedDisplayIndicator = value;
    }

    /**
     * 获取earliestStartIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarliestStartIndicator() {
        return earliestStartIndicator;
    }

    /**
     * 设置earliestStartIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEarliestStartIndicator(Boolean value) {
        this.earliestStartIndicator = value;
    }

    /**
     * 获取latestEndIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatestEndIndicator() {
        return latestEndIndicator;
    }

    /**
     * 设置latestEndIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatestEndIndicator(Boolean value) {
        this.latestEndIndicator = value;
    }

    /**
     * 获取extraNightRatePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraNightRatePlanCode() {
        return extraNightRatePlanCode;
    }

    /**
     * 设置extraNightRatePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraNightRatePlanCode(String value) {
        this.extraNightRatePlanCode = value;
    }

    /**
     * 获取baseRatePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRatePlanCode() {
        return baseRatePlanCode;
    }

    /**
     * 设置baseRatePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRatePlanCode(String value) {
        this.baseRatePlanCode = value;
    }

    /**
     * 获取adjustedAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedAmount() {
        return adjustedAmount;
    }

    /**
     * 设置adjustedAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedAmount(BigDecimal value) {
        this.adjustedAmount = value;
    }

    /**
     * 获取adjustedPercentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedPercentage() {
        return adjustedPercentage;
    }

    /**
     * 设置adjustedPercentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedPercentage(BigDecimal value) {
        this.adjustedPercentage = value;
    }

    /**
     * 获取floorAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFloorAmount() {
        return floorAmount;
    }

    /**
     * 设置floorAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFloorAmount(BigDecimal value) {
        this.floorAmount = value;
    }

    /**
     * 获取ceilingAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCeilingAmount() {
        return ceilingAmount;
    }

    /**
     * 设置ceilingAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCeilingAmount(BigDecimal value) {
        this.ceilingAmount = value;
    }

    /**
     * 获取adjustUpIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustUpIndicator() {
        return adjustUpIndicator;
    }

    /**
     * 设置adjustUpIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustUpIndicator(Boolean value) {
        this.adjustUpIndicator = value;
    }

    /**
     * 获取chargeTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeTypeCode() {
        return chargeTypeCode;
    }

    /**
     * 设置chargeTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeTypeCode(String value) {
        this.chargeTypeCode = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingRulesType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="InventoryInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="InvCodeApplication"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="DoesNotApply"/&gt;
     *                       &lt;enumeration value="InvCode"/&gt;
     *                       &lt;enumeration value="InvGroupingCode"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "inventoryInfo"
    })
    public static class BookingRules
        extends BookingRulesType
    {

        @XmlElement(name = "InventoryInfo")
        protected HotelRatePlanType.BookingRules.InventoryInfo inventoryInfo;

        /**
         * 获取inventoryInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HotelRatePlanType.BookingRules.InventoryInfo }
         *     
         */
        public HotelRatePlanType.BookingRules.InventoryInfo getInventoryInfo() {
            return inventoryInfo;
        }

        /**
         * 设置inventoryInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRatePlanType.BookingRules.InventoryInfo }
         *     
         */
        public void setInventoryInfo(HotelRatePlanType.BookingRules.InventoryInfo value) {
            this.inventoryInfo = value;
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
         *       &lt;attribute name="InvCodeApplication"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="DoesNotApply"/&gt;
         *             &lt;enumeration value="InvCode"/&gt;
         *             &lt;enumeration value="InvGroupingCode"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InventoryInfo {

            @XmlAttribute(name = "InvCodeApplication")
            protected String invCodeApplication;
            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;
            @XmlAttribute(name = "InvTypeCode")
            protected String invTypeCode;
            @XmlAttribute(name = "IsRoom")
            protected Boolean isRoom;

            /**
             * 获取invCodeApplication属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * 设置invCodeApplication属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * 获取invCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * 设置invCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * 获取invType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvType() {
                return invType;
            }

            /**
             * 设置invType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * 获取invTypeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * 设置invTypeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * 获取isRoom属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * 设置isRoom属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
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
    @XmlType(name = "")
    public static class HotelRef {

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
     *         &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType"&gt;
     *                 &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fee"
    })
    public static class RatePlanLevelFee {

        @XmlElement(name = "Fee")
        protected List<HotelRatePlanType.RatePlanLevelFee.Fee> fee;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;

        /**
         * Gets the value of the fee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelRatePlanType.RatePlanLevelFee.Fee }
         * 
         * 
         */
        public List<HotelRatePlanType.RatePlanLevelFee.Fee> getFee() {
            if (fee == null) {
                fee = new ArrayList<HotelRatePlanType.RatePlanLevelFee.Fee>();
            }
            return this.fee;
        }

        /**
         * 获取uri属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * 设置uri属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType"&gt;
         *       &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Fee
            extends FeeType
        {

            @XmlAttribute(name = "MealPlanCode")
            protected String mealPlanCode;

            /**
             * 获取mealPlanCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMealPlanCode() {
                return mealPlanCode;
            }

            /**
             * 设置mealPlanCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMealPlanCode(String value) {
                this.mealPlanCode = value;
            }

        }

    }

}
