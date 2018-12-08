
package ota.jw.ARIPmsGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ParagraphType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ParagraphType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="ListItem" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;FormattedTextTextType"&gt;
 *                   &lt;attribute name="ListItem" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/&gt;
 *           &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *           &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphType", propOrder = {
    "listItemOrTextOrURL"
})
@XmlSeeAlso({
    DescriptionType.class,
    ota.jw.ARIPmsGateway.ArrayOfCommentTypeComment.Comment.class,
    ota.jw.ARIPmsGateway.ArrayOfProfileTypeComment.Comment.class
})
public class ParagraphType {

    @XmlElementRefs({
        @XmlElementRef(name = "Image", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ListItem", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Text", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URL", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> listItemOrTextOrURL;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "ParagraphNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger paragraphNumber;
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
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;

    /**
     * Gets the value of the listItemOrTextOrURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listItemOrTextOrURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListItemOrTextOrURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ParagraphType.ListItem }{@code >}
     * {@link JAXBElement }{@code <}{@link FormattedTextTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getListItemOrTextOrURL() {
        if (listItemOrTextOrURL == null) {
            listItemOrTextOrURL = new ArrayList<JAXBElement<?>>();
        }
        return this.listItemOrTextOrURL;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取paragraphNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParagraphNumber() {
        return paragraphNumber;
    }

    /**
     * 设置paragraphNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParagraphNumber(BigInteger value) {
        this.paragraphNumber = value;
    }

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
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;FormattedTextTextType"&gt;
     *       &lt;attribute name="ListItem" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ListItem
        extends FormattedTextTextType
    {

        @XmlAttribute(name = "ListItem")
        protected BigInteger listItem;

        /**
         * 获取listItem属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getListItem() {
            return listItem;
        }

        /**
         * 设置listItem属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setListItem(BigInteger value) {
            this.listItem = value;
        }

    }

}
