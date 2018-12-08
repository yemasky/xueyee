package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinAttribute" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CabinAttributeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute", propOrder = {
        "cabinAttribute"
})
public class ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute {

    @XmlElement(name = "CabinAttribute")
    protected List<ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute.CabinAttribute> cabinAttribute;

    /**
     * Gets the value of the cabinAttribute property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinAttribute property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinAttribute().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute.CabinAttribute }
     */
    public List<ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute.CabinAttribute> getCabinAttribute() {
        if (cabinAttribute == null) {
            cabinAttribute = new ArrayList<ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute.CabinAttribute>();
        }
        return this.cabinAttribute;
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
     *       &lt;attribute name="CabinAttributeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinAttribute {

        @XmlAttribute(name = "CabinAttributeCode")
        protected String cabinAttributeCode;

        /**
         * ��ȡcabinAttributeCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCabinAttributeCode() {
            return cabinAttributeCode;
        }

        /**
         * ����cabinAttributeCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCabinAttributeCode(String value) {
            this.cabinAttributeCode = value;
        }

    }

}
