package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>StayInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="StayInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="HotelReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="RoomStayRPH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StayInfoType", propOrder = {
        "reservationID",
        "hotelReservation"
})
public class StayInfoType {

    @XmlElement(name = "ReservationID")
    protected UniqueIDType reservationID;
    @XmlElement(name = "HotelReservation")
    protected HotelReservationType hotelReservation;
    @XmlAttribute(name = "SequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "RoomStayRPH")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger roomStayRPH;

    /**
     * ��ȡreservationID���Ե�ֵ��
     *
     * @return possible object is
     * {@link UniqueIDType }
     */
    public UniqueIDType getReservationID() {
        return reservationID;
    }

    /**
     * ����reservationID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link UniqueIDType }
     */
    public void setReservationID(UniqueIDType value) {
        this.reservationID = value;
    }

    /**
     * ��ȡhotelReservation���Ե�ֵ��
     *
     * @return possible object is
     * {@link HotelReservationType }
     */
    public HotelReservationType getHotelReservation() {
        return hotelReservation;
    }

    /**
     * ����hotelReservation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HotelReservationType }
     */
    public void setHotelReservation(HotelReservationType value) {
        this.hotelReservation = value;
    }

    /**
     * ��ȡsequenceNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * ����sequenceNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * ��ȡroomStayRPH���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getRoomStayRPH() {
        return roomStayRPH;
    }

    /**
     * ����roomStayRPH���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setRoomStayRPH(BigInteger value) {
        this.roomStayRPH = value;
    }

}
