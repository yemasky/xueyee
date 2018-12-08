
package ota.jw.ARIPmsGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ImageItemsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ImageItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImageItem" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ImageDescriptionType"&gt;
 *                 &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageItemsType", propOrder = {
    "imageItem"
})
public class ImageItemsType {

    @XmlElement(name = "ImageItem")
    protected List<ImageItemsType.ImageItem> imageItem;

    /**
     * Gets the value of the imageItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageItemsType.ImageItem }
     * 
     * 
     */
    public List<ImageItemsType.ImageItem> getImageItem() {
        if (imageItem == null) {
            imageItem = new ArrayList<ImageItemsType.ImageItem>();
        }
        return this.imageItem;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ImageDescriptionType"&gt;
     *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class ImageItem
        extends ImageDescriptionType
    {

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
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "Version")
        protected String version;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * 获取createDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreateDateTime() {
            return createDateTime;
        }

        /**
         * 设置createDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreateDateTime(XMLGregorianCalendar value) {
            this.createDateTime = value;
        }

        /**
         * 获取creatorID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatorID() {
            return creatorID;
        }

        /**
         * 设置creatorID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatorID(String value) {
            this.creatorID = value;
        }

        /**
         * 获取lastModifyDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastModifyDateTime() {
            return lastModifyDateTime;
        }

        /**
         * 设置lastModifyDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastModifyDateTime(XMLGregorianCalendar value) {
            this.lastModifyDateTime = value;
        }

        /**
         * 获取lastModifierID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModifierID() {
            return lastModifierID;
        }

        /**
         * 设置lastModifierID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModifierID(String value) {
            this.lastModifierID = value;
        }

        /**
         * 获取purgeDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPurgeDate() {
            return purgeDate;
        }

        /**
         * 设置purgeDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPurgeDate(XMLGregorianCalendar value) {
            this.purgeDate = value;
        }

        /**
         * 获取removal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * 设置removal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * 获取version属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * 设置version属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
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
