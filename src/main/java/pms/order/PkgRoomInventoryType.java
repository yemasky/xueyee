package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>PkgRoomInventoryType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="PkgRoomInventoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
 *       &lt;sequence>
 *         &lt;element name="SupplementCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MaxAdults" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="CotQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="FreeChildFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgRoomInventoryType", propOrder = {
        "supplementCharges"
})
public class PkgRoomInventoryType
        extends RoomStayCandidateType {

    @XmlElement(name = "SupplementCharges")
    protected ArrayOfFeeType supplementCharges;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "MinOccupancy")
    protected BigInteger minOccupancy;
    @XmlAttribute(name = "MaxOccupancy")
    protected BigInteger maxOccupancy;
    @XmlAttribute(name = "MaxAdults")
    protected BigInteger maxAdults;
    @XmlAttribute(name = "CotQuantity")
    protected BigInteger cotQuantity;
    @XmlAttribute(name = "FreeChildFlag")
    protected Boolean freeChildFlag;

    /**
     * ��ȡsupplementCharges���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfFeeType }
     */
    public ArrayOfFeeType getSupplementCharges() {
        return supplementCharges;
    }

    /**
     * ����supplementCharges���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfFeeType }
     */
    public void setSupplementCharges(ArrayOfFeeType value) {
        this.supplementCharges = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡminOccupancy���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMinOccupancy() {
        return minOccupancy;
    }

    /**
     * ����minOccupancy���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMinOccupancy(BigInteger value) {
        this.minOccupancy = value;
    }

    /**
     * ��ȡmaxOccupancy���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * ����maxOccupancy���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxOccupancy(BigInteger value) {
        this.maxOccupancy = value;
    }

    /**
     * ��ȡmaxAdults���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxAdults() {
        return maxAdults;
    }

    /**
     * ����maxAdults���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxAdults(BigInteger value) {
        this.maxAdults = value;
    }

    /**
     * ��ȡcotQuantity���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getCotQuantity() {
        return cotQuantity;
    }

    /**
     * ����cotQuantity���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setCotQuantity(BigInteger value) {
        this.cotQuantity = value;
    }

    /**
     * ��ȡfreeChildFlag���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isFreeChildFlag() {
        return freeChildFlag;
    }

    /**
     * ����freeChildFlag���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setFreeChildFlag(Boolean value) {
        this.freeChildFlag = value;
    }

}
