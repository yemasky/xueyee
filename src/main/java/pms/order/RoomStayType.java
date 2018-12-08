package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomStayType", propOrder = {"roomTypes", "ratePlans", "roomRates", "guestCounts", "timeSpan", "guarantee", "depositPayments", "cancelPenalties", "discount", "total", "basicPropertyInfo", "mapURL", "tpaExtensions"})
@XmlSeeAlso({pms.order.OTAHotelAvailRS.RoomStays.RoomStay.class, pms.order.ArrayOfRoomStaysTypeRoomStay.RoomStay.class})
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

    public ArrayOfRoomTypeType getRoomTypes() {
        return roomTypes;
    }

    /**
     * ����roomTypes���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRoomTypeType }
     */
    public void setRoomTypes(ArrayOfRoomTypeType value) {
        this.roomTypes = value;
    }

    /**
     * ��ȡratePlans���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRatePlanType }
     */
    public ArrayOfRatePlanType getRatePlans() {
        return ratePlans;
    }

    /**
     * ����ratePlans���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRatePlanType }
     */
    public void setRatePlans(ArrayOfRatePlanType value) {
        this.ratePlans = value;
    }

    /**
     * ��ȡroomRates���Ե�ֵ��
     *
     * @return possible object is
     * {@link RoomStayType.RoomRates }
     */
    public RoomStayType.RoomRates getRoomRates() {
        return roomRates;
    }

    /**
     * ����roomRates���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RoomStayType.RoomRates }
     */
    public void setRoomRates(RoomStayType.RoomRates value) {
        this.roomRates = value;
    }

    /**
     * ��ȡguestCounts���Ե�ֵ��
     *
     * @return possible object is
     * {@link GuestCountType }
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * ����guestCounts���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link GuestCountType }
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * ��ȡtimeSpan���Ե�ֵ��
     *
     * @return possible object is
     * {@link DateTimeSpanType }
     */
    public DateTimeSpanType getTimeSpan() {
        return timeSpan;
    }

    /**
     * ����timeSpan���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DateTimeSpanType }
     */
    public void setTimeSpan(DateTimeSpanType value) {
        this.timeSpan = value;
    }

    public List<GuaranteeType> getGuarantee() {
        if (guarantee == null) {
            guarantee = new ArrayList<GuaranteeType>();
        }
        return this.guarantee;
    }

    /**
     * ��ȡdepositPayments���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment getDepositPayments() {
        return depositPayments;
    }

    /**
     * ����depositPayments���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     */
    public void setDepositPayments(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
        this.depositPayments = value;
    }

    /**
     * ��ȡcancelPenalties���Ե�ֵ��
     *
     * @return possible object is
     * {@link CancelPenaltiesType }
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * ����cancelPenalties���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CancelPenaltiesType }
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * ��ȡdiscount���Ե�ֵ��
     *
     * @return possible object is
     * {@link DiscountType }
     */
    public DiscountType getDiscount() {
        return discount;
    }

    /**
     * ����discount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DiscountType }
     */
    public void setDiscount(DiscountType value) {
        this.discount = value;
    }

    /**
     * ��ȡtotal���Ե�ֵ��
     *
     * @return possible object is
     * {@link TotalType }
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * ����total���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TotalType }
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }

    /**
     * ��ȡbasicPropertyInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link BasicPropertyInfoType }
     */
    public BasicPropertyInfoType getBasicPropertyInfo() {
        return basicPropertyInfo;
    }

    /**
     * ����basicPropertyInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BasicPropertyInfoType }
     */
    public void setBasicPropertyInfo(BasicPropertyInfoType value) {
        this.basicPropertyInfo = value;
    }

    /**
     * ��ȡmapURL���Ե�ֵ��
     *
     * @return possible object is
     * {@link RoomStayType.MapURL }
     */
    public RoomStayType.MapURL getMapURL() {
        return mapURL;
    }

    /**
     * ����mapURL���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RoomStayType.MapURL }
     */
    public void setMapURL(RoomStayType.MapURL value) {
        this.mapURL = value;
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
     * ��ȡsourceOfBusiness���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSourceOfBusiness() {
        return sourceOfBusiness;
    }

    /**
     * ����sourceOfBusiness���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSourceOfBusiness(String value) {
        this.sourceOfBusiness = value;
    }

    /**
     * ��ȡdiscountCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * ����discountCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * ��ȡpromotionCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * ����promotionCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the promotionVendorCode property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionVendorCode().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getPromotionVendorCode() {
        if (promotionVendorCode == null) {
            promotionVendorCode = new ArrayList<String>();
        }
        return this.promotionVendorCode;
    }

    /**
     * ��ȡroomStayStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomStayStatus() {
        return roomStayStatus;
    }

    /**
     * ����roomStayStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomStayStatus(String value) {
        this.roomStayStatus = value;
    }

    /**
     * Gets the value of the warningRPH property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningRPH property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningRPH().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getWarningRPH() {
        if (warningRPH == null) {
            warningRPH = new ArrayList<String>();
        }
        return this.warningRPH;
    }

    /**
     * ��ȡroomStayLanguage���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomStayLanguage() {
        return roomStayLanguage;
    }

    /**
     * ����roomStayLanguage���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomStayLanguage(String value) {
        this.roomStayLanguage = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *       &lt;attribute name="BottomRightLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="BottomRightLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="TopLeftLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="TopLeftLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="ZoomFactor" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * ��ȡbottomRightLatitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getBottomRightLatitude() {
            return bottomRightLatitude;
        }

        /**
         * ����bottomRightLatitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setBottomRightLatitude(BigDecimal value) {
            this.bottomRightLatitude = value;
        }

        /**
         * ��ȡbottomRightLongitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getBottomRightLongitude() {
            return bottomRightLongitude;
        }

        /**
         * ����bottomRightLongitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setBottomRightLongitude(BigDecimal value) {
            this.bottomRightLongitude = value;
        }

        /**
         * ��ȡtopLeftLatitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTopLeftLatitude() {
            return topLeftLatitude;
        }

        /**
         * ����topLeftLatitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTopLeftLatitude(BigDecimal value) {
            this.topLeftLatitude = value;
        }

        /**
         * ��ȡtopLeftLongitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTopLeftLongitude() {
            return topLeftLongitude;
        }

        /**
         * ����topLeftLongitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTopLeftLongitude(BigDecimal value) {
            this.topLeftLongitude = value;
        }

        /**
         * ��ȡheight���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getHeight() {
            return height;
        }

        /**
         * ����height���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setHeight(BigInteger value) {
            this.height = value;
        }

        /**
         * ��ȡwidth���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getWidth() {
            return width;
        }

        /**
         * ����width���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setWidth(BigInteger value) {
            this.width = value;
        }

        /**
         * ��ȡzoomFactor���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getZoomFactor() {
            return zoomFactor;
        }

        /**
         * ����zoomFactor���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setZoomFactor(BigInteger value) {
            this.zoomFactor = value;
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
     *         &lt;element name="RoomRate" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomRateType">
     *                 &lt;sequence>
     *                   &lt;element name="AdvanceBookingRestriction" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *                           &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *                           &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Restrictions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStayTypeRoomRatesRoomRateRestriction" minOccurs="0"/>
     *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
     *                   &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="MoreRatesExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"roomRate", "tpaExtensions"})
    public static class RoomRates {
        @XmlElement(name = "RoomRate")
        protected List<RoomStayType.RoomRates.RoomRate> roomRate;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "MoreRatesExistInd")
        protected Boolean moreRatesExistInd;

        public List<RoomStayType.RoomRates.RoomRate> getRoomRate() {
            if (roomRate == null) {
                roomRate = new ArrayList<RoomStayType.RoomRates.RoomRate>();
            }
            return this.roomRate;
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
         * ��ȡmoreRatesExistInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isMoreRatesExistInd() {
            return moreRatesExistInd;
        }

        /**
         * ����moreRatesExistInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setMoreRatesExistInd(Boolean value) {
            this.moreRatesExistInd = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"advanceBookingRestriction", "restrictions", "serviceRPHs", "guestCounts"})
        public static class RoomRate extends RoomRateType {

            @XmlElement(name = "AdvanceBookingRestriction")
            protected RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction advanceBookingRestriction;
            @XmlElement(name = "Restrictions")
            protected ArrayOfRoomStayTypeRoomRatesRoomRateRestriction restrictions;
            @XmlElement(name = "ServiceRPHs")
            protected ArrayOfServiceRPHsTypeServiceRPH serviceRPHs;
            @XmlElement(name = "GuestCounts")
            protected ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount guestCounts;

            public RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction getAdvanceBookingRestriction() {
                return advanceBookingRestriction;
            }

            /**
             * ����advanceBookingRestriction���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction }
             */
            public void setAdvanceBookingRestriction(RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction value) {
                this.advanceBookingRestriction = value;
            }

            /**
             * ��ȡrestrictions���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfRoomStayTypeRoomRatesRoomRateRestriction }
             */
            public ArrayOfRoomStayTypeRoomRatesRoomRateRestriction getRestrictions() {
                return restrictions;
            }

            /**
             * ����restrictions���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfRoomStayTypeRoomRatesRoomRateRestriction }
             */
            public void setRestrictions(ArrayOfRoomStayTypeRoomRatesRoomRateRestriction value) {
                this.restrictions = value;
            }

            /**
             * ��ȡserviceRPHs���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfServiceRPHsTypeServiceRPH }
             */
            public ArrayOfServiceRPHsTypeServiceRPH getServiceRPHs() {
                return serviceRPHs;
            }

            /**
             * ����serviceRPHs���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfServiceRPHsTypeServiceRPH }
             */
            public void setServiceRPHs(ArrayOfServiceRPHsTypeServiceRPH value) {
                this.serviceRPHs = value;
            }

            /**
             * ��ȡguestCounts���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount }
             */
            public ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount getGuestCounts() {
                return guestCounts;
            }

            /**
             * ����guestCounts���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount }
             */
            public void setGuestCounts(ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount value) {
                this.guestCounts = value;
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
             *       &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
             *       &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
             *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
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
                 * ��ȡminAdvanceBookingOffset���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Duration }
                 */
                public Duration getMinAdvanceBookingOffset() {
                    return minAdvanceBookingOffset;
                }

                /**
                 * ����minAdvanceBookingOffset���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Duration }
                 */
                public void setMinAdvanceBookingOffset(Duration value) {
                    this.minAdvanceBookingOffset = value;
                }

                /**
                 * ��ȡmaxAdvanceBookingOffset���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Duration }
                 */
                public Duration getMaxAdvanceBookingOffset() {
                    return maxAdvanceBookingOffset;
                }

                /**
                 * ����maxAdvanceBookingOffset���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Duration }
                 */
                public void setMaxAdvanceBookingOffset(Duration value) {
                    this.maxAdvanceBookingOffset = value;
                }

                /**
                 * ��ȡmon���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isMon() {
                    return mon;
                }

                /**
                 * ����mon���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setMon(Boolean value) {
                    this.mon = value;
                }

                /**
                 * ��ȡtue���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isTue() {
                    return tue;
                }

                /**
                 * ����tue���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setTue(Boolean value) {
                    this.tue = value;
                }

                /**
                 * ��ȡweds���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isWeds() {
                    return weds;
                }

                /**
                 * ����weds���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setWeds(Boolean value) {
                    this.weds = value;
                }

                /**
                 * ��ȡthur���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isThur() {
                    return thur;
                }

                /**
                 * ����thur���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setThur(Boolean value) {
                    this.thur = value;
                }

                /**
                 * ��ȡfri���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isFri() {
                    return fri;
                }

                /**
                 * ����fri���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setFri(Boolean value) {
                    this.fri = value;
                }

                /**
                 * ��ȡsat���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isSat() {
                    return sat;
                }

                /**
                 * ����sat���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setSat(Boolean value) {
                    this.sat = value;
                }

                /**
                 * ��ȡsun���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isSun() {
                    return sun;
                }

                /**
                 * ����sun���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setSun(Boolean value) {
                    this.sun = value;
                }

            }

        }

    }

}
