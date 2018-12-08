
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DistanceUnitNameType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DistanceUnitNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Mile"/&gt;
 *     &lt;enumeration value="Km"/&gt;
 *     &lt;enumeration value="Block"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
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

    public String value() {
        return value;
    }

    public static DistanceUnitNameType fromValue(String v) {
        for (DistanceUnitNameType c: DistanceUnitNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
