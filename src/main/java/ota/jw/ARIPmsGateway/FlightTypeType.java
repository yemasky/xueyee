
package ota.jw.ARIPmsGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FlightTypeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FlightTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Nonstop"/&gt;
 *     &lt;enumeration value="Direct"/&gt;
 *     &lt;enumeration value="Connection"/&gt;
 *     &lt;enumeration value="SingleConnection"/&gt;
 *     &lt;enumeration value="DoubleConnection"/&gt;
 *     &lt;enumeration value="OneStopOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlightTypeType")
@XmlEnum
public enum FlightTypeType {

    @XmlEnumValue("Nonstop")
    NONSTOP("Nonstop"),
    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("Connection")
    CONNECTION("Connection"),
    @XmlEnumValue("SingleConnection")
    SINGLE_CONNECTION("SingleConnection"),
    @XmlEnumValue("DoubleConnection")
    DOUBLE_CONNECTION("DoubleConnection"),
    @XmlEnumValue("OneStopOnly")
    ONE_STOP_ONLY("OneStopOnly");
    private final String value;

    FlightTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightTypeType fromValue(String v) {
        for (FlightTypeType c: FlightTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
