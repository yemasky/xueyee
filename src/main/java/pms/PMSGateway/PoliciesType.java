package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoliciesType", propOrder = {"policy"})
@XmlSeeAlso({pms.PMSGateway.HotelDescriptiveContentType.Policies.class})
public class PoliciesType {
    @XmlElement(name = "Policy")
    protected List<PoliciesType.Policy> policy;

    public List<PoliciesType.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PoliciesType.Policy>();
        }
        return this.policy;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"cancelPolicy", "guaranteePaymentPolicy", "policyInfoCodes", "checkoutCharges", "policyInfo", "taxPolicies", "petsPolicies", "stayRequirements", "commissionPolicy", "feePolicies", "ratePolicies"})
    public static class Policy {
        @XmlElement(name = "CancelPolicy")
        protected CancelPenaltiesType cancelPolicy;
        @XmlElement(name = "GuaranteePaymentPolicy")
        protected PoliciesType.Policy.GuaranteePaymentPolicy guaranteePaymentPolicy;
        @XmlElement(name = "PolicyInfoCodes")
        protected ArrayOfPoliciesTypePolicyPolicyInfoCode policyInfoCodes;
        @XmlElement(name = "CheckoutCharges")
        protected ArrayOfPoliciesTypePolicyCheckoutCharge checkoutCharges;
        @XmlElement(name = "PolicyInfo")
        protected PoliciesType.Policy.PolicyInfo policyInfo;
        @XmlElement(name = "TaxPolicies")
        protected ArrayOfPoliciesTypePolicyTaxPolicy taxPolicies;
        @XmlElement(name = "PetsPolicies")
        protected PoliciesType.Policy.PetsPolicies petsPolicies;
        @XmlElement(name = "StayRequirements")
        protected ArrayOfPoliciesTypePolicyStayRequirement stayRequirements;
        @XmlElement(name = "CommissionPolicy")
        protected PoliciesType.Policy.CommissionPolicy commissionPolicy;
        @XmlElement(name = "FeePolicies")
        protected ArrayOfFeeType2 feePolicies;
        @XmlElement(name = "RatePolicies")
        protected ArrayOfPoliciesTypePolicyRatePolicy ratePolicies;
        @XmlAttribute(name = "DefaultValidBookingMinOffset")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger defaultValidBookingMinOffset;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;
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

        public CancelPenaltiesType getCancelPolicy() {
            return cancelPolicy;
        }

        public void setCancelPolicy(CancelPenaltiesType value) {
            this.cancelPolicy = value;
        }

        public PoliciesType.Policy.GuaranteePaymentPolicy getGuaranteePaymentPolicy() {
            return guaranteePaymentPolicy;
        }

        public void setGuaranteePaymentPolicy(PoliciesType.Policy.GuaranteePaymentPolicy value) {
            this.guaranteePaymentPolicy = value;
        }

        public ArrayOfPoliciesTypePolicyPolicyInfoCode getPolicyInfoCodes() {
            return policyInfoCodes;
        }

        public void setPolicyInfoCodes(ArrayOfPoliciesTypePolicyPolicyInfoCode value) {
            this.policyInfoCodes = value;
        }

        public ArrayOfPoliciesTypePolicyCheckoutCharge getCheckoutCharges() {
            return checkoutCharges;
        }

        public void setCheckoutCharges(ArrayOfPoliciesTypePolicyCheckoutCharge value) {
            this.checkoutCharges = value;
        }

        public PoliciesType.Policy.PolicyInfo getPolicyInfo() {
            return policyInfo;
        }

        public void setPolicyInfo(PoliciesType.Policy.PolicyInfo value) {
            this.policyInfo = value;
        }

        public ArrayOfPoliciesTypePolicyTaxPolicy getTaxPolicies() {
            return taxPolicies;
        }

        public void setTaxPolicies(ArrayOfPoliciesTypePolicyTaxPolicy value) {
            this.taxPolicies = value;
        }

        public PoliciesType.Policy.PetsPolicies getPetsPolicies() {
            return petsPolicies;
        }

        public void setPetsPolicies(PoliciesType.Policy.PetsPolicies value) {
            this.petsPolicies = value;
        }

        public ArrayOfPoliciesTypePolicyStayRequirement getStayRequirements() {
            return stayRequirements;
        }

        public void setStayRequirements(ArrayOfPoliciesTypePolicyStayRequirement value) {
            this.stayRequirements = value;
        }

        public PoliciesType.Policy.CommissionPolicy getCommissionPolicy() {
            return commissionPolicy;
        }

        public void setCommissionPolicy(PoliciesType.Policy.CommissionPolicy value) {
            this.commissionPolicy = value;
        }

        public ArrayOfFeeType2 getFeePolicies() {
            return feePolicies;
        }

        public void setFeePolicies(ArrayOfFeeType2 value) {
            this.feePolicies = value;
        }

        public ArrayOfPoliciesTypePolicyRatePolicy getRatePolicies() {
            return ratePolicies;
        }

        public void setRatePolicies(ArrayOfPoliciesTypePolicyRatePolicy value) {
            this.ratePolicies = value;
        }

        public BigInteger getDefaultValidBookingMinOffset() {
            return defaultValidBookingMinOffset;
        }

        public void setDefaultValidBookingMinOffset(BigInteger value) {
            this.defaultValidBookingMinOffset = value;
        }

        public String getStart() {
            return start;
        }

        public void setStart(String value) {
            this.start = value;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String value) {
            this.duration = value;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String value) {
            this.end = value;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String value) {
            this.code = value;
        }

        public String getCodeDetail() {
            return codeDetail;
        }

        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }

        public Boolean isMon() {
            return mon;
        }

        public void setMon(Boolean value) {
            this.mon = value;
        }

        public Boolean isTue() {
            return tue;
        }

        public void setTue(Boolean value) {
            this.tue = value;
        }

        public Boolean isWeds() {
            return weds;
        }

        public void setWeds(Boolean value) {
            this.weds = value;
        }

        public Boolean isThur() {
            return thur;
        }

        public void setThur(Boolean value) {
            this.thur = value;
        }

        public Boolean isFri() {
            return fri;
        }

        public void setFri(Boolean value) {
            this.fri = value;
        }

        public Boolean isSat() {
            return sat;
        }

        public void setSat(Boolean value) {
            this.sat = value;
        }

        public Boolean isSun() {
            return sun;
        }

        public void setSun(Boolean value) {
            this.sun = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"paymentCompany"})
        public static class CommissionPolicy extends FeeType {
            @XmlElement(name = "PaymentCompany")
            protected List<PoliciesType.Policy.CommissionPolicy.PaymentCompany> paymentCompany;
            @XmlAttribute(name = "CommissionApplicability")
            protected String commissionApplicability;

            public List<PoliciesType.Policy.CommissionPolicy.PaymentCompany> getPaymentCompany() {
                if (paymentCompany == null) {
                    paymentCompany = new ArrayList<PoliciesType.Policy.CommissionPolicy.PaymentCompany>();
                }
                return this.paymentCompany;
            }

            public String getCommissionApplicability() {
                return commissionApplicability;
            }

            public void setCommissionApplicability(String value) {
                this.commissionApplicability = value;
            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PaymentCompany {
                @XmlAttribute(name = "Name")
                protected String name;

                public String getName() {
                    return name;
                }

                public void setName(String value) {
                    this.name = value;
                }
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GuaranteePaymentPolicy extends RequiredPaymentsType {
            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            public Boolean isRemoval() {
                return removal;
            }

            public void setRemoval(Boolean value) {
                this.removal = value;
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"petsPolicy"})
        public static class PetsPolicies {
            @XmlElement(name = "PetsPolicy")
            protected List<PoliciesType.Policy.PetsPolicies.PetsPolicy> petsPolicy;
            @XmlAttribute(name = "PetsAllowedCode")
            protected String petsAllowedCode;

            public List<PoliciesType.Policy.PetsPolicies.PetsPolicy> getPetsPolicy() {
                if (petsPolicy == null) {
                    petsPolicy = new ArrayList<PoliciesType.Policy.PetsPolicies.PetsPolicy>();
                }
                return this.petsPolicy;
            }

            public String getPetsAllowedCode() {
                return petsAllowedCode;
            }

            public void setPetsAllowedCode(String value) {
                this.petsAllowedCode = value;
            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"description"})
            public static class PetsPolicy {
                @XmlElement(name = "Description")
                protected List<ParagraphType> description;
                @XmlAttribute(name = "PetsPolicyCode")
                protected String petsPolicyCode;
                @XmlAttribute(name = "UnitOfMeasureQuantity")
                protected BigDecimal unitOfMeasureQuantity;
                @XmlAttribute(name = "UnitOfMeasure")
                protected String unitOfMeasure;
                @XmlAttribute(name = "UnitOfMeasureCode")
                protected String unitOfMeasureCode;
                @XmlAttribute(name = "MaxPetQuantity")
                protected BigInteger maxPetQuantity;
                @XmlAttribute(name = "RefundableDeposit")
                protected BigDecimal refundableDeposit;
                @XmlAttribute(name = "NonRefundableFee")
                protected BigDecimal nonRefundableFee;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;
                @XmlAttribute(name = "ChargeCode")
                protected String chargeCode;
                @XmlAttribute(name = "RestrictionInd")
                protected Boolean restrictionInd;
                @XmlAttribute(name = "MinUnitOfMeasureQuantity")
                protected BigDecimal minUnitOfMeasureQuantity;

                public List<ParagraphType> getDescription() {
                    if (description == null) {
                        description = new ArrayList<ParagraphType>();
                    }
                    return this.description;
                }

                public String getPetsPolicyCode() {
                    return petsPolicyCode;
                }

                public void setPetsPolicyCode(String value) {
                    this.petsPolicyCode = value;
                }

                public BigDecimal getUnitOfMeasureQuantity() {
                    return unitOfMeasureQuantity;
                }

                public void setUnitOfMeasureQuantity(BigDecimal value) {
                    this.unitOfMeasureQuantity = value;
                }

                public String getUnitOfMeasure() {
                    return unitOfMeasure;
                }

                public void setUnitOfMeasure(String value) {
                    this.unitOfMeasure = value;
                }

                public String getUnitOfMeasureCode() {
                    return unitOfMeasureCode;
                }

                public void setUnitOfMeasureCode(String value) {
                    this.unitOfMeasureCode = value;
                }

                public BigInteger getMaxPetQuantity() {
                    return maxPetQuantity;
                }

                public void setMaxPetQuantity(BigInteger value) {
                    this.maxPetQuantity = value;
                }

                public BigDecimal getRefundableDeposit() {
                    return refundableDeposit;
                }

                public void setRefundableDeposit(BigDecimal value) {
                    this.refundableDeposit = value;
                }

                public BigDecimal getNonRefundableFee() {
                    return nonRefundableFee;
                }

                public void setNonRefundableFee(BigDecimal value) {
                    this.nonRefundableFee = value;
                }

                public String getCurrencyCode() {
                    return currencyCode;
                }

                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                public BigInteger getDecimalPlaces() {
                    return decimalPlaces;
                }

                public void setDecimalPlaces(BigInteger value) {
                    this.decimalPlaces = value;
                }

                public String getChargeCode() {
                    return chargeCode;
                }

                public void setChargeCode(String value) {
                    this.chargeCode = value;
                }

                public Boolean isRestrictionInd() {
                    return restrictionInd;
                }

                public void setRestrictionInd(Boolean value) {
                    this.restrictionInd = value;
                }

                public BigDecimal getMinUnitOfMeasureQuantity() {
                    return minUnitOfMeasureQuantity;
                }

                public void setMinUnitOfMeasureQuantity(BigDecimal value) {
                    this.minUnitOfMeasureQuantity = value;
                }
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"description"})
        public static class PolicyInfo {
            @XmlElement(name = "Description")
            protected ParagraphType description;
            @XmlAttribute(name = "CheckInTime")
            protected String checkInTime;
            @XmlAttribute(name = "CheckOutTime")
            protected String checkOutTime;
            @XmlAttribute(name = "MinGuestAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger minGuestAge;
            @XmlAttribute(name = "MinRecommendedGuestAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger minRecommendedGuestAge;
            @XmlAttribute(name = "UsualStayFreeCutoffAge")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger usualStayFreeCutoffAge;
            @XmlAttribute(name = "UsualStayFreeChildPerAdult")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger usualStayFreeChildPerAdult;
            @XmlAttribute(name = "TotalGuestCount")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger totalGuestCount;
            @XmlAttribute(name = "DefaultTaxServiceInclusive")
            protected Boolean defaultTaxServiceInclusive;
            @XmlAttribute(name = "KidsStayFree")
            protected Boolean kidsStayFree;
            @XmlAttribute(name = "MaxChildAge")
            protected BigInteger maxChildAge;
            @XmlAttribute(name = "InternetGuaranteeRequiredInd")
            protected Boolean internetGuaranteeRequiredInd;
            @XmlAttribute(name = "AcceptedGuestType")
            protected String acceptedGuestType;

            public ParagraphType getDescription() {
                return description;
            }

            public void setDescription(ParagraphType value) {
                this.description = value;
            }

            public String getCheckInTime() {
                return checkInTime;
            }

            public void setCheckInTime(String value) {
                this.checkInTime = value;
            }

            public String getCheckOutTime() {
                return checkOutTime;
            }

            public void setCheckOutTime(String value) {
                this.checkOutTime = value;
            }

            public BigInteger getMinGuestAge() {
                return minGuestAge;
            }

            public void setMinGuestAge(BigInteger value) {
                this.minGuestAge = value;
            }

            public BigInteger getMinRecommendedGuestAge() {
                return minRecommendedGuestAge;
            }

            public void setMinRecommendedGuestAge(BigInteger value) {
                this.minRecommendedGuestAge = value;
            }

            public BigInteger getUsualStayFreeCutoffAge() {
                return usualStayFreeCutoffAge;
            }

            public void setUsualStayFreeCutoffAge(BigInteger value) {
                this.usualStayFreeCutoffAge = value;
            }

            public BigInteger getUsualStayFreeChildPerAdult() {
                return usualStayFreeChildPerAdult;
            }

            public void setUsualStayFreeChildPerAdult(BigInteger value) {
                this.usualStayFreeChildPerAdult = value;
            }

            public BigInteger getTotalGuestCount() {
                return totalGuestCount;
            }

            public void setTotalGuestCount(BigInteger value) {
                this.totalGuestCount = value;
            }

            public Boolean isDefaultTaxServiceInclusive() {
                return defaultTaxServiceInclusive;
            }

            public void setDefaultTaxServiceInclusive(Boolean value) {
                this.defaultTaxServiceInclusive = value;
            }

            public Boolean isKidsStayFree() {
                return kidsStayFree;
            }

            public void setKidsStayFree(Boolean value) {
                this.kidsStayFree = value;
            }

            public BigInteger getMaxChildAge() {
                return maxChildAge;
            }

            public void setMaxChildAge(BigInteger value) {
                this.maxChildAge = value;
            }

            public Boolean isInternetGuaranteeRequiredInd() {
                return internetGuaranteeRequiredInd;
            }

            public void setInternetGuaranteeRequiredInd(Boolean value) {
                this.internetGuaranteeRequiredInd = value;
            }

            public String getAcceptedGuestType() {
                return acceptedGuestType;
            }

            public void setAcceptedGuestType(String value) {
                this.acceptedGuestType = value;
            }
        }
    }
}