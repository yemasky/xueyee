
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LocationDetailShuttleInfoType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailShuttleInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Transportation"/&gt;
 *     &lt;enumeration value="Frequency"/&gt;
 *     &lt;enumeration value="PickupInfo"/&gt;
 *     &lt;enumeration value="Distance"/&gt;
 *     &lt;enumeration value="ElapsedTime"/&gt;
 *     &lt;enumeration value="Fee"/&gt;
 *     &lt;enumeration value="Miscellaneous"/&gt;
 *     &lt;enumeration value="Hours"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailShuttleInfoType")
@XmlEnum
public enum LocationDetailShuttleInfoType {

    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation"),
    @XmlEnumValue("Frequency")
    FREQUENCY("Frequency"),
    @XmlEnumValue("PickupInfo")
    PICKUP_INFO("PickupInfo"),
    @XmlEnumValue("Distance")
    DISTANCE("Distance"),
    @XmlEnumValue("ElapsedTime")
    ELAPSED_TIME("ElapsedTime"),
    @XmlEnumValue("Fee")
    FEE("Fee"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous"),
    @XmlEnumValue("Hours")
    HOURS("Hours");
    private final String value;

    LocationDetailShuttleInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailShuttleInfoType fromValue(String v) {
        for (LocationDetailShuttleInfoType c: LocationDetailShuttleInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
