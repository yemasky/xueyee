package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfPoliciesTypePolicyStayRequirement complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfPoliciesTypePolicyStayRequirement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StayRequirement" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="StayContext">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Checkin"/>
 *                       &lt;enumeration value="Checkout"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "ArrayOfPoliciesTypePolicyStayRequirement", propOrder = {
        "stayRequirement"
})
public class ArrayOfPoliciesTypePolicyStayRequirement {

    @XmlElement(name = "StayRequirement")
    protected List<ArrayOfPoliciesTypePolicyStayRequirement.StayRequirement> stayRequirement;

    /**
     * Gets the value of the stayRequirement property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stayRequirement property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStayRequirement().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfPoliciesTypePolicyStayRequirement.StayRequirement }
     */
    public List<ArrayOfPoliciesTypePolicyStayRequirement.StayRequirement> getStayRequirement() {
        if (stayRequirement == null) {
            stayRequirement = new ArrayList<ArrayOfPoliciesTypePolicyStayRequirement.StayRequirement>();
        }
        return this.stayRequirement;
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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="StayContext">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Checkin"/>
     *             &lt;enumeration value="Checkout"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "description"
    })
    public static class StayRequirement {

        @XmlElement(name = "Description")
        protected ParagraphType description;
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
        @XmlAttribute(name = "MinLOS")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minLOS;
        @XmlAttribute(name = "MaxLOS")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxLOS;
        @XmlAttribute(name = "StayContext")
        protected String stayContext;

        /**
         * ��ȡdescription���Ե�ֵ��
         *
         * @return possible object is
         * {@link ParagraphType }
         */
        public ParagraphType getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ParagraphType }
         */
        public void setDescription(ParagraphType value) {
            this.description = value;
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
         * ��ȡmaxLOS���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaxLOS() {
            return maxLOS;
        }

        /**
         * ����maxLOS���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaxLOS(BigInteger value) {
            this.maxLOS = value;
        }

        /**
         * ��ȡstayContext���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStayContext() {
            return stayContext;
        }

        /**
         * ����stayContext���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStayContext(String value) {
            this.stayContext = value;
        }

    }

}
