
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EquipmentRestrictionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentRestrictionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OneWayOnly"/&gt;
 *     &lt;enumeration value="RoundTripOnly"/&gt;
 *     &lt;enumeration value="AnyReservation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentRestrictionType")
@XmlEnum
public enum EquipmentRestrictionType {

    @XmlEnumValue("OneWayOnly")
    ONE_WAY_ONLY("OneWayOnly"),
    @XmlEnumValue("RoundTripOnly")
    ROUND_TRIP_ONLY("RoundTripOnly"),
    @XmlEnumValue("AnyReservation")
    ANY_RESERVATION("AnyReservation");
    private final String value;

    EquipmentRestrictionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentRestrictionType fromValue(String v) {
        for (EquipmentRestrictionType c: EquipmentRestrictionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
