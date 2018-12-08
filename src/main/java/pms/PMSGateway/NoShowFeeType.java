package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>NoShowFeeType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="NoShowFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Deadline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="OffsetDropTime">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="BeforeArrival"/>
 *                       &lt;enumeration value="AfterBooking"/>
 *                       &lt;enumeration value="AfterConfirmation"/>
 *                       &lt;enumeration value="AfterArrival"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GracePeriod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="OffsetDropTime">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="BeforeArrival"/>
 *                       &lt;enumeration value="AfterBooking"/>
 *                       &lt;enumeration value="AfterConfirmation"/>
 *                       &lt;enumeration value="AfterArrival"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FeeAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="RateConvertedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GuaranteeReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="EmailRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoShowFeeType", propOrder = {
        "deadline",
        "gracePeriod",
        "feeAmount",
        "description"
})
public class NoShowFeeType {

    @XmlElement(name = "Deadline")
    protected NoShowFeeType.Deadline deadline;
    @XmlElement(name = "GracePeriod")
    protected NoShowFeeType.GracePeriod gracePeriod;
    @XmlElement(name = "FeeAmount")
    protected NoShowFeeType.FeeAmount feeAmount;
    @XmlElement(name = "Description")
    protected FormattedTextTextType description;

    /**
     * ��ȡdeadline���Ե�ֵ��
     *
     * @return possible object is
     * {@link NoShowFeeType.Deadline }
     */
    public NoShowFeeType.Deadline getDeadline() {
        return deadline;
    }

    /**
     * ����deadline���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link NoShowFeeType.Deadline }
     */
    public void setDeadline(NoShowFeeType.Deadline value) {
        this.deadline = value;
    }

    /**
     * ��ȡgracePeriod���Ե�ֵ��
     *
     * @return possible object is
     * {@link NoShowFeeType.GracePeriod }
     */
    public NoShowFeeType.GracePeriod getGracePeriod() {
        return gracePeriod;
    }

    /**
     * ����gracePeriod���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link NoShowFeeType.GracePeriod }
     */
    public void setGracePeriod(NoShowFeeType.GracePeriod value) {
        this.gracePeriod = value;
    }

    /**
     * ��ȡfeeAmount���Ե�ֵ��
     *
     * @return possible object is
     * {@link NoShowFeeType.FeeAmount }
     */
    public NoShowFeeType.FeeAmount getFeeAmount() {
        return feeAmount;
    }

    /**
     * ����feeAmount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link NoShowFeeType.FeeAmount }
     */
    public void setFeeAmount(NoShowFeeType.FeeAmount value) {
        this.feeAmount = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     *
     * @return possible object is
     * {@link FormattedTextTextType }
     */
    public FormattedTextTextType getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link FormattedTextTextType }
     */
    public void setDescription(FormattedTextTextType value) {
        this.description = value;
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
     *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="OffsetDropTime">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="BeforeArrival"/>
     *             &lt;enumeration value="AfterBooking"/>
     *             &lt;enumeration value="AfterConfirmation"/>
     *             &lt;enumeration value="AfterArrival"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Deadline {

        @XmlAttribute(name = "AbsoluteDeadline")
        protected String absoluteDeadline;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected TimeUnitType offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected BigInteger offsetUnitMultiplier;
        @XmlAttribute(name = "OffsetDropTime")
        protected String offsetDropTime;

        /**
         * ��ȡabsoluteDeadline���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * ����absoluteDeadline���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * ��ȡoffsetTimeUnit���Ե�ֵ��
         *
         * @return possible object is
         * {@link TimeUnitType }
         */
        public TimeUnitType getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * ����offsetTimeUnit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TimeUnitType }
         */
        public void setOffsetTimeUnit(TimeUnitType value) {
            this.offsetTimeUnit = value;
        }

        /**
         * ��ȡoffsetUnitMultiplier���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * ����offsetUnitMultiplier���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setOffsetUnitMultiplier(BigInteger value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * ��ȡoffsetDropTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * ����offsetDropTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="RateConvertedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GuaranteeReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="EmailRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FeeAmount {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "RateConvertedInd")
        protected Boolean rateConvertedInd;
        @XmlAttribute(name = "GuaranteeReqInd")
        protected Boolean guaranteeReqInd;
        @XmlAttribute(name = "EmailRequiredInd")
        protected Boolean emailRequiredInd;

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

        /**
         * ��ȡrateConvertedInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isRateConvertedInd() {
            return rateConvertedInd;
        }

        /**
         * ����rateConvertedInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setRateConvertedInd(Boolean value) {
            this.rateConvertedInd = value;
        }

        /**
         * ��ȡguaranteeReqInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isGuaranteeReqInd() {
            return guaranteeReqInd;
        }

        /**
         * ����guaranteeReqInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setGuaranteeReqInd(Boolean value) {
            this.guaranteeReqInd = value;
        }

        /**
         * ��ȡemailRequiredInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isEmailRequiredInd() {
            return emailRequiredInd;
        }

        /**
         * ����emailRequiredInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setEmailRequiredInd(Boolean value) {
            this.emailRequiredInd = value;
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
     *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="OffsetDropTime">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="BeforeArrival"/>
     *             &lt;enumeration value="AfterBooking"/>
     *             &lt;enumeration value="AfterConfirmation"/>
     *             &lt;enumeration value="AfterArrival"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GracePeriod {

        @XmlAttribute(name = "AbsoluteDeadline")
        protected String absoluteDeadline;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected TimeUnitType offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected BigInteger offsetUnitMultiplier;
        @XmlAttribute(name = "OffsetDropTime")
        protected String offsetDropTime;

        /**
         * ��ȡabsoluteDeadline���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * ����absoluteDeadline���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * ��ȡoffsetTimeUnit���Ե�ֵ��
         *
         * @return possible object is
         * {@link TimeUnitType }
         */
        public TimeUnitType getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * ����offsetTimeUnit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TimeUnitType }
         */
        public void setOffsetTimeUnit(TimeUnitType value) {
            this.offsetTimeUnit = value;
        }

        /**
         * ��ȡoffsetUnitMultiplier���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * ����offsetUnitMultiplier���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setOffsetUnitMultiplier(BigInteger value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * ��ȡoffsetDropTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * ����offsetDropTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
        }

    }

}
