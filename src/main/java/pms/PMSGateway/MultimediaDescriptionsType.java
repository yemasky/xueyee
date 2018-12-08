package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>MultimediaDescriptionsType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="MultimediaDescriptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultimediaDescription" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaDescriptionsType", propOrder = {
        "multimediaDescription"
})
@XmlSeeAlso({
        pms.PMSGateway.AreaInfoType.Recreations.Recreation.MultimediaDescriptions.class,
        pms.PMSGateway.HotelInfoType.Descriptions.MultimediaDescriptions.class,
        pms.PMSGateway.RestaurantType.MultimediaDescriptions.class
})
public class MultimediaDescriptionsType {

    @XmlElement(name = "MultimediaDescription")
    protected List<MultimediaDescriptionType> multimediaDescription;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * Gets the value of the multimediaDescription property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multimediaDescription property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultimediaDescription().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link MultimediaDescriptionType }
     */
    public List<MultimediaDescriptionType> getMultimediaDescription() {
        if (multimediaDescription == null) {
            multimediaDescription = new ArrayList<MultimediaDescriptionType>();
        }
        return this.multimediaDescription;
    }

    /**
     * ��ȡlastUpdated���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * ����lastUpdated���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

}
