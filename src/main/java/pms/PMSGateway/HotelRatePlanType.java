package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>HotelRatePlanType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HotelRatePlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationSystemsCode" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeDestinationSystemCode" minOccurs="0"/>
 *         &lt;element name="BookingRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingRulesType">
 *                 &lt;sequence>
 *                   &lt;element name="InventoryInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="InvCodeApplication">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="DoesNotApply"/>
 *                                 &lt;enumeration value="InvCode"/>
 *                                 &lt;enumeration value="InvGroupingCode"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeRate" minOccurs="0"/>
 *         &lt;element name="Supplements" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeSupplement" minOccurs="0"/>
 *         &lt;element name="Offers" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeOffer" minOccurs="0"/>
 *         &lt;element name="RatePlanShoulders" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelRatePlanTypeRatePlanShoulder" minOccurs="0"/>
 *         &lt;element name="SellableProducts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProduct" minOccurs="0"/>
 *         &lt;element name="RatePlanLevelFee" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
 *                           &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Commission" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="HotelRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanQualifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanCodeType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="DoesNotApply"/>
 *             &lt;enumeration value="RatePlanCode"/>
 *             &lt;enumeration value="RatePlanGroupingCode"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RatePlanNotifType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="New"/>
 *             &lt;enumeration value="Delta"/>
 *             &lt;enumeration value="Overlay"/>
 *             &lt;enumeration value="Remove"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RatePlanStatusType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Initial"/>
 *             &lt;enumeration value="Active"/>
 *             &lt;enumeration value="Deactivated"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RatePlanNotifScopeType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="RatePlanOnly"/>
 *             &lt;enumeration value="RateOnly"/>
 *             &lt;enumeration value="RatePlanAndRate"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="IsCommissionable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="YieldableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MarketCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="YieldDeltaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="InventoryAllocatedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="EarliestStartIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LatestEndIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ExtraNightRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BaseRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="AdjustedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="FloorAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CeilingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="AdjustUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ChargeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * ��ȡdestinationSystemsCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelRatePlanTypeDestinationSystemCode }
     */
    public ArrayOfHotelRatePlanTypeDestinationSystemCode getDestinationSystemsCode() {
        return destinationSystemsCode;
    }

    /**
     * ����destinationSystemsCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelRatePlanTypeDestinationSystemCode }
     */
    public void setDestinationSystemsCode(ArrayOfHotelRatePlanTypeDestinationSystemCode value) {
        this.destinationSystemsCode = value;
    }

    /**
     * ��ȡbookingRules���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelRatePlanType.BookingRules }
     */
    public HotelRatePlanType.BookingRules getBookingRules() {
        return bookingRules;
    }

    /**
     * ����bookingRules���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelRatePlanType.BookingRules }
     */
    public void setBookingRules(HotelRatePlanType.BookingRules value) {
        this.bookingRules = value;
    }

    /**
     * ��ȡrates���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelRatePlanTypeRate }
     */
    public ArrayOfHotelRatePlanTypeRate getRates() {
        return rates;
    }

    /**
     * ����rates���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelRatePlanTypeRate }
     */
    public void setRates(ArrayOfHotelRatePlanTypeRate value) {
        this.rates = value;
    }

    /**
     * ��ȡsupplements���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelRatePlanTypeSupplement }
     */
    public ArrayOfHotelRatePlanTypeSupplement getSupplements() {
        return supplements;
    }

    /**
     * ����supplements���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelRatePlanTypeSupplement }
     */
    public void setSupplements(ArrayOfHotelRatePlanTypeSupplement value) {
        this.supplements = value;
    }

    /**
     * ��ȡoffers���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelRatePlanTypeOffer }
     */
    public ArrayOfHotelRatePlanTypeOffer getOffers() {
        return offers;
    }

    /**
     * ����offers���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelRatePlanTypeOffer }
     */
    public void setOffers(ArrayOfHotelRatePlanTypeOffer value) {
        this.offers = value;
    }

    /**
     * ��ȡratePlanShoulders���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelRatePlanTypeRatePlanShoulder }
     */
    public ArrayOfHotelRatePlanTypeRatePlanShoulder getRatePlanShoulders() {
        return ratePlanShoulders;
    }

    /**
     * ����ratePlanShoulders���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelRatePlanTypeRatePlanShoulder }
     */
    public void setRatePlanShoulders(ArrayOfHotelRatePlanTypeRatePlanShoulder value) {
        this.ratePlanShoulders = value;
    }

    /**
     * ��ȡsellableProducts���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfSellableProductsTypeSellableProduct }
     */
    public ArrayOfSellableProductsTypeSellableProduct getSellableProducts() {
        return sellableProducts;
    }

    /**
     * ����sellableProducts���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfSellableProductsTypeSellableProduct }
     */
    public void setSellableProducts(ArrayOfSellableProductsTypeSellableProduct value) {
        this.sellableProducts = value;
    }

    /**
     * ��ȡratePlanLevelFee���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelRatePlanType.RatePlanLevelFee }
     */
    public HotelRatePlanType.RatePlanLevelFee getRatePlanLevelFee() {
        return ratePlanLevelFee;
    }

    /**
     * ����ratePlanLevelFee���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelRatePlanType.RatePlanLevelFee }
     */
    public void setRatePlanLevelFee(HotelRatePlanType.RatePlanLevelFee value) {
        this.ratePlanLevelFee = value;
    }

    /**
     * ��ȡcommission���Ե�ֵ��
     *
     * @return possible object is
     * {@link CommissionType }
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * ����commission���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CommissionType }
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the description property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     */
    public List<ParagraphType> getDescription() {
        if (description == null) {
            description = new ArrayList<ParagraphType>();
        }
        return this.description;
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
     * ��ȡhotelRef���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelRatePlanType.HotelRef }
     */
    public HotelRatePlanType.HotelRef getHotelRef() {
        return hotelRef;
    }

    /**
     * ����hotelRef���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelRatePlanType.HotelRef }
     */
    public void setHotelRef(HotelRatePlanType.HotelRef value) {
        this.hotelRef = value;
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
     * ��ȡcurrencyCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * ����currencyCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * ��ȡdecimalPlaces���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * ����decimalPlaces���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * ��ȡratePlanType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * ����ratePlanType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * ��ȡratePlanCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * ����ratePlanCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * ��ȡratePlanID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanID() {
        return ratePlanID;
    }

    /**
     * ����ratePlanID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanID(String value) {
        this.ratePlanID = value;
    }

    /**
     * ��ȡratePlanQualifier���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRatePlanQualifier() {
        return ratePlanQualifier;
    }

    /**
     * ����ratePlanQualifier���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRatePlanQualifier(Boolean value) {
        this.ratePlanQualifier = value;
    }

    /**
     * ��ȡratePlanCategory���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanCategory() {
        return ratePlanCategory;
    }

    /**
     * ����ratePlanCategory���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanCategory(String value) {
        this.ratePlanCategory = value;
    }

    /**
     * ��ȡratePlanCodeType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanCodeType() {
        return ratePlanCodeType;
    }

    /**
     * ����ratePlanCodeType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanCodeType(String value) {
        this.ratePlanCodeType = value;
    }

    /**
     * ��ȡratePlanNotifType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanNotifType() {
        return ratePlanNotifType;
    }

    /**
     * ����ratePlanNotifType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanNotifType(String value) {
        this.ratePlanNotifType = value;
    }

    /**
     * ��ȡratePlanStatusType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanStatusType() {
        return ratePlanStatusType;
    }

    /**
     * ����ratePlanStatusType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanStatusType(String value) {
        this.ratePlanStatusType = value;
    }

    /**
     * ��ȡratePlanNotifScopeType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanNotifScopeType() {
        return ratePlanNotifScopeType;
    }

    /**
     * ����ratePlanNotifScopeType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanNotifScopeType(String value) {
        this.ratePlanNotifScopeType = value;
    }

    /**
     * ��ȡisCommissionable���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsCommissionable() {
        return isCommissionable;
    }

    /**
     * ����isCommissionable���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsCommissionable(Boolean value) {
        this.isCommissionable = value;
    }

    /**
     * ��ȡrateReturn���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRateReturn() {
        return rateReturn;
    }

    /**
     * ����rateReturn���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRateReturn(Boolean value) {
        this.rateReturn = value;
    }

    /**
     * ��ȡyieldableIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isYieldableIndicator() {
        return yieldableIndicator;
    }

    /**
     * ����yieldableIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setYieldableIndicator(Boolean value) {
        this.yieldableIndicator = value;
    }

    /**
     * ��ȡmarketCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * ����marketCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * ��ȡyieldDeltaAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getYieldDeltaAmount() {
        return yieldDeltaAmount;
    }

    /**
     * ����yieldDeltaAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setYieldDeltaAmount(BigDecimal value) {
        this.yieldDeltaAmount = value;
    }

    /**
     * ��ȡinventoryAllocatedInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isInventoryAllocatedInd() {
        return inventoryAllocatedInd;
    }

    /**
     * ����inventoryAllocatedInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setInventoryAllocatedInd(Boolean value) {
        this.inventoryAllocatedInd = value;
    }

    /**
     * ��ȡrestrictedDisplayIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRestrictedDisplayIndicator() {
        return restrictedDisplayIndicator;
    }

    /**
     * ����restrictedDisplayIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRestrictedDisplayIndicator(Boolean value) {
        this.restrictedDisplayIndicator = value;
    }

    /**
     * ��ȡearliestStartIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isEarliestStartIndicator() {
        return earliestStartIndicator;
    }

    /**
     * ����earliestStartIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setEarliestStartIndicator(Boolean value) {
        this.earliestStartIndicator = value;
    }

    /**
     * ��ȡlatestEndIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isLatestEndIndicator() {
        return latestEndIndicator;
    }

    /**
     * ����latestEndIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setLatestEndIndicator(Boolean value) {
        this.latestEndIndicator = value;
    }

    /**
     * ��ȡextraNightRatePlanCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtraNightRatePlanCode() {
        return extraNightRatePlanCode;
    }

    /**
     * ����extraNightRatePlanCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtraNightRatePlanCode(String value) {
        this.extraNightRatePlanCode = value;
    }

    /**
     * ��ȡbaseRatePlanCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBaseRatePlanCode() {
        return baseRatePlanCode;
    }

    /**
     * ����baseRatePlanCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBaseRatePlanCode(String value) {
        this.baseRatePlanCode = value;
    }

    /**
     * ��ȡadjustedAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAdjustedAmount() {
        return adjustedAmount;
    }

    /**
     * ����adjustedAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAdjustedAmount(BigDecimal value) {
        this.adjustedAmount = value;
    }

    /**
     * ��ȡadjustedPercentage���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAdjustedPercentage() {
        return adjustedPercentage;
    }

    /**
     * ����adjustedPercentage���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAdjustedPercentage(BigDecimal value) {
        this.adjustedPercentage = value;
    }

    /**
     * ��ȡfloorAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getFloorAmount() {
        return floorAmount;
    }

    /**
     * ����floorAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setFloorAmount(BigDecimal value) {
        this.floorAmount = value;
    }

    /**
     * ��ȡceilingAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getCeilingAmount() {
        return ceilingAmount;
    }

    /**
     * ����ceilingAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setCeilingAmount(BigDecimal value) {
        this.ceilingAmount = value;
    }

    /**
     * ��ȡadjustUpIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAdjustUpIndicator() {
        return adjustUpIndicator;
    }

    /**
     * ����adjustUpIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAdjustUpIndicator(Boolean value) {
        this.adjustUpIndicator = value;
    }

    /**
     * ��ȡchargeTypeCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getChargeTypeCode() {
        return chargeTypeCode;
    }

    /**
     * ����chargeTypeCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChargeTypeCode(String value) {
        this.chargeTypeCode = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookingRulesType">
     *       &lt;sequence>
     *         &lt;element name="InventoryInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="InvCodeApplication">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="DoesNotApply"/>
     *                       &lt;enumeration value="InvCode"/>
     *                       &lt;enumeration value="InvGroupingCode"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "inventoryInfo"
    })
    public static class BookingRules
            extends BookingRulesType {

        @XmlElement(name = "InventoryInfo")
        protected HotelRatePlanType.BookingRules.InventoryInfo inventoryInfo;

        /**
         * ��ȡinventoryInfo���Ե�ֵ��
         *
         * @return possible object is
         * {@link HotelRatePlanType.BookingRules.InventoryInfo }
         */
        public HotelRatePlanType.BookingRules.InventoryInfo getInventoryInfo() {
            return inventoryInfo;
        }

        /**
         * ����inventoryInfo���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link HotelRatePlanType.BookingRules.InventoryInfo }
         */
        public void setInventoryInfo(HotelRatePlanType.BookingRules.InventoryInfo value) {
            this.inventoryInfo = value;
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
         *       &lt;attribute name="InvCodeApplication">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="DoesNotApply"/>
         *             &lt;enumeration value="InvCode"/>
         *             &lt;enumeration value="InvGroupingCode"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡinvCodeApplication���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * ����invCodeApplication���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * ��ȡinvCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * ����invCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * ��ȡinvType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvType() {
                return invType;
            }

            /**
             * ����invType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * ��ȡinvTypeCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * ����invTypeCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * ��ȡisRoom���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * ����isRoom���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
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
     *         &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
     *                 &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelRatePlanType.RatePlanLevelFee.Fee }
         */
        public List<HotelRatePlanType.RatePlanLevelFee.Fee> getFee() {
            if (fee == null) {
                fee = new ArrayList<HotelRatePlanType.RatePlanLevelFee.Fee>();
            }
            return this.fee;
        }

        /**
         * ��ȡuri���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getURI() {
            return uri;
        }

        /**
         * ����uri���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setURI(String value) {
            this.uri = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType">
         *       &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Fee
                extends FeeType {

            @XmlAttribute(name = "MealPlanCode")
            protected String mealPlanCode;

            /**
             * ��ȡmealPlanCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getMealPlanCode() {
                return mealPlanCode;
            }

            /**
             * ����mealPlanCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMealPlanCode(String value) {
                this.mealPlanCode = value;
            }

        }

    }

}
