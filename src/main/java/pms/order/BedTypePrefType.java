package pms.order;

import javax.xml.bind.annotation.*;


/**
 * <p>BedTypePrefType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="BedTypePrefType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *       &lt;attribute name="BedType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BedTypePrefType", propOrder = {
        "value"
})
public class BedTypePrefType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "BedType")
    protected String bedType;

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
     * ��ȡbedType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * ����bedType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBedType(String value) {
        this.bedType = value;
    }

}
