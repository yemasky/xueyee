
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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>ArrayOfPoliciesTypePolicyRatePolicy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPoliciesTypePolicyRatePolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePolicy" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Type" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;RatePlanEnum"&gt;
 *                           &lt;attribute name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="SubjectToChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ID_RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="GuestType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="MinRoomNightCommitment" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                 &lt;attribute name="RateOfferType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfPoliciesTypePolicyRatePolicy", propOrder = {
    "ratePolicy"
})
public class ArrayOfPoliciesTypePolicyRatePolicy {

    @XmlElement(name = "RatePolicy")
    protected List<ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy> ratePolicy;

    /**
     * Gets the value of the ratePolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy }
     * 
     * 
     */
    public List<ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy> getRatePolicy() {
        if (ratePolicy == null) {
            ratePolicy = new ArrayList<ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy>();
        }
        return this.ratePolicy;
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
     *         &lt;element name="Type" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;RatePlanEnum"&gt;
     *                 &lt;attribute name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="SubjectToChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ID_RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="GuestType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="MinRoomNightCommitment" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *       &lt;attribute name="RateOfferType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type }
         *     
         */
        public ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type }
         *     
         */
        public void setType(ArrayOfPoliciesTypePolicyRatePolicy.RatePolicy.Type value) {
            this.type = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getDescription() {
            if (description == null) {
                description = new ArrayList<ParagraphType>();
            }
            return this.description;
        }

        /**
         * 获取subjectToChangeInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSubjectToChangeInd() {
            return subjectToChangeInd;
        }

        /**
         * 设置subjectToChangeInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSubjectToChangeInd(Boolean value) {
            this.subjectToChangeInd = value;
        }

        /**
         * 获取idRequiredInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIDRequiredInd() {
            return idRequiredInd;
        }

        /**
         * 设置idRequiredInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIDRequiredInd(Boolean value) {
            this.idRequiredInd = value;
        }

        /**
         * Gets the value of the guestType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guestType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuestType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGuestType() {
            if (guestType == null) {
                guestType = new ArrayList<String>();
            }
            return this.guestType;
        }

        /**
         * 获取minRoomNightCommitment属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinRoomNightCommitment() {
            return minRoomNightCommitment;
        }

        /**
         * 设置minRoomNightCommitment属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinRoomNightCommitment(BigInteger value) {
            this.minRoomNightCommitment = value;
        }

        /**
         * 获取rateOfferType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateOfferType() {
            return rateOfferType;
        }

        /**
         * 设置rateOfferType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateOfferType(String value) {
            this.rateOfferType = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;RatePlanEnum"&gt;
         *       &lt;attribute name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class Type {

            @XmlValue
            protected RatePlanEnum value;
            @XmlAttribute(name = "Extension")
            protected String extension;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link RatePlanEnum }
             *     
             */
            public RatePlanEnum getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link RatePlanEnum }
             *     
             */
            public void setValue(RatePlanEnum value) {
                this.value = value;
            }

            /**
             * 获取extension属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtension() {
                return extension;
            }

            /**
             * 设置extension属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtension(String value) {
                this.extension = value;
            }

        }

    }

}
