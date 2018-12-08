package pms.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfAffiliationInfoTypePartnerInfo complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfAffiliationInfoTypePartnerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "ArrayOfAffiliationInfoTypePartnerInfo", propOrder = {
        "partnerInfo"
})
public class ArrayOfAffiliationInfoTypePartnerInfo {

    @XmlElement(name = "PartnerInfo")
    protected List<ArrayOfAffiliationInfoTypePartnerInfo.PartnerInfo> partnerInfo;

    /**
     * Gets the value of the partnerInfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerInfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerInfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAffiliationInfoTypePartnerInfo.PartnerInfo }
     */
    public List<ArrayOfAffiliationInfoTypePartnerInfo.PartnerInfo> getPartnerInfo() {
        if (partnerInfo == null) {
            partnerInfo = new ArrayList<ArrayOfAffiliationInfoTypePartnerInfo.PartnerInfo>();
        }
        return this.partnerInfo;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoType" minOccurs="0"/>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "contact",
            "description"
    })
    public static class PartnerInfo {

        @XmlElement(name = "Contact")
        protected ContactInfoType contact;
        @XmlElement(name = "Description")
        protected ParagraphType description;

        /**
         * ��ȡcontact���Ե�ֵ��
         *
         * @return possible object is
         * {@link ContactInfoType }
         */
        public ContactInfoType getContact() {
            return contact;
        }

        /**
         * ����contact���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ContactInfoType }
         */
        public void setContact(ContactInfoType value) {
            this.contact = value;
        }

        /**
         * ��ȡdescription���Ե�ֵ��
         *
         * @return possible object is
         * {@link ParagraphType }
         */
        public ParagraphType getDescription() {
            return description;
        }

        /**
         * ����description���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ParagraphType }
         */
        public void setDescription(ParagraphType value) {
            this.description = value;
        }

    }

}
