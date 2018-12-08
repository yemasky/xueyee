package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>EquipmentType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="EquipmentType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChangeofGauge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentType", propOrder = {
        "value"
})
@XmlSeeAlso({
        EquipmentTypePref.class
})
public class EquipmentType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "AirEquipType")
    protected String airEquipType;
    @XmlAttribute(name = "ChangeofGauge")
    protected Boolean changeofGauge;

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
     * ��ȡairEquipType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAirEquipType() {
        return airEquipType;
    }

    /**
     * ����airEquipType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAirEquipType(String value) {
        this.airEquipType = value;
    }

    /**
     * ��ȡchangeofGauge���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isChangeofGauge() {
        return changeofGauge;
    }

    /**
     * ����changeofGauge���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setChangeofGauge(Boolean value) {
        this.changeofGauge = value;
    }

}
