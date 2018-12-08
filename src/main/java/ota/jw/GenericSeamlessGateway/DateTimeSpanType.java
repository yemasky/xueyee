
package ota.jw.GenericSeamlessGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DateTimeSpanType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DateTimeSpanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="DateWindowRange" type="{http://www.opentravel.org/OTA/2003/05}TimeInstantType" minOccurs="0"/&gt;
 *           &lt;element name="StartDateWindow" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="EndDateWindow" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeSpanType", propOrder = {
    "dateWindowRangeOrStartDateWindowOrEndDateWindow"
})
@XmlSeeAlso({
    ota.jw.GenericSeamlessGateway.ResCommonDetailType.TimeSpan.class
})
public class DateTimeSpanType {

    @XmlElements({
        @XmlElement(name = "DateWindowRange", type = TimeInstantType.class),
        @XmlElement(name = "StartDateWindow", type = DateTimeSpanType.StartDateWindow.class),
        @XmlElement(name = "EndDateWindow", type = DateTimeSpanType.EndDateWindow.class)
    })
    protected List<Object> dateWindowRangeOrStartDateWindowOrEndDateWindow;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;

    /**
     * Gets the value of the dateWindowRangeOrStartDateWindowOrEndDateWindow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateWindowRangeOrStartDateWindowOrEndDateWindow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateWindowRangeOrStartDateWindowOrEndDateWindow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeInstantType }
     * {@link DateTimeSpanType.StartDateWindow }
     * {@link DateTimeSpanType.EndDateWindow }
     * 
     * 
     */
    public List<Object> getDateWindowRangeOrStartDateWindowOrEndDateWindow() {
        if (dateWindowRangeOrStartDateWindowOrEndDateWindow == null) {
            dateWindowRangeOrStartDateWindowOrEndDateWindow = new ArrayList<Object>();
        }
        return this.dateWindowRangeOrStartDateWindowOrEndDateWindow;
    }

    /**
     * 获取start属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置start属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * 获取end属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * 设置end属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取earliestDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarliestDate() {
            return earliestDate;
        }

        /**
         * 设置earliestDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarliestDate(String value) {
            this.earliestDate = value;
        }

        /**
         * 获取latestDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestDate() {
            return latestDate;
        }

        /**
         * 设置latestDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestDate(String value) {
            this.latestDate = value;
        }

        /**
         * 获取dow属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDOW() {
            return dow;
        }

        /**
         * 设置dow属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDOW(DayOfWeekType value) {
            this.dow = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 获取earliestDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarliestDate() {
            return earliestDate;
        }

        /**
         * 设置earliestDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarliestDate(String value) {
            this.earliestDate = value;
        }

        /**
         * 获取latestDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestDate() {
            return latestDate;
        }

        /**
         * 设置latestDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestDate(String value) {
            this.latestDate = value;
        }

        /**
         * 获取dow属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDOW() {
            return dow;
        }

        /**
         * 设置dow属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDOW(DayOfWeekType value) {
            this.dow = value;
        }

    }

}
