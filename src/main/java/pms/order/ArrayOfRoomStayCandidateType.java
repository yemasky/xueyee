package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfRoomStayCandidateType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfRoomStayCandidateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomStayCandidate" type="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomStayCandidateType", propOrder = {
        "roomStayCandidate"
})
public class ArrayOfRoomStayCandidateType {

    @XmlElement(name = "RoomStayCandidate")
    protected List<RoomStayCandidateType> roomStayCandidate;

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
     * {@link RoomStayCandidateType }
     */
    public List<RoomStayCandidateType> getRoomStayCandidate() {
        if (roomStayCandidate == null) {
            roomStayCandidate = new ArrayList<RoomStayCandidateType>();
        }
        return this.roomStayCandidate;
    }

}
