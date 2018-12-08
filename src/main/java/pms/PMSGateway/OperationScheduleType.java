package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>OperationScheduleType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OperationScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationTimes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationScheduleTypeOperationTime" minOccurs="0"/>
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
@XmlType(name = "OperationScheduleType", propOrder = {
        "operationTimes"
})
@XmlSeeAlso({
        PeriodPriceType.class,
        OperationSchedulePlusChargeType.class
})
public class OperationScheduleType {

    @XmlElement(name = "OperationTimes")
    protected ArrayOfOperationScheduleTypeOperationTime operationTimes;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;

    /**
     * ��ȡoperationTimes���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfOperationScheduleTypeOperationTime }
     */
    public ArrayOfOperationScheduleTypeOperationTime getOperationTimes() {
        return operationTimes;
    }

    /**
     * ����operationTimes���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfOperationScheduleTypeOperationTime }
     */
    public void setOperationTimes(ArrayOfOperationScheduleTypeOperationTime value) {
        this.operationTimes = value;
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
