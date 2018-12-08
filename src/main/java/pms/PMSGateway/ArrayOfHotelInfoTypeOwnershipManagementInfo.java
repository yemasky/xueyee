package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfHotelInfoTypeOwnershipManagementInfo complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfHotelInfoTypeOwnershipManagementInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OwnershipManagementInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
 *                 &lt;attribute name="RelationshipTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfHotelInfoTypeOwnershipManagementInfo", propOrder = {
        "ownershipManagementInfo"
})
public class ArrayOfHotelInfoTypeOwnershipManagementInfo {

    @XmlElement(name = "OwnershipManagementInfo")
    protected List<ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo> ownershipManagementInfo;

    /**
     * Gets the value of the ownershipManagementInfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownershipManagementInfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnershipManagementInfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo }
     */
    public List<ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo> getOwnershipManagementInfo() {
        if (ownershipManagementInfo == null) {
            ownershipManagementInfo = new ArrayList<ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo>();
        }
        return this.ownershipManagementInfo;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType">
     *       &lt;attribute name="RelationshipTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OwnershipManagementInfo
            extends ContactInfoType {

        @XmlAttribute(name = "RelationshipTypeCode")
        protected String relationshipTypeCode;

        /**
         * ��ȡrelationshipTypeCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRelationshipTypeCode() {
            return relationshipTypeCode;
        }

        /**
         * ����relationshipTypeCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRelationshipTypeCode(String value) {
            this.relationshipTypeCode = value;
        }

    }

}
