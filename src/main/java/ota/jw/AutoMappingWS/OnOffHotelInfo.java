
package ota.jw.AutoMappingWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OnOffHotelInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OnOffHotelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OnOffProductInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOnOffProductInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HotelOnlineStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HotelGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OfflineCause" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnOffHotelInfo", propOrder = {
    "onOffProductInfos"
})
public class OnOffHotelInfo {

    @XmlElement(name = "OnOffProductInfos")
    protected ArrayOfOnOffProductInfo onOffProductInfos;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelOnlineStatus")
    protected String hotelOnlineStatus;
    @XmlAttribute(name = "Channel")
    protected String channel;
    @XmlAttribute(name = "HotelGroupCode")
    protected String hotelGroupCode;
    @XmlAttribute(name = "OfflineCause")
    protected String offlineCause;

    /**
     * 获取onOffProductInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOnOffProductInfo }
     *     
     */
    public ArrayOfOnOffProductInfo getOnOffProductInfos() {
        return onOffProductInfos;
    }

    /**
     * 设置onOffProductInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOnOffProductInfo }
     *     
     */
    public void setOnOffProductInfos(ArrayOfOnOffProductInfo value) {
        this.onOffProductInfos = value;
    }

    /**
     * 获取hotelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * 设置hotelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * 获取hotelOnlineStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelOnlineStatus() {
        return hotelOnlineStatus;
    }

    /**
     * 设置hotelOnlineStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelOnlineStatus(String value) {
        this.hotelOnlineStatus = value;
    }

    /**
     * 获取channel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置channel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * 获取hotelGroupCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelGroupCode() {
        return hotelGroupCode;
    }

    /**
     * 设置hotelGroupCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelGroupCode(String value) {
        this.hotelGroupCode = value;
    }

    /**
     * 获取offlineCause属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfflineCause() {
        return offlineCause;
    }

    /**
     * 设置offlineCause属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfflineCause(String value) {
        this.offlineCause = value;
    }

}
