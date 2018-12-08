
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SailingCategoryInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SailingCategoryInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SailingInfoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectedCategory" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute" minOccurs="0"/&gt;
 *                   &lt;element name="SelectedCabin" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="WaitlistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="FareCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailingCategoryInfoType", propOrder = {
    "selectedCategory"
})
public class SailingCategoryInfoType
    extends SailingInfoType
{

    @XmlElement(name = "SelectedCategory")
    protected List<SailingCategoryInfoType.SelectedCategory> selectedCategory;

    /**
     * Gets the value of the selectedCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SailingCategoryInfoType.SelectedCategory }
     * 
     * 
     */
    public List<SailingCategoryInfoType.SelectedCategory> getSelectedCategory() {
        if (selectedCategory == null) {
            selectedCategory = new ArrayList<SailingCategoryInfoType.SelectedCategory>();
        }
        return this.selectedCategory;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute" minOccurs="0"/&gt;
     *         &lt;element name="SelectedCabin" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="WaitlistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="FareCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取cabinAttributes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute }
         *     
         */
        public ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute getCabinAttributes() {
            return cabinAttributes;
        }

        /**
         * 设置cabinAttributes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute }
         *     
         */
        public void setCabinAttributes(ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute value) {
            this.cabinAttributes = value;
        }

        /**
         * Gets the value of the selectedCabin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedCabin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedCabin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin }
         * 
         * 
         */
        public List<SailingCategoryInfoType.SelectedCategory.SelectedCabin> getSelectedCabin() {
            if (selectedCabin == null) {
                selectedCabin = new ArrayList<SailingCategoryInfoType.SelectedCategory.SelectedCabin>();
            }
            return this.selectedCabin;
        }

        /**
         * 获取waitlistIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWaitlistIndicator() {
            return waitlistIndicator;
        }

        /**
         * 设置waitlistIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWaitlistIndicator(Boolean value) {
            this.waitlistIndicator = value;
        }

        /**
         * 获取fareCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCode() {
            return fareCode;
        }

        /**
         * 设置fareCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCode(String value) {
            this.fareCode = value;
        }

        /**
         * 获取groupCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupCode() {
            return groupCode;
        }

        /**
         * 设置groupCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupCode(String value) {
            this.groupCode = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cabinAttributes"
        })
        public static class SelectedCabin
            extends CabinOptionType
        {

            @XmlElement(name = "CabinAttributes")
            protected ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute cabinAttributes;

            /**
             * 获取cabinAttributes属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute }
             *     
             */
            public ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute getCabinAttributes() {
                return cabinAttributes;
            }

            /**
             * 设置cabinAttributes属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute }
             *     
             */
            public void setCabinAttributes(ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute value) {
                this.cabinAttributes = value;
            }

        }

    }

}
