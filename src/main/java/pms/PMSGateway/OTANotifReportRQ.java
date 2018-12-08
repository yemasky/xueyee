package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MessageAcknowledgementType">
 *       &lt;sequence>
 *         &lt;element name="NotifDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="HotelNotifReport" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;choice>
 *                                 &lt;element name="HotelReservations" minOccurs="0">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
 *                                                   &lt;attribute name="WarningRPH">
 *                                                     &lt;simpleType>
 *                                                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                     &lt;/simpleType>
 *                                                   &lt;/attribute>
 *                                                 &lt;/extension>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="RateAmountMessages" minOccurs="0">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="RateAmountMessage" maxOccurs="unbounded" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateAmountMessageType">
 *                                                   &lt;attribute name="WarningRPH">
 *                                                     &lt;simpleType>
 *                                                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                     &lt;/simpleType>
 *                                                   &lt;/attribute>
 *                                                 &lt;/extension>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/sequence>
 *                                         &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="AvailStatusMessages" minOccurs="0">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="AvailStatusMessage" maxOccurs="unbounded" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailStatusMessageType">
 *                                                   &lt;attribute name="WarningRPH">
 *                                                     &lt;simpleType>
 *                                                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                     &lt;/simpleType>
 *                                                   &lt;/attribute>
 *                                                 &lt;/extension>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/sequence>
 *                                         &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="HotelDescriptiveContents" minOccurs="0">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="HotelDescriptiveContent" maxOccurs="unbounded" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType">
 *                                                   &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                   &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                   &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                   &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                   &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                   &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                   &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                   &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                   &lt;attribute name="WarningRPH">
 *                                                     &lt;simpleType>
 *                                                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                     &lt;/simpleType>
 *                                                   &lt;/attribute>
 *                                                 &lt;/extension>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/sequence>
 *                                         &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                         &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/choice>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="VehNotifReport" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="VehRes" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="VehNotifReportRQCore" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleResRSCoreType">
 *                                                 &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;/extension>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="VehNotifReportRQInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleResRSAdditionalInfoType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "notifDetails"
})
@XmlRootElement(name = "OTA_NotifReportRQ")
public class OTANotifReportRQ
        extends MessageAcknowledgementType {

    @XmlElement(name = "NotifDetails")
    protected OTANotifReportRQ.NotifDetails notifDetails;

    /**
     * ��ȡnotifDetails���Ե�ֵ��
     *
     * @return possible object is
     * {@link OTANotifReportRQ.NotifDetails }
     */
    public OTANotifReportRQ.NotifDetails getNotifDetails() {
        return notifDetails;
    }

    /**
     * ����notifDetails���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OTANotifReportRQ.NotifDetails }
     */
    public void setNotifDetails(OTANotifReportRQ.NotifDetails value) {
        this.notifDetails = value;
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
     *         &lt;choice>
     *           &lt;element name="HotelNotifReport" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;choice>
     *                       &lt;element name="HotelReservations" minOccurs="0">
     *                         &lt;complexType>
     *                           &lt;complexContent>
     *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                               &lt;sequence>
     *                                 &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
     *                                         &lt;attribute name="WarningRPH">
     *                                           &lt;simpleType>
     *                                             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                                           &lt;/simpleType>
     *                                         &lt;/attribute>
     *                                       &lt;/extension>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                               &lt;/sequence>
     *                             &lt;/restriction>
     *                           &lt;/complexContent>
     *                         &lt;/complexType>
     *                       &lt;/element>
     *                       &lt;element name="RateAmountMessages" minOccurs="0">
     *                         &lt;complexType>
     *                           &lt;complexContent>
     *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                               &lt;sequence>
     *                                 &lt;element name="RateAmountMessage" maxOccurs="unbounded" minOccurs="0">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateAmountMessageType">
     *                                         &lt;attribute name="WarningRPH">
     *                                           &lt;simpleType>
     *                                             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                                           &lt;/simpleType>
     *                                         &lt;/attribute>
     *                                       &lt;/extension>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                               &lt;/sequence>
     *                               &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;/restriction>
     *                           &lt;/complexContent>
     *                         &lt;/complexType>
     *                       &lt;/element>
     *                       &lt;element name="AvailStatusMessages" minOccurs="0">
     *                         &lt;complexType>
     *                           &lt;complexContent>
     *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                               &lt;sequence>
     *                                 &lt;element name="AvailStatusMessage" maxOccurs="unbounded" minOccurs="0">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailStatusMessageType">
     *                                         &lt;attribute name="WarningRPH">
     *                                           &lt;simpleType>
     *                                             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                                           &lt;/simpleType>
     *                                         &lt;/attribute>
     *                                       &lt;/extension>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                               &lt;/sequence>
     *                               &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;/restriction>
     *                           &lt;/complexContent>
     *                         &lt;/complexType>
     *                       &lt;/element>
     *                       &lt;element name="HotelDescriptiveContents" minOccurs="0">
     *                         &lt;complexType>
     *                           &lt;complexContent>
     *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                               &lt;sequence>
     *                                 &lt;element name="HotelDescriptiveContent" maxOccurs="unbounded" minOccurs="0">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType">
     *                                         &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                         &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                         &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                         &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                         &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                         &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                         &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                         &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                         &lt;attribute name="WarningRPH">
     *                                           &lt;simpleType>
     *                                             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                                           &lt;/simpleType>
     *                                         &lt;/attribute>
     *                                       &lt;/extension>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                               &lt;/sequence>
     *                               &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                               &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;/restriction>
     *                           &lt;/complexContent>
     *                         &lt;/complexType>
     *                       &lt;/element>
     *                     &lt;/choice>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="VehNotifReport" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="VehRes" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="VehNotifReportRQCore" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleResRSCoreType">
     *                                       &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;/extension>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="VehNotifReportRQInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleResRSAdditionalInfoType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "hotelNotifReport",
            "vehNotifReport"
    })
    public static class NotifDetails {

        @XmlElement(name = "HotelNotifReport")
        protected OTANotifReportRQ.NotifDetails.HotelNotifReport hotelNotifReport;
        @XmlElement(name = "VehNotifReport")
        protected OTANotifReportRQ.NotifDetails.VehNotifReport vehNotifReport;

        /**
         * ��ȡhotelNotifReport���Ե�ֵ��
         *
         * @return possible object is
         * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport }
         */
        public OTANotifReportRQ.NotifDetails.HotelNotifReport getHotelNotifReport() {
            return hotelNotifReport;
        }

        /**
         * ����hotelNotifReport���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OTANotifReportRQ.NotifDetails.HotelNotifReport }
         */
        public void setHotelNotifReport(OTANotifReportRQ.NotifDetails.HotelNotifReport value) {
            this.hotelNotifReport = value;
        }

        /**
         * ��ȡvehNotifReport���Ե�ֵ��
         *
         * @return possible object is
         * {@link OTANotifReportRQ.NotifDetails.VehNotifReport }
         */
        public OTANotifReportRQ.NotifDetails.VehNotifReport getVehNotifReport() {
            return vehNotifReport;
        }

        /**
         * ����vehNotifReport���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link OTANotifReportRQ.NotifDetails.VehNotifReport }
         */
        public void setVehNotifReport(OTANotifReportRQ.NotifDetails.VehNotifReport value) {
            this.vehNotifReport = value;
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
         *         &lt;choice>
         *           &lt;element name="HotelReservations" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
         *                             &lt;attribute name="WarningRPH">
         *                               &lt;simpleType>
         *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                           &lt;/extension>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="RateAmountMessages" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="RateAmountMessage" maxOccurs="unbounded" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateAmountMessageType">
         *                             &lt;attribute name="WarningRPH">
         *                               &lt;simpleType>
         *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                           &lt;/extension>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                   &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="AvailStatusMessages" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="AvailStatusMessage" maxOccurs="unbounded" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailStatusMessageType">
         *                             &lt;attribute name="WarningRPH">
         *                               &lt;simpleType>
         *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                           &lt;/extension>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                   &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="HotelDescriptiveContents" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="HotelDescriptiveContent" maxOccurs="unbounded" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType">
         *                             &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="WarningRPH">
         *                               &lt;simpleType>
         *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                           &lt;/extension>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                   &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "hotelReservations",
                "rateAmountMessages",
                "availStatusMessages",
                "hotelDescriptiveContents"
        })
        public static class HotelNotifReport {

            @XmlElement(name = "HotelReservations")
            protected OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations hotelReservations;
            @XmlElement(name = "RateAmountMessages")
            protected OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages rateAmountMessages;
            @XmlElement(name = "AvailStatusMessages")
            protected OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages availStatusMessages;
            @XmlElement(name = "HotelDescriptiveContents")
            protected OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents hotelDescriptiveContents;

            /**
             * ��ȡhotelReservations���Ե�ֵ��
             *
             * @return possible object is
             * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations }
             */
            public OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations getHotelReservations() {
                return hotelReservations;
            }

            /**
             * ����hotelReservations���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations }
             */
            public void setHotelReservations(OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations value) {
                this.hotelReservations = value;
            }

            /**
             * ��ȡrateAmountMessages���Ե�ֵ��
             *
             * @return possible object is
             * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages }
             */
            public OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages getRateAmountMessages() {
                return rateAmountMessages;
            }

            /**
             * ����rateAmountMessages���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages }
             */
            public void setRateAmountMessages(OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages value) {
                this.rateAmountMessages = value;
            }

            /**
             * ��ȡavailStatusMessages���Ե�ֵ��
             *
             * @return possible object is
             * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages }
             */
            public OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages getAvailStatusMessages() {
                return availStatusMessages;
            }

            /**
             * ����availStatusMessages���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages }
             */
            public void setAvailStatusMessages(OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages value) {
                this.availStatusMessages = value;
            }

            /**
             * ��ȡhotelDescriptiveContents���Ե�ֵ��
             *
             * @return possible object is
             * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents }
             */
            public OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents getHotelDescriptiveContents() {
                return hotelDescriptiveContents;
            }

            /**
             * ����hotelDescriptiveContents���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents }
             */
            public void setHotelDescriptiveContents(OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents value) {
                this.hotelDescriptiveContents = value;
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
             *         &lt;element name="AvailStatusMessage" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailStatusMessageType">
             *                 &lt;attribute name="WarningRPH">
             *                   &lt;simpleType>
             *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "availStatusMessage"
            })
            public static class AvailStatusMessages {

                @XmlElement(name = "AvailStatusMessage")
                protected List<OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage> availStatusMessage;
                @XmlAttribute(name = "ChainCode")
                protected String chainCode;
                @XmlAttribute(name = "BrandCode")
                protected String brandCode;
                @XmlAttribute(name = "HotelCode")
                protected String hotelCode;
                @XmlAttribute(name = "HotelCityCode")
                protected String hotelCityCode;
                @XmlAttribute(name = "HotelName")
                protected String hotelName;
                @XmlAttribute(name = "HotelCodeContext")
                protected String hotelCodeContext;
                @XmlAttribute(name = "ChainName")
                protected String chainName;
                @XmlAttribute(name = "BrandName")
                protected String brandName;

                /**
                 * Gets the value of the availStatusMessage property.
                 * <p/>
                 * <p/>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the availStatusMessage property.
                 * <p/>
                 * <p/>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAvailStatusMessage().add(newItem);
                 * </pre>
                 * <p/>
                 * <p/>
                 * <p/>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage }
                 */
                public List<OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage> getAvailStatusMessage() {
                    if (availStatusMessage == null) {
                        availStatusMessage = new ArrayList<OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage>();
                    }
                    return this.availStatusMessage;
                }

                /**
                 * ��ȡchainCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getChainCode() {
                    return chainCode;
                }

                /**
                 * ����chainCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setChainCode(String value) {
                    this.chainCode = value;
                }

                /**
                 * ��ȡbrandCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getBrandCode() {
                    return brandCode;
                }

                /**
                 * ����brandCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setBrandCode(String value) {
                    this.brandCode = value;
                }

                /**
                 * ��ȡhotelCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelCode() {
                    return hotelCode;
                }

                /**
                 * ����hotelCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelCode(String value) {
                    this.hotelCode = value;
                }

                /**
                 * ��ȡhotelCityCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelCityCode() {
                    return hotelCityCode;
                }

                /**
                 * ����hotelCityCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelCityCode(String value) {
                    this.hotelCityCode = value;
                }

                /**
                 * ��ȡhotelName���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelName() {
                    return hotelName;
                }

                /**
                 * ����hotelName���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelName(String value) {
                    this.hotelName = value;
                }

                /**
                 * ��ȡhotelCodeContext���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelCodeContext() {
                    return hotelCodeContext;
                }

                /**
                 * ����hotelCodeContext���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelCodeContext(String value) {
                    this.hotelCodeContext = value;
                }

                /**
                 * ��ȡchainName���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getChainName() {
                    return chainName;
                }

                /**
                 * ����chainName���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setChainName(String value) {
                    this.chainName = value;
                }

                /**
                 * ��ȡbrandName���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getBrandName() {
                    return brandName;
                }

                /**
                 * ����brandName���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setBrandName(String value) {
                    this.brandName = value;
                }


                /**
                 * <p>anonymous complex type�� Java �ࡣ
                 * <p/>
                 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
                 * <p/>
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailStatusMessageType">
                 *       &lt;attribute name="WarningRPH">
                 *         &lt;simpleType>
                 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class AvailStatusMessage
                        extends AvailStatusMessageType {

                    @XmlAttribute(name = "WarningRPH")
                    protected List<String> warningRPH;

                    /**
                     * Gets the value of the warningRPH property.
                     * <p/>
                     * <p/>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the warningRPH property.
                     * <p/>
                     * <p/>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getWarningRPH().add(newItem);
                     * </pre>
                     * <p/>
                     * <p/>
                     * <p/>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     */
                    public List<String> getWarningRPH() {
                        if (warningRPH == null) {
                            warningRPH = new ArrayList<String>();
                        }
                        return this.warningRPH;
                    }

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
             *       &lt;sequence>
             *         &lt;element name="HotelDescriptiveContent" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType">
             *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="WarningRPH">
             *                   &lt;simpleType>
             *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "hotelDescriptiveContent"
            })
            public static class HotelDescriptiveContents {

                @XmlElement(name = "HotelDescriptiveContent")
                protected List<OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent> hotelDescriptiveContent;
                @XmlAttribute(name = "ChainCode")
                protected String chainCode;
                @XmlAttribute(name = "BrandCode")
                protected String brandCode;
                @XmlAttribute(name = "HotelCode")
                protected String hotelCode;
                @XmlAttribute(name = "HotelCityCode")
                protected String hotelCityCode;
                @XmlAttribute(name = "HotelName")
                protected String hotelName;
                @XmlAttribute(name = "HotelCodeContext")
                protected String hotelCodeContext;
                @XmlAttribute(name = "ChainName")
                protected String chainName;
                @XmlAttribute(name = "BrandName")
                protected String brandName;

                /**
                 * Gets the value of the hotelDescriptiveContent property.
                 * <p/>
                 * <p/>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hotelDescriptiveContent property.
                 * <p/>
                 * <p/>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHotelDescriptiveContent().add(newItem);
                 * </pre>
                 * <p/>
                 * <p/>
                 * <p/>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent }
                 */
                public List<OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent> getHotelDescriptiveContent() {
                    if (hotelDescriptiveContent == null) {
                        hotelDescriptiveContent = new ArrayList<OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent>();
                    }
                    return this.hotelDescriptiveContent;
                }

                /**
                 * ��ȡchainCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getChainCode() {
                    return chainCode;
                }

                /**
                 * ����chainCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setChainCode(String value) {
                    this.chainCode = value;
                }

                /**
                 * ��ȡbrandCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getBrandCode() {
                    return brandCode;
                }

                /**
                 * ����brandCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setBrandCode(String value) {
                    this.brandCode = value;
                }

                /**
                 * ��ȡhotelCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelCode() {
                    return hotelCode;
                }

                /**
                 * ����hotelCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelCode(String value) {
                    this.hotelCode = value;
                }

                /**
                 * ��ȡhotelCityCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelCityCode() {
                    return hotelCityCode;
                }

                /**
                 * ����hotelCityCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelCityCode(String value) {
                    this.hotelCityCode = value;
                }

                /**
                 * ��ȡhotelName���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelName() {
                    return hotelName;
                }

                /**
                 * ����hotelName���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelName(String value) {
                    this.hotelName = value;
                }

                /**
                 * ��ȡhotelCodeContext���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelCodeContext() {
                    return hotelCodeContext;
                }

                /**
                 * ����hotelCodeContext���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelCodeContext(String value) {
                    this.hotelCodeContext = value;
                }

                /**
                 * ��ȡchainName���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getChainName() {
                    return chainName;
                }

                /**
                 * ����chainName���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setChainName(String value) {
                    this.chainName = value;
                }

                /**
                 * ��ȡbrandName���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getBrandName() {
                    return brandName;
                }

                /**
                 * ����brandName���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setBrandName(String value) {
                    this.brandName = value;
                }


                /**
                 * <p>anonymous complex type�� Java �ࡣ
                 * <p/>
                 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
                 * <p/>
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType">
                 *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="WarningRPH">
                 *         &lt;simpleType>
                 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class HotelDescriptiveContent
                        extends HotelDescriptiveContentType {

                    @XmlAttribute(name = "ChainCode")
                    protected String chainCode;
                    @XmlAttribute(name = "BrandCode")
                    protected String brandCode;
                    @XmlAttribute(name = "HotelCode")
                    protected String hotelCode;
                    @XmlAttribute(name = "HotelCityCode")
                    protected String hotelCityCode;
                    @XmlAttribute(name = "HotelName")
                    protected String hotelName;
                    @XmlAttribute(name = "HotelCodeContext")
                    protected String hotelCodeContext;
                    @XmlAttribute(name = "ChainName")
                    protected String chainName;
                    @XmlAttribute(name = "BrandName")
                    protected String brandName;
                    @XmlAttribute(name = "WarningRPH")
                    protected List<String> warningRPH;

                    /**
                     * ��ȡchainCode���Ե�ֵ��
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getChainCode() {
                        return chainCode;
                    }

                    /**
                     * ����chainCode���Ե�ֵ��
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setChainCode(String value) {
                        this.chainCode = value;
                    }

                    /**
                     * ��ȡbrandCode���Ե�ֵ��
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getBrandCode() {
                        return brandCode;
                    }

                    /**
                     * ����brandCode���Ե�ֵ��
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setBrandCode(String value) {
                        this.brandCode = value;
                    }

                    /**
                     * ��ȡhotelCode���Ե�ֵ��
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getHotelCode() {
                        return hotelCode;
                    }

                    /**
                     * ����hotelCode���Ե�ֵ��
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setHotelCode(String value) {
                        this.hotelCode = value;
                    }

                    /**
                     * ��ȡhotelCityCode���Ե�ֵ��
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getHotelCityCode() {
                        return hotelCityCode;
                    }

                    /**
                     * ����hotelCityCode���Ե�ֵ��
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setHotelCityCode(String value) {
                        this.hotelCityCode = value;
                    }

                    /**
                     * ��ȡhotelName���Ե�ֵ��
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getHotelName() {
                        return hotelName;
                    }

                    /**
                     * ����hotelName���Ե�ֵ��
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setHotelName(String value) {
                        this.hotelName = value;
                    }

                    /**
                     * ��ȡhotelCodeContext���Ե�ֵ��
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getHotelCodeContext() {
                        return hotelCodeContext;
                    }

                    /**
                     * ����hotelCodeContext���Ե�ֵ��
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setHotelCodeContext(String value) {
                        this.hotelCodeContext = value;
                    }

                    /**
                     * ��ȡchainName���Ե�ֵ��
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getChainName() {
                        return chainName;
                    }

                    /**
                     * ����chainName���Ե�ֵ��
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setChainName(String value) {
                        this.chainName = value;
                    }

                    /**
                     * ��ȡbrandName���Ե�ֵ��
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getBrandName() {
                        return brandName;
                    }

                    /**
                     * ����brandName���Ե�ֵ��
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setBrandName(String value) {
                        this.brandName = value;
                    }

                    /**
                     * Gets the value of the warningRPH property.
                     * <p/>
                     * <p/>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the warningRPH property.
                     * <p/>
                     * <p/>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getWarningRPH().add(newItem);
                     * </pre>
                     * <p/>
                     * <p/>
                     * <p/>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     */
                    public List<String> getWarningRPH() {
                        if (warningRPH == null) {
                            warningRPH = new ArrayList<String>();
                        }
                        return this.warningRPH;
                    }

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
             *       &lt;sequence>
             *         &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
             *                 &lt;attribute name="WarningRPH">
             *                   &lt;simpleType>
             *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
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
            @XmlType(name = "", propOrder = {
                    "hotelReservation"
            })
            public static class HotelReservations {

                @XmlElement(name = "HotelReservation")
                protected List<OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation> hotelReservation;

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
                 * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation }
                 */
                public List<OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation> getHotelReservation() {
                    if (hotelReservation == null) {
                        hotelReservation = new ArrayList<OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation>();
                    }
                    return this.hotelReservation;
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
                 *       &lt;attribute name="WarningRPH">
                 *         &lt;simpleType>
                 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class HotelReservation
                        extends HotelReservationType {

                    @XmlAttribute(name = "WarningRPH")
                    protected List<String> warningRPH;

                    /**
                     * Gets the value of the warningRPH property.
                     * <p/>
                     * <p/>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the warningRPH property.
                     * <p/>
                     * <p/>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getWarningRPH().add(newItem);
                     * </pre>
                     * <p/>
                     * <p/>
                     * <p/>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     */
                    public List<String> getWarningRPH() {
                        if (warningRPH == null) {
                            warningRPH = new ArrayList<String>();
                        }
                        return this.warningRPH;
                    }

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
             *       &lt;sequence>
             *         &lt;element name="RateAmountMessage" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateAmountMessageType">
             *                 &lt;attribute name="WarningRPH">
             *                   &lt;simpleType>
             *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "rateAmountMessage"
            })
            public static class RateAmountMessages {

                @XmlElement(name = "RateAmountMessage")
                protected List<OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage> rateAmountMessage;
                @XmlAttribute(name = "ChainCode")
                protected String chainCode;
                @XmlAttribute(name = "BrandCode")
                protected String brandCode;
                @XmlAttribute(name = "HotelCode")
                protected String hotelCode;
                @XmlAttribute(name = "HotelCityCode")
                protected String hotelCityCode;
                @XmlAttribute(name = "HotelName")
                protected String hotelName;
                @XmlAttribute(name = "HotelCodeContext")
                protected String hotelCodeContext;
                @XmlAttribute(name = "ChainName")
                protected String chainName;
                @XmlAttribute(name = "BrandName")
                protected String brandName;

                /**
                 * Gets the value of the rateAmountMessage property.
                 * <p/>
                 * <p/>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the rateAmountMessage property.
                 * <p/>
                 * <p/>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRateAmountMessage().add(newItem);
                 * </pre>
                 * <p/>
                 * <p/>
                 * <p/>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage }
                 */
                public List<OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage> getRateAmountMessage() {
                    if (rateAmountMessage == null) {
                        rateAmountMessage = new ArrayList<OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage>();
                    }
                    return this.rateAmountMessage;
                }

                /**
                 * ��ȡchainCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getChainCode() {
                    return chainCode;
                }

                /**
                 * ����chainCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setChainCode(String value) {
                    this.chainCode = value;
                }

                /**
                 * ��ȡbrandCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getBrandCode() {
                    return brandCode;
                }

                /**
                 * ����brandCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setBrandCode(String value) {
                    this.brandCode = value;
                }

                /**
                 * ��ȡhotelCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelCode() {
                    return hotelCode;
                }

                /**
                 * ����hotelCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelCode(String value) {
                    this.hotelCode = value;
                }

                /**
                 * ��ȡhotelCityCode���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelCityCode() {
                    return hotelCityCode;
                }

                /**
                 * ����hotelCityCode���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelCityCode(String value) {
                    this.hotelCityCode = value;
                }

                /**
                 * ��ȡhotelName���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelName() {
                    return hotelName;
                }

                /**
                 * ����hotelName���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelName(String value) {
                    this.hotelName = value;
                }

                /**
                 * ��ȡhotelCodeContext���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getHotelCodeContext() {
                    return hotelCodeContext;
                }

                /**
                 * ����hotelCodeContext���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setHotelCodeContext(String value) {
                    this.hotelCodeContext = value;
                }

                /**
                 * ��ȡchainName���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getChainName() {
                    return chainName;
                }

                /**
                 * ����chainName���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setChainName(String value) {
                    this.chainName = value;
                }

                /**
                 * ��ȡbrandName���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getBrandName() {
                    return brandName;
                }

                /**
                 * ����brandName���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setBrandName(String value) {
                    this.brandName = value;
                }


                /**
                 * <p>anonymous complex type�� Java �ࡣ
                 * <p/>
                 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
                 * <p/>
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateAmountMessageType">
                 *       &lt;attribute name="WarningRPH">
                 *         &lt;simpleType>
                 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class RateAmountMessage
                        extends RateAmountMessageType {

                    @XmlAttribute(name = "WarningRPH")
                    protected List<String> warningRPH;

                    /**
                     * Gets the value of the warningRPH property.
                     * <p/>
                     * <p/>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the warningRPH property.
                     * <p/>
                     * <p/>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getWarningRPH().add(newItem);
                     * </pre>
                     * <p/>
                     * <p/>
                     * <p/>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     */
                    public List<String> getWarningRPH() {
                        if (warningRPH == null) {
                            warningRPH = new ArrayList<String>();
                        }
                        return this.warningRPH;
                    }

                }

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
         *       &lt;sequence>
         *         &lt;element name="VehRes" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="VehNotifReportRQCore" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleResRSCoreType">
         *                           &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="VehNotifReportRQInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleResRSAdditionalInfoType" minOccurs="0"/>
         *                 &lt;/sequence>
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
        @XmlType(name = "", propOrder = {
                "vehRes"
        })
        public static class VehNotifReport {

            @XmlElement(name = "VehRes")
            protected OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes vehRes;

            /**
             * ��ȡvehRes���Ե�ֵ��
             *
             * @return possible object is
             * {@link OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes }
             */
            public OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes getVehRes() {
                return vehRes;
            }

            /**
             * ����vehRes���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes }
             */
            public void setVehRes(OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes value) {
                this.vehRes = value;
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
             *         &lt;element name="VehNotifReportRQCore" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleResRSCoreType">
             *                 &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="VehNotifReportRQInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleResRSAdditionalInfoType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "vehNotifReportRQCore",
                    "vehNotifReportRQInfo"
            })
            public static class VehRes {

                @XmlElement(name = "VehNotifReportRQCore")
                protected OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore vehNotifReportRQCore;
                @XmlElement(name = "VehNotifReportRQInfo")
                protected VehicleResRSAdditionalInfoType vehNotifReportRQInfo;

                /**
                 * ��ȡvehNotifReportRQCore���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore }
                 */
                public OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore getVehNotifReportRQCore() {
                    return vehNotifReportRQCore;
                }

                /**
                 * ����vehNotifReportRQCore���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore }
                 */
                public void setVehNotifReportRQCore(OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore value) {
                    this.vehNotifReportRQCore = value;
                }

                /**
                 * ��ȡvehNotifReportRQInfo���Ե�ֵ��
                 *
                 * @return possible object is
                 * {@link VehicleResRSAdditionalInfoType }
                 */
                public VehicleResRSAdditionalInfoType getVehNotifReportRQInfo() {
                    return vehNotifReportRQInfo;
                }

                /**
                 * ����vehNotifReportRQInfo���Ե�ֵ��
                 *
                 * @param value allowed object is
                 *              {@link VehicleResRSAdditionalInfoType }
                 */
                public void setVehNotifReportRQInfo(VehicleResRSAdditionalInfoType value) {
                    this.vehNotifReportRQInfo = value;
                }


                /**
                 * <p>anonymous complex type�� Java �ࡣ
                 * <p/>
                 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
                 * <p/>
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleResRSCoreType">
                 *       &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class VehNotifReportRQCore
                        extends VehicleResRSCoreType {

                    @XmlAttribute(name = "ReservationStatus")
                    protected String reservationStatus;

                    /**
                     * ��ȡreservationStatus���Ե�ֵ��
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getReservationStatus() {
                        return reservationStatus;
                    }

                    /**
                     * ����reservationStatus���Ե�ֵ��
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setReservationStatus(String value) {
                        this.reservationStatus = value;
                    }

                }

            }

        }

    }

}
