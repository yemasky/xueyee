package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CancelPenaltyType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CancelPenaltyType">
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
 *         &lt;element name="AmountPercent" type="{http://www.opentravel.org/OTA/2003/05}AmountPercentType" minOccurs="0"/>
 *         &lt;element name="PenaltyDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ConfirmClassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPenaltyType", propOrder = {
        "deadline",
        "amountPercent",
        "penaltyDescription"
})
public class CancelPenaltyType {

    @XmlElement(name = "Deadline")
    protected CancelPenaltyType.Deadline deadline;
    @XmlElement(name = "AmountPercent")
    protected AmountPercentType amountPercent;
    @XmlElement(name = "PenaltyDescription")
    protected List<ParagraphType> penaltyDescription;
    @XmlAttribute(name = "ConfirmClassCode")
    protected String confirmClassCode;
    @XmlAttribute(name = "PolicyCode")
    protected String policyCode;
    @XmlAttribute(name = "NonRefundable")
    protected Boolean nonRefundable;
    @XmlAttribute(name = "Mon")
    protected Boolean mon;
    @XmlAttribute(name = "Tue")
    protected Boolean tue;
    @XmlAttribute(name = "Weds")
    protected Boolean weds;
    @XmlAttribute(name = "Thur")
    protected Boolean thur;
    @XmlAttribute(name = "Fri")
    protected Boolean fri;
    @XmlAttribute(name = "Sat")
    protected Boolean sat;
    @XmlAttribute(name = "Sun")
    protected Boolean sun;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "RoomTypeCode")
    protected String roomTypeCode;

    /**
     * ��ȡdeadline���Ե�ֵ��
     *
     * @return possible object is
     * {@link CancelPenaltyType.Deadline }
     */
    public CancelPenaltyType.Deadline getDeadline() {
        return deadline;
    }

    /**
     * ����deadline���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CancelPenaltyType.Deadline }
     */
    public void setDeadline(CancelPenaltyType.Deadline value) {
        this.deadline = value;
    }

    /**
     * ��ȡamountPercent���Ե�ֵ��
     *
     * @return possible object is
     * {@link AmountPercentType }
     */
    public AmountPercentType getAmountPercent() {
        return amountPercent;
    }

    /**
     * ����amountPercent���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link AmountPercentType }
     */
    public void setAmountPercent(AmountPercentType value) {
        this.amountPercent = value;
    }

    /**
     * Gets the value of the penaltyDescription property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyDescription property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyDescription().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     */
    public List<ParagraphType> getPenaltyDescription() {
        if (penaltyDescription == null) {
            penaltyDescription = new ArrayList<ParagraphType>();
        }
        return this.penaltyDescription;
    }

    /**
     * ��ȡconfirmClassCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getConfirmClassCode() {
        return confirmClassCode;
    }

    /**
     * ����confirmClassCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConfirmClassCode(String value) {
        this.confirmClassCode = value;
    }

    /**
     * ��ȡpolicyCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPolicyCode() {
        return policyCode;
    }

    /**
     * ����policyCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPolicyCode(String value) {
        this.policyCode = value;
    }

    /**
     * ��ȡnonRefundable���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isNonRefundable() {
        return nonRefundable;
    }

    /**
     * ����nonRefundable���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setNonRefundable(Boolean value) {
        this.nonRefundable = value;
    }

    /**
     * ��ȡmon���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMon() {
        return mon;
    }

    /**
     * ����mon���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMon(Boolean value) {
        this.mon = value;
    }

    /**
     * ��ȡtue���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTue() {
        return tue;
    }

    /**
     * ����tue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTue(Boolean value) {
        this.tue = value;
    }

    /**
     * ��ȡweds���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isWeds() {
        return weds;
    }

    /**
     * ����weds���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setWeds(Boolean value) {
        this.weds = value;
    }

    /**
     * ��ȡthur���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isThur() {
        return thur;
    }

    /**
     * ����thur���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setThur(Boolean value) {
        this.thur = value;
    }

    /**
     * ��ȡfri���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isFri() {
        return fri;
    }

    /**
     * ����fri���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setFri(Boolean value) {
        this.fri = value;
    }

    /**
     * ��ȡsat���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSat() {
        return sat;
    }

    /**
     * ����sat���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSat(Boolean value) {
        this.sat = value;
    }

    /**
     * ��ȡsun���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSun() {
        return sun;
    }

    /**
     * ����sun���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSun(Boolean value) {
        this.sun = value;
    }

    /**
     * ��ȡstart���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStart() {
        return start;
    }

    /**
     * ����start���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * ��ȡduration���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDuration() {
        return duration;
    }

    /**
     * ����duration���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * ��ȡend���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEnd() {
        return end;
    }

    /**
     * ����end���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * ��ȡroomTypeCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * ����roomTypeCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
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

}
