package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>OffLocationServiceType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OffLocationServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OffLocationServiceCoreType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *         &lt;element name="Telephone" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TrackingID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SpecInstructions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffLocationServiceType", propOrder = {
        "personName",
        "telephone",
        "trackingID"
})
public class OffLocationServiceType
        extends OffLocationServiceCoreType {

    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "Telephone")
    protected OffLocationServiceType.Telephone telephone;
    @XmlElement(name = "TrackingID")
    protected UniqueIDType trackingID;
    @XmlAttribute(name = "SpecInstructions")
    protected String specInstructions;

    /**
     * ��ȡpersonName���Ե�ֵ��
     *
     * @return possible object is
     * {@link PersonNameType }
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * ����personName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PersonNameType }
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * ��ȡtelephone���Ե�ֵ��
     *
     * @return possible object is
     * {@link OffLocationServiceType.Telephone }
     */
    public OffLocationServiceType.Telephone getTelephone() {
        return telephone;
    }

    /**
     * ����telephone���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OffLocationServiceType.Telephone }
     */
    public void setTelephone(OffLocationServiceType.Telephone value) {
        this.telephone = value;
    }

    /**
     * ��ȡtrackingID���Ե�ֵ��
     *
     * @return possible object is
     * {@link UniqueIDType }
     */
    public UniqueIDType getTrackingID() {
        return trackingID;
    }

    /**
     * ����trackingID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link UniqueIDType }
     */
    public void setTrackingID(UniqueIDType value) {
        this.trackingID = value;
    }

    /**
     * ��ȡspecInstructions���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpecInstructions() {
        return specInstructions;
    }

    /**
     * ����specInstructions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpecInstructions(String value) {
        this.specInstructions = value;
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {


    }

}
