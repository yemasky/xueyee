package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfPoliciesTypePolicyPolicyInfoCode complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfPoliciesTypePolicyPolicyInfoCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyInfoCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="Name">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="AdditionalOversoldPolicy"/>
 *                       &lt;enumeration value="EarlyCheckinAvailable"/>
 *                       &lt;enumeration value="LateCheckoutAvailable"/>
 *                       &lt;enumeration value="OversoldArrangeAccommodations"/>
 *                       &lt;enumeration value="OversoldArrangeTransportation"/>
 *                       &lt;enumeration value="OversoldNotifyContacts"/>
 *                       &lt;enumeration value="OversoldPayOneNightRoom"/>
 *                       &lt;enumeration value="OversoldProvidePhonecall"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfPoliciesTypePolicyPolicyInfoCode", propOrder = {
        "policyInfoCode"
})
public class ArrayOfPoliciesTypePolicyPolicyInfoCode {

    @XmlElement(name = "PolicyInfoCode")
    protected List<ArrayOfPoliciesTypePolicyPolicyInfoCode.PolicyInfoCode> policyInfoCode;

    /**
     * Gets the value of the policyInfoCode property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyInfoCode property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyInfoCode().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfPoliciesTypePolicyPolicyInfoCode.PolicyInfoCode }
     */
    public List<ArrayOfPoliciesTypePolicyPolicyInfoCode.PolicyInfoCode> getPolicyInfoCode() {
        if (policyInfoCode == null) {
            policyInfoCode = new ArrayList<ArrayOfPoliciesTypePolicyPolicyInfoCode.PolicyInfoCode>();
        }
        return this.policyInfoCode;
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
     *       &lt;sequence>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="Name">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="AdditionalOversoldPolicy"/>
     *             &lt;enumeration value="EarlyCheckinAvailable"/>
     *             &lt;enumeration value="LateCheckoutAvailable"/>
     *             &lt;enumeration value="OversoldArrangeAccommodations"/>
     *             &lt;enumeration value="OversoldArrangeTransportation"/>
     *             &lt;enumeration value="OversoldNotifyContacts"/>
     *             &lt;enumeration value="OversoldPayOneNightRoom"/>
     *             &lt;enumeration value="OversoldProvidePhonecall"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "description"
    })
    public static class PolicyInfoCode {

        @XmlElement(name = "Description")
        protected List<ParagraphType> description;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;

        /**
         * Gets the value of the description property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         */
        public List<ParagraphType> getDescription() {
            if (description == null) {
                description = new ArrayList<ParagraphType>();
            }
            return this.description;
        }

        /**
         * ��ȡcodeDetail���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * ����codeDetail���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * ��ȡuri���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getURI() {
            return uri;
        }

        /**
         * ����uri���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * ��ȡname���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getName() {
            return name;
        }

        /**
         * ����name���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * ��ȡexistsCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getExistsCode() {
            return existsCode;
        }

        /**
         * ����existsCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setExistsCode(String value) {
            this.existsCode = value;
        }

    }

}
