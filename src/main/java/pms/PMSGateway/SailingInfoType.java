package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>SailingInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="SailingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedSailing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SailingBaseType">
 *                 &lt;attribute name="VoyageID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PortsOfCallQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InclusivePackageOption" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CruisePackageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Currency" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
@XmlType(name = "SailingInfoType", propOrder = {
        "selectedSailing",
        "inclusivePackageOption",
        "currency"
})
@XmlSeeAlso({
        SailingCategoryInfoType.class,
        SailingType.class
})
public class SailingInfoType {

    @XmlElement(name = "SelectedSailing")
    protected SailingInfoType.SelectedSailing selectedSailing;
    @XmlElement(name = "InclusivePackageOption")
    protected SailingInfoType.InclusivePackageOption inclusivePackageOption;
    @XmlElement(name = "Currency")
    protected SailingInfoType.Currency currency;

    /**
     * ��ȡselectedSailing���Ե�ֵ��
     *
     * @return possible object is
     * {@link SailingInfoType.SelectedSailing }
     */
    public SailingInfoType.SelectedSailing getSelectedSailing() {
        return selectedSailing;
    }

    /**
     * ����selectedSailing���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SailingInfoType.SelectedSailing }
     */
    public void setSelectedSailing(SailingInfoType.SelectedSailing value) {
        this.selectedSailing = value;
    }

    /**
     * ��ȡinclusivePackageOption���Ե�ֵ��
     *
     * @return possible object is
     * {@link SailingInfoType.InclusivePackageOption }
     */
    public SailingInfoType.InclusivePackageOption getInclusivePackageOption() {
        return inclusivePackageOption;
    }

    /**
     * ����inclusivePackageOption���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SailingInfoType.InclusivePackageOption }
     */
    public void setInclusivePackageOption(SailingInfoType.InclusivePackageOption value) {
        this.inclusivePackageOption = value;
    }

    /**
     * ��ȡcurrency���Ե�ֵ��
     *
     * @return possible object is
     * {@link SailingInfoType.Currency }
     */
    public SailingInfoType.Currency getCurrency() {
        return currency;
    }

    /**
     * ����currency���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link SailingInfoType.Currency }
     */
    public void setCurrency(SailingInfoType.Currency value) {
        this.currency = value;
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
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Currency {

        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * ��ȡcurrencyCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * ����currencyCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * ��ȡdecimalPlaces���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * ����decimalPlaces���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
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
     *       &lt;attribute name="CruisePackageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InclusivePackageOption {

        @XmlAttribute(name = "CruisePackageCode")
        protected String cruisePackageCode;
        @XmlAttribute(name = "InclusiveIndicator")
        protected Boolean inclusiveIndicator;

        /**
         * ��ȡcruisePackageCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCruisePackageCode() {
            return cruisePackageCode;
        }

        /**
         * ����cruisePackageCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCruisePackageCode(String value) {
            this.cruisePackageCode = value;
        }

        /**
         * ��ȡinclusiveIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isInclusiveIndicator() {
            return inclusiveIndicator;
        }

        /**
         * ����inclusiveIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setInclusiveIndicator(Boolean value) {
            this.inclusiveIndicator = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SailingBaseType">
     *       &lt;attribute name="VoyageID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PortsOfCallQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedSailing
            extends SailingBaseType {

        @XmlAttribute(name = "VoyageID")
        protected String voyageID;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "PortsOfCallQuantity")
        protected BigInteger portsOfCallQuantity;

        /**
         * ��ȡvoyageID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getVoyageID() {
            return voyageID;
        }

        /**
         * ����voyageID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVoyageID(String value) {
            this.voyageID = value;
        }

        /**
         * ��ȡstart���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStart() {
            return start;
        }

        /**
         * ����start���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * ��ȡduration���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDuration() {
            return duration;
        }

        /**
         * ����duration���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * ��ȡend���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEnd() {
            return end;
        }

        /**
         * ����end���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * ��ȡstatus���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStatus() {
            return status;
        }

        /**
         * ����status���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * ��ȡportsOfCallQuantity���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPortsOfCallQuantity() {
            return portsOfCallQuantity;
        }

        /**
         * ����portsOfCallQuantity���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPortsOfCallQuantity(BigInteger value) {
            this.portsOfCallQuantity = value;
        }

    }

}
