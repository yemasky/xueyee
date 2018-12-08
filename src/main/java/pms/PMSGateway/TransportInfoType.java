package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TransportInfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="TransportInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransportInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
@XmlType(name = "TransportInfoType", propOrder = {
        "transportInfo"
})
public class TransportInfoType {

    @XmlElement(name = "TransportInfo")
    protected TransportInfoType.TransportInfo transportInfo;

    /**
     * ��ȡtransportInfo���Ե�ֵ��
     *
     * @return possible object is
     * {@link TransportInfoType.TransportInfo }
     */
    public TransportInfoType.TransportInfo getTransportInfo() {
        return transportInfo;
    }

    /**
     * ����transportInfo���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link TransportInfoType.TransportInfo }
     */
    public void setTransportInfo(TransportInfoType.TransportInfo value) {
        this.transportInfo = value;
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
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TransportInfo {

        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "ID")
        protected String id;
        @XmlAttribute(name = "LocationCode")
        protected String locationCode;
        @XmlAttribute(name = "Time")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar time;

        /**
         * ��ȡtype���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getType() {
            return type;
        }

        /**
         * ����type���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * ��ȡid���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getID() {
            return id;
        }

        /**
         * ����id���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * ��ȡlocationCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * ����locationCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
        }

        /**
         * ��ȡtime���Ե�ֵ��
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getTime() {
            return time;
        }

        /**
         * ����time���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setTime(XMLGregorianCalendar value) {
            this.time = value;
        }

    }

}
