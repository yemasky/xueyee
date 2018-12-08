package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HTNG_HousekeepingStatusType�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="HTNG_HousekeepingStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEEDS_INSPECTION"/>
 *     &lt;enumeration value="OCCUPIED_CLEAN"/>
 *     &lt;enumeration value="OCCUPIED_DIRTY"/>
 *     &lt;enumeration value="OFF_MARKET"/>
 *     &lt;enumeration value="OUT_OF_ORDER"/>
 *     &lt;enumeration value="PICKUP"/>
 *     &lt;enumeration value="VACANT_CLEAN"/>
 *     &lt;enumeration value="VACANT_DIRTY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "HTNG_HousekeepingStatusType", namespace = "http://htng.org/2014B")
@XmlEnum
public enum HTNGHousekeepingStatusType {

    NEEDS_INSPECTION,
    OCCUPIED_CLEAN,
    OCCUPIED_DIRTY,
    OFF_MARKET,
    OUT_OF_ORDER,
    PICKUP,
    VACANT_CLEAN,
    VACANT_DIRTY;

    public static HTNGHousekeepingStatusType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
