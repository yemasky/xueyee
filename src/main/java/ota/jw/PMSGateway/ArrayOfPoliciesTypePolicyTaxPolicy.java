
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
 * <p>ArrayOfPoliciesTypePolicyTaxPolicy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPoliciesTypePolicyTaxPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType"&gt;
 *                 &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "ArrayOfPoliciesTypePolicyTaxPolicy", propOrder = {
    "taxPolicy"
})
public class ArrayOfPoliciesTypePolicyTaxPolicy {

    @XmlElement(name = "TaxPolicy")
    protected List<ArrayOfPoliciesTypePolicyTaxPolicy.TaxPolicy> taxPolicy;

    /**
     * Gets the value of the taxPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfPoliciesTypePolicyTaxPolicy.TaxPolicy }
     * 
     * 
     */
    public List<ArrayOfPoliciesTypePolicyTaxPolicy.TaxPolicy> getTaxPolicy() {
        if (taxPolicy == null) {
            taxPolicy = new ArrayList<ArrayOfPoliciesTypePolicyTaxPolicy.TaxPolicy>();
        }
        return this.taxPolicy;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType"&gt;
     *       &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TaxPolicy
        extends TaxType
    {

        @XmlAttribute(name = "NightsForTaxExemptionQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger nightsForTaxExemptionQuantity;
        @XmlAttribute(name = "TaxableNightsQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger taxableNightsQuantity;

        /**
         * 获取nightsForTaxExemptionQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNightsForTaxExemptionQuantity() {
            return nightsForTaxExemptionQuantity;
        }

        /**
         * 设置nightsForTaxExemptionQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNightsForTaxExemptionQuantity(BigInteger value) {
            this.nightsForTaxExemptionQuantity = value;
        }

        /**
         * 获取taxableNightsQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTaxableNightsQuantity() {
            return taxableNightsQuantity;
        }

        /**
         * 设置taxableNightsQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTaxableNightsQuantity(BigInteger value) {
            this.taxableNightsQuantity = value;
        }

    }

}
