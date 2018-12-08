package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomStayCandidate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
 *                 &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate", propOrder = {
        "roomStayCandidate"
})
public class ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate {

    @XmlElement(name = "RoomStayCandidate")
    protected List<ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate.RoomStayCandidate> roomStayCandidate;

    /**
     * Gets the value of the roomStayCandidate property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomStayCandidate property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomStayCandidate().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate.RoomStayCandidate }
     */
    public List<ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate.RoomStayCandidate> getRoomStayCandidate() {
        if (roomStayCandidate == null) {
            roomStayCandidate = new ArrayList<ArrayOfAvailRequestSegmentsTypeAvailRequestSegmentRoomStayCandidate.RoomStayCandidate>();
        }
        return this.roomStayCandidate;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
     *       &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoomStayCandidate
            extends RoomStayCandidateType {

        @XmlAttribute(name = "IsAlternate")
        protected Boolean isAlternate;

        /**
         * ��ȡisAlternate���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isIsAlternate() {
            return isAlternate;
        }

        /**
         * ����isAlternate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setIsAlternate(Boolean value) {
            this.isAlternate = value;
        }

    }

}
