package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EquipmentTypePref complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="EquipmentTypePref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>EquipmentType">
 *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *       &lt;attribute name="WideBody" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentTypePref")
public class EquipmentTypePref
        extends EquipmentType {

    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "WideBody")
    protected Boolean wideBody;

    /**
     * ��ȡpreferLevel���Ե�ֵ��
     *
     * @return possible object is
     * {@link PreferLevelType }
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * ����preferLevel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PreferLevelType }
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    /**
     * ��ȡwideBody���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isWideBody() {
        return wideBody;
    }

    /**
     * ����wideBody���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setWideBody(Boolean value) {
        this.wideBody = value;
    }

}
