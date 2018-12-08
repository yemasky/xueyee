package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfSellableProductsTypeSellableProductDestinationSystemCode complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfSellableProductsTypeSellableProductDestinationSystemCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationSystemCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="ChainRateLevelCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ChainRateCodeCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSellableProductsTypeSellableProductDestinationSystemCode", propOrder = {
        "destinationSystemCode"
})
public class ArrayOfSellableProductsTypeSellableProductDestinationSystemCode {

    @XmlElement(name = "DestinationSystemCode")
    protected List<ArrayOfSellableProductsTypeSellableProductDestinationSystemCode.DestinationSystemCode> destinationSystemCode;

    /**
     * Gets the value of the destinationSystemCode property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationSystemCode property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationSystemCode().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSellableProductsTypeSellableProductDestinationSystemCode.DestinationSystemCode }
     */
    public List<ArrayOfSellableProductsTypeSellableProductDestinationSystemCode.DestinationSystemCode> getDestinationSystemCode() {
        if (destinationSystemCode == null) {
            destinationSystemCode = new ArrayList<ArrayOfSellableProductsTypeSellableProductDestinationSystemCode.DestinationSystemCode>();
        }
        return this.destinationSystemCode;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="ChainRateLevelCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ChainRateCodeCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    public static class DestinationSystemCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ChainRateLevelCrossRef")
        protected String chainRateLevelCrossRef;
        @XmlAttribute(name = "ChainRateCodeCrossRef")
        protected String chainRateCodeCrossRef;

        /**
         * ��ȡvalue���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * ��ȡchainRateLevelCrossRef���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getChainRateLevelCrossRef() {
            return chainRateLevelCrossRef;
        }

        /**
         * ����chainRateLevelCrossRef���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setChainRateLevelCrossRef(String value) {
            this.chainRateLevelCrossRef = value;
        }

        /**
         * ��ȡchainRateCodeCrossRef���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getChainRateCodeCrossRef() {
            return chainRateCodeCrossRef;
        }

        /**
         * ����chainRateCodeCrossRef���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setChainRateCodeCrossRef(String value) {
            this.chainRateCodeCrossRef = value;
        }

    }

}
