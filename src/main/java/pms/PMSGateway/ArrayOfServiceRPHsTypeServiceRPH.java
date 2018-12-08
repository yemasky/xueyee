package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfServiceRPHsTypeServiceRPH complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfServiceRPHsTypeServiceRPH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceRPH" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IsPerRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfServiceRPHsTypeServiceRPH", propOrder = {
        "serviceRPH"
})
public class ArrayOfServiceRPHsTypeServiceRPH {

    @XmlElement(name = "ServiceRPH")
    protected List<ArrayOfServiceRPHsTypeServiceRPH.ServiceRPH> serviceRPH;

    /**
     * Gets the value of the serviceRPH property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRPH property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRPH().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfServiceRPHsTypeServiceRPH.ServiceRPH }
     */
    public List<ArrayOfServiceRPHsTypeServiceRPH.ServiceRPH> getServiceRPH() {
        if (serviceRPH == null) {
            serviceRPH = new ArrayList<ArrayOfServiceRPHsTypeServiceRPH.ServiceRPH>();
        }
        return this.serviceRPH;
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
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IsPerRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ServiceRPH {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "IsPerRoom")
        protected Boolean isPerRoom;

        /**
         * ��ȡrph���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRPH() {
            return rph;
        }

        /**
         * ����rph���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * ��ȡisPerRoom���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isIsPerRoom() {
            return isPerRoom;
        }

        /**
         * ����isPerRoom���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setIsPerRoom(Boolean value) {
            this.isPerRoom = value;
        }

    }

}
