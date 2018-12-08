package pms.order;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AmountDeterminationType�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="AmountDeterminationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inclusive"/>
 *     &lt;enumeration value="Exclusive"/>
 *     &lt;enumeration value="Cumulative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "AmountDeterminationType")
@XmlEnum
public enum AmountDeterminationType {

    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive"),
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("Cumulative")
    CUMULATIVE("Cumulative");
    private final String value;

    AmountDeterminationType(String v) {
        value = v;
    }

    public static AmountDeterminationType fromValue(String v) {
        for (AmountDeterminationType c : AmountDeterminationType.values()) {
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
