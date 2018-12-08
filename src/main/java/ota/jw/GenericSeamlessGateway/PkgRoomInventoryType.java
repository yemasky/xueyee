
package ota.jw.GenericSeamlessGateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PkgRoomInventoryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PkgRoomInventoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplementCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MaxAdults" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="CotQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="FreeChildFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgRoomInventoryType", propOrder = {
    "supplementCharges"
})
public class PkgRoomInventoryType
    extends RoomStayCandidateType
{

    @XmlElement(name = "SupplementCharges")
    protected ArrayOfFeeType supplementCharges;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "MinOccupancy")
    protected BigInteger minOccupancy;
    @XmlAttribute(name = "MaxOccupancy")
    protected BigInteger maxOccupancy;
    @XmlAttribute(name = "MaxAdults")
    protected BigInteger maxAdults;
    @XmlAttribute(name = "CotQuantity")
    protected BigInteger cotQuantity;
    @XmlAttribute(name = "FreeChildFlag")
    protected Boolean freeChildFlag;

    /**
     * 获取supplementCharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeeType }
     *     
     */
    public ArrayOfFeeType getSupplementCharges() {
        return supplementCharges;
    }

    /**
     * 设置supplementCharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeeType }
     *     
     */
    public void setSupplementCharges(ArrayOfFeeType value) {
        this.supplementCharges = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取minOccupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinOccupancy() {
        return minOccupancy;
    }

    /**
     * 设置minOccupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinOccupancy(BigInteger value) {
        this.minOccupancy = value;
    }

    /**
     * 获取maxOccupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * 设置maxOccupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOccupancy(BigInteger value) {
        this.maxOccupancy = value;
    }

    /**
     * 获取maxAdults属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAdults() {
        return maxAdults;
    }

    /**
     * 设置maxAdults属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAdults(BigInteger value) {
        this.maxAdults = value;
    }

    /**
     * 获取cotQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCotQuantity() {
        return cotQuantity;
    }

    /**
     * 设置cotQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCotQuantity(BigInteger value) {
        this.cotQuantity = value;
    }

    /**
     * 获取freeChildFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeChildFlag() {
        return freeChildFlag;
    }

    /**
     * 设置freeChildFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeChildFlag(Boolean value) {
        this.freeChildFlag = value;
    }

}
