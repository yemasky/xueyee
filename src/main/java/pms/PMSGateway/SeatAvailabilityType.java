package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>SeatAvailabilityType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="SeatAvailabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Charges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAvailabilityType", propOrder = {
        "charges"
})
public class SeatAvailabilityType {

    @XmlElement(name = "Charges")
    protected ArrayOfFeeType charges;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * ��ȡcharges���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfFeeType }
     */
    public ArrayOfFeeType getCharges() {
        return charges;
    }

    /**
     * ����charges���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfFeeType }
     */
    public void setCharges(ArrayOfFeeType value) {
        this.charges = value;
    }

    /**
     * ��ȡuri���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getURI() {
        return uri;
    }

    /**
     * ����uri���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setURI(String value) {
        this.uri = value;
    }

}
