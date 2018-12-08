
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OTA_HotelStayInfoNotifRQTarget的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_HotelStayInfoNotifRQTarget"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Test"/&gt;
 *     &lt;enumeration value="Production"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OTA_HotelStayInfoNotifRQTarget")
@XmlEnum
public enum OTAHotelStayInfoNotifRQTarget {

    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Production")
    PRODUCTION("Production");
    private final String value;

    OTAHotelStayInfoNotifRQTarget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTAHotelStayInfoNotifRQTarget fromValue(String v) {
        for (OTAHotelStayInfoNotifRQTarget c: OTAHotelStayInfoNotifRQTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
