package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CancelPenaltiesType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CancelPenaltiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelPenalty" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CancelPolicyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPenaltiesType", propOrder = {
        "cancelPenalty"
})
public class CancelPenaltiesType {

    @XmlElement(name = "CancelPenalty")
    protected List<CancelPenaltyType> cancelPenalty;
    @XmlAttribute(name = "CancelPolicyIndicator")
    protected Boolean cancelPolicyIndicator;

    /**
     * Gets the value of the cancelPenalty property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelPenalty property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelPenalty().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelPenaltyType }
     */
    public List<CancelPenaltyType> getCancelPenalty() {
        if (cancelPenalty == null) {
            cancelPenalty = new ArrayList<CancelPenaltyType>();
        }
        return this.cancelPenalty;
    }

    /**
     * ��ȡcancelPolicyIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isCancelPolicyIndicator() {
        return cancelPolicyIndicator;
    }

    /**
     * ����cancelPolicyIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCancelPolicyIndicator(Boolean value) {
        this.cancelPolicyIndicator = value;
    }

}
