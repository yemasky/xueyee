package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfCruiseGuestInfoTypeLinkedBooking complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfCruiseGuestInfoTypeLinkedBooking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkedBooking" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
 *                 &lt;attribute name="LinkTypeCode">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "ArrayOfCruiseGuestInfoTypeLinkedBooking", propOrder = {
        "linkedBooking"
})
public class ArrayOfCruiseGuestInfoTypeLinkedBooking {

    @XmlElement(name = "LinkedBooking")
    protected List<ArrayOfCruiseGuestInfoTypeLinkedBooking.LinkedBooking> linkedBooking;

    /**
     * Gets the value of the linkedBooking property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedBooking property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedBooking().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCruiseGuestInfoTypeLinkedBooking.LinkedBooking }
     */
    public List<ArrayOfCruiseGuestInfoTypeLinkedBooking.LinkedBooking> getLinkedBooking() {
        if (linkedBooking == null) {
            linkedBooking = new ArrayList<ArrayOfCruiseGuestInfoTypeLinkedBooking.LinkedBooking>();
        }
        return this.linkedBooking;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
     *       &lt;attribute name="LinkTypeCode">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LinkedBooking
            extends RelatedTravelerType {

        @XmlAttribute(name = "LinkTypeCode")
        protected List<String> linkTypeCode;

        /**
         * Gets the value of the linkTypeCode property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkTypeCode property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinkTypeCode().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getLinkTypeCode() {
            if (linkTypeCode == null) {
                linkTypeCode = new ArrayList<String>();
            }
            return this.linkTypeCode;
        }

    }

}
