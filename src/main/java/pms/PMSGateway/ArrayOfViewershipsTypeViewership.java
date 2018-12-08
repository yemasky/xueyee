package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfViewershipsTypeViewership complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfViewershipsTypeViewership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Viewership" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ViewershipCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SystemCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SystemCode" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProfileTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipProfileType" minOccurs="0"/>
 *                   &lt;element name="ProfileRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfUniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfileType" minOccurs="0"/>
 *                   &lt;element name="LocationCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LocationCode" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BookingChannelCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BookingChannelCode" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DistributorTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipDistributorType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ViewershipRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ViewOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfViewershipsTypeViewership", propOrder = {
        "viewership"
})
public class ArrayOfViewershipsTypeViewership {

    @XmlElement(name = "Viewership")
    protected List<ArrayOfViewershipsTypeViewership.Viewership> viewership;

    /**
     * Gets the value of the viewership property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewership property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewership().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfViewershipsTypeViewership.Viewership }
     */
    public List<ArrayOfViewershipsTypeViewership.Viewership> getViewership() {
        if (viewership == null) {
            viewership = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership>();
        }
        return this.viewership;
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
     *         &lt;element name="ViewershipCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SystemCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SystemCode" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProfileTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipProfileType" minOccurs="0"/>
     *         &lt;element name="ProfileRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfUniqueID_Type" minOccurs="0"/>
     *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfileType" minOccurs="0"/>
     *         &lt;element name="LocationCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LocationCode" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BookingChannelCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BookingChannelCode" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DistributorTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipDistributorType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ViewershipRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ViewOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "viewershipCodes",
            "systemCodes",
            "profileTypes",
            "profileRefs",
            "profiles",
            "locationCodes",
            "bookingChannelCodes",
            "distributorTypes"
    })
    public static class Viewership {

        @XmlElement(name = "ViewershipCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes viewershipCodes;
        @XmlElement(name = "SystemCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.SystemCodes systemCodes;
        @XmlElement(name = "ProfileTypes")
        protected ArrayOfViewershipsTypeViewershipProfileType profileTypes;
        @XmlElement(name = "ProfileRefs")
        protected ArrayOfUniqueIDType profileRefs;
        @XmlElement(name = "Profiles")
        protected ArrayOfProfileType profiles;
        @XmlElement(name = "LocationCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.LocationCodes locationCodes;
        @XmlElement(name = "BookingChannelCodes")
        protected ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes bookingChannelCodes;
        @XmlElement(name = "DistributorTypes")
        protected ArrayOfViewershipsTypeViewershipDistributorType distributorTypes;
        @XmlAttribute(name = "ViewershipRPH")
        protected String viewershipRPH;
        @XmlAttribute(name = "ViewOnly")
        protected Boolean viewOnly;

        /**
         * ��ȡviewershipCodes���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes }
         */
        public ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes getViewershipCodes() {
            return viewershipCodes;
        }

        /**
         * ����viewershipCodes���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes }
         */
        public void setViewershipCodes(ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes value) {
            this.viewershipCodes = value;
        }

        /**
         * ��ȡsystemCodes���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes }
         */
        public ArrayOfViewershipsTypeViewership.Viewership.SystemCodes getSystemCodes() {
            return systemCodes;
        }

        /**
         * ����systemCodes���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes }
         */
        public void setSystemCodes(ArrayOfViewershipsTypeViewership.Viewership.SystemCodes value) {
            this.systemCodes = value;
        }

        /**
         * ��ȡprofileTypes���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfViewershipsTypeViewershipProfileType }
         */
        public ArrayOfViewershipsTypeViewershipProfileType getProfileTypes() {
            return profileTypes;
        }

        /**
         * ����profileTypes���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfViewershipsTypeViewershipProfileType }
         */
        public void setProfileTypes(ArrayOfViewershipsTypeViewershipProfileType value) {
            this.profileTypes = value;
        }

        /**
         * ��ȡprofileRefs���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfUniqueIDType }
         */
        public ArrayOfUniqueIDType getProfileRefs() {
            return profileRefs;
        }

        /**
         * ����profileRefs���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfUniqueIDType }
         */
        public void setProfileRefs(ArrayOfUniqueIDType value) {
            this.profileRefs = value;
        }

        /**
         * ��ȡprofiles���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfProfileType }
         */
        public ArrayOfProfileType getProfiles() {
            return profiles;
        }

        /**
         * ����profiles���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfProfileType }
         */
        public void setProfiles(ArrayOfProfileType value) {
            this.profiles = value;
        }

        /**
         * ��ȡlocationCodes���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes }
         */
        public ArrayOfViewershipsTypeViewership.Viewership.LocationCodes getLocationCodes() {
            return locationCodes;
        }

        /**
         * ����locationCodes���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes }
         */
        public void setLocationCodes(ArrayOfViewershipsTypeViewership.Viewership.LocationCodes value) {
            this.locationCodes = value;
        }

        /**
         * ��ȡbookingChannelCodes���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes }
         */
        public ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes getBookingChannelCodes() {
            return bookingChannelCodes;
        }

        /**
         * ����bookingChannelCodes���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes }
         */
        public void setBookingChannelCodes(ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes value) {
            this.bookingChannelCodes = value;
        }

        /**
         * ��ȡdistributorTypes���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfViewershipsTypeViewershipDistributorType }
         */
        public ArrayOfViewershipsTypeViewershipDistributorType getDistributorTypes() {
            return distributorTypes;
        }

        /**
         * ����distributorTypes���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfViewershipsTypeViewershipDistributorType }
         */
        public void setDistributorTypes(ArrayOfViewershipsTypeViewershipDistributorType value) {
            this.distributorTypes = value;
        }

        /**
         * ��ȡviewershipRPH���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getViewershipRPH() {
            return viewershipRPH;
        }

        /**
         * ����viewershipRPH���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setViewershipRPH(String value) {
            this.viewershipRPH = value;
        }

        /**
         * ��ȡviewOnly���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isViewOnly() {
            return viewOnly;
        }

        /**
         * ����viewOnly���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setViewOnly(Boolean value) {
            this.viewOnly = value;
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
         *         &lt;element name="BookingChannelCode" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "bookingChannelCode"
        })
        public static class BookingChannelCodes {

            @XmlElement(name = "BookingChannelCode")
            protected List<ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode> bookingChannelCode;
            @XmlAttribute(name = "ChannelCodesInclusive")
            protected Boolean channelCodesInclusive;

            /**
             * Gets the value of the bookingChannelCode property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bookingChannelCode property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBookingChannelCode().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode }
             */
            public List<ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode> getBookingChannelCode() {
                if (bookingChannelCode == null) {
                    bookingChannelCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode>();
                }
                return this.bookingChannelCode;
            }

            /**
             * ��ȡchannelCodesInclusive���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isChannelCodesInclusive() {
                return channelCodesInclusive;
            }

            /**
             * ����channelCodesInclusive���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setChannelCodesInclusive(Boolean value) {
                this.channelCodesInclusive = value;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * <p/>
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * <p/>
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "value"
            })
            public static class BookingChannelCode {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "RestrictedDisplayIndicator")
                protected Boolean restrictedDisplayIndicator;
                @XmlAttribute(name = "Sort")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger sort;

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
                 * ��ȡrestrictedDisplayIndicator���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isRestrictedDisplayIndicator() {
                    return restrictedDisplayIndicator;
                }

                /**
                 * ����restrictedDisplayIndicator���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setRestrictedDisplayIndicator(Boolean value) {
                    this.restrictedDisplayIndicator = value;
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
         *         &lt;element name="LocationCode" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "locationCode"
        })
        public static class LocationCodes {

            @XmlElement(name = "LocationCode")
            protected List<ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode> locationCode;
            @XmlAttribute(name = "LocationCodesInclusive")
            protected Boolean locationCodesInclusive;

            /**
             * Gets the value of the locationCode property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the locationCode property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLocationCode().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode }
             */
            public List<ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode> getLocationCode() {
                if (locationCode == null) {
                    locationCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode>();
                }
                return this.locationCode;
            }

            /**
             * ��ȡlocationCodesInclusive���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isLocationCodesInclusive() {
                return locationCodesInclusive;
            }

            /**
             * ����locationCodesInclusive���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setLocationCodesInclusive(Boolean value) {
                this.locationCodesInclusive = value;
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
             *       &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LocationCode {

                @XmlAttribute(name = "CityCode")
                protected String cityCode;
                @XmlAttribute(name = "StateProvinceCode")
                protected String stateProvinceCode;
                @XmlAttribute(name = "CountryCode")
                protected String countryCode;

                /**
                 * ��ȡcityCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getCityCode() {
                    return cityCode;
                }

                /**
                 * ����cityCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setCityCode(String value) {
                    this.cityCode = value;
                }

                /**
                 * ��ȡstateProvinceCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getStateProvinceCode() {
                    return stateProvinceCode;
                }

                /**
                 * ����stateProvinceCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setStateProvinceCode(String value) {
                    this.stateProvinceCode = value;
                }

                /**
                 * ��ȡcountryCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getCountryCode() {
                    return countryCode;
                }

                /**
                 * ����countryCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setCountryCode(String value) {
                    this.countryCode = value;
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
         *         &lt;element name="SystemCode" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "systemCode"
        })
        public static class SystemCodes {

            @XmlElement(name = "SystemCode")
            protected List<ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode> systemCode;
            @XmlAttribute(name = "SystemCodesInclusive")
            protected Boolean systemCodesInclusive;

            /**
             * Gets the value of the systemCode property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the systemCode property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSystemCode().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode }
             */
            public List<ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode> getSystemCode() {
                if (systemCode == null) {
                    systemCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode>();
                }
                return this.systemCode;
            }

            /**
             * ��ȡsystemCodesInclusive���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isSystemCodesInclusive() {
                return systemCodesInclusive;
            }

            /**
             * ����systemCodesInclusive���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setSystemCodesInclusive(Boolean value) {
                this.systemCodesInclusive = value;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * <p/>
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * <p/>
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "value"
            })
            public static class SystemCode {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "RestrictedDisplayIndicator")
                protected Boolean restrictedDisplayIndicator;
                @XmlAttribute(name = "Sort")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger sort;

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
                 * ��ȡrestrictedDisplayIndicator���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link Boolean }
                 */
                public Boolean isRestrictedDisplayIndicator() {
                    return restrictedDisplayIndicator;
                }

                /**
                 * ����restrictedDisplayIndicator���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link Boolean }
                 */
                public void setRestrictedDisplayIndicator(Boolean value) {
                    this.restrictedDisplayIndicator = value;
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
         *         &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "viewershipCode"
        })
        public static class ViewershipCodes {

            @XmlElement(name = "ViewershipCode")
            protected String viewershipCode;

            /**
             * ��ȡviewershipCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getViewershipCode() {
                return viewershipCode;
            }

            /**
             * ����viewershipCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setViewershipCode(String value) {
                this.viewershipCode = value;
            }

        }

    }

}
