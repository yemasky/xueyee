package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>VideoDescriptionType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VideoDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoFormat" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoItemType">
 *                 &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CopyrightNotice" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CopyrightOwner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CopyrightStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CopyrightEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EffectiveStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EffectiveEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SourceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoDescriptionType", propOrder = {
        "videoFormat"
})
@XmlSeeAlso({
        pms.order.VideoItemsType.VideoItem.class
})
public class VideoDescriptionType {

    @XmlElement(name = "VideoFormat")
    protected List<VideoDescriptionType.VideoFormat> videoFormat;
    @XmlAttribute(name = "Category")
    protected String category;

    /**
     * Gets the value of the videoFormat property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoFormat property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoFormat().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoDescriptionType.VideoFormat }
     */
    public List<VideoDescriptionType.VideoFormat> getVideoFormat() {
        if (videoFormat == null) {
            videoFormat = new ArrayList<VideoDescriptionType.VideoFormat>();
        }
        return this.videoFormat;
    }

    /**
     * ��ȡcategory���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCategory() {
        return category;
    }

    /**
     * ����category���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategory(String value) {
        this.category = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoItemType">
     *       &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Author" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CopyrightNotice" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CopyrightOwner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CopyrightStart" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CopyrightEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EffectiveStart" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EffectiveEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SourceID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VideoFormat
            extends VideoItemType {

        @XmlAttribute(name = "ContentID")
        protected String contentID;
        @XmlAttribute(name = "Title")
        protected String title;
        @XmlAttribute(name = "Author")
        protected String author;
        @XmlAttribute(name = "CopyrightNotice")
        protected String copyrightNotice;
        @XmlAttribute(name = "CopyrightOwner")
        protected String copyrightOwner;
        @XmlAttribute(name = "CopyrightStart")
        protected String copyrightStart;
        @XmlAttribute(name = "CopyrightEnd")
        protected String copyrightEnd;
        @XmlAttribute(name = "EffectiveStart")
        protected String effectiveStart;
        @XmlAttribute(name = "EffectiveEnd")
        protected String effectiveEnd;
        @XmlAttribute(name = "ApplicableStart")
        protected String applicableStart;
        @XmlAttribute(name = "ApplicableEnd")
        protected String applicableEnd;
        @XmlAttribute(name = "RecordID")
        protected String recordID;
        @XmlAttribute(name = "SourceID")
        protected String sourceID;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * ��ȡcontentID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getContentID() {
            return contentID;
        }

        /**
         * ����contentID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setContentID(String value) {
            this.contentID = value;
        }

        /**
         * ��ȡtitle���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * ��ȡauthor���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAuthor() {
            return author;
        }

        /**
         * ����author���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAuthor(String value) {
            this.author = value;
        }

        /**
         * ��ȡcopyrightNotice���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCopyrightNotice() {
            return copyrightNotice;
        }

        /**
         * ����copyrightNotice���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCopyrightNotice(String value) {
            this.copyrightNotice = value;
        }

        /**
         * ��ȡcopyrightOwner���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCopyrightOwner() {
            return copyrightOwner;
        }

        /**
         * ����copyrightOwner���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCopyrightOwner(String value) {
            this.copyrightOwner = value;
        }

        /**
         * ��ȡcopyrightStart���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCopyrightStart() {
            return copyrightStart;
        }

        /**
         * ����copyrightStart���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCopyrightStart(String value) {
            this.copyrightStart = value;
        }

        /**
         * ��ȡcopyrightEnd���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCopyrightEnd() {
            return copyrightEnd;
        }

        /**
         * ����copyrightEnd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCopyrightEnd(String value) {
            this.copyrightEnd = value;
        }

        /**
         * ��ȡeffectiveStart���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEffectiveStart() {
            return effectiveStart;
        }

        /**
         * ����effectiveStart���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEffectiveStart(String value) {
            this.effectiveStart = value;
        }

        /**
         * ��ȡeffectiveEnd���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEffectiveEnd() {
            return effectiveEnd;
        }

        /**
         * ����effectiveEnd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEffectiveEnd(String value) {
            this.effectiveEnd = value;
        }

        /**
         * ��ȡapplicableStart���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getApplicableStart() {
            return applicableStart;
        }

        /**
         * ����applicableStart���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setApplicableStart(String value) {
            this.applicableStart = value;
        }

        /**
         * ��ȡapplicableEnd���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getApplicableEnd() {
            return applicableEnd;
        }

        /**
         * ����applicableEnd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setApplicableEnd(String value) {
            this.applicableEnd = value;
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
         * ��ȡsourceID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSourceID() {
            return sourceID;
        }

        /**
         * ����sourceID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSourceID(String value) {
            this.sourceID = value;
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

}
