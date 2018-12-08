
package ota.jw.PMSGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelInfoTypeService complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelInfoTypeService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/&gt;
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/&gt;
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
 *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/&gt;
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AvailableToAnyGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="MeetingRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfHotelInfoTypeService", propOrder = {
    "service"
})
public class ArrayOfHotelInfoTypeService {

    @XmlElement(name = "Service")
    protected List<ArrayOfHotelInfoTypeService.Service> service;

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelInfoTypeService.Service }
     * 
     * 
     */
    public List<ArrayOfHotelInfoTypeService.Service> getService() {
        if (service == null) {
            service = new ArrayList<ArrayOfHotelInfoTypeService.Service>();
        }
        return this.service;
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
     *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/&gt;
     *         &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/&gt;
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/&gt;
     *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
     *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/&gt;
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AvailableToAnyGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="MeetingRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contact",
        "relativePosition",
        "operationSchedules",
        "multimediaDescriptions",
        "features",
        "descriptiveText"
    })
    public static class Service {

        @XmlElement(name = "Contact")
        protected ContactInfoType contact;
        @XmlElement(name = "RelativePosition")
        protected RelativePositionType relativePosition;
        @XmlElement(name = "OperationSchedules")
        protected ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule operationSchedules;
        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlElement(name = "Features")
        protected ArrayOfFeaturesTypeFeature features;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;
        @XmlAttribute(name = "Included")
        protected Boolean included;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "BusinessServiceCode")
        protected String businessServiceCode;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "AvailableToAnyGuest")
        protected Boolean availableToAnyGuest;
        @XmlAttribute(name = "InvCode")
        protected String invCode;
        @XmlAttribute(name = "ProximityCode")
        protected String proximityCode;
        @XmlAttribute(name = "MealPlanCode")
        protected String mealPlanCode;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "Sort")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger sort;
        @XmlAttribute(name = "MeetingRoomCode")
        protected String meetingRoomCode;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * 获取contact属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ContactInfoType }
         *     
         */
        public ContactInfoType getContact() {
            return contact;
        }

        /**
         * 设置contact属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ContactInfoType }
         *     
         */
        public void setContact(ContactInfoType value) {
            this.contact = value;
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
         * 获取multimediaDescriptions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * 设置multimediaDescriptions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        /**
         * 获取features属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfFeaturesTypeFeature }
         *     
         */
        public ArrayOfFeaturesTypeFeature getFeatures() {
            return features;
        }

        /**
         * 设置features属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfFeaturesTypeFeature }
         *     
         */
        public void setFeatures(ArrayOfFeaturesTypeFeature value) {
            this.features = value;
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
         * 获取included属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncluded() {
            return included;
        }

        /**
         * 设置included属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncluded(Boolean value) {
            this.included = value;
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
         * 获取businessServiceCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessServiceCode() {
            return businessServiceCode;
        }

        /**
         * 设置businessServiceCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessServiceCode(String value) {
            this.businessServiceCode = value;
        }

        /**
         * 获取existsCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExistsCode() {
            return existsCode;
        }

        /**
         * 设置existsCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExistsCode(String value) {
            this.existsCode = value;
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
         * 获取availableToAnyGuest属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAvailableToAnyGuest() {
            return availableToAnyGuest;
        }

        /**
         * 设置availableToAnyGuest属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAvailableToAnyGuest(Boolean value) {
            this.availableToAnyGuest = value;
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
         * 获取mealPlanCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMealPlanCode() {
            return mealPlanCode;
        }

        /**
         * 设置mealPlanCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMealPlanCode(String value) {
            this.mealPlanCode = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
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
         * 获取meetingRoomCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeetingRoomCode() {
            return meetingRoomCode;
        }

        /**
         * 设置meetingRoomCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeetingRoomCode(String value) {
            this.meetingRoomCode = value;
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

    }

}
