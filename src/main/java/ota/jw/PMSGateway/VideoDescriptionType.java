
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VideoDescriptionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VideoDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoFormat" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoItemType"&gt;
 *                 &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Author" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CopyrightNotice" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CopyrightOwner" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CopyrightStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CopyrightEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="EffectiveStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="EffectiveEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SourceID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoDescriptionType", propOrder = {
    "videoFormat"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.VideoItemsType.VideoItem.class
})
public class VideoDescriptionType {

    @XmlElement(name = "VideoFormat")
    protected List<VideoDescriptionType.VideoFormat> videoFormat;
    @XmlAttribute(name = "Category")
    protected String category;

    /**
     * Gets the value of the videoFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoDescriptionType.VideoFormat }
     * 
     * 
     */
    public List<VideoDescriptionType.VideoFormat> getVideoFormat() {
        if (videoFormat == null) {
            videoFormat = new ArrayList<VideoDescriptionType.VideoFormat>();
        }
        return this.videoFormat;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoItemType"&gt;
     *       &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Author" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CopyrightNotice" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CopyrightOwner" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CopyrightStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CopyrightEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="EffectiveStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="EffectiveEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SourceID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VideoFormat
        extends VideoItemType
    {

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
         * 获取contentID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContentID() {
            return contentID;
        }

        /**
         * 设置contentID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContentID(String value) {
            this.contentID = value;
        }

        /**
         * 获取title属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * 设置title属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * 获取author属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthor() {
            return author;
        }

        /**
         * 设置author属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthor(String value) {
            this.author = value;
        }

        /**
         * 获取copyrightNotice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCopyrightNotice() {
            return copyrightNotice;
        }

        /**
         * 设置copyrightNotice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCopyrightNotice(String value) {
            this.copyrightNotice = value;
        }

        /**
         * 获取copyrightOwner属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCopyrightOwner() {
            return copyrightOwner;
        }

        /**
         * 设置copyrightOwner属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCopyrightOwner(String value) {
            this.copyrightOwner = value;
        }

        /**
         * 获取copyrightStart属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCopyrightStart() {
            return copyrightStart;
        }

        /**
         * 设置copyrightStart属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCopyrightStart(String value) {
            this.copyrightStart = value;
        }

        /**
         * 获取copyrightEnd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCopyrightEnd() {
            return copyrightEnd;
        }

        /**
         * 设置copyrightEnd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCopyrightEnd(String value) {
            this.copyrightEnd = value;
        }

        /**
         * 获取effectiveStart属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveStart() {
            return effectiveStart;
        }

        /**
         * 设置effectiveStart属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveStart(String value) {
            this.effectiveStart = value;
        }

        /**
         * 获取effectiveEnd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveEnd() {
            return effectiveEnd;
        }

        /**
         * 设置effectiveEnd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveEnd(String value) {
            this.effectiveEnd = value;
        }

        /**
         * 获取applicableStart属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicableStart() {
            return applicableStart;
        }

        /**
         * 设置applicableStart属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicableStart(String value) {
            this.applicableStart = value;
        }

        /**
         * 获取applicableEnd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicableEnd() {
            return applicableEnd;
        }

        /**
         * 设置applicableEnd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicableEnd(String value) {
            this.applicableEnd = value;
        }

        /**
         * 获取recordID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecordID() {
            return recordID;
        }

        /**
         * 设置recordID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordID(String value) {
            this.recordID = value;
        }

        /**
         * 获取sourceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceID() {
            return sourceID;
        }

        /**
         * 设置sourceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceID(String value) {
            this.sourceID = value;
        }

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

    }

}
