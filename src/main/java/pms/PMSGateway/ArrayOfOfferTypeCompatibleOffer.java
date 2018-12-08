package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfOfferTypeCompatibleOffer complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfOfferTypeCompatibleOffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompatibleOffer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="OfferRPH">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="IncompatibleOfferIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfOfferTypeCompatibleOffer", propOrder = {
        "compatibleOffer"
})
public class ArrayOfOfferTypeCompatibleOffer {

    @XmlElement(name = "CompatibleOffer")
    protected List<ArrayOfOfferTypeCompatibleOffer.CompatibleOffer> compatibleOffer;

    /**
     * Gets the value of the compatibleOffer property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibleOffer property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibleOffer().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOfferTypeCompatibleOffer.CompatibleOffer }
     */
    public List<ArrayOfOfferTypeCompatibleOffer.CompatibleOffer> getCompatibleOffer() {
        if (compatibleOffer == null) {
            compatibleOffer = new ArrayList<ArrayOfOfferTypeCompatibleOffer.CompatibleOffer>();
        }
        return this.compatibleOffer;
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
     *       &lt;attribute name="OfferRPH">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="IncompatibleOfferIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CompatibleOffer {

        @XmlAttribute(name = "OfferRPH")
        protected List<String> offerRPH;
        @XmlAttribute(name = "IncompatibleOfferIndicator")
        protected Boolean incompatibleOfferIndicator;

        /**
         * Gets the value of the offerRPH property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerRPH property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferRPH().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getOfferRPH() {
            if (offerRPH == null) {
                offerRPH = new ArrayList<String>();
            }
            return this.offerRPH;
        }

        /**
         * ��ȡincompatibleOfferIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isIncompatibleOfferIndicator() {
            return incompatibleOfferIndicator;
        }

        /**
         * ����incompatibleOfferIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setIncompatibleOfferIndicator(Boolean value) {
            this.incompatibleOfferIndicator = value;
        }

    }

}
