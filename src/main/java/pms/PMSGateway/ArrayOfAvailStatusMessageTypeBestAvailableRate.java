package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfAvailStatusMessageTypeBestAvailableRate complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfAvailStatusMessageTypeBestAvailableRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BestAvailableRate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="LengthOfStayTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="LengthOfStayTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfAvailStatusMessageTypeBestAvailableRate", propOrder = {
        "bestAvailableRate"
})
public class ArrayOfAvailStatusMessageTypeBestAvailableRate {

    @XmlElement(name = "BestAvailableRate")
    protected List<ArrayOfAvailStatusMessageTypeBestAvailableRate.BestAvailableRate> bestAvailableRate;

    /**
     * Gets the value of the bestAvailableRate property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestAvailableRate property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestAvailableRate().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAvailStatusMessageTypeBestAvailableRate.BestAvailableRate }
     */
    public List<ArrayOfAvailStatusMessageTypeBestAvailableRate.BestAvailableRate> getBestAvailableRate() {
        if (bestAvailableRate == null) {
            bestAvailableRate = new ArrayList<ArrayOfAvailStatusMessageTypeBestAvailableRate.BestAvailableRate>();
        }
        return this.bestAvailableRate;
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
     *       &lt;attribute name="LengthOfStayTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="LengthOfStayTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
     *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BestAvailableRate {

        @XmlAttribute(name = "LengthOfStayTime")
        protected BigInteger lengthOfStayTime;
        @XmlAttribute(name = "LengthOfStayTimeUnit")
        protected TimeUnitType lengthOfStayTimeUnit;
        @XmlAttribute(name = "RatePlanCode")
        protected String ratePlanCode;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "TaxInclusive")
        protected Boolean taxInclusive;

        /**
         * ��ȡlengthOfStayTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getLengthOfStayTime() {
            return lengthOfStayTime;
        }

        /**
         * ����lengthOfStayTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setLengthOfStayTime(BigInteger value) {
            this.lengthOfStayTime = value;
        }

        /**
         * ��ȡlengthOfStayTimeUnit���Ե�ֵ��
         *
         * @return possible object is
         * {@link TimeUnitType }
         */
        public TimeUnitType getLengthOfStayTimeUnit() {
            return lengthOfStayTimeUnit;
        }

        /**
         * ����lengthOfStayTimeUnit���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TimeUnitType }
         */
        public void setLengthOfStayTimeUnit(TimeUnitType value) {
            this.lengthOfStayTimeUnit = value;
        }

        /**
         * ��ȡratePlanCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRatePlanCode() {
            return ratePlanCode;
        }

        /**
         * ����ratePlanCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRatePlanCode(String value) {
            this.ratePlanCode = value;
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

    }

}
