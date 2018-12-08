
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehiclePeriodUnitNameType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="VehiclePeriodUnitNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RentalPeriod"/&gt;
 *     &lt;enumeration value="Year"/&gt;
 *     &lt;enumeration value="Month"/&gt;
 *     &lt;enumeration value="Week"/&gt;
 *     &lt;enumeration value="Day"/&gt;
 *     &lt;enumeration value="Hour"/&gt;
 *     &lt;enumeration value="Weekend"/&gt;
 *     &lt;enumeration value="ExtraMonth"/&gt;
 *     &lt;enumeration value="Bundle"/&gt;
 *     &lt;enumeration value="Package"/&gt;
 *     &lt;enumeration value="ExtraDay"/&gt;
 *     &lt;enumeration value="ExtraHour"/&gt;
 *     &lt;enumeration value="ExtraWeek"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
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

    public String value() {
        return value;
    }

    public static VehiclePeriodUnitNameType fromValue(String v) {
        for (VehiclePeriodUnitNameType c: VehiclePeriodUnitNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
