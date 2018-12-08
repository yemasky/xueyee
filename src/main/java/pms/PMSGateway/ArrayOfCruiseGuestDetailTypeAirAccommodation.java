package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfCruiseGuestDetailTypeAirAccommodation complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfCruiseGuestDetailTypeAirAccommodation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirAccommodation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirInfoType">
 *                 &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AirAccommodationType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfCruiseGuestDetailTypeAirAccommodation", propOrder = {
        "airAccommodation"
})
public class ArrayOfCruiseGuestDetailTypeAirAccommodation {

    @XmlElement(name = "AirAccommodation")
    protected List<ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation> airAccommodation;

    /**
     * Gets the value of the airAccommodation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airAccommodation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirAccommodation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation }
     */
    public List<ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation> getAirAccommodation() {
        if (airAccommodation == null) {
            airAccommodation = new ArrayList<ArrayOfCruiseGuestDetailTypeAirAccommodation.AirAccommodation>();
        }
        return this.airAccommodation;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirInfoType">
     *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AirAccommodationType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirAccommodation
            extends AirInfoType {

        @XmlAttribute(name = "Comment")
        protected String comment;
        @XmlAttribute(name = "AirAccommodationType")
        protected String airAccommodationType;

        /**
         * ��ȡcomment���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getComment() {
            return comment;
        }

        /**
         * ����comment���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * ��ȡairAccommodationType���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAirAccommodationType() {
            return airAccommodationType;
        }

        /**
         * ����airAccommodationType���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAirAccommodationType(String value) {
            this.airAccommodationType = value;
        }

    }

}
