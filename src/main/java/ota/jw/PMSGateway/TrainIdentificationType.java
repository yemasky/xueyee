
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrainIdentificationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrainIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrainNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkCode" type="{http://www.opentravel.org/OTA/2003/05}NetworkCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainIdentificationType", propOrder = {
    "trainNumber",
    "networkCode"
})
public class TrainIdentificationType {

    @XmlElement(name = "TrainNumber")
    protected String trainNumber;
    @XmlElement(name = "NetworkCode")
    protected NetworkCodeType networkCode;

    /**
     * 获取trainNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * 设置trainNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * 获取networkCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkCodeType }
     *     
     */
    public NetworkCodeType getNetworkCode() {
        return networkCode;
    }

    /**
     * 设置networkCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCodeType }
     *     
     */
    public void setNetworkCode(NetworkCodeType value) {
        this.networkCode = value;
    }

}
