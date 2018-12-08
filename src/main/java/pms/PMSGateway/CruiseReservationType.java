package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CruiseReservationType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CruiseReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SailingInfo" type="{http://www.opentravel.org/OTA/2003/05}SailingCategoryInfoType" minOccurs="0"/>
 *         &lt;element name="SailingProfile" type="{http://www.opentravel.org/OTA/2003/05}CruiseProfileType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReservationInfo" type="{http://www.opentravel.org/OTA/2003/05}CruiseGuestInfoType" minOccurs="0"/>
 *         &lt;element name="PaymentsDue" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCruiseReservationTypePaymentDue" minOccurs="0"/>
 *         &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseReservationType", propOrder = {
        "sailingInfo",
        "sailingProfile",
        "reservationInfo",
        "paymentsDue",
        "information"
})
public class CruiseReservationType {

    @XmlElement(name = "SailingInfo")
    protected SailingCategoryInfoType sailingInfo;
    @XmlElement(name = "SailingProfile")
    protected List<CruiseProfileType> sailingProfile;
    @XmlElement(name = "ReservationInfo")
    protected CruiseGuestInfoType reservationInfo;
    @XmlElement(name = "PaymentsDue")
    protected ArrayOfCruiseReservationTypePaymentDue paymentsDue;
    @XmlElement(name = "Information")
    protected List<ParagraphType> information;

    /**
     * ��ȡsailingInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link SailingCategoryInfoType }
     */
    public SailingCategoryInfoType getSailingInfo() {
        return sailingInfo;
    }

    /**
     * ����sailingInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SailingCategoryInfoType }
     */
    public void setSailingInfo(SailingCategoryInfoType value) {
        this.sailingInfo = value;
    }

    /**
     * Gets the value of the sailingProfile property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sailingProfile property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSailingProfile().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseProfileType }
     */
    public List<CruiseProfileType> getSailingProfile() {
        if (sailingProfile == null) {
            sailingProfile = new ArrayList<CruiseProfileType>();
        }
        return this.sailingProfile;
    }

    /**
     * ��ȡreservationInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link CruiseGuestInfoType }
     */
    public CruiseGuestInfoType getReservationInfo() {
        return reservationInfo;
    }

    /**
     * ����reservationInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CruiseGuestInfoType }
     */
    public void setReservationInfo(CruiseGuestInfoType value) {
        this.reservationInfo = value;
    }

    /**
     * ��ȡpaymentsDue���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfCruiseReservationTypePaymentDue }
     */
    public ArrayOfCruiseReservationTypePaymentDue getPaymentsDue() {
        return paymentsDue;
    }

    /**
     * ����paymentsDue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfCruiseReservationTypePaymentDue }
     */
    public void setPaymentsDue(ArrayOfCruiseReservationTypePaymentDue value) {
        this.paymentsDue = value;
    }

    /**
     * Gets the value of the information property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     */
    public List<ParagraphType> getInformation() {
        if (information == null) {
            information = new ArrayList<ParagraphType>();
        }
        return this.information;
    }

}
