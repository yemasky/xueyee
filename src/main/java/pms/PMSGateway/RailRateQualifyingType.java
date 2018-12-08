package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>RailRateQualifyingType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RailRateQualifyingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelPurpose" type="{http://www.opentravel.org/OTA/2003/05}TravelPurposeType" minOccurs="0"/>
 *         &lt;element name="DiscountType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailRateQualifyingType", propOrder = {
        "travelPurpose",
        "discountType"
})
public class RailRateQualifyingType {

    @XmlElement(name = "TravelPurpose")
    protected TravelPurposeType travelPurpose;
    @XmlElement(name = "DiscountType")
    protected RailRateQualifyingType.DiscountType discountType;
    @XmlAttribute(name = "PromotionCode")
    protected String promotionCode;

    /**
     * ��ȡtravelPurpose���Ե�ֵ��
     *
     * @return possible object is
     * {@link TravelPurposeType }
     */
    public TravelPurposeType getTravelPurpose() {
        return travelPurpose;
    }

    /**
     * ����travelPurpose���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TravelPurposeType }
     */
    public void setTravelPurpose(TravelPurposeType value) {
        this.travelPurpose = value;
    }

    /**
     * ��ȡdiscountType���Ե�ֵ��
     *
     * @return possible object is
     * {@link RailRateQualifyingType.DiscountType }
     */
    public RailRateQualifyingType.DiscountType getDiscountType() {
        return discountType;
    }

    /**
     * ����discountType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RailRateQualifyingType.DiscountType }
     */
    public void setDiscountType(RailRateQualifyingType.DiscountType value) {
        this.discountType = value;
    }

    /**
     * ��ȡpromotionCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * ����promotionCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DiscountType {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

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

    }

}
