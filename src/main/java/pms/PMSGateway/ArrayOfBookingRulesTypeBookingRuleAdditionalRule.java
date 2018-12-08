package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfBookingRulesTypeBookingRuleAdditionalRule complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfBookingRulesTypeBookingRuleAdditionalRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalRule" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AdditionalRule">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="IsCancelable"/>
 *                       &lt;enumeration value="IsModifiable"/>
 *                       &lt;enumeration value="IsRefundable"/>
 *                       &lt;enumeration value="NotCancelable"/>
 *                       &lt;enumeration value="NotModifiable"/>
 *                       &lt;enumeration value="NotRefundable"/>
 *                       &lt;enumeration value="IsCommissionable"/>
 *                       &lt;enumeration value="NotCommissionable"/>
 *                       &lt;enumeration value="CertificateRequired"/>
 *                       &lt;enumeration value="ID_Required"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
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
@XmlType(name = "ArrayOfBookingRulesTypeBookingRuleAdditionalRule", propOrder = {
        "additionalRule"
})
public class ArrayOfBookingRulesTypeBookingRuleAdditionalRule {

    @XmlElement(name = "AdditionalRule")
    protected List<ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule> additionalRule;

    /**
     * Gets the value of the additionalRule property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalRule property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalRule().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule }
     */
    public List<ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule> getAdditionalRule() {
        if (additionalRule == null) {
            additionalRule = new ArrayList<ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule>();
        }
        return this.additionalRule;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="AdditionalRule">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="IsCancelable"/>
     *             &lt;enumeration value="IsModifiable"/>
     *             &lt;enumeration value="IsRefundable"/>
     *             &lt;enumeration value="NotCancelable"/>
     *             &lt;enumeration value="NotModifiable"/>
     *             &lt;enumeration value="NotRefundable"/>
     *             &lt;enumeration value="IsCommissionable"/>
     *             &lt;enumeration value="NotCommissionable"/>
     *             &lt;enumeration value="CertificateRequired"/>
     *             &lt;enumeration value="ID_Required"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalRule {

        @XmlAttribute(name = "AdditionalRule")
        protected String additionalRule;

        /**
         * ��ȡadditionalRule���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAdditionalRule() {
            return additionalRule;
        }

        /**
         * ����additionalRule���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAdditionalRule(String value) {
            this.additionalRule = value;
        }

    }

}
