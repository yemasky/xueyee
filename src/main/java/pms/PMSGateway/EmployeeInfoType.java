package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>EmployeeInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="EmployeeInfoType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="EmployeeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EmployeeLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EmployeeTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EmployeeStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeInfoType", propOrder = {
        "value"
})
public class EmployeeInfoType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "EmployeeId")
    protected String employeeId;
    @XmlAttribute(name = "EmployeeLevel")
    protected String employeeLevel;
    @XmlAttribute(name = "EmployeeTitle")
    protected String employeeTitle;
    @XmlAttribute(name = "EmployeeStatus")
    protected String employeeStatus;

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
     * ��ȡemployeeId���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * ����employeeId���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * ��ȡemployeeLevel���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmployeeLevel() {
        return employeeLevel;
    }

    /**
     * ����employeeLevel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmployeeLevel(String value) {
        this.employeeLevel = value;
    }

    /**
     * ��ȡemployeeTitle���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmployeeTitle() {
        return employeeTitle;
    }

    /**
     * ����employeeTitle���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmployeeTitle(String value) {
        this.employeeTitle = value;
    }

    /**
     * ��ȡemployeeStatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    /**
     * ����employeeStatus���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmployeeStatus(String value) {
        this.employeeStatus = value;
    }

}
