package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OperationSchedulesType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OperationSchedulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationSchedule" type="{http://www.opentravel.org/OTA/2003/05}OperationScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationSchedulesType", propOrder = {
        "operationSchedule"
})
public class OperationSchedulesType {

    @XmlElement(name = "OperationSchedule")
    protected List<OperationScheduleType> operationSchedule;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;

    /**
     * Gets the value of the operationSchedule property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationSchedule property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationSchedule().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationScheduleType }
     */
    public List<OperationScheduleType> getOperationSchedule() {
        if (operationSchedule == null) {
            operationSchedule = new ArrayList<OperationScheduleType>();
        }
        return this.operationSchedule;
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

}
