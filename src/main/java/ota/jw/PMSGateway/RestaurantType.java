
package ota.jw.PMSGateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RestaurantType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RestaurantType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MultimediaDescriptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType"&gt;
 *                 &lt;attribute name="Attire" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/&gt;
 *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/&gt;
 *         &lt;element name="InfoCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantTypeInfoCode" minOccurs="0"/&gt;
 *         &lt;element name="CuisineCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRestaurantTypeCuisineCode" minOccurs="0"/&gt;
 *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RestaurantName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaxSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="MaxSingleParty" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OfferBreakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OfferLunch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OfferDinner" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OfferBrunch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="ReservationReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
    ota.jw.PMSGateway.RestaurantsType.Restaurant.class
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
     * 获取multimediaDescriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RestaurantType.MultimediaDescriptions }
     *     
     */
    public RestaurantType.MultimediaDescriptions getMultimediaDescriptions() {
        return multimediaDescriptions;
    }

    /**
     * 设置multimediaDescriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantType.MultimediaDescriptions }
     *     
     */
    public void setMultimediaDescriptions(RestaurantType.MultimediaDescriptions value) {
        this.multimediaDescriptions = value;
    }

    /**
     * 获取relativePosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelativePositionType }
     *     
     */
    public RelativePositionType getRelativePosition() {
        return relativePosition;
    }

    /**
     * 设置relativePosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelativePositionType }
     *     
     */
    public void setRelativePosition(RelativePositionType value) {
        this.relativePosition = value;
    }

    /**
     * 获取operationSchedules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
     *     
     */
    public ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * 设置operationSchedules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
     *     
     */
    public void setOperationSchedules(ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule value) {
        this.operationSchedules = value;
    }

    /**
     * 获取infoCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRestaurantTypeInfoCode }
     *     
     */
    public ArrayOfRestaurantTypeInfoCode getInfoCodes() {
        return infoCodes;
    }

    /**
     * 设置infoCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRestaurantTypeInfoCode }
     *     
     */
    public void setInfoCodes(ArrayOfRestaurantTypeInfoCode value) {
        this.infoCodes = value;
    }

    /**
     * 获取cuisineCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRestaurantTypeCuisineCode }
     *     
     */
    public ArrayOfRestaurantTypeCuisineCode getCuisineCodes() {
        return cuisineCodes;
    }

    /**
     * 设置cuisineCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRestaurantTypeCuisineCode }
     *     
     */
    public void setCuisineCodes(ArrayOfRestaurantTypeCuisineCode value) {
        this.cuisineCodes = value;
    }

    /**
     * 获取descriptiveText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveText() {
        return descriptiveText;
    }

    /**
     * 设置descriptiveText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveText(String value) {
        this.descriptiveText = value;
    }

    /**
     * 获取restaurantName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * 设置restaurantName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurantName(String value) {
        this.restaurantName = value;
    }

    /**
     * 获取maxSeatingCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSeatingCapacity() {
        return maxSeatingCapacity;
    }

    /**
     * 设置maxSeatingCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSeatingCapacity(BigInteger value) {
        this.maxSeatingCapacity = value;
    }

    /**
     * 获取maxSingleParty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSingleParty() {
        return maxSingleParty;
    }

    /**
     * 设置maxSingleParty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSingleParty(BigInteger value) {
        this.maxSingleParty = value;
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
     * 获取offerBreakfast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferBreakfast() {
        return offerBreakfast;
    }

    /**
     * 设置offerBreakfast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferBreakfast(Boolean value) {
        this.offerBreakfast = value;
    }

    /**
     * 获取offerLunch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferLunch() {
        return offerLunch;
    }

    /**
     * 设置offerLunch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferLunch(Boolean value) {
        this.offerLunch = value;
    }

    /**
     * 获取offerDinner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferDinner() {
        return offerDinner;
    }

    /**
     * 设置offerDinner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferDinner(Boolean value) {
        this.offerDinner = value;
    }

    /**
     * 获取offerBrunch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferBrunch() {
        return offerBrunch;
    }

    /**
     * 设置offerBrunch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferBrunch(Boolean value) {
        this.offerBrunch = value;
    }

    /**
     * 获取proximityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProximityCode() {
        return proximityCode;
    }

    /**
     * 设置proximityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProximityCode(String value) {
        this.proximityCode = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 获取sort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSort() {
        return sort;
    }

    /**
     * 设置sort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSort(BigInteger value) {
        this.sort = value;
    }

    /**
     * 获取reservationReqInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReservationReqInd() {
        return reservationReqInd;
    }

    /**
     * 设置reservationReqInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReservationReqInd(Boolean value) {
        this.reservationReqInd = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType"&gt;
     *       &lt;attribute name="Attire" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MultimediaDescriptions
        extends MultimediaDescriptionsType
    {

        @XmlAttribute(name = "Attire")
        protected String attire;

        /**
         * 获取attire属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttire() {
            return attire;
        }

        /**
         * 设置attire属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttire(String value) {
            this.attire = value;
        }

    }

}
