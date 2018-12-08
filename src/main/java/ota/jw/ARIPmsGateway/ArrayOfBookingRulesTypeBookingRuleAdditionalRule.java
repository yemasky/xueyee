
package ota.jw.ARIPmsGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfBookingRulesTypeBookingRuleAdditionalRule complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBookingRulesTypeBookingRuleAdditionalRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalRule" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AdditionalRule"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="IsCancelable"/&gt;
 *                       &lt;enumeration value="IsModifiable"/&gt;
 *                       &lt;enumeration value="IsRefundable"/&gt;
 *                       &lt;enumeration value="NotCancelable"/&gt;
 *                       &lt;enumeration value="NotModifiable"/&gt;
 *                       &lt;enumeration value="NotRefundable"/&gt;
 *                       &lt;enumeration value="IsCommissionable"/&gt;
 *                       &lt;enumeration value="NotCommissionable"/&gt;
 *                       &lt;enumeration value="CertificateRequired"/&gt;
 *                       &lt;enumeration value="ID_Required"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
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
@XmlType(name = "ArrayOfBookingRulesTypeBookingRuleAdditionalRule", propOrder = {
    "additionalRule"
})
public class ArrayOfBookingRulesTypeBookingRuleAdditionalRule {

    @XmlElement(name = "AdditionalRule")
    protected List<ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule> additionalRule;

    /**
     * Gets the value of the additionalRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule }
     * 
     * 
     */
    public List<ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule> getAdditionalRule() {
        if (additionalRule == null) {
            additionalRule = new ArrayList<ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule>();
        }
        return this.additionalRule;
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
     *       &lt;attribute name="AdditionalRule"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="IsCancelable"/&gt;
     *             &lt;enumeration value="IsModifiable"/&gt;
     *             &lt;enumeration value="IsRefundable"/&gt;
     *             &lt;enumeration value="NotCancelable"/&gt;
     *             &lt;enumeration value="NotModifiable"/&gt;
     *             &lt;enumeration value="NotRefundable"/&gt;
     *             &lt;enumeration value="IsCommissionable"/&gt;
     *             &lt;enumeration value="NotCommissionable"/&gt;
     *             &lt;enumeration value="CertificateRequired"/&gt;
     *             &lt;enumeration value="ID_Required"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalRule {

        @XmlAttribute(name = "AdditionalRule")
        protected String additionalRule;

        /**
         * 获取additionalRule属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalRule() {
            return additionalRule;
        }

        /**
         * 设置additionalRule属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalRule(String value) {
            this.additionalRule = value;
        }

    }

}
