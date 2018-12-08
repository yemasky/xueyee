package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfHotelDescriptiveContentTypePromotion complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfHotelDescriptiveContentTypePromotion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Promotion" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}DescriptionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PkgOrPromotion">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Package"/>
 *                       &lt;enumeration value="Promotion"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
@XmlType(name = "ArrayOfHotelDescriptiveContentTypePromotion", propOrder = {
        "promotion"
})
public class ArrayOfHotelDescriptiveContentTypePromotion {

    @XmlElement(name = "Promotion")
    protected List<ArrayOfHotelDescriptiveContentTypePromotion.Promotion> promotion;

    /**
     * Gets the value of the promotion property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotion property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotion().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelDescriptiveContentTypePromotion.Promotion }
     */
    public List<ArrayOfHotelDescriptiveContentTypePromotion.Promotion> getPromotion() {
        if (promotion == null) {
            promotion = new ArrayList<ArrayOfHotelDescriptiveContentTypePromotion.Promotion>();
        }
        return this.promotion;
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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}DescriptionType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="PkgOrPromotion">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Package"/>
     *             &lt;enumeration value="Promotion"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "description"
    })
    public static class Promotion {

        @XmlElement(name = "Description")
        protected DescriptionType description;
        @XmlAttribute(name = "PkgOrPromotion")
        protected String pkgOrPromotion;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Title")
        protected String title;
        @XmlAttribute(name = "MinLOS")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minLOS;
        @XmlAttribute(name = "Mon")
        protected Boolean mon;
        @XmlAttribute(name = "Tue")
        protected Boolean tue;
        @XmlAttribute(name = "Weds")
        protected Boolean weds;
        @XmlAttribute(name = "Thur")
        protected Boolean thur;
        @XmlAttribute(name = "Fri")
        protected Boolean fri;
        @XmlAttribute(name = "Sat")
        protected Boolean sat;
        @XmlAttribute(name = "Sun")
        protected Boolean sun;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "Remarks")
        protected String remarks;
        @XmlAttribute(name = "SortOrder")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger sortOrder;

        /**
         * ��ȡdescription���Ե�ֵ��
         *
         * @return possible object is
         * {@link DescriptionType }
         */
        public DescriptionType getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DescriptionType }
         */
        public void setDescription(DescriptionType value) {
            this.description = value;
        }

        /**
         * ��ȡpkgOrPromotion���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPkgOrPromotion() {
            return pkgOrPromotion;
        }

        /**
         * ����pkgOrPromotion���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPkgOrPromotion(String value) {
            this.pkgOrPromotion = value;
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
         * ��ȡtitle���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTitle() {
            return title;
        }

        /**
         * ����title���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * ��ȡminLOS���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMinLOS() {
            return minLOS;
        }

        /**
         * ����minLOS���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMinLOS(BigInteger value) {
            this.minLOS = value;
        }

        /**
         * ��ȡmon���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * ����mon���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * ��ȡtue���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * ����tue���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * ��ȡweds���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isWeds() {
            return weds;
        }

        /**
         * ����weds���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setWeds(Boolean value) {
            this.weds = value;
        }

        /**
         * ��ȡthur���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isThur() {
            return thur;
        }

        /**
         * ����thur���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setThur(Boolean value) {
            this.thur = value;
        }

        /**
         * ��ȡfri���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * ����fri���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * ��ȡsat���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * ����sat���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setSat(Boolean value) {
            this.sat = value;
        }

        /**
         * ��ȡsun���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * ����sun���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setSun(Boolean value) {
            this.sun = value;
        }

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
         * ��ȡremarks���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRemarks() {
            return remarks;
        }

        /**
         * ����remarks���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRemarks(String value) {
            this.remarks = value;
        }

        /**
         * ��ȡsortOrder���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getSortOrder() {
            return sortOrder;
        }

        /**
         * ����sortOrder���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setSortOrder(BigInteger value) {
            this.sortOrder = value;
        }

    }

}
