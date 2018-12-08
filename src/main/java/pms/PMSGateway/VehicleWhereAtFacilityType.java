package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>VehicleWhereAtFacilityType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleWhereAtFacilityType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleWhereAtFacilityType", propOrder = {
        "value"
})
public class VehicleWhereAtFacilityType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Location")
    protected String location;

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
     * ��ȡlocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
