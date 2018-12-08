
package ota.jw.ARIPmsGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>ArrayOfSellableProductsTypeSellableProductDestinationSystemCode complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSellableProductsTypeSellableProductDestinationSystemCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationSystemCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="ChainRateLevelCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ChainRateCodeCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
@XmlType(name = "ArrayOfSellableProductsTypeSellableProductDestinationSystemCode", propOrder = {
    "destinationSystemCode"
})
public class ArrayOfSellableProductsTypeSellableProductDestinationSystemCode {

    @XmlElement(name = "DestinationSystemCode")
    protected List<ArrayOfSellableProductsTypeSellableProductDestinationSystemCode.DestinationSystemCode> destinationSystemCode;

    /**
     * Gets the value of the destinationSystemCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationSystemCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationSystemCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSellableProductsTypeSellableProductDestinationSystemCode.DestinationSystemCode }
     * 
     * 
     */
    public List<ArrayOfSellableProductsTypeSellableProductDestinationSystemCode.DestinationSystemCode> getDestinationSystemCode() {
        if (destinationSystemCode == null) {
            destinationSystemCode = new ArrayList<ArrayOfSellableProductsTypeSellableProductDestinationSystemCode.DestinationSystemCode>();
        }
        return this.destinationSystemCode;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="ChainRateLevelCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ChainRateCodeCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DestinationSystemCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ChainRateLevelCrossRef")
        protected String chainRateLevelCrossRef;
        @XmlAttribute(name = "ChainRateCodeCrossRef")
        protected String chainRateCodeCrossRef;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取chainRateLevelCrossRef属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainRateLevelCrossRef() {
            return chainRateLevelCrossRef;
        }

        /**
         * 设置chainRateLevelCrossRef属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainRateLevelCrossRef(String value) {
            this.chainRateLevelCrossRef = value;
        }

        /**
         * 获取chainRateCodeCrossRef属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainRateCodeCrossRef() {
            return chainRateCodeCrossRef;
        }

        /**
         * 设置chainRateCodeCrossRef属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainRateCodeCrossRef(String value) {
            this.chainRateCodeCrossRef = value;
        }

    }

}
