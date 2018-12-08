package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RebateType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RebateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentInformation" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ParticipationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TripPurpose">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Business"/>
 *             &lt;enumeration value="BusinessAndPleasure"/>
 *             &lt;enumeration value="Pleasure"/>
 *             &lt;enumeration value="Unknown"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TripPurposeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebateType", propOrder = {
        "paymentInformation"
})
public class RebateType {

    @XmlElement(name = "PaymentInformation")
    protected List<PaymentCardType> paymentInformation;
    @XmlAttribute(name = "ParticipationInd")
    protected Boolean participationInd;
    @XmlAttribute(name = "ProgramName")
    protected String programName;
    @XmlAttribute(name = "TripPurpose")
    protected String tripPurpose;
    @XmlAttribute(name = "TripPurposeRequiredInd")
    protected Boolean tripPurposeRequiredInd;

    /**
     * Gets the value of the paymentInformation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInformation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInformation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardType }
     */
    public List<PaymentCardType> getPaymentInformation() {
        if (paymentInformation == null) {
            paymentInformation = new ArrayList<PaymentCardType>();
        }
        return this.paymentInformation;
    }

    /**
     * ��ȡparticipationInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isParticipationInd() {
        return participationInd;
    }

    /**
     * ����participationInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setParticipationInd(Boolean value) {
        this.participationInd = value;
    }

    /**
     * ��ȡprogramName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * ����programName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * ��ȡtripPurpose���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTripPurpose() {
        return tripPurpose;
    }

    /**
     * ����tripPurpose���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTripPurpose(String value) {
        this.tripPurpose = value;
    }

    /**
     * ��ȡtripPurposeRequiredInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTripPurposeRequiredInd() {
        return tripPurposeRequiredInd;
    }

    /**
     * ����tripPurposeRequiredInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTripPurposeRequiredInd(Boolean value) {
        this.tripPurposeRequiredInd = value;
    }

}
