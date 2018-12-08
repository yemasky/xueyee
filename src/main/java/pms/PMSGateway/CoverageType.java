package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CoverageType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CoverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Details" type="{http://www.opentravel.org/OTA/2003/05}CoverageDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CoverageType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageType", propOrder = {
        "details"
})
public class CoverageType {

    @XmlElement(name = "Details")
    protected List<CoverageDetailsType> details;
    @XmlAttribute(name = "CoverageType")
    protected String coverageType;
    @XmlAttribute(name = "Code")
    protected String code;

    /**
     * Gets the value of the details property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageDetailsType }
     */
    public List<CoverageDetailsType> getDetails() {
        if (details == null) {
            details = new ArrayList<CoverageDetailsType>();
        }
        return this.details;
    }

    /**
     * ��ȡcoverageType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCoverageType() {
        return coverageType;
    }

    /**
     * ����coverageType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCoverageType(String value) {
        this.coverageType = value;
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

}
