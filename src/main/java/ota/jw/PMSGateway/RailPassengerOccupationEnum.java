
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RailPassengerOccupationEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RailPassengerOccupationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSignificant"/&gt;
 *     &lt;enumeration value="RailEmployee"/&gt;
 *     &lt;enumeration value="GovernmentEmployee"/&gt;
 *     &lt;enumeration value="Farmer"/&gt;
 *     &lt;enumeration value="Military"/&gt;
 *     &lt;enumeration value="Journalist"/&gt;
 *     &lt;enumeration value="Student"/&gt;
 *     &lt;enumeration value="VIP"/&gt;
 *     &lt;enumeration value="Other_"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RailPassengerOccupationEnum")
@XmlEnum
public enum RailPassengerOccupationEnum {

    @XmlEnumValue("NotSignificant")
    NOT_SIGNIFICANT("NotSignificant"),
    @XmlEnumValue("RailEmployee")
    RAIL_EMPLOYEE("RailEmployee"),
    @XmlEnumValue("GovernmentEmployee")
    GOVERNMENT_EMPLOYEE("GovernmentEmployee"),
    @XmlEnumValue("Farmer")
    FARMER("Farmer"),
    @XmlEnumValue("Military")
    MILITARY("Military"),
    @XmlEnumValue("Journalist")
    JOURNALIST("Journalist"),
    @XmlEnumValue("Student")
    STUDENT("Student"),
    VIP("VIP"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    RailPassengerOccupationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RailPassengerOccupationEnum fromValue(String v) {
        for (RailPassengerOccupationEnum c: RailPassengerOccupationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
