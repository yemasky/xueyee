
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateQualifierType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RateQualifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RateComments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRateQualifierTypeRateComment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RateQualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}RateQualifierTypeRatePeriod" /&gt;
 *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ArriveByFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateAuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VendorRateID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateQualifierType", propOrder = {
    "promoDesc",
    "rateComments"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.VehicleRentalRateType.RateQualifier.class
})
public class RateQualifierType {

    @XmlElement(name = "PromoDesc")
    protected String promoDesc;
    @XmlElement(name = "RateComments")
    protected ArrayOfRateQualifierTypeRateComment rateComments;
    @XmlAttribute(name = "TravelPurpose")
    protected String travelPurpose;
    @XmlAttribute(name = "RateCategory")
    protected String rateCategory;
    @XmlAttribute(name = "CorpDiscountNmbr")
    protected String corpDiscountNmbr;
    @XmlAttribute(name = "RateQualifier")
    protected String rateQualifier;
    @XmlAttribute(name = "RatePeriod")
    protected RateQualifierTypeRatePeriod ratePeriod;
    @XmlAttribute(name = "GuaranteedInd")
    protected Boolean guaranteedInd;
    @XmlAttribute(name = "ArriveByFlight")
    protected Boolean arriveByFlight;
    @XmlAttribute(name = "RateAuthorizationCode")
    protected String rateAuthorizationCode;
    @XmlAttribute(name = "VendorRateID")
    protected String vendorRateID;

    /**
     * 获取promoDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDesc() {
        return promoDesc;
    }

    /**
     * 设置promoDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDesc(String value) {
        this.promoDesc = value;
    }

    /**
     * 获取rateComments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateQualifierTypeRateComment }
     *     
     */
    public ArrayOfRateQualifierTypeRateComment getRateComments() {
        return rateComments;
    }

    /**
     * 设置rateComments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateQualifierTypeRateComment }
     *     
     */
    public void setRateComments(ArrayOfRateQualifierTypeRateComment value) {
        this.rateComments = value;
    }

    /**
     * 获取travelPurpose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelPurpose() {
        return travelPurpose;
    }

    /**
     * 设置travelPurpose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelPurpose(String value) {
        this.travelPurpose = value;
    }

    /**
     * 获取rateCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCategory() {
        return rateCategory;
    }

    /**
     * 设置rateCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCategory(String value) {
        this.rateCategory = value;
    }

    /**
     * 获取corpDiscountNmbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpDiscountNmbr() {
        return corpDiscountNmbr;
    }

    /**
     * 设置corpDiscountNmbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpDiscountNmbr(String value) {
        this.corpDiscountNmbr = value;
    }

    /**
     * 获取rateQualifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateQualifier() {
        return rateQualifier;
    }

    /**
     * 设置rateQualifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateQualifier(String value) {
        this.rateQualifier = value;
    }

    /**
     * 获取ratePeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateQualifierTypeRatePeriod }
     *     
     */
    public RateQualifierTypeRatePeriod getRatePeriod() {
        return ratePeriod;
    }

    /**
     * 设置ratePeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateQualifierTypeRatePeriod }
     *     
     */
    public void setRatePeriod(RateQualifierTypeRatePeriod value) {
        this.ratePeriod = value;
    }

    /**
     * 获取guaranteedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * 设置guaranteedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedInd(Boolean value) {
        this.guaranteedInd = value;
    }

    /**
     * 获取arriveByFlight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArriveByFlight() {
        return arriveByFlight;
    }

    /**
     * 设置arriveByFlight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArriveByFlight(Boolean value) {
        this.arriveByFlight = value;
    }

    /**
     * 获取rateAuthorizationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateAuthorizationCode() {
        return rateAuthorizationCode;
    }

    /**
     * 设置rateAuthorizationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateAuthorizationCode(String value) {
        this.rateAuthorizationCode = value;
    }

    /**
     * 获取vendorRateID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorRateID() {
        return vendorRateID;
    }

    /**
     * 设置vendorRateID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorRateID(String value) {
        this.vendorRateID = value;
    }

}
