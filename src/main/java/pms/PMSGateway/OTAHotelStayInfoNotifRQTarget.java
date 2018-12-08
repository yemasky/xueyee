package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OTA_HotelStayInfoNotifRQTarget�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="OTA_HotelStayInfoNotifRQTarget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Test"/>
 *     &lt;enumeration value="Production"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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

    public static OTAHotelStayInfoNotifRQTarget fromValue(String v) {
        for (OTAHotelStayInfoNotifRQTarget c : OTAHotelStayInfoNotifRQTarget.values()) {
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
