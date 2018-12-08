package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VendorMessageType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VendorMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
 *       &lt;attribute name="InfoType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorMessageType")
public class VendorMessageType
        extends FormattedTextType {

    @XmlAttribute(name = "InfoType")
    protected String infoType;

    /**
     * ��ȡinfoType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInfoType() {
        return infoType;
    }

    /**
     * ����infoType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInfoType(String value) {
        this.infoType = value;
    }

}
