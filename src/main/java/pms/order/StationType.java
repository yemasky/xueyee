package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StationType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="StationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *       &lt;attribute name="IsStaffedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TicketPrinterInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SST_MachineInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationType")
public class StationType
        extends LocationType {

    @XmlAttribute(name = "IsStaffedInd")
    protected Boolean isStaffedInd;
    @XmlAttribute(name = "TicketPrinterInd")
    protected Boolean ticketPrinterInd;
    @XmlAttribute(name = "SST_MachineInd")
    protected Boolean sstMachineInd;
    @XmlAttribute(name = "TimeZoneOffset")
    protected String timeZoneOffset;

    /**
     * ��ȡisStaffedInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsStaffedInd() {
        return isStaffedInd;
    }

    /**
     * ����isStaffedInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsStaffedInd(Boolean value) {
        this.isStaffedInd = value;
    }

    /**
     * ��ȡticketPrinterInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTicketPrinterInd() {
        return ticketPrinterInd;
    }

    /**
     * ����ticketPrinterInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTicketPrinterInd(Boolean value) {
        this.ticketPrinterInd = value;
    }

    /**
     * ��ȡsstMachineInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSSTMachineInd() {
        return sstMachineInd;
    }

    /**
     * ����sstMachineInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSSTMachineInd(Boolean value) {
        this.sstMachineInd = value;
    }

    /**
     * ��ȡtimeZoneOffset���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * ����timeZoneOffset���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTimeZoneOffset(String value) {
        this.timeZoneOffset = value;
    }

}
