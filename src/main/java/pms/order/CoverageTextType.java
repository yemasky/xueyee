package pms.order;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CoverageTextType�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="CoverageTextType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Supplement"/>
 *     &lt;enumeration value="Description"/>
 *     &lt;enumeration value="Limits"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "CoverageTextType")
@XmlEnum
public enum CoverageTextType {

    @XmlEnumValue("Supplement")
    SUPPLEMENT("Supplement"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("Limits")
    LIMITS("Limits");
    private final String value;

    CoverageTextType(String v) {
        value = v;
    }

    public static CoverageTextType fromValue(String v) {
        for (CoverageTextType c : CoverageTextType.values()) {
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
