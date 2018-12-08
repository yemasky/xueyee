
package ota.jw.PMSGateway;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PoliciesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PoliciesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Policy" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CancelPolicy" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/&gt;
 *                   &lt;element name="GuaranteePaymentPolicy" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType"&gt;
 *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PolicyInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyPolicyInfoCode" minOccurs="0"/&gt;
 *                   &lt;element name="CheckoutCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyCheckoutCharge" minOccurs="0"/&gt;
 *                   &lt;element name="PolicyInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                           &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="MaxChildAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                           &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="AcceptedGuestType"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="AdultOnly"/&gt;
 *                                 &lt;enumeration value="CouplesOnly"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TaxPolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyTaxPolicy" minOccurs="0"/&gt;
 *                   &lt;element name="PetsPolicies" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="PetsPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                     &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="MaxPetQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                     &lt;attribute name="RefundableDeposit" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                     &lt;attribute name="NonRefundableFee" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                                     &lt;attribute name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="PetsAllowedCode"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="Pets Allowed"/&gt;
 *                                 &lt;enumeration value="Pets Not Allowed"/&gt;
 *                                 &lt;enumeration value="Assistive Animals Only"/&gt;
 *                                 &lt;enumeration value="Pets By Arrangements"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="StayRequirements" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyStayRequirement" minOccurs="0"/&gt;
 *                   &lt;element name="CommissionPolicy" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PaymentCompany" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="CommissionApplicability"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="AllRates"/&gt;
 *                                 &lt;enumeration value="NoRates"/&gt;
 *                                 &lt;enumeration value="SomeRates"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FeePolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType2" minOccurs="0"/&gt;
 *                   &lt;element name="RatePolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyRatePolicy" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="DefaultValidBookingMinOffset" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "PoliciesType", propOrder = {
    "policy"
})
@XmlSeeAlso({
    ota.jw.PMSGateway.HotelDescriptiveContentType.Policies.class
})
public class PoliciesType {

    @XmlElement(name = "Policy")
    protected List<PoliciesType.Policy> policy;

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoliciesType.Policy }
     * 
     * 
     */
    public List<PoliciesType.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PoliciesType.Policy>();
        }
        return this.policy;
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
     *         &lt;element name="CancelPolicy" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/&gt;
     *         &lt;element name="GuaranteePaymentPolicy" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType"&gt;
     *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PolicyInfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyPolicyInfoCode" minOccurs="0"/&gt;
     *         &lt;element name="CheckoutCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyCheckoutCharge" minOccurs="0"/&gt;
     *         &lt;element name="PolicyInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="MaxChildAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                 &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="AcceptedGuestType"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="AdultOnly"/&gt;
     *                       &lt;enumeration value="CouplesOnly"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TaxPolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyTaxPolicy" minOccurs="0"/&gt;
     *         &lt;element name="PetsPolicies" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="PetsPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                           &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="MaxPetQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                           &lt;attribute name="RefundableDeposit" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                           &lt;attribute name="NonRefundableFee" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                           &lt;attribute name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="PetsAllowedCode"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="Pets Allowed"/&gt;
     *                       &lt;enumeration value="Pets Not Allowed"/&gt;
     *                       &lt;enumeration value="Assistive Animals Only"/&gt;
     *                       &lt;enumeration value="Pets By Arrangements"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="StayRequirements" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyStayRequirement" minOccurs="0"/&gt;
     *         &lt;element name="CommissionPolicy" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PaymentCompany" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="CommissionApplicability"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="AllRates"/&gt;
     *                       &lt;enumeration value="NoRates"/&gt;
     *                       &lt;enumeration value="SomeRates"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FeePolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType2" minOccurs="0"/&gt;
     *         &lt;element name="RatePolicies" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfPoliciesTypePolicyRatePolicy" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="DefaultValidBookingMinOffset" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cancelPolicy",
        "guaranteePaymentPolicy",
        "policyInfoCodes",
        "checkoutCharges",
        "policyInfo",
        "taxPolicies",
        "petsPolicies",
        "stayRequirements",
        "commissionPolicy",
        "feePolicies",
        "ratePolicies"
    })
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

        /**
         * 获取cancelPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancelPolicy() {
            return cancelPolicy;
        }

        /**
         * 设置cancelPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancelPolicy(CancelPenaltiesType value) {
            this.cancelPolicy = value;
        }

        /**
         * 获取guaranteePaymentPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.GuaranteePaymentPolicy }
         *     
         */
        public PoliciesType.Policy.GuaranteePaymentPolicy getGuaranteePaymentPolicy() {
            return guaranteePaymentPolicy;
        }

        /**
         * 设置guaranteePaymentPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.GuaranteePaymentPolicy }
         *     
         */
        public void setGuaranteePaymentPolicy(PoliciesType.Policy.GuaranteePaymentPolicy value) {
            this.guaranteePaymentPolicy = value;
        }

        /**
         * 获取policyInfoCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPoliciesTypePolicyPolicyInfoCode }
         *     
         */
        public ArrayOfPoliciesTypePolicyPolicyInfoCode getPolicyInfoCodes() {
            return policyInfoCodes;
        }

        /**
         * 设置policyInfoCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPoliciesTypePolicyPolicyInfoCode }
         *     
         */
        public void setPolicyInfoCodes(ArrayOfPoliciesTypePolicyPolicyInfoCode value) {
            this.policyInfoCodes = value;
        }

        /**
         * 获取checkoutCharges属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPoliciesTypePolicyCheckoutCharge }
         *     
         */
        public ArrayOfPoliciesTypePolicyCheckoutCharge getCheckoutCharges() {
            return checkoutCharges;
        }

        /**
         * 设置checkoutCharges属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPoliciesTypePolicyCheckoutCharge }
         *     
         */
        public void setCheckoutCharges(ArrayOfPoliciesTypePolicyCheckoutCharge value) {
            this.checkoutCharges = value;
        }

        /**
         * 获取policyInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.PolicyInfo }
         *     
         */
        public PoliciesType.Policy.PolicyInfo getPolicyInfo() {
            return policyInfo;
        }

        /**
         * 设置policyInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.PolicyInfo }
         *     
         */
        public void setPolicyInfo(PoliciesType.Policy.PolicyInfo value) {
            this.policyInfo = value;
        }

        /**
         * 获取taxPolicies属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPoliciesTypePolicyTaxPolicy }
         *     
         */
        public ArrayOfPoliciesTypePolicyTaxPolicy getTaxPolicies() {
            return taxPolicies;
        }

        /**
         * 设置taxPolicies属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPoliciesTypePolicyTaxPolicy }
         *     
         */
        public void setTaxPolicies(ArrayOfPoliciesTypePolicyTaxPolicy value) {
            this.taxPolicies = value;
        }

        /**
         * 获取petsPolicies属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.PetsPolicies }
         *     
         */
        public PoliciesType.Policy.PetsPolicies getPetsPolicies() {
            return petsPolicies;
        }

        /**
         * 设置petsPolicies属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.PetsPolicies }
         *     
         */
        public void setPetsPolicies(PoliciesType.Policy.PetsPolicies value) {
            this.petsPolicies = value;
        }

        /**
         * 获取stayRequirements属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPoliciesTypePolicyStayRequirement }
         *     
         */
        public ArrayOfPoliciesTypePolicyStayRequirement getStayRequirements() {
            return stayRequirements;
        }

        /**
         * 设置stayRequirements属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPoliciesTypePolicyStayRequirement }
         *     
         */
        public void setStayRequirements(ArrayOfPoliciesTypePolicyStayRequirement value) {
            this.stayRequirements = value;
        }

        /**
         * 获取commissionPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PoliciesType.Policy.CommissionPolicy }
         *     
         */
        public PoliciesType.Policy.CommissionPolicy getCommissionPolicy() {
            return commissionPolicy;
        }

        /**
         * 设置commissionPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PoliciesType.Policy.CommissionPolicy }
         *     
         */
        public void setCommissionPolicy(PoliciesType.Policy.CommissionPolicy value) {
            this.commissionPolicy = value;
        }

        /**
         * 获取feePolicies属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfFeeType2 }
         *     
         */
        public ArrayOfFeeType2 getFeePolicies() {
            return feePolicies;
        }

        /**
         * 设置feePolicies属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfFeeType2 }
         *     
         */
        public void setFeePolicies(ArrayOfFeeType2 value) {
            this.feePolicies = value;
        }

        /**
         * 获取ratePolicies属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPoliciesTypePolicyRatePolicy }
         *     
         */
        public ArrayOfPoliciesTypePolicyRatePolicy getRatePolicies() {
            return ratePolicies;
        }

        /**
         * 设置ratePolicies属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPoliciesTypePolicyRatePolicy }
         *     
         */
        public void setRatePolicies(ArrayOfPoliciesTypePolicyRatePolicy value) {
            this.ratePolicies = value;
        }

        /**
         * 获取defaultValidBookingMinOffset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDefaultValidBookingMinOffset() {
            return defaultValidBookingMinOffset;
        }

        /**
         * 设置defaultValidBookingMinOffset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDefaultValidBookingMinOffset(BigInteger value) {
            this.defaultValidBookingMinOffset = value;
        }

        /**
         * 获取start属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * 设置start属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * 获取end属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * 设置end属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * 获取codeDetail属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * 设置codeDetail属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * 获取lastUpdated属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * 设置lastUpdated属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }

        /**
         * 获取mon属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * 设置mon属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * 获取tue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * 设置tue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * 获取weds属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWeds() {
            return weds;
        }

        /**
         * 设置weds属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWeds(Boolean value) {
            this.weds = value;
        }

        /**
         * 获取thur属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isThur() {
            return thur;
        }

        /**
         * 设置thur属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setThur(Boolean value) {
            this.thur = value;
        }

        /**
         * 获取fri属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * 设置fri属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * 获取sat属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * 设置sat属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSat(Boolean value) {
            this.sat = value;
        }

        /**
         * 获取sun属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * 设置sun属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSun(Boolean value) {
            this.sun = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeeType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PaymentCompany" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="CommissionApplicability"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="AllRates"/&gt;
         *             &lt;enumeration value="NoRates"/&gt;
         *             &lt;enumeration value="SomeRates"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paymentCompany"
        })
        public static class CommissionPolicy
            extends FeeType
        {

            @XmlElement(name = "PaymentCompany")
            protected List<PoliciesType.Policy.CommissionPolicy.PaymentCompany> paymentCompany;
            @XmlAttribute(name = "CommissionApplicability")
            protected String commissionApplicability;

            /**
             * Gets the value of the paymentCompany property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paymentCompany property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPaymentCompany().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.CommissionPolicy.PaymentCompany }
             * 
             * 
             */
            public List<PoliciesType.Policy.CommissionPolicy.PaymentCompany> getPaymentCompany() {
                if (paymentCompany == null) {
                    paymentCompany = new ArrayList<PoliciesType.Policy.CommissionPolicy.PaymentCompany>();
                }
                return this.paymentCompany;
            }

            /**
             * 获取commissionApplicability属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommissionApplicability() {
                return commissionApplicability;
            }

            /**
             * 设置commissionApplicability属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommissionApplicability(String value) {
                this.commissionApplicability = value;
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
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PaymentCompany {

                @XmlAttribute(name = "Name")
                protected String name;

                /**
                 * 获取name属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * 设置name属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType"&gt;
         *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GuaranteePaymentPolicy
            extends RequiredPaymentsType
        {

            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRemoval() {
                return removal;
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
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
         *         &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="PetsPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                 &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="MaxPetQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                 &lt;attribute name="RefundableDeposit" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                 &lt;attribute name="NonRefundableFee" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *                 &lt;attribute name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="PetsAllowedCode"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="Pets Allowed"/&gt;
         *             &lt;enumeration value="Pets Not Allowed"/&gt;
         *             &lt;enumeration value="Assistive Animals Only"/&gt;
         *             &lt;enumeration value="Pets By Arrangements"/&gt;
         *           &lt;/restriction&gt;
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
        @XmlType(name = "", propOrder = {
            "petsPolicy"
        })
        public static class PetsPolicies {

            @XmlElement(name = "PetsPolicy")
            protected List<PoliciesType.Policy.PetsPolicies.PetsPolicy> petsPolicy;
            @XmlAttribute(name = "PetsAllowedCode")
            protected String petsAllowedCode;

            /**
             * Gets the value of the petsPolicy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the petsPolicy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPetsPolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PoliciesType.Policy.PetsPolicies.PetsPolicy }
             * 
             * 
             */
            public List<PoliciesType.Policy.PetsPolicies.PetsPolicy> getPetsPolicy() {
                if (petsPolicy == null) {
                    petsPolicy = new ArrayList<PoliciesType.Policy.PetsPolicies.PetsPolicy>();
                }
                return this.petsPolicy;
            }

            /**
             * 获取petsAllowedCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPetsAllowedCode() {
                return petsAllowedCode;
            }

            /**
             * 设置petsAllowedCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPetsAllowedCode(String value) {
                this.petsAllowedCode = value;
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
             *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="PetsPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="MaxPetQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *       &lt;attribute name="RefundableDeposit" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *       &lt;attribute name="NonRefundableFee" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
             *       &lt;attribute name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="RestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="MinUnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "description"
            })
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

                /**
                 * Gets the value of the description property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the description property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDescription().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ParagraphType }
                 * 
                 * 
                 */
                public List<ParagraphType> getDescription() {
                    if (description == null) {
                        description = new ArrayList<ParagraphType>();
                    }
                    return this.description;
                }

                /**
                 * 获取petsPolicyCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPetsPolicyCode() {
                    return petsPolicyCode;
                }

                /**
                 * 设置petsPolicyCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPetsPolicyCode(String value) {
                    this.petsPolicyCode = value;
                }

                /**
                 * 获取unitOfMeasureQuantity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getUnitOfMeasureQuantity() {
                    return unitOfMeasureQuantity;
                }

                /**
                 * 设置unitOfMeasureQuantity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setUnitOfMeasureQuantity(BigDecimal value) {
                    this.unitOfMeasureQuantity = value;
                }

                /**
                 * 获取unitOfMeasure属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasure() {
                    return unitOfMeasure;
                }

                /**
                 * 设置unitOfMeasure属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasure(String value) {
                    this.unitOfMeasure = value;
                }

                /**
                 * 获取unitOfMeasureCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasureCode() {
                    return unitOfMeasureCode;
                }

                /**
                 * 设置unitOfMeasureCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasureCode(String value) {
                    this.unitOfMeasureCode = value;
                }

                /**
                 * 获取maxPetQuantity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMaxPetQuantity() {
                    return maxPetQuantity;
                }

                /**
                 * 设置maxPetQuantity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMaxPetQuantity(BigInteger value) {
                    this.maxPetQuantity = value;
                }

                /**
                 * 获取refundableDeposit属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRefundableDeposit() {
                    return refundableDeposit;
                }

                /**
                 * 设置refundableDeposit属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setRefundableDeposit(BigDecimal value) {
                    this.refundableDeposit = value;
                }

                /**
                 * 获取nonRefundableFee属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNonRefundableFee() {
                    return nonRefundableFee;
                }

                /**
                 * 设置nonRefundableFee属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNonRefundableFee(BigDecimal value) {
                    this.nonRefundableFee = value;
                }

                /**
                 * 获取currencyCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * 设置currencyCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                /**
                 * 获取decimalPlaces属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDecimalPlaces() {
                    return decimalPlaces;
                }

                /**
                 * 设置decimalPlaces属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDecimalPlaces(BigInteger value) {
                    this.decimalPlaces = value;
                }

                /**
                 * 获取chargeCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChargeCode() {
                    return chargeCode;
                }

                /**
                 * 设置chargeCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChargeCode(String value) {
                    this.chargeCode = value;
                }

                /**
                 * 获取restrictionInd属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRestrictionInd() {
                    return restrictionInd;
                }

                /**
                 * 设置restrictionInd属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRestrictionInd(Boolean value) {
                    this.restrictionInd = value;
                }

                /**
                 * 获取minUnitOfMeasureQuantity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMinUnitOfMeasureQuantity() {
                    return minUnitOfMeasureQuantity;
                }

                /**
                 * 设置minUnitOfMeasureQuantity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMinUnitOfMeasureQuantity(BigDecimal value) {
                    this.minUnitOfMeasureQuantity = value;
                }

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
         *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="MinGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="MinRecommendedGuestAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="UsualStayFreeCutoffAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="UsualStayFreeChildPerAdult" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="DefaultTaxServiceInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="KidsStayFree" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="MaxChildAge" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="InternetGuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="AcceptedGuestType"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="AdultOnly"/&gt;
         *             &lt;enumeration value="CouplesOnly"/&gt;
         *           &lt;/restriction&gt;
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
        @XmlType(name = "", propOrder = {
            "description"
        })
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

            /**
             * 获取description属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ParagraphType }
             *     
             */
            public ParagraphType getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ParagraphType }
             *     
             */
            public void setDescription(ParagraphType value) {
                this.description = value;
            }

            /**
             * 获取checkInTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckInTime() {
                return checkInTime;
            }

            /**
             * 设置checkInTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckInTime(String value) {
                this.checkInTime = value;
            }

            /**
             * 获取checkOutTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckOutTime() {
                return checkOutTime;
            }

            /**
             * 设置checkOutTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckOutTime(String value) {
                this.checkOutTime = value;
            }

            /**
             * 获取minGuestAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinGuestAge() {
                return minGuestAge;
            }

            /**
             * 设置minGuestAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinGuestAge(BigInteger value) {
                this.minGuestAge = value;
            }

            /**
             * 获取minRecommendedGuestAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinRecommendedGuestAge() {
                return minRecommendedGuestAge;
            }

            /**
             * 设置minRecommendedGuestAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinRecommendedGuestAge(BigInteger value) {
                this.minRecommendedGuestAge = value;
            }

            /**
             * 获取usualStayFreeCutoffAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUsualStayFreeCutoffAge() {
                return usualStayFreeCutoffAge;
            }

            /**
             * 设置usualStayFreeCutoffAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUsualStayFreeCutoffAge(BigInteger value) {
                this.usualStayFreeCutoffAge = value;
            }

            /**
             * 获取usualStayFreeChildPerAdult属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUsualStayFreeChildPerAdult() {
                return usualStayFreeChildPerAdult;
            }

            /**
             * 设置usualStayFreeChildPerAdult属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUsualStayFreeChildPerAdult(BigInteger value) {
                this.usualStayFreeChildPerAdult = value;
            }

            /**
             * 获取totalGuestCount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalGuestCount() {
                return totalGuestCount;
            }

            /**
             * 设置totalGuestCount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalGuestCount(BigInteger value) {
                this.totalGuestCount = value;
            }

            /**
             * 获取defaultTaxServiceInclusive属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDefaultTaxServiceInclusive() {
                return defaultTaxServiceInclusive;
            }

            /**
             * 设置defaultTaxServiceInclusive属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDefaultTaxServiceInclusive(Boolean value) {
                this.defaultTaxServiceInclusive = value;
            }

            /**
             * 获取kidsStayFree属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isKidsStayFree() {
                return kidsStayFree;
            }

            /**
             * 设置kidsStayFree属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setKidsStayFree(Boolean value) {
                this.kidsStayFree = value;
            }

            /**
             * 获取maxChildAge属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxChildAge() {
                return maxChildAge;
            }

            /**
             * 设置maxChildAge属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxChildAge(BigInteger value) {
                this.maxChildAge = value;
            }

            /**
             * 获取internetGuaranteeRequiredInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInternetGuaranteeRequiredInd() {
                return internetGuaranteeRequiredInd;
            }

            /**
             * 设置internetGuaranteeRequiredInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInternetGuaranteeRequiredInd(Boolean value) {
                this.internetGuaranteeRequiredInd = value;
            }

            /**
             * 获取acceptedGuestType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcceptedGuestType() {
                return acceptedGuestType;
            }

            /**
             * 设置acceptedGuestType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcceptedGuestType(String value) {
                this.acceptedGuestType = value;
            }

        }

    }

}
