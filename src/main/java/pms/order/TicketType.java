package pms.order;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TicketType�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="TicketType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="eTicket"/>
 *     &lt;enumeration value="Paper"/>
 *     &lt;enumeration value="MCO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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

    public static TicketType fromValue(String v) {
        for (TicketType c : TicketType.values()) {
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