
package ota.jw.ARIPmsGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MultimediaDescriptionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultimediaDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="VideoItems" type="{http://www.opentravel.org/OTA/2003/05}VideoItemsType" minOccurs="0"/&gt;
 *           &lt;element name="ImageItems" type="{http://www.opentravel.org/OTA/2003/05}ImageItemsType" minOccurs="0"/&gt;
 *           &lt;element name="TextItems" type="{http://www.opentravel.org/OTA/2003/05}TextItemsType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 获取videoItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoItemsType }
     *     
     */
    public VideoItemsType getVideoItems() {
        return videoItems;
    }

    /**
     * 设置videoItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoItemsType }
     *     
     */
    public void setVideoItems(VideoItemsType value) {
        this.videoItems = value;
    }

    /**
     * 获取imageItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImageItemsType }
     *     
     */
    public ImageItemsType getImageItems() {
        return imageItems;
    }

    /**
     * 设置imageItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImageItemsType }
     *     
     */
    public void setImageItems(ImageItemsType value) {
        this.imageItems = value;
    }

    /**
     * 获取textItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TextItemsType }
     *     
     */
    public TextItemsType getTextItems() {
        return textItems;
    }

    /**
     * 设置textItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TextItemsType }
     *     
     */
    public void setTextItems(TextItemsType value) {
        this.textItems = value;
    }

    /**
     * 获取infoCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoCode() {
        return infoCode;
    }

    /**
     * 设置infoCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoCode(String value) {
        this.infoCode = value;
    }

    /**
     * 获取additionalDetailCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDetailCode() {
        return additionalDetailCode;
    }

    /**
     * 设置additionalDetailCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDetailCode(String value) {
        this.additionalDetailCode = value;
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

    /**
     * 获取lastUpdated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置lastUpdated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
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

}
