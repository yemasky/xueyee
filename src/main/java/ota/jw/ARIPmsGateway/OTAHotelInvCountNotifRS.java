
package ota.jw.ARIPmsGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MessageAcknowledgementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Inventories" type="{http://www.opentravel.org/OTA/2003/05}InvCountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inventories"
})
@XmlRootElement(name = "OTA_HotelInvCountNotifRS")
public class OTAHotelInvCountNotifRS
    extends MessageAcknowledgementType
{

    @XmlElement(name = "Inventories")
    protected InvCountType inventories;

    /**
     * 获取inventories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InvCountType }
     *     
     */
    public InvCountType getInventories() {
        return inventories;
    }

    /**
     * 设置inventories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InvCountType }
     *     
     */
    public void setInventories(InvCountType value) {
        this.inventories = value;
    }

}
