
package ota.jw.PMSGateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AffiliationInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AffiliationInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistribSystems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DistribSystem" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Brands" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAffiliationInfoTypeBrand" minOccurs="0"/&gt;
 *         &lt;element name="LoyalPrograms" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAffiliationInfoTypeLoyalProgram" minOccurs="0"/&gt;
 *         &lt;element name="Awards" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAffiliationInfoTypeAward" minOccurs="0"/&gt;
 *         &lt;element name="PartnerInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfAffiliationInfoTypePartnerInfo" minOccurs="0"/&gt;
 *         &lt;element name="Descriptions" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfParagraphType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliationInfoType", propOrder = {
    "distribSystems",
    "brands",
    "loyalPrograms",
    "awards",
    "partnerInfos",
    "descriptions"
})
public class AffiliationInfoType {

    @XmlElement(name = "DistribSystems")
    protected AffiliationInfoType.DistribSystems distribSystems;
    @XmlElement(name = "Brands")
    protected ArrayOfAffiliationInfoTypeBrand brands;
    @XmlElement(name = "LoyalPrograms")
    protected ArrayOfAffiliationInfoTypeLoyalProgram loyalPrograms;
    @XmlElement(name = "Awards")
    protected ArrayOfAffiliationInfoTypeAward awards;
    @XmlElement(name = "PartnerInfos")
    protected ArrayOfAffiliationInfoTypePartnerInfo partnerInfos;
    @XmlElement(name = "Descriptions")
    protected ArrayOfParagraphType descriptions;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * 获取distribSystems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AffiliationInfoType.DistribSystems }
     *     
     */
    public AffiliationInfoType.DistribSystems getDistribSystems() {
        return distribSystems;
    }

    /**
     * 设置distribSystems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationInfoType.DistribSystems }
     *     
     */
    public void setDistribSystems(AffiliationInfoType.DistribSystems value) {
        this.distribSystems = value;
    }

    /**
     * 获取brands属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAffiliationInfoTypeBrand }
     *     
     */
    public ArrayOfAffiliationInfoTypeBrand getBrands() {
        return brands;
    }

    /**
     * 设置brands属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAffiliationInfoTypeBrand }
     *     
     */
    public void setBrands(ArrayOfAffiliationInfoTypeBrand value) {
        this.brands = value;
    }

    /**
     * 获取loyalPrograms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAffiliationInfoTypeLoyalProgram }
     *     
     */
    public ArrayOfAffiliationInfoTypeLoyalProgram getLoyalPrograms() {
        return loyalPrograms;
    }

    /**
     * 设置loyalPrograms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAffiliationInfoTypeLoyalProgram }
     *     
     */
    public void setLoyalPrograms(ArrayOfAffiliationInfoTypeLoyalProgram value) {
        this.loyalPrograms = value;
    }

    /**
     * 获取awards属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAffiliationInfoTypeAward }
     *     
     */
    public ArrayOfAffiliationInfoTypeAward getAwards() {
        return awards;
    }

    /**
     * 设置awards属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAffiliationInfoTypeAward }
     *     
     */
    public void setAwards(ArrayOfAffiliationInfoTypeAward value) {
        this.awards = value;
    }

    /**
     * 获取partnerInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAffiliationInfoTypePartnerInfo }
     *     
     */
    public ArrayOfAffiliationInfoTypePartnerInfo getPartnerInfos() {
        return partnerInfos;
    }

    /**
     * 设置partnerInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAffiliationInfoTypePartnerInfo }
     *     
     */
    public void setPartnerInfos(ArrayOfAffiliationInfoTypePartnerInfo value) {
        this.partnerInfos = value;
    }

    /**
     * 获取descriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParagraphType }
     *     
     */
    public ArrayOfParagraphType getDescriptions() {
        return descriptions;
    }

    /**
     * 设置descriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParagraphType }
     *     
     */
    public void setDescriptions(ArrayOfParagraphType value) {
        this.descriptions = value;
    }

    /**
     * 获取lastUpdated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置lastUpdated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
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
     *         &lt;element name="DistribSystem" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    @XmlType(name = "", propOrder = {
        "distribSystem"
    })
    public static class DistribSystems {

        @XmlElement(name = "DistribSystem")
        protected AffiliationInfoType.DistribSystems.DistribSystem distribSystem;

        /**
         * 获取distribSystem属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AffiliationInfoType.DistribSystems.DistribSystem }
         *     
         */
        public AffiliationInfoType.DistribSystems.DistribSystem getDistribSystem() {
            return distribSystem;
        }

        /**
         * 设置distribSystem属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AffiliationInfoType.DistribSystems.DistribSystem }
         *     
         */
        public void setDistribSystem(AffiliationInfoType.DistribSystems.DistribSystem value) {
            this.distribSystem = value;
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
         *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "companyName"
        })
        public static class DistribSystem {

            @XmlElement(name = "CompanyName")
            protected CompanyNameType companyName;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;
            @XmlAttribute(name = "ChainCode")
            protected String chainCode;
            @XmlAttribute(name = "BrandCode")
            protected String brandCode;
            @XmlAttribute(name = "HotelCode")
            protected String hotelCode;
            @XmlAttribute(name = "HotelCityCode")
            protected String hotelCityCode;
            @XmlAttribute(name = "HotelName")
            protected String hotelName;
            @XmlAttribute(name = "HotelCodeContext")
            protected String hotelCodeContext;
            @XmlAttribute(name = "ChainName")
            protected String chainName;
            @XmlAttribute(name = "BrandName")
            protected String brandName;

            /**
             * 获取companyName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CompanyNameType }
             *     
             */
            public CompanyNameType getCompanyName() {
                return companyName;
            }

            /**
             * 设置companyName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyNameType }
             *     
             */
            public void setCompanyName(CompanyNameType value) {
                this.companyName = value;
            }

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRemoval() {
                return removal;
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
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
             * 获取brandCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrandCode() {
                return brandCode;
            }

            /**
             * 设置brandCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrandCode(String value) {
                this.brandCode = value;
            }

            /**
             * 获取hotelCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCode() {
                return hotelCode;
            }

            /**
             * 设置hotelCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCode(String value) {
                this.hotelCode = value;
            }

            /**
             * 获取hotelCityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCityCode() {
                return hotelCityCode;
            }

            /**
             * 设置hotelCityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCityCode(String value) {
                this.hotelCityCode = value;
            }

            /**
             * 获取hotelName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelName() {
                return hotelName;
            }

            /**
             * 设置hotelName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelName(String value) {
                this.hotelName = value;
            }

            /**
             * 获取hotelCodeContext属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHotelCodeContext() {
                return hotelCodeContext;
            }

            /**
             * 设置hotelCodeContext属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHotelCodeContext(String value) {
                this.hotelCodeContext = value;
            }

            /**
             * 获取chainName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChainName() {
                return chainName;
            }

            /**
             * 设置chainName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChainName(String value) {
                this.chainName = value;
            }

            /**
             * 获取brandName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrandName() {
                return brandName;
            }

            /**
             * 设置brandName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrandName(String value) {
                this.brandName = value;
            }

        }

    }

}
