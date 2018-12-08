package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfHotelRatePlanTypeSupplement complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfHotelRatePlanTypeSupplement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Supplement" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomCompanions" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                           &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="MinCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="MaxCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PrerequisiteInventory" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SupplementType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="AdditionalGuest"/>
 *                       &lt;enumeration value="Board"/>
 *                       &lt;enumeration value="Extra"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ChargeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AdditionalGuestNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="AddToBasicRateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SingleUseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MandatoryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfHotelRatePlanTypeSupplement", propOrder = {
        "supplement"
})
public class ArrayOfHotelRatePlanTypeSupplement {

    @XmlElement(name = "Supplement")
    protected List<ArrayOfHotelRatePlanTypeSupplement.Supplement> supplement;

    /**
     * Gets the value of the supplement property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplement property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplement().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelRatePlanTypeSupplement.Supplement }
     */
    public List<ArrayOfHotelRatePlanTypeSupplement.Supplement> getSupplement() {
        if (supplement == null) {
            supplement = new ArrayList<ArrayOfHotelRatePlanTypeSupplement.Supplement>();
        }
        return this.supplement;
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
     *       &lt;sequence>
     *         &lt;element name="RoomCompanions" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="MinCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="MaxCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PrerequisiteInventory" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SupplementType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="AdditionalGuest"/>
     *             &lt;enumeration value="Board"/>
     *             &lt;enumeration value="Extra"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ChargeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AdditionalGuestNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="AddToBasicRateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SingleUseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MandatoryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "roomCompanions",
            "prerequisiteInventory",
            "description"
    })
    public static class Supplement {

        @XmlElement(name = "RoomCompanions")
        protected List<ArrayOfHotelRatePlanTypeSupplement.Supplement.RoomCompanions> roomCompanions;
        @XmlElement(name = "PrerequisiteInventory")
        protected List<ArrayOfHotelRatePlanTypeSupplement.Supplement.PrerequisiteInventory> prerequisiteInventory;
        @XmlElement(name = "Description")
        protected List<ParagraphType> description;
        @XmlAttribute(name = "AgeQualifyingCode")
        protected String ageQualifyingCode;
        @XmlAttribute(name = "MinAge")
        protected BigInteger minAge;
        @XmlAttribute(name = "MaxAge")
        protected BigInteger maxAge;
        @XmlAttribute(name = "AgeTimeUnit")
        protected TimeUnitType ageTimeUnit;
        @XmlAttribute(name = "AgeBucket")
        protected String ageBucket;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "SupplementType")
        protected String supplementType;
        @XmlAttribute(name = "ChargeTypeCode")
        protected String chargeTypeCode;
        @XmlAttribute(name = "InvCode")
        protected String invCode;
        @XmlAttribute(name = "InvType")
        protected String invType;
        @XmlAttribute(name = "AdditionalGuestNumber")
        protected BigInteger additionalGuestNumber;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "AddToBasicRateIndicator")
        protected Boolean addToBasicRateIndicator;
        @XmlAttribute(name = "SingleUseIndicator")
        protected Boolean singleUseIndicator;
        @XmlAttribute(name = "MandatoryIndicator")
        protected Boolean mandatoryIndicator;

        /**
         * Gets the value of the roomCompanions property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomCompanions property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomCompanions().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfHotelRatePlanTypeSupplement.Supplement.RoomCompanions }
         */
        public List<ArrayOfHotelRatePlanTypeSupplement.Supplement.RoomCompanions> getRoomCompanions() {
            if (roomCompanions == null) {
                roomCompanions = new ArrayList<ArrayOfHotelRatePlanTypeSupplement.Supplement.RoomCompanions>();
            }
            return this.roomCompanions;
        }

        /**
         * Gets the value of the prerequisiteInventory property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prerequisiteInventory property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrerequisiteInventory().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfHotelRatePlanTypeSupplement.Supplement.PrerequisiteInventory }
         */
        public List<ArrayOfHotelRatePlanTypeSupplement.Supplement.PrerequisiteInventory> getPrerequisiteInventory() {
            if (prerequisiteInventory == null) {
                prerequisiteInventory = new ArrayList<ArrayOfHotelRatePlanTypeSupplement.Supplement.PrerequisiteInventory>();
            }
            return this.prerequisiteInventory;
        }

        /**
         * Gets the value of the description property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         */
        public List<ParagraphType> getDescription() {
            if (description == null) {
                description = new ArrayList<ParagraphType>();
            }
            return this.description;
        }

        /**
         * ��ȡageQualifyingCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAgeQualifyingCode() {
            return ageQualifyingCode;
        }

        /**
         * ����ageQualifyingCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAgeQualifyingCode(String value) {
            this.ageQualifyingCode = value;
        }

        /**
         * ��ȡminAge���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMinAge() {
            return minAge;
        }

        /**
         * ����minAge���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMinAge(BigInteger value) {
            this.minAge = value;
        }

        /**
         * ��ȡmaxAge���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxAge() {
            return maxAge;
        }

        /**
         * ����maxAge���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxAge(BigInteger value) {
            this.maxAge = value;
        }

        /**
         * ��ȡageTimeUnit���Ե�ֵ��
         *
         * @return possible object is
         * {@link TimeUnitType }
         */
        public TimeUnitType getAgeTimeUnit() {
            return ageTimeUnit;
        }

        /**
         * ����ageTimeUnit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TimeUnitType }
         */
        public void setAgeTimeUnit(TimeUnitType value) {
            this.ageTimeUnit = value;
        }

        /**
         * ��ȡageBucket���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAgeBucket() {
            return ageBucket;
        }

        /**
         * ����ageBucket���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAgeBucket(String value) {
            this.ageBucket = value;
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
         * ��ȡsupplementType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSupplementType() {
            return supplementType;
        }

        /**
         * ����supplementType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSupplementType(String value) {
            this.supplementType = value;
        }

        /**
         * ��ȡchargeTypeCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getChargeTypeCode() {
            return chargeTypeCode;
        }

        /**
         * ����chargeTypeCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setChargeTypeCode(String value) {
            this.chargeTypeCode = value;
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
         * ��ȡadditionalGuestNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getAdditionalGuestNumber() {
            return additionalGuestNumber;
        }

        /**
         * ����additionalGuestNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setAdditionalGuestNumber(BigInteger value) {
            this.additionalGuestNumber = value;
        }

        /**
         * ��ȡrph���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRPH() {
            return rph;
        }

        /**
         * ����rph���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRPH(String value) {
            this.rph = value;
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
         * ��ȡaddToBasicRateIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isAddToBasicRateIndicator() {
            return addToBasicRateIndicator;
        }

        /**
         * ����addToBasicRateIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setAddToBasicRateIndicator(Boolean value) {
            this.addToBasicRateIndicator = value;
        }

        /**
         * ��ȡsingleUseIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isSingleUseIndicator() {
            return singleUseIndicator;
        }

        /**
         * ����singleUseIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setSingleUseIndicator(Boolean value) {
            this.singleUseIndicator = value;
        }

        /**
         * ��ȡmandatoryIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isMandatoryIndicator() {
            return mandatoryIndicator;
        }

        /**
         * ����mandatoryIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setMandatoryIndicator(Boolean value) {
            this.mandatoryIndicator = value;
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
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PrerequisiteInventory {

            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;

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
         *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
         *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="MinCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="MaxCompanions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RoomCompanions {

            @XmlAttribute(name = "AgeQualifyingCode")
            protected String ageQualifyingCode;
            @XmlAttribute(name = "MinAge")
            protected BigInteger minAge;
            @XmlAttribute(name = "MaxAge")
            protected BigInteger maxAge;
            @XmlAttribute(name = "AgeTimeUnit")
            protected TimeUnitType ageTimeUnit;
            @XmlAttribute(name = "AgeBucket")
            protected String ageBucket;
            @XmlAttribute(name = "MinCompanions")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger minCompanions;
            @XmlAttribute(name = "MaxCompanions")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger maxCompanions;

            /**
             * ��ȡageQualifyingCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAgeQualifyingCode() {
                return ageQualifyingCode;
            }

            /**
             * ����ageQualifyingCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAgeQualifyingCode(String value) {
                this.ageQualifyingCode = value;
            }

            /**
             * ��ȡminAge���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getMinAge() {
                return minAge;
            }

            /**
             * ����minAge���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setMinAge(BigInteger value) {
                this.minAge = value;
            }

            /**
             * ��ȡmaxAge���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getMaxAge() {
                return maxAge;
            }

            /**
             * ����maxAge���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setMaxAge(BigInteger value) {
                this.maxAge = value;
            }

            /**
             * ��ȡageTimeUnit���Ե�ֵ��
             *
             * @return possible object is
             * {@link TimeUnitType }
             */
            public TimeUnitType getAgeTimeUnit() {
                return ageTimeUnit;
            }

            /**
             * ����ageTimeUnit���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link TimeUnitType }
             */
            public void setAgeTimeUnit(TimeUnitType value) {
                this.ageTimeUnit = value;
            }

            /**
             * ��ȡageBucket���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getAgeBucket() {
                return ageBucket;
            }

            /**
             * ����ageBucket���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAgeBucket(String value) {
                this.ageBucket = value;
            }

            /**
             * ��ȡminCompanions���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getMinCompanions() {
                return minCompanions;
            }

            /**
             * ����minCompanions���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setMinCompanions(BigInteger value) {
                this.minCompanions = value;
            }

            /**
             * ��ȡmaxCompanions���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getMaxCompanions() {
                return maxCompanions;
            }

            /**
             * ����maxCompanions���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setMaxCompanions(BigInteger value) {
                this.maxCompanions = value;
            }

        }

    }

}
