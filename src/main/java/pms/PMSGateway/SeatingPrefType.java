package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>SeatingPrefType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="SeatingPrefType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *       &lt;attribute name="SeatDirection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatPosition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatRow" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
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
     * ��ȡpreferLevel���Ե�ֵ��
     *
     * @return possible object is
     * {@link PreferLevelType }
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * ����preferLevel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PreferLevelType }
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    /**
     * ��ȡseatDirection���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSeatDirection() {
        return seatDirection;
    }

    /**
     * ����seatDirection���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSeatDirection(String value) {
        this.seatDirection = value;
    }

    /**
     * ��ȡseatLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSeatLocation() {
        return seatLocation;
    }

    /**
     * ����seatLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSeatLocation(String value) {
        this.seatLocation = value;
    }

    /**
     * ��ȡseatPosition���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSeatPosition() {
        return seatPosition;
    }

    /**
     * ����seatPosition���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSeatPosition(String value) {
        this.seatPosition = value;
    }

    /**
     * ��ȡseatRow���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSeatRow() {
        return seatRow;
    }

    /**
     * ����seatRow���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSeatRow(String value) {
        this.seatRow = value;
    }

}
