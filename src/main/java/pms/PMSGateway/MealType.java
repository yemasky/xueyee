package pms.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MealType�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;simpleType name="MealType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVML"/>
 *     &lt;enumeration value="BBML"/>
 *     &lt;enumeration value="BLML"/>
 *     &lt;enumeration value="CHML"/>
 *     &lt;enumeration value="DBML"/>
 *     &lt;enumeration value="FPML"/>
 *     &lt;enumeration value="GFML"/>
 *     &lt;enumeration value="HFML"/>
 *     &lt;enumeration value="HNML"/>
 *     &lt;enumeration value="KSML"/>
 *     &lt;enumeration value="LCML"/>
 *     &lt;enumeration value="LFML"/>
 *     &lt;enumeration value="LPML"/>
 *     &lt;enumeration value="LSML"/>
 *     &lt;enumeration value="MOML"/>
 *     &lt;enumeration value="NLML"/>
 *     &lt;enumeration value="ORML"/>
 *     &lt;enumeration value="PRML"/>
 *     &lt;enumeration value="RVML"/>
 *     &lt;enumeration value="SFML"/>
 *     &lt;enumeration value="SPML"/>
 *     &lt;enumeration value="VGML"/>
 *     &lt;enumeration value="VLML"/>
 *     &lt;enumeration value="RGML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "MealType")
@XmlEnum
public enum MealType {

    AVML,
    BBML,
    BLML,
    CHML,
    DBML,
    FPML,
    GFML,
    HFML,
    HNML,
    KSML,
    LCML,
    LFML,
    LPML,
    LSML,
    MOML,
    NLML,
    ORML,
    PRML,
    RVML,
    SFML,
    SPML,
    VGML,
    VLML,
    RGML;

    public static MealType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
