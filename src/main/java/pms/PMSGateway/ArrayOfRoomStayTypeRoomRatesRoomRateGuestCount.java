package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestCount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount", propOrder = {
        "guestCount"
})
public class ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount {

    @XmlElement(name = "GuestCount")
    protected List<ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount.GuestCount> guestCount;

    /**
     * Gets the value of the guestCount property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestCount property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestCount().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount.GuestCount }
     */
    public List<ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount.GuestCount> getGuestCount() {
        if (guestCount == null) {
            guestCount = new ArrayList<ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount.GuestCount>();
        }
        return this.guestCount;
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
     *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="AgeBucket" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GuestCount {

        @XmlAttribute(name = "AgeQualifyingCode")
        protected String ageQualifyingCode;
        @XmlAttribute(name = "Age")
        protected BigInteger age;
        @XmlAttribute(name = "Count")
        protected BigInteger count;
        @XmlAttribute(name = "AgeBucket")
        protected String ageBucket;

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
         * ��ȡage���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getAge() {
            return age;
        }

        /**
         * ����age���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setAge(BigInteger value) {
            this.age = value;
        }

        /**
         * ��ȡcount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * ����count���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setCount(BigInteger value) {
            this.count = value;
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

    }

}
