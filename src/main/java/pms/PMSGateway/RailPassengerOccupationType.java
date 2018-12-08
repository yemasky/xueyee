package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>RailPassengerOccupationType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RailPassengerOccupationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>RailPassengerOccupationEnum">
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailPassengerOccupationType", propOrder = {
        "value"
})
public class RailPassengerOccupationType {

    @XmlValue
    protected RailPassengerOccupationEnum value;
    @XmlAttribute(name = "extension")
    protected String extension;

    /**
     * ��ȡvalue���Ե�ֵ��
     *
     * @return possible object is
     * {@link RailPassengerOccupationEnum }
     */
    public RailPassengerOccupationEnum getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RailPassengerOccupationEnum }
     */
    public void setValue(RailPassengerOccupationEnum value) {
        this.value = value;
    }

    /**
     * ��ȡextension���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtension() {
        return extension;
    }

    /**
     * ����extension���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}
