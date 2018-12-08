package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfo", propOrder = {"subHotelId", "masterHotelId", "hotelName", "address", "provinceName", "cityName", "hotelBelongto"})
public class HotelInfo {
    protected String subHotelId;
    protected String masterHotelId;
    protected String hotelName;
    protected String address;
    protected String provinceName;
    protected String cityName;
    protected String hotelBelongto;

    public String getSubHotelId() {
        return subHotelId;
    }

    public void setSubHotelId(String value) {
        this.subHotelId = value;
    }

    public String getMasterHotelId() {
        return masterHotelId;
    }

    public void setMasterHotelId(String value) {
        this.masterHotelId = value;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String value) {
        this.hotelName = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String value) {
        this.provinceName = value;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String value) {
        this.cityName = value;
    }

    public String getHotelBelongto() {
        return hotelBelongto;
    }

    public void setHotelBelongto(String value) {
        this.hotelBelongto = value;
    }
}
