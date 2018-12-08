
package ota.jw.AvailRes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PeriodPriceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PeriodPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OperationScheduleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" type="{http://www.opentravel.org/OTA/2003/05}PkgPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Category"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Room"/&gt;
 *             &lt;enumeration value="Booking"/&gt;
 *             &lt;enumeration value="Person"/&gt;
 *             &lt;enumeration value="Adult"/&gt;
 *             &lt;enumeration value="Child"/&gt;
 *             &lt;enumeration value="Car"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Base"/&gt;
 *             &lt;enumeration value="AddOn"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DurationPeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PriceBasis" type="{http://www.opentravel.org/OTA/2003/05}PricingType" /&gt;
 *       &lt;attribute name="BasePeriodRPHs"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="GuidePriceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaximumPeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodPriceType", propOrder = {
    "price"
})
public class PeriodPriceType
    extends OperationScheduleType
{

    @XmlElement(name = "Price")
    protected List<PkgPriceType> price;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Category")
    protected String category;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "DurationPeriod")
    protected String durationPeriod;
    @XmlAttribute(name = "PriceBasis")
    protected PricingType priceBasis;
    @XmlAttribute(name = "BasePeriodRPHs")
    protected List<String> basePeriodRPHs;
    @XmlAttribute(name = "GuidePriceIndicator")
    protected Boolean guidePriceIndicator;
    @XmlAttribute(name = "MaximumPeriod")
    protected String maximumPeriod;

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PkgPriceType }
     * 
     * 
     */
    public List<PkgPriceType> getPrice() {
        if (price == null) {
            price = new ArrayList<PkgPriceType>();
        }
        return this.price;
    }

    /**
     * 获取rph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * 设置rph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     * 获取durationPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationPeriod() {
        return durationPeriod;
    }

    /**
     * 设置durationPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationPeriod(String value) {
        this.durationPeriod = value;
    }

    /**
     * 获取priceBasis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricingType }
     *     
     */
    public PricingType getPriceBasis() {
        return priceBasis;
    }

    /**
     * 设置priceBasis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricingType }
     *     
     */
    public void setPriceBasis(PricingType value) {
        this.priceBasis = value;
    }

    /**
     * Gets the value of the basePeriodRPHs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basePeriodRPHs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasePeriodRPHs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBasePeriodRPHs() {
        if (basePeriodRPHs == null) {
            basePeriodRPHs = new ArrayList<String>();
        }
        return this.basePeriodRPHs;
    }

    /**
     * 获取guidePriceIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuidePriceIndicator() {
        return guidePriceIndicator;
    }

    /**
     * 设置guidePriceIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuidePriceIndicator(Boolean value) {
        this.guidePriceIndicator = value;
    }

    /**
     * 获取maximumPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumPeriod() {
        return maximumPeriod;
    }

    /**
     * 设置maximumPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumPeriod(String value) {
        this.maximumPeriod = value;
    }

}
