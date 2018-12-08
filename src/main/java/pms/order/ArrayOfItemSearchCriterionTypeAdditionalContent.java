package pms.order;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfItemSearchCriterionTypeAdditionalContent complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfItemSearchCriterionTypeAdditionalContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalContent" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ContentGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfItemSearchCriterionTypeAdditionalContent", propOrder = {
        "additionalContent"
})
public class ArrayOfItemSearchCriterionTypeAdditionalContent {

    @XmlElement(name = "AdditionalContent")
    protected List<ArrayOfItemSearchCriterionTypeAdditionalContent.AdditionalContent> additionalContent;

    /**
     * Gets the value of the additionalContent property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalContent property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalContent().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfItemSearchCriterionTypeAdditionalContent.AdditionalContent }
     */
    public List<ArrayOfItemSearchCriterionTypeAdditionalContent.AdditionalContent> getAdditionalContent() {
        if (additionalContent == null) {
            additionalContent = new ArrayList<ArrayOfItemSearchCriterionTypeAdditionalContent.AdditionalContent>();
        }
        return this.additionalContent;
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
     *       &lt;attribute name="ContentGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalContent {

        @XmlAttribute(name = "ContentGroupCode")
        protected String contentGroupCode;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;

        /**
         * ��ȡcontentGroupCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getContentGroupCode() {
            return contentGroupCode;
        }

        /**
         * ����contentGroupCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setContentGroupCode(String value) {
            this.contentGroupCode = value;
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

    }

}
