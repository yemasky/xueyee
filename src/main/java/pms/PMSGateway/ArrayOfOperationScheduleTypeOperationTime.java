package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfOperationScheduleTypeOperationTime complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfOperationScheduleTypeOperationTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationTime" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AdditionalOperationInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfOperationScheduleTypeOperationTime", propOrder = {
        "operationTime"
})
public class ArrayOfOperationScheduleTypeOperationTime {

    @XmlElement(name = "OperationTime")
    protected List<ArrayOfOperationScheduleTypeOperationTime.OperationTime> operationTime;

    /**
     * Gets the value of the operationTime property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationTime property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationTime().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOperationScheduleTypeOperationTime.OperationTime }
     */
    public List<ArrayOfOperationScheduleTypeOperationTime.OperationTime> getOperationTime() {
        if (operationTime == null) {
            operationTime = new ArrayList<ArrayOfOperationScheduleTypeOperationTime.OperationTime>();
        }
        return this.operationTime;
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
     *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AdditionalOperationInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OperationTime {

        @XmlAttribute(name = "Mon")
        protected Boolean mon;
        @XmlAttribute(name = "Tue")
        protected Boolean tue;
        @XmlAttribute(name = "Weds")
        protected Boolean weds;
        @XmlAttribute(name = "Thur")
        protected Boolean thur;
        @XmlAttribute(name = "Fri")
        protected Boolean fri;
        @XmlAttribute(name = "Sat")
        protected Boolean sat;
        @XmlAttribute(name = "Sun")
        protected Boolean sun;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "AdditionalOperationInfoCode")
        protected String additionalOperationInfoCode;
        @XmlAttribute(name = "Frequency")
        protected String frequency;
        @XmlAttribute(name = "Text")
        protected String text;

        /**
         * ��ȡmon���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * ����mon���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * ��ȡtue���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * ����tue���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * ��ȡweds���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isWeds() {
            return weds;
        }

        /**
         * ����weds���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setWeds(Boolean value) {
            this.weds = value;
        }

        /**
         * ��ȡthur���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isThur() {
            return thur;
        }

        /**
         * ����thur���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setThur(Boolean value) {
            this.thur = value;
        }

        /**
         * ��ȡfri���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * ����fri���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * ��ȡsat���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * ����sat���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setSat(Boolean value) {
            this.sat = value;
        }

        /**
         * ��ȡsun���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * ����sun���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setSun(Boolean value) {
            this.sun = value;
        }

        /**
         * ��ȡstart���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStart() {
            return start;
        }

        /**
         * ����start���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStart(String value) {
            this.start = value;
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
         * ��ȡend���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEnd() {
            return end;
        }

        /**
         * ����end���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * ��ȡadditionalOperationInfoCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAdditionalOperationInfoCode() {
            return additionalOperationInfoCode;
        }

        /**
         * ����additionalOperationInfoCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAdditionalOperationInfoCode(String value) {
            this.additionalOperationInfoCode = value;
        }

        /**
         * ��ȡfrequency���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getFrequency() {
            return frequency;
        }

        /**
         * ����frequency���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setFrequency(String value) {
            this.frequency = value;
        }

        /**
         * ��ȡtext���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getText() {
            return text;
        }

        /**
         * ����text���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setText(String value) {
            this.text = value;
        }

    }

}
