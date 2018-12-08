
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RailPassengerCategoryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RailPassengerCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Occupation" type="{http://www.opentravel.org/OTA/2003/05}RailPassengerOccupationType" minOccurs="0"/&gt;
 *         &lt;element name="PassengerQualifyingInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RateQualifier" type="{http://www.opentravel.org/OTA/2003/05}RailRateQualifyingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ADA_Requirement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AccompaniedByInfantInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Gender"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Male"/&gt;
 *             &lt;enumeration value="Female"/&gt;
 *             &lt;enumeration value="Unknown"/&gt;
 *             &lt;enumeration value="Male_NoShare"/&gt;
 *             &lt;enumeration value="Female_NoShare"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailPassengerCategoryType", propOrder = {
    "occupation",
    "passengerQualifyingInfo",
    "rateQualifier",
    "adaRequirement"
})
@XmlSeeAlso({
    RailPassengerCategoryDetailType.class
})
public class RailPassengerCategoryType {

    @XmlElement(name = "Occupation")
    protected RailPassengerOccupationType occupation;
    @XmlElement(name = "PassengerQualifyingInfo")
    protected List<RailPassengerCategoryType.PassengerQualifyingInfo> passengerQualifyingInfo;
    @XmlElement(name = "RateQualifier")
    protected List<RailRateQualifyingType> rateQualifier;
    @XmlElement(name = "ADA_Requirement")
    protected List<String> adaRequirement;
    @XmlAttribute(name = "AccompaniedByInfantInd")
    protected Boolean accompaniedByInfantInd;
    @XmlAttribute(name = "Gender")
    protected String gender;

    /**
     * 获取occupation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailPassengerOccupationType }
     *     
     */
    public RailPassengerOccupationType getOccupation() {
        return occupation;
    }

    /**
     * 设置occupation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailPassengerOccupationType }
     *     
     */
    public void setOccupation(RailPassengerOccupationType value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the passengerQualifyingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerQualifyingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerQualifyingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPassengerCategoryType.PassengerQualifyingInfo }
     * 
     * 
     */
    public List<RailPassengerCategoryType.PassengerQualifyingInfo> getPassengerQualifyingInfo() {
        if (passengerQualifyingInfo == null) {
            passengerQualifyingInfo = new ArrayList<RailPassengerCategoryType.PassengerQualifyingInfo>();
        }
        return this.passengerQualifyingInfo;
    }

    /**
     * Gets the value of the rateQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailRateQualifyingType }
     * 
     * 
     */
    public List<RailRateQualifyingType> getRateQualifier() {
        if (rateQualifier == null) {
            rateQualifier = new ArrayList<RailRateQualifyingType>();
        }
        return this.rateQualifier;
    }

    /**
     * Gets the value of the adaRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adaRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADARequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getADARequirement() {
        if (adaRequirement == null) {
            adaRequirement = new ArrayList<String>();
        }
        return this.adaRequirement;
    }

    /**
     * 获取accompaniedByInfantInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccompaniedByInfantInd() {
        return accompaniedByInfantInd;
    }

    /**
     * 设置accompaniedByInfantInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccompaniedByInfantInd(Boolean value) {
        this.accompaniedByInfantInd = value;
    }

    /**
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerQualifyingInfo {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * 获取codeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * 设置codeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

    }

}
