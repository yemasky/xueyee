package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ServiceType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{http://www.opentravel.org/OTA/2003/05}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServiceDetails" type="{http://www.opentravel.org/OTA/2003/05}ResCommonDetailType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ServicePricingType" type="{http://www.opentravel.org/OTA/2003/05}PricingType" />
 *       &lt;attribute name="ReservationStatusType" type="{http://www.opentravel.org/OTA/2003/05}PMS_ResStatusType" />
 *       &lt;attribute name="ServiceRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceInventoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InventoryBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PriceGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Inclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RequestedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Instance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     */
    public List<AmountType> getPrice() {
        if (price == null) {
            price = new ArrayList<AmountType>();
        }
        return this.price;
    }

    /**
     * ��ȡserviceDetails���Ե�ֵ��
     *
     * @return possible object is
     * {@link ResCommonDetailType }
     */
    public ResCommonDetailType getServiceDetails() {
        return serviceDetails;
    }

    /**
     * ����serviceDetails���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ResCommonDetailType }
     */
    public void setServiceDetails(ResCommonDetailType value) {
        this.serviceDetails = value;
    }

    /**
     * ��ȡtpaExtensions���Ե�ֵ��
     *
     * @return possible object is
     * {@link TPAExtensionsType }
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * ����tpaExtensions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TPAExtensionsType }
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * ��ȡservicePricingType���Ե�ֵ��
     *
     * @return possible object is
     * {@link PricingType }
     */
    public PricingType getServicePricingType() {
        return servicePricingType;
    }

    /**
     * ����servicePricingType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PricingType }
     */
    public void setServicePricingType(PricingType value) {
        this.servicePricingType = value;
    }

    /**
     * ��ȡreservationStatusType���Ե�ֵ��
     *
     * @return possible object is
     * {@link PMSResStatusType }
     */
    public PMSResStatusType getReservationStatusType() {
        return reservationStatusType;
    }

    /**
     * ����reservationStatusType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PMSResStatusType }
     */
    public void setReservationStatusType(PMSResStatusType value) {
        this.reservationStatusType = value;
    }

    /**
     * ��ȡserviceRPH���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getServiceRPH() {
        return serviceRPH;
    }

    /**
     * ����serviceRPH���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setServiceRPH(String value) {
        this.serviceRPH = value;
    }

    /**
     * ��ȡserviceInventoryCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getServiceInventoryCode() {
        return serviceInventoryCode;
    }

    /**
     * ����serviceInventoryCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setServiceInventoryCode(String value) {
        this.serviceInventoryCode = value;
    }

    /**
     * ��ȡratePlanCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * ����ratePlanCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * ��ȡinventoryBlockCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInventoryBlockCode() {
        return inventoryBlockCode;
    }

    /**
     * ����inventoryBlockCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInventoryBlockCode(String value) {
        this.inventoryBlockCode = value;
    }

    /**
     * ��ȡpriceGuaranteed���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPriceGuaranteed() {
        return priceGuaranteed;
    }

    /**
     * ����priceGuaranteed���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPriceGuaranteed(Boolean value) {
        this.priceGuaranteed = value;
    }

    /**
     * ��ȡinclusive���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isInclusive() {
        return inclusive;
    }

    /**
     * ����inclusive���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setInclusive(Boolean value) {
        this.inclusive = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * ��ȡrequestedIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRequestedIndicator() {
        return requestedIndicator;
    }

    /**
     * ����requestedIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRequestedIndicator(Boolean value) {
        this.requestedIndicator = value;
    }

    /**
     * ��ȡurl���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getURL() {
        return url;
    }

    /**
     * ����url���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * ��ȡinstance���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getInstance() {
        return instance;
    }

    /**
     * ����instance���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    /**
     * ��ȡidContext���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getIDContext() {
        return idContext;
    }

    /**
     * ����idContext���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIDContext(String value) {
        this.idContext = value;
    }

}
