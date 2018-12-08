
package ota.jw.GenericSeamlessGateway;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AvailRequestSegmentsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AvailRequestSegmentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailRequestSegment" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StayDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/&gt;
 *                   &lt;element name="RateRange" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidate" minOccurs="0"/&gt;
 *                   &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/&gt;
 *                   &lt;element name="RoomStayCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate" minOccurs="0"/&gt;
 *                   &lt;element name="HotelSearchCriteria" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="AvailReqType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Room"/&gt;
 *                       &lt;enumeration value="NonRoom"/&gt;
 *                       &lt;enumeration value="Both"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "AvailRequestSegmentsType", propOrder = {
    "availRequestSegment"
})
@XmlSeeAlso({
    ota.jw.GenericSeamlessGateway.OTAHotelAvailRQ.AvailRequestSegments.class
})
public class AvailRequestSegmentsType {

    @XmlElement(name = "AvailRequestSegment")
    protected List<AvailRequestSegmentsType.AvailRequestSegment> availRequestSegment;

    /**
     * Gets the value of the availRequestSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availRequestSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailRequestSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailRequestSegmentsType.AvailRequestSegment }
     * 
     * 
     */
    public List<AvailRequestSegmentsType.AvailRequestSegment> getAvailRequestSegment() {
        if (availRequestSegment == null) {
            availRequestSegment = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment>();
        }
        return this.availRequestSegment;
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
     *         &lt;element name="StayDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/&gt;
     *         &lt;element name="RateRange" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidate" minOccurs="0"/&gt;
     *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/&gt;
     *         &lt;element name="RoomStayCandidates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate" minOccurs="0"/&gt;
     *         &lt;element name="HotelSearchCriteria" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="AvailReqType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Room"/&gt;
     *             &lt;enumeration value="NonRoom"/&gt;
     *             &lt;enumeration value="Both"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取stayDateRange属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DateTimeSpanType }
         *     
         */
        public DateTimeSpanType getStayDateRange() {
            return stayDateRange;
        }

        /**
         * 设置stayDateRange属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeSpanType }
         *     
         */
        public void setStayDateRange(DateTimeSpanType value) {
            this.stayDateRange = value;
        }

        /**
         * Gets the value of the rateRange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rateRange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRateRange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AvailRequestSegmentsType.AvailRequestSegment.RateRange }
         * 
         * 
         */
        public List<AvailRequestSegmentsType.AvailRequestSegment.RateRange> getRateRange() {
            if (rateRange == null) {
                rateRange = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment.RateRange>();
            }
            return this.rateRange;
        }

        /**
         * 获取ratePlanCandidates属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate }
         *     
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidate getRatePlanCandidates() {
            return ratePlanCandidates;
        }

        /**
         * 设置ratePlanCandidates属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate }
         *     
         */
        public void setRatePlanCandidates(ArrayOfRatePlanCandidatesTypeRatePlanCandidate value) {
            this.ratePlanCandidates = value;
        }

        /**
         * 获取profiles属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfProfilesTypeProfileInfo }
         *     
         */
        public ArrayOfProfilesTypeProfileInfo getProfiles() {
            return profiles;
        }

        /**
         * 设置profiles属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfProfilesTypeProfileInfo }
         *     
         */
        public void setProfiles(ArrayOfProfilesTypeProfileInfo value) {
            this.profiles = value;
        }

        /**
         * 获取roomStayCandidates属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate }
         *     
         */
        public ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate getRoomStayCandidates() {
            return roomStayCandidates;
        }

        /**
         * 设置roomStayCandidates属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate }
         *     
         */
        public void setRoomStayCandidates(ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate value) {
            this.roomStayCandidates = value;
        }

        /**
         * 获取hotelSearchCriteria属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
         *     
         */
        public AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria getHotelSearchCriteria() {
            return hotelSearchCriteria;
        }

        /**
         * 设置hotelSearchCriteria属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
         *     
         */
        public void setHotelSearchCriteria(AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria value) {
            this.hotelSearchCriteria = value;
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
         * 获取availReqType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvailReqType() {
            return availReqType;
        }

        /**
         * 设置availReqType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvailReqType(String value) {
            this.availReqType = value;
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HotelSearchCriteria
            extends HotelSearchCriteriaType
        {


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
         *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * 获取minRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMinRate() {
                return minRate;
            }

            /**
             * 设置minRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMinRate(BigDecimal value) {
                this.minRate = value;
            }

            /**
             * 获取maxRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMaxRate() {
                return maxRate;
            }

            /**
             * 设置maxRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMaxRate(BigDecimal value) {
                this.maxRate = value;
            }

            /**
             * 获取fixedRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFixedRate() {
                return fixedRate;
            }

            /**
             * 设置fixedRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFixedRate(BigDecimal value) {
                this.fixedRate = value;
            }

            /**
             * 获取rateTimeUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TimeUnitType }
             *     
             */
            public TimeUnitType getRateTimeUnit() {
                return rateTimeUnit;
            }

            /**
             * 设置rateTimeUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TimeUnitType }
             *     
             */
            public void setRateTimeUnit(TimeUnitType value) {
                this.rateTimeUnit = value;
            }

        }

    }

}
