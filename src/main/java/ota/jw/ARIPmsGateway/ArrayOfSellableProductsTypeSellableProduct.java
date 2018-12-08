
package ota.jw.ARIPmsGateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSellableProductsTypeSellableProduct complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSellableProductsTypeSellableProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SellableProduct" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DestinationSystemCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProductDestinationSystemCode" minOccurs="0"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="GuestRoom" type="{http://www.opentravel.org/OTA/2003/05}GuestRoomType" minOccurs="0"/&gt;
 *                     &lt;element name="InventoryBlock" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="MeetingRooms" type="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType" minOccurs="0"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InvCodeApplication"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="DoesNotApply"/&gt;
 *                       &lt;enumeration value="InvCode"/&gt;
 *                       &lt;enumeration value="InvGroupingCode"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="InvNotifType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="New"/&gt;
 *                       &lt;enumeration value="Delta"/&gt;
 *                       &lt;enumeration value="Overlay"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="InvStatusType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Initial"/&gt;
 *                       &lt;enumeration value="Active"/&gt;
 *                       &lt;enumeration value="Deactivated"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="InvGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OrderSequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfSellableProductsTypeSellableProduct", propOrder = {
    "sellableProduct"
})
public class ArrayOfSellableProductsTypeSellableProduct {

    @XmlElement(name = "SellableProduct")
    protected List<ArrayOfSellableProductsTypeSellableProduct.SellableProduct> sellableProduct;

    /**
     * Gets the value of the sellableProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellableProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellableProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSellableProductsTypeSellableProduct.SellableProduct }
     * 
     * 
     */
    public List<ArrayOfSellableProductsTypeSellableProduct.SellableProduct> getSellableProduct() {
        if (sellableProduct == null) {
            sellableProduct = new ArrayList<ArrayOfSellableProductsTypeSellableProduct.SellableProduct>();
        }
        return this.sellableProduct;
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
     *         &lt;element name="DestinationSystemCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProductDestinationSystemCode" minOccurs="0"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="GuestRoom" type="{http://www.opentravel.org/OTA/2003/05}GuestRoomType" minOccurs="0"/&gt;
     *           &lt;element name="InventoryBlock" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="MeetingRooms" type="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType" minOccurs="0"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InvCodeApplication"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="DoesNotApply"/&gt;
     *             &lt;enumeration value="InvCode"/&gt;
     *             &lt;enumeration value="InvGroupingCode"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="InvNotifType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="New"/&gt;
     *             &lt;enumeration value="Delta"/&gt;
     *             &lt;enumeration value="Overlay"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="InvStatusType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Initial"/&gt;
     *             &lt;enumeration value="Active"/&gt;
     *             &lt;enumeration value="Deactivated"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="InvGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OrderSequence" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "destinationSystemCodes",
        "guestRoom",
        "inventoryBlock",
        "meetingRooms",
        "description",
        "uniqueID"
    })
    public static class SellableProduct {

        @XmlElement(name = "DestinationSystemCodes")
        protected ArrayOfSellableProductsTypeSellableProductDestinationSystemCode destinationSystemCodes;
        @XmlElement(name = "GuestRoom")
        protected GuestRoomType guestRoom;
        @XmlElement(name = "InventoryBlock")
        protected ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock inventoryBlock;
        @XmlElement(name = "MeetingRooms")
        protected MeetingRoomsType meetingRooms;
        @XmlElement(name = "Description")
        protected ParagraphType description;
        @XmlElement(name = "UniqueID")
        protected UniqueIDType uniqueID;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "InvCodeApplication")
        protected String invCodeApplication;
        @XmlAttribute(name = "InvCode")
        protected String invCode;
        @XmlAttribute(name = "InvType")
        protected String invType;
        @XmlAttribute(name = "InvTypeCode")
        protected String invTypeCode;
        @XmlAttribute(name = "IsRoom")
        protected Boolean isRoom;
        @XmlAttribute(name = "InvNotifType")
        protected String invNotifType;
        @XmlAttribute(name = "InvStatusType")
        protected String invStatusType;
        @XmlAttribute(name = "InvGroupingCode")
        protected String invGroupingCode;
        @XmlAttribute(name = "OrderSequence")
        protected BigInteger orderSequence;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;

        /**
         * 获取destinationSystemCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSellableProductsTypeSellableProductDestinationSystemCode }
         *     
         */
        public ArrayOfSellableProductsTypeSellableProductDestinationSystemCode getDestinationSystemCodes() {
            return destinationSystemCodes;
        }

        /**
         * 设置destinationSystemCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSellableProductsTypeSellableProductDestinationSystemCode }
         *     
         */
        public void setDestinationSystemCodes(ArrayOfSellableProductsTypeSellableProductDestinationSystemCode value) {
            this.destinationSystemCodes = value;
        }

        /**
         * 获取guestRoom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link GuestRoomType }
         *     
         */
        public GuestRoomType getGuestRoom() {
            return guestRoom;
        }

        /**
         * 设置guestRoom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link GuestRoomType }
         *     
         */
        public void setGuestRoom(GuestRoomType value) {
            this.guestRoom = value;
        }

        /**
         * 获取inventoryBlock属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock }
         *     
         */
        public ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock getInventoryBlock() {
            return inventoryBlock;
        }

        /**
         * 设置inventoryBlock属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock }
         *     
         */
        public void setInventoryBlock(ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock value) {
            this.inventoryBlock = value;
        }

        /**
         * 获取meetingRooms属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MeetingRoomsType }
         *     
         */
        public MeetingRoomsType getMeetingRooms() {
            return meetingRooms;
        }

        /**
         * 设置meetingRooms属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MeetingRoomsType }
         *     
         */
        public void setMeetingRooms(MeetingRoomsType value) {
            this.meetingRooms = value;
        }

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
         * 获取uniqueID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getUniqueID() {
            return uniqueID;
        }

        /**
         * 设置uniqueID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setUniqueID(UniqueIDType value) {
            this.uniqueID = value;
        }

        /**
         * 获取rph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * 设置rph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * 获取invCodeApplication属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvCodeApplication() {
            return invCodeApplication;
        }

        /**
         * 设置invCodeApplication属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvCodeApplication(String value) {
            this.invCodeApplication = value;
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
         * 获取invType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvType() {
            return invType;
        }

        /**
         * 设置invType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvType(String value) {
            this.invType = value;
        }

        /**
         * 获取invTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvTypeCode() {
            return invTypeCode;
        }

        /**
         * 设置invTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvTypeCode(String value) {
            this.invTypeCode = value;
        }

        /**
         * 获取isRoom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsRoom() {
            return isRoom;
        }

        /**
         * 设置isRoom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsRoom(Boolean value) {
            this.isRoom = value;
        }

        /**
         * 获取invNotifType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvNotifType() {
            return invNotifType;
        }

        /**
         * 设置invNotifType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvNotifType(String value) {
            this.invNotifType = value;
        }

        /**
         * 获取invStatusType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvStatusType() {
            return invStatusType;
        }

        /**
         * 设置invStatusType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvStatusType(String value) {
            this.invStatusType = value;
        }

        /**
         * 获取invGroupingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvGroupingCode() {
            return invGroupingCode;
        }

        /**
         * 设置invGroupingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvGroupingCode(String value) {
            this.invGroupingCode = value;
        }

        /**
         * 获取orderSequence属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrderSequence() {
            return orderSequence;
        }

        /**
         * 设置orderSequence属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrderSequence(BigInteger value) {
            this.orderSequence = value;
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InventoryBlock {

            @XmlAttribute(name = "Code")
            protected String code;

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

        }

    }

}
