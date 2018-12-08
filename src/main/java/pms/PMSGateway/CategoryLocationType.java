package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CategoryLocationType�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="CategoryLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inside"/>
 *     &lt;enumeration value="Outside"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "CategoryLocationType")
@XmlEnum
public enum CategoryLocationType {

    @XmlEnumValue("Inside")
    INSIDE("Inside"),
    @XmlEnumValue("Outside")
    OUTSIDE("Outside"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    CategoryLocationType(String v) {
        value = v;
    }

    public static CategoryLocationType fromValue(String v) {
        for (CategoryLocationType c : CategoryLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
