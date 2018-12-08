package pms.order;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CabinType�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="CabinType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cockpit"/>
 *     &lt;enumeration value="Suite"/>
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="PremiumBusiness"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="PremiumEconomy"/>
 *     &lt;enumeration value="Economy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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

    public static CabinType fromValue(String v) {
        for (CabinType c : CabinType.values()) {
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
