
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RatePlanEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RatePlanEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Government"/&gt;
 *     &lt;enumeration value="Negotiated"/&gt;
 *     &lt;enumeration value="Preferred"/&gt;
 *     &lt;enumeration value="Other_"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
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

    public String value() {
        return value;
    }

    public static RatePlanEnum fromValue(String v) {
        for (RatePlanEnum c: RatePlanEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
