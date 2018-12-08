package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>RateAmountMessageType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RateAmountMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusApplicationControl" type="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType" minOccurs="0"/>
 *         &lt;element name="Rates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRateAmountMessageTypeRate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LocatorID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateAmountMessageType", propOrder = {
        "statusApplicationControl",
        "rates"
})
@XmlSeeAlso({
        pms.PMSGateway.OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage.class,
        pms.PMSGateway.OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage.class
})
public class RateAmountMessageType {

    @XmlElement(name = "StatusApplicationControl")
    protected StatusApplicationControlType statusApplicationControl;
    @XmlElement(name = "Rates")
    protected ArrayOfRateAmountMessageTypeRate rates;
    @XmlAttribute(name = "LocatorID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger locatorID;

    /**
     * ��ȡstatusApplicationControl���Ե�ֵ��
     *
     * @return possible object is
     * {@link StatusApplicationControlType }
     */
    public StatusApplicationControlType getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * ����statusApplicationControl���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link StatusApplicationControlType }
     */
    public void setStatusApplicationControl(StatusApplicationControlType value) {
        this.statusApplicationControl = value;
    }

    /**
     * ��ȡrates���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRateAmountMessageTypeRate }
     */
    public ArrayOfRateAmountMessageTypeRate getRates() {
        return rates;
    }

    /**
     * ����rates���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRateAmountMessageTypeRate }
     */
    public void setRates(ArrayOfRateAmountMessageTypeRate value) {
        this.rates = value;
    }

    /**
     * ��ȡlocatorID���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLocatorID() {
        return locatorID;
    }

    /**
     * ����locatorID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLocatorID(BigInteger value) {
        this.locatorID = value;
    }

}
