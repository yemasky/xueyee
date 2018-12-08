package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfHotelInfoTypeService complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfHotelInfoTypeService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
 *                   &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/>
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AvailableToAnyGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MeetingRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfHotelInfoTypeService", propOrder = {
        "service"
})
public class ArrayOfHotelInfoTypeService {

    @XmlElement(name = "Service")
    protected List<ArrayOfHotelInfoTypeService.Service> service;

    /**
     * Gets the value of the service property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelInfoTypeService.Service }
     */
    public List<ArrayOfHotelInfoTypeService.Service> getService() {
        if (service == null) {
            service = new ArrayList<ArrayOfHotelInfoTypeService.Service>();
        }
        return this.service;
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
     *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
     *         &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/>
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
     *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AvailableToAnyGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MeetingRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * ��ȡcontact���Ե�ֵ��
         *
         * @return possible object is
         * {@link ContactInfoType }
         */
        public ContactInfoType getContact() {
            return contact;
        }

        /**
         * ����contact���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ContactInfoType }
         */
        public void setContact(ContactInfoType value) {
            this.contact = value;
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
         * ��ȡmultimediaDescriptions���Ե�ֵ��
         *
         * @return possible object is
         * {@link MultimediaDescriptionsType }
         */
        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * ����multimediaDescriptions���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link MultimediaDescriptionsType }
         */
        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        /**
         * ��ȡfeatures���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfFeaturesTypeFeature }
         */
        public ArrayOfFeaturesTypeFeature getFeatures() {
            return features;
        }

        /**
         * ����features���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfFeaturesTypeFeature }
         */
        public void setFeatures(ArrayOfFeaturesTypeFeature value) {
            this.features = value;
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
         * ��ȡincluded���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isIncluded() {
            return included;
        }

        /**
         * ����included���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setIncluded(Boolean value) {
            this.included = value;
        }

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * ��ȡbusinessServiceCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getBusinessServiceCode() {
            return businessServiceCode;
        }

        /**
         * ����businessServiceCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setBusinessServiceCode(String value) {
            this.businessServiceCode = value;
        }

        /**
         * ��ȡexistsCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getExistsCode() {
            return existsCode;
        }

        /**
         * ����existsCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setExistsCode(String value) {
            this.existsCode = value;
        }

        /**
         * ��ȡcodeDetail���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * ����codeDetail���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * ��ȡavailableToAnyGuest���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isAvailableToAnyGuest() {
            return availableToAnyGuest;
        }

        /**
         * ����availableToAnyGuest���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setAvailableToAnyGuest(Boolean value) {
            this.availableToAnyGuest = value;
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
         * ��ȡmealPlanCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMealPlanCode() {
            return mealPlanCode;
        }

        /**
         * ����mealPlanCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMealPlanCode(String value) {
            this.mealPlanCode = value;
        }

        /**
         * ��ȡquantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * ����quantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
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
         * ��ȡmeetingRoomCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMeetingRoomCode() {
            return meetingRoomCode;
        }

        /**
         * ����meetingRoomCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMeetingRoomCode(String value) {
            this.meetingRoomCode = value;
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

    }

}
