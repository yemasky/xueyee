
package ota.jw.PMSGateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MeetingRoomCodeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MeetingRoomCodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/&gt;
 *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="DiscountsAvailableCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRoomCodeType", propOrder = {
    "charge",
    "multimediaDescriptions"
})
public class MeetingRoomCodeType {

    @XmlElement(name = "Charge")
    protected FeeType charge;
    @XmlElement(name = "MultimediaDescriptions")
    protected MultimediaDescriptionsType multimediaDescriptions;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "ExistsCode")
    protected String existsCode;
    @XmlAttribute(name = "CodeDetail")
    protected String codeDetail;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "DiscountsAvailableCode")
    protected String discountsAvailableCode;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * 获取charge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FeeType }
     *     
     */
    public FeeType getCharge() {
        return charge;
    }

    /**
     * 设置charge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType }
     *     
     */
    public void setCharge(FeeType value) {
        this.charge = value;
    }

    /**
     * 获取multimediaDescriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MultimediaDescriptionsType }
     *     
     */
    public MultimediaDescriptionsType getMultimediaDescriptions() {
        return multimediaDescriptions;
    }

    /**
     * 设置multimediaDescriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MultimediaDescriptionsType }
     *     
     */
    public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
        this.multimediaDescriptions = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取existsCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistsCode() {
        return existsCode;
    }

    /**
     * 设置existsCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistsCode(String value) {
        this.existsCode = value;
    }

    /**
     * 获取codeDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDetail() {
        return codeDetail;
    }

    /**
     * 设置codeDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDetail(String value) {
        this.codeDetail = value;
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
     * 获取discountsAvailableCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountsAvailableCode() {
        return discountsAvailableCode;
    }

    /**
     * 设置discountsAvailableCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountsAvailableCode(String value) {
        this.discountsAvailableCode = value;
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

}
