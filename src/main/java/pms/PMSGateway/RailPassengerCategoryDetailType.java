package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RailPassengerCategoryDetailType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="RailPassengerCategoryDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RailPassengerCategoryType">
 *       &lt;sequence>
 *         &lt;element name="PassengerDetail" type="{http://www.opentravel.org/OTA/2003/05}RailPassengerDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailPassengerCategoryDetailType", propOrder = {
        "passengerDetail"
})
public class RailPassengerCategoryDetailType
        extends RailPassengerCategoryType {

    @XmlElement(name = "PassengerDetail")
    protected List<RailPassengerDetailType> passengerDetail;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantity;

    /**
     * Gets the value of the passengerDetail property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerDetail property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerDetail().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPassengerDetailType }
     */
    public List<RailPassengerDetailType> getPassengerDetail() {
        if (passengerDetail == null) {
            passengerDetail = new ArrayList<RailPassengerDetailType>();
        }
        return this.passengerDetail;
    }

    /**
     * ��ȡrph���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getRPH() {
        return rph;
    }

    /**
     * ����rph���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRPH(String value) {
        this.rph = value;
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

}
