package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ImageDescriptionType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ImageDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageFormat" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ImageItemType">
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
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                 &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FileSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="DimensionCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IsOriginalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
 *                 &lt;attribute name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "ImageDescriptionType", propOrder = {
        "imageFormat",
        "description"
})
@XmlSeeAlso({
        pms.PMSGateway.ImageItemsType.ImageItem.class
})
public class ImageDescriptionType {

    @XmlElement(name = "ImageFormat")
    protected List<ImageDescriptionType.ImageFormat> imageFormat;
    @XmlElement(name = "Description")
    protected List<ImageDescriptionType.Description> description;
    @XmlAttribute(name = "Category")
    protected String category;

    /**
     * Gets the value of the imageFormat property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageFormat property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageFormat().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageDescriptionType.ImageFormat }
     */
    public List<ImageDescriptionType.ImageFormat> getImageFormat() {
        if (imageFormat == null) {
            imageFormat = new ArrayList<ImageDescriptionType.ImageFormat>();
        }
        return this.imageFormat;
    }

    /**
     * Gets the value of the description property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageDescriptionType.Description }
     */
    public List<ImageDescriptionType.Description> getDescription() {
        if (description == null) {
            description = new ArrayList<ImageDescriptionType.Description>();
        }
        return this.description;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
     *       &lt;attribute name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Description
            extends FormattedTextTextType {

        @XmlAttribute(name = "Caption")
        protected String caption;

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

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ImageItemType">
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
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
     *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FileSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="DimensionCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IsOriginalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ImageFormat
            extends ImageItemType {

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
        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "Format")
        protected String format;
        @XmlAttribute(name = "FileName")
        protected String fileName;
        @XmlAttribute(name = "FileSize")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger fileSize;
        @XmlAttribute(name = "DimensionCategory")
        protected String dimensionCategory;
        @XmlAttribute(name = "IsOriginalIndicator")
        protected Boolean isOriginalIndicator;

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
         * ��ȡformat���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getFormat() {
            return format;
        }

        /**
         * ����format���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setFormat(String value) {
            this.format = value;
        }

        /**
         * ��ȡfileName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * ����fileName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * ��ȡfileSize���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getFileSize() {
            return fileSize;
        }

        /**
         * ����fileSize���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setFileSize(BigInteger value) {
            this.fileSize = value;
        }

        /**
         * ��ȡdimensionCategory���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDimensionCategory() {
            return dimensionCategory;
        }

        /**
         * ����dimensionCategory���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDimensionCategory(String value) {
            this.dimensionCategory = value;
        }

        /**
         * ��ȡisOriginalIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isIsOriginalIndicator() {
            return isOriginalIndicator;
        }

        /**
         * ����isOriginalIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setIsOriginalIndicator(Boolean value) {
            this.isOriginalIndicator = value;
        }

    }

}
