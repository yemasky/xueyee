package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>StateProvType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="StateProvType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateProvType", propOrder = {
        "value"
})
public class StateProvType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "StateCode")
    protected String stateCode;

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
     * ��ȡstateCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * ����stateCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

}
