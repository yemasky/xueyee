package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>RelativePositionType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RelativePositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TransportationsType">
 *       &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DistanceUnitName" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Nearest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IndexPointCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ToFrom">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ToFacility"/>
 *             &lt;enumeration value="FromFacility"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ApproximateDistanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativePositionType")
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfRefPointsTypeRefPoint.RefPoint.class,
        pms.PMSGateway.RefPointsType.RefPoint.class
})
public class RelativePositionType
        extends TransportationsType {

    @XmlAttribute(name = "Direction")
    protected String direction;
    @XmlAttribute(name = "Distance")
    protected String distance;
    @XmlAttribute(name = "DistanceUnitName")
    protected DistanceUnitNameType distanceUnitName;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "Nearest")
    protected Boolean nearest;
    @XmlAttribute(name = "IndexPointCode")
    protected String indexPointCode;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "PrimaryIndicator")
    protected Boolean primaryIndicator;
    @XmlAttribute(name = "ToFrom")
    protected String toFrom;
    @XmlAttribute(name = "ApproximateDistanceInd")
    protected Boolean approximateDistanceInd;

    /**
     * ��ȡdirection���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDirection() {
        return direction;
    }

    /**
     * ����direction���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * ��ȡdistance���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDistance() {
        return distance;
    }

    /**
     * ����distance���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * ��ȡdistanceUnitName���Ե�ֵ��
     *
     * @return possible object is
     * {@link DistanceUnitNameType }
     */
    public DistanceUnitNameType getDistanceUnitName() {
        return distanceUnitName;
    }

    /**
     * ����distanceUnitName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link DistanceUnitNameType }
     */
    public void setDistanceUnitName(DistanceUnitNameType value) {
        this.distanceUnitName = value;
    }

    /**
     * ��ȡunitOfMeasureCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * ����unitOfMeasureCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * ��ȡnearest���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isNearest() {
        return nearest;
    }

    /**
     * ����nearest���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setNearest(Boolean value) {
        this.nearest = value;
    }

    /**
     * ��ȡindexPointCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getIndexPointCode() {
        return indexPointCode;
    }

    /**
     * ����indexPointCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIndexPointCode(String value) {
        this.indexPointCode = value;
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
     * ��ȡprimaryIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * ����primaryIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPrimaryIndicator(Boolean value) {
        this.primaryIndicator = value;
    }

    /**
     * ��ȡtoFrom���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getToFrom() {
        return toFrom;
    }

    /**
     * ����toFrom���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setToFrom(String value) {
        this.toFrom = value;
    }

    /**
     * ��ȡapproximateDistanceInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isApproximateDistanceInd() {
        return approximateDistanceInd;
    }

    /**
     * ����approximateDistanceInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setApproximateDistanceInd(Boolean value) {
        this.approximateDistanceInd = value;
    }

}
