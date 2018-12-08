
package ota.jw.ARIPmsGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StationType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *       &lt;attribute name="IsStaffedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TicketPrinterInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SST_MachineInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationType")
public class StationType
    extends LocationType
{

    @XmlAttribute(name = "IsStaffedInd")
    protected Boolean isStaffedInd;
    @XmlAttribute(name = "TicketPrinterInd")
    protected Boolean ticketPrinterInd;
    @XmlAttribute(name = "SST_MachineInd")
    protected Boolean sstMachineInd;
    @XmlAttribute(name = "TimeZoneOffset")
    protected String timeZoneOffset;

    /**
     * 获取isStaffedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStaffedInd() {
        return isStaffedInd;
    }

    /**
     * 设置isStaffedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStaffedInd(Boolean value) {
        this.isStaffedInd = value;
    }

    /**
     * 获取ticketPrinterInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketPrinterInd() {
        return ticketPrinterInd;
    }

    /**
     * 设置ticketPrinterInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketPrinterInd(Boolean value) {
        this.ticketPrinterInd = value;
    }

    /**
     * 获取sstMachineInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSSTMachineInd() {
        return sstMachineInd;
    }

    /**
     * 设置sstMachineInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSSTMachineInd(Boolean value) {
        this.sstMachineInd = value;
    }

    /**
     * 获取timeZoneOffset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * 设置timeZoneOffset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneOffset(String value) {
        this.timeZoneOffset = value;
    }

}
