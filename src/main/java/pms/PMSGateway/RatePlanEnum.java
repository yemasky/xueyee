package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RatePlanEnum�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="RatePlanEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Government"/>
 *     &lt;enumeration value="Negotiated"/>
 *     &lt;enumeration value="Preferred"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "RatePlanEnum")
@XmlEnum
public enum RatePlanEnum {

    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Negotiated")
    NEGOTIATED("Negotiated"),
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    RatePlanEnum(String v) {
        value = v;
    }

    public static RatePlanEnum fromValue(String v) {
        for (RatePlanEnum c : RatePlanEnum.values()) {
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
