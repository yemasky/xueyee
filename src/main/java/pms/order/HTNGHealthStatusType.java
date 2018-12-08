package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HTNG_HealthStatusType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HTNG_HealthStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OldValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTNG_HealthStatusType", namespace = "http://htng.org/2014B")
public class HTNGHealthStatusType {

    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "OldValue")
    protected String oldValue;
    @XmlAttribute(name = "Reason")
    protected String reason;

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
     * ��ȡoldValue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * ����oldValue���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOldValue(String value) {
        this.oldValue = value;
    }

    /**
     * ��ȡreason���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getReason() {
        return reason;
    }

    /**
     * ����reason���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
