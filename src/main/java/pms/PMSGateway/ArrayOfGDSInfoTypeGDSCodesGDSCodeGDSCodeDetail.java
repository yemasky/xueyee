package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GDS_CodeDetail" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail", propOrder = {
        "gdsCodeDetail"
})
public class ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail {

    @XmlElement(name = "GDS_CodeDetail")
    protected List<ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail.GDSCodeDetail> gdsCodeDetail;

    /**
     * Gets the value of the gdsCodeDetail property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdsCodeDetail property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDSCodeDetail().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail.GDSCodeDetail }
     */
    public List<ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail.GDSCodeDetail> getGDSCodeDetail() {
        if (gdsCodeDetail == null) {
            gdsCodeDetail = new ArrayList<ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail.GDSCodeDetail>();
        }
        return this.gdsCodeDetail;
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
     *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GDSCodeDetail {

        @XmlAttribute(name = "PseudoCityCode")
        protected String pseudoCityCode;
        @XmlAttribute(name = "AgencyName")
        protected String agencyName;

        /**
         * ��ȡpseudoCityCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getPseudoCityCode() {
            return pseudoCityCode;
        }

        /**
         * ����pseudoCityCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPseudoCityCode(String value) {
            this.pseudoCityCode = value;
        }

        /**
         * ��ȡagencyName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getAgencyName() {
            return agencyName;
        }

        /**
         * ����agencyName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAgencyName(String value) {
            this.agencyName = value;
        }

    }

}
