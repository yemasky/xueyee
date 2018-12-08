package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>RoomAmenityPrefType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RoomAmenityPrefType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *       &lt;attribute name="RoomAmenity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="QualityLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomGender">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Male"/>
 *             &lt;enumeration value="Female"/>
 *             &lt;enumeration value="MaleAndFemale"/>
 *             &lt;enumeration value="Unknown"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SharedRoomInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomAmenityPrefType", propOrder = {
        "value"
})
@XmlSeeAlso({
        pms.order.ArrayOfPropertyValueMatchTypeAmenity.Amenity.class
})
public class RoomAmenityPrefType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "RoomAmenity")
    protected String roomAmenity;
    @XmlAttribute(name = "ExistsCode")
    protected String existsCode;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "QualityLevel")
    protected String qualityLevel;
    @XmlAttribute(name = "RoomGender")
    protected String roomGender;
    @XmlAttribute(name = "SharedRoomInd")
    protected Boolean sharedRoomInd;

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
     * ��ȡroomAmenity���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomAmenity() {
        return roomAmenity;
    }

    /**
     * ����roomAmenity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomAmenity(String value) {
        this.roomAmenity = value;
    }

    /**
     * ��ȡexistsCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getExistsCode() {
        return existsCode;
    }

    /**
     * ����existsCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExistsCode(String value) {
        this.existsCode = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * ��ȡqualityLevel���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getQualityLevel() {
        return qualityLevel;
    }

    /**
     * ����qualityLevel���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQualityLevel(String value) {
        this.qualityLevel = value;
    }

    /**
     * ��ȡroomGender���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRoomGender() {
        return roomGender;
    }

    /**
     * ����roomGender���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRoomGender(String value) {
        this.roomGender = value;
    }

    /**
     * ��ȡsharedRoomInd���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSharedRoomInd() {
        return sharedRoomInd;
    }

    /**
     * ����sharedRoomInd���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSharedRoomInd(Boolean value) {
        this.sharedRoomInd = value;
    }

}
