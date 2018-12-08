package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount", propOrder = {"guestCount"})
public class ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount {
    @XmlElement(name = "GuestCount")
    protected List<ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount.GuestCount> guestCount;

    public List<ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount.GuestCount> getGuestCount() {
        if (guestCount == null) {
            guestCount = new ArrayList<ArrayOfRoomStayTypeRoomRatesRoomRateGuestCount.GuestCount>();
        }
        return this.guestCount;
    }

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

        public String getAgeQualifyingCode() {
            return ageQualifyingCode;
        }

        public void setAgeQualifyingCode(String value) {
            this.ageQualifyingCode = value;
        }

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