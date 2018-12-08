package pms.order;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>HTNG_ExtendedPrice complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HTNG_ExtendedPrice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTNG_ExtendedPrice", namespace = "http://htng.org/2014B")
public class HTNGExtendedPrice
        extends TotalType {

    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;

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
