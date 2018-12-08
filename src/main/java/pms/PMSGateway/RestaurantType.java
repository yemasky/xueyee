package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>RestaurantType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RestaurantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultimediaDescriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
 *                 &lt;attribute name="Attire" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/>
 *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
 *         &lt;element name="InfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantTypeInfoCode" minOccurs="0"/>
 *         &lt;element name="CuisineCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantTypeCuisineCode" minOccurs="0"/>
 *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RestaurantName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MaxSingleParty" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OfferBreakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferLunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferDinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferBrunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="ReservationReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestaurantType", propOrder = {
        "multimediaDescriptions",
        "relativePosition",
        "operationSchedules",
        "infoCodes",
        "cuisineCodes",
        "descriptiveText"
})
@XmlSeeAlso({
        pms.PMSGateway.RestaurantsType.Restaurant.class
})
public class RestaurantType {

    @XmlElement(name = "MultimediaDescriptions")
    protected RestaurantType.MultimediaDescriptions multimediaDescriptions;
    @XmlElement(name = "RelativePosition")
    protected RelativePositionType relativePosition;
    @XmlElement(name = "OperationSchedules")
    protected ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule operationSchedules;
    @XmlElement(name = "InfoCodes")
    protected ArrayOfRestaurantTypeInfoCode infoCodes;
    @XmlElement(name = "CuisineCodes")
    protected ArrayOfRestaurantTypeCuisineCode cuisineCodes;
    @XmlElement(name = "DescriptiveText")
    protected String descriptiveText;
    @XmlAttribute(name = "RestaurantName")
    protected String restaurantName;
    @XmlAttribute(name = "MaxSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxSeatingCapacity;
    @XmlAttribute(name = "MaxSingleParty")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxSingleParty;
    @XmlAttribute(name = "InvCode")
    protected String invCode;
    @XmlAttribute(name = "OfferBreakfast")
    protected Boolean offerBreakfast;
    @XmlAttribute(name = "OfferLunch")
    protected Boolean offerLunch;
    @XmlAttribute(name = "OfferDinner")
    protected Boolean offerDinner;
    @XmlAttribute(name = "OfferBrunch")
    protected Boolean offerBrunch;
    @XmlAttribute(name = "ProximityCode")
    protected String proximityCode;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Sort")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sort;
    @XmlAttribute(name = "ReservationReqInd")
    protected Boolean reservationReqInd;

    /**
     * ��ȡmultimediaDescriptions���Ե�ֵ��
     *
     * @return possible object is
     * {@link RestaurantType.MultimediaDescriptions }
     */
    public RestaurantType.MultimediaDescriptions getMultimediaDescriptions() {
        return multimediaDescriptions;
    }

    /**
     * ����multimediaDescriptions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RestaurantType.MultimediaDescriptions }
     */
    public void setMultimediaDescriptions(RestaurantType.MultimediaDescriptions value) {
        this.multimediaDescriptions = value;
    }

    /**
     * ��ȡrelativePosition���Ե�ֵ��
     *
     * @return possible object is
     * {@link RelativePositionType }
     */
    public RelativePositionType getRelativePosition() {
        return relativePosition;
    }

    /**
     * ����relativePosition���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RelativePositionType }
     */
    public void setRelativePosition(RelativePositionType value) {
        this.relativePosition = value;
    }

    /**
     * ��ȡoperationSchedules���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
     */
    public ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * ����operationSchedules���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
     */
    public void setOperationSchedules(ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule value) {
        this.operationSchedules = value;
    }

    /**
     * ��ȡinfoCodes���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRestaurantTypeInfoCode }
     */
    public ArrayOfRestaurantTypeInfoCode getInfoCodes() {
        return infoCodes;
    }

    /**
     * ����infoCodes���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRestaurantTypeInfoCode }
     */
    public void setInfoCodes(ArrayOfRestaurantTypeInfoCode value) {
        this.infoCodes = value;
    }

    /**
     * ��ȡcuisineCodes���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRestaurantTypeCuisineCode }
     */
    public ArrayOfRestaurantTypeCuisineCode getCuisineCodes() {
        return cuisineCodes;
    }

    /**
     * ����cuisineCodes���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRestaurantTypeCuisineCode }
     */
    public void setCuisineCodes(ArrayOfRestaurantTypeCuisineCode value) {
        this.cuisineCodes = value;
    }

    /**
     * ��ȡdescriptiveText���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescriptiveText() {
        return descriptiveText;
    }

    /**
     * ����descriptiveText���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescriptiveText(String value) {
        this.descriptiveText = value;
    }

    /**
     * ��ȡrestaurantName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * ����restaurantName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRestaurantName(String value) {
        this.restaurantName = value;
    }

    /**
     * ��ȡmaxSeatingCapacity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxSeatingCapacity() {
        return maxSeatingCapacity;
    }

    /**
     * ����maxSeatingCapacity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxSeatingCapacity(BigInteger value) {
        this.maxSeatingCapacity = value;
    }

    /**
     * ��ȡmaxSingleParty���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxSingleParty() {
        return maxSingleParty;
    }

    /**
     * ����maxSingleParty���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxSingleParty(BigInteger value) {
        this.maxSingleParty = value;
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
     * ��ȡofferBreakfast���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isOfferBreakfast() {
        return offerBreakfast;
    }

    /**
     * ����offerBreakfast���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setOfferBreakfast(Boolean value) {
        this.offerBreakfast = value;
    }

    /**
     * ��ȡofferLunch���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isOfferLunch() {
        return offerLunch;
    }

    /**
     * ����offerLunch���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setOfferLunch(Boolean value) {
        this.offerLunch = value;
    }

    /**
     * ��ȡofferDinner���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isOfferDinner() {
        return offerDinner;
    }

    /**
     * ����offerDinner���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setOfferDinner(Boolean value) {
        this.offerDinner = value;
    }

    /**
     * ��ȡofferBrunch���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isOfferBrunch() {
        return offerBrunch;
    }

    /**
     * ����offerBrunch���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setOfferBrunch(Boolean value) {
        this.offerBrunch = value;
    }

    /**
     * ��ȡproximityCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getProximityCode() {
        return proximityCode;
    }

    /**
     * ����proximityCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProximityCode(String value) {
        this.proximityCode = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * ��ȡsort���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSort() {
        return sort;
    }

    /**
     * ����sort���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSort(BigInteger value) {
        this.sort = value;
    }

    /**
     * ��ȡreservationReqInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReservationReqInd() {
        return reservationReqInd;
    }

    /**
     * ����reservationReqInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReservationReqInd(Boolean value) {
        this.reservationReqInd = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
     *       &lt;attribute name="Attire" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MultimediaDescriptions
            extends MultimediaDescriptionsType {

        @XmlAttribute(name = "Attire")
        protected String attire;

        /**
         * ��ȡattire���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAttire() {
            return attire;
        }

        /**
         * ����attire���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAttire(String value) {
            this.attire = value;
        }

    }

}
