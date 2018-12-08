
package ota.jw.AvailRes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CabinType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CabinType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cockpit"/&gt;
 *     &lt;enumeration value="Suite"/&gt;
 *     &lt;enumeration value="First"/&gt;
 *     &lt;enumeration value="PremiumBusiness"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="PremiumEconomy"/&gt;
 *     &lt;enumeration value="Economy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CabinType")
@XmlEnum
public enum CabinType {

    @XmlEnumValue("Cockpit")
    COCKPIT("Cockpit"),
    @XmlEnumValue("Suite")
    SUITE("Suite"),
    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("PremiumBusiness")
    PREMIUM_BUSINESS("PremiumBusiness"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("PremiumEconomy")
    PREMIUM_ECONOMY("PremiumEconomy"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy");
    private final String value;

    CabinType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CabinType fromValue(String v) {
        for (CabinType c: CabinType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
