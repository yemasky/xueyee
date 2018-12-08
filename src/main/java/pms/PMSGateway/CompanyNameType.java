package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>CompanyNameType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CompanyNameType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Division" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Department" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyNameType", propOrder = {
        "value"
})
@XmlSeeAlso({
        pms.PMSGateway.AllianceConsortiumType.AllianceMember.class,
        OperatingAirlineType.class,
        pms.PMSGateway.DirectBillType.CompanyName.class,
        TravelArrangerType.class,
        pms.PMSGateway.ContactInfoType.CompanyName.class,
        pms.PMSGateway.FlightSegmentType.MarketingAirline.class,
        CompanyNamePrefType.class
})
public class CompanyNameType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "CompanyShortName")
    protected String companyShortName;
    @XmlAttribute(name = "TravelSector")
    protected String travelSector;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "Division")
    protected String division;
    @XmlAttribute(name = "Department")
    protected String department;

    /**
     * ��ȡvalue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * ��ȡcompanyShortName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCompanyShortName() {
        return companyShortName;
    }

    /**
     * ����companyShortName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCompanyShortName(String value) {
        this.companyShortName = value;
    }

    /**
     * ��ȡtravelSector���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTravelSector() {
        return travelSector;
    }

    /**
     * ����travelSector���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTravelSector(String value) {
        this.travelSector = value;
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
     * ��ȡdivision���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDivision() {
        return division;
    }

    /**
     * ����division���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * ��ȡdepartment���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepartment() {
        return department;
    }

    /**
     * ����department���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepartment(String value) {
        this.department = value;
    }

}
