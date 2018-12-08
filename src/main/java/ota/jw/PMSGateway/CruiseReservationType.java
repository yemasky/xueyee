
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CruiseReservationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CruiseReservationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SailingInfo" type="{http://www.opentravel.org/OTA/2003/05}SailingCategoryInfoType" minOccurs="0"/&gt;
 *         &lt;element name="SailingProfile" type="{http://www.opentravel.org/OTA/2003/05}CruiseProfileType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReservationInfo" type="{http://www.opentravel.org/OTA/2003/05}CruiseGuestInfoType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentsDue" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCruiseReservationTypePaymentDue" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseReservationType", propOrder = {
    "sailingInfo",
    "sailingProfile",
    "reservationInfo",
    "paymentsDue",
    "information"
})
public class CruiseReservationType {

    @XmlElement(name = "SailingInfo")
    protected SailingCategoryInfoType sailingInfo;
    @XmlElement(name = "SailingProfile")
    protected List<CruiseProfileType> sailingProfile;
    @XmlElement(name = "ReservationInfo")
    protected CruiseGuestInfoType reservationInfo;
    @XmlElement(name = "PaymentsDue")
    protected ArrayOfCruiseReservationTypePaymentDue paymentsDue;
    @XmlElement(name = "Information")
    protected List<ParagraphType> information;

    /**
     * 获取sailingInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SailingCategoryInfoType }
     *     
     */
    public SailingCategoryInfoType getSailingInfo() {
        return sailingInfo;
    }

    /**
     * 设置sailingInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SailingCategoryInfoType }
     *     
     */
    public void setSailingInfo(SailingCategoryInfoType value) {
        this.sailingInfo = value;
    }

    /**
     * Gets the value of the sailingProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sailingProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSailingProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseProfileType }
     * 
     * 
     */
    public List<CruiseProfileType> getSailingProfile() {
        if (sailingProfile == null) {
            sailingProfile = new ArrayList<CruiseProfileType>();
        }
        return this.sailingProfile;
    }

    /**
     * 获取reservationInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestInfoType }
     *     
     */
    public CruiseGuestInfoType getReservationInfo() {
        return reservationInfo;
    }

    /**
     * 设置reservationInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestInfoType }
     *     
     */
    public void setReservationInfo(CruiseGuestInfoType value) {
        this.reservationInfo = value;
    }

    /**
     * 获取paymentsDue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCruiseReservationTypePaymentDue }
     *     
     */
    public ArrayOfCruiseReservationTypePaymentDue getPaymentsDue() {
        return paymentsDue;
    }

    /**
     * 设置paymentsDue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCruiseReservationTypePaymentDue }
     *     
     */
    public void setPaymentsDue(ArrayOfCruiseReservationTypePaymentDue value) {
        this.paymentsDue = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getInformation() {
        if (information == null) {
            information = new ArrayList<ParagraphType>();
        }
        return this.information;
    }

}
