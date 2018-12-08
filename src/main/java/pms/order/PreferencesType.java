package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>PreferencesType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="PreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrefCollection" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CommonPref" type="{http://www.opentravel.org/OTA/2003/05}CommonPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="VehicleRentalPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleProfileRentalPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AirlinePref" type="{http://www.opentravel.org/OTA/2003/05}AirlinePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="HotelPref" type="{http://www.opentravel.org/OTA/2003/05}HotelPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OtherSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}OtherSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ShareSynchInd">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Yes"/>
 *                       &lt;enumeration value="No"/>
 *                       &lt;enumeration value="Inherit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ShareMarketInd">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Yes"/>
 *                       &lt;enumeration value="No"/>
 *                       &lt;enumeration value="Inherit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferencesType", propOrder = {
        "prefCollection"
})
public class PreferencesType {

    @XmlElement(name = "PrefCollection")
    protected List<PreferencesType.PrefCollection> prefCollection;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;

    /**
     * Gets the value of the prefCollection property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefCollection property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefCollection().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferencesType.PrefCollection }
     */
    public List<PreferencesType.PrefCollection> getPrefCollection() {
        if (prefCollection == null) {
            prefCollection = new ArrayList<PreferencesType.PrefCollection>();
        }
        return this.prefCollection;
    }

    /**
     * ��ȡshareSynchInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * ����shareSynchInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * ��ȡshareMarketInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * ����shareMarketInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
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
     *         &lt;element name="CommonPref" type="{http://www.opentravel.org/OTA/2003/05}CommonPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="VehicleRentalPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleProfileRentalPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AirlinePref" type="{http://www.opentravel.org/OTA/2003/05}AirlinePrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="HotelPref" type="{http://www.opentravel.org/OTA/2003/05}HotelPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OtherSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}OtherSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ShareSynchInd">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Yes"/>
     *             &lt;enumeration value="No"/>
     *             &lt;enumeration value="Inherit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ShareMarketInd">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Yes"/>
     *             &lt;enumeration value="No"/>
     *             &lt;enumeration value="Inherit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "commonPref",
            "vehicleRentalPref",
            "airlinePref",
            "hotelPref",
            "otherSrvcPref",
            "tpaExtensions"
    })
    public static class PrefCollection {

        @XmlElement(name = "CommonPref")
        protected List<CommonPrefType> commonPref;
        @XmlElement(name = "VehicleRentalPref")
        protected List<VehicleProfileRentalPrefType> vehicleRentalPref;
        @XmlElement(name = "AirlinePref")
        protected List<AirlinePrefType> airlinePref;
        @XmlElement(name = "HotelPref")
        protected List<HotelPrefType> hotelPref;
        @XmlElement(name = "OtherSrvcPref")
        protected List<OtherSrvcPrefType> otherSrvcPref;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "ShareSynchInd")
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        protected String shareMarketInd;
        @XmlAttribute(name = "TravelPurpose")
        protected String travelPurpose;

        /**
         * Gets the value of the commonPref property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commonPref property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommonPref().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link CommonPrefType }
         */
        public List<CommonPrefType> getCommonPref() {
            if (commonPref == null) {
                commonPref = new ArrayList<CommonPrefType>();
            }
            return this.commonPref;
        }

        /**
         * Gets the value of the vehicleRentalPref property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleRentalPref property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleRentalPref().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleProfileRentalPrefType }
         */
        public List<VehicleProfileRentalPrefType> getVehicleRentalPref() {
            if (vehicleRentalPref == null) {
                vehicleRentalPref = new ArrayList<VehicleProfileRentalPrefType>();
            }
            return this.vehicleRentalPref;
        }

        /**
         * Gets the value of the airlinePref property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlinePref property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlinePref().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link AirlinePrefType }
         */
        public List<AirlinePrefType> getAirlinePref() {
            if (airlinePref == null) {
                airlinePref = new ArrayList<AirlinePrefType>();
            }
            return this.airlinePref;
        }

        /**
         * Gets the value of the hotelPref property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelPref property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelPref().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelPrefType }
         */
        public List<HotelPrefType> getHotelPref() {
            if (hotelPref == null) {
                hotelPref = new ArrayList<HotelPrefType>();
            }
            return this.hotelPref;
        }

        /**
         * Gets the value of the otherSrvcPref property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherSrvcPref property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherSrvcPref().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherSrvcPrefType }
         */
        public List<OtherSrvcPrefType> getOtherSrvcPref() {
            if (otherSrvcPref == null) {
                otherSrvcPref = new ArrayList<OtherSrvcPrefType>();
            }
            return this.otherSrvcPref;
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
         * ��ȡshareSynchInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * ����shareSynchInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * ��ȡshareMarketInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * ����shareMarketInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * ��ȡtravelPurpose���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getTravelPurpose() {
            return travelPurpose;
        }

        /**
         * ����travelPurpose���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTravelPurpose(String value) {
            this.travelPurpose = value;
        }

    }

}
