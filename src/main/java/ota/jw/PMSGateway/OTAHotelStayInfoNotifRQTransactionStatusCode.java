
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OTA_HotelStayInfoNotifRQTransactionStatusCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_HotelStayInfoNotifRQTransactionStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Start"/&gt;
 *     &lt;enumeration value="End"/&gt;
 *     &lt;enumeration value="Rollback"/&gt;
 *     &lt;enumeration value="InSeries"/&gt;
 *     &lt;enumeration value="Continuation"/&gt;
 *     &lt;enumeration value="Subsequent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
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

    public String value() {
        return value;
    }

    public static OTAHotelStayInfoNotifRQTransactionStatusCode fromValue(String v) {
        for (OTAHotelStayInfoNotifRQTransactionStatusCode c: OTAHotelStayInfoNotifRQTransactionStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
