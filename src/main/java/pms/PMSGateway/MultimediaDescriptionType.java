package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MultimediaDescriptionType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="MultimediaDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="VideoItems" type="{http://www.opentravel.org/OTA/2003/05}VideoItemsType" minOccurs="0"/>
 *           &lt;element name="ImageItems" type="{http://www.opentravel.org/OTA/2003/05}ImageItemsType" minOccurs="0"/>
 *           &lt;element name="TextItems" type="{http://www.opentravel.org/OTA/2003/05}TextItemsType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaDescriptionType", propOrder = {
        "videoItems",
        "imageItems",
        "textItems"
})
public class MultimediaDescriptionType {

    @XmlElement(name = "VideoItems")
    protected VideoItemsType videoItems;
    @XmlElement(name = "ImageItems")
    protected ImageItemsType imageItems;
    @XmlElement(name = "TextItems")
    protected TextItemsType textItems;
    @XmlAttribute(name = "InfoCode")
    protected String infoCode;
    @XmlAttribute(name = "AdditionalDetailCode")
    protected String additionalDetailCode;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * ��ȡvideoItems���Ե�ֵ��
     *
     * @return possible object is
     * {@link VideoItemsType }
     */
    public VideoItemsType getVideoItems() {
        return videoItems;
    }

    /**
     * ����videoItems���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VideoItemsType }
     */
    public void setVideoItems(VideoItemsType value) {
        this.videoItems = value;
    }

    /**
     * ��ȡimageItems���Ե�ֵ��
     *
     * @return possible object is
     * {@link ImageItemsType }
     */
    public ImageItemsType getImageItems() {
        return imageItems;
    }

    /**
     * ����imageItems���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ImageItemsType }
     */
    public void setImageItems(ImageItemsType value) {
        this.imageItems = value;
    }

    /**
     * ��ȡtextItems���Ե�ֵ��
     *
     * @return possible object is
     * {@link TextItemsType }
     */
    public TextItemsType getTextItems() {
        return textItems;
    }

    /**
     * ����textItems���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TextItemsType }
     */
    public void setTextItems(TextItemsType value) {
        this.textItems = value;
    }

    /**
     * ��ȡinfoCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInfoCode() {
        return infoCode;
    }

    /**
     * ����infoCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInfoCode(String value) {
        this.infoCode = value;
    }

    /**
     * ��ȡadditionalDetailCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAdditionalDetailCode() {
        return additionalDetailCode;
    }

    /**
     * ����additionalDetailCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAdditionalDetailCode(String value) {
        this.additionalDetailCode = value;
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

    /**
     * ��ȡversion���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getVersion() {
        return version;
    }

    /**
     * ����version���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
