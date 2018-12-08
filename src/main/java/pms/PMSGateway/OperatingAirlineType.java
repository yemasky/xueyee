package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OperatingAirlineType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OperatingAirlineType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingAirlineType")
public class OperatingAirlineType
        extends CompanyNameType {

    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "ResBookDesigCode")
    protected String resBookDesigCode;

    /**
     * ��ȡflightNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * ����flightNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * ��ȡresBookDesigCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     * ����resBookDesigCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResBookDesigCode(String value) {
        this.resBookDesigCode = value;
    }

}
