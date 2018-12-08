package pms.PMSGateway;

import javax.xml.bind.annotation.*;


/**
 * <p>OffLocationServiceCoreType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="OffLocationServiceCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
 *                 &lt;attribute name="SiteID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServiceID_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffLocationServiceCoreType", propOrder = {
        "address"
})
@XmlSeeAlso({
        OffLocationServiceType.class
})
public class OffLocationServiceCoreType {

    @XmlElement(name = "Address")
    protected OffLocationServiceCoreType.Address address;
    @XmlAttribute(name = "Type", required = true)
    protected OffLocationServiceIDType type;

    /**
     * ��ȡaddress���Ե�ֵ��
     *
     * @return possible object is
     * {@link OffLocationServiceCoreType.Address }
     */
    public OffLocationServiceCoreType.Address getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OffLocationServiceCoreType.Address }
     */
    public void setAddress(OffLocationServiceCoreType.Address value) {
        this.address = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     *
     * @return possible object is
     * {@link OffLocationServiceIDType }
     */
    public OffLocationServiceIDType getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link OffLocationServiceIDType }
     */
    public void setType(OffLocationServiceIDType value) {
        this.type = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
     *       &lt;attribute name="SiteID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
            extends AddressType {

        @XmlAttribute(name = "SiteID")
        protected String siteID;
        @XmlAttribute(name = "SiteName")
        protected String siteName;

        /**
         * ��ȡsiteID���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSiteID() {
            return siteID;
        }

        /**
         * ����siteID���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSiteID(String value) {
            this.siteID = value;
        }

        /**
         * ��ȡsiteName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getSiteName() {
            return siteName;
        }

        /**
         * ����siteName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSiteName(String value) {
            this.siteName = value;
        }

    }

}
