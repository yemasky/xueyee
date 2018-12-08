
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OffLocationServiceID_Type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OffLocationServiceID_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CustPickUp"/&gt;
 *     &lt;enumeration value="VehDelivery"/&gt;
 *     &lt;enumeration value="CustDropOff"/&gt;
 *     &lt;enumeration value="VehCollection"/&gt;
 *     &lt;enumeration value="Exchange"/&gt;
 *     &lt;enumeration value="RepairLocation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
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

    public String value() {
        return value;
    }

    public static OffLocationServiceIDType fromValue(String v) {
        for (OffLocationServiceIDType c: OffLocationServiceIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
