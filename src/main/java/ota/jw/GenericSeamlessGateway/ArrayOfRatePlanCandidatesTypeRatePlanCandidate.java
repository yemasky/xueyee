
package ota.jw.GenericSeamlessGateway;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfRatePlanCandidatesTypeRatePlanCandidate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRatePlanCandidatesTypeRatePlanCandidate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlanCandidate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="HotelRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef" minOccurs="0"/&gt;
 *                   &lt;element name="MealsIncluded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="MealPlanCodes"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ArrivalPolicy" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="GuaranteePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="DepositPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="HoldTimePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RatePlanCommission" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="MaxCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="MinCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RatePlanQualifier" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PrepaidQualifier"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="IncludePrepaid"/&gt;
 *                       &lt;enumeration value="PrepaidOnly"/&gt;
 *                       &lt;enumeration value="ExcludePrepaid"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="AvailRatesOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRatePlanCandidatesTypeRatePlanCandidate", propOrder = {
    "ratePlanCandidate"
})
public class ArrayOfRatePlanCandidatesTypeRatePlanCandidate {

    @XmlElement(name = "RatePlanCandidate")
    protected List<ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate> ratePlanCandidate;

    /**
     * Gets the value of the ratePlanCandidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanCandidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate }
     * 
     * 
     */
    public List<ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate> getRatePlanCandidate() {
        if (ratePlanCandidate == null) {
            ratePlanCandidate = new ArrayList<ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate>();
        }
        return this.ratePlanCandidate;
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
     *         &lt;element name="HotelRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef" minOccurs="0"/&gt;
     *         &lt;element name="MealsIncluded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="MealPlanCodes"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ArrivalPolicy" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="GuaranteePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="DepositPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="HoldTimePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RatePlanCommission" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="MaxCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="MinCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RatePlanQualifier" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PrepaidQualifier"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="IncludePrepaid"/&gt;
     *             &lt;enumeration value="PrepaidOnly"/&gt;
     *             &lt;enumeration value="ExcludePrepaid"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="AvailRatesOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hotelRefs",
        "mealsIncluded",
        "arrivalPolicy",
        "ratePlanCommission"
    })
    public static class RatePlanCandidate {

        @XmlElement(name = "HotelRefs")
        protected ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef hotelRefs;
        @XmlElement(name = "MealsIncluded")
        protected ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded mealsIncluded;
        @XmlElement(name = "ArrivalPolicy")
        protected ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.ArrivalPolicy arrivalPolicy;
        @XmlElement(name = "RatePlanCommission")
        protected ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.RatePlanCommission ratePlanCommission;
        @XmlAttribute(name = "RatePlanType")
        protected String ratePlanType;
        @XmlAttribute(name = "RatePlanCode")
        protected String ratePlanCode;
        @XmlAttribute(name = "RatePlanID")
        protected String ratePlanID;
        @XmlAttribute(name = "RatePlanQualifier")
        protected Boolean ratePlanQualifier;
        @XmlAttribute(name = "RatePlanCategory")
        protected String ratePlanCategory;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "PrepaidQualifier")
        protected String prepaidQualifier;
        @XmlAttribute(name = "AvailRatesOnlyInd")
        protected Boolean availRatesOnlyInd;

        /**
         * 获取hotelRefs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef }
         *     
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef getHotelRefs() {
            return hotelRefs;
        }

        /**
         * 设置hotelRefs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef }
         *     
         */
        public void setHotelRefs(ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef value) {
            this.hotelRefs = value;
        }

        /**
         * 获取mealsIncluded属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded }
         *     
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded getMealsIncluded() {
            return mealsIncluded;
        }

        /**
         * 设置mealsIncluded属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded }
         *     
         */
        public void setMealsIncluded(ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded value) {
            this.mealsIncluded = value;
        }

        /**
         * 获取arrivalPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.ArrivalPolicy }
         *     
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.ArrivalPolicy getArrivalPolicy() {
            return arrivalPolicy;
        }

        /**
         * 设置arrivalPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.ArrivalPolicy }
         *     
         */
        public void setArrivalPolicy(ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.ArrivalPolicy value) {
            this.arrivalPolicy = value;
        }

        /**
         * 获取ratePlanCommission属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.RatePlanCommission }
         *     
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.RatePlanCommission getRatePlanCommission() {
            return ratePlanCommission;
        }

        /**
         * 设置ratePlanCommission属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.RatePlanCommission }
         *     
         */
        public void setRatePlanCommission(ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.RatePlanCommission value) {
            this.ratePlanCommission = value;
        }

        /**
         * 获取ratePlanType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanType() {
            return ratePlanType;
        }

        /**
         * 设置ratePlanType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanType(String value) {
            this.ratePlanType = value;
        }

        /**
         * 获取ratePlanCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanCode() {
            return ratePlanCode;
        }

        /**
         * 设置ratePlanCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanCode(String value) {
            this.ratePlanCode = value;
        }

        /**
         * 获取ratePlanID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanID() {
            return ratePlanID;
        }

        /**
         * 设置ratePlanID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanID(String value) {
            this.ratePlanID = value;
        }

        /**
         * 获取ratePlanQualifier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRatePlanQualifier() {
            return ratePlanQualifier;
        }

        /**
         * 设置ratePlanQualifier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRatePlanQualifier(Boolean value) {
            this.ratePlanQualifier = value;
        }

        /**
         * 获取ratePlanCategory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanCategory() {
            return ratePlanCategory;
        }

        /**
         * 设置ratePlanCategory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanCategory(String value) {
            this.ratePlanCategory = value;
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
         * 获取prepaidQualifier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrepaidQualifier() {
            return prepaidQualifier;
        }

        /**
         * 设置prepaidQualifier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrepaidQualifier(String value) {
            this.prepaidQualifier = value;
        }

        /**
         * 获取availRatesOnlyInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAvailRatesOnlyInd() {
            return availRatesOnlyInd;
        }

        /**
         * 设置availRatesOnlyInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAvailRatesOnlyInd(Boolean value) {
            this.availRatesOnlyInd = value;
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
         *       &lt;attribute name="GuaranteePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="DepositPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="HoldTimePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ArrivalPolicy {

            @XmlAttribute(name = "GuaranteePolicyIndicator")
            protected Boolean guaranteePolicyIndicator;
            @XmlAttribute(name = "DepositPolicyIndicator")
            protected Boolean depositPolicyIndicator;
            @XmlAttribute(name = "HoldTimePolicyIndicator")
            protected Boolean holdTimePolicyIndicator;

            /**
             * 获取guaranteePolicyIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isGuaranteePolicyIndicator() {
                return guaranteePolicyIndicator;
            }

            /**
             * 设置guaranteePolicyIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setGuaranteePolicyIndicator(Boolean value) {
                this.guaranteePolicyIndicator = value;
            }

            /**
             * 获取depositPolicyIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDepositPolicyIndicator() {
                return depositPolicyIndicator;
            }

            /**
             * 设置depositPolicyIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDepositPolicyIndicator(Boolean value) {
                this.depositPolicyIndicator = value;
            }

            /**
             * 获取holdTimePolicyIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHoldTimePolicyIndicator() {
                return holdTimePolicyIndicator;
            }

            /**
             * 设置holdTimePolicyIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHoldTimePolicyIndicator(Boolean value) {
                this.holdTimePolicyIndicator = value;
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
         *       &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="MealPlanCodes"&gt;
         *         &lt;simpleType&gt;
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MealsIncluded {

            @XmlAttribute(name = "Breakfast")
            protected Boolean breakfast;
            @XmlAttribute(name = "Lunch")
            protected Boolean lunch;
            @XmlAttribute(name = "Dinner")
            protected Boolean dinner;
            @XmlAttribute(name = "MealPlanIndicator")
            protected Boolean mealPlanIndicator;
            @XmlAttribute(name = "MealPlanCodes")
            protected List<String> mealPlanCodes;

            /**
             * 获取breakfast属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBreakfast() {
                return breakfast;
            }

            /**
             * 设置breakfast属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBreakfast(Boolean value) {
                this.breakfast = value;
            }

            /**
             * 获取lunch属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLunch() {
                return lunch;
            }

            /**
             * 设置lunch属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLunch(Boolean value) {
                this.lunch = value;
            }

            /**
             * 获取dinner属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDinner() {
                return dinner;
            }

            /**
             * 设置dinner属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDinner(Boolean value) {
                this.dinner = value;
            }

            /**
             * 获取mealPlanIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMealPlanIndicator() {
                return mealPlanIndicator;
            }

            /**
             * 设置mealPlanIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMealPlanIndicator(Boolean value) {
                this.mealPlanIndicator = value;
            }

            /**
             * Gets the value of the mealPlanCodes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mealPlanCodes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMealPlanCodes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMealPlanCodes() {
                if (mealPlanCodes == null) {
                    mealPlanCodes = new ArrayList<String>();
                }
                return this.mealPlanCodes;
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
         *       &lt;attribute name="MaxCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="MinCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RatePlanCommission {

            @XmlAttribute(name = "MaxCommissionPercentage")
            protected BigDecimal maxCommissionPercentage;
            @XmlAttribute(name = "MinCommissionPercentage")
            protected BigDecimal minCommissionPercentage;
            @XmlAttribute(name = "CommissionableIndicator")
            protected Boolean commissionableIndicator;

            /**
             * 获取maxCommissionPercentage属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMaxCommissionPercentage() {
                return maxCommissionPercentage;
            }

            /**
             * 设置maxCommissionPercentage属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMaxCommissionPercentage(BigDecimal value) {
                this.maxCommissionPercentage = value;
            }

            /**
             * 获取minCommissionPercentage属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMinCommissionPercentage() {
                return minCommissionPercentage;
            }

            /**
             * 设置minCommissionPercentage属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMinCommissionPercentage(BigDecimal value) {
                this.minCommissionPercentage = value;
            }

            /**
             * 获取commissionableIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCommissionableIndicator() {
                return commissionableIndicator;
            }

            /**
             * 设置commissionableIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCommissionableIndicator(Boolean value) {
                this.commissionableIndicator = value;
            }

        }

    }

}
