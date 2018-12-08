package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>SpecialServiceType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="SpecialServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AssociationType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Cabin"/>
 *             &lt;enumeration value="Passenger"/>
 *             &lt;enumeration value="DualOccupancy"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NbrOfYears" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialServiceType", propOrder = {
        "comment"
})
public class SpecialServiceType {

    @XmlElement(name = "Comment")
    protected ParagraphType comment;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "CodeName")
    protected String codeName;
    @XmlAttribute(name = "CodeDetail")
    protected String codeDetail;
    @XmlAttribute(name = "AssociationType")
    protected String associationType;
    @XmlAttribute(name = "Date")
    protected String date;
    @XmlAttribute(name = "NbrOfYears")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nbrOfYears;

    /**
     * ��ȡcomment���Ե�ֵ��
     *
     * @return possible object is
     * {@link ParagraphType }
     */
    public ParagraphType getComment() {
        return comment;
    }

    /**
     * ����comment���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link ParagraphType }
     */
    public void setComment(ParagraphType value) {
        this.comment = value;
    }

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
     * ��ȡcode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCode() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * ��ȡcodeName���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * ����codeName���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodeName(String value) {
        this.codeName = value;
    }

    /**
     * ��ȡcodeDetail���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodeDetail() {
        return codeDetail;
    }

    /**
     * ����codeDetail���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodeDetail(String value) {
        this.codeDetail = value;
    }

    /**
     * ��ȡassociationType���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getAssociationType() {
        return associationType;
    }

    /**
     * ����associationType���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAssociationType(String value) {
        this.associationType = value;
    }

    /**
     * ��ȡdate���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getDate() {
        return date;
    }

    /**
     * ����date���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * ��ȡnbrOfYears���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getNbrOfYears() {
        return nbrOfYears;
    }

    /**
     * ����nbrOfYears���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setNbrOfYears(BigInteger value) {
        this.nbrOfYears = value;
    }

}
