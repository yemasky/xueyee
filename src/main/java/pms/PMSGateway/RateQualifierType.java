package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>RateQualifierType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RateQualifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateComments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRateQualifierTypeRateComment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RateQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}RateQualifierTypeRatePeriod" />
 *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ArriveByFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateAuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VendorRateID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateQualifierType", propOrder = {
        "promoDesc",
        "rateComments"
})
@XmlSeeAlso({
        pms.PMSGateway.VehicleRentalRateType.RateQualifier.class
})
public class RateQualifierType {

    @XmlElement(name = "PromoDesc")
    protected String promoDesc;
    @XmlElement(name = "RateComments")
    protected ArrayOfRateQualifierTypeRateComment rateComments;
    @XmlAttribute(name = "TravelPurpose")
    protected String travelPurpose;
    @XmlAttribute(name = "RateCategory")
    protected String rateCategory;
    @XmlAttribute(name = "CorpDiscountNmbr")
    protected String corpDiscountNmbr;
    @XmlAttribute(name = "RateQualifier")
    protected String rateQualifier;
    @XmlAttribute(name = "RatePeriod")
    protected RateQualifierTypeRatePeriod ratePeriod;
    @XmlAttribute(name = "GuaranteedInd")
    protected Boolean guaranteedInd;
    @XmlAttribute(name = "ArriveByFlight")
    protected Boolean arriveByFlight;
    @XmlAttribute(name = "RateAuthorizationCode")
    protected String rateAuthorizationCode;
    @XmlAttribute(name = "VendorRateID")
    protected String vendorRateID;

    /**
     * ��ȡpromoDesc���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPromoDesc() {
        return promoDesc;
    }

    /**
     * ����promoDesc���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPromoDesc(String value) {
        this.promoDesc = value;
    }

    /**
     * ��ȡrateComments���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRateQualifierTypeRateComment }
     */
    public ArrayOfRateQualifierTypeRateComment getRateComments() {
        return rateComments;
    }

    /**
     * ����rateComments���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRateQualifierTypeRateComment }
     */
    public void setRateComments(ArrayOfRateQualifierTypeRateComment value) {
        this.rateComments = value;
    }

    /**
     * ��ȡtravelPurpose���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTravelPurpose() {
        return travelPurpose;
    }

    /**
     * ����travelPurpose���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTravelPurpose(String value) {
        this.travelPurpose = value;
    }

    /**
     * ��ȡrateCategory���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRateCategory() {
        return rateCategory;
    }

    /**
     * ����rateCategory���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRateCategory(String value) {
        this.rateCategory = value;
    }

    /**
     * ��ȡcorpDiscountNmbr���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCorpDiscountNmbr() {
        return corpDiscountNmbr;
    }

    /**
     * ����corpDiscountNmbr���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCorpDiscountNmbr(String value) {
        this.corpDiscountNmbr = value;
    }

    /**
     * ��ȡrateQualifier���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRateQualifier() {
        return rateQualifier;
    }

    /**
     * ����rateQualifier���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRateQualifier(String value) {
        this.rateQualifier = value;
    }

    /**
     * ��ȡratePeriod���Ե�ֵ��
     *
     * @return possible object is
     * {@link RateQualifierTypeRatePeriod }
     */
    public RateQualifierTypeRatePeriod getRatePeriod() {
        return ratePeriod;
    }

    /**
     * ����ratePeriod���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RateQualifierTypeRatePeriod }
     */
    public void setRatePeriod(RateQualifierTypeRatePeriod value) {
        this.ratePeriod = value;
    }

    /**
     * ��ȡguaranteedInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * ����guaranteedInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGuaranteedInd(Boolean value) {
        this.guaranteedInd = value;
    }

    /**
     * ��ȡarriveByFlight���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isArriveByFlight() {
        return arriveByFlight;
    }

    /**
     * ����arriveByFlight���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setArriveByFlight(Boolean value) {
        this.arriveByFlight = value;
    }

    /**
     * ��ȡrateAuthorizationCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRateAuthorizationCode() {
        return rateAuthorizationCode;
    }

    /**
     * ����rateAuthorizationCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRateAuthorizationCode(String value) {
        this.rateAuthorizationCode = value;
    }

    /**
     * ��ȡvendorRateID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getVendorRateID() {
        return vendorRateID;
    }

    /**
     * ����vendorRateID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVendorRateID(String value) {
        this.vendorRateID = value;
    }

}
