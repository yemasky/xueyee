
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>SeatingPrefType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeatingPrefType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *       &lt;attribute name="SeatDirection" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeatLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeatPosition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeatRow" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatingPrefType", propOrder = {
    "value"
})
public class SeatingPrefType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "SeatDirection")
    protected String seatDirection;
    @XmlAttribute(name = "SeatLocation")
    protected String seatLocation;
    @XmlAttribute(name = "SeatPosition")
    protected String seatPosition;
    @XmlAttribute(name = "SeatRow")
    protected String seatRow;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取preferLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * 设置preferLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    /**
     * 获取seatDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatDirection() {
        return seatDirection;
    }

    /**
     * 设置seatDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatDirection(String value) {
        this.seatDirection = value;
    }

    /**
     * 获取seatLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatLocation() {
        return seatLocation;
    }

    /**
     * 设置seatLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatLocation(String value) {
        this.seatLocation = value;
    }

    /**
     * 获取seatPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPosition() {
        return seatPosition;
    }

    /**
     * 设置seatPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPosition(String value) {
        this.seatPosition = value;
    }

    /**
     * 获取seatRow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatRow() {
        return seatRow;
    }

    /**
     * 设置seatRow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatRow(String value) {
        this.seatRow = value;
    }

}
