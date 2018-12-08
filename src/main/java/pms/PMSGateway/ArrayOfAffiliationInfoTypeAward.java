package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfAffiliationInfoTypeAward complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfAffiliationInfoTypeAward">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Award" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OfficialAppointmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RatingSymbol">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Diamond"/>
 *                       &lt;enumeration value="Star"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfAffiliationInfoTypeAward", propOrder = {
        "award"
})
public class ArrayOfAffiliationInfoTypeAward {

    @XmlElement(name = "Award")
    protected List<ArrayOfAffiliationInfoTypeAward.Award> award;

    /**
     * Gets the value of the award property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAffiliationInfoTypeAward.Award }
     */
    public List<ArrayOfAffiliationInfoTypeAward.Award> getAward() {
        if (award == null) {
            award = new ArrayList<ArrayOfAffiliationInfoTypeAward.Award>();
        }
        return this.award;
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
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OfficialAppointmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RatingSymbol">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Diamond"/>
     *             &lt;enumeration value="Star"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Award {

        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "Date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "Provider")
        protected String provider;
        @XmlAttribute(name = "Rating")
        protected String rating;
        @XmlAttribute(name = "OfficialAppointmentInd")
        protected Boolean officialAppointmentInd;
        @XmlAttribute(name = "RatingSymbol")
        protected String ratingSymbol;
        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * ��ȡremoval���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * ����removal���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * ��ȡdate���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * ����date���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * ��ȡprovider���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getProvider() {
            return provider;
        }

        /**
         * ����provider���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * ��ȡrating���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRating() {
            return rating;
        }

        /**
         * ����rating���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRating(String value) {
            this.rating = value;
        }

        /**
         * ��ȡofficialAppointmentInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isOfficialAppointmentInd() {
            return officialAppointmentInd;
        }

        /**
         * ����officialAppointmentInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setOfficialAppointmentInd(Boolean value) {
            this.officialAppointmentInd = value;
        }

        /**
         * ��ȡratingSymbol���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRatingSymbol() {
            return ratingSymbol;
        }

        /**
         * ����ratingSymbol���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRatingSymbol(String value) {
            this.ratingSymbol = value;
        }

        /**
         * ��ȡrph���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRPH() {
            return rph;
        }

        /**
         * ����rph���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRPH(String value) {
            this.rph = value;
        }

    }

}
