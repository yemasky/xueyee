
package ota.jw.GenericSeamlessGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransactionActionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Book"/&gt;
 *     &lt;enumeration value="Quote"/&gt;
 *     &lt;enumeration value="Hold"/&gt;
 *     &lt;enumeration value="Initiate"/&gt;
 *     &lt;enumeration value="Ignore"/&gt;
 *     &lt;enumeration value="Modify"/&gt;
 *     &lt;enumeration value="Commit"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="CommitOverrideEdits"/&gt;
 *     &lt;enumeration value="VerifyPrice"/&gt;
 *     &lt;enumeration value="Ticket"/&gt;
 *     &lt;enumeration value="FlashLive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionActionType")
@XmlEnum
public enum TransactionActionType {

    @XmlEnumValue("Book")
    BOOK("Book"),
    @XmlEnumValue("Quote")
    QUOTE("Quote"),
    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("Initiate")
    INITIATE("Initiate"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),
    @XmlEnumValue("Commit")
    COMMIT("Commit"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("CommitOverrideEdits")
    COMMIT_OVERRIDE_EDITS("CommitOverrideEdits"),
    @XmlEnumValue("VerifyPrice")
    VERIFY_PRICE("VerifyPrice"),
    @XmlEnumValue("Ticket")
    TICKET("Ticket"),
    @XmlEnumValue("FlashLive")
    FLASH_LIVE("FlashLive");
    private final String value;

    TransactionActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionActionType fromValue(String v) {
        for (TransactionActionType c: TransactionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
