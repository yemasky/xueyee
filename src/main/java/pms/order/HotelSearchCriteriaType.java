package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>HotelSearchCriteriaType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HotelSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Criterion" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriterionType">
 *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AlternateAvailability">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Never"/>
 *                       &lt;enumeration value="WhenUnavailable"/>
 *                       &lt;enumeration value="Always"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="AddressSearchScope">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Primary"/>
 *                       &lt;enumeration value="Alternate"/>
 *                       &lt;enumeration value="PrimaryAndAlternate"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AvailableOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BestOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelSearchCriteriaType", propOrder = {
        "criterion"
})
@XmlSeeAlso({
        pms.order.AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria.class
})
public class HotelSearchCriteriaType {

    @XmlElement(name = "Criterion")
    protected List<HotelSearchCriteriaType.Criterion> criterion;
    @XmlAttribute(name = "AvailableOnlyIndicator")
    protected Boolean availableOnlyIndicator;
    @XmlAttribute(name = "BestOnlyIndicator")
    protected Boolean bestOnlyIndicator;

    /**
     * Gets the value of the criterion property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criterion property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriterion().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriteriaType.Criterion }
     */
    public List<HotelSearchCriteriaType.Criterion> getCriterion() {
        if (criterion == null) {
            criterion = new ArrayList<HotelSearchCriteriaType.Criterion>();
        }
        return this.criterion;
    }

    /**
     * ��ȡavailableOnlyIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAvailableOnlyIndicator() {
        return availableOnlyIndicator;
    }

    /**
     * ����availableOnlyIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAvailableOnlyIndicator(Boolean value) {
        this.availableOnlyIndicator = value;
    }

    /**
     * ��ȡbestOnlyIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBestOnlyIndicator() {
        return bestOnlyIndicator;
    }

    /**
     * ����bestOnlyIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setBestOnlyIndicator(Boolean value) {
        this.bestOnlyIndicator = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriterionType">
     *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AlternateAvailability">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Never"/>
     *             &lt;enumeration value="WhenUnavailable"/>
     *             &lt;enumeration value="Always"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="AddressSearchScope">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Primary"/>
     *             &lt;enumeration value="Alternate"/>
     *             &lt;enumeration value="PrimaryAndAlternate"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Criterion
            extends HotelSearchCriterionType {

        @XmlAttribute(name = "MoreDataEchoToken")
        protected String moreDataEchoToken;
        @XmlAttribute(name = "InfoSource")
        protected String infoSource;
        @XmlAttribute(name = "AlternateAvailability")
        protected String alternateAvailability;
        @XmlAttribute(name = "AddressSearchScope")
        protected String addressSearchScope;

        /**
         * ��ȡmoreDataEchoToken���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMoreDataEchoToken() {
            return moreDataEchoToken;
        }

        /**
         * ����moreDataEchoToken���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMoreDataEchoToken(String value) {
            this.moreDataEchoToken = value;
        }

        /**
         * ��ȡinfoSource���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * ����infoSource���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * ��ȡalternateAvailability���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAlternateAvailability() {
            return alternateAvailability;
        }

        /**
         * ����alternateAvailability���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAlternateAvailability(String value) {
            this.alternateAvailability = value;
        }

        /**
         * ��ȡaddressSearchScope���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAddressSearchScope() {
            return addressSearchScope;
        }

        /**
         * ����addressSearchScope���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAddressSearchScope(String value) {
            this.addressSearchScope = value;
        }

    }

}
