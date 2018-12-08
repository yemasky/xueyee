package pms.PMSGateway;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliationInfoType", propOrder = {        "distribSystems",        "brands",        "loyalPrograms",        "awards",        "partnerInfos",       "descriptions"})
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

    public AffiliationInfoType.DistribSystems getDistribSystems() {
        return distribSystems;
    }

    public void setDistribSystems(AffiliationInfoType.DistribSystems value) {
        this.distribSystems = value;
    }

    public ArrayOfAffiliationInfoTypeBrand getBrands() {
        return brands;
    }

    public void setBrands(ArrayOfAffiliationInfoTypeBrand value) {
        this.brands = value;
    }

    public ArrayOfAffiliationInfoTypeLoyalProgram getLoyalPrograms() {
        return loyalPrograms;
    }

    public void setLoyalPrograms(ArrayOfAffiliationInfoTypeLoyalProgram value) {
        this.loyalPrograms = value;
    }

    public ArrayOfAffiliationInfoTypeAward getAwards() {
        return awards;
    }

    public void setAwards(ArrayOfAffiliationInfoTypeAward value) {
        this.awards = value;
    }

    public ArrayOfAffiliationInfoTypePartnerInfo getPartnerInfos() {
        return partnerInfos;
    }

    public void setPartnerInfos(ArrayOfAffiliationInfoTypePartnerInfo value) {
        this.partnerInfos = value;
    }

    public ArrayOfParagraphType getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayOfParagraphType value) {
        this.descriptions = value;
    }

    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {            "distribSystem"    })
    public static class DistribSystems {
        @XmlElement(name = "DistribSystem")
        protected AffiliationInfoType.DistribSystems.DistribSystem distribSystem;

        public AffiliationInfoType.DistribSystems.DistribSystem getDistribSystem() {
            return distribSystem;
        }

        public void setDistribSystem(AffiliationInfoType.DistribSystems.DistribSystem value) {
            this.distribSystem = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {                "companyName"        })
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

            public CompanyNameType getCompanyName() {
                return companyName;
            }

            public void setCompanyName(CompanyNameType value) {
                this.companyName = value;
            }

            public Boolean isRemoval() {
                return removal;
            }

            public void setRemoval(Boolean value) {
                this.removal = value;
            }

            public String getChainCode() {
                return chainCode;
            }

            public void setChainCode(String value) {
                this.chainCode = value;
            }

            public String getBrandCode() {
                return brandCode;
            }

            public void setBrandCode(String value) {
                this.brandCode = value;
            }

            public String getHotelCode() {
                return hotelCode;
            }

            public void setHotelCode(String value) {
                this.hotelCode = value;
            }

            public String getHotelCityCode() {
                return hotelCityCode;
            }

            public void setHotelCityCode(String value) {
                this.hotelCityCode = value;
            }

            public String getHotelName() {
                return hotelName;
            }

            public void setHotelName(String value) {
                this.hotelName = value;
            }

            public String getHotelCodeContext() {
                return hotelCodeContext;
            }

            public void setHotelCodeContext(String value) {
                this.hotelCodeContext = value;
            }

            public String getChainName() {
                return chainName;
            }

            public void setChainName(String value) {
                this.chainName = value;
            }

            public String getBrandName() {
                return brandName;
            }

            public void setBrandName(String value) {
                this.brandName = value;
            }
        }
    }
}