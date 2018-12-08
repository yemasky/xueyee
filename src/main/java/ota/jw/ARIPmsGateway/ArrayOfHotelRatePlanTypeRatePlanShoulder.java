
package ota.jw.ARIPmsGateway;

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
 * <p>ArrayOfHotelRatePlanTypeRatePlanShoulder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelRatePlanTypeRatePlanShoulder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlanShoulder" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SellableProducts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProduct" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ShoulderRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PreShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="PostShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="PreShoulderStartDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PostShoulderEndDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelRatePlanTypeRatePlanShoulder", propOrder = {
    "ratePlanShoulder"
})
public class ArrayOfHotelRatePlanTypeRatePlanShoulder {

    @XmlElement(name = "RatePlanShoulder")
    protected List<ArrayOfHotelRatePlanTypeRatePlanShoulder.RatePlanShoulder> ratePlanShoulder;

    /**
     * Gets the value of the ratePlanShoulder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanShoulder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanShoulder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelRatePlanTypeRatePlanShoulder.RatePlanShoulder }
     * 
     * 
     */
    public List<ArrayOfHotelRatePlanTypeRatePlanShoulder.RatePlanShoulder> getRatePlanShoulder() {
        if (ratePlanShoulder == null) {
            ratePlanShoulder = new ArrayList<ArrayOfHotelRatePlanTypeRatePlanShoulder.RatePlanShoulder>();
        }
        return this.ratePlanShoulder;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SellableProducts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProduct" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ShoulderRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PreShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="PostShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="PreShoulderStartDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PostShoulderEndDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sellableProducts"
    })
    public static class RatePlanShoulder {

        @XmlElement(name = "SellableProducts")
        protected ArrayOfSellableProductsTypeSellableProduct sellableProducts;
        @XmlAttribute(name = "ShoulderRPH")
        protected String shoulderRPH;
        @XmlAttribute(name = "PreShoulderSellLimit")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger preShoulderSellLimit;
        @XmlAttribute(name = "PostShoulderSellLimit")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger postShoulderSellLimit;
        @XmlAttribute(name = "PreShoulderStartDate")
        protected String preShoulderStartDate;
        @XmlAttribute(name = "PostShoulderEndDate")
        protected String postShoulderEndDate;

        /**
         * 获取sellableProducts属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSellableProductsTypeSellableProduct }
         *     
         */
        public ArrayOfSellableProductsTypeSellableProduct getSellableProducts() {
            return sellableProducts;
        }

        /**
         * 设置sellableProducts属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSellableProductsTypeSellableProduct }
         *     
         */
        public void setSellableProducts(ArrayOfSellableProductsTypeSellableProduct value) {
            this.sellableProducts = value;
        }

        /**
         * 获取shoulderRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShoulderRPH() {
            return shoulderRPH;
        }

        /**
         * 设置shoulderRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShoulderRPH(String value) {
            this.shoulderRPH = value;
        }

        /**
         * 获取preShoulderSellLimit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPreShoulderSellLimit() {
            return preShoulderSellLimit;
        }

        /**
         * 设置preShoulderSellLimit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPreShoulderSellLimit(BigInteger value) {
            this.preShoulderSellLimit = value;
        }

        /**
         * 获取postShoulderSellLimit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPostShoulderSellLimit() {
            return postShoulderSellLimit;
        }

        /**
         * 设置postShoulderSellLimit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPostShoulderSellLimit(BigInteger value) {
            this.postShoulderSellLimit = value;
        }

        /**
         * 获取preShoulderStartDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreShoulderStartDate() {
            return preShoulderStartDate;
        }

        /**
         * 设置preShoulderStartDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreShoulderStartDate(String value) {
            this.preShoulderStartDate = value;
        }

        /**
         * 获取postShoulderEndDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostShoulderEndDate() {
            return postShoulderEndDate;
        }

        /**
         * 设置postShoulderEndDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostShoulderEndDate(String value) {
            this.postShoulderEndDate = value;
        }

    }

}
