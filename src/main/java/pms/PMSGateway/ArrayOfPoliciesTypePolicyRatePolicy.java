package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfPoliciesTypePolicyRatePolicy complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfPoliciesTypePolicyRatePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePolicy" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>RatePlanEnum">
 *                           &lt;attribute name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="SubjectToChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ID_RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GuestType">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="MinRoomNightCommitment" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="RateOfferType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfPoliciesTypePolicyRatePolicy", propOrder = {
        "ratePolicy"
})
public class ArrayOfPoliciesTypePolicyRatePolicy {

    @XmlElement(name = "RatePolicy")
    protected List<ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy> ratePolicy;

    /**
     * Gets the value of the ratePolicy property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePolicy property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePolicy().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy }
     */
    public List<ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy> getRatePolicy() {
        if (ratePolicy == null) {
            ratePolicy = new ArrayList<ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy>();
        }
        return this.ratePolicy;
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
     *         &lt;element name="Type" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>RatePlanEnum">
     *                 &lt;attribute name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="SubjectToChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ID_RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GuestType">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="MinRoomNightCommitment" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="RateOfferType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "type",
            "description"
    })
    public static class RatePolicy {

        @XmlElement(name = "Type")
        protected ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type type;
        @XmlElement(name = "Description")
        protected List<ParagraphType> description;
        @XmlAttribute(name = "SubjectToChangeInd")
        protected Boolean subjectToChangeInd;
        @XmlAttribute(name = "ID_RequiredInd")
        protected Boolean idRequiredInd;
        @XmlAttribute(name = "GuestType")
        protected List<String> guestType;
        @XmlAttribute(name = "MinRoomNightCommitment")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger minRoomNightCommitment;
        @XmlAttribute(name = "RateOfferType")
        protected String rateOfferType;

        /**
         * ��ȡtype���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type }
         */
        public ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type getType() {
            return type;
        }

        /**
         * ����type���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type }
         */
        public void setType(ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type value) {
            this.type = value;
        }

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
         * ��ȡsubjectToChangeInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isSubjectToChangeInd() {
            return subjectToChangeInd;
        }

        /**
         * ����subjectToChangeInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setSubjectToChangeInd(Boolean value) {
            this.subjectToChangeInd = value;
        }

        /**
         * ��ȡidRequiredInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isIDRequiredInd() {
            return idRequiredInd;
        }

        /**
         * ����idRequiredInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setIDRequiredInd(Boolean value) {
            this.idRequiredInd = value;
        }

        /**
         * Gets the value of the guestType property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guestType property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuestType().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getGuestType() {
            if (guestType == null) {
                guestType = new ArrayList<String>();
            }
            return this.guestType;
        }

        /**
         * ��ȡminRoomNightCommitment���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMinRoomNightCommitment() {
            return minRoomNightCommitment;
        }

        /**
         * ����minRoomNightCommitment���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMinRoomNightCommitment(BigInteger value) {
            this.minRoomNightCommitment = value;
        }

        /**
         * ��ȡrateOfferType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRateOfferType() {
            return rateOfferType;
        }

        /**
         * ����rateOfferType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRateOfferType(String value) {
            this.rateOfferType = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>RatePlanEnum">
         *       &lt;attribute name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class Type {

            @XmlValue
            protected RatePlanEnum value;
            @XmlAttribute(name = "Extension")
            protected String extension;

            /**
             * ��ȡvalue���Ե�ֵ��
             *
             * @return possible object is
             * {@link RatePlanEnum }
             */
            public RatePlanEnum getValue() {
                return value;
            }

            /**
             * ����value���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link RatePlanEnum }
             */
            public void setValue(RatePlanEnum value) {
                this.value = value;
            }

            /**
             * ��ȡextension���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getExtension() {
                return extension;
            }

            /**
             * ����extension���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setExtension(String value) {
                this.extension = value;
            }

        }

    }

}
