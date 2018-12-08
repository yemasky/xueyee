package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>MonetaryRuleType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="MonetaryRuleType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="RuleType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RateConvertedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryRuleType", propOrder = {
        "value"
})
public class MonetaryRuleType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "RuleType")
    protected String ruleType;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "PaymentType")
    protected String paymentType;
    @XmlAttribute(name = "RateConvertedInd")
    protected Boolean rateConvertedInd;
    @XmlAttribute(name = "AbsoluteDeadline")
    protected String absoluteDeadline;
    @XmlAttribute(name = "OffsetTimeUnit")
    protected TimeUnitType offsetTimeUnit;
    @XmlAttribute(name = "OffsetUnitMultiplier")
    protected BigInteger offsetUnitMultiplier;
    @XmlAttribute(name = "OffsetDropTime")
    protected String offsetDropTime;

    /**
     * ��ȡvalue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

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
     * ��ȡruleType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * ����ruleType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRuleType(String value) {
        this.ruleType = value;
    }

    /**
     * ��ȡpercent���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * ����percent���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

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

    /**
     * ��ȡpaymentType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * ����paymentType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
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
