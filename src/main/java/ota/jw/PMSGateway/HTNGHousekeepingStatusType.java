
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HTNG_HousekeepingStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HTNG_HousekeepingStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEEDS_INSPECTION"/&gt;
 *     &lt;enumeration value="OCCUPIED_CLEAN"/&gt;
 *     &lt;enumeration value="OCCUPIED_DIRTY"/&gt;
 *     &lt;enumeration value="OFF_MARKET"/&gt;
 *     &lt;enumeration value="OUT_OF_ORDER"/&gt;
 *     &lt;enumeration value="PICKUP"/&gt;
 *     &lt;enumeration value="VACANT_CLEAN"/&gt;
 *     &lt;enumeration value="VACANT_DIRTY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HTNG_HousekeepingStatusType", namespace = "http://htng.org/2014B")
@XmlEnum
public enum HTNGHousekeepingStatusType {

    NEEDS_INSPECTION,
    OCCUPIED_CLEAN,
    OCCUPIED_DIRTY,
    OFF_MARKET,
    OUT_OF_ORDER,
    PICKUP,
    VACANT_CLEAN,
    VACANT_DIRTY;

    public String value() {
        return name();
    }

    public static HTNGHousekeepingStatusType fromValue(String v) {
        return valueOf(v);
    }

}
