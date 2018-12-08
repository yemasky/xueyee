
package ota.jw.PMSGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AreaInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AreaInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RefPoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RefPointsType"&gt;
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Attractions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Attraction" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Contact" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType"&gt;
 *                                     &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/&gt;
 *                             &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
 *                             &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/&gt;
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="AttractionCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="AttractionFee" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *                           &lt;attribute name="CourtesyPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                           &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="MinAgeAppropriateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Recreations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Recreation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/&gt;
 *                             &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/&gt;
 *                             &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/&gt;
 *                             &lt;element name="MultimediaDescriptions" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType"&gt;
 *                                     &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="RecreationDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail" minOccurs="0"/&gt;
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="YearReplaced" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherHotels" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OtherHotel" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/&gt;
 *                             &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="CompetitorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="AlternateID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
@XmlType(name = "AreaInfoType", propOrder = {
    "refPoints",
    "attractions",
    "recreations",
    "otherHotels"
})
public class AreaInfoType {

    @XmlElement(name = "RefPoints")
    protected AreaInfoType.RefPoints refPoints;
    @XmlElement(name = "Attractions")
    protected AreaInfoType.Attractions attractions;
    @XmlElement(name = "Recreations")
    protected AreaInfoType.Recreations recreations;
    @XmlElement(name = "OtherHotels")
    protected AreaInfoType.OtherHotels otherHotels;

    /**
     * 获取refPoints属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType.RefPoints }
     *     
     */
    public AreaInfoType.RefPoints getRefPoints() {
        return refPoints;
    }

    /**
     * 设置refPoints属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType.RefPoints }
     *     
     */
    public void setRefPoints(AreaInfoType.RefPoints value) {
        this.refPoints = value;
    }

    /**
     * 获取attractions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType.Attractions }
     *     
     */
    public AreaInfoType.Attractions getAttractions() {
        return attractions;
    }

    /**
     * 设置attractions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType.Attractions }
     *     
     */
    public void setAttractions(AreaInfoType.Attractions value) {
        this.attractions = value;
    }

    /**
     * 获取recreations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType.Recreations }
     *     
     */
    public AreaInfoType.Recreations getRecreations() {
        return recreations;
    }

    /**
     * 设置recreations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType.Recreations }
     *     
     */
    public void setRecreations(AreaInfoType.Recreations value) {
        this.recreations = value;
    }

    /**
     * 获取otherHotels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AreaInfoType.OtherHotels }
     *     
     */
    public AreaInfoType.OtherHotels getOtherHotels() {
        return otherHotels;
    }

    /**
     * 设置otherHotels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AreaInfoType.OtherHotels }
     *     
     */
    public void setOtherHotels(AreaInfoType.OtherHotels value) {
        this.otherHotels = value;
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
     *         &lt;element name="Attraction" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Contact" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType"&gt;
     *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/&gt;
     *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
     *                   &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/&gt;
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="AttractionCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="AttractionFee" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
     *                 &lt;attribute name="CourtesyPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *                 &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="MinAgeAppropriateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attraction"
    })
    public static class Attractions {

        @XmlElement(name = "Attraction")
        protected List<AreaInfoType.Attractions.Attraction> attraction;
        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;

        /**
         * Gets the value of the attraction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attraction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttraction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaInfoType.Attractions.Attraction }
         * 
         * 
         */
        public List<AreaInfoType.Attractions.Attraction> getAttraction() {
            if (attraction == null) {
                attraction = new ArrayList<AreaInfoType.Attractions.Attraction>();
            }
            return this.attraction;
        }

        /**
         * 获取lastUpdated属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * 设置lastUpdated属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
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
         *         &lt;element name="Contact" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType"&gt;
         *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/&gt;
         *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
         *         &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/&gt;
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="AttractionCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="AttractionFee" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
         *       &lt;attribute name="CourtesyPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
         *       &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="MinAgeAppropriateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contact",
            "operationSchedules",
            "multimediaDescriptions",
            "refPoints",
            "descriptiveText"
        })
        public static class Attraction {

            @XmlElement(name = "Contact")
            protected AreaInfoType.Attractions.Attraction.Contact contact;
            @XmlElement(name = "OperationSchedules")
            protected ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule operationSchedules;
            @XmlElement(name = "MultimediaDescriptions")
            protected MultimediaDescriptionsType multimediaDescriptions;
            @XmlElement(name = "RefPoints")
            protected ArrayOfRefPointsTypeRefPoint refPoints;
            @XmlElement(name = "DescriptiveText")
            protected String descriptiveText;
            @XmlAttribute(name = "AttractionCategoryCode")
            protected String attractionCategoryCode;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "AttractionName")
            protected String attractionName;
            @XmlAttribute(name = "AttractionFee")
            protected Float attractionFee;
            @XmlAttribute(name = "CourtesyPhone")
            protected Boolean courtesyPhone;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "URI")
            @XmlSchemaType(name = "anyURI")
            protected String uri;
            @XmlAttribute(name = "ProximityCode")
            protected String proximityCode;
            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "Sort")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger sort;
            @XmlAttribute(name = "MinAgeAppropriateCode")
            protected String minAgeAppropriateCode;
            @XmlAttribute(name = "ApplicableStart")
            protected String applicableStart;
            @XmlAttribute(name = "ApplicableEnd")
            protected String applicableEnd;

            /**
             * 获取contact属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AreaInfoType.Attractions.Attraction.Contact }
             *     
             */
            public AreaInfoType.Attractions.Attraction.Contact getContact() {
                return contact;
            }

            /**
             * 设置contact属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AreaInfoType.Attractions.Attraction.Contact }
             *     
             */
            public void setContact(AreaInfoType.Attractions.Attraction.Contact value) {
                this.contact = value;
            }

            /**
             * 获取operationSchedules属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
             *     
             */
            public ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule getOperationSchedules() {
                return operationSchedules;
            }

            /**
             * 设置operationSchedules属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
             *     
             */
            public void setOperationSchedules(ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule value) {
                this.operationSchedules = value;
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
             * 获取refPoints属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfRefPointsTypeRefPoint }
             *     
             */
            public ArrayOfRefPointsTypeRefPoint getRefPoints() {
                return refPoints;
            }

            /**
             * 设置refPoints属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfRefPointsTypeRefPoint }
             *     
             */
            public void setRefPoints(ArrayOfRefPointsTypeRefPoint value) {
                this.refPoints = value;
            }

            /**
             * 获取descriptiveText属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * 设置descriptiveText属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * 获取attractionCategoryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttractionCategoryCode() {
                return attractionCategoryCode;
            }

            /**
             * 设置attractionCategoryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttractionCategoryCode(String value) {
                this.attractionCategoryCode = value;
            }

            /**
             * 获取codeDetail属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * 设置codeDetail属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * 获取attractionName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttractionName() {
                return attractionName;
            }

            /**
             * 设置attractionName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttractionName(String value) {
                this.attractionName = value;
            }

            /**
             * 获取attractionFee属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getAttractionFee() {
                return attractionFee;
            }

            /**
             * 设置attractionFee属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setAttractionFee(Float value) {
                this.attractionFee = value;
            }

            /**
             * 获取courtesyPhone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCourtesyPhone() {
                return courtesyPhone;
            }

            /**
             * 设置courtesyPhone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCourtesyPhone(Boolean value) {
                this.courtesyPhone = value;
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
             * 获取proximityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProximityCode() {
                return proximityCode;
            }

            /**
             * 设置proximityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProximityCode(String value) {
                this.proximityCode = value;
            }

            /**
             * 获取id属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * 设置id属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * 获取sort属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSort() {
                return sort;
            }

            /**
             * 设置sort属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSort(BigInteger value) {
                this.sort = value;
            }

            /**
             * 获取minAgeAppropriateCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinAgeAppropriateCode() {
                return minAgeAppropriateCode;
            }

            /**
             * 设置minAgeAppropriateCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinAgeAppropriateCode(String value) {
                this.minAgeAppropriateCode = value;
            }

            /**
             * 获取applicableStart属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicableStart() {
                return applicableStart;
            }

            /**
             * 设置applicableStart属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicableStart(String value) {
                this.applicableStart = value;
            }

            /**
             * 获取applicableEnd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicableEnd() {
                return applicableEnd;
            }

            /**
             * 设置applicableEnd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicableEnd(String value) {
                this.applicableEnd = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType"&gt;
             *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Contact
                extends ContactInfoType
            {

                @XmlAttribute(name = "Removal")
                protected Boolean removal;

                /**
                 * 获取removal属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRemoval() {
                    return removal;
                }

                /**
                 * 设置removal属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRemoval(Boolean value) {
                    this.removal = value;
                }

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
     *       &lt;sequence&gt;
     *         &lt;element name="OtherHotel" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/&gt;
     *                   &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="CompetitorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="AlternateID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherHotel"
    })
    public static class OtherHotels {

        @XmlElement(name = "OtherHotel")
        protected List<AreaInfoType.OtherHotels.OtherHotel> otherHotel;
        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;

        /**
         * Gets the value of the otherHotel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherHotel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherHotel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaInfoType.OtherHotels.OtherHotel }
         * 
         * 
         */
        public List<AreaInfoType.OtherHotels.OtherHotel> getOtherHotel() {
            if (otherHotel == null) {
                otherHotel = new ArrayList<AreaInfoType.OtherHotels.OtherHotel>();
            }
            return this.otherHotel;
        }

        /**
         * 获取lastUpdated属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * 设置lastUpdated属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
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
         *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/&gt;
         *         &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="CompetitorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="AlternateID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contactInfos",
            "refPoints"
        })
        public static class OtherHotel {

            @XmlElement(name = "ContactInfos")
            protected ArrayOfContactInfoRootType contactInfos;
            @XmlElement(name = "RefPoints")
            protected ArrayOfRefPointsTypeRefPoint refPoints;
            @XmlAttribute(name = "CompetitorIndicator")
            protected Boolean competitorIndicator;
            @XmlAttribute(name = "SegmentCategoryCode")
            protected String segmentCategoryCode;
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
            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "AlternateID")
            protected String alternateID;

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
             * 获取refPoints属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfRefPointsTypeRefPoint }
             *     
             */
            public ArrayOfRefPointsTypeRefPoint getRefPoints() {
                return refPoints;
            }

            /**
             * 设置refPoints属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfRefPointsTypeRefPoint }
             *     
             */
            public void setRefPoints(ArrayOfRefPointsTypeRefPoint value) {
                this.refPoints = value;
            }

            /**
             * 获取competitorIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCompetitorIndicator() {
                return competitorIndicator;
            }

            /**
             * 设置competitorIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCompetitorIndicator(Boolean value) {
                this.competitorIndicator = value;
            }

            /**
             * 获取segmentCategoryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegmentCategoryCode() {
                return segmentCategoryCode;
            }

            /**
             * 设置segmentCategoryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegmentCategoryCode(String value) {
                this.segmentCategoryCode = value;
            }

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

            /**
             * 获取id属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * 设置id属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * 获取alternateID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternateID() {
                return alternateID;
            }

            /**
             * 设置alternateID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternateID(String value) {
                this.alternateID = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Recreation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/&gt;
     *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/&gt;
     *                   &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/&gt;
     *                   &lt;element name="MultimediaDescriptions" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType"&gt;
     *                           &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="RecreationDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail" minOccurs="0"/&gt;
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="YearReplaced" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recreation"
    })
    public static class Recreations {

        @XmlElement(name = "Recreation")
        protected List<AreaInfoType.Recreations.Recreation> recreation;
        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;

        /**
         * Gets the value of the recreation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recreation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecreation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaInfoType.Recreations.Recreation }
         * 
         * 
         */
        public List<AreaInfoType.Recreations.Recreation> getRecreation() {
            if (recreation == null) {
                recreation = new ArrayList<AreaInfoType.Recreations.Recreation>();
            }
            return this.recreation;
        }

        /**
         * 获取lastUpdated属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * 设置lastUpdated属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
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
         *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/&gt;
         *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/&gt;
         *         &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/&gt;
         *         &lt;element name="MultimediaDescriptions" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType"&gt;
         *                 &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="RecreationDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail" minOccurs="0"/&gt;
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="YearReplaced" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contact",
            "operationSchedules",
            "refPoints",
            "multimediaDescriptions",
            "recreationDetails",
            "descriptiveText"
        })
        public static class Recreation {

            @XmlElement(name = "Contact")
            protected ContactInfoType contact;
            @XmlElement(name = "OperationSchedules")
            protected ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule operationSchedules;
            @XmlElement(name = "RefPoints")
            protected ArrayOfRefPointsTypeRefPoint refPoints;
            @XmlElement(name = "MultimediaDescriptions")
            protected AreaInfoType.Recreations.Recreation.MultimediaDescriptions multimediaDescriptions;
            @XmlElement(name = "RecreationDetails")
            protected ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail recreationDetails;
            @XmlElement(name = "DescriptiveText")
            protected String descriptiveText;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "ProximityCode")
            protected String proximityCode;
            @XmlAttribute(name = "Included")
            protected Boolean included;
            @XmlAttribute(name = "ExistsCode")
            protected String existsCode;
            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "Sort")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger sort;
            @XmlAttribute(name = "YearReplaced")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar yearReplaced;

            /**
             * 获取contact属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ContactInfoType }
             *     
             */
            public ContactInfoType getContact() {
                return contact;
            }

            /**
             * 设置contact属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ContactInfoType }
             *     
             */
            public void setContact(ContactInfoType value) {
                this.contact = value;
            }

            /**
             * 获取operationSchedules属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
             *     
             */
            public ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule getOperationSchedules() {
                return operationSchedules;
            }

            /**
             * 设置operationSchedules属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
             *     
             */
            public void setOperationSchedules(ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule value) {
                this.operationSchedules = value;
            }

            /**
             * 获取refPoints属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfRefPointsTypeRefPoint }
             *     
             */
            public ArrayOfRefPointsTypeRefPoint getRefPoints() {
                return refPoints;
            }

            /**
             * 设置refPoints属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfRefPointsTypeRefPoint }
             *     
             */
            public void setRefPoints(ArrayOfRefPointsTypeRefPoint value) {
                this.refPoints = value;
            }

            /**
             * 获取multimediaDescriptions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AreaInfoType.Recreations.Recreation.MultimediaDescriptions }
             *     
             */
            public AreaInfoType.Recreations.Recreation.MultimediaDescriptions getMultimediaDescriptions() {
                return multimediaDescriptions;
            }

            /**
             * 设置multimediaDescriptions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AreaInfoType.Recreations.Recreation.MultimediaDescriptions }
             *     
             */
            public void setMultimediaDescriptions(AreaInfoType.Recreations.Recreation.MultimediaDescriptions value) {
                this.multimediaDescriptions = value;
            }

            /**
             * 获取recreationDetails属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail }
             *     
             */
            public ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail getRecreationDetails() {
                return recreationDetails;
            }

            /**
             * 设置recreationDetails属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail }
             *     
             */
            public void setRecreationDetails(ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail value) {
                this.recreationDetails = value;
            }

            /**
             * 获取descriptiveText属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * 设置descriptiveText属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * 获取codeDetail属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * 设置codeDetail属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * 获取code属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * 设置code属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * 获取name属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * 获取proximityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProximityCode() {
                return proximityCode;
            }

            /**
             * 设置proximityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProximityCode(String value) {
                this.proximityCode = value;
            }

            /**
             * 获取included属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIncluded() {
                return included;
            }

            /**
             * 设置included属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIncluded(Boolean value) {
                this.included = value;
            }

            /**
             * 获取existsCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExistsCode() {
                return existsCode;
            }

            /**
             * 设置existsCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExistsCode(String value) {
                this.existsCode = value;
            }

            /**
             * 获取id属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * 设置id属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * 获取sort属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSort() {
                return sort;
            }

            /**
             * 设置sort属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSort(BigInteger value) {
                this.sort = value;
            }

            /**
             * 获取yearReplaced属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getYearReplaced() {
                return yearReplaced;
            }

            /**
             * 设置yearReplaced属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setYearReplaced(XMLGregorianCalendar value) {
                this.yearReplaced = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType"&gt;
             *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MultimediaDescriptions
                extends MultimediaDescriptionsType
            {

                @XmlAttribute(name = "Location")
                protected Boolean location;
                @XmlAttribute(name = "RefDirectionTo")
                protected Boolean refDirectionTo;

                /**
                 * 获取location属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isLocation() {
                    return location;
                }

                /**
                 * 设置location属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setLocation(Boolean value) {
                    this.location = value;
                }

                /**
                 * 获取refDirectionTo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRefDirectionTo() {
                    return refDirectionTo;
                }

                /**
                 * 设置refDirectionTo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRefDirectionTo(Boolean value) {
                    this.refDirectionTo = value;
                }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RefPointsType"&gt;
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RefPoints
        extends RefPointsType
    {

        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;

        /**
         * 获取lastUpdated属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * 设置lastUpdated属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }

    }

}
