package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfPropertyValueMatchTypeAmenity complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfPropertyValueMatchTypeAmenity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amenity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>RoomAmenityPrefType">
 *                 &lt;attribute name="PropertyAmenityType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPropertyValueMatchTypeAmenity", propOrder = {
        "amenity"
})
public class ArrayOfPropertyValueMatchTypeAmenity {

    @XmlElement(name = "Amenity")
    protected List<ArrayOfPropertyValueMatchTypeAmenity.Amenity> amenity;

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
     * {@link ArrayOfPropertyValueMatchTypeAmenity.Amenity }
     */
    public List<ArrayOfPropertyValueMatchTypeAmenity.Amenity> getAmenity() {
        if (amenity == null) {
            amenity = new ArrayList<ArrayOfPropertyValueMatchTypeAmenity.Amenity>();
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>RoomAmenityPrefType">
     *       &lt;attribute name="PropertyAmenityType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Amenity
            extends RoomAmenityPrefType {

        @XmlAttribute(name = "PropertyAmenityType")
        protected String propertyAmenityType;

        /**
         * ��ȡpropertyAmenityType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPropertyAmenityType() {
            return propertyAmenityType;
        }

        /**
         * ����propertyAmenityType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPropertyAmenityType(String value) {
            this.propertyAmenityType = value;
        }

    }

}
