package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>AreaInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="AreaInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefPoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RefPointsType">
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Attractions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attraction" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Contact" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
 *                                     &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
 *                             &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                             &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/>
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="AttractionCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AttractionFee" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="CourtesyPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="MinAgeAppropriateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Recreations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Recreation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
 *                             &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
 *                             &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/>
 *                             &lt;element name="MultimediaDescriptions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
 *                                     &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RecreationDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail" minOccurs="0"/>
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="YearReplaced" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherHotels" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherHotel" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/>
 *                             &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CompetitorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AlternateID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
     * ��ȡrefPoints���Ե�ֵ��
     *
     * @return possible object is
     * {@link AreaInfoType.RefPoints }
     */
    public AreaInfoType.RefPoints getRefPoints() {
        return refPoints;
    }

    /**
     * ����refPoints���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AreaInfoType.RefPoints }
     */
    public void setRefPoints(AreaInfoType.RefPoints value) {
        this.refPoints = value;
    }

    /**
     * ��ȡattractions���Ե�ֵ��
     *
     * @return possible object is
     * {@link AreaInfoType.Attractions }
     */
    public AreaInfoType.Attractions getAttractions() {
        return attractions;
    }

    /**
     * ����attractions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AreaInfoType.Attractions }
     */
    public void setAttractions(AreaInfoType.Attractions value) {
        this.attractions = value;
    }

    /**
     * ��ȡrecreations���Ե�ֵ��
     *
     * @return possible object is
     * {@link AreaInfoType.Recreations }
     */
    public AreaInfoType.Recreations getRecreations() {
        return recreations;
    }

    /**
     * ����recreations���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AreaInfoType.Recreations }
     */
    public void setRecreations(AreaInfoType.Recreations value) {
        this.recreations = value;
    }

    /**
     * ��ȡotherHotels���Ե�ֵ��
     *
     * @return possible object is
     * {@link AreaInfoType.OtherHotels }
     */
    public AreaInfoType.OtherHotels getOtherHotels() {
        return otherHotels;
    }

    /**
     * ����otherHotels���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AreaInfoType.OtherHotels }
     */
    public void setOtherHotels(AreaInfoType.OtherHotels value) {
        this.otherHotels = value;
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
     *         &lt;element name="Attraction" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Contact" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
     *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
     *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                   &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/>
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="AttractionCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AttractionFee" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="CourtesyPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                 &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="MinAgeAppropriateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attraction property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttraction().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaInfoType.Attractions.Attraction }
         */
        public List<AreaInfoType.Attractions.Attraction> getAttraction() {
            if (attraction == null) {
                attraction = new ArrayList<AreaInfoType.Attractions.Attraction>();
            }
            return this.attraction;
        }

        /**
         * ��ȡlastUpdated���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * ����lastUpdated���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
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
         *         &lt;element name="Contact" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
         *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
         *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *         &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/>
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="AttractionCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AttractionFee" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="CourtesyPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *       &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="MinAgeAppropriateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡcontact���Ե�ֵ��
             *
             * @return possible object is
             * {@link AreaInfoType.Attractions.Attraction.Contact }
             */
            public AreaInfoType.Attractions.Attraction.Contact getContact() {
                return contact;
            }

            /**
             * ����contact���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link AreaInfoType.Attractions.Attraction.Contact }
             */
            public void setContact(AreaInfoType.Attractions.Attraction.Contact value) {
                this.contact = value;
            }

            /**
             * ��ȡoperationSchedules���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
             */
            public ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule getOperationSchedules() {
                return operationSchedules;
            }

            /**
             * ����operationSchedules���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
             */
            public void setOperationSchedules(ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule value) {
                this.operationSchedules = value;
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
             * ��ȡrefPoints���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfRefPointsTypeRefPoint }
             */
            public ArrayOfRefPointsTypeRefPoint getRefPoints() {
                return refPoints;
            }

            /**
             * ����refPoints���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfRefPointsTypeRefPoint }
             */
            public void setRefPoints(ArrayOfRefPointsTypeRefPoint value) {
                this.refPoints = value;
            }

            /**
             * ��ȡdescriptiveText���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * ����descriptiveText���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * ��ȡattractionCategoryCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAttractionCategoryCode() {
                return attractionCategoryCode;
            }

            /**
             * ����attractionCategoryCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAttractionCategoryCode(String value) {
                this.attractionCategoryCode = value;
            }

            /**
             * ��ȡcodeDetail���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * ����codeDetail���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * ��ȡattractionName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAttractionName() {
                return attractionName;
            }

            /**
             * ����attractionName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAttractionName(String value) {
                this.attractionName = value;
            }

            /**
             * ��ȡattractionFee���Ե�ֵ��
             *
             * @return possible object is
             * {@link Float }
             */
            public Float getAttractionFee() {
                return attractionFee;
            }

            /**
             * ����attractionFee���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Float }
             */
            public void setAttractionFee(Float value) {
                this.attractionFee = value;
            }

            /**
             * ��ȡcourtesyPhone���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isCourtesyPhone() {
                return courtesyPhone;
            }

            /**
             * ����courtesyPhone���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setCourtesyPhone(Boolean value) {
                this.courtesyPhone = value;
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
             * ��ȡproximityCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getProximityCode() {
                return proximityCode;
            }

            /**
             * ����proximityCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setProximityCode(String value) {
                this.proximityCode = value;
            }

            /**
             * ��ȡid���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getID() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * ��ȡsort���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getSort() {
                return sort;
            }

            /**
             * ����sort���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setSort(BigInteger value) {
                this.sort = value;
            }

            /**
             * ��ȡminAgeAppropriateCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getMinAgeAppropriateCode() {
                return minAgeAppropriateCode;
            }

            /**
             * ����minAgeAppropriateCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMinAgeAppropriateCode(String value) {
                this.minAgeAppropriateCode = value;
            }

            /**
             * ��ȡapplicableStart���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getApplicableStart() {
                return applicableStart;
            }

            /**
             * ����applicableStart���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setApplicableStart(String value) {
                this.applicableStart = value;
            }

            /**
             * ��ȡapplicableEnd���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getApplicableEnd() {
                return applicableEnd;
            }

            /**
             * ����applicableEnd���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setApplicableEnd(String value) {
                this.applicableEnd = value;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * <p/>
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * <p/>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
             *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Contact
                    extends ContactInfoType {

                @XmlAttribute(name = "Removal")
                protected Boolean removal;

                /**
                 * ��ȡremoval���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isRemoval() {
                    return removal;
                }

                /**
                 * ����removal���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setRemoval(Boolean value) {
                    this.removal = value;
                }

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
     *       &lt;sequence>
     *         &lt;element name="OtherHotel" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/>
     *                   &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CompetitorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AlternateID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherHotel property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherHotel().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaInfoType.OtherHotels.OtherHotel }
         */
        public List<AreaInfoType.OtherHotels.OtherHotel> getOtherHotel() {
            if (otherHotel == null) {
                otherHotel = new ArrayList<AreaInfoType.OtherHotels.OtherHotel>();
            }
            return this.otherHotel;
        }

        /**
         * ��ȡlastUpdated���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * ����lastUpdated���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
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
         *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/>
         *         &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="CompetitorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AlternateID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡrefPoints���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfRefPointsTypeRefPoint }
             */
            public ArrayOfRefPointsTypeRefPoint getRefPoints() {
                return refPoints;
            }

            /**
             * ����refPoints���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfRefPointsTypeRefPoint }
             */
            public void setRefPoints(ArrayOfRefPointsTypeRefPoint value) {
                this.refPoints = value;
            }

            /**
             * ��ȡcompetitorIndicator���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isCompetitorIndicator() {
                return competitorIndicator;
            }

            /**
             * ����competitorIndicator���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setCompetitorIndicator(Boolean value) {
                this.competitorIndicator = value;
            }

            /**
             * ��ȡsegmentCategoryCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getSegmentCategoryCode() {
                return segmentCategoryCode;
            }

            /**
             * ����segmentCategoryCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSegmentCategoryCode(String value) {
                this.segmentCategoryCode = value;
            }

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

            /**
             * ��ȡid���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getID() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * ��ȡalternateID���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlternateID() {
                return alternateID;
            }

            /**
             * ����alternateID���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlternateID(String value) {
                this.alternateID = value;
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
     *       &lt;sequence>
     *         &lt;element name="Recreation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
     *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
     *                   &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/>
     *                   &lt;element name="MultimediaDescriptions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
     *                           &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RecreationDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail" minOccurs="0"/>
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="YearReplaced" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recreation property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecreation().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaInfoType.Recreations.Recreation }
         */
        public List<AreaInfoType.Recreations.Recreation> getRecreation() {
            if (recreation == null) {
                recreation = new ArrayList<AreaInfoType.Recreations.Recreation>();
            }
            return this.recreation;
        }

        /**
         * ��ȡlastUpdated���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * ����lastUpdated���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
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
         *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
         *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
         *         &lt;element name="RefPoints" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRefPointsTypeRefPoint" minOccurs="0"/>
         *         &lt;element name="MultimediaDescriptions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
         *                 &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RecreationDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail" minOccurs="0"/>
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="YearReplaced" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡcontact���Ե�ֵ��
             *
             * @return possible object is
             * {@link ContactInfoType }
             */
            public ContactInfoType getContact() {
                return contact;
            }

            /**
             * ����contact���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ContactInfoType }
             */
            public void setContact(ContactInfoType value) {
                this.contact = value;
            }

            /**
             * ��ȡoperationSchedules���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
             */
            public ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule getOperationSchedules() {
                return operationSchedules;
            }

            /**
             * ����operationSchedules���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
             */
            public void setOperationSchedules(ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule value) {
                this.operationSchedules = value;
            }

            /**
             * ��ȡrefPoints���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfRefPointsTypeRefPoint }
             */
            public ArrayOfRefPointsTypeRefPoint getRefPoints() {
                return refPoints;
            }

            /**
             * ����refPoints���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfRefPointsTypeRefPoint }
             */
            public void setRefPoints(ArrayOfRefPointsTypeRefPoint value) {
                this.refPoints = value;
            }

            /**
             * ��ȡmultimediaDescriptions���Ե�ֵ��
             *
             * @return possible object is
             * {@link AreaInfoType.Recreations.Recreation.MultimediaDescriptions }
             */
            public AreaInfoType.Recreations.Recreation.MultimediaDescriptions getMultimediaDescriptions() {
                return multimediaDescriptions;
            }

            /**
             * ����multimediaDescriptions���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link AreaInfoType.Recreations.Recreation.MultimediaDescriptions }
             */
            public void setMultimediaDescriptions(AreaInfoType.Recreations.Recreation.MultimediaDescriptions value) {
                this.multimediaDescriptions = value;
            }

            /**
             * ��ȡrecreationDetails���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail }
             */
            public ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail getRecreationDetails() {
                return recreationDetails;
            }

            /**
             * ����recreationDetails���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail }
             */
            public void setRecreationDetails(ArrayOfAreaInfoTypeRecreationsRecreationRecreationDetail value) {
                this.recreationDetails = value;
            }

            /**
             * ��ȡdescriptiveText���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * ����descriptiveText���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * ��ȡcodeDetail���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * ����codeDetail���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * ��ȡcode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getCode() {
                return code;
            }

            /**
             * ����code���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * ��ȡname���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getName() {
                return name;
            }

            /**
             * ����name���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * ��ȡproximityCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getProximityCode() {
                return proximityCode;
            }

            /**
             * ����proximityCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setProximityCode(String value) {
                this.proximityCode = value;
            }

            /**
             * ��ȡincluded���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isIncluded() {
                return included;
            }

            /**
             * ����included���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setIncluded(Boolean value) {
                this.included = value;
            }

            /**
             * ��ȡexistsCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getExistsCode() {
                return existsCode;
            }

            /**
             * ����existsCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setExistsCode(String value) {
                this.existsCode = value;
            }

            /**
             * ��ȡid���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getID() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * ��ȡsort���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getSort() {
                return sort;
            }

            /**
             * ����sort���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setSort(BigInteger value) {
                this.sort = value;
            }

            /**
             * ��ȡyearReplaced���Ե�ֵ��
             *
             * @return possible object is
             * {@link XMLGregorianCalendar }
             */
            public XMLGregorianCalendar getYearReplaced() {
                return yearReplaced;
            }

            /**
             * ����yearReplaced���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link XMLGregorianCalendar }
             */
            public void setYearReplaced(XMLGregorianCalendar value) {
                this.yearReplaced = value;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * <p/>
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * <p/>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
             *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MultimediaDescriptions
                    extends MultimediaDescriptionsType {

                @XmlAttribute(name = "Location")
                protected Boolean location;
                @XmlAttribute(name = "RefDirectionTo")
                protected Boolean refDirectionTo;

                /**
                 * ��ȡlocation���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isLocation() {
                    return location;
                }

                /**
                 * ����location���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setLocation(Boolean value) {
                    this.location = value;
                }

                /**
                 * ��ȡrefDirectionTo���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isRefDirectionTo() {
                    return refDirectionTo;
                }

                /**
                 * ����refDirectionTo���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setRefDirectionTo(Boolean value) {
                    this.refDirectionTo = value;
                }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RefPointsType">
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RefPoints
            extends RefPointsType {

        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;

        /**
         * ��ȡlastUpdated���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * ����lastUpdated���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }

    }

}
