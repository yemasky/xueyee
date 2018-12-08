package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data", propOrder = {"hotelCode", "masterHotelId", "subHotelId", "hotelStatus", "reMark", "productSearchResults"})
public class Data {
    protected String hotelCode;
    protected String masterHotelId;
    protected String subHotelId;
    protected int hotelStatus;
    protected String reMark;
    protected ArrayOfProductSearchResult productSearchResults;

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    public String getMasterHotelId() {
        return masterHotelId;
    }

    public void setMasterHotelId(String value) {
        this.masterHotelId = value;
    }

    public String getSubHotelId() {
        return subHotelId;
    }

    public void setSubHotelId(String value) {
        this.subHotelId = value;
    }

    public int getHotelStatus() {
        return hotelStatus;
    }

    public void setHotelStatus(int value) {
        this.hotelStatus = value;
    }

    public String getReMark() {
        return reMark;
    }

    public void setReMark(String value) {
        this.reMark = value;
    }

    public ArrayOfProductSearchResult getProductSearchResults() {
        return productSearchResults;
    }

    public void setProductSearchResults(ArrayOfProductSearchResult value) {
        this.productSearchResults = value;
    }
}