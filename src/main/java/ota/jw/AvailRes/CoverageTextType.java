
package ota.jw.AvailRes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CoverageTextType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CoverageTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Supplement"/&gt;
 *     &lt;enumeration value="Description"/&gt;
 *     &lt;enumeration value="Limits"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
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

    public String value() {
        return value;
    }

    public static CoverageTextType fromValue(String v) {
        for (CoverageTextType c: CoverageTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
