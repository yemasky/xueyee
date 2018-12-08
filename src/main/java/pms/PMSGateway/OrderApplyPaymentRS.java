package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OrderApplyPaymentRS complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OrderApplyPaymentRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/>
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderApplyPaymentRS", propOrder = {
        "warningsOrErrorsOrSuccess"
})
public class OrderApplyPaymentRS {

    @XmlElements({
            @XmlElement(name = "Warnings", type = WarningsType.class),
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "Success", type = SuccessType.class)
    })
    protected List<Object> warningsOrErrorsOrSuccess;

    /**
     * Gets the value of the warningsOrErrorsOrSuccess property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningsOrErrorsOrSuccess property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningsOrErrorsOrSuccess().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningsType }
     * {@link ErrorsType }
     * {@link SuccessType }
     */
    public List<Object> getWarningsOrErrorsOrSuccess() {
        if (warningsOrErrorsOrSuccess == null) {
            warningsOrErrorsOrSuccess = new ArrayList<Object>();
        }
        return this.warningsOrErrorsOrSuccess;
    }

}
