package pms.order;

import javax.xml.bind.annotation.*;


/**
 * <p>StreetNmbrType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="StreetNmbrType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PO_Box" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreetNmbrType", propOrder = {
        "value"
})
@XmlSeeAlso({
        pms.order.AddressType.StreetNmbr.class
})
public class StreetNmbrType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PO_Box")
    protected String poBox;

    /**
     * ��ȡvalue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * ��ȡpoBox���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPOBox() {
        return poBox;
    }

    /**
     * ����poBox���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPOBox(String value) {
        this.poBox = value;
    }

}
