package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleChargePurposeType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleChargePurposeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType">
 *       &lt;attribute name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleChargePurposeType")
public class VehicleChargePurposeType
        extends VehicleChargeType {

    @XmlAttribute(name = "Purpose")
    protected String purpose;
    @XmlAttribute(name = "RequiredInd")
    protected Boolean requiredInd;

    /**
     * ��ȡpurpose���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * ����purpose���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * ��ȡrequiredInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRequiredInd() {
        return requiredInd;
    }

    /**
     * ����requiredInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRequiredInd(Boolean value) {
        this.requiredInd = value;
    }

}
