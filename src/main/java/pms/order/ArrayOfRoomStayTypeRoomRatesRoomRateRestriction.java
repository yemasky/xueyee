package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfRoomStayTypeRoomRatesRoomRateRestriction complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfRoomStayTypeRoomRatesRoomRateRestriction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfRoomStayTypeRoomRatesRoomRateRestriction", propOrder = {
        "restriction"
})
public class ArrayOfRoomStayTypeRoomRatesRoomRateRestriction {

    @XmlElement(name = "Restriction")
    protected List<ArrayOfRoomStayTypeRoomRatesRoomRateRestriction.Restriction> restriction;

    /**
     * Gets the value of the restriction property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestriction().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRoomStayTypeRoomRatesRoomRateRestriction.Restriction }
     */
    public List<ArrayOfRoomStayTypeRoomRatesRoomRateRestriction.Restriction> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<ArrayOfRoomStayTypeRoomRatesRoomRateRestriction.Restriction>();
        }
        return this.restriction;
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
     *         &lt;element name="DOW_Restrictions" type="{http://www.opentravel.org/OTA/2003/05}DOW_RestrictionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "dowRestrictions"
    })
    public static class Restriction {

        @XmlElement(name = "DOW_Restrictions")
        protected DOWRestrictionsType dowRestrictions;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;

        /**
         * ��ȡdowRestrictions���Ե�ֵ��
         *
         * @return possible object is
         * {@link DOWRestrictionsType }
         */
        public DOWRestrictionsType getDOWRestrictions() {
            return dowRestrictions;
        }

        /**
         * ����dowRestrictions���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DOWRestrictionsType }
         */
        public void setDOWRestrictions(DOWRestrictionsType value) {
            this.dowRestrictions = value;
        }

        /**
         * ��ȡeffectiveDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * ����effectiveDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * ��ȡexpireDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * ����expireDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * ��ȡexpireDateExclusiveIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isExpireDateExclusiveIndicator() {
            return expireDateExclusiveIndicator;
        }

        /**
         * ����expireDateExclusiveIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setExpireDateExclusiveIndicator(Boolean value) {
            this.expireDateExclusiveIndicator = value;
        }

    }

}
