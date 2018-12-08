package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>DocumentHandlingType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="DocumentHandlingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorOption" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="DocumentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DeliveryMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DocumentDestination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SelectedOptionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DefaultIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AddressRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AddressRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EmailRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TelephoneRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DocumentLanguage" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorOption property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorOption().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentHandlingType.VendorOption }
     */
    public List<DocumentHandlingType.VendorOption> getVendorOption() {
        if (vendorOption == null) {
            vendorOption = new ArrayList<DocumentHandlingType.VendorOption>();
        }
        return this.vendorOption;
    }

    /**
     * ��ȡdocumentTypeCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * ����documentTypeCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocumentTypeCode(String value) {
        this.documentTypeCode = value;
    }

    /**
     * ��ȡdeliveryMethodCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeliveryMethodCode() {
        return deliveryMethodCode;
    }

    /**
     * ����deliveryMethodCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeliveryMethodCode(String value) {
        this.deliveryMethodCode = value;
    }

    /**
     * ��ȡdocumentDestination���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocumentDestination() {
        return documentDestination;
    }

    /**
     * ����documentDestination���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocumentDestination(String value) {
        this.documentDestination = value;
    }

    /**
     * ��ȡselectedOptionIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSelectedOptionIndicator() {
        return selectedOptionIndicator;
    }

    /**
     * ����selectedOptionIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSelectedOptionIndicator(Boolean value) {
        this.selectedOptionIndicator = value;
    }

    /**
     * ��ȡdefaultIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * ����defaultIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDefaultIndicator(Boolean value) {
        this.defaultIndicator = value;
    }

    /**
     * ��ȡaddressRequiredIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAddressRequiredIndicator() {
        return addressRequiredIndicator;
    }

    /**
     * ����addressRequiredIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAddressRequiredIndicator(Boolean value) {
        this.addressRequiredIndicator = value;
    }

    /**
     * ��ȡaddressRPH���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddressRPH() {
        return addressRPH;
    }

    /**
     * ����addressRPH���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddressRPH(String value) {
        this.addressRPH = value;
    }

    /**
     * ��ȡemailRPH���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmailRPH() {
        return emailRPH;
    }

    /**
     * ����emailRPH���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmailRPH(String value) {
        this.emailRPH = value;
    }

    /**
     * ��ȡtelephoneRPH���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTelephoneRPH() {
        return telephoneRPH;
    }

    /**
     * ����telephoneRPH���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTelephoneRPH(String value) {
        this.telephoneRPH = value;
    }

    /**
     * ��ȡdocumentLanguage���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocumentLanguage() {
        return documentLanguage;
    }

    /**
     * ����documentLanguage���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocumentLanguage(String value) {
        this.documentLanguage = value;
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
     *       &lt;attribute name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VendorOption {

        @XmlAttribute(name = "VendorName")
        protected String vendorName;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

        /**
         * ��ȡvendorName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVendorName() {
            return vendorName;
        }

        /**
         * ����vendorName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVendorName(String value) {
            this.vendorName = value;
        }

        /**
         * ��ȡamount���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * ����amount���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

    }

}
