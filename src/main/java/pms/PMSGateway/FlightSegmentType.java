package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>FlightSegmentType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="FlightSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FlightSegmentBaseType">
 *       &lt;sequence>
 *         &lt;element name="MarketingAirline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
 *                 &lt;attribute name="SingleVendorInd">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="SingleVndr"/>
 *                       &lt;enumeration value="Alliance"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TourOperatorFlightID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GovernmentApprovalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GovernmentApprovalText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentType", propOrder = {
        "marketingAirline"
})
@XmlSeeAlso({
        BookFlightSegmentType.class
})
public class FlightSegmentType
        extends FlightSegmentBaseType {

    @XmlElement(name = "MarketingAirline")
    protected FlightSegmentType.MarketingAirline marketingAirline;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "TourOperatorFlightID")
    protected String tourOperatorFlightID;
    @XmlAttribute(name = "GovernmentApprovalInd")
    protected Boolean governmentApprovalInd;
    @XmlAttribute(name = "GovernmentApprovalText")
    protected String governmentApprovalText;

    /**
     * ��ȡmarketingAirline���Ե�ֵ��
     *
     * @return possible object is
     * {@link FlightSegmentType.MarketingAirline }
     */
    public FlightSegmentType.MarketingAirline getMarketingAirline() {
        return marketingAirline;
    }

    /**
     * ����marketingAirline���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link FlightSegmentType.MarketingAirline }
     */
    public void setMarketingAirline(FlightSegmentType.MarketingAirline value) {
        this.marketingAirline = value;
    }

    /**
     * ��ȡflightNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * ����flightNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * ��ȡtourOperatorFlightID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }

    /**
     * ����tourOperatorFlightID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTourOperatorFlightID(String value) {
        this.tourOperatorFlightID = value;
    }

    /**
     * ��ȡgovernmentApprovalInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGovernmentApprovalInd() {
        return governmentApprovalInd;
    }

    /**
     * ����governmentApprovalInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGovernmentApprovalInd(Boolean value) {
        this.governmentApprovalInd = value;
    }

    /**
     * ��ȡgovernmentApprovalText���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGovernmentApprovalText() {
        return governmentApprovalText;
    }

    /**
     * ����governmentApprovalText���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGovernmentApprovalText(String value) {
        this.governmentApprovalText = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
     *       &lt;attribute name="SingleVendorInd">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="SingleVndr"/>
     *             &lt;enumeration value="Alliance"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MarketingAirline
            extends CompanyNameType {

        @XmlAttribute(name = "SingleVendorInd")
        protected String singleVendorInd;

        /**
         * ��ȡsingleVendorInd���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSingleVendorInd() {
            return singleVendorInd;
        }

        /**
         * ����singleVendorInd���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSingleVendorInd(String value) {
            this.singleVendorInd = value;
        }

    }

}
