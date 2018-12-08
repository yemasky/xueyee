
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ReservationID_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReservationID_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
 *       &lt;attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="BookedDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OfferDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SyncDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationID_Type")
public class ReservationIDType
    extends UniqueIDType
{

    @XmlAttribute(name = "StatusCode")
    protected String statusCode;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "BookedDate")
    protected String bookedDate;
    @XmlAttribute(name = "OfferDate")
    protected String offerDate;
    @XmlAttribute(name = "SyncDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar syncDateTime;

    /**
     * 获取statusCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 设置statusCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
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
     * 获取bookedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookedDate() {
        return bookedDate;
    }

    /**
     * 设置bookedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookedDate(String value) {
        this.bookedDate = value;
    }

    /**
     * 获取offerDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDate() {
        return offerDate;
    }

    /**
     * 设置offerDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDate(String value) {
        this.offerDate = value;
    }

    /**
     * 获取syncDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSyncDateTime() {
        return syncDateTime;
    }

    /**
     * 设置syncDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSyncDateTime(XMLGregorianCalendar value) {
        this.syncDateTime = value;
    }

}
