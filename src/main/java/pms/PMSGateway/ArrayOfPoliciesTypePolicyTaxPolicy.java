package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfPoliciesTypePolicyTaxPolicy complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfPoliciesTypePolicyTaxPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxPolicy" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
 *                 &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxPolicy property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxPolicy().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfPoliciesTypePolicyTaxPolicy.TaxPolicy }
     */
    public List<ArrayOfPoliciesTypePolicyTaxPolicy.TaxPolicy> getTaxPolicy() {
        if (taxPolicy == null) {
            taxPolicy = new ArrayList<ArrayOfPoliciesTypePolicyTaxPolicy.TaxPolicy>();
        }
        return this.taxPolicy;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TaxType">
     *       &lt;attribute name="NightsForTaxExemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="TaxableNightsQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TaxPolicy
            extends TaxType {

        @XmlAttribute(name = "NightsForTaxExemptionQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger nightsForTaxExemptionQuantity;
        @XmlAttribute(name = "TaxableNightsQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger taxableNightsQuantity;

        /**
         * ��ȡnightsForTaxExemptionQuantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getNightsForTaxExemptionQuantity() {
            return nightsForTaxExemptionQuantity;
        }

        /**
         * ����nightsForTaxExemptionQuantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setNightsForTaxExemptionQuantity(BigInteger value) {
            this.nightsForTaxExemptionQuantity = value;
        }

        /**
         * ��ȡtaxableNightsQuantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getTaxableNightsQuantity() {
            return taxableNightsQuantity;
        }

        /**
         * ����taxableNightsQuantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setTaxableNightsQuantity(BigInteger value) {
            this.taxableNightsQuantity = value;
        }

    }

}
