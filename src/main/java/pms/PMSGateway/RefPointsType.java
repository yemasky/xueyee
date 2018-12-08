package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RefPointsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RefPointsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefPoint" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelativePositionType">
 *                 &lt;sequence>
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RefPointCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Proximity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RefPointName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PositionAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "RefPointsType", propOrder = {
        "refPoint"
})
@XmlSeeAlso({
        pms.PMSGateway.AreaInfoType.RefPoints.class
})
public class RefPointsType {

    @XmlElement(name = "RefPoint")
    protected List<RefPointsType.RefPoint> refPoint;

    /**
     * Gets the value of the refPoint property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refPoint property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefPoint().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RefPointsType.RefPoint }
     */
    public List<RefPointsType.RefPoint> getRefPoint() {
        if (refPoint == null) {
            refPoint = new ArrayList<RefPointsType.RefPoint>();
        }
        return this.refPoint;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelativePositionType">
     *       &lt;sequence>
     *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="RefPointCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Proximity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RefPointName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PositionAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "multimediaDescriptions",
            "descriptiveText"
    })
    public static class RefPoint
            extends RelativePositionType {

        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;
        @XmlAttribute(name = "RefPointCategoryCode")
        protected String refPointCategoryCode;
        @XmlAttribute(name = "Proximity")
        protected String proximity;
        @XmlAttribute(name = "CityCode")
        protected String cityCode;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "RefPointName")
        protected String refPointName;
        @XmlAttribute(name = "Latitude")
        protected String latitude;
        @XmlAttribute(name = "Longitude")
        protected String longitude;
        @XmlAttribute(name = "Altitude")
        protected String altitude;
        @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
        protected String altitudeUnitOfMeasureCode;
        @XmlAttribute(name = "PositionAccuracy")
        protected String positionAccuracy;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;
        @XmlAttribute(name = "StateProv")
        protected String stateProv;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * ��ȡmultimediaDescriptions���Ե�ֵ��
         *
         * @return possible object is
         * {@link MultimediaDescriptionsType }
         */
        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * ����multimediaDescriptions���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link MultimediaDescriptionsType }
         */
        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        /**
         * ��ȡdescriptiveText���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * ����descriptiveText���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }

        /**
         * ��ȡrefPointCategoryCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRefPointCategoryCode() {
            return refPointCategoryCode;
        }

        /**
         * ����refPointCategoryCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRefPointCategoryCode(String value) {
            this.refPointCategoryCode = value;
        }

        /**
         * ��ȡproximity���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getProximity() {
            return proximity;
        }

        /**
         * ����proximity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setProximity(String value) {
            this.proximity = value;
        }

        /**
         * ��ȡcityCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCityCode() {
            return cityCode;
        }

        /**
         * ����cityCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCityCode(String value) {
            this.cityCode = value;
        }

        /**
         * ��ȡcodeDetail���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * ����codeDetail���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * ��ȡrefPointName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRefPointName() {
            return refPointName;
        }

        /**
         * ����refPointName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRefPointName(String value) {
            this.refPointName = value;
        }

        /**
         * ��ȡlatitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * ����latitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * ��ȡlongitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * ����longitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * ��ȡaltitude���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * ����altitude���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * ��ȡaltitudeUnitOfMeasureCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * ����altitudeUnitOfMeasureCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
        }

        /**
         * ��ȡpositionAccuracy���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPositionAccuracy() {
            return positionAccuracy;
        }

        /**
         * ����positionAccuracy���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPositionAccuracy(String value) {
            this.positionAccuracy = value;
        }

        /**
         * ��ȡuri���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getURI() {
            return uri;
        }

        /**
         * ����uri���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * ��ȡexistsCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getExistsCode() {
            return existsCode;
        }

        /**
         * ����existsCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setExistsCode(String value) {
            this.existsCode = value;
        }

        /**
         * ��ȡstateProv���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStateProv() {
            return stateProv;
        }

        /**
         * ����stateProv���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStateProv(String value) {
            this.stateProv = value;
        }

        /**
         * ��ȡcountryCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * ����countryCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
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
