package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RailPassengerOccupationEnum�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="RailPassengerOccupationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSignificant"/>
 *     &lt;enumeration value="RailEmployee"/>
 *     &lt;enumeration value="GovernmentEmployee"/>
 *     &lt;enumeration value="Farmer"/>
 *     &lt;enumeration value="Military"/>
 *     &lt;enumeration value="Journalist"/>
 *     &lt;enumeration value="Student"/>
 *     &lt;enumeration value="VIP"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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

    public static RailPassengerOccupationEnum fromValue(String v) {
        for (RailPassengerOccupationEnum c : RailPassengerOccupationEnum.values()) {
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
