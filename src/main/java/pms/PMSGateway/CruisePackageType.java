package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CruisePackageType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="CruisePackageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}LocationGeneralType">
 *                 &lt;sequence>
 *                   &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PackageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CruisePackageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruisePackageType", propOrder = {
        "location"
})
@XmlSeeAlso({
        pms.PMSGateway.ArrayOfCruiseGuestDetailTypeSelectedPackage.SelectedPackage.class
})
public class CruisePackageType {

    @XmlElement(name = "Location")
    protected List<CruisePackageType.Location> location;
    @XmlAttribute(name = "PackageTypeCode")
    protected String packageTypeCode;
    @XmlAttribute(name = "CruisePackageCode")
    protected String cruisePackageCode;
    @XmlAttribute(name = "InclusiveIndicator")
    protected Boolean inclusiveIndicator;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * Gets the value of the location property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CruisePackageType.Location }
     */
    public List<CruisePackageType.Location> getLocation() {
        if (location == null) {
            location = new ArrayList<CruisePackageType.Location>();
        }
        return this.location;
    }

    /**
     * ��ȡpackageTypeCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getPackageTypeCode() {
        return packageTypeCode;
    }

    /**
     * ����packageTypeCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPackageTypeCode(String value) {
        this.packageTypeCode = value;
    }

    /**
     * ��ȡcruisePackageCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getCruisePackageCode() {
        return cruisePackageCode;
    }

    /**
     * ����cruisePackageCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCruisePackageCode(String value) {
        this.cruisePackageCode = value;
    }

    /**
     * ��ȡinclusiveIndicator���Ե�ֵ��
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isInclusiveIndicator() {
        return inclusiveIndicator;
    }

    /**
     * ����inclusiveIndicator���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setInclusiveIndicator(Boolean value) {
        this.inclusiveIndicator = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * <p/>
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}LocationGeneralType">
     *       &lt;sequence>
     *         &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "information"
    })
    public static class Location
            extends LocationGeneralType {

        @XmlElement(name = "Information")
        protected ParagraphType information;
        @XmlAttribute(name = "LocationCode")
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "LocationName")
        protected String locationName;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;

        /**
         * ��ȡinformation���Ե�ֵ��
         *
         * @return possible object is
         * {@link ParagraphType }
         */
        public ParagraphType getInformation() {
            return information;
        }

        /**
         * ����information���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link ParagraphType }
         */
        public void setInformation(ParagraphType value) {
            this.information = value;
        }

        /**
         * ��ȡlocationCode���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * ����locationCode���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
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
         * ��ȡlocationName���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getLocationName() {
            return locationName;
        }

        /**
         * ����locationName���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLocationName(String value) {
            this.locationName = value;
        }

        /**
         * ��ȡstart���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getStart() {
            return start;
        }

        /**
         * ����start���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * ��ȡduration���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getDuration() {
            return duration;
        }

        /**
         * ����duration���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * ��ȡend���Ե�ֵ��
         *
         * @return possible object is
         * {@link String }
         */
        public String getEnd() {
            return end;
        }

        /**
         * ����end���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setEnd(String value) {
            this.end = value;
        }

    }

}
