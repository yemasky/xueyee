
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TravelPurposeEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TravelPurposeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSignificant"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="Conference"/&gt;
 *     &lt;enumeration value="Consortiums"/&gt;
 *     &lt;enumeration value="HomeVisiting"/&gt;
 *     &lt;enumeration value="Other_"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelPurposeEnum")
@XmlEnum
public enum TravelPurposeEnum {

    @XmlEnumValue("NotSignificant")
    NOT_SIGNIFICANT("NotSignificant"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Conference")
    CONFERENCE("Conference"),
    @XmlEnumValue("Consortiums")
    CONSORTIUMS("Consortiums"),
    @XmlEnumValue("HomeVisiting")
    HOME_VISITING("HomeVisiting"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    TravelPurposeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelPurposeEnum fromValue(String v) {
        for (TravelPurposeEnum c: TravelPurposeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
