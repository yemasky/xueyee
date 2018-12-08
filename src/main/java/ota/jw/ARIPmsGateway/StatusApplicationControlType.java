
package ota.jw.ARIPmsGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StatusApplicationControlType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StatusApplicationControlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationSystemCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfDestinationSystemCodesTypeDestinationSystemCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InvTypeCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RatePlanCodeType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="DoesNotApply"/&gt;
 *             &lt;enumeration value="RatePlanCode"/&gt;
 *             &lt;enumeration value="RatePlanGroupingCode"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RateTier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AllRateCode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllInvCode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InvBlockCodeApply"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="DoesNotApply"/&gt;
 *             &lt;enumeration value="BlockCode"/&gt;
 *             &lt;enumeration value="BlockGroupingCode"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="InvBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SubBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="WingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusApplicationControlType", propOrder = {
    "destinationSystemCodes"
})
public class StatusApplicationControlType {

    @XmlElement(name = "DestinationSystemCodes")
    protected ArrayOfDestinationSystemCodesTypeDestinationSystemCode destinationSystemCodes;
    @XmlAttribute(name = "Mon")
    protected Boolean mon;
    @XmlAttribute(name = "Tue")
    protected Boolean tue;
    @XmlAttribute(name = "InvTypeCode")
    protected List<String> invTypeCode;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "Weds")
    protected Boolean weds;
    @XmlAttribute(name = "Thur")
    protected Boolean thur;
    @XmlAttribute(name = "Fri")
    protected Boolean fri;
    @XmlAttribute(name = "Sat")
    protected Boolean sat;
    @XmlAttribute(name = "Sun")
    protected Boolean sun;
    @XmlAttribute(name = "RatePlanCodeType")
    protected String ratePlanCodeType;
    @XmlAttribute(name = "RateTier")
    protected String rateTier;
    @XmlAttribute(name = "AllRateCode")
    protected Boolean allRateCode;
    @XmlAttribute(name = "AllInvCode")
    protected Boolean allInvCode;
    @XmlAttribute(name = "InvBlockCodeApply")
    protected String invBlockCodeApply;
    @XmlAttribute(name = "InvBlockCode")
    protected String invBlockCode;
    @XmlAttribute(name = "Override")
    protected Boolean override;
    @XmlAttribute(name = "QuoteID")
    protected String quoteID;
    @XmlAttribute(name = "SubBlockCode")
    protected String subBlockCode;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "WingIdentifier")
    protected String wingIdentifier;

    /**
     * 获取destinationSystemCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode }
     *     
     */
    public ArrayOfDestinationSystemCodesTypeDestinationSystemCode getDestinationSystemCodes() {
        return destinationSystemCodes;
    }

    /**
     * 设置destinationSystemCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinationSystemCodesTypeDestinationSystemCode }
     *     
     */
    public void setDestinationSystemCodes(ArrayOfDestinationSystemCodesTypeDestinationSystemCode value) {
        this.destinationSystemCodes = value;
    }

    /**
     * 获取mon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMon() {
        return mon;
    }

    /**
     * 设置mon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMon(Boolean value) {
        this.mon = value;
    }

    /**
     * 获取tue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTue() {
        return tue;
    }

    /**
     * 设置tue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTue(Boolean value) {
        this.tue = value;
    }

    /**
     * Gets the value of the invTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInvTypeCode() {
        if (invTypeCode == null) {
            invTypeCode = new ArrayList<String>();
        }
        return this.invTypeCode;
    }

    /**
     * 获取start属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置start属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * 获取end属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * 设置end属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * 获取weds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeds() {
        return weds;
    }

    /**
     * 设置weds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeds(Boolean value) {
        this.weds = value;
    }

    /**
     * 获取thur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThur() {
        return thur;
    }

    /**
     * 设置thur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThur(Boolean value) {
        this.thur = value;
    }

    /**
     * 获取fri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFri() {
        return fri;
    }

    /**
     * 设置fri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFri(Boolean value) {
        this.fri = value;
    }

    /**
     * 获取sat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSat() {
        return sat;
    }

    /**
     * 设置sat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSat(Boolean value) {
        this.sat = value;
    }

    /**
     * 获取sun属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSun() {
        return sun;
    }

    /**
     * 设置sun属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSun(Boolean value) {
        this.sun = value;
    }

    /**
     * 获取ratePlanCodeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCodeType() {
        return ratePlanCodeType;
    }

    /**
     * 设置ratePlanCodeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCodeType(String value) {
        this.ratePlanCodeType = value;
    }

    /**
     * 获取rateTier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTier() {
        return rateTier;
    }

    /**
     * 设置rateTier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTier(String value) {
        this.rateTier = value;
    }

    /**
     * 获取allRateCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllRateCode() {
        return allRateCode;
    }

    /**
     * 设置allRateCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllRateCode(Boolean value) {
        this.allRateCode = value;
    }

    /**
     * 获取allInvCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllInvCode() {
        return allInvCode;
    }

    /**
     * 设置allInvCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllInvCode(Boolean value) {
        this.allInvCode = value;
    }

    /**
     * 获取invBlockCodeApply属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockCodeApply() {
        return invBlockCodeApply;
    }

    /**
     * 设置invBlockCodeApply属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockCodeApply(String value) {
        this.invBlockCodeApply = value;
    }

    /**
     * 获取invBlockCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockCode() {
        return invBlockCode;
    }

    /**
     * 设置invBlockCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockCode(String value) {
        this.invBlockCode = value;
    }

    /**
     * 获取override属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverride() {
        return override;
    }

    /**
     * 设置override属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverride(Boolean value) {
        this.override = value;
    }

    /**
     * 获取quoteID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteID() {
        return quoteID;
    }

    /**
     * 设置quoteID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteID(String value) {
        this.quoteID = value;
    }

    /**
     * 获取subBlockCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBlockCode() {
        return subBlockCode;
    }

    /**
     * 设置subBlockCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBlockCode(String value) {
        this.subBlockCode = value;
    }

    /**
     * 获取ratePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 设置ratePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * 获取wingIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWingIdentifier() {
        return wingIdentifier;
    }

    /**
     * 设置wingIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWingIdentifier(String value) {
        this.wingIdentifier = value;
    }

}
