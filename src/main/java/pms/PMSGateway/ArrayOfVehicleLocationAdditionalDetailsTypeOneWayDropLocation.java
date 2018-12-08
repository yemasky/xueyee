package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OneWayDropLocation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation", propOrder = {
        "oneWayDropLocation"
})
public class ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation {

    @XmlElement(name = "OneWayDropLocation")
    protected List<ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation.OneWayDropLocation> oneWayDropLocation;

    /**
     * Gets the value of the oneWayDropLocation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oneWayDropLocation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneWayDropLocation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation.OneWayDropLocation }
     */
    public List<ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation.OneWayDropLocation> getOneWayDropLocation() {
        if (oneWayDropLocation == null) {
            oneWayDropLocation = new ArrayList<ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation.OneWayDropLocation>();
        }
        return this.oneWayDropLocation;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OneWayDropLocation
            extends LocationType {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;

        /**
         * ��ȡextendedLocationCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getExtendedLocationCode() {
            return extendedLocationCode;
        }

        /**
         * ����extendedLocationCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setExtendedLocationCode(String value) {
            this.extendedLocationCode = value;
        }

    }

}
