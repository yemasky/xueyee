package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HTNG_BasicOrSuiteRoomType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="HTNG_BasicOrSuiteRoomType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomTypeType">
 *       &lt;sequence>
 *         &lt;element name="ComponentRooms" type="{http://htng.org/2014B}ArrayOfHTNG_ComponentRoomType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTNG_BasicOrSuiteRoomType", namespace = "http://htng.org/2014B", propOrder = {
        "componentRooms"
})
public class HTNGBasicOrSuiteRoomType
        extends RoomTypeType {

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
