
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TicketType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TicketType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="eTicket"/&gt;
 *     &lt;enumeration value="Paper"/&gt;
 *     &lt;enumeration value="MCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TicketType")
@XmlEnum
public enum TicketType {

    @XmlEnumValue("eTicket")
    E_TICKET("eTicket"),
    @XmlEnumValue("Paper")
    PAPER("Paper"),
    MCO("MCO");
    private final String value;

    TicketType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketType fromValue(String v) {
        for (TicketType c: TicketType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
