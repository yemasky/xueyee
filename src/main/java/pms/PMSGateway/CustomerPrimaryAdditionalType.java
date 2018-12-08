package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CustomerPrimaryAdditionalType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CustomerPrimaryAdditionalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Primary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Additional" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType">
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CorpDiscountName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="QualificationMethod">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="RT_AirlineTicket"/>
 *                       &lt;enumeration value="CreditCard"/>
 *                       &lt;enumeration value="PassportAndReturnTkt"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
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
@XmlType(name = "CustomerPrimaryAdditionalType", propOrder = {
        "primary",
        "additional"
})
public class CustomerPrimaryAdditionalType {

    @XmlElement(name = "Primary")
    protected CustomerPrimaryAdditionalType.Primary primary;
    @XmlElement(name = "Additional")
    protected List<CustomerPrimaryAdditionalType.Additional> additional;

    /**
     * ��ȡprimary���Ե�ֵ��
     *
     * @return possible object is
     * {@link CustomerPrimaryAdditionalType.Primary }
     */
    public CustomerPrimaryAdditionalType.Primary getPrimary() {
        return primary;
    }

    /**
     * ����primary���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CustomerPrimaryAdditionalType.Primary }
     */
    public void setPrimary(CustomerPrimaryAdditionalType.Primary value) {
        this.primary = value;
    }

    /**
     * Gets the value of the additional property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additional property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditional().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPrimaryAdditionalType.Additional }
     */
    public List<CustomerPrimaryAdditionalType.Additional> getAdditional() {
        if (additional == null) {
            additional = new ArrayList<CustomerPrimaryAdditionalType.Additional>();
        }
        return this.additional;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType">
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CorpDiscountName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="QualificationMethod">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="RT_AirlineTicket"/>
     *             &lt;enumeration value="CreditCard"/>
     *             &lt;enumeration value="PassportAndReturnTkt"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Additional
            extends CustomerType {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "CorpDiscountName")
        protected String corpDiscountName;
        @XmlAttribute(name = "CorpDiscountNmbr")
        protected String corpDiscountNmbr;
        @XmlAttribute(name = "QualificationMethod")
        protected String qualificationMethod;
        @XmlAttribute(name = "Age")
        protected BigInteger age;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;

        /**
         * ��ȡstart���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStart() {
            return start;
        }

        /**
         * ����start���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * ��ȡduration���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDuration() {
            return duration;
        }

        /**
         * ����duration���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * ��ȡend���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEnd() {
            return end;
        }

        /**
         * ����end���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * ��ȡcorpDiscountName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCorpDiscountName() {
            return corpDiscountName;
        }

        /**
         * ����corpDiscountName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCorpDiscountName(String value) {
            this.corpDiscountName = value;
        }

        /**
         * ��ȡcorpDiscountNmbr���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCorpDiscountNmbr() {
            return corpDiscountNmbr;
        }

        /**
         * ����corpDiscountNmbr���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCorpDiscountNmbr(String value) {
            this.corpDiscountNmbr = value;
        }

        /**
         * ��ȡqualificationMethod���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getQualificationMethod() {
            return qualificationMethod;
        }

        /**
         * ����qualificationMethod���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setQualificationMethod(String value) {
            this.qualificationMethod = value;
        }

        /**
         * ��ȡage���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getAge() {
            return age;
        }

        /**
         * ����age���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setAge(BigInteger value) {
            this.age = value;
        }

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * ��ȡcodeContext���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * ����codeContext���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
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

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType">
     *       &lt;sequence>
     *         &lt;element name="CustomerID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "customerID"
    })
    public static class Primary
            extends CustomerType {

        @XmlElement(name = "CustomerID")
        protected UniqueIDType customerID;

        /**
         * ��ȡcustomerID���Ե�ֵ��
         *
         * @return possible object is
         * {@link UniqueIDType }
         */
        public UniqueIDType getCustomerID() {
            return customerID;
        }

        /**
         * ����customerID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link UniqueIDType }
         */
        public void setCustomerID(UniqueIDType value) {
            this.customerID = value;
        }

    }

}
