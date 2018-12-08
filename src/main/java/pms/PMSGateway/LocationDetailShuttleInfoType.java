package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LocationDetailShuttleInfoType�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="LocationDetailShuttleInfoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Transportation"/>
 *     &lt;enumeration value="Frequency"/>
 *     &lt;enumeration value="PickupInfo"/>
 *     &lt;enumeration value="Distance"/>
 *     &lt;enumeration value="ElapsedTime"/>
 *     &lt;enumeration value="Fee"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *     &lt;enumeration value="Hours"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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

    public static LocationDetailShuttleInfoType fromValue(String v) {
        for (LocationDetailShuttleInfoType c : LocationDetailShuttleInfoType.values()) {
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
