
package ota.jw.GenericSeamlessGateway;

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
 * <p>ArrayOfRoomStaysTypeRoomStay complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoomStaysTypeRoomStay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/&gt;
 *                   &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMembershipTypeMembership" minOccurs="0"/&gt;
 *                   &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCommentTypeComment" minOccurs="0"/&gt;
 *                   &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/&gt;
 *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/&gt;
 *                   &lt;element name="Reference" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
 *                           &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRule" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "ArrayOfRoomStaysTypeRoomStay", propOrder = {
    "roomStay"
})
public class ArrayOfRoomStaysTypeRoomStay {

    @XmlElement(name = "RoomStay")
    protected List<ArrayOfRoomStaysTypeRoomStay.RoomStay> roomStay;

    /**
     * Gets the value of the roomStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRoomStaysTypeRoomStay.RoomStay }
     * 
     * 
     */
    public List<ArrayOfRoomStaysTypeRoomStay.RoomStay> getRoomStay() {
        if (roomStay == null) {
            roomStay = new ArrayList<ArrayOfRoomStaysTypeRoomStay.RoomStay>();
        }
        return this.roomStay;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/&gt;
     *         &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMembershipTypeMembership" minOccurs="0"/&gt;
     *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCommentTypeComment" minOccurs="0"/&gt;
     *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/&gt;
     *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/&gt;
     *         &lt;element name="Reference" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
     *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRule" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resGuestRPHs",
        "memberships",
        "comments",
        "specialRequests",
        "serviceRPHs",
        "reference",
        "bookingRules"
    })
    public static class RoomStay
        extends RoomStayType
    {

        @XmlElement(name = "ResGuestRPHs")
        protected ResGuestRPHsType resGuestRPHs;
        @XmlElement(name = "Memberships")
        protected ArrayOfMembershipTypeMembership memberships;
        @XmlElement(name = "Comments")
        protected ArrayOfCommentTypeComment comments;
        @XmlElement(name = "SpecialRequests")
        protected ArrayOfSpecialRequestTypeSpecialRequest specialRequests;
        @XmlElement(name = "ServiceRPHs")
        protected ArrayOfServiceRPHsTypeServiceRPH serviceRPHs;
        @XmlElement(name = "Reference")
        protected ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference reference;
        @XmlElement(name = "BookingRules")
        protected ArrayOfBookingRulesTypeBookingRule bookingRules;
        @XmlAttribute(name = "IndexNumber")
        protected BigInteger indexNumber;

        /**
         * 获取resGuestRPHs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ResGuestRPHsType }
         *     
         */
        public ResGuestRPHsType getResGuestRPHs() {
            return resGuestRPHs;
        }

        /**
         * 设置resGuestRPHs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ResGuestRPHsType }
         *     
         */
        public void setResGuestRPHs(ResGuestRPHsType value) {
            this.resGuestRPHs = value;
        }

        /**
         * 获取memberships属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfMembershipTypeMembership }
         *     
         */
        public ArrayOfMembershipTypeMembership getMemberships() {
            return memberships;
        }

        /**
         * 设置memberships属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfMembershipTypeMembership }
         *     
         */
        public void setMemberships(ArrayOfMembershipTypeMembership value) {
            this.memberships = value;
        }

        /**
         * 获取comments属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfCommentTypeComment }
         *     
         */
        public ArrayOfCommentTypeComment getComments() {
            return comments;
        }

        /**
         * 设置comments属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfCommentTypeComment }
         *     
         */
        public void setComments(ArrayOfCommentTypeComment value) {
            this.comments = value;
        }

        /**
         * 获取specialRequests属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSpecialRequestTypeSpecialRequest }
         *     
         */
        public ArrayOfSpecialRequestTypeSpecialRequest getSpecialRequests() {
            return specialRequests;
        }

        /**
         * 设置specialRequests属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSpecialRequestTypeSpecialRequest }
         *     
         */
        public void setSpecialRequests(ArrayOfSpecialRequestTypeSpecialRequest value) {
            this.specialRequests = value;
        }

        /**
         * 获取serviceRPHs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfServiceRPHsTypeServiceRPH }
         *     
         */
        public ArrayOfServiceRPHsTypeServiceRPH getServiceRPHs() {
            return serviceRPHs;
        }

        /**
         * 设置serviceRPHs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfServiceRPHsTypeServiceRPH }
         *     
         */
        public void setServiceRPHs(ArrayOfServiceRPHsTypeServiceRPH value) {
            this.serviceRPHs = value;
        }

        /**
         * 获取reference属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference }
         *     
         */
        public ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference getReference() {
            return reference;
        }

        /**
         * 设置reference属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference }
         *     
         */
        public void setReference(ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference value) {
            this.reference = value;
        }

        /**
         * 获取bookingRules属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfBookingRulesTypeBookingRule }
         *     
         */
        public ArrayOfBookingRulesTypeBookingRule getBookingRules() {
            return bookingRules;
        }

        /**
         * 设置bookingRules属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfBookingRulesTypeBookingRule }
         *     
         */
        public void setBookingRules(ArrayOfBookingRulesTypeBookingRule value) {
            this.bookingRules = value;
        }

        /**
         * 获取indexNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexNumber() {
            return indexNumber;
        }

        /**
         * 设置indexNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexNumber(BigInteger value) {
            this.indexNumber = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
         *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Reference
            extends UniqueIDType
        {

            @XmlAttribute(name = "DateTime")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar dateTime;

            /**
             * 获取dateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateTime() {
                return dateTime;
            }

            /**
             * 设置dateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateTime(XMLGregorianCalendar value) {
                this.dateTime = value;
            }

        }

    }

}
