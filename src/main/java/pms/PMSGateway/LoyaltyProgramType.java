package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>LoyaltyProgramType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="LoyaltyProgramType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SingleVendorInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="SingleVndr"/>
 *             &lt;enumeration value="Alliance"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LoyaltyLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramType", propOrder = {
        "value"
})
public class LoyaltyProgramType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ProgramCode")
    protected String programCode;
    @XmlAttribute(name = "SingleVendorInd")
    protected String singleVendorInd;
    @XmlAttribute(name = "LoyaltyLevel")
    protected String loyaltyLevel;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "PrimaryLoyaltyIndicator")
    protected Boolean primaryLoyaltyIndicator;

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
     * ��ȡprogramCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * ����programCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * ��ȡsingleVendorInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSingleVendorInd() {
        return singleVendorInd;
    }

    /**
     * ����singleVendorInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSingleVendorInd(String value) {
        this.singleVendorInd = value;
    }

    /**
     * ��ȡloyaltyLevel���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLoyaltyLevel() {
        return loyaltyLevel;
    }

    /**
     * ����loyaltyLevel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLoyaltyLevel(String value) {
        this.loyaltyLevel = value;
    }

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
     * ��ȡprimaryLoyaltyIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPrimaryLoyaltyIndicator() {
        return primaryLoyaltyIndicator;
    }

    /**
     * ����primaryLoyaltyIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPrimaryLoyaltyIndicator(Boolean value) {
        this.primaryLoyaltyIndicator = value;
    }

}
