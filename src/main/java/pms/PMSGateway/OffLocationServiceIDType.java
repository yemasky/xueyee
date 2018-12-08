package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OffLocationServiceID_Type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="OffLocationServiceID_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CustPickUp"/>
 *     &lt;enumeration value="VehDelivery"/>
 *     &lt;enumeration value="CustDropOff"/>
 *     &lt;enumeration value="VehCollection"/>
 *     &lt;enumeration value="Exchange"/>
 *     &lt;enumeration value="RepairLocation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "OffLocationServiceID_Type")
@XmlEnum
public enum OffLocationServiceIDType {

    @XmlEnumValue("CustPickUp")
    CUST_PICK_UP("CustPickUp"),
    @XmlEnumValue("VehDelivery")
    VEH_DELIVERY("VehDelivery"),
    @XmlEnumValue("CustDropOff")
    CUST_DROP_OFF("CustDropOff"),
    @XmlEnumValue("VehCollection")
    VEH_COLLECTION("VehCollection"),
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),
    @XmlEnumValue("RepairLocation")
    REPAIR_LOCATION("RepairLocation");
    private final String value;

    OffLocationServiceIDType(String v) {
        value = v;
    }

    public static OffLocationServiceIDType fromValue(String v) {
        for (OffLocationServiceIDType c : OffLocationServiceIDType.values()) {
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
