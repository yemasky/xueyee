package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfOfferTypeOfferRuleInventory complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfOfferTypeOfferRuleInventory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inventory" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
 *                 &lt;attribute name="AppliesToIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfOfferTypeOfferRuleInventory", propOrder = {
        "inventory"
})
public class ArrayOfOfferTypeOfferRuleInventory {

    @XmlElement(name = "Inventory")
    protected List<ArrayOfOfferTypeOfferRuleInventory.Inventory> inventory;

    /**
     * Gets the value of the inventory property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventory property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventory().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOfferTypeOfferRuleInventory.Inventory }
     */
    public List<ArrayOfOfferTypeOfferRuleInventory.Inventory> getInventory() {
        if (inventory == null) {
            inventory = new ArrayList<ArrayOfOfferTypeOfferRuleInventory.Inventory>();
        }
        return this.inventory;
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
     *       &lt;attribute name="AppliesToIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Inventory {

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
        @XmlAttribute(name = "AppliesToIndicator", required = true)
        protected boolean appliesToIndicator;

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
         * ��ȡappliesToIndicator���Ե�ֵ��
         */
        public boolean isAppliesToIndicator() {
            return appliesToIndicator;
        }

        /**
         * ����appliesToIndicator���Ե�ֵ��
         */
        public void setAppliesToIndicator(boolean value) {
            this.appliesToIndicator = value;
        }

    }

}
