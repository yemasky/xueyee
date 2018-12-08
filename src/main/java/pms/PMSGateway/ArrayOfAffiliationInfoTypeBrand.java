package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfAffiliationInfoTypeBrand complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfAffiliationInfoTypeBrand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Brand" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Marketing" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfAffiliationInfoTypeBrand", propOrder = {
        "brand"
})
public class ArrayOfAffiliationInfoTypeBrand {

    @XmlElement(name = "Brand")
    protected List<ArrayOfAffiliationInfoTypeBrand.Brand> brand;

    /**
     * Gets the value of the brand property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brand property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrand().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAffiliationInfoTypeBrand.Brand }
     */
    public List<ArrayOfAffiliationInfoTypeBrand.Brand> getBrand() {
        if (brand == null) {
            brand = new ArrayList<ArrayOfAffiliationInfoTypeBrand.Brand>();
        }
        return this.brand;
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
     *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Marketing" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Brand {

        @XmlAttribute(name = "URL")
        protected String url;
        @XmlAttribute(name = "CategoryCode")
        protected String categoryCode;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "Marketing")
        protected String marketing;

        /**
         * ��ȡurl���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getURL() {
            return url;
        }

        /**
         * ����url���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setURL(String value) {
            this.url = value;
        }

        /**
         * ��ȡcategoryCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCategoryCode() {
            return categoryCode;
        }

        /**
         * ����categoryCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCategoryCode(String value) {
            this.categoryCode = value;
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
         * ��ȡmarketing���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getMarketing() {
            return marketing;
        }

        /**
         * ����marketing���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMarketing(String value) {
            this.marketing = value;
        }

    }

}
