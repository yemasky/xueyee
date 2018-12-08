package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>SailingCategoryInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="SailingCategoryInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SailingInfoType">
 *       &lt;sequence>
 *         &lt;element name="SelectedCategory" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute" minOccurs="0"/>
 *                   &lt;element name="SelectedCabin" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType">
 *                           &lt;sequence>
 *                             &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="WaitlistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="FareCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailingCategoryInfoType", propOrder = {
        "selectedCategory"
})
public class SailingCategoryInfoType
        extends SailingInfoType {

    @XmlElement(name = "SelectedCategory")
    protected List<SailingCategoryInfoType.SelectedCategory> selectedCategory;

    /**
     * Gets the value of the selectedCategory property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedCategory property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedCategory().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link SailingCategoryInfoType.SelectedCategory }
     */
    public List<SailingCategoryInfoType.SelectedCategory> getSelectedCategory() {
        if (selectedCategory == null) {
            selectedCategory = new ArrayList<SailingCategoryInfoType.SelectedCategory>();
        }
        return this.selectedCategory;
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
     *         &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute" minOccurs="0"/>
     *         &lt;element name="SelectedCabin" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType">
     *                 &lt;sequence>
     *                   &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="WaitlistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="FareCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "cabinAttributes",
            "selectedCabin"
    })
    public static class SelectedCategory {

        @XmlElement(name = "CabinAttributes")
        protected ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute cabinAttributes;
        @XmlElement(name = "SelectedCabin")
        protected List<SailingCategoryInfoType.SelectedCategory.SelectedCabin> selectedCabin;
        @XmlAttribute(name = "WaitlistIndicator")
        protected Boolean waitlistIndicator;
        @XmlAttribute(name = "FareCode")
        protected String fareCode;
        @XmlAttribute(name = "GroupCode")
        protected String groupCode;

        /**
         * ��ȡcabinAttributes���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute }
         */
        public ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute getCabinAttributes() {
            return cabinAttributes;
        }

        /**
         * ����cabinAttributes���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute }
         */
        public void setCabinAttributes(ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute value) {
            this.cabinAttributes = value;
        }

        /**
         * Gets the value of the selectedCabin property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedCabin property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedCabin().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin }
         */
        public List<SailingCategoryInfoType.SelectedCategory.SelectedCabin> getSelectedCabin() {
            if (selectedCabin == null) {
                selectedCabin = new ArrayList<SailingCategoryInfoType.SelectedCategory.SelectedCabin>();
            }
            return this.selectedCabin;
        }

        /**
         * ��ȡwaitlistIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isWaitlistIndicator() {
            return waitlistIndicator;
        }

        /**
         * ����waitlistIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setWaitlistIndicator(Boolean value) {
            this.waitlistIndicator = value;
        }

        /**
         * ��ȡfareCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getFareCode() {
            return fareCode;
        }

        /**
         * ����fareCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setFareCode(String value) {
            this.fareCode = value;
        }

        /**
         * ��ȡgroupCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getGroupCode() {
            return groupCode;
        }

        /**
         * ����groupCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGroupCode(String value) {
            this.groupCode = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * <p/>
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType">
         *       &lt;sequence>
         *         &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "cabinAttributes"
        })
        public static class SelectedCabin
                extends CabinOptionType {

            @XmlElement(name = "CabinAttributes")
            protected ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute cabinAttributes;

            /**
             * ��ȡcabinAttributes���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute }
             */
            public ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute getCabinAttributes() {
                return cabinAttributes;
            }

            /**
             * ����cabinAttributes���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute }
             */
            public void setCabinAttributes(ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute value) {
                this.cabinAttributes = value;
            }

        }

    }

}
