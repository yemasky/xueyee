
package ota.jw.AvailRes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CancelPenaltyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CancelPenaltyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Deadline" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="OffsetDropTime"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="BeforeArrival"/&gt;
 *                       &lt;enumeration value="AfterBooking"/&gt;
 *                       &lt;enumeration value="AfterConfirmation"/&gt;
 *                       &lt;enumeration value="AfterArrival"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AmountPercent" type="{http://www.opentravel.org/OTA/2003/05}AmountPercentType" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ConfirmClassCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 获取deadline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltyType.Deadline }
     *     
     */
    public CancelPenaltyType.Deadline getDeadline() {
        return deadline;
    }

    /**
     * 设置deadline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltyType.Deadline }
     *     
     */
    public void setDeadline(CancelPenaltyType.Deadline value) {
        this.deadline = value;
    }

    /**
     * 获取amountPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountPercentType }
     *     
     */
    public AmountPercentType getAmountPercent() {
        return amountPercent;
    }

    /**
     * 设置amountPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPercentType }
     *     
     */
    public void setAmountPercent(AmountPercentType value) {
        this.amountPercent = value;
    }

    /**
     * Gets the value of the penaltyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getPenaltyDescription() {
        if (penaltyDescription == null) {
            penaltyDescription = new ArrayList<ParagraphType>();
        }
        return this.penaltyDescription;
    }

    /**
     * 获取confirmClassCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmClassCode() {
        return confirmClassCode;
    }

    /**
     * 设置confirmClassCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmClassCode(String value) {
        this.confirmClassCode = value;
    }

    /**
     * 获取policyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyCode() {
        return policyCode;
    }

    /**
     * 设置policyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyCode(String value) {
        this.policyCode = value;
    }

    /**
     * 获取nonRefundable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRefundable() {
        return nonRefundable;
    }

    /**
     * 设置nonRefundable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRefundable(Boolean value) {
        this.nonRefundable = value;
    }

    /**
     * 获取mon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMon() {
        return mon;
    }

    /**
     * 设置mon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMon(Boolean value) {
        this.mon = value;
    }

    /**
     * 获取tue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTue() {
        return tue;
    }

    /**
     * 设置tue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTue(Boolean value) {
        this.tue = value;
    }

    /**
     * 获取weds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeds() {
        return weds;
    }

    /**
     * 设置weds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeds(Boolean value) {
        this.weds = value;
    }

    /**
     * 获取thur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThur() {
        return thur;
    }

    /**
     * 设置thur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThur(Boolean value) {
        this.thur = value;
    }

    /**
     * 获取fri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFri() {
        return fri;
    }

    /**
     * 设置fri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFri(Boolean value) {
        this.fri = value;
    }

    /**
     * 获取sat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSat() {
        return sat;
    }

    /**
     * 设置sat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSat(Boolean value) {
        this.sat = value;
    }

    /**
     * 获取sun属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSun() {
        return sun;
    }

    /**
     * 设置sun属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSun(Boolean value) {
        this.sun = value;
    }

    /**
     * 获取start属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置start属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * 获取end属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * 设置end属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * 获取roomTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * 设置roomTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
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
     *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="OffsetDropTime"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="BeforeArrival"/&gt;
     *             &lt;enumeration value="AfterBooking"/&gt;
     *             &lt;enumeration value="AfterConfirmation"/&gt;
     *             &lt;enumeration value="AfterArrival"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取absoluteDeadline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * 设置absoluteDeadline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * 获取offsetTimeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * 设置offsetTimeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setOffsetTimeUnit(TimeUnitType value) {
            this.offsetTimeUnit = value;
        }

        /**
         * 获取offsetUnitMultiplier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * 设置offsetUnitMultiplier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOffsetUnitMultiplier(BigInteger value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * 获取offsetDropTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * 设置offsetDropTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
        }

    }

}
