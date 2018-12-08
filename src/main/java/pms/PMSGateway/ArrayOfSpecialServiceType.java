package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfSpecialServiceType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfSpecialServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedSpecialService" type="{http://www.opentravel.org/OTA/2003/05}SpecialServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSpecialServiceType", propOrder = {
        "selectedSpecialService"
})
public class ArrayOfSpecialServiceType {

    @XmlElement(name = "SelectedSpecialService")
    protected List<SpecialServiceType> selectedSpecialService;

    /**
     * Gets the value of the selectedSpecialService property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedSpecialService property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedSpecialService().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialServiceType }
     */
    public List<SpecialServiceType> getSelectedSpecialService() {
        if (selectedSpecialService == null) {
            selectedSpecialService = new ArrayList<SpecialServiceType>();
        }
        return this.selectedSpecialService;
    }

}
