package pms.order;

import javax.xml.bind.annotation.*;


/**
 * <p>UniqueID_Type complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="UniqueID_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Instance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueID_Type", propOrder = {
        "companyName"
})
@XmlSeeAlso({
        pms.order.OTAHotelAvailRS.RoomStays.RoomStay.Reference.class,
        pms.order.ArrayOfRoomStaysTypeRoomStay.RoomStay.Reference.class,
        pms.order.ProfileType.UserID.class,
        ReservationIDType.class,
        pms.order.SourceType.RequestorID.class
})
public class UniqueIDType {

    @XmlElement(name = "CompanyName")
    protected CompanyNameType companyName;
    @XmlAttribute(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Instance")
    protected String instance;
    @XmlAttribute(name = "ID_Context")
    protected String idContext;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * ��ȡcompanyName���Ե�ֵ��
     *
     * @return possible object is
     * {@link CompanyNameType }
     */
    public CompanyNameType getCompanyName() {
        return companyName;
    }

    /**
     * ����companyName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CompanyNameType }
     */
    public void setCompanyName(CompanyNameType value) {
        this.companyName = value;
    }

    /**
     * ��ȡurl���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getURL() {
        return url;
    }

    /**
     * ����url���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setURL(String value) {
        this.url = value;
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

    /**
     * ��ȡinstance���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInstance() {
        return instance;
    }

    /**
     * ����instance���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    /**
     * ��ȡidContext���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getIDContext() {
        return idContext;
    }

    /**
     * ����idContext���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIDContext(String value) {
        this.idContext = value;
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

}
