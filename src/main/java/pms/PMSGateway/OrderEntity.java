package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OrderEntity complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OrderEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtaOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PmsConfirmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefuseMsg" type="{http://www.opentravel.org/OTA/2003/05}RefuseMessage" minOccurs="0"/>
 *         &lt;element name="InterFaceSendID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderEntity", propOrder = {
        "otaOrderNo",
        "pmsConfirmNo",
        "orderStatus",
        "refuseMsg",
        "interFaceSendID",
        "errorsOrWarningsOrSuccess"
})
public class OrderEntity {

    @XmlElement(name = "OtaOrderNo")
    protected String otaOrderNo;
    @XmlElement(name = "PmsConfirmNo")
    protected String pmsConfirmNo;
    @XmlElement(name = "OrderStatus")
    protected String orderStatus;
    @XmlElement(name = "RefuseMsg")
    protected RefuseMessage refuseMsg;
    @XmlElement(name = "InterFaceSendID")
    protected String interFaceSendID;
    @XmlElements({
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "Warnings", type = WarningsType.class),
            @XmlElement(name = "Success", type = SuccessType.class)
    })
    protected List<Object> errorsOrWarningsOrSuccess;

    /**
     * ��ȡotaOrderNo���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOtaOrderNo() {
        return otaOrderNo;
    }

    /**
     * ����otaOrderNo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOtaOrderNo(String value) {
        this.otaOrderNo = value;
    }

    /**
     * ��ȡpmsConfirmNo���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPmsConfirmNo() {
        return pmsConfirmNo;
    }

    /**
     * ����pmsConfirmNo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPmsConfirmNo(String value) {
        this.pmsConfirmNo = value;
    }

    /**
     * ��ȡorderStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * ����orderStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * ��ȡrefuseMsg���Ե�ֵ��
     *
     * @return possible object is
     * {@link RefuseMessage }
     */
    public RefuseMessage getRefuseMsg() {
        return refuseMsg;
    }

    /**
     * ����refuseMsg���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RefuseMessage }
     */
    public void setRefuseMsg(RefuseMessage value) {
        this.refuseMsg = value;
    }

    /**
     * ��ȡinterFaceSendID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInterFaceSendID() {
        return interFaceSendID;
    }

    /**
     * ����interFaceSendID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInterFaceSendID(String value) {
        this.interFaceSendID = value;
    }

    /**
     * Gets the value of the errorsOrWarningsOrSuccess property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorsOrWarningsOrSuccess property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorsOrWarningsOrSuccess().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorsType }
     * {@link WarningsType }
     * {@link SuccessType }
     */
    public List<Object> getErrorsOrWarningsOrSuccess() {
        if (errorsOrWarningsOrSuccess == null) {
            errorsOrWarningsOrSuccess = new ArrayList<Object>();
        }
        return this.errorsOrWarningsOrSuccess;
    }

}
