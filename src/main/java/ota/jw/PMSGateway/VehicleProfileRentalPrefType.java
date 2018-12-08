
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleProfileRentalPrefType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleProfileRentalPrefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoyaltyPref" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VendorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentFormPref" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CoveragePref" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SpecialReqPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleSpecialReqPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VehTypePref" type="{http://www.opentravel.org/OTA/2003/05}VehiclePrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialEquipPref" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *       &lt;attribute name="ShareSynchInd"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *             &lt;enumeration value="Inherit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ShareMarketInd"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *             &lt;enumeration value="Inherit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GasPrePay" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleProfileRentalPrefType", propOrder = {
    "loyaltyPref",
    "vendorPref",
    "paymentFormPref",
    "coveragePref",
    "specialReqPref",
    "vehTypePref",
    "specialEquipPref"
})
public class VehicleProfileRentalPrefType {

    @XmlElement(name = "LoyaltyPref")
    protected List<VehicleProfileRentalPrefType.LoyaltyPref> loyaltyPref;
    @XmlElement(name = "VendorPref")
    protected List<CompanyNamePrefType> vendorPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<VehicleProfileRentalPrefType.PaymentFormPref> paymentFormPref;
    @XmlElement(name = "CoveragePref")
    protected List<VehicleProfileRentalPrefType.CoveragePref> coveragePref;
    @XmlElement(name = "SpecialReqPref")
    protected List<VehicleSpecialReqPrefType> specialReqPref;
    @XmlElement(name = "VehTypePref")
    protected List<VehiclePrefType> vehTypePref;
    @XmlElement(name = "SpecialEquipPref")
    protected List<VehicleProfileRentalPrefType.SpecialEquipPref> specialEquipPref;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "GasPrePay")
    protected Boolean gasPrePay;

    /**
     * Gets the value of the loyaltyPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType.LoyaltyPref }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType.LoyaltyPref> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<VehicleProfileRentalPrefType.LoyaltyPref>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNamePrefType }
     * 
     * 
     */
    public List<CompanyNamePrefType> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<CompanyNamePrefType>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType.PaymentFormPref }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType.PaymentFormPref> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<VehicleProfileRentalPrefType.PaymentFormPref>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the coveragePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveragePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveragePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType.CoveragePref }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType.CoveragePref> getCoveragePref() {
        if (coveragePref == null) {
            coveragePref = new ArrayList<VehicleProfileRentalPrefType.CoveragePref>();
        }
        return this.coveragePref;
    }

    /**
     * Gets the value of the specialReqPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialReqPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialReqPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleSpecialReqPrefType }
     * 
     * 
     */
    public List<VehicleSpecialReqPrefType> getSpecialReqPref() {
        if (specialReqPref == null) {
            specialReqPref = new ArrayList<VehicleSpecialReqPrefType>();
        }
        return this.specialReqPref;
    }

    /**
     * Gets the value of the vehTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehiclePrefType }
     * 
     * 
     */
    public List<VehiclePrefType> getVehTypePref() {
        if (vehTypePref == null) {
            vehTypePref = new ArrayList<VehiclePrefType>();
        }
        return this.vehTypePref;
    }

    /**
     * Gets the value of the specialEquipPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleProfileRentalPrefType.SpecialEquipPref }
     * 
     * 
     */
    public List<VehicleProfileRentalPrefType.SpecialEquipPref> getSpecialEquipPref() {
        if (specialEquipPref == null) {
            specialEquipPref = new ArrayList<VehicleProfileRentalPrefType.SpecialEquipPref>();
        }
        return this.specialEquipPref;
    }

    /**
     * 获取preferLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * 设置preferLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    /**
     * 获取shareSynchInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * 设置shareSynchInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * 获取shareMarketInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * 设置shareMarketInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * 获取smokingAllowed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * 设置smokingAllowed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * 获取gasPrePay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGasPrePay() {
        return gasPrePay;
    }

    /**
     * 设置gasPrePay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGasPrePay(Boolean value) {
        this.gasPrePay = value;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CoveragePref {


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
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LoyaltyPref {

        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * 获取rph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * 设置rph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

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
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PaymentFormPref {

        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * 获取rph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * 设置rph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

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
     *       &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpecialEquipPref {

        @XmlAttribute(name = "Action")
        protected ActionType action;

        /**
         * 获取action属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getAction() {
            return action;
        }

        /**
         * 设置action属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setAction(ActionType value) {
            this.action = value;
        }

    }

}
