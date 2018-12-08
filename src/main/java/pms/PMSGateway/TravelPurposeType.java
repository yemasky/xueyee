package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>TravelPurposeType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="TravelPurposeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TravelPurposeEnum">
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPurposeType", propOrder = {
        "value"
})
public class TravelPurposeType {

    @XmlValue
    protected TravelPurposeEnum value;
    @XmlAttribute(name = "extension")
    protected String extension;

    /**
     * ��ȡvalue���Ե�ֵ��
     *
     * @return possible object is
     * {@link TravelPurposeEnum }
     */
    public TravelPurposeEnum getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TravelPurposeEnum }
     */
    public void setValue(TravelPurposeEnum value) {
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
