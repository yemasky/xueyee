package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfGuestRoomTypeAmenity complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfGuestRoomTypeAmenity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amenity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AmenityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfGuestRoomTypeAmenity", propOrder = {
        "amenity"
})
public class ArrayOfGuestRoomTypeAmenity {

    @XmlElement(name = "Amenity")
    protected List<ArrayOfGuestRoomTypeAmenity.Amenity> amenity;

    /**
     * Gets the value of the amenity property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amenity property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmenity().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfGuestRoomTypeAmenity.Amenity }
     */
    public List<ArrayOfGuestRoomTypeAmenity.Amenity> getAmenity() {
        if (amenity == null) {
            amenity = new ArrayList<ArrayOfGuestRoomTypeAmenity.Amenity>();
        }
        return this.amenity;
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
     *       &lt;attribute name="AmenityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Amenity {

        @XmlAttribute(name = "AmenityCode")
        protected String amenityCode;

        /**
         * ��ȡamenityCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAmenityCode() {
            return amenityCode;
        }

        /**
         * ����amenityCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAmenityCode(String value) {
            this.amenityCode = value;
        }

    }

}
