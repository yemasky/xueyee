package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ContactInfoRootType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ContactInfoRootType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
 *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ContactProfileID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ContactProfileType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoRootType")
public class ContactInfoRootType
        extends ContactInfoType {

    @XmlAttribute(name = "Removal")
    protected Boolean removal;
    @XmlAttribute(name = "ContactProfileID")
    protected String contactProfileID;
    @XmlAttribute(name = "ContactProfileType")
    protected String contactProfileType;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * ��ȡremoval���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRemoval() {
        return removal;
    }

    /**
     * ����removal���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRemoval(Boolean value) {
        this.removal = value;
    }

    /**
     * ��ȡcontactProfileID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getContactProfileID() {
        return contactProfileID;
    }

    /**
     * ����contactProfileID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContactProfileID(String value) {
        this.contactProfileID = value;
    }

    /**
     * ��ȡcontactProfileType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getContactProfileType() {
        return contactProfileType;
    }

    /**
     * ����contactProfileType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContactProfileType(String value) {
        this.contactProfileType = value;
    }

    /**
     * ��ȡlastUpdated���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * ����lastUpdated���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

}
