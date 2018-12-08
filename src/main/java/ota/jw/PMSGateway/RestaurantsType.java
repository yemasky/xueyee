
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
 * <p>RestaurantsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RestaurantsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Restaurant" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RestaurantType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/&gt;
 *                   &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/&gt;
 *                   &lt;element name="SrvcInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantsTypeRestaurantSrvcInfoCode" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AwardsRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SrvcInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantsTypeSrvcInfoCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestaurantsType", propOrder = {
    "restaurant",
    "srvcInfoCodes"
})
public class RestaurantsType {

    @XmlElement(name = "Restaurant")
    protected List<RestaurantsType.Restaurant> restaurant;
    @XmlElement(name = "SrvcInfoCodes")
    protected ArrayOfRestaurantsTypeSrvcInfoCode srvcInfoCodes;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;

    /**
     * Gets the value of the restaurant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restaurant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestaurant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestaurantsType.Restaurant }
     * 
     * 
     */
    public List<RestaurantsType.Restaurant> getRestaurant() {
        if (restaurant == null) {
            restaurant = new ArrayList<RestaurantsType.Restaurant>();
        }
        return this.restaurant;
    }

    /**
     * 获取srvcInfoCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRestaurantsTypeSrvcInfoCode }
     *     
     */
    public ArrayOfRestaurantsTypeSrvcInfoCode getSrvcInfoCodes() {
        return srvcInfoCodes;
    }

    /**
     * 设置srvcInfoCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRestaurantsTypeSrvcInfoCode }
     *     
     */
    public void setSrvcInfoCodes(ArrayOfRestaurantsTypeSrvcInfoCode value) {
        this.srvcInfoCodes = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RestaurantType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/&gt;
     *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/&gt;
     *         &lt;element name="SrvcInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantsTypeRestaurantSrvcInfoCode" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AwardsRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "features",
        "contactInfos",
        "srvcInfoCodes"
    })
    public static class Restaurant
        extends RestaurantType
    {

        @XmlElement(name = "Features")
        protected ArrayOfFeaturesTypeFeature features;
        @XmlElement(name = "ContactInfos")
        protected ArrayOfContactInfoRootType contactInfos;
        @XmlElement(name = "SrvcInfoCodes")
        protected ArrayOfRestaurantsTypeRestaurantSrvcInfoCode srvcInfoCodes;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "AwardsRPH")
        protected String awardsRPH;

        /**
         * 获取features属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfFeaturesTypeFeature }
         *     
         */
        public ArrayOfFeaturesTypeFeature getFeatures() {
            return features;
        }

        /**
         * 设置features属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfFeaturesTypeFeature }
         *     
         */
        public void setFeatures(ArrayOfFeaturesTypeFeature value) {
            this.features = value;
        }

        /**
         * 获取contactInfos属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfContactInfoRootType }
         *     
         */
        public ArrayOfContactInfoRootType getContactInfos() {
            return contactInfos;
        }

        /**
         * 设置contactInfos属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfContactInfoRootType }
         *     
         */
        public void setContactInfos(ArrayOfContactInfoRootType value) {
            this.contactInfos = value;
        }

        /**
         * 获取srvcInfoCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRestaurantsTypeRestaurantSrvcInfoCode }
         *     
         */
        public ArrayOfRestaurantsTypeRestaurantSrvcInfoCode getSrvcInfoCodes() {
            return srvcInfoCodes;
        }

        /**
         * 设置srvcInfoCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRestaurantsTypeRestaurantSrvcInfoCode }
         *     
         */
        public void setSrvcInfoCodes(ArrayOfRestaurantsTypeRestaurantSrvcInfoCode value) {
            this.srvcInfoCodes = value;
        }

        /**
         * 获取removal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * 设置removal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * 获取awardsRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwardsRPH() {
            return awardsRPH;
        }

        /**
         * 设置awardsRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwardsRPH(String value) {
            this.awardsRPH = value;
        }

    }

}
