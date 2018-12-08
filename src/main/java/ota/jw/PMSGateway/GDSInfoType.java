
package ota.jw.PMSGateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GDS_InfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GDS_InfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GDS_Codes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GDS_Code" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="GDS_CodeDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="GDS_PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="GDS_Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="GDS_PropertyLongName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="GDS_PropertyShortName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="GDS_RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MasterChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
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
     * 获取gdsCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GDSInfoType.GDSCodes }
     *     
     */
    public GDSInfoType.GDSCodes getGDSCodes() {
        return gdsCodes;
    }

    /**
     * 设置gdsCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GDSInfoType.GDSCodes }
     *     
     */
    public void setGDSCodes(GDSInfoType.GDSCodes value) {
        this.gdsCodes = value;
    }

    /**
     * 获取masterChainCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterChainCode() {
        return masterChainCode;
    }

    /**
     * 设置masterChainCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterChainCode(String value) {
        this.masterChainCode = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="GDS_Code" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="GDS_CodeDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="GDS_PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="GDS_Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="GDS_PropertyLongName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="GDS_PropertyShortName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="GDS_RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
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
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gdsCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGDSCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GDSInfoType.GDSCodes.GDSCode }
         * 
         * 
         */
        public List<GDSInfoType.GDSCodes.GDSCode> getGDSCode() {
            if (gdsCode == null) {
                gdsCode = new ArrayList<GDSInfoType.GDSCodes.GDSCode>();
            }
            return this.gdsCode;
        }

        /**
         * 获取loadGDSIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLoadGDSIndicator() {
            return loadGDSIndicator;
        }

        /**
         * 设置loadGDSIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLoadGDSIndicator(Boolean value) {
            this.loadGDSIndicator = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="GDS_CodeDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGDS_InfoTypeGDS_CodesGDS_CodeGDS_CodeDetail" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="GDS_PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="GDS_Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="GDS_PropertyLongName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="GDS_PropertyShortName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="GDS_RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
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
             * 获取gdsCodeDetails属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail }
             *     
             */
            public ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail getGDSCodeDetails() {
                return gdsCodeDetails;
            }

            /**
             * 设置gdsCodeDetails属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail }
             *     
             */
            public void setGDSCodeDetails(ArrayOfGDSInfoTypeGDSCodesGDSCodeGDSCodeDetail value) {
                this.gdsCodeDetails = value;
            }

            /**
             * 获取chainCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChainCode() {
                return chainCode;
            }

            /**
             * 设置chainCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChainCode(String value) {
                this.chainCode = value;
            }

            /**
             * 获取gdsPropertyCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGDSPropertyCode() {
                return gdsPropertyCode;
            }

            /**
             * 设置gdsPropertyCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGDSPropertyCode(String value) {
                this.gdsPropertyCode = value;
            }

            /**
             * 获取gdsName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGDSName() {
                return gdsName;
            }

            /**
             * 设置gdsName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGDSName(String value) {
                this.gdsName = value;
            }

            /**
             * 获取loadGDSIndicator属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLoadGDSIndicator() {
                return loadGDSIndicator;
            }

            /**
             * 设置loadGDSIndicator属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLoadGDSIndicator(Boolean value) {
                this.loadGDSIndicator = value;
            }

            /**
             * 获取gdsPropertyLongName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGDSPropertyLongName() {
                return gdsPropertyLongName;
            }

            /**
             * 设置gdsPropertyLongName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGDSPropertyLongName(String value) {
                this.gdsPropertyLongName = value;
            }

            /**
             * 获取gdsPropertyShortName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGDSPropertyShortName() {
                return gdsPropertyShortName;
            }

            /**
             * 设置gdsPropertyShortName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGDSPropertyShortName(String value) {
                this.gdsPropertyShortName = value;
            }

            /**
             * 获取gdsRoomTypeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGDSRoomTypeCode() {
                return gdsRoomTypeCode;
            }

            /**
             * 设置gdsRoomTypeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGDSRoomTypeCode(String value) {
                this.gdsRoomTypeCode = value;
            }

        }

    }

}
