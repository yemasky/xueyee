
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelInfoTypeOwnershipManagementInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelInfoTypeOwnershipManagementInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OwnershipManagementInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType"&gt;
 *                 &lt;attribute name="RelationshipTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownershipManagementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnershipManagementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo }
     * 
     * 
     */
    public List<ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo> getOwnershipManagementInfo() {
        if (ownershipManagementInfo == null) {
            ownershipManagementInfo = new ArrayList<ArrayOfHotelInfoTypeOwnershipManagementInfo.OwnershipManagementInfo>();
        }
        return this.ownershipManagementInfo;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactInfoType"&gt;
     *       &lt;attribute name="RelationshipTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OwnershipManagementInfo
        extends ContactInfoType
    {

        @XmlAttribute(name = "RelationshipTypeCode")
        protected String relationshipTypeCode;

        /**
         * 获取relationshipTypeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelationshipTypeCode() {
            return relationshipTypeCode;
        }

        /**
         * 设置relationshipTypeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelationshipTypeCode(String value) {
            this.relationshipTypeCode = value;
        }

    }

}
