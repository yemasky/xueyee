package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>AmenityOptionType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="AmenityOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Originator" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OptionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DeliveryLocation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="diningroom"/>
 *             &lt;enumeration value="cabin"/>
 *             &lt;enumeration value="person"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ModifiableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmenityOptionType", propOrder = {
        "originator",
        "message"
})
public class AmenityOptionType {

    @XmlElement(name = "Originator")
    protected PersonNameType originator;
    @XmlElement(name = "Message")
    protected ParagraphType message;
    @XmlAttribute(name = "OptionCode")
    protected String optionCode;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "DeliveryDate")
    protected String deliveryDate;
    @XmlAttribute(name = "DeliveryLocation")
    protected String deliveryLocation;
    @XmlAttribute(name = "ModifiableIndicator")
    protected Boolean modifiableIndicator;

    /**
     * ��ȡoriginator���Ե�ֵ��
     *
     * @return possible object is
     * {@link PersonNameType }
     */
    public PersonNameType getOriginator() {
        return originator;
    }

    /**
     * ����originator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link PersonNameType }
     */
    public void setOriginator(PersonNameType value) {
        this.originator = value;
    }

    /**
     * ��ȡmessage���Ե�ֵ��
     *
     * @return possible object is
     * {@link ParagraphType }
     */
    public ParagraphType getMessage() {
        return message;
    }

    /**
     * ����message���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ParagraphType }
     */
    public void setMessage(ParagraphType value) {
        this.message = value;
    }

    /**
     * ��ȡoptionCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getOptionCode() {
        return optionCode;
    }

    /**
     * ����optionCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOptionCode(String value) {
        this.optionCode = value;
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
     * ��ȡdeliveryDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * ����deliveryDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeliveryDate(String value) {
        this.deliveryDate = value;
    }

    /**
     * ��ȡdeliveryLocation���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * ����deliveryLocation���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeliveryLocation(String value) {
        this.deliveryLocation = value;
    }

    /**
     * ��ȡmodifiableIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isModifiableIndicator() {
        return modifiableIndicator;
    }

    /**
     * ����modifiableIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setModifiableIndicator(Boolean value) {
        this.modifiableIndicator = value;
    }

}
