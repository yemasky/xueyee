
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MealType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MealType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVML"/&gt;
 *     &lt;enumeration value="BBML"/&gt;
 *     &lt;enumeration value="BLML"/&gt;
 *     &lt;enumeration value="CHML"/&gt;
 *     &lt;enumeration value="DBML"/&gt;
 *     &lt;enumeration value="FPML"/&gt;
 *     &lt;enumeration value="GFML"/&gt;
 *     &lt;enumeration value="HFML"/&gt;
 *     &lt;enumeration value="HNML"/&gt;
 *     &lt;enumeration value="KSML"/&gt;
 *     &lt;enumeration value="LCML"/&gt;
 *     &lt;enumeration value="LFML"/&gt;
 *     &lt;enumeration value="LPML"/&gt;
 *     &lt;enumeration value="LSML"/&gt;
 *     &lt;enumeration value="MOML"/&gt;
 *     &lt;enumeration value="NLML"/&gt;
 *     &lt;enumeration value="ORML"/&gt;
 *     &lt;enumeration value="PRML"/&gt;
 *     &lt;enumeration value="RVML"/&gt;
 *     &lt;enumeration value="SFML"/&gt;
 *     &lt;enumeration value="SPML"/&gt;
 *     &lt;enumeration value="VGML"/&gt;
 *     &lt;enumeration value="VLML"/&gt;
 *     &lt;enumeration value="RGML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
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

    public String value() {
        return name();
    }

    public static MealType fromValue(String v) {
        return valueOf(v);
    }

}
