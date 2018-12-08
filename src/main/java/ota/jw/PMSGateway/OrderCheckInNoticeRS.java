
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderCheckInNoticeRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderCheckInNoticeRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/&gt;
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCheckInNoticeRS", propOrder = {
    "successOrWarningsOrErrors"
})
public class OrderCheckInNoticeRS {

    @XmlElements({
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class)
    })
    protected List<Object> successOrWarningsOrErrors;

    /**
     * Gets the value of the successOrWarningsOrErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successOrWarningsOrErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessOrWarningsOrErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessType }
     * {@link WarningsType }
     * {@link ErrorsType }
     * 
     * 
     */
    public List<Object> getSuccessOrWarningsOrErrors() {
        if (successOrWarningsOrErrors == null) {
            successOrWarningsOrErrors = new ArrayList<Object>();
        }
        return this.successOrWarningsOrErrors;
    }

}
