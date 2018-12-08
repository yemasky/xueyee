package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TravelArrangerType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="TravelArrangerType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
 *       &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TravelArrangerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelArrangerType")
public class TravelArrangerType
        extends CompanyNameType {

    @XmlAttribute(name = "DefaultInd")
    protected Boolean defaultInd;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "TravelArrangerType")
    protected String travelArrangerType;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Remark")
    protected String remark;

    /**
     * ��ȡdefaultInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDefaultInd() {
        return defaultInd;
    }

    /**
     * ����defaultInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDefaultInd(Boolean value) {
        this.defaultInd = value;
    }

    /**
     * ��ȡshareSynchInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * ����shareSynchInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * ��ȡshareMarketInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * ����shareMarketInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * ��ȡtravelArrangerType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTravelArrangerType() {
        return travelArrangerType;
    }

    /**
     * ����travelArrangerType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTravelArrangerType(String value) {
        this.travelArrangerType = value;
    }

    /**
     * ��ȡrph���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRPH() {
        return rph;
    }

    /**
     * ����rph���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
