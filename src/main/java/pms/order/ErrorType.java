package pms.order;

import javax.xml.bind.annotation.*;


/**
 * <p>ErrorType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ErrorType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DocURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NodeList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType")
public class ErrorType        extends FreeTextType {

    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ShortText")
    protected String shortText;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "DocURL")
    @XmlSchemaType(name = "anyURI")
    protected String docURL;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "RecordID")
    protected String recordID;
    @XmlAttribute(name = "NodeList")
    protected String nodeList;

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
     * ��ȡshortText���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShortText() {
        return shortText;
    }

    /**
     * ����shortText���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShortText(String value) {
        this.shortText = value;
    }

    /**
     * ��ȡcode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCode() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * ��ȡdocURL���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocURL() {
        return docURL;
    }

    /**
     * ����docURL���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocURL(String value) {
        this.docURL = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * ��ȡtag���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTag() {
        return tag;
    }

    /**
     * ����tag���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * ��ȡrecordID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * ����recordID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRecordID(String value) {
        this.recordID = value;
    }

    /**
     * ��ȡnodeList���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getNodeList() {
        return nodeList;
    }

    /**
     * ����nodeList���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNodeList(String value) {
        this.nodeList = value;
    }

}
