package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingStatusSearchRQ", propOrder = {"hotelCode", "subHotelId", "searchProductInfos"})
public class MappingStatusSearchRQ {
    protected String hotelCode;
    protected String subHotelId;
    protected ArrayOfSearchProductInfo searchProductInfos;

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    public String getSubHotelId() {
        return subHotelId;
    }

    public void setSubHotelId(String value) {
        this.subHotelId = value;
    }

    public ArrayOfSearchProductInfo getSearchProductInfos() {
        return searchProductInfos;
    }

    public void setSearchProductInfos(ArrayOfSearchProductInfo value) {
        this.searchProductInfos = value;
    }
}