
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OfferType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeOfferRule" minOccurs="0"/&gt;
 *         &lt;element name="Discount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="NightsRequired" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="NightsDiscounted" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="DiscountPattern" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="ChargeUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FreeUpgrade" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UpgradeFrom" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="InvCodeApplication"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="DoesNotApply"/&gt;
 *                                 &lt;enumeration value="InvCode"/&gt;
 *                                 &lt;enumeration value="InvGroupingCode"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UpgradeTo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="InvCodeApplication"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="DoesNotApply"/&gt;
 *                                 &lt;enumeration value="InvCode"/&gt;
 *                                 &lt;enumeration value="InvGroupingCode"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="UpgradeBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OfferDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *         &lt;element name="CompatibleOffers" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeCompatibleOffer" minOccurs="0"/&gt;
 *         &lt;element name="Inventories" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeInventory" minOccurs="0"/&gt;
 *         &lt;element name="Guests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeGuest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ApplicationOrder" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType", propOrder = {
    "offerRules",
    "discount",
    "freeUpgrade",
    "offerDescription",
    "compatibleOffers",
    "inventories",
    "guests"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.ArrayOfHotelRatePlanTypeOffer.Offer.class
})
public class OfferType {

    @XmlElement(name = "OfferRules")
    protected ArrayOfOfferTypeOfferRule offerRules;
    @XmlElement(name = "Discount")
    protected OfferType.Discount discount;
    @XmlElement(name = "FreeUpgrade")
    protected OfferType.FreeUpgrade freeUpgrade;
    @XmlElement(name = "OfferDescription")
    protected ParagraphType offerDescription;
    @XmlElement(name = "CompatibleOffers")
    protected ArrayOfOfferTypeCompatibleOffer compatibleOffers;
    @XmlElement(name = "Inventories")
    protected ArrayOfOfferTypeInventory inventories;
    @XmlElement(name = "Guests")
    protected ArrayOfOfferTypeGuest guests;
    @XmlAttribute(name = "OfferCode")
    protected String offerCode;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ApplicationOrder")
    protected BigInteger applicationOrder;

    /**
     * 获取offerRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferTypeOfferRule }
     *     
     */
    public ArrayOfOfferTypeOfferRule getOfferRules() {
        return offerRules;
    }

    /**
     * 设置offerRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferTypeOfferRule }
     *     
     */
    public void setOfferRules(ArrayOfOfferTypeOfferRule value) {
        this.offerRules = value;
    }

    /**
     * 获取discount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OfferType.Discount }
     *     
     */
    public OfferType.Discount getDiscount() {
        return discount;
    }

    /**
     * 设置discount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType.Discount }
     *     
     */
    public void setDiscount(OfferType.Discount value) {
        this.discount = value;
    }

    /**
     * 获取freeUpgrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OfferType.FreeUpgrade }
     *     
     */
    public OfferType.FreeUpgrade getFreeUpgrade() {
        return freeUpgrade;
    }

    /**
     * 设置freeUpgrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType.FreeUpgrade }
     *     
     */
    public void setFreeUpgrade(OfferType.FreeUpgrade value) {
        this.freeUpgrade = value;
    }

    /**
     * 获取offerDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getOfferDescription() {
        return offerDescription;
    }

    /**
     * 设置offerDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setOfferDescription(ParagraphType value) {
        this.offerDescription = value;
    }

    /**
     * 获取compatibleOffers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferTypeCompatibleOffer }
     *     
     */
    public ArrayOfOfferTypeCompatibleOffer getCompatibleOffers() {
        return compatibleOffers;
    }

    /**
     * 设置compatibleOffers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferTypeCompatibleOffer }
     *     
     */
    public void setCompatibleOffers(ArrayOfOfferTypeCompatibleOffer value) {
        this.compatibleOffers = value;
    }

    /**
     * 获取inventories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferTypeInventory }
     *     
     */
    public ArrayOfOfferTypeInventory getInventories() {
        return inventories;
    }

    /**
     * 设置inventories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferTypeInventory }
     *     
     */
    public void setInventories(ArrayOfOfferTypeInventory value) {
        this.inventories = value;
    }

    /**
     * 获取guests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferTypeGuest }
     *     
     */
    public ArrayOfOfferTypeGuest getGuests() {
        return guests;
    }

    /**
     * 设置guests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferTypeGuest }
     *     
     */
    public void setGuests(ArrayOfOfferTypeGuest value) {
        this.guests = value;
    }

    /**
     * 获取offerCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * 设置offerCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
    }

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

    /**
     * 获取applicationOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationOrder() {
        return applicationOrder;
    }

    /**
     * 设置applicationOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationOrder(BigInteger value) {
        this.applicationOrder = value;
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
     *       &lt;attribute name="NightsRequired" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="NightsDiscounted" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="DiscountPattern" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="ChargeUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Discount {

        @XmlAttribute(name = "NightsRequired")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger nightsRequired;
        @XmlAttribute(name = "NightsDiscounted")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger nightsDiscounted;
        @XmlAttribute(name = "DiscountPattern")
        protected String discountPattern;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "ChargeUnitCode")
        protected String chargeUnitCode;

        /**
         * 获取nightsRequired属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNightsRequired() {
            return nightsRequired;
        }

        /**
         * 设置nightsRequired属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNightsRequired(BigInteger value) {
            this.nightsRequired = value;
        }

        /**
         * 获取nightsDiscounted属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNightsDiscounted() {
            return nightsDiscounted;
        }

        /**
         * 设置nightsDiscounted属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNightsDiscounted(BigInteger value) {
            this.nightsDiscounted = value;
        }

        /**
         * 获取discountPattern属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscountPattern() {
            return discountPattern;
        }

        /**
         * 设置discountPattern属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscountPattern(String value) {
            this.discountPattern = value;
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

        /**
         * 获取percent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * 设置percent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
        }

        /**
         * 获取chargeUnitCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargeUnitCode() {
            return chargeUnitCode;
        }

        /**
         * 设置chargeUnitCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargeUnitCode(String value) {
            this.chargeUnitCode = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="UpgradeFrom" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="InvCodeApplication"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="DoesNotApply"/&gt;
     *                       &lt;enumeration value="InvCode"/&gt;
     *                       &lt;enumeration value="InvGroupingCode"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="UpgradeTo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="InvCodeApplication"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="DoesNotApply"/&gt;
     *                       &lt;enumeration value="InvCode"/&gt;
     *                       &lt;enumeration value="InvGroupingCode"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="UpgradeBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "upgradeFrom",
        "upgradeTo"
    })
    public static class FreeUpgrade {

        @XmlElement(name = "UpgradeFrom")
        protected OfferType.FreeUpgrade.UpgradeFrom upgradeFrom;
        @XmlElement(name = "UpgradeTo")
        protected OfferType.FreeUpgrade.UpgradeTo upgradeTo;
        @XmlAttribute(name = "UpgradeBookingCode")
        protected String upgradeBookingCode;

        /**
         * 获取upgradeFrom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OfferType.FreeUpgrade.UpgradeFrom }
         *     
         */
        public OfferType.FreeUpgrade.UpgradeFrom getUpgradeFrom() {
            return upgradeFrom;
        }

        /**
         * 设置upgradeFrom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OfferType.FreeUpgrade.UpgradeFrom }
         *     
         */
        public void setUpgradeFrom(OfferType.FreeUpgrade.UpgradeFrom value) {
            this.upgradeFrom = value;
        }

        /**
         * 获取upgradeTo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OfferType.FreeUpgrade.UpgradeTo }
         *     
         */
        public OfferType.FreeUpgrade.UpgradeTo getUpgradeTo() {
            return upgradeTo;
        }

        /**
         * 设置upgradeTo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OfferType.FreeUpgrade.UpgradeTo }
         *     
         */
        public void setUpgradeTo(OfferType.FreeUpgrade.UpgradeTo value) {
            this.upgradeTo = value;
        }

        /**
         * 获取upgradeBookingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUpgradeBookingCode() {
            return upgradeBookingCode;
        }

        /**
         * 设置upgradeBookingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUpgradeBookingCode(String value) {
            this.upgradeBookingCode = value;
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
         *       &lt;attribute name="InvCodeApplication"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="DoesNotApply"/&gt;
         *             &lt;enumeration value="InvCode"/&gt;
         *             &lt;enumeration value="InvGroupingCode"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UpgradeFrom {

            @XmlAttribute(name = "InvCodeApplication")
            protected String invCodeApplication;
            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;
            @XmlAttribute(name = "InvTypeCode")
            protected String invTypeCode;
            @XmlAttribute(name = "IsRoom")
            protected Boolean isRoom;

            /**
             * 获取invCodeApplication属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * 设置invCodeApplication属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * 获取invCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * 设置invCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * 获取invType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvType() {
                return invType;
            }

            /**
             * 设置invType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * 获取invTypeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * 设置invTypeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * 获取isRoom属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * 设置isRoom属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
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
         *       &lt;attribute name="InvCodeApplication"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="DoesNotApply"/&gt;
         *             &lt;enumeration value="InvCode"/&gt;
         *             &lt;enumeration value="InvGroupingCode"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UpgradeTo {

            @XmlAttribute(name = "InvCodeApplication")
            protected String invCodeApplication;
            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;
            @XmlAttribute(name = "InvTypeCode")
            protected String invTypeCode;
            @XmlAttribute(name = "IsRoom")
            protected Boolean isRoom;

            /**
             * 获取invCodeApplication属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * 设置invCodeApplication属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * 获取invCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * 设置invCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * 获取invType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvType() {
                return invType;
            }

            /**
             * 设置invType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * 获取invTypeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * 设置invTypeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * 获取isRoom属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * 设置isRoom属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
            }

        }

    }

}
