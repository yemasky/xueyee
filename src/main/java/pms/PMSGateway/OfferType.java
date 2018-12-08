package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>OfferType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeOfferRule" minOccurs="0"/>
 *         &lt;element name="Discount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="NightsRequired" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="NightsDiscounted" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="DiscountPattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="ChargeUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FreeUpgrade" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UpgradeFrom" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="InvCodeApplication">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="DoesNotApply"/>
 *                                 &lt;enumeration value="InvCode"/>
 *                                 &lt;enumeration value="InvGroupingCode"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UpgradeTo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="InvCodeApplication">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="DoesNotApply"/>
 *                                 &lt;enumeration value="InvCode"/>
 *                                 &lt;enumeration value="InvGroupingCode"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="UpgradeBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OfferDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="CompatibleOffers" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeCompatibleOffer" minOccurs="0"/>
 *         &lt;element name="Inventories" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeInventory" minOccurs="0"/>
 *         &lt;element name="Guests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeGuest" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ApplicationOrder" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
        pms.PMSGateway.ArrayOfHotelRatePlanTypeOffer.Offer.class
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
     * ��ȡofferRules���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfOfferTypeOfferRule }
     */
    public ArrayOfOfferTypeOfferRule getOfferRules() {
        return offerRules;
    }

    /**
     * ����offerRules���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfOfferTypeOfferRule }
     */
    public void setOfferRules(ArrayOfOfferTypeOfferRule value) {
        this.offerRules = value;
    }

    /**
     * ��ȡdiscount���Ե�ֵ��
     *
     * @return possible object is
     * {@link OfferType.Discount }
     */
    public OfferType.Discount getDiscount() {
        return discount;
    }

    /**
     * ����discount���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OfferType.Discount }
     */
    public void setDiscount(OfferType.Discount value) {
        this.discount = value;
    }

    /**
     * ��ȡfreeUpgrade���Ե�ֵ��
     *
     * @return possible object is
     * {@link OfferType.FreeUpgrade }
     */
    public OfferType.FreeUpgrade getFreeUpgrade() {
        return freeUpgrade;
    }

    /**
     * ����freeUpgrade���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OfferType.FreeUpgrade }
     */
    public void setFreeUpgrade(OfferType.FreeUpgrade value) {
        this.freeUpgrade = value;
    }

    /**
     * ��ȡofferDescription���Ե�ֵ��
     *
     * @return possible object is
     * {@link ParagraphType }
     */
    public ParagraphType getOfferDescription() {
        return offerDescription;
    }

    /**
     * ����offerDescription���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ParagraphType }
     */
    public void setOfferDescription(ParagraphType value) {
        this.offerDescription = value;
    }

    /**
     * ��ȡcompatibleOffers���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfOfferTypeCompatibleOffer }
     */
    public ArrayOfOfferTypeCompatibleOffer getCompatibleOffers() {
        return compatibleOffers;
    }

    /**
     * ����compatibleOffers���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfOfferTypeCompatibleOffer }
     */
    public void setCompatibleOffers(ArrayOfOfferTypeCompatibleOffer value) {
        this.compatibleOffers = value;
    }

    /**
     * ��ȡinventories���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfOfferTypeInventory }
     */
    public ArrayOfOfferTypeInventory getInventories() {
        return inventories;
    }

    /**
     * ����inventories���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfOfferTypeInventory }
     */
    public void setInventories(ArrayOfOfferTypeInventory value) {
        this.inventories = value;
    }

    /**
     * ��ȡguests���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfOfferTypeGuest }
     */
    public ArrayOfOfferTypeGuest getGuests() {
        return guests;
    }

    /**
     * ����guests���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfOfferTypeGuest }
     */
    public void setGuests(ArrayOfOfferTypeGuest value) {
        this.guests = value;
    }

    /**
     * ��ȡofferCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * ����offerCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
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

    /**
     * ��ȡapplicationOrder���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getApplicationOrder() {
        return applicationOrder;
    }

    /**
     * ����applicationOrder���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setApplicationOrder(BigInteger value) {
        this.applicationOrder = value;
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
     *       &lt;attribute name="NightsRequired" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="NightsDiscounted" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="DiscountPattern" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="ChargeUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡnightsRequired���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getNightsRequired() {
            return nightsRequired;
        }

        /**
         * ����nightsRequired���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setNightsRequired(BigInteger value) {
            this.nightsRequired = value;
        }

        /**
         * ��ȡnightsDiscounted���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getNightsDiscounted() {
            return nightsDiscounted;
        }

        /**
         * ����nightsDiscounted���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setNightsDiscounted(BigInteger value) {
            this.nightsDiscounted = value;
        }

        /**
         * ��ȡdiscountPattern���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDiscountPattern() {
            return discountPattern;
        }

        /**
         * ����discountPattern���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDiscountPattern(String value) {
            this.discountPattern = value;
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

        /**
         * ��ȡpercent���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * ����percent���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
        }

        /**
         * ��ȡchargeUnitCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getChargeUnitCode() {
            return chargeUnitCode;
        }

        /**
         * ����chargeUnitCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setChargeUnitCode(String value) {
            this.chargeUnitCode = value;
        }

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
     *         &lt;element name="UpgradeFrom" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="InvCodeApplication">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="DoesNotApply"/>
     *                       &lt;enumeration value="InvCode"/>
     *                       &lt;enumeration value="InvGroupingCode"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UpgradeTo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="InvCodeApplication">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="DoesNotApply"/>
     *                       &lt;enumeration value="InvCode"/>
     *                       &lt;enumeration value="InvGroupingCode"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="UpgradeBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡupgradeFrom���Ե�ֵ��
         *
         * @return possible object is
         * {@link OfferType.FreeUpgrade.UpgradeFrom }
         */
        public OfferType.FreeUpgrade.UpgradeFrom getUpgradeFrom() {
            return upgradeFrom;
        }

        /**
         * ����upgradeFrom���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OfferType.FreeUpgrade.UpgradeFrom }
         */
        public void setUpgradeFrom(OfferType.FreeUpgrade.UpgradeFrom value) {
            this.upgradeFrom = value;
        }

        /**
         * ��ȡupgradeTo���Ե�ֵ��
         *
         * @return possible object is
         * {@link OfferType.FreeUpgrade.UpgradeTo }
         */
        public OfferType.FreeUpgrade.UpgradeTo getUpgradeTo() {
            return upgradeTo;
        }

        /**
         * ����upgradeTo���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OfferType.FreeUpgrade.UpgradeTo }
         */
        public void setUpgradeTo(OfferType.FreeUpgrade.UpgradeTo value) {
            this.upgradeTo = value;
        }

        /**
         * ��ȡupgradeBookingCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getUpgradeBookingCode() {
            return upgradeBookingCode;
        }

        /**
         * ����upgradeBookingCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUpgradeBookingCode(String value) {
            this.upgradeBookingCode = value;
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
         *       &lt;attribute name="InvCodeApplication">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="DoesNotApply"/>
         *             &lt;enumeration value="InvCode"/>
         *             &lt;enumeration value="InvGroupingCode"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡinvCodeApplication���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * ����invCodeApplication���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * ��ȡinvCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * ����invCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * ��ȡinvType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvType() {
                return invType;
            }

            /**
             * ����invType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * ��ȡinvTypeCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * ����invTypeCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * ��ȡisRoom���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * ����isRoom���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
            }

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
         *       &lt;attribute name="InvCodeApplication">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="DoesNotApply"/>
         *             &lt;enumeration value="InvCode"/>
         *             &lt;enumeration value="InvGroupingCode"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡinvCodeApplication���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * ����invCodeApplication���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * ��ȡinvCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * ����invCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * ��ȡinvType���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvType() {
                return invType;
            }

            /**
             * ����invType���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * ��ȡinvTypeCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * ����invTypeCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * ��ȡisRoom���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * ����isRoom���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
            }

        }

    }

}
