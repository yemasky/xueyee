package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfAddressesTypeAddress complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfAddressesTypeAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
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
@XmlType(name = "ArrayOfAddressesTypeAddress", propOrder = {
        "address"
})
public class ArrayOfAddressesTypeAddress {

    @XmlElement(name = "Address")
    protected List<ArrayOfAddressesTypeAddress.Address> address;

    /**
     * Gets the value of the address property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAddressesTypeAddress.Address }
     */
    public List<ArrayOfAddressesTypeAddress.Address> getAddress() {
        if (address == null) {
            address = new ArrayList<ArrayOfAddressesTypeAddress.Address>();
        }
        return this.address;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType">
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
            extends AddressInfoType {

        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * ��ȡremoval���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * ����removal���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
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
