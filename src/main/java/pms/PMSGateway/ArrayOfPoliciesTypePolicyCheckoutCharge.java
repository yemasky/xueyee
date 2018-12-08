package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfPoliciesTypePolicyCheckoutCharge complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfPoliciesTypePolicyCheckoutCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckoutCharge" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Early"/>
 *                       &lt;enumeration value="Late"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfPoliciesTypePolicyCheckoutCharge", propOrder = {
        "checkoutCharge"
})
public class ArrayOfPoliciesTypePolicyCheckoutCharge {

    @XmlElement(name = "CheckoutCharge")
    protected List<ArrayOfPoliciesTypePolicyCheckoutCharge.CheckoutCharge> checkoutCharge;

    /**
     * Gets the value of the checkoutCharge property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkoutCharge property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckoutCharge().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfPoliciesTypePolicyCheckoutCharge.CheckoutCharge }
     */
    public List<ArrayOfPoliciesTypePolicyCheckoutCharge.CheckoutCharge> getCheckoutCharge() {
        if (checkoutCharge == null) {
            checkoutCharge = new ArrayList<ArrayOfPoliciesTypePolicyCheckoutCharge.CheckoutCharge>();
        }
        return this.checkoutCharge;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Early"/>
     *             &lt;enumeration value="Late"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BalanceOfStayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "description"
    })
    public static class CheckoutCharge {

        @XmlElement(name = "Description")
        protected List<ParagraphType> description;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "NmbrOfNights")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger nmbrOfNights;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;
        @XmlAttribute(name = "BalanceOfStayInd")
        protected Boolean balanceOfStayInd;

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
         * ��ȡamount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * ����amount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * ��ȡpercent���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * ����percent���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
        }

        /**
         * ��ȡtype���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getType() {
            return type;
        }

        /**
         * ����type���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setType(String value) {
            this.type = value;
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
         * ��ȡnmbrOfNights���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getNmbrOfNights() {
            return nmbrOfNights;
        }

        /**
         * ����nmbrOfNights���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setNmbrOfNights(BigInteger value) {
            this.nmbrOfNights = value;
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

        /**
         * ��ȡbalanceOfStayInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isBalanceOfStayInd() {
            return balanceOfStayInd;
        }

        /**
         * ����balanceOfStayInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setBalanceOfStayInd(Boolean value) {
            this.balanceOfStayInd = value;
        }

    }

}
