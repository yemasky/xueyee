
package ota.jw.AvailRes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RebateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RebateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentInformation" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ParticipationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TripPurpose"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Business"/&gt;
 *             &lt;enumeration value="BusinessAndPleasure"/&gt;
 *             &lt;enumeration value="Pleasure"/&gt;
 *             &lt;enumeration value="Unknown"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TripPurposeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebateType", propOrder = {
    "paymentInformation"
})
public class RebateType {

    @XmlElement(name = "PaymentInformation")
    protected List<PaymentCardType> paymentInformation;
    @XmlAttribute(name = "ParticipationInd")
    protected Boolean participationInd;
    @XmlAttribute(name = "ProgramName")
    protected String programName;
    @XmlAttribute(name = "TripPurpose")
    protected String tripPurpose;
    @XmlAttribute(name = "TripPurposeRequiredInd")
    protected Boolean tripPurposeRequiredInd;

    /**
     * Gets the value of the paymentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardType }
     * 
     * 
     */
    public List<PaymentCardType> getPaymentInformation() {
        if (paymentInformation == null) {
            paymentInformation = new ArrayList<PaymentCardType>();
        }
        return this.paymentInformation;
    }

    /**
     * 获取participationInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParticipationInd() {
        return participationInd;
    }

    /**
     * 设置participationInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParticipationInd(Boolean value) {
        this.participationInd = value;
    }

    /**
     * 获取programName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * 设置programName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * 获取tripPurpose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripPurpose() {
        return tripPurpose;
    }

    /**
     * 设置tripPurpose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripPurpose(String value) {
        this.tripPurpose = value;
    }

    /**
     * 获取tripPurposeRequiredInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTripPurposeRequiredInd() {
        return tripPurposeRequiredInd;
    }

    /**
     * 设置tripPurposeRequiredInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTripPurposeRequiredInd(Boolean value) {
        this.tripPurposeRequiredInd = value;
    }

}
