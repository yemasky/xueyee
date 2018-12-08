package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DescriptionType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="DescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RefDirectionTo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionType")
public class DescriptionType
        extends ParagraphType {

    @XmlAttribute(name = "Location")
    protected Boolean location;
    @XmlAttribute(name = "RefDirectionTo")
    protected Boolean refDirectionTo;

    /**
     * ��ȡlocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setLocation(Boolean value) {
        this.location = value;
    }

    /**
     * ��ȡrefDirectionTo���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRefDirectionTo() {
        return refDirectionTo;
    }

    /**
     * ����refDirectionTo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRefDirectionTo(Boolean value) {
        this.refDirectionTo = value;
    }

}
