package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfHTNG_ComponentRoomType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfHTNG_ComponentRoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComponentRoom" type="{http://htng.org/2014B}HTNG_ComponentRoomType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHTNG_ComponentRoomType", namespace = "http://htng.org/2014B", propOrder = {
        "componentRoom"
})
public class ArrayOfHTNGComponentRoomType {

    @XmlElement(name = "ComponentRoom")
    protected List<HTNGComponentRoomType> componentRoom;

    /**
     * Gets the value of the componentRoom property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentRoom property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentRoom().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link HTNGComponentRoomType }
     */
    public List<HTNGComponentRoomType> getComponentRoom() {
        if (componentRoom == null) {
            componentRoom = new ArrayList<HTNGComponentRoomType>();
        }
        return this.componentRoom;
    }

}
