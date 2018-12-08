package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfSpecialRequestTypeSpecialRequest complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfSpecialRequestTypeSpecialRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialRequest" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                 &lt;attribute name="RequestCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/extension>
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
@XmlType(name = "ArrayOfSpecialRequestTypeSpecialRequest", propOrder = {
        "specialRequest"
})
public class ArrayOfSpecialRequestTypeSpecialRequest {

    @XmlElement(name = "SpecialRequest")
    protected List<ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest> specialRequest;

    /**
     * Gets the value of the specialRequest property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialRequest property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialRequest().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest }
     */
    public List<ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest> getSpecialRequest() {
        if (specialRequest == null) {
            specialRequest = new ArrayList<ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest>();
        }
        return this.specialRequest;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
     *       &lt;attribute name="RequestCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpecialRequest
            extends ParagraphType {

        @XmlAttribute(name = "RequestCode")
        protected String requestCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "NumberOfUnits")
        protected BigInteger numberOfUnits;

        /**
         * ��ȡrequestCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getRequestCode() {
            return requestCode;
        }

        /**
         * ����requestCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRequestCode(String value) {
            this.requestCode = value;
        }

        /**
         * ��ȡcodeContext���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * ����codeContext���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * ��ȡnumberOfUnits���Ե�ֵ��
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getNumberOfUnits() {
            return numberOfUnits;
        }

        /**
         * ����numberOfUnits���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setNumberOfUnits(BigInteger value) {
            this.numberOfUnits = value;
        }

    }

}
