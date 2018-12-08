package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;


/**
 * <p>ResCommonDetailType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ResCommonDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/>
 *         &lt;element name="TimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType">
 *                 &lt;attribute name="Increment" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/>
 *         &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMembershipTypeMembership" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCommentTypeComment" minOccurs="0"/>
 *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/>
 *         &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" minOccurs="0"/>
 *         &lt;element name="DepositPayments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType1" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
    protected ArrayOfFeeType1 fees;
    @XmlElement(name = "Total")
    protected TotalType total;

    /**
     * ��ȡguestCounts���Ե�ֵ��
     *
     * @return possible object is
     * {@link GuestCountType }
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * ����guestCounts���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link GuestCountType }
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * ��ȡtimeSpan���Ե�ֵ��
     *
     * @return possible object is
     * {@link ResCommonDetailType.TimeSpan }
     */
    public ResCommonDetailType.TimeSpan getTimeSpan() {
        return timeSpan;
    }

    /**
     * ����timeSpan���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ResCommonDetailType.TimeSpan }
     */
    public void setTimeSpan(ResCommonDetailType.TimeSpan value) {
        this.timeSpan = value;
    }

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
     * ��ȡguarantee���Ե�ֵ��
     *
     * @return possible object is
     * {@link GuaranteeType }
     */
    public GuaranteeType getGuarantee() {
        return guarantee;
    }

    /**
     * ����guarantee���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link GuaranteeType }
     */
    public void setGuarantee(GuaranteeType value) {
        this.guarantee = value;
    }

    /**
     * ��ȡdepositPayments���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment getDepositPayments() {
        return depositPayments;
    }

    /**
     * ����depositPayments���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     */
    public void setDepositPayments(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
        this.depositPayments = value;
    }

    /**
     * ��ȡcancelPenalties���Ե�ֵ��
     *
     * @return possible object is
     * {@link CancelPenaltiesType }
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * ����cancelPenalties���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CancelPenaltiesType }
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * ��ȡfees���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfFeeType1 }
     */
    public ArrayOfFeeType1 getFees() {
        return fees;
    }

    /**
     * ����fees���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfFeeType1 }
     */
    public void setFees(ArrayOfFeeType1 value) {
        this.fees = value;
    }

    /**
     * ��ȡtotal���Ե�ֵ��
     *
     * @return possible object is
     * {@link TotalType }
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * ����total���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TotalType }
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType">
     *       &lt;attribute name="Increment" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TimeSpan
            extends DateTimeSpanType {

        @XmlAttribute(name = "Increment")
        protected Duration increment;

        /**
         * ��ȡincrement���Ե�ֵ��
         *
         * @return possible object is
         * {@link Duration }
         */
        public Duration getIncrement() {
            return increment;
        }

        /**
         * ����increment���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Duration }
         */
        public void setIncrement(Duration value) {
            this.increment = value;
        }

    }

}
