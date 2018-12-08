package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>TransportationsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="TransportationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transportations" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfTransportationTypeTransportation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationsType", propOrder = {
        "transportations"
})
@XmlSeeAlso({
        RelativePositionType.class
})
public class TransportationsType {

    @XmlElement(name = "Transportations")
    protected ArrayOfTransportationTypeTransportation transportations;

    /**
     * ��ȡtransportations���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfTransportationTypeTransportation }
     */
    public ArrayOfTransportationTypeTransportation getTransportations() {
        return transportations;
    }

    /**
     * ����transportations���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfTransportationTypeTransportation }
     */
    public void setTransportations(ArrayOfTransportationTypeTransportation value) {
        this.transportations = value;
    }

}
