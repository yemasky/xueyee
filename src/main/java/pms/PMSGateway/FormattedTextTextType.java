package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>FormattedTextTextType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="FormattedTextTextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Formatted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="TextFormat">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="PlainText"/>
 *             &lt;enumeration value="HTML"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedTextTextType", propOrder = {
        "value"
})
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfRateQualifierTypeRateComment.RateComment.class,
        pms.PMSGateway.ImageDescriptionType.Description.class,
        pms.PMSGateway.TextDescriptionType.Description.class,
        PkgCautionType.class,
        pms.PMSGateway.ParagraphType.ListItem.class,
        CoverageDetailsType.class
})
public class FormattedTextTextType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Formatted")
    protected Boolean formatted;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "TextFormat")
    protected String textFormat;

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
     * ��ȡformatted���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isFormatted() {
        return formatted;
    }

    /**
     * ����formatted���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setFormatted(Boolean value) {
        this.formatted = value;
    }

    /**
     * ��ȡlanguage���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * ��ȡtextFormat���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getTextFormat() {
        return textFormat;
    }

    /**
     * ����textFormat���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTextFormat(String value) {
        this.textFormat = value;
    }

}
