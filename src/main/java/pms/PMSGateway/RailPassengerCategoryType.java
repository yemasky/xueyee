package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RailPassengerCategoryType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RailPassengerCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Occupation" type="{http://www.opentravel.org/OTA/2003/05}RailPassengerOccupationType" minOccurs="0"/>
 *         &lt;element name="PassengerQualifyingInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RateQualifier" type="{http://www.opentravel.org/OTA/2003/05}RailRateQualifyingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ADA_Requirement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AccompaniedByInfantInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Gender">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Male"/>
 *             &lt;enumeration value="Female"/>
 *             &lt;enumeration value="Unknown"/>
 *             &lt;enumeration value="Male_NoShare"/>
 *             &lt;enumeration value="Female_NoShare"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * ��ȡoccupation���Ե�ֵ��
     *
     * @return possible object is
     * {@link RailPassengerOccupationType }
     */
    public RailPassengerOccupationType getOccupation() {
        return occupation;
    }

    /**
     * ����occupation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RailPassengerOccupationType }
     */
    public void setOccupation(RailPassengerOccupationType value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the passengerQualifyingInfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerQualifyingInfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerQualifyingInfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPassengerCategoryType.PassengerQualifyingInfo }
     */
    public List<RailPassengerCategoryType.PassengerQualifyingInfo> getPassengerQualifyingInfo() {
        if (passengerQualifyingInfo == null) {
            passengerQualifyingInfo = new ArrayList<RailPassengerCategoryType.PassengerQualifyingInfo>();
        }
        return this.passengerQualifyingInfo;
    }

    /**
     * Gets the value of the rateQualifier property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateQualifier property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateQualifier().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RailRateQualifyingType }
     */
    public List<RailRateQualifyingType> getRateQualifier() {
        if (rateQualifier == null) {
            rateQualifier = new ArrayList<RailRateQualifyingType>();
        }
        return this.rateQualifier;
    }

    /**
     * Gets the value of the adaRequirement property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adaRequirement property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADARequirement().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getADARequirement() {
        if (adaRequirement == null) {
            adaRequirement = new ArrayList<String>();
        }
        return this.adaRequirement;
    }

    /**
     * ��ȡaccompaniedByInfantInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAccompaniedByInfantInd() {
        return accompaniedByInfantInd;
    }

    /**
     * ����accompaniedByInfantInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAccompaniedByInfantInd(Boolean value) {
        this.accompaniedByInfantInd = value;
    }

    /**
     * ��ȡgender���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getGender() {
        return gender;
    }

    /**
     * ����gender���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGender(String value) {
        this.gender = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerQualifyingInfo {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * ��ȡcode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCode() {
            return code;
        }

        /**
         * ����code���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * ��ȡcodeContext���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * ����codeContext���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

    }

}
