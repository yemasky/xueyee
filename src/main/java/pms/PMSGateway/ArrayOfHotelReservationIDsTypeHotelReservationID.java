package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfHotelReservationIDsTypeHotelReservationID complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfHotelReservationIDsTypeHotelReservationID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ResID_Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ResID_SourceContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ResID_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="ForGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ResGuestRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CancelOriginatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="HotelReservationID_RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfHotelReservationIDsTypeHotelReservationID", propOrder = {
        "hotelReservationID"
})
public class ArrayOfHotelReservationIDsTypeHotelReservationID {

    @XmlElement(name = "HotelReservationID")
    protected List<ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID> hotelReservationID;

    /**
     * Gets the value of the hotelReservationID property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReservationID property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelReservationID().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID }
     */
    public List<ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID> getHotelReservationID() {
        if (hotelReservationID == null) {
            hotelReservationID = new ArrayList<ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID>();
        }
        return this.hotelReservationID;
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
     *       &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResID_Source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResID_SourceContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResID_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="ForGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ResGuestRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CancelOriginatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="HotelReservationID_RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelReservationID {

        @XmlAttribute(name = "ResID_Type")
        protected String resIDType;
        @XmlAttribute(name = "ResID_Value")
        protected String resIDValue;
        @XmlAttribute(name = "ResID_Source")
        protected String resIDSource;
        @XmlAttribute(name = "ResID_SourceContext")
        protected String resIDSourceContext;
        @XmlAttribute(name = "ResID_Date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar resIDDate;
        @XmlAttribute(name = "ForGuest")
        protected Boolean forGuest;
        @XmlAttribute(name = "ResGuestRPH")
        protected String resGuestRPH;
        @XmlAttribute(name = "CancelOriginatorCode")
        protected String cancelOriginatorCode;
        @XmlAttribute(name = "CancellationDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cancellationDate;
        @XmlAttribute(name = "HotelReservationID_RPH")
        protected String hotelReservationIDRPH;

        /**
         * ��ȡresIDType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getResIDType() {
            return resIDType;
        }

        /**
         * ����resIDType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setResIDType(String value) {
            this.resIDType = value;
        }

        /**
         * ��ȡresIDValue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getResIDValue() {
            return resIDValue;
        }

        /**
         * ����resIDValue���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setResIDValue(String value) {
            this.resIDValue = value;
        }

        /**
         * ��ȡresIDSource���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getResIDSource() {
            return resIDSource;
        }

        /**
         * ����resIDSource���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setResIDSource(String value) {
            this.resIDSource = value;
        }

        /**
         * ��ȡresIDSourceContext���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getResIDSourceContext() {
            return resIDSourceContext;
        }

        /**
         * ����resIDSourceContext���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setResIDSourceContext(String value) {
            this.resIDSourceContext = value;
        }

        /**
         * ��ȡresIDDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getResIDDate() {
            return resIDDate;
        }

        /**
         * ����resIDDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setResIDDate(XMLGregorianCalendar value) {
            this.resIDDate = value;
        }

        /**
         * ��ȡforGuest���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isForGuest() {
            return forGuest;
        }

        /**
         * ����forGuest���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setForGuest(Boolean value) {
            this.forGuest = value;
        }

        /**
         * ��ȡresGuestRPH���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getResGuestRPH() {
            return resGuestRPH;
        }

        /**
         * ����resGuestRPH���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setResGuestRPH(String value) {
            this.resGuestRPH = value;
        }

        /**
         * ��ȡcancelOriginatorCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCancelOriginatorCode() {
            return cancelOriginatorCode;
        }

        /**
         * ����cancelOriginatorCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCancelOriginatorCode(String value) {
            this.cancelOriginatorCode = value;
        }

        /**
         * ��ȡcancellationDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getCancellationDate() {
            return cancellationDate;
        }

        /**
         * ����cancellationDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setCancellationDate(XMLGregorianCalendar value) {
            this.cancellationDate = value;
        }

        /**
         * ��ȡhotelReservationIDRPH���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getHotelReservationIDRPH() {
            return hotelReservationIDRPH;
        }

        /**
         * ����hotelReservationIDRPH���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setHotelReservationIDRPH(String value) {
            this.hotelReservationIDRPH = value;
        }

    }

}
