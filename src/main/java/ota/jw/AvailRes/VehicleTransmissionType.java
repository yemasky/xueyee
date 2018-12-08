
package ota.jw.AvailRes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleTransmissionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleTransmissionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Automatic"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleTransmissionType")
@XmlEnum
public enum VehicleTransmissionType {

    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    VehicleTransmissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleTransmissionType fromValue(String v) {
        for (VehicleTransmissionType c: VehicleTransmissionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
