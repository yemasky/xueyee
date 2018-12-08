package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfSellableProductsTypeSellableProduct complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfSellableProductsTypeSellableProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellableProduct" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DestinationSystemCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProductDestinationSystemCode" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="GuestRoom" type="{http://www.opentravel.org/OTA/2003/05}GuestRoomType" minOccurs="0"/>
 *                     &lt;element name="MeetingRooms" type="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType" minOccurs="0"/>
 *                     &lt;element name="InventoryBlock" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InvCodeApplication">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="DoesNotApply"/>
 *                       &lt;enumeration value="InvCode"/>
 *                       &lt;enumeration value="InvGroupingCode"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="InvNotifType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="New"/>
 *                       &lt;enumeration value="Delta"/>
 *                       &lt;enumeration value="Overlay"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InvStatusType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Initial"/>
 *                       &lt;enumeration value="Active"/>
 *                       &lt;enumeration value="Deactivated"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="InvGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OrderSequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfSellableProductsTypeSellableProduct", propOrder = {
        "sellableProduct"
})
public class ArrayOfSellableProductsTypeSellableProduct {

    @XmlElement(name = "SellableProduct")
    protected List<ArrayOfSellableProductsTypeSellableProduct.SellableProduct> sellableProduct;

    /**
     * Gets the value of the sellableProduct property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellableProduct property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellableProduct().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSellableProductsTypeSellableProduct.SellableProduct }
     */
    public List<ArrayOfSellableProductsTypeSellableProduct.SellableProduct> getSellableProduct() {
        if (sellableProduct == null) {
            sellableProduct = new ArrayList<ArrayOfSellableProductsTypeSellableProduct.SellableProduct>();
        }
        return this.sellableProduct;
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
     *         &lt;element name="DestinationSystemCodes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProductsTypeSellableProductDestinationSystemCode" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="GuestRoom" type="{http://www.opentravel.org/OTA/2003/05}GuestRoomType" minOccurs="0"/>
     *           &lt;element name="MeetingRooms" type="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType" minOccurs="0"/>
     *           &lt;element name="InventoryBlock" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InvCodeApplication">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="DoesNotApply"/>
     *             &lt;enumeration value="InvCode"/>
     *             &lt;enumeration value="InvGroupingCode"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="InvNotifType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="New"/>
     *             &lt;enumeration value="Delta"/>
     *             &lt;enumeration value="Overlay"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InvStatusType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Initial"/>
     *             &lt;enumeration value="Active"/>
     *             &lt;enumeration value="Deactivated"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="InvGroupingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OrderSequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "destinationSystemCodes",
            "guestRoom",
            "meetingRooms",
            "inventoryBlock",
            "description",
            "uniqueID"
    })
    public static class SellableProduct {

        @XmlElement(name = "DestinationSystemCodes")
        protected ArrayOfSellableProductsTypeSellableProductDestinationSystemCode destinationSystemCodes;
        @XmlElement(name = "GuestRoom")
        protected GuestRoomType guestRoom;
        @XmlElement(name = "MeetingRooms")
        protected MeetingRoomsType meetingRooms;
        @XmlElement(name = "InventoryBlock")
        protected ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock inventoryBlock;
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
         * ��ȡdestinationSystemCodes���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfSellableProductsTypeSellableProductDestinationSystemCode }
         */
        public ArrayOfSellableProductsTypeSellableProductDestinationSystemCode getDestinationSystemCodes() {
            return destinationSystemCodes;
        }

        /**
         * ����destinationSystemCodes���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfSellableProductsTypeSellableProductDestinationSystemCode }
         */
        public void setDestinationSystemCodes(ArrayOfSellableProductsTypeSellableProductDestinationSystemCode value) {
            this.destinationSystemCodes = value;
        }

        /**
         * ��ȡguestRoom���Ե�ֵ��
         *
         * @return possible object is
         * {@link GuestRoomType }
         */
        public GuestRoomType getGuestRoom() {
            return guestRoom;
        }

        /**
         * ����guestRoom���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link GuestRoomType }
         */
        public void setGuestRoom(GuestRoomType value) {
            this.guestRoom = value;
        }

        /**
         * ��ȡmeetingRooms���Ե�ֵ��
         *
         * @return possible object is
         * {@link MeetingRoomsType }
         */
        public MeetingRoomsType getMeetingRooms() {
            return meetingRooms;
        }

        /**
         * ����meetingRooms���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link MeetingRoomsType }
         */
        public void setMeetingRooms(MeetingRoomsType value) {
            this.meetingRooms = value;
        }

        /**
         * ��ȡinventoryBlock���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock }
         */
        public ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock getInventoryBlock() {
            return inventoryBlock;
        }

        /**
         * ����inventoryBlock���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock }
         */
        public void setInventoryBlock(ArrayOfSellableProductsTypeSellableProduct.SellableProduct.InventoryBlock value) {
            this.inventoryBlock = value;
        }

        /**
         * ��ȡdescription���Ե�ֵ��
         *
         * @return possible object is
         * {@link ParagraphType }
         */
        public ParagraphType getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ParagraphType }
         */
        public void setDescription(ParagraphType value) {
            this.description = value;
        }

        /**
         * ��ȡuniqueID���Ե�ֵ��
         *
         * @return possible object is
         * {@link UniqueIDType }
         */
        public UniqueIDType getUniqueID() {
            return uniqueID;
        }

        /**
         * ����uniqueID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link UniqueIDType }
         */
        public void setUniqueID(UniqueIDType value) {
            this.uniqueID = value;
        }

        /**
         * ��ȡrph���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRPH() {
            return rph;
        }

        /**
         * ����rph���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * ��ȡinvCodeApplication���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInvCodeApplication() {
            return invCodeApplication;
        }

        /**
         * ����invCodeApplication���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInvCodeApplication(String value) {
            this.invCodeApplication = value;
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
         * ��ȡinvType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInvType() {
            return invType;
        }

        /**
         * ����invType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInvType(String value) {
            this.invType = value;
        }

        /**
         * ��ȡinvTypeCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInvTypeCode() {
            return invTypeCode;
        }

        /**
         * ����invTypeCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInvTypeCode(String value) {
            this.invTypeCode = value;
        }

        /**
         * ��ȡisRoom���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isIsRoom() {
            return isRoom;
        }

        /**
         * ����isRoom���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setIsRoom(Boolean value) {
            this.isRoom = value;
        }

        /**
         * ��ȡinvNotifType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInvNotifType() {
            return invNotifType;
        }

        /**
         * ����invNotifType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInvNotifType(String value) {
            this.invNotifType = value;
        }

        /**
         * ��ȡinvStatusType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInvStatusType() {
            return invStatusType;
        }

        /**
         * ����invStatusType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInvStatusType(String value) {
            this.invStatusType = value;
        }

        /**
         * ��ȡinvGroupingCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getInvGroupingCode() {
            return invGroupingCode;
        }

        /**
         * ����invGroupingCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setInvGroupingCode(String value) {
            this.invGroupingCode = value;
        }

        /**
         * ��ȡorderSequence���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getOrderSequence() {
            return orderSequence;
        }

        /**
         * ����orderSequence���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setOrderSequence(BigInteger value) {
            this.orderSequence = value;
        }

        /**
         * ��ȡstart���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStart() {
            return start;
        }

        /**
         * ����start���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * ��ȡduration���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDuration() {
            return duration;
        }

        /**
         * ����duration���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * ��ȡend���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEnd() {
            return end;
        }

        /**
         * ����end���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEnd(String value) {
            this.end = value;
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
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InventoryBlock {

            @XmlAttribute(name = "Code")
            protected String code;

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

        }

    }

}
