
package ota.jw.ARIPmsGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>ArrayOfOfferTypeOfferRule complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOfferTypeOfferRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferRule" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DateRestriction" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RestrictionType"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="arrival"/&gt;
 *                                 &lt;enumeration value="departure"/&gt;
 *                                 &lt;enumeration value="booking"/&gt;
 *                                 &lt;enumeration value="stay"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/&gt;
 *                   &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/&gt;
 *                   &lt;element name="Occupancy" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                           &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                           &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                           &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                           &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                           &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Inventories" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeOfferRuleInventory" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="StayOverDate" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *                 &lt;attribute name="MinTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="MaxTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="MaxContiguousBookings" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                 &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
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
@XmlType(name = "ArrayOfOfferTypeOfferRule", propOrder = {
    "offerRule"
})
public class ArrayOfOfferTypeOfferRule {

    @XmlElement(name = "OfferRule")
    protected List<ArrayOfOfferTypeOfferRule.OfferRule> offerRule;

    /**
     * Gets the value of the offerRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOfferTypeOfferRule.OfferRule }
     * 
     * 
     */
    public List<ArrayOfOfferTypeOfferRule.OfferRule> getOfferRule() {
        if (offerRule == null) {
            offerRule = new ArrayList<ArrayOfOfferTypeOfferRule.OfferRule>();
        }
        return this.offerRule;
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
     *         &lt;element name="DateRestriction" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RestrictionType"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="arrival"/&gt;
     *                       &lt;enumeration value="departure"/&gt;
     *                       &lt;enumeration value="booking"/&gt;
     *                       &lt;enumeration value="stay"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LengthsOfStay" type="{http://www.opentravel.org/OTA/2003/05}LengthsOfStayType" minOccurs="0"/&gt;
     *         &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/&gt;
     *         &lt;element name="Occupancy" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Inventories" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeOfferRuleInventory" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="StayOverDate" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
     *       &lt;attribute name="MinTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="MaxTotalOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="MaxContiguousBookings" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="MaxAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *       &lt;attribute name="MinAdvancedBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dateRestriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDateRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfOfferTypeOfferRule.OfferRule.DateRestriction }
         * 
         * 
         */
        public List<ArrayOfOfferTypeOfferRule.OfferRule.DateRestriction> getDateRestriction() {
            if (dateRestriction == null) {
                dateRestriction = new ArrayList<ArrayOfOfferTypeOfferRule.OfferRule.DateRestriction>();
            }
            return this.dateRestriction;
        }

        /**
         * 获取lengthsOfStay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LengthsOfStayType }
         *     
         */
        public LengthsOfStayType getLengthsOfStay() {
            return lengthsOfStay;
        }

        /**
         * 设置lengthsOfStay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LengthsOfStayType }
         *     
         */
        public void setLengthsOfStay(LengthsOfStayType value) {
            this.lengthsOfStay = value;
        }

        /**
         * 获取dowRestrictions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DOWRestrictionsType }
         *     
         */
        public DOWRestrictionsType getDOWRestrictions() {
            return dowRestrictions;
        }

        /**
         * 设置dowRestrictions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DOWRestrictionsType }
         *     
         */
        public void setDOWRestrictions(DOWRestrictionsType value) {
            this.dowRestrictions = value;
        }

        /**
         * Gets the value of the occupancy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the occupancy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOccupancy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfOfferTypeOfferRule.OfferRule.Occupancy }
         * 
         * 
         */
        public List<ArrayOfOfferTypeOfferRule.OfferRule.Occupancy> getOccupancy() {
            if (occupancy == null) {
                occupancy = new ArrayList<ArrayOfOfferTypeOfferRule.OfferRule.Occupancy>();
            }
            return this.occupancy;
        }

        /**
         * 获取inventories属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOfferTypeOfferRuleInventory }
         *     
         */
        public ArrayOfOfferTypeOfferRuleInventory getInventories() {
            return inventories;
        }

        /**
         * 设置inventories属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOfferTypeOfferRuleInventory }
         *     
         */
        public void setInventories(ArrayOfOfferTypeOfferRuleInventory value) {
            this.inventories = value;
        }

        /**
         * 获取stayOverDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getStayOverDate() {
            return stayOverDate;
        }

        /**
         * 设置stayOverDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setStayOverDate(DayOfWeekType value) {
            this.stayOverDate = value;
        }

        /**
         * 获取minTotalOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinTotalOccupancy() {
            return minTotalOccupancy;
        }

        /**
         * 设置minTotalOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinTotalOccupancy(BigInteger value) {
            this.minTotalOccupancy = value;
        }

        /**
         * 获取maxTotalOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxTotalOccupancy() {
            return maxTotalOccupancy;
        }

        /**
         * 设置maxTotalOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxTotalOccupancy(BigInteger value) {
            this.maxTotalOccupancy = value;
        }

        /**
         * 获取maxContiguousBookings属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxContiguousBookings() {
            return maxContiguousBookings;
        }

        /**
         * 设置maxContiguousBookings属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxContiguousBookings(BigInteger value) {
            this.maxContiguousBookings = value;
        }

        /**
         * 获取maxAdvancedBookingOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaxAdvancedBookingOffset() {
            return maxAdvancedBookingOffset;
        }

        /**
         * 设置maxAdvancedBookingOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaxAdvancedBookingOffset(Duration value) {
            this.maxAdvancedBookingOffset = value;
        }

        /**
         * 获取minAdvancedBookingOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMinAdvancedBookingOffset() {
            return minAdvancedBookingOffset;
        }

        /**
         * 设置minAdvancedBookingOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMinAdvancedBookingOffset(Duration value) {
            this.minAdvancedBookingOffset = value;
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
         *       &lt;attribute name="RestrictionType"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="arrival"/&gt;
         *             &lt;enumeration value="departure"/&gt;
         *             &lt;enumeration value="booking"/&gt;
         *             &lt;enumeration value="stay"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * 获取restrictionType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRestrictionType() {
                return restrictionType;
            }

            /**
             * 设置restrictionType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRestrictionType(String value) {
                this.restrictionType = value;
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
         *       &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
         *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * 获取minOccupancy属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinOccupancy() {
                return minOccupancy;
            }

            /**
             * 设置minOccupancy属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinOccupancy(BigInteger value) {
                this.minOccupancy = value;
            }

            /**
             * 获取maxOccupancy属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxOccupancy() {
                return maxOccupancy;
            }

            /**
             * 设置maxOccupancy属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxOccupancy(BigInteger value) {
                this.maxOccupancy = value;
            }

            /**
             * 获取ageQualifyingCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeQualifyingCode() {
                return ageQualifyingCode;
            }

            /**
             * 设置ageQualifyingCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeQualifyingCode(String value) {
                this.ageQualifyingCode = value;
            }

            /**
             * 获取minAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinAge() {
                return minAge;
            }

            /**
             * 设置minAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinAge(BigInteger value) {
                this.minAge = value;
            }

            /**
             * 获取maxAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxAge() {
                return maxAge;
            }

            /**
             * 设置maxAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxAge(BigInteger value) {
                this.maxAge = value;
            }

            /**
             * 获取ageTimeUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TimeUnitType }
             *     
             */
            public TimeUnitType getAgeTimeUnit() {
                return ageTimeUnit;
            }

            /**
             * 设置ageTimeUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TimeUnitType }
             *     
             */
            public void setAgeTimeUnit(TimeUnitType value) {
                this.ageTimeUnit = value;
            }

            /**
             * 获取ageBucket属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeBucket() {
                return ageBucket;
            }

            /**
             * 设置ageBucket属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeBucket(String value) {
                this.ageBucket = value;
            }

        }

    }

}
