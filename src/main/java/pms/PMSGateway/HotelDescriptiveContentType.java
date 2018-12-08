package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>HotelDescriptiveContentType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HotelDescriptiveContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationSystemsCode" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDestinationSystemCodesTypeDestinationSystemCode" minOccurs="0"/>
 *         &lt;element name="HotelInfo" type="{http://www.opentravel.org/OTA/2003/05}HotelInfoType" minOccurs="0"/>
 *         &lt;element name="FacilityInfo" type="{http://www.opentravel.org/OTA/2003/05}FacilityInfoType" minOccurs="0"/>
 *         &lt;element name="Policies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PoliciesType">
 *                 &lt;attribute name="GuaranteeRoomTypeViaGDS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GuaranteeRoomTypeViaCRC" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GuaranteeRoomTypeViaProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AreaInfo" type="{http://www.opentravel.org/OTA/2003/05}AreaInfoType" minOccurs="0"/>
 *         &lt;element name="AffiliationInfo" type="{http://www.opentravel.org/OTA/2003/05}AffiliationInfoType" minOccurs="0"/>
 *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/>
 *         &lt;element name="GDS_Info" type="{http://www.opentravel.org/OTA/2003/05}GDS_InfoType" minOccurs="0"/>
 *         &lt;element name="Viewerships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewership" minOccurs="0"/>
 *         &lt;element name="EffectivePeriods" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelDescriptiveContentTypeEffectivePeriod" minOccurs="0"/>
 *         &lt;element name="Promotions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelDescriptiveContentTypePromotion" minOccurs="0"/>
 *         &lt;element name="RoomBlocks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DistanceUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AreaUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WeightUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
        pms.PMSGateway.OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent.class,
        pms.PMSGateway.OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent.class
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
     * ��ȡdestinationSystemsCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode }
     */
    public ArrayOfDestinationSystemCodesTypeDestinationSystemCode getDestinationSystemsCode() {
        return destinationSystemsCode;
    }

    /**
     * ����destinationSystemsCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode }
     */
    public void setDestinationSystemsCode(ArrayOfDestinationSystemCodesTypeDestinationSystemCode value) {
        this.destinationSystemsCode = value;
    }

    /**
     * ��ȡhotelInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelInfoType }
     */
    public HotelInfoType getHotelInfo() {
        return hotelInfo;
    }

    /**
     * ����hotelInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelInfoType }
     */
    public void setHotelInfo(HotelInfoType value) {
        this.hotelInfo = value;
    }

    /**
     * ��ȡfacilityInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link FacilityInfoType }
     */
    public FacilityInfoType getFacilityInfo() {
        return facilityInfo;
    }

    /**
     * ����facilityInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link FacilityInfoType }
     */
    public void setFacilityInfo(FacilityInfoType value) {
        this.facilityInfo = value;
    }

    /**
     * ��ȡpolicies���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelDescriptiveContentType.Policies }
     */
    public HotelDescriptiveContentType.Policies getPolicies() {
        return policies;
    }

    /**
     * ����policies���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelDescriptiveContentType.Policies }
     */
    public void setPolicies(HotelDescriptiveContentType.Policies value) {
        this.policies = value;
    }

    /**
     * ��ȡareaInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link AreaInfoType }
     */
    public AreaInfoType getAreaInfo() {
        return areaInfo;
    }

    /**
     * ����areaInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AreaInfoType }
     */
    public void setAreaInfo(AreaInfoType value) {
        this.areaInfo = value;
    }

    /**
     * ��ȡaffiliationInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link AffiliationInfoType }
     */
    public AffiliationInfoType getAffiliationInfo() {
        return affiliationInfo;
    }

    /**
     * ����affiliationInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AffiliationInfoType }
     */
    public void setAffiliationInfo(AffiliationInfoType value) {
        this.affiliationInfo = value;
    }

    /**
     * ��ȡmultimediaDescriptions���Ե�ֵ��
     *
     * @return possible object is
     * {@link MultimediaDescriptionsType }
     */
    public MultimediaDescriptionsType getMultimediaDescriptions() {
        return multimediaDescriptions;
    }

    /**
     * ����multimediaDescriptions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MultimediaDescriptionsType }
     */
    public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
        this.multimediaDescriptions = value;
    }

    /**
     * ��ȡcontactInfos���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfContactInfoRootType }
     */
    public ArrayOfContactInfoRootType getContactInfos() {
        return contactInfos;
    }

    /**
     * ����contactInfos���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfContactInfoRootType }
     */
    public void setContactInfos(ArrayOfContactInfoRootType value) {
        this.contactInfos = value;
    }

    /**
     * ��ȡgdsInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link GDSInfoType }
     */
    public GDSInfoType getGDSInfo() {
        return gdsInfo;
    }

    /**
     * ����gdsInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link GDSInfoType }
     */
    public void setGDSInfo(GDSInfoType value) {
        this.gdsInfo = value;
    }

    /**
     * ��ȡviewerships���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfViewershipsTypeViewership }
     */
    public ArrayOfViewershipsTypeViewership getViewerships() {
        return viewerships;
    }

    /**
     * ����viewerships���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfViewershipsTypeViewership }
     */
    public void setViewerships(ArrayOfViewershipsTypeViewership value) {
        this.viewerships = value;
    }

    /**
     * ��ȡeffectivePeriods���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelDescriptiveContentTypeEffectivePeriod }
     */
    public ArrayOfHotelDescriptiveContentTypeEffectivePeriod getEffectivePeriods() {
        return effectivePeriods;
    }

    /**
     * ����effectivePeriods���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelDescriptiveContentTypeEffectivePeriod }
     */
    public void setEffectivePeriods(ArrayOfHotelDescriptiveContentTypeEffectivePeriod value) {
        this.effectivePeriods = value;
    }

    /**
     * ��ȡpromotions���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHotelDescriptiveContentTypePromotion }
     */
    public ArrayOfHotelDescriptiveContentTypePromotion getPromotions() {
        return promotions;
    }

    /**
     * ����promotions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHotelDescriptiveContentTypePromotion }
     */
    public void setPromotions(ArrayOfHotelDescriptiveContentTypePromotion value) {
        this.promotions = value;
    }

    /**
     * ��ȡroomBlocks���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelDescriptiveContentType.RoomBlocks }
     */
    public HotelDescriptiveContentType.RoomBlocks getRoomBlocks() {
        return roomBlocks;
    }

    /**
     * ����roomBlocks���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelDescriptiveContentType.RoomBlocks }
     */
    public void setRoomBlocks(HotelDescriptiveContentType.RoomBlocks value) {
        this.roomBlocks = value;
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
     * ��ȡlanguageCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * ����languageCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * ��ȡunitOfMeasureQuantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getUnitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /**
     * ����unitOfMeasureQuantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setUnitOfMeasureQuantity(BigDecimal value) {
        this.unitOfMeasureQuantity = value;
    }

    /**
     * ��ȡunitOfMeasure���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * ����unitOfMeasure���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * ��ȡunitOfMeasureCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * ����unitOfMeasureCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * ��ȡtimeZone���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * ����timeZone���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
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
     * ��ȡdistanceUnitOfMeasureCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDistanceUnitOfMeasureCode() {
        return distanceUnitOfMeasureCode;
    }

    /**
     * ����distanceUnitOfMeasureCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDistanceUnitOfMeasureCode(String value) {
        this.distanceUnitOfMeasureCode = value;
    }

    /**
     * ��ȡareaUnitOfMeasureCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAreaUnitOfMeasureCode() {
        return areaUnitOfMeasureCode;
    }

    /**
     * ����areaUnitOfMeasureCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAreaUnitOfMeasureCode(String value) {
        this.areaUnitOfMeasureCode = value;
    }

    /**
     * ��ȡweightUnitOfMeasureCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getWeightUnitOfMeasureCode() {
        return weightUnitOfMeasureCode;
    }

    /**
     * ����weightUnitOfMeasureCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWeightUnitOfMeasureCode(String value) {
        this.weightUnitOfMeasureCode = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PoliciesType">
     *       &lt;attribute name="GuaranteeRoomTypeViaGDS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GuaranteeRoomTypeViaCRC" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GuaranteeRoomTypeViaProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Policies
            extends PoliciesType {

        @XmlAttribute(name = "GuaranteeRoomTypeViaGDS")
        protected Boolean guaranteeRoomTypeViaGDS;
        @XmlAttribute(name = "GuaranteeRoomTypeViaCRC")
        protected Boolean guaranteeRoomTypeViaCRC;
        @XmlAttribute(name = "GuaranteeRoomTypeViaProperty")
        protected Boolean guaranteeRoomTypeViaProperty;

        /**
         * ��ȡguaranteeRoomTypeViaGDS���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isGuaranteeRoomTypeViaGDS() {
            return guaranteeRoomTypeViaGDS;
        }

        /**
         * ����guaranteeRoomTypeViaGDS���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setGuaranteeRoomTypeViaGDS(Boolean value) {
            this.guaranteeRoomTypeViaGDS = value;
        }

        /**
         * ��ȡguaranteeRoomTypeViaCRC���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isGuaranteeRoomTypeViaCRC() {
            return guaranteeRoomTypeViaCRC;
        }

        /**
         * ����guaranteeRoomTypeViaCRC���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setGuaranteeRoomTypeViaCRC(Boolean value) {
            this.guaranteeRoomTypeViaCRC = value;
        }

        /**
         * ��ȡguaranteeRoomTypeViaProperty���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isGuaranteeRoomTypeViaProperty() {
            return guaranteeRoomTypeViaProperty;
        }

        /**
         * ����guaranteeRoomTypeViaProperty���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setGuaranteeRoomTypeViaProperty(Boolean value) {
            this.guaranteeRoomTypeViaProperty = value;
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
     *       &lt;attribute name="AvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoomBlocks {

        @XmlAttribute(name = "AvailableInd")
        protected Boolean availableInd;

        /**
         * ��ȡavailableInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isAvailableInd() {
            return availableInd;
        }

        /**
         * ����availableInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setAvailableInd(Boolean value) {
            this.availableInd = value;
        }

    }

}
