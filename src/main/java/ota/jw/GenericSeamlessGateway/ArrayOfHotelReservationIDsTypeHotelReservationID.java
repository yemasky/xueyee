
package ota.jw.GenericSeamlessGateway;

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
 * <p>ArrayOfHotelReservationIDsTypeHotelReservationID complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelReservationIDsTypeHotelReservationID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelReservationID" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ResID_Source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ResID_SourceContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ResID_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="ForGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ResGuestRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CancelOriginatorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="HotelReservationID_RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfHotelReservationIDsTypeHotelReservationID", propOrder = {
    "hotelReservationID"
})
public class ArrayOfHotelReservationIDsTypeHotelReservationID {

    @XmlElement(name = "HotelReservationID")
    protected List<ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID> hotelReservationID;

    /**
     * Gets the value of the hotelReservationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReservationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelReservationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID }
     * 
     * 
     */
    public List<ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID> getHotelReservationID() {
        if (hotelReservationID == null) {
            hotelReservationID = new ArrayList<ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID>();
        }
        return this.hotelReservationID;
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
     *       &lt;attribute name="ResID_Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ResID_Value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ResID_Source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ResID_SourceContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ResID_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="ForGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ResGuestRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CancelOriginatorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="HotelReservationID_RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取resIDType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDType() {
            return resIDType;
        }

        /**
         * 设置resIDType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDType(String value) {
            this.resIDType = value;
        }

        /**
         * 获取resIDValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDValue() {
            return resIDValue;
        }

        /**
         * 设置resIDValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDValue(String value) {
            this.resIDValue = value;
        }

        /**
         * 获取resIDSource属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDSource() {
            return resIDSource;
        }

        /**
         * 设置resIDSource属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDSource(String value) {
            this.resIDSource = value;
        }

        /**
         * 获取resIDSourceContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDSourceContext() {
            return resIDSourceContext;
        }

        /**
         * 设置resIDSourceContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDSourceContext(String value) {
            this.resIDSourceContext = value;
        }

        /**
         * 获取resIDDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getResIDDate() {
            return resIDDate;
        }

        /**
         * 设置resIDDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setResIDDate(XMLGregorianCalendar value) {
            this.resIDDate = value;
        }

        /**
         * 获取forGuest属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isForGuest() {
            return forGuest;
        }

        /**
         * 设置forGuest属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setForGuest(Boolean value) {
            this.forGuest = value;
        }

        /**
         * 获取resGuestRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResGuestRPH() {
            return resGuestRPH;
        }

        /**
         * 设置resGuestRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResGuestRPH(String value) {
            this.resGuestRPH = value;
        }

        /**
         * 获取cancelOriginatorCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelOriginatorCode() {
            return cancelOriginatorCode;
        }

        /**
         * 设置cancelOriginatorCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancelOriginatorCode(String value) {
            this.cancelOriginatorCode = value;
        }

        /**
         * 获取cancellationDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCancellationDate() {
            return cancellationDate;
        }

        /**
         * 设置cancellationDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCancellationDate(XMLGregorianCalendar value) {
            this.cancellationDate = value;
        }

        /**
         * 获取hotelReservationIDRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelReservationIDRPH() {
            return hotelReservationIDRPH;
        }

        /**
         * 设置hotelReservationIDRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelReservationIDRPH(String value) {
            this.hotelReservationIDRPH = value;
        }

    }

}
