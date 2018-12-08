package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>MeetingRoomCapacityType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="MeetingRoomCapacityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Occupancy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MinRoomCharge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MeetingRoomFormatCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRoomCapacityType", propOrder = {
        "occupancy"
})
public class MeetingRoomCapacityType {

    @XmlElement(name = "Occupancy")
    protected MeetingRoomCapacityType.Occupancy occupancy;
    @XmlAttribute(name = "MeetingRoomFormatCode")
    protected String meetingRoomFormatCode;

    /**
     * ��ȡoccupancy���Ե�ֵ��
     *
     * @return possible object is
     * {@link MeetingRoomCapacityType.Occupancy }
     */
    public MeetingRoomCapacityType.Occupancy getOccupancy() {
        return occupancy;
    }

    /**
     * ����occupancy���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MeetingRoomCapacityType.Occupancy }
     */
    public void setOccupancy(MeetingRoomCapacityType.Occupancy value) {
        this.occupancy = value;
    }

    /**
     * ��ȡmeetingRoomFormatCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMeetingRoomFormatCode() {
        return meetingRoomFormatCode;
    }

    /**
     * ����meetingRoomFormatCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMeetingRoomFormatCode(String value) {
        this.meetingRoomFormatCode = value;
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
     *         &lt;element name="MinRoomCharge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "minRoomCharge"
    })
    public static class Occupancy {

        @XmlElement(name = "MinRoomCharge")
        protected FeeType minRoomCharge;
        @XmlAttribute(name = "MinOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minOccupancy;
        @XmlAttribute(name = "MaxOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxOccupancy;
        @XmlAttribute(name = "StandardOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger standardOccupancy;

        /**
         * ��ȡminRoomCharge���Ե�ֵ��
         *
         * @return possible object is
         * {@link FeeType }
         */
        public FeeType getMinRoomCharge() {
            return minRoomCharge;
        }

        /**
         * ����minRoomCharge���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link FeeType }
         */
        public void setMinRoomCharge(FeeType value) {
            this.minRoomCharge = value;
        }

        /**
         * ��ȡminOccupancy���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMinOccupancy() {
            return minOccupancy;
        }

        /**
         * ����minOccupancy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMinOccupancy(BigInteger value) {
            this.minOccupancy = value;
        }

        /**
         * ��ȡmaxOccupancy���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxOccupancy() {
            return maxOccupancy;
        }

        /**
         * ����maxOccupancy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxOccupancy(BigInteger value) {
            this.maxOccupancy = value;
        }

        /**
         * ��ȡstandardOccupancy���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getStandardOccupancy() {
            return standardOccupancy;
        }

        /**
         * ����standardOccupancy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setStandardOccupancy(BigInteger value) {
            this.standardOccupancy = value;
        }

    }

}
