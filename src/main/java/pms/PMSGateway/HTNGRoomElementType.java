package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HTNG_RoomElementType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HTNG_RoomElementType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://htng.org/2014B}HTNG_ComponentRoomType">
 *       &lt;sequence>
 *         &lt;element name="ComponentRooms" type="{http://htng.org/2014B}ArrayOfHTNG_ComponentRoomType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTNG_RoomElementType", namespace = "http://htng.org/2014B", propOrder = {
        "componentRooms"
})
public class HTNGRoomElementType
        extends HTNGComponentRoomType {

    @XmlElement(name = "ComponentRooms")
    protected ArrayOfHTNGComponentRoomType componentRooms;

    /**
     * ��ȡcomponentRooms���Ե�ֵ��
     *
     * @return possible object is
     * {@link ArrayOfHTNGComponentRoomType }
     */
    public ArrayOfHTNGComponentRoomType getComponentRooms() {
        return componentRooms;
    }

    /**
     * ����componentRooms���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ArrayOfHTNGComponentRoomType }
     */
    public void setComponentRooms(ArrayOfHTNGComponentRoomType value) {
        this.componentRooms = value;
    }

}
