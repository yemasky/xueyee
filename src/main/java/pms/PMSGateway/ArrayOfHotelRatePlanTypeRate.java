package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfHotelRatePlanTypeRate complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfHotelRatePlanTypeRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateUploadType">
 *                 &lt;attribute name="InvCodeApplication">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="DoesNotApply"/>
 *                       &lt;enumeration value="InvCode"/>
 *                       &lt;enumeration value="InvGroupingCode"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
 *                 &lt;attribute name="ExtraNightIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="BaseRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="AdjustedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FloorAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="CeilingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="AdjustUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
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
@XmlType(name = "ArrayOfHotelRatePlanTypeRate", propOrder = {
        "rate"
})
public class ArrayOfHotelRatePlanTypeRate {

    @XmlElement(name = "Rate")
    protected List<ArrayOfHotelRatePlanTypeRate.Rate> rate;

    /**
     * Gets the value of the rate property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelRatePlanTypeRate.Rate }
     */
    public List<ArrayOfHotelRatePlanTypeRate.Rate> getRate() {
        if (rate == null) {
            rate = new ArrayList<ArrayOfHotelRatePlanTypeRate.Rate>();
        }
        return this.rate;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateUploadType">
     *       &lt;attribute name="InvCodeApplication">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="DoesNotApply"/>
     *             &lt;enumeration value="InvCode"/>
     *             &lt;enumeration value="InvGroupingCode"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailabilityStatusType" />
     *       &lt;attribute name="ExtraNightIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="BaseRatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="AdjustedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="FloorAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="CeilingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="AdjustUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Rate
            extends RateUploadType {

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
         * ��ȡinvCodeApplication���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInvCodeApplication() {
            return invCodeApplication;
        }

        /**
         * ����invCodeApplication���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInvCodeApplication(String value) {
            this.invCodeApplication = value;
        }

        /**
         * ��ȡinvCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInvCode() {
            return invCode;
        }

        /**
         * ����invCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInvCode(String value) {
            this.invCode = value;
        }

        /**
         * ��ȡinvType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInvType() {
            return invType;
        }

        /**
         * ����invType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInvType(String value) {
            this.invType = value;
        }

        /**
         * ��ȡinvTypeCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInvTypeCode() {
            return invTypeCode;
        }

        /**
         * ����invTypeCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInvTypeCode(String value) {
            this.invTypeCode = value;
        }

        /**
         * ��ȡisRoom���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isIsRoom() {
            return isRoom;
        }

        /**
         * ����isRoom���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setIsRoom(Boolean value) {
            this.isRoom = value;
        }

        /**
         * ��ȡstatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link AvailabilityStatusType }
         */
        public AvailabilityStatusType getStatus() {
            return status;
        }

        /**
         * ����status���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AvailabilityStatusType }
         */
        public void setStatus(AvailabilityStatusType value) {
            this.status = value;
        }

        /**
         * ��ȡextraNightIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isExtraNightIndicator() {
            return extraNightIndicator;
        }

        /**
         * ����extraNightIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setExtraNightIndicator(Boolean value) {
            this.extraNightIndicator = value;
        }

        /**
         * ��ȡbaseRatePlanCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBaseRatePlanCode() {
            return baseRatePlanCode;
        }

        /**
         * ����baseRatePlanCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBaseRatePlanCode(String value) {
            this.baseRatePlanCode = value;
        }

        /**
         * ��ȡadjustedAmount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getAdjustedAmount() {
            return adjustedAmount;
        }

        /**
         * ����adjustedAmount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setAdjustedAmount(BigDecimal value) {
            this.adjustedAmount = value;
        }

        /**
         * ��ȡadjustedPercentage���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getAdjustedPercentage() {
            return adjustedPercentage;
        }

        /**
         * ����adjustedPercentage���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setAdjustedPercentage(BigDecimal value) {
            this.adjustedPercentage = value;
        }

        /**
         * ��ȡfloorAmount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getFloorAmount() {
            return floorAmount;
        }

        /**
         * ����floorAmount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setFloorAmount(BigDecimal value) {
            this.floorAmount = value;
        }

        /**
         * ��ȡceilingAmount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getCeilingAmount() {
            return ceilingAmount;
        }

        /**
         * ����ceilingAmount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setCeilingAmount(BigDecimal value) {
            this.ceilingAmount = value;
        }

        /**
         * ��ȡadjustUpIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isAdjustUpIndicator() {
            return adjustUpIndicator;
        }

        /**
         * ����adjustUpIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setAdjustUpIndicator(Boolean value) {
            this.adjustUpIndicator = value;
        }

    }

}
