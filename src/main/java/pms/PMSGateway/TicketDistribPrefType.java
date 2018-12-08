package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;


/**
 * <p>TicketDistribPrefType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="TicketDistribPrefType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *       &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TicketTime" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketDistribPrefType", propOrder = {
        "value"
})
public class TicketDistribPrefType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "DistribType")
    protected String distribType;
    @XmlAttribute(name = "TicketTime")
    protected Duration ticketTime;
    @XmlAttribute(name = "Remark")
    protected String remark;

    /**
     * ��ȡvalue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * ��ȡpreferLevel���Ե�ֵ��
     *
     * @return possible object is
     * {@link PreferLevelType }
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * ����preferLevel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PreferLevelType }
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    /**
     * ��ȡdistribType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDistribType() {
        return distribType;
    }

    /**
     * ����distribType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDistribType(String value) {
        this.distribType = value;
    }

    /**
     * ��ȡticketTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getTicketTime() {
        return ticketTime;
    }

    /**
     * ����ticketTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setTicketTime(Duration value) {
        this.ticketTime = value;
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
