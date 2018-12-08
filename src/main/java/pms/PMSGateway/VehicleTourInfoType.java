package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>VehicleTourInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="VehicleTourInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TourOperator" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TourNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleTourInfoType", propOrder = {
        "tourOperator"
})
public class VehicleTourInfoType {

    @XmlElement(name = "TourOperator")
    protected CompanyNameType tourOperator;
    @XmlAttribute(name = "TourNumber")
    protected String tourNumber;

    /**
     * ��ȡtourOperator���Ե�ֵ��
     *
     * @return possible object is
     * {@link CompanyNameType }
     */
    public CompanyNameType getTourOperator() {
        return tourOperator;
    }

    /**
     * ����tourOperator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link CompanyNameType }
     */
    public void setTourOperator(CompanyNameType value) {
        this.tourOperator = value;
    }

    /**
     * ��ȡtourNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTourNumber() {
        return tourNumber;
    }

    /**
     * ����tourNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTourNumber(String value) {
        this.tourNumber = value;
    }

}
