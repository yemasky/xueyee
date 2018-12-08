package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OtherServiceInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OtherServiceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelerRefNumber" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SurnameRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Airline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherServiceInfoType", propOrder = {
        "travelerRefNumber",
        "airline",
        "text"
})
public class OtherServiceInfoType {

    @XmlElement(name = "TravelerRefNumber")
    protected List<OtherServiceInfoType.TravelerRefNumber> travelerRefNumber;
    @XmlElement(name = "Airline")
    protected CompanyNameType airline;
    @XmlElement(name = "Text")
    protected String text;
    @XmlAttribute(name = "Code")
    protected String code;

    /**
     * Gets the value of the travelerRefNumber property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRefNumber property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRefNumber().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherServiceInfoType.TravelerRefNumber }
     */
    public List<OtherServiceInfoType.TravelerRefNumber> getTravelerRefNumber() {
        if (travelerRefNumber == null) {
            travelerRefNumber = new ArrayList<OtherServiceInfoType.TravelerRefNumber>();
        }
        return this.travelerRefNumber;
    }

    /**
     * ��ȡairline���Ե�ֵ��
     *
     * @return possible object is
     * {@link CompanyNameType }
     */
    public CompanyNameType getAirline() {
        return airline;
    }

    /**
     * ����airline���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CompanyNameType }
     */
    public void setAirline(CompanyNameType value) {
        this.airline = value;
    }

    /**
     * ��ȡtext���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getText() {
        return text;
    }

    /**
     * ����text���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setText(String value) {
        this.text = value;
    }

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
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SurnameRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerRefNumber {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "SurnameRefNumber")
        protected String surnameRefNumber;

        /**
         * ��ȡrph���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRPH() {
            return rph;
        }

        /**
         * ����rph���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * ��ȡsurnameRefNumber���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSurnameRefNumber() {
            return surnameRefNumber;
        }

        /**
         * ����surnameRefNumber���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSurnameRefNumber(String value) {
            this.surnameRefNumber = value;
        }

    }

}
