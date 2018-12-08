
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCruiseGuestInfoTypeLinkedBooking complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCruiseGuestInfoTypeLinkedBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkedBooking" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType"&gt;
 *                 &lt;attribute name="LinkTypeCode"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
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
@XmlType(name = "ArrayOfCruiseGuestInfoTypeLinkedBooking", propOrder = {
    "linkedBooking"
})
public class ArrayOfCruiseGuestInfoTypeLinkedBooking {

    @XmlElement(name = "LinkedBooking")
    protected List<ArrayOfCruiseGuestInfoTypeLinkedBooking.LinkedBooking> linkedBooking;

    /**
     * Gets the value of the linkedBooking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedBooking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedBooking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCruiseGuestInfoTypeLinkedBooking.LinkedBooking }
     * 
     * 
     */
    public List<ArrayOfCruiseGuestInfoTypeLinkedBooking.LinkedBooking> getLinkedBooking() {
        if (linkedBooking == null) {
            linkedBooking = new ArrayList<ArrayOfCruiseGuestInfoTypeLinkedBooking.LinkedBooking>();
        }
        return this.linkedBooking;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType"&gt;
     *       &lt;attribute name="LinkTypeCode"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LinkedBooking
        extends RelatedTravelerType
    {

        @XmlAttribute(name = "LinkTypeCode")
        protected List<String> linkTypeCode;

        /**
         * Gets the value of the linkTypeCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkTypeCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinkTypeCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLinkTypeCode() {
            if (linkTypeCode == null) {
                linkTypeCode = new ArrayList<String>();
            }
            return this.linkTypeCode;
        }

    }

}
