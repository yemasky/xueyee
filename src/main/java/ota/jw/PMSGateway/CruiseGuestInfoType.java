
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CruiseGuestInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CruiseGuestInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}ReservationID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCruiseGuestDetailType" minOccurs="0"/&gt;
 *         &lt;element name="LinkedBookings" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCruiseGuestInfoTypeLinkedBooking" minOccurs="0"/&gt;
 *         &lt;element name="PaymentOptions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCruiseGuestInfoTypePaymentOption" minOccurs="0"/&gt;
 *         &lt;element name="CancellationPenalty" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
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
@XmlType(name = "CruiseGuestInfoType", propOrder = {
    "reservationID",
    "guestDetails",
    "linkedBookings",
    "paymentOptions",
    "cancellationPenalty"
})
public class CruiseGuestInfoType {

    @XmlElement(name = "ReservationID")
    protected List<ReservationIDType> reservationID;
    @XmlElement(name = "GuestDetails")
    protected ArrayOfCruiseGuestDetailType guestDetails;
    @XmlElement(name = "LinkedBookings")
    protected ArrayOfCruiseGuestInfoTypeLinkedBooking linkedBookings;
    @XmlElement(name = "PaymentOptions")
    protected ArrayOfCruiseGuestInfoTypePaymentOption paymentOptions;
    @XmlElement(name = "CancellationPenalty")
    protected CruiseGuestInfoType.CancellationPenalty cancellationPenalty;

    /**
     * Gets the value of the reservationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationIDType }
     * 
     * 
     */
    public List<ReservationIDType> getReservationID() {
        if (reservationID == null) {
            reservationID = new ArrayList<ReservationIDType>();
        }
        return this.reservationID;
    }

    /**
     * 获取guestDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCruiseGuestDetailType }
     *     
     */
    public ArrayOfCruiseGuestDetailType getGuestDetails() {
        return guestDetails;
    }

    /**
     * 设置guestDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCruiseGuestDetailType }
     *     
     */
    public void setGuestDetails(ArrayOfCruiseGuestDetailType value) {
        this.guestDetails = value;
    }

    /**
     * 获取linkedBookings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCruiseGuestInfoTypeLinkedBooking }
     *     
     */
    public ArrayOfCruiseGuestInfoTypeLinkedBooking getLinkedBookings() {
        return linkedBookings;
    }

    /**
     * 设置linkedBookings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCruiseGuestInfoTypeLinkedBooking }
     *     
     */
    public void setLinkedBookings(ArrayOfCruiseGuestInfoTypeLinkedBooking value) {
        this.linkedBookings = value;
    }

    /**
     * 获取paymentOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCruiseGuestInfoTypePaymentOption }
     *     
     */
    public ArrayOfCruiseGuestInfoTypePaymentOption getPaymentOptions() {
        return paymentOptions;
    }

    /**
     * 设置paymentOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCruiseGuestInfoTypePaymentOption }
     *     
     */
    public void setPaymentOptions(ArrayOfCruiseGuestInfoTypePaymentOption value) {
        this.paymentOptions = value;
    }

    /**
     * 获取cancellationPenalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestInfoType.CancellationPenalty }
     *     
     */
    public CruiseGuestInfoType.CancellationPenalty getCancellationPenalty() {
        return cancellationPenalty;
    }

    /**
     * 设置cancellationPenalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestInfoType.CancellationPenalty }
     *     
     */
    public void setCancellationPenalty(CruiseGuestInfoType.CancellationPenalty value) {
        this.cancellationPenalty = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CancellationPenalty {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

    }

}
