package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute">
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
@XmlType(name = "ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute", propOrder = {
        "cabinAttribute"
})
public class ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute {

    @XmlElement(name = "CabinAttribute")
    protected List<ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute.CabinAttribute> cabinAttribute;

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
     * {@link ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute.CabinAttribute }
     */
    public List<ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute.CabinAttribute> getCabinAttribute() {
        if (cabinAttribute == null) {
            cabinAttribute = new ArrayList<ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute.CabinAttribute>();
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
