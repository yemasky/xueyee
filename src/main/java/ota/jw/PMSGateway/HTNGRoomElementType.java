
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HTNG_RoomElementType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HTNG_RoomElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://htng.org/2014B}HTNG_ComponentRoomType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentRooms" type="{http://htng.org/2014B}ArrayOfHTNG_ComponentRoomType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTNG_RoomElementType", namespace = "http://htng.org/2014B", propOrder = {
    "componentRooms"
})
public class HTNGRoomElementType
    extends HTNGComponentRoomType
{

    @XmlElement(name = "ComponentRooms")
    protected ArrayOfHTNGComponentRoomType componentRooms;

    /**
     * 获取componentRooms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHTNGComponentRoomType }
     *     
     */
    public ArrayOfHTNGComponentRoomType getComponentRooms() {
        return componentRooms;
    }

    /**
     * 设置componentRooms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHTNGComponentRoomType }
     *     
     */
    public void setComponentRooms(ArrayOfHTNGComponentRoomType value) {
        this.componentRooms = value;
    }

}
