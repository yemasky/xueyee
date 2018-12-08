package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfHotelInfoTypeBlackoutDate complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfHotelInfoTypeBlackoutDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BlackoutDate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfHotelInfoTypeBlackoutDate", propOrder = {
        "blackoutDate"
})
public class ArrayOfHotelInfoTypeBlackoutDate {

    @XmlElement(name = "BlackoutDate")
    protected List<ArrayOfHotelInfoTypeBlackoutDate.BlackoutDate> blackoutDate;

    /**
     * Gets the value of the blackoutDate property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blackoutDate property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlackoutDate().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelInfoTypeBlackoutDate.BlackoutDate }
     */
    public List<ArrayOfHotelInfoTypeBlackoutDate.BlackoutDate> getBlackoutDate() {
        if (blackoutDate == null) {
            blackoutDate = new ArrayList<ArrayOfHotelInfoTypeBlackoutDate.BlackoutDate>();
        }
        return this.blackoutDate;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType">
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BlackoutDate
            extends DateTimeSpanType {

        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * ��ȡname���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getName() {
            return name;
        }

        /**
         * ����name���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
