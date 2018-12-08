package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>OrderApplyPaymentRequest complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OrderApplyPaymentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HtlConfirmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ArriveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckedOutStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderApplyPaymentRequest", propOrder = {
        "htlConfirmNo",
        "totalCost",
        "arriveTime",
        "departureTime",
        "roomNo",
        "clientName",
        "checkedOutStatus"
})
public class OrderApplyPaymentRequest {

    @XmlElement(name = "HtlConfirmNo")
    protected String htlConfirmNo;
    @XmlElement(name = "TotalCost", required = true)
    protected BigDecimal totalCost;
    @XmlElement(name = "ArriveTime")
    protected String arriveTime;
    @XmlElement(name = "DepartureTime")
    protected String departureTime;
    @XmlElement(name = "RoomNo")
    protected String roomNo;
    @XmlElement(name = "ClientName")
    protected String clientName;
    @XmlElement(name = "CheckedOutStatus")
    protected String checkedOutStatus;

    /**
     * ��ȡhtlConfirmNo���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getHtlConfirmNo() {
        return htlConfirmNo;
    }

    /**
     * ����htlConfirmNo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHtlConfirmNo(String value) {
        this.htlConfirmNo = value;
    }

    /**
     * ��ȡtotalCost���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * ����totalCost���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setTotalCost(BigDecimal value) {
        this.totalCost = value;
    }

    /**
     * ��ȡarriveTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getArriveTime() {
        return arriveTime;
    }

    /**
     * ����arriveTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArriveTime(String value) {
        this.arriveTime = value;
    }

    /**
     * ��ȡdepartureTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * ����departureTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * ��ȡroomNo���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * ����roomNo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomNo(String value) {
        this.roomNo = value;
    }

    /**
     * ��ȡclientName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * ����clientName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * ��ȡcheckedOutStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCheckedOutStatus() {
        return checkedOutStatus;
    }

    /**
     * ����checkedOutStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCheckedOutStatus(String value) {
        this.checkedOutStatus = value;
    }

}
