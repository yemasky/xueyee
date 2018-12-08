package pms.order;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;


/**
 * <p>TimeInstantType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="TimeInstantType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="WindowBefore" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="WindowAfter" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="CrossDateAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInstantType", propOrder = {
        "value"
})
public class TimeInstantType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "WindowBefore")
    protected Duration windowBefore;
    @XmlAttribute(name = "WindowAfter")
    protected Duration windowAfter;
    @XmlAttribute(name = "CrossDateAllowedIndicator")
    protected Boolean crossDateAllowedIndicator;

    /**
     * ��ȡvalue���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * ��ȡwindowBefore���Ե�ֵ��
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getWindowBefore() {
        return windowBefore;
    }

    /**
     * ����windowBefore���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setWindowBefore(Duration value) {
        this.windowBefore = value;
    }

    /**
     * ��ȡwindowAfter���Ե�ֵ��
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getWindowAfter() {
        return windowAfter;
    }

    /**
     * ����windowAfter���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setWindowAfter(Duration value) {
        this.windowAfter = value;
    }

    /**
     * ��ȡcrossDateAllowedIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isCrossDateAllowedIndicator() {
        return crossDateAllowedIndicator;
    }

    /**
     * ����crossDateAllowedIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCrossDateAllowedIndicator(Boolean value) {
        this.crossDateAllowedIndicator = value;
    }

}
