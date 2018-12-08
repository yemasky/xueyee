package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfHotelDescriptiveContentTypeEffectivePeriod complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfHotelDescriptiveContentTypeEffectivePeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EffectivePeriod" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="StartPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EndPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfHotelDescriptiveContentTypeEffectivePeriod", propOrder = {
        "effectivePeriod"
})
public class ArrayOfHotelDescriptiveContentTypeEffectivePeriod {

    @XmlElement(name = "EffectivePeriod")
    protected List<ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod> effectivePeriod;

    /**
     * Gets the value of the effectivePeriod property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectivePeriod property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectivePeriod().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod }
     */
    public List<ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod> getEffectivePeriod() {
        if (effectivePeriod == null) {
            effectivePeriod = new ArrayList<ArrayOfHotelDescriptiveContentTypeEffectivePeriod.EffectivePeriod>();
        }
        return this.effectivePeriod;
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
     *       &lt;attribute name="StartPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EndPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EffectivePeriod {

        @XmlAttribute(name = "StartPeriod")
        protected String startPeriod;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "EndPeriod")
        protected String endPeriod;

        /**
         * ��ȡstartPeriod���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStartPeriod() {
            return startPeriod;
        }

        /**
         * ����startPeriod���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStartPeriod(String value) {
            this.startPeriod = value;
        }

        /**
         * ��ȡduration���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDuration() {
            return duration;
        }

        /**
         * ����duration���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * ��ȡendPeriod���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEndPeriod() {
            return endPeriod;
        }

        /**
         * ����endPeriod���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEndPeriod(String value) {
            this.endPeriod = value;
        }

    }

}
