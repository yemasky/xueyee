package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>VehicleLocationDetailsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleLocationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationAdditionalDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AtAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AssocAirportLocList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationDetailsType", propOrder = {
        "address",
        "telephone",
        "additionalInfo"
})
public class VehicleLocationDetailsType {

    @XmlElement(name = "Address")
    protected List<AddressInfoType> address;
    @XmlElement(name = "Telephone")
    protected List<VehicleLocationDetailsType.Telephone> telephone;
    @XmlElement(name = "AdditionalInfo")
    protected VehicleLocationAdditionalDetailsType additionalInfo;
    @XmlAttribute(name = "AtAirport")
    protected Boolean atAirport;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "ExtendedLocationCode")
    protected String extendedLocationCode;
    @XmlAttribute(name = "AssocAirportLocList")
    protected List<String> assocAirportLocList;

    /**
     * Gets the value of the address property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressInfoType }
     */
    public List<AddressInfoType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressInfoType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the telephone property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLocationDetailsType.Telephone }
     */
    public List<VehicleLocationDetailsType.Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<VehicleLocationDetailsType.Telephone>();
        }
        return this.telephone;
    }

    /**
     * ��ȡadditionalInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleLocationAdditionalDetailsType }
     */
    public VehicleLocationAdditionalDetailsType getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * ����additionalInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleLocationAdditionalDetailsType }
     */
    public void setAdditionalInfo(VehicleLocationAdditionalDetailsType value) {
        this.additionalInfo = value;
    }

    /**
     * ��ȡatAirport���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAtAirport() {
        return atAirport;
    }

    /**
     * ����atAirport���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAtAirport(Boolean value) {
        this.atAirport = value;
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
     * ��ȡname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
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

    /**
     * ��ȡextendedLocationCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtendedLocationCode() {
        return extendedLocationCode;
    }

    /**
     * ����extendedLocationCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtendedLocationCode(String value) {
        this.extendedLocationCode = value;
    }

    /**
     * Gets the value of the assocAirportLocList property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assocAirportLocList property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssocAirportLocList().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getAssocAirportLocList() {
        if (assocAirportLocList == null) {
            assocAirportLocList = new ArrayList<String>();
        }
        return this.assocAirportLocList;
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {

        @XmlAttribute(name = "RPH")
        protected String rph;

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

    }

}
