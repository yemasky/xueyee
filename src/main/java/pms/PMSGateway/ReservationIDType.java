package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ReservationID_Type complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ReservationID_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *       &lt;attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="BookedDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OfferDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SyncDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationID_Type")
public class ReservationIDType
        extends UniqueIDType {

    @XmlAttribute(name = "StatusCode")
    protected String statusCode;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "BookedDate")
    protected String bookedDate;
    @XmlAttribute(name = "OfferDate")
    protected String offerDate;
    @XmlAttribute(name = "SyncDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar syncDateTime;

    /**
     * ��ȡstatusCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * ����statusCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * ��ȡlastModifyDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * ����lastModifyDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * ��ȡbookedDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBookedDate() {
        return bookedDate;
    }

    /**
     * ����bookedDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBookedDate(String value) {
        this.bookedDate = value;
    }

    /**
     * ��ȡofferDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOfferDate() {
        return offerDate;
    }

    /**
     * ����offerDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOfferDate(String value) {
        this.offerDate = value;
    }

    /**
     * ��ȡsyncDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getSyncDateTime() {
        return syncDateTime;
    }

    /**
     * ����syncDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setSyncDateTime(XMLGregorianCalendar value) {
        this.syncDateTime = value;
    }

}
