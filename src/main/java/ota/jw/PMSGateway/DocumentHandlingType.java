
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>DocumentHandlingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocumentHandlingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorOption" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DocumentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DeliveryMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocumentDestination" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SelectedOptionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DefaultIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AddressRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AddressRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EmailRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TelephoneRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocumentLanguage" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentHandlingType", propOrder = {
    "vendorOption"
})
public class DocumentHandlingType {

    @XmlElement(name = "VendorOption")
    protected List<DocumentHandlingType.VendorOption> vendorOption;
    @XmlAttribute(name = "DocumentTypeCode")
    protected String documentTypeCode;
    @XmlAttribute(name = "DeliveryMethodCode")
    protected String deliveryMethodCode;
    @XmlAttribute(name = "DocumentDestination")
    protected String documentDestination;
    @XmlAttribute(name = "SelectedOptionIndicator")
    protected Boolean selectedOptionIndicator;
    @XmlAttribute(name = "DefaultIndicator")
    protected Boolean defaultIndicator;
    @XmlAttribute(name = "AddressRequiredIndicator")
    protected Boolean addressRequiredIndicator;
    @XmlAttribute(name = "AddressRPH")
    protected String addressRPH;
    @XmlAttribute(name = "EmailRPH")
    protected String emailRPH;
    @XmlAttribute(name = "TelephoneRPH")
    protected String telephoneRPH;
    @XmlAttribute(name = "DocumentLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String documentLanguage;

    /**
     * Gets the value of the vendorOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentHandlingType.VendorOption }
     * 
     * 
     */
    public List<DocumentHandlingType.VendorOption> getVendorOption() {
        if (vendorOption == null) {
            vendorOption = new ArrayList<DocumentHandlingType.VendorOption>();
        }
        return this.vendorOption;
    }

    /**
     * 获取documentTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * 设置documentTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeCode(String value) {
        this.documentTypeCode = value;
    }

    /**
     * 获取deliveryMethodCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethodCode() {
        return deliveryMethodCode;
    }

    /**
     * 设置deliveryMethodCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethodCode(String value) {
        this.deliveryMethodCode = value;
    }

    /**
     * 获取documentDestination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDestination() {
        return documentDestination;
    }

    /**
     * 设置documentDestination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDestination(String value) {
        this.documentDestination = value;
    }

    /**
     * 获取selectedOptionIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectedOptionIndicator() {
        return selectedOptionIndicator;
    }

    /**
     * 设置selectedOptionIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectedOptionIndicator(Boolean value) {
        this.selectedOptionIndicator = value;
    }

    /**
     * 获取defaultIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * 设置defaultIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultIndicator(Boolean value) {
        this.defaultIndicator = value;
    }

    /**
     * 获取addressRequiredIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressRequiredIndicator() {
        return addressRequiredIndicator;
    }

    /**
     * 设置addressRequiredIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressRequiredIndicator(Boolean value) {
        this.addressRequiredIndicator = value;
    }

    /**
     * 获取addressRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRPH() {
        return addressRPH;
    }

    /**
     * 设置addressRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRPH(String value) {
        this.addressRPH = value;
    }

    /**
     * 获取emailRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailRPH() {
        return emailRPH;
    }

    /**
     * 设置emailRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailRPH(String value) {
        this.emailRPH = value;
    }

    /**
     * 获取telephoneRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneRPH() {
        return telephoneRPH;
    }

    /**
     * 设置telephoneRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneRPH(String value) {
        this.telephoneRPH = value;
    }

    /**
     * 获取documentLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentLanguage() {
        return documentLanguage;
    }

    /**
     * 设置documentLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentLanguage(String value) {
        this.documentLanguage = value;
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
     *       &lt;attribute name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VendorOption {

        @XmlAttribute(name = "VendorName")
        protected String vendorName;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

        /**
         * 获取vendorName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorName() {
            return vendorName;
        }

        /**
         * 设置vendorName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorName(String value) {
            this.vendorName = value;
        }

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

    }

}
