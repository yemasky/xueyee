
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CategoryLocationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CategoryLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Inside"/&gt;
 *     &lt;enumeration value="Outside"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
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

    public String value() {
        return value;
    }

    public static CategoryLocationType fromValue(String v) {
        for (CategoryLocationType c: CategoryLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
