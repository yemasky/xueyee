package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DistanceUnitNameType�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="DistanceUnitNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mile"/>
 *     &lt;enumeration value="Km"/>
 *     &lt;enumeration value="Block"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "DistanceUnitNameType")
@XmlEnum
public enum DistanceUnitNameType {

    @XmlEnumValue("Mile")
    MILE("Mile"),
    @XmlEnumValue("Km")
    KM("Km"),
    @XmlEnumValue("Block")
    BLOCK("Block");
    private final String value;

    DistanceUnitNameType(String v) {
        value = v;
    }

    public static DistanceUnitNameType fromValue(String v) {
        for (DistanceUnitNameType c : DistanceUnitNameType.values()) {
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
