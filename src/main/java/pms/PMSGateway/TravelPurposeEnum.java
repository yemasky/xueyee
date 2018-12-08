package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TravelPurposeEnum�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="TravelPurposeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSignificant"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Conference"/>
 *     &lt;enumeration value="Consortiums"/>
 *     &lt;enumeration value="HomeVisiting"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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

    public static TravelPurposeEnum fromValue(String v) {
        for (TravelPurposeEnum c : TravelPurposeEnum.values()) {
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
