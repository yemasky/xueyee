
package ota.jw.GenericSeamlessGateway;

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
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelResRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DonationInformation" type="{http://www.opentravel.org/OTA/2003/05}DonationType" minOccurs="0"/&gt;
 *         &lt;element name="RebatePrograms" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRebateType" minOccurs="0"/&gt;
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
    "donationInformation",
    "rebatePrograms"
})
@XmlRootElement(name = "OTA_HotelResRQ")
public class OTAHotelResRQ
    extends HotelResRequestType
{

    @XmlElement(name = "DonationInformation")
    protected DonationType donationInformation;
    @XmlElement(name = "RebatePrograms")
    protected ArrayOfRebateType rebatePrograms;

    /**
     * 获取donationInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DonationType }
     *     
     */
    public DonationType getDonationInformation() {
        return donationInformation;
    }

    /**
     * 设置donationInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DonationType }
     *     
     */
    public void setDonationInformation(DonationType value) {
        this.donationInformation = value;
    }

    /**
     * 获取rebatePrograms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRebateType }
     *     
     */
    public ArrayOfRebateType getRebatePrograms() {
        return rebatePrograms;
    }

    /**
     * 设置rebatePrograms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRebateType }
     *     
     */
    public void setRebatePrograms(ArrayOfRebateType value) {
        this.rebatePrograms = value;
    }

}
