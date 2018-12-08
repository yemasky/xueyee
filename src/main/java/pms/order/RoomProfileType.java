package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RoomProfileType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RoomProfileType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
 *       &lt;sequence>
 *         &lt;element name="PassengerRPHs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ListOfPassengerRPH">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "RoomProfileType", propOrder = {
        "passengerRPHs"
})
public class RoomProfileType
        extends RoomStayCandidateType {

    @XmlElement(name = "PassengerRPHs")
    protected RoomProfileType.PassengerRPHs passengerRPHs;
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
     * ��ȡpassengerRPHs���Ե�ֵ��
     *
     * @return possible object is
     * {@link RoomProfileType.PassengerRPHs }
     */
    public RoomProfileType.PassengerRPHs getPassengerRPHs() {
        return passengerRPHs;
    }

    /**
     * ����passengerRPHs���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link RoomProfileType.PassengerRPHs }
     */
    public void setPassengerRPHs(RoomProfileType.PassengerRPHs value) {
        this.passengerRPHs = value;
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


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ListOfPassengerRPH">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerRPHs {

        @XmlAttribute(name = "ListOfPassengerRPH")
        protected List<String> listOfPassengerRPH;

        /**
         * Gets the value of the listOfPassengerRPH property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listOfPassengerRPH property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListOfPassengerRPH().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getListOfPassengerRPH() {
            if (listOfPassengerRPH == null) {
                listOfPassengerRPH = new ArrayList<String>();
            }
            return this.listOfPassengerRPH;
        }

    }

}
