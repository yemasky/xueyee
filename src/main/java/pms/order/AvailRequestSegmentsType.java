package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>AvailRequestSegmentsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="AvailRequestSegmentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailRequestSegment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StayDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
 *                   &lt;element name="RateRange" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidate" minOccurs="0"/>
 *                   &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/>
 *                   &lt;element name="RoomStayCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate" minOccurs="0"/>
 *                   &lt;element name="HotelSearchCriteria" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AvailReqType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Room"/>
 *                       &lt;enumeration value="NonRoom"/>
 *                       &lt;enumeration value="Both"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ResponseType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="PropertyList"/>
 *                       &lt;enumeration value="AreaList"/>
 *                       &lt;enumeration value="PropertyRateList"/>
 *                       &lt;enumeration value="RateInfoDetails"/>
 *                       &lt;enumeration value="ProfilePrefs"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailRequestSegmentsType", propOrder = {
        "availRequestSegment"
})
@XmlSeeAlso({
        pms.order.OTAHotelAvailRQ.AvailRequestSegments.class
})
public class AvailRequestSegmentsType {

    @XmlElement(name = "AvailRequestSegment")
    protected List<AvailRequestSegmentsType.AvailRequestSegment> availRequestSegment;

    /**
     * Gets the value of the availRequestSegment property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availRequestSegment property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailRequestSegment().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailRequestSegmentsType.AvailRequestSegment }
     */
    public List<AvailRequestSegmentsType.AvailRequestSegment> getAvailRequestSegment() {
        if (availRequestSegment == null) {
            availRequestSegment = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment>();
        }
        return this.availRequestSegment;
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
     *         &lt;element name="StayDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
     *         &lt;element name="RateRange" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidate" minOccurs="0"/>
     *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/>
     *         &lt;element name="RoomStayCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate" minOccurs="0"/>
     *         &lt;element name="HotelSearchCriteria" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="AvailReqType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Room"/>
     *             &lt;enumeration value="NonRoom"/>
     *             &lt;enumeration value="Both"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResponseType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="PropertyList"/>
     *             &lt;enumeration value="AreaList"/>
     *             &lt;enumeration value="PropertyRateList"/>
     *             &lt;enumeration value="RateInfoDetails"/>
     *             &lt;enumeration value="ProfilePrefs"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "stayDateRange",
            "rateRange",
            "ratePlanCandidates",
            "profiles",
            "roomStayCandidates",
            "hotelSearchCriteria",
            "tpaExtensions"
    })
    public static class AvailRequestSegment {

        @XmlElement(name = "StayDateRange")
        protected DateTimeSpanType stayDateRange;
        @XmlElement(name = "RateRange")
        protected List<AvailRequestSegmentsType.AvailRequestSegment.RateRange> rateRange;
        @XmlElement(name = "RatePlanCandidates")
        protected ArrayOfRatePlanCandidatesTypeRatePlanCandidate ratePlanCandidates;
        @XmlElement(name = "Profiles")
        protected ArrayOfProfilesTypeProfileInfo profiles;
        @XmlElement(name = "RoomStayCandidates")
        protected ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate roomStayCandidates;
        @XmlElement(name = "HotelSearchCriteria")
        protected AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria hotelSearchCriteria;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "AvailReqType")
        protected String availReqType;
        @XmlAttribute(name = "MoreDataEchoToken")
        protected String moreDataEchoToken;
        @XmlAttribute(name = "ResponseType")
        protected String responseType;
        @XmlAttribute(name = "InfoSource")
        protected String infoSource;

        /**
         * ��ȡstayDateRange���Ե�ֵ��
         *
         * @return possible object is
         * {@link DateTimeSpanType }
         */
        public DateTimeSpanType getStayDateRange() {
            return stayDateRange;
        }

        /**
         * ����stayDateRange���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DateTimeSpanType }
         */
        public void setStayDateRange(DateTimeSpanType value) {
            this.stayDateRange = value;
        }

        /**
         * Gets the value of the rateRange property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rateRange property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRateRange().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link AvailRequestSegmentsType.AvailRequestSegment.RateRange }
         */
        public List<AvailRequestSegmentsType.AvailRequestSegment.RateRange> getRateRange() {
            if (rateRange == null) {
                rateRange = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment.RateRange>();
            }
            return this.rateRange;
        }

        /**
         * ��ȡratePlanCandidates���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate }
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidate getRatePlanCandidates() {
            return ratePlanCandidates;
        }

        /**
         * ����ratePlanCandidates���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate }
         */
        public void setRatePlanCandidates(ArrayOfRatePlanCandidatesTypeRatePlanCandidate value) {
            this.ratePlanCandidates = value;
        }

        /**
         * ��ȡprofiles���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfProfilesTypeProfileInfo }
         */
        public ArrayOfProfilesTypeProfileInfo getProfiles() {
            return profiles;
        }

        /**
         * ����profiles���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfProfilesTypeProfileInfo }
         */
        public void setProfiles(ArrayOfProfilesTypeProfileInfo value) {
            this.profiles = value;
        }

        /**
         * ��ȡroomStayCandidates���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate }
         */
        public ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate getRoomStayCandidates() {
            return roomStayCandidates;
        }

        /**
         * ����roomStayCandidates���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate }
         */
        public void setRoomStayCandidates(ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate value) {
            this.roomStayCandidates = value;
        }

        /**
         * ��ȡhotelSearchCriteria���Ե�ֵ��
         *
         * @return possible object is
         * {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
         */
        public AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria getHotelSearchCriteria() {
            return hotelSearchCriteria;
        }

        /**
         * ����hotelSearchCriteria���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
         */
        public void setHotelSearchCriteria(AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria value) {
            this.hotelSearchCriteria = value;
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
         * ��ȡavailReqType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAvailReqType() {
            return availReqType;
        }

        /**
         * ����availReqType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAvailReqType(String value) {
            this.availReqType = value;
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
         * ��ȡresponseType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getResponseType() {
            return responseType;
        }

        /**
         * ����responseType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setResponseType(String value) {
            this.responseType = value;
        }

        /**
         * ��ȡinfoSource���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * ����infoSource���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HotelSearchCriteria
                extends HotelSearchCriteriaType {


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
         *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RateRange {

            @XmlAttribute(name = "RoomStayCandidateRPH")
            protected String roomStayCandidateRPH;
            @XmlAttribute(name = "MinRate")
            protected BigDecimal minRate;
            @XmlAttribute(name = "MaxRate")
            protected BigDecimal maxRate;
            @XmlAttribute(name = "FixedRate")
            protected BigDecimal fixedRate;
            @XmlAttribute(name = "RateTimeUnit")
            protected TimeUnitType rateTimeUnit;

            /**
             * ��ȡroomStayCandidateRPH���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getRoomStayCandidateRPH() {
                return roomStayCandidateRPH;
            }

            /**
             * ����roomStayCandidateRPH���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRoomStayCandidateRPH(String value) {
                this.roomStayCandidateRPH = value;
            }

            /**
             * ��ȡminRate���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMinRate() {
                return minRate;
            }

            /**
             * ����minRate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMinRate(BigDecimal value) {
                this.minRate = value;
            }

            /**
             * ��ȡmaxRate���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMaxRate() {
                return maxRate;
            }

            /**
             * ����maxRate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMaxRate(BigDecimal value) {
                this.maxRate = value;
            }

            /**
             * ��ȡfixedRate���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getFixedRate() {
                return fixedRate;
            }

            /**
             * ����fixedRate���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setFixedRate(BigDecimal value) {
                this.fixedRate = value;
            }

            /**
             * ��ȡrateTimeUnit���Ե�ֵ��
             *
             * @return possible object is
             * {@link TimeUnitType }
             */
            public TimeUnitType getRateTimeUnit() {
                return rateTimeUnit;
            }

            /**
             * ����rateTimeUnit���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link TimeUnitType }
             */
            public void setRateTimeUnit(TimeUnitType value) {
                this.rateTimeUnit = value;
            }

        }

    }

}
