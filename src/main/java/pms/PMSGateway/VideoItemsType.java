package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>VideoItemsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VideoItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoItem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoDescriptionType">
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                 &lt;attribute name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoItemsType", propOrder = {
        "videoItem"
})
public class VideoItemsType {

    @XmlElement(name = "VideoItem")
    protected List<VideoItemsType.VideoItem> videoItem;

    /**
     * Gets the value of the videoItem property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoItem property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoItem().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoItemsType.VideoItem }
     */
    public List<VideoItemsType.VideoItem> getVideoItem() {
        if (videoItem == null) {
            videoItem = new ArrayList<VideoItemsType.VideoItem>();
        }
        return this.videoItem;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoDescriptionType">
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
     *       &lt;attribute name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VideoItem
            extends VideoDescriptionType {

        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "Caption")
        protected String caption;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "Version")
        protected String version;
        @XmlAttribute(name = "CreateDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDateTime;
        @XmlAttribute(name = "CreatorID")
        protected String creatorID;
        @XmlAttribute(name = "LastModifyDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastModifyDateTime;
        @XmlAttribute(name = "LastModifierID")
        protected String lastModifierID;
        @XmlAttribute(name = "PurgeDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar purgeDate;

        /**
         * ��ȡlanguage���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLanguage() {
            return language;
        }

        /**
         * ����language���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * ��ȡcaption���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCaption() {
            return caption;
        }

        /**
         * ����caption���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCaption(String value) {
            this.caption = value;
        }

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

        /**
         * ��ȡcreateDateTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getCreateDateTime() {
            return createDateTime;
        }

        /**
         * ����createDateTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setCreateDateTime(XMLGregorianCalendar value) {
            this.createDateTime = value;
        }

        /**
         * ��ȡcreatorID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCreatorID() {
            return creatorID;
        }

        /**
         * ����creatorID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCreatorID(String value) {
            this.creatorID = value;
        }

        /**
         * ��ȡlastModifyDateTime���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getLastModifyDateTime() {
            return lastModifyDateTime;
        }

        /**
         * ����lastModifyDateTime���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setLastModifyDateTime(XMLGregorianCalendar value) {
            this.lastModifyDateTime = value;
        }

        /**
         * ��ȡlastModifierID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLastModifierID() {
            return lastModifierID;
        }

        /**
         * ����lastModifierID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLastModifierID(String value) {
            this.lastModifierID = value;
        }

        /**
         * ��ȡpurgeDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getPurgeDate() {
            return purgeDate;
        }

        /**
         * ����purgeDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setPurgeDate(XMLGregorianCalendar value) {
            this.purgeDate = value;
        }

    }

}
