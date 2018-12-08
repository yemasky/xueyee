package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>CoveragePricedType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CoveragePricedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coverage" type="{http://www.opentravel.org/OTA/2003/05}CoverageType" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/>
 *         &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoveragePricedType", propOrder = {
        "coverage",
        "charge",
        "deductible"
})
public class CoveragePricedType {

    @XmlElement(name = "Coverage")
    protected CoverageType coverage;
    @XmlElement(name = "Charge")
    protected VehicleChargeType charge;
    @XmlElement(name = "Deductible")
    protected DeductibleType deductible;
    @XmlAttribute(name = "Required")
    protected Boolean required;

    /**
     * ��ȡcoverage���Ե�ֵ��
     *
     * @return possible object is
     * {@link CoverageType }
     */
    public CoverageType getCoverage() {
        return coverage;
    }

    /**
     * ����coverage���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CoverageType }
     */
    public void setCoverage(CoverageType value) {
        this.coverage = value;
    }

    /**
     * ��ȡcharge���Ե�ֵ��
     *
     * @return possible object is
     * {@link VehicleChargeType }
     */
    public VehicleChargeType getCharge() {
        return charge;
    }

    /**
     * ����charge���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link VehicleChargeType }
     */
    public void setCharge(VehicleChargeType value) {
        this.charge = value;
    }

    /**
     * ��ȡdeductible���Ե�ֵ��
     *
     * @return possible object is
     * {@link DeductibleType }
     */
    public DeductibleType getDeductible() {
        return deductible;
    }

    /**
     * ����deductible���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DeductibleType }
     */
    public void setDeductible(DeductibleType value) {
        this.deductible = value;
    }

    /**
     * ��ȡrequired���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * ����required���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

}
