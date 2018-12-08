
package ota.jw.ARIPmsGateway;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelRatePlanTypeRate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelRatePlanTypeRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateUploadType"&gt;
 *                 &lt;attribute name="InvCodeApplication"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="DoesNotApply"/&gt;
 *                       &lt;enumeration value="InvCode"/&gt;
 *                       &lt;enumeration value="InvGroupingCode"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
 *                 &lt;attribute name="ExtraNightIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="BaseRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="AdjustedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="FloorAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="CeilingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="AdjustUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "ArrayOfHotelRatePlanTypeRate", propOrder = {
    "rate"
})
public class ArrayOfHotelRatePlanTypeRate {

    @XmlElement(name = "Rate")
    protected List<ArrayOfHotelRatePlanTypeRate.Rate> rate;

    /**
     * Gets the value of the rate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelRatePlanTypeRate.Rate }
     * 
     * 
     */
    public List<ArrayOfHotelRatePlanTypeRate.Rate> getRate() {
        if (rate == null) {
            rate = new ArrayList<ArrayOfHotelRatePlanTypeRate.Rate>();
        }
        return this.rate;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateUploadType"&gt;
     *       &lt;attribute name="InvCodeApplication"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="DoesNotApply"/&gt;
     *             &lt;enumeration value="InvCode"/&gt;
     *             &lt;enumeration value="InvGroupingCode"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" /&gt;
     *       &lt;attribute name="ExtraNightIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="BaseRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="AdjustedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="FloorAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="CeilingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="AdjustUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Rate
        extends RateUploadType
    {

        @XmlAttribute(name = "InvCodeApplication")
        protected String invCodeApplication;
        @XmlAttribute(name = "InvCode")
        protected String invCode;
        @XmlAttribute(name = "InvType")
        protected String invType;
        @XmlAttribute(name = "InvTypeCode")
        protected String invTypeCode;
        @XmlAttribute(name = "IsRoom")
        protected Boolean isRoom;
        @XmlAttribute(name = "Status")
        protected AvailabilityStatusType status;
        @XmlAttribute(name = "ExtraNightIndicator")
        protected Boolean extraNightIndicator;
        @XmlAttribute(name = "BaseRatePlanCode")
        protected String baseRatePlanCode;
        @XmlAttribute(name = "AdjustedAmount")
        protected BigDecimal adjustedAmount;
        @XmlAttribute(name = "AdjustedPercentage")
        protected BigDecimal adjustedPercentage;
        @XmlAttribute(name = "FloorAmount")
        protected BigDecimal floorAmount;
        @XmlAttribute(name = "CeilingAmount")
        protected BigDecimal ceilingAmount;
        @XmlAttribute(name = "AdjustUpIndicator")
        protected Boolean adjustUpIndicator;

        /**
         * 获取invCodeApplication属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvCodeApplication() {
            return invCodeApplication;
        }

        /**
         * 设置invCodeApplication属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvCodeApplication(String value) {
            this.invCodeApplication = value;
        }

        /**
         * 获取invCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvCode() {
            return invCode;
        }

        /**
         * 设置invCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvCode(String value) {
            this.invCode = value;
        }

        /**
         * 获取invType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvType() {
            return invType;
        }

        /**
         * 设置invType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvType(String value) {
            this.invType = value;
        }

        /**
         * 获取invTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvTypeCode() {
            return invTypeCode;
        }

        /**
         * 设置invTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvTypeCode(String value) {
            this.invTypeCode = value;
        }

        /**
         * 获取isRoom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsRoom() {
            return isRoom;
        }

        /**
         * 设置isRoom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsRoom(Boolean value) {
            this.isRoom = value;
        }

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailabilityStatusType }
         *     
         */
        public AvailabilityStatusType getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilityStatusType }
         *     
         */
        public void setStatus(AvailabilityStatusType value) {
            this.status = value;
        }

        /**
         * 获取extraNightIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExtraNightIndicator() {
            return extraNightIndicator;
        }

        /**
         * 设置extraNightIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExtraNightIndicator(Boolean value) {
            this.extraNightIndicator = value;
        }

        /**
         * 获取baseRatePlanCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBaseRatePlanCode() {
            return baseRatePlanCode;
        }

        /**
         * 设置baseRatePlanCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBaseRatePlanCode(String value) {
            this.baseRatePlanCode = value;
        }

        /**
         * 获取adjustedAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAdjustedAmount() {
            return adjustedAmount;
        }

        /**
         * 设置adjustedAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAdjustedAmount(BigDecimal value) {
            this.adjustedAmount = value;
        }

        /**
         * 获取adjustedPercentage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAdjustedPercentage() {
            return adjustedPercentage;
        }

        /**
         * 设置adjustedPercentage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAdjustedPercentage(BigDecimal value) {
            this.adjustedPercentage = value;
        }

        /**
         * 获取floorAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFloorAmount() {
            return floorAmount;
        }

        /**
         * 设置floorAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFloorAmount(BigDecimal value) {
            this.floorAmount = value;
        }

        /**
         * 获取ceilingAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCeilingAmount() {
            return ceilingAmount;
        }

        /**
         * 设置ceilingAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCeilingAmount(BigDecimal value) {
            this.ceilingAmount = value;
        }

        /**
         * 获取adjustUpIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAdjustUpIndicator() {
            return adjustUpIndicator;
        }

        /**
         * 设置adjustUpIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAdjustUpIndicator(Boolean value) {
            this.adjustUpIndicator = value;
        }

    }

}
