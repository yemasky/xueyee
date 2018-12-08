package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomRateType", propOrder = {"rates", "roomRateDescription", "features", "total", "availability"})
@XmlSeeAlso({pms.order.RoomStayType.RoomRates.RoomRate.class})
public class RoomRateType {
    @XmlElement(name = "Rates")
    protected ArrayOfRateTypeRate rates;
    @XmlElement(name = "RoomRateDescription")
    protected List<ParagraphType> roomRateDescription;
    @XmlElement(name = "Features")
    protected ArrayOfRoomRateTypeFeature features;
    @XmlElement(name = "Total")
    protected TotalType total;
    @XmlElement(name = "Availability")
    protected List<RoomRateType.Availability> availability;
    @XmlAttribute(name = "BookingCode")
    protected String bookingCode;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "ExpireDateExclusiveIndicator")
    protected Boolean expireDateExclusiveIndicator;
    @XmlAttribute(name = "RoomTypeCode")
    protected String roomTypeCode;
    @XmlAttribute(name = "InvBlockCode")
    protected String invBlockCode;
    @XmlAttribute(name = "NumberOfUnits")
    protected BigInteger numberOfUnits;
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
    @XmlAttribute(name = "AvailabilityStatus")
    protected RateIndicatorType availabilityStatus;
    @XmlAttribute(name = "RoomID")
    protected String roomID;

    /**
     * ��ȡrates���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRateTypeRate }
     */
    public ArrayOfRateTypeRate getRates() {
        return rates;
    }

    /**
     * ����rates���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRateTypeRate }
     */
    public void setRates(ArrayOfRateTypeRate value) {
        this.rates = value;
    }

    /**
     * Gets the value of the roomRateDescription property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomRateDescription property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomRateDescription().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     */
    public List<ParagraphType> getRoomRateDescription() {
        if (roomRateDescription == null) {
            roomRateDescription = new ArrayList<ParagraphType>();
        }
        return this.roomRateDescription;
    }

    /**
     * ��ȡfeatures���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRoomRateTypeFeature }
     */
    public ArrayOfRoomRateTypeFeature getFeatures() {
        return features;
    }

    /**
     * ����features���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRoomRateTypeFeature }
     */
    public void setFeatures(ArrayOfRoomRateTypeFeature value) {
        this.features = value;
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
     * Gets the value of the availability property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomRateType.Availability }
     */
    public List<RoomRateType.Availability> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<RoomRateType.Availability>();
        }
        return this.availability;
    }

    /**
     * ��ȡbookingCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * ����bookingCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * ��ȡeffectiveDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * ����effectiveDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * ��ȡexpireDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * ����expireDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * ��ȡexpireDateExclusiveIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isExpireDateExclusiveIndicator() {
        return expireDateExclusiveIndicator;
    }

    /**
     * ����expireDateExclusiveIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setExpireDateExclusiveIndicator(Boolean value) {
        this.expireDateExclusiveIndicator = value;
    }

    /**
     * ��ȡroomTypeCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * ����roomTypeCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    /**
     * ��ȡinvBlockCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInvBlockCode() {
        return invBlockCode;
    }

    /**
     * ����invBlockCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInvBlockCode(String value) {
        this.invBlockCode = value;
    }

    /**
     * ��ȡnumberOfUnits���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * ����numberOfUnits���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
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
     * ��ȡavailabilityStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link RateIndicatorType }
     */
    public RateIndicatorType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * ����availabilityStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RateIndicatorType }
     */
    public void setAvailabilityStatus(RateIndicatorType value) {
        this.availabilityStatus = value;
    }

    /**
     * ��ȡroomID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * ����roomID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomID(String value) {
        this.roomID = value;
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
     *       &lt;attribute name="AvailabilityStatus" type="{http://www.opentravel.org/OTA/2003/05}RateIndicatorType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Availability {

        @XmlAttribute(name = "AvailabilityStatus")
        protected RateIndicatorType availabilityStatus;

        /**
         * ��ȡavailabilityStatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link RateIndicatorType }
         */
        public RateIndicatorType getAvailabilityStatus() {
            return availabilityStatus;
        }

        /**
         * ����availabilityStatus���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link RateIndicatorType }
         */
        public void setAvailabilityStatus(RateIndicatorType value) {
            this.availabilityStatus = value;
        }

    }

}
