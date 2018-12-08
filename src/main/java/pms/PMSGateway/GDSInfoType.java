package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>GDS_InfoType complex type�� Java �ࡣ
 * <p/>
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p/>
 * <pre>
 * &lt;complexType name="GDS_InfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GDS_Codes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GDS_Code" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GDS_CodeDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="GDS_PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="GDS_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="GDS_PropertyLongName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="GDS_PropertyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="GDS_RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MasterChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDS_InfoType", propOrder = {
        "gdsCodes"
})
public class GDSInfoType {

    @XmlElement(name = "GDS_Codes")
    protected GDSInfoType.GDSCodes gdsCodes;
    @XmlAttribute(name = "MasterChainCode")
    protected String masterChainCode;

    /**
     * ��ȡgdsCodes���Ե�ֵ��
     *
     * @return possible object is
     * {@link GDSInfoType.GDSCodes }
     */
    public GDSInfoType.GDSCodes getGDSCodes() {
        return gdsCodes;
    }

    /**
     * ����gdsCodes���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link GDSInfoType.GDSCodes }
     */
    public void setGDSCodes(GDSInfoType.GDSCodes value) {
        this.gdsCodes = value;
    }

    /**
     * ��ȡmasterChainCode���Ե�ֵ��
     *
     * @return possible object is
     * {@link String }
     */
    public String getMasterChainCode() {
        return masterChainCode;
    }

    /**
     * ����masterChainCode���Ե�ֵ��
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMasterChainCode(String value) {
        this.masterChainCode = value;
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
     *       &lt;sequence>
     *         &lt;element name="GDS_Code" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GDS_CodeDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="GDS_PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="GDS_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="GDS_PropertyLongName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="GDS_PropertyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="GDS_RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "gdsCode"
    })
    public static class GDSCodes {

        @XmlElement(name = "GDS_Code")
        protected List<GDSInfoType.GDSCodes.GDSCode> gdsCode;
        @XmlAttribute(name = "LoadGDSIndicator")
        protected Boolean loadGDSIndicator;

        /**
         * Gets the value of the gdsCode property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gdsCode property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGDSCode().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link GDSInfoType.GDSCodes.GDSCode }
         */
        public List<GDSInfoType.GDSCodes.GDSCode> getGDSCode() {
            if (gdsCode == null) {
                gdsCode = new ArrayList<GDSInfoType.GDSCodes.GDSCode>();
            }
            return this.gdsCode;
        }

        /**
         * ��ȡloadGDSIndicator���Ե�ֵ��
         *
         * @return possible object is
         * {@link Boolean }
         */
        public Boolean isLoadGDSIndicator() {
            return loadGDSIndicator;
        }

        /**
         * ����loadGDSIndicator���Ե�ֵ��
         *
         * @param value allowed object is
         *              {@link Boolean }
         */
        public void setLoadGDSIndicator(Boolean value) {
            this.loadGDSIndicator = value;
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
         *       &lt;sequence>
         *         &lt;element name="GDS_CodeDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="GDS_PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="GDS_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="GDS_PropertyLongName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="GDS_PropertyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="GDS_RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "gdsCodeDetails"
        })
        public static class GDSCode {

            @XmlElement(name = "GDS_CodeDetails")
            protected ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail gdsCodeDetails;
            @XmlAttribute(name = "ChainCode")
            protected String chainCode;
            @XmlAttribute(name = "GDS_PropertyCode")
            protected String gdsPropertyCode;
            @XmlAttribute(name = "GDS_Name")
            protected String gdsName;
            @XmlAttribute(name = "LoadGDSIndicator")
            protected Boolean loadGDSIndicator;
            @XmlAttribute(name = "GDS_PropertyLongName")
            protected String gdsPropertyLongName;
            @XmlAttribute(name = "GDS_PropertyShortName")
            protected String gdsPropertyShortName;
            @XmlAttribute(name = "GDS_RoomTypeCode")
            protected String gdsRoomTypeCode;

            /**
             * ��ȡgdsCodeDetails���Ե�ֵ��
             *
             * @return possible object is
             * {@link ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail }
             */
            public ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail getGDSCodeDetails() {
                return gdsCodeDetails;
            }

            /**
             * ����gdsCodeDetails���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail }
             */
            public void setGDSCodeDetails(ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail value) {
                this.gdsCodeDetails = value;
            }

            /**
             * ��ȡchainCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getChainCode() {
                return chainCode;
            }

            /**
             * ����chainCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setChainCode(String value) {
                this.chainCode = value;
            }

            /**
             * ��ȡgdsPropertyCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getGDSPropertyCode() {
                return gdsPropertyCode;
            }

            /**
             * ����gdsPropertyCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setGDSPropertyCode(String value) {
                this.gdsPropertyCode = value;
            }

            /**
             * ��ȡgdsName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getGDSName() {
                return gdsName;
            }

            /**
             * ����gdsName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setGDSName(String value) {
                this.gdsName = value;
            }

            /**
             * ��ȡloadGDSIndicator���Ե�ֵ��
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isLoadGDSIndicator() {
                return loadGDSIndicator;
            }

            /**
             * ����loadGDSIndicator���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setLoadGDSIndicator(Boolean value) {
                this.loadGDSIndicator = value;
            }

            /**
             * ��ȡgdsPropertyLongName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getGDSPropertyLongName() {
                return gdsPropertyLongName;
            }

            /**
             * ����gdsPropertyLongName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setGDSPropertyLongName(String value) {
                this.gdsPropertyLongName = value;
            }

            /**
             * ��ȡgdsPropertyShortName���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getGDSPropertyShortName() {
                return gdsPropertyShortName;
            }

            /**
             * ����gdsPropertyShortName���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setGDSPropertyShortName(String value) {
                this.gdsPropertyShortName = value;
            }

            /**
             * ��ȡgdsRoomTypeCode���Ե�ֵ��
             *
             * @return possible object is
             * {@link String }
             */
            public String getGDSRoomTypeCode() {
                return gdsRoomTypeCode;
            }

            /**
             * ����gdsRoomTypeCode���Ե�ֵ��
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setGDSRoomTypeCode(String value) {
                this.gdsRoomTypeCode = value;
            }

        }

    }

}
