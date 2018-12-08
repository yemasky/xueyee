
package ota.jw.PMSGateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SpecialServiceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SpecialServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AssociationType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Cabin"/&gt;
 *             &lt;enumeration value="Passenger"/&gt;
 *             &lt;enumeration value="DualOccupancy"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NbrOfYears" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialServiceType", propOrder = {
    "comment"
})
public class SpecialServiceType {

    @XmlElement(name = "Comment")
    protected ParagraphType comment;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "CodeName")
    protected String codeName;
    @XmlAttribute(name = "CodeDetail")
    protected String codeDetail;
    @XmlAttribute(name = "AssociationType")
    protected String associationType;
    @XmlAttribute(name = "Date")
    protected String date;
    @XmlAttribute(name = "NbrOfYears")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nbrOfYears;

    /**
     * 获取comment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getComment() {
        return comment;
    }

    /**
     * 设置comment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setComment(ParagraphType value) {
        this.comment = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * 获取codeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * 设置codeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeName(String value) {
        this.codeName = value;
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
     * 获取associationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationType() {
        return associationType;
    }

    /**
     * 设置associationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationType(String value) {
        this.associationType = value;
    }

    /**
     * 获取date属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置date属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * 获取nbrOfYears属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNbrOfYears() {
        return nbrOfYears;
    }

    /**
     * 设置nbrOfYears属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNbrOfYears(BigInteger value) {
        this.nbrOfYears = value;
    }

}
