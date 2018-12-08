package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>VehicleSegmentAdditionalInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleSegmentAdditionalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMonetaryRuleType" minOccurs="0"/>
 *         &lt;element name="RentalPaymentAmount" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PricedCoverages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCoveragePricedType" minOccurs="0"/>
 *         &lt;element name="PricedOffLocService" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServicePricedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFormattedTextType" minOccurs="0"/>
 *         &lt;element name="LocationDetails" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TourInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleTourInfoType" minOccurs="0"/>
 *         &lt;element name="SpecialReqPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleSpecialReqPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ArrivalDetails" type="{http://www.opentravel.org/OTA/2003/05}VehicleArrivalDetailsType" minOccurs="0"/>
 *         &lt;element name="WrittenConfInst" type="{http://www.opentravel.org/OTA/2003/05}WrittenConfInstType" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WrittenConfInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSegmentAdditionalInfoType", propOrder = {
        "paymentRules",
        "rentalPaymentAmount",
        "pricedCoverages",
        "pricedOffLocService",
        "vendorMessages",
        "locationDetails",
        "tourInfo",
        "specialReqPref",
        "arrivalDetails",
        "writtenConfInst",
        "remark",
        "tpaExtensions"
})
public class VehicleSegmentAdditionalInfoType {

    @XmlElement(name = "PaymentRules")
    protected ArrayOfMonetaryRuleType paymentRules;
    @XmlElement(name = "RentalPaymentAmount")
    protected List<PaymentDetailType> rentalPaymentAmount;
    @XmlElement(name = "PricedCoverages")
    protected ArrayOfCoveragePricedType pricedCoverages;
    @XmlElement(name = "PricedOffLocService")
    protected List<OffLocationServicePricedType> pricedOffLocService;
    @XmlElement(name = "VendorMessages")
    protected ArrayOfFormattedTextType vendorMessages;
    @XmlElement(name = "LocationDetails")
    protected List<VehicleLocationDetailsType> locationDetails;
    @XmlElement(name = "TourInfo")
    protected VehicleTourInfoType tourInfo;
    @XmlElement(name = "SpecialReqPref")
    protected List<VehicleSpecialReqPrefType> specialReqPref;
    @XmlElement(name = "ArrivalDetails")
    protected VehicleArrivalDetailsType arrivalDetails;
    @XmlElement(name = "WrittenConfInst")
    protected WrittenConfInstType writtenConfInst;
    @XmlElement(name = "Remark")
    protected List<ParagraphType> remark;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "WrittenConfInd")
    protected Boolean writtenConfInd;

    /**
     * ��ȡpaymentRules���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfMonetaryRuleType }
     */
    public ArrayOfMonetaryRuleType getPaymentRules() {
        return paymentRules;
    }

    /**
     * ����paymentRules���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfMonetaryRuleType }
     */
    public void setPaymentRules(ArrayOfMonetaryRuleType value) {
        this.paymentRules = value;
    }

    /**
     * Gets the value of the rentalPaymentAmount property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalPaymentAmount property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentalPaymentAmount().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailType }
     */
    public List<PaymentDetailType> getRentalPaymentAmount() {
        if (rentalPaymentAmount == null) {
            rentalPaymentAmount = new ArrayList<PaymentDetailType>();
        }
        return this.rentalPaymentAmount;
    }

    /**
     * ��ȡpricedCoverages���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfCoveragePricedType }
     */
    public ArrayOfCoveragePricedType getPricedCoverages() {
        return pricedCoverages;
    }

    /**
     * ����pricedCoverages���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfCoveragePricedType }
     */
    public void setPricedCoverages(ArrayOfCoveragePricedType value) {
        this.pricedCoverages = value;
    }

    /**
     * Gets the value of the pricedOffLocService property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedOffLocService property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedOffLocService().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link OffLocationServicePricedType }
     */
    public List<OffLocationServicePricedType> getPricedOffLocService() {
        if (pricedOffLocService == null) {
            pricedOffLocService = new ArrayList<OffLocationServicePricedType>();
        }
        return this.pricedOffLocService;
    }

    /**
     * ��ȡvendorMessages���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfFormattedTextType }
     */
    public ArrayOfFormattedTextType getVendorMessages() {
        return vendorMessages;
    }

    /**
     * ����vendorMessages���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfFormattedTextType }
     */
    public void setVendorMessages(ArrayOfFormattedTextType value) {
        this.vendorMessages = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDetails property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDetails().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLocationDetailsType }
     */
    public List<VehicleLocationDetailsType> getLocationDetails() {
        if (locationDetails == null) {
            locationDetails = new ArrayList<VehicleLocationDetailsType>();
        }
        return this.locationDetails;
    }

    /**
     * ��ȡtourInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleTourInfoType }
     */
    public VehicleTourInfoType getTourInfo() {
        return tourInfo;
    }

    /**
     * ����tourInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleTourInfoType }
     */
    public void setTourInfo(VehicleTourInfoType value) {
        this.tourInfo = value;
    }

    /**
     * Gets the value of the specialReqPref property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialReqPref property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialReqPref().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleSpecialReqPrefType }
     */
    public List<VehicleSpecialReqPrefType> getSpecialReqPref() {
        if (specialReqPref == null) {
            specialReqPref = new ArrayList<VehicleSpecialReqPrefType>();
        }
        return this.specialReqPref;
    }

    /**
     * ��ȡarrivalDetails���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleArrivalDetailsType }
     */
    public VehicleArrivalDetailsType getArrivalDetails() {
        return arrivalDetails;
    }

    /**
     * ����arrivalDetails���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleArrivalDetailsType }
     */
    public void setArrivalDetails(VehicleArrivalDetailsType value) {
        this.arrivalDetails = value;
    }

    /**
     * ��ȡwrittenConfInst���Ե�ֵ��
     *
     * @return possible object is
     * {@link WrittenConfInstType }
     */
    public WrittenConfInstType getWrittenConfInst() {
        return writtenConfInst;
    }

    /**
     * ����writtenConfInst���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link WrittenConfInstType }
     */
    public void setWrittenConfInst(WrittenConfInstType value) {
        this.writtenConfInst = value;
    }

    /**
     * Gets the value of the remark property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     */
    public List<ParagraphType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<ParagraphType>();
        }
        return this.remark;
    }

    /**
     * ��ȡtpaExtensions���Ե�ֵ��
     *
     * @return possible object is
     * {@link TPAExtensionsType }
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * ����tpaExtensions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TPAExtensionsType }
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * ��ȡwrittenConfInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isWrittenConfInd() {
        return writtenConfInd;
    }

    /**
     * ����writtenConfInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setWrittenConfInd(Boolean value) {
        this.writtenConfInd = value;
    }

}
