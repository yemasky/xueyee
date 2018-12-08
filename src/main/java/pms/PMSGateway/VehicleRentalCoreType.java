package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>VehicleRentalCoreType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleRentalCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickUpLocation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReturnLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="StartChargesDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="StopChargesDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="OneWayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MultiIslandRentalDays" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="DistUnitName" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalCoreType", propOrder = {
        "pickUpLocation",
        "returnLocation"
})
public class VehicleRentalCoreType {

    @XmlElement(name = "PickUpLocation")
    protected List<VehicleRentalCoreType.PickUpLocation> pickUpLocation;
    @XmlElement(name = "ReturnLocation")
    protected VehicleRentalCoreType.ReturnLocation returnLocation;
    @XmlAttribute(name = "PickUpDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickUpDateTime;
    @XmlAttribute(name = "ReturnDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDateTime;
    @XmlAttribute(name = "StartChargesDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startChargesDateTime;
    @XmlAttribute(name = "StopChargesDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopChargesDateTime;
    @XmlAttribute(name = "OneWayIndicator")
    protected Boolean oneWayIndicator;
    @XmlAttribute(name = "MultiIslandRentalDays")
    protected BigInteger multiIslandRentalDays;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "DistUnitName")
    protected DistanceUnitNameType distUnitName;

    /**
     * Gets the value of the pickUpLocation property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickUpLocation property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickUpLocation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalCoreType.PickUpLocation }
     */
    public List<VehicleRentalCoreType.PickUpLocation> getPickUpLocation() {
        if (pickUpLocation == null) {
            pickUpLocation = new ArrayList<VehicleRentalCoreType.PickUpLocation>();
        }
        return this.pickUpLocation;
    }

    /**
     * ��ȡreturnLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleRentalCoreType.ReturnLocation }
     */
    public VehicleRentalCoreType.ReturnLocation getReturnLocation() {
        return returnLocation;
    }

    /**
     * ����returnLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleRentalCoreType.ReturnLocation }
     */
    public void setReturnLocation(VehicleRentalCoreType.ReturnLocation value) {
        this.returnLocation = value;
    }

    /**
     * ��ȡpickUpDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPickUpDateTime() {
        return pickUpDateTime;
    }

    /**
     * ����pickUpDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setPickUpDateTime(XMLGregorianCalendar value) {
        this.pickUpDateTime = value;
    }

    /**
     * ��ȡreturnDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getReturnDateTime() {
        return returnDateTime;
    }

    /**
     * ����returnDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setReturnDateTime(XMLGregorianCalendar value) {
        this.returnDateTime = value;
    }

    /**
     * ��ȡstartChargesDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStartChargesDateTime() {
        return startChargesDateTime;
    }

    /**
     * ����startChargesDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setStartChargesDateTime(XMLGregorianCalendar value) {
        this.startChargesDateTime = value;
    }

    /**
     * ��ȡstopChargesDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStopChargesDateTime() {
        return stopChargesDateTime;
    }

    /**
     * ����stopChargesDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setStopChargesDateTime(XMLGregorianCalendar value) {
        this.stopChargesDateTime = value;
    }

    /**
     * ��ȡoneWayIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isOneWayIndicator() {
        return oneWayIndicator;
    }

    /**
     * ����oneWayIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setOneWayIndicator(Boolean value) {
        this.oneWayIndicator = value;
    }

    /**
     * ��ȡmultiIslandRentalDays���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMultiIslandRentalDays() {
        return multiIslandRentalDays;
    }

    /**
     * ����multiIslandRentalDays���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMultiIslandRentalDays(BigInteger value) {
        this.multiIslandRentalDays = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * ��ȡdistUnitName���Ե�ֵ��
     *
     * @return possible object is
     * {@link DistanceUnitNameType }
     */
    public DistanceUnitNameType getDistUnitName() {
        return distUnitName;
    }

    /**
     * ����distUnitName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DistanceUnitNameType }
     */
    public void setDistUnitName(DistanceUnitNameType value) {
        this.distUnitName = value;
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
     *       &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PickUpLocation
            extends LocationType {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "CounterLocation")
        protected String counterLocation;

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

        /**
         * ��ȡcounterLocation���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCounterLocation() {
            return counterLocation;
        }

        /**
         * ����counterLocation���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCounterLocation(String value) {
            this.counterLocation = value;
        }

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
     *       &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReturnLocation
            extends LocationType {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "CounterLocation")
        protected String counterLocation;

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

        /**
         * ��ȡcounterLocation���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCounterLocation() {
            return counterLocation;
        }

        /**
         * ����counterLocation���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCounterLocation(String value) {
            this.counterLocation = value;
        }

    }

}
