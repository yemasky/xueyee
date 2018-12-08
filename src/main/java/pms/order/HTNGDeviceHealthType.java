package pms.order;

import javax.xml.bind.annotation.*;


/**
 * <p>HTNG_DeviceHealthType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HTNG_DeviceHealthType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentHealthStatus" type="{http://htng.org/2014B}HTNG_HealthStatusType" minOccurs="0"/>
 *         &lt;element name="PriorHealthStatus" type="{http://htng.org/2014B}HTNG_HealthStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FriendlyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTNG_DeviceHealthType", namespace = "http://htng.org/2014B", propOrder = {
        "currentHealthStatus",
        "priorHealthStatus"
})
public class HTNGDeviceHealthType {

    @XmlElement(name = "CurrentHealthStatus")
    protected HTNGHealthStatusType currentHealthStatus;
    @XmlElement(name = "PriorHealthStatus")
    protected HTNGHealthStatusType priorHealthStatus;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "FriendlyName")
    protected String friendlyName;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "Class")
    protected String clazz;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * ��ȡcurrentHealthStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link HTNGHealthStatusType }
     */
    public HTNGHealthStatusType getCurrentHealthStatus() {
        return currentHealthStatus;
    }

    /**
     * ����currentHealthStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HTNGHealthStatusType }
     */
    public void setCurrentHealthStatus(HTNGHealthStatusType value) {
        this.currentHealthStatus = value;
    }

    /**
     * ��ȡpriorHealthStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link HTNGHealthStatusType }
     */
    public HTNGHealthStatusType getPriorHealthStatus() {
        return priorHealthStatus;
    }

    /**
     * ����priorHealthStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link HTNGHealthStatusType }
     */
    public void setPriorHealthStatus(HTNGHealthStatusType value) {
        this.priorHealthStatus = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * ��ȡfriendlyName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * ����friendlyName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡclazz���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * ����clazz���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

}
