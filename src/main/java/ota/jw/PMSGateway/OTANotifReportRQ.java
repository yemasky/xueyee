
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MessageAcknowledgementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotifDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="HotelNotifReport" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;choice&gt;
 *                                 &lt;element name="HotelReservations" minOccurs="0"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType"&gt;
 *                                                   &lt;attribute name="WarningRPH"&gt;
 *                                                     &lt;simpleType&gt;
 *                                                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                     &lt;/simpleType&gt;
 *                                                   &lt;/attribute&gt;
 *                                                 &lt;/extension&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                         &lt;/sequence&gt;
 *                                       &lt;/restriction&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                                 &lt;element name="RateAmountMessages" minOccurs="0"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="RateAmountMessage" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateAmountMessageType"&gt;
 *                                                   &lt;attribute name="WarningRPH"&gt;
 *                                                     &lt;simpleType&gt;
 *                                                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                     &lt;/simpleType&gt;
 *                                                   &lt;/attribute&gt;
 *                                                 &lt;/extension&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                         &lt;/sequence&gt;
 *                                         &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;/restriction&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                                 &lt;element name="AvailStatusMessages" minOccurs="0"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="AvailStatusMessage" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailStatusMessageType"&gt;
 *                                                   &lt;attribute name="WarningRPH"&gt;
 *                                                     &lt;simpleType&gt;
 *                                                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                     &lt;/simpleType&gt;
 *                                                   &lt;/attribute&gt;
 *                                                 &lt;/extension&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                         &lt;/sequence&gt;
 *                                         &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;/restriction&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                                 &lt;element name="HotelDescriptiveContents" minOccurs="0"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="HotelDescriptiveContent" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType"&gt;
 *                                                   &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                   &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                   &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                   &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                   &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                   &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                   &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                   &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                   &lt;attribute name="WarningRPH"&gt;
 *                                                     &lt;simpleType&gt;
 *                                                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                     &lt;/simpleType&gt;
 *                                                   &lt;/attribute&gt;
 *                                                 &lt;/extension&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                         &lt;/sequence&gt;
 *                                         &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                         &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;/restriction&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                               &lt;/choice&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="VehNotifReport" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="VehRes" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="VehNotifReportRQCore" minOccurs="0"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleResRSCoreType"&gt;
 *                                                 &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;/extension&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="VehNotifReportRQInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleResRSAdditionalInfoType" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notifDetails"
})
@XmlRootElement(name = "OTA_NotifReportRQ")
public class OTANotifReportRQ
    extends MessageAcknowledgementType
{

    @XmlElement(name = "NotifDetails")
    protected OTANotifReportRQ.NotifDetails notifDetails;

    /**
     * 获取notifDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OTANotifReportRQ.NotifDetails }
     *     
     */
    public OTANotifReportRQ.NotifDetails getNotifDetails() {
        return notifDetails;
    }

    /**
     * 设置notifDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OTANotifReportRQ.NotifDetails }
     *     
     */
    public void setNotifDetails(OTANotifReportRQ.NotifDetails value) {
        this.notifDetails = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;choice&gt;
     *           &lt;element name="HotelNotifReport" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;choice&gt;
     *                       &lt;element name="HotelReservations" minOccurs="0"&gt;
     *                         &lt;complexType&gt;
     *                           &lt;complexContent&gt;
     *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                               &lt;sequence&gt;
     *                                 &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                   &lt;complexType&gt;
     *                                     &lt;complexContent&gt;
     *                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType"&gt;
     *                                         &lt;attribute name="WarningRPH"&gt;
     *                                           &lt;simpleType&gt;
     *                                             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                           &lt;/simpleType&gt;
     *                                         &lt;/attribute&gt;
     *                                       &lt;/extension&gt;
     *                                     &lt;/complexContent&gt;
     *                                   &lt;/complexType&gt;
     *                                 &lt;/element&gt;
     *                               &lt;/sequence&gt;
     *                             &lt;/restriction&gt;
     *                           &lt;/complexContent&gt;
     *                         &lt;/complexType&gt;
     *                       &lt;/element&gt;
     *                       &lt;element name="RateAmountMessages" minOccurs="0"&gt;
     *                         &lt;complexType&gt;
     *                           &lt;complexContent&gt;
     *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                               &lt;sequence&gt;
     *                                 &lt;element name="RateAmountMessage" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                   &lt;complexType&gt;
     *                                     &lt;complexContent&gt;
     *                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateAmountMessageType"&gt;
     *                                         &lt;attribute name="WarningRPH"&gt;
     *                                           &lt;simpleType&gt;
     *                                             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                           &lt;/simpleType&gt;
     *                                         &lt;/attribute&gt;
     *                                       &lt;/extension&gt;
     *                                     &lt;/complexContent&gt;
     *                                   &lt;/complexType&gt;
     *                                 &lt;/element&gt;
     *                               &lt;/sequence&gt;
     *                               &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;/restriction&gt;
     *                           &lt;/complexContent&gt;
     *                         &lt;/complexType&gt;
     *                       &lt;/element&gt;
     *                       &lt;element name="AvailStatusMessages" minOccurs="0"&gt;
     *                         &lt;complexType&gt;
     *                           &lt;complexContent&gt;
     *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                               &lt;sequence&gt;
     *                                 &lt;element name="AvailStatusMessage" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                   &lt;complexType&gt;
     *                                     &lt;complexContent&gt;
     *                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailStatusMessageType"&gt;
     *                                         &lt;attribute name="WarningRPH"&gt;
     *                                           &lt;simpleType&gt;
     *                                             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                           &lt;/simpleType&gt;
     *                                         &lt;/attribute&gt;
     *                                       &lt;/extension&gt;
     *                                     &lt;/complexContent&gt;
     *                                   &lt;/complexType&gt;
     *                                 &lt;/element&gt;
     *                               &lt;/sequence&gt;
     *                               &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;/restriction&gt;
     *                           &lt;/complexContent&gt;
     *                         &lt;/complexType&gt;
     *                       &lt;/element&gt;
     *                       &lt;element name="HotelDescriptiveContents" minOccurs="0"&gt;
     *                         &lt;complexType&gt;
     *                           &lt;complexContent&gt;
     *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                               &lt;sequence&gt;
     *                                 &lt;element name="HotelDescriptiveContent" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                   &lt;complexType&gt;
     *                                     &lt;complexContent&gt;
     *                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType"&gt;
     *                                         &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                         &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                         &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                         &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                         &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                         &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                         &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                         &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                         &lt;attribute name="WarningRPH"&gt;
     *                                           &lt;simpleType&gt;
     *                                             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                           &lt;/simpleType&gt;
     *                                         &lt;/attribute&gt;
     *                                       &lt;/extension&gt;
     *                                     &lt;/complexContent&gt;
     *                                   &lt;/complexType&gt;
     *                                 &lt;/element&gt;
     *                               &lt;/sequence&gt;
     *                               &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                               &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;/restriction&gt;
     *                           &lt;/complexContent&gt;
     *                         &lt;/complexType&gt;
     *                       &lt;/element&gt;
     *                     &lt;/choice&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="VehNotifReport" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="VehRes" minOccurs="0"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="VehNotifReportRQCore" minOccurs="0"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleResRSCoreType"&gt;
     *                                       &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;/extension&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="VehNotifReportRQInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleResRSAdditionalInfoType" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取hotelNotifReport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OTANotifReportRQ.NotifDetails.HotelNotifReport }
         *     
         */
        public OTANotifReportRQ.NotifDetails.HotelNotifReport getHotelNotifReport() {
            return hotelNotifReport;
        }

        /**
         * 设置hotelNotifReport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OTANotifReportRQ.NotifDetails.HotelNotifReport }
         *     
         */
        public void setHotelNotifReport(OTANotifReportRQ.NotifDetails.HotelNotifReport value) {
            this.hotelNotifReport = value;
        }

        /**
         * 获取vehNotifReport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OTANotifReportRQ.NotifDetails.VehNotifReport }
         *     
         */
        public OTANotifReportRQ.NotifDetails.VehNotifReport getVehNotifReport() {
            return vehNotifReport;
        }

        /**
         * 设置vehNotifReport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OTANotifReportRQ.NotifDetails.VehNotifReport }
         *     
         */
        public void setVehNotifReport(OTANotifReportRQ.NotifDetails.VehNotifReport value) {
            this.vehNotifReport = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;choice&gt;
         *           &lt;element name="HotelReservations" minOccurs="0"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType"&gt;
         *                             &lt;attribute name="WarningRPH"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                           &lt;/extension&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="RateAmountMessages" minOccurs="0"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="RateAmountMessage" maxOccurs="unbounded" minOccurs="0"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateAmountMessageType"&gt;
         *                             &lt;attribute name="WarningRPH"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                           &lt;/extension&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="AvailStatusMessages" minOccurs="0"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="AvailStatusMessage" maxOccurs="unbounded" minOccurs="0"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailStatusMessageType"&gt;
         *                             &lt;attribute name="WarningRPH"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                           &lt;/extension&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="HotelDescriptiveContents" minOccurs="0"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="HotelDescriptiveContent" maxOccurs="unbounded" minOccurs="0"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType"&gt;
         *                             &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                             &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                             &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                             &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                             &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                             &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                             &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                             &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                             &lt;attribute name="WarningRPH"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                           &lt;/extension&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *         &lt;/choice&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * 获取hotelReservations属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations }
             *     
             */
            public OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations getHotelReservations() {
                return hotelReservations;
            }

            /**
             * 设置hotelReservations属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations }
             *     
             */
            public void setHotelReservations(OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations value) {
                this.hotelReservations = value;
            }

            /**
             * 获取rateAmountMessages属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages }
             *     
             */
            public OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages getRateAmountMessages() {
                return rateAmountMessages;
            }

            /**
             * 设置rateAmountMessages属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages }
             *     
             */
            public void setRateAmountMessages(OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages value) {
                this.rateAmountMessages = value;
            }

            /**
             * 获取availStatusMessages属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages }
             *     
             */
            public OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages getAvailStatusMessages() {
                return availStatusMessages;
            }

            /**
             * 设置availStatusMessages属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages }
             *     
             */
            public void setAvailStatusMessages(OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages value) {
                this.availStatusMessages = value;
            }

            /**
             * 获取hotelDescriptiveContents属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents }
             *     
             */
            public OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents getHotelDescriptiveContents() {
                return hotelDescriptiveContents;
            }

            /**
             * 设置hotelDescriptiveContents属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents }
             *     
             */
            public void setHotelDescriptiveContents(OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents value) {
                this.hotelDescriptiveContents = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="AvailStatusMessage" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailStatusMessageType"&gt;
             *                 &lt;attribute name="WarningRPH"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
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
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the availStatusMessage property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAvailStatusMessage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage }
                 * 
                 * 
                 */
                public List<OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage> getAvailStatusMessage() {
                    if (availStatusMessage == null) {
                        availStatusMessage = new ArrayList<OTANotifReportRQ.NotifDetails.HotelNotifReport.AvailStatusMessages.AvailStatusMessage>();
                    }
                    return this.availStatusMessage;
                }

                /**
                 * 获取chainCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChainCode() {
                    return chainCode;
                }

                /**
                 * 设置chainCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChainCode(String value) {
                    this.chainCode = value;
                }

                /**
                 * 获取brandCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBrandCode() {
                    return brandCode;
                }

                /**
                 * 设置brandCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBrandCode(String value) {
                    this.brandCode = value;
                }

                /**
                 * 获取hotelCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCode() {
                    return hotelCode;
                }

                /**
                 * 设置hotelCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCode(String value) {
                    this.hotelCode = value;
                }

                /**
                 * 获取hotelCityCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCityCode() {
                    return hotelCityCode;
                }

                /**
                 * 设置hotelCityCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCityCode(String value) {
                    this.hotelCityCode = value;
                }

                /**
                 * 获取hotelName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelName() {
                    return hotelName;
                }

                /**
                 * 设置hotelName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelName(String value) {
                    this.hotelName = value;
                }

                /**
                 * 获取hotelCodeContext属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCodeContext() {
                    return hotelCodeContext;
                }

                /**
                 * 设置hotelCodeContext属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCodeContext(String value) {
                    this.hotelCodeContext = value;
                }

                /**
                 * 获取chainName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChainName() {
                    return chainName;
                }

                /**
                 * 设置chainName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChainName(String value) {
                    this.chainName = value;
                }

                /**
                 * 获取brandName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBrandName() {
                    return brandName;
                }

                /**
                 * 设置brandName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBrandName(String value) {
                    this.brandName = value;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailStatusMessageType"&gt;
                 *       &lt;attribute name="WarningRPH"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class AvailStatusMessage
                    extends AvailStatusMessageType
                {

                    @XmlAttribute(name = "WarningRPH")
                    protected List<String> warningRPH;

                    /**
                     * Gets the value of the warningRPH property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the warningRPH property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getWarningRPH().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="HotelDescriptiveContent" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType"&gt;
             *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="WarningRPH"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
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
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hotelDescriptiveContent property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHotelDescriptiveContent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent }
                 * 
                 * 
                 */
                public List<OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent> getHotelDescriptiveContent() {
                    if (hotelDescriptiveContent == null) {
                        hotelDescriptiveContent = new ArrayList<OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelDescriptiveContents.HotelDescriptiveContent>();
                    }
                    return this.hotelDescriptiveContent;
                }

                /**
                 * 获取chainCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChainCode() {
                    return chainCode;
                }

                /**
                 * 设置chainCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChainCode(String value) {
                    this.chainCode = value;
                }

                /**
                 * 获取brandCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBrandCode() {
                    return brandCode;
                }

                /**
                 * 设置brandCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBrandCode(String value) {
                    this.brandCode = value;
                }

                /**
                 * 获取hotelCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCode() {
                    return hotelCode;
                }

                /**
                 * 设置hotelCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCode(String value) {
                    this.hotelCode = value;
                }

                /**
                 * 获取hotelCityCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCityCode() {
                    return hotelCityCode;
                }

                /**
                 * 设置hotelCityCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCityCode(String value) {
                    this.hotelCityCode = value;
                }

                /**
                 * 获取hotelName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelName() {
                    return hotelName;
                }

                /**
                 * 设置hotelName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelName(String value) {
                    this.hotelName = value;
                }

                /**
                 * 获取hotelCodeContext属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCodeContext() {
                    return hotelCodeContext;
                }

                /**
                 * 设置hotelCodeContext属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCodeContext(String value) {
                    this.hotelCodeContext = value;
                }

                /**
                 * 获取chainName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChainName() {
                    return chainName;
                }

                /**
                 * 设置chainName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChainName(String value) {
                    this.chainName = value;
                }

                /**
                 * 获取brandName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBrandName() {
                    return brandName;
                }

                /**
                 * 设置brandName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBrandName(String value) {
                    this.brandName = value;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelDescriptiveContentType"&gt;
                 *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="WarningRPH"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class HotelDescriptiveContent
                    extends HotelDescriptiveContentType
                {

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
                     * 获取chainCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChainCode() {
                        return chainCode;
                    }

                    /**
                     * 设置chainCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChainCode(String value) {
                        this.chainCode = value;
                    }

                    /**
                     * 获取brandCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBrandCode() {
                        return brandCode;
                    }

                    /**
                     * 设置brandCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBrandCode(String value) {
                        this.brandCode = value;
                    }

                    /**
                     * 获取hotelCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHotelCode() {
                        return hotelCode;
                    }

                    /**
                     * 设置hotelCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHotelCode(String value) {
                        this.hotelCode = value;
                    }

                    /**
                     * 获取hotelCityCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHotelCityCode() {
                        return hotelCityCode;
                    }

                    /**
                     * 设置hotelCityCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHotelCityCode(String value) {
                        this.hotelCityCode = value;
                    }

                    /**
                     * 获取hotelName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHotelName() {
                        return hotelName;
                    }

                    /**
                     * 设置hotelName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHotelName(String value) {
                        this.hotelName = value;
                    }

                    /**
                     * 获取hotelCodeContext属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHotelCodeContext() {
                        return hotelCodeContext;
                    }

                    /**
                     * 设置hotelCodeContext属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHotelCodeContext(String value) {
                        this.hotelCodeContext = value;
                    }

                    /**
                     * 获取chainName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChainName() {
                        return chainName;
                    }

                    /**
                     * 设置chainName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChainName(String value) {
                        this.chainName = value;
                    }

                    /**
                     * 获取brandName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBrandName() {
                        return brandName;
                    }

                    /**
                     * 设置brandName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBrandName(String value) {
                        this.brandName = value;
                    }

                    /**
                     * Gets the value of the warningRPH property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the warningRPH property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getWarningRPH().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="HotelReservation" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType"&gt;
             *                 &lt;attribute name="WarningRPH"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
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
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hotelReservation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHotelReservation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation }
                 * 
                 * 
                 */
                public List<OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation> getHotelReservation() {
                    if (hotelReservation == null) {
                        hotelReservation = new ArrayList<OTANotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation>();
                    }
                    return this.hotelReservation;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType"&gt;
                 *       &lt;attribute name="WarningRPH"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class HotelReservation
                    extends HotelReservationType
                {

                    @XmlAttribute(name = "WarningRPH")
                    protected List<String> warningRPH;

                    /**
                     * Gets the value of the warningRPH property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the warningRPH property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getWarningRPH().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="RateAmountMessage" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateAmountMessageType"&gt;
             *                 &lt;attribute name="WarningRPH"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
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
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the rateAmountMessage property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRateAmountMessage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage }
                 * 
                 * 
                 */
                public List<OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage> getRateAmountMessage() {
                    if (rateAmountMessage == null) {
                        rateAmountMessage = new ArrayList<OTANotifReportRQ.NotifDetails.HotelNotifReport.RateAmountMessages.RateAmountMessage>();
                    }
                    return this.rateAmountMessage;
                }

                /**
                 * 获取chainCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChainCode() {
                    return chainCode;
                }

                /**
                 * 设置chainCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChainCode(String value) {
                    this.chainCode = value;
                }

                /**
                 * 获取brandCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBrandCode() {
                    return brandCode;
                }

                /**
                 * 设置brandCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBrandCode(String value) {
                    this.brandCode = value;
                }

                /**
                 * 获取hotelCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCode() {
                    return hotelCode;
                }

                /**
                 * 设置hotelCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCode(String value) {
                    this.hotelCode = value;
                }

                /**
                 * 获取hotelCityCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCityCode() {
                    return hotelCityCode;
                }

                /**
                 * 设置hotelCityCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCityCode(String value) {
                    this.hotelCityCode = value;
                }

                /**
                 * 获取hotelName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelName() {
                    return hotelName;
                }

                /**
                 * 设置hotelName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelName(String value) {
                    this.hotelName = value;
                }

                /**
                 * 获取hotelCodeContext属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCodeContext() {
                    return hotelCodeContext;
                }

                /**
                 * 设置hotelCodeContext属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCodeContext(String value) {
                    this.hotelCodeContext = value;
                }

                /**
                 * 获取chainName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChainName() {
                    return chainName;
                }

                /**
                 * 设置chainName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChainName(String value) {
                    this.chainName = value;
                }

                /**
                 * 获取brandName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBrandName() {
                    return brandName;
                }

                /**
                 * 设置brandName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBrandName(String value) {
                    this.brandName = value;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateAmountMessageType"&gt;
                 *       &lt;attribute name="WarningRPH"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class RateAmountMessage
                    extends RateAmountMessageType
                {

                    @XmlAttribute(name = "WarningRPH")
                    protected List<String> warningRPH;

                    /**
                     * Gets the value of the warningRPH property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the warningRPH property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getWarningRPH().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="VehRes" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="VehNotifReportRQCore" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleResRSCoreType"&gt;
         *                           &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="VehNotifReportRQInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleResRSAdditionalInfoType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vehRes"
        })
        public static class VehNotifReport {

            @XmlElement(name = "VehRes")
            protected OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes vehRes;

            /**
             * 获取vehRes属性的值。
             * 
             * @return
             *     possible object is
             *     {@link OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes }
             *     
             */
            public OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes getVehRes() {
                return vehRes;
            }

            /**
             * 设置vehRes属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes }
             *     
             */
            public void setVehRes(OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes value) {
                this.vehRes = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="VehNotifReportRQCore" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleResRSCoreType"&gt;
             *                 &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="VehNotifReportRQInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleResRSAdditionalInfoType" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
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
                 * 获取vehNotifReportRQCore属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore }
                 *     
                 */
                public OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore getVehNotifReportRQCore() {
                    return vehNotifReportRQCore;
                }

                /**
                 * 设置vehNotifReportRQCore属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore }
                 *     
                 */
                public void setVehNotifReportRQCore(OTANotifReportRQ.NotifDetails.VehNotifReport.VehRes.VehNotifReportRQCore value) {
                    this.vehNotifReportRQCore = value;
                }

                /**
                 * 获取vehNotifReportRQInfo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link VehicleResRSAdditionalInfoType }
                 *     
                 */
                public VehicleResRSAdditionalInfoType getVehNotifReportRQInfo() {
                    return vehNotifReportRQInfo;
                }

                /**
                 * 设置vehNotifReportRQInfo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link VehicleResRSAdditionalInfoType }
                 *     
                 */
                public void setVehNotifReportRQInfo(VehicleResRSAdditionalInfoType value) {
                    this.vehNotifReportRQInfo = value;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleResRSCoreType"&gt;
                 *       &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class VehNotifReportRQCore
                    extends VehicleResRSCoreType
                {

                    @XmlAttribute(name = "ReservationStatus")
                    protected String reservationStatus;

                    /**
                     * 获取reservationStatus属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReservationStatus() {
                        return reservationStatus;
                    }

                    /**
                     * 设置reservationStatus属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReservationStatus(String value) {
                        this.reservationStatus = value;
                    }

                }

            }

        }

    }

}
