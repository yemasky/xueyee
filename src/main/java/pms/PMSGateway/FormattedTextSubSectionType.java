package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>FormattedTextSubSectionType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="FormattedTextSubSectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Paragraph" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SubCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SubSectionNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedTextSubSectionType", propOrder = {
        "paragraph"
})
public class FormattedTextSubSectionType {

    @XmlElement(name = "Paragraph")
    protected List<ParagraphType> paragraph;
    @XmlAttribute(name = "SubTitle")
    protected String subTitle;
    @XmlAttribute(name = "SubCode")
    protected String subCode;
    @XmlAttribute(name = "SubSectionNumber")
    protected BigInteger subSectionNumber;

    /**
     * Gets the value of the paragraph property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraph property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraph().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     */
    public List<ParagraphType> getParagraph() {
        if (paragraph == null) {
            paragraph = new ArrayList<ParagraphType>();
        }
        return this.paragraph;
    }

    /**
     * ��ȡsubTitle���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * ����subTitle���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubTitle(String value) {
        this.subTitle = value;
    }

    /**
     * ��ȡsubCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * ����subCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * ��ȡsubSectionNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSubSectionNumber() {
        return subSectionNumber;
    }

    /**
     * ����subSectionNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSubSectionNumber(BigInteger value) {
        this.subSectionNumber = value;
    }

}
