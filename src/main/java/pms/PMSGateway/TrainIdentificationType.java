package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrainIdentificationType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="TrainIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrainNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkCode" type="{http://www.opentravel.org/OTA/2003/05}NetworkCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainIdentificationType", propOrder = {
        "trainNumber",
        "networkCode"
})
public class TrainIdentificationType {

    @XmlElement(name = "TrainNumber")
    protected String trainNumber;
    @XmlElement(name = "NetworkCode")
    protected NetworkCodeType networkCode;

    /**
     * ��ȡtrainNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * ����trainNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * ��ȡnetworkCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link NetworkCodeType }
     */
    public NetworkCodeType getNetworkCode() {
        return networkCode;
    }

    /**
     * ����networkCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link NetworkCodeType }
     */
    public void setNetworkCode(NetworkCodeType value) {
        this.networkCode = value;
    }

}
