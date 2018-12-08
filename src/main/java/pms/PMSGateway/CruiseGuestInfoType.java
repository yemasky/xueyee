package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CruiseGuestInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CruiseGuestInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}ReservationID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCruiseGuestDetailType" minOccurs="0"/>
 *         &lt;element name="LinkedBookings" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCruiseGuestInfoTypeLinkedBooking" minOccurs="0"/>
 *         &lt;element name="PaymentOptions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCruiseGuestInfoTypePaymentOption" minOccurs="0"/>
 *         &lt;element name="CancellationPenalty" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservationID property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservationID().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationIDType }
     */
    public List<ReservationIDType> getReservationID() {
        if (reservationID == null) {
            reservationID = new ArrayList<ReservationIDType>();
        }
        return this.reservationID;
    }

    /**
     * ��ȡguestDetails���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfCruiseGuestDetailType }
     */
    public ArrayOfCruiseGuestDetailType getGuestDetails() {
        return guestDetails;
    }

    /**
     * ����guestDetails���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfCruiseGuestDetailType }
     */
    public void setGuestDetails(ArrayOfCruiseGuestDetailType value) {
        this.guestDetails = value;
    }

    /**
     * ��ȡlinkedBookings���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfCruiseGuestInfoTypeLinkedBooking }
     */
    public ArrayOfCruiseGuestInfoTypeLinkedBooking getLinkedBookings() {
        return linkedBookings;
    }

    /**
     * ����linkedBookings���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfCruiseGuestInfoTypeLinkedBooking }
     */
    public void setLinkedBookings(ArrayOfCruiseGuestInfoTypeLinkedBooking value) {
        this.linkedBookings = value;
    }

    /**
     * ��ȡpaymentOptions���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfCruiseGuestInfoTypePaymentOption }
     */
    public ArrayOfCruiseGuestInfoTypePaymentOption getPaymentOptions() {
        return paymentOptions;
    }

    /**
     * ����paymentOptions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfCruiseGuestInfoTypePaymentOption }
     */
    public void setPaymentOptions(ArrayOfCruiseGuestInfoTypePaymentOption value) {
        this.paymentOptions = value;
    }

    /**
     * ��ȡcancellationPenalty���Ե�ֵ��
     *
     * @return possible object is
     * {@link CruiseGuestInfoType.CancellationPenalty }
     */
    public CruiseGuestInfoType.CancellationPenalty getCancellationPenalty() {
        return cancellationPenalty;
    }

    /**
     * ����cancellationPenalty���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CruiseGuestInfoType.CancellationPenalty }
     */
    public void setCancellationPenalty(CruiseGuestInfoType.CancellationPenalty value) {
        this.cancellationPenalty = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CancellationPenalty {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

        /**
         * ��ȡamount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * ����amount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

    }

}
