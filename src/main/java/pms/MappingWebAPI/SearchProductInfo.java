package pms.MappingWebAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchProductInfo", propOrder = {"roomTypeCode", "ratePlanCode"})
@XmlSeeAlso({ProductSearchResult.class})
public class SearchProductInfo {
    protected String roomTypeCode;
    protected String ratePlanCode;

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }
}