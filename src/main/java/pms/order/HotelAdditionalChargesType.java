package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>HotelAdditionalChargesType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HotelAdditionalChargesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalCharge" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Amount" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RoomAmenityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelAdditionalChargesType", propOrder = {
        "additionalCharge"
})
public class HotelAdditionalChargesType {

    @XmlElement(name = "AdditionalCharge")
    protected List<HotelAdditionalChargesType.AdditionalCharge> additionalCharge;
    @XmlAttribute(name = "AmountBeforeTax")
    protected BigDecimal amountBeforeTax;
    @XmlAttribute(name = "AmountAfterTax")
    protected BigDecimal amountAfterTax;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;

    /**
     * Gets the value of the additionalCharge property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalCharge property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalCharge().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelAdditionalChargesType.AdditionalCharge }
     */
    public List<HotelAdditionalChargesType.AdditionalCharge> getAdditionalCharge() {
        if (additionalCharge == null) {
            additionalCharge = new ArrayList<HotelAdditionalChargesType.AdditionalCharge>();
        }
        return this.additionalCharge;
    }

    /**
     * ��ȡamountBeforeTax���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAmountBeforeTax() {
        return amountBeforeTax;
    }

    /**
     * ����amountBeforeTax���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAmountBeforeTax(BigDecimal value) {
        this.amountBeforeTax = value;
    }

    /**
     * ��ȡamountAfterTax���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAmountAfterTax() {
        return amountAfterTax;
    }

    /**
     * ����amountAfterTax���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAmountAfterTax(BigDecimal value) {
        this.amountAfterTax = value;
    }

    /**
     * ��ȡcurrencyCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * ����currencyCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * ��ȡdecimalPlaces���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * ����decimalPlaces���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
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
     *         &lt;element name="Amount" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="RoomAmenityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "amount"
    })
    public static class AdditionalCharge {

        @XmlElement(name = "Amount")
        protected TotalType amount;
        @XmlAttribute(name = "RoomAmenityCode")
        protected String roomAmenityCode;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;

        /**
         * ��ȡamount���Ե�ֵ��
         *
         * @return possible object is
         * {@link TotalType }
         */
        public TotalType getAmount() {
            return amount;
        }

        /**
         * ����amount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link TotalType }
         */
        public void setAmount(TotalType value) {
            this.amount = value;
        }

        /**
         * ��ȡroomAmenityCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRoomAmenityCode() {
            return roomAmenityCode;
        }

        /**
         * ����roomAmenityCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRoomAmenityCode(String value) {
            this.roomAmenityCode = value;
        }

        /**
         * ��ȡquantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * ����quantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

    }

}
