package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehiclePeriodUnitNameType�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="VehiclePeriodUnitNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RentalPeriod"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Weekend"/>
 *     &lt;enumeration value="ExtraMonth"/>
 *     &lt;enumeration value="Bundle"/>
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="ExtraDay"/>
 *     &lt;enumeration value="ExtraHour"/>
 *     &lt;enumeration value="ExtraWeek"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "VehiclePeriodUnitNameType")
@XmlEnum
public enum VehiclePeriodUnitNameType {

    @XmlEnumValue("RentalPeriod")
    RENTAL_PERIOD("RentalPeriod"),
    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),
    @XmlEnumValue("Weekend")
    WEEKEND("Weekend"),
    @XmlEnumValue("ExtraMonth")
    EXTRA_MONTH("ExtraMonth"),
    @XmlEnumValue("Bundle")
    BUNDLE("Bundle"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("ExtraDay")
    EXTRA_DAY("ExtraDay"),
    @XmlEnumValue("ExtraHour")
    EXTRA_HOUR("ExtraHour"),
    @XmlEnumValue("ExtraWeek")
    EXTRA_WEEK("ExtraWeek");
    private final String value;

    VehiclePeriodUnitNameType(String v) {
        value = v;
    }

    public static VehiclePeriodUnitNameType fromValue(String v) {
        for (VehiclePeriodUnitNameType c : VehiclePeriodUnitNameType.values()) {
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
