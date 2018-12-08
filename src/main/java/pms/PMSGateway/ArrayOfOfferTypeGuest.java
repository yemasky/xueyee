package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfOfferTypeGuest complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfOfferTypeGuest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Guest" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="AgeTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MinCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="FirstQualifyingPosition" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="LastQualifyingPosition" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
@XmlType(name = "ArrayOfOfferTypeGuest", propOrder = {
        "guest"
})
public class ArrayOfOfferTypeGuest {

    @XmlElement(name = "Guest")
    protected List<ArrayOfOfferTypeGuest.Guest> guest;

    /**
     * Gets the value of the guest property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guest property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuest().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOfferTypeGuest.Guest }
     */
    public List<ArrayOfOfferTypeGuest.Guest> getGuest() {
        if (guest == null) {
            guest = new ArrayList<ArrayOfOfferTypeGuest.Guest>();
        }
        return this.guest;
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
     *       &lt;attribute name="MinCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="FirstQualifyingPosition" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="LastQualifyingPosition" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Guest {

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
        @XmlAttribute(name = "MinCount")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minCount;
        @XmlAttribute(name = "MaxCount")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxCount;
        @XmlAttribute(name = "FirstQualifyingPosition")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger firstQualifyingPosition;
        @XmlAttribute(name = "LastQualifyingPosition")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger lastQualifyingPosition;

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
         * ��ȡminCount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMinCount() {
            return minCount;
        }

        /**
         * ����minCount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMinCount(BigInteger value) {
            this.minCount = value;
        }

        /**
         * ��ȡmaxCount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxCount() {
            return maxCount;
        }

        /**
         * ����maxCount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxCount(BigInteger value) {
            this.maxCount = value;
        }

        /**
         * ��ȡfirstQualifyingPosition���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getFirstQualifyingPosition() {
            return firstQualifyingPosition;
        }

        /**
         * ����firstQualifyingPosition���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setFirstQualifyingPosition(BigInteger value) {
            this.firstQualifyingPosition = value;
        }

        /**
         * ��ȡlastQualifyingPosition���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getLastQualifyingPosition() {
            return lastQualifyingPosition;
        }

        /**
         * ����lastQualifyingPosition���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setLastQualifyingPosition(BigInteger value) {
            this.lastQualifyingPosition = value;
        }

    }

}
