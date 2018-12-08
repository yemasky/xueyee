package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CoverageDetailsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CoverageDetailsType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
 *       &lt;attribute name="CoverageTextType" use="required" type="{http://www.opentravel.org/OTA/2003/05}CoverageTextType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageDetailsType")
public class CoverageDetailsType
        extends FormattedTextTextType {

    @XmlAttribute(name = "CoverageTextType", required = true)
    protected CoverageTextType coverageTextType;

    /**
     * ��ȡcoverageTextType���Ե�ֵ��
     *
     * @return possible object is
     * {@link CoverageTextType }
     */
    public CoverageTextType getCoverageTextType() {
        return coverageTextType;
    }

    /**
     * ����coverageTextType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CoverageTextType }
     */
    public void setCoverageTextType(CoverageTextType value) {
        this.coverageTextType = value;
    }

}
