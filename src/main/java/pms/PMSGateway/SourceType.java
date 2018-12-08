package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>SourceType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="SourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestorID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                 &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Position" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PositionAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingChannel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Primary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AgentSine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ISOCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ISOCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AgentDutyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AirlineVendorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AirportCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FirstDepartPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ERSP_UserID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TerminalID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceType", propOrder = {
        "requestorID",
        "position",
        "bookingChannel"
})
public class SourceType {

    @XmlElement(name = "RequestorID")
    protected SourceType.RequestorID requestorID;
    @XmlElement(name = "Position")
    protected SourceType.Position position;
    @XmlElement(name = "BookingChannel")
    protected SourceType.BookingChannel bookingChannel;
    @XmlAttribute(name = "AgentSine")
    protected String agentSine;
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "ISOCountry")
    protected String isoCountry;
    @XmlAttribute(name = "ISOCurrency")
    protected String isoCurrency;
    @XmlAttribute(name = "AgentDutyCode")
    protected String agentDutyCode;
    @XmlAttribute(name = "AirlineVendorID")
    protected String airlineVendorID;
    @XmlAttribute(name = "AirportCode")
    protected String airportCode;
    @XmlAttribute(name = "FirstDepartPoint")
    protected String firstDepartPoint;
    @XmlAttribute(name = "ERSP_UserID")
    protected String erspUserID;
    @XmlAttribute(name = "TerminalID")
    protected String terminalID;

    /**
     * ��ȡrequestorID���Ե�ֵ��
     *
     * @return possible object is
     * {@link SourceType.RequestorID }
     */
    public SourceType.RequestorID getRequestorID() {
        return requestorID;
    }

    /**
     * ����requestorID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SourceType.RequestorID }
     */
    public void setRequestorID(SourceType.RequestorID value) {
        this.requestorID = value;
    }

    /**
     * ��ȡposition���Ե�ֵ��
     *
     * @return possible object is
     * {@link SourceType.Position }
     */
    public SourceType.Position getPosition() {
        return position;
    }

    /**
     * ����position���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SourceType.Position }
     */
    public void setPosition(SourceType.Position value) {
        this.position = value;
    }

    /**
     * ��ȡbookingChannel���Ե�ֵ��
     *
     * @return possible object is
     * {@link SourceType.BookingChannel }
     */
    public SourceType.BookingChannel getBookingChannel() {
        return bookingChannel;
    }

    /**
     * ����bookingChannel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SourceType.BookingChannel }
     */
    public void setBookingChannel(SourceType.BookingChannel value) {
        this.bookingChannel = value;
    }

    /**
     * ��ȡagentSine���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAgentSine() {
        return agentSine;
    }

    /**
     * ����agentSine���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAgentSine(String value) {
        this.agentSine = value;
    }

    /**
     * ��ȡpseudoCityCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * ����pseudoCityCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * ��ȡisoCountry���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getISOCountry() {
        return isoCountry;
    }

    /**
     * ����isoCountry���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setISOCountry(String value) {
        this.isoCountry = value;
    }

    /**
     * ��ȡisoCurrency���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getISOCurrency() {
        return isoCurrency;
    }

    /**
     * ����isoCurrency���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setISOCurrency(String value) {
        this.isoCurrency = value;
    }

    /**
     * ��ȡagentDutyCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAgentDutyCode() {
        return agentDutyCode;
    }

    /**
     * ����agentDutyCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAgentDutyCode(String value) {
        this.agentDutyCode = value;
    }

    /**
     * ��ȡairlineVendorID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAirlineVendorID() {
        return airlineVendorID;
    }

    /**
     * ����airlineVendorID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAirlineVendorID(String value) {
        this.airlineVendorID = value;
    }

    /**
     * ��ȡairportCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * ����airportCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * ��ȡfirstDepartPoint���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getFirstDepartPoint() {
        return firstDepartPoint;
    }

    /**
     * ����firstDepartPoint���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFirstDepartPoint(String value) {
        this.firstDepartPoint = value;
    }

    /**
     * ��ȡerspUserID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getERSPUserID() {
        return erspUserID;
    }

    /**
     * ����erspUserID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setERSPUserID(String value) {
        this.erspUserID = value;
    }

    /**
     * ��ȡterminalID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * ����terminalID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
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
     *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Primary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "companyName"
    })
    public static class BookingChannel {

        @XmlElement(name = "CompanyName")
        protected CompanyNameType companyName;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Primary")
        protected Boolean primary;

        /**
         * ��ȡcompanyName���Ե�ֵ��
         *
         * @return possible object is
         * {@link CompanyNameType }
         */
        public CompanyNameType getCompanyName() {
            return companyName;
        }

        /**
         * ����companyName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link CompanyNameType }
         */
        public void setCompanyName(CompanyNameType value) {
            this.companyName = value;
        }

        /**
         * ��ȡtype���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getType() {
            return type;
        }

        /**
         * ����type���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * ��ȡprimary���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isPrimary() {
            return primary;
        }

        /**
         * ����primary���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setPrimary(Boolean value) {
            this.primary = value;
        }

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
     *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PositionAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Position {

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

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *       &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RequestorID
            extends UniqueIDType {

        @XmlAttribute(name = "MessagePassword")
        protected String messagePassword;

        /**
         * ��ȡmessagePassword���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMessagePassword() {
            return messagePassword;
        }

        /**
         * ����messagePassword���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMessagePassword(String value) {
            this.messagePassword = value;
        }

    }

}
