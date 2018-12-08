
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WrittenConfInstType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WrittenConfInstType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplementalData" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LanguageID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConfirmInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrittenConfInstType", propOrder = {
    "supplementalData",
    "email"
})
public class WrittenConfInstType {

    @XmlElement(name = "SupplementalData")
    protected ParagraphType supplementalData;
    @XmlElement(name = "Email")
    protected EmailType email;
    @XmlAttribute(name = "LanguageID")
    protected String languageID;
    @XmlAttribute(name = "AddresseeName")
    protected String addresseeName;
    @XmlAttribute(name = "Address")
    protected String address;
    @XmlAttribute(name = "Telephone")
    protected String telephone;
    @XmlAttribute(name = "ConfirmInd")
    protected Boolean confirmInd;

    /**
     * 获取supplementalData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getSupplementalData() {
        return supplementalData;
    }

    /**
     * 设置supplementalData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setSupplementalData(ParagraphType value) {
        this.supplementalData = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEmail(EmailType value) {
        this.email = value;
    }

    /**
     * 获取languageID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * 设置languageID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * 获取addresseeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseeName() {
        return addresseeName;
    }

    /**
     * 设置addresseeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseeName(String value) {
        this.addresseeName = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取telephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置telephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * 获取confirmInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmInd() {
        return confirmInd;
    }

    /**
     * 设置confirmInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmInd(Boolean value) {
        this.confirmInd = value;
    }

}
