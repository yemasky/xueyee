package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>MeetingRoomCodeType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="MeetingRoomCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
 *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="DiscountsAvailableCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRoomCodeType", propOrder = {
        "charge",
        "multimediaDescriptions"
})
public class MeetingRoomCodeType {

    @XmlElement(name = "Charge")
    protected FeeType charge;
    @XmlElement(name = "MultimediaDescriptions")
    protected MultimediaDescriptionsType multimediaDescriptions;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "ExistsCode")
    protected String existsCode;
    @XmlAttribute(name = "CodeDetail")
    protected String codeDetail;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "DiscountsAvailableCode")
    protected String discountsAvailableCode;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * ��ȡcharge���Ե�ֵ��
     *
     * @return possible object is
     * {@link FeeType }
     */
    public FeeType getCharge() {
        return charge;
    }

    /**
     * ����charge���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link FeeType }
     */
    public void setCharge(FeeType value) {
        this.charge = value;
    }

    /**
     * ��ȡmultimediaDescriptions���Ե�ֵ��
     *
     * @return possible object is
     * {@link MultimediaDescriptionsType }
     */
    public MultimediaDescriptionsType getMultimediaDescriptions() {
        return multimediaDescriptions;
    }

    /**
     * ����multimediaDescriptions���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link MultimediaDescriptionsType }
     */
    public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
        this.multimediaDescriptions = value;
    }

    /**
     * ��ȡcode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCode() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCode(String value) {
        this.code = value;
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
     * ��ȡcodeDetail���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodeDetail() {
        return codeDetail;
    }

    /**
     * ����codeDetail���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodeDetail(String value) {
        this.codeDetail = value;
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
     * ��ȡdiscountsAvailableCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDiscountsAvailableCode() {
        return discountsAvailableCode;
    }

    /**
     * ����discountsAvailableCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDiscountsAvailableCode(String value) {
        this.discountsAvailableCode = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setID(String value) {
        this.id = value;
    }

}
