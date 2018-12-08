package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OTA_HotelStayInfoNotifRQTransactionStatusCode�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="OTA_HotelStayInfoNotifRQTransactionStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Start"/>
 *     &lt;enumeration value="End"/>
 *     &lt;enumeration value="Rollback"/>
 *     &lt;enumeration value="InSeries"/>
 *     &lt;enumeration value="Continuation"/>
 *     &lt;enumeration value="Subsequent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "OTA_HotelStayInfoNotifRQTransactionStatusCode")
@XmlEnum
public enum OTAHotelStayInfoNotifRQTransactionStatusCode {

    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("End")
    END("End"),
    @XmlEnumValue("Rollback")
    ROLLBACK("Rollback"),
    @XmlEnumValue("InSeries")
    IN_SERIES("InSeries"),
    @XmlEnumValue("Continuation")
    CONTINUATION("Continuation"),
    @XmlEnumValue("Subsequent")
    SUBSEQUENT("Subsequent");
    private final String value;

    OTAHotelStayInfoNotifRQTransactionStatusCode(String v) {
        value = v;
    }

    public static OTAHotelStayInfoNotifRQTransactionStatusCode fromValue(String v) {
        for (OTAHotelStayInfoNotifRQTransactionStatusCode c : OTAHotelStayInfoNotifRQTransactionStatusCode.values()) {
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
