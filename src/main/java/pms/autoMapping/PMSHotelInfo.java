package pms.autoMapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMS_Hotel_Info", propOrder = {"hotelCode", "isNewHotel", "hotelName", "hotelGroupCode", "telephone", "address", "email", "provinceCode", "hotelCityName", "pmsHotelProductInfos"})
public class PMSHotelInfo {
    @XmlElement(name = "HotelCode")
    protected String hotelCode;
    @XmlElement(name = "IsNewHotel")
    protected String isNewHotel;
    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "HotelGroupCode")
    protected String hotelGroupCode;
    @XmlElement(name = "Telephone")
    protected String telephone;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "ProvinceCode")
    protected String provinceCode;
    @XmlElement(name = "HotelCityName")
    protected String hotelCityName;
    @XmlElement(name = "PmsHotelProductInfos")
    protected ArrayOfPMSProductInfo pmsHotelProductInfos;

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    public String getIsNewHotel() {
        return isNewHotel;
    }

    public void setIsNewHotel(String value) {
        this.isNewHotel = value;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String value) {
        this.hotelName = value;
    }

    public String getHotelGroupCode() {
        return hotelGroupCode;
    }

    public void setHotelGroupCode(String value) {
        this.hotelGroupCode = value;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String value) {
        this.telephone = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String value) {
        this.provinceCode = value;
    }

    public String getHotelCityName() {
        return hotelCityName;
    }

    public void setHotelCityName(String value) {
        this.hotelCityName = value;
    }

    public ArrayOfPMSProductInfo getPmsHotelProductInfos() {
        return pmsHotelProductInfos;
    }

    public void setPmsHotelProductInfos(ArrayOfPMSProductInfo value) {
        this.pmsHotelProductInfos = value;
    }
}