package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfRateUploadTypeAdditionalGuestAmount complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfRateUploadTypeAdditionalGuestAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalGuestAmount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
 *                   &lt;element name="AddlGuestAmtDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MaxAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}AmountDeterminationType" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
@XmlType(name = "ArrayOfRateUploadTypeAdditionalGuestAmount", propOrder = {
        "additionalGuestAmount"
})
public class ArrayOfRateUploadTypeAdditionalGuestAmount {

    @XmlElement(name = "AdditionalGuestAmount")
    protected List<ArrayOfRateUploadTypeAdditionalGuestAmount.AdditionalGuestAmount> additionalGuestAmount;

    /**
     * Gets the value of the additionalGuestAmount property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalGuestAmount property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalGuestAmount().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRateUploadTypeAdditionalGuestAmount.AdditionalGuestAmount }
     */
    public List<ArrayOfRateUploadTypeAdditionalGuestAmount.AdditionalGuestAmount> getAdditionalGuestAmount() {
        if (additionalGuestAmount == null) {
            additionalGuestAmount = new ArrayList<ArrayOfRateUploadTypeAdditionalGuestAmount.AdditionalGuestAmount>();
        }
        return this.additionalGuestAmount;
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
     *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
     *         &lt;element name="AddlGuestAmtDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MaxAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}AmountDeterminationType" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "taxes",
            "addlGuestAmtDescription"
    })
    public static class AdditionalGuestAmount {

        @XmlElement(name = "Taxes")
        protected TaxesType taxes;
        @XmlElement(name = "AddlGuestAmtDescription")
        protected List<ParagraphType> addlGuestAmtDescription;
        @XmlAttribute(name = "TaxInclusive")
        protected Boolean taxInclusive;
        @XmlAttribute(name = "MaxAdditionalGuests")
        protected BigInteger maxAdditionalGuests;
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
        @XmlAttribute(name = "Type")
        protected AmountDeterminationType type;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;

        /**
         * ��ȡtaxes���Ե�ֵ��
         *
         * @return possible object is
         * {@link TaxesType }
         */
        public TaxesType getTaxes() {
            return taxes;
        }

        /**
         * ����taxes���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TaxesType }
         */
        public void setTaxes(TaxesType value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the addlGuestAmtDescription property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addlGuestAmtDescription property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddlGuestAmtDescription().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         */
        public List<ParagraphType> getAddlGuestAmtDescription() {
            if (addlGuestAmtDescription == null) {
                addlGuestAmtDescription = new ArrayList<ParagraphType>();
            }
            return this.addlGuestAmtDescription;
        }

        /**
         * ��ȡtaxInclusive���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isTaxInclusive() {
            return taxInclusive;
        }

        /**
         * ����taxInclusive���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setTaxInclusive(Boolean value) {
            this.taxInclusive = value;
        }

        /**
         * ��ȡmaxAdditionalGuests���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxAdditionalGuests() {
            return maxAdditionalGuests;
        }

        /**
         * ����maxAdditionalGuests���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxAdditionalGuests(BigInteger value) {
            this.maxAdditionalGuests = value;
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
         * ��ȡtype���Ե�ֵ��
         *
         * @return possible object is
         * {@link AmountDeterminationType }
         */
        public AmountDeterminationType getType() {
            return type;
        }

        /**
         * ����type���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link AmountDeterminationType }
         */
        public void setType(AmountDeterminationType value) {
            this.type = value;
        }

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
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

    }

}
