
package ota.jw.PMSGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServiceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" type="{http://www.opentravel.org/OTA/2003/05}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDetails" type="{http://www.opentravel.org/OTA/2003/05}ResCommonDetailType" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ServicePricingType" type="{http://www.opentravel.org/OTA/2003/05}PricingType" /&gt;
 *       &lt;attribute name="ReservationStatusType" type="{http://www.opentravel.org/OTA/2003/05}PMS_ResStatusType" /&gt;
 *       &lt;attribute name="ServiceRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ServiceInventoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InventoryBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PriceGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Inclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="RequestedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Instance" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {
    "price",
    "serviceDetails",
    "tpaExtensions"
})
public class ServiceType {

    @XmlElement(name = "Price")
    protected List<AmountType> price;
    @XmlElement(name = "ServiceDetails")
    protected ResCommonDetailType serviceDetails;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ServicePricingType")
    protected PricingType servicePricingType;
    @XmlAttribute(name = "ReservationStatusType")
    protected PMSResStatusType reservationStatusType;
    @XmlAttribute(name = "ServiceRPH")
    protected String serviceRPH;
    @XmlAttribute(name = "ServiceInventoryCode")
    protected String serviceInventoryCode;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "InventoryBlockCode")
    protected String inventoryBlockCode;
    @XmlAttribute(name = "PriceGuaranteed")
    protected Boolean priceGuaranteed;
    @XmlAttribute(name = "Inclusive")
    protected Boolean inclusive;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "RequestedIndicator")
    protected Boolean requestedIndicator;
    @XmlAttribute(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Instance")
    protected String instance;
    @XmlAttribute(name = "ID_Context")
    protected String idContext;

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
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getPrice() {
        if (price == null) {
            price = new ArrayList<AmountType>();
        }
        return this.price;
    }

    /**
     * 获取serviceDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResCommonDetailType }
     *     
     */
    public ResCommonDetailType getServiceDetails() {
        return serviceDetails;
    }

    /**
     * 设置serviceDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResCommonDetailType }
     *     
     */
    public void setServiceDetails(ResCommonDetailType value) {
        this.serviceDetails = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * 获取servicePricingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricingType }
     *     
     */
    public PricingType getServicePricingType() {
        return servicePricingType;
    }

    /**
     * 设置servicePricingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricingType }
     *     
     */
    public void setServicePricingType(PricingType value) {
        this.servicePricingType = value;
    }

    /**
     * 获取reservationStatusType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PMSResStatusType }
     *     
     */
    public PMSResStatusType getReservationStatusType() {
        return reservationStatusType;
    }

    /**
     * 设置reservationStatusType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PMSResStatusType }
     *     
     */
    public void setReservationStatusType(PMSResStatusType value) {
        this.reservationStatusType = value;
    }

    /**
     * 获取serviceRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRPH() {
        return serviceRPH;
    }

    /**
     * 设置serviceRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRPH(String value) {
        this.serviceRPH = value;
    }

    /**
     * 获取serviceInventoryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInventoryCode() {
        return serviceInventoryCode;
    }

    /**
     * 设置serviceInventoryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInventoryCode(String value) {
        this.serviceInventoryCode = value;
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
     * 获取inventoryBlockCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryBlockCode() {
        return inventoryBlockCode;
    }

    /**
     * 设置inventoryBlockCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryBlockCode(String value) {
        this.inventoryBlockCode = value;
    }

    /**
     * 获取priceGuaranteed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceGuaranteed() {
        return priceGuaranteed;
    }

    /**
     * 设置priceGuaranteed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceGuaranteed(Boolean value) {
        this.priceGuaranteed = value;
    }

    /**
     * 获取inclusive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusive() {
        return inclusive;
    }

    /**
     * 设置inclusive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusive(Boolean value) {
        this.inclusive = value;
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
     * 获取requestedIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestedIndicator() {
        return requestedIndicator;
    }

    /**
     * 设置requestedIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestedIndicator(Boolean value) {
        this.requestedIndicator = value;
    }

    /**
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
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
     * 获取instance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstance() {
        return instance;
    }

    /**
     * 设置instance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    /**
     * 获取idContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDContext() {
        return idContext;
    }

    /**
     * 设置idContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDContext(String value) {
        this.idContext = value;
    }

}
