package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>LocationType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
        "value"
})
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation.OneWayDropLocation.class,
        AirportPrefType.class,
        pms.PMSGateway.VehicleRentalCoreType.PickUpLocation.class,
        pms.PMSGateway.VehicleRentalCoreType.ReturnLocation.class,
        pms.PMSGateway.VerificationType.StartLocation.class,
        pms.PMSGateway.VerificationType.EndLocation.class,
        StationType.class,
        pms.PMSGateway.SailingBaseType.DeparturePort.class,
        pms.PMSGateway.SailingBaseType.ArrivalPort.class
})
public class LocationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;

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
     * ��ȡlocationCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * ����locationCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
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
