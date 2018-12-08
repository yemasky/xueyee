package pms.PMSGateway;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ParagraphType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ParagraphType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="ListItem" minOccurs="0">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
 *                   &lt;attribute name="ListItem" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *           &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphType", propOrder = {
        "listItemOrURLOrImage"
})
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfProfileTypeComment.Comment.class,
        pms.PMSGateway.ArrayOfCommentTypeComment.Comment.class,
        pms.PMSGateway.ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest.class,
        DescriptionType.class,
        pms.PMSGateway.ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramDescription.class,
        pms.PMSGateway.ArrayOfAffiliationInfoTypeLoyalProgram.LoyalProgram.ProgramRestriction.class
})
public class ParagraphType {

    @XmlElementRefs({
            @XmlElementRef(name = "ListItem", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class),
            @XmlElementRef(name = "Text", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class),
            @XmlElementRef(name = "Image", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class),
            @XmlElementRef(name = "URL", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> listItemOrURLOrImage;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "ParagraphNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger paragraphNumber;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "PurgeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purgeDate;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;

    /**
     * Gets the value of the listItemOrURLOrImage property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listItemOrURLOrImage property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListItemOrURLOrImage().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ParagraphType.ListItem }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link FormattedTextTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public List<JAXBElement<?>> getListItemOrURLOrImage() {
        if (listItemOrURLOrImage == null) {
            listItemOrURLOrImage = new ArrayList<JAXBElement<?>>();
        }
        return this.listItemOrURLOrImage;
    }

    /**
     * ��ȡname���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡparagraphNumber���Ե�ֵ��
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getParagraphNumber() {
        return paragraphNumber;
    }

    /**
     * ����paragraphNumber���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setParagraphNumber(BigInteger value) {
        this.paragraphNumber = value;
    }

    /**
     * ��ȡcreateDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * ����createDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * ��ȡcreatorID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * ����creatorID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * ��ȡlastModifyDateTime���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * ����lastModifyDateTime���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * ��ȡlastModifierID���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * ����lastModifierID���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * ��ȡpurgeDate���Ե�ֵ��
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * ����purgeDate���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
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
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
     *       &lt;attribute name="ListItem" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ListItem
            extends FormattedTextTextType {

        @XmlAttribute(name = "ListItem")
        protected BigInteger listItem;

        /**
         * ��ȡlistItem���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getListItem() {
            return listItem;
        }

        /**
         * ����listItem���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setListItem(BigInteger value) {
            this.listItem = value;
        }

    }

}
