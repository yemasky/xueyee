package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfOfferTypeOfferRule complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfOfferTypeOfferRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferRule" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DateRestriction" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RestrictionType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="arrival"/>
 *                                 &lt;enumeration value="departure"/>
 *                                 &lt;enumeration value="booking"/>
 *                                 &lt;enumeration value="stay"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/>
 *                   &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/>
 *                   &lt;element name="Occupancy" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                           &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Inventories" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeOfferRuleInventory" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="StayOverDate" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                 &lt;attribute name="MinTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxContiguousBookings" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
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
@XmlType(name = "ArrayOfOfferTypeOfferRule", propOrder = {
        "offerRule"
})
public class ArrayOfOfferTypeOfferRule {

    @XmlElement(name = "OfferRule")
    protected List<ArrayOfOfferTypeOfferRule.OfferRule> offerRule;

    /**
     * Gets the value of the offerRule property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerRule property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferRule().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOfferTypeOfferRule.OfferRule }
     */
    public List<ArrayOfOfferTypeOfferRule.OfferRule> getOfferRule() {
        if (offerRule == null) {
            offerRule = new ArrayList<ArrayOfOfferTypeOfferRule.OfferRule>();
        }
        return this.offerRule;
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
     *         &lt;element name="DateRestriction" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RestrictionType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="arrival"/>
     *                       &lt;enumeration value="departure"/>
     *                       &lt;enumeration value="booking"/>
     *                       &lt;enumeration value="stay"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/>
     *         &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/>
     *         &lt;element name="Occupancy" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Inventories" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeOfferRuleInventory" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="StayOverDate" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *       &lt;attribute name="MinTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxContiguousBookings" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "dateRestriction",
            "lengthsOfStay",
            "dowRestrictions",
            "occupancy",
            "inventories"
    })
    public static class OfferRule {

        @XmlElement(name = "DateRestriction")
        protected List<ArrayOfOfferTypeOfferRule.OfferRule.DateRestriction> dateRestriction;
        @XmlElement(name = "LengthsOfStay")
        protected LengthsOfStayType lengthsOfStay;
        @XmlElement(name = "DOW_Restrictions")
        protected DOWRestrictionsType dowRestrictions;
        @XmlElement(name = "Occupancy")
        protected List<ArrayOfOfferTypeOfferRule.OfferRule.Occupancy> occupancy;
        @XmlElement(name = "Inventories")
        protected ArrayOfOfferTypeOfferRuleInventory inventories;
        @XmlAttribute(name = "StayOverDate")
        protected DayOfWeekType stayOverDate;
        @XmlAttribute(name = "MinTotalOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minTotalOccupancy;
        @XmlAttribute(name = "MaxTotalOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxTotalOccupancy;
        @XmlAttribute(name = "MaxContiguousBookings")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxContiguousBookings;
        @XmlAttribute(name = "MaxAdvancedBookingOffset")
        protected Duration maxAdvancedBookingOffset;
        @XmlAttribute(name = "MinAdvancedBookingOffset")
        protected Duration minAdvancedBookingOffset;

        /**
         * Gets the value of the dateRestriction property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dateRestriction property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDateRestriction().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfOfferTypeOfferRule.OfferRule.DateRestriction }
         */
        public List<ArrayOfOfferTypeOfferRule.OfferRule.DateRestriction> getDateRestriction() {
            if (dateRestriction == null) {
                dateRestriction = new ArrayList<ArrayOfOfferTypeOfferRule.OfferRule.DateRestriction>();
            }
            return this.dateRestriction;
        }

        /**
         * ��ȡlengthsOfStay���Ե�ֵ��
         *
         * @return possible object is
         * {@link LengthsOfStayType }
         */
        public LengthsOfStayType getLengthsOfStay() {
            return lengthsOfStay;
        }

        /**
         * ����lengthsOfStay���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link LengthsOfStayType }
         */
        public void setLengthsOfStay(LengthsOfStayType value) {
            this.lengthsOfStay = value;
        }

        /**
         * ��ȡdowRestrictions���Ե�ֵ��
         *
         * @return possible object is
         * {@link DOWRestrictionsType }
         */
        public DOWRestrictionsType getDOWRestrictions() {
            return dowRestrictions;
        }

        /**
         * ����dowRestrictions���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DOWRestrictionsType }
         */
        public void setDOWRestrictions(DOWRestrictionsType value) {
            this.dowRestrictions = value;
        }

        /**
         * Gets the value of the occupancy property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the occupancy property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOccupancy().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfOfferTypeOfferRule.OfferRule.Occupancy }
         */
        public List<ArrayOfOfferTypeOfferRule.OfferRule.Occupancy> getOccupancy() {
            if (occupancy == null) {
                occupancy = new ArrayList<ArrayOfOfferTypeOfferRule.OfferRule.Occupancy>();
            }
            return this.occupancy;
        }

        /**
         * ��ȡinventories���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfOfferTypeOfferRuleInventory }
         */
        public ArrayOfOfferTypeOfferRuleInventory getInventories() {
            return inventories;
        }

        /**
         * ����inventories���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfOfferTypeOfferRuleInventory }
         */
        public void setInventories(ArrayOfOfferTypeOfferRuleInventory value) {
            this.inventories = value;
        }

        /**
         * ��ȡstayOverDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link DayOfWeekType }
         */
        public DayOfWeekType getStayOverDate() {
            return stayOverDate;
        }

        /**
         * ����stayOverDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DayOfWeekType }
         */
        public void setStayOverDate(DayOfWeekType value) {
            this.stayOverDate = value;
        }

        /**
         * ��ȡminTotalOccupancy���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMinTotalOccupancy() {
            return minTotalOccupancy;
        }

        /**
         * ����minTotalOccupancy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMinTotalOccupancy(BigInteger value) {
            this.minTotalOccupancy = value;
        }

        /**
         * ��ȡmaxTotalOccupancy���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxTotalOccupancy() {
            return maxTotalOccupancy;
        }

        /**
         * ����maxTotalOccupancy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxTotalOccupancy(BigInteger value) {
            this.maxTotalOccupancy = value;
        }

        /**
         * ��ȡmaxContiguousBookings���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxContiguousBookings() {
            return maxContiguousBookings;
        }

        /**
         * ����maxContiguousBookings���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxContiguousBookings(BigInteger value) {
            this.maxContiguousBookings = value;
        }

        /**
         * ��ȡmaxAdvancedBookingOffset���Ե�ֵ��
         *
         * @return possible object is
         * {@link Duration }
         */
        public Duration getMaxAdvancedBookingOffset() {
            return maxAdvancedBookingOffset;
        }

        /**
         * ����maxAdvancedBookingOffset���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Duration }
         */
        public void setMaxAdvancedBookingOffset(Duration value) {
            this.maxAdvancedBookingOffset = value;
        }

        /**
         * ��ȡminAdvancedBookingOffset���Ե�ֵ��
         *
         * @return possible object is
         * {@link Duration }
         */
        public Duration getMinAdvancedBookingOffset() {
            return minAdvancedBookingOffset;
        }

        /**
         * ����minAdvancedBookingOffset���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Duration }
         */
        public void setMinAdvancedBookingOffset(Duration value) {
            this.minAdvancedBookingOffset = value;
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
         *       &lt;attribute name="RestrictionType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="arrival"/>
         *             &lt;enumeration value="departure"/>
         *             &lt;enumeration value="booking"/>
         *             &lt;enumeration value="stay"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DateRestriction {

            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "RestrictionType")
            protected String restrictionType;

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
             * ��ȡrestrictionType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getRestrictionType() {
                return restrictionType;
            }

            /**
             * ����restrictionType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRestrictionType(String value) {
                this.restrictionType = value;
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
         *       &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
         *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Occupancy {

            @XmlAttribute(name = "MinOccupancy")
            protected BigInteger minOccupancy;
            @XmlAttribute(name = "MaxOccupancy")
            protected BigInteger maxOccupancy;
            @XmlAttribute(name = "AgeQualifyingCode")
            protected String ageQualifyingCode;
            @XmlAttribute(name = "MinAge")
            protected BigInteger minAge;
            @XmlAttribute(name = "MaxAge")
            protected BigInteger maxAge;
            @XmlAttribute(name = "AgeTimeUnit")
            protected TimeUnitType ageTimeUnit;
            @XmlAttribute(name = "AgeBucket")
            protected String ageBucket;

            /**
             * ��ȡminOccupancy���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getMinOccupancy() {
                return minOccupancy;
            }

            /**
             * ����minOccupancy���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setMinOccupancy(BigInteger value) {
                this.minOccupancy = value;
            }

            /**
             * ��ȡmaxOccupancy���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getMaxOccupancy() {
                return maxOccupancy;
            }

            /**
             * ����maxOccupancy���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setMaxOccupancy(BigInteger value) {
                this.maxOccupancy = value;
            }

            /**
             * ��ȡageQualifyingCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAgeQualifyingCode() {
                return ageQualifyingCode;
            }

            /**
             * ����ageQualifyingCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAgeQualifyingCode(String value) {
                this.ageQualifyingCode = value;
            }

            /**
             * ��ȡminAge���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getMinAge() {
                return minAge;
            }

            /**
             * ����minAge���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setMinAge(BigInteger value) {
                this.minAge = value;
            }

            /**
             * ��ȡmaxAge���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getMaxAge() {
                return maxAge;
            }

            /**
             * ����maxAge���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setMaxAge(BigInteger value) {
                this.maxAge = value;
            }

            /**
             * ��ȡageTimeUnit���Ե�ֵ��
             *
             * @return possible object is
             * {@link TimeUnitType }
             */
            public TimeUnitType getAgeTimeUnit() {
                return ageTimeUnit;
            }

            /**
             * ����ageTimeUnit���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link TimeUnitType }
             */
            public void setAgeTimeUnit(TimeUnitType value) {
                this.ageTimeUnit = value;
            }

            /**
             * ��ȡageBucket���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAgeBucket() {
                return ageBucket;
            }

            /**
             * ����ageBucket���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAgeBucket(String value) {
                this.ageBucket = value;
            }

        }

    }

}
