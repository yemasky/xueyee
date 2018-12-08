
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>HotelDescriptiveContentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelDescriptiveContentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationSystemsCode" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDestinationSystemCodesTypeDestinationSystemCode" minOccurs="0"/&gt;
 *         &lt;element name="HotelInfo" type="{http://www.opentravel.org/OTA/2003/05}HotelInfoType" minOccurs="0"/&gt;
 *         &lt;element name="FacilityInfo" type="{http://www.opentravel.org/OTA/2003/05}FacilityInfoType" minOccurs="0"/&gt;
 *         &lt;element name="Policies" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PoliciesType"&gt;
 *                 &lt;attribute name="GuaranteeRoomTypeViaGDS" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="GuaranteeRoomTypeViaCRC" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="GuaranteeRoomTypeViaProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AreaInfo" type="{http://www.opentravel.org/OTA/2003/05}AreaInfoType" minOccurs="0"/&gt;
 *         &lt;element name="AffiliationInfo" type="{http://www.opentravel.org/OTA/2003/05}AffiliationInfoType" minOccurs="0"/&gt;
 *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/&gt;
 *         &lt;element name="GDS_Info" type="{http://www.opentravel.org/OTA/2003/05}GDS_InfoType" minOccurs="0"/&gt;
 *         &lt;element name="Viewerships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewership" minOccurs="0"/&gt;
 *         &lt;element name="EffectivePeriods" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelDescriptiveContentTypeEffectivePeriod" minOccurs="0"/&gt;
 *         &lt;element name="Promotions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelDescriptiveContentTypePromotion" minOccurs="0"/&gt;
 *         &lt;element name="RoomBlocks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DistanceUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AreaUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WeightUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDescriptiveContentType", propOrder = {
    "destinationSystemsCode",
    "hotelInfo",
    "facilityInfo",
    "policies",
    "areaInfo",
    "affiliationInfo",
    "multimediaDescriptions",
    "contactInfos",
    "gdsInfo",
    "viewerships",
    "effectivePeriods",
    "promotions",
    "roomBlocks",
    "tpaExtensions"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent.class,
    ota.jw.PMSGateway.OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent.class
})
public class HotelDescriptiveContentType {

    @XmlElement(name = "DestinationSystemsCode")
    protected ArrayOfDestinationSystemCodesTypeDestinationSystemCode destinationSystemsCode;
    @XmlElement(name = "HotelInfo")
    protected HotelInfoType hotelInfo;
    @XmlElement(name = "FacilityInfo")
    protected FacilityInfoType facilityInfo;
    @XmlElement(name = "Policies")
    protected HotelDescriptiveContentType.Policies policies;
    @XmlElement(name = "AreaInfo")
    protected AreaInfoType areaInfo;
    @XmlElement(name = "AffiliationInfo")
    protected AffiliationInfoType affiliationInfo;
    @XmlElement(name = "MultimediaDescriptions")
    protected MultimediaDescriptionsType multimediaDescriptions;
    @XmlElement(name = "ContactInfos")
    protected ArrayOfContactInfoRootType contactInfos;
    @XmlElement(name = "GDS_Info")
    protected GDSInfoType gdsInfo;
    @XmlElement(name = "Viewerships")
    protected ArrayOfViewershipsTypeViewership viewerships;
    @XmlElement(name = "EffectivePeriods")
    protected ArrayOfHotelDescriptiveContentTypeEffectivePeriod effectivePeriods;
    @XmlElement(name = "Promotions")
    protected ArrayOfHotelDescriptiveContentTypePromotion promotions;
    @XmlElement(name = "RoomBlocks")
    protected HotelDescriptiveContentType.RoomBlocks roomBlocks;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;
    @XmlAttribute(name = "UnitOfMeasureQuantity")
    protected BigDecimal unitOfMeasureQuantity;
    @XmlAttribute(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "TimeZone")
    protected String timeZone;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "DistanceUnitOfMeasureCode")
    protected String distanceUnitOfMeasureCode;
    @XmlAttribute(name = "AreaUnitOfMeasureCode")
    protected String areaUnitOfMeasureCode;
    @XmlAttribute(name = "WeightUnitOfMeasureCode")
    protected String weightUnitOfMeasureCode;

    /**
     * 获取destinationSystemsCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode }
     *     
     */
    public ArrayOfDestinationSystemCodesTypeDestinationSystemCode getDestinationSystemsCode() {
        return destinationSystemsCode;
    }

    /**
     * 设置destinationSystemsCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode }
     *     
     */
    public void setDestinationSystemsCode(ArrayOfDestinationSystemCodesTypeDestinationSystemCode value) {
        this.destinationSystemsCode = value;
    }

    /**
     * 获取hotelInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType }
     *     
     */
    public HotelInfoType getHotelInfo() {
        return hotelInfo;
    }

    /**
     * 设置hotelInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType }
     *     
     */
    public void setHotelInfo(HotelInfoType value) {
        this.hotelInfo = value;
    }

    /**
     * 获取facilityInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FacilityInfoType }
     *     
     */
    public FacilityInfoType getFacilityInfo() {
        return facilityInfo;
    }

    /**
     * 设置facilityInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityInfoType }
     *     
     */
    public void setFacilityInfo(FacilityInfoType value) {
        this.facilityInfo = value;
    }

    /**
     * 获取policies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelDescriptiveContentType.Policies }
     *     
     */
    public HotelDescriptiveContentType.Policies getPolicies() {
        return policies;
    }

    /**
     * 设置policies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDescriptiveContentType.Policies }
     *     
     */
    public void setPolicies(HotelDescriptiveContentType.Policies value) {
        this.policies = value;
    }

    /**
     * 获取areaInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType }
     *     
     */
    public AreaInfoType getAreaInfo() {
        return areaInfo;
    }

    /**
     * 设置areaInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType }
     *     
     */
    public void setAreaInfo(AreaInfoType value) {
        this.areaInfo = value;
    }

    /**
     * 获取affiliationInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AffiliationInfoType }
     *     
     */
    public AffiliationInfoType getAffiliationInfo() {
        return affiliationInfo;
    }

    /**
     * 设置affiliationInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationInfoType }
     *     
     */
    public void setAffiliationInfo(AffiliationInfoType value) {
        this.affiliationInfo = value;
    }

    /**
     * 获取multimediaDescriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MultimediaDescriptionsType }
     *     
     */
    public MultimediaDescriptionsType getMultimediaDescriptions() {
        return multimediaDescriptions;
    }

    /**
     * 设置multimediaDescriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MultimediaDescriptionsType }
     *     
     */
    public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
        this.multimediaDescriptions = value;
    }

    /**
     * 获取contactInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactInfoRootType }
     *     
     */
    public ArrayOfContactInfoRootType getContactInfos() {
        return contactInfos;
    }

    /**
     * 设置contactInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactInfoRootType }
     *     
     */
    public void setContactInfos(ArrayOfContactInfoRootType value) {
        this.contactInfos = value;
    }

    /**
     * 获取gdsInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GDSInfoType }
     *     
     */
    public GDSInfoType getGDSInfo() {
        return gdsInfo;
    }

    /**
     * 设置gdsInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GDSInfoType }
     *     
     */
    public void setGDSInfo(GDSInfoType value) {
        this.gdsInfo = value;
    }

    /**
     * 获取viewerships属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfViewershipsTypeViewership }
     *     
     */
    public ArrayOfViewershipsTypeViewership getViewerships() {
        return viewerships;
    }

    /**
     * 设置viewerships属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfViewershipsTypeViewership }
     *     
     */
    public void setViewerships(ArrayOfViewershipsTypeViewership value) {
        this.viewerships = value;
    }

    /**
     * 获取effectivePeriods属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelDescriptiveContentTypeEffectivePeriod }
     *     
     */
    public ArrayOfHotelDescriptiveContentTypeEffectivePeriod getEffectivePeriods() {
        return effectivePeriods;
    }

    /**
     * 设置effectivePeriods属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelDescriptiveContentTypeEffectivePeriod }
     *     
     */
    public void setEffectivePeriods(ArrayOfHotelDescriptiveContentTypeEffectivePeriod value) {
        this.effectivePeriods = value;
    }

    /**
     * 获取promotions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelDescriptiveContentTypePromotion }
     *     
     */
    public ArrayOfHotelDescriptiveContentTypePromotion getPromotions() {
        return promotions;
    }

    /**
     * 设置promotions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelDescriptiveContentTypePromotion }
     *     
     */
    public void setPromotions(ArrayOfHotelDescriptiveContentTypePromotion value) {
        this.promotions = value;
    }

    /**
     * 获取roomBlocks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelDescriptiveContentType.RoomBlocks }
     *     
     */
    public HotelDescriptiveContentType.RoomBlocks getRoomBlocks() {
        return roomBlocks;
    }

    /**
     * 设置roomBlocks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDescriptiveContentType.RoomBlocks }
     *     
     */
    public void setRoomBlocks(HotelDescriptiveContentType.RoomBlocks value) {
        this.roomBlocks = value;
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
     * 获取languageCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * 设置languageCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * 获取unitOfMeasureQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /**
     * 设置unitOfMeasureQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitOfMeasureQuantity(BigDecimal value) {
        this.unitOfMeasureQuantity = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * 获取unitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * 设置unitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * 获取timeZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 设置timeZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
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
     * 获取distanceUnitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnitOfMeasureCode() {
        return distanceUnitOfMeasureCode;
    }

    /**
     * 设置distanceUnitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnitOfMeasureCode(String value) {
        this.distanceUnitOfMeasureCode = value;
    }

    /**
     * 获取areaUnitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaUnitOfMeasureCode() {
        return areaUnitOfMeasureCode;
    }

    /**
     * 设置areaUnitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaUnitOfMeasureCode(String value) {
        this.areaUnitOfMeasureCode = value;
    }

    /**
     * 获取weightUnitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnitOfMeasureCode() {
        return weightUnitOfMeasureCode;
    }

    /**
     * 设置weightUnitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnitOfMeasureCode(String value) {
        this.weightUnitOfMeasureCode = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PoliciesType"&gt;
     *       &lt;attribute name="GuaranteeRoomTypeViaGDS" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="GuaranteeRoomTypeViaCRC" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="GuaranteeRoomTypeViaProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Policies
        extends PoliciesType
    {

        @XmlAttribute(name = "GuaranteeRoomTypeViaGDS")
        protected Boolean guaranteeRoomTypeViaGDS;
        @XmlAttribute(name = "GuaranteeRoomTypeViaCRC")
        protected Boolean guaranteeRoomTypeViaCRC;
        @XmlAttribute(name = "GuaranteeRoomTypeViaProperty")
        protected Boolean guaranteeRoomTypeViaProperty;

        /**
         * 获取guaranteeRoomTypeViaGDS属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRoomTypeViaGDS() {
            return guaranteeRoomTypeViaGDS;
        }

        /**
         * 设置guaranteeRoomTypeViaGDS属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRoomTypeViaGDS(Boolean value) {
            this.guaranteeRoomTypeViaGDS = value;
        }

        /**
         * 获取guaranteeRoomTypeViaCRC属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRoomTypeViaCRC() {
            return guaranteeRoomTypeViaCRC;
        }

        /**
         * 设置guaranteeRoomTypeViaCRC属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRoomTypeViaCRC(Boolean value) {
            this.guaranteeRoomTypeViaCRC = value;
        }

        /**
         * 获取guaranteeRoomTypeViaProperty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRoomTypeViaProperty() {
            return guaranteeRoomTypeViaProperty;
        }

        /**
         * 设置guaranteeRoomTypeViaProperty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRoomTypeViaProperty(Boolean value) {
            this.guaranteeRoomTypeViaProperty = value;
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
     *       &lt;attribute name="AvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoomBlocks {

        @XmlAttribute(name = "AvailableInd")
        protected Boolean availableInd;

        /**
         * 获取availableInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAvailableInd() {
            return availableInd;
        }

        /**
         * 设置availableInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAvailableInd(Boolean value) {
            this.availableInd = value;
        }

    }

}
