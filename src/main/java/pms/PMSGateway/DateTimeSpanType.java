package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>DateTimeSpanType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="DateTimeSpanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="DateWindowRange" type="{http://www.opentravel.org/OTA/2003/05}TimeInstantType" minOccurs="0"/>
 *           &lt;element name="EndDateWindow" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="StartDateWindow" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeSpanType", propOrder = {
        "dateWindowRangeOrEndDateWindowOrStartDateWindow"
})
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfHotelInfoTypeBlackoutDate.BlackoutDate.class,
        pms.PMSGateway.ResCommonDetailType.TimeSpan.class
})
public class DateTimeSpanType {

    @XmlElements({
            @XmlElement(name = "DateWindowRange", type = TimeInstantType.class),
            @XmlElement(name = "EndDateWindow", type = DateTimeSpanType.EndDateWindow.class),
            @XmlElement(name = "StartDateWindow", type = DateTimeSpanType.StartDateWindow.class)
    })
    protected List<Object> dateWindowRangeOrEndDateWindowOrStartDateWindow;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;

    /**
     * Gets the value of the dateWindowRangeOrEndDateWindowOrStartDateWindow property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateWindowRangeOrEndDateWindowOrStartDateWindow property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateWindowRangeOrEndDateWindowOrStartDateWindow().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeInstantType }
     * {@link DateTimeSpanType.EndDateWindow }
     * {@link DateTimeSpanType.StartDateWindow }
     */
    public List<Object> getDateWindowRangeOrEndDateWindowOrStartDateWindow() {
        if (dateWindowRangeOrEndDateWindowOrStartDateWindow == null) {
            dateWindowRangeOrEndDateWindowOrStartDateWindow = new ArrayList<Object>();
        }
        return this.dateWindowRangeOrEndDateWindowOrStartDateWindow;
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
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EndDateWindow {

        @XmlAttribute(name = "EarliestDate")
        protected String earliestDate;
        @XmlAttribute(name = "LatestDate")
        protected String latestDate;
        @XmlAttribute(name = "DOW")
        protected DayOfWeekType dow;

        /**
         * ��ȡearliestDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEarliestDate() {
            return earliestDate;
        }

        /**
         * ����earliestDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEarliestDate(String value) {
            this.earliestDate = value;
        }

        /**
         * ��ȡlatestDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLatestDate() {
            return latestDate;
        }

        /**
         * ����latestDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLatestDate(String value) {
            this.latestDate = value;
        }

        /**
         * ��ȡdow���Ե�ֵ��
         *
         * @return possible object is
         * {@link DayOfWeekType }
         */
        public DayOfWeekType getDOW() {
            return dow;
        }

        /**
         * ����dow���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DayOfWeekType }
         */
        public void setDOW(DayOfWeekType value) {
            this.dow = value;
        }

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
     *       &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StartDateWindow {

        @XmlAttribute(name = "EarliestDate")
        protected String earliestDate;
        @XmlAttribute(name = "LatestDate")
        protected String latestDate;
        @XmlAttribute(name = "DOW")
        protected DayOfWeekType dow;

        /**
         * ��ȡearliestDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEarliestDate() {
            return earliestDate;
        }

        /**
         * ����earliestDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEarliestDate(String value) {
            this.earliestDate = value;
        }

        /**
         * ��ȡlatestDate���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLatestDate() {
            return latestDate;
        }

        /**
         * ����latestDate���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLatestDate(String value) {
            this.latestDate = value;
        }

        /**
         * ��ȡdow���Ե�ֵ��
         *
         * @return possible object is
         * {@link DayOfWeekType }
         */
        public DayOfWeekType getDOW() {
            return dow;
        }

        /**
         * ����dow���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link DayOfWeekType }
         */
        public void setDOW(DayOfWeekType value) {
            this.dow = value;
        }

    }

}
