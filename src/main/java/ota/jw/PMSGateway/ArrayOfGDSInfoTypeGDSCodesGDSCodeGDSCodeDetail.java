
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GDS_CodeDetail" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdsCodeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDSCodeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail.GDSCodeDetail }
     * 
     * 
     */
    public List<ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail.GDSCodeDetail> getGDSCodeDetail() {
        if (gdsCodeDetail == null) {
            gdsCodeDetail = new ArrayList<ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail.GDSCodeDetail>();
        }
        return this.gdsCodeDetail;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GDSCodeDetail {

        @XmlAttribute(name = "PseudoCityCode")
        protected String pseudoCityCode;
        @XmlAttribute(name = "AgencyName")
        protected String agencyName;

        /**
         * 获取pseudoCityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPseudoCityCode() {
            return pseudoCityCode;
        }

        /**
         * 设置pseudoCityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPseudoCityCode(String value) {
            this.pseudoCityCode = value;
        }

        /**
         * 获取agencyName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgencyName() {
            return agencyName;
        }

        /**
         * 设置agencyName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgencyName(String value) {
            this.agencyName = value;
        }

    }

}
