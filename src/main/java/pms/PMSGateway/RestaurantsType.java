package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RestaurantsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RestaurantsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Restaurant" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RestaurantType">
 *                 &lt;sequence>
 *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
 *                   &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/>
 *                   &lt;element name="SrvcInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantsTypeRestaurantSrvcInfoCode" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AwardsRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SrvcInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantsTypeSrvcInfoCode" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restaurant property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestaurant().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RestaurantsType.Restaurant }
     */
    public List<RestaurantsType.Restaurant> getRestaurant() {
        if (restaurant == null) {
            restaurant = new ArrayList<RestaurantsType.Restaurant>();
        }
        return this.restaurant;
    }

    /**
     * ��ȡsrvcInfoCodes���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRestaurantsTypeSrvcInfoCode }
     */
    public ArrayOfRestaurantsTypeSrvcInfoCode getSrvcInfoCodes() {
        return srvcInfoCodes;
    }

    /**
     * ����srvcInfoCodes���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRestaurantsTypeSrvcInfoCode }
     */
    public void setSrvcInfoCodes(ArrayOfRestaurantsTypeSrvcInfoCode value) {
        this.srvcInfoCodes = value;
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
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RestaurantType">
     *       &lt;sequence>
     *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
     *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfContactInfoRootType" minOccurs="0"/>
     *         &lt;element name="SrvcInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantsTypeRestaurantSrvcInfoCode" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AwardsRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "features",
            "contactInfos",
            "srvcInfoCodes"
    })
    public static class Restaurant
            extends RestaurantType {

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
         * ��ȡfeatures���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfFeaturesTypeFeature }
         */
        public ArrayOfFeaturesTypeFeature getFeatures() {
            return features;
        }

        /**
         * ����features���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfFeaturesTypeFeature }
         */
        public void setFeatures(ArrayOfFeaturesTypeFeature value) {
            this.features = value;
        }

        /**
         * ��ȡcontactInfos���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfContactInfoRootType }
         */
        public ArrayOfContactInfoRootType getContactInfos() {
            return contactInfos;
        }

        /**
         * ����contactInfos���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfContactInfoRootType }
         */
        public void setContactInfos(ArrayOfContactInfoRootType value) {
            this.contactInfos = value;
        }

        /**
         * ��ȡsrvcInfoCodes���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfRestaurantsTypeRestaurantSrvcInfoCode }
         */
        public ArrayOfRestaurantsTypeRestaurantSrvcInfoCode getSrvcInfoCodes() {
            return srvcInfoCodes;
        }

        /**
         * ����srvcInfoCodes���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfRestaurantsTypeRestaurantSrvcInfoCode }
         */
        public void setSrvcInfoCodes(ArrayOfRestaurantsTypeRestaurantSrvcInfoCode value) {
            this.srvcInfoCodes = value;
        }

        /**
         * ��ȡremoval���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * ����removal���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * ��ȡawardsRPH���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAwardsRPH() {
            return awardsRPH;
        }

        /**
         * ����awardsRPH���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAwardsRPH(String value) {
            this.awardsRPH = value;
        }

    }

}
