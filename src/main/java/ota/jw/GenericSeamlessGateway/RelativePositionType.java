
package ota.jw.GenericSeamlessGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RelativePositionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RelativePositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TransportationsType"&gt;
 *       &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DistanceUnitName" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" /&gt;
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Nearest" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IndexPointCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PrimaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ToFrom"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="ToFacility"/&gt;
 *             &lt;enumeration value="FromFacility"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ApproximateDistanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativePositionType")
public class RelativePositionType
    extends TransportationsType
{

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
     * 获取direction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * 设置direction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * 获取distance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * 设置distance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * 获取distanceUnitName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public DistanceUnitNameType getDistanceUnitName() {
        return distanceUnitName;
    }

    /**
     * 设置distanceUnitName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public void setDistanceUnitName(DistanceUnitNameType value) {
        this.distanceUnitName = value;
    }

    /**
     * 获取unitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * 设置unitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * 获取nearest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNearest() {
        return nearest;
    }

    /**
     * 设置nearest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNearest(Boolean value) {
        this.nearest = value;
    }

    /**
     * 获取indexPointCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexPointCode() {
        return indexPointCode;
    }

    /**
     * 设置indexPointCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexPointCode(String value) {
        this.indexPointCode = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取primaryIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * 设置primaryIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryIndicator(Boolean value) {
        this.primaryIndicator = value;
    }

    /**
     * 获取toFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToFrom() {
        return toFrom;
    }

    /**
     * 设置toFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToFrom(String value) {
        this.toFrom = value;
    }

    /**
     * 获取approximateDistanceInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateDistanceInd() {
        return approximateDistanceInd;
    }

    /**
     * 设置approximateDistanceInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateDistanceInd(Boolean value) {
        this.approximateDistanceInd = value;
    }

}
