
package ota.jw.PMSGateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateAmountMessageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RateAmountMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusApplicationControl" type="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType" minOccurs="0"/&gt;
 *         &lt;element name="Rates" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRateAmountMessageTypeRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LocatorID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateAmountMessageType", propOrder = {
    "statusApplicationControl",
    "rates"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage.class,
    ota.jw.PMSGateway.OTAPrdNotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage.class
})
public class RateAmountMessageType {

    @XmlElement(name = "StatusApplicationControl")
    protected StatusApplicationControlType statusApplicationControl;
    @XmlElement(name = "Rates")
    protected ArrayOfRateAmountMessageTypeRate rates;
    @XmlAttribute(name = "LocatorID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger locatorID;

    /**
     * 获取statusApplicationControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public StatusApplicationControlType getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * 设置statusApplicationControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public void setStatusApplicationControl(StatusApplicationControlType value) {
        this.statusApplicationControl = value;
    }

    /**
     * 获取rates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateAmountMessageTypeRate }
     *     
     */
    public ArrayOfRateAmountMessageTypeRate getRates() {
        return rates;
    }

    /**
     * 设置rates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateAmountMessageTypeRate }
     *     
     */
    public void setRates(ArrayOfRateAmountMessageTypeRate value) {
        this.rates = value;
    }

    /**
     * 获取locatorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocatorID() {
        return locatorID;
    }

    /**
     * 设置locatorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocatorID(BigInteger value) {
        this.locatorID = value;
    }

}
