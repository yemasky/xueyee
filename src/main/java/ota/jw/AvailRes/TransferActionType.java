
package ota.jw.AvailRes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransferActionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TransferActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Automatic"/&gt;
 *     &lt;enumeration value="Mandatory"/&gt;
 *     &lt;enumeration value="Selectable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferActionType")
@XmlEnum
public enum TransferActionType {

    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("Mandatory")
    MANDATORY("Mandatory"),
    @XmlEnumValue("Selectable")
    SELECTABLE("Selectable");
    private final String value;

    TransferActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferActionType fromValue(String v) {
        for (TransferActionType c: TransferActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
