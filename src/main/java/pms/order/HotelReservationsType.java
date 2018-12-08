package pms.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>HotelReservationsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HotelReservationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
 *                 &lt;sequence>
 *                   &lt;element name="RebatePrograms" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRebateType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoutingHops" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoutingHopTypeRoutingHop" minOccurs="0"/>
 *         &lt;element name="WrittenConfInst" type="{http://www.opentravel.org/OTA/2003/05}WrittenConfInstType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationsType", propOrder = {
        "hotelReservation",
        "routingHops",
        "writtenConfInst",
        "tpaExtensions"
})
public class HotelReservationsType {

    @XmlElement(name = "HotelReservation")
    protected List<HotelReservationsType.HotelReservation> hotelReservation;
    @XmlElement(name = "RoutingHops")
    protected ArrayOfRoutingHopTypeRoutingHop routingHops;
    @XmlElement(name = "WrittenConfInst")
    protected WrittenConfInstType writtenConfInst;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Gets the value of the hotelReservation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReservation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelReservation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReservationsType.HotelReservation }
     */
    public List<HotelReservationsType.HotelReservation> getHotelReservation() {
        if (hotelReservation == null) {
            hotelReservation = new ArrayList<HotelReservationsType.HotelReservation>();
        }
        return this.hotelReservation;
    }

    /**
     * ��ȡroutingHops���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfRoutingHopTypeRoutingHop }
     */
    public ArrayOfRoutingHopTypeRoutingHop getRoutingHops() {
        return routingHops;
    }

    /**
     * ����routingHops���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfRoutingHopTypeRoutingHop }
     */
    public void setRoutingHops(ArrayOfRoutingHopTypeRoutingHop value) {
        this.routingHops = value;
    }

    /**
     * ��ȡwrittenConfInst���Ե�ֵ��
     *
     * @return possible object is
     * {@link WrittenConfInstType }
     */
    public WrittenConfInstType getWrittenConfInst() {
        return writtenConfInst;
    }

    /**
     * ����writtenConfInst���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link WrittenConfInstType }
     */
    public void setWrittenConfInst(WrittenConfInstType value) {
        this.writtenConfInst = value;
    }

    /**
     * ��ȡtpaExtensions���Ե�ֵ��
     *
     * @return possible object is
     * {@link TPAExtensionsType }
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * ����tpaExtensions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TPAExtensionsType }
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
     *       &lt;sequence>
     *         &lt;element name="RebatePrograms" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRebateType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "rebatePrograms"
    })
    public static class HotelReservation
            extends HotelReservationType {

        @XmlElement(name = "RebatePrograms")
        protected ArrayOfRebateType rebatePrograms;

        /**
         * ��ȡrebatePrograms���Ե�ֵ��
         *
         * @return possible object is
         * {@link ArrayOfRebateType }
         */
        public ArrayOfRebateType getRebatePrograms() {
            return rebatePrograms;
        }

        /**
         * ����rebatePrograms���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ArrayOfRebateType }
         */
        public void setRebatePrograms(ArrayOfRebateType value) {
            this.rebatePrograms = value;
        }

    }

}
