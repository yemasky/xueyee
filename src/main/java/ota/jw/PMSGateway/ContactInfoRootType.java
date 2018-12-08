
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ContactInfoRootType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ContactInfoRootType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType"&gt;
 *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ContactProfileID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ContactProfileType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoRootType")
public class ContactInfoRootType
    extends ContactInfoType
{

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
     * 获取contactProfileID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactProfileID() {
        return contactProfileID;
    }

    /**
     * 设置contactProfileID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactProfileID(String value) {
        this.contactProfileID = value;
    }

    /**
     * 获取contactProfileType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactProfileType() {
        return contactProfileType;
    }

    /**
     * 设置contactProfileType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactProfileType(String value) {
        this.contactProfileType = value;
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

}
