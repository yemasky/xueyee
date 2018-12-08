package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfRoutingHopTypeRoutingHop complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfRoutingHopTypeRoutingHop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoutingHop" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LocalRefID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Data" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfRoutingHopTypeRoutingHop", propOrder = {
        "routingHop"
})
public class ArrayOfRoutingHopTypeRoutingHop {

    @XmlElement(name = "RoutingHop")
    protected List<ArrayOfRoutingHopTypeRoutingHop.RoutingHop> routingHop;

    /**
     * Gets the value of the routingHop property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingHop property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingHop().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRoutingHopTypeRoutingHop.RoutingHop }
     */
    public List<ArrayOfRoutingHopTypeRoutingHop.RoutingHop> getRoutingHop() {
        if (routingHop == null) {
            routingHop = new ArrayList<ArrayOfRoutingHopTypeRoutingHop.RoutingHop>();
        }
        return this.routingHop;
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
     *       &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LocalRefID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Data" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoutingHop {

        @XmlAttribute(name = "SystemCode")
        protected String systemCode;
        @XmlAttribute(name = "LocalRefID")
        protected String localRefID;
        @XmlAttribute(name = "TimeStamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timeStamp;
        @XmlAttribute(name = "Comment")
        protected String comment;
        @XmlAttribute(name = "SequenceNmbr")
        protected BigInteger sequenceNmbr;
        @XmlAttribute(name = "Data")
        protected String data;

        /**
         * ��ȡsystemCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSystemCode() {
            return systemCode;
        }

        /**
         * ����systemCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSystemCode(String value) {
            this.systemCode = value;
        }

        /**
         * ��ȡlocalRefID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLocalRefID() {
            return localRefID;
        }

        /**
         * ����localRefID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLocalRefID(String value) {
            this.localRefID = value;
        }

        /**
         * ��ȡtimeStamp���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getTimeStamp() {
            return timeStamp;
        }

        /**
         * ����timeStamp���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setTimeStamp(XMLGregorianCalendar value) {
            this.timeStamp = value;
        }

        /**
         * ��ȡcomment���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getComment() {
            return comment;
        }

        /**
         * ����comment���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * ��ȡsequenceNmbr���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getSequenceNmbr() {
            return sequenceNmbr;
        }

        /**
         * ����sequenceNmbr���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setSequenceNmbr(BigInteger value) {
            this.sequenceNmbr = value;
        }

        /**
         * ��ȡdata���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getData() {
            return data;
        }

        /**
         * ����data���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setData(String value) {
            this.data = value;
        }

    }

}
