package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OrderCheckInNoticeRS complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OrderCheckInNoticeRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCheckInNoticeRS", propOrder = {
        "warningsOrSuccessOrErrors"
})
public class OrderCheckInNoticeRS {

    @XmlElements({
            @XmlElement(name = "Warnings", type = WarningsType.class),
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "Errors", type = ErrorsType.class)
    })
    protected List<Object> warningsOrSuccessOrErrors;

    /**
     * Gets the value of the warningsOrSuccessOrErrors property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningsOrSuccessOrErrors property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningsOrSuccessOrErrors().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningsType }
     * {@link SuccessType }
     * {@link ErrorsType }
     */
    public List<Object> getWarningsOrSuccessOrErrors() {
        if (warningsOrSuccessOrErrors == null) {
            warningsOrSuccessOrErrors = new ArrayList<Object>();
        }
        return this.warningsOrSuccessOrErrors;
    }

}
