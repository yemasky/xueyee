
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>ResCommonDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResCommonDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/&gt;
 *         &lt;element name="TimeSpan" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType"&gt;
 *                 &lt;attribute name="Increment" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/&gt;
 *         &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMembershipTypeMembership" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCommentTypeComment" minOccurs="0"/&gt;
 *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/&gt;
 *         &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" minOccurs="0"/&gt;
 *         &lt;element name="DepositPayments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/&gt;
 *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/&gt;
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResCommonDetailType", propOrder = {
    "guestCounts",
    "timeSpan",
    "resGuestRPHs",
    "memberships",
    "comments",
    "specialRequests",
    "guarantee",
    "depositPayments",
    "cancelPenalties",
    "fees",
    "total"
})
@XmlSeeAlso({
    ResGlobalInfoType.class
})
public class ResCommonDetailType {

    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "TimeSpan")
    protected ResCommonDetailType.TimeSpan timeSpan;
    @XmlElement(name = "ResGuestRPHs")
    protected ResGuestRPHsType resGuestRPHs;
    @XmlElement(name = "Memberships")
    protected ArrayOfMembershipTypeMembership memberships;
    @XmlElement(name = "Comments")
    protected ArrayOfCommentTypeComment comments;
    @XmlElement(name = "SpecialRequests")
    protected ArrayOfSpecialRequestTypeSpecialRequest specialRequests;
    @XmlElement(name = "Guarantee")
    protected GuaranteeType guarantee;
    @XmlElement(name = "DepositPayments")
    protected ArrayOfRequiredPaymentsTypeGuaranteePayment depositPayments;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "Fees")
    protected ArrayOfFeeType fees;
    @XmlElement(name = "Total")
    protected TotalType total;

    /**
     * 获取guestCounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * 设置guestCounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * 获取timeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResCommonDetailType.TimeSpan }
     *     
     */
    public ResCommonDetailType.TimeSpan getTimeSpan() {
        return timeSpan;
    }

    /**
     * 设置timeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResCommonDetailType.TimeSpan }
     *     
     */
    public void setTimeSpan(ResCommonDetailType.TimeSpan value) {
        this.timeSpan = value;
    }

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
     * 获取guarantee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeType }
     *     
     */
    public GuaranteeType getGuarantee() {
        return guarantee;
    }

    /**
     * 设置guarantee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeType }
     *     
     */
    public void setGuarantee(GuaranteeType value) {
        this.guarantee = value;
    }

    /**
     * 获取depositPayments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment getDepositPayments() {
        return depositPayments;
    }

    /**
     * 设置depositPayments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public void setDepositPayments(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
        this.depositPayments = value;
    }

    /**
     * 获取cancelPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * 设置cancelPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * 获取fees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeeType }
     *     
     */
    public ArrayOfFeeType getFees() {
        return fees;
    }

    /**
     * 设置fees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeeType }
     *     
     */
    public void setFees(ArrayOfFeeType value) {
        this.fees = value;
    }

    /**
     * 获取total属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType"&gt;
     *       &lt;attribute name="Increment" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TimeSpan
        extends DateTimeSpanType
    {

        @XmlAttribute(name = "Increment")
        protected Duration increment;

        /**
         * 获取increment属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getIncrement() {
            return increment;
        }

        /**
         * 设置increment属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setIncrement(Duration value) {
            this.increment = value;
        }

    }

}
