
package ota.jw.PMSGateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AmenityOptionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AmenityOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Originator" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OptionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DeliveryLocation"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="diningroom"/&gt;
 *             &lt;enumeration value="cabin"/&gt;
 *             &lt;enumeration value="person"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ModifiableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmenityOptionType", propOrder = {
    "originator",
    "message"
})
public class AmenityOptionType {

    @XmlElement(name = "Originator")
    protected PersonNameType originator;
    @XmlElement(name = "Message")
    protected ParagraphType message;
    @XmlAttribute(name = "OptionCode")
    protected String optionCode;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "DeliveryDate")
    protected String deliveryDate;
    @XmlAttribute(name = "DeliveryLocation")
    protected String deliveryLocation;
    @XmlAttribute(name = "ModifiableIndicator")
    protected Boolean modifiableIndicator;

    /**
     * 获取originator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getOriginator() {
        return originator;
    }

    /**
     * 设置originator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setOriginator(PersonNameType value) {
        this.originator = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setMessage(ParagraphType value) {
        this.message = value;
    }

    /**
     * 获取optionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionCode() {
        return optionCode;
    }

    /**
     * 设置optionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionCode(String value) {
        this.optionCode = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * 获取deliveryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * 设置deliveryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDate(String value) {
        this.deliveryDate = value;
    }

    /**
     * 获取deliveryLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * 设置deliveryLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryLocation(String value) {
        this.deliveryLocation = value;
    }

    /**
     * 获取modifiableIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifiableIndicator() {
        return modifiableIndicator;
    }

    /**
     * 设置modifiableIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifiableIndicator(Boolean value) {
        this.modifiableIndicator = value;
    }

}
