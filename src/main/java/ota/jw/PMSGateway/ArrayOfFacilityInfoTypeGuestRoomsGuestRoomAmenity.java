
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
 * <p>ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amenity" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/&gt;
 *                   &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoRootType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RoomAmenityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="IncludedInRateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
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
@XmlType(name = "ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity", propOrder = {
    "amenity"
})
public class ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity {

    @XmlElement(name = "Amenity")
    protected List<ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity.Amenity> amenity;

    /**
     * Gets the value of the amenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity.Amenity }
     * 
     * 
     */
    public List<ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity.Amenity> getAmenity() {
        if (amenity == null) {
            amenity = new ArrayList<ArrayOfFacilityInfoTypeGuestRoomsGuestRoomAmenity.Amenity>();
        }
        return this.amenity;
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
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/&gt;
     *         &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoRootType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/&gt;
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RoomAmenityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="IncludedInRateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
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
        "operationSchedules",
        "contactInfo",
        "multimediaDescriptions",
        "descriptiveText"
    })
    public static class Amenity {

        @XmlElement(name = "OperationSchedules")
        protected ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule operationSchedules;
        @XmlElement(name = "ContactInfo")
        protected List<ContactInfoRootType> contactInfo;
        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;
        @XmlAttribute(name = "RoomAmenityCode")
        protected String roomAmenityCode;
        @XmlAttribute(name = "IncludedInRateIndicator")
        protected Boolean includedInRateIndicator;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "ID")
        protected String id;

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
         * Gets the value of the contactInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactInfoRootType }
         * 
         * 
         */
        public List<ContactInfoRootType> getContactInfo() {
            if (contactInfo == null) {
                contactInfo = new ArrayList<ContactInfoRootType>();
            }
            return this.contactInfo;
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
         * 获取roomAmenityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomAmenityCode() {
            return roomAmenityCode;
        }

        /**
         * 设置roomAmenityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomAmenityCode(String value) {
            this.roomAmenityCode = value;
        }

        /**
         * 获取includedInRateIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncludedInRateIndicator() {
            return includedInRateIndicator;
        }

        /**
         * 设置includedInRateIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncludedInRateIndicator(Boolean value) {
            this.includedInRateIndicator = value;
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
