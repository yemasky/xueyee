package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfRatePlanCandidatesTypeRatePlanCandidate complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfRatePlanCandidatesTypeRatePlanCandidate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlanCandidate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HotelRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef" minOccurs="0"/>
 *                   &lt;element name="MealsIncluded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="MealPlanCodes">
 *                             &lt;simpleType>
 *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ArrivalPolicy" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="GuaranteePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="DepositPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="HoldTimePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RatePlanCommission" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="MaxCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="MinCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RatePlanQualifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PrepaidQualifier">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="IncludePrepaid"/>
 *                       &lt;enumeration value="PrepaidOnly"/>
 *                       &lt;enumeration value="ExcludePrepaid"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="AvailRatesOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfRatePlanCandidatesTypeRatePlanCandidate", propOrder = {
        "ratePlanCandidate"
})
public class ArrayOfRatePlanCandidatesTypeRatePlanCandidate {

    @XmlElement(name = "RatePlanCandidate")
    protected List<ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate> ratePlanCandidate;

    /**
     * Gets the value of the ratePlanCandidate property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanCandidate property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanCandidate().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate }
     */
    public List<ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate> getRatePlanCandidate() {
        if (ratePlanCandidate == null) {
            ratePlanCandidate = new ArrayList<ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate>();
        }
        return this.ratePlanCandidate;
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
     *         &lt;element name="HotelRefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef" minOccurs="0"/>
     *         &lt;element name="MealsIncluded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="MealPlanCodes">
     *                   &lt;simpleType>
     *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ArrivalPolicy" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="GuaranteePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="DepositPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="HoldTimePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RatePlanCommission" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="MaxCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="MinCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RatePlanQualifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PrepaidQualifier">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="IncludePrepaid"/>
     *             &lt;enumeration value="PrepaidOnly"/>
     *             &lt;enumeration value="ExcludePrepaid"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="AvailRatesOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡhotelRefs���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef }
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef getHotelRefs() {
            return hotelRefs;
        }

        /**
         * ����hotelRefs���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef }
         */
        public void setHotelRefs(ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef value) {
            this.hotelRefs = value;
        }

        /**
         * ��ȡmealsIncluded���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded }
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded getMealsIncluded() {
            return mealsIncluded;
        }

        /**
         * ����mealsIncluded���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded }
         */
        public void setMealsIncluded(ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded value) {
            this.mealsIncluded = value;
        }

        /**
         * ��ȡarrivalPolicy���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.ArrivalPolicy }
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.ArrivalPolicy getArrivalPolicy() {
            return arrivalPolicy;
        }

        /**
         * ����arrivalPolicy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.ArrivalPolicy }
         */
        public void setArrivalPolicy(ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.ArrivalPolicy value) {
            this.arrivalPolicy = value;
        }

        /**
         * ��ȡratePlanCommission���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.RatePlanCommission }
         */
        public ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.RatePlanCommission getRatePlanCommission() {
            return ratePlanCommission;
        }

        /**
         * ����ratePlanCommission���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.RatePlanCommission }
         */
        public void setRatePlanCommission(ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.RatePlanCommission value) {
            this.ratePlanCommission = value;
        }

        /**
         * ��ȡratePlanType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRatePlanType() {
            return ratePlanType;
        }

        /**
         * ����ratePlanType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRatePlanType(String value) {
            this.ratePlanType = value;
        }

        /**
         * ��ȡratePlanCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRatePlanCode() {
            return ratePlanCode;
        }

        /**
         * ����ratePlanCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRatePlanCode(String value) {
            this.ratePlanCode = value;
        }

        /**
         * ��ȡratePlanID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRatePlanID() {
            return ratePlanID;
        }

        /**
         * ����ratePlanID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRatePlanID(String value) {
            this.ratePlanID = value;
        }

        /**
         * ��ȡratePlanQualifier���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isRatePlanQualifier() {
            return ratePlanQualifier;
        }

        /**
         * ����ratePlanQualifier���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setRatePlanQualifier(Boolean value) {
            this.ratePlanQualifier = value;
        }

        /**
         * ��ȡratePlanCategory���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRatePlanCategory() {
            return ratePlanCategory;
        }

        /**
         * ����ratePlanCategory���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRatePlanCategory(String value) {
            this.ratePlanCategory = value;
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
         * ��ȡprepaidQualifier���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPrepaidQualifier() {
            return prepaidQualifier;
        }

        /**
         * ����prepaidQualifier���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPrepaidQualifier(String value) {
            this.prepaidQualifier = value;
        }

        /**
         * ��ȡavailRatesOnlyInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isAvailRatesOnlyInd() {
            return availRatesOnlyInd;
        }

        /**
         * ����availRatesOnlyInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setAvailRatesOnlyInd(Boolean value) {
            this.availRatesOnlyInd = value;
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
         *       &lt;attribute name="GuaranteePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="DepositPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="HoldTimePolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡguaranteePolicyIndicator���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isGuaranteePolicyIndicator() {
                return guaranteePolicyIndicator;
            }

            /**
             * ����guaranteePolicyIndicator���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setGuaranteePolicyIndicator(Boolean value) {
                this.guaranteePolicyIndicator = value;
            }

            /**
             * ��ȡdepositPolicyIndicator���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isDepositPolicyIndicator() {
                return depositPolicyIndicator;
            }

            /**
             * ����depositPolicyIndicator���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setDepositPolicyIndicator(Boolean value) {
                this.depositPolicyIndicator = value;
            }

            /**
             * ��ȡholdTimePolicyIndicator���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isHoldTimePolicyIndicator() {
                return holdTimePolicyIndicator;
            }

            /**
             * ����holdTimePolicyIndicator���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setHoldTimePolicyIndicator(Boolean value) {
                this.holdTimePolicyIndicator = value;
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
         *       &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="MealPlanCodes">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡbreakfast���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isBreakfast() {
                return breakfast;
            }

            /**
             * ����breakfast���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setBreakfast(Boolean value) {
                this.breakfast = value;
            }

            /**
             * ��ȡlunch���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isLunch() {
                return lunch;
            }

            /**
             * ����lunch���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setLunch(Boolean value) {
                this.lunch = value;
            }

            /**
             * ��ȡdinner���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isDinner() {
                return dinner;
            }

            /**
             * ����dinner���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setDinner(Boolean value) {
                this.dinner = value;
            }

            /**
             * ��ȡmealPlanIndicator���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isMealPlanIndicator() {
                return mealPlanIndicator;
            }

            /**
             * ����mealPlanIndicator���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setMealPlanIndicator(Boolean value) {
                this.mealPlanIndicator = value;
            }

            /**
             * Gets the value of the mealPlanCodes property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mealPlanCodes property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMealPlanCodes().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getMealPlanCodes() {
                if (mealPlanCodes == null) {
                    mealPlanCodes = new ArrayList<String>();
                }
                return this.mealPlanCodes;
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
         *       &lt;attribute name="MaxCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="MinCommissionPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="CommissionableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
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
             * ��ȡmaxCommissionPercentage���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMaxCommissionPercentage() {
                return maxCommissionPercentage;
            }

            /**
             * ����maxCommissionPercentage���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMaxCommissionPercentage(BigDecimal value) {
                this.maxCommissionPercentage = value;
            }

            /**
             * ��ȡminCommissionPercentage���Ե�ֵ��
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMinCommissionPercentage() {
                return minCommissionPercentage;
            }

            /**
             * ����minCommissionPercentage���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMinCommissionPercentage(BigDecimal value) {
                this.minCommissionPercentage = value;
            }

            /**
             * ��ȡcommissionableIndicator���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isCommissionableIndicator() {
                return commissionableIndicator;
            }

            /**
             * ����commissionableIndicator���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setCommissionableIndicator(Boolean value) {
                this.commissionableIndicator = value;
            }

        }

    }

}
