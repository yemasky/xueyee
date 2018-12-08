package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RefuseMessage complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RefuseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Msg" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefuseMessage")
public class RefuseMessage {

    @XmlAttribute(name = "Msg")
    protected String msg;
    @XmlAttribute(name = "Code")
    protected String code;

    /**
     * ��ȡmsg���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsg() {
        return msg;
    }

    /**
     * ����msg���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsg(String value) {
        this.msg = value;
    }

    /**
     * ��ȡcode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCode() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCode(String value) {
        this.code = value;
    }

}
