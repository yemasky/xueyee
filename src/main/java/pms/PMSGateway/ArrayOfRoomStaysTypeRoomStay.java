package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfRoomStaysTypeRoomStay complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfRoomStaysTypeRoomStay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
 *                 &lt;sequence>
 *                   &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/>
 *                   &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMembershipTypeMembership" minOccurs="0"/>
 *                   &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCommentTypeComment" minOccurs="0"/>
 *                   &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/>
 *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
 *                   &lt;element name="Reference" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                           &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRule" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/extension>
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
@XmlType(name = "ArrayOfRoomStaysTypeRoomStay", propOrder = {
        "roomStay"
})
public class ArrayOfRoomStaysTypeRoomStay {

    @XmlElement(name = "RoomStay")
    protected List<ArrayOfRoomStaysTypeRoomStay.RoomStay> roomStay;

    /**
     * Gets the value of the roomStay property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomStay property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomStay().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRoomStaysTypeRoomStay.RoomStay }
     */
    public List<ArrayOfRoomStaysTypeRoomStay.RoomStay> getRoomStay() {
        if (roomStay == null) {
            roomStay = new ArrayList<ArrayOfRoomStaysTypeRoomStay.RoomStay>();
        }
        return this.roomStay;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
     *       &lt;sequence>
     *         &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/>
     *         &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMembershipTypeMembership" minOccurs="0"/>
     *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCommentTypeComment" minOccurs="0"/>
     *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/>
     *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
     *         &lt;element name="Reference" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRulesTypeBookingRule" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
            extends RoomStayType {

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
         * ��ȡresGuestRPHs���Ե�ֵ��
         *
         * @return possible object is
         * {@link ResGuestRPHsType }
         */
        public ResGuestRPHsType getResGuestRPHs() {
            return resGuestRPHs;
        }

        /**
         * ����resGuestRPHs���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ResGuestRPHsType }
         */
        public void setResGuestRPHs(ResGuestRPHsType value) {
            this.resGuestRPHs = value;
        }

        /**
         * ��ȡmemberships���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfMembershipTypeMembership }
         */
        public ArrayOfMembershipTypeMembership getMemberships() {
            return memberships;
        }

        /**
         * ����memberships���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfMembershipTypeMembership }
         */
        public void setMemberships(ArrayOfMembershipTypeMembership value) {
            this.memberships = value;
        }

        /**
         * ��ȡcomments���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfCommentTypeComment }
         */
        public ArrayOfCommentTypeComment getComments() {
            return comments;
        }

        /**
         * ����comments���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfCommentTypeComment }
         */
        public void setComments(ArrayOfCommentTypeComment value) {
            this.comments = value;
        }

        /**
         * ��ȡspecialRequests���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfSpecialRequestTypeSpecialRequest }
         */
        public ArrayOfSpecialRequestTypeSpecialRequest getSpecialRequests() {
            return specialRequests;
        }

        /**
         * ����specialRequests���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfSpecialRequestTypeSpecialRequest }
         */
        public void setSpecialRequests(ArrayOfSpecialRequestTypeSpecialRequest value) {
            this.specialRequests = value;
        }

        /**
         * ��ȡserviceRPHs���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfServiceRPHsTypeServiceRPH }
         */
        public ArrayOfServiceRPHsTypeServiceRPH getServiceRPHs() {
            return serviceRPHs;
        }

        /**
         * ����serviceRPHs���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfServiceRPHsTypeServiceRPH }
         */
        public void setServiceRPHs(ArrayOfServiceRPHsTypeServiceRPH value) {
            this.serviceRPHs = value;
        }

        /**
         * ��ȡreference���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference }
         */
        public ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference getReference() {
            return reference;
        }

        /**
         * ����reference���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference }
         */
        public void setReference(ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference value) {
            this.reference = value;
        }

        /**
         * ��ȡbookingRules���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfBookingRulesTypeBookingRule }
         */
        public ArrayOfBookingRulesTypeBookingRule getBookingRules() {
            return bookingRules;
        }

        /**
         * ����bookingRules���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfBookingRulesTypeBookingRule }
         */
        public void setBookingRules(ArrayOfBookingRulesTypeBookingRule value) {
            this.bookingRules = value;
        }

        /**
         * ��ȡindexNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getIndexNumber() {
            return indexNumber;
        }

        /**
         * ����indexNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setIndexNumber(BigInteger value) {
            this.indexNumber = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
         *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Reference
                extends UniqueIDType {

            @XmlAttribute(name = "DateTime")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar dateTime;

            /**
             * ��ȡdateTime���Ե�ֵ��
             *
             * @return possible object is
             * {@link XMLGregorianCalendar }
             */
            public XMLGregorianCalendar getDateTime() {
                return dateTime;
            }

            /**
             * ����dateTime���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link XMLGregorianCalendar }
             */
            public void setDateTime(XMLGregorianCalendar value) {
                this.dateTime = value;
            }

        }

    }

}
