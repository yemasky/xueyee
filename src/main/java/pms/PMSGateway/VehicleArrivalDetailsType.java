package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>VehicleArrivalDetailsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleArrivalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="MarketingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="OperatingCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TransportationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleArrivalDetailsType", propOrder = {
        "arrivalLocation",
        "marketingCompany",
        "operatingCompany"
})
public class VehicleArrivalDetailsType {

    @XmlElement(name = "ArrivalLocation")
    protected LocationType arrivalLocation;
    @XmlElement(name = "MarketingCompany")
    protected CompanyNameType marketingCompany;
    @XmlElement(name = "OperatingCompany")
    protected CompanyNameType operatingCompany;
    @XmlAttribute(name = "TransportationCode")
    protected String transportationCode;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "ArrivalDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;

    /**
     * ��ȡarrivalLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link LocationType }
     */
    public LocationType getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     * ����arrivalLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link LocationType }
     */
    public void setArrivalLocation(LocationType value) {
        this.arrivalLocation = value;
    }

    /**
     * ��ȡmarketingCompany���Ե�ֵ��
     *
     * @return possible object is
     * {@link CompanyNameType }
     */
    public CompanyNameType getMarketingCompany() {
        return marketingCompany;
    }

    /**
     * ����marketingCompany���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CompanyNameType }
     */
    public void setMarketingCompany(CompanyNameType value) {
        this.marketingCompany = value;
    }

    /**
     * ��ȡoperatingCompany���Ե�ֵ��
     *
     * @return possible object is
     * {@link CompanyNameType }
     */
    public CompanyNameType getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * ����operatingCompany���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CompanyNameType }
     */
    public void setOperatingCompany(CompanyNameType value) {
        this.operatingCompany = value;
    }

    /**
     * ��ȡtransportationCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTransportationCode() {
        return transportationCode;
    }

    /**
     * ����transportationCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransportationCode(String value) {
        this.transportationCode = value;
    }

    /**
     * ��ȡnumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumber() {
        return number;
    }

    /**
     * ����number���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * ��ȡarrivalDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * ����arrivalDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

}
