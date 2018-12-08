package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShuttleInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
 *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailShuttleInfoType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo", propOrder = {
        "shuttleInfo"
})
public class ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo {

    @XmlElement(name = "ShuttleInfo")
    protected List<ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo.ShuttleInfo> shuttleInfo;

    /**
     * Gets the value of the shuttleInfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shuttleInfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShuttleInfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo.ShuttleInfo }
     */
    public List<ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo.ShuttleInfo> getShuttleInfo() {
        if (shuttleInfo == null) {
            shuttleInfo = new ArrayList<ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo.ShuttleInfo>();
        }
        return this.shuttleInfo;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
     *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailShuttleInfoType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ShuttleInfo
            extends FormattedTextType {

        @XmlAttribute(name = "Type", required = true)
        protected LocationDetailShuttleInfoType type;

        /**
         * ��ȡtype���Ե�ֵ��
         *
         * @return possible object is
         * {@link LocationDetailShuttleInfoType }
         */
        public LocationDetailShuttleInfoType getType() {
            return type;
        }

        /**
         * ����type���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link LocationDetailShuttleInfoType }
         */
        public void setType(LocationDetailShuttleInfoType value) {
            this.type = value;
        }

    }

}
