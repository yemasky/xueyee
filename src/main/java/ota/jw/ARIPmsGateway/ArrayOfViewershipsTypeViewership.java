
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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>ArrayOfViewershipsTypeViewership complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfViewershipsTypeViewership"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Viewership" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ViewershipCodes" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SystemCodes" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SystemCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ProfileTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipProfileType" minOccurs="0"/&gt;
 *                   &lt;element name="ProfileRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfUniqueID_Type" minOccurs="0"/&gt;
 *                   &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfileType" minOccurs="0"/&gt;
 *                   &lt;element name="LocationCodes" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LocationCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BookingChannelCodes" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BookingChannelCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DistributorTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipDistributorType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ViewershipRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ViewOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "ArrayOfViewershipsTypeViewership", propOrder = {
    "viewership"
})
public class ArrayOfViewershipsTypeViewership {

    @XmlElement(name = "Viewership")
    protected List<ArrayOfViewershipsTypeViewership.Viewership> viewership;

    /**
     * Gets the value of the viewership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfViewershipsTypeViewership.Viewership }
     * 
     * 
     */
    public List<ArrayOfViewershipsTypeViewership.Viewership> getViewership() {
        if (viewership == null) {
            viewership = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership>();
        }
        return this.viewership;
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
     *         &lt;element name="ViewershipCodes" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SystemCodes" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SystemCode" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ProfileTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipProfileType" minOccurs="0"/&gt;
     *         &lt;element name="ProfileRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfUniqueID_Type" minOccurs="0"/&gt;
     *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfileType" minOccurs="0"/&gt;
     *         &lt;element name="LocationCodes" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LocationCode" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BookingChannelCodes" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BookingChannelCode" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DistributorTypes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfViewershipsTypeViewershipDistributorType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ViewershipRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ViewOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取viewershipCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes }
         *     
         */
        public ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes getViewershipCodes() {
            return viewershipCodes;
        }

        /**
         * 设置viewershipCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes }
         *     
         */
        public void setViewershipCodes(ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes value) {
            this.viewershipCodes = value;
        }

        /**
         * 获取systemCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes }
         *     
         */
        public ArrayOfViewershipsTypeViewership.Viewership.SystemCodes getSystemCodes() {
            return systemCodes;
        }

        /**
         * 设置systemCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes }
         *     
         */
        public void setSystemCodes(ArrayOfViewershipsTypeViewership.Viewership.SystemCodes value) {
            this.systemCodes = value;
        }

        /**
         * 获取profileTypes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewershipProfileType }
         *     
         */
        public ArrayOfViewershipsTypeViewershipProfileType getProfileTypes() {
            return profileTypes;
        }

        /**
         * 设置profileTypes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewershipProfileType }
         *     
         */
        public void setProfileTypes(ArrayOfViewershipsTypeViewershipProfileType value) {
            this.profileTypes = value;
        }

        /**
         * 获取profileRefs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfUniqueIDType }
         *     
         */
        public ArrayOfUniqueIDType getProfileRefs() {
            return profileRefs;
        }

        /**
         * 设置profileRefs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfUniqueIDType }
         *     
         */
        public void setProfileRefs(ArrayOfUniqueIDType value) {
            this.profileRefs = value;
        }

        /**
         * 获取profiles属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfProfileType }
         *     
         */
        public ArrayOfProfileType getProfiles() {
            return profiles;
        }

        /**
         * 设置profiles属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfProfileType }
         *     
         */
        public void setProfiles(ArrayOfProfileType value) {
            this.profiles = value;
        }

        /**
         * 获取locationCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes }
         *     
         */
        public ArrayOfViewershipsTypeViewership.Viewership.LocationCodes getLocationCodes() {
            return locationCodes;
        }

        /**
         * 设置locationCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes }
         *     
         */
        public void setLocationCodes(ArrayOfViewershipsTypeViewership.Viewership.LocationCodes value) {
            this.locationCodes = value;
        }

        /**
         * 获取bookingChannelCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes }
         *     
         */
        public ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes getBookingChannelCodes() {
            return bookingChannelCodes;
        }

        /**
         * 设置bookingChannelCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes }
         *     
         */
        public void setBookingChannelCodes(ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes value) {
            this.bookingChannelCodes = value;
        }

        /**
         * 获取distributorTypes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfViewershipsTypeViewershipDistributorType }
         *     
         */
        public ArrayOfViewershipsTypeViewershipDistributorType getDistributorTypes() {
            return distributorTypes;
        }

        /**
         * 设置distributorTypes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfViewershipsTypeViewershipDistributorType }
         *     
         */
        public void setDistributorTypes(ArrayOfViewershipsTypeViewershipDistributorType value) {
            this.distributorTypes = value;
        }

        /**
         * 获取viewershipRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getViewershipRPH() {
            return viewershipRPH;
        }

        /**
         * 设置viewershipRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setViewershipRPH(String value) {
            this.viewershipRPH = value;
        }

        /**
         * 获取viewOnly属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isViewOnly() {
            return viewOnly;
        }

        /**
         * 设置viewOnly属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setViewOnly(Boolean value) {
            this.viewOnly = value;
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
         *         &lt;element name="BookingChannelCode" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bookingChannelCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBookingChannelCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode }
             * 
             * 
             */
            public List<ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode> getBookingChannelCode() {
                if (bookingChannelCode == null) {
                    bookingChannelCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode>();
                }
                return this.bookingChannelCode;
            }

            /**
             * 获取channelCodesInclusive属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isChannelCodesInclusive() {
                return channelCodesInclusive;
            }

            /**
             * 设置channelCodesInclusive属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setChannelCodesInclusive(Boolean value) {
                this.channelCodesInclusive = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
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
                 * 获取value属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * 设置value属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * 获取restrictedDisplayIndicator属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRestrictedDisplayIndicator() {
                    return restrictedDisplayIndicator;
                }

                /**
                 * 设置restrictedDisplayIndicator属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRestrictedDisplayIndicator(Boolean value) {
                    this.restrictedDisplayIndicator = value;
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
         *         &lt;element name="LocationCode" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the locationCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLocationCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode }
             * 
             * 
             */
            public List<ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode> getLocationCode() {
                if (locationCode == null) {
                    locationCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode>();
                }
                return this.locationCode;
            }

            /**
             * 获取locationCodesInclusive属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLocationCodesInclusive() {
                return locationCodesInclusive;
            }

            /**
             * 设置locationCodesInclusive属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLocationCodesInclusive(Boolean value) {
                this.locationCodesInclusive = value;
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
             *       &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
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
                 * 获取cityCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCityCode() {
                    return cityCode;
                }

                /**
                 * 设置cityCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCityCode(String value) {
                    this.cityCode = value;
                }

                /**
                 * 获取stateProvinceCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateProvinceCode() {
                    return stateProvinceCode;
                }

                /**
                 * 设置stateProvinceCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateProvinceCode(String value) {
                    this.stateProvinceCode = value;
                }

                /**
                 * 获取countryCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountryCode() {
                    return countryCode;
                }

                /**
                 * 设置countryCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountryCode(String value) {
                    this.countryCode = value;
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
         *         &lt;element name="SystemCode" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the systemCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSystemCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode }
             * 
             * 
             */
            public List<ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode> getSystemCode() {
                if (systemCode == null) {
                    systemCode = new ArrayList<ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode>();
                }
                return this.systemCode;
            }

            /**
             * 获取systemCodesInclusive属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSystemCodesInclusive() {
                return systemCodesInclusive;
            }

            /**
             * 设置systemCodesInclusive属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSystemCodesInclusive(Boolean value) {
                this.systemCodesInclusive = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="RestrictedDisplayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
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
                 * 获取value属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * 设置value属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * 获取restrictedDisplayIndicator属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRestrictedDisplayIndicator() {
                    return restrictedDisplayIndicator;
                }

                /**
                 * 设置restrictedDisplayIndicator属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRestrictedDisplayIndicator(Boolean value) {
                    this.restrictedDisplayIndicator = value;
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
         *         &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "viewershipCode"
        })
        public static class ViewershipCodes {

            @XmlElement(name = "ViewershipCode")
            protected String viewershipCode;

            /**
             * 获取viewershipCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getViewershipCode() {
                return viewershipCode;
            }

            /**
             * 设置viewershipCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setViewershipCode(String value) {
                this.viewershipCode = value;
            }

        }

    }

}
